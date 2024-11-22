import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectDateButton = findViewById<Button>(R.id.selectDateButton)
        val dateEditText = findViewById<EditText>(R.id.dateEditText)

        selectDateButton.setOnClickListener {
            // Get the current date
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            // Show DatePickerDialog
            val datePickerDialog = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    // Update the EditText with the selected date
                    dateEditText.setText("$selectedDay/${selectedMonth + 1}/$selectedYear")
                },
                year, month, day
            )

            datePickerDialog.show()
        }
    }
}
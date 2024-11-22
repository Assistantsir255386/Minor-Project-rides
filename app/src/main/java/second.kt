import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val coverKm = findViewById<EditText>(R.id.coverKm)
        val totalCost = findViewById<EditText>(R.id.totalCost)
        val confirmationMessage = findViewById<TextView>(R.id.confirmationMessage)

        // Retrieve data from intent
        val pickup = intent.getStringExtra("pickup")
        val dropoff = intent.getStringExtra("dropoff")
        val date = intent.getStringExtra("date")

        // Display confirmation message
        confirmationMessage.text = "Details Saved Successfully!!\nPickup: $pickup\nDrop-off: $dropoff\nDate: $date"
    }
}
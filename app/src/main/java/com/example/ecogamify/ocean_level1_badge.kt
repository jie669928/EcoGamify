import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.ecogamify.R

class ocean_level1_badge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocean_level1_badge)

        val nextButton = findViewById<Button>(R.id.button)
        nextButton.setOnClickListener {
            showPopOutDialog()
        }
    }

    private fun showPopOutDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.ocean_certificate_popup, null)

        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)

        val dialog = dialogBuilder.create()
        dialog.show()

    }
}

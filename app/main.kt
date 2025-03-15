mport android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instance button
        val btn_click = findViewById(R.id.btn_click) as Button
        // set  listener
        btn_click.setOnClickListener {

            Toast.makeText(this@MainActivity, "Clicado", Toast.LENGTH_SHORT).show()
        }
    }
}

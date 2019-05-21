package myapp.com.linear_layout

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.register_activity.*

/**
 * Created by User on 5/21/2019.
 */
class RegisterActivity : AppCompatActivity() {

    private lateinit var name : TextView
    private lateinit var email : TextView
    private lateinit var password : TextView
    private lateinit var re_password : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        re_password = findViewById(R.id.re_password)

        register.setOnClickListener{
                Toast.makeText(this, "Welcome " + name.text.toString(), Toast.LENGTH_LONG).show()
                name.setText("")
                email.setText("")
                password.setText("")
                re_password.setText("")

            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }

        signin.setOnClickListener{
            val intent = Intent(applicationContext, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
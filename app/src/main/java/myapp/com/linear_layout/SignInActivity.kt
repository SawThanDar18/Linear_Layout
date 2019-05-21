package myapp.com.linear_layout

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.signin_activity.*

/**
 * Created by User on 5/21/2019.
 */
class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_activity)

        signin.setOnClickListener {
            Toast.makeText(applicationContext, "Sign In Successful!!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}
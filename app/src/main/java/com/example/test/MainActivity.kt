package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dbHandler: DatabaseHandler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHandler = DatabaseHandler(this)

        button_save.setOnClickListener(View.OnClickListener {
            // checking input text should not be null
            if (validation()){
                val user: User = User()
                var success: Boolean = false
                user.fristName = editText_firstName.text.toString()
                user.lastname = edittext_l=stName.text.toString()

                success = dbHandler!!.addUser(user)

                if (success){
                    val toast = Toast.makeText(this,"Saved Successfully", Toast.LENGTH_LONG).show()
                }
            }

        })
        button_show.setOnClickListener(View.OnClickListener {
            var user = dbHandler!!.getAllUsers()
            setContentView(R.layout.activity_main)
           )
        })
    }
}

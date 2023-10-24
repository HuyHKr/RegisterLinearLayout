package com.example.register_linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import com.example.register_linearlayout.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstName = findViewById<EditText>(R.id.firstName)
        val lastName = findViewById<EditText>(R.id.lastName)
        val email = findViewById<EditText>(R.id.email)
        val birthday = findViewById<EditText>(R.id.birthday)
        val address = findViewById<EditText>(R.id.address)
        val gender = findViewById<RadioGroup>(R.id.radioGroup)
        val checkbox = findViewById<CheckBox>(R.id.checkBox)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            if(firstName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your First name", Toast.LENGTH_SHORT).show()
            }
            else if(lastName.text.isEmpty()) Toast.makeText(this, "Please enter your Last name", Toast.LENGTH_SHORT).show()
            else if(email.text.isEmpty()) Toast.makeText(this, "Please enter your email ", Toast.LENGTH_SHORT).show()
            else if(address.text.isEmpty()) Toast.makeText(this, "Please enter your address ", Toast.LENGTH_SHORT).show()
            else if(birthday.text.isEmpty()) Toast.makeText(this, "Please enter your birthday", Toast.LENGTH_SHORT).show()
            else if(gender.checkedRadioButtonId==-1)Toast.makeText(this,"Please choice your gender",Toast.LENGTH_LONG).show()
            else if(!checkbox.isChecked)Toast.makeText(this,"please agree to our terms",Toast.LENGTH_SHORT).show()
            else Toast.makeText(this,"Successful!",Toast.LENGTH_LONG).show()
        }

    }
}
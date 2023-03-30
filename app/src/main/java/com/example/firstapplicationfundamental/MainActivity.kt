package com.example.firstapplicationfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    // Best practice using lateinit
    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloTextView.text = resources.getString(R.string.app_name)

        sayHelloButton.setOnClickListener {

            Log.d("Nurland", "This is debug log")
            Log.i("Nurland", "This is info log")
            Log.w("Nurland", "This is warning log")
            Log.e("Nurland", "This is error log")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("Nurland", it)
            }
        }
    }

    // Seperti ini bukan rekomendasi walau sebenernya work
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.hello_world)
//
//        val nameEditText : EditText = findViewById(R.id.nameEditText)
//        val sayHelloButton : Button = findViewById(R.id.sayHelloButton)
//        val sayHelloTextView : TextView = findViewById(R.id.sayHelloTextView)
//
//        sayHelloTextView.text = "Hi Nur, this is hardcode"
//
//        sayHelloButton.setOnClickListener {
//            val name = nameEditText.text.toString()
//            sayHelloTextView.text = "Hello $name"
//        }
//
//    }
}
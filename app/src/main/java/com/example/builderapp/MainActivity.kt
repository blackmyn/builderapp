package com.example.builderapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.builderapp.R
import com.example.builderapp.data.CoffeeBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var buttonOatMilk: Button
    private lateinit var buttonCowMilk : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val coffeeWithOatMilk = CoffeeBuilder()
            .withCoffeeBeans("Arabica")
            .withMilk("Oat milk")
            .withSugar("Double sugar")
            .build()
        val coffeeWithCowMilk = CoffeeBuilder()
            .withCoffeeBeans("Robusta")
            .withDoubleCoffee("Double")
            .withMilk("Cow milk")
            .build()

        textView = findViewById(R.id.textView)
        buttonOatMilk = findViewById(R.id.button4)
        buttonCowMilk = findViewById(R.id.button3)

        buttonCowMilk.setOnClickListener {
            textView.text = coffeeWithCowMilk.toString()
        }
        buttonOatMilk.setOnClickListener {
            textView.text = coffeeWithOatMilk.toString()
        }
    }
}
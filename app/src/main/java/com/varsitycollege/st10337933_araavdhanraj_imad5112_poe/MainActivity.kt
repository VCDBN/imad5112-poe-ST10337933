package com.varsitycollege.st10337933_araavdhanraj_imad5112_poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button
    private lateinit var square: Button
    private lateinit var exponent: Button
    private lateinit var new: Button
//The above code is declaring the Ui elements

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.answer)
        edit1 = findViewById(R.id.editTextNumber1)
        edit2 = findViewById(R.id.editTextNumber2)
        add = findViewById(R.id.addition)
        subtract = findViewById(R.id.subtraction)
        multiply = findViewById(R.id.multiplication)
        divide = findViewById(R.id.division)
        square = findViewById(R.id.squareRoot)
        exponent = findViewById(R.id.exponential)
        new = findViewById(R.id.second)

//The above code is used to initialize the Ui elements with the use of findViewById

        add.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "+"
            //The above code is to gather the values from both editText fields

            val result = num1 + num2
            //The code in use here is for adding both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        subtract.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "-"
            //The above code is to gather the values from both editText fields

            val result = num1 - num2
            //The code in use here is for subtracting both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        multiply.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "x"
            //The above code is to gather the values from both editText fields

            val result = num1 * num2
            //The code in use here is for multiply both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        divide.setOnClickListener{
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            //The above code is to gather the values from both editText fields
            val operator = "÷"

            if (num2 ==0) {
                display.text = "Error, division by 0 is not allowed"
                //The above code is used to display an error message
            }

            else{
                val result = num1 / num2
                //The code in use here is for divide both the numbers and displaying the result
                display.text = "$num1 $operator $num2 = $result"
            }
        }
        square.setOnClickListener{
            val num1 = edit1.text.toString().toInt()
            if (num1 < 0) {
                val result = sqrt(num1.toDouble())  //(kinyanjui,2023)
                display.text = "i, imaginary number" //(kinyanjui,2023)
            }
            else {
                val result = sqrt(num1.toDouble()) //(kinyanjui,2023)
                display.text = "$result"
            }
        }
        exponent.setOnClickListener{
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "^"

            val result = num1.toDouble().pow(num2.toDouble())  //(zoe,2018)
            display.text = "$num1 $operator $num2 = $result"
        }

        new.setOnClickListener{
            val intent = Intent(this, secondpage::class.java)
            startActivity(intent)
        }

    }
}
//Reference list
/*kinyanjui.2023. square root, kotlin. [ONLINE].
Available at https://stackoverflow.com/questions/47846653/unresolved-reference-sqrt-kotlin
[Accessed 28 September 2023]
 */
/*zoe.2018. exponential, kotlin. [ONLINE].
Available at https://stackoverflow.com/questions/50270435/what-is-the-kotlin-exponent-operator
[Accessed 28 September 2023]
 */

// the links to all the resources used are:
// https://youtu.be/TEXaoSC_8lQ?si=vDINf6HxMyTqttDe
//https://youtu.be/v24Bhk7wQI8?si=Pazlov1hqaezQH7_
//https://youtu.be/Zi1XgFTUH9k?si=heOWrsrAPtdw9bKH
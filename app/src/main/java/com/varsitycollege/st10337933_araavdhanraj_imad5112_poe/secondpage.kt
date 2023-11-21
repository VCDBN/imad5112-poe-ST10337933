package com.varsitycollege.st10337933_araavdhanraj_imad5112_poe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class secondpage : AppCompatActivity() {

    private lateinit var numb: EditText
    private lateinit var btn1: Button
    private lateinit var stored: TextView
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var display: TextView
    //The above code is declaring the Ui elements
    var numberList = arrayListOf<Int>()//(geeksforgeeks,2019)
    var count = 0 //(geeksforgeeks,2019)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        numb = findViewById(R.id.number)
        btn1 = findViewById(R.id.add)
        stored = findViewById(R.id.saved)
        btn2 = findViewById(R.id.clr)
        btn3 = findViewById(R.id.avg)
        btn4 = findViewById(R.id.min)
        display = findViewById(R.id.answer)
        //The above code is used to initialize the Ui elements with the use of findViewById

        btn1.setOnClickListener {
            val number = numb.text.toString().toInt() //(geeksforgeeks,2019)
            numberList.add(number)
            count++
            numb.setText("")

            stored.text = " \n${numberList.joinToString()}"


        }

        val clearButton = findViewById<Button>(R.id.clr)
        clearButton.setOnClickListener {
            numberList.clear() //(mollah,2020)


            count = 0 //(mollah,2020)

            stored.text = " \n${numberList.joinToString()}"

        }

        val calculateAverageButton = findViewById<Button>(R.id.avg)
        calculateAverageButton.setOnClickListener {
            var sum = 0 //(mert,2022)
            for (i in numberList) { //(mert,2022)


                sum += i //(mert,2022)
            }
            val average = sum / numberList.size //(mert,2022)
            display.text = "Average: $average"
        }

        val findMinMaxButton = findViewById<Button>(R.id.min)
        findMinMaxButton.setOnClickListener {
            var min = numberList[0]


            var max = numberList[0]
            for (i in numberList) {


                if (i < min) {
                    min = i
                }

                if (i > max) {
                    max = i
                }
                //the above code is for finding the minimum and maximum values using the arrays
            }
            display.text = "Min: $min, Max: $max"
            //the above code is for displaying the answer in the textview
        }

    }
}

//Reference list
/*geeksforgeeks.2019. kotlin array. [ONLINE].
Available at https://www.geeksforgeeks.org/kotlin-array/
[Accessed 21 November 2023]
 */
/*mollah.2020. kotlin clear button. [ONLINE].
Available at https://stackoverflow.com/questions/61962830/clear-button-on-calculator-app-using-kotlin
[Accessed 21 November 2023]
 */
/*mert.2022. calculate average of array kotlin. [ONLINE].
Available at https://stackoverflow.com/questions/74421894/how-to-calculate-the-average-of-array-kotlin-android
[Accessed 21 November 2023]
 */
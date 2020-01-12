package com.example.exercise_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age = findViewById<Spinner>(R.id.spinnerAge)
        var smoker = findViewById<CheckBox>(R.id.checkBoxSmoker)

        buttonCalculate.setOnClickListener {
            var genderId: Int = radioGroupGender.checkedRadioButtonId
            val gender: RadioButton = findViewById(genderId)
            var price = 0

            if(age.selectedItemPosition==0){
                price += 60
            }
            else if(age.selectedItemPosition == 1){
                price += 70
                if(gender.text.toString() == "Male"){
                    price += 50
                }
                if(smoker.isChecked){
                    price += 100
                }
            }
            else if(age.selectedItemPosition == 2){
                price += 90
                if(gender.text.toString() == "Male"){
                    price += 100
                }
                if(smoker.isChecked){
                    price += 150
                }
            }
            else if(age.selectedItemPosition == 3){
                price += 120
                if(gender.text.toString() == "Male"){
                    price += 150
                }
                if(smoker.isChecked){
                    price += 200
                }
            }
            else if(age.selectedItemPosition == 4){
                price += 150
                if(gender.text.toString() == "Male"){
                    price += 200
                }
                if(smoker.isChecked){
                    price += 250
                }
            }
            else if(age.selectedItemPosition == 5){
                price += 150
                if(gender.text.toString() == "Male"){
                    price += 200
                }
                if(smoker.isChecked){
                    price += 300
                }
            }

            textViewPremium.text = "Insurance Premium: RM $price"
        }

        buttonReset.setOnClickListener {
            textViewPremium.text="Insurance Premium:"
            age.setSelection(0)
            radioGroupGender.clearCheck()
            smoker.isChecked = false
        }
    }
}

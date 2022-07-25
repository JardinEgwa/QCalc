package com.example.qcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var ButtonAdd: Button
    lateinit var ButtonSubtract: Button
    lateinit var ButtonMultiply: Button
    lateinit var ButtonDivide: Button
    lateinit var ButtonPoint: Button
    lateinit var ButtonClear: Button
    lateinit var ButtonEqual:Button
    lateinit var Button1: Button
    lateinit var Button2: Button
    lateinit var Button3: Button
    lateinit var Button4: Button
    lateinit var Button5: Button
    lateinit var Button6: Button
    lateinit var Button7: Button
    lateinit var Button8: Button
    lateinit var Button9: Button
    lateinit var Button0: Button
    lateinit var Input: EditText
    lateinit var Answer: EditText

    var check=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        ButtonAdd=findViewById(R.id.btnadd)
        ButtonSubtract=findViewById(R.id.btnsubtract)
        ButtonMultiply=findViewById(R.id.btnmultiply)
        ButtonDivide=findViewById(R.id.btndivide)
        ButtonPoint=findViewById(R.id.btnpoint)
        ButtonClear=findViewById(R.id.btnclear)
        ButtonEqual=findViewById(R.id.btnequals)
        Input=findViewById(R.id.input)
        Answer=findViewById(R.id.Answer)
        Button1=findViewById(R.id.btn1)
        Button2=findViewById(R.id.btn2)
        Button3=findViewById(R.id.btn3)
        Button4=findViewById(R.id.btn4)
        Button5=findViewById(R.id.btn5)
        Button6=findViewById(R.id.btn6)
        Button7=findViewById(R.id.btn7)
        Button8=findViewById(R.id.btn8)
        Button9=findViewById(R.id.btn9)
        Button0=findViewById(R.id.btn0)

        var text: String

        Button1.setOnClickListener {
            text=Input.text.toString()+"1"
            Input.setText(text)
            result(text)
        }
        Button2.setOnClickListener {
            text=Input.text.toString()+"2"
            Input.setText(text)
            result(text)
        }
        Button3.setOnClickListener {
            text=Input.text.toString()+"3"
            Input.setText(text)
            result(text)
        }
        Button4.setOnClickListener {
            text=Input.text.toString()+"4"
            Input.setText(text)
            result(text)
        }
        Button5.setOnClickListener {
            text=Input.text.toString()+"5"
            Input.setText(text)
            result(text)
        }
        Button6.setOnClickListener {
            text=Input.text.toString()+"6"
            Input.setText(text)
            result(text)
        }
        Button7.setOnClickListener {
            text=Input.text.toString()+"7"
            Input.setText(text)
            result(text)
        }
        Button8.setOnClickListener {
            text=Input.text.toString()+"8"
            Input.setText(text)
            result(text)
        }
        Button9.setOnClickListener {
            text=Input.text.toString()+"9"
            Input.setText(text)
            result(text)
        }
        Button0.setOnClickListener {
            text=Input.text.toString()+"0"
            Input.setText(text)
            result(text)
        }
        ButtonPoint.setOnClickListener {
            text=Input.text.toString()+"."
            Input.setText(text)
            result(text)
        }
        ButtonAdd.setOnClickListener {
            text=Input.text.toString()+"+"
            Input.setText(text)
            check=check+1
        }
        ButtonSubtract.setOnClickListener {
            text=Input.text.toString()+"-"
            Input.setText(text)
            check=check+1
        }
        ButtonDivide.setOnClickListener {
            text=Input.text.toString()+"/"
            Input.setText(text)
            check=check+1
        }
        ButtonMultiply.setOnClickListener {
            text=Input.text.toString()+"*"
            Input.setText(text)
            check=check+1
        }
        ButtonEqual.setOnClickListener {
            text=Answer.text.toString()
            Input.setText(text)
            Answer.setText(null)
        }
        ButtonClear.setOnClickListener {
            Answer.setText(null)
            Input.setText(null)
        }

    }

    private fun result(text: String) {


    }
}
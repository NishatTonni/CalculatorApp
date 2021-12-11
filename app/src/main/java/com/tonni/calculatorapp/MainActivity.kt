package com.tonni.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tonni.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.acBtnId.setOnClickListener {
            binding.inputText.text = ""
            binding.outputText.text = ""
        }

        binding.Btn0Id.setOnClickListener {
            binding.inputText.append("0")
        }

        binding.Btn1Id.setOnClickListener {
            binding.inputText.append("1")
        }

        binding.Btn2Id.setOnClickListener {
            binding.inputText.append("2")
        }

        binding.Btn3Id.setOnClickListener {
            binding.inputText.append("3")
        }

        binding.Btn4Id.setOnClickListener {
            binding.inputText.append("4")
        }

        binding.Btn5Id.setOnClickListener {
            binding.inputText.append("5")
        }

        binding.Btn6Id.setOnClickListener {
            binding.inputText.append("6")
        }

        binding.Btn7Id.setOnClickListener {
            binding.inputText.append("7")
        }

        binding.Btn8Id.setOnClickListener {
            binding.inputText.append("8")
        }

        binding.Btn9Id.setOnClickListener {
            binding.inputText.append("9")
        }

        binding.plusBtnId.setOnClickListener {
            binding.inputText.append(" + ")
        }

        binding.divideBtnId.setOnClickListener {
            binding.inputText.append(" / ")
        }

        binding.minusBtnId.setOnClickListener {
            binding.inputText.append(" - ")
        }

        binding.multiplyBtnId.setOnClickListener {
            binding.inputText.append(" * ")
        }

        binding.BtnDotId.setOnClickListener {
            binding.inputText.append(".")
        }

        binding.startBracketBtnId.setOnClickListener {
            binding.inputText.append(" ( ")
        }

        binding.endBracketBtnId.setOnClickListener {
            binding.inputText.append(" ) ")
        }

        binding.equalBtnId.setOnClickListener {
           val expression = ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()){
                binding.outputText.text = longResult.toString()

            }else{
                binding.outputText.text = result.toString()
            }
        }




    }
}
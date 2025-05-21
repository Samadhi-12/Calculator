package com.app.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private var inputText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clearBtn.setOnClickListener {
            inputText = ""
            binding.inputText.text = ""
            binding.outputText.text = ""
        }

        binding.leftBtn.setOnClickListener {
            inputText = addToInputText("(")
            binding.inputText.text = inputText
        }

        binding.rightBtn.setOnClickListener {
            inputText = addToInputText(")")
            binding.inputText.text = inputText
        }

        binding.divBtn.setOnClickListener {
            inputText = addToInputText("÷")
            binding.inputText.text = inputText
        }

        binding.sevenBtn.setOnClickListener {
            inputText = addToInputText("7")
            binding.inputText.text = inputText
        }

        binding.eightBtn.setOnClickListener {
            inputText = addToInputText("8")
            binding.inputText.text = inputText
        }

        binding.nineBtn.setOnClickListener {
            inputText = addToInputText("9")
            binding.inputText.text = inputText
        }

        binding.multiplyBtn.setOnClickListener {
            inputText = addToInputText("×")
            binding.inputText.text = inputText
        }

        binding.fourBtn.setOnClickListener {
            inputText = addToInputText("4")
            binding.inputText.text = inputText
        }

        binding.fiveBtn.setOnClickListener {
            inputText = addToInputText("5")
            binding.inputText.text = inputText
        }

        binding.sixBtn.setOnClickListener {
            inputText = addToInputText("6")
            binding.inputText.text = inputText
        }

        binding.minusBtn.setOnClickListener {
            inputText = addToInputText("-")
            binding.inputText.text = inputText
        }

        binding.threeBtn.setOnClickListener {
            inputText = addToInputText("3")
            binding.inputText.text = inputText
        }

        binding.twoBtn.setOnClickListener {
            inputText = addToInputText("2")
            binding.inputText.text = inputText
        }

        binding.oneBtn.setOnClickListener {
            inputText = addToInputText("1")
            binding.inputText.text = inputText
        }

        binding.addBtn.setOnClickListener {
            inputText = addToInputText("+")
            binding.inputText.text = inputText
        }

        binding.zeroBtn.setOnClickListener {
            inputText = addToInputText("0")
            binding.inputText.text = inputText
        }

        binding.decimalBtn.setOnClickListener {
            inputText = addToInputText(".")
            binding.inputText.text = inputText
        }

        binding.equalBtn.setOnClickListener {
            showResult()
        }

        binding.arrowBtn.setOnClickListener {
            if (inputText.isNotEmpty()) {
                inputText = inputText.dropLast(1)
                binding.inputText.text = inputText
            }        }

    }

    private fun addToInputText(buttonValue: String): String{

        return inputText + buttonValue
    }

    private fun getInputExpression(): String{
        var expression = inputText.replace(Regex("÷"),"/")
        expression = expression.replace(Regex("×"),"*")

        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = ExpressionBuilder(expression).build().evaluate()

            // Format the result to avoid .0 for integers
            val formattedResult = if (result % 1 == 0.0) {
                result.toInt().toString()
            } else {
                result.toString()
            }
            binding.outputText.setTextColor(ContextCompat.getColor(this, R.color.green_button))
            binding.outputText.text = formattedResult

        } catch (e: Exception) {
            binding.outputText.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
    }

}





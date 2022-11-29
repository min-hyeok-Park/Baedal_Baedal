package com.example.baedal_baedal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.baedal_baedal.databinding.ActivitySingUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginIntent = Intent(this, MainActivity::class.java)

        binding.signUpBtn2.setOnClickListener {
            startActivity(loginIntent)
            Toast.makeText(this, "회원가입을 축하합니다!!", Toast.LENGTH_SHORT).show()
        }

        binding.resetBtn.setOnClickListener {
            binding.idEdit.setText(null)
            binding.passwdEdit.setText(null)
            binding.nameEdit.setText(null)
            binding.phoneEdit.setText(null)
            binding.addressEdit.setText(null)
            binding.nicknameEdit.setText(null)
        }
    }
}
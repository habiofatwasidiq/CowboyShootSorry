package com.catnip.cowboyshoot.ui.costumedialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.catnip.cowboyshoot.R
import com.catnip.cowboyshoot.databinding.ActivitycostumedialogBinding
import com.google.android.material.snackbar.Snackbar


class CostumeDialogActivity : AppCompatActivity() {
    private val binding: ActivitycostumedialogBinding by lazy {
        ActivitycostumedialogBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        val name = intent.getStringExtra("name")

        binding.tvTitle.text = "Hi ${name}!"
        binding.tvVsComputer.text = "$name vs Computer"
        binding.tvVsPlayer.text = "$name vs Player"


        Snackbar.make(binding.menuActivity, "Welcom to the game $name", Snackbar.LENGTH_LONG)
            .setAction("Close") {}.show()
    }
}
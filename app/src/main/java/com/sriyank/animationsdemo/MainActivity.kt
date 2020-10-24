package com.sriyank.animationsdemo

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		var isChecked = true

		avdImage.setOnClickListener {
			if (isChecked)
				checkToClose()
			else
				closeToCheck()

			isChecked = !isChecked
		}
	}

	private fun closeToCheck() {

		avdImage.setImageResource(R.drawable.avd_close_to_check)
		val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
		avdCheckToClose.start()
	}

	private fun checkToClose() {

		avdImage.setImageResource(R.drawable.avd_check_to_close)
		val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
		avdCheckToClose.start()
	}
}

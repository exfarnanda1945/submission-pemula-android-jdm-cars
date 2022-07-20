package com.example.submissiondicodingjdmcars

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.submissiondicodingjdmcars.databinding.ActivityJdmCarDetailBinding

class JdmCarDetailActivity : AppCompatActivity() {
    companion object {
        const val CAR_IMAGE: String = "extra_car_image"
        const val CAR_NAME: String = "extra_car_name"
        const val CAR_BRAND: String = "extra_car_brand"
        const val CAR_DESC: String = "extra_car_desc"
        const val CAR_ENGINE_CODE: String = "extra_car_engine_code"
        const val CAR_DWS: String = "extra_car_dws"
    }

    private lateinit var binding:ActivityJdmCarDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityJdmCarDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val appBar = supportActionBar

        if(appBar != null){
            appBar.title = "Detail"
            appBar.setDisplayHomeAsUpEnabled(true)
        }

        val carImage: ImageView = binding.carDetailImage
        val carName: TextView = binding.tvCarNameDetail
        val carBrand: TextView = binding.tvCarBrand
        val carDesc: TextView = binding.tvDescription
        val carEngineCode: TextView = binding.tvEngineCode
        val carDws: TextView = binding.tvDws

        val getCarBrand = intent.getStringExtra(CAR_BRAND)

        carImage.setImageResource(intent.getIntExtra(CAR_IMAGE, 0))
        carName.text = "$getCarBrand ${intent.getStringExtra(CAR_NAME)}"
        carBrand.text = getCarBrand
        carDesc.text = intent.getStringExtra(CAR_DESC)
        carEngineCode.text = intent.getStringExtra(CAR_ENGINE_CODE)
        carDws.text = intent.getStringExtra(CAR_DWS)
    }
}
package com.example.submissiondicodingjdmcars

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class JdmCarDetailActivity : AppCompatActivity() {
    companion object {
        const val CAR_IMAGE: String = "extra_car_image"
        const val CAR_NAME: String = "extra_car_name"
        const val CAR_BRAND: String = "extra_car_brand"
        const val CAR_DESC: String = "extra_car_desc"
        const val CAR_ENGINE_CODE: String = "extra_car_engine_code"
        const val CAR_DWS: String = "extra_car_dws"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jdm_car_detail)

        val appBar = supportActionBar

        if(appBar != null){
            appBar.title = "Detail"
            appBar.setDisplayHomeAsUpEnabled(true)
        }

        val carImage: ImageView = findViewById(R.id.car_detail_image)
        val carName: TextView = findViewById(R.id.tv_car_name_detail)
        val carBrand: TextView = findViewById(R.id.tv_car_brand)
        val carDesc: TextView = findViewById(R.id.tv_description)
        val carEngineCode: TextView = findViewById(R.id.tv_engine_code)
        val carDws: TextView = findViewById(R.id.tv_dws)

        val getCarBrand = intent.getStringExtra(CAR_BRAND)

        carImage.setImageResource(intent.getIntExtra(CAR_IMAGE, 0))
        carName.text = "$getCarBrand ${intent.getStringExtra(CAR_NAME)}"
        carBrand.text = getCarBrand
        carDesc.text = intent.getStringExtra(CAR_DESC)
        carEngineCode.text = intent.getStringExtra(CAR_ENGINE_CODE)
        carDws.text = intent.getStringExtra(CAR_DWS)
    }
}
package com.example.submissiondicodingjdmcars

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCarList: RecyclerView
    private var carList: ArrayList<JdmCarsModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "JDM Cars Garage"

        rvCarList = findViewById(R.id.rv_cars)
        rvCarList.setHasFixedSize(true)

        val resGetList = JdmCarsData.getCarList()

        carList.addAll(resGetList)
        renderCarList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_user){
            startActivity(Intent(this@MainActivity,UserActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }


    private fun renderCarList() {
        rvCarList.layoutManager = LinearLayoutManager(this)
        val jdmCarAdapter = JdmCarsAdapter(carList)
        rvCarList.adapter = jdmCarAdapter

        jdmCarAdapter.setOnItemClickCallback(object : JdmCarsAdapter.IOnClickCallback {
            override fun onItemClick(value: JdmCarsModel) {
                val intentData = Intent(this@MainActivity, JdmCarDetailActivity::class.java)
                intentData.putExtra(JdmCarDetailActivity.CAR_IMAGE, value.image)
                intentData.putExtra(JdmCarDetailActivity.CAR_NAME, value.carName)
                intentData.putExtra(JdmCarDetailActivity.CAR_DESC, value.carDesc)
                intentData.putExtra(JdmCarDetailActivity.CAR_ENGINE_CODE, value.carMachine)
                intentData.putExtra(JdmCarDetailActivity.CAR_BRAND, value.carBrand)
                intentData.putExtra(JdmCarDetailActivity.CAR_DWS, value.driveWheelSystemType.name)
                startActivity(intentData)
            }
        })
    }

}
package com.dp.pie_chart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lecho.lib.hellocharts.view.PieChartView
import lecho.lib.hellocharts.model.SliceValue
import lecho.lib.hellocharts.model.PieChartData

class MainActivity : AppCompatActivity() {
    /*TODO REFERENCES: https://www.codingdemos.com/android-pie-chart-tutorial/ */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var chart = findViewById<PieChartView>(R.id.chart)
        val pieData = ArrayList<SliceValue>()
        pieData.add(SliceValue(15F, Color.BLUE).setLabel("Q1: $10"))
        pieData.add(SliceValue(25F, Color.GRAY).setLabel("Q2: $4"))
        pieData.add(SliceValue(10F, Color.RED).setLabel("Q3: $18"))
        pieData.add(SliceValue(60F, Color.MAGENTA).setLabel("Q4: $28"))

        val pieChartData = PieChartData(pieData)
        pieChartData.setHasLabels(true).setValueLabelTextSize(14)
        pieChartData.setHasCenterCircle(true).setCenterText1("Inventory")
        //pieChartData.setHasCenterCircle(true).setCenterText1("Sales in million").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));

        chart.setPieChartData(pieChartData);
    }

}
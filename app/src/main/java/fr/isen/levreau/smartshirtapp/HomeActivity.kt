package fr.isen.levreau.smartshirtapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper.HORIZONTAL
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

      /*  sport_button.setOnClickListener {
            val intent = Intent(this, SportActivity::class.java)
            startActivity(intent)
        } */

        val choix: ArrayList<String> = ArrayList()
        choix.add("Nouvelle séance")
        choix.add("Calibration")
        choix.add("Réglages")
        choix.add("Suivi")

        val mImage: ArrayList<Int> = ArrayList()
        mImage.add(R.drawable.calibration)
        mImage.add(R.drawable.sport)
        mImage.add(R.drawable.settings)
        mImage.add(R.drawable.suivi)

        recyclerView.layoutManager= LinearLayoutManager(this, HORIZONTAL, false)
        recyclerView.adapter = MenuAdapter(choix, mImage)
    }

}

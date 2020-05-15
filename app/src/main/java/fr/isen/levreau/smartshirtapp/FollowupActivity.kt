package fr.isen.levreau.smartshirtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_followup.*
import kotlinx.android.synthetic.main.activity_home.*

class FollowupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_followup)

        seance_button.setOnClickListener(){
            evolution_button.setBackgroundResource(R.color.colorUnpressed)
            seance_button.setBackgroundResource(R.color.colorPressed)

            recycler_seance.layoutManager= LinearLayoutManager(this)
            recycler_seance.adapter = SeanceAdapter()
        }

        evolution_button.setOnClickListener(){
            evolution_button.setBackgroundResource(R.color.colorPressed)
            seance_button.setBackgroundResource(R.color.colorUnpressed)

        }
    }
}

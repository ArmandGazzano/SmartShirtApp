package fr.isen.levreau.smartshirtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calibration.*

class CalibrationActivity : AppCompatActivity() {
    private val isBLEEnabled: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calibration )

        calibration_Scan.setOnClickListener {
            if (textScan.text == "Launch Calibration") {
                val i = 0
                calibration_Scan.setImageResource(android.R.drawable.ic_media_pause)
                textScan.text = "Current calibration ..."
                textValider.visibility = View.VISIBLE

                progressBar.visibility = View.VISIBLE

                if ( i == 0 ){
                    image_dos.setImageResource(R.drawable.valider)
                     textValider.text = "Enjoy our session"}
                else {
                    image_dos.setImageResource(R.drawable.refuser)
                    textValider.text = "Something went wrong ... try again please"}


            } else if (textScan.text == "Current calibration ...") {
                calibration_Scan.setImageResource(android.R.drawable.ic_media_play)
                image_dos.setImageResource(R.drawable.position_dos)
                textScan.text = "Launch Calibration"
                progressBar.visibility = View.INVISIBLE

                textValider.visibility = View.INVISIBLE

            }
        }
        /*
        if (calculCalibration()) {
            valider.visibility=View.VISIBLE
            textValider.visibility=View.VISIBLE
        } else if (calculCalibration()){
            refuser.visibility=View.VISIBLE
            textRefuser.visibility=View.VISIBLE
        }

    }

    private fun calculCalibration() : Boolean{

        return true
    }
    */
    }

}



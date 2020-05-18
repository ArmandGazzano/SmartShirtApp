package fr.isen.levreau.smartshirtapp

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_compote.*
import kotlinx.android.synthetic.main.activity_compote_id.*

class CompoteDialogue: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compote_id)

        val new_id = edit_id.text

        val builder = android.app.AlertDialog.Builder(this)
            .setTitle("Changer votre identifiant : ")
            .setMessage("$new_id")
            .setNegativeButton("cancel", DialogInterface.OnClickListener(){
                    dialogInterface: DialogInterface, i: Int ->
            })
            .setPositiveButton("ok",DialogInterface.OnClickListener {
                    dialogInterface: DialogInterface, i: Int ->
            })
            .show()

    }
}


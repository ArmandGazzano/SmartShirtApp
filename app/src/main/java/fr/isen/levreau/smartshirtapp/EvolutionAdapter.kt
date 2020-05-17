package fr.isen.levreau.smartshirtapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_followup_evolution.view.*

class EvolutionAdapter(
    val post: ArrayList<String>,
    val mBarre: ArrayList<Int>
) : RecyclerView.Adapter<EvolutionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_followup_evolution, parent, false)
        )

    override fun getItemCount(): Int= post.size

    override fun onBindViewHolder(holder: EvolutionAdapter.ViewHolder, position: Int) {
        holder.part_corp.text = post[position]
        holder.image_barre1.setImageResource(mBarre[1])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val part_corp: TextView = itemView.txtView
        val  image_barre1:ImageView = itemView.imageView1
    }



}

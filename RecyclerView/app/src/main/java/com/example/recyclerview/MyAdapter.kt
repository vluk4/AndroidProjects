package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Person
import com.example.recyclerview.model.person
import kotlinx.android.synthetic.main.list_persons.view.*

class MyAdapter(private val persons: MutableList<Person>): RecyclerView.Adapter<MyAdapter.MyviewHolder>() {
    class MyviewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(person: Person){
            itemView.tvName.text = person.name.first().toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_persons, parent, false)
        return MyviewHolder(view)
    }

    override fun getItemCount() = persons.size

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.bind(persons[position])
    }
}
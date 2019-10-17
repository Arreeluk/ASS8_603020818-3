package com.example.ass8

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_layout.view.*

class EmployeeAdapter (val items : List<Employee>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.emp_item_layout, parent, false)
        return ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvName?.text = "Name : " + items[position].emp_name
        holder.tvGender?.text = "Gender : " + items[position].emp_gender
        holder.tvEmail?.text = "E-mail : " + items[position].emp_email
        holder.tvSalary?.text = "Salary : " + items[position].emp_salary.toString()
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvName : TextView = view.tv_name
    val tvGender = view.tv_gender
    val tvEmail = view.tv_mail
    val tvSalary = view.tv_salary
}

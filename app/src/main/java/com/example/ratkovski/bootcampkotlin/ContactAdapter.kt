package com.example.ratkovski.bootcampkotlin

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {//gerenciamento da lista como umtodo
    //atributo de classe para armazenar a lista
    private val list:MutableList<Contact> = mutableListOf<>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //viewRooder gerenciar cada item da lista
    //inner class
    class ContactAdapterViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    }
}



package com.example.ratkovski.bootcampkotlin

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {//gerenciamento da lista como umtodo
    //atributo de classe para armazenar a lista
    private val list:MutableList<Contact> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        TODO("Not yet implemented")
    }
//saber a quantidade de items da lista
    override fun getItemCount(): Int {
     return list.size
    }
//rodar em cada item do array e popular a lista do recyclerview Bind
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
       holder.bind(list[position])
    }

    //viewRooder gerenciar cada item da lista
    //inner class
    class ContactAdapterViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {


        fun bind(contact: Contact) {

        }
    }
}



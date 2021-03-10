package com.example.ratkovski.bootcampkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {//gerenciamento da lista como umtodo
    //atributo de classe para armazenar a lista
    private val list:MutableList<Contact> = mutableListOf()

//criando a view layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
    //para inflar dizer que é o arquivo xml que vai mostrar o layout
       var view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
    return ContactAdapterViewHolder(view)
    }
//saber a quantidade de items da lista
    override fun getItemCount(): Int {
     return list.size
    }
//rodar em cada item do array e popular a lista do recyclerview Bind
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
       holder.bind(list[position])
    }

    fun updateList(list: List<Contact>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged() //notifica o adapter que a lista possui modificacao
    }




    //viewRooder gerenciar cada item da lista
    //inner class
    class ContactAdapterViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        private val tvName:TextView = itemView.findViewById(R.id.tv_name)
        private val tvPhone:TextView = itemView.findViewById(R.id.tv_phone)
        private val ivPhoto:ImageView = itemView.findViewById(R.id.iv_photo)

        fun bind(contact: Contact) {
            tvName.text = contact.name
            tvPhone.text = contact.phone
           // ivPhoto.text = contact.photo

        }
    }
}



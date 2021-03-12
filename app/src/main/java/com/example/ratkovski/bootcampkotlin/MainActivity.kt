package com.example.ratkovski.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rvList)

    }
    private val adapter = ContactAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        updateList()
    }

    private fun bindView() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

    }

    private fun updateList() {
        //lista mokada lista fake
        adapter.updateList(
                arrayListOf(
                        Contact(
                                name = "Ratkovski",
                                phone = "(99)9000-0000",
                                photo = "img.png"
                        ),
                        Contact(
                                name = "Ratkovski",
                                phone = "(99)9000-0000",
                                photo = "img.png"
                        )
                )

        )
    }

    //mostrar menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()


    }

    //capturar click dos items do menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("item de menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("item de menu 2")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}

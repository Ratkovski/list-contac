package com.example.ratkovski.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        rvList.layoutManager= LinearLayoutManager(this)

    }
    private fun updateList(){
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


    }

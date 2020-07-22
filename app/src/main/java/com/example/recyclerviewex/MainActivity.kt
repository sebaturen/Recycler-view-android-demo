package com.example.recyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val punchList = generatePunchList(50)

        recycle_view.adapter = PunchListAdapter(punchList)
        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.setHasFixedSize(true)
    }

    private fun generatePunchList(size: Int): List<Punch> {

        val list = ArrayList<Punch>()

        for (i in 0 until  size) {
            val drawable = when (i%3) {
                0 -> R.drawable.ic_baseline_4k_24
                1 -> R.drawable.ic_baseline_add_location_24
                else -> R.drawable.ic_baseline_add_photo_alternate_24
            }

            val i = Punch(drawable, "$i:$i$i")
            list.add(i)
        }

        return list

    }
}
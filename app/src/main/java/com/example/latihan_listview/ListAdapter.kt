package com.example.latihan_listview


import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
class ListAdapter(var mCctx:Context,var resaurce:Int,var items:List<model>)
    :ArrayAdapter<model>(mCctx,resaurce,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mCctx)
        val view:View=layoutInflater.inflate(resaurce,null)
        val imageView:ImageView=view.findViewById(R.id.imageView)
        val textView2:TextView=view.findViewById(R.id.textView2)
        val textView3:TextView=view.findViewById(R.id.textView3)

        val person:model=items[position]

        imageView.setImageDrawable(mCctx.resources.getDrawable(person.photo))
        textView2.text=person.title
        textView3.text=person.desc

        return view
    }

}

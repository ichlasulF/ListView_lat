package com.example.latihan_listview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.listviewIcon)
        var list= mutableListOf<model>()

        list.add(model("Rubby","Rubby is an open-source and fully object-oriented programing language",R.drawable.rubby))
        list.add(model("Rails","Rubby on Ralls is a server-side web application devolopment framwork writen inRubby language.",R.drawable.rals))
        list.add(model("Python","Python is interpreted scripting and object-oriented programing language",R.drawable.python))
        list.add(model("Java Script","JavaScript is an object-based scripting language",R.drawable.javascript))
        list.add(model("PHP","PHP is an Interpreted language, i.e.m three is no need for compilation",R.drawable.php))

        listView    .adapter=ListAdapter(this,R.layout.layout_isi,list)
        listView.setOnItemClickListener{parent,view,position,id->

            if(position==0){
                Toast.makeText(this@MainActivity,"You selected Rubby",Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                Toast.makeText(this@MainActivity,"You selected Ralls",Toast.LENGTH_SHORT).show()
            }
            if(position==2){
                Toast.makeText(this@MainActivity,"You selected Python",Toast.LENGTH_SHORT).show()
            }
            if(position==3){
            Toast.makeText(this@MainActivity,"You selected Java Script",Toast.LENGTH_SHORT).show()
            }
            if(position==4){
            Toast.makeText(this@MainActivity,"You selected PHP",Toast.LENGTH_SHORT).show()
            }

        }
    }
}

package edu.bo.guias8_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.snackbar.Snackbar;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList= ArrayList<Model>()
        //imageView.setImageResource(R.drawable.mesa)
        arrayList.add(Model("Juan","Juan@gmail.com",R.drawable.mas));
        arrayList.add(Model("Ana","Ana@gmail.com",R.drawable.fem));
        arrayList.add(Model("Lucia","Lucia@gmail.com",R.drawable.fem));
        arrayList.add(Model("Matias","Matias@gmail.com",R.drawable.mas));
        arrayList.add(Model("Alex","Alex@gmail.com",R.drawable.otro));

        val myAdapter = MyAdapter(arrayList,this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=myAdapter

        Snackbar.make(layoutPrincipal , getString(R.string.mensaje_snackbar),
                Snackbar.LENGTH_LONG)
            .setBackgroundTint(resources.getColor(R.color.backgroundTint))
            .setActionTextColor(resources.getColor(R.color.actionTextColor))
            .show()



    }
}
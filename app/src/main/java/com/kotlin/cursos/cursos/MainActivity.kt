package com.kotlin.cursos.cursos

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this, getString(R.string.mensaje_inicio), Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        var myToast = Toast.makeText(this, getString(R.string.mensaje_inicio), Toast.LENGTH_LONG)
        myToast.setGravity(Gravity.CENTER, 500, 0)
        myToast.show()
    }

    fun shutdown(view: View){
        super.onDestroy()
    }

}

package com.shadowtato.siganaturedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.gcacace.signaturepad.views.SignaturePad

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signaturePad: SignaturePad = findViewById(R.id.signature_pad)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            signaturePad.clear()
        }


    }
}
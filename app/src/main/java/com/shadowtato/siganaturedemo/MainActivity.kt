package com.shadowtato.siganaturedemo

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.gcacace.signaturepad.views.SignaturePad


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signaturePad: SignaturePad = findViewById(R.id.signature_pad)
        val button : Button = findViewById(R.id.button)
        val btnValidate: Button = findViewById(R.id.button2)
        val imageView2: ImageView = findViewById(R.id.imageView)

        button.setOnClickListener {
            signaturePad.clear()
            imageView2.setImageBitmap(null)
        }

        btnValidate.setOnClickListener{

            val signatureBitmap: Bitmap  = signaturePad.signatureBitmap
            signaturePad.isEmpty

            if (signaturePad.isEmpty) {
                Toast.makeText(this,"Firma Vacia", Toast.LENGTH_LONG).show()
            } else {
                imageView2.setImageBitmap(signatureBitmap)
            }
        }

    }
}
package com.example.widgetskullanimi

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.widgetskullanimi.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var kontrol = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toggleButton.addOnButtonCheckedListener{group, checkedId, isChecked ->
            kontrol = isChecked
            if (kontrol){
                val secilenButon = findViewById<Button>(checkedId)
                val butonYazi = secilenButon.text.toString()
                Log.e("Sonuc", butonYazi)
            }

        }

        val ulkeler = ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("Almanya")
        ulkeler.add("Japonya")
        ulkeler.add("İtalya")
        ulkeler.add("Çin")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, ulkeler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        binding.buttonGoster.setOnClickListener {
            if(kontrol){
                val secilenButon = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val butonYazi = secilenButon.text.toString()
                Log.e("Sonuc (Göster)", butonYazi)
            }

            val secilenUlke = binding.autoCompleteTextView.text.toString()
            Log.e("Sonuc (Göster)", secilenUlke)

        }

        binding.buttonAlert.setOnClickListener {
            MaterialAlertDialogBuilder(this@MainActivity)
                .setTitle("Başlık")
                .setMessage("Mesaj")
                .setPositiveButton("Tamam") {dialog, which ->
                    Toast.makeText(this, "Tamam seçildi", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("İptal") {dialog, which ->
                    Toast.makeText(this, "İptal seçildi", Toast.LENGTH_SHORT).show()

                }
                .show()
        }

    }
}
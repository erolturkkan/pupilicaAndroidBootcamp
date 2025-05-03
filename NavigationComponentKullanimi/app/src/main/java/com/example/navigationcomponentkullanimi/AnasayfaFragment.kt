package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.buttonDetay.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.detayGecis(mesaj = "Selam Erol", sayi = 77)
            Navigation.findNavController(it).navigate(gecis)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Fragment oluşturulduğunda çalışan kod bloğu
        Log.e("Yaşam Döngüsü", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        // Fragment tekrar görünür olduğunda çalışan kod bloğu
        Log.e("Yaşam Döngüsü", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Fragment görünmez olduğunda çalışan kod bloğu
        Log.e("Yaşam Döngüsü", "onPause")
    }

}
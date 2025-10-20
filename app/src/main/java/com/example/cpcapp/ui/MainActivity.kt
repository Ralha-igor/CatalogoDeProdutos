package com.example.cpcapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cpcapp.R
import com.example.cpcapp.adapter.PecaAdapter
import com.example.cpcapp.databinding.ActivityMainBinding
import com.example.cpcapp.model.Peca

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var pecaAdapter: PecaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lista de peças de computador
        val listaPecas = listOf(
            Peca(1, "Placa-Mãe B550M", R.string.categoria_placa_mae, 899.99, R.drawable.placa_mae),
            Peca(2, "Ryzen 5 5600X", R.string.categoria_processador, 1200.00, R.drawable.processador),
            Peca(3, "RTX 4060 8GB", R.string.categoria_placa_video, 2199.99, R.drawable.placa_video),
            Peca(4, "Memória RAM 16GB DDR4", R.string.categoria_memoria_ram, 299.99, R.drawable.memoria_ram),
            Peca(5, "SSD NVMe 1TB", R.string.categoria_armazenamento, 399.99, R.drawable.ssd),
            Peca(6, "Fonte 650W 80 Plus", R.string.categoria_fonte, 450.00, R.drawable.fonte)
        )

        // Configurar o adapter
        pecaAdapter = PecaAdapter(this, listaPecas)
        binding.listViewPecas.adapter = pecaAdapter
    }
}
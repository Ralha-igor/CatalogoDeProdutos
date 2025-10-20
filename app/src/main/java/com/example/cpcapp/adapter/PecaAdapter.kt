package com.example.cpcapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.cpcapp.databinding.ItemPecaBinding
import com.example.cpcapp.model.Peca

class PecaAdapter(
    private val context: Context,
    private val pecas: List<Peca>
) : ArrayAdapter<Peca>(context, 0, pecas) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = ItemPecaBinding.inflate(
            LayoutInflater.from(context), parent, false
        )

        val peca = pecas[position]
        binding.imageViewPeca.setImageResource(peca.imagemId)
        binding.textViewNome.text = peca.nome
        binding.textViewCategoria.text = context.getString(peca.categoriaId)
        binding.textViewPreco.text = "R$ %.2f".format(peca.preco)

        return binding.root
    }
}
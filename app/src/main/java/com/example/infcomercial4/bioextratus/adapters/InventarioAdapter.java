package com.example.infcomercial4.bioextratus.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.infcomercial4.bioextratus.R;

import com.example.infcomercial4.bioextratus.model.InventarioModel;

import java.util.List;

public class InventarioAdapter extends CustomAdapter<InventarioModel, InventarioAdapter.InventarioViewHolder> {

    public InventarioAdapter(Context ctx, List<InventarioModel> list) {
        super(ctx, list);
    }

    @Override
    public int getLayout() {
        return R.layout.inventario_view_model;
    }

    @Override
    public InventarioViewHolder createHolder(InventarioModel model, int position, View convertView, ViewGroup parent) {
        InventarioViewHolder holder = new InventarioViewHolder();
        holder.imgCode = (ImageView)convertView.findViewById(R.id.imgCode);
        holder.lblCode = (TextView)convertView.findViewById(R.id.lblCode);
        holder.lblDescricao = (TextView)convertView.findViewById(R.id.lblDescricao);
        holder.lblQuantidade = (TextView)convertView.findViewById(R.id.lblQuantidade);
        holder.lblArmazem = (TextView)convertView.findViewById(R.id.lblArmazem);
        holder.lblLote = (TextView)convertView.findViewById(R.id.lblLote);
        return holder;
    }

    @Override
    public void updateHolder(InventarioViewHolder holder, InventarioModel model, int position, View convertView, ViewGroup parent){
        holder.lblCode.setText(model.BarCode);
        holder.lblDescricao.setText(model.descricao);
        holder.lblQuantidade.setText(model.quantidade);
        holder.lblArmazem.setText(model.armazem);
        holder.lblLote.setText(model.lote);
    }

    public static class InventarioViewHolder
    {
        ImageView imgCode;
        TextView lblCode;
        TextView lblDescricao;
        TextView lblQuantidade;
        TextView lblArmazem;
        TextView lblLote;
    }
}


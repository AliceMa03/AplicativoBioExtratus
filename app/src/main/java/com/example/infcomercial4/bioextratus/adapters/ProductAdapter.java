import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.infcomercial4.bioextratus.R;
import com.example.infcomercial4.bioextratus.adapters.CustomAdapter;
import com.example.infcomercial4.bioextratus.model.ProdutoModel;

import java.util.List;

public class ProductAdapter extends CustomAdapter<ProdutoModel, ProductAdapter.ProductViewHolder> {

    public ProductAdapter(Context ctx, List<ProdutoModel> list) {
        super(ctx, list);
    }

    @Override
    public int getLayout() {
        return R.layout.product_view_model;
    }




    @Override
    public ProductViewHolder createHolder(ProdutoModel model, int position, View convertView, ViewGroup parent) {
        ProductViewHolder holder = new ProductViewHolder();
        holder.imgCode = (ImageView)convertView.findViewById(R.id.imgCode);
        holder.lblCode = (TextView)convertView.findViewById(R.id.lblCode);
        holder.lblCodigo = (TextView)convertView.findViewById(R.id.lblCodigo);
        holder.lblFamLin = (TextView)convertView.findViewById(R.id.lblFamLin);
        holder.lblArmazem = (TextView)convertView.findViewById(R.id.lblArmazem);
        holder.lblVolumetria = (TextView)convertView.findViewById(R.id.lblVolumetria);
        holder.lblDescricao= (TextView)convertView.findViewById(R.id.lblDescricao);
        holder.lblfatorConv = (TextView)convertView.findViewById(R.id.lblFatorConv);
        holder.lblLinhaProd= (TextView)convertView.findViewById(R.id.lblLinhaProd);
        holder.lblGrupo=(TextView)convertView.findViewById(R.id.lblGrupo);
        holder.lblLinhaProd=(TextView)convertView.findViewById(R.id.lblLinhaProd);
        holder.lblCodigo=(TextView)convertView.findViewById(R.id.lblCodigo);
        holder.lblCodBarras=(TextView)convertView.findViewById(R.id.lblCodBarras);
        holder.lblCodBarras1=(TextView)convertView.findViewById(R.id.lblCodBarras1);
        holder.lblCodBarras2=(TextView)convertView.findViewById(R.id.lblCodBarras2);
        holder.lblTipo=(TextView)convertView.findViewById(R.id.lblTipo);
        holder.lblUnidade=(TextView)convertView.findViewById(R.id.lblUnidade);
        holder.lblTEPadrao=(TextView)convertView.findViewById(R.id.lblTEPadrao);
        holder.lblTSPadrao=(TextView)convertView.findViewById(R.id.lblTSPadrao);
        holder.lblTipoConv=(TextView)convertView.findViewById(R.id.lblTipoConv);
        holder.lblOrdExp=(TextView)convertView.findViewById(R.id.lblOrdExp);
        holder.lblSegUnMed=(TextView)convertView.findViewById(R.id.lblSegUnMed);

        return holder;
    }

    @Override
    public void updateHolder(ProductViewHolder holder, ProdutoModel model, int position, View convertView, ViewGroup parent){
        //holder.lblCode.setText(model.);
        holder.lblCodigo.setText(model.codigo);
        holder.lblLinhaProd.setText(model.linhaProd);
        holder.lblfatorConv.setText(model.fatorConv);
        holder.lblDescricao.setText(model.descricao);
        holder.lblVolumetria.setText(model.volumetria);
        holder.lblArmazem.setText(model.armazem);
        holder.lblFamLin.setText(model.famLin);
        holder.lblGrupo.setText(model.grupo);
        holder.lblSegUnMed.setText(model.segUnMed);
        holder.lblTipo.setText(model.tipo);
        holder.lblUnidade.setText(model.unidade);
        holder.lblSegUnMed.setText(model.segUnMed);
        holder.lblOrdExp.setText(model.ordExp);
        holder.lblTSPadrao.setText(model.tsPadrao);
        holder.lblTEPadrao.setText(model.tePadrao);
        holder.lblOrdExp.setText(model.ordExp);
        holder.lblCodBarras1.setText(model.codBarras1);
        holder.lblCodBarras2.setText(model.codBarras2);
       // holder.lblCodBarras.setText(model.CodBarras);
    }

    public static class ProductViewHolder
    {
        ImageView imgCode;
        TextView lblCode;
        TextView lblCodigo;
       TextView lblFamLin;
       TextView lblGrupo;
       TextView lblLinhaProd;
       TextView lblVolumetria;
       TextView lblfatorConv;
       TextView lblDescricao;
       TextView lblTipo;
       TextView lblUnidade;
       TextView lblArmazem;
       TextView lblTEPadrao;
       TextView lblTSPadrao;
       TextView lblTipoConv;
       TextView lblOrdExp;
       TextView lblCodBarras1;
       TextView lblCodBarras2;
       TextView lblSegUnMed;
       TextView lblCodBarras;

    }
}


package com.example.anony.agenda.Diciplinas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.anony.agenda.R;

import java.util.List;

/**
 * Created by anony on 13/10/16.
 */
public class DisciplinaAdapter extends BaseAdapter {
    private Context context;
    private List<Disciplinas> list;

    public DisciplinaAdapter(Context context , List<Disciplinas> list) {
        this.context = context;
        this.list = list;
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return 0;
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int auxPosition = position;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         final LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.activity_main_activity__disciplinas , null);

        TextView tv = (TextView) layout.findViewById(R.id.nav_Disciplias);
        tv.setText(list.get(position).getDisc_nome());
        return layout;
    }
/*
    final int auxPosition = position;

    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    final LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.usuario, null);

    TextView tv = (TextView) layout.findViewById(R.id.nome);
    tv.setText(list.get(position).getNome());


    Button editarBt = (Button) layout.findViewById(R.id.editar);
    editarBt.setOnClickListener(new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent = new Intent(context, NewUserActivity.class);
            intent.putExtra("nome", list.get(auxPosition).getNome());
            intent.putExtra("email", list.get(auxPosition).getEmail());
            intent.putExtra("id", list.get(auxPosition).getId());
            context.startActivity(intent);
        }
    });

    Button deletarBt = (Button) layout.findViewById(R.id.deletar);
    deletarBt.setOnClickListener(new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            BD bd = new BD(context);
            bd.deletar(list.get(auxPosition));

            layout.setVisibility(View.GONE);
        }
    });

    return layout;
}*/
}

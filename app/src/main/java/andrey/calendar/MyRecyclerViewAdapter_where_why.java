package andrey.calendar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Andrey on 10.04.2016.
 *
 */

public class MyRecyclerViewAdapter_where_why extends RecyclerView.Adapter<MyRecyclerViewAdapter_where_why.ViewHolder> {
    public static final String INTENT_WHERE_ACTION="INTENT_WHERE_ACTION";
    public static final String FROMWHERE="FROMWHERE";
    public static final String FROMWHY="FROMWHY";
    public String Intent_Action;
    public static final String INTENT_WHY_ACTION="INTENT_WHY_ACTION";
    int images[];
    int imageswhere[]={R.drawable.berry,R.drawable.bulgariaflag,R.drawable.russiaflag,R.drawable.frenchflag,R.drawable.frenchflag,R.drawable.polina,R.drawable.kotove};
    int imageswhy[]={};

    Context context;

    public MyRecyclerViewAdapter_where_why(Context context,String WhereOrWhy) {
        this.context = context;
        switch(WhereOrWhy){
            case FROMWHERE:
                images=imageswhere;
                Intent_Action=INTENT_WHERE_ACTION;
            case FROMWHY:
                images=imageswhy;
                Intent_Action=INTENT_WHY_ACTION;

        }
    }


    @Override
    public MyRecyclerViewAdapter_where_why.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_details_where_why,
                parent,
                false
        );
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Search_result.class);
                intent.setAction(Intent_Action);
                intent.putExtra(Intent_Action, v.getId());
                context.startActivity(intent);
                Log.d("happy", v.getId() + "");
            }
        });



        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int pic = images[position];

        Picasso.with(holder.image.getContext()).load(pic).fit().into(holder.image);

    }



    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.whenwhyimage);

        }
    }



}

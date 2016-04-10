package andrey.calendar;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Andrey on 10.04.2016.
 */
public class ItemDecorator_where_why extends RecyclerView.ItemDecoration {
    private int top,right,left,bottom,between;
    //Устанавливаем правильные отступы

    public ItemDecorator_where_why(int top, int right, int left, int bottom,int between) {
        this.top=top;
        this.right=right;
        this.left=left;
        this.bottom=bottom;
        this.between=between;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
      /*  outRect.bottom=bottom;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildLayoutPosition(view) == 0||parent.getChildLayoutPosition(view)==1) {
            outRect.top = top;
        } else {
            outRect.top = 0;
        }
        //Добавляем отступ для четных справа, для нечетных слева(от стенки)+отступ between от правого между элементами
        if(parent.getChildLayoutPosition(view)%2==0){
           outRect.left=left;
        }
        else{
            outRect.right=right;
            outRect.left=between;
            */
        }
    }



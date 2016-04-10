package andrey.calendar;

import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemListBaseAdapter extends BaseAdapter {
	private static ArrayList<ItemDetails> itemDetailsrrayList;
	
	private Integer[] imgid = {
			R.drawable.germanskiyflag,
			R.drawable.russiaflag,
			R.drawable.frenchflag,
			R.drawable.thai_flag,
			R.drawable.westerial_ptic,
			R.drawable.russiaflag
			};
	
	private LayoutInflater l_Inflater;

	public ItemListBaseAdapter(Context context, ArrayList<ItemDetails> results) {
		itemDetailsrrayList = results;
		l_Inflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return itemDetailsrrayList.size();
	}

	public Object getItem(int position) {
		return itemDetailsrrayList.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = l_Inflater.inflate(R.layout.item_details_where_why_view, null);
			holder = new ViewHolder();
			holder.txt_item1Name = (TextView) convertView.findViewById(R.id.country_name1);
			holder.txt_item1Description = (TextView) convertView.findViewById(R.id.country_itemDescription1);
			holder.item1Image = (ImageView) convertView.findViewById(R.id.country_photo1);
			holder.txt_item2Name = (TextView) convertView.findViewById(R.id.country_name2);
			holder.txt_item2Description = (TextView) convertView.findViewById(R.id.country_itemDescription2);
			holder.item2Image = (ImageView) convertView.findViewById(R.id.country_photo2);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.txt_item1Name.setText(itemDetailsrrayList.get(position).get1Name());
		holder.txt_item1Description.setText(itemDetailsrrayList.get(position).getItem1Description());
		holder.item1Image.setImageResource(imgid[itemDetailsrrayList.get(position).getImage1Number() - 1]);
		holder.txt_item2Name.setText(itemDetailsrrayList.get(position).get2Name());
		holder.txt_item2Description.setText(itemDetailsrrayList.get(position).getItem2Description());
		holder.item2Image.setImageResource(imgid[itemDetailsrrayList.get(position).getImage2Number() -1 ]);
//		imageLoader.DisplayImage("http://192.168.1.28:8082/ANDROID/images/BEVE.jpeg", holder.itemImage);

		return convertView;
	}

	static class ViewHolder {
		TextView txt_item1Name;
		TextView txt_item1Description;
		ImageView item1Image;
		TextView txt_item2Name;
		TextView txt_item2Description;
		ImageView item2Image;
	}
}

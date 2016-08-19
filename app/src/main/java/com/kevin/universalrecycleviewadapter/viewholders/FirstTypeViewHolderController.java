package com.kevin.universalrecycleviewadapter.viewholders;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.kevin.recycleradapter.AbsRecyclerViewHolderController;
import com.kevin.universalrecycleviewadapter.R;

/**
 * Created by Administrator on 2016/8/17.
 */
public class FirstTypeViewHolderController extends AbsRecyclerViewHolderController
{

    public CardView cardlistItem;
    public TextView firstTypeItemName;

    @Override
    protected void initView(View rootView) {
        cardlistItem = (CardView) rootView.findViewById(R.id.cardlist_item);
        firstTypeItemName = (TextView) rootView.findViewById(R.id.first_type_item_name);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.first_type_list_item;
    }
}

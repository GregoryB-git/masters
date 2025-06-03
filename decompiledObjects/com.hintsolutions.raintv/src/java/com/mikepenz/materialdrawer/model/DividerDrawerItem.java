/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  androidx.annotation.LayoutRes
 *  androidx.core.view.ViewCompat
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class DividerDrawerItem
extends AbstractDrawerItem<DividerDrawerItem, ViewHolder> {
    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.view.setClickable(false);
        viewHolder.view.setEnabled(false);
        viewHolder.view.setMinimumHeight(1);
        ViewCompat.setImportantForAccessibility((View)viewHolder.view, (int)2);
        viewHolder.divider.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)list, R.attr.material_drawer_divider, R.color.material_drawer_divider));
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_divider;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_divider;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view, null){
            private View divider;
            private View view;
            {
                this.view = view;
                this.divider = view.findViewById(R.id.material_drawer_divider);
            }
            {
                this(view);
            }
        };
    }
}


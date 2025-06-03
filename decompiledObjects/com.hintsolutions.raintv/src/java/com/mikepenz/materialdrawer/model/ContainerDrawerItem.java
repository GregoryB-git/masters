/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout$LayoutParams
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class ContainerDrawerItem
extends AbstractDrawerItem<ContainerDrawerItem, ViewHolder> {
    private boolean mDivider = true;
    private DimenHolder mHeight;
    private View mView;
    private Position mViewPosition = Position.TOP;

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        int n4;
        RecyclerView.LayoutParams layoutParams;
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.view.setEnabled(false);
        if (this.mView.getParent() != null) {
            ((ViewGroup)this.mView.getParent()).removeView(this.mView);
        }
        int n42 = -2;
        if (this.mHeight != null) {
            layoutParams = (RecyclerView.LayoutParams)viewHolder.view.getLayoutParams();
            layoutParams.height = n42 = this.mHeight.asPixel((Context)list);
            viewHolder.view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        ((ViewGroup)viewHolder.view).removeAllViews();
        int n5 = this.mDivider;
        layoutParams = new View((Context)list);
        layoutParams.setMinimumHeight(n5);
        layoutParams.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes((Context)list, R.attr.material_drawer_divider, R.color.material_drawer_divider));
        float f = n5;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int)UIUtils.convertDpToPixel(f, (Context)list));
        int n6 = n42;
        if (this.mHeight != null) {
            n4 = n42 - (int)UIUtils.convertDpToPixel(f, (Context)list);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, n4);
        Position position = this.mViewPosition;
        if (position == Position.TOP) {
            ((ViewGroup)viewHolder.view).addView(this.mView, (ViewGroup.LayoutParams)layoutParams3);
            layoutParams2.bottomMargin = list.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
            ((ViewGroup)viewHolder.view).addView((View)layoutParams, (ViewGroup.LayoutParams)layoutParams2);
        } else if (position == Position.BOTTOM) {
            layoutParams2.topMargin = list.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
            ((ViewGroup)viewHolder.view).addView((View)layoutParams, (ViewGroup.LayoutParams)layoutParams2);
            ((ViewGroup)viewHolder.view).addView(this.mView, (ViewGroup.LayoutParams)layoutParams3);
        } else {
            ((ViewGroup)viewHolder.view).addView(this.mView, (ViewGroup.LayoutParams)layoutParams3);
        }
        this.onPostBindView(this, viewHolder.itemView);
    }

    public DimenHolder getHeight() {
        return this.mHeight;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_container;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_container;
    }

    public View getView() {
        return this.mView;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view, null){
            private View view;
            {
                this.view = view;
            }
            {
                this(view);
            }
        };
    }

    public Position getViewPosition() {
        return this.mViewPosition;
    }

    public ContainerDrawerItem withDivider(boolean bl) {
        this.mDivider = bl;
        return this;
    }

    public ContainerDrawerItem withHeight(DimenHolder dimenHolder) {
        this.mHeight = dimenHolder;
        return this;
    }

    public ContainerDrawerItem withView(View view) {
        this.mView = view;
        return this;
    }

    public ContainerDrawerItem withViewPosition(Position position) {
        this.mViewPosition = position;
        return this;
    }
}


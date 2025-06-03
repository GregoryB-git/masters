/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.DimenRes
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.BaseDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialize.holder.ImageHolder;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class MiniDrawerItem
extends BaseDrawerItem<MiniDrawerItem, ViewHolder> {
    private StringHolder mBadge;
    private BadgeStyle mBadgeStyle = new BadgeStyle();
    public DimenHolder mCustomHeight;
    private boolean mEnableSelectedBackground = false;

    public MiniDrawerItem() {
    }

    public MiniDrawerItem(PrimaryDrawerItem primaryDrawerItem) {
        this.mIdentifier = primaryDrawerItem.mIdentifier;
        this.mTag = primaryDrawerItem.mTag;
        this.mBadge = primaryDrawerItem.mBadge;
        this.mBadgeStyle = primaryDrawerItem.mBadgeStyle;
        this.mEnabled = primaryDrawerItem.mEnabled;
        this.mSelectable = primaryDrawerItem.mSelectable;
        this.mSelected = primaryDrawerItem.mSelected;
        this.icon = primaryDrawerItem.icon;
        this.selectedIcon = primaryDrawerItem.selectedIcon;
        this.iconTinted = primaryDrawerItem.iconTinted;
        this.selectedColor = primaryDrawerItem.selectedColor;
        this.iconColor = primaryDrawerItem.iconColor;
        this.selectedIconColor = primaryDrawerItem.selectedIconColor;
        this.disabledIconColor = primaryDrawerItem.disabledIconColor;
    }

    public MiniDrawerItem(SecondaryDrawerItem secondaryDrawerItem) {
        this.mIdentifier = secondaryDrawerItem.mIdentifier;
        this.mTag = secondaryDrawerItem.mTag;
        this.mBadge = secondaryDrawerItem.mBadge;
        this.mBadgeStyle = secondaryDrawerItem.mBadgeStyle;
        this.mEnabled = secondaryDrawerItem.mEnabled;
        this.mSelectable = secondaryDrawerItem.mSelectable;
        this.mSelected = secondaryDrawerItem.mSelected;
        this.icon = secondaryDrawerItem.icon;
        this.selectedIcon = secondaryDrawerItem.selectedIcon;
        this.iconTinted = secondaryDrawerItem.iconTinted;
        this.selectedColor = secondaryDrawerItem.selectedColor;
        this.iconColor = secondaryDrawerItem.iconColor;
        this.selectedIconColor = secondaryDrawerItem.selectedIconColor;
        this.disabledIconColor = secondaryDrawerItem.disabledIconColor;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        int n4;
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        if (this.mCustomHeight != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)viewHolder.itemView.getLayoutParams();
            layoutParams.height = this.mCustomHeight.asPixel((Context)list);
            viewHolder.itemView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.itemView.setEnabled(this.isEnabled());
        viewHolder.itemView.setSelected(this.isSelected());
        viewHolder.itemView.setTag((Object)this);
        int n5 = this.getIconColor((Context)list);
        int n6 = this.getSelectedIconColor((Context)list);
        if (this.mEnableSelectedBackground) {
            n4 = this.getSelectedColor((Context)list);
            UIUtils.setBackground(viewHolder.view, (Drawable)UIUtils.getSelectableBackground((Context)list, n4, this.isSelectedBackgroundAnimated()));
        }
        if (com.mikepenz.materialize.holder.StringHolder.applyToOrHide(this.mBadge, viewHolder.badge)) {
            this.mBadgeStyle.style(viewHolder.badge);
        }
        ImageHolder.applyMultiIconTo(com.mikepenz.materialdrawer.holder.ImageHolder.decideIcon(this.getIcon(), (Context)list, n5, this.isIconTinted(), 1), n5, com.mikepenz.materialdrawer.holder.ImageHolder.decideIcon(this.getSelectedIcon(), (Context)list, n6, this.isIconTinted(), 1), n6, this.isIconTinted(), viewHolder.icon);
        n4 = list.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
        n6 = list.getResources().getDimensionPixelSize(R.dimen.material_mini_drawer_item_padding);
        viewHolder.itemView.setPadding(n4, n6, n4, n6);
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_mini;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_mini;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view){
            private TextView badge;
            private ImageView icon;
            private View view;
            {
                this.view = view;
                this.icon = (ImageView)view.findViewById(R.id.material_drawer_icon);
                this.badge = (TextView)view.findViewById(R.id.material_drawer_badge);
            }
        };
    }

    public MiniDrawerItem withCustomHeight(DimenHolder dimenHolder) {
        this.mCustomHeight = dimenHolder;
        return this;
    }

    public MiniDrawerItem withCustomHeightDp(int n4) {
        this.mCustomHeight = DimenHolder.fromDp(n4);
        return this;
    }

    public MiniDrawerItem withCustomHeightPx(int n4) {
        this.mCustomHeight = DimenHolder.fromPixel(n4);
        return this;
    }

    public MiniDrawerItem withCustomHeightRes(@DimenRes int n4) {
        this.mCustomHeight = DimenHolder.fromResource(n4);
        return this;
    }

    public MiniDrawerItem withEnableSelectedBackground(boolean bl) {
        this.mEnableSelectedBackground = bl;
        return this;
    }
}


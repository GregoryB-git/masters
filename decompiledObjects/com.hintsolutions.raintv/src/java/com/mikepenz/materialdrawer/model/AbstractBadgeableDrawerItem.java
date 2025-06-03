/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.StringRes
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.BaseDescribeableDrawerItem;
import com.mikepenz.materialdrawer.model.BaseViewHolder;
import com.mikepenz.materialdrawer.model.interfaces.ColorfulBadgeable;
import java.util.List;

public abstract class AbstractBadgeableDrawerItem<Item extends AbstractBadgeableDrawerItem>
extends BaseDescribeableDrawerItem<Item, ViewHolder>
implements ColorfulBadgeable<Item> {
    public StringHolder mBadge;
    public BadgeStyle mBadgeStyle = new BadgeStyle();

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        this.bindViewHelper(viewHolder);
        if (com.mikepenz.materialize.holder.StringHolder.applyToOrHide(this.mBadge, viewHolder.badge)) {
            this.mBadgeStyle.style(viewHolder.badge, this.getTextColorStateList(this.getColor((Context)list), this.getSelectedTextColor((Context)list)));
            viewHolder.badgeContainer.setVisibility(0);
        } else {
            viewHolder.badgeContainer.setVisibility(8);
        }
        if (this.getTypeface() != null) {
            viewHolder.badge.setTypeface(this.getTypeface());
        }
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    public StringHolder getBadge() {
        return this.mBadge;
    }

    @Override
    public BadgeStyle getBadgeStyle() {
        return this.mBadgeStyle;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_primary;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_primary;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public Item withBadge(@StringRes int n4) {
        this.mBadge = new StringHolder(n4);
        return (Item)this;
    }

    @Override
    public Item withBadge(StringHolder stringHolder) {
        this.mBadge = stringHolder;
        return (Item)this;
    }

    @Override
    public Item withBadge(String string) {
        this.mBadge = new StringHolder((CharSequence)string);
        return (Item)this;
    }

    @Override
    public Item withBadgeStyle(BadgeStyle badgeStyle) {
        this.mBadgeStyle = badgeStyle;
        return (Item)this;
    }

    public static class ViewHolder
    extends BaseViewHolder {
        private TextView badge;
        private View badgeContainer;

        public ViewHolder(View view) {
            super(view);
            this.badgeContainer = view.findViewById(R.id.material_drawer_badge_container);
            this.badge = (TextView)view.findViewById(R.id.material_drawer_badge);
        }
    }
}


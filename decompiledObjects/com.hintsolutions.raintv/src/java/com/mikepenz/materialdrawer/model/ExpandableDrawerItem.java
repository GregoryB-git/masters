/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.LayoutRes
 *  androidx.core.view.ViewCompat
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.LayoutRes;
import androidx.core.view.ViewCompat;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.icons.MaterialDrawerFont;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.BaseDescribeableDrawerItem;
import com.mikepenz.materialdrawer.model.BaseViewHolder;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import java.util.List;

public class ExpandableDrawerItem
extends BaseDescribeableDrawerItem<ExpandableDrawerItem, ViewHolder> {
    public ColorHolder arrowColor;
    public int arrowRotationAngleEnd = 180;
    public int arrowRotationAngleStart = 0;
    private Drawer.OnDrawerItemClickListener mOnArrowDrawerItemClickListener = new Drawer.OnDrawerItemClickListener(this){
        public final ExpandableDrawerItem this$0;
        {
            this.this$0 = expandableDrawerItem;
        }

        public boolean onItemClick(View view, int n4, IDrawerItem iDrawerItem) {
            AbstractDrawerItem abstractDrawerItem;
            if (iDrawerItem instanceof AbstractDrawerItem && iDrawerItem.isEnabled() && (abstractDrawerItem = (AbstractDrawerItem)iDrawerItem).getSubItems() != null) {
                if (abstractDrawerItem.isExpanded()) {
                    ViewCompat.animate((View)view.findViewById(R.id.material_drawer_arrow)).rotation((float)this.this$0.arrowRotationAngleEnd).start();
                } else {
                    ViewCompat.animate((View)view.findViewById(R.id.material_drawer_arrow)).rotation((float)this.this$0.arrowRotationAngleStart).start();
                }
            }
            boolean bl = ExpandableDrawerItem.access$000(this.this$0) != null && ExpandableDrawerItem.access$000(this.this$0).onItemClick(view, n4, iDrawerItem);
            return bl;
        }
    };
    private Drawer.OnDrawerItemClickListener mOnDrawerItemClickListener;

    public static /* synthetic */ Drawer.OnDrawerItemClickListener access$000(ExpandableDrawerItem expandableDrawerItem) {
        return expandableDrawerItem.mOnDrawerItemClickListener;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        this.bindViewHelper(viewHolder);
        if (viewHolder.arrow.getDrawable() instanceof IconicsDrawable) {
            IconicsDrawable iconicsDrawable = (IconicsDrawable)viewHolder.arrow.getDrawable();
            ColorHolder colorHolder = this.arrowColor;
            int n4 = colorHolder != null ? colorHolder.color((Context)list) : this.getIconColor((Context)list);
            iconicsDrawable.color(n4);
        }
        viewHolder.arrow.clearAnimation();
        if (!this.isExpanded()) {
            viewHolder.arrow.setRotation((float)this.arrowRotationAngleStart);
        } else {
            viewHolder.arrow.setRotation((float)this.arrowRotationAngleEnd);
        }
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_expandable;
    }

    @Override
    public Drawer.OnDrawerItemClickListener getOnDrawerItemClickListener() {
        return this.mOnArrowDrawerItemClickListener;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_expandable;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    public ExpandableDrawerItem withArrowColor(@ColorInt int n4) {
        this.arrowColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ExpandableDrawerItem withArrowColorRes(@ColorRes int n4) {
        this.arrowColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ExpandableDrawerItem withArrowRotationAngleEnd(int n4) {
        this.arrowRotationAngleEnd = n4;
        return this;
    }

    public ExpandableDrawerItem withArrowRotationAngleStart(int n4) {
        this.arrowRotationAngleStart = n4;
        return this;
    }

    @Override
    public ExpandableDrawerItem withOnDrawerItemClickListener(Drawer.OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mOnDrawerItemClickListener = onDrawerItemClickListener;
        return this;
    }

    public static class ViewHolder
    extends BaseViewHolder {
        public ImageView arrow;

        public ViewHolder(View view) {
            super(view);
            ImageView imageView;
            this.arrow = imageView = (ImageView)view.findViewById(R.id.material_drawer_arrow);
            imageView.setImageDrawable((Drawable)new IconicsDrawable(view.getContext(), (IIcon)MaterialDrawerFont.Icon.mdf_expand_more).sizeDp(16).paddingDp(2).color(-16777216));
        }
    }
}


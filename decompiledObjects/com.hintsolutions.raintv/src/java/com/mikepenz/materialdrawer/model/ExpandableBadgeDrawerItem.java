/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.StringRes
 *  androidx.core.view.ViewCompat
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.icons.MaterialDrawerFont;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.BaseDescribeableDrawerItem;
import com.mikepenz.materialdrawer.model.BaseViewHolder;
import com.mikepenz.materialdrawer.model.interfaces.ColorfulBadgeable;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import java.util.List;

public class ExpandableBadgeDrawerItem
extends BaseDescribeableDrawerItem<ExpandableBadgeDrawerItem, ViewHolder>
implements ColorfulBadgeable<ExpandableBadgeDrawerItem> {
    public ColorHolder arrowColor;
    public int arrowRotationAngleEnd = 180;
    public int arrowRotationAngleStart = 0;
    public StringHolder mBadge;
    public BadgeStyle mBadgeStyle = new BadgeStyle();
    private Drawer.OnDrawerItemClickListener mOnArrowDrawerItemClickListener = new Drawer.OnDrawerItemClickListener(this){
        public final ExpandableBadgeDrawerItem this$0;
        {
            this.this$0 = expandableBadgeDrawerItem;
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
            boolean bl = ExpandableBadgeDrawerItem.access$000(this.this$0) != null && ExpandableBadgeDrawerItem.access$000(this.this$0).onItemClick(view, n4, iDrawerItem);
            return bl;
        }
    };
    private Drawer.OnDrawerItemClickListener mOnDrawerItemClickListener;

    public static /* synthetic */ Drawer.OnDrawerItemClickListener access$000(ExpandableBadgeDrawerItem expandableBadgeDrawerItem) {
        return expandableBadgeDrawerItem.mOnDrawerItemClickListener;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        this.bindViewHelper(viewHolder);
        com.mikepenz.materialize.holder.StringHolder.applyToOrHide(this.mBadge, viewHolder.badge);
        this.mBadgeStyle.style(viewHolder.badge, this.getTextColorStateList(this.getColor((Context)list), this.getSelectedTextColor((Context)list)));
        viewHolder.badgeContainer.setVisibility(0);
        if (this.getTypeface() != null) {
            viewHolder.badge.setTypeface(this.getTypeface());
        }
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
        return R.layout.material_drawer_item_expandable_badge;
    }

    @Override
    public Drawer.OnDrawerItemClickListener getOnDrawerItemClickListener() {
        return this.mOnArrowDrawerItemClickListener;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_expandable_badge;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public ExpandableBadgeDrawerItem withBadge(@StringRes int n4) {
        this.mBadge = new StringHolder(n4);
        return this;
    }

    @Override
    public ExpandableBadgeDrawerItem withBadge(StringHolder stringHolder) {
        this.mBadge = stringHolder;
        return this;
    }

    @Override
    public ExpandableBadgeDrawerItem withBadge(String string) {
        this.mBadge = new StringHolder((CharSequence)string);
        return this;
    }

    @Override
    public ExpandableBadgeDrawerItem withBadgeStyle(BadgeStyle badgeStyle) {
        this.mBadgeStyle = badgeStyle;
        return this;
    }

    @Override
    public ExpandableBadgeDrawerItem withOnDrawerItemClickListener(Drawer.OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mOnDrawerItemClickListener = onDrawerItemClickListener;
        return this;
    }

    public static class ViewHolder
    extends BaseViewHolder {
        public ImageView arrow;
        public TextView badge;
        public View badgeContainer;

        public ViewHolder(View view) {
            super(view);
            ImageView imageView;
            this.badgeContainer = view.findViewById(R.id.material_drawer_badge_container);
            this.badge = (TextView)view.findViewById(R.id.material_drawer_badge);
            this.arrow = imageView = (ImageView)view.findViewById(R.id.material_drawer_arrow);
            imageView.setImageDrawable((Drawable)new IconicsDrawable(view.getContext(), (IIcon)MaterialDrawerFont.Icon.mdf_expand_more).sizeDp(16).paddingDp(2).color(-16777216));
        }
    }
}


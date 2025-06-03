/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  androidx.annotation.DimenRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialize.holder.ImageHolder;
import java.util.List;

public class MiniProfileDrawerItem
extends AbstractDrawerItem<MiniProfileDrawerItem, ViewHolder>
implements IProfile<MiniProfileDrawerItem> {
    public DimenHolder customHeight;
    public com.mikepenz.materialdrawer.holder.ImageHolder icon;

    public MiniProfileDrawerItem() {
        this.withSelectable(false);
    }

    public MiniProfileDrawerItem(ProfileDrawerItem profileDrawerItem) {
        this.icon = profileDrawerItem.icon;
        this.mEnabled = profileDrawerItem.mEnabled;
        this.withSelectable(false);
    }

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        if (this.customHeight != null) {
            list = (RecyclerView.LayoutParams)viewHolder.itemView.getLayoutParams();
            list.height = this.customHeight.asPixel(viewHolder.itemView.getContext());
            viewHolder.itemView.setLayoutParams((ViewGroup.LayoutParams)list);
        }
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.itemView.setEnabled(this.isEnabled());
        ImageHolder.applyToOrSetInvisible(this.getIcon(), viewHolder.icon);
        this.onPostBindView(this, viewHolder.itemView);
    }

    @Override
    public StringHolder getEmail() {
        return null;
    }

    @Override
    public com.mikepenz.materialdrawer.holder.ImageHolder getIcon() {
        return this.icon;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_mini_profile;
    }

    @Override
    public StringHolder getName() {
        return null;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_mini_profile;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view){
            private ImageView icon;
            {
                this.icon = (ImageView)view.findViewById(R.id.material_drawer_icon);
            }
        };
    }

    public MiniProfileDrawerItem withCustomHeight(DimenHolder dimenHolder) {
        this.customHeight = dimenHolder;
        return this;
    }

    public MiniProfileDrawerItem withCustomHeightDp(int n4) {
        this.customHeight = DimenHolder.fromDp(n4);
        return this;
    }

    public MiniProfileDrawerItem withCustomHeightPx(int n4) {
        this.customHeight = DimenHolder.fromPixel(n4);
        return this;
    }

    public MiniProfileDrawerItem withCustomHeightRes(@DimenRes int n4) {
        this.customHeight = DimenHolder.fromResource(n4);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withEmail(String string) {
        return null;
    }

    @Override
    public MiniProfileDrawerItem withIcon(@DrawableRes int n4) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(n4);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withIcon(Bitmap bitmap) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(bitmap);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withIcon(Drawable drawable) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(drawable);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withIcon(Uri uri) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(uri);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withIcon(IIcon iIcon) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(iIcon);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withIcon(String string) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(string);
        return this;
    }

    @Override
    public MiniProfileDrawerItem withName(String string) {
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.Pair
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.StringRes
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.model.interfaces.Typefaceable;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.holder.ImageHolder;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class ProfileDrawerItem
extends AbstractDrawerItem<ProfileDrawerItem, ViewHolder>
implements IProfile<ProfileDrawerItem>,
Typefaceable<ProfileDrawerItem> {
    public Pair<Integer, ColorStateList> colorStateList;
    public ColorHolder disabledTextColor;
    public StringHolder email;
    public com.mikepenz.materialdrawer.holder.ImageHolder icon;
    public StringHolder name;
    public boolean nameShown = false;
    public ColorHolder selectedColor;
    public ColorHolder selectedTextColor;
    public ColorHolder textColor;
    public Typeface typeface = null;

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.itemView.setEnabled(this.isEnabled());
        viewHolder.itemView.setSelected(this.isSelected());
        int n4 = com.mikepenz.materialize.holder.ColorHolder.color(this.getSelectedColor(), (Context)list, R.attr.material_drawer_selected, R.color.material_drawer_selected);
        int n5 = this.getColor((Context)list);
        int n6 = this.getSelectedTextColor((Context)list);
        UIUtils.setBackground(viewHolder.view, (Drawable)UIUtils.getSelectableBackground((Context)list, n4, this.isSelectedBackgroundAnimated()));
        if (this.nameShown) {
            viewHolder.name.setVisibility(0);
            com.mikepenz.materialize.holder.StringHolder.applyTo(this.getName(), viewHolder.name);
        } else {
            viewHolder.name.setVisibility(8);
        }
        if (!this.nameShown && this.getEmail() == null && this.getName() != null) {
            com.mikepenz.materialize.holder.StringHolder.applyTo(this.getName(), viewHolder.email);
        } else {
            com.mikepenz.materialize.holder.StringHolder.applyTo(this.getEmail(), viewHolder.email);
        }
        if (this.getTypeface() != null) {
            viewHolder.name.setTypeface(this.getTypeface());
            viewHolder.email.setTypeface(this.getTypeface());
        }
        if (this.nameShown) {
            viewHolder.name.setTextColor(this.getTextColorStateList(n5, n6));
        }
        viewHolder.email.setTextColor(this.getTextColorStateList(n5, n6));
        DrawerImageLoader.getInstance().cancelImage(viewHolder.profileIcon);
        ImageHolder.applyToOrSetInvisible(this.getIcon(), viewHolder.profileIcon, DrawerImageLoader.Tags.PROFILE_DRAWER_ITEM.name());
        DrawerUIUtils.setDrawerVerticalPadding(viewHolder.view);
        this.onPostBindView(this, viewHolder.itemView);
    }

    public int getColor(Context context) {
        int n4 = this.isEnabled() ? com.mikepenz.materialize.holder.ColorHolder.color(this.getTextColor(), context, R.attr.material_drawer_primary_text, R.color.material_drawer_primary_text) : com.mikepenz.materialize.holder.ColorHolder.color(this.getDisabledTextColor(), context, R.attr.material_drawer_hint_text, R.color.material_drawer_hint_text);
        return n4;
    }

    public ColorHolder getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @Override
    public StringHolder getEmail() {
        return this.email;
    }

    @Override
    public com.mikepenz.materialdrawer.holder.ImageHolder getIcon() {
        return this.icon;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_profile;
    }

    @Override
    public StringHolder getName() {
        return this.name;
    }

    public ColorHolder getSelectedColor() {
        return this.selectedColor;
    }

    public int getSelectedTextColor(Context context) {
        return com.mikepenz.materialize.holder.ColorHolder.color(this.getSelectedTextColor(), context, R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
    }

    public ColorHolder getSelectedTextColor() {
        return this.selectedTextColor;
    }

    public ColorHolder getTextColor() {
        return this.textColor;
    }

    public ColorStateList getTextColorStateList(@ColorInt int n4, @ColorInt int n5) {
        Pair<Integer, ColorStateList> pair = this.colorStateList;
        if (pair == null || n4 + n5 != (Integer)pair.first) {
            this.colorStateList = new Pair((Object)(n4 + n5), (Object)DrawerUIUtils.getTextColorStateList(n4, n5));
        }
        return (ColorStateList)this.colorStateList.second;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_profile;
    }

    @Override
    public Typeface getTypeface() {
        return this.typeface;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view, null){
            private TextView email;
            private TextView name;
            private ImageView profileIcon;
            private View view;
            {
                this.view = view;
                this.profileIcon = (ImageView)view.findViewById(R.id.material_drawer_profileIcon);
                this.name = (TextView)view.findViewById(R.id.material_drawer_name);
                this.email = (TextView)view.findViewById(R.id.material_drawer_email);
            }
            {
                this(view);
            }
        };
    }

    public boolean isNameShown() {
        return this.nameShown;
    }

    public ProfileDrawerItem withDisabledTextColor(@ColorInt int n4) {
        this.disabledTextColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileDrawerItem withDisabledTextColorRes(@ColorRes int n4) {
        this.disabledTextColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ProfileDrawerItem withEmail(@StringRes int n4) {
        this.email = new StringHolder(n4);
        return this;
    }

    @Override
    public ProfileDrawerItem withEmail(String string) {
        this.email = new StringHolder((CharSequence)string);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(@DrawableRes int n4) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(n4);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(Bitmap bitmap) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(bitmap);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(Drawable drawable) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(drawable);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(Uri uri) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(uri);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(IIcon iIcon) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(iIcon);
        return this;
    }

    @Override
    public ProfileDrawerItem withIcon(String string) {
        this.icon = new com.mikepenz.materialdrawer.holder.ImageHolder(string);
        return this;
    }

    public ProfileDrawerItem withName(@StringRes int n4) {
        this.name = new StringHolder(n4);
        return this;
    }

    @Override
    public ProfileDrawerItem withName(String string) {
        this.name = new StringHolder((CharSequence)string);
        return this;
    }

    public ProfileDrawerItem withNameShown(boolean bl) {
        this.nameShown = bl;
        return this;
    }

    public ProfileDrawerItem withSelectedColor(@ColorInt int n4) {
        this.selectedColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileDrawerItem withSelectedColorRes(@ColorRes int n4) {
        this.selectedColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ProfileDrawerItem withSelectedTextColor(@ColorInt int n4) {
        this.selectedTextColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileDrawerItem withSelectedTextColorRes(@ColorRes int n4) {
        this.selectedTextColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ProfileDrawerItem withTextColor(@ColorInt int n4) {
        this.textColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileDrawerItem withTextColorRes(@ColorRes int n4) {
        this.textColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    @Override
    public ProfileDrawerItem withTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }
}


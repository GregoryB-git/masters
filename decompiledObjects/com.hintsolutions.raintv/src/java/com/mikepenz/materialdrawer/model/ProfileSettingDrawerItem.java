/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
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
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.model.interfaces.Typefaceable;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.util.UIUtils;
import java.util.List;

public class ProfileSettingDrawerItem
extends AbstractDrawerItem<ProfileSettingDrawerItem, ViewHolder>
implements IProfile<ProfileSettingDrawerItem>,
Typefaceable<ProfileSettingDrawerItem> {
    private StringHolder description;
    private ColorHolder descriptionTextColor;
    private ImageHolder icon;
    private ColorHolder iconColor;
    private boolean iconTinted = false;
    private StringHolder name;
    private boolean selectable = false;
    private ColorHolder selectedColor;
    private ColorHolder textColor;
    private Typeface typeface = null;

    @Override
    public void bindView(ViewHolder viewHolder, List list) {
        super.bindView(viewHolder, (List<Object>)list);
        list = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(this.hashCode());
        viewHolder.itemView.setEnabled(this.isEnabled());
        viewHolder.itemView.setSelected(this.isSelected());
        int n4 = com.mikepenz.materialize.holder.ColorHolder.color(this.getSelectedColor(), (Context)list, R.attr.material_drawer_selected, R.color.material_drawer_selected);
        ColorHolder colorHolder = this.getTextColor();
        int n5 = R.attr.material_drawer_primary_text;
        int n6 = R.color.material_drawer_primary_text;
        int n7 = com.mikepenz.materialize.holder.ColorHolder.color(colorHolder, (Context)list, n5, n6);
        int n8 = com.mikepenz.materialize.holder.ColorHolder.color(this.getIconColor(), (Context)list, R.attr.material_drawer_primary_icon, R.color.material_drawer_primary_icon);
        n5 = com.mikepenz.materialize.holder.ColorHolder.color(this.getDescriptionTextColor(), (Context)list, n5, n6);
        UIUtils.setBackground(viewHolder.view, (Drawable)UIUtils.getSelectableBackground((Context)list, n4, this.isSelectedBackgroundAnimated()));
        com.mikepenz.materialize.holder.StringHolder.applyTo(this.getName(), viewHolder.name);
        viewHolder.name.setTextColor(n7);
        com.mikepenz.materialize.holder.StringHolder.applyToOrHide(this.getDescription(), viewHolder.description);
        viewHolder.description.setTextColor(n5);
        if (this.getTypeface() != null) {
            viewHolder.name.setTypeface(this.getTypeface());
        }
        ImageHolder.applyDecidedIconOrSetGone(this.icon, viewHolder.icon, n8, this.isIconTinted(), 2);
        DrawerUIUtils.setDrawerVerticalPadding(viewHolder.view);
        this.onPostBindView(this, viewHolder.itemView);
    }

    public StringHolder getDescription() {
        return this.description;
    }

    public ColorHolder getDescriptionTextColor() {
        return this.descriptionTextColor;
    }

    @Override
    public StringHolder getEmail() {
        return this.description;
    }

    @Override
    public ImageHolder getIcon() {
        return this.icon;
    }

    public ColorHolder getIconColor() {
        return this.iconColor;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_profile_setting;
    }

    @Override
    public StringHolder getName() {
        return this.name;
    }

    public ColorHolder getSelectedColor() {
        return this.selectedColor;
    }

    public ColorHolder getTextColor() {
        return this.textColor;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_profile_setting;
    }

    @Override
    public Typeface getTypeface() {
        return this.typeface;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new RecyclerView.ViewHolder(view, null){
            private TextView description;
            private ImageView icon;
            private TextView name;
            private View view;
            {
                this.view = view;
                this.icon = (ImageView)view.findViewById(R.id.material_drawer_icon);
                this.name = (TextView)view.findViewById(R.id.material_drawer_name);
                this.description = (TextView)view.findViewById(R.id.material_drawer_description);
            }
            {
                this(view);
            }
        };
    }

    public boolean isIconTinted() {
        return this.iconTinted;
    }

    @Override
    public boolean isSelectable() {
        return this.selectable;
    }

    public void setDescription(String string) {
        this.description = new StringHolder((CharSequence)string);
    }

    public void setIconTinted(boolean bl) {
        this.iconTinted = bl;
    }

    public ProfileSettingDrawerItem withDescription(@StringRes int n4) {
        this.description = new StringHolder(n4);
        return this;
    }

    public ProfileSettingDrawerItem withDescription(String string) {
        this.description = new StringHolder((CharSequence)string);
        return this;
    }

    public ProfileSettingDrawerItem withDescriptionTextColor(@ColorInt int n4) {
        this.descriptionTextColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileSettingDrawerItem withDescriptionTextColorRes(@ColorRes int n4) {
        this.descriptionTextColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withEmail(String string) {
        this.description = new StringHolder((CharSequence)string);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(@DrawableRes int n4) {
        this.icon = new ImageHolder(n4);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(Bitmap bitmap) {
        this.icon = new ImageHolder(bitmap);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(Drawable drawable) {
        this.icon = new ImageHolder(drawable);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(Uri uri) {
        this.icon = new ImageHolder(uri);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(IIcon iIcon) {
        this.icon = new ImageHolder(iIcon);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withIcon(String string) {
        this.icon = new ImageHolder(string);
        return this;
    }

    public ProfileSettingDrawerItem withIconColor(@ColorInt int n4) {
        this.iconColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileSettingDrawerItem withIconColorRes(@ColorRes int n4) {
        this.iconColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ProfileSettingDrawerItem withIconTinted(boolean bl) {
        this.iconTinted = bl;
        return this;
    }

    public ProfileSettingDrawerItem withName(@StringRes int n4) {
        this.name = new StringHolder(n4);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withName(String string) {
        this.name = new StringHolder((CharSequence)string);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withSelectable(boolean bl) {
        this.selectable = bl;
        return this;
    }

    public ProfileSettingDrawerItem withSelectedColor(@ColorInt int n4) {
        this.selectedColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileSettingDrawerItem withSelectedColorRes(@ColorRes int n4) {
        this.selectedColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    public ProfileSettingDrawerItem withTextColor(@ColorInt int n4) {
        this.textColor = ColorHolder.fromColor(n4);
        return this;
    }

    public ProfileSettingDrawerItem withTextColorRes(@ColorRes int n4) {
        this.textColor = ColorHolder.fromColorRes(n4);
        return this;
    }

    @Override
    public ProfileSettingDrawerItem withTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }
}


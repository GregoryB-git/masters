/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.Pair
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.StringRes
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.ImageHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.AbstractDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Iconable;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;
import com.mikepenz.materialdrawer.model.interfaces.Typefaceable;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;

public abstract class BaseDrawerItem<T, VH extends RecyclerView.ViewHolder>
extends AbstractDrawerItem<T, VH>
implements Nameable<T>,
Iconable<T>,
Typefaceable<T> {
    public Pair<Integer, ColorStateList> colorStateList;
    public ColorHolder disabledIconColor;
    public ColorHolder disabledTextColor;
    public ImageHolder icon;
    public ColorHolder iconColor;
    public boolean iconTinted = false;
    public int level = 1;
    public StringHolder name;
    public ColorHolder selectedColor;
    public ImageHolder selectedIcon;
    public ColorHolder selectedIconColor;
    public ColorHolder selectedTextColor;
    public ColorHolder textColor;
    public Typeface typeface = null;

    public int getColor(Context context) {
        int n4 = this.isEnabled() ? com.mikepenz.materialize.holder.ColorHolder.color(this.getTextColor(), context, R.attr.material_drawer_primary_text, R.color.material_drawer_primary_text) : com.mikepenz.materialize.holder.ColorHolder.color(this.getDisabledTextColor(), context, R.attr.material_drawer_hint_text, R.color.material_drawer_hint_text);
        return n4;
    }

    public ColorHolder getDisabledIconColor() {
        return this.disabledIconColor;
    }

    public ColorHolder getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @Override
    public ImageHolder getIcon() {
        return this.icon;
    }

    public int getIconColor(Context context) {
        int n4 = this.isEnabled() ? com.mikepenz.materialize.holder.ColorHolder.color(this.getIconColor(), context, R.attr.material_drawer_primary_icon, R.color.material_drawer_primary_icon) : com.mikepenz.materialize.holder.ColorHolder.color(this.getDisabledIconColor(), context, R.attr.material_drawer_hint_icon, R.color.material_drawer_hint_icon);
        return n4;
    }

    public ColorHolder getIconColor() {
        return this.iconColor;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public StringHolder getName() {
        return this.name;
    }

    public int getSelectedColor(Context context) {
        return com.mikepenz.materialize.holder.ColorHolder.color(this.getSelectedColor(), context, R.attr.material_drawer_selected, R.color.material_drawer_selected);
    }

    public ColorHolder getSelectedColor() {
        return this.selectedColor;
    }

    public ImageHolder getSelectedIcon() {
        return this.selectedIcon;
    }

    public int getSelectedIconColor(Context context) {
        return com.mikepenz.materialize.holder.ColorHolder.color(this.getSelectedIconColor(), context, R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
    }

    public ColorHolder getSelectedIconColor() {
        return this.selectedIconColor;
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
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isIconTinted() {
        return this.iconTinted;
    }

    public T withDisabledIconColor(@ColorInt int n4) {
        this.disabledIconColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withDisabledIconColorRes(@ColorRes int n4) {
        this.disabledIconColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    public T withDisabledTextColor(@ColorInt int n4) {
        this.disabledTextColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withDisabledTextColorRes(@ColorRes int n4) {
        this.disabledTextColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    public T withIcon(@DrawableRes int n4) {
        this.icon = new ImageHolder(n4);
        return (T)this;
    }

    @Override
    public T withIcon(Drawable drawable) {
        this.icon = new ImageHolder(drawable);
        return (T)this;
    }

    @Override
    public T withIcon(IIcon iIcon) {
        this.icon = new ImageHolder(iIcon);
        this.selectedIcon = new ImageHolder(iIcon);
        return (T)this;
    }

    @Override
    public T withIcon(ImageHolder imageHolder) {
        this.icon = imageHolder;
        return (T)this;
    }

    public T withIconColor(@ColorInt int n4) {
        this.iconColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withIconColorRes(@ColorRes int n4) {
        this.iconColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    @Deprecated
    public T withIconTinted(boolean bl) {
        this.iconTinted = bl;
        return (T)this;
    }

    public T withIconTintingEnabled(boolean bl) {
        this.iconTinted = bl;
        return (T)this;
    }

    public T withLevel(int n4) {
        this.level = n4;
        return (T)this;
    }

    @Override
    public T withName(@StringRes int n4) {
        this.name = new StringHolder(n4);
        return (T)this;
    }

    @Override
    public T withName(StringHolder stringHolder) {
        this.name = stringHolder;
        return (T)this;
    }

    @Override
    public T withName(String string) {
        this.name = new StringHolder((CharSequence)string);
        return (T)this;
    }

    public T withSelectedColor(@ColorInt int n4) {
        this.selectedColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withSelectedColorRes(@ColorRes int n4) {
        this.selectedColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    public T withSelectedIcon(@DrawableRes int n4) {
        this.selectedIcon = new ImageHolder(n4);
        return (T)this;
    }

    public T withSelectedIcon(Drawable drawable) {
        this.selectedIcon = new ImageHolder(drawable);
        return (T)this;
    }

    public T withSelectedIconColor(@ColorInt int n4) {
        this.selectedIconColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withSelectedIconColorRes(@ColorRes int n4) {
        this.selectedIconColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    public T withSelectedTextColor(@ColorInt int n4) {
        this.selectedTextColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withSelectedTextColorRes(@ColorRes int n4) {
        this.selectedTextColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    public T withTextColor(@ColorInt int n4) {
        this.textColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withTextColorRes(@ColorRes int n4) {
        this.textColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }

    @Deprecated
    public T withTintSelectedIcon(boolean bl) {
        return this.withIconTintingEnabled(bl);
    }

    @Override
    public T withTypeface(Typeface typeface) {
        this.typeface = typeface;
        return (T)this;
    }
}


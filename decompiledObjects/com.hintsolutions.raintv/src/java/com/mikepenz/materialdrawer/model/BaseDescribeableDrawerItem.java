/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.StringRes
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.model.BaseDrawerItem;
import com.mikepenz.materialdrawer.model.BaseViewHolder;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.holder.ImageHolder;
import com.mikepenz.materialize.util.UIUtils;

public abstract class BaseDescribeableDrawerItem<T, VH extends BaseViewHolder>
extends BaseDrawerItem<T, VH> {
    private StringHolder description;
    private ColorHolder descriptionTextColor;

    public void bindViewHelper(BaseViewHolder baseViewHolder) {
        Context context = baseViewHolder.itemView.getContext();
        baseViewHolder.itemView.setId(this.hashCode());
        baseViewHolder.itemView.setSelected(this.isSelected());
        baseViewHolder.itemView.setEnabled(this.isEnabled());
        int n4 = this.getSelectedColor(context);
        ColorStateList colorStateList = this.getTextColorStateList(this.getColor(context), this.getSelectedTextColor(context));
        int n5 = this.getIconColor(context);
        int n6 = this.getSelectedIconColor(context);
        UIUtils.setBackground(baseViewHolder.view, (Drawable)UIUtils.getSelectableBackground(context, n4, this.isSelectedBackgroundAnimated()));
        com.mikepenz.materialize.holder.StringHolder.applyTo(this.getName(), baseViewHolder.name);
        com.mikepenz.materialize.holder.StringHolder.applyToOrHide(this.getDescription(), baseViewHolder.description);
        baseViewHolder.name.setTextColor(colorStateList);
        com.mikepenz.materialize.holder.ColorHolder.applyToOr(this.getDescriptionTextColor(), baseViewHolder.description, colorStateList);
        if (this.getTypeface() != null) {
            baseViewHolder.name.setTypeface(this.getTypeface());
            baseViewHolder.description.setTypeface(this.getTypeface());
        }
        if ((colorStateList = com.mikepenz.materialdrawer.holder.ImageHolder.decideIcon(this.getIcon(), context, n5, this.isIconTinted(), 1)) != null) {
            ImageHolder.applyMultiIconTo((Drawable)colorStateList, n5, com.mikepenz.materialdrawer.holder.ImageHolder.decideIcon(this.getSelectedIcon(), context, n6, this.isIconTinted(), 1), n6, this.isIconTinted(), baseViewHolder.icon);
        } else {
            com.mikepenz.materialdrawer.holder.ImageHolder.applyDecidedIconOrSetGone(this.getIcon(), baseViewHolder.icon, n5, this.isIconTinted(), 1);
        }
        DrawerUIUtils.setDrawerVerticalPadding(baseViewHolder.view, this.level);
    }

    public StringHolder getDescription() {
        return this.description;
    }

    public ColorHolder getDescriptionTextColor() {
        return this.descriptionTextColor;
    }

    public T withDescription(@StringRes int n4) {
        this.description = new StringHolder(n4);
        return (T)this;
    }

    public T withDescription(String string) {
        this.description = new StringHolder((CharSequence)string);
        return (T)this;
    }

    public T withDescriptionTextColor(@ColorInt int n4) {
        this.descriptionTextColor = ColorHolder.fromColor(n4);
        return (T)this;
    }

    public T withDescriptionTextColorRes(@ColorRes int n4) {
        this.descriptionTextColor = ColorHolder.fromColorRes(n4);
        return (T)this;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.annotation.Dimension
 *  androidx.annotation.DrawableRes
 *  com.mikepenz.materialdrawer.holder.ColorHolder
 *  com.mikepenz.materialdrawer.holder.DimenHolder
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.holder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.holder.ColorHolder;
import com.mikepenz.materialdrawer.holder.DimenHolder;
import com.mikepenz.materialdrawer.model.utils.BadgeDrawableBuilder;
import com.mikepenz.materialize.util.UIUtils;

public class BadgeStyle {
    private Drawable mBadgeBackground;
    private ColorHolder mColor;
    private ColorHolder mColorPressed;
    private DimenHolder mCorners;
    private int mGradientDrawable = R.drawable.material_drawer_badge;
    private DimenHolder mMinWidth;
    private DimenHolder mPaddingLeftRight;
    private DimenHolder mPaddingTopBottom = DimenHolder.fromDp((int)2);
    private ColorHolder mTextColor;

    public BadgeStyle() {
        this.mPaddingLeftRight = DimenHolder.fromDp((int)3);
        this.mMinWidth = DimenHolder.fromDp((int)20);
    }

    public BadgeStyle(@ColorInt int n, @ColorInt int n2) {
        this.mPaddingLeftRight = DimenHolder.fromDp((int)3);
        this.mMinWidth = DimenHolder.fromDp((int)20);
        this.mColor = ColorHolder.fromColor((int)n);
        this.mColorPressed = ColorHolder.fromColor((int)n2);
    }

    public BadgeStyle(@DrawableRes int n, @ColorInt int n2, @ColorInt int n3, @ColorInt int n4) {
        this.mPaddingLeftRight = DimenHolder.fromDp((int)3);
        this.mMinWidth = DimenHolder.fromDp((int)20);
        this.mGradientDrawable = n;
        this.mColor = ColorHolder.fromColor((int)n2);
        this.mColorPressed = ColorHolder.fromColor((int)n3);
        this.mTextColor = ColorHolder.fromColor((int)n4);
    }

    public Drawable getBadgeBackground() {
        return this.mBadgeBackground;
    }

    public ColorHolder getColor() {
        return this.mColor;
    }

    public ColorHolder getColorPressed() {
        return this.mColorPressed;
    }

    public DimenHolder getCorners() {
        return this.mCorners;
    }

    public int getGradientDrawable() {
        return this.mGradientDrawable;
    }

    public DimenHolder getMinWidth() {
        return this.mMinWidth;
    }

    public DimenHolder getPaddingLeftRight() {
        return this.mPaddingLeftRight;
    }

    public DimenHolder getPaddingTopBottom() {
        return this.mPaddingTopBottom;
    }

    public ColorHolder getTextColor() {
        return this.mTextColor;
    }

    public void style(TextView textView) {
        this.style(textView, null);
    }

    public void style(TextView textView, ColorStateList colorStateList) {
        Context context = textView.getContext();
        Drawable drawable2 = this.mBadgeBackground;
        if (drawable2 == null) {
            UIUtils.setBackground((View)textView, (Drawable)new BadgeDrawableBuilder(this).build(context));
        } else {
            UIUtils.setBackground((View)textView, drawable2);
        }
        drawable2 = this.mTextColor;
        if (drawable2 != null) {
            com.mikepenz.materialize.holder.ColorHolder.applyToOr((com.mikepenz.materialize.holder.ColorHolder)drawable2, textView, null);
        } else if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        int n = this.mPaddingLeftRight.asPixel(context);
        int n2 = this.mPaddingTopBottom.asPixel(context);
        textView.setPadding(n, n2, n, n2);
        textView.setMinWidth(this.mMinWidth.asPixel(context));
    }

    public BadgeStyle withBadgeBackground(Drawable drawable2) {
        this.mBadgeBackground = drawable2;
        this.mGradientDrawable = -1;
        return this;
    }

    public BadgeStyle withColor(@ColorInt int n) {
        this.mColor = ColorHolder.fromColor((int)n);
        return this;
    }

    public BadgeStyle withColorPressed(@ColorInt int n) {
        this.mColorPressed = ColorHolder.fromColor((int)n);
        return this;
    }

    public BadgeStyle withColorPressedRes(@ColorRes int n) {
        this.mColorPressed = ColorHolder.fromColorRes((int)n);
        return this;
    }

    public BadgeStyle withColorRes(@ColorRes int n) {
        this.mColor = ColorHolder.fromColorRes((int)n);
        return this;
    }

    public BadgeStyle withCorners(@Dimension(unit=1) int n) {
        this.mCorners = DimenHolder.fromPixel((int)n);
        return this;
    }

    public BadgeStyle withCorners(DimenHolder dimenHolder) {
        this.mCorners = dimenHolder;
        return this;
    }

    public BadgeStyle withCornersDp(@Dimension(unit=0) int n) {
        this.mCorners = DimenHolder.fromDp((int)n);
        return this;
    }

    public BadgeStyle withGradientDrawable(@DrawableRes int n) {
        this.mGradientDrawable = n;
        this.mBadgeBackground = null;
        return this;
    }

    public BadgeStyle withMinWidth(@Dimension(unit=1) int n) {
        this.mMinWidth = DimenHolder.fromPixel((int)n);
        return this;
    }

    public BadgeStyle withMinWidth(DimenHolder dimenHolder) {
        this.mMinWidth = dimenHolder;
        return this;
    }

    public BadgeStyle withPadding(@Dimension(unit=1) int n) {
        this.mPaddingLeftRight = DimenHolder.fromPixel((int)n);
        this.mPaddingTopBottom = DimenHolder.fromPixel((int)n);
        return this;
    }

    public BadgeStyle withPadding(DimenHolder dimenHolder) {
        this.mPaddingLeftRight = dimenHolder;
        this.mPaddingTopBottom = dimenHolder;
        return this;
    }

    public BadgeStyle withPaddingLeftRightDp(@Dimension(unit=0) int n) {
        this.mPaddingLeftRight = DimenHolder.fromDp((int)n);
        return this;
    }

    public BadgeStyle withPaddingLeftRightPx(@Dimension(unit=1) int n) {
        this.mPaddingLeftRight = DimenHolder.fromPixel((int)n);
        return this;
    }

    public BadgeStyle withPaddingLeftRightRes(@DimenRes int n) {
        this.mPaddingLeftRight = DimenHolder.fromResource((int)n);
        return this;
    }

    public BadgeStyle withPaddingTopBottomDp(@Dimension(unit=0) int n) {
        this.mPaddingTopBottom = DimenHolder.fromDp((int)n);
        return this;
    }

    public BadgeStyle withPaddingTopBottomPx(@Dimension(unit=1) int n) {
        this.mPaddingTopBottom = DimenHolder.fromPixel((int)n);
        return this;
    }

    public BadgeStyle withPaddingTopBottomRes(@DimenRes int n) {
        this.mPaddingTopBottom = DimenHolder.fromResource((int)n);
        return this;
    }

    public BadgeStyle withTextColor(@ColorInt int n) {
        this.mTextColor = ColorHolder.fromColor((int)n);
        return this;
    }

    public BadgeStyle withTextColorRes(@ColorRes int n) {
        this.mTextColor = ColorHolder.fromColorRes((int)n);
        return this;
    }
}


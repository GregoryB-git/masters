/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.Object
 */
package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.util.DialogUtils;

@SuppressLint(value={"AppCompatCustomView"})
public class MDButton
extends TextView {
    private Drawable defaultBackground;
    private boolean stacked = false;
    private Drawable stackedBackground;
    private int stackedEndPadding;
    private GravityEnum stackedGravity;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public MDButton(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(context);
    }

    private void init(Context context) {
        this.stackedEndPadding = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.stackedGravity = GravityEnum.END;
    }

    public void setAllCapsCompat(boolean bl) {
        this.setAllCaps(bl);
    }

    public void setDefaultSelector(Drawable drawable2) {
        this.defaultBackground = drawable2;
        if (!this.stacked) {
            this.setStacked(false, true);
        }
    }

    public void setStacked(boolean bl, boolean bl2) {
        if (this.stacked != bl || bl2) {
            int n = bl ? this.stackedGravity.getGravityInt() | 0x10 : 17;
            this.setGravity(n);
            n = bl ? this.stackedGravity.getTextAlignment() : 4;
            this.setTextAlignment(n);
            Drawable drawable2 = bl ? this.stackedBackground : this.defaultBackground;
            DialogUtils.setBackgroundCompat((View)this, drawable2);
            if (bl) {
                this.setPadding(this.stackedEndPadding, this.getPaddingTop(), this.stackedEndPadding, this.getPaddingBottom());
            }
            this.stacked = bl;
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.stackedGravity = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable2) {
        this.stackedBackground = drawable2;
        if (this.stacked) {
            this.setStacked(true, true);
        }
    }
}


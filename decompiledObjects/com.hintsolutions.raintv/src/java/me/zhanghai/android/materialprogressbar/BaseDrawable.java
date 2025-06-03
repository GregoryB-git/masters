/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  androidx.annotation.ColorInt
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 */
package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.TintableDrawable;

abstract class BaseDrawable
extends Drawable
implements TintableDrawable {
    public int mAlpha = 255;
    public ColorFilter mColorFilter;
    private DummyConstantState mConstantState;
    public PorterDuffColorFilter mTintFilter;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;

    public BaseDrawable() {
        this.mConstantState = new Drawable.ConstantState(this, null){
            public final BaseDrawable this$0;
            {
                this.this$0 = baseDrawable;
            }
            {
                this(baseDrawable);
            }

            public int getChangingConfigurations() {
                return 0;
            }

            @NonNull
            public Drawable newDrawable() {
                return this.this$0;
            }
        };
    }

    private boolean updateTintFilter() {
        ColorStateList colorStateList = this.mTintList;
        boolean bl2 = true;
        if (colorStateList != null && this.mTintMode != null) {
            this.mTintFilter = new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), this.mTintMode);
            return true;
        }
        if (this.mTintFilter == null) {
            bl2 = false;
        }
        this.mTintFilter = null;
        return bl2;
    }

    public void draw(Canvas canvas) {
        Rect rect = this.getBounds();
        if (rect.width() != 0 && rect.height() != 0) {
            int n2 = canvas.save();
            canvas.translate((float)rect.left, (float)rect.top);
            this.onDraw(canvas, rect.width(), rect.height());
            canvas.restoreToCount(n2);
        }
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    public ColorFilter getColorFilterForDrawing() {
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter == null) {
            colorFilter = this.mTintFilter;
        }
        return colorFilter;
    }

    public Drawable.ConstantState getConstantState() {
        return this.mConstantState;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.mTintList;
        boolean bl2 = colorStateList != null && colorStateList.isStateful();
        return bl2;
    }

    public abstract void onDraw(Canvas var1, int var2, int var3);

    public boolean onStateChange(int[] nArray) {
        return this.updateTintFilter();
    }

    public void setAlpha(int n2) {
        if (this.mAlpha != n2) {
            this.mAlpha = n2;
            this.invalidateSelf();
        }
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
        this.invalidateSelf();
    }

    @Override
    public void setTint(@ColorInt int n2) {
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    @Override
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        if (this.updateTintFilter()) {
            this.invalidateSelf();
        }
    }

    @Override
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.mTintMode = mode;
        if (this.updateTintFilter()) {
            this.invalidateSelf();
        }
    }
}


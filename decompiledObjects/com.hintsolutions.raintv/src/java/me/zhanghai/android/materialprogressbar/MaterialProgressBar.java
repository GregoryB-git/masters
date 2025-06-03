/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.widget.ProgressBar
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.TintTypedArray
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import me.zhanghai.android.materialprogressbar.CircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressDrawable;
import me.zhanghai.android.materialprogressbar.R;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.TintableDrawable;
import me.zhanghai.android.materialprogressbar.internal.DrawableCompat;

public class MaterialProgressBar
extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = "MaterialProgressBar";
    private int mProgressStyle;
    private TintInfo mProgressTintInfo = new TintInfo(null);
    private boolean mSuperInitialized = true;

    public MaterialProgressBar(Context context) {
        super(context);
        this.init(null, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(attributeSet, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.init(attributeSet, n3, 0);
    }

    @TargetApi(value=21)
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int n3, int n7) {
        super(context, attributeSet, n3, n7);
        this.init(attributeSet, n3, n7);
    }

    private void applyIndeterminateTint() {
        Drawable drawable2 = this.getIndeterminateDrawable();
        if (drawable2 == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if (tintInfo.mHasIndeterminateTint || tintInfo.mHasIndeterminateTintMode) {
            drawable2.mutate();
            tintInfo = this.mProgressTintInfo;
            this.applyTintForDrawable(drawable2, tintInfo.mIndeterminateTint, tintInfo.mHasIndeterminateTint, tintInfo.mIndeterminateTintMode, tintInfo.mHasIndeterminateTintMode);
        }
    }

    private void applyPrimaryProgressTint() {
        if (this.getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasProgressTint || tintInfo.mHasProgressTintMode) && (tintInfo = this.getTintTargetFromProgressDrawable(16908301, true)) != null) {
            TintInfo tintInfo2 = this.mProgressTintInfo;
            this.applyTintForDrawable((Drawable)tintInfo, tintInfo2.mProgressTint, tintInfo2.mHasProgressTint, tintInfo2.mProgressTintMode, tintInfo2.mHasProgressTintMode);
        }
    }

    private void applyProgressBackgroundTint() {
        if (this.getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasProgressBackgroundTint || tintInfo.mHasProgressBackgroundTintMode) && (tintInfo = this.getTintTargetFromProgressDrawable(0x1020000, false)) != null) {
            TintInfo tintInfo2 = this.mProgressTintInfo;
            this.applyTintForDrawable((Drawable)tintInfo, tintInfo2.mProgressBackgroundTint, tintInfo2.mHasProgressBackgroundTint, tintInfo2.mProgressBackgroundTintMode, tintInfo2.mHasProgressBackgroundTintMode);
        }
    }

    private void applyProgressTints() {
        if (this.getProgressDrawable() == null) {
            return;
        }
        this.applyPrimaryProgressTint();
        this.applyProgressBackgroundTint();
        this.applySecondaryProgressTint();
    }

    private void applySecondaryProgressTint() {
        Drawable drawable2;
        if (this.getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasSecondaryProgressTint || tintInfo.mHasSecondaryProgressTintMode) && (drawable2 = this.getTintTargetFromProgressDrawable(16908303, false)) != null) {
            tintInfo = this.mProgressTintInfo;
            this.applyTintForDrawable(drawable2, tintInfo.mSecondaryProgressTint, tintInfo.mHasSecondaryProgressTint, tintInfo.mSecondaryProgressTintMode, tintInfo.mHasSecondaryProgressTintMode);
        }
    }

    @SuppressLint(value={"NewApi"})
    private void applyTintForDrawable(Drawable drawable2, ColorStateList colorStateList, boolean bl, PorterDuff.Mode mode, boolean bl2) {
        if (bl || bl2) {
            if (bl) {
                if (drawable2 instanceof TintableDrawable) {
                    ((TintableDrawable)drawable2).setTintList(colorStateList);
                } else {
                    Log.w((String)TAG, (String)"Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable2.setTintList(colorStateList);
                }
            }
            if (bl2) {
                if (drawable2 instanceof TintableDrawable) {
                    ((TintableDrawable)drawable2).setTintMode(mode);
                } else {
                    Log.w((String)TAG, (String)"Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable2.setTintMode(mode);
                }
            }
            if (drawable2.isStateful()) {
                drawable2.setState(this.getDrawableState());
            }
        }
    }

    private void fixCanvasScalingWhenHardwareAccelerated() {
    }

    private Drawable getTintTargetFromProgressDrawable(int n3, boolean bl) {
        Drawable drawable2;
        block2: {
            Drawable drawable3 = this.getProgressDrawable();
            drawable2 = null;
            if (drawable3 == null) {
                return null;
            }
            drawable3.mutate();
            if (drawable3 instanceof LayerDrawable) {
                drawable2 = ((LayerDrawable)drawable3).findDrawableByLayerId(n3);
            }
            if (drawable2 != null || !bl) break block2;
            drawable2 = drawable3;
        }
        return drawable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void init(AttributeSet attributeSet, int n3, int n7) {
        Context context = this.getContext();
        attributeSet = TintTypedArray.obtainStyledAttributes((Context)context, (AttributeSet)attributeSet, (int[])R.styleable.MaterialProgressBar, (int)n3, (int)n7);
        this.mProgressStyle = attributeSet.getInt(R.styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean bl = attributeSet.getBoolean(R.styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean bl2 = attributeSet.getBoolean(R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        n3 = R.styleable.MaterialProgressBar_mpb_showProgressBackground;
        boolean bl3 = this.mProgressStyle == 1;
        bl3 = attributeSet.getBoolean(n3, bl3);
        n3 = attributeSet.getInt(R.styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        n7 = R.styleable.MaterialProgressBar_mpb_progressTint;
        if (attributeSet.hasValue(n7)) {
            this.mProgressTintInfo.mProgressTint = attributeSet.getColorStateList(n7);
            this.mProgressTintInfo.mHasProgressTint = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.mProgressTintInfo.mProgressTintMode = DrawableCompat.parseTintMode(attributeSet.getInt(n7, -1), null);
            this.mProgressTintInfo.mHasProgressTintMode = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.mProgressTintInfo.mSecondaryProgressTint = attributeSet.getColorStateList(n7);
            this.mProgressTintInfo.mHasSecondaryProgressTint = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.mProgressTintInfo.mSecondaryProgressTintMode = DrawableCompat.parseTintMode(attributeSet.getInt(n7, -1), null);
            this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.mProgressTintInfo.mProgressBackgroundTint = attributeSet.getColorStateList(n7);
            this.mProgressTintInfo.mHasProgressBackgroundTint = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.mProgressTintInfo.mProgressBackgroundTintMode = DrawableCompat.parseTintMode(attributeSet.getInt(n7, -1), null);
            this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.mProgressTintInfo.mIndeterminateTint = attributeSet.getColorStateList(n7);
            this.mProgressTintInfo.mHasIndeterminateTint = true;
        }
        if (attributeSet.hasValue(n7 = R.styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.mProgressTintInfo.mIndeterminateTintMode = DrawableCompat.parseTintMode(attributeSet.getInt(n7, -1), null);
            this.mProgressTintInfo.mHasIndeterminateTintMode = true;
        }
        attributeSet.recycle();
        n7 = this.mProgressStyle;
        if (n7 != 0) {
            if (n7 != 1) {
                attributeSet = z2.t("Unknown progress style: ");
                attributeSet.append(this.mProgressStyle);
                throw new IllegalArgumentException(attributeSet.toString());
            }
            if ((this.isIndeterminate() || bl) && !this.isInEditMode()) {
                this.setIndeterminateDrawable((Drawable)new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!this.isIndeterminate() || bl) {
                this.setProgressDrawable((Drawable)new HorizontalProgressDrawable(context));
            }
        } else {
            if ((this.isIndeterminate() || bl) && !this.isInEditMode()) {
                this.setIndeterminateDrawable((Drawable)new IndeterminateCircularProgressDrawable(context));
            }
            if (!this.isIndeterminate() || bl) {
                this.setProgressDrawable((Drawable)new CircularProgressDrawable(n3, context));
            }
        }
        this.setUseIntrinsicPadding(bl2);
        this.setShowProgressBackground(bl3);
    }

    public Drawable getCurrentDrawable() {
        Drawable drawable2 = this.isIndeterminate() ? this.getIndeterminateDrawable() : this.getProgressDrawable();
        return drawable2;
    }

    @Nullable
    public ColorStateList getIndeterminateTintList() {
        return this.mProgressTintInfo.mIndeterminateTint;
    }

    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        return this.mProgressTintInfo.mIndeterminateTintMode;
    }

    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        return this.mProgressTintInfo.mProgressBackgroundTint;
    }

    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        return this.mProgressTintInfo.mProgressBackgroundTintMode;
    }

    public int getProgressStyle() {
        return this.mProgressStyle;
    }

    @Nullable
    public ColorStateList getProgressTintList() {
        return this.mProgressTintInfo.mProgressTint;
    }

    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        return this.mProgressTintInfo.mProgressTintMode;
    }

    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        return this.mProgressTintInfo.mSecondaryProgressTint;
    }

    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        return this.mProgressTintInfo.mSecondaryProgressTintMode;
    }

    public boolean getShowProgressBackground() {
        Drawable drawable2 = this.getCurrentDrawable();
        if (drawable2 instanceof ShowBackgroundDrawable) {
            return ((ShowBackgroundDrawable)drawable2).getShowBackground();
        }
        return false;
    }

    public boolean getUseIntrinsicPadding() {
        Drawable drawable2 = this.getCurrentDrawable();
        if (drawable2 instanceof IntrinsicPaddingDrawable) {
            return ((IntrinsicPaddingDrawable)drawable2).getUseIntrinsicPadding();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fixCanvasScalingWhenHardwareAccelerated();
    }

    public void setIndeterminate(boolean bl) {
        MaterialProgressBar materialProgressBar = this;
        synchronized (materialProgressBar) {
            super.setIndeterminate(bl);
            if (this.mSuperInitialized && !(this.getCurrentDrawable() instanceof MaterialProgressDrawable)) {
                Log.w((String)TAG, (String)"Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
            }
            return;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable2) {
        super.setIndeterminateDrawable(drawable2);
        if (this.mProgressTintInfo != null) {
            this.applyIndeterminateTint();
        }
    }

    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTint = colorStateList;
        tintInfo.mHasIndeterminateTint = true;
        this.applyIndeterminateTint();
    }

    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTintMode = mode;
        tintInfo.mHasIndeterminateTintMode = true;
        this.applyIndeterminateTint();
    }

    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTint = colorStateList;
        tintInfo.mHasProgressBackgroundTint = true;
        this.applyProgressBackgroundTint();
    }

    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTintMode = mode;
        tintInfo.mHasProgressBackgroundTintMode = true;
        this.applyProgressBackgroundTint();
    }

    public void setProgressDrawable(Drawable drawable2) {
        super.setProgressDrawable(drawable2);
        if (this.mProgressTintInfo != null) {
            this.applyProgressTints();
        }
    }

    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTint = colorStateList;
        tintInfo.mHasProgressTint = true;
        this.applyPrimaryProgressTint();
    }

    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTintMode = mode;
        tintInfo.mHasProgressTintMode = true;
        this.applyPrimaryProgressTint();
    }

    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTint = colorStateList;
        tintInfo.mHasSecondaryProgressTint = true;
        this.applySecondaryProgressTint();
    }

    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTintMode = mode;
        tintInfo.mHasSecondaryProgressTintMode = true;
        this.applySecondaryProgressTint();
    }

    public void setShowProgressBackground(boolean bl) {
        Drawable drawable2 = this.getCurrentDrawable();
        if (drawable2 instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable)drawable2).setShowBackground(bl);
        }
        if ((drawable2 = this.getIndeterminateDrawable()) instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable)drawable2).setShowBackground(bl);
        }
    }

    public void setUseIntrinsicPadding(boolean bl) {
        Drawable drawable2 = this.getCurrentDrawable();
        if (drawable2 instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable)drawable2).setUseIntrinsicPadding(bl);
        }
        if ((drawable2 = this.getIndeterminateDrawable()) instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable)drawable2).setUseIntrinsicPadding(bl);
        }
    }

    public static class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        public ColorStateList mIndeterminateTint;
        public PorterDuff.Mode mIndeterminateTintMode;
        public ColorStateList mProgressBackgroundTint;
        public PorterDuff.Mode mProgressBackgroundTintMode;
        public ColorStateList mProgressTint;
        public PorterDuff.Mode mProgressTintMode;
        public ColorStateList mSecondaryProgressTint;
        public PorterDuff.Mode mSecondaryProgressTintMode;

        private TintInfo() {
        }

        public /* synthetic */ TintInfo(1 var1_1) {
            this();
        }
    }
}


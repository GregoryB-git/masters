/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  me.zhanghai.android.materialprogressbar.Animators
 *  me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable$RectTransformX
 *  me.zhanghai.android.materialprogressbar.MaterialProgressDrawable
 *  me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
 *  me.zhanghai.android.materialprogressbar.internal.ThemeUtils
 */
package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import me.zhanghai.android.materialprogressbar.Animators;
import me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

public class IndeterminateHorizontalProgressDrawable
extends BaseIndeterminateProgressDrawable
implements MaterialProgressDrawable,
ShowBackgroundDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    private static final RectTransformX RECT_1_TRANSFORM_X;
    private static final RectTransformX RECT_2_TRANSFORM_X;
    private static final RectF RECT_BOUND;
    private static final RectF RECT_PADDED_BOUND;
    private static final RectF RECT_PROGRESS;
    private float mBackgroundAlpha;
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;
    private RectTransformX mRect1TransformX = new /* Unavailable Anonymous Inner Class!! */;
    private RectTransformX mRect2TransformX = new /* Unavailable Anonymous Inner Class!! */;
    private boolean mShowBackground = true;

    static {
        RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
        RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
        RECT_PROGRESS = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);
        RECT_1_TRANSFORM_X = new /* Unavailable Anonymous Inner Class!! */;
        RECT_2_TRANSFORM_X = new /* Unavailable Anonymous Inner Class!! */;
    }

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicHeight = Math.round((float)(4.0f * f2));
        this.mPaddedIntrinsicHeight = Math.round((float)(f2 * 16.0f));
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes((int)0x1010033, (float)0.0f, (Context)context);
        this.mAnimators = new Animator[]{Animators.createIndeterminateHorizontalRect1((Object)this.mRect1TransformX), Animators.createIndeterminateHorizontalRect2((Object)this.mRect2TransformX)};
    }

    private static void drawBackgroundRect(Canvas canvas, Paint paint) {
        canvas.drawRect(RECT_BOUND, paint);
    }

    private static void drawProgressRect(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int n2 = canvas.save();
        canvas.translate(rectTransformX.mTranslateX, 0.0f);
        canvas.scale(rectTransformX.mScaleX, 1.0f);
        canvas.drawRect(RECT_PROGRESS, paint);
        canvas.restoreToCount(n2);
    }

    public int getIntrinsicHeight() {
        int n2 = this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
        return n2;
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override
    public void onDraw(Canvas canvas, int n2, int n3, Paint paint) {
        if (this.mUseIntrinsicPadding) {
            float f2 = n2;
            RectF rectF = RECT_PADDED_BOUND;
            canvas.scale(f2 / rectF.width(), (float)n3 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            float f3 = n2;
            RectF rectF = RECT_BOUND;
            canvas.scale(f3 / rectF.width(), (float)n3 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.mShowBackground) {
            paint.setAlpha(Math.round((float)((float)this.mAlpha * this.mBackgroundAlpha)));
            IndeterminateHorizontalProgressDrawable.drawBackgroundRect(canvas, paint);
            paint.setAlpha(this.mAlpha);
        }
        IndeterminateHorizontalProgressDrawable.drawProgressRect(canvas, this.mRect2TransformX, paint);
        IndeterminateHorizontalProgressDrawable.drawProgressRect(canvas, this.mRect1TransformX, paint);
    }

    @Override
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public void setShowBackground(boolean bl) {
        if (this.mShowBackground != bl) {
            this.mShowBackground = bl;
            this.invalidateSelf();
        }
    }
}


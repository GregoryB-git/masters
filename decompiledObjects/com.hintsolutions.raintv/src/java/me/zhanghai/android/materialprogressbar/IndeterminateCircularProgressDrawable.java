/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  me.zhanghai.android.materialprogressbar.Animators
 *  me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable$RingPathTransform
 *  me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable$RingRotation
 *  me.zhanghai.android.materialprogressbar.MaterialProgressDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import me.zhanghai.android.materialprogressbar.Animators;
import me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressDrawable;

/*
 * Exception performing whole class analysis ignored.
 */
public class IndeterminateCircularProgressDrawable
extends BaseIndeterminateProgressDrawable
implements MaterialProgressDrawable {
    private static final int PADDED_INTRINSIC_SIZE_DP = 48;
    private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);
    private int mPaddedIntrinsicSize;
    private int mProgressIntrinsicSize;
    private RingPathTransform mRingPathTransform = new /* Unavailable Anonymous Inner Class!! */;
    private RingRotation mRingRotation = new /* Unavailable Anonymous Inner Class!! */;

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicSize = Math.round((float)(42.0f * f2));
        this.mPaddedIntrinsicSize = Math.round((float)(f2 * 48.0f));
        this.mAnimators = new Animator[]{Animators.createIndeterminate((Object)this.mRingPathTransform), Animators.createIndeterminateRotation((Object)this.mRingRotation)};
    }

    private void drawRing(Canvas canvas, Paint paint) {
        int n2 = canvas.save();
        canvas.rotate(RingRotation.access$200(this.mRingRotation));
        RingPathTransform ringPathTransform = this.mRingPathTransform;
        float f2 = ringPathTransform.mTrimPathOffset;
        float f3 = ringPathTransform.mTrimPathStart;
        float f7 = ringPathTransform.mTrimPathEnd;
        canvas.drawArc(RECT_PROGRESS, (f2 + f3) * 360.0f - 90.0f, (f7 - f3) * 360.0f, false, paint);
        canvas.restoreToCount(n2);
    }

    private int getIntrinsicSize() {
        int n2 = this.mUseIntrinsicPadding ? this.mPaddedIntrinsicSize : this.mProgressIntrinsicSize;
        return n2;
    }

    public int getIntrinsicHeight() {
        return this.getIntrinsicSize();
    }

    public int getIntrinsicWidth() {
        return this.getIntrinsicSize();
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
        this.drawRing(canvas, paint);
    }

    @Override
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }
}


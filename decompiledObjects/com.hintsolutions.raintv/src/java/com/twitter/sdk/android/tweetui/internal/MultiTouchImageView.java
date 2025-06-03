/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 *  android.view.ViewParent
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.tweetui.internal;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;

public class MultiTouchImageView
extends ImageView
implements SwipeToDismissTouchListener.SwipeableViewProvider {
    private static final float DOUBLE_TAP_SCALE_FACTOR = 2.0f;
    private static final float MINIMUM_SCALE_FACTOR = 1.0f;
    private static final long SCALE_ANIMATION_DURATION = 300L;
    public boolean allowIntercept;
    public final Matrix baseMatrix;
    public final Matrix drawMatrix = new Matrix();
    public final RectF drawRect;
    public final GestureDetector gestureDetector;
    public final float[] matrixValues;
    public final ScaleGestureDetector scaleGestureDetector;
    public final Matrix updateMatrix;
    public final RectF viewRect;

    public MultiTouchImageView(Context context) {
        this(context, null);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.baseMatrix = new Matrix();
        this.updateMatrix = new Matrix();
        this.viewRect = new RectF();
        this.drawRect = new RectF();
        this.matrixValues = new float[9];
        this.scaleGestureDetector = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)new ScaleGestureDetector.SimpleOnScaleGestureListener(this){
            public final MultiTouchImageView this$0;
            {
                this.this$0 = multiTouchImageView;
            }

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                this.this$0.setScale(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                this.this$0.setImageMatrix();
                return true;
            }

            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                if (this.this$0.getScale() < 1.0f) {
                    this.this$0.reset();
                    this.this$0.setImageMatrix();
                }
            }
        });
        this.gestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            public final MultiTouchImageView this$0;
            {
                this.this$0 = multiTouchImageView;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (this.this$0.getScale() > 1.0f) {
                    MultiTouchImageView multiTouchImageView = this.this$0;
                    multiTouchImageView.animateScale(multiTouchImageView.getScale(), 1.0f, motionEvent.getX(), motionEvent.getY());
                } else {
                    MultiTouchImageView multiTouchImageView = this.this$0;
                    multiTouchImageView.animateScale(multiTouchImageView.getScale(), 2.0f, motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }

            public boolean onScroll(MotionEvent object, MotionEvent motionEvent, float f, float f2) {
                this.this$0.setTranslate(-f, -f2);
                this.this$0.setImageMatrix();
                object = this.this$0;
                if (object.allowIntercept && !object.scaleGestureDetector.isInProgress()) {
                    this.this$0.requestDisallowInterceptTouchEvent(false);
                }
                return true;
            }
        });
    }

    public void animateScale(float f, float f2, float f3, float f4) {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{f, f2});
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, f3, f4){
            public final MultiTouchImageView this$0;
            public final float val$px;
            public final float val$py;
            {
                this.this$0 = multiTouchImageView;
                this.val$px = f;
                this.val$py = f2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f = ((Float)valueAnimator.getAnimatedValue()).floatValue() / this.this$0.getScale();
                this.this$0.setScale(f, this.val$px, this.val$py);
                this.this$0.setImageMatrix();
            }
        });
        valueAnimator.start();
    }

    @Override
    public boolean canBeSwiped() {
        boolean bl = this.getScale() == 1.0f;
        return bl;
    }

    public Matrix getDrawMatrix() {
        this.drawMatrix.set(this.baseMatrix);
        this.drawMatrix.postConcat(this.updateMatrix);
        return this.drawMatrix;
    }

    public RectF getDrawRect(Matrix matrix) {
        Drawable drawable2 = this.getDrawable();
        if (drawable2 != null) {
            this.drawRect.set(0.0f, 0.0f, (float)drawable2.getIntrinsicWidth(), (float)drawable2.getIntrinsicHeight());
            matrix.mapRect(this.drawRect);
        }
        return this.drawRect;
    }

    public float getScale() {
        this.updateMatrix.getValues(this.matrixValues);
        return this.matrixValues[0];
    }

    public void initializeBaseMatrix(Drawable drawable2) {
        int n = drawable2.getIntrinsicWidth();
        int n2 = drawable2.getIntrinsicHeight();
        drawable2 = new RectF(0.0f, 0.0f, (float)n, (float)n2);
        this.baseMatrix.reset();
        this.baseMatrix.setRectToRect((RectF)drawable2, this.viewRect, Matrix.ScaleToFit.CENTER);
    }

    public void initializeViewRect() {
        this.viewRect.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
    }

    public boolean isInitializationComplete() {
        Drawable drawable2 = this.getDrawable();
        boolean bl = drawable2 != null && drawable2.getIntrinsicWidth() > 0;
        return bl;
    }

    public void onLayout(boolean bl, int n, int n2, int n3, int n4) {
        super.onLayout(bl, n, n2, n3, n4);
        if (this.isInitializationComplete()) {
            this.initializeViewRect();
            this.initializeBaseMatrix(this.getDrawable());
            this.setImageMatrix();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl = this.isInitializationComplete();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        this.requestDisallowInterceptTouchEvent(true);
        bl = this.scaleGestureDetector.onTouchEvent(motionEvent);
        boolean bl3 = this.gestureDetector.onTouchEvent(motionEvent) || bl;
        if (bl3 || super.onTouchEvent(motionEvent)) {
            bl2 = true;
        }
        return bl2;
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(bl);
        }
    }

    public void reset() {
        this.updateMatrix.reset();
    }

    public void setImageMatrix() {
        this.updateMatrixBounds();
        this.setScaleType(ImageView.ScaleType.MATRIX);
        this.setImageMatrix(this.getDrawMatrix());
    }

    public void setScale(float f, float f2, float f3) {
        this.updateMatrix.postScale(f, f, f2, f3);
    }

    public void setTranslate(float f, float f2) {
        this.updateMatrix.postTranslate(f, f2);
    }

    /*
     * Unable to fully structure code
     */
    public void updateMatrixBounds() {
        var4_1 = this.getDrawRect(this.getDrawMatrix());
        var2_2 = var4_1.height();
        var1_3 = this.viewRect.height();
        var3_4 = 0.0f;
        if (var2_2 <= var1_3) {
            var2_2 = (this.viewRect.height() - var4_1.height()) / 2.0f;
            var1_3 = var4_1.top;
lbl8:
            // 2 sources

            while (true) {
                var2_2 -= var1_3;
                break;
            }
        } else {
            var1_3 = var4_1.top;
            if (var1_3 > 0.0f) {
                var2_2 = -var1_3;
            } else {
                if (var4_1.bottom < this.viewRect.height()) {
                    var2_2 = this.viewRect.height();
                    var1_3 = var4_1.bottom;
                    ** continue;
                }
                var2_2 = 0.0f;
            }
        }
        if (var4_1.width() <= this.viewRect.width()) {
            this.allowIntercept = true;
            var1_3 = (this.viewRect.width() - var4_1.width()) / 2.0f - var4_1.left;
        } else {
            var1_3 = var4_1.left;
            if (var1_3 > 0.0f) {
                this.allowIntercept = true;
                var1_3 = -var1_3;
            } else if (var4_1.right < this.viewRect.width()) {
                this.allowIntercept = true;
                var1_3 = this.viewRect.width() - var4_1.right;
            } else {
                this.allowIntercept = false;
                var1_3 = var3_4;
            }
        }
        this.setTranslate(var1_3, var2_2);
    }
}


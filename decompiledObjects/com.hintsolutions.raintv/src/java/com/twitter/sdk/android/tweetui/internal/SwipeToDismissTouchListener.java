/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.util.Property
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class SwipeToDismissTouchListener
implements View.OnTouchListener {
    private Callback callback;
    private final float closeThreshold;
    private float initialY;
    private boolean isMoving;
    private float lastX;
    private float lastY;
    private final float maxTranslate;
    private int pointerIndex;
    private int touchSlop;

    public SwipeToDismissTouchListener(Callback callback, int n, float f2) {
        this(callback, n, f2, 0.2f * f2);
    }

    public SwipeToDismissTouchListener(Callback callback, int n, float f2, float f3) {
        this.setCallback(callback);
        this.touchSlop = n;
        this.maxTranslate = f2;
        this.closeThreshold = f3;
    }

    public static SwipeToDismissTouchListener createFromView(View view, Callback callback) {
        return new SwipeToDismissTouchListener(callback, ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop(), (float)view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }

    public float bound(float f2) {
        float f3 = this.maxTranslate;
        if (f2 < -f3) {
            return -f3;
        }
        if (f2 > f3) {
            return f3;
        }
        return f2;
    }

    public double calculateTension(float f2) {
        f2 = Math.abs((float)f2);
        float f3 = this.closeThreshold;
        return 1.0 - Math.pow((double)f2, (double)2.0) / Math.pow((double)(f3 * 2.0f), (double)2.0);
    }

    public boolean handleTouchEvent(View view, MotionEvent motionEvent) {
        boolean bl;
        block7: {
            float f2;
            boolean bl2;
            block4: {
                block5: {
                    float f3;
                    block8: {
                        block6: {
                            int n = motionEvent.getActionMasked();
                            bl2 = false;
                            if (n == 0) break block4;
                            if (n == 1) break block5;
                            if (n == 2) break block6;
                            if (n == 3) break block5;
                            if (n != 5) {
                                bl = bl2;
                            } else {
                                this.settleView(view);
                                this.isMoving = false;
                                this.pointerIndex = -1;
                                bl = bl2;
                            }
                            break block7;
                        }
                        float f4 = motionEvent.getRawX();
                        float f5 = motionEvent.getRawY();
                        float f6 = this.initialY;
                        float f7 = this.lastX;
                        f3 = f5 - this.lastY;
                        this.lastX = f4;
                        this.lastY = f5;
                        bl = bl2;
                        if (!this.isValidPointer(motionEvent)) break block7;
                        if (this.isMoving) break block8;
                        bl = bl2;
                        if (!this.hasMovedEnoughInProperYDirection(f5 - f6)) break block7;
                        bl = bl2;
                        if (!this.hasMovedMoreInYDirectionThanX(f4 - f7, f3)) break block7;
                    }
                    this.isMoving = true;
                    this.moveView(view, f3);
                    bl = bl2;
                    break block7;
                }
                bl = this.isValidPointer(motionEvent) && this.isMoving ? this.settleOrCloseView(view) : false;
                this.isMoving = false;
                break block7;
            }
            this.lastX = motionEvent.getRawX();
            this.lastY = f2 = motionEvent.getRawY();
            this.initialY = f2;
            this.isMoving = false;
            this.pointerIndex = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            bl = bl2;
        }
        return bl;
    }

    public boolean hasMovedEnoughInProperYDirection(float f2) {
        boolean bl = Math.abs((float)f2) > (float)this.touchSlop;
        return bl;
    }

    public boolean hasMovedMoreInYDirectionThanX(float f2, float f3) {
        boolean bl = Math.abs((float)f3) > Math.abs((float)f2);
        return bl;
    }

    public boolean isMoving() {
        return this.isMoving;
    }

    public boolean isValidPointer(MotionEvent motionEvent) {
        int n = this.pointerIndex;
        boolean bl = true;
        if (n < 0 || motionEvent.getPointerCount() != 1) {
            bl = false;
        }
        return bl;
    }

    public void moveView(View object, float f2) {
        float f3 = object.getTranslationY();
        double d2 = f2;
        f2 = this.bound(f3 + (float)(this.calculateTension(f3) * d2));
        object.setTranslationY(f2);
        object = this.callback;
        if (object != null) {
            object.onMove(f2);
        }
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl;
        block4: {
            block3: {
                bl = view instanceof SwipeableViewProvider;
                boolean bl2 = false;
                bl = bl && !((SwipeableViewProvider)view).canBeSwiped() && !this.isMoving() ? false : this.handleTouchEvent(view, motionEvent);
                if (bl) break block3;
                bl = bl2;
                if (!view.onTouchEvent(motionEvent)) break block4;
            }
            bl = true;
        }
        return bl;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public boolean settleOrCloseView(View object) {
        float f2;
        float f3 = object.getTranslationY();
        if (!(f3 > (f2 = this.closeThreshold)) && !(f3 < -f2)) {
            this.settleView((View)object);
            return false;
        }
        object = this.callback;
        if (object != null) {
            object.onDismiss();
        }
        return true;
    }

    public void settleView(View view) {
        if (view.getTranslationY() != 0.0f) {
            view = ObjectAnimator.ofFloat((Object)view, (Property)View.TRANSLATION_Y, (float[])new float[]{0.0f}).setDuration(100L);
            view.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
                public final SwipeToDismissTouchListener this$0;
                {
                    this.this$0 = swipeToDismissTouchListener;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                    if (this.this$0.callback != null) {
                        this.this$0.callback.onMove(f2);
                    }
                }
            });
            view.start();
        }
    }

    public static interface Callback {
        public void onDismiss();

        public void onMove(float var1);
    }

    public static interface SwipeableViewProvider {
        public boolean canBeSwiped();
    }
}


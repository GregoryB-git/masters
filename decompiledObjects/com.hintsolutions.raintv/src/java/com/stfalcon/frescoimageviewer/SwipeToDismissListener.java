/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.animation.AccelerateInterpolator
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.stfalcon.frescoimageviewer.OnDismissListener;

class SwipeToDismissListener
implements View.OnTouchListener {
    private static final String PROPERTY_TRANSLATION_X = "translationY";
    private OnDismissListener dismissListener;
    private OnViewMoveListener moveListener;
    private float startY;
    private final View swipeView;
    private boolean tracking = false;
    private int translationLimit;

    public SwipeToDismissListener(View view, OnDismissListener onDismissListener, OnViewMoveListener onViewMoveListener) {
        this.swipeView = view;
        this.dismissListener = onDismissListener;
        this.moveListener = onViewMoveListener;
    }

    /*
     * Unable to fully structure code
     */
    private void animateSwipeView(int var1_1) {
        var3_2 = this.swipeView.getTranslationY();
        if (var3_2 < (float)(-(var4_3 = this.translationLimit))) {
            var1_1 = -var1_1;
            while (true) {
                var2_4 = var1_1;
                break;
            }
        } else {
            if (var3_2 > (float)var4_3) ** continue;
            var2_4 = 0.0f;
        }
        var5_5 = var2_4 != 0.0f;
        var6_6 = ObjectAnimator.ofFloat((Object)this.swipeView, (String)"translationY", (float[])new float[]{var3_2, var2_4});
        var6_6.setDuration(200L);
        var6_6.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
        var6_6.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, var5_5){
            public final SwipeToDismissListener this$0;
            public final boolean val$isDismissed;
            {
                this.this$0 = swipeToDismissListener;
                this.val$isDismissed = bl;
            }

            public void onAnimationEnd(Animator animator2) {
                super.onAnimationEnd(animator2);
                if (this.val$isDismissed) {
                    this.this$0.callDismissListener();
                }
            }
        });
        var6_6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            public final SwipeToDismissListener this$0;
            {
                this.this$0 = swipeToDismissListener;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.callMoveListener(((Float)valueAnimator.getAnimatedValue()).floatValue(), this.this$0.translationLimit);
            }
        });
        var6_6.start();
    }

    private void callDismissListener() {
        OnDismissListener onDismissListener = this.dismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    private void callMoveListener(float f, int n) {
        OnViewMoveListener onViewMoveListener = this.moveListener;
        if (onViewMoveListener != null) {
            onViewMoveListener.onViewMove(f, n);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.translationLimit = view.getHeight() / 4;
        int n = motionEvent.getAction();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return false;
                    }
                } else {
                    if (this.tracking) {
                        float f = motionEvent.getY() - this.startY;
                        this.swipeView.setTranslationY(f);
                        this.callMoveListener(f, this.translationLimit);
                    }
                    return true;
                }
            }
            if (this.tracking) {
                this.tracking = false;
                this.animateSwipeView(view.getHeight());
            }
            return true;
        }
        view = new Rect();
        this.swipeView.getHitRect((Rect)view);
        if (view.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
            this.tracking = true;
        }
        this.startY = motionEvent.getY();
        return true;
    }

    public static interface OnViewMoveListener {
        public void onViewMove(float var1, int var2);
    }
}


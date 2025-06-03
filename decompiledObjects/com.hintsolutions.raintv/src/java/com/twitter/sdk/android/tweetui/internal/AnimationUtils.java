/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

class AnimationUtils {
    public static ViewPropertyAnimator fadeIn(View view, int n) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        view.clearAnimation();
        view = view.animate();
        view.alpha(1.0f).setDuration((long)n).setListener(null);
        return view;
    }

    public static ViewPropertyAnimator fadeOut(View view, int n) {
        if (view.getVisibility() == 0) {
            view.clearAnimation();
            ViewPropertyAnimator viewPropertyAnimator = view.animate();
            viewPropertyAnimator.alpha(0.0f).setDuration((long)n).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(view){
                public final View val$from;
                {
                    this.val$from = view;
                }

                public void onAnimationEnd(Animator animator2) {
                    this.val$from.setVisibility(4);
                    this.val$from.setAlpha(1.0f);
                }
            });
            return viewPropertyAnimator;
        }
        return null;
    }
}


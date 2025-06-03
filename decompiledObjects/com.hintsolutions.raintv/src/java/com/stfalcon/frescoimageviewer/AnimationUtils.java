/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ObjectAnimator
 *  android.view.View
 *  android.view.ViewConfiguration
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewConfiguration;

final class AnimationUtils {
    private AnimationUtils() {
        throw new AssertionError();
    }

    public static void animateVisibility(View view) {
        boolean bl = view.getVisibility() == 0;
        float f = 1.0f;
        float f2 = bl ? 1.0f : 0.0f;
        if (bl) {
            f = 0.0f;
        }
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"alpha", (float[])new float[]{f2, f});
        objectAnimator.setDuration((long)ViewConfiguration.getDoubleTapTimeout());
        if (bl) {
            objectAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(view){
                public final View val$view;
                {
                    this.val$view = view;
                }

                public void onAnimationEnd(Animator animator2) {
                    this.val$view.setVisibility(8);
                }
            });
        } else {
            view.setVisibility(0);
        }
        objectAnimator.start();
    }
}


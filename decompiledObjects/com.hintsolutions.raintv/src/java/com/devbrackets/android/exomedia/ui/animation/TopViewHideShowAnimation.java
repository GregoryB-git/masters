/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.Interpolator
 *  android.view.animation.TranslateAnimation
 *  androidx.interpolator.view.animation.FastOutLinearInInterpolator
 *  androidx.interpolator.view.animation.LinearOutSlowInInterpolator
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.ui.animation;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public class TopViewHideShowAnimation
extends AnimationSet {
    private View animationView;
    private boolean toVisible;

    public TopViewHideShowAnimation(View object, boolean bl, long l) {
        int n = 0;
        super(false);
        this.toVisible = bl;
        this.animationView = object;
        float f2 = 1.0f;
        float f4 = bl ? 0.0f : 1.0f;
        if (!bl) {
            f2 = 0.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f2);
        alphaAnimation.setDuration(l);
        int n2 = bl ? -object.getHeight() : 0;
        if (!bl) {
            n = -object.getHeight();
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)n2, (float)n);
        object = bl ? new LinearOutSlowInInterpolator() : new FastOutLinearInInterpolator();
        translateAnimation.setInterpolator((Interpolator)object);
        translateAnimation.setDuration(l);
        this.addAnimation((Animation)alphaAnimation);
        this.addAnimation((Animation)translateAnimation);
        this.setAnimationListener(new Listener(this, null));
    }

    public class Listener
    implements Animation.AnimationListener {
        public final TopViewHideShowAnimation this$0;

        private Listener(TopViewHideShowAnimation topViewHideShowAnimation) {
            this.this$0 = topViewHideShowAnimation;
        }

        public /* synthetic */ Listener(TopViewHideShowAnimation topViewHideShowAnimation, 1 var2_2) {
            this(topViewHideShowAnimation);
        }

        public void onAnimationEnd(Animation animation) {
            animation = this.this$0.animationView;
            int n = this.this$0.toVisible ? 0 : 8;
            animation.setVisibility(n);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.this$0.animationView.setVisibility(0);
        }
    }
}


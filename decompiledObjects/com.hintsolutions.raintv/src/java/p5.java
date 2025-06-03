/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  androidx.core.view.ViewPropertyAnimatorCompat
 *  androidx.core.view.ViewPropertyAnimatorUpdateListener
 *  java.lang.Object
 */
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;

public final class p5
implements ValueAnimator.AnimatorUpdateListener {
    public final ViewPropertyAnimatorUpdateListener a;
    public final View b;

    public /* synthetic */ p5(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.a = viewPropertyAnimatorUpdateListener;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewPropertyAnimatorCompat.a((ViewPropertyAnimatorUpdateListener)this.a, (View)this.b, (ValueAnimator)valueAnimator);
    }
}


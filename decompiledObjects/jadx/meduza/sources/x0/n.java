package x0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Animation f16714a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimatorSet f16715b;

    public n(Animator animator) {
        this.f16714a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f16715b = animatorSet;
        animatorSet.play(animator);
    }

    public n(Animation animation) {
        this.f16714a = animation;
        this.f16715b = null;
    }
}

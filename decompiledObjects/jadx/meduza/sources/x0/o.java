package x0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class o extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f16716a;

    /* renamed from: b, reason: collision with root package name */
    public final View f16717b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16718c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16719d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16720e;

    public o(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f16720e = true;
        this.f16716a = viewGroup;
        this.f16717b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f16720e = true;
        if (this.f16718c) {
            return !this.f16719d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f16718c = true;
            e0.w.a(this.f16716a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f) {
        this.f16720e = true;
        if (this.f16718c) {
            return !this.f16719d;
        }
        if (!super.getTransformation(j10, transformation, f)) {
            this.f16718c = true;
            e0.w.a(this.f16716a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16718c || !this.f16720e) {
            this.f16716a.endViewTransition(this.f16717b);
            this.f16719d = true;
        } else {
            this.f16720e = false;
            this.f16716a.post(this);
        }
    }
}

package androidx.fragment.app;

import E.c;
import I.ViewTreeObserverOnPreDrawListenerC0420q;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public abstract class f {

    public class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f9412a;

        public a(Fragment fragment) {
            this.f9412a = fragment;
        }

        @Override // E.c.b
        public void a() {
            if (this.f9412a.q() != null) {
                View q7 = this.f9412a.q();
                this.f9412a.u1(null);
                q7.clearAnimation();
            }
            this.f9412a.v1(null);
        }
    }

    public class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9413a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f9414b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w.g f9415c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E.c f9416d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f9414b.q() != null) {
                    b.this.f9414b.u1(null);
                    b bVar = b.this;
                    bVar.f9415c.a(bVar.f9414b, bVar.f9416d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, w.g gVar, E.c cVar) {
            this.f9413a = viewGroup;
            this.f9414b = fragment;
            this.f9415c = gVar;
            this.f9416d = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9413a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9418a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f9419b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f9420c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w.g f9421d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ E.c f9422e;

        public c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, E.c cVar) {
            this.f9418a = viewGroup;
            this.f9419b = view;
            this.f9420c = fragment;
            this.f9421d = gVar;
            this.f9422e = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9418a.endViewTransition(this.f9419b);
            Animator r7 = this.f9420c.r();
            this.f9420c.v1(null);
            if (r7 == null || this.f9418a.indexOfChild(this.f9419b) >= 0) {
                return;
            }
            this.f9421d.a(this.f9420c, this.f9422e);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f9423a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f9424b;

        public d(Animator animator) {
            this.f9423a = null;
            this.f9424b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f9423a = animation;
            this.f9424b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final ViewGroup f9425o;

        /* renamed from: p, reason: collision with root package name */
        public final View f9426p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f9427q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f9428r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f9429s;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f9429s = true;
            this.f9425o = viewGroup;
            this.f9426p = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f9429s = true;
            if (this.f9427q) {
                return !this.f9428r;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f9427q = true;
                ViewTreeObserverOnPreDrawListenerC0420q.a(this.f9425o, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9427q || !this.f9429s) {
                this.f9425o.endViewTransition(this.f9426p);
                this.f9428r = true;
            } else {
                this.f9429s = false;
                this.f9425o.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f9429s = true;
            if (this.f9427q) {
                return !this.f9428r;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f9427q = true;
                ViewTreeObserverOnPreDrawListenerC0420q.a(this.f9425o, this);
            }
            return true;
        }
    }

    public static void a(Fragment fragment, d dVar, w.g gVar) {
        View view = fragment.f9257V;
        ViewGroup viewGroup = fragment.f9256U;
        viewGroup.startViewTransition(view);
        E.c cVar = new E.c();
        cVar.c(new a(fragment));
        gVar.b(fragment, cVar);
        if (dVar.f9423a != null) {
            e eVar = new e(dVar.f9423a, viewGroup, view);
            fragment.u1(fragment.f9257V);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, cVar));
            fragment.f9257V.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f9424b;
        fragment.v1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, cVar));
        animator.setTarget(fragment.f9257V);
        animator.start();
    }

    public static d b(Context context, Fragment fragment, boolean z7) {
        int D7 = fragment.D();
        int C7 = fragment.C();
        fragment.z1(0);
        ViewGroup viewGroup = fragment.f9256U;
        if (viewGroup != null && viewGroup.getTag(U.b.f6290c) != null) {
            fragment.f9256U.setTag(U.b.f6290c, null);
        }
        ViewGroup viewGroup2 = fragment.f9256U;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation n02 = fragment.n0(D7, z7, C7);
        if (n02 != null) {
            return new d(n02);
        }
        Animator o02 = fragment.o0(D7, z7, C7);
        if (o02 != null) {
            return new d(o02);
        }
        if (C7 == 0 && D7 != 0) {
            C7 = c(D7, z7);
        }
        if (C7 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(C7));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, C7);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, C7);
                if (loadAnimator != null) {
                    return new d(loadAnimator);
                }
            } catch (RuntimeException e8) {
                if (equals) {
                    throw e8;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C7);
                if (loadAnimation2 != null) {
                    return new d(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int c(int i7, boolean z7) {
        if (i7 == 4097) {
            return z7 ? U.a.f6286e : U.a.f6287f;
        }
        if (i7 == 4099) {
            return z7 ? U.a.f6284c : U.a.f6285d;
        }
        if (i7 != 8194) {
            return -1;
        }
        return z7 ? U.a.f6282a : U.a.f6283b;
    }
}

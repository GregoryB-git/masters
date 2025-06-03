// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import I.q;
import android.view.animation.Transformation;
import android.view.animation.AnimationSet;
import U.a;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import U.b;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator;
import android.view.View;
import E.c;

public abstract class f
{
    public static void a(final Fragment fragment, final d d, final w.g g) {
        final View v = fragment.V;
        final ViewGroup u = fragment.U;
        u.startViewTransition(v);
        final c c = new c();
        c.c((c.b)new c.b() {
            @Override
            public void a() {
                if (fragment.q() != null) {
                    final View q = fragment.q();
                    fragment.u1(null);
                    q.clearAnimation();
                }
                fragment.v1(null);
            }
        });
        g.b(fragment, c);
        if (d.a != null) {
            final e e = new e(d.a, u, v);
            fragment.u1(fragment.V);
            ((Animation)e).setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                public void onAnimationEnd(final Animation animation) {
                    ((View)u).post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            if (fragment.q() != null) {
                                fragment.u1(null);
                                final Animation$AnimationListener o = (Animation$AnimationListener)Animation$AnimationListener.this;
                                g.a(fragment, c);
                            }
                        }
                    });
                }
                
                public void onAnimationRepeat(final Animation animation) {
                }
                
                public void onAnimationStart(final Animation animation) {
                }
            });
            fragment.V.startAnimation((Animation)e);
            return;
        }
        final Animator b = d.b;
        fragment.v1(b);
        b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator r) {
                u.endViewTransition(v);
                r = fragment.r();
                fragment.v1(null);
                if (r != null && u.indexOfChild(v) < 0) {
                    g.a(fragment, c);
                }
            }
        });
        b.setTarget((Object)fragment.V);
        b.start();
    }
    
    public static d b(final Context context, final Fragment fragment, boolean equals) {
        final int d = fragment.D();
        final int c = fragment.C();
        fragment.z1(0);
        final ViewGroup u = fragment.U;
        if (u != null && ((View)u).getTag(b.c) != null) {
            ((View)fragment.U).setTag(b.c, (Object)null);
        }
        final ViewGroup u2 = fragment.U;
        if (u2 != null && u2.getLayoutTransition() != null) {
            return null;
        }
        final Animation n0 = fragment.n0(d, equals, c);
        if (n0 != null) {
            return new d(n0);
        }
        final Animator o0 = fragment.o0(d, equals, c);
        if (o0 != null) {
            return new d(o0);
        }
        int c2;
        if ((c2 = c) == 0) {
            c2 = c;
            if (d != 0) {
                c2 = c(d, equals);
            }
        }
        if (c2 == 0) {
            goto Label_0236;
        }
        equals = "anim".equals(context.getResources().getResourceTypeName(c2));
        if (equals) {
            try {
                final Animation loadAnimation = AnimationUtils.loadAnimation(context, c2);
                if (loadAnimation != null) {
                    return new d(loadAnimation);
                }
                goto Label_0236;
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            catch (RuntimeException ex2) {}
        }
        try {
            final Animator loadAnimator = AnimatorInflater.loadAnimator(context, c2);
            if (loadAnimator != null) {
                return new d(loadAnimator);
            }
            goto Label_0236;
        }
        catch (RuntimeException ex3) {}
    }
    
    public static int c(final int n, final boolean b) {
        if (n != 4097) {
            if (n != 4099) {
                if (n != 8194) {
                    return -1;
                }
                if (b) {
                    return a.a;
                }
                return a.b;
            }
            else {
                if (b) {
                    return a.c;
                }
                return a.d;
            }
        }
        else {
            if (b) {
                return a.e;
            }
            return a.f;
        }
    }
    
    public static class d
    {
        public final Animation a;
        public final Animator b;
        
        public d(final Animator b) {
            this.a = null;
            this.b = b;
            if (b != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }
        
        public d(final Animation a) {
            this.a = a;
            this.b = null;
            if (a != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }
    
    public static class e extends AnimationSet implements Runnable
    {
        public final ViewGroup o;
        public final View p;
        public boolean q;
        public boolean r;
        public boolean s;
        
        public e(final Animation animation, final ViewGroup o, final View p3) {
            super(false);
            this.s = true;
            this.o = o;
            this.p = p3;
            this.addAnimation(animation);
            ((View)o).post((Runnable)this);
        }
        
        public boolean getTransformation(final long n, final Transformation transformation) {
            this.s = true;
            if (this.q) {
                return this.r ^ true;
            }
            if (!super.getTransformation(n, transformation)) {
                this.q = true;
                I.q.a((View)this.o, this);
            }
            return true;
        }
        
        public boolean getTransformation(final long n, final Transformation transformation, final float n2) {
            this.s = true;
            if (this.q) {
                return this.r ^ true;
            }
            if (!super.getTransformation(n, transformation, n2)) {
                this.q = true;
                I.q.a((View)this.o, this);
            }
            return true;
        }
        
        public void run() {
            if (!this.q && this.s) {
                this.s = false;
                ((View)this.o).post((Runnable)this);
                return;
            }
            this.o.endViewTransition(this.p);
            this.r = true;
        }
    }
}

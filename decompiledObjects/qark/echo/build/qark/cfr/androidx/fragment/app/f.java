/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Transformation
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package androidx.fragment.app;

import E.c;
import I.q;
import U.a;
import U.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;

public abstract class f {
    public static void a(final Fragment fragment, d object, final w.g g8) {
        final View view = fragment.V;
        ViewGroup viewGroup = fragment.U;
        viewGroup.startViewTransition(view);
        final c c8 = new c();
        c8.c(new c.b(){

            @Override
            public void a() {
                if (Fragment.this.q() != null) {
                    View view = Fragment.this.q();
                    Fragment.this.u1(null);
                    view.clearAnimation();
                }
                Fragment.this.v1(null);
            }
        });
        g8.b(fragment, c8);
        if (object.a != null) {
            object = new e(object.a, viewGroup, view);
            fragment.u1(fragment.V);
            object.setAnimationListener(new Animation.AnimationListener(){

                public void onAnimationEnd(Animation animation) {
                    ViewGroup.this.post(new Runnable(){

                        public void run() {
                            if (fragment.q() != null) {
                                fragment.u1(null);
                                 b8 = b.this;
                                b8.g8.a(b8.fragment, b8.c8);
                            }
                        }
                    });
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

            });
            fragment.V.startAnimation((Animation)object);
            return;
        }
        object = object.b;
        fragment.v1((Animator)object);
        object.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

            public void onAnimationEnd(Animator animator) {
                ViewGroup.this.endViewTransition(view);
                animator = fragment.r();
                fragment.v1(null);
                if (animator != null && ViewGroup.this.indexOfChild(view) < 0) {
                    g8.a(fragment, c8);
                }
            }
        });
        object.setTarget((Object)fragment.V);
        object.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d b(Context context, Fragment object, boolean bl) {
        int n8 = object.D();
        int n9 = object.C();
        object.z1(0);
        ViewGroup viewGroup = object.U;
        if (viewGroup != null && viewGroup.getTag(b.c) != null) {
            object.U.setTag(b.c, (Object)null);
        }
        if ((viewGroup = object.U) != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        viewGroup = object.n0(n8, bl, n9);
        if (viewGroup != null) {
            return new d((Animation)viewGroup);
        }
        if ((object = object.o0(n8, bl, n9)) != null) {
            return new d((Animator)object);
        }
        int n10 = n9;
        if (n9 == 0) {
            n10 = n9;
            if (n8 != 0) {
                n10 = f.c(n8, bl);
            }
        }
        if (n10 == 0) return null;
        bl = "anim".equals((Object)context.getResources().getResourceTypeName(n10));
        if (bl) {
            try {
                object = AnimationUtils.loadAnimation((Context)context, (int)n10);
                if (object == null) return null;
                return new d((Animation)object);
            }
            catch (Resources.NotFoundException notFoundException) {
                throw notFoundException;
            }
            catch (RuntimeException runtimeException) {}
        }
        try {
            object = AnimatorInflater.loadAnimator((Context)context, (int)n10);
            if (object == null) return null;
            return new d((Animator)object);
        }
        catch (RuntimeException runtimeException) {
            if (bl) {
                throw runtimeException;
            }
            if ((context = AnimationUtils.loadAnimation((Context)context, (int)n10)) == null) return null;
            return new d((Animation)context);
        }
    }

    public static int c(int n8, boolean bl) {
        if (n8 != 4097) {
            if (n8 != 4099) {
                if (n8 != 8194) {
                    return -1;
                }
                if (bl) {
                    return a.a;
                }
                return a.b;
            }
            if (bl) {
                return a.c;
            }
            return a.d;
        }
        if (bl) {
            return a.e;
        }
        return a.f;
    }

    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        public d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    public static class e
    extends AnimationSet
    implements Runnable {
        public final ViewGroup o;
        public final View p;
        public boolean q;
        public boolean r;
        public boolean s = true;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.o = viewGroup;
            this.p = view;
            this.addAnimation(animation);
            viewGroup.post((Runnable)this);
        }

        public boolean getTransformation(long l8, Transformation transformation) {
            this.s = true;
            if (this.q) {
                return this.r ^ true;
            }
            if (!super.getTransformation(l8, transformation)) {
                this.q = true;
                q.a((View)this.o, this);
            }
            return true;
        }

        public boolean getTransformation(long l8, Transformation transformation, float f8) {
            this.s = true;
            if (this.q) {
                return this.r ^ true;
            }
            if (!super.getTransformation(l8, transformation, f8)) {
                this.q = true;
                q.a((View)this.o, this);
            }
            return true;
        }

        public void run() {
            if (!this.q && this.s) {
                this.s = false;
                this.o.post((Runnable)this);
                return;
            }
            this.o.endViewTransition(this.p);
            this.r = true;
        }
    }

}


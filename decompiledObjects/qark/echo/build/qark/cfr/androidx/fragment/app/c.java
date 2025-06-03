/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package androidx.fragment.app;

import E.c;
import H.e;
import I.q;
import I.s;
import I.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.B;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public class c
extends B {
    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f(List list, boolean bl) {
        B.e e8;
        Object object;
        Iterator iterator = list.iterator();
        B.e e9 = null;
        B.e e10 = null;
        while (iterator.hasNext()) {
            e8 = (B.e)iterator.next();
            object = B.e.c.h(e8.f().V);
            int n8 = .a[e8.e().ordinal()];
            if (n8 != 1 && n8 != 2 && n8 != 3) {
                if (n8 != 4 || object == B.e.c.p) continue;
                e10 = e8;
                continue;
            }
            if (object != B.e.c.p || e9 != null) continue;
            e9 = e8;
        }
        iterator = new ArrayList();
        object = new ArrayList();
        e8 = new ArrayList((Collection)list);
        for (B.e e11 : list) {
            E.c c8 = new E.c();
            e11.j(c8);
            iterator.add((Object)new k(e11, c8));
            c8 = new E.c();
            e11.j(c8);
            boolean bl2 = false;
            if (bl ? e11 == e9 : e11 == e10) {
                bl2 = true;
            }
            object.add((Object)new m(e11, c8, bl, bl2));
            e11.a(new Runnable((List)e8, e11){
                public final /* synthetic */ List o;
                public final /* synthetic */ B.e p;
                {
                    this.o = list;
                    this.p = e8;
                }

                public void run() {
                    if (this.o.contains((Object)this.p)) {
                        this.o.remove((Object)this.p);
                        c.this.s(this.p);
                    }
                }
            });
        }
        list = this.x((List)object, bl, e9, e10);
        this.w((List)iterator, (List)e8, list.containsValue((Object)Boolean.TRUE), (Map)list);
        list = e8.iterator();
        do {
            if (!list.hasNext()) {
                e8.clear();
                return;
            }
            this.s((B.e)list.next());
        } while (true);
    }

    public void s(B.e e8) {
        View view = e8.f().V;
        e8.e().c(view);
    }

    public void t(ArrayList arrayList, View view) {
        View view2 = view;
        if (view instanceof ViewGroup && !v.a((ViewGroup)(view2 = (ViewGroup)view))) {
            int n8 = view2.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                view = view2.getChildAt(i8);
                if (view.getVisibility() != 0) continue;
                this.t(arrayList, view);
            }
        } else {
            arrayList.add((Object)view2);
        }
    }

    public void u(Map map, View view) {
        String string2 = s.q(view);
        if (string2 != null) {
            map.put((Object)string2, (Object)view);
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            int n8 = view.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                string2 = view.getChildAt(i8);
                if (string2.getVisibility() != 0) continue;
                this.u(map, (View)string2);
            }
        }
    }

    public void v(a a8, Collection collection) {
        a8 = a8.entrySet().iterator();
        while (a8.hasNext()) {
            if (collection.contains((Object)s.q((View)((Map.Entry)a8.next()).getValue()))) continue;
            a8.remove();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(List object, List object2, boolean bl, Map map) {
        k k8;
        final ViewGroup viewGroup = this.m();
        Context context = viewGroup.getContext();
        Object object3 = new ArrayList();
        object = object.iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            f.d d8;
            k8 = (k)object.next();
            if (k8.d() || (d8 = k8.e(context)) == null) {
                k8.a();
                continue;
            }
            d8 = d8.b;
            if (d8 == null) {
                object3.add((Object)k8);
                continue;
            }
            B.e e8 = k8.b();
            Fragment fragment = e8.f();
            if (Boolean.TRUE.equals(map.get((Object)e8))) {
                if (n.D0(2)) {
                    d8 = new StringBuilder();
                    d8.append("Ignoring Animator set on ");
                    d8.append((Object)fragment);
                    d8.append(" as this Fragment was involved in a Transition.");
                    Log.v((String)"FragmentManager", (String)d8.toString());
                }
                k8.a();
                continue;
            }
            boolean bl3 = e8.e() == B.e.c.q;
            if (bl3) {
                object2.remove((Object)e8);
            }
            fragment = fragment.V;
            viewGroup.startViewTransition((View)fragment);
            d8.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter((View)fragment, bl3, e8, k8){
                public final /* synthetic */ View b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ B.e d;
                public final /* synthetic */ k e;
                {
                    this.b = view;
                    this.c = bl;
                    this.d = e8;
                    this.e = k8;
                }

                public void onAnimationEnd(Animator animator) {
                    viewGroup.endViewTransition(this.b);
                    if (this.c) {
                        this.d.e().c(this.b);
                    }
                    this.e.a();
                }
            });
            d8.setTarget((Object)fragment);
            d8.start();
            k8.c().c(new c.b((Animator)d8){
                public final /* synthetic */ Animator a;
                {
                    this.a = animator;
                }

                @Override
                public void a() {
                    this.a.end();
                }
            });
            bl2 = true;
        }
        map = object3.iterator();
        do {
            block16 : {
                block14 : {
                    block15 : {
                        block13 : {
                            if (!map.hasNext()) {
                                return;
                            }
                            object3 = (k)map.next();
                            object = object3.b();
                            object2 = object.f();
                            if (!bl) break block13;
                            if (!n.D0(2)) break block14;
                            object = new StringBuilder();
                            object.append("Ignoring Animation set on ");
                            object.append(object2);
                            object2 = " as Animations cannot run alongside Transitions.";
                            break block15;
                        }
                        if (!bl2) break block16;
                        if (!n.D0(2)) break block14;
                        object = new StringBuilder();
                        object.append("Ignoring Animation set on ");
                        object.append(object2);
                        object2 = " as Animations cannot run alongside Animators.";
                    }
                    object.append((String)object2);
                    Log.v((String)"FragmentManager", (String)object.toString());
                }
                object3.a();
                continue;
            }
            object2 = object2.V;
            k8 = (Animation)e.b((Object)((f.d)e.b((Object)object3.e((Context)context))).a);
            if (object.e() != B.e.c.o) {
                object2.startAnimation((Animation)k8);
                object3.a();
            } else {
                viewGroup.startViewTransition((View)object2);
                object = new f.e((Animation)k8, viewGroup, (View)object2);
                object.setAnimationListener(new Animation.AnimationListener((View)object2, (k)object3){
                    public final /* synthetic */ View b;
                    public final /* synthetic */ k c;
                    {
                        this.b = view;
                        this.c = k8;
                    }

                    public void onAnimationEnd(Animation animation) {
                        viewGroup.post(new Runnable(){

                            public void run() {
                                 e8 = e.this;
                                e8.viewGroup.endViewTransition(e8.b);
                                e.this.c.a();
                            }
                        });
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                });
                object2.startAnimation((Animation)object);
            }
            object3.c().c(new c.b((View)object2, viewGroup, (k)object3){
                public final /* synthetic */ View a;
                public final /* synthetic */ ViewGroup b;
                public final /* synthetic */ k c;
                {
                    this.a = view;
                    this.b = viewGroup;
                    this.c = k8;
                }

                @Override
                public void a() {
                    this.a.clearAnimation();
                    this.b.endViewTransition(this.a);
                    this.c.a();
                }
            });
        } while (true);
    }

    public final Map x(List list, boolean bl, B.e object11, B.e object22) {
        Object object3;
        Object object4;
        int n8;
        Object object5;
        Object object6;
        ArrayList arrayList;
        Object object7 = object11;
        Object object8 = object22;
        HashMap hashMap = new HashMap();
        Object object9 = list.iterator();
        Object object10 = null;
        while (object9.hasNext()) {
            object5 = (m)object9.next();
            if (object5.d()) continue;
            object4 = object5.e();
            if (object10 == null) {
                object10 = object4;
                continue;
            }
            if (object4 == null || object10 == object4) continue;
            list = new StringBuilder();
            list.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            list.append((Object)object5.b().f());
            list.append(" returned Transition ");
            list.append(object5.h());
            list.append(" which uses a different Transition  type than other Fragments.");
            throw new IllegalArgumentException(list.toString());
        }
        if (object10 == null) {
            for (Object object11 : list) {
                hashMap.put((Object)object11.b(), (Object)Boolean.FALSE);
                object11.a();
            }
            return hashMap;
        }
        object4 = new View(this.m().getContext());
        Rect rect = new Rect();
        object9 = new ArrayList();
        object5 = new ArrayList();
        a a8 = new a();
        Object object12 = list.iterator();
        Object object13 = null;
        Object object14 = null;
        int n9 = 0;
        Object object15 = object10;
        object10 = object14;
        do {
            int n10;
            boolean bl2 = bl;
            if (!object12.hasNext()) break;
            object14 = (m)object12.next();
            if (!object14.i() || object7 == null || object8 == null) continue;
            object14 = object15.B(object15.g(object14.g()));
            arrayList = object22.f().N();
            object3 = object11.f().N();
            object13 = object11.f().O();
            for (n8 = 0; n8 < object13.size(); ++n8) {
                n10 = arrayList.indexOf(object13.get(n8));
                if (n10 == -1) continue;
                arrayList.set(n10, object3.get(n8));
            }
            object13 = object22.f().O();
            object3 = object11.f();
            if (!bl2) {
                object3.x();
                object22.f().v();
            } else {
                object3.v();
                object22.f().x();
            }
            n8 = arrayList.size();
            for (n10 = 0; n10 < n8; ++n10) {
                a8.put((String)arrayList.get(n10), (String)object13.get(n10));
            }
            object6 = new a();
            this.u((Map)object6, object11.f().V);
            object6.p((Collection)arrayList);
            a8.p((Collection)object6.keySet());
            object3 = new a();
            this.u((Map)object3, object22.f().V);
            object3.p((Collection)object13);
            object3.p(a8.values());
            w.x(a8, (a)object3);
            this.v((a)object6, (Collection)a8.keySet());
            this.v((a)object3, a8.values());
            if (a8.isEmpty()) {
                object9.clear();
                object5.clear();
                object13 = null;
                continue;
            }
            w.f(object22.f(), object11.f(), bl2, (a)object6, true);
            q.a((View)this.m(), new Runnable((B.e)object22, (B.e)object11, bl, (a)object3){
                public final /* synthetic */ B.e o;
                public final /* synthetic */ B.e p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ a r;
                {
                    this.o = e8;
                    this.p = e9;
                    this.q = bl;
                    this.r = a8;
                }

                public void run() {
                    w.f(this.o.f(), this.p.f(), this.q, this.r, false);
                }
            });
            object8 = object6.values().iterator();
            while (object8.hasNext()) {
                this.t((ArrayList)object9, (View)object8.next());
            }
            if (!arrayList.isEmpty()) {
                object10 = (View)object6.get((String)arrayList.get(0));
                object15.v(object14, (View)object10);
            }
            object8 = object3.values().iterator();
            while (object8.hasNext()) {
                this.t((ArrayList)object5, (View)object8.next());
            }
            n8 = n9;
            if (!object13.isEmpty()) {
                object8 = (View)object3.get((String)object13.get(0));
                n8 = n9;
                if (object8 != null) {
                    q.a((View)this.m(), new Runnable((y)object15, (View)object8, rect){
                        public final /* synthetic */ y o;
                        public final /* synthetic */ View p;
                        public final /* synthetic */ Rect q;
                        {
                            this.o = y8;
                            this.p = view;
                            this.q = rect;
                        }

                        public void run() {
                            this.o.k(this.p, this.q);
                        }
                    });
                    n8 = 1;
                }
            }
            object15.z(object14, (View)object4, (ArrayList)object9);
            object15.t(object14, null, null, null, null, object14, (ArrayList)object5);
            object13 = Boolean.TRUE;
            object7 = object11;
            hashMap.put(object7, object13);
            object8 = object22;
            hashMap.put(object8, object13);
            object13 = object14;
            n9 = n8;
        } while (true);
        object14 = object5;
        object12 = object9;
        arrayList = new ArrayList();
        object3 = list.iterator();
        object22 = null;
        object11 = null;
        object9 = object10;
        object10 = object8;
        object5 = object4;
        object4 = object12;
        object8 = object14;
        while (object3.hasNext()) {
            object6 = (m)object3.next();
            if (object6.d()) {
                hashMap.put((Object)object6.b(), (Object)Boolean.FALSE);
                object6.a();
                continue;
            }
            Object object16 = object15.g(object6.h());
            object14 = object6.b();
            n8 = object13 != null && (object14 == object7 || object14 == object10) ? 1 : 0;
            if (object16 == null) {
                if (n8 != 0) continue;
                hashMap.put(object14, (Object)Boolean.FALSE);
                object6.a();
                continue;
            }
            final ArrayList arrayList2 = new ArrayList();
            this.t(arrayList2, object14.f().V);
            if (n8 != 0) {
                if (object14 == object7) {
                    arrayList2.removeAll((Collection)object4);
                } else {
                    arrayList2.removeAll((Collection)object8);
                }
            }
            if (arrayList2.isEmpty()) {
                object15.a(object16, (View)object5);
            } else {
                object15.b(object16, arrayList2);
                object12 = object14;
                object15.t(object16, object16, arrayList2, null, null, null, null);
                if (object12.e() == B.e.c.q) {
                    object15.r(object16, object12.f().V, arrayList2);
                    q.a((View)this.m(), new Runnable(){

                        public void run() {
                            w.A(arrayList2, 4);
                        }
                    });
                }
            }
            if (object14.e() == B.e.c.p) {
                arrayList.addAll((Collection)arrayList2);
                if (n9 != 0) {
                    object15.u(object16, rect);
                }
            } else {
                object15.v(object16, (View)object9);
            }
            hashMap.put(object14, (Object)Boolean.TRUE);
            if (object6.j()) {
                object11 = object15.n(object11, object16, null);
                continue;
            }
            object22 = object15.n(object22, object16, null);
        }
        object11 = object15.m(object11, object22, object13);
        for (Object object22 : list) {
            if (object22.d()) continue;
            object9 = object22.h();
            object5 = object22.b();
            n9 = object13 != null && (object5 == object7 || object5 == object10) ? 1 : 0;
            if (object9 == null && n9 == 0) continue;
            object15.w(object22.b().f(), object11, object22.c(), new Runnable((m)object22){
                public final /* synthetic */ m o;
                {
                    this.o = m8;
                }

                public void run() {
                    this.o.a();
                }
            });
        }
        w.A(arrayList, 4);
        list = object15.o((ArrayList)object8);
        object15.c(this.m(), object11);
        object15.y((View)this.m(), (ArrayList)object4, (ArrayList)object8, (ArrayList)list, a8);
        w.A(arrayList, 0);
        object15.A(object13, (ArrayList)object4, (ArrayList)object8);
        return hashMap;
    }

    public static class k
    extends l {
        public boolean c = false;
        public f.d d;

        public k(B.e e8, E.c c8) {
            super(e8, c8);
        }

        public f.d e(Context object) {
            if (this.c) {
                return this.d;
            }
            Fragment fragment = this.b().f();
            boolean bl = this.b().e() == B.e.c.p;
            this.d = object = f.b((Context)object, fragment, bl);
            this.c = true;
            return object;
        }
    }

    public static abstract class l {
        public final B.e a;
        public final E.c b;

        public l(B.e e8, E.c c8) {
            this.a = e8;
            this.b = c8;
        }

        public void a() {
            this.a.d(this.b);
        }

        public B.e b() {
            return this.a;
        }

        public E.c c() {
            return this.b;
        }

        public boolean d() {
            B.e.c c8;
            B.e.c c9;
            B.e.c c10 = B.e.c.h(this.a.f().V);
            if (c10 != (c9 = this.a.e()) && (c10 == (c8 = B.e.c.p) || c9 == c8)) {
                return false;
            }
            return true;
        }
    }

    public static class m
    extends l {
        public final Object c;
        public final boolean d;
        public final Object e;

        /*
         * Enabled aggressive block sorting
         */
        public m(B.e object, E.c object2, boolean bl, boolean bl2) {
            boolean bl3;
            super((B.e)object, (E.c)object2);
            if (object.e() == B.e.c.p) {
                object2 = object.f();
                object2 = bl ? object2.H() : object2.u();
                this.c = object2;
                object2 = object.f();
                bl3 = bl ? object2.p() : object2.o();
            } else {
                object2 = object.f();
                object2 = bl ? object2.K() : object2.w();
                this.c = object2;
                bl3 = true;
            }
            this.d = bl3;
            if (bl2) {
                object = object.f();
                object = bl ? object.M() : object.L();
            } else {
                object = null;
            }
            this.e = object;
        }

        public y e() {
            y y8 = this.f(this.c);
            y y9 = this.f(this.e);
            if (y8 != null && y9 != null && y8 != y9) {
                y8 = new StringBuilder();
                y8.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                y8.append((Object)this.b().f());
                y8.append(" returned Transition ");
                y8.append(this.c);
                y8.append(" which uses a different Transition  type than its shared element transition ");
                y8.append(this.e);
                throw new IllegalArgumentException(y8.toString());
            }
            if (y8 != null) {
                return y8;
            }
            return y9;
        }

        public final y f(Object object) {
            if (object == null) {
                return null;
            }
            y y8 = w.b;
            if (y8 != null && y8.e(object)) {
                return y8;
            }
            y8 = w.c;
            if (y8 != null && y8.e(object)) {
                return y8;
            }
            y8 = new StringBuilder();
            y8.append("Transition ");
            y8.append(object);
            y8.append(" for fragment ");
            y8.append((Object)this.b().f());
            y8.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(y8.toString());
        }

        public Object g() {
            return this.e;
        }

        public Object h() {
            return this.c;
        }

        public boolean i() {
            if (this.e != null) {
                return true;
            }
            return false;
        }

        public boolean j() {
            return this.d;
        }
    }

}


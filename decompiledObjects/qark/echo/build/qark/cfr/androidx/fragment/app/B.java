/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.fragment.app;

import E.c;
import I.s;
import U.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class B {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public B(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static B n(ViewGroup viewGroup, n n8) {
        return B.o(viewGroup, n8.x0());
    }

    public static B o(ViewGroup viewGroup, C object) {
        Object object2 = viewGroup.getTag(b.b);
        if (object2 instanceof B) {
            return (B)object2;
        }
        object = object.a(viewGroup);
        viewGroup.setTag(b.b, object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(e.c object, e.b b8, t t8) {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            try {
                c c8 = new c();
                e e8 = this.h(t8.k());
                if (e8 != null) {
                    e8.k((e.c)((Object)object), b8);
                    return;
                }
                object = new d((e.c)((Object)object), b8, t8, c8);
                this.b.add(object);
                object.a(new Runnable((d)object){
                    public final /* synthetic */ d o;
                    {
                        this.o = d8;
                    }

                    public void run() {
                        if (B.this.b.contains((Object)this.o)) {
                            this.o.e().c(this.o.f().V);
                        }
                    }
                });
                object.a(new Runnable((d)object){
                    public final /* synthetic */ d o;
                    {
                        this.o = d8;
                    }

                    public void run() {
                        B.this.b.remove((Object)this.o);
                        B.this.c.remove((Object)this.o);
                    }
                });
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void b(e.c c8, t t8) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            stringBuilder.append((Object)t8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(c8, e.b.p, t8);
    }

    public void c(t t8) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            stringBuilder.append((Object)t8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.q, e.b.o, t8);
    }

    public void d(t t8) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            stringBuilder.append((Object)t8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.o, e.b.q, t8);
    }

    public void e(t t8) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            stringBuilder.append((Object)t8.k());
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.a(e.c.p, e.b.o, t8);
    }

    public abstract void f(List var1, boolean var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        if (this.e) {
            return;
        }
        if (!s.t((View)this.a)) {
            this.j();
            this.d = false;
            return;
        }
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            try {
                if (!this.b.isEmpty()) {
                    e e82;
                    ArrayList arrayList2 = new ArrayList((Collection)this.c);
                    this.c.clear();
                    for (e e82 : arrayList2) {
                        if (n.D0(2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("SpecialEffectsController: Cancelling operation ");
                            stringBuilder.append((Object)e82);
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        e82.b();
                        if (e82.i()) continue;
                        this.c.add((Object)e82);
                    }
                    this.q();
                    arrayList2 = new ArrayList((Collection)this.b);
                    this.b.clear();
                    this.c.addAll((Collection)arrayList2);
                    e82 = arrayList2.iterator();
                    while (e82.hasNext()) {
                        ((e)e82.next()).l();
                    }
                    this.f((List)arrayList2, this.d);
                    this.d = false;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final e h(Fragment fragment) {
        for (e e8 : this.b) {
            if (!e8.f().equals(fragment) || e8.h()) continue;
            return e8;
        }
        return null;
    }

    public final e i(Fragment fragment) {
        for (e e8 : this.c) {
            if (!e8.f().equals(fragment) || e8.h()) continue;
            return e8;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() {
        boolean bl = s.t((View)this.a);
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            try {
                StringBuilder stringBuilder;
                this.q();
                Object object = this.b.iterator();
                while (object.hasNext()) {
                    ((e)object.next()).l();
                }
                for (e e8 : new ArrayList((Collection)this.c)) {
                    if (n.D0(2)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("SpecialEffectsController: ");
                        if (bl) {
                            object = "";
                        } else {
                            object = new StringBuilder();
                            object.append("Container ");
                            object.append((Object)this.a);
                            object.append(" is not attached to window. ");
                            object = object.toString();
                        }
                        stringBuilder.append((String)object);
                        stringBuilder.append("Cancelling running operation ");
                        stringBuilder.append((Object)e8);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    e8.b();
                }
                Iterator iterator = new ArrayList((Collection)this.b).iterator();
                do {
                    e e8;
                    if (!iterator.hasNext()) {
                        return;
                    }
                    e8 = (e)iterator.next();
                    if (n.D0(2)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("SpecialEffectsController: ");
                        if (bl) {
                            object = "";
                        } else {
                            object = new StringBuilder();
                            object.append("Container ");
                            object.append((Object)this.a);
                            object.append(" is not attached to window. ");
                            object = object.toString();
                        }
                        stringBuilder.append((String)object);
                        stringBuilder.append("Cancelling pending operation ");
                        stringBuilder.append((Object)e8);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    e8.b();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void k() {
        if (this.e) {
            this.e = false;
            this.g();
        }
    }

    public e.b l(t object) {
        e e8 = this.h(object.k());
        if (e8 != null) {
            return e8.g();
        }
        if ((object = this.i(object.k())) != null) {
            return object.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void p() {
        block6 : {
            block7 : {
                var2_1 = this.b;
                // MONITORENTER : var2_1
                this.q();
                this.e = false;
                var1_2 = this.b.size() - 1;
lbl7: // 2 sources:
                if (var1_2 < 0) break block6;
                var3_3 = (e)this.b.get(var1_2);
                var4_5 = e.c.h(var3_3.f().V);
                var5_6 = var3_3.e();
                if (var5_6 != (var6_7 = e.c.p) || var4_5 == var6_7) break block7;
                this.e = var3_3.f().a0();
                return;
            }
            --var1_2;
            ** GOTO lbl7
        }
        // MONITOREXIT : var2_1
    }

    public final void q() {
        for (e e8 : this.b) {
            if (e8.g() != e.b.p) continue;
            e8.k(e.c.e(e8.f().q1().getVisibility()), e.b.o);
        }
    }

    public void r(boolean bl) {
        this.d = bl;
    }

    public static class d
    extends e {
        public final t h;

        public d(e.c c8, e.b b8, t t8, c c9) {
            super(c8, b8, t8.k(), c9);
            this.h = t8;
        }

        @Override
        public void c() {
            super.c();
            this.h.m();
        }

        @Override
        public void l() {
            Fragment fragment = this.h.k();
            View view = fragment.V.findFocus();
            if (view != null) {
                fragment.x1(view);
                if (n.D0(2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("requestFocus: Saved focused view ");
                    stringBuilder.append((Object)view);
                    stringBuilder.append(" for Fragment ");
                    stringBuilder.append((Object)fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
            }
            if (this.g() == e.b.p) {
                view = this.f().q1();
                if (view.getParent() == null) {
                    this.h.b();
                    view.setAlpha(0.0f);
                }
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    view.setVisibility(4);
                }
                view.setAlpha(fragment.G());
            }
        }
    }

    public static abstract class e {
        public c a;
        public b b;
        public final Fragment c;
        public final List d = new ArrayList();
        public final HashSet e = new HashSet();
        public boolean f = false;
        public boolean g = false;

        public e(c c8, b b8, Fragment fragment, E.c c9) {
            this.a = c8;
            this.b = b8;
            this.c = fragment;
            c9.c(new c.b(){

                @Override
                public void a() {
                    e.this.b();
                }
            });
        }

        public final void a(Runnable runnable) {
            this.d.add((Object)runnable);
        }

        public final void b() {
            if (this.h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                this.c();
                return;
            }
            Iterator iterator = new ArrayList((Collection)this.e).iterator();
            while (iterator.hasNext()) {
                ((E.c)iterator.next()).a();
            }
        }

        public void c() {
            StringBuilder stringBuilder;
            if (this.g) {
                return;
            }
            if (n.D0(2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("SpecialEffectsController: ");
                stringBuilder.append((Object)this);
                stringBuilder.append(" has called complete.");
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            this.g = true;
            stringBuilder = this.d.iterator();
            while (stringBuilder.hasNext()) {
                ((Runnable)stringBuilder.next()).run();
            }
        }

        public final void d(E.c c8) {
            if (this.e.remove((Object)c8) && this.e.isEmpty()) {
                this.c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        public b g() {
            return this.b;
        }

        public final boolean h() {
            return this.f;
        }

        public final boolean i() {
            return this.g;
        }

        public final void j(E.c c8) {
            this.l();
            this.e.add((Object)c8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void k(c enum_, b b8) {
            int n8 = androidx.fragment.app.B$c.b[b8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return;
                    }
                    if (this.a == c.o) return;
                    {
                        if (n.D0(2)) {
                            b8 = new StringBuilder();
                            b8.append("SpecialEffectsController: For fragment ");
                            b8.append((Object)this.c);
                            b8.append(" mFinalState = ");
                            b8.append((Object)this.a);
                            b8.append(" -> ");
                            b8.append((Object)enum_);
                            b8.append(". ");
                            Log.v((String)"FragmentManager", (String)b8.toString());
                        }
                        this.a = enum_;
                        return;
                    }
                }
                if (n.D0(2)) {
                    enum_ = new StringBuilder();
                    enum_.append("SpecialEffectsController: For fragment ");
                    enum_.append((Object)this.c);
                    enum_.append(" mFinalState = ");
                    enum_.append((Object)this.a);
                    enum_.append(" -> REMOVED. mLifecycleImpact  = ");
                    enum_.append((Object)this.b);
                    enum_.append(" to REMOVING.");
                    Log.v((String)"FragmentManager", (String)enum_.toString());
                }
                this.a = c.o;
                enum_ = b.q;
            } else {
                if (this.a != c.o) return;
                if (n.D0(2)) {
                    enum_ = new StringBuilder();
                    enum_.append("SpecialEffectsController: For fragment ");
                    enum_.append((Object)this.c);
                    enum_.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    enum_.append((Object)this.b);
                    enum_.append(" to ADDING.");
                    Log.v((String)"FragmentManager", (String)enum_.toString());
                }
                this.a = c.p;
                enum_ = b.p;
            }
            this.b = enum_;
        }

        public abstract void l();

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Operation ");
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mFinalState = ");
            stringBuilder.append((Object)((Object)this.a));
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mLifecycleImpact = ");
            stringBuilder.append((Object)((Object)this.b));
            stringBuilder.append("} ");
            stringBuilder.append("{");
            stringBuilder.append("mFragment = ");
            stringBuilder.append((Object)this.c);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public static final class b
        extends Enum {
            public static final /* enum */ b o;
            public static final /* enum */ b p;
            public static final /* enum */ b q;
            public static final /* synthetic */ b[] r;

            static {
                b b8;
                b b9;
                b b10;
                o = b8 = new b();
                p = b9 = new b();
                q = b10 = new b();
                r = new b[]{b8, b9, b10};
            }

            public static b valueOf(String string2) {
                return (b)Enum.valueOf(b.class, (String)string2);
            }

            public static b[] values() {
                return (b[])r.clone();
            }
        }

        public static final class c
        extends Enum {
            public static final /* enum */ c o;
            public static final /* enum */ c p;
            public static final /* enum */ c q;
            public static final /* enum */ c r;
            public static final /* synthetic */ c[] s;

            static {
                c c8;
                c c9;
                c c10;
                c c11;
                o = c9 = new c();
                p = c10 = new c();
                q = c11 = new c();
                r = c8 = new c();
                s = new c[]{c9, c10, c11, c8};
            }

            public static c e(int n8) {
                if (n8 != 0) {
                    if (n8 != 4) {
                        if (n8 == 8) {
                            return q;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown visibility ");
                        stringBuilder.append(n8);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return r;
                }
                return p;
            }

            public static c h(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return r;
                }
                return c.e(view.getVisibility());
            }

            public static c valueOf(String string2) {
                return (c)Enum.valueOf(c.class, (String)string2);
            }

            public static c[] values() {
                return (c[])s.clone();
            }

            /*
             * Enabled aggressive block sorting
             */
            public void c(View view) {
                int n8 = androidx.fragment.app.B$c.a[this.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                return;
                            }
                            if (n.D0(2)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("SpecialEffectsController: Setting view ");
                                stringBuilder.append((Object)view);
                                stringBuilder.append(" to INVISIBLE");
                                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                            }
                            view.setVisibility(4);
                            return;
                        }
                        if (n.D0(2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("SpecialEffectsController: Setting view ");
                            stringBuilder.append((Object)view);
                            stringBuilder.append(" to GONE");
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        n8 = 8;
                    } else {
                        if (n.D0(2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("SpecialEffectsController: Setting view ");
                            stringBuilder.append((Object)view);
                            stringBuilder.append(" to VISIBLE");
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        n8 = 0;
                    }
                    view.setVisibility(n8);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup != null) {
                    if (n.D0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("SpecialEffectsController: Removing view ");
                        stringBuilder.append((Object)view);
                        stringBuilder.append(" from container ");
                        stringBuilder.append((Object)viewGroup);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    viewGroup.removeView(view);
                }
            }
        }

    }

}


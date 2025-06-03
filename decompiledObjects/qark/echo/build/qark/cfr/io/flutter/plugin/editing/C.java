/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 *  android.view.autofill.AutofillManager
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package io.flutter.plugin.editing;

import D5.w;
import K.b;
import O1.J;
import O1.K;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.A;
import io.flutter.plugin.editing.B;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.l;
import io.flutter.plugin.editing.m;
import io.flutter.plugin.editing.p;
import io.flutter.plugin.editing.q;
import io.flutter.plugin.editing.r;
import io.flutter.plugin.editing.s;
import io.flutter.plugin.editing.t;
import io.flutter.plugin.editing.u;
import io.flutter.plugin.editing.v;
import io.flutter.plugin.editing.w;
import io.flutter.plugin.editing.x;
import io.flutter.plugin.editing.y;
import io.flutter.plugin.editing.z;
import java.util.ArrayList;
import java.util.HashMap;
import u5.L;

public class C
implements m.b {
    public final View a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final D5.w d;
    public c e = new c(c.a.o, 0);
    public w.b f;
    public SparseArray g;
    public m h;
    public boolean i;
    public InputConnection j;
    public io.flutter.plugin.platform.r k;
    public Rect l;
    public ImeSyncDeferringInsetsCallback m;
    public w.e n;
    public boolean o;

    public C(View object, D5.w w8, io.flutter.plugin.platform.r r8) {
        this.a = object;
        AutofillManager autofillManager = null;
        this.h = new m(null, (View)object);
        this.b = (InputMethodManager)object.getContext().getSystemService("input_method");
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26) {
            autofillManager = K.a(object.getContext().getSystemService(J.a()));
        }
        this.c = autofillManager;
        if (n8 >= 30) {
            this.m = object = new ImeSyncDeferringInsetsCallback((View)object);
            object.install();
        }
        this.d = w8;
        w8.n(new w.f(){

            @Override
            public void a() {
                C c8 = C.this;
                c8.D(c8.a);
            }

            @Override
            public void b() {
                C.this.k();
            }

            @Override
            public void c(String string2, Bundle bundle) {
                C.this.z(string2, bundle);
            }

            @Override
            public void d(int n8, boolean bl) {
                C.this.A(n8, bl);
            }

            @Override
            public void e(double d8, double d9, double[] arrd) {
                C.this.y(d8, d9, arrd);
            }

            @Override
            public void f() {
                C.this.v();
            }

            @Override
            public void g(int n8, w.b b8) {
                C.this.B(n8, b8);
            }

            @Override
            public void h(w.e e8) {
                C c8 = C.this;
                c8.C(c8.a, e8);
            }

            @Override
            public void i(boolean bl) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (C.this.c == null) {
                        return;
                    }
                    if (bl) {
                        A.a(C.this.c);
                        return;
                    }
                    B.a(C.this.c);
                }
            }

            @Override
            public void j() {
                if (C.c((C)C.this).a == c.a.r) {
                    C.this.w();
                    return;
                }
                C c8 = C.this;
                c8.q(c8.a);
            }
        });
        w8.k();
        this.k = r8;
        r8.v(this);
    }

    public static /* synthetic */ c c(C c8) {
        return c8.e;
    }

    public static boolean l(w.e e8, w.e e9) {
        int n8 = e8.e - e8.d;
        if (n8 != e9.e - e9.d) {
            return true;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            if (e8.a.charAt(e8.d + i8) == e9.a.charAt(e9.d + i8)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int r(w.c c8, boolean bl, boolean bl2, boolean bl3, boolean bl4, w.d d8) {
        int n8;
        int n9;
        block12 : {
            block11 : {
                block10 : {
                    w.g g8 = c8.a;
                    if (g8 == w.g.q) {
                        return 4;
                    }
                    if (g8 == w.g.t) {
                        int n10 = c8.b ? 4098 : 2;
                        int n11 = n10;
                        if (!c8.c) return n11;
                        return n10 | 8192;
                    }
                    if (g8 == w.g.u) {
                        return 3;
                    }
                    if (g8 == w.g.z) {
                        return 0;
                    }
                    n8 = g8 == w.g.v ? 131073 : (g8 == w.g.w ? 33 : (g8 == w.g.x ? 17 : (g8 == w.g.y ? 145 : (g8 == w.g.r ? 97 : (g8 == w.g.s ? 113 : 1)))));
                    if (!bl) break block10;
                    n9 = 524416;
                    break block11;
                }
                n9 = n8;
                if (bl2) {
                    n9 = n8 | 32768;
                }
                n8 = n9;
                if (bl3) break block12;
                int n12 = 524432;
                n8 = n9;
                n9 = n12;
            }
            n8 |= n9;
        }
        if (d8 == w.d.p) {
            return n8 | 4096;
        }
        if (d8 == w.d.q) {
            return n8 | 8192;
        }
        n9 = n8;
        if (d8 != w.d.r) return n9;
        return n8 | 16384;
    }

    public final void A(int n8, boolean bl) {
        if (bl) {
            this.a.requestFocus();
            this.e = new c(c.a.q, n8);
            this.b.restartInput(this.a);
            this.i = false;
            return;
        }
        this.e = new c(c.a.r, n8);
        this.j = null;
    }

    public void B(int n8, w.b b8) {
        this.w();
        this.f = b8;
        this.e = new c(c.a.p, n8);
        this.h.l(this);
        Object object = b8.j;
        object = object != null ? object.c : null;
        this.h = new m((w.e)object, this.a);
        this.F(b8);
        this.i = true;
        this.E();
        this.l = null;
        this.h.a(this);
    }

    public void C(View view, w.e e8) {
        w.e e9;
        if (!this.i && (e9 = this.n) != null && e9.b()) {
            boolean bl;
            this.i = bl = C.l(this.n, e8);
            if (bl) {
                t5.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = e8;
        this.h.n(e8);
        if (this.i) {
            this.b.restartInput(view);
            this.i = false;
        }
    }

    public void D(View view) {
        Object object = this.f;
        if (object != null && (object = object.g) != null && object.a == w.g.z) {
            this.q(view);
            return;
        }
        view.requestFocus();
        this.b.showSoftInput(view, 0);
    }

    public void E() {
        if (this.e.a == c.a.q) {
            this.o = false;
        }
    }

    public final void F(w.b b82) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (b82 != null && b82.j != null) {
            w.b[] arrb = b82.l;
            Object object = new SparseArray();
            this.g = object;
            if (arrb == null) {
                object.put(b82.j.a.hashCode(), (Object)b82);
                return;
            }
            for (w.b b82 : arrb) {
                object = b82.j;
                if (object == null) continue;
                this.g.put(object.a.hashCode(), (Object)b82);
                q.a(this.c, this.a, object.a.hashCode(), v.a(object.c.a));
            }
            return;
        }
        this.g = null;
    }

    @Override
    public void a(boolean bl, boolean bl2, boolean bl3) {
        block6 : {
            int n8;
            ArrayList arrayList;
            int n9;
            int n10;
            int n11;
            w.e e8;
            block7 : {
                if (bl) {
                    this.u(this.h.toString());
                }
                n10 = this.h.i();
                n8 = this.h.h();
                n9 = this.h.g();
                n11 = this.h.f();
                arrayList = this.h.e();
                if (this.n == null) break block6;
                if (!this.h.toString().equals((Object)this.n.a)) break block7;
                e8 = this.n;
                if (n10 == e8.b && n8 == e8.c && n9 == e8.d && n11 == e8.e) break block6;
            }
            e8 = new StringBuilder();
            e8.append("send EditingState to flutter: ");
            e8.append(this.h.toString());
            t5.b.f("TextInputPlugin", e8.toString());
            if (this.f.e) {
                this.d.q(this.e.b, arrayList);
                this.h.c();
            } else {
                this.d.p(this.e.b, this.h.toString(), n10, n8, n9, n11);
            }
            this.n = new w.e(this.h.toString(), n10, n8, n9, n11);
            return;
        }
        this.h.c();
    }

    public void j(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Object object = this.f;
        if (object != null && this.g != null) {
            object = object.j;
            if (object == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                int n8 = sparseArray.keyAt(i8);
                Object object2 = (w.b)this.g.get(n8);
                if (object2 == null || (object2 = object2.j) == null) continue;
                Object object3 = y.a(x.a(sparseArray.valueAt(i8))).toString();
                object3 = new w.e((String)object3, object3.length(), object3.length(), -1, -1);
                if (object2.a.equals((Object)object.a)) {
                    this.h.n((w.e)object3);
                    continue;
                }
                hashMap.put((Object)object2.a, object3);
            }
            this.d.r(this.e.b, hashMap);
        }
    }

    public void k() {
        if (this.e.a == c.a.q) {
            return;
        }
        this.h.l(this);
        this.w();
        this.f = null;
        this.F(null);
        this.e = new c(c.a.o, 0);
        this.E();
        this.l = null;
        this.b.restartInput(this.a);
    }

    public InputConnection m(View object, L l8, EditorInfo editorInfo) {
        int n8;
        String[] arrstring = this.e;
        Object object2 = arrstring.a;
        if (object2 == c.a.o) {
            this.j = null;
            return null;
        }
        if (object2 == c.a.r) {
            return null;
        }
        if (object2 == c.a.q) {
            if (this.o) {
                return this.j;
            }
            object = this.k.c(arrstring.b).onCreateInputConnection(editorInfo);
            this.j = object;
            return object;
        }
        arrstring = this.f;
        editorInfo.inputType = n8 = C.r(arrstring.g, arrstring.a, arrstring.b, arrstring.c, arrstring.d, arrstring.f);
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f.d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        n8 = (arrstring = this.f.h) == null ? ((n8 & 131072) != 0 ? 1 : 6) : arrstring.intValue();
        arrstring = this.f;
        object2 = arrstring.i;
        if (object2 != null) {
            editorInfo.actionLabel = object2;
            editorInfo.actionId = n8;
        }
        editorInfo.imeOptions = n8 | editorInfo.imeOptions;
        arrstring = arrstring.k;
        if (arrstring != null) {
            b.a(editorInfo, arrstring);
        }
        object = new l((View)object, this.e.b, this.d, l8, this.h, editorInfo);
        editorInfo.initialSelStart = this.h.i();
        editorInfo.initialSelEnd = this.h.h();
        this.j = object;
        return object;
    }

    public void n() {
        this.k.G();
        this.d.n(null);
        this.w();
        this.h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager o() {
        return this.b;
    }

    public boolean p(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (this.o().isAcceptingText() && (inputConnection = this.j) != null) {
            if (inputConnection instanceof l) {
                return ((l)inputConnection).f(keyEvent);
            }
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public final void q(View view) {
        this.w();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void s() {
        if (this.e.a == c.a.q) {
            this.o = true;
        }
    }

    public final boolean t() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final void u(String string2) {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null) {
            if (!this.t()) {
                return;
            }
            String string3 = this.f.j.a;
            q.a(this.c, this.a, string3.hashCode(), v.a(string2));
        }
    }

    public final void v() {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null) {
            if (!this.t()) {
                return;
            }
            String string2 = this.f.j.a;
            int[] arrn = new int[2];
            this.a.getLocationOnScreen(arrn);
            Rect rect = new Rect(this.l);
            rect.offset(arrn[0], arrn[1]);
            z.a(this.c, this.a, string2.hashCode(), rect);
        }
    }

    public final void w() {
        Object object;
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && (object = this.f) != null && object.j != null) {
            if (!this.t()) {
                return;
            }
            object = this.f.j.a;
            p.a(this.c, this.a, object.hashCode());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void x(ViewStructure viewStructure, int n8) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!this.t()) {
            return;
        }
        String string2 = this.f.j.a;
        AutofillId autofillId = r.a(viewStructure);
        n8 = 0;
        while (n8 < this.g.size()) {
            int n9 = this.g.keyAt(n8);
            Object object = ((w.b)this.g.valueAt((int)n8)).j;
            if (object != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructure2 = viewStructure.newChild(n8);
                s.a(viewStructure2, autofillId, n9);
                Object object2 = object.b;
                if (object2.length > 0) {
                    t.a(viewStructure2, (String[])object2);
                }
                u.a(viewStructure2, 1);
                viewStructure2.setVisibility(0);
                object2 = object.d;
                if (object2 != null) {
                    viewStructure2.setHint((CharSequence)object2);
                }
                if (string2.hashCode() == n9 && (object2 = this.l) != null) {
                    viewStructure2.setDimens(object2.left, object2.top, 0, 0, object2.width(), this.l.height());
                    object = this.h;
                } else {
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    object = object.c.a;
                }
                w.a(viewStructure2, v.a((CharSequence)object));
            }
            ++n8;
        }
    }

    public final void y(double d8, double d9, double[] object) {
        double[] arrd = new double[4];
        final boolean bl = object[3] == 0.0 && object[7] == 0.0 && object[15] == 1.0;
        double d10 = object[12];
        double d11 = object[15];
        arrd[1] = d10 /= d11;
        arrd[0] = d10;
        arrd[3] = d11 = object[13] / d11;
        arrd[2] = d11;
        object = new d((double[])object, arrd){
            public final /* synthetic */ double[] b;
            public final /* synthetic */ double[] c;
            {
                this.b = arrd;
                this.c = arrd2;
            }

            @Override
            public void a(double d8, double d9) {
                double[] arrd;
                boolean bl2 = bl;
                double d10 = 1.0;
                if (!bl2) {
                    arrd = this.b;
                    d10 = 1.0 / (arrd[3] * d8 + arrd[7] * d9 + arrd[15]);
                }
                arrd = this.b;
                double d11 = (arrd[0] * d8 + arrd[4] * d9 + arrd[12]) * d10;
                d8 = (arrd[1] * d8 + arrd[5] * d9 + arrd[13]) * d10;
                arrd = this.c;
                if (d11 < arrd[0]) {
                    arrd[0] = d11;
                } else if (d11 > arrd[1]) {
                    arrd[1] = d11;
                }
                if (d8 < arrd[2]) {
                    arrd[2] = d8;
                    return;
                }
                if (d8 > arrd[3]) {
                    arrd[3] = d8;
                }
            }
        };
        object.a(d8, 0.0);
        object.a(d8, d9);
        object.a(0.0, d9);
        float f8 = this.a.getContext().getResources().getDisplayMetrics().density;
        d8 = arrd[0];
        d9 = f8;
        this.l = new Rect((int)(d8 * d9), (int)(arrd[2] * d9), (int)Math.ceil((double)(arrd[1] * d9)), (int)Math.ceil((double)(arrd[3] * d9)));
    }

    public void z(String string2, Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, string2, bundle);
    }

    public static class c {
        public a a;
        public int b;

        public c(a a8, int n8) {
            this.a = a8;
            this.b = n8;
        }

        public static final class a
        extends Enum {
            public static final /* enum */ a o = new a();
            public static final /* enum */ a p = new a();
            public static final /* enum */ a q = new a();
            public static final /* enum */ a r = new a();
            public static final /* synthetic */ a[] s;

            static {
                s = a.c();
            }

            public static /* synthetic */ a[] c() {
                return new a[]{o, p, q, r};
            }

            public static a valueOf(String string2) {
                return (a)Enum.valueOf(a.class, (String)string2);
            }

            public static a[] values() {
                return (a[])s.clone();
            }
        }

    }

    public static interface d {
        public void a(double var1, double var3);
    }

}


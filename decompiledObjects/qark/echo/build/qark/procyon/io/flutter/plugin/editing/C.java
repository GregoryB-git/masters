// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import android.view.autofill.AutofillId;
import android.view.ViewStructure;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import u5.L;
import java.util.HashMap;
import java.util.ArrayList;
import t5.b;
import android.os.Bundle;
import O1.K;
import O1.J;
import android.os.Build$VERSION;
import android.graphics.Rect;
import io.flutter.plugin.platform.r;
import android.view.inputmethod.InputConnection;
import android.util.SparseArray;
import D5.w;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.view.View;

public class C implements b
{
    public final View a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final w d;
    public c e;
    public w.b f;
    public SparseArray g;
    public m h;
    public boolean i;
    public InputConnection j;
    public r k;
    public Rect l;
    public ImeSyncDeferringInsetsCallback m;
    public w.e n;
    public boolean o;
    
    public C(final View a, final w d, final r k) {
        this.e = new c(C.c.a.o, 0);
        this.a = a;
        AutofillManager a2 = null;
        this.h = new m(null, a);
        this.b = (InputMethodManager)a.getContext().getSystemService("input_method");
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            a2 = K.a(a.getContext().getSystemService(J.a()));
        }
        this.c = a2;
        if (sdk_INT >= 30) {
            (this.m = new ImeSyncDeferringInsetsCallback(a)).install();
        }
        (this.d = d).n((w.f)new w.f() {
            @Override
            public void a() {
                final C a = C.this;
                a.D(C.b(a));
            }
            
            @Override
            public void b() {
                C.this.k();
            }
            
            @Override
            public void c(final String s, final Bundle bundle) {
                C.this.z(s, bundle);
            }
            
            @Override
            public void d(final int n, final boolean b) {
                C.this.A(n, b);
            }
            
            @Override
            public void e(final double n, final double n2, final double[] array) {
                C.this.y(n, n2, array);
            }
            
            @Override
            public void f() {
                C.this.v();
            }
            
            @Override
            public void g(final int n, final w.b b) {
                C.this.B(n, b);
            }
            
            @Override
            public void h(final e e) {
                final C a = C.this;
                a.C(C.b(a), e);
            }
            
            @Override
            public void i(final boolean b) {
                if (Build$VERSION.SDK_INT >= 26) {
                    if (C.g(C.this) == null) {
                        return;
                    }
                    if (b) {
                        A.a(C.g(C.this));
                        return;
                    }
                    B.a(C.g(C.this));
                }
            }
            
            @Override
            public void j() {
                if (C.c(C.this).a == C.c.a.r) {
                    C.this.w();
                    return;
                }
                final C a = C.this;
                a.q(C.b(a));
            }
        });
        d.k();
        (this.k = k).v(this);
    }
    
    public static /* synthetic */ View b(final C c) {
        return c.a;
    }
    
    public static /* synthetic */ c c(final C c) {
        return c.e;
    }
    
    public static /* synthetic */ AutofillManager g(final C c) {
        return c.c;
    }
    
    public static boolean l(final w.e e, final w.e e2) {
        final int n = e.e - e.d;
        if (n != e2.e - e2.d) {
            return true;
        }
        for (int i = 0; i < n; ++i) {
            if (e.a.charAt(e.d + i) != e2.a.charAt(e2.d + i)) {
                return true;
            }
        }
        return false;
    }
    
    public static int r(final w.c c, final boolean b, final boolean b2, final boolean b3, final boolean b4, final w.d d) {
        final w.g a = c.a;
        if (a == w.g.q) {
            return 4;
        }
        if (a == w.g.t) {
            int n;
            if (c.b) {
                n = 4098;
            }
            else {
                n = 2;
            }
            int n2 = n;
            if (c.c) {
                n2 = (n | 0x2000);
            }
            return n2;
        }
        if (a == w.g.u) {
            return 3;
        }
        if (a == w.g.z) {
            return 0;
        }
        int n3;
        if (a == w.g.v) {
            n3 = 131073;
        }
        else if (a == w.g.w) {
            n3 = 33;
        }
        else if (a == w.g.x) {
            n3 = 17;
        }
        else if (a == w.g.y) {
            n3 = 145;
        }
        else if (a == w.g.r) {
            n3 = 97;
        }
        else if (a == w.g.s) {
            n3 = 113;
        }
        else {
            n3 = 1;
        }
        int n6 = 0;
        Label_0234: {
            int n4;
            if (b) {
                n4 = 524416;
            }
            else {
                int n5 = n3;
                if (b2) {
                    n5 = (n3 | 0x8000);
                }
                n6 = n5;
                if (b3) {
                    break Label_0234;
                }
                final int n7 = 524432;
                n3 = n5;
                n4 = n7;
            }
            n6 = (n3 | n4);
        }
        if (d == w.d.p) {
            return n6 | 0x1000;
        }
        if (d == w.d.q) {
            return n6 | 0x2000;
        }
        int n8 = n6;
        if (d == w.d.r) {
            n8 = (n6 | 0x4000);
        }
        return n8;
    }
    
    public final void A(final int n, final boolean b) {
        if (b) {
            this.a.requestFocus();
            this.e = new c(C.c.a.q, n);
            this.b.restartInput(this.a);
            this.i = false;
            return;
        }
        this.e = new c(C.c.a.r, n);
        this.j = null;
    }
    
    public void B(final int n, final w.b f) {
        this.w();
        this.f = f;
        this.e = new c(C.c.a.p, n);
        this.h.l((m.b)this);
        final w.b.a j = f.j;
        w.e c;
        if (j != null) {
            c = j.c;
        }
        else {
            c = null;
        }
        this.h = new m(c, this.a);
        this.F(f);
        this.i = true;
        this.E();
        this.l = null;
        this.h.a((m.b)this);
    }
    
    public void C(final View view, final w.e n) {
        if (!this.i) {
            final w.e n2 = this.n;
            if (n2 != null && n2.b() && (this.i = l(this.n, n))) {
                t5.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = n;
        this.h.n(n);
        if (this.i) {
            this.b.restartInput(view);
            this.i = false;
        }
    }
    
    public void D(final View view) {
        final w.b f = this.f;
        if (f != null) {
            final w.c g = f.g;
            if (g != null) {
                if (g.a == D5.w.g.z) {
                    this.q(view);
                    return;
                }
            }
        }
        view.requestFocus();
        this.b.showSoftInput(view, 0);
    }
    
    public void E() {
        if (this.e.a == C.c.a.q) {
            this.o = false;
        }
    }
    
    public final void F(w.b b) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        if (b == null || b.j == null) {
            this.g = null;
            return;
        }
        final w.b[] l = b.l;
        final SparseArray g = new SparseArray();
        this.g = g;
        if (l == null) {
            g.put(b.j.a.hashCode(), (Object)b);
            return;
        }
        for (int length = l.length, i = 0; i < length; ++i) {
            b = l[i];
            final w.b.a j = b.j;
            if (j != null) {
                this.g.put(j.a.hashCode(), (Object)b);
                io.flutter.plugin.editing.q.a(this.c, this.a, j.a.hashCode(), io.flutter.plugin.editing.v.a((CharSequence)j.c.a));
            }
        }
    }
    
    @Override
    public void a(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            this.u(this.h.toString());
        }
        final int i = this.h.i();
        final int h = this.h.h();
        final int g = this.h.g();
        final int f = this.h.f();
        final ArrayList e = this.h.e();
        Label_0270: {
            if (this.n != null) {
                if (this.h.toString().equals(this.n.a)) {
                    final w.e n = this.n;
                    if (i == n.b && h == n.c && g == n.d && f == n.e) {
                        break Label_0270;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("send EditingState to flutter: ");
                sb.append(this.h.toString());
                b.f("TextInputPlugin", sb.toString());
                if (this.f.e) {
                    this.d.q(this.e.b, e);
                    this.h.c();
                }
                else {
                    this.d.p(this.e.b, this.h.toString(), i, h, g, f);
                }
                this.n = new w.e(this.h.toString(), i, h, g, f);
                return;
            }
        }
        this.h.c();
    }
    
    public void j(final SparseArray sparseArray) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        final w.b f = this.f;
        if (f != null && this.g != null) {
            final w.b.a j = f.j;
            if (j == null) {
                return;
            }
            final HashMap<String, w.e> hashMap = new HashMap<String, w.e>();
            for (int i = 0; i < sparseArray.size(); ++i) {
                final w.b b = (w.b)this.g.get(sparseArray.keyAt(i));
                if (b != null) {
                    final w.b.a k = b.j;
                    if (k != null) {
                        final String string = io.flutter.plugin.editing.y.a(io.flutter.plugin.editing.x.a(sparseArray.valueAt(i))).toString();
                        final w.e value = new w.e(string, string.length(), string.length(), -1, -1);
                        if (k.a.equals(j.a)) {
                            this.h.n(value);
                        }
                        else {
                            hashMap.put(k.a, value);
                        }
                    }
                }
            }
            this.d.r(this.e.b, hashMap);
        }
    }
    
    public void k() {
        if (this.e.a == C.c.a.q) {
            return;
        }
        this.h.l((m.b)this);
        this.w();
        this.F(this.f = null);
        this.e = new c(C.c.a.o, 0);
        this.E();
        this.l = null;
        this.b.restartInput(this.a);
    }
    
    public InputConnection m(final View view, final L l, final EditorInfo editorInfo) {
        final c e = this.e;
        final a a = e.a;
        if (a == C.c.a.o) {
            return this.j = null;
        }
        if (a == C.c.a.r) {
            return null;
        }
        if (a != C.c.a.q) {
            final w.b f = this.f;
            final int r = r(f.g, f.a, f.b, f.c, f.d, f.f);
            editorInfo.inputType = r;
            editorInfo.imeOptions = 33554432;
            if (Build$VERSION.SDK_INT >= 26 && !this.f.d) {
                editorInfo.imeOptions = (0x2000000 | 0x1000000);
            }
            final Integer h = this.f.h;
            int intValue;
            if (h == null) {
                if ((r & 0x20000) != 0x0) {
                    intValue = 1;
                }
                else {
                    intValue = 6;
                }
            }
            else {
                intValue = h;
            }
            final w.b f2 = this.f;
            final String i = f2.i;
            if (i != null) {
                editorInfo.actionLabel = i;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions |= intValue;
            final String[] k = f2.k;
            if (k != null) {
                K.b.a(editorInfo, k);
            }
            final l j = new l(view, this.e.b, this.d, (l.a)l, this.h, editorInfo);
            editorInfo.initialSelStart = this.h.i();
            editorInfo.initialSelEnd = this.h.h();
            return this.j = (InputConnection)j;
        }
        if (this.o) {
            return this.j;
        }
        return this.j = this.k.c(e.b).onCreateInputConnection(editorInfo);
    }
    
    public void n() {
        this.k.G();
        this.d.n(null);
        this.w();
        this.h.l((m.b)this);
        final ImeSyncDeferringInsetsCallback m = this.m;
        if (m != null) {
            m.remove();
        }
    }
    
    public InputMethodManager o() {
        return this.b;
    }
    
    public boolean p(final KeyEvent keyEvent) {
        if (this.o().isAcceptingText()) {
            final InputConnection j = this.j;
            if (j != null) {
                if (j instanceof l) {
                    return ((l)j).f(keyEvent);
                }
                return j.sendKeyEvent(keyEvent);
            }
        }
        return false;
    }
    
    public final void q(final View view) {
        this.w();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }
    
    public void s() {
        if (this.e.a == C.c.a.q) {
            this.o = true;
        }
    }
    
    public final boolean t() {
        return this.g != null;
    }
    
    public final void u(final String s) {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            if (!this.t()) {
                return;
            }
            io.flutter.plugin.editing.q.a(this.c, this.a, this.f.j.a.hashCode(), io.flutter.plugin.editing.v.a((CharSequence)s));
        }
    }
    
    public final void v() {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            if (!this.t()) {
                return;
            }
            final String a = this.f.j.a;
            final int[] array = new int[2];
            this.a.getLocationOnScreen(array);
            final Rect rect = new Rect(this.l);
            rect.offset(array[0], array[1]);
            io.flutter.plugin.editing.z.a(this.c, this.a, a.hashCode(), rect);
        }
    }
    
    public final void w() {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            final w.b f = this.f;
            if (f != null && f.j != null) {
                if (!this.t()) {
                    return;
                }
                io.flutter.plugin.editing.p.a(this.c, this.a, this.f.j.a.hashCode());
            }
        }
    }
    
    public void x(final ViewStructure viewStructure, int i) {
        if (Build$VERSION.SDK_INT >= 26) {
            if (!this.t()) {
                return;
            }
            final String a = this.f.j.a;
            final AutofillId a2 = io.flutter.plugin.editing.r.a(viewStructure);
        Label_0244:
            for (i = 0; i < this.g.size(); ++i) {
                final int key = this.g.keyAt(i);
                final w.b.a j = ((w.b)this.g.valueAt(i)).j;
                if (j != null) {
                    viewStructure.addChildCount(1);
                    final ViewStructure child = viewStructure.newChild(i);
                    io.flutter.plugin.editing.s.a(child, a2, key);
                    final String[] b = j.b;
                    if (b.length > 0) {
                        io.flutter.plugin.editing.t.a(child, b);
                    }
                    io.flutter.plugin.editing.u.a(child, 1);
                    child.setVisibility(0);
                    final String d = j.d;
                    if (d != null) {
                        child.setHint((CharSequence)d);
                    }
                    while (true) {
                        Label_0220: {
                            if (a.hashCode() != key) {
                                break Label_0220;
                            }
                            final Rect l = this.l;
                            if (l == null) {
                                break Label_0220;
                            }
                            child.setDimens(l.left, l.top, 0, 0, l.width(), this.l.height());
                            final Object o = this.h;
                            io.flutter.plugin.editing.w.a(child, io.flutter.plugin.editing.v.a((CharSequence)o));
                            continue Label_0244;
                        }
                        child.setDimens(0, 0, 0, 0, 1, 1);
                        final Object o = j.c.a;
                        continue;
                    }
                }
            }
        }
    }
    
    public final void y(double n, double n2, final double[] array) {
        final double[] array2 = new double[4];
        final boolean b = array[3] == 0.0 && array[7] == 0.0 && array[15] == 1.0;
        final double n3 = array[12];
        final double n4 = array[15];
        array2[0] = (array2[1] = n3 / n4);
        array2[2] = (array2[3] = array[13] / n4);
        final d d = new d() {
            @Override
            public void a(double n, final double n2) {
                final boolean a = b;
                double n3 = 1.0;
                if (!a) {
                    final double[] b = array;
                    n3 = 1.0 / (b[3] * n + b[7] * n2 + b[15]);
                }
                final double[] b2 = array;
                final double n4 = (b2[0] * n + b2[4] * n2 + b2[12]) * n3;
                n = (b2[1] * n + b2[5] * n2 + b2[13]) * n3;
                final double[] c = array2;
                if (n4 < c[0]) {
                    c[0] = n4;
                }
                else if (n4 > c[1]) {
                    c[1] = n4;
                }
                if (n < c[2]) {
                    c[2] = n;
                    return;
                }
                if (n > c[3]) {
                    c[3] = n;
                }
            }
        };
        ((d)d).a(n, 0.0);
        ((d)d).a(n, n2);
        ((d)d).a(0.0, n2);
        final float density = this.a.getContext().getResources().getDisplayMetrics().density;
        n = array2[0];
        n2 = density;
        this.l = new Rect((int)(n * n2), (int)(array2[2] * n2), (int)Math.ceil(array2[1] * n2), (int)Math.ceil(array2[3] * n2));
    }
    
    public void z(final String s, final Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, s, bundle);
    }
    
    public static class c
    {
        public a a;
        public int b;
        
        public c(final a a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public enum a
        {
            o("NO_TARGET", 0), 
            p("FRAMEWORK_CLIENT", 1), 
            q("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2), 
            r("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
            
            static {
                s = c();
            }
            
            public a(final String name, final int ordinal) {
            }
            
            public static /* synthetic */ a[] c() {
                return new a[] { a.o, a.p, a.q, a.r };
            }
        }
    }
    
    public interface d
    {
        void a(final double p0, final double p1);
    }
}

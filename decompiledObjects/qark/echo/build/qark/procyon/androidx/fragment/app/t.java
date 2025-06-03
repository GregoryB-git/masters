// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.util.SparseArray;
import android.view.ViewParent;
import java.util.Iterator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.content.res.Resources$NotFoundException;
import U.b;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.View;
import android.util.Log;
import androidx.lifecycle.d;
import android.os.Bundle;

public class t
{
    public final m a;
    public final u b;
    public final Fragment c;
    public boolean d;
    public int e;
    
    public t(final m a, final u b, final Fragment c) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public t(final m a, final u b, final Fragment c, final s s) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.q = null;
        c.r = null;
        c.F = 0;
        c.C = false;
        c.z = false;
        final Fragment v = c.v;
        String t;
        if (v != null) {
            t = v.t;
        }
        else {
            t = null;
        }
        c.w = t;
        c.v = null;
        Bundle a2 = s.A;
        if (a2 == null) {
            a2 = new Bundle();
        }
        c.p = a2;
    }
    
    public t(final m a, final u b, final ClassLoader classLoader, final j j, final s s) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        final Fragment a2 = j.a(classLoader, s.o);
        this.c = a2;
        final Bundle x = s.x;
        if (x != null) {
            x.setClassLoader(classLoader);
        }
        a2.w1(s.x);
        a2.t = s.p;
        a2.B = s.q;
        a2.D = true;
        a2.K = s.r;
        a2.L = s.s;
        a2.M = s.t;
        a2.P = s.u;
        a2.A = s.v;
        a2.O = s.w;
        a2.N = s.y;
        a2.f0 = androidx.lifecycle.d.c.values()[s.z];
        Bundle a3 = s.A;
        if (a3 == null) {
            a3 = new Bundle();
        }
        a2.p = a3;
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a2);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public void a() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        c.N0(c.p);
        final m a = this.a;
        final Fragment c2 = this.c;
        a.a(c2, c2.p, false);
    }
    
    public void b() {
        final int j = this.b.j(this.c);
        final Fragment c = this.c;
        c.U.addView(c.V, j);
    }
    
    public void c() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final Fragment v = c.v;
        t t = null;
        if (v != null) {
            t = this.b.m(v.t);
            if (t == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this.c);
                sb2.append(" declared target fragment ");
                sb2.append(this.c.v);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
            final Fragment c2 = this.c;
            c2.w = c2.v.t;
            c2.v = null;
        }
        else {
            final String w = c.w;
            if (w != null) {
                t = this.b.m(w);
                if (t == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Fragment ");
                    sb3.append(this.c);
                    sb3.append(" declared target fragment ");
                    sb3.append(this.c.w);
                    sb3.append(" that does not belong to this FragmentManager!");
                    throw new IllegalStateException(sb3.toString());
                }
            }
        }
        if (t != null && (n.P || t.k().o < 1)) {
            t.m();
        }
        final Fragment c3 = this.c;
        c3.H = c3.G.s0();
        final Fragment c4 = this.c;
        c4.J = c4.G.v0();
        this.a.g(this.c, false);
        this.c.O0();
        this.a.b(this.c, false);
    }
    
    public int d() {
        final Fragment c = this.c;
        if (c.G == null) {
            return c.o;
        }
        final int e = this.e;
        final int n = t$b.a[c.f0.ordinal()];
        int n2 = e;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        n2 = Math.min(e, -1);
                    }
                    else {
                        n2 = Math.min(e, 0);
                    }
                }
                else {
                    n2 = Math.min(e, 1);
                }
            }
            else {
                n2 = Math.min(e, 5);
            }
        }
        final Fragment c2 = this.c;
        int a = n2;
        if (c2.B) {
            if (c2.C) {
                final int max = Math.max(this.e, 2);
                final View v = this.c.V;
                a = max;
                if (v != null) {
                    a = max;
                    if (v.getParent() == null) {
                        a = Math.min(max, 2);
                    }
                }
            }
            else if (this.e < 4) {
                a = Math.min(n2, c2.o);
            }
            else {
                a = Math.min(n2, 1);
            }
        }
        int min = a;
        if (!this.c.z) {
            min = Math.min(a, 1);
        }
        Enum l = null;
        Label_0252: {
            if (androidx.fragment.app.n.P) {
                final Fragment c3 = this.c;
                final ViewGroup u = c3.U;
                if (u != null) {
                    l = B.n(u, c3.F()).l(this);
                    break Label_0252;
                }
            }
            l = null;
        }
        int a2;
        if (l == B.e.b.p) {
            a2 = Math.min(min, 6);
        }
        else if (l == B.e.b.q) {
            a2 = Math.max(min, 3);
        }
        else {
            final Fragment c4 = this.c;
            a2 = min;
            if (c4.A) {
                if (c4.Y()) {
                    a2 = Math.min(min, 1);
                }
                else {
                    a2 = Math.min(min, -1);
                }
            }
        }
        final Fragment c5 = this.c;
        int min2 = a2;
        if (c5.W) {
            min2 = a2;
            if (c5.o < 5) {
                min2 = Math.min(a2, 4);
            }
        }
        if (androidx.fragment.app.n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(min2);
            sb.append(" for ");
            sb.append(this.c);
            Log.v("FragmentManager", sb.toString());
        }
        return min2;
    }
    
    public void e() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        if (!c.e0) {
            this.a.h(c, c.p, false);
            final Fragment c2 = this.c;
            c2.R0(c2.p);
            final m a = this.a;
            final Fragment c3 = this.c;
            a.c(c3, c3.p, false);
            return;
        }
        c.r1(c.p);
        this.c.o = 1;
    }
    
    public void f() {
        if (this.c.B) {
            return;
        }
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final LayoutInflater x0 = c.X0(c.p);
        final Fragment c2 = this.c;
        ViewGroup u = c2.U;
        Label_0325: {
            if (u != null) {
                break Label_0325;
            }
            final int l = c2.L;
            Label_0322: {
                if (l == 0) {
                    break Label_0322;
                }
                Label_0272: {
                    if (l == -1) {
                        break Label_0272;
                    }
                    final ViewGroup viewGroup = (ViewGroup)c2.G.n0().e(this.c.L);
                    if ((u = viewGroup) != null) {
                        break Label_0325;
                    }
                    final Fragment c3 = this.c;
                    if (c3.D) {
                        u = viewGroup;
                        break Label_0325;
                    }
                    String resourceName;
                    StringBuilder sb2;
                    m a;
                    Fragment c4;
                    int visibility;
                    float alpha = 0.0f;
                    StringBuilder sb3;
                    View focus;
                    StringBuilder sb4;
                    Fragment c5;
                    boolean a2;
                    View v;
                    boolean b;
                    Fragment c6;
                    Fragment c7;
                    Fragment c8;
                    View v2 = null;
                    Fragment c9;
                    Block_12_Outer:Block_15_Outer:Label_0184_Outer:
                    while (true) {
                        while (true) {
                            try {
                                resourceName = c3.I().getResourceName(this.c.L);
                                // iftrue(Label_0669:, !n.P)
                                // iftrue(Label_0695:, c5.U == null)
                                // iftrue(Label_0655:, focus == null)
                                // iftrue(Label_0655:, !n.D0(2))
                                // iftrue(Label_0695:, visibility != 0)
                                // iftrue(Label_0701:, v2 == null)
                                // iftrue(Label_0427:, !c7.N)
                                // iftrue(Label_0403:, u == null)
                                // iftrue(Label_0453:, !I.s.t(this.c.V))
                                while (true) {
                                Block_10_Outer:
                                    while (true) {
                                    Label_0701_Outer:
                                        while (true) {
                                        Block_9:
                                            while (true) {
                                                Label_0655: {
                                                    while (true) {
                                                        Label_0403:Label_0695_Outer:
                                                        while (true) {
                                                            sb2 = new StringBuilder();
                                                            sb2.append("No view found for id 0x");
                                                            sb2.append(Integer.toHexString(this.c.L));
                                                            sb2.append(" (");
                                                            sb2.append(resourceName);
                                                            sb2.append(") for fragment ");
                                                            sb2.append(this.c);
                                                            throw new IllegalArgumentException(sb2.toString());
                                                            I.s.A(this.c.V);
                                                            while (true) {
                                                                while (true) {
                                                                Block_19:
                                                                    while (true) {
                                                                        while (true) {
                                                                            break Label_0477;
                                                                            this.b();
                                                                            break Label_0403;
                                                                            this.c.k1();
                                                                            a = this.a;
                                                                            c4 = this.c;
                                                                            a.m(c4, c4.V, c4.p, false);
                                                                            visibility = this.c.V.getVisibility();
                                                                            alpha = this.c.V.getAlpha();
                                                                            break Block_10_Outer;
                                                                            sb3 = new StringBuilder();
                                                                            sb3.append("requestFocus: Saved focused view ");
                                                                            sb3.append(focus);
                                                                            sb3.append(" for Fragment ");
                                                                            sb3.append(this.c);
                                                                            Log.v("FragmentManager", sb3.toString());
                                                                            break Label_0655;
                                                                            sb4 = new StringBuilder();
                                                                            sb4.append("Cannot create fragment ");
                                                                            sb4.append(this.c);
                                                                            sb4.append(" for a container view with no id");
                                                                            throw new IllegalArgumentException(sb4.toString());
                                                                            c5.a0 = a2;
                                                                            this.c.o = 2;
                                                                            return;
                                                                            Label_0453: {
                                                                                v = this.c.V;
                                                                            }
                                                                            v.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                                                                                public void onViewAttachedToWindow(final View view) {
                                                                                    v.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                                                                                    I.s.A(v);
                                                                                }
                                                                                
                                                                                public void onViewDetachedFromWindow(final View view) {
                                                                                }
                                                                            });
                                                                            continue Block_10_Outer;
                                                                        }
                                                                        u = null;
                                                                        break Label_0325;
                                                                        a2 = b;
                                                                        break Block_19;
                                                                        focus = c6.V.findFocus();
                                                                        this.c.x1(focus);
                                                                        continue Label_0695_Outer;
                                                                    }
                                                                    a2 = true;
                                                                    continue Label_0701_Outer;
                                                                }
                                                                Label_0669: {
                                                                    c5 = this.c;
                                                                }
                                                                a2 = b;
                                                                continue Block_15_Outer;
                                                            }
                                                            c7.V.setVisibility(8);
                                                            break Label_0701_Outer;
                                                            c8 = this.c;
                                                            c8.T0(x0, c8.U = u, c8.p);
                                                            v2 = this.c.V;
                                                            break Block_9;
                                                            resourceName = "unknown";
                                                            continue Block_12_Outer;
                                                        }
                                                        c7 = this.c;
                                                        continue Label_0184_Outer;
                                                    }
                                                }
                                                this.c.V.setAlpha(0.0f);
                                                continue Block_15_Outer;
                                            }
                                            b = false;
                                            v2.setSaveFromParentEnabled(false);
                                            c9 = this.c;
                                            c9.V.setTag(U.b.a, (Object)c9);
                                            continue Label_0701_Outer;
                                        }
                                        continue Block_10_Outer;
                                    }
                                    this.c.C1(alpha);
                                    c6 = this.c;
                                    continue Label_0184_Outer;
                                }
                            }
                            // iftrue(Label_0701:, c6.U == null || visibility != 0)
                            catch (Resources$NotFoundException ex) {}
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    public void g() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final boolean a = c.A;
        boolean l = true;
        final boolean b = a && !c.Y();
        if (!b && !this.b.o().o(this.c)) {
            final String w = this.c.w;
            if (w != null) {
                final Fragment f = this.b.f(w);
                if (f != null && f.P) {
                    this.c.v = f;
                }
            }
            this.c.o = 0;
            return;
        }
        final k h = this.c.H;
        if (h instanceof androidx.lifecycle.u) {
            l = this.b.o().l();
        }
        else if (h.i() instanceof Activity) {
            l = (true ^ ((Activity)h.i()).isChangingConfigurations());
        }
        if (b || l) {
            this.b.o().f(this.c);
        }
        this.c.U0();
        this.a.d(this.c, false);
        for (final t t : this.b.k()) {
            if (t != null) {
                final Fragment k = t.k();
                if (!this.c.t.equals(k.w)) {
                    continue;
                }
                k.v = this.c;
                k.w = null;
            }
        }
        final Fragment c2 = this.c;
        final String w2 = c2.w;
        if (w2 != null) {
            c2.v = this.b.f(w2);
        }
        this.b.q(this);
    }
    
    public void h() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final ViewGroup u = c.U;
        if (u != null) {
            final View v = c.V;
            if (v != null) {
                u.removeView(v);
            }
        }
        this.c.V0();
        this.a.n(this.c, false);
        final Fragment c2 = this.c;
        c2.U = null;
        c2.V = null;
        c2.h0 = null;
        c2.i0.j(null);
        this.c.C = false;
    }
    
    public void i() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.W0();
        this.a.e(this.c, false);
        final Fragment c = this.c;
        c.o = -1;
        c.H = null;
        c.J = null;
        c.G = null;
        if (!c.A || c.Y()) {
            if (!this.b.o().o(this.c)) {
                return;
            }
        }
        if (n.D0(3)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("initState called for fragment: ");
            sb2.append(this.c);
            Log.d("FragmentManager", sb2.toString());
        }
        this.c.U();
    }
    
    public void j() {
        final Fragment c = this.c;
        if (c.B && c.C && !c.E) {
            if (n.D0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
                Log.d("FragmentManager", sb.toString());
            }
            final Fragment c2 = this.c;
            c2.T0(c2.X0(c2.p), null, this.c.p);
            final View v = this.c.V;
            if (v != null) {
                v.setSaveFromParentEnabled(false);
                final Fragment c3 = this.c;
                c3.V.setTag(U.b.a, (Object)c3);
                final Fragment c4 = this.c;
                if (c4.N) {
                    c4.V.setVisibility(8);
                }
                this.c.k1();
                final m a = this.a;
                final Fragment c5 = this.c;
                a.m(c5, c5.V, c5.p, false);
                this.c.o = 2;
            }
        }
    }
    
    public Fragment k() {
        return this.c;
    }
    
    public final boolean l(final View view) {
        if (view == this.c.V) {
            return true;
        }
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent == this.c.V) {
                return true;
            }
        }
        return false;
    }
    
    public void m() {
        if (this.d) {
            if (n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(this.k());
                Log.v("FragmentManager", sb.toString());
            }
            return;
        }
    Label_0055_Outer:
        while (true) {
            int d;
            Fragment c;
            int o = 0;
            ViewGroup u;
            ViewGroup u2;
            B n;
            Fragment c2;
            StringBuilder sb2;
            Fragment c3;
            ViewGroup u3;
            Fragment fragment;
            Fragment c4;
            final Fragment fragment2;
            Block_10_Outer:Label_0502_Outer:Label_0385_Outer:
            while (true) {
            Label_0260_Outer:
                while (true) {
                Label_0407_Outer:
                    while (true) {
                    Label_0238_Outer:
                        while (true) {
                        Label_0253_Outer:
                            while (true) {
                            Label_0245_Outer:
                                while (true) {
                                Label_0372_Outer:
                                    while (true) {
                                    Label_0400_Outer:
                                        while (true) {
                                            while (true) {
                                                Label_0516: {
                                                    while (true) {
                                                        try {
                                                            this.d = true;
                                                            while (true) {
                                                                d = this.d();
                                                                c = this.c;
                                                                o = c.o;
                                                                if (d == o) {
                                                                    break;
                                                                }
                                                                if (d <= o) {
                                                                    break Label_0516;
                                                                }
                                                                switch (o + 1) {
                                                                    case 7: {
                                                                        this.p();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 6: {
                                                                        c.o = 6;
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 5: {
                                                                        this.u();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 4: {
                                                                        if (c.V != null) {
                                                                            u = c.U;
                                                                            if (u != null) {
                                                                                B.n(u, c.F()).b(B.e.c.e(this.c.V.getVisibility()), this);
                                                                            }
                                                                        }
                                                                        this.c.o = 4;
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 3: {
                                                                        this.a();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 2: {
                                                                        this.j();
                                                                        this.f();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 1: {
                                                                        this.e();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    case 0: {
                                                                        this.c();
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                    default: {
                                                                        continue Label_0055_Outer;
                                                                    }
                                                                }
                                                            }
                                                            if (androidx.fragment.app.n.P && c.b0) {
                                                                if (c.V != null) {
                                                                    u2 = c.U;
                                                                    if (u2 != null) {
                                                                        n = B.n(u2, c.F());
                                                                        if (this.c.N) {
                                                                            n.c(this);
                                                                        }
                                                                        else {
                                                                            n.e(this);
                                                                        }
                                                                    }
                                                                }
                                                                c2 = this.c;
                                                                c2.b0 = false;
                                                                c2.w0(c2.N);
                                                            }
                                                            this.d = false;
                                                            return;
                                                            // iftrue(Label_0361:, c3.V == null)
                                                            // iftrue(Label_0361:, u3 == null)
                                                            // iftrue(Label_0302:, !n.D0(3))
                                                            // iftrue(Label_0325:, c4.V == null || c4.q != null)
                                                        Block_8_Outer:
                                                            while (true) {
                                                                this.s();
                                                                Label_0302: {
                                                                    Block_12: {
                                                                        while (true) {
                                                                            Label_0325: {
                                                                                break Label_0325;
                                                                                sb2 = new StringBuilder();
                                                                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                                                                sb2.append(this.c);
                                                                                Log.d("FragmentManager", sb2.toString());
                                                                                break Label_0302;
                                                                            }
                                                                            c3 = this.c;
                                                                            u3 = c3.U;
                                                                            break Block_12;
                                                                            this.d = false;
                                                                            this.h();
                                                                            this.c.o = 1;
                                                                            continue Block_10_Outer;
                                                                            continue Label_0502_Outer;
                                                                        }
                                                                        this.i();
                                                                        continue Block_10_Outer;
                                                                        this.n();
                                                                        continue Block_10_Outer;
                                                                        this.v();
                                                                        continue Block_10_Outer;
                                                                        fragment.o = 5;
                                                                        continue Block_10_Outer;
                                                                        fragment.C = false;
                                                                        fragment.o = 2;
                                                                        continue Block_10_Outer;
                                                                        this.g();
                                                                        continue Block_10_Outer;
                                                                    }
                                                                    B.n(u3, c3.F()).d(this);
                                                                    break Block_8_Outer;
                                                                }
                                                                c4 = this.c;
                                                                continue Block_8_Outer;
                                                            }
                                                            this.c.o = 3;
                                                            continue Block_10_Outer;
                                                        }
                                                        finally {}
                                                        fragment = fragment2;
                                                        continue Label_0385_Outer;
                                                    }
                                                }
                                                switch (o - 1) {
                                                    case 6: {
                                                        continue Label_0253_Outer;
                                                    }
                                                    case 5: {
                                                        continue Label_0372_Outer;
                                                    }
                                                    case 4: {
                                                        continue Label_0245_Outer;
                                                    }
                                                    case 3: {
                                                        continue Label_0407_Outer;
                                                    }
                                                    case 2: {
                                                        continue Label_0400_Outer;
                                                    }
                                                    case 1: {
                                                        continue Label_0260_Outer;
                                                    }
                                                    case 0: {
                                                        continue;
                                                    }
                                                    case -1: {
                                                        continue Label_0238_Outer;
                                                    }
                                                    default: {
                                                        continue Label_0385_Outer;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public void n() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.c1();
        this.a.f(this.c, false);
    }
    
    public void o(final ClassLoader classLoader) {
        final Bundle p = this.c.p;
        if (p == null) {
            return;
        }
        p.setClassLoader(classLoader);
        final Fragment c = this.c;
        c.q = c.p.getSparseParcelableArray("android:view_state");
        final Fragment c2 = this.c;
        c2.r = c2.p.getBundle("android:view_registry_state");
        final Fragment c3 = this.c;
        c3.w = ((BaseBundle)c3.p).getString("android:target_state");
        final Fragment c4 = this.c;
        if (c4.w != null) {
            c4.x = ((BaseBundle)c4.p).getInt("android:target_req_state", 0);
        }
        final Fragment c5 = this.c;
        final Boolean s = c5.s;
        if (s != null) {
            c5.X = s;
            this.c.s = null;
        }
        else {
            c5.X = ((BaseBundle)c5.p).getBoolean("android:user_visible_hint", true);
        }
        final Fragment c6 = this.c;
        if (!c6.X) {
            c6.W = true;
        }
    }
    
    public void p() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final View y = this.c.y();
        if (y != null && this.l(y)) {
            final boolean requestFocus = y.requestFocus();
            if (n.D0(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(y);
                sb2.append(" ");
                String str;
                if (requestFocus) {
                    str = "succeeded";
                }
                else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.c.V.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.c.x1(null);
        this.c.g1();
        this.a.i(this.c, false);
        final Fragment c = this.c;
        c.p = null;
        c.q = null;
        c.r = null;
    }
    
    public final Bundle q() {
        final Bundle bundle = new Bundle();
        this.c.h1(bundle);
        this.a.j(this.c, bundle, false);
        Bundle bundle2 = bundle;
        if (((BaseBundle)bundle).isEmpty()) {
            bundle2 = null;
        }
        if (this.c.V != null) {
            this.s();
        }
        Object o = bundle2;
        if (this.c.q != null) {
            if ((o = bundle2) == null) {
                o = new Bundle();
            }
            ((Bundle)o).putSparseParcelableArray("android:view_state", this.c.q);
        }
        Bundle bundle3 = (Bundle)o;
        if (this.c.r != null) {
            if ((bundle3 = (Bundle)o) == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("android:view_registry_state", this.c.r);
        }
        Object o2 = bundle3;
        if (!this.c.X) {
            if ((o2 = bundle3) == null) {
                o2 = new Bundle();
            }
            ((BaseBundle)o2).putBoolean("android:user_visible_hint", this.c.X);
        }
        return (Bundle)o2;
    }
    
    public s r() {
        final s s = new s(this.c);
        final Fragment c = this.c;
        if (c.o > -1 && s.A == null) {
            final Bundle q = this.q();
            s.A = q;
            if (this.c.w != null) {
                if (q == null) {
                    s.A = new Bundle();
                }
                ((BaseBundle)s.A).putString("android:target_state", this.c.w);
                final int x = this.c.x;
                if (x != 0) {
                    ((BaseBundle)s.A).putInt("android:target_req_state", x);
                    return s;
                }
            }
        }
        else {
            s.A = c.p;
        }
        return s;
    }
    
    public void s() {
        if (this.c.V == null) {
            return;
        }
        final SparseArray q = new SparseArray();
        this.c.V.saveHierarchyState(q);
        if (q.size() > 0) {
            this.c.q = q;
        }
        final Bundle r = new Bundle();
        this.c.h0.e(r);
        if (!((BaseBundle)r).isEmpty()) {
            this.c.r = r;
        }
    }
    
    public void t(final int e) {
        this.e = e;
    }
    
    public void u() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.i1();
        this.a.k(this.c, false);
    }
    
    public void v() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.j1();
        this.a.l(this.c, false);
    }
}

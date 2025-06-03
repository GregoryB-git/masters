// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import E.c;
import I.q;
import android.graphics.Rect;
import java.util.Map;
import java.util.List;
import I.s;
import java.util.Collection;
import android.view.ViewGroup;
import android.util.SparseArray;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

public abstract class w
{
    public static final int[] a;
    public static final y b;
    public static final y c;
    
    static {
        a = new int[] { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10 };
        b = new x();
        c = w();
    }
    
    public static void A(final ArrayList list, final int visibility) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            list.get(i).setVisibility(visibility);
        }
    }
    
    public static void B(final Context context, final androidx.fragment.app.g g, final ArrayList list, final ArrayList list2, final int n, final int n2, final boolean b, final g g2) {
        final SparseArray sparseArray = new SparseArray();
        for (int i = n; i < n2; ++i) {
            final a a = list.get(i);
            if (list2.get(i)) {
                e(a, sparseArray, b);
            }
            else {
                c(a, sparseArray, b);
            }
        }
        if (sparseArray.size() != 0) {
            final View view = new View(context);
            for (int size = sparseArray.size(), j = 0; j < size; ++j) {
                final int key = sparseArray.keyAt(j);
                final t.a d = d(key, list, list2, n, n2);
                final h h = (h)sparseArray.valueAt(j);
                if (g.f()) {
                    final ViewGroup viewGroup = (ViewGroup)g.e(key);
                    if (viewGroup != null) {
                        if (b) {
                            o(viewGroup, h, view, d, g2);
                        }
                        else {
                            n(viewGroup, h, view, d, g2);
                        }
                    }
                }
            }
        }
    }
    
    public static void a(final ArrayList list, final t.a a, final Collection collection) {
        for (int i = a.size() - 1; i >= 0; --i) {
            final View e = (View)a.l(i);
            if (collection.contains(s.q(e))) {
                list.add(e);
            }
        }
    }
    
    public static void b(final a a, final v.a a2, final SparseArray sparseArray, final boolean b, final boolean b2) {
        final Fragment b3 = a2.b;
        if (b3 == null) {
            return;
        }
        final int l = b3.L;
        if (l == 0) {
            return;
        }
        int a3;
        if (b) {
            a3 = w.a[a2.a];
        }
        else {
            a3 = a2.a;
        }
        boolean b4 = false;
        final boolean b5 = true;
        int n = 0;
        int n3 = 0;
        int n2 = 0;
    Label_0141:
        while (true) {
        Label_0135:
            while (true) {
            Label_0197_Outer:
                while (true) {
                    Label_0304: {
                        if (a3 != 1) {
                            while (true) {
                                while (true) {
                                    Label_0241: {
                                        if (a3 == 3) {
                                            break Label_0241;
                                        }
                                        if (a3 != 4) {
                                            if (a3 != 5) {
                                                if (a3 == 6) {
                                                    break Label_0241;
                                                }
                                                if (a3 != 7) {
                                                    n = 0;
                                                    n2 = (n3 = n);
                                                    break Label_0141;
                                                }
                                                break Label_0304;
                                            }
                                            else {
                                                if (!b2) {
                                                    b4 = b3.N;
                                                    break Label_0154;
                                                }
                                                if (b3.b0 && !b3.N && b3.z) {
                                                    break Label_0135;
                                                }
                                                break Label_0141;
                                            }
                                        }
                                        else if (!(b2 ? (b3.b0 && b3.z && b3.N) : (b3.z && !b3.N))) {
                                            break Label_0203;
                                        }
                                        int n4 = 1;
                                        Label_0228: {
                                            break Label_0228;
                                            n4 = 0;
                                        }
                                        n3 = n4;
                                        n = 1;
                                        n2 = 0;
                                        break Label_0141;
                                    }
                                    final boolean z = b3.z;
                                    if (b2) {
                                        if (z) {
                                            continue Label_0197_Outer;
                                        }
                                        final View v = b3.V;
                                        if (v == null || v.getVisibility() != 0 || b3.c0 < 0.0f) {
                                            continue Label_0197_Outer;
                                        }
                                    }
                                    else if (!z || b3.N) {
                                        continue Label_0197_Outer;
                                    }
                                    break;
                                }
                                continue;
                            }
                        }
                        break Label_0304;
                        b4 = true;
                        break Label_0154;
                        b4 = false;
                        n3 = (n = 0);
                        n2 = (b5 ? 1 : 0);
                        break Label_0141;
                    }
                    if (b2) {
                        b4 = b3.a0;
                        continue;
                    }
                    break;
                }
                if (!b3.z && !b3.N) {
                    continue Label_0135;
                }
                break;
            }
            continue Label_0141;
        }
        h p5;
        final h h = p5 = (h)sparseArray.get(l);
        if (b4) {
            p5 = p(h, sparseArray, l);
            p5.a = b3;
            p5.b = b;
            p5.c = a;
        }
        if (!b2 && n2 != 0) {
            if (p5 != null && p5.d == b3) {
                p5.d = null;
            }
            if (!a.r) {
                final n t = a.t;
                t.q0().p(t.v(b3));
                t.N0(b3);
            }
        }
        h p6 = p5;
        Label_0499: {
            if (n3 != 0) {
                if (p5 != null) {
                    p6 = p5;
                    if (p5.d != null) {
                        break Label_0499;
                    }
                }
                p6 = p(p5, sparseArray, l);
                p6.d = b3;
                p6.e = b;
                p6.f = a;
            }
        }
        if (!b2 && n != 0 && p6 != null && p6.a == b3) {
            p6.a = null;
        }
    }
    
    public static void c(final a a, final SparseArray sparseArray, final boolean b) {
        for (int size = a.c.size(), i = 0; i < size; ++i) {
            b(a, (v.a)a.c.get(i), sparseArray, false, b);
        }
    }
    
    public static t.a d(final int n, final ArrayList list, final ArrayList list2, final int n2, int i) {
        final t.a a = new t.a();
        a a2;
        boolean booleanValue;
        ArrayList p5;
        int size;
        ArrayList list3;
        ArrayList list4;
        int j;
        String s;
        String s2;
        String s3;
        for (--i; i >= n2; --i) {
            a2 = list.get(i);
            if (a2.u(n)) {
                booleanValue = list2.get(i);
                p5 = a2.p;
                if (p5 != null) {
                    size = p5.size();
                    if (booleanValue) {
                        list3 = a2.p;
                        list4 = a2.q;
                    }
                    else {
                        list4 = a2.p;
                        list3 = a2.q;
                    }
                    for (j = 0; j < size; ++j) {
                        s = list4.get(j);
                        s2 = list3.get(j);
                        s3 = (String)a.remove(s2);
                        if (s3 != null) {
                            a.put(s, s3);
                        }
                        else {
                            a.put(s, s2);
                        }
                    }
                }
            }
        }
        return a;
    }
    
    public static void e(final a a, final SparseArray sparseArray, final boolean b) {
        if (!a.t.n0().f()) {
            return;
        }
        for (int i = a.c.size() - 1; i >= 0; --i) {
            b(a, (v.a)a.c.get(i), sparseArray, true, b);
        }
    }
    
    public static void f(final Fragment fragment, final Fragment fragment2, final boolean b, final t.a a, final boolean b2) {
        if (b) {
            fragment2.v();
            return;
        }
        fragment.v();
    }
    
    public static boolean g(final y y, final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (!y.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static t.a h(final y y, final t.a a, final Object o, final h h) {
        final Fragment a2 = h.a;
        final View r = a2.R();
        if (!a.isEmpty() && o != null && r != null) {
            final t.a a3 = new t.a();
            y.j(a3, r);
            final a c = h.c;
            ArrayList list;
            if (h.b) {
                a2.x();
                list = c.p;
            }
            else {
                a2.v();
                list = c.q;
            }
            if (list != null) {
                a3.p(list);
                a3.p(a.values());
            }
            x(a, a3);
            return a3;
        }
        a.clear();
        return null;
    }
    
    public static t.a i(final y y, final t.a a, final Object o, final h h) {
        if (!a.isEmpty() && o != null) {
            final Fragment d = h.d;
            final t.a a2 = new t.a();
            y.j(a2, d.q1());
            final a f = h.f;
            ArrayList list;
            if (h.e) {
                d.v();
                list = f.q;
            }
            else {
                d.x();
                list = f.p;
            }
            if (list != null) {
                a2.p(list);
            }
            a.p(a2.keySet());
            return a2;
        }
        a.clear();
        return null;
    }
    
    public static y j(final Fragment fragment, final Fragment fragment2) {
        final ArrayList<Object> list = new ArrayList<Object>();
        if (fragment != null) {
            final Object w = fragment.w();
            if (w != null) {
                list.add(w);
            }
            final Object k = fragment.K();
            if (k != null) {
                list.add(k);
            }
            final Object m = fragment.M();
            if (m != null) {
                list.add(m);
            }
        }
        if (fragment2 != null) {
            final Object u = fragment2.u();
            if (u != null) {
                list.add(u);
            }
            final Object h = fragment2.H();
            if (h != null) {
                list.add(h);
            }
            final Object l = fragment2.L();
            if (l != null) {
                list.add(l);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final y b = w.b;
        if (b != null && g(b, list)) {
            return b;
        }
        final y c = w.c;
        if (c != null && g(c, list)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }
    
    public static ArrayList k(final y y, final Object o, final Fragment fragment, final ArrayList c, final View e) {
        ArrayList<View> list2;
        if (o != null) {
            final ArrayList<View> list = new ArrayList<View>();
            final View r = fragment.R();
            if (r != null) {
                y.f(list, r);
            }
            if (c != null) {
                list.removeAll(c);
            }
            list2 = list;
            if (!list.isEmpty()) {
                list.add(e);
                y.b(o, list);
                return list;
            }
        }
        else {
            list2 = null;
        }
        return list2;
    }
    
    public static Object l(final y y, final ViewGroup viewGroup, final View view, final t.a a, final h h, final ArrayList list, final ArrayList list2, final Object o, Object o2) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        if (a2 == null) {
            return null;
        }
        if (d == null) {
            return null;
        }
        final boolean b = h.b;
        Object t;
        if (a.isEmpty()) {
            t = null;
        }
        else {
            t = t(y, a2, d, b);
        }
        final t.a i = i(y, a, t, h);
        if (a.isEmpty()) {
            t = null;
        }
        else {
            list.addAll(i.values());
        }
        if (o == null && o2 == null && t == null) {
            return null;
        }
        f(a2, d, b, i, true);
        if (t != null) {
            final Rect rect = new Rect();
            y.z(t, view, list);
            z(y, t, o2, i, h.e, h.f);
            o2 = rect;
            if (o != null) {
                y.u(o, rect);
                o2 = rect;
            }
        }
        else {
            o2 = null;
        }
        q.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                final t.a h = androidx.fragment.app.w.h(y, a, t, h);
                if (h != null) {
                    list2.addAll(h.values());
                    list2.add(view);
                }
                androidx.fragment.app.w.f(a2, d, b, h, false);
                final Object q = t;
                if (q != null) {
                    y.A(q, list, list2);
                    final View s = androidx.fragment.app.w.s(h, h, o, b);
                    if (s != null) {
                        y.k(s, o2);
                    }
                }
            }
        });
        return t;
    }
    
    public static Object m(final y y, final ViewGroup viewGroup, final View e, final t.a a, final h h, final ArrayList list, final ArrayList list2, final Object o, final Object o2) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        if (a2 != null) {
            a2.q1().setVisibility(0);
        }
        if (a2 == null) {
            return null;
        }
        if (d == null) {
            return null;
        }
        final boolean b = h.b;
        Object t;
        if (a.isEmpty()) {
            t = null;
        }
        else {
            t = t(y, a2, d, b);
        }
        final t.a i = i(y, a, t, h);
        final t.a h2 = h(y, a, t, h);
        Object o3;
        if (a.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            o3 = null;
        }
        else {
            a(list, i, a.keySet());
            a(list2, h2, a.values());
            o3 = t;
        }
        if (o == null && o2 == null && o3 == null) {
            return null;
        }
        f(a2, d, b, i, true);
        View s;
        Object o4;
        if (o3 != null) {
            list2.add(e);
            y.z(o3, e, list);
            z(y, o3, o2, i, h.e, h.f);
            final Rect rect = new Rect();
            s = s(h2, h, o, b);
            if (s != null) {
                y.u(o, rect);
            }
            o4 = rect;
        }
        else {
            o4 = (s = null);
        }
        q.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                w.f(a2, d, b, h2, false);
                final View s = s;
                if (s != null) {
                    y.k(s, o4);
                }
            }
        });
        return o3;
    }
    
    public static void n(final ViewGroup viewGroup, final h h, final View view, final t.a a, final g g) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        final y j = j(d, a2);
        if (j == null) {
            return;
        }
        final boolean b = h.b;
        final boolean e = h.e;
        final Object q = q(j, a2, b);
        Object r = r(j, d, e);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Object l = l(j, viewGroup, view, a, h, list, list2, q, r);
        if (q == null && l == null) {
            if (r == null) {
                return;
            }
        }
        final ArrayList k = k(j, r, d, list, view);
        if (k == null || k.isEmpty()) {
            r = null;
        }
        j.a(q, view);
        final Object u = u(j, q, r, l, a2, h.b);
        if (d != null && k != null && (k.size() > 0 || list.size() > 0)) {
            final c c = new c();
            g.b(d, c);
            j.w(d, u, c, new Runnable() {
                @Override
                public void run() {
                    g.a(d, c);
                }
            });
        }
        if (u != null) {
            final ArrayList list3 = new ArrayList();
            j.t(u, q, list3, r, k, l, list2);
            y(j, viewGroup, a2, view, list2, q, list3, r, k);
            j.x((View)viewGroup, list2, a);
            j.c(viewGroup, u);
            j.s(viewGroup, list2, a);
        }
    }
    
    public static void o(final ViewGroup viewGroup, final h h, final View view, final t.a a, final g g) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        final y j = j(d, a2);
        if (j == null) {
            return;
        }
        final boolean b = h.b;
        final boolean e = h.e;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Object q = q(j, a2, b);
        final Object r = r(j, d, e);
        final Object m = m(j, viewGroup, view, a, h, list2, list, q, r);
        if (q == null && m == null && r == null) {
            return;
        }
        final Object o = r;
        final ArrayList k = k(j, o, d, list2, view);
        final ArrayList i = k(j, q, a2, list, view);
        A(i, 4);
        final Object u = u(j, q, o, m, a2, b);
        if (d != null && k != null && (k.size() > 0 || list2.size() > 0)) {
            final c c = new c();
            g.b(d, c);
            j.w(d, u, c, new Runnable() {
                @Override
                public void run() {
                    g.a(d, c);
                }
            });
        }
        if (u != null) {
            v(j, o, d, k);
            final ArrayList o2 = j.o(list);
            j.t(u, q, i, o, k, m, list);
            j.c(viewGroup, u);
            j.y((View)viewGroup, list2, list, o2, a);
            A(i, 0);
            j.A(m, list2, list);
        }
    }
    
    public static h p(final h h, final SparseArray sparseArray, final int n) {
        h h2 = h;
        if (h == null) {
            h2 = new h();
            sparseArray.put(n, (Object)h2);
        }
        return h2;
    }
    
    public static Object q(final y y, final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        Object o;
        if (b) {
            o = fragment.H();
        }
        else {
            o = fragment.u();
        }
        return y.g(o);
    }
    
    public static Object r(final y y, final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        Object o;
        if (b) {
            o = fragment.K();
        }
        else {
            o = fragment.w();
        }
        return y.g(o);
    }
    
    public static View s(final t.a a, final h h, final Object o, final boolean b) {
        final a c = h.c;
        if (o != null && a != null) {
            final ArrayList p4 = c.p;
            if (p4 != null && !p4.isEmpty()) {
                ArrayList list;
                if (b) {
                    list = c.p;
                }
                else {
                    list = c.q;
                }
                return (View)a.get(list.get(0));
            }
        }
        return null;
    }
    
    public static Object t(final y y, final Fragment fragment, final Fragment fragment2, final boolean b) {
        if (fragment != null && fragment2 != null) {
            Object o;
            if (b) {
                o = fragment2.M();
            }
            else {
                o = fragment.L();
            }
            return y.B(y.g(o));
        }
        return null;
    }
    
    public static Object u(final y y, final Object o, final Object o2, final Object o3, final Fragment fragment, final boolean b) {
        if (o != null && o2 != null && fragment != null) {
            boolean b2;
            if (b) {
                b2 = fragment.p();
            }
            else {
                b2 = fragment.o();
            }
            if (!b2) {
                return y.m(o2, o, o3);
            }
        }
        return y.n(o2, o, o3);
    }
    
    public static void v(final y y, final Object o, final Fragment fragment, final ArrayList list) {
        if (fragment != null && o != null && fragment.z && fragment.N && fragment.b0) {
            fragment.y1(true);
            y.r(o, fragment.R(), list);
            q.a((View)fragment.U, new Runnable() {
                @Override
                public void run() {
                    w.A(list, 4);
                }
            });
        }
    }
    
    public static y w() {
        try {
            return (y)Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static void x(final t.a a, final t.a a2) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (!a2.containsKey(a.l(i))) {
                a.j(i);
            }
        }
    }
    
    public static void y(final y y, final ViewGroup viewGroup, final Fragment fragment, final View view, final ArrayList list, final Object o, final ArrayList list2, final Object o2, final ArrayList list3) {
        q.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                final Object o = o;
                if (o != null) {
                    y.p(o, view);
                    list2.addAll(w.k(y, o, fragment, list, view));
                }
                if (list3 != null) {
                    if (o2 != null) {
                        final ArrayList<View> list = new ArrayList<View>();
                        list.add(view);
                        y.q(o2, list3, list);
                    }
                    list3.clear();
                    list3.add(view);
                }
            }
        });
    }
    
    public static void z(final y y, final Object o, final Object o2, final t.a a, final boolean b, final a a2) {
        final ArrayList p6 = a2.p;
        if (p6 != null && !p6.isEmpty()) {
            ArrayList list;
            if (b) {
                list = a2.q;
            }
            else {
                list = a2.p;
            }
            final View view = (View)a.get(list.get(0));
            y.v(o, view);
            if (o2 != null) {
                y.v(o2, view);
            }
        }
    }
    
    public interface g
    {
        void a(final Fragment p0, final c p1);
        
        void b(final Fragment p0, final c p1);
    }
    
    public static class h
    {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;
    }
}

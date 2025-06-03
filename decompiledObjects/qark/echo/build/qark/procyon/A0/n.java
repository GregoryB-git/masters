// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import java.util.concurrent.Executor;
import java.util.Objects;
import android.media.AudioFormat$Builder;
import android.media.AudioManager;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.media.Spatializer;
import java.util.Iterator;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import android.os.Looper;
import d0.I;
import x0.x;
import java.util.Collection;
import java.util.Collections;
import X2.v;
import java.util.ArrayList;
import android.util.Pair;
import k0.Y0;
import k0.Z0;
import k0.b1;
import java.util.List;
import android.graphics.Point;
import d0.J;
import android.text.TextUtils;
import java.util.Map;
import java.util.HashMap;
import x0.Z;
import d0.q;
import g0.o;
import g0.M;
import d0.K;
import java.util.Comparator;
import d0.b;
import android.content.Context;
import X2.P;
import k0.a1;

public class n extends A implements a1.a
{
    public static final P k;
    public final Object d;
    public final Context e;
    public final y.b f;
    public final boolean g;
    public e h;
    public g i;
    public d0.b j;
    
    static {
        k = P.b(new A0.d());
    }
    
    public n(final Context context) {
        this(context, new A0.a.b());
    }
    
    public n(final Context context, final y.b b) {
        this(context, n.e.h(context), b);
    }
    
    public n(final Context context, final K k, final y.b b) {
        this(k, b, context);
    }
    
    public n(final K k, final y.b f, final Context context) {
        this.d = new Object();
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        }
        else {
            applicationContext = null;
        }
        this.e = applicationContext;
        this.f = f;
        e a0;
        if (k instanceof e) {
            a0 = (e)k;
        }
        else {
            e e;
            if (context == null) {
                e = n.e.A0;
            }
            else {
                e = n.e.h(context);
            }
            a0 = e.g().d0(k).a0();
        }
        this.h = a0;
        this.j = d0.b.g;
        final boolean g = context != null && M.E0(context);
        this.g = g;
        if (!g && context != null && M.a >= 32) {
            this.i = n.g.g(context);
        }
        if (this.h.t0 && context == null) {
            o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
    
    public static /* synthetic */ P A() {
        return n.k;
    }
    
    public static void D(final A.a a, final e e, final y.a[] array) {
        for (int d = a.d(), i = 0; i < d; ++i) {
            final Z f = a.f(i);
            if (e.k(i, f)) {
                e.j(i, f);
                array[i] = null;
            }
        }
    }
    
    public static void E(final A.a a, final K k, final y.a[] array) {
        final int d = a.d();
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        final int n = 0;
        for (int i = 0; i < d; ++i) {
            F(a.f(i), k, hashMap);
        }
        F(a.h(), k, hashMap);
        for (int j = n; j < d; ++j) {
            android.support.v4.media.a.a(hashMap.get(a.e(j)));
        }
    }
    
    public static void F(final Z z, final K k, final Map map) {
        for (int i = 0; i < z.a; ++i) {
            android.support.v4.media.a.a(k.A.get(z.b(i)));
        }
    }
    
    public static int G(final q q, String x, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)x) && x.equals(q.d)) {
            return 4;
        }
        x = X(x);
        final String x2 = X(q.d);
        final boolean b2 = false;
        if (x2 == null || x == null) {
            int n = b2 ? 1 : 0;
            if (b) {
                n = (b2 ? 1 : 0);
                if (x2 == null) {
                    n = 1;
                }
            }
            return n;
        }
        if (x2.startsWith(x) || x.startsWith(x2)) {
            return 3;
        }
        if (M.c1(x2, "-")[0].equals(M.c1(x, "-")[0])) {
            return 2;
        }
        return 0;
    }
    
    public static int H(final J j, final int n, final int n2, final boolean b) {
        int n4;
        int n3 = n4 = Integer.MAX_VALUE;
        if (n != Integer.MAX_VALUE) {
            if (n2 == Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            int n5 = 0;
            while (true) {
                n4 = n3;
                if (n5 >= j.a) {
                    break;
                }
                final q a = j.a(n5);
                final int t = a.t;
                int n6 = n3;
                if (t > 0) {
                    final int u = a.u;
                    n6 = n3;
                    if (u > 0) {
                        final Point i = I(b, n, n2, t, u);
                        final int t2 = a.t;
                        final int u2 = a.u;
                        final int n7 = t2 * u2;
                        n6 = n3;
                        if (t2 >= (int)(i.x * 0.98f)) {
                            n6 = n3;
                            if (u2 >= (int)(i.y * 0.98f) && n7 < (n6 = n3)) {
                                n6 = n7;
                            }
                        }
                    }
                }
                ++n5;
                n3 = n6;
            }
        }
        return n4;
    }
    
    public static Point I(final boolean b, int n, int n2, final int n3, final int n4) {
        Label_0048: {
            if (b) {
                int n5 = false ? 1 : 0;
                final boolean b2 = n3 > n4;
                if (n > n2) {
                    n5 = (true ? 1 : 0);
                }
                if ((b2 ? 1 : 0) != n5) {
                    break Label_0048;
                }
            }
            final int n6 = n2;
            n2 = n;
            n = n6;
        }
        final int n7 = n3 * n;
        final int n8 = n4 * n2;
        if (n7 >= n8) {
            return new Point(n2, M.k(n8, n3));
        }
        return new Point(M.k(n7, n4), n);
    }
    
    public static int K(final int n, final int n2) {
        if (n != 0 && n == n2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(n & n2);
    }
    
    public static int L(final String s) {
        if (s == null) {
            return 0;
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1599127257: {
                if (!s.equals("video/x-vnd.on2.vp9")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1331836730: {
                if (!s.equals("video/avc")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1662541442: {
                if (!s.equals("video/hevc")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1662735862: {
                if (!s.equals("video/av01")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1851077871: {
                if (!s.equals("video/dolby-vision")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 0;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 0: {
                return 5;
            }
        }
    }
    
    public static boolean N(final q q) {
        final String n = q.n;
        if (n == null) {
            return false;
        }
        n.hashCode();
        final int hashCode = n.hashCode();
        int n2 = -1;
        switch (hashCode) {
            case 1504578661: {
                if (!n.equals("audio/eac3")) {
                    break;
                }
                n2 = 3;
                break;
            }
            case 187078297: {
                if (!n.equals("audio/ac4")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 187078296: {
                if (!n.equals("audio/ac3")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case -2123537834: {
                if (!n.equals("audio/eac3-joc")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        switch (n2) {
            default: {
                return false;
            }
            case 0:
            case 1:
            case 2:
            case 3: {
                return true;
            }
        }
    }
    
    public static void T(final e e, final A.a a, final int[][][] array, final b1[] array2, final y[] array3) {
        int n = -1;
        final boolean b = false;
        int n2;
        int n3;
        int n4;
        for (int i = n2 = 0; i < a.d(); ++i, n = n3, n2 = n4) {
            final int e2 = a.e(i);
            final y y = array3[i];
            if (e2 != 1 && y != null) {
                return;
            }
            n3 = n;
            n4 = n2;
            if (e2 == 1) {
                n3 = n;
                n4 = n2;
                if (y != null) {
                    n3 = n;
                    n4 = n2;
                    if (y.length() == 1) {
                        final int d = a.f(i).d(y.d());
                        n3 = n;
                        n4 = n2;
                        if (Y(e, array[i][d][y.c(0)], y.m())) {
                            n4 = n2 + 1;
                            n3 = i;
                        }
                    }
                }
            }
        }
        if (n2 == 1) {
            int n5;
            if (e.s.b) {
                n5 = 1;
            }
            else {
                n5 = 2;
            }
            final b1 b2 = array2[n];
            boolean b3 = b;
            if (b2 != null) {
                b3 = b;
                if (b2.b) {
                    b3 = true;
                }
            }
            array2[n] = new b1(n5, b3);
        }
    }
    
    public static void U(final A.a a, final int[][][] array, final b1[] array2, final y[] array3) {
        int n2;
        int n = n2 = -1;
        while (true) {
            int n3;
            int n4;
            for (int i = 0; i < a.d(); ++i, n = n3, n2 = n4) {
                final int e = a.e(i);
                final y y = array3[i];
                if (e != 1) {
                    n3 = n;
                    n4 = n2;
                    if (e != 2) {
                        continue;
                    }
                }
                n3 = n;
                n4 = n2;
                if (y != null) {
                    n3 = n;
                    n4 = n2;
                    if (Z(array[i], a.f(i), y)) {
                        if (e == 1) {
                            if (n2 == -1) {
                                n4 = i;
                                n3 = n;
                                continue;
                            }
                        }
                        else if (n == -1) {
                            n3 = i;
                            n4 = n2;
                            continue;
                        }
                        final boolean b = false;
                        if (b & (n2 != -1 && n != -1)) {
                            array2[n] = (array2[n2] = new b1(0, true));
                        }
                        return;
                    }
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public static String X(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final String s2 = s;
            if (!TextUtils.equals((CharSequence)s, (CharSequence)"und")) {
                return s2;
            }
        }
        return null;
    }
    
    public static boolean Y(final e e, int n, final q q) {
        final int f = Z0.f(n);
        boolean b = false;
        if (f == 0) {
            return false;
        }
        if (e.s.c && (Z0.f(n) & 0x800) == 0x0) {
            return false;
        }
        if (e.s.b) {
            final boolean b2 = q.E != 0 || q.F != 0;
            if ((Z0.f(n) & 0x400) != 0x0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (!b2 || n != 0) {
                b = true;
            }
            return b;
        }
        return true;
    }
    
    public static boolean Z(final int[][] array, final Z z, final y y) {
        if (y == null) {
            return false;
        }
        final int d = z.d(y.d());
        for (int i = 0; i < y.length(); ++i) {
            if (Z0.j(array[d][y.c(i)]) != 32) {
                return false;
            }
        }
        return true;
    }
    
    public e J() {
        synchronized (this.d) {
            return this.h;
        }
    }
    
    public final boolean M(final q q) {
        while (true) {
            final Object d = this.d;
            // monitorenter(d)
            while (true) {
                Label_0151: {
                    Label_0146: {
                        while (true) {
                            try {
                                if (!this.h.t0 || this.g || q.B <= 2) {
                                    break Label_0151;
                                }
                                if (N(q)) {
                                    if (M.a < 32) {
                                        break Label_0151;
                                    }
                                    final g i = this.i;
                                    if (i == null || !i.e()) {
                                        break Label_0151;
                                    }
                                }
                                if (M.a < 32) {
                                    break Label_0146;
                                }
                                final g j = this.i;
                                if (j != null && j.e() && this.i.c() && this.i.d() && this.i.a(this.j, q)) {
                                    break Label_0151;
                                }
                                break Label_0146;
                                // monitorexit(d)
                                return;
                                // monitorexit(d)
                                throw;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
                final boolean b = true;
                continue;
            }
        }
    }
    
    public final void V() {
        while (true) {
            final Object d = this.d;
            // monitorenter(d)
            while (true) {
                Label_0072: {
                    while (true) {
                        try {
                            if (!this.h.t0 || this.g || M.a < 32) {
                                break Label_0072;
                            }
                            final g i = this.i;
                            if (i != null && i.e()) {
                                final int n = 1;
                                // monitorexit(d)
                                if (n != 0) {
                                    this.f();
                                }
                                return;
                            }
                            break Label_0072;
                            // monitorexit(d)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public final void W(final Y0 y0) {
        synchronized (this.d) {
            final boolean x0 = this.h.x0;
            // monitorexit(this.d)
            if (x0) {
                this.g(y0);
            }
        }
    }
    
    @Override
    public void a(final Y0 y0) {
        this.W(y0);
    }
    
    public y.a[] a0(final A.a a, final int[][][] array, final int[] array2, final e e) {
        final int d = a.d();
        final y.a[] array3 = new y.a[d];
        final Pair g0 = this.g0(a, array, array2, e);
        final boolean x = e.x;
        final String s = null;
        Pair c0;
        if (!x && g0 != null) {
            c0 = null;
        }
        else {
            c0 = this.c0(a, array, e);
        }
        if (c0 != null) {
            array3[c0.second] = (y.a)c0.first;
        }
        else if (g0 != null) {
            array3[g0.second] = (y.a)g0.first;
        }
        final Pair b0 = this.b0(a, array, array2, e);
        if (b0 != null) {
            array3[b0.second] = (y.a)b0.first;
        }
        final int n = 0;
        String d2;
        if (b0 == null) {
            d2 = s;
        }
        else {
            final Object first = b0.first;
            d2 = ((y.a)first).a.a(((y.a)first).b[0]).d;
        }
        final Pair e2 = this.e0(a, array, e, d2);
        int i = n;
        if (e2 != null) {
            array3[e2.second] = (y.a)e2.first;
            i = n;
        }
        while (i < d) {
            final int e3 = a.e(i);
            if (e3 != 2 && e3 != 1 && e3 != 3 && e3 != 4) {
                array3[i] = this.d0(e3, a.f(i), array[i], e);
            }
            ++i;
        }
        return array3;
    }
    
    public Pair b0(final A.a a, final int[][][] array, final int[] array2, final e e) {
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= a.d()) {
                break;
            }
            if (2 == a.e(n) && a.f(n).a > 0) {
                b2 = true;
                break;
            }
            ++n;
        }
        return this.f0(1, a, array, (i.a)new A0.g(this, e, b2, array2), new A0.h());
    }
    
    public Pair c0(final A.a a, final int[][][] array, final e e) {
        if (e.s.a == 2) {
            return null;
        }
        return this.f0(4, a, array, (i.a)new A0.e(e), new A0.f());
    }
    
    @Override
    public a1.a d() {
        return this;
    }
    
    public y.a d0(int i, final Z z, final int[][] array, final e e) {
        if (e.s.a == 2) {
            return null;
        }
        int n;
        int j = n = 0;
        d d;
        Object o = d = null;
        while (j < z.a) {
            final J b = z.b(j);
            final int[] array2 = array[j];
            J k;
            int n2;
            d d2;
            d d3;
            for (i = 0; i < b.a; ++i, o = k, n = n2, d = d2) {
                k = (J)o;
                n2 = n;
                d2 = d;
                if (Z0.k(array2[i], e.u0)) {
                    d3 = new d(b.a(i), array2[i]);
                    if (d != null) {
                        k = (J)o;
                        n2 = n;
                        d2 = d;
                        if (d3.c(d) <= 0) {
                            continue;
                        }
                    }
                    k = b;
                    n2 = i;
                    d2 = d3;
                }
            }
            ++j;
        }
        if (o == null) {
            return null;
        }
        return new y.a((J)o, new int[] { n });
    }
    
    public Pair e0(final A.a a, final int[][][] array, final e e, final String s) {
        if (e.s.a == 2) {
            return null;
        }
        return this.f0(3, a, array, (i.a)new k(e, s), new l());
    }
    
    public final Pair f0(int i, final A.a a, final int[][][] array, final i.a a2, final Comparator comp) {
        final ArrayList<List<i>> coll = new ArrayList<List<i>>();
        int n;
        for (int d = a.d(), j = 0; j < d; ++j, d = n) {
            n = d;
            if (i == a.e(j)) {
                final Z f = a.f(j);
                int n2 = 0;
                while (true) {
                    n = d;
                    if (n2 >= f.a) {
                        break;
                    }
                    final J b = f.b(n2);
                    final List a3 = a2.a(j, b, array[j][n2]);
                    final boolean[] array2 = new boolean[b.a];
                    for (int k = 0; k < b.a; ++k) {
                        final i l = a3.get(k);
                        final int c = l.c();
                        if (!array2[k] && c != 0) {
                            List z;
                            if (c == 1) {
                                z = v.Z(l);
                            }
                            else {
                                z = new ArrayList<i>();
                                z.add(l);
                                for (int n3 = k + 1; n3 < b.a; ++n3) {
                                    final i m = a3.get(n3);
                                    if (m.c() == 2 && l.e(m)) {
                                        z.add(m);
                                        array2[n3] = true;
                                    }
                                }
                            }
                            coll.add(z);
                        }
                    }
                    ++n2;
                }
            }
        }
        if (coll.isEmpty()) {
            return null;
        }
        final List<i> list = Collections.max((Collection<? extends List<i>>)coll, (Comparator<? super List<i>>)comp);
        final int[] array3 = new int[list.size()];
        for (i = 0; i < list.size(); ++i) {
            array3[i] = list.get(i).q;
        }
        final i i2 = list.get(0);
        return Pair.create((Object)new y.a(i2.p, array3), (Object)i2.o);
    }
    
    public Pair g0(final A.a a, final int[][][] array, final int[] array2, final e e) {
        if (e.s.a == 2) {
            return null;
        }
        return this.f0(2, a, array, (i.a)new A0.i(e, array2), new A0.j());
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    public final void h0(final e h) {
        g0.a.e(h);
        synchronized (this.d) {
            final boolean equals = this.h.equals(h);
            this.h = h;
            // monitorexit(this.d)
            if (equals ^ true) {
                if (h.t0 && this.e == null) {
                    o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                this.f();
            }
        }
    }
    
    @Override
    public void j() {
        final Object d = this.d;
        // monitorenter(d)
        while (true) {
            try {
                if (M.a >= 32) {
                    final g i = this.i;
                    if (i != null) {
                        i.f();
                    }
                }
                // monitorexit(d)
                super.j();
                return;
                // monitorexit(d)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void l(final d0.b j) {
        synchronized (this.d) {
            final boolean equals = this.j.equals(j);
            this.j = j;
            // monitorexit(this.d)
            if (equals ^ true) {
                this.V();
            }
        }
    }
    
    @Override
    public void m(final K k) {
        if (k instanceof e) {
            this.h0((e)k);
        }
        this.h0(new e.a(this.J(), null).d0(k).a0());
    }
    
    @Override
    public final Pair q(final A.a a, final int[][][] array, final int[] array2, final x.b b, final I i) {
        final Object d = this.d;
        // monitorenter(d)
        while (true) {
            try {
                final e h = this.h;
                if (h.t0 && M.a >= 32) {
                    final g j = this.i;
                    if (j != null) {
                        j.b(this, (Looper)g0.a.h(Looper.myLooper()));
                    }
                }
                // monitorexit(d)
                final int d2 = a.d();
                final y.a[] a2 = this.a0(a, array, array2, h);
                E(a, h, a2);
                D(a, h, a2);
                final int n = 0;
                for (int k = 0; k < d2; ++k) {
                    final int e = a.e(k);
                    if (h.i(k) || h.B.contains(e)) {
                        a2[k] = null;
                    }
                }
                final y[] a3 = this.f.a(a2, this.b(), b, i);
                final b1[] array3 = new b1[d2];
                for (int l = n; l < d2; ++l) {
                    final int e2 = a.e(l);
                    b1 c = null;
                    Label_0257: {
                        if (!h.i(l)) {
                            if (!h.B.contains(e2)) {
                                if (a.e(l) == -2 || a3[l] != null) {
                                    c = b1.c;
                                    break Label_0257;
                                }
                            }
                        }
                        c = null;
                    }
                    array3[l] = c;
                }
                if (h.v0) {
                    U(a, array, array3, a3);
                }
                if (h.s.a != 0) {
                    T(h, a, array, array3, a3);
                }
                return Pair.create((Object)array3, (Object)a3);
                // monitorexit(d)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class b extends i implements Comparable
    {
        public final boolean A;
        public final boolean B;
        public final int C;
        public final int D;
        public final boolean E;
        public final int F;
        public final int G;
        public final int H;
        public final int I;
        public final boolean J;
        public final boolean K;
        public final int s;
        public final boolean t;
        public final String u;
        public final e v;
        public final boolean w;
        public final int x;
        public final int y;
        public final int z;
        
        public b(int i, final J j, int n, final e v, final int n2, final boolean b, final W2.n n3, int n4) {
            super(i, j, n);
            this.v = v;
            if (v.s0) {
                n = 24;
            }
            else {
                n = 16;
            }
            final boolean o0 = v.o0;
            final boolean b2 = true;
            this.A = (o0 && (n4 & n) != 0x0);
            this.u = n.X(super.r.d);
            this.w = Z0.k(n2, false);
            i = 0;
            int n5;
            while (true) {
                n4 = v.n.size();
                n5 = Integer.MAX_VALUE;
                if (i >= n4) {
                    n4 = 0;
                    i = Integer.MAX_VALUE;
                    break;
                }
                n4 = n.G(super.r, v.n.get(i), false);
                if (n4 > 0) {
                    break;
                }
                ++i;
            }
            this.y = i;
            this.x = n4;
            this.z = K(super.r.f, v.o);
            final q r = super.r;
            i = r.f;
            this.B = (i == 0 || (i & 0x1) != 0x0);
            this.E = ((r.e & 0x1) != 0x0);
            i = r.B;
            this.F = i;
            this.G = r.C;
            n4 = r.i;
            this.H = n4;
            this.t = ((n4 == -1 || n4 <= v.q) && (i == -1 || i <= v.p) && n3.apply(r));
            while (true) {
                String[] l0;
                String n6;
                for (l0 = M.l0(), i = 0; i < l0.length; ++i) {
                    n4 = n.G(super.r, l0[i], false);
                    if (n4 > 0) {
                        this.C = i;
                        this.D = n4;
                        i = 0;
                        while (true) {
                            n4 = n5;
                            if (i >= v.r.size()) {
                                break;
                            }
                            n6 = super.r.n;
                            if (n6 != null && n6.equals(v.r.get(i))) {
                                n4 = i;
                                break;
                            }
                            ++i;
                        }
                        this.I = n4;
                        this.J = (Z0.g(n2) == 128);
                        this.K = (Z0.i(n2) == 64 && b2);
                        this.s = this.m(n2, b, n);
                        return;
                    }
                }
                n4 = 0;
                i = Integer.MAX_VALUE;
                continue;
            }
        }
        
        public static int h(final List coll, final List coll2) {
            return Collections.max((Collection<? extends b>)coll).j(Collections.max((Collection<? extends b>)coll2));
        }
        
        public static v l(final int n, final J j, final e e, final int[] array, final boolean b, final W2.n n2, final int n3) {
            final v.a m = v.M();
            for (int i = 0; i < j.a; ++i) {
                m.h(new b(n, j, i, e, array[i], b, n2, n3));
            }
            return m.k();
        }
        
        @Override
        public int c() {
            return this.s;
        }
        
        public int j(final b b) {
            P p;
            if (this.t && this.w) {
                p = n.A();
            }
            else {
                p = n.A().g();
            }
            X2.n n = X2.n.j().g(this.w, b.w).f(this.y, b.y, P.d().g()).d(this.x, b.x).d(this.z, b.z).g(this.E, b.E).g(this.B, b.B).f(this.C, b.C, P.d().g()).d(this.D, b.D).g(this.t, b.t).f(this.I, b.I, P.d().g());
            if (this.v.y) {
                n = n.f(this.H, b.H, A0.n.A().g());
            }
            X2.n n2 = n.g(this.J, b.J).g(this.K, b.K).f(this.F, b.F, p).f(this.G, b.G, p);
            if (M.c(this.u, b.u)) {
                n2 = n2.f(this.H, b.H, p);
            }
            return n2.i();
        }
        
        public final int m(final int n, final boolean b, final int n2) {
            if (!Z0.k(n, this.v.u0)) {
                return 0;
            }
            if (!this.t && !this.v.n0) {
                return 0;
            }
            final e v = this.v;
            if (v.s.a == 2 && !Y(v, n, super.r)) {
                return 0;
            }
            if (Z0.k(n, false) && this.t && super.r.i != -1) {
                final e v2 = this.v;
                if (!v2.z && !v2.y && (v2.w0 || !b) && v2.s.a != 2 && (n & n2) != 0x0) {
                    return 2;
                }
            }
            return 1;
        }
        
        public boolean n(final b b) {
            if (!this.v.q0) {
                final int b2 = super.r.B;
                if (b2 == -1 || b2 != b.r.B) {
                    return false;
                }
            }
            if (!this.A) {
                final String n = super.r.n;
                if (n == null || !TextUtils.equals((CharSequence)n, (CharSequence)b.r.n)) {
                    return false;
                }
            }
            final e v = this.v;
            if (!v.p0) {
                final int c = super.r.C;
                if (c == -1 || c != b.r.C) {
                    return false;
                }
            }
            if (v.r0 || (this.J == b.J && this.K == b.K)) {
                return true;
            }
            return false;
        }
    }
    
    public static final class c extends i implements Comparable
    {
        public final int s;
        public final int t;
        
        public c(final int n, final J j, final int n2, final e e, final int n3) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public static int h(final List list, final List list2) {
            return list.get(0).j(list2.get(0));
        }
        
        public static v l(final int n, final J j, final e e, final int[] array) {
            final v.a m = v.M();
            for (int i = 0; i < j.a; ++i) {
                m.h(new c(n, j, i, e, array[i]));
            }
            return m.k();
        }
        
        @Override
        public int c() {
            return this.s;
        }
        
        public int j(final c c) {
            return Integer.compare(this.t, c.t);
        }
        
        public boolean m(final c c) {
            return false;
        }
    }
    
    public static final class d implements Comparable
    {
        public final boolean o;
        public final boolean p;
        
        public d(final q q, final int n) {
            final int e = q.e;
            boolean o = true;
            if ((e & 0x1) == 0x0) {
                o = false;
            }
            this.o = o;
            this.p = Z0.k(n, false);
        }
        
        public int c(final d d) {
            return X2.n.j().g(this.p, d.p).g(this.o, d.o).i();
        }
    }
    
    public static final class e extends K
    {
        public static final e A0;
        public static final e B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final String R0;
        public static final String S0;
        public static final String T0;
        public static final String U0;
        public final boolean j0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;
        public final boolean n0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final SparseArray y0;
        public final SparseBooleanArray z0;
        
        static {
            B0 = (A0 = new a().a0());
            C0 = g0.M.w0(1000);
            D0 = g0.M.w0(1001);
            E0 = g0.M.w0(1002);
            F0 = g0.M.w0(1003);
            G0 = g0.M.w0(1004);
            H0 = g0.M.w0(1005);
            I0 = g0.M.w0(1006);
            J0 = g0.M.w0(1007);
            K0 = g0.M.w0(1008);
            L0 = g0.M.w0(1009);
            M0 = g0.M.w0(1010);
            N0 = g0.M.w0(1011);
            O0 = g0.M.w0(1012);
            P0 = g0.M.w0(1013);
            Q0 = g0.M.w0(1014);
            R0 = g0.M.w0(1015);
            S0 = g0.M.w0(1016);
            T0 = g0.M.w0(1017);
            U0 = g0.M.w0(1018);
        }
        
        public e(final a a) {
            super((K.c)a);
            this.j0 = a.J(a);
            this.k0 = a.K(a);
            this.l0 = a.L(a);
            this.m0 = a.M(a);
            this.n0 = a.N(a);
            this.o0 = a.O(a);
            this.p0 = a.P(a);
            this.q0 = a.Q(a);
            this.r0 = a.R(a);
            this.s0 = a.S(a);
            this.t0 = a.T(a);
            this.u0 = a.U(a);
            this.v0 = a.V(a);
            this.w0 = a.W(a);
            this.x0 = a.X(a);
            this.y0 = a.Y(a);
            this.z0 = a.Z(a);
        }
        
        public static /* synthetic */ SparseArray b(final e e) {
            return e.y0;
        }
        
        public static /* synthetic */ SparseBooleanArray c(final e e) {
            return e.z0;
        }
        
        public static boolean d(final SparseBooleanArray sparseBooleanArray, final SparseBooleanArray sparseBooleanArray2) {
            final int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; ++i) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }
        
        public static boolean e(final SparseArray sparseArray, final SparseArray sparseArray2) {
            final int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; ++i) {
                final int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0) {
                    return false;
                }
                if (!f((Map)sparseArray.valueAt(i), (Map)sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }
        
        public static boolean f(final Map map, final Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (final Map.Entry<Z, V> entry : map.entrySet()) {
                final Z z = entry.getKey();
                if (!map2.containsKey(z) || !g0.M.c(entry.getValue(), map2.get(z))) {
                    return false;
                }
            }
            return true;
        }
        
        public static e h(final Context context) {
            return new a(context).a0();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (e.class != o.getClass()) {
                return false;
            }
            final e e = (e)o;
            return super.equals(e) && this.j0 == e.j0 && this.k0 == e.k0 && this.l0 == e.l0 && this.m0 == e.m0 && this.n0 == e.n0 && this.o0 == e.o0 && this.p0 == e.p0 && this.q0 == e.q0 && this.r0 == e.r0 && this.s0 == e.s0 && this.t0 == e.t0 && this.u0 == e.u0 && this.v0 == e.v0 && this.w0 == e.w0 && this.x0 == e.x0 && d(this.z0, e.z0) && e(this.y0, e.y0);
        }
        
        public a g() {
            return new a(this, null);
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public boolean i(final int n) {
            return this.z0.get(n);
        }
        
        public f j(final int n, final Z z) {
            final Map map = (Map)this.y0.get(n);
            if (map != null) {
                android.support.v4.media.a.a(map.get(z));
            }
            return null;
        }
        
        public boolean k(final int n, final Z z) {
            final Map map = (Map)this.y0.get(n);
            return map != null && map.containsKey(z);
        }
        
        public static final class a extends K.c
        {
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public boolean O;
            public boolean P;
            public boolean Q;
            public final SparseArray R;
            public final SparseBooleanArray S;
            
            public a() {
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.c0();
            }
            
            public a(final e e) {
                super(e);
                this.C = e.j0;
                this.D = e.k0;
                this.E = e.l0;
                this.F = e.m0;
                this.G = e.n0;
                this.H = e.o0;
                this.I = e.p0;
                this.J = e.q0;
                this.K = e.r0;
                this.L = e.s0;
                this.M = e.t0;
                this.N = e.u0;
                this.O = e.v0;
                this.P = e.w0;
                this.Q = e.x0;
                this.R = b0(e.b(e));
                this.S = e.c(e).clone();
            }
            
            public a(final Context context) {
                super(context);
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.c0();
            }
            
            public static /* synthetic */ boolean J(final a a) {
                return a.C;
            }
            
            public static /* synthetic */ boolean K(final a a) {
                return a.D;
            }
            
            public static /* synthetic */ boolean L(final a a) {
                return a.E;
            }
            
            public static /* synthetic */ boolean M(final a a) {
                return a.F;
            }
            
            public static /* synthetic */ boolean N(final a a) {
                return a.G;
            }
            
            public static /* synthetic */ boolean O(final a a) {
                return a.H;
            }
            
            public static /* synthetic */ boolean P(final a a) {
                return a.I;
            }
            
            public static /* synthetic */ boolean Q(final a a) {
                return a.J;
            }
            
            public static /* synthetic */ boolean R(final a a) {
                return a.K;
            }
            
            public static /* synthetic */ boolean S(final a a) {
                return a.L;
            }
            
            public static /* synthetic */ boolean T(final a a) {
                return a.M;
            }
            
            public static /* synthetic */ boolean U(final a a) {
                return a.N;
            }
            
            public static /* synthetic */ boolean V(final a a) {
                return a.O;
            }
            
            public static /* synthetic */ boolean W(final a a) {
                return a.P;
            }
            
            public static /* synthetic */ boolean X(final a a) {
                return a.Q;
            }
            
            public static /* synthetic */ SparseArray Y(final a a) {
                return a.R;
            }
            
            public static /* synthetic */ SparseBooleanArray Z(final a a) {
                return a.S;
            }
            
            public static SparseArray b0(final SparseArray sparseArray) {
                final SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); ++i) {
                    sparseArray2.put(sparseArray.keyAt(i), (Object)new HashMap((Map<?, ?>)sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }
            
            public e a0() {
                return new e(this, null);
            }
            
            public final void c0() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }
            
            public a d0(final K k) {
                super.E(k);
                return this;
            }
            
            public a e0(final Context context) {
                super.G(context);
                return this;
            }
            
            public a f0(final int n, final int n2, final boolean b) {
                super.H(n, n2, b);
                return this;
            }
            
            public a g0(final Context context, final boolean b) {
                super.I(context, b);
                return this;
            }
        }
    }
    
    public abstract static final class f
    {
    }
    
    public static class g
    {
        public final Spatializer a;
        public final boolean b;
        public Handler c;
        public Spatializer$OnSpatializerStateChangedListener d;
        
        public g(final Spatializer a) {
            this.a = a;
            this.b = (p.a(a) != 0);
        }
        
        public static g g(final Context context) {
            final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(A0.o.a(audioManager));
        }
        
        public boolean a(final d0.b b, final q q) {
            int b2;
            if ("audio/eac3-joc".equals(q.n) && q.B == 16) {
                b2 = 12;
            }
            else {
                b2 = q.B;
            }
            final int m = M.M(b2);
            if (m == 0) {
                return false;
            }
            final AudioFormat$Builder setChannelMask = new AudioFormat$Builder().setEncoding(2).setChannelMask(m);
            final int c = q.C;
            if (c != -1) {
                setChannelMask.setSampleRate(c);
            }
            return u.a(this.a, b.a().a, setChannelMask.build());
        }
        
        public void b(final n n, final Looper looper) {
            if (this.d == null) {
                if (this.c != null) {
                    return;
                }
                this.d = new Spatializer$OnSpatializerStateChangedListener() {
                    public void onSpatializerAvailableChanged(final Spatializer spatializer, final boolean b) {
                        n.V();
                    }
                    
                    public void onSpatializerEnabledChanged(final Spatializer spatializer, final boolean b) {
                        n.V();
                    }
                };
                final Handler handler = new Handler(looper);
                this.c = handler;
                final Spatializer a = this.a;
                Objects.requireNonNull(handler);
                A0.q.a(a, (Executor)new m0.Z(handler), this.d);
            }
        }
        
        public boolean c() {
            return s.a(this.a);
        }
        
        public boolean d() {
            return t.a(this.a);
        }
        
        public boolean e() {
            return this.b;
        }
        
        public void f() {
            final Spatializer$OnSpatializerStateChangedListener d = this.d;
            if (d != null) {
                if (this.c == null) {
                    return;
                }
                r.a(this.a, d);
                ((Handler)M.i(this.c)).removeCallbacksAndMessages((Object)null);
                this.c = null;
                this.d = null;
            }
        }
    }
    
    public static final class h extends i implements Comparable
    {
        public final boolean A;
        public final int s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final int w;
        public final int x;
        public final int y;
        public final int z;
        
        public h(int i, final J j, int g, final e e, final int n, final String s) {
            super(i, j, g);
            final int n2 = 0;
            this.t = Z0.k(n, false);
            i = (super.r.e & e.v);
            this.u = ((i & 0x1) != 0x0);
            this.v = ((i & 0x2) != 0x0);
            v v;
            if (e.t.isEmpty()) {
                v = X2.v.Z("");
            }
            else {
                v = e.t;
            }
            while (true) {
                int g2;
                for (i = 0; i < v.size(); ++i) {
                    g = n.G(super.r, v.get(i), e.w);
                    if (g > 0) {
                        this.w = i;
                        this.x = g;
                        i = K(super.r.f, e.u);
                        this.y = i;
                        this.A = ((super.r.f & 0x440) != 0x0);
                        g2 = n.G(super.r, s, n.X(s) == null);
                        this.z = g2;
                        if (g <= 0 && (!e.t.isEmpty() || i <= 0) && !this.u && (!this.v || g2 <= 0)) {
                            i = 0;
                        }
                        else {
                            i = 1;
                        }
                        g = n2;
                        if (Z0.k(n, e.u0)) {
                            g = n2;
                            if (i != 0) {
                                g = 1;
                            }
                        }
                        this.s = g;
                        return;
                    }
                }
                i = Integer.MAX_VALUE;
                g = 0;
                continue;
            }
        }
        
        public static int h(final List list, final List list2) {
            return list.get(0).j(list2.get(0));
        }
        
        public static v l(final int n, final J j, final e e, final int[] array, final String s) {
            final v.a m = v.M();
            for (int i = 0; i < j.a; ++i) {
                m.h(new h(n, j, i, e, array[i], s));
            }
            return m.k();
        }
        
        @Override
        public int c() {
            return this.s;
        }
        
        public int j(final h h) {
            final X2.n g = X2.n.j().g(this.t, h.t).f(this.w, h.w, P.d().g()).d(this.x, h.x).d(this.y, h.y).g(this.u, h.u);
            final boolean v = this.v;
            final boolean v2 = h.v;
            P p;
            if (this.x == 0) {
                p = P.d();
            }
            else {
                p = P.d().g();
            }
            X2.n n = g.f(v, v2, p).d(this.z, h.z);
            if (this.y == 0) {
                n = n.h(this.A, h.A);
            }
            return n.i();
        }
        
        public boolean m(final h h) {
            return false;
        }
    }
    
    public abstract static class i
    {
        public final int o;
        public final J p;
        public final int q;
        public final q r;
        
        public i(final int o, final J p3, final int q) {
            this.o = o;
            this.p = p3;
            this.q = q;
            this.r = p3.a(q);
        }
        
        public abstract int c();
        
        public abstract boolean e(final i p0);
        
        public interface a
        {
            List a(final int p0, final J p1, final int[] p2);
        }
    }
    
    public static final class j extends i
    {
        public final int A;
        public final boolean B;
        public final boolean C;
        public final int D;
        public final boolean E;
        public final boolean F;
        public final int G;
        public final boolean s;
        public final e t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final int x;
        public final int y;
        public final int z;
        
        public j(int i, final J j, int n, final e t, final int n2, final int n3, final boolean b) {
            super(i, j, n);
            this.t = t;
            if (t.l0) {
                n = 24;
            }
            else {
                n = 16;
            }
            final boolean k0 = t.k0;
            final boolean b2 = true;
            this.C = (k0 && (n3 & n) != 0x0);
            boolean s = false;
            Label_0169: {
                if (b) {
                    final q r = super.r;
                    i = r.t;
                    if (i == -1 || i <= t.a) {
                        i = r.u;
                        if (i == -1 || i <= t.b) {
                            final float v = r.v;
                            if (v == -1.0f || v <= t.c) {
                                i = r.i;
                                if (i == -1 || i <= t.d) {
                                    s = true;
                                    break Label_0169;
                                }
                            }
                        }
                    }
                }
                s = false;
            }
            this.s = s;
            boolean u = false;
            Label_0277: {
                if (b) {
                    final q r2 = super.r;
                    i = r2.t;
                    if (i == -1 || i >= t.e) {
                        i = r2.u;
                        if (i == -1 || i >= t.f) {
                            final float v2 = r2.v;
                            if (v2 == -1.0f || v2 >= t.g) {
                                i = r2.i;
                                if (i == -1 || i >= t.h) {
                                    u = true;
                                    break Label_0277;
                                }
                            }
                        }
                    }
                }
                u = false;
            }
            this.u = u;
            this.v = Z0.k(n2, false);
            final q r3 = super.r;
            final float v3 = r3.v;
            this.w = (v3 != -1.0f && v3 >= 10.0f);
            this.x = r3.i;
            this.y = r3.d();
            this.A = K(super.r.f, t.m);
            i = super.r.f;
            this.B = (i == 0 || (i & 0x1) != 0x0);
            while (true) {
                String n4;
                for (i = 0; i < t.l.size(); ++i) {
                    n4 = super.r.n;
                    if (n4 != null && n4.equals(t.l.get(i))) {
                        this.z = i;
                        this.E = (Z0.g(n2) == 128);
                        this.F = (Z0.i(n2) == 64 && b2);
                        this.G = L(super.r.n);
                        this.D = this.p(n2, n);
                        return;
                    }
                }
                i = Integer.MAX_VALUE;
                continue;
            }
        }
        
        public static int l(final j j, final j i) {
            X2.n n2;
            final X2.n n = n2 = X2.n.j().g(j.v, i.v).d(j.A, i.A).g(j.B, i.B).g(j.w, i.w).g(j.s, i.s).g(j.u, i.u).f(j.z, i.z, P.d().g()).g(j.E, i.E).g(j.F, i.F);
            if (j.E) {
                n2 = n;
                if (j.F) {
                    n2 = n.d(j.G, i.G);
                }
            }
            return n2.i();
        }
        
        public static int m(final j j, final j i) {
            P p2;
            if (j.s && j.v) {
                p2 = n.A();
            }
            else {
                p2 = n.A().g();
            }
            X2.n n = X2.n.j();
            if (j.t.y) {
                n = n.f(j.x, i.x, A0.n.A().g());
            }
            return n.f(j.y, i.y, p2).f(j.x, i.x, p2).i();
        }
        
        public static int n(final List list, final List list2) {
            return X2.n.j().f(Collections.max((Collection<? extends j>)list, (Comparator<? super j>)new A0.v()), Collections.max((Collection<? extends j>)list2, (Comparator<? super j>)new A0.v()), new A0.v()).d(list.size(), list2.size()).f(Collections.max((Collection<? extends j>)list, (Comparator<? super j>)new w()), Collections.max((Collection<? extends j>)list2, (Comparator<? super j>)new w()), new w()).i();
        }
        
        public static v o(final int n, final J j, final e e, final int[] array, final int n2) {
            final int x = H(j, e.i, e.j, e.k);
            final v.a m = v.M();
            for (int i = 0; i < j.a; ++i) {
                final int d = j.a(i).d();
                m.h(new j(n, j, i, e, array[i], n2, x == Integer.MAX_VALUE || (d != -1 && d <= x)));
            }
            return m.k();
        }
        
        @Override
        public int c() {
            return this.D;
        }
        
        public final int p(final int n, final int n2) {
            if ((super.r.f & 0x4000) != 0x0) {
                return 0;
            }
            if (!Z0.k(n, this.t.u0)) {
                return 0;
            }
            if (!this.s && !this.t.j0) {
                return 0;
            }
            if (Z0.k(n, false) && this.u && this.s && super.r.i != -1) {
                final e t = this.t;
                if (!t.z && !t.y && (n & n2) != 0x0) {
                    return 2;
                }
            }
            return 1;
        }
        
        public boolean r(final j j) {
            return (this.C || M.c(super.r.n, j.r.n)) && (this.t.m0 || (this.E == j.E && this.F == j.F));
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g;

public final class f extends d
{
    public static final a r;
    public static final Object[] s;
    public int o;
    public Object[] p;
    public int q;
    
    static {
        r = new a(null);
        s = new Object[0];
    }
    
    public f() {
        this.p = f.s;
    }
    
    public final int D(final int n) {
        if (n == k.k(this.p)) {
            return 0;
        }
        return n + 1;
    }
    
    public final int M(final int n) {
        int n2 = n;
        if (n < 0) {
            n2 = n + this.p.length;
        }
        return n2;
    }
    
    public final void S(final int n, final int n2) {
        final Object[] p2 = this.p;
        if (n < n2) {
            j.e(p2, null, n, n2);
            return;
        }
        j.e(p2, null, n, p2.length);
        j.e(this.p, null, 0, n2);
    }
    
    public final int T(final int n) {
        final Object[] p = this.p;
        int n2 = n;
        if (n >= p.length) {
            n2 = n - p.length;
        }
        return n2;
    }
    
    public final void U() {
        ++super.modCount;
    }
    
    public final Object V() {
        if (!this.isEmpty()) {
            this.U();
            final Object[] p = this.p;
            final int o = this.o;
            final Object o2 = p[o];
            p[o] = null;
            this.o = this.D(o);
            this.q = this.size() - 1;
            return o2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public final Object W() {
        if (this.isEmpty()) {
            return null;
        }
        return this.V();
    }
    
    public final Object X() {
        if (!this.isEmpty()) {
            this.U();
            final int t = this.T(this.o + m.h(this));
            final Object[] p = this.p;
            final Object o = p[t];
            p[t] = null;
            this.q = this.size() - 1;
            return o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public final void Y(int i, int m) {
        final int t = this.T(this.o + (i - 1));
        int n = this.T(this.o + (m - 1));
        m = t;
        while (i > 0) {
            final int a = m + 1;
            final int min = Math.min(i, Math.min(a, n + 1));
            final Object[] p2 = this.p;
            final int n2 = n - min;
            m -= min;
            j.c(p2, p2, n2 + 1, m + 1, a);
            m = this.M(m);
            n = this.M(n2);
            i -= min;
        }
    }
    
    public final void Z(int n, int t) {
        final int t2 = this.T(this.o + t);
        n = this.T(this.o + n);
        int size = this.size();
        int min = t;
        t = t2;
        while (true) {
            size -= min;
            if (size <= 0) {
                break;
            }
            final Object[] p2 = this.p;
            min = Math.min(size, Math.min(p2.length - t, p2.length - n));
            final Object[] p3 = this.p;
            final int n2 = t + min;
            j.c(p3, p3, n, t, n2);
            t = this.T(n2);
            n = this.T(n + min);
        }
    }
    
    @Override
    public int a() {
        return this.q;
    }
    
    @Override
    public void add(int n, final Object o) {
        c.o.b(n, this.size());
        if (n == this.size()) {
            this.g(o);
            return;
        }
        if (n == 0) {
            this.f(o);
            return;
        }
        this.U();
        this.s(this.size() + 1);
        final int t = this.T(this.o + n);
        if (n < this.size() + 1 >> 1) {
            n = this.q(t);
            final int q = this.q(this.o);
            final int o2 = this.o;
            if (n >= o2) {
                final Object[] p2 = this.p;
                p2[q] = p2[o2];
                j.c(p2, p2, o2, o2 + 1, n + 1);
            }
            else {
                final Object[] p3 = this.p;
                j.c(p3, p3, o2 - 1, o2, p3.length);
                final Object[] p4 = this.p;
                p4[p4.length - 1] = p4[0];
                j.c(p4, p4, 0, 1, n + 1);
            }
            this.p[n] = o;
            this.o = q;
        }
        else {
            n = this.T(this.o + this.size());
            final Object[] p5 = this.p;
            if (t < n) {
                j.c(p5, p5, t + 1, t, n);
            }
            else {
                j.c(p5, p5, 1, 0, n);
                final Object[] p6 = this.p;
                p6[0] = p6[p6.length - 1];
                j.c(p6, p6, t + 1, t, p6.length - 1);
            }
            this.p[t] = o;
        }
        this.q = this.size() + 1;
    }
    
    @Override
    public boolean add(final Object o) {
        this.g(o);
        return true;
    }
    
    @Override
    public boolean addAll(int o, final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        c.o.b(o, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (o == this.size()) {
            return this.addAll(collection);
        }
        this.U();
        this.s(this.size() + collection.size());
        final int t = this.T(this.o + this.size());
        final int t2 = this.T(this.o + o);
        final int size = collection.size();
        if (o < this.size() + 1 >> 1) {
            final int o2 = this.o;
            o = o2 - size;
            if (t2 >= o2) {
                if (o >= 0) {
                    final Object[] p2 = this.p;
                    j.c(p2, p2, o, o2, t2);
                }
                else {
                    final Object[] p3 = this.p;
                    o += p3.length;
                    final int n = p3.length - o;
                    if (n >= t2 - o2) {
                        j.c(p3, p3, o, o2, t2);
                    }
                    else {
                        j.c(p3, p3, o, o2, o2 + n);
                        final Object[] p4 = this.p;
                        j.c(p4, p4, 0, this.o + n, t2);
                    }
                }
            }
            else {
                final Object[] p5 = this.p;
                j.c(p5, p5, o, o2, p5.length);
                final Object[] p6 = this.p;
                if (size >= t2) {
                    j.c(p6, p6, p6.length - size, 0, t2);
                }
                else {
                    j.c(p6, p6, p6.length - size, 0, size);
                    final Object[] p7 = this.p;
                    j.c(p7, p7, 0, size, t2);
                }
            }
            this.o = o;
            this.i(this.M(t2 - size), collection);
            return true;
        }
        o = t2 + size;
        Label_0541: {
            if (t2 < t) {
                final int n2 = size + t;
                final Object[] p8 = this.p;
                if (n2 > p8.length) {
                    if (o < p8.length) {
                        final int n3 = t - (n2 - p8.length);
                        j.c(p8, p8, 0, n3, t);
                        final Object[] p9 = this.p;
                        j.c(p9, p9, o, t2, n3);
                        break Label_0541;
                    }
                    o -= p8.length;
                }
                j.c(p8, p8, o, t2, t);
            }
            else {
                final Object[] p10 = this.p;
                j.c(p10, p10, size, 0, t);
                final Object[] p11 = this.p;
                if (o >= p11.length) {
                    j.c(p11, p11, o - p11.length, t2, p11.length);
                }
                else {
                    j.c(p11, p11, 0, p11.length - size, p11.length);
                    final Object[] p12 = this.p;
                    j.c(p12, p12, o, t2, p12.length - size);
                }
            }
        }
        this.i(t2, collection);
        return true;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.U();
        this.s(this.size() + collection.size());
        this.i(this.T(this.o + this.size()), collection);
        return true;
    }
    
    @Override
    public void clear() {
        if (this.isEmpty() ^ true) {
            this.U();
            this.S(this.o, this.T(this.o + this.size()));
        }
        this.o = 0;
        this.q = 0;
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public Object d(int n) {
        c.o.a(n, this.size());
        if (n == m.h(this)) {
            return this.X();
        }
        if (n == 0) {
            return this.V();
        }
        this.U();
        final int t = this.T(this.o + n);
        final Object o = this.p[t];
        if (n < this.size() >> 1) {
            n = this.o;
            if (t >= n) {
                final Object[] p = this.p;
                j.c(p, p, n + 1, n, t);
            }
            else {
                final Object[] p2 = this.p;
                j.c(p2, p2, 1, 0, t);
                final Object[] p3 = this.p;
                p3[0] = p3[p3.length - 1];
                n = this.o;
                j.c(p3, p3, n + 1, n, p3.length - 1);
            }
            final Object[] p4 = this.p;
            n = this.o;
            p4[n] = null;
            this.o = this.D(n);
        }
        else {
            n = this.T(this.o + m.h(this));
            final Object[] p5 = this.p;
            if (t <= n) {
                j.c(p5, p5, t, t + 1, n + 1);
            }
            else {
                j.c(p5, p5, t, t + 1, p5.length);
                final Object[] p6 = this.p;
                p6[p6.length - 1] = p6[0];
                j.c(p6, p6, 0, 1, n + 1);
            }
            this.p[n] = null;
        }
        this.q = this.size() - 1;
        return o;
    }
    
    public final void f(final Object o) {
        this.U();
        this.s(this.size() + 1);
        final int q = this.q(this.o);
        this.o = q;
        this.p[q] = o;
        this.q = this.size() + 1;
    }
    
    public final void g(final Object o) {
        this.U();
        this.s(this.size() + 1);
        this.p[this.T(this.o + this.size())] = o;
        this.q = this.size() + 1;
    }
    
    @Override
    public Object get(final int n) {
        c.o.a(n, this.size());
        return this.p[this.T(this.o + n)];
    }
    
    public final void i(int n, final Collection collection) {
        Iterator<Object> iterator;
        for (iterator = collection.iterator(); n < this.p.length && iterator.hasNext(); ++n) {
            this.p[n] = iterator.next();
        }
        int o;
        for (o = this.o, n = 0; n < o && iterator.hasNext(); ++n) {
            this.p[n] = iterator.next();
        }
        this.q = this.size() + collection.size();
    }
    
    @Override
    public int indexOf(final Object o) {
        final int t = this.T(this.o + this.size());
        int i = this.o;
        if (i < t) {
            while (i < t) {
                if (Intrinsics.a(o, this.p[i])) {
                    return i - this.o;
                }
                ++i;
            }
            return -1;
        }
        if (i >= t) {
            while (i < this.p.length) {
                if (Intrinsics.a(o, this.p[i])) {
                    return i - this.o;
                }
                ++i;
            }
            for (int j = 0; j < t; ++j) {
                if (Intrinsics.a(o, this.p[j])) {
                    i = j + this.p.length;
                    return i - this.o;
                }
            }
            return -1;
        }
        return -1;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public final void k(int length) {
        final Object[] p = new Object[length];
        final Object[] p2 = this.p;
        j.c(p2, p, 0, this.o, p2.length);
        final Object[] p3 = this.p;
        length = p3.length;
        final int o = this.o;
        j.c(p3, p, length - o, 0, o);
        this.o = 0;
        this.p = p;
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final int t = this.T(this.o + this.size());
        final int o2 = this.o;
        int k;
        if (o2 < t) {
            k = t - 1;
            if (o2 > k) {
                return -1;
            }
            while (!Intrinsics.a(o, this.p[k])) {
                if (k == o2) {
                    return -1;
                }
                --k;
            }
        }
        else {
            if (o2 <= t) {
                return -1;
            }
            for (int n = t - 1; -1 < n; --n) {
                if (Intrinsics.a(o, this.p[n])) {
                    k = n + this.p.length;
                    return k - this.o;
                }
            }
            k = W5.k.k(this.p);
            final int o3 = this.o;
            if (o3 > k) {
                return -1;
            }
            while (!Intrinsics.a(o, this.p[k])) {
                if (k == o3) {
                    return -1;
                }
                --k;
            }
        }
        return k - this.o;
    }
    
    public final int q(final int n) {
        if (n == 0) {
            return k.k(this.p);
        }
        return n - 1;
    }
    
    @Override
    public boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        boolean b = false;
        boolean b2 = false;
        if (!empty) {
            if (this.p.length == 0) {
                return false;
            }
            final int t = this.T(this.o + this.size());
            int i = this.o;
            int n3;
            if (i < t) {
                int n2 = i;
                while (i < t) {
                    final Object o = this.p[i];
                    if (collection.contains(o) ^ true) {
                        this.p[n2] = o;
                        ++n2;
                    }
                    else {
                        b2 = true;
                    }
                    ++i;
                }
                j.e(this.p, null, n2, t);
                n3 = n2;
            }
            else {
                final int length = this.p.length;
                b2 = false;
                int n4 = i;
                while (i < length) {
                    final Object[] p = this.p;
                    final Object o2 = p[i];
                    p[i] = null;
                    if (collection.contains(o2) ^ true) {
                        this.p[n4] = o2;
                        ++n4;
                    }
                    else {
                        b2 = true;
                    }
                    ++i;
                }
                n3 = this.T(n4);
                for (int j = n; j < t; ++j) {
                    final Object[] p2 = this.p;
                    final Object o3 = p2[j];
                    p2[j] = null;
                    if (collection.contains(o3) ^ true) {
                        this.p[n3] = o3;
                        n3 = this.D(n3);
                    }
                    else {
                        b2 = true;
                    }
                }
            }
            b = b2;
            if (b2) {
                this.U();
                this.q = this.M(n3 - this.o);
                b = b2;
            }
        }
        return b;
    }
    
    public void removeRange(int o, final int n) {
        c.o.c(o, n, this.size());
        final int n2 = n - o;
        if (n2 == 0) {
            return;
        }
        if (n2 == this.size()) {
            this.clear();
            return;
        }
        if (n2 == 1) {
            this.remove(o);
            return;
        }
        this.U();
        if (o < this.size() - n) {
            this.Y(o, n);
            o = this.T(this.o + n2);
            this.S(this.o, o);
            this.o = o;
        }
        else {
            this.Z(o, n);
            o = this.T(this.o + this.size());
            this.S(this.M(o - n2), o);
        }
        this.q = this.size() - n2;
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        boolean b = false;
        boolean b2 = false;
        if (!empty) {
            if (this.p.length == 0) {
                return false;
            }
            final int t = this.T(this.o + this.size());
            int i = this.o;
            int n3;
            if (i < t) {
                int n2 = i;
                while (i < t) {
                    final Object o = this.p[i];
                    if (collection.contains(o)) {
                        this.p[n2] = o;
                        ++n2;
                    }
                    else {
                        b2 = true;
                    }
                    ++i;
                }
                j.e(this.p, null, n2, t);
                n3 = n2;
            }
            else {
                final int length = this.p.length;
                b2 = false;
                int n4 = i;
                while (i < length) {
                    final Object[] p = this.p;
                    final Object o2 = p[i];
                    p[i] = null;
                    if (collection.contains(o2)) {
                        this.p[n4] = o2;
                        ++n4;
                    }
                    else {
                        b2 = true;
                    }
                    ++i;
                }
                n3 = this.T(n4);
                for (int j = n; j < t; ++j) {
                    final Object[] p2 = this.p;
                    final Object o3 = p2[j];
                    p2[j] = null;
                    if (collection.contains(o3)) {
                        this.p[n3] = o3;
                        n3 = this.D(n3);
                    }
                    else {
                        b2 = true;
                    }
                }
            }
            b = b2;
            if (b2) {
                this.U();
                this.q = this.M(n3 - this.o);
                b = b2;
            }
        }
        return b;
    }
    
    public final void s(final int n) {
        if (n < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        final Object[] p = this.p;
        if (n <= p.length) {
            return;
        }
        if (p == f.s) {
            this.p = new Object[l6.d.a(n, 10)];
            return;
        }
        this.k(c.o.d(p.length, n));
    }
    
    @Override
    public Object set(int t, final Object o) {
        c.o.a(t, this.size());
        t = this.T(this.o + t);
        final Object[] p2 = this.p;
        final Object o2 = p2[t];
        p2[t] = o;
        return o2;
    }
    
    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }
    
    @Override
    public Object[] toArray(Object[] a) {
        Intrinsics.checkNotNullParameter(a, "array");
        if (a.length < this.size()) {
            a = h.a(a, this.size());
        }
        final int t = this.T(this.o + this.size());
        final int o = this.o;
        if (o < t) {
            j.d(this.p, a, 0, o, t, 2, null);
        }
        else if (this.isEmpty() ^ true) {
            final Object[] p = this.p;
            j.c(p, a, 0, this.o, p.length);
            final Object[] p2 = this.p;
            j.c(p2, a, p2.length - this.o, 0, t);
        }
        return n.c(this.size(), a);
    }
    
    public static final class a
    {
    }
}

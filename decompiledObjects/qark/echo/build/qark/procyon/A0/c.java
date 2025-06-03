// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import y0.e;
import g0.M;
import android.os.SystemClock;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import g0.a;
import d0.q;
import d0.J;

public abstract class c implements y
{
    public final J a;
    public final int b;
    public final int[] c;
    public final int d;
    public final q[] e;
    public final long[] f;
    public int g;
    
    public c(final J j, final int... array) {
        this(j, array, 0);
    }
    
    public c(final J j, final int[] array, int i) {
        final int length = array.length;
        final int n = 0;
        g0.a.f(length > 0);
        this.d = i;
        this.a = (J)g0.a.e(j);
        i = array.length;
        this.b = i;
        this.e = new q[i];
        for (i = 0; i < array.length; ++i) {
            this.e[i] = j.a(array[i]);
        }
        Arrays.sort(this.e, new A0.b());
        this.c = new int[this.b];
        i = n;
        int b;
        while (true) {
            b = this.b;
            if (i >= b) {
                break;
            }
            this.c[i] = j.b(this.e[i]);
            ++i;
        }
        this.f = new long[b];
    }
    
    @Override
    public final int a(final q q) {
        for (int i = 0; i < this.b; ++i) {
            if (this.e[i] == q) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final q b(final int n) {
        return this.e[n];
    }
    
    @Override
    public final int c(final int n) {
        return this.c[n];
    }
    
    @Override
    public final J d() {
        return this.a;
    }
    
    @Override
    public final int e(final int n) {
        for (int i = 0; i < this.b; ++i) {
            if (this.c[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final c c = (c)o;
        return this.a.equals(c.a) && Arrays.equals(this.c, c.c);
    }
    
    @Override
    public void g() {
    }
    
    @Override
    public int hashCode() {
        if (this.g == 0) {
            this.g = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c);
        }
        return this.g;
    }
    
    @Override
    public boolean i(final int n, final long n2) {
        return this.f[n] > n2;
    }
    
    @Override
    public void j() {
    }
    
    @Override
    public int k(final long n, final List list) {
        return list.size();
    }
    
    @Override
    public final int l() {
        return this.c[this.o()];
    }
    
    @Override
    public final int length() {
        return this.c.length;
    }
    
    @Override
    public final q m() {
        return this.e[this.o()];
    }
    
    @Override
    public boolean p(final int n, final long n2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.i(n, elapsedRealtime) ? 1 : 0;
        for (int n3 = 0; n3 < this.b && i == 0; ++n3) {
            if (n3 != n && !this.i(n3, elapsedRealtime)) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
        if (i == 0) {
            return false;
        }
        final long[] f = this.f;
        f[n] = Math.max(f[n], M.b(elapsedRealtime, n2, Long.MAX_VALUE));
        return true;
    }
    
    @Override
    public void r(final float n) {
    }
}

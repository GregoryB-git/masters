// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

import W2.m;
import java.util.Arrays;
import java.io.Serializable;

public final class e implements Serializable
{
    public static final e r;
    public final int[] o;
    public final transient int p;
    public final int q;
    
    static {
        r = new e(new int[0]);
    }
    
    public e(final int[] array) {
        this(array, 0, array.length);
    }
    
    public e(final int[] o, final int p3, final int q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public static e a(final int[] original) {
        if (original.length == 0) {
            return e.r;
        }
        return new e(Arrays.copyOf(original, original.length));
    }
    
    public static e f() {
        return e.r;
    }
    
    public int b(final int n) {
        m.h(n, this.e());
        return this.o[this.p + n];
    }
    
    public boolean c() {
        return this.q == this.p;
    }
    
    public final boolean d() {
        return this.p > 0 || this.q < this.o.length;
    }
    
    public int e() {
        return this.q - this.p;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        if (this.e() != e.e()) {
            return false;
        }
        for (int i = 0; i < this.e(); ++i) {
            if (this.b(i) != e.b(i)) {
                return false;
            }
        }
        return true;
    }
    
    public int[] g() {
        return Arrays.copyOfRange(this.o, this.p, this.q);
    }
    
    public e h() {
        if (this.d()) {
            return new e(this.g());
        }
        return this;
    }
    
    @Override
    public int hashCode() {
        int i = this.p;
        int n = 1;
        while (i < this.q) {
            n = n * 31 + f.i(this.o[i]);
            ++i;
        }
        return n;
    }
    
    public Object readResolve() {
        if (this.c()) {
            return e.r;
        }
        return this;
    }
    
    @Override
    public String toString() {
        if (this.c()) {
            return "[]";
        }
        final StringBuilder sb = new StringBuilder(this.e() * 5);
        sb.append('[');
        sb.append(this.o[this.p]);
        int p = this.p;
        while (true) {
            ++p;
            if (p >= this.q) {
                break;
            }
            sb.append(", ");
            sb.append(this.o[p]);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public Object writeReplace() {
        return this.h();
    }
}

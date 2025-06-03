// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class Y3 extends j3
{
    private static Map<Object, Y3> zzc;
    protected v5 zzb;
    private int zzd;
    
    static {
        Y3.zzc = new ConcurrentHashMap<Object, Y3>();
    }
    
    public Y3() {
        this.zzd = -1;
        this.zzb = v5.k();
    }
    
    public static i4 A() {
        return w4.f();
    }
    
    public static h4 B() {
        return Y4.g();
    }
    
    private final int k() {
        return U4.a().c(this).f(this);
    }
    
    public static Y3 l(final Class clazz) {
        Y3 y3;
        if ((y3 = Y3.zzc.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                y3 = Y3.zzc.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        if (y3 != null) {
            return y3;
        }
        final Y3 y4 = (Y3)((Y3)D5.b(clazz)).p(c.f, null, null);
        if (y4 != null) {
            Y3.zzc.put(clazz, y4);
            return y4;
        }
        throw new IllegalStateException();
    }
    
    public static h4 n(final h4 h4) {
        final int size = h4.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size << 1;
        }
        return h4.e(n);
    }
    
    public static i4 o(final i4 i4) {
        final int size = i4.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size << 1;
        }
        return i4.r(n);
    }
    
    public static Object q(final I4 i4, final String s, final Object[] array) {
        return new W4(i4, s, array);
    }
    
    public static Object s(final Method method, final Object obj, final Object... args) {
        try {
            return method.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", cause2);
        }
    }
    
    public static void t(final Class clazz, final Y3 y3) {
        y3.D();
        Y3.zzc.put(clazz, y3);
    }
    
    public static final boolean u(final Y3 y3, final boolean b) {
        final byte byteValue = (byte)y3.p(c.a, null, null);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean c = U4.a().c(y3).c(y3);
        if (b) {
            final int b2 = Y3.c.b;
            Y3 y4;
            if (c) {
                y4 = y3;
            }
            else {
                y4 = null;
            }
            y3.p(b2, y4, null);
        }
        return c;
    }
    
    public static f4 z() {
        return c4.f();
    }
    
    public final void C() {
        U4.a().c(this).e(this);
        this.D();
    }
    
    public final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }
    
    public final boolean E() {
        return u(this, true);
    }
    
    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0x0;
    }
    
    @Override
    public final int a() {
        return this.c(null);
    }
    
    @Override
    public final int c(final Z4 z4) {
        if (this.F()) {
            final int v = this.v(z4);
            if (v >= 0) {
                return v;
            }
            final StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
            sb.append(v);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (this.g() != Integer.MAX_VALUE) {
                return this.g();
            }
            final int v2 = this.v(z4);
            this.j(v2);
            return v2;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && U4.a().c(this).h(this, o));
    }
    
    @Override
    public final void f(final J3 j3) {
        U4.a().c(this).i(this, L3.P(j3));
    }
    
    @Override
    public final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }
    
    @Override
    public int hashCode() {
        if (this.F()) {
            return this.k();
        }
        if (super.zza == 0) {
            super.zza = this.k();
        }
        return super.zza;
    }
    
    @Override
    public final void j(final int i) {
        if (i >= 0) {
            this.zzd = ((i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE));
            return;
        }
        final StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    public abstract Object p(final int p0, final Object p1, final Object p2);
    
    @Override
    public String toString() {
        return N4.a(this, super.toString());
    }
    
    public final int v(final Z4 z4) {
        if (z4 == null) {
            return U4.a().c(this).b(this);
        }
        return z4.b(this);
    }
    
    public final b w() {
        return (b)this.p(c.e, null, null);
    }
    
    public final b x() {
        return ((b)this.p(c.e, null, null)).l(this);
    }
    
    public final Y3 y() {
        return (Y3)this.p(c.d, null, null);
    }
    
    public static final class a extends m3
    {
        public final Y3 b;
        
        public a(final Y3 b) {
            this.b = b;
        }
    }
    
    public abstract static class b extends k3
    {
        public final Y3 o;
        public Y3 p;
        
        public b(final Y3 o) {
            this.o = o;
            if (!o.F()) {
                this.p = o.y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        
        public static void n(final Object o, final Object o2) {
            U4.a().c(o).d(o, o2);
        }
        
        @Override
        public /* synthetic */ I4 i() {
            return this.o();
        }
        
        public final b l(final Y3 y3) {
            if (this.o.equals(y3)) {
                return this;
            }
            if (!this.p.F()) {
                this.t();
            }
            n(this.p, y3);
            return this;
        }
        
        public Y3 o() {
            if (!this.p.F()) {
                return this.p;
            }
            this.p.C();
            return this.p;
        }
        
        public final void s() {
            if (!this.p.F()) {
                this.t();
            }
        }
        
        public void t() {
            final Y3 y = this.o.y();
            n(y, this.p);
            this.p = y;
        }
        
        public final b u(final byte[] array, final int n, final int n2, final M3 m3) {
            if (!this.p.F()) {
                this.t();
            }
            try {
                U4.a().c(this.p).g(this.p, array, 0, n2, new p3(m3));
                return this;
            }
            catch (IOException ex) {
                goto Label_0055;
            }
            catch (k4 k4) {
                goto Label_0070;
            }
            catch (IndexOutOfBoundsException ex2) {}
            goto Label_0066;
        }
        
        public final Y3 v() {
            final Y3 y3 = (Y3)this.i();
            if (y3.E()) {
                return y3;
            }
            throw new t5(y3);
        }
    }
    
    public enum c
    {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final /* synthetic */ int[] h;
        
        static {
            h = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        }
        
        public static int[] a() {
            return Y3.c.h.clone();
        }
    }
    
    public abstract static class d extends N3
    {
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.N3;
import com.google.android.gms.internal.measurement.N4;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.internal.measurement.W4;
import com.google.android.gms.internal.measurement.Y4;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.w4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Y3
extends j3 {
    private static Map<Object, Y3> zzc = new ConcurrentHashMap();
    protected v5 zzb = v5.k();
    private int zzd = -1;

    public static i4 A() {
        return w4.f();
    }

    public static h4 B() {
        return Y4.g();
    }

    private final int k() {
        return U4.a().c(this).f(this);
    }

    public static Y3 l(Class class_) {
        Y3 y32;
        Y3 y33;
        y32 = y33 = (Y3)zzc.get((Object)class_);
        if (y33 == null) {
            try {
                Class.forName((String)class_.getName(), (boolean)true, (ClassLoader)class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            y32 = (Y3)zzc.get((Object)class_);
        }
        if (y32 == null) {
            y32 = (Y3)((Y3)D5.b(class_)).p(c.f, null, null);
            if (y32 != null) {
                zzc.put((Object)class_, (Object)y32);
                return y32;
            }
            throw new IllegalStateException();
        }
        return y32;
    }

    public static h4 n(h4 h42) {
        int n8 = h42.size();
        n8 = n8 == 0 ? 10 : (n8 <<= 1);
        return h42.e(n8);
    }

    public static i4 o(i4 i42) {
        int n8 = i42.size();
        n8 = n8 == 0 ? 10 : (n8 <<= 1);
        return i42.r(n8);
    }

    public static Object q(I4 i42, String string2, Object[] arrobject) {
        return new W4(i42, string2, arrobject);
    }

    public static /* varargs */ Object s(Method object, Object object2, Object ... arrobject) {
        try {
            object = object.invoke(object2, arrobject);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", (Throwable)illegalAccessException);
        }
    }

    public static void t(Class class_, Y3 y32) {
        y32.D();
        zzc.put((Object)class_, (Object)y32);
    }

    public static final boolean u(Y3 y32, boolean bl) {
        int n8 = ((Byte)y32.p(c.a, null, null)).byteValue();
        if (n8 == 1) {
            return true;
        }
        if (n8 == 0) {
            return false;
        }
        boolean bl2 = U4.a().c(y32).c(y32);
        if (bl) {
            n8 = c.b;
            Y3 y33 = bl2 ? y32 : null;
            y32.p(n8, y33, null);
        }
        return bl2;
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
        return Y3.u(this, true);
    }

    public final boolean F() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int a() {
        return this.c(null);
    }

    @Override
    public final /* synthetic */ I4 b() {
        return (Y3)this.p(c.f, null, null);
    }

    @Override
    public final int c(Z4 z42) {
        if (this.F()) {
            int n8 = this.v(z42);
            if (n8 >= 0) {
                return n8;
            }
            z42 = new StringBuilder("serialized size must be non-negative, was ");
            z42.append(n8);
            throw new IllegalStateException(z42.toString());
        }
        if (this.g() != Integer.MAX_VALUE) {
            return this.g();
        }
        int n9 = this.v(z42);
        this.j(n9);
        return n9;
    }

    @Override
    public final /* synthetic */ L4 d() {
        return (b)this.p(c.e, null, null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return U4.a().c(this).h(this, (Y3)object);
    }

    @Override
    public final void f(J3 j32) {
        U4.a().c(this).i(this, L3.P(j32));
    }

    @Override
    public final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public int hashCode() {
        if (this.F()) {
            return this.k();
        }
        if (this.zza == 0) {
            this.zza = this.k();
        }
        return this.zza;
    }

    @Override
    public final void j(int n8) {
        if (n8 >= 0) {
            this.zzd = n8 & Integer.MAX_VALUE | this.zzd & Integer.MIN_VALUE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("serialized size must be non-negative, was ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public abstract Object p(int var1, Object var2, Object var3);

    public String toString() {
        return N4.a(this, Object.super.toString());
    }

    public final int v(Z4 z42) {
        if (z42 == null) {
            return U4.a().c(this).b(this);
        }
        return z42.b(this);
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

    public static final class a
    extends m3 {
        public final Y3 b;

        public a(Y3 y32) {
            this.b = y32;
        }
    }

    public static abstract class b
    extends k3 {
        public final Y3 o;
        public Y3 p;

        public b(Y3 y32) {
            this.o = y32;
            if (!y32.F()) {
                this.p = y32.y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void n(Object object, Object object2) {
            U4.a().c(object).d(object, object2);
        }

        @Override
        public /* synthetic */ Object clone() {
            b b8 = (b)this.o.p(c.e, null, null);
            b8.p = (Y3)this.i();
            return b8;
        }

        @Override
        public final /* synthetic */ k3 g(byte[] arrby, int n8, int n9) {
            return this.u(arrby, 0, n9, M3.c);
        }

        @Override
        public /* synthetic */ I4 i() {
            return this.o();
        }

        @Override
        public final /* synthetic */ k3 j(byte[] arrby, int n8, int n9, M3 m32) {
            return this.u(arrby, 0, n9, m32);
        }

        public final b l(Y3 y32) {
            if (this.o.equals(y32)) {
                return this;
            }
            if (!this.p.F()) {
                this.t();
            }
            b.n(this.p, y32);
            return this;
        }

        public Y3 o() {
            if (!this.p.F()) {
                return this.p;
            }
            this.p.C();
            return this.p;
        }

        public /* synthetic */ I4 p() {
            return this.v();
        }

        public final void s() {
            if (!this.p.F()) {
                this.t();
            }
        }

        public void t() {
            Y3 y32 = this.o.y();
            b.n(y32, this.p);
            this.p = y32;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final b u(byte[] arrby, int n8, int n9, M3 m32) {
            if (!this.p.F()) {
                this.t();
            }
            try {
                U4.a().c(this.p).g(this.p, arrby, 0, n9, new p3(m32));
                return this;
            }
            catch (IOException iOException) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", (Throwable)iOException);
            }
            catch (k4 k42) {
                throw k42;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw k4.f();
            }
        }

        public final Y3 v() {
            Y3 y32 = (Y3)this.i();
            if (y32.E()) {
                return y32;
            }
            throw new t5(y32);
        }
    }

    public static final abstract class c {
        public static final /* enum */ int a = 1;
        public static final /* enum */ int b = 2;
        public static final /* enum */ int c = 3;
        public static final /* enum */ int d = 4;
        public static final /* enum */ int e = 5;
        public static final /* enum */ int f = 6;
        public static final /* enum */ int g = 7;
        public static final /* synthetic */ int[] h;

        static {
            h = new int[]{1, 2, 3, 4, 5, 6, 7};
        }

        public static int[] a() {
            return (int[])h.clone();
        }
    }

    public static abstract class d
    extends N3 {
    }

}


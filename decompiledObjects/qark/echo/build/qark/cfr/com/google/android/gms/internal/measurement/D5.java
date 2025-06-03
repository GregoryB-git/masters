/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.nio.Buffer
 *  java.nio.ByteOrder
 *  java.security.AccessController
 *  java.security.PrivilegedExceptionAction
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  sun.misc.Unsafe
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5;
import com.google.android.gms.internal.measurement.o3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class D5 {
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final boolean d;
    public static final c e;
    public static final boolean f;
    public static final boolean g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final int v;
    public static final boolean w;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static {
        var6 = D5.p();
        D5.a = var6;
        D5.b = o3.a();
        D5.c = var0_1 = D5.A(Long.TYPE);
        D5.d = var1_2 = D5.A(Integer.TYPE);
        if (var6 == null) ** GOTO lbl-1000
        if (var0_1) {
            var6 = new a((Unsafe)var6);
        } else if (var1_2) {
            var6 = new b((Unsafe)var6);
        } else lbl-1000: // 2 sources:
        {
            var6 = null;
        }
        D5.e = var6;
        var1_2 = false;
        var0_1 = var6 == null ? false : var6.j();
        D5.f = var0_1;
        var0_1 = var6 == null ? false : var6.h();
        D5.g = var0_1;
        D5.h = var4_3 = (long)D5.o(byte[].class);
        D5.i = D5.o(boolean[].class);
        D5.j = D5.s(boolean[].class);
        D5.k = D5.o(int[].class);
        D5.l = D5.s(int[].class);
        D5.m = D5.o(long[].class);
        D5.n = D5.s(long[].class);
        D5.o = D5.o(float[].class);
        D5.p = D5.s(float[].class);
        D5.q = D5.o(double[].class);
        D5.r = D5.s(double[].class);
        D5.s = D5.o(Object[].class);
        D5.t = D5.s(Object[].class);
        var7_4 = D5.C();
        var2_5 = var7_4 != null && var6 != null ? var6.a.objectFieldOffset(var7_4) : -1L;
        D5.u = var2_5;
        D5.v = (int)(var4_3 & 7L);
        var0_1 = var1_2;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            var0_1 = true;
        }
        D5.w = var0_1;
    }

    public static boolean A(Class class_) {
        try {
            Class class_2 = b;
            Class class_3 = Boolean.TYPE;
            class_2.getMethod("peekLong", new Class[]{class_, class_3});
            class_2.getMethod("pokeLong", new Class[]{class_, Long.TYPE, class_3});
            Class class_4 = Integer.TYPE;
            class_2.getMethod("pokeInt", new Class[]{class_, class_4, class_3});
            class_2.getMethod("peekInt", new Class[]{class_, class_3});
            class_2.getMethod("pokeByte", new Class[]{class_, Byte.TYPE});
            class_2.getMethod("peekByte", new Class[]{class_});
            class_2.getMethod("pokeByteArray", new Class[]{class_, byte[].class, class_4, class_4});
            class_2.getMethod("peekByteArray", new Class[]{class_, byte[].class, class_4, class_4});
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public static Object B(Object object, long l8) {
        return D5.e.a.getObject(object, l8);
    }

    public static Field C() {
        Field field = D5.d(Buffer.class, "effectiveDirectAddress");
        if (field != null) {
            return field;
        }
        field = D5.d(Buffer.class, "address");
        if (field != null && field.getType() == Long.TYPE) {
            return field;
        }
        return null;
    }

    public static /* synthetic */ boolean D(Object object, long l8) {
        if ((byte)(D5.t(object, -4L & l8) >>> (int)((l8 & 3L) << 3)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean E(Object object, long l8) {
        if ((byte)(D5.t(object, -4L & l8) >>> (int)((l8 & 3L) << 3)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean F(Object object, long l8) {
        return e.k(object, l8);
    }

    public static double a(Object object, long l8) {
        return e.a(object, l8);
    }

    public static Object b(Class object) {
        try {
            object = a.allocateInstance((Class)object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException((Throwable)instantiationException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Field d(Class class_, String string2) {
        try {
            return class_.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void f(Object object, long l8, double d8) {
        e.c(object, l8, d8);
    }

    public static void g(Object object, long l8, float f8) {
        e.d(object, l8, f8);
    }

    public static void h(Object object, long l8, int n8) {
        e.e(object, l8, n8);
    }

    public static void i(Object object, long l8, long l9) {
        e.f(object, l8, l9);
    }

    public static void j(Object object, long l8, Object object2) {
        D5.e.a.putObject(object, l8, object2);
    }

    public static /* synthetic */ void l(Throwable object) {
        Logger logger = Logger.getLogger((String)D5.class.getName());
        Level level = Level.WARNING;
        object = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", stringBuilder.toString());
    }

    public static void m(byte[] arrby, long l8, byte by) {
        e.b(arrby, h + l8, by);
    }

    public static float n(Object object, long l8) {
        return e.i(object, l8);
    }

    public static int o(Class class_) {
        if (g) {
            return D5.e.a.arrayBaseOffset(class_);
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Unsafe p() {
        try {
            return (Unsafe)AccessController.doPrivileged((PrivilegedExceptionAction)new C5());
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static int s(Class class_) {
        if (g) {
            return D5.e.a.arrayIndexScale(class_);
        }
        return -1;
    }

    public static int t(Object object, long l8) {
        return e.l(object, l8);
    }

    public static void u(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = D5.t(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        D5.h(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static void v(Object object, long l8, boolean bl) {
        e.g(object, l8, bl);
    }

    public static boolean w() {
        return g;
    }

    public static long x(Object object, long l8) {
        return e.m(object, l8);
    }

    public static void y(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = D5.t(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        D5.h(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static boolean z() {
        return f;
    }

    public static final class a
    extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public final double a(Object object, long l8) {
            return Double.longBitsToDouble((long)this.m(object, l8));
        }

        @Override
        public final void b(Object object, long l8, byte by) {
            if (D5.w) {
                D5.u(object, l8, by);
                return;
            }
            D5.y(object, l8, by);
        }

        @Override
        public final void c(Object object, long l8, double d8) {
            this.f(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public final void d(Object object, long l8, float f8) {
            this.e(object, l8, Float.floatToIntBits((float)f8));
        }

        @Override
        public final void g(Object object, long l8, boolean bl) {
            if (D5.w) {
                D5.u(object, l8, (byte)(bl ? 1 : 0));
                return;
            }
            D5.y(object, l8, (byte)(bl ? 1 : 0));
        }

        @Override
        public final float i(Object object, long l8) {
            return Float.intBitsToFloat((int)this.l(object, l8));
        }

        @Override
        public final boolean k(Object object, long l8) {
            if (D5.w) {
                return D5.D(object, l8);
            }
            return D5.E(object, l8);
        }
    }

    public static final class b
    extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public final double a(Object object, long l8) {
            return Double.longBitsToDouble((long)this.m(object, l8));
        }

        @Override
        public final void b(Object object, long l8, byte by) {
            if (D5.w) {
                D5.u(object, l8, by);
                return;
            }
            D5.y(object, l8, by);
        }

        @Override
        public final void c(Object object, long l8, double d8) {
            this.f(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public final void d(Object object, long l8, float f8) {
            this.e(object, l8, Float.floatToIntBits((float)f8));
        }

        @Override
        public final void g(Object object, long l8, boolean bl) {
            if (D5.w) {
                D5.u(object, l8, (byte)(bl ? 1 : 0));
                return;
            }
            D5.y(object, l8, (byte)(bl ? 1 : 0));
        }

        @Override
        public final float i(Object object, long l8) {
            return Float.intBitsToFloat((int)this.l(object, l8));
        }

        @Override
        public final boolean k(Object object, long l8) {
            if (D5.w) {
                return D5.D(object, l8);
            }
            return D5.E(object, l8);
        }
    }

    public static abstract class c {
        public Unsafe a;

        public c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract double a(Object var1, long var2);

        public abstract void b(Object var1, long var2, byte var4);

        public abstract void c(Object var1, long var2, double var4);

        public abstract void d(Object var1, long var2, float var4);

        public final void e(Object object, long l8, int n8) {
            this.a.putInt(object, l8, n8);
        }

        public final void f(Object object, long l8, long l9) {
            this.a.putLong(object, l8, l9);
        }

        public abstract void g(Object var1, long var2, boolean var4);

        public final boolean h() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("arrayBaseOffset", new Class[]{Class.class});
                unsafe.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class class_ = Long.TYPE;
                unsafe.getMethod("getInt", new Class[]{Object.class, class_});
                unsafe.getMethod("putInt", new Class[]{Object.class, class_, Integer.TYPE});
                unsafe.getMethod("getLong", new Class[]{Object.class, class_});
                unsafe.getMethod("putLong", new Class[]{Object.class, class_, class_});
                unsafe.getMethod("getObject", new Class[]{Object.class, class_});
                unsafe.getMethod("putObject", new Class[]{Object.class, class_, Object.class});
                return true;
            }
            catch (Throwable throwable) {
                D5.l(throwable);
                return false;
            }
        }

        public abstract float i(Object var1, long var2);

        public final boolean j() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                unsafe = D5.C();
                if (unsafe == null) {
                    return false;
                }
                return true;
            }
            catch (Throwable throwable) {
                D5.l(throwable);
                return false;
            }
        }

        public abstract boolean k(Object var1, long var2);

        public final int l(Object object, long l8) {
            return this.a.getInt(object, l8);
        }

        public final long m(Object object, long l8) {
            return this.a.getLong(object, l8);
        }
    }

}


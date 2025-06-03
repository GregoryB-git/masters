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
package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class k0 {
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final boolean d;
    public static final e e;
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

    static {
        long l8;
        a = k0.D();
        b = com.google.protobuf.d.b();
        c = k0.o(Long.TYPE);
        d = k0.o(Integer.TYPE);
        e = k0.B();
        f = k0.T();
        g = k0.S();
        h = l8 = (long)k0.l(byte[].class);
        i = k0.l(boolean[].class);
        j = k0.m(boolean[].class);
        k = k0.l(int[].class);
        l = k0.m(int[].class);
        m = k0.l(long[].class);
        n = k0.m(long[].class);
        o = k0.l(float[].class);
        p = k0.m(float[].class);
        q = k0.l(double[].class);
        r = k0.m(double[].class);
        s = k0.l(Object[].class);
        t = k0.m(Object[].class);
        u = k0.q(k0.n());
        v = (int)(l8 & 7L);
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        w = bl;
    }

    public static long A(Object object, long l8) {
        return e.h(object, l8);
    }

    public static e B() {
        Unsafe unsafe = a;
        b b8 = null;
        if (unsafe == null) {
            return null;
        }
        if (com.google.protobuf.d.c()) {
            if (c) {
                return new c(unsafe);
            }
            if (d) {
                b8 = new b(unsafe);
            }
            return b8;
        }
        return new d(unsafe);
    }

    public static Object C(Object object, long l8) {
        return e.i(object, l8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Unsafe D() {
        try {
            return (Unsafe)AccessController.doPrivileged((PrivilegedExceptionAction)new PrivilegedExceptionAction(){

                public Unsafe a() {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object object = field.get((Object)null);
                        if (!Unsafe.class.isInstance(object)) continue;
                        return (Unsafe)Unsafe.class.cast(object);
                    }
                    return null;
                }
            });
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static boolean E() {
        return g;
    }

    public static boolean F() {
        return f;
    }

    public static void G(Throwable throwable) {
        Logger logger = Logger.getLogger((String)k0.class.getName());
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append((Object)throwable);
        logger.log(level, stringBuilder.toString());
    }

    public static void H(Object object, long l8, boolean bl) {
        e.k(object, l8, bl);
    }

    public static void I(Object object, long l8, boolean bl) {
        k0.L(object, l8, (byte)(bl ? 1 : 0));
    }

    public static void J(Object object, long l8, boolean bl) {
        k0.M(object, l8, (byte)(bl ? 1 : 0));
    }

    public static void K(byte[] arrby, long l8, byte by) {
        e.l(arrby, h + l8, by);
    }

    public static void L(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = k0.z(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        k0.P(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static void M(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = k0.z(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        k0.P(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static void N(Object object, long l8, double d8) {
        e.m(object, l8, d8);
    }

    public static void O(Object object, long l8, float f8) {
        e.n(object, l8, f8);
    }

    public static void P(Object object, long l8, int n8) {
        e.o(object, l8, n8);
    }

    public static void Q(Object object, long l8, long l9) {
        e.p(object, l8, l9);
    }

    public static void R(Object object, long l8, Object object2) {
        e.q(object, l8, object2);
    }

    public static boolean S() {
        e e8 = e;
        if (e8 == null) {
            return false;
        }
        return e8.r();
    }

    public static boolean T() {
        e e8 = e;
        if (e8 == null) {
            return false;
        }
        return e8.s();
    }

    public static Object k(Class object) {
        try {
            object = a.allocateInstance((Class)object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException((Throwable)instantiationException);
        }
    }

    public static int l(Class class_) {
        if (g) {
            return e.a(class_);
        }
        return -1;
    }

    public static int m(Class class_) {
        if (g) {
            return e.b(class_);
        }
        return -1;
    }

    public static Field n() {
        Field field;
        if (com.google.protobuf.d.c() && (field = k0.p(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = k0.p(Buffer.class, "address");
        if (field != null && field.getType() == Long.TYPE) {
            return field;
        }
        return null;
    }

    public static boolean o(Class class_) {
        if (!com.google.protobuf.d.c()) {
            return false;
        }
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Field p(Class class_, String string2) {
        try {
            return class_.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static long q(Field field) {
        e e8;
        if (field != null && (e8 = e) != null) {
            return e8.j(field);
        }
        return -1L;
    }

    public static boolean r(Object object, long l8) {
        return e.c(object, l8);
    }

    public static boolean s(Object object, long l8) {
        if (k0.v(object, l8) != 0) {
            return true;
        }
        return false;
    }

    public static boolean t(Object object, long l8) {
        if (k0.w(object, l8) != 0) {
            return true;
        }
        return false;
    }

    public static byte u(byte[] arrby, long l8) {
        return e.d(arrby, h + l8);
    }

    public static byte v(Object object, long l8) {
        return (byte)(k0.z(object, -4L & l8) >>> (int)((l8 & 3L) << 3) & 255);
    }

    public static byte w(Object object, long l8) {
        return (byte)(k0.z(object, -4L & l8) >>> (int)((l8 & 3L) << 3) & 255);
    }

    public static double x(Object object, long l8) {
        return e.e(object, l8);
    }

    public static float y(Object object, long l8) {
        return e.f(object, l8);
    }

    public static int z(Object object, long l8) {
        return e.g(object, l8);
    }

    public static final class b
    extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (k0.w) {
                return k0.s(object, l8);
            }
            return k0.t(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (k0.w) {
                return k0.v(object, l8);
            }
            return k0.w(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return Double.longBitsToDouble((long)this.h(object, l8));
        }

        @Override
        public float f(Object object, long l8) {
            return Float.intBitsToFloat((int)this.g(object, l8));
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            if (k0.w) {
                k0.I(object, l8, bl);
                return;
            }
            k0.J(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (k0.w) {
                k0.L(object, l8, by);
                return;
            }
            k0.M(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits((float)f8));
        }

        @Override
        public boolean s() {
            return false;
        }
    }

    public static final class c
    extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (k0.w) {
                return k0.s(object, l8);
            }
            return k0.t(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (k0.w) {
                return k0.v(object, l8);
            }
            return k0.w(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return Double.longBitsToDouble((long)this.h(object, l8));
        }

        @Override
        public float f(Object object, long l8) {
            return Float.intBitsToFloat((int)this.g(object, l8));
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            if (k0.w) {
                k0.I(object, l8, bl);
                return;
            }
            k0.J(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (k0.w) {
                k0.L(object, l8, by);
                return;
            }
            k0.M(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits((float)f8));
        }

        @Override
        public boolean s() {
            return false;
        }
    }

    public static final class d
    extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            return this.a.getBoolean(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            return this.a.getByte(object, l8);
        }

        @Override
        public double e(Object object, long l8) {
            return this.a.getDouble(object, l8);
        }

        @Override
        public float f(Object object, long l8) {
            return this.a.getFloat(object, l8);
        }

        @Override
        public void k(Object object, long l8, boolean bl) {
            this.a.putBoolean(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            this.a.putByte(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.a.putDouble(object, l8, d8);
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.a.putFloat(object, l8, f8);
        }

        @Override
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class class_ = this.a.getClass();
                Class class_2 = Long.TYPE;
                class_.getMethod("getByte", new Class[]{Object.class, class_2});
                class_.getMethod("putByte", new Class[]{Object.class, class_2, Byte.TYPE});
                class_.getMethod("getBoolean", new Class[]{Object.class, class_2});
                class_.getMethod("putBoolean", new Class[]{Object.class, class_2, Boolean.TYPE});
                class_.getMethod("getFloat", new Class[]{Object.class, class_2});
                class_.getMethod("putFloat", new Class[]{Object.class, class_2, Float.TYPE});
                class_.getMethod("getDouble", new Class[]{Object.class, class_2});
                class_.getMethod("putDouble", new Class[]{Object.class, class_2, Double.TYPE});
                return true;
            }
            catch (Throwable throwable) {
                k0.G(throwable);
                return false;
            }
        }

        @Override
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class class_ = this.a.getClass();
                Class class_2 = Long.TYPE;
                class_.getMethod("getByte", new Class[]{class_2});
                class_.getMethod("putByte", new Class[]{class_2, Byte.TYPE});
                class_.getMethod("getInt", new Class[]{class_2});
                class_.getMethod("putInt", new Class[]{class_2, Integer.TYPE});
                class_.getMethod("getLong", new Class[]{class_2});
                class_.getMethod("putLong", new Class[]{class_2, class_2});
                class_.getMethod("copyMemory", new Class[]{class_2, class_2, class_2});
                class_.getMethod("copyMemory", new Class[]{Object.class, class_2, Object.class, class_2, class_2});
                return true;
            }
            catch (Throwable throwable) {
                k0.G(throwable);
                return false;
            }
        }
    }

    public static abstract class e {
        public Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class class_) {
            return this.a.arrayBaseOffset(class_);
        }

        public final int b(Class class_) {
            return this.a.arrayIndexScale(class_);
        }

        public abstract boolean c(Object var1, long var2);

        public abstract byte d(Object var1, long var2);

        public abstract double e(Object var1, long var2);

        public abstract float f(Object var1, long var2);

        public final int g(Object object, long l8) {
            return this.a.getInt(object, l8);
        }

        public final long h(Object object, long l8) {
            return this.a.getLong(object, l8);
        }

        public final Object i(Object object, long l8) {
            return this.a.getObject(object, l8);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object var1, long var2, boolean var4);

        public abstract void l(Object var1, long var2, byte var4);

        public abstract void m(Object var1, long var2, double var4);

        public abstract void n(Object var1, long var2, float var4);

        public final void o(Object object, long l8, int n8) {
            this.a.putInt(object, l8, n8);
        }

        public final void p(Object object, long l8, long l9) {
            this.a.putLong(object, l8, l9);
        }

        public final void q(Object object, long l8, Object object2) {
            this.a.putObject(object, l8, object2);
        }

        public boolean r() {
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
                k0.G(throwable);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                unsafe = k0.n();
                if (unsafe == null) {
                    return false;
                }
                return true;
            }
            catch (Throwable throwable) {
                k0.G(throwable);
                return false;
            }
        }
    }

}


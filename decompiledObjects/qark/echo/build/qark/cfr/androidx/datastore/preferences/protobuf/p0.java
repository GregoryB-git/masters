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
package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class p0 {
    public static final Logger a;
    public static final Unsafe b;
    public static final Class c;
    public static final boolean d;
    public static final boolean e;
    public static final e f;
    public static final boolean g;
    public static final boolean h;
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
    public static final long v;
    public static final int w;
    public static final boolean x;

    static {
        long l8;
        a = Logger.getLogger((String)p0.class.getName());
        b = p0.B();
        c = androidx.datastore.preferences.protobuf.d.b();
        d = p0.m(Long.TYPE);
        e = p0.m(Integer.TYPE);
        f = p0.z();
        g = p0.Q();
        h = p0.P();
        i = l8 = (long)p0.j(byte[].class);
        j = p0.j(boolean[].class);
        k = p0.k(boolean[].class);
        l = p0.j(int[].class);
        m = p0.k(int[].class);
        n = p0.j(long[].class);
        o = p0.k(long[].class);
        p = p0.j(float[].class);
        q = p0.k(float[].class);
        r = p0.j(double[].class);
        s = p0.k(double[].class);
        t = p0.j(Object[].class);
        u = p0.k(Object[].class);
        v = p0.o(p0.l());
        w = (int)(l8 & 7L);
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        x = bl;
    }

    public static Object A(Object object, long l8) {
        return f.i(object, l8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Unsafe B() {
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

    public static boolean C() {
        return h;
    }

    public static boolean D() {
        return g;
    }

    public static void E(Object object, long l8, boolean bl) {
        f.k(object, l8, bl);
    }

    public static void F(Object object, long l8, boolean bl) {
        p0.I(object, l8, (byte)(bl ? 1 : 0));
    }

    public static void G(Object object, long l8, boolean bl) {
        p0.J(object, l8, (byte)(bl ? 1 : 0));
    }

    public static void H(byte[] arrby, long l8, byte by) {
        f.l(arrby, i + l8, by);
    }

    public static void I(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = p0.x(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        p0.M(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static void J(Object object, long l8, byte by) {
        long l9 = -4L & l8;
        int n8 = p0.x(object, l9);
        int n9 = ((int)l8 & 3) << 3;
        p0.M(object, l9, (255 & by) << n9 | n8 & 255 << n9);
    }

    public static void K(Object object, long l8, double d8) {
        f.m(object, l8, d8);
    }

    public static void L(Object object, long l8, float f8) {
        f.n(object, l8, f8);
    }

    public static void M(Object object, long l8, int n8) {
        f.o(object, l8, n8);
    }

    public static void N(Object object, long l8, long l9) {
        f.p(object, l8, l9);
    }

    public static void O(Object object, long l8, Object object2) {
        f.q(object, l8, object2);
    }

    public static boolean P() {
        Logger logger;
        Unsafe unsafe;
        block4 : {
            unsafe = b;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("arrayBaseOffset", new Class[]{Class.class});
                unsafe.getMethod("arrayIndexScale", new Class[]{Class.class});
                logger = Long.TYPE;
                unsafe.getMethod("getInt", new Class[]{Object.class, logger});
                unsafe.getMethod("putInt", new Class[]{Object.class, logger, Integer.TYPE});
                unsafe.getMethod("getLong", new Class[]{Object.class, logger});
                unsafe.getMethod("putLong", new Class[]{Object.class, logger, logger});
                unsafe.getMethod("getObject", new Class[]{Object.class, logger});
                unsafe.getMethod("putObject", new Class[]{Object.class, logger, Object.class});
                if (!androidx.datastore.preferences.protobuf.d.c()) break block4;
                return true;
            }
            catch (Throwable throwable) {
                logger = a;
                Level level = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
                stringBuilder.append((Object)throwable);
                logger.log(level, stringBuilder.toString());
                return false;
            }
        }
        unsafe.getMethod("getByte", new Class[]{Object.class, logger});
        unsafe.getMethod("putByte", new Class[]{Object.class, logger, Byte.TYPE});
        unsafe.getMethod("getBoolean", new Class[]{Object.class, logger});
        unsafe.getMethod("putBoolean", new Class[]{Object.class, logger, Boolean.TYPE});
        unsafe.getMethod("getFloat", new Class[]{Object.class, logger});
        unsafe.getMethod("putFloat", new Class[]{Object.class, logger, Float.TYPE});
        unsafe.getMethod("getDouble", new Class[]{Object.class, logger});
        unsafe.getMethod("putDouble", new Class[]{Object.class, logger, Double.TYPE});
        return true;
    }

    public static boolean Q() {
        Logger logger;
        Unsafe unsafe;
        block6 : {
            block5 : {
                unsafe = b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    unsafe = unsafe.getClass();
                    unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                    logger = Long.TYPE;
                    unsafe.getMethod("getLong", new Class[]{Object.class, logger});
                    if (p0.l() != null) break block5;
                    return false;
                }
                catch (Throwable throwable) {
                    logger = a;
                    Level level = Level.WARNING;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
                    stringBuilder.append((Object)throwable);
                    logger.log(level, stringBuilder.toString());
                    return false;
                }
            }
            if (!androidx.datastore.preferences.protobuf.d.c()) break block6;
            return true;
        }
        unsafe.getMethod("getByte", new Class[]{logger});
        unsafe.getMethod("putByte", new Class[]{logger, Byte.TYPE});
        unsafe.getMethod("getInt", new Class[]{logger});
        unsafe.getMethod("putInt", new Class[]{logger, Integer.TYPE});
        unsafe.getMethod("getLong", new Class[]{logger});
        unsafe.getMethod("putLong", new Class[]{logger, logger});
        unsafe.getMethod("copyMemory", new Class[]{logger, logger, logger});
        unsafe.getMethod("copyMemory", new Class[]{Object.class, logger, Object.class, logger, logger});
        return true;
    }

    public static Object i(Class object) {
        try {
            object = b.allocateInstance((Class)object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException((Throwable)instantiationException);
        }
    }

    public static int j(Class class_) {
        if (h) {
            return f.a(class_);
        }
        return -1;
    }

    public static int k(Class class_) {
        if (h) {
            return f.b(class_);
        }
        return -1;
    }

    public static Field l() {
        Field field;
        if (androidx.datastore.preferences.protobuf.d.c() && (field = p0.n(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = p0.n(Buffer.class, "address");
        if (field != null && field.getType() == Long.TYPE) {
            return field;
        }
        return null;
    }

    public static boolean m(Class class_) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class class_2 = c;
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
    public static Field n(Class class_, String string2) {
        try {
            return class_.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static long o(Field field) {
        e e8;
        if (field != null && (e8 = f) != null) {
            return e8.j(field);
        }
        return -1L;
    }

    public static boolean p(Object object, long l8) {
        return f.c(object, l8);
    }

    public static boolean q(Object object, long l8) {
        if (p0.t(object, l8) != 0) {
            return true;
        }
        return false;
    }

    public static boolean r(Object object, long l8) {
        if (p0.u(object, l8) != 0) {
            return true;
        }
        return false;
    }

    public static byte s(byte[] arrby, long l8) {
        return f.d(arrby, i + l8);
    }

    public static byte t(Object object, long l8) {
        return (byte)(p0.x(object, -4L & l8) >>> (int)((l8 & 3L) << 3) & 255);
    }

    public static byte u(Object object, long l8) {
        return (byte)(p0.x(object, -4L & l8) >>> (int)((l8 & 3L) << 3) & 255);
    }

    public static double v(Object object, long l8) {
        return f.e(object, l8);
    }

    public static float w(Object object, long l8) {
        return f.f(object, l8);
    }

    public static int x(Object object, long l8) {
        return f.g(object, l8);
    }

    public static long y(Object object, long l8) {
        return f.h(object, l8);
    }

    public static e z() {
        Unsafe unsafe = b;
        b b8 = null;
        if (unsafe == null) {
            return null;
        }
        if (androidx.datastore.preferences.protobuf.d.c()) {
            if (d) {
                return new c(unsafe);
            }
            if (e) {
                b8 = new b(unsafe);
            }
            return b8;
        }
        return new d(unsafe);
    }

    public static final class b
    extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (p0.x) {
                return p0.q(object, l8);
            }
            return p0.r(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (p0.x) {
                return p0.t(object, l8);
            }
            return p0.u(object, l8);
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
            if (p0.x) {
                p0.F(object, l8, bl);
                return;
            }
            p0.G(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (p0.x) {
                p0.I(object, l8, by);
                return;
            }
            p0.J(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits((float)f8));
        }
    }

    public static final class c
    extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override
        public boolean c(Object object, long l8) {
            if (p0.x) {
                return p0.q(object, l8);
            }
            return p0.r(object, l8);
        }

        @Override
        public byte d(Object object, long l8) {
            if (p0.x) {
                return p0.t(object, l8);
            }
            return p0.u(object, l8);
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
            if (p0.x) {
                p0.F(object, l8, bl);
                return;
            }
            p0.G(object, l8, bl);
        }

        @Override
        public void l(Object object, long l8, byte by) {
            if (p0.x) {
                p0.I(object, l8, by);
                return;
            }
            p0.J(object, l8, by);
        }

        @Override
        public void m(Object object, long l8, double d8) {
            this.p(object, l8, Double.doubleToLongBits((double)d8));
        }

        @Override
        public void n(Object object, long l8, float f8) {
            this.o(object, l8, Float.floatToIntBits((float)f8));
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
    }

}


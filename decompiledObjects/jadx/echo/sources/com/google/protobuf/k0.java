package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12096a = D();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12097b = AbstractC1139d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f12098c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12099d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f12100e = B();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f12101f = T();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f12102g = S();

    /* renamed from: h, reason: collision with root package name */
    public static final long f12103h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f12104i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f12105j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f12106k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f12107l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f12108m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f12109n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f12110o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f12111p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f12112q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f12113r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f12114s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f12115t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f12116u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f12117v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f12118w;

    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.k0.e
        public boolean c(Object obj, long j7) {
            return k0.f12118w ? k0.s(obj, j7) : k0.t(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public byte d(Object obj, long j7) {
            return k0.f12118w ? k0.v(obj, j7) : k0.w(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.protobuf.k0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.protobuf.k0.e
        public void k(Object obj, long j7, boolean z7) {
            if (k0.f12118w) {
                k0.I(obj, j7, z7);
            } else {
                k0.J(obj, j7, z7);
            }
        }

        @Override // com.google.protobuf.k0.e
        public void l(Object obj, long j7, byte b7) {
            if (k0.f12118w) {
                k0.L(obj, j7, b7);
            } else {
                k0.M(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.k0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.k0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.k0.e
        public boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.k0.e
        public boolean c(Object obj, long j7) {
            return k0.f12118w ? k0.s(obj, j7) : k0.t(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public byte d(Object obj, long j7) {
            return k0.f12118w ? k0.v(obj, j7) : k0.w(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.protobuf.k0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.protobuf.k0.e
        public void k(Object obj, long j7, boolean z7) {
            if (k0.f12118w) {
                k0.I(obj, j7, z7);
            } else {
                k0.J(obj, j7, z7);
            }
        }

        @Override // com.google.protobuf.k0.e
        public void l(Object obj, long j7, byte b7) {
            if (k0.f12118w) {
                k0.L(obj, j7, b7);
            } else {
                k0.M(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.k0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.k0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.k0.e
        public boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.k0.e
        public boolean c(Object obj, long j7) {
            return this.f12119a.getBoolean(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public byte d(Object obj, long j7) {
            return this.f12119a.getByte(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public double e(Object obj, long j7) {
            return this.f12119a.getDouble(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public float f(Object obj, long j7) {
            return this.f12119a.getFloat(obj, j7);
        }

        @Override // com.google.protobuf.k0.e
        public void k(Object obj, long j7, boolean z7) {
            this.f12119a.putBoolean(obj, j7, z7);
        }

        @Override // com.google.protobuf.k0.e
        public void l(Object obj, long j7, byte b7) {
            this.f12119a.putByte(obj, j7, b7);
        }

        @Override // com.google.protobuf.k0.e
        public void m(Object obj, long j7, double d7) {
            this.f12119a.putDouble(obj, j7, d7);
        }

        @Override // com.google.protobuf.k0.e
        public void n(Object obj, long j7, float f7) {
            this.f12119a.putFloat(obj, j7, f7);
        }

        @Override // com.google.protobuf.k0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f12119a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                k0.G(th);
                return false;
            }
        }

        @Override // com.google.protobuf.k0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f12119a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                k0.G(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f12119a;

        public e(Unsafe unsafe) {
            this.f12119a = unsafe;
        }

        public final int a(Class cls) {
            return this.f12119a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f12119a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j7);

        public abstract byte d(Object obj, long j7);

        public abstract double e(Object obj, long j7);

        public abstract float f(Object obj, long j7);

        public final int g(Object obj, long j7) {
            return this.f12119a.getInt(obj, j7);
        }

        public final long h(Object obj, long j7) {
            return this.f12119a.getLong(obj, j7);
        }

        public final Object i(Object obj, long j7) {
            return this.f12119a.getObject(obj, j7);
        }

        public final long j(Field field) {
            return this.f12119a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j7, boolean z7);

        public abstract void l(Object obj, long j7, byte b7);

        public abstract void m(Object obj, long j7, double d7);

        public abstract void n(Object obj, long j7, float f7);

        public final void o(Object obj, long j7, int i7) {
            this.f12119a.putInt(obj, j7, i7);
        }

        public final void p(Object obj, long j7, long j8) {
            this.f12119a.putLong(obj, j7, j8);
        }

        public final void q(Object obj, long j7, Object obj2) {
            this.f12119a.putObject(obj, j7, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f12119a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                k0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f12119a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return k0.n() != null;
            } catch (Throwable th) {
                k0.G(th);
                return false;
            }
        }
    }

    static {
        long l7 = l(byte[].class);
        f12103h = l7;
        f12104i = l(boolean[].class);
        f12105j = m(boolean[].class);
        f12106k = l(int[].class);
        f12107l = m(int[].class);
        f12108m = l(long[].class);
        f12109n = m(long[].class);
        f12110o = l(float[].class);
        f12111p = m(float[].class);
        f12112q = l(double[].class);
        f12113r = m(double[].class);
        f12114s = l(Object[].class);
        f12115t = m(Object[].class);
        f12116u = q(n());
        f12117v = (int) (l7 & 7);
        f12118w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j7) {
        return f12100e.h(obj, j7);
    }

    public static e B() {
        Unsafe unsafe = f12096a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1139d.c()) {
            return new d(unsafe);
        }
        if (f12098c) {
            return new c(unsafe);
        }
        if (f12099d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j7) {
        return f12100e.i(obj, j7);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f12102g;
    }

    public static boolean F() {
        return f12101f;
    }

    public static void G(Throwable th) {
        Logger.getLogger(k0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void H(Object obj, long j7, boolean z7) {
        f12100e.k(obj, j7, z7);
    }

    public static void I(Object obj, long j7, boolean z7) {
        L(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j7, boolean z7) {
        M(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j7, byte b7) {
        f12100e.l(bArr, f12103h + j7, b7);
    }

    public static void L(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int z7 = z(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        P(obj, j8, ((255 & b7) << i7) | (z7 & (~(255 << i7))));
    }

    public static void M(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        P(obj, j8, ((255 & b7) << i7) | (z(obj, j8) & (~(255 << i7))));
    }

    public static void N(Object obj, long j7, double d7) {
        f12100e.m(obj, j7, d7);
    }

    public static void O(Object obj, long j7, float f7) {
        f12100e.n(obj, j7, f7);
    }

    public static void P(Object obj, long j7, int i7) {
        f12100e.o(obj, j7, i7);
    }

    public static void Q(Object obj, long j7, long j8) {
        f12100e.p(obj, j7, j8);
    }

    public static void R(Object obj, long j7, Object obj2) {
        f12100e.q(obj, j7, obj2);
    }

    public static boolean S() {
        e eVar = f12100e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f12100e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static Object k(Class cls) {
        try {
            return f12096a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int l(Class cls) {
        if (f12102g) {
            return f12100e.a(cls);
        }
        return -1;
    }

    public static int m(Class cls) {
        if (f12102g) {
            return f12100e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field p7;
        if (AbstractC1139d.c() && (p7 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p7;
        }
        Field p8 = p(Buffer.class, "address");
        if (p8 == null || p8.getType() != Long.TYPE) {
            return null;
        }
        return p8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Class cls) {
        if (!AbstractC1139d.c()) {
            return false;
        }
        try {
            Class cls2 = f12097b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f12100e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j7) {
        return f12100e.c(obj, j7);
    }

    public static boolean s(Object obj, long j7) {
        return v(obj, j7) != 0;
    }

    public static boolean t(Object obj, long j7) {
        return w(obj, j7) != 0;
    }

    public static byte u(byte[] bArr, long j7) {
        return f12100e.d(bArr, f12103h + j7);
    }

    public static byte v(Object obj, long j7) {
        return (byte) ((z(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j7) {
        return (byte) ((z(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j7) {
        return f12100e.e(obj, j7);
    }

    public static float y(Object obj, long j7) {
        return f12100e.f(obj, j7);
    }

    public static int z(Object obj, long j7) {
        return f12100e.g(obj, j7);
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11401a = D();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11402b = AbstractC1089d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11403c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11404d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f11405e = B();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f11406f = T();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f11407g = S();

    /* renamed from: h, reason: collision with root package name */
    public static final long f11408h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f11409i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f11410j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f11411k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f11412l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f11413m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f11414n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f11415o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f11416p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f11417q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f11418r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f11419s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f11420t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f11421u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11422v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f11423w;

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

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j7) {
            return o0.f11423w ? o0.s(obj, j7) : o0.t(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j7) {
            return o0.f11423w ? o0.v(obj, j7) : o0.w(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j7, boolean z7) {
            if (o0.f11423w) {
                o0.I(obj, j7, z7);
            } else {
                o0.J(obj, j7, z7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j7, byte b7) {
            if (o0.f11423w) {
                o0.L(obj, j7, b7);
            } else {
                o0.M(obj, j7, b7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j7) {
            return o0.f11423w ? o0.s(obj, j7) : o0.t(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j7) {
            return o0.f11423w ? o0.v(obj, j7) : o0.w(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j7, boolean z7) {
            if (o0.f11423w) {
                o0.I(obj, j7, z7);
            } else {
                o0.J(obj, j7, z7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j7, byte b7) {
            if (o0.f11423w) {
                o0.L(obj, j7, b7);
            } else {
                o0.M(obj, j7, b7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j7) {
            return this.f11424a.getBoolean(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j7) {
            return this.f11424a.getByte(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j7) {
            return this.f11424a.getDouble(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j7) {
            return this.f11424a.getFloat(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j7, boolean z7) {
            this.f11424a.putBoolean(obj, j7, z7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j7, byte b7) {
            this.f11424a.putByte(obj, j7, b7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j7, double d7) {
            this.f11424a.putDouble(obj, j7, d7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j7, float f7) {
            this.f11424a.putFloat(obj, j7, f7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f11424a.getClass();
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
                o0.G(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f11424a.getClass();
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
                o0.G(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f11424a;

        public e(Unsafe unsafe) {
            this.f11424a = unsafe;
        }

        public final int a(Class cls) {
            return this.f11424a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f11424a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j7);

        public abstract byte d(Object obj, long j7);

        public abstract double e(Object obj, long j7);

        public abstract float f(Object obj, long j7);

        public final int g(Object obj, long j7) {
            return this.f11424a.getInt(obj, j7);
        }

        public final long h(Object obj, long j7) {
            return this.f11424a.getLong(obj, j7);
        }

        public final Object i(Object obj, long j7) {
            return this.f11424a.getObject(obj, j7);
        }

        public final long j(Field field) {
            return this.f11424a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j7, boolean z7);

        public abstract void l(Object obj, long j7, byte b7);

        public abstract void m(Object obj, long j7, double d7);

        public abstract void n(Object obj, long j7, float f7);

        public final void o(Object obj, long j7, int i7) {
            this.f11424a.putInt(obj, j7, i7);
        }

        public final void p(Object obj, long j7, long j8) {
            this.f11424a.putLong(obj, j7, j8);
        }

        public final void q(Object obj, long j7, Object obj2) {
            this.f11424a.putObject(obj, j7, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f11424a;
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
                o0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f11424a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return o0.n() != null;
            } catch (Throwable th) {
                o0.G(th);
                return false;
            }
        }
    }

    static {
        long l7 = l(byte[].class);
        f11408h = l7;
        f11409i = l(boolean[].class);
        f11410j = m(boolean[].class);
        f11411k = l(int[].class);
        f11412l = m(int[].class);
        f11413m = l(long[].class);
        f11414n = m(long[].class);
        f11415o = l(float[].class);
        f11416p = m(float[].class);
        f11417q = l(double[].class);
        f11418r = m(double[].class);
        f11419s = l(Object[].class);
        f11420t = m(Object[].class);
        f11421u = q(n());
        f11422v = (int) (l7 & 7);
        f11423w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j7) {
        return f11405e.h(obj, j7);
    }

    public static e B() {
        Unsafe unsafe = f11401a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1089d.c()) {
            return new d(unsafe);
        }
        if (f11403c) {
            return new c(unsafe);
        }
        if (f11404d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j7) {
        return f11405e.i(obj, j7);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f11407g;
    }

    public static boolean F() {
        return f11406f;
    }

    public static void G(Throwable th) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void H(Object obj, long j7, boolean z7) {
        f11405e.k(obj, j7, z7);
    }

    public static void I(Object obj, long j7, boolean z7) {
        L(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j7, boolean z7) {
        M(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j7, byte b7) {
        f11405e.l(bArr, f11408h + j7, b7);
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
        f11405e.m(obj, j7, d7);
    }

    public static void O(Object obj, long j7, float f7) {
        f11405e.n(obj, j7, f7);
    }

    public static void P(Object obj, long j7, int i7) {
        f11405e.o(obj, j7, i7);
    }

    public static void Q(Object obj, long j7, long j8) {
        f11405e.p(obj, j7, j8);
    }

    public static void R(Object obj, long j7, Object obj2) {
        f11405e.q(obj, j7, obj2);
    }

    public static boolean S() {
        e eVar = f11405e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f11405e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static Object k(Class cls) {
        try {
            return f11401a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int l(Class cls) {
        if (f11407g) {
            return f11405e.a(cls);
        }
        return -1;
    }

    public static int m(Class cls) {
        if (f11407g) {
            return f11405e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field p7;
        if (AbstractC1089d.c() && (p7 = p(Buffer.class, "effectiveDirectAddress")) != null) {
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
        if (!AbstractC1089d.c()) {
            return false;
        }
        try {
            Class cls2 = f11402b;
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
        if (field == null || (eVar = f11405e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j7) {
        return f11405e.c(obj, j7);
    }

    public static boolean s(Object obj, long j7) {
        return v(obj, j7) != 0;
    }

    public static boolean t(Object obj, long j7) {
        return w(obj, j7) != 0;
    }

    public static byte u(byte[] bArr, long j7) {
        return f11405e.d(bArr, f11408h + j7);
    }

    public static byte v(Object obj, long j7) {
        return (byte) ((z(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j7) {
        return (byte) ((z(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j7) {
        return f11405e.e(obj, j7);
    }

    public static float y(Object obj, long j7) {
        return f11405e.f(obj, j7);
    }

    public static int z(Object obj, long j7) {
        return f11405e.g(obj, j7);
    }
}

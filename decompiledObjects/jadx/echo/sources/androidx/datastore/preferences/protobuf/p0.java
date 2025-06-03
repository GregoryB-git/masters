package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f9045a = Logger.getLogger(p0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f9046b = B();

    /* renamed from: c, reason: collision with root package name */
    public static final Class f9047c = AbstractC0757d.b();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9048d = m(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9049e = m(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    public static final e f9050f = z();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f9051g = Q();

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f9052h = P();

    /* renamed from: i, reason: collision with root package name */
    public static final long f9053i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f9054j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f9055k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f9056l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f9057m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f9058n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f9059o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f9060p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f9061q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f9062r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f9063s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f9064t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f9065u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f9066v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f9067w;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f9068x;

    public static class a implements PrivilegedExceptionAction {
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

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return p0.f9068x ? p0.q(obj, j7) : p0.r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return p0.f9068x ? p0.t(obj, j7) : p0.u(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z7) {
            if (p0.f9068x) {
                p0.F(obj, j7, z7);
            } else {
                p0.G(obj, j7, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            if (p0.f9068x) {
                p0.I(obj, j7, b7);
            } else {
                p0.J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return p0.f9068x ? p0.q(obj, j7) : p0.r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return p0.f9068x ? p0.t(obj, j7) : p0.u(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z7) {
            if (p0.f9068x) {
                p0.F(obj, j7, z7);
            } else {
                p0.G(obj, j7, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            if (p0.f9068x) {
                p0.I(obj, j7, b7);
            } else {
                p0.J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            p(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            o(obj, j7, Float.floatToIntBits(f7));
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j7) {
            return this.f9069a.getBoolean(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j7) {
            return this.f9069a.getByte(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j7) {
            return this.f9069a.getDouble(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j7) {
            return this.f9069a.getFloat(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j7, boolean z7) {
            this.f9069a.putBoolean(obj, j7, z7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j7, byte b7) {
            this.f9069a.putByte(obj, j7, b7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j7, double d7) {
            this.f9069a.putDouble(obj, j7, d7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j7, float f7) {
            this.f9069a.putFloat(obj, j7, f7);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f9069a;

        public e(Unsafe unsafe) {
            this.f9069a = unsafe;
        }

        public final int a(Class cls) {
            return this.f9069a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f9069a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j7);

        public abstract byte d(Object obj, long j7);

        public abstract double e(Object obj, long j7);

        public abstract float f(Object obj, long j7);

        public final int g(Object obj, long j7) {
            return this.f9069a.getInt(obj, j7);
        }

        public final long h(Object obj, long j7) {
            return this.f9069a.getLong(obj, j7);
        }

        public final Object i(Object obj, long j7) {
            return this.f9069a.getObject(obj, j7);
        }

        public final long j(Field field) {
            return this.f9069a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j7, boolean z7);

        public abstract void l(Object obj, long j7, byte b7);

        public abstract void m(Object obj, long j7, double d7);

        public abstract void n(Object obj, long j7, float f7);

        public final void o(Object obj, long j7, int i7) {
            this.f9069a.putInt(obj, j7, i7);
        }

        public final void p(Object obj, long j7, long j8) {
            this.f9069a.putLong(obj, j7, j8);
        }

        public final void q(Object obj, long j7, Object obj2) {
            this.f9069a.putObject(obj, j7, obj2);
        }
    }

    static {
        long j7 = j(byte[].class);
        f9053i = j7;
        f9054j = j(boolean[].class);
        f9055k = k(boolean[].class);
        f9056l = j(int[].class);
        f9057m = k(int[].class);
        f9058n = j(long[].class);
        f9059o = k(long[].class);
        f9060p = j(float[].class);
        f9061q = k(float[].class);
        f9062r = j(double[].class);
        f9063s = k(double[].class);
        f9064t = j(Object[].class);
        f9065u = k(Object[].class);
        f9066v = o(l());
        f9067w = (int) (j7 & 7);
        f9068x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object A(Object obj, long j7) {
        return f9050f.i(obj, j7);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C() {
        return f9052h;
    }

    public static boolean D() {
        return f9051g;
    }

    public static void E(Object obj, long j7, boolean z7) {
        f9050f.k(obj, j7, z7);
    }

    public static void F(Object obj, long j7, boolean z7) {
        I(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j7, boolean z7) {
        J(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j7, byte b7) {
        f9050f.l(bArr, f9053i + j7, b7);
    }

    public static void I(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int x7 = x(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        M(obj, j8, ((255 & b7) << i7) | (x7 & (~(255 << i7))));
    }

    public static void J(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        M(obj, j8, ((255 & b7) << i7) | (x(obj, j8) & (~(255 << i7))));
    }

    public static void K(Object obj, long j7, double d7) {
        f9050f.m(obj, j7, d7);
    }

    public static void L(Object obj, long j7, float f7) {
        f9050f.n(obj, j7, f7);
    }

    public static void M(Object obj, long j7, int i7) {
        f9050f.o(obj, j7, i7);
    }

    public static void N(Object obj, long j7, long j8) {
        f9050f.p(obj, j7, j8);
    }

    public static void O(Object obj, long j7, Object obj2) {
        f9050f.q(obj, j7, obj2);
    }

    public static boolean P() {
        Unsafe unsafe = f9046b;
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
            if (AbstractC0757d.c()) {
                return true;
            }
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
            f9045a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean Q() {
        Unsafe unsafe = f9046b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (AbstractC0757d.c()) {
                return true;
            }
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
            f9045a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static Object i(Class cls) {
        try {
            return f9046b.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int j(Class cls) {
        if (f9052h) {
            return f9050f.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f9052h) {
            return f9050f.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n7;
        if (AbstractC0757d.c() && (n7 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n7;
        }
        Field n8 = n(Buffer.class, "address");
        if (n8 == null || n8.getType() != Long.TYPE) {
            return null;
        }
        return n8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        if (!AbstractC0757d.c()) {
            return false;
        }
        try {
            Class cls2 = f9047c;
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

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f9050f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean p(Object obj, long j7) {
        return f9050f.c(obj, j7);
    }

    public static boolean q(Object obj, long j7) {
        return t(obj, j7) != 0;
    }

    public static boolean r(Object obj, long j7) {
        return u(obj, j7) != 0;
    }

    public static byte s(byte[] bArr, long j7) {
        return f9050f.d(bArr, f9053i + j7);
    }

    public static byte t(Object obj, long j7) {
        return (byte) ((x(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte u(Object obj, long j7) {
        return (byte) ((x(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static double v(Object obj, long j7) {
        return f9050f.e(obj, j7);
    }

    public static float w(Object obj, long j7) {
        return f9050f.f(obj, j7);
    }

    public static int x(Object obj, long j7) {
        return f9050f.g(obj, j7);
    }

    public static long y(Object obj, long j7) {
        return f9050f.h(obj, j7);
    }

    public static e z() {
        Unsafe unsafe = f9046b;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0757d.c()) {
            return new d(unsafe);
        }
        if (f9048d) {
            return new c(unsafe);
        }
        if (f9049e) {
            return new b(unsafe);
        }
        return null;
    }
}

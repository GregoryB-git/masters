package ma;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11084a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f11085b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f11086c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11087d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11088e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f11089g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f11090h;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ma.t1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // ma.t1.e
        public final boolean d(Object obj, long j10) {
            return t1.f11090h ? t1.j(obj, j10) != 0 : t1.k(obj, j10) != 0;
        }

        @Override // ma.t1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // ma.t1.e
        public final byte f(Object obj, long j10) {
            return t1.f11090h ? t1.j(obj, j10) : t1.k(obj, j10);
        }

        @Override // ma.t1.e
        public final double g(Object obj, long j10) {
            return Double.longBitsToDouble(j(obj, j10));
        }

        @Override // ma.t1.e
        public final float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // ma.t1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (t1.f11090h) {
                t1.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                t1.u(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // ma.t1.e
        public final void n(Object obj, long j10, byte b10) {
            if (t1.f11090h) {
                t1.t(obj, j10, b10);
            } else {
                t1.u(obj, j10, b10);
            }
        }

        @Override // ma.t1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // ma.t1.e
        public final void p(Object obj, long j10, float f) {
            q(obj, Float.floatToIntBits(f), j10);
        }

        @Override // ma.t1.e
        public final boolean u() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ma.t1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // ma.t1.e
        public final boolean d(Object obj, long j10) {
            return t1.f11090h ? t1.j(obj, j10) != 0 : t1.k(obj, j10) != 0;
        }

        @Override // ma.t1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // ma.t1.e
        public final byte f(Object obj, long j10) {
            return t1.f11090h ? t1.j(obj, j10) : t1.k(obj, j10);
        }

        @Override // ma.t1.e
        public final double g(Object obj, long j10) {
            return Double.longBitsToDouble(j(obj, j10));
        }

        @Override // ma.t1.e
        public final float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // ma.t1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (t1.f11090h) {
                t1.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                t1.u(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // ma.t1.e
        public final void n(Object obj, long j10, byte b10) {
            if (t1.f11090h) {
                t1.t(obj, j10, b10);
            } else {
                t1.u(obj, j10, b10);
            }
        }

        @Override // ma.t1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // ma.t1.e
        public final void p(Object obj, long j10, float f) {
            q(obj, Float.floatToIntBits(f), j10);
        }

        @Override // ma.t1.e
        public final boolean u() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // ma.t1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            this.f11091a.copyMemory((Object) null, j10, bArr, t1.f + j11, j12);
        }

        @Override // ma.t1.e
        public final boolean d(Object obj, long j10) {
            return this.f11091a.getBoolean(obj, j10);
        }

        @Override // ma.t1.e
        public final byte e(long j10) {
            return this.f11091a.getByte(j10);
        }

        @Override // ma.t1.e
        public final byte f(Object obj, long j10) {
            return this.f11091a.getByte(obj, j10);
        }

        @Override // ma.t1.e
        public final double g(Object obj, long j10) {
            return this.f11091a.getDouble(obj, j10);
        }

        @Override // ma.t1.e
        public final float h(Object obj, long j10) {
            return this.f11091a.getFloat(obj, j10);
        }

        @Override // ma.t1.e
        public final void m(Object obj, long j10, boolean z10) {
            this.f11091a.putBoolean(obj, j10, z10);
        }

        @Override // ma.t1.e
        public final void n(Object obj, long j10, byte b10) {
            this.f11091a.putByte(obj, j10, b10);
        }

        @Override // ma.t1.e
        public final void o(Object obj, long j10, double d10) {
            this.f11091a.putDouble(obj, j10, d10);
        }

        @Override // ma.t1.e
        public final void p(Object obj, long j10, float f) {
            this.f11091a.putFloat(obj, j10, f);
        }

        @Override // ma.t1.e
        public final boolean t() {
            if (!super.t()) {
                return false;
            }
            try {
                Class<?> cls = this.f11091a.getClass();
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
                t1.a(th);
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // ma.t1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean u() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.f11091a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto Lf
            Ld:
                r2 = r6
                goto L37
            Lf:
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r6] = r9     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L32
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
                r7[r6] = r1     // Catch: java.lang.Throwable -> L32
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
                r7[r5] = r8     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r2 = ma.t1.e()     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L30
                goto Ld
            L30:
                r2 = r5
                goto L37
            L32:
                r2 = move-exception
                ma.t1.a(r2)
                goto Ld
            L37:
                if (r2 != 0) goto L3a
                return r6
            L3a:
                sun.misc.Unsafe r2 = r11.f11091a     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r3 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                r3 = 3
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r3] = r9     // Catch: java.lang.Throwable -> L9e
                r1 = 4
                r7[r1] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                return r5
            L9e:
                r0 = move-exception
                ma.t1.a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.t1.d.u():boolean");
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f11091a;

        public e(Unsafe unsafe) {
            this.f11091a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f11091a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f11091a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f11091a.getInt(obj, j10);
        }

        public final long j(Object obj, long j10) {
            return this.f11091a.getLong(obj, j10);
        }

        public final Object k(Object obj, long j10) {
            return this.f11091a.getObject(obj, j10);
        }

        public final long l(Field field) {
            return this.f11091a.objectFieldOffset(field);
        }

        public abstract void m(Object obj, long j10, boolean z10);

        public abstract void n(Object obj, long j10, byte b10);

        public abstract void o(Object obj, long j10, double d10);

        public abstract void p(Object obj, long j10, float f);

        public final void q(Object obj, int i10, long j10) {
            this.f11091a.putInt(obj, j10, i10);
        }

        public final void r(Object obj, long j10, long j11) {
            this.f11091a.putLong(obj, j10, j11);
        }

        public final void s(Object obj, long j10, Object obj2) {
            this.f11091a.putObject(obj, j10, obj2);
        }

        public boolean t() {
            Unsafe unsafe = this.f11091a;
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
                t1.a(th);
                return false;
            }
        }

        public abstract boolean u();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = q()
            ma.t1.f11084a = r6
            java.lang.Class<?> r7 = ma.d.f10928a
            ma.t1.f11085b = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = f(r7)
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = f(r8)
            if (r6 != 0) goto L25
            goto L3b
        L25:
            boolean r9 = ma.d.a()
            if (r9 == 0) goto L3d
            if (r7 == 0) goto L33
            ma.t1$c r7 = new ma.t1$c
            r7.<init>(r6)
            goto L42
        L33:
            if (r8 == 0) goto L3b
            ma.t1$b r7 = new ma.t1$b
            r7.<init>(r6)
            goto L42
        L3b:
            r7 = 0
            goto L42
        L3d:
            ma.t1$d r7 = new ma.t1$d
            r7.<init>(r6)
        L42:
            ma.t1.f11086c = r7
            r6 = 0
            if (r7 != 0) goto L49
            r8 = r6
            goto L4d
        L49:
            boolean r8 = r7.u()
        L4d:
            ma.t1.f11087d = r8
            if (r7 != 0) goto L53
            r8 = r6
            goto L57
        L53:
            boolean r8 = r7.t()
        L57:
            ma.t1.f11088e = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = c(r8)
            long r8 = (long) r8
            ma.t1.f = r8
            c(r5)
            d(r5)
            c(r4)
            d(r4)
            c(r3)
            d(r3)
            c(r2)
            d(r2)
            c(r1)
            d(r1)
            c(r0)
            d(r0)
            java.lang.reflect.Field r0 = e()
            if (r0 == 0) goto L94
            if (r7 != 0) goto L8f
            goto L94
        L8f:
            long r0 = r7.l(r0)
            goto L96
        L94:
            r0 = -1
        L96:
            ma.t1.f11089g = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto La1
            r6 = 1
        La1:
            ma.t1.f11090h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.t1.<clinit>():void");
    }

    public static void a(Throwable th) {
        Logger.getLogger(t1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f11084a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f11088e) {
            return f11086c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f11088e) {
            f11086c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (ma.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class<?> cls) {
        if (!ma.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f11085b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static boolean g(Object obj, long j10) {
        return f11086c.d(obj, j10);
    }

    public static byte h(long j10) {
        return f11086c.e(j10);
    }

    public static byte i(byte[] bArr, long j10) {
        return f11086c.f(bArr, f + j10);
    }

    public static byte j(Object obj, long j10) {
        return (byte) ((n(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte k(Object obj, long j10) {
        return (byte) ((n(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double l(Object obj, long j10) {
        return f11086c.g(obj, j10);
    }

    public static float m(Object obj, long j10) {
        return f11086c.h(obj, j10);
    }

    public static int n(Object obj, long j10) {
        return f11086c.i(obj, j10);
    }

    public static long o(Object obj, long j10) {
        return f11086c.j(obj, j10);
    }

    public static Object p(Object obj, long j10) {
        return f11086c.k(obj, j10);
    }

    public static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r(Object obj, long j10, boolean z10) {
        f11086c.m(obj, j10, z10);
    }

    public static void s(byte[] bArr, long j10, byte b10) {
        f11086c.n(bArr, f + j10, b10);
    }

    public static void t(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int n2 = n(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        x(obj, ((255 & b10) << i10) | (n2 & (~(255 << i10))), j11);
    }

    public static void u(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        x(obj, ((255 & b10) << i10) | (n(obj, j11) & (~(255 << i10))), j11);
    }

    public static void v(Object obj, long j10, double d10) {
        f11086c.o(obj, j10, d10);
    }

    public static void w(Object obj, long j10, float f10) {
        f11086c.p(obj, j10, f10);
    }

    public static void x(Object obj, int i10, long j10) {
        f11086c.q(obj, i10, j10);
    }

    public static void y(Object obj, long j10, long j11) {
        f11086c.r(obj, j10, j11);
    }

    public static void z(Object obj, long j10, Object obj2) {
        f11086c.s(obj, j10, obj2);
    }
}

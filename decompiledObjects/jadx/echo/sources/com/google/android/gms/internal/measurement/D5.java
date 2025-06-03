package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class D5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f10335a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f10336b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f10337c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10338d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f10339e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f10340f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f10341g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f10342h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f10343i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f10344j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f10345k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f10346l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f10347m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f10348n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f10349o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f10350p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f10351q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f10352r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f10353s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f10354t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f10355u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f10356v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f10357w;

    public static final class a extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final double a(Object obj, long j7) {
            return Double.longBitsToDouble(m(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void b(Object obj, long j7, byte b7) {
            if (D5.f10357w) {
                D5.u(obj, j7, b7);
            } else {
                D5.y(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void c(Object obj, long j7, double d7) {
            f(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void d(Object obj, long j7, float f7) {
            e(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void g(Object obj, long j7, boolean z7) {
            if (D5.f10357w) {
                D5.k(obj, j7, z7);
            } else {
                D5.r(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final float i(Object obj, long j7) {
            return Float.intBitsToFloat(l(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final boolean k(Object obj, long j7) {
            return D5.f10357w ? D5.D(obj, j7) : D5.E(obj, j7);
        }
    }

    public static final class b extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final double a(Object obj, long j7) {
            return Double.longBitsToDouble(m(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void b(Object obj, long j7, byte b7) {
            if (D5.f10357w) {
                D5.u(obj, j7, b7);
            } else {
                D5.y(obj, j7, b7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void c(Object obj, long j7, double d7) {
            f(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void d(Object obj, long j7, float f7) {
            e(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final void g(Object obj, long j7, boolean z7) {
            if (D5.f10357w) {
                D5.k(obj, j7, z7);
            } else {
                D5.r(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final float i(Object obj, long j7) {
            return Float.intBitsToFloat(l(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.D5.c
        public final boolean k(Object obj, long j7) {
            return D5.f10357w ? D5.D(obj, j7) : D5.E(obj, j7);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f10358a;

        public c(Unsafe unsafe) {
            this.f10358a = unsafe;
        }

        public abstract double a(Object obj, long j7);

        public abstract void b(Object obj, long j7, byte b7);

        public abstract void c(Object obj, long j7, double d7);

        public abstract void d(Object obj, long j7, float f7);

        public final void e(Object obj, long j7, int i7) {
            this.f10358a.putInt(obj, j7, i7);
        }

        public final void f(Object obj, long j7, long j8) {
            this.f10358a.putLong(obj, j7, j8);
        }

        public abstract void g(Object obj, long j7, boolean z7);

        public final boolean h() {
            Unsafe unsafe = this.f10358a;
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
                D5.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j7);

        public final boolean j() {
            Unsafe unsafe = this.f10358a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return D5.C() != null;
            } catch (Throwable th) {
                D5.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j7);

        public final int l(Object obj, long j7) {
            return this.f10358a.getInt(obj, j7);
        }

        public final long m(Object obj, long j7) {
            return this.f10358a.getLong(obj, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            com.google.android.gms.internal.measurement.D5.f10335a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.AbstractC0985o3.a()
            com.google.android.gms.internal.measurement.D5.f10336b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            com.google.android.gms.internal.measurement.D5.f10337c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            com.google.android.gms.internal.measurement.D5.f10338d = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.D5$a r1 = new com.google.android.gms.internal.measurement.D5$a
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.D5$b r1 = new com.google.android.gms.internal.measurement.D5$b
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.D5.f10339e = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.j()
        L3a:
            com.google.android.gms.internal.measurement.D5.f10340f = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.h()
        L44:
            com.google.android.gms.internal.measurement.D5.f10341g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.D5.f10342h = r2
            java.lang.Class<boolean[]> r4 = boolean[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10343i = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10344j = r4
            java.lang.Class<int[]> r4 = int[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10345k = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10346l = r4
            java.lang.Class<long[]> r4 = long[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10347m = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10348n = r4
            java.lang.Class<float[]> r4 = float[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10349o = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10350p = r4
            java.lang.Class<double[]> r4 = double[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10351q = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10352r = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            int r5 = o(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.measurement.D5.f10353s = r5
            int r4 = s(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.D5.f10354t = r4
            java.lang.reflect.Field r4 = C()
            if (r4 == 0) goto Lbf
            if (r1 != 0) goto Lb8
            goto Lbf
        Lb8:
            sun.misc.Unsafe r1 = r1.f10358a
            long r4 = r1.objectFieldOffset(r4)
            goto Lc1
        Lbf:
            r4 = -1
        Lc1:
            com.google.android.gms.internal.measurement.D5.f10355u = r4
            r4 = 7
            long r1 = r2 & r4
            int r1 = (int) r1
            com.google.android.gms.internal.measurement.D5.f10356v = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Ld3
            r0 = 1
        Ld3:
            com.google.android.gms.internal.measurement.D5.f10357w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D5.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A(Class cls) {
        try {
            Class cls2 = f10336b;
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

    public static Object B(Object obj, long j7) {
        return f10339e.f10358a.getObject(obj, j7);
    }

    public static Field C() {
        Field d7 = d(Buffer.class, "effectiveDirectAddress");
        if (d7 != null) {
            return d7;
        }
        Field d8 = d(Buffer.class, "address");
        if (d8 == null || d8.getType() != Long.TYPE) {
            return null;
        }
        return d8;
    }

    public static /* synthetic */ boolean D(Object obj, long j7) {
        return ((byte) (t(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean E(Object obj, long j7) {
        return ((byte) (t(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3)))) != 0;
    }

    public static boolean F(Object obj, long j7) {
        return f10339e.k(obj, j7);
    }

    public static double a(Object obj, long j7) {
        return f10339e.a(obj, j7);
    }

    public static Object b(Class cls) {
        try {
            return f10335a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(Object obj, long j7, double d7) {
        f10339e.c(obj, j7, d7);
    }

    public static void g(Object obj, long j7, float f7) {
        f10339e.d(obj, j7, f7);
    }

    public static void h(Object obj, long j7, int i7) {
        f10339e.e(obj, j7, i7);
    }

    public static void i(Object obj, long j7, long j8) {
        f10339e.f(obj, j7, j8);
    }

    public static void j(Object obj, long j7, Object obj2) {
        f10339e.f10358a.putObject(obj, j7, obj2);
    }

    public static /* synthetic */ void k(Object obj, long j7, boolean z7) {
        u(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(D5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    public static void m(byte[] bArr, long j7, byte b7) {
        f10339e.b(bArr, f10342h + j7, b7);
    }

    public static float n(Object obj, long j7) {
        return f10339e.i(obj, j7);
    }

    public static int o(Class cls) {
        if (f10341g) {
            return f10339e.f10358a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void r(Object obj, long j7, boolean z7) {
        y(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    public static int s(Class cls) {
        if (f10341g) {
            return f10339e.f10358a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int t(Object obj, long j7) {
        return f10339e.l(obj, j7);
    }

    public static void u(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int t7 = t(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        h(obj, j8, ((255 & b7) << i7) | (t7 & (~(255 << i7))));
    }

    public static void v(Object obj, long j7, boolean z7) {
        f10339e.g(obj, j7, z7);
    }

    public static boolean w() {
        return f10341g;
    }

    public static long x(Object obj, long j7) {
        return f10339e.m(obj, j7);
    }

    public static void y(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        h(obj, j8, ((255 & b7) << i7) | (t(obj, j8) & (~(255 << i7))));
    }

    public static boolean z() {
        return f10340f;
    }
}

package s0;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14040a = Logger.getLogger(l1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f14041b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f14042c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f14043d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f14044e;
    public static final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14045g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f14046h;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
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

        @Override // s0.l1.e
        public final boolean c(Object obj, long j10) {
            return l1.f14046h ? l1.h(obj, j10) != 0 : l1.i(obj, j10) != 0;
        }

        @Override // s0.l1.e
        public final byte d(Object obj, long j10) {
            return l1.f14046h ? l1.h(obj, j10) : l1.i(obj, j10);
        }

        @Override // s0.l1.e
        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // s0.l1.e
        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // s0.l1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (l1.f14046h) {
                l1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                l1.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // s0.l1.e
        public final void l(Object obj, long j10, byte b10) {
            if (l1.f14046h) {
                l1.q(obj, j10, b10);
            } else {
                l1.r(obj, j10, b10);
            }
        }

        @Override // s0.l1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // s0.l1.e
        public final void n(Object obj, long j10, float f) {
            o(obj, Float.floatToIntBits(f), j10);
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // s0.l1.e
        public final boolean c(Object obj, long j10) {
            return l1.f14046h ? l1.h(obj, j10) != 0 : l1.i(obj, j10) != 0;
        }

        @Override // s0.l1.e
        public final byte d(Object obj, long j10) {
            return l1.f14046h ? l1.h(obj, j10) : l1.i(obj, j10);
        }

        @Override // s0.l1.e
        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // s0.l1.e
        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // s0.l1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (l1.f14046h) {
                l1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                l1.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // s0.l1.e
        public final void l(Object obj, long j10, byte b10) {
            if (l1.f14046h) {
                l1.q(obj, j10, b10);
            } else {
                l1.r(obj, j10, b10);
            }
        }

        @Override // s0.l1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // s0.l1.e
        public final void n(Object obj, long j10, float f) {
            o(obj, Float.floatToIntBits(f), j10);
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // s0.l1.e
        public final boolean c(Object obj, long j10) {
            return this.f14047a.getBoolean(obj, j10);
        }

        @Override // s0.l1.e
        public final byte d(Object obj, long j10) {
            return this.f14047a.getByte(obj, j10);
        }

        @Override // s0.l1.e
        public final double e(Object obj, long j10) {
            return this.f14047a.getDouble(obj, j10);
        }

        @Override // s0.l1.e
        public final float f(Object obj, long j10) {
            return this.f14047a.getFloat(obj, j10);
        }

        @Override // s0.l1.e
        public final void k(Object obj, long j10, boolean z10) {
            this.f14047a.putBoolean(obj, j10, z10);
        }

        @Override // s0.l1.e
        public final void l(Object obj, long j10, byte b10) {
            this.f14047a.putByte(obj, j10, b10);
        }

        @Override // s0.l1.e
        public final void m(Object obj, long j10, double d10) {
            this.f14047a.putDouble(obj, j10, d10);
        }

        @Override // s0.l1.e
        public final void n(Object obj, long j10, float f) {
            this.f14047a.putFloat(obj, j10, f);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f14047a;

        public e(Unsafe unsafe) {
            this.f14047a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f14047a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f14047a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f14047a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f14047a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f14047a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f14047a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f);

        public final void o(Object obj, int i10, long j10) {
            this.f14047a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f14047a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f14047a.putObject(obj, j10, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    static {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.l1.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f14041b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class<?> cls) {
        if (f) {
            return f14043d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            f14043d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (s0.d.a()) {
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

    public static boolean e(Class<?> cls) {
        if (!s0.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f14042c;
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

    public static boolean f(Object obj, long j10) {
        return f14043d.c(obj, j10);
    }

    public static byte g(byte[] bArr, long j10) {
        return f14043d.d(bArr, f14045g + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((l(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((l(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double j(Object obj, long j10) {
        return f14043d.e(obj, j10);
    }

    public static float k(Object obj, long j10) {
        return f14043d.f(obj, j10);
    }

    public static int l(Object obj, long j10) {
        return f14043d.g(obj, j10);
    }

    public static long m(Object obj, long j10) {
        return f14043d.h(obj, j10);
    }

    public static Object n(Object obj, long j10) {
        return f14043d.i(obj, j10);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(byte[] bArr, long j10, byte b10) {
        f14043d.l(bArr, f14045g + j10, b10);
    }

    public static void q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int l10 = l(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        s(obj, ((255 & b10) << i10) | (l10 & (~(255 << i10))), j11);
    }

    public static void r(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        s(obj, ((255 & b10) << i10) | (l(obj, j11) & (~(255 << i10))), j11);
    }

    public static void s(Object obj, int i10, long j10) {
        f14043d.o(obj, i10, j10);
    }

    public static void t(Object obj, long j10, long j11) {
        f14043d.p(obj, j10, j11);
    }

    public static void u(Object obj, long j10, Object obj2) {
        f14043d.q(obj, j10, obj2);
    }
}

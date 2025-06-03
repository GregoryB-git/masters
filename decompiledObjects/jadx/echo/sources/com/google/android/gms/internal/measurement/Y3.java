package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class Y3 extends AbstractC0940j3 {
    private static Map<Object, Y3> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected C1049v5 zzb = C1049v5.k();

    public static class a extends AbstractC0967m3 {

        /* renamed from: b, reason: collision with root package name */
        public final Y3 f10719b;

        public a(Y3 y32) {
            this.f10719b = y32;
        }
    }

    public static abstract class b extends AbstractC0949k3 {

        /* renamed from: o, reason: collision with root package name */
        public final Y3 f10720o;

        /* renamed from: p, reason: collision with root package name */
        public Y3 f10721p;

        public b(Y3 y32) {
            this.f10720o = y32;
            if (y32.F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f10721p = y32.y();
        }

        public static void n(Object obj, Object obj2) {
            U4.a().c(obj).d(obj, obj2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC0949k3
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f10720o.p(c.f10726e, null, null);
            bVar.f10721p = (Y3) i();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC0949k3
        public final /* synthetic */ AbstractC0949k3 g(byte[] bArr, int i7, int i8) {
            return u(bArr, 0, i8, M3.f10490c);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC0949k3
        public final /* synthetic */ AbstractC0949k3 j(byte[] bArr, int i7, int i8, M3 m32) {
            return u(bArr, 0, i8, m32);
        }

        public final b l(Y3 y32) {
            if (this.f10720o.equals(y32)) {
                return this;
            }
            if (!this.f10721p.F()) {
                t();
            }
            n(this.f10721p, y32);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.L4
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Y3 i() {
            if (!this.f10721p.F()) {
                return this.f10721p;
            }
            this.f10721p.C();
            return this.f10721p;
        }

        public final void s() {
            if (this.f10721p.F()) {
                return;
            }
            t();
        }

        public void t() {
            Y3 y7 = this.f10720o.y();
            n(y7, this.f10721p);
            this.f10721p = y7;
        }

        public final b u(byte[] bArr, int i7, int i8, M3 m32) {
            if (!this.f10721p.F()) {
                t();
            }
            try {
                U4.a().c(this.f10721p).g(this.f10721p, bArr, 0, i8, new C0994p3(m32));
                return this;
            } catch (C0950k4 e7) {
                throw e7;
            } catch (IOException e8) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
            } catch (IndexOutOfBoundsException unused) {
                throw C0950k4.f();
            }
        }

        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Y3 p() {
            Y3 y32 = (Y3) i();
            if (y32.E()) {
                return y32;
            }
            throw new C1031t5(y32);
        }
    }

    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10722a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10723b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10724c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10725d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10726e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10727f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10728g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f10729h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f10729h.clone();
        }
    }

    public static class d extends N3 {
    }

    public static InterfaceC0932i4 A() {
        return C1057w4.f();
    }

    public static InterfaceC0923h4 B() {
        return Y4.g();
    }

    private final int k() {
        return U4.a().c(this).f(this);
    }

    public static Y3 l(Class cls) {
        Y3 y32 = zzc.get(cls);
        if (y32 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                y32 = zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (y32 == null) {
            y32 = (Y3) ((Y3) D5.b(cls)).p(c.f10727f, null, null);
            if (y32 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, y32);
        }
        return y32;
    }

    public static InterfaceC0923h4 n(InterfaceC0923h4 interfaceC0923h4) {
        int size = interfaceC0923h4.size();
        return interfaceC0923h4.e(size == 0 ? 10 : size << 1);
    }

    public static InterfaceC0932i4 o(InterfaceC0932i4 interfaceC0932i4) {
        int size = interfaceC0932i4.size();
        return interfaceC0932i4.e(size == 0 ? 10 : size << 1);
    }

    public static Object q(I4 i42, String str, Object[] objArr) {
        return new W4(i42, str, objArr);
    }

    public static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void t(Class cls, Y3 y32) {
        y32.D();
        zzc.put(cls, y32);
    }

    public static final boolean u(Y3 y32, boolean z7) {
        byte byteValue = ((Byte) y32.p(c.f10722a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c7 = U4.a().c(y32).c(y32);
        if (z7) {
            y32.p(c.f10723b, c7 ? y32 : null, null);
        }
        return c7;
    }

    public static InterfaceC0905f4 z() {
        return C0878c4.f();
    }

    public final void C() {
        U4.a().c(this).e(this);
        D();
    }

    public final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean E() {
        return u(this, true);
    }

    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final int a() {
        return c(null);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final /* synthetic */ I4 b() {
        return (Y3) p(c.f10727f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0940j3
    public final int c(Z4 z42) {
        if (!F()) {
            if (g() != Integer.MAX_VALUE) {
                return g();
            }
            int v7 = v(z42);
            j(v7);
            return v7;
        }
        int v8 = v(z42);
        if (v8 >= 0) {
            return v8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + v8);
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final /* synthetic */ L4 d() {
        return (b) p(c.f10726e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return U4.a().c(this).h(this, (Y3) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final void f(J3 j32) {
        U4.a().c(this).i(this, L3.P(j32));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0940j3
    public final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public int hashCode() {
        if (F()) {
            return k();
        }
        if (this.zza == 0) {
            this.zza = k();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0940j3
    public final void j(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    public abstract Object p(int i7, Object obj, Object obj2);

    public String toString() {
        return N4.a(this, super.toString());
    }

    public final int v(Z4 z42) {
        return z42 == null ? U4.a().c(this).b(this) : z42.b(this);
    }

    public final b w() {
        return (b) p(c.f10726e, null, null);
    }

    public final b x() {
        return ((b) p(c.f10726e, null, null)).l(this);
    }

    public final Y3 y() {
        return (Y3) p(c.f10725d, null, null);
    }
}

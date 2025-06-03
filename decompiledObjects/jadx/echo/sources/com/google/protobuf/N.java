package com.google.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class N implements Z {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f11978r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f11979s = k0.D();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11980a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11982c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11983d;

    /* renamed from: e, reason: collision with root package name */
    public final K f11984e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11985f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11986g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11987h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11988i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f11989j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11990k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11991l;

    /* renamed from: m, reason: collision with root package name */
    public final P f11992m;

    /* renamed from: n, reason: collision with root package name */
    public final A f11993n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f11994o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1147l f11995p;

    /* renamed from: q, reason: collision with root package name */
    public final F f11996q;

    public N(int[] iArr, Object[] objArr, int i7, int i8, K k7, boolean z7, boolean z8, int[] iArr2, int i9, int i10, P p7, A a7, g0 g0Var, AbstractC1147l abstractC1147l, F f7) {
        this.f11980a = iArr;
        this.f11981b = objArr;
        this.f11982c = i7;
        this.f11983d = i8;
        this.f11986g = k7 instanceof r;
        this.f11987h = z7;
        this.f11985f = abstractC1147l != null && abstractC1147l.d(k7);
        this.f11988i = z8;
        this.f11989j = iArr2;
        this.f11990k = i9;
        this.f11991l = i10;
        this.f11992m = p7;
        this.f11993n = a7;
        this.f11994o = g0Var;
        this.f11995p = abstractC1147l;
        this.f11984e = k7;
        this.f11996q = f7;
    }

    public static boolean C(int i7) {
        return (i7 & 268435456) != 0;
    }

    public static List D(Object obj, long j7) {
        return (List) k0.C(obj, j7);
    }

    public static long E(Object obj, long j7) {
        return k0.A(obj, j7);
    }

    public static N I(Class cls, I i7, P p7, A a7, g0 g0Var, AbstractC1147l abstractC1147l, F f7) {
        if (i7 instanceof Y) {
            return K((Y) i7, p7, a7, g0Var, abstractC1147l, f7);
        }
        android.support.v4.media.a.a(i7);
        return J(null, p7, a7, g0Var, abstractC1147l, f7);
    }

    public static N J(d0 d0Var, P p7, A a7, g0 g0Var, AbstractC1147l abstractC1147l, F f7) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.N K(com.google.protobuf.Y r33, com.google.protobuf.P r34, com.google.protobuf.A r35, com.google.protobuf.g0 r36, com.google.protobuf.AbstractC1147l r37, com.google.protobuf.F r38) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.K(com.google.protobuf.Y, com.google.protobuf.P, com.google.protobuf.A, com.google.protobuf.g0, com.google.protobuf.l, com.google.protobuf.F):com.google.protobuf.N");
    }

    public static long M(int i7) {
        return i7 & 1048575;
    }

    public static boolean N(Object obj, long j7) {
        return ((Boolean) k0.C(obj, j7)).booleanValue();
    }

    public static double O(Object obj, long j7) {
        return ((Double) k0.C(obj, j7)).doubleValue();
    }

    public static float P(Object obj, long j7) {
        return ((Float) k0.C(obj, j7)).floatValue();
    }

    public static int Q(Object obj, long j7) {
        return ((Integer) k0.C(obj, j7)).intValue();
    }

    public static long R(Object obj, long j7) {
        return ((Long) k0.C(obj, j7)).longValue();
    }

    public static Field T(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int W(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean j(Object obj, long j7) {
        return k0.r(obj, j7);
    }

    public static void k(Object obj) {
        if (z(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double l(Object obj, long j7) {
        return k0.x(obj, j7);
    }

    public static float n(Object obj, long j7) {
        return k0.y(obj, j7);
    }

    public static int t(Object obj, long j7) {
        return k0.z(obj, j7);
    }

    public static boolean w(Object obj, int i7, Z z7) {
        return z7.c(k0.C(obj, M(i7)));
    }

    public static boolean z(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r) {
            return ((r) obj).I();
        }
        return true;
    }

    public final boolean A(Object obj, Object obj2, int i7) {
        long S6 = S(i7) & 1048575;
        return k0.z(obj, S6) == k0.z(obj2, S6);
    }

    public final boolean B(Object obj, int i7, int i8) {
        return k0.z(obj, (long) (S(i8) & 1048575)) == i7;
    }

    public final void F(Object obj, Object obj2, int i7) {
        if (u(obj2, i7)) {
            long M6 = M(X(i7));
            Unsafe unsafe = f11979s;
            Object object = unsafe.getObject(obj2, M6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + L(i7) + " is present but null: " + obj2);
            }
            Z p7 = p(i7);
            if (!u(obj, i7)) {
                if (z(object)) {
                    Object f7 = p7.f();
                    p7.a(f7, object);
                    unsafe.putObject(obj, M6, f7);
                } else {
                    unsafe.putObject(obj, M6, object);
                }
                U(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, M6);
            if (!z(object2)) {
                Object f8 = p7.f();
                p7.a(f8, object2);
                unsafe.putObject(obj, M6, f8);
                object2 = f8;
            }
            p7.a(object2, object);
        }
    }

    public final void G(Object obj, Object obj2, int i7) {
        int L6 = L(i7);
        if (B(obj2, L6, i7)) {
            long M6 = M(X(i7));
            Unsafe unsafe = f11979s;
            Object object = unsafe.getObject(obj2, M6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + L(i7) + " is present but null: " + obj2);
            }
            Z p7 = p(i7);
            if (!B(obj, L6, i7)) {
                if (z(object)) {
                    Object f7 = p7.f();
                    p7.a(f7, object);
                    unsafe.putObject(obj, M6, f7);
                } else {
                    unsafe.putObject(obj, M6, object);
                }
                V(obj, L6, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, M6);
            if (!z(object2)) {
                Object f8 = p7.f();
                p7.a(f8, object2);
                unsafe.putObject(obj, M6, f8);
                object2 = f8;
            }
            p7.a(object2, object);
        }
    }

    public final void H(Object obj, Object obj2, int i7) {
        int X6 = X(i7);
        long M6 = M(X6);
        int L6 = L(i7);
        switch (W(X6)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (u(obj2, i7)) {
                    k0.N(obj, M6, k0.x(obj2, M6));
                    U(obj, i7);
                    break;
                }
                break;
            case 1:
                if (u(obj2, i7)) {
                    k0.O(obj, M6, k0.y(obj2, M6));
                    U(obj, i7);
                    break;
                }
                break;
            case 2:
                if (!u(obj2, i7)) {
                }
                k0.Q(obj, M6, k0.A(obj2, M6));
                U(obj, i7);
                break;
            case 3:
                if (!u(obj2, i7)) {
                }
                k0.Q(obj, M6, k0.A(obj2, M6));
                U(obj, i7);
                break;
            case 4:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case 5:
                if (!u(obj2, i7)) {
                }
                k0.Q(obj, M6, k0.A(obj2, M6));
                U(obj, i7);
                break;
            case 6:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case 7:
                if (u(obj2, i7)) {
                    k0.H(obj, M6, k0.r(obj2, M6));
                    U(obj, i7);
                    break;
                }
                break;
            case 8:
                if (!u(obj2, i7)) {
                }
                k0.R(obj, M6, k0.C(obj2, M6));
                U(obj, i7);
                break;
            case 9:
            case 17:
                F(obj, obj2, i7);
                break;
            case 10:
                if (!u(obj2, i7)) {
                }
                k0.R(obj, M6, k0.C(obj2, M6));
                U(obj, i7);
                break;
            case 11:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case 14:
                if (!u(obj2, i7)) {
                }
                k0.Q(obj, M6, k0.A(obj2, M6));
                U(obj, i7);
                break;
            case 15:
                if (!u(obj2, i7)) {
                }
                k0.P(obj, M6, k0.z(obj2, M6));
                U(obj, i7);
                break;
            case 16:
                if (!u(obj2, i7)) {
                }
                k0.Q(obj, M6, k0.A(obj2, M6));
                U(obj, i7);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f11993n.d(obj, obj2, M6);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                b0.D(this.f11996q, obj, obj2, M6);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!B(obj2, L6, i7)) {
                }
                k0.R(obj, M6, k0.C(obj2, M6));
                V(obj, L6, i7);
                break;
            case 60:
            case 68:
                G(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!B(obj2, L6, i7)) {
                }
                k0.R(obj, M6, k0.C(obj2, M6));
                V(obj, L6, i7);
                break;
        }
    }

    public final int L(int i7) {
        return this.f11980a[i7];
    }

    public final int S(int i7) {
        return this.f11980a[i7 + 2];
    }

    public final void U(Object obj, int i7) {
        int S6 = S(i7);
        long j7 = 1048575 & S6;
        if (j7 == 1048575) {
            return;
        }
        k0.P(obj, j7, (1 << (S6 >>> 20)) | k0.z(obj, j7));
    }

    public final void V(Object obj, int i7, int i8) {
        k0.P(obj, S(i8) & 1048575, i7);
    }

    public final int X(int i7) {
        return this.f11980a[i7 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(java.lang.Object r18, com.google.protobuf.n0 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.Y(java.lang.Object, com.google.protobuf.n0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(java.lang.Object r13, com.google.protobuf.n0 r14) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.Z(java.lang.Object, com.google.protobuf.n0):void");
    }

    @Override // com.google.protobuf.Z
    public void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f11980a.length; i7 += 3) {
            H(obj, obj2, i7);
        }
        b0.E(this.f11994o, obj, obj2);
        if (this.f11985f) {
            b0.C(this.f11995p, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(java.lang.Object r11, com.google.protobuf.n0 r12) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.a0(java.lang.Object, com.google.protobuf.n0):void");
    }

    @Override // com.google.protobuf.Z
    public void b(Object obj) {
        if (z(obj)) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                rVar.r();
                rVar.q();
                rVar.K();
            }
            int length = this.f11980a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int X6 = X(i7);
                long M6 = M(X6);
                int W6 = W(X6);
                if (W6 != 9) {
                    switch (W6) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f11993n.c(obj, M6);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = f11979s;
                            Object object = unsafe.getObject(obj, M6);
                            if (object != null) {
                                unsafe.putObject(obj, M6, this.f11996q.c(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (u(obj, i7)) {
                    p(i7).b(f11979s.getObject(obj, M6));
                }
            }
            this.f11994o.d(obj);
            if (this.f11985f) {
                this.f11995p.e(obj);
            }
        }
    }

    public final void b0(n0 n0Var, int i7, Object obj, int i8) {
        if (obj != null) {
            n0Var.O(i7, this.f11996q.d(o(i8)), this.f11996q.e(obj));
        }
    }

    @Override // com.google.protobuf.Z
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f11990k) {
            int i12 = this.f11989j[i11];
            int L6 = L(i12);
            int X6 = X(i12);
            int i13 = this.f11980a[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i9) {
                if (i14 != 1048575) {
                    i10 = f11979s.getInt(obj, i14);
                }
                i8 = i10;
                i7 = i14;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if (C(X6) && !v(obj, i12, i7, i8, i15)) {
                return false;
            }
            int W6 = W(X6);
            if (W6 != 9 && W6 != 17) {
                if (W6 != 27) {
                    if (W6 == 60 || W6 == 68) {
                        if (B(obj, L6, i12) && !w(obj, X6, p(i12))) {
                            return false;
                        }
                    } else if (W6 != 49) {
                        if (W6 == 50 && !y(obj, X6, i12)) {
                            return false;
                        }
                    }
                }
                if (!x(obj, X6, i12)) {
                    return false;
                }
            } else if (v(obj, i12, i7, i8, i15) && !w(obj, X6, p(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.f11985f || this.f11995p.b(obj).k();
    }

    public final void c0(int i7, Object obj, n0 n0Var) {
        if (obj instanceof String) {
            n0Var.A(i7, (String) obj);
        } else {
            n0Var.M(i7, (AbstractC1141f) obj);
        }
    }

    @Override // com.google.protobuf.Z
    public boolean d(Object obj, Object obj2) {
        int length = this.f11980a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f11994o.a(obj).equals(this.f11994o.a(obj2))) {
            return false;
        }
        if (this.f11985f) {
            return this.f11995p.b(obj).equals(this.f11995p.b(obj2));
        }
        return true;
    }

    public final void d0(g0 g0Var, Object obj, n0 n0Var) {
        g0Var.h(g0Var.a(obj), n0Var);
    }

    @Override // com.google.protobuf.Z
    public int e(Object obj) {
        return this.f11987h ? r(obj) : q(obj);
    }

    @Override // com.google.protobuf.Z
    public Object f() {
        return this.f11992m.a(this.f11984e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f0, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010e, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // com.google.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.g(java.lang.Object):int");
    }

    @Override // com.google.protobuf.Z
    public void h(Object obj, n0 n0Var) {
        if (n0Var.v() == n0.a.DESCENDING) {
            a0(obj, n0Var);
        } else if (this.f11987h) {
            Z(obj, n0Var);
        } else {
            Y(obj, n0Var);
        }
    }

    public final boolean i(Object obj, Object obj2, int i7) {
        return u(obj, i7) == u(obj2, i7);
    }

    public final boolean m(Object obj, Object obj2, int i7) {
        int X6 = X(i7);
        long M6 = M(X6);
        switch (W(X6)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i(obj, obj2, i7) && Double.doubleToLongBits(k0.x(obj, M6)) == Double.doubleToLongBits(k0.x(obj2, M6))) {
                    break;
                }
                break;
            case 1:
                if (i(obj, obj2, i7) && Float.floatToIntBits(k0.y(obj, M6)) == Float.floatToIntBits(k0.y(obj2, M6))) {
                    break;
                }
                break;
            case 2:
                if (i(obj, obj2, i7) && k0.A(obj, M6) == k0.A(obj2, M6)) {
                    break;
                }
                break;
            case 3:
                if (i(obj, obj2, i7) && k0.A(obj, M6) == k0.A(obj2, M6)) {
                    break;
                }
                break;
            case 4:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case 5:
                if (i(obj, obj2, i7) && k0.A(obj, M6) == k0.A(obj2, M6)) {
                    break;
                }
                break;
            case 6:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case 7:
                if (i(obj, obj2, i7) && k0.r(obj, M6) == k0.r(obj2, M6)) {
                    break;
                }
                break;
            case 8:
                if (i(obj, obj2, i7) && b0.I(k0.C(obj, M6), k0.C(obj2, M6))) {
                    break;
                }
                break;
            case 9:
                if (i(obj, obj2, i7) && b0.I(k0.C(obj, M6), k0.C(obj2, M6))) {
                    break;
                }
                break;
            case 10:
                if (i(obj, obj2, i7) && b0.I(k0.C(obj, M6), k0.C(obj2, M6))) {
                    break;
                }
                break;
            case 11:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case 14:
                if (i(obj, obj2, i7) && k0.A(obj, M6) == k0.A(obj2, M6)) {
                    break;
                }
                break;
            case 15:
                if (i(obj, obj2, i7) && k0.z(obj, M6) == k0.z(obj2, M6)) {
                    break;
                }
                break;
            case 16:
                if (i(obj, obj2, i7) && k0.A(obj, M6) == k0.A(obj2, M6)) {
                    break;
                }
                break;
            case 17:
                if (i(obj, obj2, i7) && b0.I(k0.C(obj, M6), k0.C(obj2, M6))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (A(obj, obj2, i7) && b0.I(k0.C(obj, M6), k0.C(obj2, M6))) {
                    break;
                }
                break;
        }
        return true;
    }

    public final Object o(int i7) {
        return this.f11981b[(i7 / 3) * 2];
    }

    public final Z p(int i7) {
        int i8 = (i7 / 3) * 2;
        Z z7 = (Z) this.f11981b[i8];
        if (z7 != null) {
            return z7;
        }
        Z c7 = W.a().c((Class) this.f11981b[i8 + 1]);
        this.f11981b[i8] = c7;
        return c7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0211, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0222, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0245, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0257, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0269, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027b, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028d, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (B(r17, r10, r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        r3 = com.google.protobuf.AbstractC1143h.s(r10, (com.google.protobuf.K) r2.getObject(r17, r13), p(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0359, code lost:
    
        if ((r8 & r15) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0373, code lost:
    
        if ((r8 & r15) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0379, code lost:
    
        if ((r8 & r15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0393, code lost:
    
        if ((r8 & r15) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0399, code lost:
    
        if ((r8 & r15) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03bb, code lost:
    
        if ((r8 & r15) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (B(r17, r10, r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r3 = com.google.protobuf.AbstractC1143h.G(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (B(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r4 = com.google.protobuf.AbstractC1143h.E(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (B(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r3 = com.google.protobuf.AbstractC1143h.g(r10, (com.google.protobuf.AbstractC1141f) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (B(r17, r10, r5) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r3 = com.google.protobuf.b0.o(r10, r2.getObject(r17, r13), p(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (B(r17, r10, r5) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r3 = com.google.protobuf.AbstractC1143h.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        r4 = (com.google.protobuf.AbstractC1143h.O(r10) + com.google.protobuf.AbstractC1143h.Q(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01de, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ef, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0200, code lost:
    
        if (r16.f11988i != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.q(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0186, code lost:
    
        r6 = (com.google.protobuf.AbstractC1143h.O(r8) + com.google.protobuf.AbstractC1143h.Q(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a0, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b1, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d3, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e4, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f5, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0206, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0218, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022a, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023c, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024e, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0260, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0272, code lost:
    
        if (r15.f11988i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0360, code lost:
    
        if ((r6 instanceof com.google.protobuf.AbstractC1141f) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if ((r6 instanceof com.google.protobuf.AbstractC1141f) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        r6 = com.google.protobuf.AbstractC1143h.M(r8, (java.lang.String) r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.r(java.lang.Object):int");
    }

    public final int s(g0 g0Var, Object obj) {
        return g0Var.b(g0Var.a(obj));
    }

    public final boolean u(Object obj, int i7) {
        int S6 = S(i7);
        long j7 = 1048575 & S6;
        if (j7 != 1048575) {
            return (k0.z(obj, j7) & (1 << (S6 >>> 20))) != 0;
        }
        int X6 = X(i7);
        long M6 = M(X6);
        switch (W(X6)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.doubleToRawLongBits(k0.x(obj, M6)) != 0;
            case 1:
                return Float.floatToRawIntBits(k0.y(obj, M6)) != 0;
            case 2:
                return k0.A(obj, M6) != 0;
            case 3:
                return k0.A(obj, M6) != 0;
            case 4:
                return k0.z(obj, M6) != 0;
            case 5:
                return k0.A(obj, M6) != 0;
            case 6:
                return k0.z(obj, M6) != 0;
            case 7:
                return k0.r(obj, M6);
            case 8:
                Object C7 = k0.C(obj, M6);
                if (C7 instanceof String) {
                    return !((String) C7).isEmpty();
                }
                if (C7 instanceof AbstractC1141f) {
                    return !AbstractC1141f.f12047p.equals(C7);
                }
                throw new IllegalArgumentException();
            case 9:
                return k0.C(obj, M6) != null;
            case 10:
                return !AbstractC1141f.f12047p.equals(k0.C(obj, M6));
            case 11:
                return k0.z(obj, M6) != 0;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return k0.z(obj, M6) != 0;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return k0.z(obj, M6) != 0;
            case 14:
                return k0.A(obj, M6) != 0;
            case 15:
                return k0.z(obj, M6) != 0;
            case 16:
                return k0.A(obj, M6) != 0;
            case 17:
                return k0.C(obj, M6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? u(obj, i7) : (i9 & i10) != 0;
    }

    public final boolean x(Object obj, int i7, int i8) {
        List list = (List) k0.C(obj, M(i7));
        if (list.isEmpty()) {
            return true;
        }
        Z p7 = p(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!p7.c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final boolean y(Object obj, int i7, int i8) {
        Map e7 = this.f11996q.e(k0.C(obj, M(i7)));
        if (e7.isEmpty()) {
            return true;
        }
        if (this.f11996q.d(o(i8)).f11971c.e() != m0.c.MESSAGE) {
            return true;
        }
        Z z7 = null;
        for (Object obj2 : e7.values()) {
            if (z7 == null) {
                z7 = W.a().c(obj2.getClass());
            }
            if (!z7.c(obj2)) {
                return false;
            }
        }
        return true;
    }
}

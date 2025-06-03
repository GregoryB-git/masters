package com.google.crypto.tink.shaded.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.crypto.tink.shaded.protobuf.AbstractC1090e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f11286r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f11287s = o0.D();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11288a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11290c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11291d;

    /* renamed from: e, reason: collision with root package name */
    public final O f11292e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11293f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11294g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11295h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11296i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f11297j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11298k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11299l;

    /* renamed from: m, reason: collision with root package name */
    public final U f11300m;

    /* renamed from: n, reason: collision with root package name */
    public final E f11301n;

    /* renamed from: o, reason: collision with root package name */
    public final k0 f11302o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1102q f11303p;

    /* renamed from: q, reason: collision with root package name */
    public final J f11304q;

    public S(int[] iArr, Object[] objArr, int i7, int i8, O o7, boolean z7, boolean z8, int[] iArr2, int i9, int i10, U u7, E e7, k0 k0Var, AbstractC1102q abstractC1102q, J j7) {
        this.f11288a = iArr;
        this.f11289b = objArr;
        this.f11290c = i7;
        this.f11291d = i8;
        this.f11294g = o7 instanceof AbstractC1108x;
        this.f11295h = z7;
        this.f11293f = abstractC1102q != null && abstractC1102q.e(o7);
        this.f11296i = z8;
        this.f11297j = iArr2;
        this.f11298k = i9;
        this.f11299l = i10;
        this.f11300m = u7;
        this.f11301n = e7;
        this.f11302o = k0Var;
        this.f11303p = abstractC1102q;
        this.f11292e = o7;
        this.f11304q = j7;
    }

    public static boolean A(int i7) {
        return (i7 & 536870912) != 0;
    }

    public static boolean D(Object obj, int i7, e0 e0Var) {
        return e0Var.c(o0.C(obj, X(i7)));
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1108x) {
            return ((AbstractC1108x) obj).D();
        }
        return true;
    }

    public static boolean J(int i7) {
        return (i7 & 268435456) != 0;
    }

    public static List K(Object obj, long j7) {
        return (List) o0.C(obj, j7);
    }

    public static long L(Object obj, long j7) {
        return o0.A(obj, j7);
    }

    public static S T(Class cls, M m7, U u7, E e7, k0 k0Var, AbstractC1102q abstractC1102q, J j7) {
        if (m7 instanceof c0) {
            return V((c0) m7, u7, e7, k0Var, abstractC1102q, j7);
        }
        android.support.v4.media.a.a(m7);
        return U(null, u7, e7, k0Var, abstractC1102q, j7);
    }

    public static S U(h0 h0Var, U u7, E e7, k0 k0Var, AbstractC1102q abstractC1102q, J j7) {
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
    public static com.google.crypto.tink.shaded.protobuf.S V(com.google.crypto.tink.shaded.protobuf.c0 r33, com.google.crypto.tink.shaded.protobuf.U r34, com.google.crypto.tink.shaded.protobuf.E r35, com.google.crypto.tink.shaded.protobuf.k0 r36, com.google.crypto.tink.shaded.protobuf.AbstractC1102q r37, com.google.crypto.tink.shaded.protobuf.J r38) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.V(com.google.crypto.tink.shaded.protobuf.c0, com.google.crypto.tink.shaded.protobuf.U, com.google.crypto.tink.shaded.protobuf.E, com.google.crypto.tink.shaded.protobuf.k0, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.J):com.google.crypto.tink.shaded.protobuf.S");
    }

    public static long X(int i7) {
        return i7 & 1048575;
    }

    public static boolean Y(Object obj, long j7) {
        return ((Boolean) o0.C(obj, j7)).booleanValue();
    }

    public static double Z(Object obj, long j7) {
        return ((Double) o0.C(obj, j7)).doubleValue();
    }

    public static float a0(Object obj, long j7) {
        return ((Float) o0.C(obj, j7)).floatValue();
    }

    public static int b0(Object obj, long j7) {
        return ((Integer) o0.C(obj, j7)).intValue();
    }

    public static long c0(Object obj, long j7) {
        return ((Long) o0.C(obj, j7)).longValue();
    }

    public static boolean l(Object obj, long j7) {
        return o0.r(obj, j7);
    }

    public static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double o(Object obj, long j7) {
        return o0.x(obj, j7);
    }

    public static Field p0(Class cls, String str) {
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

    public static float r(Object obj, long j7) {
        return o0.y(obj, j7);
    }

    public static l0 v(Object obj) {
        AbstractC1108x abstractC1108x = (AbstractC1108x) obj;
        l0 l0Var = abstractC1108x.unknownFields;
        if (l0Var != l0.c()) {
            return l0Var;
        }
        l0 k7 = l0.k();
        abstractC1108x.unknownFields = k7;
        return k7;
    }

    public static int v0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static int z(Object obj, long j7) {
        return o0.z(obj, j7);
    }

    public final void A0(r0 r0Var, int i7, Object obj, int i8) {
        if (obj != null) {
            this.f11304q.d(t(i8));
            r0Var.N(i7, null, this.f11304q.e(obj));
        }
    }

    public final boolean B(Object obj, int i7) {
        int k02 = k0(i7);
        long j7 = 1048575 & k02;
        if (j7 != 1048575) {
            return (o0.z(obj, j7) & (1 << (k02 >>> 20))) != 0;
        }
        int w02 = w0(i7);
        long X6 = X(w02);
        switch (v0(w02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.doubleToRawLongBits(o0.x(obj, X6)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0.y(obj, X6)) != 0;
            case 2:
                return o0.A(obj, X6) != 0;
            case 3:
                return o0.A(obj, X6) != 0;
            case 4:
                return o0.z(obj, X6) != 0;
            case 5:
                return o0.A(obj, X6) != 0;
            case 6:
                return o0.z(obj, X6) != 0;
            case 7:
                return o0.r(obj, X6);
            case 8:
                Object C7 = o0.C(obj, X6);
                if (C7 instanceof String) {
                    return !((String) C7).isEmpty();
                }
                if (C7 instanceof AbstractC1093h) {
                    return !AbstractC1093h.f11337p.equals(C7);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0.C(obj, X6) != null;
            case 10:
                return !AbstractC1093h.f11337p.equals(o0.C(obj, X6));
            case 11:
                return o0.z(obj, X6) != 0;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return o0.z(obj, X6) != 0;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return o0.z(obj, X6) != 0;
            case 14:
                return o0.A(obj, X6) != 0;
            case 15:
                return o0.z(obj, X6) != 0;
            case 16:
                return o0.A(obj, X6) != 0;
            case 17:
                return o0.C(obj, X6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void B0(int i7, Object obj, r0 r0Var) {
        if (obj instanceof String) {
            r0Var.A(i7, (String) obj);
        } else {
            r0Var.M(i7, (AbstractC1093h) obj);
        }
    }

    public final boolean C(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? B(obj, i7) : (i9 & i10) != 0;
    }

    public final void C0(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.t(k0Var.g(obj), r0Var);
    }

    public final boolean E(Object obj, int i7, int i8) {
        List list = (List) o0.C(obj, X(i7));
        if (list.isEmpty()) {
            return true;
        }
        e0 u7 = u(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!u7.c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(Object obj, int i7, int i8) {
        if (this.f11304q.e(o0.C(obj, X(i7))).isEmpty()) {
            return true;
        }
        this.f11304q.d(t(i8));
        throw null;
    }

    public final boolean H(Object obj, Object obj2, int i7) {
        long k02 = k0(i7) & 1048575;
        return o0.z(obj, k02) == o0.z(obj2, k02);
    }

    public final boolean I(Object obj, int i7, int i8) {
        return o0.z(obj, (long) (k0(i8) & 1048575)) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0069, code lost:
    
        r12 = r10.f11298k;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x006e, code lost:
    
        if (r12 >= r10.f11299l) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0070, code lost:
    
        r3 = q(r13, r10.f11297j[r12], r3, r11, r13);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x007f, code lost:
    
        if (r3 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0081, code lost:
    
        r11.o(r13, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(com.google.crypto.tink.shaded.protobuf.k0 r11, com.google.crypto.tink.shaded.protobuf.AbstractC1102q r12, java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.d0 r14, com.google.crypto.tink.shaded.protobuf.C1101p r15) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.M(com.google.crypto.tink.shaded.protobuf.k0, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final void N(Object obj, int i7, Object obj2, C1101p c1101p, d0 d0Var) {
        long X6 = X(w0(i7));
        Object C7 = o0.C(obj, X6);
        if (C7 == null) {
            C7 = this.f11304q.f(obj2);
            o0.R(obj, X6, C7);
        } else if (this.f11304q.g(C7)) {
            Object f7 = this.f11304q.f(obj2);
            this.f11304q.a(f7, C7);
            o0.R(obj, X6, f7);
            C7 = f7;
        }
        Map h7 = this.f11304q.h(C7);
        this.f11304q.d(obj2);
        d0Var.M(h7, null, c1101p);
    }

    public final void O(Object obj, Object obj2, int i7) {
        if (B(obj2, i7)) {
            long X6 = X(w0(i7));
            Unsafe unsafe = f11287s;
            Object object = unsafe.getObject(obj2, X6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i7) + " is present but null: " + obj2);
            }
            e0 u7 = u(i7);
            if (!B(obj, i7)) {
                if (G(object)) {
                    Object f7 = u7.f();
                    u7.a(f7, object);
                    unsafe.putObject(obj, X6, f7);
                } else {
                    unsafe.putObject(obj, X6, object);
                }
                q0(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!G(object2)) {
                Object f8 = u7.f();
                u7.a(f8, object2);
                unsafe.putObject(obj, X6, f8);
                object2 = f8;
            }
            u7.a(object2, object);
        }
    }

    public final void P(Object obj, Object obj2, int i7) {
        int W6 = W(i7);
        if (I(obj2, W6, i7)) {
            long X6 = X(w0(i7));
            Unsafe unsafe = f11287s;
            Object object = unsafe.getObject(obj2, X6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i7) + " is present but null: " + obj2);
            }
            e0 u7 = u(i7);
            if (!I(obj, W6, i7)) {
                if (G(object)) {
                    Object f7 = u7.f();
                    u7.a(f7, object);
                    unsafe.putObject(obj, X6, f7);
                } else {
                    unsafe.putObject(obj, X6, object);
                }
                r0(obj, W6, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!G(object2)) {
                Object f8 = u7.f();
                u7.a(f8, object2);
                unsafe.putObject(obj, X6, f8);
                object2 = f8;
            }
            u7.a(object2, object);
        }
    }

    public final void Q(Object obj, Object obj2, int i7) {
        int w02 = w0(i7);
        long X6 = X(w02);
        int W6 = W(i7);
        switch (v0(w02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (B(obj2, i7)) {
                    o0.N(obj, X6, o0.x(obj2, X6));
                    q0(obj, i7);
                    break;
                }
                break;
            case 1:
                if (B(obj2, i7)) {
                    o0.O(obj, X6, o0.y(obj2, X6));
                    q0(obj, i7);
                    break;
                }
                break;
            case 2:
                if (!B(obj2, i7)) {
                }
                o0.Q(obj, X6, o0.A(obj2, X6));
                q0(obj, i7);
                break;
            case 3:
                if (!B(obj2, i7)) {
                }
                o0.Q(obj, X6, o0.A(obj2, X6));
                q0(obj, i7);
                break;
            case 4:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case 5:
                if (!B(obj2, i7)) {
                }
                o0.Q(obj, X6, o0.A(obj2, X6));
                q0(obj, i7);
                break;
            case 6:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case 7:
                if (B(obj2, i7)) {
                    o0.H(obj, X6, o0.r(obj2, X6));
                    q0(obj, i7);
                    break;
                }
                break;
            case 8:
                if (!B(obj2, i7)) {
                }
                o0.R(obj, X6, o0.C(obj2, X6));
                q0(obj, i7);
                break;
            case 9:
            case 17:
                O(obj, obj2, i7);
                break;
            case 10:
                if (!B(obj2, i7)) {
                }
                o0.R(obj, X6, o0.C(obj2, X6));
                q0(obj, i7);
                break;
            case 11:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case 14:
                if (!B(obj2, i7)) {
                }
                o0.Q(obj, X6, o0.A(obj2, X6));
                q0(obj, i7);
                break;
            case 15:
                if (!B(obj2, i7)) {
                }
                o0.P(obj, X6, o0.z(obj2, X6));
                q0(obj, i7);
                break;
            case 16:
                if (!B(obj2, i7)) {
                }
                o0.Q(obj, X6, o0.A(obj2, X6));
                q0(obj, i7);
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
                this.f11301n.d(obj, obj2, X6);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                g0.E(this.f11304q, obj, obj2, X6);
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
                if (!I(obj2, W6, i7)) {
                }
                o0.R(obj, X6, o0.C(obj2, X6));
                r0(obj, W6, i7);
                break;
            case 60:
            case 68:
                P(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!I(obj2, W6, i7)) {
                }
                o0.R(obj, X6, o0.C(obj2, X6));
                r0(obj, W6, i7);
                break;
        }
    }

    public final Object R(Object obj, int i7) {
        e0 u7 = u(i7);
        long X6 = X(w0(i7));
        if (!B(obj, i7)) {
            return u7.f();
        }
        Object object = f11287s.getObject(obj, X6);
        if (G(object)) {
            return object;
        }
        Object f7 = u7.f();
        if (object != null) {
            u7.a(f7, object);
        }
        return f7;
    }

    public final Object S(Object obj, int i7, int i8) {
        e0 u7 = u(i8);
        if (!I(obj, i7, i8)) {
            return u7.f();
        }
        Object object = f11287s.getObject(obj, X(w0(i8)));
        if (G(object)) {
            return object;
        }
        Object f7 = u7.f();
        if (object != null) {
            u7.a(f7, object);
        }
        return f7;
    }

    public final int W(int i7) {
        return this.f11288a[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f11288a.length; i7 += 3) {
            Q(obj, obj2, i7);
        }
        g0.F(this.f11302o, obj, obj2);
        if (this.f11293f) {
            g0.D(this.f11303p, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(Object obj) {
        if (G(obj)) {
            if (obj instanceof AbstractC1108x) {
                AbstractC1108x abstractC1108x = (AbstractC1108x) obj;
                abstractC1108x.n();
                abstractC1108x.m();
                abstractC1108x.F();
            }
            int length = this.f11288a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int w02 = w0(i7);
                long X6 = X(w02);
                int v02 = v0(w02);
                if (v02 != 9) {
                    switch (v02) {
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
                            this.f11301n.c(obj, X6);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = f11287s;
                            Object object = unsafe.getObject(obj, X6);
                            if (object != null) {
                                unsafe.putObject(obj, X6, this.f11304q.c(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (B(obj, i7)) {
                    u(i7).b(f11287s.getObject(obj, X6));
                }
            }
            this.f11302o.j(obj);
            if (this.f11293f) {
                this.f11303p.f(obj);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f11298k) {
            int i12 = this.f11297j[i11];
            int W6 = W(i12);
            int w02 = w0(i12);
            int i13 = this.f11288a[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i9) {
                if (i14 != 1048575) {
                    i10 = f11287s.getInt(obj, i14);
                }
                i8 = i10;
                i7 = i14;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if (J(w02) && !C(obj, i12, i7, i8, i15)) {
                return false;
            }
            int v02 = v0(w02);
            if (v02 != 9 && v02 != 17) {
                if (v02 != 27) {
                    if (v02 == 60 || v02 == 68) {
                        if (I(obj, W6, i12) && !D(obj, w02, u(i12))) {
                            return false;
                        }
                    } else if (v02 != 49) {
                        if (v02 == 50 && !F(obj, w02, i12)) {
                            return false;
                        }
                    }
                }
                if (!E(obj, w02, i12)) {
                    return false;
                }
            } else if (C(obj, i12, i7, i8, i15) && !D(obj, w02, u(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.f11293f || this.f11303p.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        int length = this.f11288a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!p(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f11302o.g(obj).equals(this.f11302o.g(obj2))) {
            return false;
        }
        if (this.f11293f) {
            return this.f11303p.c(obj).equals(this.f11303p.c(obj2));
        }
        return true;
    }

    public final int d0(Object obj, byte[] bArr, int i7, int i8, int i9, long j7, AbstractC1090e.a aVar) {
        Unsafe unsafe = f11287s;
        Object t7 = t(i9);
        Object object = unsafe.getObject(obj, j7);
        if (this.f11304q.g(object)) {
            Object f7 = this.f11304q.f(t7);
            this.f11304q.a(f7, object);
            unsafe.putObject(obj, j7, f7);
            object = f7;
        }
        this.f11304q.d(t7);
        return n(bArr, i7, i8, null, this.f11304q.h(object), aVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int e(Object obj) {
        return this.f11295h ? x(obj) : w(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int e0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, AbstractC1090e.a aVar) {
        Object valueOf;
        Object valueOf2;
        int K6;
        long j8;
        int i15;
        Object valueOf3;
        Object S6;
        int N6;
        Unsafe unsafe = f11287s;
        long j9 = this.f11288a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    valueOf = Double.valueOf(AbstractC1090e.d(bArr, i7));
                    unsafe.putObject(obj, j7, valueOf);
                    K6 = i7 + 8;
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 52:
                if (i11 == 5) {
                    valueOf2 = Float.valueOf(AbstractC1090e.k(bArr, i7));
                    unsafe.putObject(obj, j7, valueOf2);
                    K6 = i7 + 4;
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 53:
            case 54:
                if (i11 == 0) {
                    K6 = AbstractC1090e.K(bArr, i7, aVar);
                    j8 = aVar.f11330b;
                    valueOf3 = Long.valueOf(j8);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 55:
            case 62:
                if (i11 == 0) {
                    K6 = AbstractC1090e.H(bArr, i7, aVar);
                    i15 = aVar.f11329a;
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 56:
            case 65:
                if (i11 == 1) {
                    valueOf = Long.valueOf(AbstractC1090e.i(bArr, i7));
                    unsafe.putObject(obj, j7, valueOf);
                    K6 = i7 + 8;
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 57:
            case 64:
                if (i11 == 5) {
                    valueOf2 = Integer.valueOf(AbstractC1090e.g(bArr, i7));
                    unsafe.putObject(obj, j7, valueOf2);
                    K6 = i7 + 4;
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 58:
                if (i11 == 0) {
                    K6 = AbstractC1090e.K(bArr, i7, aVar);
                    valueOf3 = Boolean.valueOf(aVar.f11330b != 0);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 59:
                if (i11 == 2) {
                    K6 = AbstractC1090e.H(bArr, i7, aVar);
                    int i16 = aVar.f11329a;
                    if (i16 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(obj, j7, valueOf3);
                        unsafe.putInt(obj, j9, i10);
                        return K6;
                    }
                    if ((i12 & 536870912) != 0 && !p0.n(bArr, K6, K6 + i16)) {
                        throw A.d();
                    }
                    unsafe.putObject(obj, j7, new String(bArr, K6, i16, AbstractC1110z.f11553b));
                    K6 += i16;
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 60:
                if (i11 == 2) {
                    S6 = S(obj, i10, i14);
                    N6 = AbstractC1090e.N(S6, u(i14), bArr, i7, i8, aVar);
                    u0(obj, i10, i14, S6);
                    return N6;
                }
                return i7;
            case 61:
                if (i11 == 2) {
                    K6 = AbstractC1090e.b(bArr, i7, aVar);
                    valueOf3 = aVar.f11331c;
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 63:
                if (i11 == 0) {
                    K6 = AbstractC1090e.H(bArr, i7, aVar);
                    i15 = aVar.f11329a;
                    s(i14);
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 66:
                if (i11 == 0) {
                    K6 = AbstractC1090e.H(bArr, i7, aVar);
                    i15 = AbstractC1094i.b(aVar.f11329a);
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 67:
                if (i11 == 0) {
                    K6 = AbstractC1090e.K(bArr, i7, aVar);
                    j8 = AbstractC1094i.c(aVar.f11330b);
                    valueOf3 = Long.valueOf(j8);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return K6;
                }
                return i7;
            case 68:
                if (i11 == 3) {
                    S6 = S(obj, i10, i14);
                    N6 = AbstractC1090e.M(S6, u(i14), bArr, i7, i8, (i9 & (-8)) | 4, aVar);
                    u0(obj, i10, i14, S6);
                    return N6;
                }
                return i7;
            default:
                return i7;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object f() {
        return this.f11300m.a(this.f11292e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x02c4, code lost:
    
        if (r0 != r11) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02c6, code lost:
    
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r5 = r17;
        r3 = r19;
        r6 = r20;
        r2 = r21;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02e0, code lost:
    
        r2 = r0;
        r8 = r19;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x030b, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x032d, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0090. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f0(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r33) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.f0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
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
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.g(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e7, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0304, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0089. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r34) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.g0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void h(Object obj, byte[] bArr, int i7, int i8, AbstractC1090e.a aVar) {
        if (this.f11295h) {
            g0(obj, bArr, i7, i8, aVar);
        } else {
            f0(obj, bArr, i7, i8, 0, aVar);
        }
    }

    public final int h0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, AbstractC1090e.a aVar) {
        int I6;
        Unsafe unsafe = f11287s;
        AbstractC1110z.d dVar = (AbstractC1110z.d) unsafe.getObject(obj, j8);
        if (!dVar.p()) {
            int size = dVar.size();
            dVar = dVar.h(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j8, dVar);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return AbstractC1090e.r(bArr, i7, dVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC1090e.e(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return AbstractC1090e.u(bArr, i7, dVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC1090e.l(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return AbstractC1090e.y(bArr, i7, dVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC1090e.L(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return AbstractC1090e.x(bArr, i7, dVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC1090e.I(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i11 == 2) {
                    return AbstractC1090e.t(bArr, i7, dVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC1090e.j(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 45:
                if (i11 == 2) {
                    return AbstractC1090e.s(bArr, i7, dVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC1090e.h(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return AbstractC1090e.q(bArr, i7, dVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC1090e.a(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    long j9 = j7 & 536870912;
                    AbstractC1110z.d dVar2 = dVar;
                    return j9 == 0 ? AbstractC1090e.C(i9, bArr, i7, i8, dVar2, aVar) : AbstractC1090e.D(i9, bArr, i7, i8, dVar2, aVar);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return AbstractC1090e.p(u(i12), i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return AbstractC1090e.c(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    I6 = AbstractC1090e.x(bArr, i7, dVar, aVar);
                } else if (i11 == 0) {
                    I6 = AbstractC1090e.I(i9, bArr, i7, i8, dVar, aVar);
                }
                s(i12);
                g0.z(obj, i10, dVar, null, null, this.f11302o);
                return I6;
            case 33:
            case 47:
                if (i11 == 2) {
                    return AbstractC1090e.v(bArr, i7, dVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC1090e.z(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return AbstractC1090e.w(bArr, i7, dVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC1090e.A(i9, bArr, i7, i8, dVar, aVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return AbstractC1090e.n(u(i12), i9, bArr, i7, i8, dVar, aVar);
                }
                break;
        }
        return i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(Object obj, r0 r0Var) {
        if (r0Var.v() == r0.a.DESCENDING) {
            z0(obj, r0Var);
        } else if (this.f11295h) {
            y0(obj, r0Var);
        } else {
            x0(obj, r0Var);
        }
    }

    public final int i0(int i7) {
        if (i7 < this.f11290c || i7 > this.f11291d) {
            return -1;
        }
        return s0(i7, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(Object obj, d0 d0Var, C1101p c1101p) {
        c1101p.getClass();
        m(obj);
        M(this.f11302o, this.f11303p, obj, d0Var, c1101p);
    }

    public final int j0(int i7, int i8) {
        if (i7 < this.f11290c || i7 > this.f11291d) {
            return -1;
        }
        return s0(i7, i8);
    }

    public final boolean k(Object obj, Object obj2, int i7) {
        return B(obj, i7) == B(obj2, i7);
    }

    public final int k0(int i7) {
        return this.f11288a[i7 + 2];
    }

    public final void l0(Object obj, long j7, d0 d0Var, e0 e0Var, C1101p c1101p) {
        d0Var.N(this.f11301n.e(obj, j7), e0Var, c1101p);
    }

    public final void m0(Object obj, int i7, d0 d0Var, e0 e0Var, C1101p c1101p) {
        d0Var.K(this.f11301n.e(obj, X(i7)), e0Var, c1101p);
    }

    public final int n(byte[] bArr, int i7, int i8, H.a aVar, Map map, AbstractC1090e.a aVar2) {
        int H6 = AbstractC1090e.H(bArr, i7, aVar2);
        int i9 = aVar2.f11329a;
        if (i9 < 0 || i9 > i8 - H6) {
            throw A.m();
        }
        throw null;
    }

    public final void n0(Object obj, int i7, d0 d0Var) {
        long X6;
        Object u7;
        if (A(i7)) {
            X6 = X(i7);
            u7 = d0Var.F();
        } else if (this.f11294g) {
            X6 = X(i7);
            u7 = d0Var.m();
        } else {
            X6 = X(i7);
            u7 = d0Var.u();
        }
        o0.R(obj, X6, u7);
    }

    public final void o0(Object obj, int i7, d0 d0Var) {
        if (A(i7)) {
            d0Var.t(this.f11301n.e(obj, X(i7)));
        } else {
            d0Var.q(this.f11301n.e(obj, X(i7)));
        }
    }

    public final boolean p(Object obj, Object obj2, int i7) {
        int w02 = w0(i7);
        long X6 = X(w02);
        switch (v0(w02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (k(obj, obj2, i7) && Double.doubleToLongBits(o0.x(obj, X6)) == Double.doubleToLongBits(o0.x(obj2, X6))) {
                    break;
                }
                break;
            case 1:
                if (k(obj, obj2, i7) && Float.floatToIntBits(o0.y(obj, X6)) == Float.floatToIntBits(o0.y(obj2, X6))) {
                    break;
                }
                break;
            case 2:
                if (k(obj, obj2, i7) && o0.A(obj, X6) == o0.A(obj2, X6)) {
                    break;
                }
                break;
            case 3:
                if (k(obj, obj2, i7) && o0.A(obj, X6) == o0.A(obj2, X6)) {
                    break;
                }
                break;
            case 4:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case 5:
                if (k(obj, obj2, i7) && o0.A(obj, X6) == o0.A(obj2, X6)) {
                    break;
                }
                break;
            case 6:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case 7:
                if (k(obj, obj2, i7) && o0.r(obj, X6) == o0.r(obj2, X6)) {
                    break;
                }
                break;
            case 8:
                if (k(obj, obj2, i7) && g0.J(o0.C(obj, X6), o0.C(obj2, X6))) {
                    break;
                }
                break;
            case 9:
                if (k(obj, obj2, i7) && g0.J(o0.C(obj, X6), o0.C(obj2, X6))) {
                    break;
                }
                break;
            case 10:
                if (k(obj, obj2, i7) && g0.J(o0.C(obj, X6), o0.C(obj2, X6))) {
                    break;
                }
                break;
            case 11:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case 14:
                if (k(obj, obj2, i7) && o0.A(obj, X6) == o0.A(obj2, X6)) {
                    break;
                }
                break;
            case 15:
                if (k(obj, obj2, i7) && o0.z(obj, X6) == o0.z(obj2, X6)) {
                    break;
                }
                break;
            case 16:
                if (k(obj, obj2, i7) && o0.A(obj, X6) == o0.A(obj2, X6)) {
                    break;
                }
                break;
            case 17:
                if (k(obj, obj2, i7) && g0.J(o0.C(obj, X6), o0.C(obj2, X6))) {
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
                if (H(obj, obj2, i7) && g0.J(o0.C(obj, X6), o0.C(obj2, X6))) {
                    break;
                }
                break;
        }
        return true;
    }

    public final Object q(Object obj, int i7, Object obj2, k0 k0Var, Object obj3) {
        W(i7);
        if (o0.C(obj, X(w0(i7))) == null) {
            return obj2;
        }
        s(i7);
        return obj2;
    }

    public final void q0(Object obj, int i7) {
        int k02 = k0(i7);
        long j7 = 1048575 & k02;
        if (j7 == 1048575) {
            return;
        }
        o0.P(obj, j7, (1 << (k02 >>> 20)) | o0.z(obj, j7));
    }

    public final void r0(Object obj, int i7, int i8) {
        o0.P(obj, k0(i8) & 1048575, i7);
    }

    public final AbstractC1110z.c s(int i7) {
        android.support.v4.media.a.a(this.f11289b[((i7 / 3) * 2) + 1]);
        return null;
    }

    public final int s0(int i7, int i8) {
        int length = (this.f11288a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int W6 = W(i10);
            if (i7 == W6) {
                return i10;
            }
            if (i7 < W6) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    public final Object t(int i7) {
        return this.f11289b[(i7 / 3) * 2];
    }

    public final void t0(Object obj, int i7, Object obj2) {
        f11287s.putObject(obj, X(w0(i7)), obj2);
        q0(obj, i7);
    }

    public final e0 u(int i7) {
        int i8 = (i7 / 3) * 2;
        e0 e0Var = (e0) this.f11289b[i8];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c7 = a0.a().c((Class) this.f11289b[i8 + 1]);
        this.f11289b[i8] = c7;
        return c7;
    }

    public final void u0(Object obj, int i7, int i8, Object obj2) {
        f11287s.putObject(obj, X(w0(i8)), obj2);
        r0(obj, i7, i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0211, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0222, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0245, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0257, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0269, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027b, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028d, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (I(r17, r10, r5) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.r(r10, (com.google.crypto.tink.shaded.protobuf.O) r2.getObject(r17, r13), u(r5));
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
    
        if (I(r17, r10, r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.D(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (I(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r4 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.B(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (I(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.f(r10, (com.google.crypto.tink.shaded.protobuf.AbstractC1093h) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (I(r17, r10, r5) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.g0.o(r10, r2.getObject(r17, r13), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (I(r17, r10, r5) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        r4 = (com.google.crypto.tink.shaded.protobuf.AbstractC1096k.L(r10) + com.google.crypto.tink.shaded.protobuf.AbstractC1096k.N(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01de, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ef, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0200, code lost:
    
        if (r16.f11296i != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.w(java.lang.Object):int");
    }

    public final int w0(int i7) {
        return this.f11288a[i7 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0186, code lost:
    
        r6 = (com.google.crypto.tink.shaded.protobuf.AbstractC1096k.L(r8) + com.google.crypto.tink.shaded.protobuf.AbstractC1096k.N(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a0, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b1, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d3, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e4, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f5, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0206, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0218, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022a, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023c, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024e, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0260, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0272, code lost:
    
        if (r15.f11296i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0360, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1093h) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1093h) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        r6 = com.google.crypto.tink.shaded.protobuf.AbstractC1096k.J(r8, (java.lang.String) r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.x(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.r0 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.x0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    public final int y(k0 k0Var, Object obj) {
        return k0Var.h(k0Var.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.r0 r14) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.r0 r12) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }
}

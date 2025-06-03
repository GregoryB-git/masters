package com.google.android.gms.internal.measurement;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M4 implements Z4 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f10494r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f10495s = D5.p();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10496a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f10497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10498c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10499d;

    /* renamed from: e, reason: collision with root package name */
    public final I4 f10500e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10501f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10502g;

    /* renamed from: h, reason: collision with root package name */
    public final V4 f10503h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10504i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f10505j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10506k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10507l;

    /* renamed from: m, reason: collision with root package name */
    public final P4 f10508m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1004q4 f10509n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1067x5 f10510o;

    /* renamed from: p, reason: collision with root package name */
    public final O3 f10511p;

    /* renamed from: q, reason: collision with root package name */
    public final F4 f10512q;

    public M4(int[] iArr, Object[] objArr, int i7, int i8, I4 i42, V4 v42, boolean z7, int[] iArr2, int i9, int i10, P4 p42, AbstractC1004q4 abstractC1004q4, AbstractC1067x5 abstractC1067x5, O3 o32, F4 f42) {
        this.f10496a = iArr;
        this.f10497b = objArr;
        this.f10498c = i7;
        this.f10499d = i8;
        this.f10502g = i42 instanceof Y3;
        this.f10503h = v42;
        this.f10501f = o32 != null && o32.d(i42);
        this.f10504i = false;
        this.f10505j = iArr2;
        this.f10506k = i9;
        this.f10507l = i10;
        this.f10508m = p42;
        this.f10509n = abstractC1004q4;
        this.f10510o = abstractC1067x5;
        this.f10511p = o32;
        this.f10500e = i42;
        this.f10512q = f42;
    }

    public static boolean A(Object obj, int i7, Z4 z42) {
        return z42.c(D5.B(obj, i7 & 1048575));
    }

    public static float B(Object obj, long j7) {
        return ((Float) D5.B(obj, j7)).floatValue();
    }

    public static int H(Object obj, long j7) {
        return ((Integer) D5.B(obj, j7)).intValue();
    }

    public static long L(Object obj, long j7) {
        return ((Long) D5.B(obj, j7)).longValue();
    }

    public static C1049v5 O(Object obj) {
        Y3 y32 = (Y3) obj;
        C1049v5 c1049v5 = y32.zzb;
        if (c1049v5 != C1049v5.k()) {
            return c1049v5;
        }
        C1049v5 l7 = C1049v5.l();
        y32.zzb = l7;
        return l7;
    }

    public static boolean P(Object obj, long j7) {
        return ((Boolean) D5.B(obj, j7)).booleanValue();
    }

    public static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    public static boolean S(int i7) {
        return (i7 & 536870912) != 0;
    }

    public static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Y3) {
            return ((Y3) obj).F();
        }
        return true;
    }

    public static double j(Object obj, long j7) {
        return ((Double) D5.B(obj, j7)).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.M4 n(java.lang.Class r33, com.google.android.gms.internal.measurement.G4 r34, com.google.android.gms.internal.measurement.P4 r35, com.google.android.gms.internal.measurement.AbstractC1004q4 r36, com.google.android.gms.internal.measurement.AbstractC1067x5 r37, com.google.android.gms.internal.measurement.O3 r38, com.google.android.gms.internal.measurement.F4 r39) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M4.n(java.lang.Class, com.google.android.gms.internal.measurement.G4, com.google.android.gms.internal.measurement.P4, com.google.android.gms.internal.measurement.q4, com.google.android.gms.internal.measurement.x5, com.google.android.gms.internal.measurement.O3, com.google.android.gms.internal.measurement.F4):com.google.android.gms.internal.measurement.M4");
    }

    public static Field s(Class cls, String str) {
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

    public static void t(int i7, Object obj, T5 t52) {
        if (obj instanceof String) {
            t52.E(i7, (String) obj);
        } else {
            t52.f(i7, (AbstractC1003q3) obj);
        }
    }

    public static void u(AbstractC1067x5 abstractC1067x5, Object obj, T5 t52) {
        abstractC1067x5.g(abstractC1067x5.k(obj), t52);
    }

    public final int C(int i7) {
        return this.f10496a[i7 + 2];
    }

    public final void D(Object obj, int i7) {
        int C7 = C(i7);
        long j7 = 1048575 & C7;
        if (j7 == 1048575) {
            return;
        }
        D5.h(obj, j7, (1 << (C7 >>> 20)) | D5.t(obj, j7));
    }

    public final void E(Object obj, int i7, int i8) {
        D5.h(obj, C(i8) & 1048575, i7);
    }

    public final void F(Object obj, Object obj2, int i7) {
        int i8 = this.f10496a[i7];
        if (J(obj2, i8, i7)) {
            long G6 = G(i7) & 1048575;
            Unsafe unsafe = f10495s;
            Object object = unsafe.getObject(obj2, G6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10496a[i7] + " is present but null: " + String.valueOf(obj2));
            }
            Z4 N6 = N(i7);
            if (!J(obj, i8, i7)) {
                if (T(object)) {
                    Object a7 = N6.a();
                    N6.d(a7, object);
                    unsafe.putObject(obj, G6, a7);
                } else {
                    unsafe.putObject(obj, G6, object);
                }
                E(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, G6);
            if (!T(object2)) {
                Object a8 = N6.a();
                N6.d(a8, object2);
                unsafe.putObject(obj, G6, a8);
                object2 = a8;
            }
            N6.d(object2, object);
        }
    }

    public final int G(int i7) {
        return this.f10496a[i7 + 1];
    }

    public final boolean I(Object obj, int i7) {
        int C7 = C(i7);
        long j7 = C7 & 1048575;
        if (j7 != 1048575) {
            return (D5.t(obj, j7) & (1 << (C7 >>> 20))) != 0;
        }
        int G6 = G(i7);
        long j8 = G6 & 1048575;
        switch ((G6 & 267386880) >>> 20) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.doubleToRawLongBits(D5.a(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(D5.n(obj, j8)) != 0;
            case 2:
                return D5.x(obj, j8) != 0;
            case 3:
                return D5.x(obj, j8) != 0;
            case 4:
                return D5.t(obj, j8) != 0;
            case 5:
                return D5.x(obj, j8) != 0;
            case 6:
                return D5.t(obj, j8) != 0;
            case 7:
                return D5.F(obj, j8);
            case 8:
                Object B7 = D5.B(obj, j8);
                if (B7 instanceof String) {
                    return !((String) B7).isEmpty();
                }
                if (B7 instanceof AbstractC1003q3) {
                    return !AbstractC1003q3.f11110p.equals(B7);
                }
                throw new IllegalArgumentException();
            case 9:
                return D5.B(obj, j8) != null;
            case 10:
                return !AbstractC1003q3.f11110p.equals(D5.B(obj, j8));
            case 11:
                return D5.t(obj, j8) != 0;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return D5.t(obj, j8) != 0;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return D5.t(obj, j8) != 0;
            case 14:
                return D5.x(obj, j8) != 0;
            case 15:
                return D5.t(obj, j8) != 0;
            case 16:
                return D5.x(obj, j8) != 0;
            case 17:
                return D5.B(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean J(Object obj, int i7, int i8) {
        return D5.t(obj, (long) (C(i8) & 1048575)) == i7;
    }

    public final boolean K(Object obj, Object obj2, int i7) {
        return I(obj, i7) == I(obj2, i7);
    }

    public final InterfaceC0914g4 M(int i7) {
        return (InterfaceC0914g4) this.f10497b[((i7 / 3) << 1) + 1];
    }

    public final Z4 N(int i7) {
        int i8 = (i7 / 3) << 1;
        Z4 z42 = (Z4) this.f10497b[i8];
        if (z42 != null) {
            return z42;
        }
        Z4 b7 = U4.a().b((Class) this.f10497b[i8 + 1]);
        this.f10497b[i8] = b7;
        return b7;
    }

    public final Object Q(int i7) {
        return this.f10497b[(i7 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final Object a() {
        return this.f10508m.b(this.f10500e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020e, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0229, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0237, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0245, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0253, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0356, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0366, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03d3, code lost:
    
        if ((r0 instanceof com.google.android.gms.internal.measurement.AbstractC1003q3) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03e3, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (J(r18, r13, r11) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r0 = com.google.android.gms.internal.measurement.J3.e0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (J(r18, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r1 = com.google.android.gms.internal.measurement.J3.p0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        if ((r0 instanceof com.google.android.gms.internal.measurement.AbstractC1003q3) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
    
        r0 = com.google.android.gms.internal.measurement.J3.y(r13, (java.lang.String) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (J(r18, r13, r11) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        r0 = com.google.android.gms.internal.measurement.J3.z(r13, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.J3.s0(r13) + com.google.android.gms.internal.measurement.J3.v0(r0)) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c0, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cd, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e7, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f4, code lost:
    
        if (r0 > 0) goto L91;
     */
    @Override // com.google.android.gms.internal.measurement.Z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M4.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f10506k) {
            int i12 = this.f10505j[i11];
            int i13 = this.f10496a[i12];
            int G6 = G(i12);
            int i14 = this.f10496a[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f10495s.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & G6) != 0 && !z(obj, i12, i7, i8, i16)) {
                return false;
            }
            int i17 = (267386880 & G6) >>> 20;
            if (i17 != 9 && i17 != 17) {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (J(obj, i13, i12) && !A(obj, G6, N(i12))) {
                            return false;
                        }
                    } else if (i17 != 49) {
                        if (i17 == 50 && !this.f10512q.c(D5.B(obj, G6 & 1048575)).isEmpty()) {
                            this.f10512q.b(Q(i12));
                            throw null;
                        }
                    }
                }
                List list = (List) D5.B(obj, G6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Z4 N6 = N(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!N6.c(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (z(obj, i12, i7, i8, i16) && !A(obj, G6, N(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.f10501f || this.f10511p.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void d(Object obj, Object obj2) {
        R(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f10496a.length; i7 += 3) {
            int G6 = G(i7);
            long j7 = 1048575 & G6;
            int i8 = this.f10496a[i7];
            switch ((G6 & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (I(obj2, i7)) {
                        D5.f(obj, j7, D5.a(obj2, j7));
                        D(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i7)) {
                        D5.g(obj, j7, D5.n(obj2, j7));
                        D(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.i(obj, j7, D5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 3:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.i(obj, j7, D5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 4:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 5:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.i(obj, j7, D5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 6:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 7:
                    if (I(obj2, i7)) {
                        D5.v(obj, j7, D5.F(obj2, j7));
                        D(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.j(obj, j7, D5.B(obj2, j7));
                    D(obj, i7);
                    break;
                case 9:
                case 17:
                    y(obj, obj2, i7);
                    break;
                case 10:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.j(obj, j7, D5.B(obj2, j7));
                    D(obj, i7);
                    break;
                case 11:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 14:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.i(obj, j7, D5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 15:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.h(obj, j7, D5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 16:
                    if (!I(obj2, i7)) {
                        break;
                    }
                    D5.i(obj, j7, D5.x(obj2, j7));
                    D(obj, i7);
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
                    this.f10509n.b(obj, obj2, j7);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    AbstractC0861a5.m(this.f10512q, obj, obj2, j7);
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
                    if (!J(obj2, i8, i7)) {
                        break;
                    }
                    D5.j(obj, j7, D5.B(obj2, j7));
                    E(obj, i8, i7);
                    break;
                case 60:
                case 68:
                    F(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!J(obj2, i8, i7)) {
                        break;
                    }
                    D5.j(obj, j7, D5.B(obj2, j7));
                    E(obj, i8, i7);
                    break;
            }
        }
        AbstractC0861a5.n(this.f10510o, obj, obj2);
        if (this.f10501f) {
            AbstractC0861a5.l(this.f10511p, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void e(Object obj) {
        int i7;
        if (T(obj)) {
            if (obj instanceof Y3) {
                Y3 y32 = (Y3) obj;
                y32.j(Integer.MAX_VALUE);
                y32.zza = 0;
                y32.D();
            }
            int length = this.f10496a.length;
            while (i7 < length) {
                int G6 = G(i7);
                long j7 = 1048575 & G6;
                int i8 = (G6 & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 == 60 || i8 == 68) {
                        if (!J(obj, this.f10496a[i7], i7)) {
                        }
                        N(i7).e(f10495s.getObject(obj, j7));
                    } else {
                        switch (i8) {
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
                                this.f10509n.d(obj, j7);
                                continue;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f10495s;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    unsafe.putObject(obj, j7, this.f10512q.e(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        N(i7).e(f10495s.getObject(obj, j7));
                    }
                }
                i7 = I(obj, i7) ? 0 : i7 + 3;
                N(i7).e(f10495s.getObject(obj, j7));
            }
            this.f10510o.l(obj);
            if (this.f10501f) {
                this.f10511p.f(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0110, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // com.google.android.gms.internal.measurement.Z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M4.f(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0994p3 c0994p3) {
        m(obj, bArr, i7, i8, 0, c0994p3);
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean h(Object obj, Object obj2) {
        int length = this.f10496a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int G6 = G(i7);
            long j7 = G6 & 1048575;
            switch ((G6 & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (K(obj, obj2, i7) && Double.doubleToLongBits(D5.a(obj, j7)) == Double.doubleToLongBits(D5.a(obj2, j7))) {
                        break;
                    }
                    return false;
                case 1:
                    if (K(obj, obj2, i7) && Float.floatToIntBits(D5.n(obj, j7)) == Float.floatToIntBits(D5.n(obj2, j7))) {
                        break;
                    }
                    return false;
                case 2:
                    if (K(obj, obj2, i7) && D5.x(obj, j7) == D5.x(obj2, j7)) {
                        break;
                    }
                    return false;
                case 3:
                    if (K(obj, obj2, i7) && D5.x(obj, j7) == D5.x(obj2, j7)) {
                        break;
                    }
                    return false;
                case 4:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case 5:
                    if (K(obj, obj2, i7) && D5.x(obj, j7) == D5.x(obj2, j7)) {
                        break;
                    }
                    return false;
                case 6:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case 7:
                    if (K(obj, obj2, i7) && D5.F(obj, j7) == D5.F(obj2, j7)) {
                        break;
                    }
                    return false;
                case 8:
                    if (K(obj, obj2, i7) && AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        break;
                    }
                    return false;
                case 9:
                    if (K(obj, obj2, i7) && AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        break;
                    }
                    return false;
                case 10:
                    if (K(obj, obj2, i7) && AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        break;
                    }
                    return false;
                case 11:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case 14:
                    if (K(obj, obj2, i7) && D5.x(obj, j7) == D5.x(obj2, j7)) {
                        break;
                    }
                    return false;
                case 15:
                    if (K(obj, obj2, i7) && D5.t(obj, j7) == D5.t(obj2, j7)) {
                        break;
                    }
                    return false;
                case 16:
                    if (K(obj, obj2, i7) && D5.x(obj, j7) == D5.x(obj2, j7)) {
                        break;
                    }
                    return false;
                case 17:
                    if (K(obj, obj2, i7) && AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        break;
                    }
                    return false;
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
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (!AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        return false;
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
                    long C7 = C(i7) & 1048575;
                    if (D5.t(obj, C7) == D5.t(obj2, C7) && AbstractC0861a5.p(D5.B(obj, j7), D5.B(obj2, j7))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.f10510o.k(obj).equals(this.f10510o.k(obj2))) {
            return false;
        }
        if (this.f10501f) {
            return this.f10511p.b(obj).equals(this.f10511p.b(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b3c  */
    @Override // com.google.android.gms.internal.measurement.Z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r24, com.google.android.gms.internal.measurement.T5 r25) {
        /*
            Method dump skipped, instructions count: 3188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M4.i(java.lang.Object, com.google.android.gms.internal.measurement.T5):void");
    }

    public final int k(int i7) {
        if (i7 < this.f10498c || i7 > this.f10499d) {
            return -1;
        }
        return l(i7, 0);
    }

    public final int l(int i7, int i8) {
        int length = (this.f10496a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f10496a[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0563, code lost:
    
        if (r1 == 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0565, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.AbstractC1003q3.f11110p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0573, code lost:
    
        if (r0 >= r7) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0575, code lost:
    
        r1 = com.google.android.gms.internal.measurement.AbstractC0976n3.o(r33, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x057b, code lost:
    
        if (r11 != r14.f11095a) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x057d, code lost:
    
        r0 = com.google.android.gms.internal.measurement.AbstractC0976n3.o(r33, r1, r14);
        r1 = r14.f11095a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0583, code lost:
    
        if (r1 < 0) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0587, code lost:
    
        if (r1 > (r33.length - r0)) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0589, code lost:
    
        if (r1 != 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x056b, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.AbstractC1003q3.q(r33, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0590, code lost:
    
        throw com.google.android.gms.internal.measurement.C0950k4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0595, code lost:
    
        throw com.google.android.gms.internal.measurement.C0950k4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0573, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.AbstractC1003q3.q(r33, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b28, code lost:
    
        if (r14 == 1048575) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0b2a, code lost:
    
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0b30, code lost:
    
        r12 = r31.f10506k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0b37, code lost:
    
        if (r12 >= r31.f10507l) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0b39, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.C1049v5) r(r32, r31.f10505j[r12], r3, r31.f10510o, r32);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0b4f, code lost:
    
        if (r3 == null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b51, code lost:
    
        r31.f10510o.h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0b56, code lost:
    
        if (r9 != 0) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0b58, code lost:
    
        if (r8 != r10) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b5f, code lost:
    
        throw com.google.android.gms.internal.measurement.C0950k4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b64, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b60, code lost:
    
        if (r8 > r10) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0b62, code lost:
    
        if (r11 != r9) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0b69, code lost:
    
        throw com.google.android.gms.internal.measurement.C0950k4.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0b0e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0ab5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x0589 -> B:222:0x0565). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:257:0x0605 -> B:251:0x05e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x064d -> B:268:0x0624). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.C0994p3 r37) {
        /*
            Method dump skipped, instructions count: 3070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M4.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.p3):int");
    }

    public final Object o(int i7, int i8, Map map, InterfaceC0914g4 interfaceC0914g4, Object obj, AbstractC1067x5 abstractC1067x5, Object obj2) {
        this.f10512q.b(Q(i7));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC0914g4.e(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC1067x5.i(obj2);
                }
                C1082z3 U6 = AbstractC1003q3.U(A4.a(null, entry.getKey(), entry.getValue()));
                try {
                    A4.b(U6.b(), null, entry.getKey(), entry.getValue());
                    abstractC1067x5.c(obj, i8, U6.a());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return obj;
    }

    public final Object p(Object obj, int i7) {
        Z4 N6 = N(i7);
        long G6 = G(i7) & 1048575;
        if (!I(obj, i7)) {
            return N6.a();
        }
        Object object = f10495s.getObject(obj, G6);
        if (T(object)) {
            return object;
        }
        Object a7 = N6.a();
        if (object != null) {
            N6.d(a7, object);
        }
        return a7;
    }

    public final Object q(Object obj, int i7, int i8) {
        Z4 N6 = N(i8);
        if (!J(obj, i7, i8)) {
            return N6.a();
        }
        Object object = f10495s.getObject(obj, G(i8) & 1048575);
        if (T(object)) {
            return object;
        }
        Object a7 = N6.a();
        if (object != null) {
            N6.d(a7, object);
        }
        return a7;
    }

    public final Object r(Object obj, int i7, Object obj2, AbstractC1067x5 abstractC1067x5, Object obj3) {
        InterfaceC0914g4 M6;
        int i8 = this.f10496a[i7];
        Object B7 = D5.B(obj, G(i7) & 1048575);
        return (B7 == null || (M6 = M(i7)) == null) ? obj2 : o(i7, i8, this.f10512q.h(B7), M6, obj2, abstractC1067x5, obj3);
    }

    public final void v(T5 t52, int i7, Object obj, int i8) {
        if (obj != null) {
            this.f10512q.b(Q(i8));
            t52.o(i7, null, this.f10512q.c(obj));
        }
    }

    public final void w(Object obj, int i7, int i8, Object obj2) {
        f10495s.putObject(obj, G(i8) & 1048575, obj2);
        E(obj, i7, i8);
    }

    public final void x(Object obj, int i7, Object obj2) {
        f10495s.putObject(obj, G(i7) & 1048575, obj2);
        D(obj, i7);
    }

    public final void y(Object obj, Object obj2, int i7) {
        if (I(obj2, i7)) {
            long G6 = G(i7) & 1048575;
            Unsafe unsafe = f10495s;
            Object object = unsafe.getObject(obj2, G6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10496a[i7] + " is present but null: " + String.valueOf(obj2));
            }
            Z4 N6 = N(i7);
            if (!I(obj, i7)) {
                if (T(object)) {
                    Object a7 = N6.a();
                    N6.d(a7, object);
                    unsafe.putObject(obj, G6, a7);
                } else {
                    unsafe.putObject(obj, G6, object);
                }
                D(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, G6);
            if (!T(object2)) {
                Object a8 = N6.a();
                N6.d(a8, object2);
                unsafe.putObject(obj, G6, a8);
                object2 = a8;
            }
            N6.d(object2, object);
        }
    }

    public final boolean z(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? I(obj, i7) : (i9 & i10) != 0;
    }
}

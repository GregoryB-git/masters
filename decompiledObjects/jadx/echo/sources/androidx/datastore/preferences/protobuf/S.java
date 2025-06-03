package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0777y;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f8908r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f8909s = p0.B();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8910a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8913d;

    /* renamed from: e, reason: collision with root package name */
    public final O f8914e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8915f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8916g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8917h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8918i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f8919j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8920k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8921l;

    /* renamed from: m, reason: collision with root package name */
    public final U f8922m;

    /* renamed from: n, reason: collision with root package name */
    public final E f8923n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f8924o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0769p f8925p;

    /* renamed from: q, reason: collision with root package name */
    public final J f8926q;

    public S(int[] iArr, Object[] objArr, int i7, int i8, O o7, boolean z7, boolean z8, int[] iArr2, int i9, int i10, U u7, E e7, l0 l0Var, AbstractC0769p abstractC0769p, J j7) {
        this.f8910a = iArr;
        this.f8911b = objArr;
        this.f8912c = i7;
        this.f8913d = i8;
        this.f8916g = o7 instanceof AbstractC0775w;
        this.f8917h = z7;
        this.f8915f = abstractC0769p != null && abstractC0769p.e(o7);
        this.f8918i = z8;
        this.f8919j = iArr2;
        this.f8920k = i9;
        this.f8921l = i10;
        this.f8922m = u7;
        this.f8923n = e7;
        this.f8924o = l0Var;
        this.f8925p = abstractC0769p;
        this.f8914e = o7;
        this.f8926q = j7;
    }

    public static boolean E(int i7) {
        return (i7 & 268435456) != 0;
    }

    public static List F(Object obj, long j7) {
        return (List) p0.A(obj, j7);
    }

    public static long G(Object obj, long j7) {
        return p0.y(obj, j7);
    }

    public static S M(Class cls, M m7, U u7, E e7, l0 l0Var, AbstractC0769p abstractC0769p, J j7) {
        if (m7 instanceof c0) {
            return O((c0) m7, u7, e7, l0Var, abstractC0769p, j7);
        }
        android.support.v4.media.a.a(m7);
        return N(null, u7, e7, l0Var, abstractC0769p, j7);
    }

    public static S N(i0 i0Var, U u7, E e7, l0 l0Var, AbstractC0769p abstractC0769p, J j7) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.S O(androidx.datastore.preferences.protobuf.c0 r35, androidx.datastore.preferences.protobuf.U r36, androidx.datastore.preferences.protobuf.E r37, androidx.datastore.preferences.protobuf.l0 r38, androidx.datastore.preferences.protobuf.AbstractC0769p r39, androidx.datastore.preferences.protobuf.J r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.O(androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.E, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.S");
    }

    public static long Q(int i7) {
        return i7 & 1048575;
    }

    public static boolean R(Object obj, long j7) {
        return ((Boolean) p0.A(obj, j7)).booleanValue();
    }

    public static double S(Object obj, long j7) {
        return ((Double) p0.A(obj, j7)).doubleValue();
    }

    public static float T(Object obj, long j7) {
        return ((Float) p0.A(obj, j7)).floatValue();
    }

    public static int U(Object obj, long j7) {
        return ((Integer) p0.A(obj, j7)).intValue();
    }

    public static long V(Object obj, long j7) {
        return ((Long) p0.A(obj, j7)).longValue();
    }

    public static Field c0(Class cls, String str) {
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

    public static int g0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean k(Object obj, long j7) {
        return p0.p(obj, j7);
    }

    public static double l(Object obj, long j7) {
        return p0.v(obj, j7);
    }

    public static float o(Object obj, long j7) {
        return p0.w(obj, j7);
    }

    public static int v(Object obj, long j7) {
        return p0.x(obj, j7);
    }

    public static boolean w(int i7) {
        return (i7 & 536870912) != 0;
    }

    public static boolean z(Object obj, int i7, e0 e0Var) {
        return e0Var.c(p0.A(obj, Q(i7)));
    }

    public final boolean A(Object obj, int i7, int i8) {
        List list = (List) p0.A(obj, Q(i7));
        if (list.isEmpty()) {
            return true;
        }
        e0 r7 = r(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!r7.c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Object obj, int i7, int i8) {
        Map e7 = this.f8926q.e(p0.A(obj, Q(i7)));
        if (e7.isEmpty()) {
            return true;
        }
        if (this.f8926q.d(q(i8)).f8902c.c() != r0.c.MESSAGE) {
            return true;
        }
        e0 e0Var = null;
        for (Object obj2 : e7.values()) {
            if (e0Var == null) {
                e0Var = a0.a().c(obj2.getClass());
            }
            if (!e0Var.c(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, Object obj2, int i7) {
        long X6 = X(i7) & 1048575;
        return p0.x(obj, X6) == p0.x(obj2, X6);
    }

    public final boolean D(Object obj, int i7, int i8) {
        return p0.x(obj, (long) (X(i8) & 1048575)) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x007b, code lost:
    
        r0 = r16.f8920k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x007f, code lost:
    
        if (r0 >= r16.f8921l) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0081, code lost:
    
        r13 = n(r19, r16.f8919j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x008c, code lost:
    
        if (r13 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(androidx.datastore.preferences.protobuf.l0 r17, androidx.datastore.preferences.protobuf.AbstractC0769p r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.d0 r20, androidx.datastore.preferences.protobuf.C0768o r21) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.H(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o):void");
    }

    public final void I(Object obj, int i7, Object obj2, C0768o c0768o, d0 d0Var) {
        long Q6 = Q(h0(i7));
        Object A7 = p0.A(obj, Q6);
        if (A7 == null) {
            A7 = this.f8926q.f(obj2);
            p0.O(obj, Q6, A7);
        } else if (this.f8926q.g(A7)) {
            Object f7 = this.f8926q.f(obj2);
            this.f8926q.a(f7, A7);
            p0.O(obj, Q6, f7);
            A7 = f7;
        }
        d0Var.K(this.f8926q.h(A7), this.f8926q.d(obj2), c0768o);
    }

    public final void J(Object obj, Object obj2, int i7) {
        long Q6 = Q(h0(i7));
        if (x(obj2, i7)) {
            Object A7 = p0.A(obj, Q6);
            Object A8 = p0.A(obj2, Q6);
            if (A7 != null && A8 != null) {
                A8 = AbstractC0777y.h(A7, A8);
            } else if (A8 == null) {
                return;
            }
            p0.O(obj, Q6, A8);
            d0(obj, i7);
        }
    }

    public final void K(Object obj, Object obj2, int i7) {
        int h02 = h0(i7);
        int P6 = P(i7);
        long Q6 = Q(h02);
        if (D(obj2, P6, i7)) {
            Object A7 = p0.A(obj, Q6);
            Object A8 = p0.A(obj2, Q6);
            if (A7 != null && A8 != null) {
                A8 = AbstractC0777y.h(A7, A8);
            } else if (A8 == null) {
                return;
            }
            p0.O(obj, Q6, A8);
            e0(obj, P6, i7);
        }
    }

    public final void L(Object obj, Object obj2, int i7) {
        int h02 = h0(i7);
        long Q6 = Q(h02);
        int P6 = P(i7);
        switch (g0(h02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (x(obj2, i7)) {
                    p0.K(obj, Q6, p0.v(obj2, Q6));
                    d0(obj, i7);
                    break;
                }
                break;
            case 1:
                if (x(obj2, i7)) {
                    p0.L(obj, Q6, p0.w(obj2, Q6));
                    d0(obj, i7);
                    break;
                }
                break;
            case 2:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, Q6, p0.y(obj2, Q6));
                d0(obj, i7);
                break;
            case 3:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, Q6, p0.y(obj2, Q6));
                d0(obj, i7);
                break;
            case 4:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case 5:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, Q6, p0.y(obj2, Q6));
                d0(obj, i7);
                break;
            case 6:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case 7:
                if (x(obj2, i7)) {
                    p0.E(obj, Q6, p0.p(obj2, Q6));
                    d0(obj, i7);
                    break;
                }
                break;
            case 8:
                if (!x(obj2, i7)) {
                }
                p0.O(obj, Q6, p0.A(obj2, Q6));
                d0(obj, i7);
                break;
            case 9:
            case 17:
                J(obj, obj2, i7);
                break;
            case 10:
                if (!x(obj2, i7)) {
                }
                p0.O(obj, Q6, p0.A(obj2, Q6));
                d0(obj, i7);
                break;
            case 11:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case 14:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, Q6, p0.y(obj2, Q6));
                d0(obj, i7);
                break;
            case 15:
                if (!x(obj2, i7)) {
                }
                p0.M(obj, Q6, p0.x(obj2, Q6));
                d0(obj, i7);
                break;
            case 16:
                if (!x(obj2, i7)) {
                }
                p0.N(obj, Q6, p0.y(obj2, Q6));
                d0(obj, i7);
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
                this.f8923n.d(obj, obj2, Q6);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                g0.E(this.f8926q, obj, obj2, Q6);
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
                if (!D(obj2, P6, i7)) {
                }
                p0.O(obj, Q6, p0.A(obj2, Q6));
                e0(obj, P6, i7);
                break;
            case 60:
            case 68:
                K(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!D(obj2, P6, i7)) {
                }
                p0.O(obj, Q6, p0.A(obj2, Q6));
                e0(obj, P6, i7);
                break;
        }
    }

    public final int P(int i7) {
        return this.f8910a[i7];
    }

    public final int W(int i7) {
        if (i7 < this.f8912c || i7 > this.f8913d) {
            return -1;
        }
        return f0(i7, 0);
    }

    public final int X(int i7) {
        return this.f8910a[i7 + 2];
    }

    public final void Y(Object obj, long j7, d0 d0Var, e0 e0Var, C0768o c0768o) {
        d0Var.L(this.f8923n.e(obj, j7), e0Var, c0768o);
    }

    public final void Z(Object obj, int i7, d0 d0Var, e0 e0Var, C0768o c0768o) {
        d0Var.M(this.f8923n.e(obj, Q(i7)), e0Var, c0768o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.f8910a.length; i7 += 3) {
            L(obj, obj2, i7);
        }
        if (this.f8917h) {
            return;
        }
        g0.F(this.f8924o, obj, obj2);
        if (this.f8915f) {
            g0.D(this.f8925p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i7, d0 d0Var) {
        long Q6;
        Object u7;
        if (w(i7)) {
            Q6 = Q(i7);
            u7 = d0Var.F();
        } else if (this.f8916g) {
            Q6 = Q(i7);
            u7 = d0Var.m();
        } else {
            Q6 = Q(i7);
            u7 = d0Var.u();
        }
        p0.O(obj, Q6, u7);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj) {
        int i7;
        int i8 = this.f8920k;
        while (true) {
            i7 = this.f8921l;
            if (i8 >= i7) {
                break;
            }
            long Q6 = Q(h0(this.f8919j[i8]));
            Object A7 = p0.A(obj, Q6);
            if (A7 != null) {
                p0.O(obj, Q6, this.f8926q.c(A7));
            }
            i8++;
        }
        int length = this.f8919j.length;
        while (i7 < length) {
            this.f8923n.c(obj, this.f8919j[i7]);
            i7++;
        }
        this.f8924o.j(obj);
        if (this.f8915f) {
            this.f8925p.f(obj);
        }
    }

    public final void b0(Object obj, int i7, d0 d0Var) {
        if (w(i7)) {
            d0Var.t(this.f8923n.e(obj, Q(i7)));
        } else {
            d0Var.q(this.f8923n.e(obj, Q(i7)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean c(Object obj) {
        int i7;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f8920k; i10++) {
            int i11 = this.f8919j[i10];
            int P6 = P(i11);
            int h02 = h0(i11);
            if (this.f8917h) {
                i7 = 0;
            } else {
                int i12 = this.f8910a[i11 + 2];
                int i13 = 1048575 & i12;
                i7 = 1 << (i12 >>> 20);
                if (i13 != i8) {
                    i9 = f8909s.getInt(obj, i13);
                    i8 = i13;
                }
            }
            if (E(h02) && !y(obj, i11, i9, i7)) {
                return false;
            }
            int g02 = g0(h02);
            if (g02 != 9 && g02 != 17) {
                if (g02 != 27) {
                    if (g02 == 60 || g02 == 68) {
                        if (D(obj, P6, i11) && !z(obj, h02, r(i11))) {
                            return false;
                        }
                    } else if (g02 != 49) {
                        if (g02 == 50 && !B(obj, h02, i11)) {
                            return false;
                        }
                    }
                }
                if (!A(obj, h02, i11)) {
                    return false;
                }
            } else if (y(obj, i11, i9, i7) && !z(obj, h02, r(i11))) {
                return false;
            }
        }
        return !this.f8915f || this.f8925p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean d(Object obj, Object obj2) {
        int length = this.f8910a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f8924o.g(obj).equals(this.f8924o.g(obj2))) {
            return false;
        }
        if (this.f8915f) {
            return this.f8925p.c(obj).equals(this.f8925p.c(obj2));
        }
        return true;
    }

    public final void d0(Object obj, int i7) {
        if (this.f8917h) {
            return;
        }
        int X6 = X(i7);
        long j7 = X6 & 1048575;
        p0.M(obj, j7, p0.x(obj, j7) | (1 << (X6 >>> 20)));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        return this.f8917h ? t(obj) : s(obj);
    }

    public final void e0(Object obj, int i7, int i8) {
        p0.M(obj, X(i8) & 1048575, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        return this.f8922m.a(this.f8914e);
    }

    public final int f0(int i7, int i8) {
        int length = (this.f8910a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int P6 = P(i10);
            if (i7 == P6) {
                return i10;
            }
            if (i7 < P6) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
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
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.g(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, d0 d0Var, C0768o c0768o) {
        c0768o.getClass();
        H(this.f8924o, this.f8925p, obj, d0Var, c0768o);
    }

    public final int h0(int i7) {
        return this.f8910a[i7 + 1];
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(Object obj, s0 s0Var) {
        if (s0Var.v() == s0.a.DESCENDING) {
            k0(obj, s0Var);
        } else if (this.f8917h) {
            j0(obj, s0Var);
        } else {
            i0(obj, s0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.s0 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.i0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final boolean j(Object obj, Object obj2, int i7) {
        return x(obj, i7) == x(obj2, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.s0 r14) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.j0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.k0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final void l0(s0 s0Var, int i7, Object obj, int i8) {
        if (obj != null) {
            s0Var.N(i7, this.f8926q.d(q(i8)), this.f8926q.e(obj));
        }
    }

    public final boolean m(Object obj, Object obj2, int i7) {
        int h02 = h0(i7);
        long Q6 = Q(h02);
        switch (g0(h02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (j(obj, obj2, i7) && Double.doubleToLongBits(p0.v(obj, Q6)) == Double.doubleToLongBits(p0.v(obj2, Q6))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i7) && Float.floatToIntBits(p0.w(obj, Q6)) == Float.floatToIntBits(p0.w(obj2, Q6))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i7) && p0.y(obj, Q6) == p0.y(obj2, Q6)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i7) && p0.y(obj, Q6) == p0.y(obj2, Q6)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i7) && p0.y(obj, Q6) == p0.y(obj2, Q6)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i7) && p0.p(obj, Q6) == p0.p(obj2, Q6)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, Q6), p0.A(obj2, Q6))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, Q6), p0.A(obj2, Q6))) {
                    break;
                }
                break;
            case 10:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, Q6), p0.A(obj2, Q6))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i7) && p0.y(obj, Q6) == p0.y(obj2, Q6)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i7) && p0.x(obj, Q6) == p0.x(obj2, Q6)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i7) && p0.y(obj, Q6) == p0.y(obj2, Q6)) {
                    break;
                }
                break;
            case 17:
                if (j(obj, obj2, i7) && g0.J(p0.A(obj, Q6), p0.A(obj2, Q6))) {
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
                if (C(obj, obj2, i7) && g0.J(p0.A(obj, Q6), p0.A(obj2, Q6))) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void m0(int i7, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.A(i7, (String) obj);
        } else {
            s0Var.J(i7, (AbstractC0760g) obj);
        }
    }

    public final Object n(Object obj, int i7, Object obj2, l0 l0Var) {
        P(i7);
        if (p0.A(obj, Q(h0(i7))) == null) {
            return obj2;
        }
        p(i7);
        return obj2;
    }

    public final void n0(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    public final AbstractC0777y.a p(int i7) {
        android.support.v4.media.a.a(this.f8911b[((i7 / 3) * 2) + 1]);
        return null;
    }

    public final Object q(int i7) {
        return this.f8911b[(i7 / 3) * 2];
    }

    public final e0 r(int i7) {
        int i8 = (i7 / 3) * 2;
        e0 e0Var = (e0) this.f8911b[i8];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c7 = a0.a().c((Class) this.f8911b[i8 + 1]);
        this.f8911b[i8] = c7;
        return c7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0213, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0224, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0235, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0247, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0259, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026b, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027d, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028f, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a1, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (D(r17, r9, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0763j.r(r9, (androidx.datastore.preferences.protobuf.O) r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x035b, code lost:
    
        if ((r7 & r14) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0375, code lost:
    
        if ((r7 & r14) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037b, code lost:
    
        if ((r7 & r14) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0395, code lost:
    
        if ((r7 & r14) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039b, code lost:
    
        if ((r7 & r14) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03bd, code lost:
    
        if ((r7 & r14) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (D(r17, r9, r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0763j.H(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (D(r17, r9, r5) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.AbstractC0763j.F(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (D(r17, r9, r5) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0763j.f(r9, (androidx.datastore.preferences.protobuf.AbstractC0760g) r2.getObject(r17, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (D(r17, r9, r5) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.g0.o(r9, r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        if (D(r17, r9, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC0763j.c(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        r2.putInt(r17, r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r4 = (androidx.datastore.preferences.protobuf.AbstractC0763j.P(r9) + androidx.datastore.preferences.protobuf.AbstractC0763j.R(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cf, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e0, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0202, code lost:
    
        if (r16.f8918i != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.s(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0186, code lost:
    
        r6 = (androidx.datastore.preferences.protobuf.AbstractC0763j.P(r8) + androidx.datastore.preferences.protobuf.AbstractC0763j.R(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a0, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b1, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d3, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e4, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f5, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0206, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0218, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022a, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023c, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024e, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0260, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0272, code lost:
    
        if (r15.f8918i != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0360, code lost:
    
        if ((r6 instanceof androidx.datastore.preferences.protobuf.AbstractC0760g) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if ((r6 instanceof androidx.datastore.preferences.protobuf.AbstractC0760g) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        r6 = androidx.datastore.preferences.protobuf.AbstractC0763j.N(r8, (java.lang.String) r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(java.lang.Object):int");
    }

    public final int u(l0 l0Var, Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    public final boolean x(Object obj, int i7) {
        if (!this.f8917h) {
            int X6 = X(i7);
            return (p0.x(obj, (long) (X6 & 1048575)) & (1 << (X6 >>> 20))) != 0;
        }
        int h02 = h0(i7);
        long Q6 = Q(h02);
        switch (g0(h02)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return p0.v(obj, Q6) != 0.0d;
            case 1:
                return p0.w(obj, Q6) != 0.0f;
            case 2:
                return p0.y(obj, Q6) != 0;
            case 3:
                return p0.y(obj, Q6) != 0;
            case 4:
                return p0.x(obj, Q6) != 0;
            case 5:
                return p0.y(obj, Q6) != 0;
            case 6:
                return p0.x(obj, Q6) != 0;
            case 7:
                return p0.p(obj, Q6);
            case 8:
                Object A7 = p0.A(obj, Q6);
                if (A7 instanceof String) {
                    return !((String) A7).isEmpty();
                }
                if (A7 instanceof AbstractC0760g) {
                    return !AbstractC0760g.f8950p.equals(A7);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.A(obj, Q6) != null;
            case 10:
                return !AbstractC0760g.f8950p.equals(p0.A(obj, Q6));
            case 11:
                return p0.x(obj, Q6) != 0;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p0.x(obj, Q6) != 0;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return p0.x(obj, Q6) != 0;
            case 14:
                return p0.y(obj, Q6) != 0;
            case 15:
                return p0.x(obj, Q6) != 0;
            case 16:
                return p0.y(obj, Q6) != 0;
            case 17:
                return p0.A(obj, Q6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean y(Object obj, int i7, int i8, int i9) {
        return this.f8917h ? x(obj, i7) : (i8 & i9) != 0;
    }
}

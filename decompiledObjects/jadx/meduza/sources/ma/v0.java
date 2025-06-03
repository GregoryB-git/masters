package ma;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import ma.a0;
import ma.b0;
import ma.f;
import ma.h;
import ma.k;
import ma.l0;
import ma.w;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class v0<T> implements i1<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f11097q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f11098r = t1.q();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11099a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11102d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f11103e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11104g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11105h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f11106i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11107j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11108k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f11109l;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f11110m;

    /* renamed from: n, reason: collision with root package name */
    public final p1<?, ?> f11111n;

    /* renamed from: o, reason: collision with root package name */
    public final p<?> f11112o;

    /* renamed from: p, reason: collision with root package name */
    public final n0 f11113p;

    public v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, p1 p1Var, p pVar, n0 n0Var) {
        this.f11099a = iArr;
        this.f11100b = objArr;
        this.f11101c = i10;
        this.f11102d = i11;
        this.f11104g = s0Var instanceof w;
        this.f = pVar != null && pVar.e(s0Var);
        this.f11105h = false;
        this.f11106i = iArr2;
        this.f11107j = i12;
        this.f11108k = i13;
        this.f11109l = x0Var;
        this.f11110m = i0Var;
        this.f11111n = p1Var;
        this.f11112o = pVar;
        this.f11103e = s0Var;
        this.f11113p = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> ma.v0<T> B(ma.f1 r32, ma.x0 r33, ma.i0 r34, ma.p1<?, ?> r35, ma.p<?> r36, ma.n0 r37) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.B(ma.f1, ma.x0, ma.i0, ma.p1, ma.p, ma.n0):ma.v0");
    }

    public static long C(int i10) {
        return i10 & 1048575;
    }

    public static <T> int D(T t, long j10) {
        return ((Integer) t1.p(t, j10)).intValue();
    }

    public static <T> long E(T t, long j10) {
        return ((Long) t1.p(t, j10)).longValue();
    }

    public static Field N(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m10 = defpackage.f.m("Field ", str, " for ");
            m10.append(cls.getName());
            m10.append(" not found. Known fields are ");
            m10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m10.toString());
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i10, int i11, v1 v1Var, Class cls, f.a aVar) {
        Object valueOf;
        Object valueOf2;
        int I;
        long j10;
        int i12;
        Object valueOf3;
        switch (v1Var.ordinal()) {
            case 0:
                valueOf = Double.valueOf(Double.longBitsToDouble(f.i(bArr, i10)));
                aVar.f10950c = valueOf;
                return i10 + 8;
            case 1:
                valueOf2 = Float.valueOf(Float.intBitsToFloat(f.g(bArr, i10)));
                aVar.f10950c = valueOf2;
                return i10 + 4;
            case 2:
            case 3:
                I = f.I(bArr, i10, aVar);
                j10 = aVar.f10949b;
                valueOf3 = Long.valueOf(j10);
                aVar.f10950c = valueOf3;
                return I;
            case 4:
            case 12:
            case 13:
                I = f.G(bArr, i10, aVar);
                i12 = aVar.f10948a;
                valueOf3 = Integer.valueOf(i12);
                aVar.f10950c = valueOf3;
                return I;
            case 5:
            case 15:
                valueOf = Long.valueOf(f.i(bArr, i10));
                aVar.f10950c = valueOf;
                return i10 + 8;
            case 6:
            case 14:
                valueOf2 = Integer.valueOf(f.g(bArr, i10));
                aVar.f10950c = valueOf2;
                return i10 + 4;
            case 7:
                I = f.I(bArr, i10, aVar);
                valueOf3 = Boolean.valueOf(aVar.f10949b != 0);
                aVar.f10950c = valueOf3;
                return I;
            case 8:
                return f.D(bArr, i10, aVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return f.n(d1.f10940c.a(cls), bArr, i10, i11, aVar);
            case 11:
                return f.b(bArr, i10, aVar);
            case 16:
                I = f.G(bArr, i10, aVar);
                i12 = i.b(aVar.f10948a);
                valueOf3 = Integer.valueOf(i12);
                aVar.f10950c = valueOf3;
                return I;
            case 17:
                I = f.I(bArr, i10, aVar);
                j10 = i.c(aVar.f10949b);
                valueOf3 = Long.valueOf(j10);
                aVar.f10950c = valueOf3;
                return I;
        }
    }

    public static q1 r(Object obj) {
        w wVar = (w) obj;
        q1 q1Var = wVar.unknownFields;
        if (q1Var != q1.f) {
            return q1Var;
        }
        q1 q1Var2 = new q1();
        wVar.unknownFields = q1Var2;
        return q1Var2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).y();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A(T t, int i10, int i11) {
        i1 q10 = q(i11);
        if (!v(t, i10, i11)) {
            return q10.f();
        }
        Object object = f11098r.getObject(t, T(i11) & 1048575);
        if (u(object)) {
            return object;
        }
        Object f = q10.f();
        if (object != null) {
            q10.a(f, object);
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int F(T t, byte[] bArr, int i10, int i11, int i12, long j10, f.a aVar) {
        Unsafe unsafe = f11098r;
        Object p10 = p(i12);
        Object object = unsafe.getObject(t, j10);
        if (this.f11113p.g(object)) {
            m0 d10 = this.f11113p.d();
            this.f11113p.a(d10, object);
            unsafe.putObject(t, j10, d10);
            object = d10;
        }
        l0.a<?, ?> c10 = this.f11113p.c(p10);
        m0 e10 = this.f11113p.e(object);
        int G = f.G(bArr, i10, aVar);
        int i13 = aVar.f10948a;
        if (i13 < 0 || i13 > i11 - G) {
            throw b0.h();
        }
        int i14 = i13 + G;
        Object obj = c10.f11034b;
        Object obj2 = c10.f11036d;
        while (G < i14) {
            int i15 = G + 1;
            int i16 = bArr[G];
            if (i16 < 0) {
                i15 = f.F(i16, bArr, i15, aVar);
                i16 = aVar.f10948a;
            }
            int i17 = i15;
            int i18 = i16 >>> 3;
            int i19 = i16 & 7;
            if (i18 != 1) {
                if (i18 == 2) {
                    v1 v1Var = c10.f11035c;
                    if (i19 == v1Var.f11118b) {
                        G = m(bArr, i17, i11, v1Var, c10.f11036d.getClass(), aVar);
                        obj2 = aVar.f10950c;
                    }
                }
                G = f.M(i16, bArr, i17, i11, aVar);
            } else {
                v1 v1Var2 = c10.f11033a;
                if (i19 == v1Var2.f11118b) {
                    G = m(bArr, i17, i11, v1Var2, null, aVar);
                    obj = aVar.f10950c;
                } else {
                    G = f.M(i16, bArr, i17, i11, aVar);
                }
            }
        }
        if (G != i14) {
            throw b0.g();
        }
        e10.put(obj, obj2);
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0373, code lost:
    
        if (r0 != r20) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03df, code lost:
    
        r8 = r33;
        r7 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c5, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r2 = r33;
        r13 = r34;
        r1 = r35;
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03a1, code lost:
    
        if (r0 != r15) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03c3, code lost:
    
        if (r0 != r15) goto L145;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G(T r31, byte[] r32, int r33, int r34, int r35, ma.f.a r36) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.G(java.lang.Object, byte[], int, int, int, ma.f$a):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int H(T t, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f.a aVar) {
        Object valueOf;
        Object valueOf2;
        int I;
        long j11;
        int i18;
        Object valueOf3;
        Object A;
        int L;
        Unsafe unsafe = f11098r;
        long j12 = this.f11099a[i17 + 2] & 1048575;
        switch (i16) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i14 == 1) {
                    valueOf = Double.valueOf(f.d(bArr, i10));
                    unsafe.putObject(t, j10, valueOf);
                    I = i10 + 8;
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(f.k(bArr, i10));
                    unsafe.putObject(t, j10, valueOf2);
                    I = i10 + 4;
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i14 == 0) {
                    I = f.I(bArr, i10, aVar);
                    j11 = aVar.f10949b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i14 == 0) {
                    I = f.G(bArr, i10, aVar);
                    i18 = aVar.f10948a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case 56:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i14 == 1) {
                    valueOf = Long.valueOf(f.i(bArr, i10));
                    unsafe.putObject(t, j10, valueOf);
                    I = i10 + 8;
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(f.g(bArr, i10));
                    unsafe.putObject(t, j10, valueOf2);
                    I = i10 + 4;
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i14 == 0) {
                    I = f.I(bArr, i10, aVar);
                    valueOf3 = Boolean.valueOf(aVar.f10949b != 0);
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i14 == 2) {
                    I = f.G(bArr, i10, aVar);
                    int i19 = aVar.f10948a;
                    if (i19 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j10, valueOf3);
                        unsafe.putInt(t, j12, i13);
                        return I;
                    }
                    if ((i15 & 536870912) != 0 && !u1.e(bArr, I, I + i19)) {
                        throw b0.c();
                    }
                    unsafe.putObject(t, j10, new String(bArr, I, i19, a0.f10909a));
                    I += i19;
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i14 == 2) {
                    A = A(t, i13, i17);
                    L = f.L(A, q(i17), bArr, i10, i11, aVar);
                    S(t, i13, i17, A);
                    return L;
                }
                return i10;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i14 == 2) {
                    I = f.b(bArr, i10, aVar);
                    valueOf3 = aVar.f10950c;
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i14 == 0) {
                    int G = f.G(bArr, i10, aVar);
                    int i20 = aVar.f10948a;
                    a0.b o10 = o(i17);
                    if (o10 == null || o10.a()) {
                        unsafe.putObject(t, j10, Integer.valueOf(i20));
                        unsafe.putInt(t, j12, i13);
                    } else {
                        r(t).c(i12, Long.valueOf(i20));
                    }
                    return G;
                }
                return i10;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i14 == 0) {
                    I = f.G(bArr, i10, aVar);
                    i18 = i.b(aVar.f10948a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i14 == 0) {
                    I = f.I(bArr, i10, aVar);
                    j11 = i.c(aVar.f10949b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t, j10, valueOf3);
                    unsafe.putInt(t, j12, i13);
                    return I;
                }
                return i10;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i14 == 3) {
                    A = A(t, i13, i17);
                    L = f.K(A, q(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    S(t, i13, i17, A);
                    return L;
                }
                return i10;
            default:
                return i10;
        }
    }

    public final int I(T t, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, f.a aVar) {
        int H;
        Unsafe unsafe = f11098r;
        a0.d dVar = (a0.d) unsafe.getObject(t, j11);
        if (!dVar.g()) {
            int size = dVar.size();
            dVar = dVar.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j11, dVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return f.q(bArr, i10, dVar, aVar);
                }
                if (i14 == 1) {
                    return f.e(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return f.t(bArr, i10, dVar, aVar);
                }
                if (i14 == 5) {
                    return f.l(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i14 == 2) {
                    return f.x(bArr, i10, dVar, aVar);
                }
                if (i14 == 0) {
                    return f.J(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (i14 == 2) {
                    return f.w(bArr, i10, dVar, aVar);
                }
                if (i14 == 0) {
                    return f.H(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                if (i14 == 2) {
                    return f.s(bArr, i10, dVar, aVar);
                }
                if (i14 == 1) {
                    return f.j(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                if (i14 == 2) {
                    return f.r(bArr, i10, dVar, aVar);
                }
                if (i14 == 5) {
                    return f.h(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 25:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                if (i14 == 2) {
                    return f.p(bArr, i10, dVar, aVar);
                }
                if (i14 == 0) {
                    return f.a(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    long j12 = j10 & 536870912;
                    a0.d dVar2 = dVar;
                    return j12 == 0 ? f.B(i12, bArr, i10, i11, dVar2, aVar) : f.C(i12, bArr, i10, i11, dVar2, aVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return f.o(q(i15), i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return f.c(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 30:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                if (i14 == 2) {
                    H = f.w(bArr, i10, dVar, aVar);
                } else if (i14 == 0) {
                    H = f.H(i12, bArr, i10, i11, dVar, aVar);
                }
                j1.z(t, i13, dVar, o(i15), null, this.f11111n);
                return H;
            case 33:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                if (i14 == 2) {
                    return f.u(bArr, i10, dVar, aVar);
                }
                if (i14 == 0) {
                    return f.y(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return f.v(bArr, i10, dVar, aVar);
                }
                if (i14 == 0) {
                    return f.z(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                if (i14 == 3) {
                    return f.m(q(i15), i12, bArr, i10, i11, dVar, aVar);
                }
                break;
        }
        return i10;
    }

    public final <E> void J(Object obj, long j10, g1 g1Var, i1<E> i1Var, o oVar) {
        int x10;
        List c10 = this.f11110m.c(obj, j10);
        j jVar = (j) g1Var;
        int i10 = jVar.f11010b;
        if ((i10 & 7) != 3) {
            int i11 = b0.f10916c;
            throw new b0.a();
        }
        do {
            E f = i1Var.f();
            jVar.b(f, i1Var, oVar);
            i1Var.b(f);
            c10.add(f);
            if (jVar.f11009a.e() || jVar.f11012d != 0) {
                return;
            } else {
                x10 = jVar.f11009a.x();
            }
        } while (x10 == i10);
        jVar.f11012d = x10;
    }

    public final <E> void K(Object obj, int i10, g1 g1Var, i1<E> i1Var, o oVar) {
        int x10;
        List c10 = this.f11110m.c(obj, i10 & 1048575);
        j jVar = (j) g1Var;
        int i11 = jVar.f11010b;
        if ((i11 & 7) != 2) {
            int i12 = b0.f10916c;
            throw new b0.a();
        }
        do {
            E f = i1Var.f();
            jVar.c(f, i1Var, oVar);
            i1Var.b(f);
            c10.add(f);
            if (jVar.f11009a.e() || jVar.f11012d != 0) {
                return;
            } else {
                x10 = jVar.f11009a.x();
            }
        } while (x10 == i11);
        jVar.f11012d = x10;
    }

    public final void L(Object obj, int i10, g1 g1Var) {
        long j10;
        Object e10;
        if ((536870912 & i10) != 0) {
            j10 = i10 & 1048575;
            j jVar = (j) g1Var;
            jVar.w(2);
            e10 = jVar.f11009a.w();
        } else {
            int i11 = i10 & 1048575;
            if (this.f11104g) {
                j10 = i11;
                j jVar2 = (j) g1Var;
                jVar2.w(2);
                e10 = jVar2.f11009a.v();
            } else {
                j10 = i11;
                e10 = ((j) g1Var).e();
            }
        }
        t1.z(obj, j10, e10);
    }

    public final void M(Object obj, int i10, g1 g1Var) {
        if ((536870912 & i10) != 0) {
            ((j) g1Var).s(this.f11110m.c(obj, i10 & 1048575), true);
        } else {
            ((j) g1Var).s(this.f11110m.c(obj, i10 & 1048575), false);
        }
    }

    public final void O(int i10, Object obj) {
        int i11 = this.f11099a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        t1.x(obj, (1 << (i11 >>> 20)) | t1.n(obj, j10), j10);
    }

    public final void P(T t, int i10, int i11) {
        t1.x(t, i10, this.f11099a[i11 + 2] & 1048575);
    }

    public final int Q(int i10, int i11) {
        int length = (this.f11099a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f11099a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void R(int i10, Object obj, Object obj2) {
        f11098r.putObject(obj, T(i10) & 1048575, obj2);
        O(i10, obj);
    }

    public final void S(T t, int i10, int i11, Object obj) {
        f11098r.putObject(t, T(i11) & 1048575, obj);
        P(t, i10, i11);
    }

    public final int T(int i10) {
        return this.f11099a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(java.lang.Object r22, ma.l r23) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.U(java.lang.Object, ma.l):void");
    }

    @Override // ma.i1
    public final void a(T t, T t10) {
        l(t);
        t10.getClass();
        for (int i10 = 0; i10 < this.f11099a.length; i10 += 3) {
            int T = T(i10);
            long j10 = 1048575 & T;
            int i11 = this.f11099a[i10];
            switch ((T & 267386880) >>> 20) {
                case 0:
                    if (s(i10, t10)) {
                        t1.v(t, j10, t1.l(t10, j10));
                        O(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i10, t10)) {
                        t1.w(t, j10, t1.m(t10, j10));
                        O(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.y(t, j10, t1.o(t10, j10));
                    O(i10, t);
                    break;
                case 3:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.y(t, j10, t1.o(t10, j10));
                    O(i10, t);
                    break;
                case 4:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 5:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.y(t, j10, t1.o(t10, j10));
                    O(i10, t);
                    break;
                case 6:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 7:
                    if (s(i10, t10)) {
                        t1.r(t, j10, t1.g(t10, j10));
                        O(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.z(t, j10, t1.p(t10, j10));
                    O(i10, t);
                    break;
                case 9:
                case 17:
                    x(i10, t, t10);
                    break;
                case 10:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.z(t, j10, t1.p(t10, j10));
                    O(i10, t);
                    break;
                case 11:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 12:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 13:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 14:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.y(t, j10, t1.o(t10, j10));
                    O(i10, t);
                    break;
                case 15:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.x(t, t1.n(t10, j10), j10);
                    O(i10, t);
                    break;
                case 16:
                    if (!s(i10, t10)) {
                        break;
                    }
                    t1.y(t, j10, t1.o(t10, j10));
                    O(i10, t);
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
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case 40:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case 48:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.f11110m.b(t, j10, t10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    n0 n0Var = this.f11113p;
                    Class<?> cls = j1.f11015a;
                    t1.z(t, j10, n0Var.a(t1.p(t, j10), t1.p(t10, j10)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!v(t10, i11, i10)) {
                        break;
                    }
                    t1.z(t, j10, t1.p(t10, j10));
                    P(t, i11, i10);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    y(i10, t, t10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!v(t10, i11, i10)) {
                        break;
                    }
                    t1.z(t, j10, t1.p(t10, j10));
                    P(t, i11, i10);
                    break;
            }
        }
        p1<?, ?> p1Var = this.f11111n;
        Class<?> cls2 = j1.f11015a;
        p1Var.o(t, p1Var.k(p1Var.g(t), p1Var.g(t10)));
        if (this.f) {
            j1.A(this.f11112o, t, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ma.i1
    public final void b(T t) {
        int i10;
        if (u(t)) {
            if (t instanceof w) {
                w wVar = (w) t;
                wVar.r();
                wVar.q();
                wVar.z();
            }
            int length = this.f11099a.length;
            while (i10 < length) {
                int T = T(i10);
                long j10 = 1048575 & T;
                int i11 = (T & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (!v(t, this.f11099a[i10], i10)) {
                        }
                        q(i10).b(f11098r.getObject(t, j10));
                    } else {
                        switch (i11) {
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
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            case 40:
                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            case 48:
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.f11110m.a(t, j10);
                                continue;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = f11098r;
                                Object object = unsafe.getObject(t, j10);
                                if (object != null) {
                                    unsafe.putObject(t, j10, this.f11113p.b(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        q(i10).b(f11098r.getObject(t, j10));
                    }
                }
                i10 = s(i10, t) ? 0 : i10 + 3;
                q(i10).b(f11098r.getObject(t, j10));
            }
            this.f11111n.j(t);
            if (this.f) {
                this.f11112o.f(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [ma.i1] */
    /* JADX WARN: Type inference failed for: r0v23, types: [ma.i1] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ma.i1] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [ma.i1] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    @Override // ma.i1
    public final boolean c(T t) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.f11107j) {
                return !this.f || this.f11112o.c(t).j();
            }
            int i15 = this.f11106i[i14];
            int i16 = this.f11099a[i15];
            int T = T(i15);
            int i17 = this.f11099a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f11098r.getInt(t, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & T) != 0) && !t(t, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & T) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (v(t, i16, i15) && !q(i15).c(t1.p(t, T & 1048575))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            m0 h10 = this.f11113p.h(t1.p(t, T & 1048575));
                            if (!h10.isEmpty()) {
                                if (this.f11113p.c(p(i15)).f11035c.f11117a == w1.MESSAGE) {
                                    ?? r12 = 0;
                                    Iterator it = h10.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = d1.f10940c.a(next.getClass());
                                        }
                                        if (!r12.c(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) t1.p(t, T & 1048575);
                if (!list.isEmpty()) {
                    ?? q10 = q(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!q10.c(list.get(i21))) {
                            z10 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (t(t, i15, i10, i11, i19) && !q(i15).c(t1.p(t, T & 1048575))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (ma.j1.B(ma.t1.p(r10, r6), ma.t1.p(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (ma.j1.B(ma.t1.p(r10, r6), ma.t1.p(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (ma.t1.o(r10, r6) == ma.t1.o(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (ma.t1.o(r10, r6) == ma.t1.o(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (ma.j1.B(ma.t1.p(r10, r6), ma.t1.p(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (ma.j1.B(ma.t1.p(r10, r6), ma.t1.p(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (ma.j1.B(ma.t1.p(r10, r6), ma.t1.p(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
    
        if (ma.t1.g(r10, r6) == ma.t1.g(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        if (ma.t1.o(r10, r6) == ma.t1.o(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        if (ma.t1.n(r10, r6) == ma.t1.n(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        if (ma.t1.o(r10, r6) == ma.t1.o(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (ma.t1.o(r10, r6) == ma.t1.o(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019e, code lost:
    
        if (java.lang.Float.floatToIntBits(ma.t1.m(r10, r6)) == java.lang.Float.floatToIntBits(ma.t1.m(r11, r6))) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
    
        if (java.lang.Double.doubleToLongBits(ma.t1.l(r10, r6)) == java.lang.Double.doubleToLongBits(ma.t1.l(r11, r6))) goto L108;
     */
    @Override // ma.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.d(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x018e, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0278, code lost:
    
        r12 = ((ma.k.P(r0) + ma.k.N(r13)) + r0) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0274, code lost:
    
        r8.putInt(r18, r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a0, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b2, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c4, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d6, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e8, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01fa, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x020c, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x021d, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x022e, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x023f, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0250, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0261, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0272, code lost:
    
        if (r17.f11105h != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ff, code lost:
    
        if ((r0 instanceof ma.h) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fe, code lost:
    
        if ((r0 instanceof ma.h) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
    
        r0 = ma.k.w(r13, (ma.h) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0108, code lost:
    
        r0 = ma.k.L(r13, (java.lang.String) r0);
     */
    @Override // ma.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(T r18) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.e(java.lang.Object):int");
    }

    @Override // ma.i1
    public final T f() {
        return (T) this.f11109l.a(this.f11103e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e1, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f9, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f3, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // ma.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(T r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.g(java.lang.Object):int");
    }

    @Override // ma.i1
    public final void h(Object obj, l lVar) {
        lVar.getClass();
        U(obj, lVar);
    }

    @Override // ma.i1
    public final void i(T t, g1 g1Var, o oVar) {
        Object obj;
        long j10;
        long q10;
        long j11;
        int p10;
        s0 s0Var;
        int l10;
        i0 i0Var;
        long j12;
        i0 i0Var2;
        long j13;
        i0 i0Var3;
        long j14;
        i0 i0Var4;
        long j15;
        i0 i0Var5;
        long j16;
        i0 i0Var6;
        long j17;
        i0 i0Var7;
        long j18;
        i0 i0Var8;
        long j19;
        i0 i0Var9;
        long j20;
        List<Integer> c10;
        i0 i0Var10;
        long j21;
        i0 i0Var11;
        long j22;
        i0 i0Var12;
        long j23;
        i0 i0Var13;
        long j24;
        long j25;
        Object valueOf;
        long q11;
        s0 s0Var2;
        oVar.getClass();
        l(t);
        p1 p1Var = this.f11111n;
        p<?> pVar = this.f11112o;
        Object obj2 = null;
        s<?> sVar = null;
        while (true) {
            try {
                j jVar = (j) g1Var;
                int a10 = jVar.a();
                int Q = (a10 < this.f11101c || a10 > this.f11102d) ? -1 : Q(a10, 0);
                if (Q >= 0) {
                    int T = T(Q);
                    switch ((267386880 & T) >>> 20) {
                        case 0:
                            jVar.w(1);
                            t1.v(t, T & 1048575, jVar.f11009a.k());
                            O(Q, t);
                        case 1:
                            jVar.w(5);
                            t1.w(t, T & 1048575, jVar.f11009a.o());
                            O(Q, t);
                        case 2:
                            j10 = T & 1048575;
                            jVar.w(0);
                            q10 = jVar.f11009a.q();
                            t1.y(t, j10, q10);
                            O(Q, t);
                        case 3:
                            j10 = T & 1048575;
                            jVar.w(0);
                            q10 = jVar.f11009a.z();
                            t1.y(t, j10, q10);
                            O(Q, t);
                        case 4:
                            j11 = T & 1048575;
                            jVar.w(0);
                            p10 = jVar.f11009a.p();
                            t1.x(t, p10, j11);
                            O(Q, t);
                        case 5:
                            j10 = T & 1048575;
                            jVar.w(1);
                            q10 = jVar.f11009a.n();
                            t1.y(t, j10, q10);
                            O(Q, t);
                        case 6:
                            j11 = T & 1048575;
                            jVar.w(5);
                            p10 = jVar.f11009a.m();
                            t1.x(t, p10, j11);
                            O(Q, t);
                        case 7:
                            jVar.w(0);
                            t1.r(t, T & 1048575, jVar.f11009a.i());
                            O(Q, t);
                        case 8:
                            L(t, T, jVar);
                            O(Q, t);
                        case 9:
                            s0Var = (s0) z(Q, t);
                            i1<T> q12 = q(Q);
                            jVar.w(2);
                            jVar.c(s0Var, q12, oVar);
                            R(Q, t, s0Var);
                        case 10:
                            t1.z(t, T & 1048575, jVar.e());
                            O(Q, t);
                        case 11:
                            j11 = T & 1048575;
                            jVar.w(0);
                            p10 = jVar.f11009a.y();
                            t1.x(t, p10, j11);
                            O(Q, t);
                        case 12:
                            jVar.w(0);
                            l10 = jVar.f11009a.l();
                            a0.b o10 = o(Q);
                            if (o10 == null || o10.a()) {
                                t1.x(t, l10, C(T));
                                O(Q, t);
                            } else {
                                obj2 = j1.C(t, a10, l10, obj2, p1Var);
                            }
                            break;
                        case 13:
                            j11 = T & 1048575;
                            jVar.w(5);
                            p10 = jVar.f11009a.r();
                            t1.x(t, p10, j11);
                            O(Q, t);
                        case 14:
                            j10 = T & 1048575;
                            jVar.w(1);
                            q10 = jVar.f11009a.s();
                            t1.y(t, j10, q10);
                            O(Q, t);
                        case 15:
                            j11 = T & 1048575;
                            jVar.w(0);
                            p10 = jVar.f11009a.t();
                            t1.x(t, p10, j11);
                            O(Q, t);
                        case 16:
                            j10 = T & 1048575;
                            jVar.w(0);
                            q10 = jVar.f11009a.u();
                            t1.y(t, j10, q10);
                            O(Q, t);
                        case 17:
                            s0Var = (s0) z(Q, t);
                            i1<T> q13 = q(Q);
                            jVar.w(3);
                            jVar.b(s0Var, q13, oVar);
                            R(Q, t, s0Var);
                        case 18:
                            i0Var = this.f11110m;
                            j12 = T & 1048575;
                            jVar.g(i0Var.c(t, j12));
                        case 19:
                            i0Var2 = this.f11110m;
                            j13 = T & 1048575;
                            jVar.l(i0Var2.c(t, j13));
                        case 20:
                            i0Var3 = this.f11110m;
                            j14 = T & 1048575;
                            jVar.n(i0Var3.c(t, j14));
                        case 21:
                            i0Var4 = this.f11110m;
                            j15 = T & 1048575;
                            jVar.u(i0Var4.c(t, j15));
                        case 22:
                            i0Var5 = this.f11110m;
                            j16 = T & 1048575;
                            jVar.m(i0Var5.c(t, j16));
                        case 23:
                            i0Var6 = this.f11110m;
                            j17 = T & 1048575;
                            jVar.k(i0Var6.c(t, j17));
                        case 24:
                            i0Var7 = this.f11110m;
                            j18 = T & 1048575;
                            jVar.j(i0Var7.c(t, j18));
                        case 25:
                            i0Var8 = this.f11110m;
                            j19 = T & 1048575;
                            jVar.d(i0Var8.c(t, j19));
                        case 26:
                            M(t, T, jVar);
                        case 27:
                            K(t, T, jVar, q(Q), oVar);
                        case 28:
                            jVar.f(this.f11110m.c(t, T & 1048575));
                        case 29:
                            i0Var9 = this.f11110m;
                            j20 = T & 1048575;
                            jVar.t(i0Var9.c(t, j20));
                        case 30:
                            c10 = this.f11110m.c(t, T & 1048575);
                            jVar.h(c10);
                            obj2 = j1.z(t, a10, c10, o(Q), obj2, p1Var);
                        case 31:
                            i0Var10 = this.f11110m;
                            j21 = T & 1048575;
                            jVar.o(i0Var10.c(t, j21));
                        case 32:
                            i0Var11 = this.f11110m;
                            j22 = T & 1048575;
                            jVar.p(i0Var11.c(t, j22));
                        case 33:
                            i0Var12 = this.f11110m;
                            j23 = T & 1048575;
                            jVar.q(i0Var12.c(t, j23));
                        case 34:
                            i0Var13 = this.f11110m;
                            j24 = T & 1048575;
                            jVar.r(i0Var13.c(t, j24));
                        case 35:
                            i0Var = this.f11110m;
                            j12 = T & 1048575;
                            jVar.g(i0Var.c(t, j12));
                        case 36:
                            i0Var2 = this.f11110m;
                            j13 = T & 1048575;
                            jVar.l(i0Var2.c(t, j13));
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            i0Var3 = this.f11110m;
                            j14 = T & 1048575;
                            jVar.n(i0Var3.c(t, j14));
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            i0Var4 = this.f11110m;
                            j15 = T & 1048575;
                            jVar.u(i0Var4.c(t, j15));
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            i0Var5 = this.f11110m;
                            j16 = T & 1048575;
                            jVar.m(i0Var5.c(t, j16));
                        case 40:
                            i0Var6 = this.f11110m;
                            j17 = T & 1048575;
                            jVar.k(i0Var6.c(t, j17));
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            i0Var7 = this.f11110m;
                            j18 = T & 1048575;
                            jVar.j(i0Var7.c(t, j18));
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            i0Var8 = this.f11110m;
                            j19 = T & 1048575;
                            jVar.d(i0Var8.c(t, j19));
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            i0Var9 = this.f11110m;
                            j20 = T & 1048575;
                            jVar.t(i0Var9.c(t, j20));
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            c10 = this.f11110m.c(t, T & 1048575);
                            jVar.h(c10);
                            obj2 = j1.z(t, a10, c10, o(Q), obj2, p1Var);
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            i0Var10 = this.f11110m;
                            j21 = T & 1048575;
                            jVar.o(i0Var10.c(t, j21));
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            i0Var11 = this.f11110m;
                            j22 = T & 1048575;
                            jVar.p(i0Var11.c(t, j22));
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            i0Var12 = this.f11110m;
                            j23 = T & 1048575;
                            jVar.q(i0Var12.c(t, j23));
                        case 48:
                            i0Var13 = this.f11110m;
                            j24 = T & 1048575;
                            jVar.r(i0Var13.c(t, j24));
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            J(t, T & 1048575, jVar, q(Q), oVar);
                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                            w(t, Q, p(Q), oVar, jVar);
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            j25 = T & 1048575;
                            jVar.w(1);
                            valueOf = Double.valueOf(jVar.f11009a.k());
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            j25 = T & 1048575;
                            jVar.w(5);
                            valueOf = Float.valueOf(jVar.f11009a.o());
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            q11 = jVar.f11009a.q();
                            valueOf = Long.valueOf(q11);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            q11 = jVar.f11009a.z();
                            valueOf = Long.valueOf(q11);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            l10 = jVar.f11009a.p();
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case 56:
                            j25 = T & 1048575;
                            jVar.w(1);
                            q11 = jVar.f11009a.n();
                            valueOf = Long.valueOf(q11);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            j25 = T & 1048575;
                            jVar.w(5);
                            l10 = jVar.f11009a.m();
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            valueOf = Boolean.valueOf(jVar.f11009a.i());
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            L(t, T, jVar);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            s0Var2 = (s0) A(t, a10, Q);
                            i1<T> q14 = q(Q);
                            jVar.w(2);
                            jVar.c(s0Var2, q14, oVar);
                            S(t, a10, Q, s0Var2);
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            j25 = T & 1048575;
                            valueOf = jVar.e();
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            l10 = jVar.f11009a.y();
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            jVar.w(0);
                            l10 = jVar.f11009a.l();
                            a0.b o11 = o(Q);
                            if (o11 != null && !o11.a()) {
                                obj2 = j1.C(t, a10, l10, obj2, p1Var);
                            }
                            j25 = C(T);
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            j25 = T & 1048575;
                            jVar.w(5);
                            l10 = jVar.f11009a.r();
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            j25 = T & 1048575;
                            jVar.w(1);
                            q11 = jVar.f11009a.s();
                            valueOf = Long.valueOf(q11);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            l10 = jVar.f11009a.t();
                            valueOf = Integer.valueOf(l10);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            j25 = T & 1048575;
                            jVar.w(0);
                            q11 = jVar.f11009a.u();
                            valueOf = Long.valueOf(q11);
                            t1.z(t, j25, valueOf);
                            P(t, a10, Q);
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            s0Var2 = (s0) A(t, a10, Q);
                            i1<T> q15 = q(Q);
                            jVar.w(3);
                            jVar.b(s0Var2, q15, oVar);
                            S(t, a10, Q, s0Var2);
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = p1Var.f(t);
                                } catch (b0.a unused) {
                                    p1Var.p();
                                    if (obj2 == null) {
                                        obj2 = p1Var.f(t);
                                    }
                                    if (!p1Var.l(obj2, jVar)) {
                                        obj = obj2;
                                        for (int i10 = this.f11107j; i10 < this.f11108k; i10++) {
                                            obj = n(t, this.f11106i[i10], obj, p1Var, t);
                                        }
                                        if (obj == null) {
                                            return;
                                        }
                                        p1Var.n(t, obj);
                                        return;
                                    }
                                }
                            }
                            if (!p1Var.l(obj2, jVar)) {
                                obj = obj2;
                                for (int i11 = this.f11107j; i11 < this.f11108k; i11++) {
                                    obj = n(t, this.f11106i[i11], obj, p1Var, t);
                                }
                                if (obj == null) {
                                    return;
                                }
                            }
                    }
                } else if (a10 == Integer.MAX_VALUE) {
                    obj = obj2;
                    for (int i12 = this.f11107j; i12 < this.f11108k; i12++) {
                        obj = n(t, this.f11106i[i12], obj, p1Var, t);
                    }
                    if (obj == null) {
                        return;
                    }
                } else {
                    w.e b10 = !this.f ? null : pVar.b(oVar, this.f11103e, a10);
                    if (b10 != null) {
                        if (sVar == null) {
                            sVar = pVar.d(t);
                        }
                        obj2 = pVar.g(b10);
                    } else {
                        p1Var.p();
                        if (obj2 == null) {
                            obj2 = p1Var.f(t);
                        }
                        if (!p1Var.l(obj2, jVar)) {
                            obj = obj2;
                            for (int i13 = this.f11107j; i13 < this.f11108k; i13++) {
                                obj = n(t, this.f11106i[i13], obj, p1Var, t);
                            }
                            if (obj == null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Object obj3 = obj2;
                for (int i14 = this.f11107j; i14 < this.f11108k; i14++) {
                    obj3 = n(t, this.f11106i[i14], obj3, p1Var, t);
                }
                if (obj3 != null) {
                    p1Var.n(t, obj3);
                }
                throw th;
            }
        }
    }

    @Override // ma.i1
    public final void j(T t, byte[] bArr, int i10, int i11, f.a aVar) {
        G(t, bArr, i10, i11, 0, aVar);
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        return s(i10, obj) == s(i10, obj2);
    }

    public final <UT, UB> UB n(Object obj, int i10, UB ub2, p1<UT, UB> p1Var, Object obj2) {
        int i11 = this.f11099a[i10];
        Object p10 = t1.p(obj, T(i10) & 1048575);
        if (p10 == null) {
            return ub2;
        }
        a0.b o10 = o(i10);
        if (o10 == null) {
            return ub2;
        }
        m0 e10 = this.f11113p.e(p10);
        l0.a<?, ?> c10 = this.f11113p.c(p(i10));
        Iterator it = e10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!o10.a()) {
                if (ub2 == null) {
                    ub2 = (UB) p1Var.f(obj2);
                }
                int a10 = l0.a(c10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = k.f11018c;
                k.b bVar = new k.b(bArr, 0, a10);
                try {
                    l0.b(bVar, c10, entry.getKey(), entry.getValue());
                    if (bVar.p0() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    p1Var.d(ub2, i11, new h.C0164h(bArr));
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    public final a0.b o(int i10) {
        return (a0.b) this.f11100b[((i10 / 3) * 2) + 1];
    }

    public final Object p(int i10) {
        return this.f11100b[(i10 / 3) * 2];
    }

    public final i1 q(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f11100b;
        i1 i1Var = (i1) objArr[i11];
        if (i1Var != null) {
            return i1Var;
        }
        i1<T> a10 = d1.f10940c.a((Class) objArr[i11 + 1]);
        this.f11100b[i11] = a10;
        return a10;
    }

    public final boolean s(int i10, Object obj) {
        boolean equals;
        int i11 = this.f11099a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & t1.n(obj, j10)) != 0;
        }
        int T = T(i10);
        long j11 = T & 1048575;
        switch ((T & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(t1.l(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(t1.m(obj, j11)) != 0;
            case 2:
                return t1.o(obj, j11) != 0;
            case 3:
                return t1.o(obj, j11) != 0;
            case 4:
                return t1.n(obj, j11) != 0;
            case 5:
                return t1.o(obj, j11) != 0;
            case 6:
                return t1.n(obj, j11) != 0;
            case 7:
                return t1.g(obj, j11);
            case 8:
                Object p10 = t1.p(obj, j11);
                if (p10 instanceof String) {
                    equals = ((String) p10).isEmpty();
                    break;
                } else {
                    if (!(p10 instanceof h)) {
                        throw new IllegalArgumentException();
                    }
                    equals = h.f10961b.equals(p10);
                    break;
                }
            case 9:
                return t1.p(obj, j11) != null;
            case 10:
                equals = h.f10961b.equals(t1.p(obj, j11));
                break;
            case 11:
                return t1.n(obj, j11) != 0;
            case 12:
                return t1.n(obj, j11) != 0;
            case 13:
                return t1.n(obj, j11) != 0;
            case 14:
                return t1.o(obj, j11) != 0;
            case 15:
                return t1.n(obj, j11) != 0;
            case 16:
                return t1.o(obj, j11) != 0;
            case 17:
                return t1.p(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean t(T t, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? s(i10, t) : (i12 & i13) != 0;
    }

    public final boolean v(T t, int i10, int i11) {
        return t1.n(t, (long) (this.f11099a[i11 + 2] & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        r7.put(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void w(java.lang.Object r7, int r8, java.lang.Object r9, ma.o r10, ma.g1 r11) {
        /*
            r6 = this;
            int r8 = r6.T(r8)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r0
            long r0 = (long) r8
            java.lang.Object r8 = ma.t1.p(r7, r0)
            if (r8 != 0) goto L19
            ma.n0 r8 = r6.f11113p
            ma.m0 r8 = r8.d()
            ma.t1.z(r7, r0, r8)
            goto L30
        L19:
            ma.n0 r2 = r6.f11113p
            boolean r2 = r2.g(r8)
            if (r2 == 0) goto L30
            ma.n0 r2 = r6.f11113p
            ma.m0 r2 = r2.d()
            ma.n0 r3 = r6.f11113p
            r3.a(r2, r8)
            ma.t1.z(r7, r0, r2)
            r8 = r2
        L30:
            ma.n0 r7 = r6.f11113p
            ma.m0 r7 = r7.e(r8)
            ma.n0 r8 = r6.f11113p
            ma.l0$a r8 = r8.c(r9)
            ma.j r11 = (ma.j) r11
            r9 = 2
            r11.w(r9)
            ma.i r0 = r11.f11009a
            int r0 = r0.y()
            ma.i r1 = r11.f11009a
            int r0 = r1.h(r0)
            K r1 = r8.f11034b
            V r2 = r8.f11036d
        L52:
            int r3 = r11.a()     // Catch: java.lang.Throwable -> La3
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L9a
            ma.i r4 = r11.f11009a     // Catch: java.lang.Throwable -> La3
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L64
            goto L9a
        L64:
            r4 = 1
            java.lang.String r5 = "Unable to parse map entry."
            if (r3 == r4) goto L85
            if (r3 == r9) goto L78
            boolean r3 = r11.x()     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            if (r3 == 0) goto L72
            goto L52
        L72:
            ma.b0 r3 = new ma.b0     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            r3.<init>(r5)     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            throw r3     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
        L78:
            ma.v1 r3 = r8.f11035c     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            V r4 = r8.f11036d     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            java.lang.Class r4 = r4.getClass()     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            java.lang.Object r2 = r11.i(r3, r4, r10)     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            goto L52
        L85:
            ma.v1 r3 = r8.f11033a     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            r4 = 0
            java.lang.Object r1 = r11.i(r3, r4, r4)     // Catch: ma.b0.a -> L8d java.lang.Throwable -> La3
            goto L52
        L8d:
            boolean r3 = r11.x()     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L94
            goto L52
        L94:
            ma.b0 r7 = new ma.b0     // Catch: java.lang.Throwable -> La3
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La3
            throw r7     // Catch: java.lang.Throwable -> La3
        L9a:
            r7.put(r1, r2)     // Catch: java.lang.Throwable -> La3
            ma.i r7 = r11.f11009a
            r7.g(r0)
            return
        La3:
            r7 = move-exception
            ma.i r8 = r11.f11009a
            r8.g(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.v0.w(java.lang.Object, int, java.lang.Object, ma.o, ma.g1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(int i10, Object obj, Object obj2) {
        if (s(i10, obj2)) {
            long T = T(i10) & 1048575;
            Unsafe unsafe = f11098r;
            Object object = unsafe.getObject(obj2, T);
            if (object == null) {
                StringBuilder l10 = defpackage.f.l("Source subfield ");
                l10.append(this.f11099a[i10]);
                l10.append(" is present but null: ");
                l10.append(obj2);
                throw new IllegalStateException(l10.toString());
            }
            i1 q10 = q(i10);
            if (!s(i10, obj)) {
                if (u(object)) {
                    Object f = q10.f();
                    q10.a(f, object);
                    unsafe.putObject(obj, T, f);
                } else {
                    unsafe.putObject(obj, T, object);
                }
                O(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, T);
            if (!u(object2)) {
                Object f10 = q10.f();
                q10.a(f10, object2);
                unsafe.putObject(obj, T, f10);
                object2 = f10;
            }
            q10.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i10, Object obj, Object obj2) {
        int i11 = this.f11099a[i10];
        if (v(obj2, i11, i10)) {
            long T = T(i10) & 1048575;
            Unsafe unsafe = f11098r;
            Object object = unsafe.getObject(obj2, T);
            if (object == null) {
                StringBuilder l10 = defpackage.f.l("Source subfield ");
                l10.append(this.f11099a[i10]);
                l10.append(" is present but null: ");
                l10.append(obj2);
                throw new IllegalStateException(l10.toString());
            }
            i1 q10 = q(i10);
            if (!v(obj, i11, i10)) {
                if (u(object)) {
                    Object f = q10.f();
                    q10.a(f, object);
                    unsafe.putObject(obj, T, f);
                } else {
                    unsafe.putObject(obj, T, object);
                }
                P(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, T);
            if (!u(object2)) {
                Object f10 = q10.f();
                q10.a(f10, object2);
                unsafe.putObject(obj, T, f10);
                object2 = f10;
            }
            q10.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(int i10, Object obj) {
        i1 q10 = q(i10);
        long T = T(i10) & 1048575;
        if (!s(i10, obj)) {
            return q10.f();
        }
        Object object = f11098r.getObject(obj, T);
        if (u(object)) {
            return object;
        }
        Object f = q10.f();
        if (object != null) {
            q10.a(f, object);
        }
        return f;
    }
}

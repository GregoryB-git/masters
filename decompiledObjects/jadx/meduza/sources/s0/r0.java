package s0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import s0.g;
import s0.h0;
import s0.j;
import s0.x;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class r0<T> implements c1<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f14076r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f14077s = l1.o();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f14078a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14081d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f14082e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14083g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14084h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14085i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f14086j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14087k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14088l;

    /* renamed from: m, reason: collision with root package name */
    public final t0 f14089m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f14090n;

    /* renamed from: o, reason: collision with root package name */
    public final h1<?, ?> f14091o;

    /* renamed from: p, reason: collision with root package name */
    public final o<?> f14092p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f14093q;

    public r0(int[] iArr, Object[] objArr, int i10, int i11, o0 o0Var, boolean z10, int[] iArr2, int i12, int i13, t0 t0Var, e0 e0Var, h1 h1Var, o oVar, j0 j0Var) {
        this.f14078a = iArr;
        this.f14079b = objArr;
        this.f14080c = i10;
        this.f14081d = i11;
        this.f14083g = o0Var instanceof v;
        this.f14084h = z10;
        this.f = oVar != null && oVar.e(o0Var);
        this.f14085i = false;
        this.f14086j = iArr2;
        this.f14087k = i12;
        this.f14088l = i13;
        this.f14089m = t0Var;
        this.f14090n = e0Var;
        this.f14091o = h1Var;
        this.f14092p = oVar;
        this.f14082e = o0Var;
        this.f14093q = j0Var;
    }

    public static Field C(Class<?> cls, String str) {
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

    public static void I(int i10, Object obj, k kVar) {
        if (!(obj instanceof String)) {
            kVar.b(i10, (g) obj);
        } else {
            kVar.f14032a.i0(i10, (String) obj);
        }
    }

    public static List<?> s(Object obj, long j10) {
        return (List) l1.n(obj, j10);
    }

    public static <T> r0<T> u(a1 a1Var, t0 t0Var, e0 e0Var, h1<?, ?> h1Var, o<?> oVar, j0 j0Var) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z10;
        int i28;
        int i29;
        int i30;
        String str;
        int i31;
        char c10;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Field C;
        int i37;
        char charAt11;
        int i38;
        int i39;
        int i40;
        Field C2;
        Field C3;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43;
        char charAt14;
        int i44;
        char charAt15;
        char charAt16;
        int i45 = 0;
        boolean z11 = a1Var.c() == 2;
        String e10 = a1Var.e();
        int length = e10.length();
        int charAt17 = e10.charAt(0);
        if (charAt17 >= 55296) {
            int i46 = charAt17 & 8191;
            int i47 = 1;
            int i48 = 13;
            while (true) {
                i10 = i47 + 1;
                charAt16 = e10.charAt(i47);
                if (charAt16 < 55296) {
                    break;
                }
                i46 |= (charAt16 & 8191) << i48;
                i48 += 13;
                i47 = i10;
            }
            charAt17 = i46 | (charAt16 << i48);
        } else {
            i10 = 1;
        }
        int i49 = i10 + 1;
        int charAt18 = e10.charAt(i10);
        if (charAt18 >= 55296) {
            int i50 = charAt18 & 8191;
            int i51 = 13;
            while (true) {
                i44 = i49 + 1;
                charAt15 = e10.charAt(i49);
                if (charAt15 < 55296) {
                    break;
                }
                i50 |= (charAt15 & 8191) << i51;
                i51 += 13;
                i49 = i44;
            }
            charAt18 = i50 | (charAt15 << i51);
            i49 = i44;
        }
        if (charAt18 == 0) {
            i15 = 0;
            charAt = 0;
            i14 = 0;
            charAt2 = 0;
            i12 = 0;
            iArr = f14076r;
            i13 = 0;
        } else {
            int i52 = i49 + 1;
            int charAt19 = e10.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    charAt10 = e10.charAt(i52);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i53 |= (charAt10 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                charAt19 = i53 | (charAt10 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            int charAt20 = e10.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    charAt9 = e10.charAt(i55);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i56 |= (charAt9 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                charAt20 = i56 | (charAt9 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            int charAt21 = e10.charAt(i55);
            if (charAt21 >= 55296) {
                int i59 = charAt21 & 8191;
                int i60 = 13;
                while (true) {
                    i21 = i58 + 1;
                    charAt8 = e10.charAt(i58);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i59 |= (charAt8 & 8191) << i60;
                    i60 += 13;
                    i58 = i21;
                }
                charAt21 = i59 | (charAt8 << i60);
                i58 = i21;
            }
            int i61 = i58 + 1;
            charAt = e10.charAt(i58);
            if (charAt >= 55296) {
                int i62 = charAt & 8191;
                int i63 = 13;
                while (true) {
                    i20 = i61 + 1;
                    charAt7 = e10.charAt(i61);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i62 |= (charAt7 & 8191) << i63;
                    i63 += 13;
                    i61 = i20;
                }
                charAt = i62 | (charAt7 << i63);
                i61 = i20;
            }
            int i64 = i61 + 1;
            int charAt22 = e10.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i19 = i64 + 1;
                    charAt6 = e10.charAt(i64);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i65 |= (charAt6 & 8191) << i66;
                    i66 += 13;
                    i64 = i19;
                }
                charAt22 = i65 | (charAt6 << i66);
                i64 = i19;
            }
            int i67 = i64 + 1;
            charAt2 = e10.charAt(i64);
            if (charAt2 >= 55296) {
                int i68 = charAt2 & 8191;
                int i69 = 13;
                while (true) {
                    i18 = i67 + 1;
                    charAt5 = e10.charAt(i67);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i68 |= (charAt5 & 8191) << i69;
                    i69 += 13;
                    i67 = i18;
                }
                charAt2 = i68 | (charAt5 << i69);
                i67 = i18;
            }
            int i70 = i67 + 1;
            int charAt23 = e10.charAt(i67);
            if (charAt23 >= 55296) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i17 = i72 + 1;
                    charAt4 = e10.charAt(i72);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i71 |= (charAt4 & 8191) << i73;
                    i73 += 13;
                    i72 = i17;
                }
                charAt23 = i71 | (charAt4 << i73);
                i11 = i17;
            } else {
                i11 = i70;
            }
            int i74 = i11 + 1;
            int charAt24 = e10.charAt(i11);
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i16 = i76 + 1;
                    charAt3 = e10.charAt(i76);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i75 |= (charAt3 & 8191) << i77;
                    i77 += 13;
                    i76 = i16;
                }
                charAt24 = i75 | (charAt3 << i77);
                i74 = i16;
            }
            int[] iArr2 = new int[charAt24 + charAt2 + charAt23];
            i12 = (charAt19 * 2) + charAt20;
            i13 = charAt22;
            i14 = charAt24;
            i45 = charAt19;
            i49 = i74;
            int i78 = charAt21;
            iArr = iArr2;
            i15 = i78;
        }
        Unsafe unsafe = f14077s;
        Object[] d10 = a1Var.d();
        Class<?> cls = a1Var.b().getClass();
        int i79 = i49;
        int[] iArr3 = new int[i13 * 3];
        Object[] objArr = new Object[i13 * 2];
        int i80 = charAt2 + i14;
        int i81 = i14;
        int i82 = i80;
        int i83 = 0;
        int i84 = 0;
        int i85 = i12;
        int i86 = i79;
        while (i86 < length) {
            int i87 = i86 + 1;
            int charAt25 = e10.charAt(i86);
            if (charAt25 >= 55296) {
                int i88 = charAt25 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i43 = i89 + 1;
                    charAt14 = e10.charAt(i89);
                    i24 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i88 |= (charAt14 & 8191) << i90;
                    i90 += 13;
                    i89 = i43;
                    length = i24;
                }
                charAt25 = i88 | (charAt14 << i90);
                i25 = i43;
            } else {
                i24 = length;
                i25 = i87;
            }
            int i91 = i25 + 1;
            int charAt26 = e10.charAt(i25);
            if (charAt26 >= 55296) {
                int i92 = charAt26 & 8191;
                int i93 = i91;
                int i94 = 13;
                while (true) {
                    i42 = i93 + 1;
                    charAt13 = e10.charAt(i93);
                    i26 = i80;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i92 |= (charAt13 & 8191) << i94;
                    i94 += 13;
                    i93 = i42;
                    i80 = i26;
                }
                charAt26 = i92 | (charAt13 << i94);
                i27 = i42;
            } else {
                i26 = i80;
                i27 = i91;
            }
            int i95 = charAt26 & 255;
            int i96 = i14;
            if ((charAt26 & 1024) != 0) {
                iArr[i84] = i83;
                i84++;
            }
            if (i95 >= 51) {
                int i97 = i27 + 1;
                int charAt27 = e10.charAt(i27);
                if (charAt27 >= 55296) {
                    int i98 = charAt27 & 8191;
                    int i99 = i97;
                    int i100 = 13;
                    while (true) {
                        i41 = i99 + 1;
                        charAt12 = e10.charAt(i99);
                        z10 = z11;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i98 |= (charAt12 & 8191) << i100;
                        i100 += 13;
                        i99 = i41;
                        z11 = z10;
                    }
                    charAt27 = i98 | (charAt12 << i100);
                    i39 = i41;
                } else {
                    z10 = z11;
                    i39 = i97;
                }
                int i101 = i95 - 51;
                int i102 = i39;
                if (i101 == 9 || i101 == 17) {
                    i40 = 2;
                    objArr[((i83 / 3) * 2) + 1] = d10[i85];
                    i85++;
                } else {
                    if (i101 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i83 / 3) * 2) + 1] = d10[i85];
                        i85++;
                    }
                    i40 = 2;
                }
                int i103 = charAt27 * i40;
                Object obj = d10[i103];
                if (obj instanceof Field) {
                    C2 = (Field) obj;
                } else {
                    C2 = C(cls, (String) obj);
                    d10[i103] = C2;
                }
                i28 = charAt;
                i34 = (int) unsafe.objectFieldOffset(C2);
                int i104 = i103 + 1;
                Object obj2 = d10[i104];
                if (obj2 instanceof Field) {
                    C3 = (Field) obj2;
                } else {
                    C3 = C(cls, (String) obj2);
                    d10[i104] = C3;
                }
                i35 = (int) unsafe.objectFieldOffset(C3);
                str = e10;
                i31 = i45;
                i36 = i102;
                i32 = 0;
                c10 = 2;
                i29 = i15;
            } else {
                z10 = z11;
                i28 = charAt;
                int i105 = i85 + 1;
                Field C4 = C(cls, (String) d10[i85]);
                if (i95 == 9 || i95 == 17) {
                    i29 = i15;
                    i30 = 1;
                    objArr[((i83 / 3) * 2) + 1] = C4.getType();
                } else {
                    if (i95 == 27 || i95 == 49) {
                        i29 = i15;
                        i30 = 1;
                        i38 = i105 + 1;
                        objArr[((i83 / 3) * 2) + 1] = d10[i105];
                    } else if (i95 == 12 || i95 == 30 || i95 == 44) {
                        i29 = i15;
                        i30 = 1;
                        if ((charAt17 & 1) == 1) {
                            i38 = i105 + 1;
                            objArr[((i83 / 3) * 2) + 1] = d10[i105];
                        }
                    } else {
                        if (i95 == 50) {
                            int i106 = i81 + 1;
                            iArr[i81] = i83;
                            int i107 = (i83 / 3) * 2;
                            int i108 = i105 + 1;
                            objArr[i107] = d10[i105];
                            if ((charAt26 & 2048) != 0) {
                                i105 = i108 + 1;
                                objArr[i107 + 1] = d10[i108];
                                i29 = i15;
                                i81 = i106;
                                i30 = 1;
                            } else {
                                i81 = i106;
                                i105 = i108;
                            }
                        }
                        i29 = i15;
                        i30 = 1;
                    }
                    i105 = i38;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                if ((charAt17 & 1) != i30 || i95 > 17) {
                    str = e10;
                    i31 = i45;
                    c10 = 2;
                    i32 = 0;
                    i33 = 0;
                } else {
                    int i109 = i27 + 1;
                    int charAt28 = e10.charAt(i27);
                    if (charAt28 >= 55296) {
                        int i110 = charAt28 & 8191;
                        int i111 = 13;
                        while (true) {
                            i37 = i109 + 1;
                            charAt11 = e10.charAt(i109);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i110 |= (charAt11 & 8191) << i111;
                            i111 += 13;
                            i109 = i37;
                        }
                        charAt28 = i110 | (charAt11 << i111);
                        i109 = i37;
                    }
                    c10 = 2;
                    int i112 = (charAt28 / 32) + (i45 * 2);
                    Object obj3 = d10[i112];
                    str = e10;
                    if (obj3 instanceof Field) {
                        C = (Field) obj3;
                    } else {
                        C = C(cls, (String) obj3);
                        d10[i112] = C;
                    }
                    i31 = i45;
                    i33 = (int) unsafe.objectFieldOffset(C);
                    i32 = charAt28 % 32;
                    i27 = i109;
                }
                if (i95 >= 18 && i95 <= 49) {
                    iArr[i82] = objectFieldOffset;
                    i82++;
                }
                i85 = i105;
                i34 = objectFieldOffset;
                int i113 = i27;
                i35 = i33;
                i36 = i113;
            }
            int i114 = i83 + 1;
            iArr3[i83] = charAt25;
            int i115 = i114 + 1;
            iArr3[i114] = ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i95 << 20) | i34;
            i83 = i115 + 1;
            iArr3[i115] = (i32 << 20) | i35;
            i86 = i36;
            i14 = i96;
            i15 = i29;
            length = i24;
            i80 = i26;
            i45 = i31;
            e10 = str;
            charAt = i28;
            z11 = z10;
        }
        return new r0<>(iArr3, objArr, i15, charAt, a1Var.b(), z11, iArr, i14, i80, t0Var, e0Var, h1Var, oVar, j0Var);
    }

    public static <T> int v(T t, long j10) {
        return ((Integer) l1.n(t, j10)).intValue();
    }

    public static <T> long w(T t, long j10) {
        return ((Long) l1.n(t, j10)).longValue();
    }

    public final void A(Object obj, int i10, b1 b1Var) {
        long j10;
        Object E;
        if ((536870912 & i10) != 0) {
            j10 = i10 & 1048575;
            E = b1Var.M();
        } else {
            int i11 = i10 & 1048575;
            if (this.f14083g) {
                j10 = i11;
                E = b1Var.z();
            } else {
                j10 = i11;
                E = b1Var.E();
            }
        }
        l1.u(obj, j10, E);
    }

    public final void B(Object obj, int i10, b1 b1Var) {
        if ((536870912 & i10) != 0) {
            b1Var.D(this.f14090n.c(obj, i10 & 1048575));
        } else {
            b1Var.C(this.f14090n.c(obj, i10 & 1048575));
        }
    }

    public final void D(int i10, Object obj) {
        if (this.f14084h) {
            return;
        }
        int i11 = this.f14078a[i10 + 2];
        long j10 = i11 & 1048575;
        l1.s(obj, l1.l(obj, j10) | (1 << (i11 >>> 20)), j10);
    }

    public final void E(T t, int i10, int i11) {
        l1.s(t, i10, this.f14078a[i11 + 2] & 1048575);
    }

    public final int F(int i10) {
        return this.f14078a[i10 + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.Object r19, s0.k r20) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.G(java.lang.Object, s0.k):void");
    }

    public final void H(k kVar, int i10, Object obj, int i11) {
        if (obj != null) {
            h0.a<?, ?> c10 = this.f14093q.c(m(i11));
            i0 h10 = this.f14093q.h(obj);
            kVar.f14032a.getClass();
            for (Map.Entry entry : h10.entrySet()) {
                kVar.f14032a.k0(i10, 2);
                kVar.f14032a.m0(h0.a(c10, entry.getKey(), entry.getValue()));
                h0.b(kVar.f14032a, c10, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // s0.c1
    public final void a(T t, T t10) {
        t10.getClass();
        for (int i10 = 0; i10 < this.f14078a.length; i10 += 3) {
            int F = F(i10);
            long j10 = F & 1048575;
            int i11 = this.f14078a[i10];
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (q(i10, t10)) {
                        l1.f14043d.m(t, j10, l1.j(t10, j10));
                        D(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i10, t10)) {
                        l1.f14043d.n(t, j10, l1.k(t10, j10));
                        D(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.t(t, j10, l1.m(t10, j10));
                    D(i10, t);
                    break;
                case 3:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.t(t, j10, l1.m(t10, j10));
                    D(i10, t);
                    break;
                case 4:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 5:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.t(t, j10, l1.m(t10, j10));
                    D(i10, t);
                    break;
                case 6:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 7:
                    if (q(i10, t10)) {
                        l1.f14043d.k(t, j10, l1.f(t10, j10));
                        D(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.u(t, j10, l1.n(t10, j10));
                    D(i10, t);
                    break;
                case 9:
                case 17:
                    long F2 = F(i10) & 1048575;
                    if (q(i10, t10)) {
                        Object n2 = l1.n(t, F2);
                        Object n10 = l1.n(t10, F2);
                        if (n2 != null && n10 != null) {
                            n10 = x.c(n2, n10);
                        } else if (n10 == null) {
                            break;
                        }
                        l1.u(t, F2, n10);
                        D(i10, t);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.u(t, j10, l1.n(t10, j10));
                    D(i10, t);
                    break;
                case 11:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 12:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 13:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 14:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.t(t, j10, l1.m(t10, j10));
                    D(i10, t);
                    break;
                case 15:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.s(t, l1.l(t10, j10), j10);
                    D(i10, t);
                    break;
                case 16:
                    if (!q(i10, t10)) {
                        break;
                    }
                    l1.t(t, j10, l1.m(t10, j10));
                    D(i10, t);
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
                    this.f14090n.b(t, j10, t10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    j0 j0Var = this.f14093q;
                    Class<?> cls = d1.f13952a;
                    l1.u(t, j10, j0Var.a(l1.n(t, j10), l1.n(t10, j10)));
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
                    if (!r(t10, i11, i10)) {
                        break;
                    }
                    l1.u(t, j10, l1.n(t10, j10));
                    E(t, i11, i10);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    int F3 = F(i10);
                    int i12 = this.f14078a[i10];
                    long j11 = F3 & 1048575;
                    if (r(t10, i12, i10)) {
                        Object n11 = l1.n(t, j11);
                        Object n12 = l1.n(t10, j11);
                        if (n11 != null && n12 != null) {
                            n12 = x.c(n11, n12);
                        } else if (n12 == null) {
                            break;
                        }
                        l1.u(t, j11, n12);
                        E(t, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!r(t10, i11, i10)) {
                        break;
                    }
                    l1.u(t, j10, l1.n(t10, j10));
                    E(t, i11, i10);
                    break;
            }
        }
        if (this.f14084h) {
            return;
        }
        h1<?, ?> h1Var = this.f14091o;
        Class<?> cls2 = d1.f13952a;
        h1Var.o(t, h1Var.k(h1Var.g(t), h1Var.g(t10)));
        if (this.f) {
            d1.A(this.f14092p, t, t10);
        }
    }

    @Override // s0.c1
    public final void b(T t) {
        int i10;
        int i11 = this.f14087k;
        while (true) {
            i10 = this.f14088l;
            if (i11 >= i10) {
                break;
            }
            long F = F(this.f14086j[i11]) & 1048575;
            Object n2 = l1.n(t, F);
            if (n2 != null) {
                l1.u(t, F, this.f14093q.b(n2));
            }
            i11++;
        }
        int length = this.f14086j.length;
        while (i10 < length) {
            this.f14090n.a(t, this.f14086j[i10]);
            i10++;
        }
        this.f14091o.j(t);
        if (this.f) {
            this.f14092p.f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [s0.c1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [s0.c1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [s0.c1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [s0.c1] */
    @Override // s0.c1
    public final boolean c(T t) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= this.f14087k) {
                return !this.f || this.f14092p.c(t).j();
            }
            int i14 = this.f14086j[i12];
            int i15 = this.f14078a[i14];
            int F = F(i14);
            if (this.f14084h) {
                i10 = 0;
            } else {
                int i16 = this.f14078a[i14 + 2];
                int i17 = i16 & 1048575;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i13 = f14077s.getInt(t, i17);
                    i11 = i17;
                }
            }
            if ((268435456 & F) != 0) {
                if (!(this.f14084h ? q(i14, t) : (i13 & i10) != 0)) {
                    return false;
                }
            }
            int i18 = (267386880 & F) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (this.f14084h) {
                    z10 = q(i14, t);
                } else if ((i13 & i10) == 0) {
                    z10 = false;
                }
                if (z10 && !n(i14).c(l1.n(t, F & 1048575))) {
                    return false;
                }
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (r(t, i15, i14) && !n(i14).c(l1.n(t, F & 1048575))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 != 50) {
                            continue;
                        } else {
                            i0 h10 = this.f14093q.h(l1.n(t, F & 1048575));
                            if (!h10.isEmpty()) {
                                if (this.f14093q.c(m(i14)).f14011c.f14058a == o1.MESSAGE) {
                                    ?? r42 = 0;
                                    Iterator it = h10.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r42 = r42;
                                        if (r42 == 0) {
                                            r42 = y0.f14122c.a(next.getClass());
                                        }
                                        if (!r42.c(next)) {
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
                List list = (List) l1.n(t, F & 1048575);
                if (!list.isEmpty()) {
                    ?? n2 = n(i14);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            break;
                        }
                        if (!n2.c(list.get(i19))) {
                            z10 = false;
                            break;
                        }
                        i19++;
                    }
                }
                if (!z10) {
                    return false;
                }
            }
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (s0.d1.B(s0.l1.n(r10, r6), s0.l1.n(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (s0.d1.B(s0.l1.n(r10, r6), s0.l1.n(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (s0.l1.m(r10, r6) == s0.l1.m(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (s0.l1.m(r10, r6) == s0.l1.m(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (s0.d1.B(s0.l1.n(r10, r6), s0.l1.n(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (s0.d1.B(s0.l1.n(r10, r6), s0.l1.n(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (s0.d1.B(s0.l1.n(r10, r6), s0.l1.n(r11, r6)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
    
        if (s0.l1.f(r10, r6) == s0.l1.f(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        if (s0.l1.m(r10, r6) == s0.l1.m(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        if (s0.l1.l(r10, r6) == s0.l1.l(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        if (s0.l1.m(r10, r6) == s0.l1.m(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (s0.l1.m(r10, r6) == s0.l1.m(r11, r6)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019e, code lost:
    
        if (java.lang.Float.floatToIntBits(s0.l1.k(r10, r6)) == java.lang.Float.floatToIntBits(s0.l1.k(r11, r6))) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
    
        if (java.lang.Double.doubleToLongBits(s0.l1.j(r10, r6)) == java.lang.Double.doubleToLongBits(s0.l1.j(r11, r6))) goto L108;
     */
    @Override // s0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.d(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // s0.c1
    public final int e(T t) {
        return this.f14084h ? p(t) : o(t);
    }

    @Override // s0.c1
    public final T f() {
        return (T) this.f14089m.a(this.f14082e);
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
    @Override // s0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(T r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.g(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f5  */
    @Override // s0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r13, s0.k r14) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.h(java.lang.Object, s0.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0239 A[SYNTHETIC] */
    @Override // s0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(T r20, s0.b1 r21, s0.n r22) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.i(java.lang.Object, s0.b1, s0.n):void");
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        return q(i10, obj) == q(i10, obj2);
    }

    public final <UT, UB> UB k(Object obj, int i10, UB ub2, h1<UT, UB> h1Var) {
        int i11 = this.f14078a[i10];
        Object n2 = l1.n(obj, F(i10) & 1048575);
        if (n2 == null) {
            return ub2;
        }
        x.b l10 = l(i10);
        if (l10 == null) {
            return ub2;
        }
        i0 e10 = this.f14093q.e(n2);
        h0.a<?, ?> c10 = this.f14093q.c(m(i10));
        Iterator it = e10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!l10.a()) {
                if (ub2 == null) {
                    ub2 = (UB) h1Var.m();
                }
                int a10 = h0.a(c10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = j.f14024c;
                j.b bVar = new j.b(bArr, a10);
                try {
                    h0.b(bVar, c10, entry.getKey(), entry.getValue());
                    if (bVar.f - bVar.f14030g != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    h1Var.d(ub2, i11, new g.e(bArr));
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    public final x.b l(int i10) {
        return (x.b) this.f14079b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f14079b[(i10 / 3) * 2];
    }

    public final c1 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f14079b;
        c1 c1Var = (c1) objArr[i11];
        if (c1Var != null) {
            return c1Var;
        }
        c1<T> a10 = y0.f14122c.a((Class) objArr[i11 + 1]);
        this.f14079b[i11] = a10;
        return a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x015c, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0246, code lost:
    
        r6 = ((s0.j.P(r3) + s0.j.N(r10)) + r3) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0242, code lost:
    
        r2.putInt(r17, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016e, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0180, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0192, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a4, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b6, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c8, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01da, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01eb, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01fc, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020d, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x021e, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x022f, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0240, code lost:
    
        if (r16.f14085i != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x036f, code lost:
    
        if ((r3 instanceof s0.g) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        if ((r3 instanceof s0.g) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0378, code lost:
    
        r3 = s0.j.L(r10, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x037e, code lost:
    
        r6 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0371, code lost:
    
        r3 = s0.j.w(r10, (s0.g) r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(T r17) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.o(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x011a, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0204, code lost:
    
        r3 = r3 + ((s0.j.P(r5) + s0.j.N(r6)) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0200, code lost:
    
        r0.putInt(r12, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x012c, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0150, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0162, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0174, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0186, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0198, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a9, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ba, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01cb, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01dc, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01ed, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01fe, code lost:
    
        if (r11.f14085i != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0337, code lost:
    
        if ((r4 instanceof s0.g) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if ((r4 instanceof s0.g) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0340, code lost:
    
        r4 = s0.j.L(r6, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0346, code lost:
    
        r3 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0339, code lost:
    
        r4 = s0.j.w(r6, (s0.g) r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(T r12) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r0.p(java.lang.Object):int");
    }

    public final boolean q(int i10, Object obj) {
        boolean equals;
        if (!this.f14084h) {
            int i11 = this.f14078a[i10 + 2];
            return (l1.l(obj, (long) (i11 & 1048575)) & (1 << (i11 >>> 20))) != 0;
        }
        int F = F(i10);
        long j10 = F & 1048575;
        switch ((F & 267386880) >>> 20) {
            case 0:
                return l1.j(obj, j10) != 0.0d;
            case 1:
                return l1.k(obj, j10) != 0.0f;
            case 2:
                return l1.m(obj, j10) != 0;
            case 3:
                return l1.m(obj, j10) != 0;
            case 4:
                return l1.l(obj, j10) != 0;
            case 5:
                return l1.m(obj, j10) != 0;
            case 6:
                return l1.l(obj, j10) != 0;
            case 7:
                return l1.f(obj, j10);
            case 8:
                Object n2 = l1.n(obj, j10);
                if (n2 instanceof String) {
                    equals = ((String) n2).isEmpty();
                    break;
                } else {
                    if (!(n2 instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    equals = g.f13982b.equals(n2);
                    break;
                }
            case 9:
                return l1.n(obj, j10) != null;
            case 10:
                equals = g.f13982b.equals(l1.n(obj, j10));
                break;
            case 11:
                return l1.l(obj, j10) != 0;
            case 12:
                return l1.l(obj, j10) != 0;
            case 13:
                return l1.l(obj, j10) != 0;
            case 14:
                return l1.m(obj, j10) != 0;
            case 15:
                return l1.l(obj, j10) != 0;
            case 16:
                return l1.m(obj, j10) != 0;
            case 17:
                return l1.n(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean r(T t, int i10, int i11) {
        return l1.l(t, (long) (this.f14078a[i11 + 2] & 1048575)) == i10;
    }

    public final <K, V> void t(Object obj, int i10, Object obj2, n nVar, b1 b1Var) {
        long F = F(i10) & 1048575;
        Object n2 = l1.n(obj, F);
        if (n2 == null) {
            n2 = this.f14093q.d();
            l1.u(obj, F, n2);
        } else if (this.f14093q.g(n2)) {
            i0 d10 = this.f14093q.d();
            this.f14093q.a(d10, n2);
            l1.u(obj, F, d10);
            n2 = d10;
        }
        b1Var.a(this.f14093q.e(n2), this.f14093q.c(obj2), nVar);
    }

    public final int x(int i10) {
        if (i10 < this.f14080c || i10 > this.f14081d) {
            return -1;
        }
        int i11 = 0;
        int length = (this.f14078a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f14078a[i13];
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

    public final <E> void y(Object obj, long j10, b1 b1Var, c1<E> c1Var, n nVar) {
        b1Var.g(this.f14090n.c(obj, j10), c1Var, nVar);
    }

    public final <E> void z(Object obj, int i10, b1 b1Var, c1<E> c1Var, n nVar) {
        b1Var.i(this.f14090n.c(obj, i10 & 1048575), c1Var, nVar);
    }
}

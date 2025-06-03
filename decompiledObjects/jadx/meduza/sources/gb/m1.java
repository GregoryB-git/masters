package gb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f6601a = Logger.getLogger(m1.class.getName());

    public static Object a(la.a aVar) {
        String c02;
        String str;
        String c03;
        double parseDouble;
        x6.b.I(aVar.I(), "unexpected end of JSON");
        int c10 = q0.g.c(aVar.i0());
        boolean z10 = false;
        if (c10 == 0) {
            int i10 = aVar.f9814o;
            if (i10 == 0) {
                i10 = aVar.g();
            }
            if (i10 != 3) {
                StringBuilder l10 = defpackage.f.l("Expected BEGIN_ARRAY but was ");
                l10.append(defpackage.g.s(aVar.i0()));
                l10.append(aVar.Q());
                throw new IllegalStateException(l10.toString());
            }
            aVar.k0(1);
            aVar.f9820v[aVar.t - 1] = 0;
            aVar.f9814o = 0;
            ArrayList arrayList = new ArrayList();
            while (aVar.I()) {
                arrayList.add(a(aVar));
            }
            boolean z11 = aVar.i0() == 2;
            StringBuilder l11 = defpackage.f.l("Bad token: ");
            l11.append(aVar.H());
            x6.b.I(z11, l11.toString());
            int i11 = aVar.f9814o;
            if (i11 == 0) {
                i11 = aVar.g();
            }
            if (i11 != 4) {
                StringBuilder l12 = defpackage.f.l("Expected END_ARRAY but was ");
                l12.append(defpackage.g.s(aVar.i0()));
                l12.append(aVar.Q());
                throw new IllegalStateException(l12.toString());
            }
            int i12 = aVar.t - 1;
            aVar.t = i12;
            int[] iArr = aVar.f9820v;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            aVar.f9814o = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (c10 == 2) {
            int i14 = aVar.f9814o;
            if (i14 == 0) {
                i14 = aVar.g();
            }
            if (i14 != 1) {
                StringBuilder l13 = defpackage.f.l("Expected BEGIN_OBJECT but was ");
                l13.append(defpackage.g.s(aVar.i0()));
                l13.append(aVar.Q());
                throw new IllegalStateException(l13.toString());
            }
            aVar.k0(3);
            aVar.f9814o = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.I()) {
                int i15 = aVar.f9814o;
                if (i15 == 0) {
                    i15 = aVar.g();
                }
                if (i15 == 14) {
                    c02 = aVar.h0();
                } else if (i15 == 12) {
                    c02 = aVar.c0('\'');
                } else {
                    if (i15 != 13) {
                        StringBuilder l14 = defpackage.f.l("Expected a name but was ");
                        l14.append(defpackage.g.s(aVar.i0()));
                        l14.append(aVar.Q());
                        throw new IllegalStateException(l14.toString());
                    }
                    c02 = aVar.c0('\"');
                }
                aVar.f9814o = 0;
                aVar.f9819u[aVar.t - 1] = c02;
                linkedHashMap.put(c02, a(aVar));
            }
            boolean z12 = aVar.i0() == 4;
            StringBuilder l15 = defpackage.f.l("Bad token: ");
            l15.append(aVar.H());
            x6.b.I(z12, l15.toString());
            int i16 = aVar.f9814o;
            if (i16 == 0) {
                i16 = aVar.g();
            }
            if (i16 != 2) {
                StringBuilder l16 = defpackage.f.l("Expected END_OBJECT but was ");
                l16.append(defpackage.g.s(aVar.i0()));
                l16.append(aVar.Q());
                throw new IllegalStateException(l16.toString());
            }
            int i17 = aVar.t - 1;
            aVar.t = i17;
            aVar.f9819u[i17] = null;
            int[] iArr2 = aVar.f9820v;
            int i18 = i17 - 1;
            iArr2[i18] = iArr2[i18] + 1;
            aVar.f9814o = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (c10 == 5) {
            int i19 = aVar.f9814o;
            if (i19 == 0) {
                i19 = aVar.g();
            }
            if (i19 == 10) {
                str = aVar.h0();
            } else if (i19 == 8) {
                str = aVar.c0('\'');
            } else if (i19 == 9) {
                str = aVar.c0('\"');
            } else if (i19 == 11) {
                str = aVar.f9817r;
                aVar.f9817r = null;
            } else if (i19 == 15) {
                str = Long.toString(aVar.f9815p);
            } else {
                if (i19 != 16) {
                    StringBuilder l17 = defpackage.f.l("Expected a string but was ");
                    l17.append(defpackage.g.s(aVar.i0()));
                    l17.append(aVar.Q());
                    throw new IllegalStateException(l17.toString());
                }
                str = new String(aVar.f9810b, aVar.f9811c, aVar.f9816q);
                aVar.f9811c += aVar.f9816q;
            }
            aVar.f9814o = 0;
            int[] iArr3 = aVar.f9820v;
            int i20 = aVar.t - 1;
            iArr3[i20] = iArr3[i20] + 1;
            return str;
        }
        if (c10 != 6) {
            if (c10 != 7) {
                if (c10 != 8) {
                    StringBuilder l18 = defpackage.f.l("Bad token: ");
                    l18.append(aVar.H());
                    throw new IllegalStateException(l18.toString());
                }
                int i21 = aVar.f9814o;
                if (i21 == 0) {
                    i21 = aVar.g();
                }
                if (i21 != 7) {
                    StringBuilder l19 = defpackage.f.l("Expected null but was ");
                    l19.append(defpackage.g.s(aVar.i0()));
                    l19.append(aVar.Q());
                    throw new IllegalStateException(l19.toString());
                }
                aVar.f9814o = 0;
                int[] iArr4 = aVar.f9820v;
                int i22 = aVar.t - 1;
                iArr4[i22] = iArr4[i22] + 1;
                return null;
            }
            int i23 = aVar.f9814o;
            if (i23 == 0) {
                i23 = aVar.g();
            }
            if (i23 == 5) {
                aVar.f9814o = 0;
                int[] iArr5 = aVar.f9820v;
                int i24 = aVar.t - 1;
                iArr5[i24] = iArr5[i24] + 1;
                z10 = true;
            } else {
                if (i23 != 6) {
                    StringBuilder l20 = defpackage.f.l("Expected a boolean but was ");
                    l20.append(defpackage.g.s(aVar.i0()));
                    l20.append(aVar.Q());
                    throw new IllegalStateException(l20.toString());
                }
                aVar.f9814o = 0;
                int[] iArr6 = aVar.f9820v;
                int i25 = aVar.t - 1;
                iArr6[i25] = iArr6[i25] + 1;
            }
            return Boolean.valueOf(z10);
        }
        int i26 = aVar.f9814o;
        if (i26 == 0) {
            i26 = aVar.g();
        }
        if (i26 == 15) {
            aVar.f9814o = 0;
            int[] iArr7 = aVar.f9820v;
            int i27 = aVar.t - 1;
            iArr7[i27] = iArr7[i27] + 1;
            parseDouble = aVar.f9815p;
        } else {
            if (i26 == 16) {
                aVar.f9817r = new String(aVar.f9810b, aVar.f9811c, aVar.f9816q);
                aVar.f9811c += aVar.f9816q;
            } else {
                if (i26 == 8 || i26 == 9) {
                    c03 = aVar.c0(i26 == 8 ? '\'' : '\"');
                } else if (i26 == 10) {
                    c03 = aVar.h0();
                } else if (i26 != 11) {
                    StringBuilder l21 = defpackage.f.l("Expected a double but was ");
                    l21.append(defpackage.g.s(aVar.i0()));
                    l21.append(aVar.Q());
                    throw new IllegalStateException(l21.toString());
                }
                aVar.f9817r = c03;
            }
            aVar.f9814o = 11;
            parseDouble = Double.parseDouble(aVar.f9817r);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new y3.a("JSON forbids NaN and infinities: " + parseDouble + aVar.Q());
            }
            aVar.f9817r = null;
            aVar.f9814o = 0;
            int[] iArr8 = aVar.f9820v;
            int i28 = aVar.t - 1;
            iArr8[i28] = iArr8[i28] + 1;
        }
        return Double.valueOf(parseDouble);
    }
}

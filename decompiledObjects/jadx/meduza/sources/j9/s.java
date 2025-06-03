package j9;

import b.z;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ka.d0;
import ka.u;
import ma.a0;
import ma.h;
import ma.n1;
import oa.a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f8707a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f8708b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f8709c;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f8710d;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f8711e;
    public static final d0 f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f8712g;

    /* renamed from: h, reason: collision with root package name */
    public static d0 f8713h;

    /* renamed from: i, reason: collision with root package name */
    public static d0 f8714i;

    /* renamed from: j, reason: collision with root package name */
    public static d0 f8715j;

    /* renamed from: k, reason: collision with root package name */
    public static d0 f8716k;

    /* renamed from: l, reason: collision with root package name */
    public static d0 f8717l;

    /* renamed from: m, reason: collision with root package name */
    public static d0 f8718m;

    /* renamed from: n, reason: collision with root package name */
    public static d0 f8719n;

    /* renamed from: o, reason: collision with root package name */
    public static d0 f8720o;

    /* renamed from: p, reason: collision with root package name */
    public static d0 f8721p;

    static {
        d0.a d02 = d0.d0();
        d02.q(Double.NaN);
        f8707a = d02.k();
        d0.a d03 = d0.d0();
        d03.m();
        d0.N((d0) d03.f11120b);
        d0 k10 = d03.k();
        f8708b = k10;
        f8709c = k10;
        d0.a d04 = d0.d0();
        d04.v("__max__");
        d0 k11 = d04.k();
        f8710d = k11;
        d0.a d05 = d0.d0();
        u.a M = u.M();
        M.p(k11, "__type__");
        d05.t(M);
        f8711e = d05.k();
        d0.a d06 = d0.d0();
        d06.v("__vector__");
        d0 k12 = d06.k();
        f = k12;
        d0.a d07 = d0.d0();
        u.a M2 = u.M();
        M2.p(k12, "__type__");
        d0.a d08 = d0.d0();
        d08.p(ka.b.M());
        M2.p(d08.k(), "value");
        d07.t(M2);
        f8712g = d07.k();
        d0.a d09 = d0.d0();
        d09.m();
        d0.O((d0) d09.f11120b, false);
        f8713h = d09.k();
        d0.a d010 = d0.d0();
        d010.q(Double.NaN);
        f8714i = d010.k();
        d0.a d011 = d0.d0();
        n1.a L = n1.L();
        L.p(Long.MIN_VALUE);
        d011.w(L);
        f8715j = d011.k();
        d0.a d012 = d0.d0();
        d012.v("");
        f8716k = d012.k();
        d0.a d013 = d0.d0();
        h.C0164h c0164h = ma.h.f10961b;
        d013.m();
        d0.I((d0) d013.f11120b, c0164h);
        f8717l = d013.k();
        i g10 = i.g();
        d0.a d014 = d0.d0();
        String format = String.format("projects/%s/databases/%s/documents/%s", "", "", g10.toString());
        d014.m();
        d0.J((d0) d014.f11120b, format);
        f8718m = d014.k();
        d0.a d015 = d0.d0();
        a.C0190a L2 = oa.a.L();
        L2.m();
        oa.a.G((oa.a) L2.f11120b, -90.0d);
        L2.m();
        oa.a.H((oa.a) L2.f11120b, -180.0d);
        d015.r(L2);
        f8719n = d015.k();
        d0.a d016 = d0.d0();
        ka.b J = ka.b.J();
        d016.m();
        d0.L(J, (d0) d016.f11120b);
        f8720o = d016.k();
        d0.a d017 = d0.d0();
        d017.u(u.H());
        f8721p = d017.k();
    }

    public static String a(d0 d0Var) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, d0Var);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, d0 d0Var) {
        String str;
        boolean z10 = true;
        switch (q0.g.c(d0Var.c0())) {
            case 0:
                str = "null";
                break;
            case 1:
                sb2.append(d0Var.S());
                return;
            case 2:
                sb2.append(d0Var.X());
                return;
            case 3:
                sb2.append(d0Var.V());
                return;
            case 4:
                n1 b02 = d0Var.b0();
                sb2.append(String.format("time(%s,%s)", Long.valueOf(b02.K()), Integer.valueOf(b02.J())));
                return;
            case 5:
                str = d0Var.a0();
                break;
            case 6:
                str = n9.o.i(d0Var.T());
                break;
            case 7:
                x6.b.Z("Value should be a ReferenceValue", k(d0Var), new Object[0]);
                sb2.append(i.h(d0Var.Z()));
                return;
            case 8:
                oa.a W = d0Var.W();
                sb2.append(String.format("geo(%s,%s)", Double.valueOf(W.J()), Double.valueOf(W.K())));
                return;
            case 9:
                ka.b R = d0Var.R();
                sb2.append("[");
                for (int i10 = 0; i10 < R.L(); i10++) {
                    b(sb2, R.K(i10));
                    if (i10 != R.L() - 1) {
                        sb2.append(",");
                    }
                }
                sb2.append("]");
                return;
            case 10:
                u Y = d0Var.Y();
                ArrayList arrayList = new ArrayList(Y.J().keySet());
                Collections.sort(arrayList);
                sb2.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(",");
                    }
                    sb2.append(str2);
                    sb2.append(":");
                    b(sb2, Y.L(str2));
                }
                sb2.append("}");
                return;
            default:
                StringBuilder l10 = defpackage.f.l("Invalid value type: ");
                l10.append(defpackage.f.s(d0Var.c0()));
                x6.b.T(l10.toString(), new Object[0]);
                throw null;
        }
        sb2.append(str);
    }

    public static int c(d0 d0Var, d0 d0Var2) {
        int n2 = n(d0Var);
        int n10 = n(d0Var2);
        if (n2 != n10) {
            return n9.o.d(n2, n10);
        }
        if (n2 == Integer.MAX_VALUE) {
            return 0;
        }
        switch (n2) {
            case 0:
                return 0;
            case 1:
                boolean S = d0Var.S();
                boolean S2 = d0Var2.S();
                r3.j jVar = n9.o.f11373a;
                if (S == S2) {
                    return 0;
                }
                return S ? 1 : -1;
            case 2:
                if (d0Var.c0() == 4) {
                    double V = d0Var.V();
                    if (d0Var2.c0() == 4) {
                        double V2 = d0Var2.V();
                        r3.j jVar2 = n9.o.f11373a;
                        return z.j(V, V2);
                    }
                    if (d0Var2.c0() == 3) {
                        return n9.o.e(V, d0Var2.X());
                    }
                } else if (d0Var.c0() == 3) {
                    long X = d0Var.X();
                    if (d0Var2.c0() == 3) {
                        long X2 = d0Var2.X();
                        r3.j jVar3 = n9.o.f11373a;
                        return Long.compare(X, X2);
                    }
                    if (d0Var2.c0() == 4) {
                        return n9.o.e(d0Var2.V(), X) * (-1);
                    }
                }
                x6.b.T("Unexpected values: %s vs %s", d0Var, d0Var2);
                throw null;
            case 3:
                return e(d0Var.b0(), d0Var2.b0());
            case 4:
                return e(p.a(d0Var), p.a(d0Var2));
            case 5:
                String a02 = d0Var.a0();
                String a03 = d0Var2.a0();
                r3.j jVar4 = n9.o.f11373a;
                h.C0164h c0164h = ma.h.f10961b;
                Charset charset = a0.f10909a;
                return n9.o.c(new h.C0164h(a02.getBytes(charset)), new h.C0164h(a03.getBytes(charset)));
            case 6:
                return n9.o.c(d0Var.T(), d0Var2.T());
            case 7:
                String Z = d0Var.Z();
                String Z2 = d0Var2.Z();
                String[] split = Z.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
                String[] split2 = Z2.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
                int min = Math.min(split.length, split2.length);
                while (r2 < min) {
                    int compareTo = split[r2].compareTo(split2[r2]);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    r2++;
                }
                return n9.o.d(split.length, split2.length);
            case 8:
                oa.a W = d0Var.W();
                oa.a W2 = d0Var2.W();
                double J = W.J();
                double J2 = W2.J();
                r3.j jVar5 = n9.o.f11373a;
                int j10 = z.j(J, J2);
                return j10 == 0 ? z.j(W.K(), W2.K()) : j10;
            case 9:
                return d(d0Var.R(), d0Var2.R());
            case 10:
                u Y = d0Var.Y();
                u Y2 = d0Var2.Y();
                Map<String, d0> J3 = Y.J();
                Map<String, d0> J4 = Y2.J();
                ka.b R = J3.get("value").R();
                ka.b R2 = J4.get("value").R();
                int d10 = n9.o.d(R.L(), R2.L());
                return d10 != 0 ? d10 : d(R, R2);
            case 11:
                u Y3 = d0Var.Y();
                u Y4 = d0Var2.Y();
                Iterator it = new TreeMap(Y3.J()).entrySet().iterator();
                Iterator it2 = new TreeMap(Y4.J()).entrySet().iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry2.getKey();
                    r3.j jVar6 = n9.o.f11373a;
                    h.C0164h c0164h2 = ma.h.f10961b;
                    Charset charset2 = a0.f10909a;
                    int c10 = n9.o.c(new h.C0164h(str.getBytes(charset2)), new h.C0164h(str2.getBytes(charset2)));
                    if (c10 != 0) {
                        return c10;
                    }
                    int c11 = c((d0) entry.getValue(), (d0) entry2.getValue());
                    if (c11 != 0) {
                        return c11;
                    }
                }
                boolean hasNext = it.hasNext();
                boolean hasNext2 = it2.hasNext();
                r3.j jVar7 = n9.o.f11373a;
                return hasNext != hasNext2 ? hasNext ? 1 : -1 : 0;
            default:
                x6.b.T(defpackage.f.h("Invalid value type: ", n2), new Object[0]);
                throw null;
        }
    }

    public static int d(ka.b bVar, ka.b bVar2) {
        int min = Math.min(bVar.L(), bVar2.L());
        for (int i10 = 0; i10 < min; i10++) {
            int c10 = c(bVar.K(i10), bVar2.K(i10));
            if (c10 != 0) {
                return c10;
            }
        }
        return n9.o.d(bVar.L(), bVar2.L());
    }

    public static int e(n1 n1Var, n1 n1Var2) {
        long K = n1Var.K();
        long K2 = n1Var2.K();
        r3.j jVar = n9.o.f11373a;
        int compare = Long.compare(K, K2);
        return compare != 0 ? compare : n9.o.d(n1Var.J(), n1Var2.J());
    }

    public static boolean f(ka.c cVar, d0 d0Var) {
        Iterator<d0> it = cVar.h().iterator();
        while (it.hasNext()) {
            if (g(it.next(), d0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        if (r5.X() == r6.X()) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.V()) == java.lang.Double.doubleToLongBits(r6.V())) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(ka.d0 r5, ka.d0 r6) {
        /*
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Le8
            if (r6 != 0) goto Lb
            goto Le8
        Lb:
            int r2 = n(r5)
            int r3 = n(r6)
            if (r2 == r3) goto L16
            return r1
        L16:
            r3 = 2
            r4 = 4
            if (r2 == r3) goto Lab
            if (r2 == r4) goto L9e
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L9d
            switch(r2) {
                case 9: goto L70;
                case 10: goto L29;
                case 11: goto L29;
                default: goto L24;
            }
        L24:
            boolean r5 = r5.equals(r6)
            return r5
        L29:
            ka.u r5 = r5.Y()
            ka.u r6 = r6.Y()
            int r2 = r5.I()
            int r3 = r6.I()
            if (r2 == r3) goto L3c
            goto L6e
        L3c:
            java.util.Map r5 = r5.J()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r3 = r6.J()
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            ka.d0 r3 = (ka.d0) r3
            java.lang.Object r2 = r2.getValue()
            ka.d0 r2 = (ka.d0) r2
            boolean r2 = g(r2, r3)
            if (r2 != 0) goto L48
        L6e:
            r0 = r1
        L6f:
            return r0
        L70:
            ka.b r5 = r5.R()
            ka.b r6 = r6.R()
            int r2 = r5.L()
            int r3 = r6.L()
            if (r2 == r3) goto L83
            goto L98
        L83:
            r2 = r1
        L84:
            int r3 = r5.L()
            if (r2 >= r3) goto L9d
            ka.d0 r3 = r5.K(r2)
            ka.d0 r4 = r6.K(r2)
            boolean r3 = g(r3, r4)
            if (r3 != 0) goto L9a
        L98:
            r0 = r1
            goto L9d
        L9a:
            int r2 = r2 + 1
            goto L84
        L9d:
            return r0
        L9e:
            ma.n1 r5 = j9.p.a(r5)
            ma.n1 r6 = j9.p.a(r6)
            boolean r5 = r5.equals(r6)
            return r5
        Lab:
            int r2 = r5.c0()
            r3 = 3
            if (r2 != r3) goto Lc5
            int r2 = r6.c0()
            if (r2 != r3) goto Lc5
            long r2 = r5.X()
            long r5 = r6.X()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Le6
            goto Le7
        Lc5:
            int r2 = r5.c0()
            if (r2 != r4) goto Le8
            int r2 = r6.c0()
            if (r2 != r4) goto Le8
            double r2 = r5.V()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r5 = r6.V()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Le6
            goto Le7
        Le6:
            r0 = r1
        Le7:
            r1 = r0
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.s.g(ka.d0, ka.d0):boolean");
    }

    public static boolean h(d0 d0Var) {
        return d0Var != null && d0Var.c0() == 10;
    }

    public static boolean i(d0 d0Var) {
        return d0Var != null && d0Var.c0() == 4;
    }

    public static boolean j(d0 d0Var) {
        return d0Var != null && d0Var.c0() == 3;
    }

    public static boolean k(d0 d0Var) {
        return d0Var != null && d0Var.c0() == 8;
    }

    public static boolean l(d0 d0Var) {
        return f.equals(d0Var.Y().J().get("__type__"));
    }

    public static d0 m(f fVar, i iVar) {
        d0.a d02 = d0.d0();
        String format = String.format("projects/%s/databases/%s/documents/%s", fVar.f8678a, fVar.f8679b, iVar.toString());
        d02.m();
        d0.J((d0) d02.f11120b, format);
        return d02.k();
    }

    public static int n(d0 d0Var) {
        switch (q0.g.c(d0Var.c0())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (p.c(d0Var)) {
                    return 4;
                }
                if (f8710d.equals(d0Var.Y().J().get("__type__"))) {
                    return Integer.MAX_VALUE;
                }
                return l(d0Var) ? 10 : 11;
            default:
                StringBuilder l10 = defpackage.f.l("Invalid value type: ");
                l10.append(defpackage.f.s(d0Var.c0()));
                x6.b.T(l10.toString(), new Object[0]);
                throw null;
        }
    }
}

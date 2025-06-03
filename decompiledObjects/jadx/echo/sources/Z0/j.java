package Z0;

import F0.E;
import X2.AbstractC0703v;
import d0.C1194q;
import d0.C1201x;
import g0.z;
import h0.C1326a;

/* loaded from: classes.dex */
public abstract class j {
    public static T0.e a(int i7, z zVar) {
        int p7 = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            String B7 = zVar.B(p7 - 16);
            return new T0.e("und", B7, B7);
        }
        g0.o.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i7));
        return null;
    }

    public static T0.a b(z zVar) {
        String str;
        int p7 = zVar.p();
        if (zVar.p() == 1684108385) {
            int b7 = a.b(zVar.p());
            String str2 = b7 == 13 ? "image/jpeg" : b7 == 14 ? "image/png" : null;
            if (str2 != null) {
                zVar.U(4);
                int i7 = p7 - 16;
                byte[] bArr = new byte[i7];
                zVar.l(bArr, 0, i7);
                return new T0.a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + b7;
        } else {
            str = "Failed to parse cover art attribute";
        }
        g0.o.h("MetadataUtil", str);
        return null;
    }

    public static C1201x.b c(z zVar) {
        int f7 = zVar.f() + zVar.p();
        int p7 = zVar.p();
        int i7 = (p7 >> 24) & 255;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = 16777215 & p7;
                if (i8 == 6516084) {
                    return a(p7, zVar);
                }
                if (i8 == 7233901 || i8 == 7631467) {
                    return j(p7, "TIT2", zVar);
                }
                if (i8 == 6516589 || i8 == 7828084) {
                    return j(p7, "TCOM", zVar);
                }
                if (i8 == 6578553) {
                    return j(p7, "TDRC", zVar);
                }
                if (i8 == 4280916) {
                    return j(p7, "TPE1", zVar);
                }
                if (i8 == 7630703) {
                    return j(p7, "TSSE", zVar);
                }
                if (i8 == 6384738) {
                    return j(p7, "TALB", zVar);
                }
                if (i8 == 7108978) {
                    return j(p7, "USLT", zVar);
                }
                if (i8 == 6776174) {
                    return j(p7, "TCON", zVar);
                }
                if (i8 == 6779504) {
                    return j(p7, "TIT1", zVar);
                }
            } else {
                if (p7 == 1735291493) {
                    return i(zVar);
                }
                if (p7 == 1684632427) {
                    return d(p7, "TPOS", zVar);
                }
                if (p7 == 1953655662) {
                    return d(p7, "TRCK", zVar);
                }
                if (p7 == 1953329263) {
                    return f(p7, "TBPM", zVar, true, false);
                }
                if (p7 == 1668311404) {
                    return f(p7, "TCMP", zVar, true, true);
                }
                if (p7 == 1668249202) {
                    return b(zVar);
                }
                if (p7 == 1631670868) {
                    return j(p7, "TPE2", zVar);
                }
                if (p7 == 1936682605) {
                    return j(p7, "TSOT", zVar);
                }
                if (p7 == 1936679276) {
                    return j(p7, "TSOA", zVar);
                }
                if (p7 == 1936679282) {
                    return j(p7, "TSOP", zVar);
                }
                if (p7 == 1936679265) {
                    return j(p7, "TSO2", zVar);
                }
                if (p7 == 1936679791) {
                    return j(p7, "TSOC", zVar);
                }
                if (p7 == 1920233063) {
                    return f(p7, "ITUNESADVISORY", zVar, false, false);
                }
                if (p7 == 1885823344) {
                    return f(p7, "ITUNESGAPLESS", zVar, false, true);
                }
                if (p7 == 1936683886) {
                    return j(p7, "TVSHOWSORT", zVar);
                }
                if (p7 == 1953919848) {
                    return j(p7, "TVSHOW", zVar);
                }
                if (p7 == 757935405) {
                    return g(zVar, f7);
                }
            }
            g0.o.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(p7));
            zVar.T(f7);
            return null;
        } finally {
            zVar.T(f7);
        }
    }

    public static T0.n d(int i7, String str, z zVar) {
        int p7 = zVar.p();
        if (zVar.p() == 1684108385 && p7 >= 22) {
            zVar.U(10);
            int M6 = zVar.M();
            if (M6 > 0) {
                String str2 = "" + M6;
                int M7 = zVar.M();
                if (M7 > 0) {
                    str2 = str2 + "/" + M7;
                }
                return new T0.n(str, null, AbstractC0703v.Z(str2));
            }
        }
        g0.o.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i7));
        return null;
    }

    public static int e(z zVar) {
        int p7 = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            int i7 = p7 - 16;
            if (i7 == 1) {
                return zVar.G();
            }
            if (i7 == 2) {
                return zVar.M();
            }
            if (i7 == 3) {
                return zVar.J();
            }
            if (i7 == 4 && (zVar.j() & 128) == 0) {
                return zVar.K();
            }
        }
        g0.o.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static T0.i f(int i7, String str, z zVar, boolean z7, boolean z8) {
        int e7 = e(zVar);
        if (z8) {
            e7 = Math.min(1, e7);
        }
        if (e7 >= 0) {
            return z7 ? new T0.n(str, null, AbstractC0703v.Z(Integer.toString(e7))) : new T0.e("und", str, Integer.toString(e7));
        }
        g0.o.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i7));
        return null;
    }

    public static T0.i g(z zVar, int i7) {
        String str = null;
        String str2 = null;
        int i8 = -1;
        int i9 = -1;
        while (zVar.f() < i7) {
            int f7 = zVar.f();
            int p7 = zVar.p();
            int p8 = zVar.p();
            zVar.U(4);
            if (p8 == 1835360622) {
                str = zVar.B(p7 - 12);
            } else if (p8 == 1851878757) {
                str2 = zVar.B(p7 - 12);
            } else {
                if (p8 == 1684108385) {
                    i8 = f7;
                    i9 = p7;
                }
                zVar.U(p7 - 12);
            }
        }
        if (str == null || str2 == null || i8 == -1) {
            return null;
        }
        zVar.T(i8);
        zVar.U(16);
        return new T0.k(str, str2, zVar.B(i9 - 16));
    }

    public static C1326a h(z zVar, int i7, String str) {
        while (true) {
            int f7 = zVar.f();
            if (f7 >= i7) {
                return null;
            }
            int p7 = zVar.p();
            if (zVar.p() == 1684108385) {
                int p8 = zVar.p();
                int p9 = zVar.p();
                int i8 = p7 - 16;
                byte[] bArr = new byte[i8];
                zVar.l(bArr, 0, i8);
                return new C1326a(str, bArr, p9, p8);
            }
            zVar.T(f7 + p7);
        }
    }

    public static T0.n i(z zVar) {
        String a7 = T0.j.a(e(zVar) - 1);
        if (a7 != null) {
            return new T0.n("TCON", null, AbstractC0703v.Z(a7));
        }
        g0.o.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static T0.n j(int i7, String str, z zVar) {
        int p7 = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            return new T0.n(str, null, AbstractC0703v.Z(zVar.B(p7 - 16)));
        }
        g0.o.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i7));
        return null;
    }

    public static void k(int i7, E e7, C1194q.b bVar) {
        if (i7 == 1 && e7.a()) {
            bVar.V(e7.f1755a).W(e7.f1756b);
        }
    }

    public static void l(int i7, C1201x c1201x, C1194q.b bVar, C1201x... c1201xArr) {
        C1201x c1201x2 = new C1201x(new C1201x.b[0]);
        if (c1201x != null) {
            for (int i8 = 0; i8 < c1201x.e(); i8++) {
                C1201x.b d7 = c1201x.d(i8);
                if (d7 instanceof C1326a) {
                    C1326a c1326a = (C1326a) d7;
                    if (!c1326a.f14515o.equals("com.android.capture.fps")) {
                        c1201x2 = c1201x2.a(c1326a);
                    } else if (i7 == 2) {
                        c1201x2 = c1201x2.a(c1326a);
                    }
                }
            }
        }
        for (C1201x c1201x3 : c1201xArr) {
            c1201x2 = c1201x2.b(c1201x3);
        }
        if (c1201x2.e() > 0) {
            bVar.h0(c1201x2);
        }
    }
}

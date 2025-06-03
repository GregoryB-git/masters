/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package Z0;

import F0.E;
import T0.e;
import T0.i;
import T0.k;
import T0.n;
import X2.v;
import Z0.a;
import d0.q;
import d0.x;
import g0.o;
import g0.z;
import java.util.List;

public abstract class j {
    public static e a(int n8, z object) {
        int n9 = object.p();
        if (object.p() == 1684108385) {
            object.U(8);
            object = object.B(n9 - 16);
            return new e("und", (String)object, (String)object);
        }
        object = new StringBuilder();
        object.append("Failed to parse comment attribute: ");
        object.append(a.a(n8));
        o.h("MetadataUtil", object.toString());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static T0.a b(z object) {
        int n8 = object.p();
        if (object.p() == 1684108385) {
            int n9 = a.b(object.p());
            String string2 = n9 == 13 ? "image/jpeg" : (n9 == 14 ? "image/png" : null);
            if (string2 != null) {
                object.U(4);
                byte[] arrby = new byte[n8 -= 16];
                object.l(arrby, 0, n8);
                return new T0.a(string2, null, 3, arrby);
            }
            object = new StringBuilder();
            object.append("Unrecognized cover art flags: ");
            object.append(n9);
            object = object.toString();
        } else {
            object = "Failed to parse cover art attribute";
        }
        o.h("MetadataUtil", (String)object);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static x.b c(z var0) {
        block60 : {
            block55 : {
                block58 : {
                    block59 : {
                        block57 : {
                            block56 : {
                                var1_1 = var0.f() + var0.p();
                                var2_2 = var0.p();
                                var3_3 = var2_2 >> 24 & 255;
                                if (var3_3 == 169 || var3_3 == 253) break block56;
                                if (var2_2 == 1735291493) {
                                    var4_4 = j.i(var0);
                                    var0.T(var1_1);
                                    return var4_4;
                                }
                                if (var2_2 == 1684632427) {
                                    var4_6 = j.d(var2_2, "TPOS", var0);
                                    var0.T(var1_1);
                                    return var4_6;
                                }
                                if (var2_2 == 1953655662) {
                                    var4_7 = j.d(var2_2, "TRCK", var0);
                                    var0.T(var1_1);
                                    return var4_7;
                                }
                                if (var2_2 == 1953329263) {
                                    var4_8 = j.f(var2_2, "TBPM", var0, true, false);
                                    var0.T(var1_1);
                                    return var4_8;
                                }
                                if (var2_2 == 1668311404) {
                                    var4_9 = j.f(var2_2, "TCMP", var0, true, true);
                                    var0.T(var1_1);
                                    return var4_9;
                                }
                                if (var2_2 == 1668249202) {
                                    var4_10 = j.b(var0);
                                    var0.T(var1_1);
                                    return var4_10;
                                }
                                if (var2_2 == 1631670868) {
                                    var4_11 = j.j(var2_2, "TPE2", var0);
                                    var0.T(var1_1);
                                    return var4_11;
                                }
                                if (var2_2 == 1936682605) {
                                    var4_12 = j.j(var2_2, "TSOT", var0);
                                    var0.T(var1_1);
                                    return var4_12;
                                }
                                if (var2_2 == 1936679276) {
                                    var4_13 = j.j(var2_2, "TSOA", var0);
                                    var0.T(var1_1);
                                    return var4_13;
                                }
                                if (var2_2 == 1936679282) {
                                    var4_14 = j.j(var2_2, "TSOP", var0);
                                    var0.T(var1_1);
                                    return var4_14;
                                }
                                if (var2_2 == 1936679265) {
                                    var4_15 = j.j(var2_2, "TSO2", var0);
                                    var0.T(var1_1);
                                    return var4_15;
                                }
                                if (var2_2 == 1936679791) {
                                    var4_16 = j.j(var2_2, "TSOC", var0);
                                    var0.T(var1_1);
                                    return var4_16;
                                }
                                if (var2_2 == 1920233063) {
                                    var4_17 = j.f(var2_2, "ITUNESADVISORY", var0, false, false);
                                    var0.T(var1_1);
                                    return var4_17;
                                }
                                if (var2_2 == 1885823344) {
                                    var4_18 = j.f(var2_2, "ITUNESGAPLESS", var0, false, true);
                                    var0.T(var1_1);
                                    return var4_18;
                                }
                                if (var2_2 == 1936683886) {
                                    var4_19 = j.j(var2_2, "TVSHOWSORT", var0);
                                    var0.T(var1_1);
                                    return var4_19;
                                }
                                if (var2_2 == 1953919848) {
                                    var4_20 = j.j(var2_2, "TVSHOW", var0);
                                    var0.T(var1_1);
                                    return var4_20;
                                }
                                if (var2_2 == 757935405) {
                                    var4_21 = j.g(var0, var1_1);
                                    var0.T(var1_1);
                                    return var4_21;
                                }
                                break block57;
                            }
                            var3_3 = 16777215 & var2_2;
                            if (var3_3 == 6516084) {
                                var4_22 = j.a(var2_2, var0);
                                var0.T(var1_1);
                                return var4_22;
                            }
                            if (var3_3 == 7233901 || var3_3 == 7631467) break block58;
                            if (var3_3 != 6516589 && var3_3 != 7828084) {
                                if (var3_3 == 6578553) {
                                    var4_23 = j.j(var2_2, "TDRC", var0);
                                    var0.T(var1_1);
                                    return var4_23;
                                }
                                if (var3_3 == 4280916) {
                                    var4_24 = j.j(var2_2, "TPE1", var0);
                                    var0.T(var1_1);
                                    return var4_24;
                                }
                                if (var3_3 == 7630703) {
                                    var4_25 = j.j(var2_2, "TSSE", var0);
                                    var0.T(var1_1);
                                    return var4_25;
                                }
                                if (var3_3 == 6384738) {
                                    var4_26 = j.j(var2_2, "TALB", var0);
                                    var0.T(var1_1);
                                    return var4_26;
                                }
                                if (var3_3 == 7108978) {
                                    var4_27 = j.j(var2_2, "USLT", var0);
                                    var0.T(var1_1);
                                    return var4_27;
                                }
                                if (var3_3 == 6776174) {
                                    var4_28 = j.j(var2_2, "TCON", var0);
                                    var0.T(var1_1);
                                    return var4_28;
                                }
                                if (var3_3 == 6779504) {
                                    var4_29 = j.j(var2_2, "TIT1", var0);
                                    var0.T(var1_1);
                                    return var4_29;
                                } else {
                                    ** GOTO lbl136
                                }
                            }
                            break block59;
                        }
                        try {
                            var4_30 = new StringBuilder();
                            var4_30.append("Skipped unknown metadata entry: ");
                            var4_30.append(a.a(var2_2));
                            o.b("MetadataUtil", var4_30.toString());
                        }
                        catch (Throwable var4_5) {}
                        var0.T(var1_1);
                        return null;
                    }
                    var4_31 = j.j(var2_2, "TCOM", var0);
                    var0.T(var1_1);
                    return var4_31;
                }
                var4_32 = j.j(var2_2, "TIT2", var0);
                break block55;
                break block60;
            }
            var0.T(var1_1);
            return var4_32;
        }
        var0.T(var1_1);
        throw var4_5;
    }

    public static n d(int n8, String string2, z object) {
        int n9 = object.p();
        if (object.p() == 1684108385 && n9 >= 22) {
            object.U(10);
            n9 = object.M();
            if (n9 > 0) {
                Object object2 = new StringBuilder();
                object2.append("");
                object2.append(n9);
                object2 = object2.toString();
                n8 = object.M();
                object = object2;
                if (n8 > 0) {
                    object = new StringBuilder();
                    object.append((String)object2);
                    object.append("/");
                    object.append(n8);
                    object = object.toString();
                }
                return new n(string2, null, v.Z(object));
            }
        }
        string2 = new StringBuilder();
        string2.append("Failed to parse index/count attribute: ");
        string2.append(a.a(n8));
        o.h("MetadataUtil", string2.toString());
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int e(z z8) {
        int n8 = z8.p();
        if (z8.p() == 1684108385) {
            z8.U(8);
            if ((n8 -= 16) == 1) return z8.G();
            if (n8 == 2) return z8.M();
            if (n8 == 3) return z8.J();
            if (n8 == 4 && (z8.j() & 128) == 0) {
                return z8.K();
            }
        }
        o.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static i f(int n8, String string2, z z8, boolean bl, boolean bl2) {
        int n9;
        int n10 = n9 = j.e(z8);
        if (bl2) {
            n10 = Math.min((int)1, (int)n9);
        }
        if (n10 >= 0) {
            if (bl) {
                return new n(string2, null, v.Z(Integer.toString((int)n10)));
            }
            return new e("und", string2, Integer.toString((int)n10));
        }
        string2 = new StringBuilder();
        string2.append("Failed to parse uint8 attribute: ");
        string2.append(a.a(n8));
        o.h("MetadataUtil", string2.toString());
        return null;
    }

    public static i g(z z8, int n8) {
        String string2;
        int n9;
        String string3 = string2 = null;
        int n10 = n9 = -1;
        while (z8.f() < n8) {
            int n11 = z8.f();
            int n12 = z8.p();
            int n13 = z8.p();
            z8.U(4);
            if (n13 == 1835360622) {
                string2 = z8.B(n12 - 12);
                continue;
            }
            if (n13 == 1851878757) {
                string3 = z8.B(n12 - 12);
                continue;
            }
            if (n13 == 1684108385) {
                n9 = n11;
                n10 = n12;
            }
            z8.U(n12 - 12);
        }
        if (string2 != null && string3 != null) {
            if (n9 == -1) {
                return null;
            }
            z8.T(n9);
            z8.U(16);
            return new k(string2, string3, z8.B(n10 - 16));
        }
        return null;
    }

    public static h0.a h(z z8, int n8, String string2) {
        int n9;
        while ((n9 = z8.f()) < n8) {
            int n10 = z8.p();
            if (z8.p() == 1684108385) {
                n8 = z8.p();
                n9 = z8.p();
                byte[] arrby = new byte[n10 -= 16];
                z8.l(arrby, 0, n10);
                return new h0.a(string2, arrby, n9, n8);
            }
            z8.T(n9 + n10);
        }
        return null;
    }

    public static n i(z object) {
        if ((object = T0.j.a(j.e((z)object) - 1)) != null) {
            return new n("TCON", null, v.Z(object));
        }
        o.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static n j(int n8, String string2, z z8) {
        int n9 = z8.p();
        if (z8.p() == 1684108385) {
            z8.U(8);
            return new n(string2, null, v.Z(z8.B(n9 - 16)));
        }
        string2 = new StringBuilder();
        string2.append("Failed to parse text attribute: ");
        string2.append(a.a(n8));
        o.h("MetadataUtil", string2.toString());
        return null;
    }

    public static void k(int n8, E e8, q.b b8) {
        if (n8 == 1 && e8.a()) {
            b8.V(e8.a).W(e8.b);
        }
    }

    public static /* varargs */ void l(int n8, x x8, q.b b8, x ... arrx) {
        x x9;
        int n9;
        int n10 = 0;
        x x10 = x9 = new x(new x.b[0]);
        if (x8 != null) {
            n9 = 0;
            do {
                x10 = x9;
                if (n9 >= x8.e()) break;
                x.b b9 = x8.d(n9);
                x10 = x9;
                if (b9 instanceof h0.a) {
                    b9 = (h0.a)b9;
                    if (b9.o.equals((Object)"com.android.capture.fps")) {
                        x10 = x9;
                        if (n8 == 2) {
                            x10 = x9.a(b9);
                        }
                    } else {
                        x10 = x9.a(b9);
                    }
                }
                ++n9;
                x9 = x10;
            } while (true);
        }
        n9 = arrx.length;
        for (n8 = n10; n8 < n9; ++n8) {
            x10 = x10.b(arrx[n8]);
        }
        if (x10.e() > 0) {
            b8.h0(x10);
        }
    }
}


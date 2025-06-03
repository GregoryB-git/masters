/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d0;

import g0.M;
import java.util.Arrays;

public final class h {
    public static final h h = new b().d(1).c(2).e(3).a();
    public static final h i = new b().d(1).c(1).e(2).a();
    public static final String j = M.w0(0);
    public static final String k = M.w0(1);
    public static final String l = M.w0(2);
    public static final String m = M.w0(3);
    public static final String n = M.w0(4);
    public static final String o = M.w0(5);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    public h(int n8, int n9, int n10, byte[] arrby, int n11, int n12) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = arrby;
        this.e = n11;
        this.f = n12;
    }

    public /* synthetic */ h(int n8, int n9, int n10, byte[] arrby, int n11, int n12,  a8) {
        this(n8, n9, n10, arrby, n11, n12);
    }

    public static String b(int n8) {
        if (n8 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n8);
            stringBuilder.append("bit Chroma");
            return stringBuilder.toString();
        }
        return "NA";
    }

    public static String c(int n8) {
        if (n8 != -1) {
            if (n8 != 1) {
                if (n8 != 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Undefined color range ");
                    stringBuilder.append(n8);
                    return stringBuilder.toString();
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String d(int n8) {
        if (n8 != -1) {
            if (n8 != 6) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Undefined color space ");
                        stringBuilder.append(n8);
                        return stringBuilder.toString();
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String e(int n8) {
        if (n8 != -1) {
            if (n8 != 10) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 6) {
                                if (n8 != 7) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Undefined color transfer ");
                                    stringBuilder.append(n8);
                                    return stringBuilder.toString();
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean h(h h8) {
        boolean bl = true;
        if (h8 == null) {
            return true;
        }
        int n8 = h8.a;
        if (n8 != -1 && n8 != 1) {
            if (n8 != 2) return false;
        }
        if ((n8 = h8.b) != -1) {
            if (n8 != 2) return false;
        }
        if ((n8 = h8.c) != -1) {
            if (n8 != 3) return false;
        }
        if (h8.d != null) return false;
        n8 = h8.f;
        if (n8 != -1) {
            if (n8 != 8) return false;
        }
        if ((n8 = h8.e) == -1) return bl;
        if (n8 != 8) return false;
        return true;
    }

    public static int j(int n8) {
        if (n8 != 1) {
            if (n8 != 9) {
                if (n8 != 4 && n8 != 5 && n8 != 6 && n8 != 7) {
                    return -1;
                }
                return 2;
            }
            return 6;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int k(int n8) {
        if (n8 == 1) return 3;
        if (n8 == 4) return 10;
        if (n8 == 13) return 2;
        if (n8 == 16) return 6;
        if (n8 == 18) return 7;
        if (n8 == 6 || n8 == 7) return 3;
        return -1;
    }

    public static String l(int n8) {
        if (n8 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n8);
            stringBuilder.append("bit Luma");
            return stringBuilder.toString();
        }
        return "NA";
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (h.class != object.getClass()) {
                return false;
            }
            object = (h)object;
            if (this.a == object.a && this.b == object.b && this.c == object.c && Arrays.equals((byte[])this.d, (byte[])object.d) && this.e == object.e && this.f == object.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        if (this.e != -1 && this.f != -1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.a != -1 && this.b != -1 && this.c != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode((byte[])this.d)) * 31 + this.e) * 31 + this.f;
        }
        return this.g;
    }

    public boolean i() {
        if (!this.f() && !this.g()) {
            return false;
        }
        return true;
    }

    public String m() {
        String string2;
        String string3 = this.g() ? M.G("%s/%s/%s", h.d(this.a), h.c(this.b), h.e(this.c)) : "NA/NA/NA";
        if (this.f()) {
            string2 = new StringBuilder();
            string2.append(this.e);
            string2.append("/");
            string2.append(this.f);
            string2 = string2.toString();
        } else {
            string2 = "NA/NA";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("/");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(h.d(this.a));
        stringBuilder.append(", ");
        stringBuilder.append(h.c(this.b));
        stringBuilder.append(", ");
        stringBuilder.append(h.e(this.c));
        stringBuilder.append(", ");
        boolean bl = this.d != null;
        stringBuilder.append(bl);
        stringBuilder.append(", ");
        stringBuilder.append(h.l(this.e));
        stringBuilder.append(", ");
        stringBuilder.append(h.b(this.f));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class b {
        public int a;
        public int b;
        public int c;
        public byte[] d;
        public int e;
        public int f;

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.e = -1;
            this.f = -1;
        }

        public b(h h8) {
            this.a = h8.a;
            this.b = h8.b;
            this.c = h8.c;
            this.d = h8.d;
            this.e = h8.e;
            this.f = h8.f;
        }

        public /* synthetic */ b(h h8,  a8) {
            this(h8);
        }

        public h a() {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        public b b(int n8) {
            this.f = n8;
            return this;
        }

        public b c(int n8) {
            this.b = n8;
            return this;
        }

        public b d(int n8) {
            this.a = n8;
            return this;
        }

        public b e(int n8) {
            this.c = n8;
            return this;
        }

        public b f(byte[] arrby) {
            this.d = arrby;
            return this;
        }

        public b g(int n8) {
            this.e = n8;
            return this;
        }
    }

}


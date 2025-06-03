/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package Z0;

import F0.L;
import F0.s;
import U0.b;
import W2.q;
import d0.A;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class p {
    public static final q d = q.d(':');
    public static final q e = q.d('*');
    public final List a = new ArrayList();
    public int b = 0;
    public int c;

    public static int b(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1760745220: {
                if (!string2.equals((Object)"Super_SlowMotion_BGM")) break;
                n9 = 4;
                break;
            }
            case -830665521: {
                if (!string2.equals((Object)"Super_SlowMotion_Deflickering_On")) break;
                n9 = 3;
                break;
            }
            case -1251387154: {
                if (!string2.equals((Object)"Super_SlowMotion_Data")) break;
                n9 = 2;
                break;
            }
            case -1332107749: {
                if (!string2.equals((Object)"Super_SlowMotion_Edit_Data")) break;
                n9 = 1;
                break;
            }
            case -1711564334: {
                if (!string2.equals((Object)"SlowMotion_Data")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                throw A.a("Invalid SEF name", null);
            }
            case 4: {
                return 2817;
            }
            case 3: {
                return 2820;
            }
            case 2: {
                return 2816;
            }
            case 1: {
                return 2819;
            }
            case 0: 
        }
        return 2192;
    }

    public static b f(z object, int n8) {
        ArrayList arrayList = new ArrayList();
        object = object.D(n8);
        object = e.f((CharSequence)object);
        for (n8 = 0; n8 < object.size(); ++n8) {
            List list = d.f((CharSequence)object.get(n8));
            if (list.size() == 3) {
                try {
                    arrayList.add((Object)new b.b(Long.parseLong((String)((String)list.get(0))), Long.parseLong((String)((String)list.get(1))), 1 << Integer.parseInt((String)((String)list.get(2))) - 1));
                }
                catch (NumberFormatException numberFormatException) {
                    throw A.a(null, (Throwable)numberFormatException);
                }
                continue;
            }
            throw A.a(null, null);
        }
        return new b((List)arrayList);
    }

    public final void a(s s8, L l8) {
        z z8 = new z(8);
        s8.readFully(z8.e(), 0, 8);
        this.c = z8.t() + 8;
        if (z8.p() != 1397048916) {
            l8.a = 0L;
            return;
        }
        l8.a = s8.p() - (long)(this.c - 12);
        this.b = 2;
    }

    public int c(s s8, L l8, List list) {
        int n8 = this.b;
        long l9 = 0L;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        this.e(s8, list);
                        l8.a = 0L;
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                this.d(s8, l8);
                return 1;
            }
            this.a(s8, l8);
            return 1;
        }
        long l10 = s8.a();
        long l11 = l9;
        if (l10 != -1L) {
            l11 = l10 < 8L ? l9 : l10 - 8L;
        }
        l8.a = l11;
        this.b = 1;
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(s s8, L l8) {
        long l9 = s8.a();
        int n8 = this.c - 20;
        z z8 = new z(n8);
        s8.readFully(z8.e(), 0, n8);
        for (int i8 = 0; i8 < n8 / 12; ++i8) {
            z8.U(2);
            short s9 = z8.v();
            if (s9 != 2192 && s9 != 2816 && s9 != 2817 && s9 != 2819 && s9 != 2820) {
                z8.U(8);
                continue;
            }
            long l10 = this.c;
            long l11 = z8.t();
            int n9 = z8.t();
            this.a.add((Object)new a(s9, l9 - l10 - l11, n9));
        }
        if (this.a.isEmpty()) {
            l9 = 0L;
        } else {
            this.b = 3;
            l9 = ((a)this.a.get((int)0)).b;
        }
        l8.a = l9;
    }

    public final void e(s object, List list) {
        long l8 = object.p();
        int n8 = (int)(object.a() - object.p() - (long)this.c);
        z z8 = new z(n8);
        byte[] arrby = z8.e();
        object.readFully(arrby, 0, n8);
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            object = (a)this.a.get(i8);
            z8.T((int)(object.b - l8));
            z8.U(4);
            n8 = z8.t();
            int n9 = p.b(z8.D(n8));
            int n10 = object.c;
            if (n9 != 2192) {
                if (n9 == 2816 || n9 == 2817 || n9 == 2819 || n9 == 2820) continue;
                throw new IllegalStateException();
            }
            list.add((Object)p.f(z8, n10 - (n8 + 8)));
        }
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }

    public static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int n8, long l8, int n9) {
            this.a = n8;
            this.b = l8;
            this.c = n9;
        }
    }

}


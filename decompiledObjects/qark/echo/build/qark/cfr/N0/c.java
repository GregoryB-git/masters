/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package N0;

import java.util.List;

public final class c {
    public final long a;
    public final List b;

    public c(long l8, List list) {
        this.a = l8;
        this.b = list;
    }

    public U0.a a(long l8) {
        long l9;
        long l10;
        if (this.b.size() < 2) {
            return null;
        }
        long l11 = l8;
        long l12 = l10 = (l8 = (l9 = -1L));
        boolean bl = false;
        long l13 = l10;
        long l14 = l8;
        l8 = l11;
        for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
            a a8 = (a)this.b.get(i8);
            bl = "video/mp4".equals((Object)a8.a) | bl;
            if (i8 == 0) {
                l10 = l8 - a8.d;
                l8 = 0L;
            } else {
                l11 = l8 - a8.c;
                l10 = l8;
                l8 = l11;
            }
            if (bl && l8 != l10) {
                l12 = l10 - l8;
                l13 = l8;
                bl = false;
            }
            if (i8 != 0) continue;
            l9 = l8;
            l14 = l10;
        }
        if (l13 != -1L && l12 != -1L && l9 != -1L) {
            if (l14 == -1L) {
                return null;
            }
            return new U0.a(l9, l14, this.a, l13, l12);
        }
        return null;
    }

    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public a(String string2, String string3, long l8, long l9) {
            this.a = string2;
            this.b = string3;
            this.c = l8;
            this.d = l9;
        }
    }

}


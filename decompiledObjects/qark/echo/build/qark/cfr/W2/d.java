/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package W2;

import W2.m;
import W2.n;

public abstract class d
implements n {
    public static d d(char c8) {
        return new b(c8);
    }

    public static d f() {
        return d.p;
    }

    public static String g(char c8) {
        char[] arrc;
        char c9 = '\u0000';
        char[] arrc2 = arrc = new char[6];
        arrc2[0] = 92;
        arrc2[1] = 117;
        arrc2[2] = 0;
        arrc2[3] = 0;
        arrc2[4] = 0;
        arrc2[5] = 0;
        char c10 = c8;
        for (c8 = c9; c8 < '\u0004'; c8 = (char)(c8 + '\u0001')) {
            arrc[5 - c8] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char)(c10 >> 4);
        }
        return String.copyValueOf((char[])arrc);
    }

    public boolean b(Character c8) {
        return this.e(c8.charValue());
    }

    public int c(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        m.l(n8, n9);
        while (n8 < n9) {
            if (this.e(charSequence.charAt(n8))) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public abstract boolean e(char var1);

    public static abstract class a
    extends d {
    }

    public static final class b
    extends a {
        public final char o;

        public b(char c8) {
            this.o = c8;
        }

        @Override
        public boolean e(char c8) {
            if (c8 == this.o) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CharMatcher.is('");
            stringBuilder.append(d.g(this.o));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    public static abstract class c
    extends a {
        public final String o;

        public c(String string2) {
            this.o = (String)m.j(string2);
        }

        public final String toString() {
            return this.o;
        }
    }

    public static final class d
    extends c {
        public static final d p = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override
        public int c(CharSequence charSequence, int n8) {
            m.l(n8, charSequence.length());
            return -1;
        }

        @Override
        public boolean e(char c8) {
            return false;
        }
    }

}


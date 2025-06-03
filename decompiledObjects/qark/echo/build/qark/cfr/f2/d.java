/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package f2;

import f2.p;
import java.util.Arrays;

public final class d
extends p {
    public final String a;
    public final byte[] b;
    public final c2.d c;

    public d(String string2, byte[] arrby, c2.d d8) {
        this.a = string2;
        this.b = arrby;
        this.c = d8;
    }

    public /* synthetic */ d(String string2, byte[] arrby, c2.d d8,  a8) {
        this(string2, arrby, d8);
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    @Override
    public c2.d d() {
        return this.c;
    }

    public boolean equals(Object arrby) {
        if (arrby == this) {
            return true;
        }
        if (arrby instanceof p) {
            p p8 = (p)arrby;
            if (this.a.equals((Object)p8.b())) {
                byte[] arrby2 = this.b;
                arrby = p8 instanceof d ? ((d)p8).b : p8.c();
                if (Arrays.equals((byte[])arrby2, (byte[])arrby) && this.c.equals((Object)p8.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode((byte[])this.b)) * 1000003 ^ this.c.hashCode();
    }

    public static final class b
    extends p.a {
        public String a;
        public byte[] b;
        public c2.d c;

        @Override
        public p a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" backendName");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.c == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" priority");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public p.a b(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override
        public p.a c(byte[] arrby) {
            this.b = arrby;
            return this;
        }

        @Override
        public p.a d(c2.d d8) {
            if (d8 != null) {
                this.c = d8;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

}


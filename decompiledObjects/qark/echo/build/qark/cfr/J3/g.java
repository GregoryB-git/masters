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
package J3;

import J3.B;
import java.util.Arrays;

public final class g
extends B.d.b {
    public final String a;
    public final byte[] b;

    public g(String string2, byte[] arrby) {
        this.a = string2;
        this.b = arrby;
    }

    public /* synthetic */ g(String string2, byte[] arrby,  a8) {
        this(string2, arrby);
    }

    @Override
    public byte[] b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object arrby) {
        if (arrby == this) {
            return true;
        }
        if (arrby instanceof B.d.b) {
            if (this.a.equals((Object)(arrby = (B.d.b)arrby).c())) {
                byte[] arrby2 = this.b;
                arrby = arrby instanceof g ? ((g)arrby).b : arrby.b();
                if (Arrays.equals((byte[])arrby2, (byte[])arrby)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode((byte[])this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File{filename=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contents=");
        stringBuilder.append(Arrays.toString((byte[])this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.d.b.a {
        public String a;
        public byte[] b;

        @Override
        public B.d.b a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" filename");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" contents");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new g(this.a, this.b, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public B.d.b.a b(byte[] arrby) {
            if (arrby != null) {
                this.b = arrby;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override
        public B.d.b.a c(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

}


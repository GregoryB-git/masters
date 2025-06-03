/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package g2;

import g2.f;
import java.util.Arrays;

public final class a
extends f {
    public final Iterable a;
    public final byte[] b;

    public a(Iterable iterable, byte[] arrby) {
        this.a = iterable;
        this.b = arrby;
    }

    public /* synthetic */ a(Iterable iterable, byte[] arrby,  a8) {
        this(iterable, arrby);
    }

    @Override
    public Iterable b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object arrby) {
        if (arrby == this) {
            return true;
        }
        if (arrby instanceof f) {
            if (this.a.equals((Object)(arrby = (f)arrby).b())) {
                byte[] arrby2 = this.b;
                arrby = arrby instanceof a ? ((a)arrby).b : arrby.c();
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
        stringBuilder.append("BackendRequest{events=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", extras=");
        stringBuilder.append(Arrays.toString((byte[])this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends f.a {
        public Iterable a;
        public byte[] b;

        @Override
        public f a() {
            Iterable iterable = this.a;
            String string2 = "";
            if (iterable == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" events");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new a(this.a, this.b, null);
            }
            iterable = new StringBuilder();
            iterable.append("Missing required properties:");
            iterable.append(string2);
            throw new IllegalStateException(iterable.toString());
        }

        @Override
        public f.a b(Iterable iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override
        public f.a c(byte[] arrby) {
            this.b = arrby;
            return this;
        }
    }

}


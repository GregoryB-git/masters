/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d3;

import d3.c;
import java.util.Objects;

public final class I
extends c {
    public final a a;

    public I(a a8) {
        this.a = a8;
    }

    public static I a(a a8) {
        return new I(a8);
    }

    public a b() {
        return this.a;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof I;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (((I)object).b() == this.b()) {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        return Objects.hashCode((Object)this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XChaCha20Poly1305 Parameters (variant: ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class a {
        public static final a b = new a("TINK");
        public static final a c = new a("CRUNCHY");
        public static final a d = new a("NO_PREFIX");
        public final String a;

        public a(String string2) {
            this.a = string2;
        }

        public String toString() {
            return this.a;
        }
    }

}


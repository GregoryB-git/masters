/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package V3;

import V3.b;
import V3.k;
import d4.n;

public final class B {
    public final long a;
    public final k b;
    public final n c;
    public final b d;
    public final boolean e;

    public B(long l8, k k8, b b8) {
        this.a = l8;
        this.b = k8;
        this.c = null;
        this.d = b8;
        this.e = true;
    }

    public B(long l8, k k8, n n8, boolean bl) {
        this.a = l8;
        this.b = k8;
        this.c = n8;
        this.d = null;
        this.e = bl;
    }

    public b a() {
        b b8 = this.d;
        if (b8 != null) {
            return b8;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public n b() {
        n n8 = this.c;
        if (n8 != null) {
            return n8;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public k c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    public boolean e() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        block14 : {
            block20 : {
                block19 : {
                    block18 : {
                        block17 : {
                            block16 : {
                                block15 : {
                                    if (this == object) {
                                        return true;
                                    }
                                    if (object == null) break block14;
                                    if (B.class != object.getClass()) {
                                        return false;
                                    }
                                    object = (B)object;
                                    if (this.a != object.a) {
                                        return false;
                                    }
                                    if (!this.b.equals(object.b)) {
                                        return false;
                                    }
                                    if (this.e != object.e) {
                                        return false;
                                    }
                                    n n8 = this.c;
                                    if (n8 == null) break block15;
                                    if (!n8.equals((Object)object.c)) break block16;
                                    break block17;
                                }
                                if (object.c == null) break block17;
                            }
                            return false;
                        }
                        b b8 = this.d;
                        object = object.d;
                        if (b8 == null) break block18;
                        if (b8.equals(object)) {
                            return true;
                        }
                        break block19;
                    }
                    if (object == null) break block20;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        int n8 = Long.valueOf((long)this.a).hashCode();
        int n9 = Boolean.valueOf((boolean)this.e).hashCode();
        int n10 = this.b.hashCode();
        Object object = this.c;
        int n11 = 0;
        int n12 = object != null ? object.hashCode() : 0;
        object = this.d;
        if (object != null) {
            n11 = object.hashCode();
        }
        return (((n8 * 31 + n9) * 31 + n10) * 31 + n12) * 31 + n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserWriteRecord{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(" path=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(" visible=");
        stringBuilder.append(this.e);
        stringBuilder.append(" overwrite=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(" merge=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


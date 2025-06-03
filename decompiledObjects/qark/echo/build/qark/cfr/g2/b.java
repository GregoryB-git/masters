/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g2;

import g2.g;

public final class b
extends g {
    public final g.a a;
    public final long b;

    public b(g.a a8, long l8) {
        if (a8 != null) {
            this.a = a8;
            this.b = l8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public g.a c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            if (this.a.equals((Object)(object = (g)object).c()) && this.b == object.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        long l8 = this.b;
        return (n8 ^ 1000003) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BackendResponse{status=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", nextRequestWaitMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


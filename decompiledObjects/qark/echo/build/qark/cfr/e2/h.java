/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e2;

import e2.n;

public final class h
extends n {
    public final long a;

    public h(long l8) {
        this.a = l8;
    }

    @Override
    public long c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            if (this.a == (object = (n)object).c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        return (int)(l8 ^ l8 >>> 32) ^ 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogResponse{nextRequestWaitMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package s3;

import s3.n;

public final class a
extends n {
    public final long a;
    public final long b;
    public final long c;

    public a(long l8, long l9, long l10) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            if (this.a == (object = (n)object).c() && this.b == object.b() && this.c == object.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        l8 = this.c;
        return ((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ (int)(l8 >>> 32 ^ l8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StartupTime{epochMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", elapsedRealtime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package n2;

import f2.i;
import f2.p;
import n2.k;

public final class b
extends k {
    public final long a;
    public final p b;
    public final i c;

    public b(long l8, p p8, i i8) {
        this.a = l8;
        if (p8 != null) {
            this.b = p8;
            if (i8 != null) {
                this.c = i8;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override
    public i b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public p d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k) {
            if (this.a == (object = (k)object).c() && this.b.equals((Object)object.d()) && this.c.equals((Object)object.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        return (((int)(l8 ^ l8 >>> 32) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersistedEvent{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", transportContext=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", event=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


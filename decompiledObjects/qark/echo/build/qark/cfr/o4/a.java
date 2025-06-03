/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package o4;

import java.util.List;
import o4.r;

public final class a
extends r {
    public final String a;
    public final List b;

    public a(String string2, List list) {
        if (string2 != null) {
            this.a = string2;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override
    public List b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r) {
            if (this.a.equals((Object)(object = (r)object).c()) && this.b.equals((Object)object.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HeartBeatResult{userAgent=");
        stringBuilder.append(this.a);
        stringBuilder.append(", usedDates=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


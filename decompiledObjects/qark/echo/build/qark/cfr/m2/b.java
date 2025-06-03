/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package m2;

import java.util.Map;
import m2.f;
import p2.a;

public final class b
extends f {
    public final a a;
    public final Map b;

    public b(a a8, Map map) {
        if (a8 != null) {
            this.a = a8;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override
    public a e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            if (this.a.equals((Object)(object = (f)object).e()) && this.b.equals((Object)object.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Map h() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SchedulerConfig{clock=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", values=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


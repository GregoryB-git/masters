/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package P4;

import P4.b;
import java.util.Set;

public final class a
extends b {
    public final Set a;

    public a(Set set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override
    public Set b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            return this.a.equals((Object)object.b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConfigUpdate{updatedKeys=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


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
package e2;

import e2.j;
import java.util.List;

public final class d
extends j {
    public final List a;

    public d(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override
    public List c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j) {
            object = (j)object;
            return this.a.equals((Object)object.c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BatchedLogRequest{logRequests=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


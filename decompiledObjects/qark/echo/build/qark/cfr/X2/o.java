/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Comparator
 */
package X2;

import X2.P;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public final class o
extends P
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final Comparator[] o;

    public o(Comparator comparator, Comparator comparator2) {
        this.o = new Comparator[]{comparator, comparator2};
    }

    @Override
    public int compare(Object object, Object object2) {
        Comparator[] arrcomparator;
        for (int i8 = 0; i8 < (arrcomparator = this.o).length; ++i8) {
            int n8 = arrcomparator[i8].compare(object, object2);
            if (n8 == 0) continue;
            return n8;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            object = (o)object;
            return Arrays.equals((Object[])this.o, (Object[])object.o);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.o);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ordering.compound(");
        stringBuilder.append(Arrays.toString((Object[])this.o));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


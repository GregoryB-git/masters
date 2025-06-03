/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 */
package X2;

import W2.k;
import java.util.Map;

public abstract class e
implements Map.Entry {
    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (Map.Entry)object;
            bl3 = bl;
            if (k.a(this.getKey(), object.getKey())) {
                bl3 = bl;
                if (k.a(this.getValue(), object.getValue())) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        if (object2 != null) {
            n8 = object2.hashCode();
        }
        return n9 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append("=");
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Objects
 */
package l5;

import java.util.Map;
import java.util.Objects;

public class p {
    public final String a;
    public final Map b;

    public p(String string2, Map map) {
        this.a = string2;
        this.b = map;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (p)object;
            if (this.a.equals((Object)object.a) && Objects.equals((Object)this.b, (Object)object.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b});
    }
}


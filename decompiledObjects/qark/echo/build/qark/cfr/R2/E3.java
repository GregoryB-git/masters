/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Comparator
 */
package R2;

import java.util.Comparator;

public final class E3
implements Comparator {
    public static final /* synthetic */ E3 o;

    static /* synthetic */ {
        o = new E3();
    }

    public final int compare(Object object, Object object2) {
        object = (Long)object;
        object2 = (Long)object2;
        return (int)(object.longValue() LCMP object2.longValue());
    }
}


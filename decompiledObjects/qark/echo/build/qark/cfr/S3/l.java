/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.Comparator
 */
package S3;

import java.util.Comparator;

public class l
implements Comparator {
    public static l o = new l();

    public static l b(Class class_) {
        return o;
    }

    public int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo((Object)comparable2);
    }
}


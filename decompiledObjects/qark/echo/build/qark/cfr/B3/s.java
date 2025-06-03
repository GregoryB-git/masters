/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package B3;

import B3.t;
import java.util.Arrays;
import java.util.List;

public class s
extends t {
    public final List o;

    public s(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString((Object[])list.toArray()));
        super(stringBuilder.toString());
        this.o = list;
    }
}


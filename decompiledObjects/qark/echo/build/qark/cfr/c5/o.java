/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c5;

import V4.a;
import V4.g;
import Y4.b;
import c5.j;
import java.util.Map;

public final class o
implements g {
    public final j a = new j();

    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.C) {
            return this.a.a("0".concat(String.valueOf((Object)string2)), a.v, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf((Object)((Object)a8))));
    }
}


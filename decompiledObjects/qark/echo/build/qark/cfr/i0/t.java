/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package i0;

import i0.k;
import i0.r;
import java.io.IOException;
import java.util.Map;

public final class t
extends r {
    public final int r;
    public final String s;
    public final Map t;
    public final byte[] u;

    public t(int n8, String string2, IOException iOException, Map map, k k8, byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response code: ");
        stringBuilder.append(n8);
        super(stringBuilder.toString(), iOException, k8, 2004, 1);
        this.r = n8;
        this.s = string2;
        this.t = map;
        this.u = arrby;
    }
}


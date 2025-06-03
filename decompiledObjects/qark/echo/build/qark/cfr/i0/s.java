/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package i0;

import i0.k;
import i0.r;

public final class s
extends r {
    public final String r;

    public s(String string2, k k8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid content type: ");
        stringBuilder.append(string2);
        super(stringBuilder.toString(), k8, 2003, 1);
        this.r = string2;
    }
}


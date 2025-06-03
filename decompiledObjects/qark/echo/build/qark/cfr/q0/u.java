/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package q0;

import java.io.IOException;

public final class u
extends IOException {
    public u(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to bind a sample queue to TrackGroup with MIME type ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        super(stringBuilder.toString());
    }
}


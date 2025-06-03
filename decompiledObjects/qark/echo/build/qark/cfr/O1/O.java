/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
package O1;

import O1.P;
import java.io.File;
import java.io.FilenameFilter;

public final class O
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return P.b(file, string2);
    }
}


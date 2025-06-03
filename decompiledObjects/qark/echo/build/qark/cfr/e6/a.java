/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package e6;

import e6.d;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a
extends d {
    public a(File file, File file2, String string2) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        super(file, file2, string2);
    }

    public /* synthetic */ a(File file, File file2, String string2, int n8, g g8) {
        if ((n8 & 2) != 0) {
            file2 = null;
        }
        if ((n8 & 4) != 0) {
            string2 = null;
        }
        this(file, file2, string2);
    }
}


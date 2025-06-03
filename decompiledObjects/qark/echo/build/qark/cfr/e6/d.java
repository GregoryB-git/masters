/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package e6;

import e6.c;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public abstract class d
extends IOException {
    public final File o;
    public final File p;
    public final String q;

    public d(File file, File file2, String string2) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        super(c.a(file, file2, string2));
        this.o = file;
        this.p = file2;
        this.q = string2;
    }
}


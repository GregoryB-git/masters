/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 */
package e6;

import e6.e;
import e6.f;
import e6.i;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public class j
extends i {
    public static final e h(File file, f f8) {
        Intrinsics.checkNotNullParameter((Object)file, "<this>");
        Intrinsics.checkNotNullParameter((Object)f8, "direction");
        return new e(file, f8);
    }

    public static final e i(File file) {
        Intrinsics.checkNotNullParameter((Object)file, "<this>");
        return j.h(file, f.p);
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 */
package a6;

import a6.a;
import a6.c;
import kotlin.jvm.internal.Intrinsics;

public abstract class b {
    public static final a a(Enum[] arrenum) {
        Intrinsics.checkNotNullParameter(arrenum, "entries");
        return new c(arrenum);
    }
}


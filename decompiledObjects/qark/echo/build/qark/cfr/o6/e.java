/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 */
package o6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o6.d;

public abstract class e {
    public static final long a(long l8, d d8, d d9) {
        Intrinsics.checkNotNullParameter((Object)d8, "sourceUnit");
        Intrinsics.checkNotNullParameter((Object)d9, "targetUnit");
        return d9.e().convert(l8, d8.e());
    }

    public static final long b(long l8, d d8, d d9) {
        Intrinsics.checkNotNullParameter((Object)d8, "sourceUnit");
        Intrinsics.checkNotNullParameter((Object)d9, "targetUnit");
        return d9.e().convert(l8, d8.e());
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o6;

import kotlin.jvm.internal.Intrinsics;

public abstract class e
{
    public static final long a(final long sourceDuration, final d d, final d d2) {
        Intrinsics.checkNotNullParameter(d, "sourceUnit");
        Intrinsics.checkNotNullParameter(d2, "targetUnit");
        return d2.e().convert(sourceDuration, d.e());
    }
    
    public static final long b(final long sourceDuration, final d d, final d d2) {
        Intrinsics.checkNotNullParameter(d, "sourceUnit");
        Intrinsics.checkNotNullParameter(d2, "targetUnit");
        return d2.e().convert(sourceDuration, d.e());
    }
}

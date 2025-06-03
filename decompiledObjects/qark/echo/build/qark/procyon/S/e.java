// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.Map;

public abstract class e
{
    public static final d a() {
        return new a(null, true, 1, null);
    }
    
    public static final a b(final d.b... original) {
        Intrinsics.checkNotNullParameter(original, "pairs");
        final a a = new a(null, false, 1, null);
        a.g((d.b[])Arrays.copyOf(original, original.length));
        return a;
    }
}

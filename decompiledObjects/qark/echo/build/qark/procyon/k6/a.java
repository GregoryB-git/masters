// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k6;

import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class a extends j6.a
{
    @Override
    public Random d() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}

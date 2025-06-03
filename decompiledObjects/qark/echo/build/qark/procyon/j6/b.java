// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j6;

import kotlin.jvm.internal.Intrinsics;
import java.util.Random;

public final class b extends a
{
    public final b$a q;
    
    public b() {
        this.q = new ThreadLocal() {
            public Random a() {
                return new Random();
            }
        };
    }
    
    @Override
    public Random d() {
        final Random value = this.q.get();
        Intrinsics.checkNotNullExpressionValue(value, "get(...)");
        return value;
    }
}

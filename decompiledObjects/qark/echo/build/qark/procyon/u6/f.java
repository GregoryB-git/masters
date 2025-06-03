// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import X5.g;
import p6.I;

public final class f implements I
{
    public final g o;
    
    public f(final g o) {
        this.o = o;
    }
    
    @Override
    public g f() {
        return this.o;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append(this.f());
        sb.append(')');
        return sb.toString();
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import X5.g;
import X5.d;

public final class c implements d
{
    public static final c o;
    
    static {
        o = new c();
    }
    
    @Override
    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public void resumeWith(final Object o) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public String toString() {
        return "This continuation is already complete";
    }
}

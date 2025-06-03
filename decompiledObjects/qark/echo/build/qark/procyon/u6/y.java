// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.M;

public abstract class y
{
    public abstract Object a(final Object p0);
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(M.a(this));
        sb.append('@');
        sb.append(M.b(this));
        return sb.toString();
    }
}

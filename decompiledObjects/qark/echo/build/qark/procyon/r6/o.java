// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import p6.P0;

public final class o
{
    public final P0 a;
    
    public o(final P0 a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WaiterEB(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import kotlin.jvm.internal.g;

public final class c extends n
{
    public final Object a;
    public final int b;
    
    public c(final Object a, final int b) {
        super(null);
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final Object a = this.a;
        boolean b = false;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        if (hashCode == this.b) {
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }
    
    public final Object b() {
        return this.a;
    }
}

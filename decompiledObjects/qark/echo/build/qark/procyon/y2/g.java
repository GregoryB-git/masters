// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y2;

import x2.d;

public final class g extends UnsupportedOperationException
{
    public final d o;
    
    public g(final d o) {
        this.o = o;
    }
    
    @Override
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.o));
    }
}

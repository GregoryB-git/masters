// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import java.util.Arrays;

public final class B extends A
{
    public final byte[] c;
    
    public B(final byte[] array) {
        super(Arrays.copyOfRange(array, 0, 25));
        this.c = array;
    }
    
    @Override
    public final byte[] Z0() {
        return this.c;
    }
}

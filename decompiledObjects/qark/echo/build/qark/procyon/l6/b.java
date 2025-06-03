// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l6;

import java.util.NoSuchElementException;
import W5.B;

public final class b extends B
{
    public final int o;
    public final int p;
    public boolean q;
    public int r;
    
    public b(int r, final int p3, final int o) {
        this.o = o;
        this.p = p3;
        boolean q = true;
        Label_0040: {
            if (o > 0) {
                if (r <= p3) {
                    break Label_0040;
                }
            }
            else if (r >= p3) {
                break Label_0040;
            }
            q = false;
        }
        this.q = q;
        if (!q) {
            r = p3;
        }
        this.r = r;
    }
    
    @Override
    public int b() {
        final int r = this.r;
        if (r != this.p) {
            this.r = this.o + r;
            return r;
        }
        if (this.q) {
            this.q = false;
            return r;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public boolean hasNext() {
        return this.q;
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

import java.io.OutputStream;

public final class b extends OutputStream
{
    public long o;
    
    public b() {
        this.o = 0L;
    }
    
    public long a() {
        return this.o;
    }
    
    @Override
    public void write(final int n) {
        ++this.o;
    }
    
    @Override
    public void write(final byte[] array) {
        this.o += array.length;
    }
    
    @Override
    public void write(final byte[] array, int n, final int n2) {
        if (n >= 0 && n <= array.length && n2 >= 0) {
            n += n2;
            if (n <= array.length && n >= 0) {
                this.o += n2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}

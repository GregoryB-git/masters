// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import java.util.NoSuchElementException;

public interface n
{
    public static final n a = new n() {
        @Override
        public long a() {
            throw new NoSuchElementException();
        }
        
        @Override
        public long b() {
            throw new NoSuchElementException();
        }
        
        @Override
        public boolean next() {
            return false;
        }
    };
    
    long a();
    
    long b();
    
    boolean next();
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import java.util.NoSuchElementException;

public final class g
{
    public final Object a;
    
    public g() {
        this.a = null;
    }
    
    public g(final Object a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
    
    public static g a() {
        return new g();
    }
    
    public static g b(final Object o) {
        if (o == null) {
            return a();
        }
        return e(o);
    }
    
    public static g e(final Object o) {
        return new g(o);
    }
    
    public Object c() {
        final Object a = this.a;
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException("No value present");
    }
    
    public boolean d() {
        return this.a != null;
    }
}

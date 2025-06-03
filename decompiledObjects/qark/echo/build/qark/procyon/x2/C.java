// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import java.lang.ref.WeakReference;

public abstract class C extends A
{
    public static final WeakReference d;
    public WeakReference c;
    
    static {
        d = new WeakReference(null);
    }
    
    public C(final byte[] array) {
        super(array);
        this.c = C.d;
    }
    
    @Override
    public final byte[] Z0() {
        // monitorenter(this)
        while (true) {
            try {
                byte[] a1;
                if ((a1 = (byte[])this.c.get()) == null) {
                    a1 = this.a1();
                    this.c = new WeakReference(a1);
                }
                // monitorexit(this)
                return a1;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public abstract byte[] a1();
}

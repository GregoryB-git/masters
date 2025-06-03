// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import d0.q;
import l0.y1;
import android.os.Looper;

public interface x
{
    public static final x a = new x() {
        @Override
        public void a(final Looper looper, final y1 y1) {
        }
        
        @Override
        public int b(final q q) {
            if (q.r != null) {
                return 1;
            }
            return 0;
        }
        
        @Override
        public n c(final v.a a, final q q) {
            if (q.r == null) {
                return null;
            }
            return new D(new n.a(new T(1), 6001));
        }
    };
    
    void a(final Looper p0, final y1 p1);
    
    int b(final q p0);
    
    n c(final v.a p0, final q p1);
    
    b d(final v.a p0, final q p1);
    
    void g();
    
    void release();
    
    public interface b
    {
        public static final b a = new y();
        
        void release();
    }
}

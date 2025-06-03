// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

public class t0 extends x0 implements x
{
    public final boolean q;
    
    public t0(final q0 q0) {
        super(true);
        this.e0(q0);
        this.q = this.G0();
    }
    
    public final boolean G0() {
        final r a0 = this.a0();
        s s;
        if (a0 instanceof s) {
            s = (s)a0;
        }
        else {
            s = null;
        }
        if (s != null) {
            x0 x0;
            if ((x0 = s.w()) == null) {
                return false;
            }
            while (!x0.X()) {
                final r a2 = x0.a0();
                s s2;
                if (a2 instanceof s) {
                    s2 = (s)a2;
                }
                else {
                    s2 = null;
                }
                if (s2 == null || (x0 = s2.w()) == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean X() {
        return this.q;
    }
    
    @Override
    public boolean Y() {
        return true;
    }
}

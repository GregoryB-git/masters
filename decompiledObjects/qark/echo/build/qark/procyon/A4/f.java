// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A4;

import B4.a;

public final class f implements a
{
    public static final F4.a a;
    
    static {
        a = F4.a.e();
    }
    
    @Override
    public void a() {
        try {
            e.c();
        }
        catch (IllegalStateException ex) {
            f.a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", ex);
        }
    }
}

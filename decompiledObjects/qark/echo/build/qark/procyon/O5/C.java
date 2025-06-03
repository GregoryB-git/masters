// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import androidx.lifecycle.LiveData;

public class C extends LiveData
{
    public static C l;
    
    public static C k() {
        if (C.l == null) {
            C.l = new C();
        }
        return C.l;
    }
    
    public void l(final String s) {
        this.h(s);
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import com.google.firebase.messaging.T;
import androidx.lifecycle.LiveData;

public class B extends LiveData
{
    public static B l;
    
    public static B k() {
        if (B.l == null) {
            B.l = new B();
        }
        return B.l;
    }
    
    public void l(final T t) {
        this.h(t);
    }
}

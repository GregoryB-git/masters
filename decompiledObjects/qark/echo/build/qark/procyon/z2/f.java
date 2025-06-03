// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import androidx.fragment.app.e;
import A2.n;
import android.app.Activity;

public class f
{
    public final Object a;
    
    public f(final Activity a) {
        n.j(a, "Activity must not be null");
        this.a = a;
    }
    
    public final Activity a() {
        return (Activity)this.a;
    }
    
    public final e b() {
        return (e)this.a;
    }
    
    public final boolean c() {
        return this.a instanceof Activity;
    }
    
    public final boolean d() {
        return this.a instanceof e;
    }
}

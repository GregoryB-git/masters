// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.savedstate;

import androidx.lifecycle.g;
import androidx.lifecycle.d;
import android.os.Bundle;

public final class b
{
    public final c a;
    public final SavedStateRegistry b;
    
    public b(final c a) {
        this.a = a;
        this.b = new SavedStateRegistry();
    }
    
    public static b a(final c c) {
        return new b(c);
    }
    
    public SavedStateRegistry b() {
        return this.b;
    }
    
    public void c(final Bundle bundle) {
        final d g = this.a.g();
        if (g.b() == d.c.p) {
            g.a(new Recreator(this.a));
            this.b.b(g, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
    
    public void d(final Bundle bundle) {
        this.b.c(bundle);
    }
}

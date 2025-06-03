// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import androidx.lifecycle.g;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.d;
import androidx.lifecycle.f;

class FragmentManager$6 implements f
{
    public final /* synthetic */ String o;
    public final /* synthetic */ d p;
    public final /* synthetic */ n q;
    
    @Override
    public void a(final h h, final d.b b) {
        if (b == d.b.ON_START && n.a(this.q).get(this.o) != null) {
            throw null;
        }
        if (b == d.b.ON_DESTROY) {
            this.p.c(this);
            n.b(this.q).remove(this.o);
        }
    }
}

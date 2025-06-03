/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;

class FragmentManager$6
implements f {
    public final /* synthetic */ String o;
    public final /* synthetic */ d p;
    public final /* synthetic */ n q;

    @Override
    public void a(h h8, d.b b8) {
        if (b8 == d.b.ON_START && (Bundle)n.a(this.q).get((Object)this.o) != null) {
            throw null;
        }
        if (b8 == d.b.ON_DESTROY) {
            this.p.c(this);
            n.b(this.q).remove((Object)this.o);
        }
    }
}


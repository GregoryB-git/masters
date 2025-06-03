// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v0;

import java.io.InputStream;
import android.net.Uri;
import java.util.List;
import B0.p;

public final class b implements a
{
    public final a a;
    public final List b;
    
    public b(final a a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public v0.a b(final Uri uri, final InputStream inputStream) {
        final v0.a a = (v0.a)this.a.a(uri, inputStream);
        final List b = this.b;
        v0.a a2 = a;
        if (b != null) {
            if (b.isEmpty()) {
                return a;
            }
            a2 = (v0.a)a.a(this.b);
        }
        return a2;
    }
}

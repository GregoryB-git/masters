// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O4;

import java.util.Iterator;
import B3.h;
import B3.r;
import B3.e;
import java.util.Set;

public class c implements i
{
    public final String a;
    public final d b;
    
    public c(final Set set, final d b) {
        this.a = e(set);
        this.b = b;
    }
    
    public static B3.c c() {
        return B3.c.e(i.class).b(r.n(f.class)).f(new b()).d();
    }
    
    public static String e(final Set set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<f> iterator = set.iterator();
        while (iterator.hasNext()) {
            final f f = iterator.next();
            sb.append(f.b());
            sb.append('/');
            sb.append(f.c());
            if (iterator.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    @Override
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(e(this.b.b()));
        return sb.toString();
    }
}

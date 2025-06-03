// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import java.util.Objects;
import java.util.Map;
import Q3.a;
import Q3.s;
import Q3.p;
import E5.d;

public class b implements d
{
    public final p a;
    public final z b;
    public s c;
    public Q3.a d;
    
    public b(final p a, final z b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final Object o) {
        this.b.run();
        final s c = this.c;
        if (c != null) {
            this.a.D(c);
            this.c = null;
        }
        final Q3.a d = this.d;
        if (d != null) {
            this.a.C(d);
            this.d = null;
        }
    }
    
    @Override
    public void b(Object value, final E5.d.b b) {
        value = ((Map)value).get("eventType");
        Objects.requireNonNull(value);
        final String anObject = (String)value;
        if ("value".equals(anObject)) {
            final E c = new E(b);
            this.c = c;
            this.a.c(c);
            return;
        }
        final L5.a d = new L5.a(b, anObject);
        this.d = d;
        this.a.a(d);
    }
}

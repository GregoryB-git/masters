// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import Q3.c;
import V3.h;
import V3.k;

public class b implements e
{
    public final k a;
    public final h b;
    public final c c;
    
    public b(final h b, final c c, final k a) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a() {
        this.b.c(this.c);
    }
    
    public k b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b());
        sb.append(":CANCEL");
        return sb.toString();
    }
}

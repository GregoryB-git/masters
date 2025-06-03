// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import V3.k;
import Q3.b;
import V3.h;

public class d implements e
{
    public final a a;
    public final h b;
    public final b c;
    public final String d;
    
    public d(final a a, final h b, final b c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a() {
        this.b.d(this);
    }
    
    public a b() {
        return this.a;
    }
    
    public k c() {
        final k s = this.c.g().s();
        if (this.a == e.a.s) {
            return s;
        }
        return s.a0();
    }
    
    public String d() {
        return this.d;
    }
    
    public b e() {
        return this.c;
    }
    
    @Override
    public String toString() {
        StringBuilder sb;
        if (this.a == e.a.s) {
            sb = new StringBuilder();
            sb.append(this.c());
            sb.append(": ");
            sb.append(this.a);
            sb.append(": ");
            sb.append(this.c.i(true));
        }
        else {
            sb = new StringBuilder();
            sb.append(this.c());
            sb.append(": ");
            sb.append(this.a);
            sb.append(": { ");
            sb.append(this.c.e());
            sb.append(": ");
            sb.append(this.c.i(true));
            sb.append(" }");
        }
        return sb.toString();
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import Y3.m;
import a4.h;

public class e
{
    public static final e d;
    public static final e e;
    public final a a;
    public final h b;
    public final boolean c;
    
    static {
        d = new e(a.o, null, false);
        e = new e(a.p, null, false);
    }
    
    public e(final a a, final h b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        m.f(!c || this.c());
    }
    
    public static e a(final h h) {
        return new e(a.p, h, true);
    }
    
    public h b() {
        return this.b;
    }
    
    public boolean c() {
        return this.a == W3.e.a.p;
    }
    
    public boolean d() {
        return this.a == W3.e.a.o;
    }
    
    public boolean e() {
        return this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OperationSource{source=");
        sb.append(this.a);
        sb.append(", queryParams=");
        sb.append(this.b);
        sb.append(", tagged=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
    
    public enum a
    {
        o("User", 0), 
        p("Server", 1);
        
        public a(final String name, final int ordinal) {
        }
    }
}

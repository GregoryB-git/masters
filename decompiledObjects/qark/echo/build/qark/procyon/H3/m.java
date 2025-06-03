// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import E3.f;
import M3.g;
import S4.b;

public class m implements b
{
    public final y a;
    public final l b;
    
    public m(final y a, final g g) {
        this.a = a;
        this.b = new l(g);
    }
    
    @Override
    public a a() {
        return S4.b.a.o;
    }
    
    @Override
    public void b(final b obj) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("App Quality Sessions session changed: ");
        sb.append(obj);
        f.b(sb.toString());
        this.b.h(obj.a());
    }
    
    @Override
    public boolean c() {
        return this.a.d();
    }
    
    public String d(final String s) {
        return this.b.c(s);
    }
    
    public void e(final String s) {
        this.b.i(s);
    }
}

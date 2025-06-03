// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import Q3.b;
import E5.d;

public class a extends c implements Q3.a
{
    public a(final d.b b, final String s) {
        super(b, s);
    }
    
    @Override
    public void a(final Q3.c c) {
        final y a = y.a(c);
        super.a.b(a.e(), a.getMessage(), a.d());
    }
    
    @Override
    public void c(final b b) {
        this.h("childRemoved", b, null);
    }
    
    @Override
    public void d(final b b, final String s) {
        this.h("childMoved", b, s);
    }
    
    @Override
    public void e(final b b, final String s) {
        this.h("childChanged", b, s);
    }
    
    @Override
    public void f(final b b, final String s) {
        this.h("childAdded", b, s);
    }
}

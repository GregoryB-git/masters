// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Comparator;

public class g implements h
{
    public static final g a;
    
    static {
        a = new g();
    }
    
    public static g j() {
        return g.a;
    }
    
    @Override
    public h a() {
        return this;
    }
    
    @Override
    public h b(final Object o, final Object o2, final Comparator comparator) {
        return new i(o, o2);
    }
    
    @Override
    public h c(final Object o, final Object o2, final a a, final h h, final h h2) {
        return this;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void e(final b b) {
    }
    
    @Override
    public h f() {
        return this;
    }
    
    @Override
    public h g(final Object o, final Comparator comparator) {
        return this;
    }
    
    @Override
    public Object getKey() {
        return null;
    }
    
    @Override
    public Object getValue() {
        return null;
    }
    
    @Override
    public h h() {
        return this;
    }
    
    @Override
    public h i() {
        return this;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public int size() {
        return 0;
    }
}

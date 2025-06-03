// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.lang.annotation.Annotation;

public final class F
{
    public final Class a;
    public final Class b;
    
    public F(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static F a(final Class clazz, final Class clazz2) {
        return new F(clazz, clazz2);
    }
    
    public static F b(final Class clazz) {
        return new F(a.class, clazz);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (F.class != o.getClass()) {
            return false;
        }
        final F f = (F)o;
        return this.b.equals(f.b) && this.a.equals(f.a);
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(this.a.getName());
        sb.append(" ");
        sb.append(this.b.getName());
        return sb.toString();
    }
    
    public @interface a {
    }
}

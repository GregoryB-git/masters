// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j4;

import java.util.HashMap;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

public final class c
{
    public final String a;
    public final Map b;
    
    public c(final String a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public static b a(final String s) {
        return new b(s);
    }
    
    public static c d(final String s) {
        return new c(s, Collections.emptyMap());
    }
    
    public String b() {
        return this.a;
    }
    
    public Annotation c(final Class clazz) {
        return this.b.get(clazz);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.a.equals(c.a) && this.b.equals(c.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldDescriptor{name=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append(this.b.values());
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b
    {
        public final String a;
        public Map b;
        
        public b(final String a) {
            this.b = null;
            this.a = a;
        }
        
        public c a() {
            final String a = this.a;
            Map<Object, Object> map;
            if (this.b == null) {
                map = Collections.emptyMap();
            }
            else {
                map = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(this.b));
            }
            return new c(a, map, null);
        }
        
        public b b(final Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }
    }
}

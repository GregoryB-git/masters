// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import java.util.Objects;
import c3.v;
import c3.g;
import java.security.GeneralSecurityException;
import c3.w;
import java.util.HashMap;
import java.util.Map;

public class n
{
    public final Map a;
    public final Map b;
    
    public n(final b b) {
        this.a = new HashMap(n.b.a(b));
        this.b = new HashMap(n.b.b(b));
    }
    
    public static /* synthetic */ Map a(final n n) {
        return n.a;
    }
    
    public static /* synthetic */ Map b(final n n) {
        return n.b;
    }
    
    public Class c(final Class obj) {
        if (this.b.containsKey(obj)) {
            return this.b.get(obj).a();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No input primitive class for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }
    
    public Object d(final g g, final Class clazz) {
        final c obj = new c(g.getClass(), clazz, null);
        if (this.a.containsKey(obj)) {
            return ((l)this.a.get(obj)).a(g);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No PrimitiveConstructor for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }
    
    public Object e(final v v, final Class obj) {
        if (!this.b.containsKey(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No wrapper found for ");
            sb.append(obj);
            throw new GeneralSecurityException(sb.toString());
        }
        final w w = this.b.get(obj);
        if (v.g().equals(w.a()) && w.a().equals(v.g())) {
            return w.b(v);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
    
    public static final class b
    {
        public final Map a;
        public final Map b;
        
        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
        }
        
        public b(final n n) {
            this.a = new HashMap(n.a(n));
            this.b = new HashMap(n.b(n));
        }
        
        public static /* synthetic */ Map a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ Map b(final b b) {
            return b.b;
        }
        
        public n c() {
            return new n(this, null);
        }
        
        public b d(final l obj) {
            if (obj == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            final c obj2 = new c(obj.c(), obj.d(), null);
            if (!this.a.containsKey(obj2)) {
                this.a.put(obj2, obj);
                return this;
            }
            final l obj3 = this.a.get(obj2);
            if (obj3.equals(obj) && obj.equals(obj3)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            sb.append(obj2);
            throw new GeneralSecurityException(sb.toString());
        }
        
        public b e(final w obj) {
            if (obj == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            final Class c = obj.c();
            if (!this.b.containsKey(c)) {
                this.b.put(c, obj);
                return this;
            }
            final w obj2 = this.b.get(c);
            if (obj2.equals(obj) && obj.equals(obj2)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
            sb.append(c);
            throw new GeneralSecurityException(sb.toString());
        }
    }
    
    public static final class c
    {
        public final Class a;
        public final Class b;
        
        public c(final Class a, final Class b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof c;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final c c = (c)o;
            boolean b3 = b2;
            if (c.a.equals(this.a)) {
                b3 = b2;
                if (c.b.equals(this.b)) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.getSimpleName());
            sb.append(" with primitive type: ");
            sb.append(this.b.getSimpleName());
            return sb.toString();
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import java.util.Objects;
import r3.a;
import java.security.GeneralSecurityException;
import c3.g;
import c3.y;
import java.util.HashMap;
import java.util.Map;

public final class r
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    
    public r(final b b) {
        this.a = new HashMap(r.b.b(b));
        this.b = new HashMap(r.b.c(b));
        this.c = new HashMap(r.b.d(b));
        this.d = new HashMap(r.b.a(b));
    }
    
    public static /* synthetic */ Map a(final r r) {
        return r.a;
    }
    
    public static /* synthetic */ Map b(final r r) {
        return r.b;
    }
    
    public static /* synthetic */ Map c(final r r) {
        return r.c;
    }
    
    public static /* synthetic */ Map d(final r r) {
        return r.d;
    }
    
    public boolean e(final q q) {
        return this.b.containsKey(new c(q.getClass(), q.a(), null));
    }
    
    public g f(final q q, final y y) {
        final c obj = new c(q.getClass(), q.a(), null);
        if (this.b.containsKey(obj)) {
            return ((k3.b)this.b.get(obj)).d(q, y);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No Key Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }
    
    public static final class b
    {
        public final Map a;
        public final Map b;
        public final Map c;
        public final Map d;
        
        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }
        
        public b(final r r) {
            this.a = new HashMap(r.a(r));
            this.b = new HashMap(r.b(r));
            this.c = new HashMap(r.c(r));
            this.d = new HashMap(r.d(r));
        }
        
        public static /* synthetic */ Map a(final b b) {
            return b.d;
        }
        
        public static /* synthetic */ Map b(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ Map c(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ Map d(final b b) {
            return b.c;
        }
        
        public r e() {
            return new r(this, null);
        }
        
        public b f(final k3.b obj) {
            final c obj2 = new c(obj.c(), obj.b(), null);
            if (!this.b.containsKey(obj2)) {
                this.b.put(obj2, obj);
                return this;
            }
            final k3.b obj3 = this.b.get(obj2);
            if (obj3.equals(obj) && obj.equals(obj3)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal parser for already existing object of type: ");
            sb.append(obj2);
            throw new GeneralSecurityException(sb.toString());
        }
        
        public b g(final k3.c obj) {
            final d obj2 = new d(obj.b(), obj.c(), null);
            if (!this.a.containsKey(obj2)) {
                this.a.put(obj2, obj);
                return this;
            }
            final k3.c obj3 = this.a.get(obj2);
            if (obj3.equals(obj) && obj.equals(obj3)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal serializer for already existing object of type: ");
            sb.append(obj2);
            throw new GeneralSecurityException(sb.toString());
        }
        
        public b h(final j obj) {
            final c obj2 = new c(obj.c(), obj.b(), null);
            if (!this.d.containsKey(obj2)) {
                this.d.put(obj2, obj);
                return this;
            }
            final j obj3 = this.d.get(obj2);
            if (obj3.equals(obj) && obj.equals(obj3)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal parser for already existing object of type: ");
            sb.append(obj2);
            throw new GeneralSecurityException(sb.toString());
        }
        
        public b i(final k obj) {
            final d obj2 = new d(obj.b(), obj.c(), null);
            if (!this.c.containsKey(obj2)) {
                this.c.put(obj2, obj);
                return this;
            }
            final k obj3 = this.c.get(obj2);
            if (obj3.equals(obj) && obj.equals(obj3)) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt to register non-equal serializer for already existing object of type: ");
            sb.append(obj2);
            throw new GeneralSecurityException(sb.toString());
        }
    }
    
    public static class c
    {
        public final Class a;
        public final a b;
        
        public c(final Class a, final a b) {
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
            sb.append(", object identifier: ");
            sb.append(this.b);
            return sb.toString();
        }
    }
    
    public static class d
    {
        public final Class a;
        public final Class b;
        
        public d(final Class a, final Class b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof d;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final d d = (d)o;
            boolean b3 = b2;
            if (d.a.equals(this.a)) {
                b3 = b2;
                if (d.b.equals(this.b)) {
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
            sb.append(" with serialization type: ");
            sb.append(this.b.getSimpleName());
            return sb.toString();
        }
    }
}

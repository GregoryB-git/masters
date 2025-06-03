// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n3;

import java.util.Iterator;
import java.util.Collections;
import java.security.GeneralSecurityException;
import c3.k;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public final class c
{
    public final a a;
    public final List b;
    public final Integer c;
    
    public c(final a a, final List b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static b a() {
        return new b();
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
        if (this.a.equals(c.a)) {
            b3 = b2;
            if (this.b.equals(c.b)) {
                b3 = b2;
                if (Objects.equals(this.c, c.c)) {
                    b3 = true;
                }
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
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
    
    public static final class b
    {
        public ArrayList a;
        public a b;
        public Integer c;
        
        public b() {
            this.a = new ArrayList();
            this.b = a.b;
            this.c = null;
        }
        
        public b a(final k k, final int n, final String s, final String s2) {
            final ArrayList a = this.a;
            if (a != null) {
                a.add(new c(k, n, s, s2, null));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        
        public c b() {
            if (this.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            final Integer c = this.c;
            if (c != null && !this.c(c)) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            final c c2 = new c(this.b, Collections.unmodifiableList((List<?>)this.a), this.c, null);
            this.a = null;
            return c2;
        }
        
        public final boolean c(final int n) {
            final Iterator<c> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().a() == n) {
                    return true;
                }
            }
            return false;
        }
        
        public b d(final a b) {
            if (this.a != null) {
                this.b = b;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        
        public b e(final int i) {
            if (this.a != null) {
                this.c = i;
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }
    
    public static final class c
    {
        public final k a;
        public final int b;
        public final String c;
        public final String d;
        
        public c(final k a, final int b, final String c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public int a() {
            return this.b;
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
            if (this.a == c.a) {
                b3 = b2;
                if (this.b == c.b) {
                    b3 = b2;
                    if (this.c.equals(c.c)) {
                        b3 = b2;
                        if (this.d.equals(c.d)) {
                            b3 = true;
                        }
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c, this.d);
        }
        
        @Override
        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.a, this.b, this.c, this.d);
        }
    }
}

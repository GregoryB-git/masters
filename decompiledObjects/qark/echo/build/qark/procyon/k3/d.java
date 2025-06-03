// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import c3.l;
import java.util.Set;
import com.google.crypto.tink.shaded.protobuf.h;
import p3.y;
import com.google.crypto.tink.shaded.protobuf.O;
import h3.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class d
{
    public final Class a;
    public final Map b;
    public final Class c;
    
    public d(Class b, final m... array) {
        this.a = b;
        final HashMap<Class, m> m = new HashMap<Class, m>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final m j = array[i];
            if (m.containsKey(j.b())) {
                final StringBuilder sb = new StringBuilder();
                sb.append("KeyTypeManager constructed with duplicate factories for primitive ");
                sb.append(j.b().getCanonicalName());
                throw new IllegalArgumentException(sb.toString());
            }
            m.put(j.b(), j);
        }
        if (array.length > 0) {
            b = (Class<Void>)array[0].b();
        }
        else {
            b = Void.class;
        }
        this.c = b;
        this.b = Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public b.b a() {
        return h3.b.b.o;
    }
    
    public final Class b() {
        return this.c;
    }
    
    public final Class c() {
        return this.a;
    }
    
    public abstract String d();
    
    public final Object e(final O o, final Class clazz) {
        final m m = this.b.get(clazz);
        if (m != null) {
            return m.a(o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requested primitive class ");
        sb.append(clazz.getCanonicalName());
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public abstract a f();
    
    public abstract y.c g();
    
    public abstract O h(final h p0);
    
    public final Set i() {
        return this.b.keySet();
    }
    
    public abstract void j(final O p0);
    
    public abstract static class a
    {
        public final Class a;
        
        public a(final Class a) {
            this.a = a;
        }
        
        public abstract O a(final O p0);
        
        public final Class b() {
            return this.a;
        }
        
        public Map c() {
            return Collections.emptyMap();
        }
        
        public abstract O d(final h p0);
        
        public abstract void e(final O p0);
        
        public static final class a
        {
            public Object a;
            public l.b b;
            
            public a(final Object a, final l.b b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}

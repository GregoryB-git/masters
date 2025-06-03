// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Set;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.util.Objects;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Comparator;

public class z extends x implements H
{
    private static final long serialVersionUID = 0L;
    public final transient y t;
    
    public z(final w w, final int n, final Comparator comparator) {
        super(w, n);
        this.t = l(comparator);
    }
    
    public static y l(final Comparator comparator) {
        if (comparator == null) {
            return y.X();
        }
        return A.j0(comparator);
    }
    
    public static z m(final Collection collection, final Comparator comparator) {
        if (collection.isEmpty()) {
            return n();
        }
        final w.a a = new w.a(collection.size());
        final Iterator<Map.Entry<Object, V>> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            final Object key = entry.getKey();
            final y p2 = p(comparator, (Collection)entry.getValue());
            if (!p2.isEmpty()) {
                a.f(key, p2);
                n += p2.size();
            }
        }
        return new z(a.c(), n, comparator);
    }
    
    public static z n() {
        return p.u;
    }
    
    public static y p(final Comparator comparator, final Collection collection) {
        if (comparator == null) {
            return y.T(collection);
        }
        return A.g0(comparator, collection);
    }
    
    public static y.a q(final Comparator comparator) {
        if (comparator == null) {
            return new y.a();
        }
        return new A.a(comparator);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final Comparator comparator = (Comparator)objectInputStream.readObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            final w.a a = w.a();
            int n;
            for (int i = n = 0; i < int1; ++i) {
                final Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                final int int2 = objectInputStream.readInt();
                if (int2 <= 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value count ");
                    sb.append(int2);
                    throw new InvalidObjectException(sb.toString());
                }
                final y.a q = q(comparator);
                for (int j = 0; j < int2; ++j) {
                    final Object object2 = objectInputStream.readObject();
                    Objects.requireNonNull(object2);
                    q.h(object2);
                }
                final y l = q.l();
                if (l.size() != int2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Duplicate key-value pairs exist for key ");
                    sb2.append(object);
                    throw new InvalidObjectException(sb2.toString());
                }
                a.f(object, l);
                n += int2;
            }
            try {
                c.a.b(this, a.c());
                c.b.a(this, n);
                b.a.b(this, l(comparator));
                return;
            }
            catch (IllegalArgumentException cause) {
                throw (InvalidObjectException)new InvalidObjectException(cause.getMessage()).initCause(cause);
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid key count ");
        sb3.append(int1);
        throw new InvalidObjectException(sb3.toString());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.o());
        Y.b(this, objectOutputStream);
    }
    
    public Comparator o() {
        final y t = this.t;
        if (t instanceof A) {
            return ((A)t).comparator();
        }
        return null;
    }
    
    public static final class a extends x.b
    {
        public z a() {
            final Set entrySet = super.a.entrySet();
            final Comparator b = super.b;
            Object c = entrySet;
            if (b != null) {
                c = P.b(b).e().c(entrySet);
            }
            return z.m((Collection)c, super.c);
        }
    }
    
    public abstract static final class b
    {
        public static final Y.b a;
        
        static {
            a = Y.a(z.class, "emptySet");
        }
    }
}

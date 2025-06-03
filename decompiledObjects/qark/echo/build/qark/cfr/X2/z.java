/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 */
package X2;

import X2.A;
import X2.H;
import X2.P;
import X2.Y;
import X2.p;
import X2.v;
import X2.w;
import X2.x;
import X2.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class z
extends x
implements H {
    private static final long serialVersionUID = 0L;
    public final transient y t;

    public z(w w8, int n8, Comparator comparator) {
        super(w8, n8);
        this.t = z.l(comparator);
    }

    public static y l(Comparator comparator) {
        if (comparator == null) {
            return y.X();
        }
        return A.j0(comparator);
    }

    public static z m(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return z.n();
        }
        w.a a8 = new w.a(collection.size());
        collection = collection.iterator();
        int n8 = 0;
        while (collection.hasNext()) {
            Object object = (Map.Entry)collection.next();
            Object object2 = object.getKey();
            if ((object = z.p(comparator, (Collection)object.getValue())).isEmpty()) continue;
            a8.f(object2, object);
            n8 += object.size();
        }
        return new z(a8.c(), n8, comparator);
    }

    public static z n() {
        return p.u;
    }

    public static y p(Comparator comparator, Collection collection) {
        if (comparator == null) {
            return y.T(collection);
        }
        return A.g0(comparator, collection);
    }

    public static y.a q(Comparator comparator) {
        if (comparator == null) {
            return new y.a();
        }
        return new A.a(comparator);
    }

    private void readObject(ObjectInputStream object) {
        object.defaultReadObject();
        Comparator comparator = (Comparator)object.readObject();
        int n8 = object.readInt();
        if (n8 >= 0) {
            int n9;
            w.a a8 = w.a();
            int n10 = n9 = 0;
            while (n9 < n8) {
                Object object2 = object.readObject();
                Objects.requireNonNull((Object)object2);
                int n11 = object.readInt();
                if (n11 > 0) {
                    Object object3 = z.q(comparator);
                    for (int i8 = 0; i8 < n11; ++i8) {
                        Object object4 = object.readObject();
                        Objects.requireNonNull((Object)object4);
                        object3.h(object4);
                    }
                    if ((object3 = object3.l()).size() == n11) {
                        a8.f(object2, object3);
                        n10 += n11;
                        ++n9;
                        continue;
                    }
                    object = new StringBuilder();
                    object.append("Duplicate key-value pairs exist for key ");
                    object.append(object2);
                    throw new InvalidObjectException(object.toString());
                }
                object = new StringBuilder();
                object.append("Invalid value count ");
                object.append(n11);
                throw new InvalidObjectException(object.toString());
            }
            try {
                object = a8.c();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException.getMessage()).initCause((Throwable)illegalArgumentException);
            }
            x.c.a.b(this, object);
            x.c.b.a(this, n10);
            b.a.b(this, (Object)z.l(comparator));
            return;
        }
        object = new StringBuilder();
        object.append("Invalid key count ");
        object.append(n8);
        throw new InvalidObjectException(object.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((Object)this.o());
        Y.b(this, objectOutputStream);
    }

    public Comparator o() {
        y y8 = this.t;
        if (y8 instanceof A) {
            return ((A)y8).comparator();
        }
        return null;
    }

    public static final class a
    extends x.b {
        public z a() {
            Set set = this.a.entrySet();
            Comparator comparator = this.b;
            Object object = set;
            if (comparator != null) {
                object = P.b(comparator).e().c((Iterable)set);
            }
            return z.m((Collection)object, this.c);
        }
    }

    public static final abstract class b {
        public static final Y.b a = Y.a(z.class, "emptySet");
    }

}


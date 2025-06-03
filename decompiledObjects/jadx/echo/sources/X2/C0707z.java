package X2;

import X2.A;
import X2.AbstractC0704w;
import X2.AbstractC0705x;
import X2.AbstractC0706y;
import X2.Y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0707z extends AbstractC0705x implements H {
    private static final long serialVersionUID = 0;

    /* renamed from: t, reason: collision with root package name */
    public final transient AbstractC0706y f7225t;

    /* renamed from: X2.z$a */
    public static final class a extends AbstractC0705x.b {
        public C0707z a() {
            Collection entrySet = this.f7215a.entrySet();
            Comparator comparator = this.f7216b;
            if (comparator != null) {
                entrySet = P.b(comparator).e().c(entrySet);
            }
            return C0707z.m(entrySet, this.f7217c);
        }
    }

    /* renamed from: X2.z$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Y.b f7226a = Y.a(C0707z.class, "emptySet");
    }

    public C0707z(AbstractC0704w abstractC0704w, int i7, Comparator comparator) {
        super(abstractC0704w, i7);
        this.f7225t = l(comparator);
    }

    public static AbstractC0706y l(Comparator comparator) {
        return comparator == null ? AbstractC0706y.X() : A.j0(comparator);
    }

    public static C0707z m(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return n();
        }
        AbstractC0704w.a aVar = new AbstractC0704w.a(collection.size());
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC0706y p7 = p(comparator, (Collection) entry.getValue());
            if (!p7.isEmpty()) {
                aVar.f(key, p7);
                i7 += p7.size();
            }
        }
        return new C0707z(aVar.c(), i7, comparator);
    }

    public static C0707z n() {
        return C0698p.f7182u;
    }

    public static AbstractC0706y p(Comparator comparator, Collection collection) {
        return comparator == null ? AbstractC0706y.T(collection) : A.g0(comparator, collection);
    }

    public static AbstractC0706y.a q(Comparator comparator) {
        return comparator == null ? new AbstractC0706y.a() : new A.a(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        AbstractC0704w.a a7 = AbstractC0704w.a();
        int i7 = 0;
        for (int i8 = 0; i8 < readInt; i8++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            AbstractC0706y.a q7 = q(comparator);
            for (int i9 = 0; i9 < readInt2; i9++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                q7.a(readObject2);
            }
            AbstractC0706y l7 = q7.l();
            if (l7.size() != readInt2) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
            }
            a7.f(readObject, l7);
            i7 += readInt2;
        }
        try {
            AbstractC0705x.c.f7218a.b(this, a7.c());
            AbstractC0705x.c.f7219b.a(this, i7);
            b.f7226a.b(this, l(comparator));
        } catch (IllegalArgumentException e7) {
            throw ((InvalidObjectException) new InvalidObjectException(e7.getMessage()).initCause(e7));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(o());
        Y.b(this, objectOutputStream);
    }

    public Comparator o() {
        AbstractC0706y abstractC0706y = this.f7225t;
        if (abstractC0706y instanceof A) {
            return ((A) abstractC0706y).comparator();
        }
        return null;
    }
}

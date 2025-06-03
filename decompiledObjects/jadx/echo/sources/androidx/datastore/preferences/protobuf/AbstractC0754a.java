package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0754a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0155a implements O.a {
        public static void j(Iterable iterable, List list) {
            AbstractC0777y.a(iterable);
            if (!(iterable instanceof D)) {
                if (iterable instanceof Y) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    l(iterable, list);
                    return;
                }
            }
            List o7 = ((D) iterable).o();
            D d7 = (D) list;
            int size = list.size();
            for (Object obj : o7) {
                if (obj == null) {
                    String str = "Element at index " + (d7.size() - size) + " is null.";
                    for (int size2 = d7.size() - 1; size2 >= size; size2--) {
                        d7.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0760g) {
                    d7.H((AbstractC0760g) obj);
                } else {
                    d7.add((String) obj);
                }
            }
        }

        public static void l(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static k0 p(O o7) {
            return new k0(o7);
        }

        public abstract AbstractC0155a n(AbstractC0754a abstractC0754a);

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC0155a h(O o7) {
            if (b().getClass().isInstance(o7)) {
                return n((AbstractC0754a) o7);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static void e(Iterable iterable, List list) {
        AbstractC0155a.j(iterable, list);
    }

    public abstract int i();

    public int j(e0 e0Var) {
        int i7 = i();
        if (i7 != -1) {
            return i7;
        }
        int e7 = e0Var.e(this);
        l(e7);
        return e7;
    }

    public k0 k() {
        return new k0(this);
    }

    public abstract void l(int i7);

    public void m(OutputStream outputStream) {
        AbstractC0763j Z6 = AbstractC0763j.Z(outputStream, AbstractC0763j.C(a()));
        g(Z6);
        Z6.W();
    }
}

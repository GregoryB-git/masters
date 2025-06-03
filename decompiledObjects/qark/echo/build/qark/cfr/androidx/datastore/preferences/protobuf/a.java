/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.y;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a
implements O {
    protected int memoizedHashCode = 0;

    public static void e(Iterable iterable, List list) {
        a.j(iterable, list);
    }

    public abstract int i();

    public int j(e0 e02) {
        int n8;
        int n9 = n8 = this.i();
        if (n8 == -1) {
            n9 = e02.e(this);
            this.l(n9);
        }
        return n9;
    }

    public k0 k() {
        return new k0(this);
    }

    public abstract void l(int var1);

    public void m(OutputStream object) {
        object = j.Z((OutputStream)object, j.C(this.a()));
        this.g((j)object);
        object.W();
    }

    public static abstract class a
    implements O.a {
        public static void j(Iterable object, List object2) {
            y.a(object);
            if (object instanceof D) {
                Object object3 = ((D)object).o();
                object = (D)object2;
                int n8 = object2.size();
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object3 = object2.next();
                    if (object3 == null) {
                        object2 = new StringBuilder();
                        object2.append("Element at index ");
                        object2.append(object.size() - n8);
                        object2.append(" is null.");
                        object2 = object2.toString();
                        for (int i8 = object.size() - 1; i8 >= n8; --i8) {
                            object.remove(i8);
                        }
                        throw new NullPointerException((String)object2);
                    }
                    if (object3 instanceof g) {
                        object.H((g)object3);
                        continue;
                    }
                    object.add((Object)((String)object3));
                }
            } else {
                if (object instanceof Y) {
                    object2.addAll((Collection)object);
                    return;
                }
                a.l((Iterable)object, (List)object2);
            }
        }

        public static void l(Iterable object, List list) {
            if (list instanceof ArrayList && object instanceof Collection) {
                ((ArrayList)list).ensureCapacity(list.size() + ((Collection)object).size());
            }
            int n8 = list.size();
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = object.next();
                if (object2 == null) {
                    object = new StringBuilder();
                    object.append("Element at index ");
                    object.append(list.size() - n8);
                    object.append(" is null.");
                    object = object.toString();
                    for (int i8 = list.size() - 1; i8 >= n8; --i8) {
                        list.remove(i8);
                    }
                    throw new NullPointerException((String)object);
                }
                list.add(object2);
            }
        }

        public static k0 p(O o8) {
            return new k0(o8);
        }

        public abstract a n(a var1);

        public a o(O o8) {
            if (this.b().getClass().isInstance((Object)o8)) {
                return this.n((a)o8);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

}


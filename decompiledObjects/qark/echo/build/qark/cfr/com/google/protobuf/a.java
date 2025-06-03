/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.protobuf;

import com.google.protobuf.K;
import com.google.protobuf.U;
import com.google.protobuf.Z;
import com.google.protobuf.f;
import com.google.protobuf.f0;
import com.google.protobuf.h;
import com.google.protobuf.t;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a
implements K {
    protected int memoizedHashCode = 0;

    public static void e(Iterable iterable, List list) {
        a.s(iterable, list);
    }

    public abstract int h(Z var1);

    public final String i(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(string2);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    public byte[] k() {
        try {
            byte[] arrby = new byte[this.a()];
            h h8 = h.X(arrby);
            this.j(h8);
            h8.c();
            return arrby;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.i("byte array"), (Throwable)iOException);
        }
    }

    public static abstract class a
    implements K.a {
        public static void s(Iterable object, List object2) {
            t.a(object);
            if (object instanceof z) {
                Object object3 = ((z)object).o();
                object = (z)object2;
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
                    if (object3 instanceof f) {
                        object.x((f)object3);
                        continue;
                    }
                    object.add((Object)((String)object3));
                }
            } else {
                if (object instanceof U) {
                    object2.addAll((Collection)object);
                    return;
                }
                a.t((Iterable)object, (List)object2);
            }
        }

        public static void t(Iterable object, List list) {
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

        public static f0 u(K k8) {
            return new f0(k8);
        }
    }

}


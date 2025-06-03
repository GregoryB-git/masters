package com.google.protobuf;

import com.google.protobuf.K;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1136a implements K {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0179a implements K.a {
        public static void s(Iterable iterable, List list) {
            AbstractC1154t.a(iterable);
            if (!(iterable instanceof InterfaceC1160z)) {
                if (iterable instanceof U) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    t(iterable, list);
                    return;
                }
            }
            List o7 = ((InterfaceC1160z) iterable).o();
            InterfaceC1160z interfaceC1160z = (InterfaceC1160z) list;
            int size = list.size();
            for (Object obj : o7) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1160z.size() - size) + " is null.";
                    for (int size2 = interfaceC1160z.size() - 1; size2 >= size; size2--) {
                        interfaceC1160z.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1141f) {
                    interfaceC1160z.x((AbstractC1141f) obj);
                } else {
                    interfaceC1160z.add((String) obj);
                }
            }
        }

        public static void t(Iterable iterable, List list) {
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

        public static f0 u(K k7) {
            return new f0(k7);
        }
    }

    public static void e(Iterable iterable, List list) {
        AbstractC0179a.s(iterable, list);
    }

    public abstract int h(Z z7);

    public final String i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public byte[] k() {
        try {
            byte[] bArr = new byte[a()];
            AbstractC1143h X6 = AbstractC1143h.X(bArr);
            j(X6);
            X6.c();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(i("byte array"), e7);
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0940j3 implements I4 {
    protected int zza = 0;

    public static void e(Iterable iterable, List list) {
        AbstractC0860a4.e(iterable);
        if (iterable instanceof InterfaceC0977n4) {
            List b7 = ((InterfaceC0977n4) iterable).b();
            InterfaceC0977n4 interfaceC0977n4 = (InterfaceC0977n4) list;
            int size = list.size();
            for (Object obj : b7) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0977n4.size() - size) + " is null.";
                    for (int size2 = interfaceC0977n4.size() - 1; size2 >= size; size2--) {
                        interfaceC0977n4.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1003q3) {
                    interfaceC0977n4.K((AbstractC1003q3) obj);
                } else {
                    interfaceC0977n4.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof S4) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public abstract int c(Z4 z42);

    public abstract int g();

    public final byte[] h() {
        try {
            byte[] bArr = new byte[a()];
            J3 D7 = J3.D(bArr);
            f(D7);
            D7.E();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void j(int i7);
}

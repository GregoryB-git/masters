// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class j3 implements I4
{
    protected int zza;
    
    public j3() {
        this.zza = 0;
    }
    
    public static void e(final Iterable iterable, final List list) {
        a4.e(iterable);
        if (iterable instanceof n4) {
            final List b = ((n4)iterable).b();
            final n4 n4 = (n4)list;
            final int size = list.size();
            for (final q3 next : b) {
                if (next == null) {
                    final int size2 = n4.size();
                    final StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    for (int i = n4.size() - 1; i >= size; --i) {
                        n4.remove(i);
                    }
                    throw new NullPointerException(string);
                }
                if (next instanceof q3) {
                    n4.K(next);
                }
                else {
                    n4.add((String)next);
                }
            }
            return;
        }
        if (iterable instanceof S4) {
            list.addAll((Collection<?>)iterable);
            return;
        }
        if (list instanceof ArrayList && iterable instanceof Collection) {
            ((ArrayList<Object>)list).ensureCapacity(list.size() + ((n4)iterable).size());
        }
        final int size3 = list.size();
        for (final Object next2 : iterable) {
            if (next2 == null) {
                final int size4 = list.size();
                final StringBuilder sb2 = new StringBuilder("Element at index ");
                sb2.append(size4 - size3);
                sb2.append(" is null.");
                final String string2 = sb2.toString();
                for (int j = list.size() - 1; j >= size3; --j) {
                    list.remove(j);
                }
                throw new NullPointerException(string2);
            }
            list.add(next2);
        }
    }
    
    public abstract int c(final Z4 p0);
    
    public abstract int g();
    
    public final byte[] h() {
        try {
            final byte[] array = new byte[this.a()];
            final J3 d = J3.D(array);
            this.f(d);
            d.E();
            return array;
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    public abstract void j(final int p0);
}

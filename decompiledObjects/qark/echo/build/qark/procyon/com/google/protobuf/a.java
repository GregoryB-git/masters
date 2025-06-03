// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import java.util.List;

public abstract class a implements K
{
    protected int memoizedHashCode;
    
    public a() {
        this.memoizedHashCode = 0;
    }
    
    public static void e(final Iterable iterable, final List list) {
        a.s(iterable, list);
    }
    
    public abstract int h(final Z p0);
    
    public final String i(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Serializing ");
        sb.append(this.getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
    
    public byte[] k() {
        try {
            final byte[] array = new byte[this.a()];
            final h x = h.X(array);
            this.j(x);
            x.c();
            return array;
        }
        catch (IOException cause) {
            throw new RuntimeException(this.i("byte array"), cause);
        }
    }
    
    public abstract static class a implements K.a
    {
        public static void s(final Iterable iterable, final List list) {
            t.a(iterable);
            if (iterable instanceof z) {
                final List o = ((z)iterable).o();
                final z z = (z)list;
                final int size = list.size();
                for (final f next : o) {
                    if (next == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Element at index ");
                        sb.append(z.size() - size);
                        sb.append(" is null.");
                        final String string = sb.toString();
                        for (int i = z.size() - 1; i >= size; --i) {
                            z.remove(i);
                        }
                        throw new NullPointerException(string);
                    }
                    if (next instanceof f) {
                        z.x(next);
                    }
                    else {
                        z.add((String)next);
                    }
                }
            }
            else {
                if (iterable instanceof U) {
                    list.addAll((Collection<?>)iterable);
                    return;
                }
                t(iterable, list);
            }
        }
        
        public static void t(final Iterable iterable, final List list) {
            if (list instanceof ArrayList && iterable instanceof Collection) {
                ((ArrayList<Object>)list).ensureCapacity(list.size() + ((Collection<Object>)iterable).size());
            }
            final int size = list.size();
            for (final Object next : iterable) {
                if (next == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Element at index ");
                    sb.append(list.size() - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    for (int i = list.size() - 1; i >= size; --i) {
                        list.remove(i);
                    }
                    throw new NullPointerException(string);
                }
                list.add(next);
            }
        }
        
        public static f0 u(final K k) {
            return new f0(k);
        }
    }
}

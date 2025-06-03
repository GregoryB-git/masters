// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
import android.support.v4.media.a;

public class K implements J
{
    public static int i(final int n, final Object o, final Object o2) {
        final I i = (I)o;
        a.a(o2);
        if (i.isEmpty()) {
            return 0;
        }
        final Iterator iterator = i.entrySet().iterator();
        if (!iterator.hasNext()) {
            return 0;
        }
        final Map.Entry entry = iterator.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
    
    public static I j(final Object o, final Object o2) {
        final I i = (I)o;
        final I j = (I)o2;
        I s = i;
        if (!j.isEmpty()) {
            s = i;
            if (!i.n()) {
                s = i.s();
            }
            s.p(j);
        }
        return s;
    }
    
    @Override
    public Object a(final Object o, final Object o2) {
        return j(o, o2);
    }
    
    @Override
    public int b(final int n, final Object o, final Object o2) {
        return i(n, o, o2);
    }
    
    @Override
    public Object c(final Object o) {
        ((I)o).o();
        return o;
    }
    
    @Override
    public H.a d(final Object o) {
        a.a(o);
        throw null;
    }
    
    @Override
    public Map e(final Object o) {
        return (I)o;
    }
    
    @Override
    public Object f(final Object o) {
        return I.f().s();
    }
    
    @Override
    public boolean g(final Object o) {
        return ((I)o).n() ^ true;
    }
    
    @Override
    public Map h(final Object o) {
        return (I)o;
    }
}

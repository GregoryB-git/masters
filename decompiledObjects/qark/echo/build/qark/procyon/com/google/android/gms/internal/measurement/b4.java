// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public abstract class b4
{
    public static s a(final r2 obj) {
        if (obj == null) {
            return s.d;
        }
        final int n = E3.a[obj.H().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final List l = obj.L();
                        final ArrayList<s> list = new ArrayList<s>();
                        final Iterator<r2> iterator = l.iterator();
                        while (iterator.hasNext()) {
                            list.add(a(iterator.next()));
                        }
                        return new v(obj.J(), list);
                    }
                    if (n != 5) {
                        final String value = String.valueOf(obj);
                        final StringBuilder sb = new StringBuilder("Invalid entity: ");
                        sb.append(value);
                        throw new IllegalStateException(sb.toString());
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                else {
                    if (obj.N()) {
                        return new h(obj.M());
                    }
                    return new h(null);
                }
            }
            else {
                if (obj.O()) {
                    return new k(obj.G());
                }
                return new k(null);
            }
        }
        else {
            if (obj.P()) {
                return new u(obj.K());
            }
            return s.k;
        }
    }
    
    public static s b(Object string) {
        if (string == null) {
            return s.e;
        }
        if (string instanceof String) {
            return new u((String)string);
        }
        if (string instanceof Double) {
            return new k((Double)string);
        }
        if (string instanceof Long) {
            return new k((double)string);
        }
        if (string instanceof Integer) {
            return new k((double)string);
        }
        if (string instanceof Boolean) {
            return new h((Boolean)string);
        }
        if (string instanceof Map) {
            final r r = new r();
            final Map map = (Map)string;
            for (final Object next : map.keySet()) {
                final s b = b(map.get(next));
                if (next != null) {
                    string = next;
                    if (!(next instanceof String)) {
                        string = next.toString();
                    }
                    r.a((String)string, b);
                }
            }
            return r;
        }
        if (string instanceof List) {
            final g g = new g();
            final Iterator<Object> iterator2 = (Iterator<Object>)((List)string).iterator();
            while (iterator2.hasNext()) {
                g.T(b(iterator2.next()));
            }
            return g;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}

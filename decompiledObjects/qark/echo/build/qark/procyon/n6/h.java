// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n6;

import java.util.ArrayList;
import W5.m;
import java.util.List;
import g6.l;
import java.util.Iterator;
import h6.a;
import kotlin.jvm.internal.Intrinsics;

public abstract class h extends g
{
    public static Iterable c(final b b) {
        Intrinsics.checkNotNullParameter(b, "<this>");
        return new Iterable() {
            @Override
            public Iterator iterator() {
                return b.iterator();
            }
        };
    }
    
    public static b d(final b b, final l l) {
        Intrinsics.checkNotNullParameter(b, "<this>");
        Intrinsics.checkNotNullParameter(l, "transform");
        return new i(b, l);
    }
    
    public static List e(final b b) {
        Intrinsics.checkNotNullParameter(b, "<this>");
        final Iterator iterator = b.iterator();
        if (!iterator.hasNext()) {
            return m.f();
        }
        Object e = iterator.next();
        if (!iterator.hasNext()) {
            return m.b(e);
        }
        final ArrayList<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(e);
            if (!iterator.hasNext()) {
                break;
            }
            e = iterator.next();
        }
        return list;
    }
}

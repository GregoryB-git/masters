// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Bundle;
import X2.v;
import java.util.List;
import W2.g;

public abstract class b
{
    public static v a(final g g, final List list) {
        final v.a m = v.M();
        for (int i = 0; i < list.size(); ++i) {
            m.h(g.apply(a.e(list.get(i))));
        }
        return m.k();
    }
    
    public static ArrayList b(final Collection collection, final g g) {
        final ArrayList<Bundle> list = new ArrayList<Bundle>(collection.size());
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add((Bundle)g.apply(iterator.next()));
        }
        return list;
    }
}

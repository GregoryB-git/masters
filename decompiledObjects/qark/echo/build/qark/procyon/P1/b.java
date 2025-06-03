// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P1;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
    public final ConcurrentHashMap a;
    
    public b() {
        this.a = new ConcurrentHashMap();
    }
    
    public final List a(final String key) {
        Intrinsics.checkNotNullParameter(key, "appId");
        final ConcurrentHashMap<K, a> concurrentHashMap = this.a.get(key);
        if (concurrentHashMap == null) {
            return null;
        }
        final ArrayList list = new ArrayList<a>(concurrentHashMap.size());
        final Iterator<Map.Entry<K, a>> iterator = concurrentHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            list.add((a)iterator.next().getValue());
        }
        return list;
    }
    
    public final void b(final String s, final List list) {
        Intrinsics.checkNotNullParameter(s, "appId");
        Intrinsics.checkNotNullParameter(list, "gateKeeperList");
        final ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<String, a>();
        for (final a a : (List<a>)list) {
            concurrentHashMap.put(a.a(), a);
        }
        this.a.put(s, concurrentHashMap);
    }
}

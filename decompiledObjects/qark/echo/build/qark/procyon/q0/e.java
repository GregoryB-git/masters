// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import g0.a;
import android.net.Uri;
import java.util.Map;
import java.util.LinkedHashMap;

public final class e
{
    public final LinkedHashMap a;
    
    public e(final int n) {
        this.a = new LinkedHashMap(n + 1, 1.0f, false) {
            public boolean removeEldestEntry(final Map.Entry entry) {
                return this.size() > n;
            }
        };
    }
    
    public byte[] a(final Uri key) {
        if (key == null) {
            return null;
        }
        return this.a.get(key);
    }
    
    public byte[] b(final Uri uri, final byte[] array) {
        return (byte[])this.a.put(g0.a.e(uri), g0.a.e(array));
    }
    
    public byte[] c(final Uri uri) {
        return (byte[])this.a.remove(g0.a.e(uri));
    }
}

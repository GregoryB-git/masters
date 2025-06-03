/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package q0;

import android.net.Uri;
import g0.a;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e {
    public final LinkedHashMap a;

    public e(final int n8) {
        this.a = new LinkedHashMap(n8 + 1, 1.0f, false){

            public boolean removeEldestEntry(Map.Entry entry) {
                if (this.size() > n8) {
                    return true;
                }
                return false;
            }
        };
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[])this.a.get((Object)uri);
    }

    public byte[] b(Uri uri, byte[] arrby) {
        return (byte[])this.a.put((Object)((Uri)a.e((Object)uri)), (Object)((byte[])a.e(arrby)));
    }

    public byte[] c(Uri uri) {
        return (byte[])this.a.remove(a.e((Object)uri));
    }

}


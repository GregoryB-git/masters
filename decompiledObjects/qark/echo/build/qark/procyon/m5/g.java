// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m5;

import java.util.List;
import E5.j;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import E5.c;
import android.content.Context;
import E5.k;

public class g implements c
{
    public final Context a;
    public final E5.c b;
    public final Map c;
    
    public g(final Context a, final E5.c b) {
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    public void a() {
        final Iterator<m5.d> iterator = new ArrayList<m5.d>(this.c.values()).iterator();
        while (iterator.hasNext()) {
            iterator.next().B0();
        }
        this.c.clear();
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2146443344: {
                if (!a.equals("disposeAllPlayers")) {
                    break;
                }
                n = 2;
                break;
            }
            case 1999985120: {
                if (!a.equals("disposePlayer")) {
                    break;
                }
                n = 1;
                break;
            }
            case 3237136: {
                if (!a.equals("init")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        HashMap hashMap = null;
        switch (n) {
            default: {
                d.c();
                return;
            }
            case 2: {
                this.a();
                hashMap = new HashMap();
                break;
            }
            case 1: {
                final String s = (String)j.a("id");
                final m5.d d2 = this.c.get(s);
                if (d2 != null) {
                    d2.B0();
                    this.c.remove(s);
                }
                hashMap = new HashMap();
                break;
            }
            case 0: {
                final String str = (String)j.a("id");
                if (this.c.containsKey(str)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Platform player ");
                    sb.append(str);
                    sb.append(" already exists");
                    d.b(sb.toString(), null, null);
                    return;
                }
                this.c.put(str, new m5.d(this.a, this.b, str, (Map)j.a("audioLoadConfiguration"), (List)j.a("androidAudioEffects"), (Boolean)j.a("androidOffloadSchedulingEnabled")));
                d.a(null);
                return;
            }
        }
        d.a(hashMap);
    }
}

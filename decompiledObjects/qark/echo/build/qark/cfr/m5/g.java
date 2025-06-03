/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package m5;

import E5.c;
import E5.j;
import E5.k;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.d;

public class g
implements k.c {
    public final Context a;
    public final c b;
    public final Map c = new HashMap();

    public g(Context context, c c8) {
        this.a = context;
        this.b = c8;
    }

    public void a() {
        Iterator iterator = new ArrayList(this.c.values()).iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).B0();
        }
        this.c.clear();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onMethodCall(j var1_1, k.d var2_2) {
        var5_3 = var1_1.a;
        var5_3.hashCode();
        var4_4 = var5_3.hashCode();
        var3_5 = -1;
        switch (var4_4) {
            default: {
                break;
            }
            case 2146443344: {
                if (!var5_3.equals((Object)"disposeAllPlayers")) break;
                var3_5 = 2;
                break;
            }
            case 1999985120: {
                if (!var5_3.equals((Object)"disposePlayer")) break;
                var3_5 = 1;
                break;
            }
            case 3237136: {
                if (!var5_3.equals((Object)"init")) break;
                var3_5 = 0;
            }
        }
        switch (var3_5) {
            default: {
                var2_2.c();
                return;
            }
            case 2: {
                this.a();
                var1_1 = new HashMap();
                ** GOTO lbl34
            }
            case 1: {
                var1_1 = (String)var1_1.a("id");
                var5_3 = (d)this.c.get(var1_1);
                if (var5_3 != null) {
                    var5_3.B0();
                    this.c.remove(var1_1);
                }
                var1_1 = new HashMap();
lbl34: // 2 sources:
                var2_2.a(var1_1);
                return;
            }
            case 0: 
        }
        var5_3 = (String)var1_1.a("id");
        if (this.c.containsKey(var5_3)) {
            var1_1 = new StringBuilder();
            var1_1.append("Platform player ");
            var1_1.append((String)var5_3);
            var1_1.append(" already exists");
            var2_2.b(var1_1.toString(), null, null);
            return;
        }
        var6_6 = (List)var1_1.a("androidAudioEffects");
        this.c.put(var5_3, (Object)new d(this.a, this.b, (String)var5_3, (Map)var1_1.a("audioLoadConfiguration"), var6_6, (Boolean)var1_1.a("androidOffloadSchedulingEnabled")));
        var2_2.a(null);
    }
}


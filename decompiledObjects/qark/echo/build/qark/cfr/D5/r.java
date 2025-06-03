/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Map
 */
package D5;

import E5.c;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import w5.a;

public class r {
    public final k a;
    public final PackageManager b;
    public b c;
    public final k.c d;

    public r(a object, PackageManager packageManager) {
        k.c c8;
        this.d = c8 = new k.c(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void onMethodCall(j var1_1, k.d var2_3) {
                if (r.a(r.this) == null) {
                    return;
                }
                var4_4 = var1_1.a;
                var1_1 = var1_1.b;
                var4_4.hashCode();
                if (var4_4.equals((Object)"ProcessText.processTextAction")) ** GOTO lbl13
                if (!var4_4.equals((Object)"ProcessText.queryTextActions")) {
                    var2_3.c();
                    return;
                }
                try {
                    var2_3.a((Object)r.a(r.this).b());
                    return;
lbl13: // 1 sources:
                    var1_1 = (ArrayList)var1_1;
                    var4_4 = (String)var1_1.get(0);
                    var5_5 = (String)var1_1.get(1);
                    var3_6 = (Boolean)var1_1.get(2);
                    r.a(r.this).c(var4_4, var5_5, var3_6, var2_3);
                    return;
                }
                catch (IllegalStateException var1_2) {
                    var2_3.b("error", var1_2.getMessage(), null);
                    return;
                }
            }
        };
        this.b = packageManager;
        this.a = object = new k((c)object, "flutter/processtext", q.b);
        object.e(c8);
    }

    public static /* synthetic */ b a(r r8) {
        return r8.c;
    }

    public void b(b b8) {
        this.c = b8;
    }

    public static interface b {
        public Map b();

        public void c(String var1, String var2, boolean var3, k.d var4);
    }

}


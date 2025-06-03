/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package D5;

import E5.c;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import java.util.HashMap;
import w5.a;

public class m {
    public final k a;
    public b b;
    public final k.c c;

    public m(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void onMethodCall(j object, k.d d8) {
                if (m.this.b == null) {
                    return;
                }
                String string2 = object.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received '");
                stringBuilder.append(string2);
                stringBuilder.append("' message.");
                t5.b.f("MouseCursorChannel", stringBuilder.toString());
                try {
                    if (string2.hashCode() != -1307105544) {
                        return;
                    }
                    if (!string2.equals((Object)"activateSystemCursor")) return;
                    object = (String)((HashMap)object.b).get((Object)"kind");
                }
                catch (Exception exception) {}
                m.this.b.a((String)object);
                {
                    catch (Exception exception) {
                        string2 = new StringBuilder();
                        string2.append("Error when setting cursors: ");
                        string2.append(exception.getMessage());
                        d8.b("error", string2.toString(), null);
                        return;
                    }
                }
                d8.a((Object)Boolean.TRUE);
                return;
                object = new StringBuilder();
                object.append("Unhandled error: ");
                object.append(exception.getMessage());
                d8.b("error", object.toString(), null);
            }
        };
        this.a = object = new k((c)object, "flutter/mousecursor", q.b);
        object.e(c8);
    }

    public void b(b b8) {
        this.b = b8;
    }

    public static interface b {
        public void a(String var1);
    }

}


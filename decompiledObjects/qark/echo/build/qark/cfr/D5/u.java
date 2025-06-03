/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package D5;

import E5.c;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import java.util.ArrayList;
import w5.a;

public class u {
    public final k a;
    public b b;
    public final k.c c;

    public u(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            @Override
            public void onMethodCall(j object, k.d d8) {
                if (u.this.b == null) {
                    t5.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                String string2 = object.a;
                object = object.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received '");
                stringBuilder.append(string2);
                stringBuilder.append("' message.");
                t5.b.f("SpellCheckChannel", stringBuilder.toString());
                string2.hashCode();
                if (!string2.equals((Object)"SpellCheck.initiateSpellCheck")) {
                    d8.c();
                    return;
                }
                try {
                    string2 = (ArrayList)object;
                    object = (String)string2.get(0);
                    string2 = (String)string2.get(1);
                    u.this.b.a((String)object, string2, d8);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", illegalStateException.getMessage(), null);
                    return;
                }
            }
        };
        this.a = object = new k((c)object, "flutter/spellcheck", q.b);
        object.e(c8);
    }

    public void b(b b8) {
        this.b = b8;
    }

    public static interface b {
        public void a(String var1, String var2, k.d var3);
    }

}


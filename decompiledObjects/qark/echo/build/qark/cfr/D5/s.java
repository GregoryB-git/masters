/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package D5;

import E5.c;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import java.util.HashMap;
import java.util.Map;
import t5.b;
import w5.a;

public class s {
    public final boolean a;
    public byte[] b;
    public k c;
    public k.d d;
    public boolean e = false;
    public boolean f = false;
    public final k.c g;

    public s(k k8, boolean bl) {
        k.c c8;
        this.g = c8 = new k.c(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void onMethodCall(j object, k.d d8) {
                String string2 = object.a;
                object = object.b;
                string2.hashCode();
                if (!string2.equals((Object)"get")) {
                    if (!string2.equals((Object)"put")) {
                        d8.c();
                        return;
                    }
                    s.this.b = (byte[])object;
                    object = null;
                } else {
                    s.this.f = true;
                    if (!s.this.e) {
                        object = s.this;
                        if (object.a) {
                            ((s)object).d = d8;
                            return;
                        }
                    }
                    object = s.this;
                    object = ((s)object).i(((s)object).b);
                }
                d8.a(object);
            }
        };
        this.c = k8;
        this.a = bl;
        k8.e(c8);
    }

    public s(a a8, boolean bl) {
        this(new k(a8, "flutter/restoration", q.b), bl);
    }

    public void g() {
        this.b = null;
    }

    public byte[] h() {
        return this.b;
    }

    public final Map i(byte[] arrby) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"enabled", (Object)Boolean.TRUE);
        hashMap.put((Object)"data", (Object)arrby);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j(final byte[] arrby) {
        this.e = true;
        k.d d8 = this.d;
        if (d8 != null) {
            d8.a((Object)this.i(arrby));
            this.d = null;
        } else if (this.f) {
            this.c.d("push", (Object)this.i(arrby), new k.d(){

                @Override
                public void a(Object object) {
                    s.this.b = arrby;
                }

                @Override
                public void b(String string2, String string3, Object object) {
                    object = new StringBuilder();
                    object.append("Error ");
                    object.append(string2);
                    object.append(" while sending restoration data to framework: ");
                    object.append(string3);
                    b.b("RestorationChannel", object.toString());
                }

                @Override
                public void c() {
                }
            });
            return;
        }
        this.b = arrby;
    }

}


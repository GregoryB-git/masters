/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import E5.c;
import E5.d;

public class e
implements d.b {
    public d.b a;

    public e(c c8, String string2) {
        new d(c8, string2).d(new d.d(){

            @Override
            public void a(Object object) {
                e.this.a = null;
            }

            @Override
            public void b(Object object, d.b b8) {
                e.this.a = b8;
            }
        });
    }

    @Override
    public void a(Object object) {
        d.b b8 = this.a;
        if (b8 != null) {
            b8.a(object);
        }
    }

    @Override
    public void b(String string2, String string3, Object object) {
        d.b b8 = this.a;
        if (b8 != null) {
            b8.b(string2, string3, object);
        }
    }

    @Override
    public void c() {
        d.b b8 = this.a;
        if (b8 != null) {
            b8.c();
        }
    }

}


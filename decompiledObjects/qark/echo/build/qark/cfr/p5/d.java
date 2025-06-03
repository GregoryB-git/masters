/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package p5;

import E5.j;
import E5.k;
import p5.f;

public class d
extends p5.a {
    public final a a;
    public final j b;

    public d(j j8, k.d d8) {
        this.b = j8;
        this.a = new a(d8);
    }

    @Override
    public Object c(String string2) {
        return this.b.a(string2);
    }

    @Override
    public String i() {
        return this.b.a;
    }

    @Override
    public boolean j(String string2) {
        return this.b.c(string2);
    }

    @Override
    public f o() {
        return this.a;
    }

    public class a
    implements f {
        public final k.d a;

        public a(k.d d9) {
            this.a = d9;
        }

        @Override
        public void a(Object object) {
            this.a.a(object);
        }

        @Override
        public void b(String string2, String string3, Object object) {
            this.a.b(string2, string3, object);
        }
    }

}


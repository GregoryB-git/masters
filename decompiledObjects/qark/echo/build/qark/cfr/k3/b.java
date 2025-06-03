/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package k3;

import c3.g;
import c3.y;
import k3.q;
import r3.a;

public abstract class b {
    public final a a;
    public final Class b;

    public b(a a8, Class class_) {
        this.a = a8;
        this.b = class_;
    }

    public /* synthetic */ b(a a8, Class class_,  a9) {
        this(a8, class_);
    }

    public static b a(final b b8, a a8, Class class_) {
        return new b(a8, class_){

            @Override
            public g d(q q8, y y8) {
                return b8.a(q8, y8);
            }
        };
    }

    public final a b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public abstract g d(q var1, y var2);

    public static interface b {
        public g a(q var1, y var2);
    }

}


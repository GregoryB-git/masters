/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package k3;

import c3.g;

public abstract class l {
    public final Class a;
    public final Class b;

    public l(Class class_, Class class_2) {
        this.a = class_;
        this.b = class_2;
    }

    public /* synthetic */ l(Class class_, Class class_2,  a8) {
        this(class_, class_2);
    }

    public static l b(final b b8, Class class_, Class class_2) {
        return new l(class_, class_2){

            @Override
            public Object a(g g8) {
                return b8.a(g8);
            }
        };
    }

    public abstract Object a(g var1);

    public Class c() {
        return this.a;
    }

    public Class d() {
        return this.b;
    }

    public static interface b {
        public Object a(g var1);
    }

}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package k3;

import r3.a;

public abstract class j {
    public final a a;
    public final Class b;

    public j(a a8, Class class_) {
        this.a = a8;
        this.b = class_;
    }

    public /* synthetic */ j(a a8, Class class_,  a9) {
        this(a8, class_);
    }

    public static j a(final b b8, a a8, Class class_) {
        return new j(a8, class_){};
    }

    public final a b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public static interface b {
    }

}


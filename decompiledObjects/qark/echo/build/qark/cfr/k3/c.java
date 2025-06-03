/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package k3;

public abstract class c {
    public final Class a;
    public final Class b;

    public c(Class class_, Class class_2) {
        this.a = class_;
        this.b = class_2;
    }

    public /* synthetic */ c(Class class_, Class class_2,  a8) {
        this(class_, class_2);
    }

    public static c a(final b b8, Class class_, Class class_2) {
        return new c(class_, class_2){};
    }

    public Class b() {
        return this.a;
    }

    public Class c() {
        return this.b;
    }

    public static interface b {
    }

}


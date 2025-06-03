/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package k3;

public abstract class k {
    public final Class a;
    public final Class b;

    public k(Class class_, Class class_2) {
        this.a = class_;
        this.b = class_2;
    }

    public /* synthetic */ k(Class class_, Class class_2,  a8) {
        this(class_, class_2);
    }

    public static k a(final b b8, Class class_, Class class_2) {
        return new k(class_, class_2){};
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


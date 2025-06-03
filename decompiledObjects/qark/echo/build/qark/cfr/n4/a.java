/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package n4;

import B3.E;

public class a {
    public final Class a;
    public final Object b;

    public a(Class class_, Object object) {
        this.a = (Class)E.b((Object)class_);
        this.b = E.b(object);
    }

    public Object a() {
        return this.b;
    }

    public Class b() {
        return this.a;
    }

    public String toString() {
        return String.format((String)"Event{type: %s, payload: %s}", (Object[])new Object[]{this.a, this.b});
    }
}


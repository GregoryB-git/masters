/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package L5;

import E5.d;
import L5.c;
import L5.y;
import Q3.b;
import java.util.Map;

public class a
extends c
implements Q3.a {
    public a(d.b b8, String string2) {
        super(b8, string2);
    }

    @Override
    public void a(Q3.c object) {
        object = y.a((Q3.c)object);
        this.a.b(object.e(), object.getMessage(), (Object)object.d());
    }

    @Override
    public void c(b b8) {
        this.h("childRemoved", b8, null);
    }

    @Override
    public void d(b b8, String string2) {
        this.h("childMoved", b8, string2);
    }

    @Override
    public void e(b b8, String string2) {
        this.h("childChanged", b8, string2);
    }

    @Override
    public void f(b b8, String string2) {
        this.h("childAdded", b8, string2);
    }
}


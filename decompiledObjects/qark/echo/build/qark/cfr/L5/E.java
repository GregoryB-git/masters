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
import Q3.s;
import java.util.Map;

public class E
extends c
implements s {
    public E(d.b b8) {
        super(b8, "value");
    }

    @Override
    public void a(Q3.c object) {
        object = y.a((Q3.c)object);
        this.a.b(object.e(), object.getMessage(), (Object)object.d());
    }

    @Override
    public void b(b b8) {
        this.h("value", b8, null);
    }
}


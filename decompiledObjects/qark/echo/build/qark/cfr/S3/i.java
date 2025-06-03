/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package S3;

import S3.g;
import S3.h;
import S3.j;

public class i
extends j {
    public i(Object object, Object object2) {
        super(object, object2, g.j(), g.j());
    }

    public i(Object object, Object object2, h h8, h h9) {
        super(object, object2, h8, h9);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public j l(Object object, Object object2, h h8, h h9) {
        Object object3 = object;
        if (object == null) {
            object3 = this.getKey();
        }
        object = object2;
        if (object2 == null) {
            object = this.getValue();
        }
        object2 = h8;
        if (h8 == null) {
            object2 = this.a();
        }
        h8 = h9;
        if (h9 == null) {
            h8 = this.f();
        }
        return new i(object3, object, (h)object2, h8);
    }

    @Override
    public h.a n() {
        return h.a.o;
    }

    @Override
    public int size() {
        return this.a().size() + 1 + this.f().size();
    }
}


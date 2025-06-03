/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package S3;

import S3.h;
import S3.j;

public class f
extends j {
    public int e = -1;

    public f(Object object, Object object2, h h8, h h9) {
        super(object, object2, h8, h9);
    }

    @Override
    public boolean d() {
        return false;
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
        return new f(object3, object, (h)object2, h8);
    }

    @Override
    public h.a n() {
        return h.a.p;
    }

    @Override
    public int size() {
        if (this.e == -1) {
            this.e = this.a().size() + 1 + this.f().size();
        }
        return this.e;
    }

    @Override
    public void u(h h8) {
        if (this.e == -1) {
            super.u(h8);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }
}


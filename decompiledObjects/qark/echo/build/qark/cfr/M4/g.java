/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.NoSuchElementException
 */
package M4;

import java.util.NoSuchElementException;

public final class g {
    public final Object a;

    public g() {
        this.a = null;
    }

    public g(Object object) {
        if (object != null) {
            this.a = object;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }

    public static g a() {
        return new g();
    }

    public static g b(Object object) {
        if (object == null) {
            return g.a();
        }
        return g.e(object);
    }

    public static g e(Object object) {
        return new g(object);
    }

    public Object c() {
        Object object = this.a;
        if (object != null) {
            return object;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        if (this.a != null) {
            return true;
        }
        return false;
    }
}


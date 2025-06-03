/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package q5;

import q5.b;

public final class a
implements U5.a {
    public static final Object c = new Object();
    public volatile U5.a a;
    public volatile Object b = c;

    public a(U5.a a8) {
        this.a = a8;
    }

    public static U5.a a(U5.a a8) {
        b.b(a8);
        if (a8 instanceof a) {
            return a8;
        }
        return new a(a8);
    }

    public static Object b(Object object, Object object2) {
        if (object != c) {
            if (object == object2) {
                return object2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
            stringBuilder.append(object);
            stringBuilder.append(" & ");
            stringBuilder.append(object2);
            stringBuilder.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object get() {
        Object object = this.b;
        Object object2 = c;
        if (object != object2) {
            return object;
        }
        synchronized (this) {
            try {
                Object object3;
                object = object3 = this.b;
                if (object3 == object2) {
                    object = this.a.get();
                    this.b = a.b(this.b, object);
                    this.a = null;
                }
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


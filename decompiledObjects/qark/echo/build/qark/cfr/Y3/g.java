/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Y3;

public final class g {
    public final Object a;
    public final Object b;

    public g(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public Object a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (g.class != object.getClass()) {
                return false;
            }
            object = (g)object;
            Object object2 = this.a;
            if (object2 != null ? !object2.equals(object.a) : object.a != null) {
                return false;
            }
            object2 = this.b;
            object = object.b;
            if (object2 != null ? !object2.equals(object) : object != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object != null ? object.hashCode() : 0;
        object = this.b;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair(");
        stringBuilder.append(this.a);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 */
package d0;

public final class e {
    public final int a;
    public final float b;

    public e(int n8, float f8) {
        this.a = n8;
        this.b = f8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (e.class != object.getClass()) {
                return false;
            }
            object = (e)object;
            if (this.a == object.a && Float.compare((float)object.b, (float)this.b) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.a) * 31 + Float.floatToIntBits((float)this.b);
    }
}


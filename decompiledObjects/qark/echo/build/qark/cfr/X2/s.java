/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package X2;

public abstract class s {
    public static int a(int n8, double d8) {
        int n9;
        if ((n8 = Math.max((int)n8, (int)2)) > (int)(d8 * (double)(n9 = Integer.highestOneBit((int)n8)))) {
            n8 = n9 << 1;
            if (n8 > 0) {
                return n8;
            }
            return 1073741824;
        }
        return n9;
    }

    public static int b(int n8) {
        return (int)((long)Integer.rotateLeft((int)((int)((long)n8 * -862048943L)), (int)15) * 461845907L);
    }

    public static int c(Object object) {
        int n8 = object == null ? 0 : object.hashCode();
        return s.b(n8);
    }
}


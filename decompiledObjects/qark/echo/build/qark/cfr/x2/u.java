/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package x2;

public abstract class u {
    public static int a(int n8) {
        for (int i8 = 0; i8 < 3; ++i8) {
            int n9 = new int[]{1, 2, 3}[i8];
            if (n9 != 0) {
                if (n9 - 1 != n8) continue;
                return n9;
            }
            throw null;
        }
        return 1;
    }
}


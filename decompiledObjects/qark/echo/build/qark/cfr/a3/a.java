/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a3;

public abstract class a {
    public static int a(boolean bl, boolean bl2) {
        if (bl == bl2) {
            return 0;
        }
        if (bl) {
            return 1;
        }
        return -1;
    }

    public static boolean b(boolean[] arrbl, boolean bl) {
        int n8 = arrbl.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrbl[i8] != bl) continue;
            return true;
        }
        return false;
    }
}


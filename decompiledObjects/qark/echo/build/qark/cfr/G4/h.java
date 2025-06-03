/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  java.lang.Object
 */
package G4;

import android.util.SparseIntArray;

public abstract class h {
    public static a a(SparseIntArray[] sparseIntArray) {
        int n8;
        int n9;
        int n10 = 0;
        if (sparseIntArray != null && (sparseIntArray = sparseIntArray[0]) != null) {
            n8 = n9 = (n10 = 0);
            for (int i8 = 0; i8 < sparseIntArray.size(); ++i8) {
                int n11 = sparseIntArray.keyAt(i8);
                int n12 = sparseIntArray.valueAt(i8);
                n10 += n12;
                int n13 = n8;
                if (n11 > 700) {
                    n13 = n8 + n12;
                }
                n8 = n9;
                if (n11 > 16) {
                    n8 = n9 + n12;
                }
                n9 = n8;
                n8 = n13;
            }
        } else {
            n8 = n9 = 0;
        }
        return new a(n10, n9, n8);
    }

    public static class a {
        public int a;
        public int b;
        public int c;

        public a(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }

        public a a(a a8) {
            return new a(this.a - a8.d(), this.b - a8.c(), this.c - a8.b());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.a;
        }
    }

}


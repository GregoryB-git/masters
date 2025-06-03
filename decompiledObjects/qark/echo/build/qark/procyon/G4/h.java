// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G4;

import android.util.SparseIntArray;

public abstract class h
{
    public static a a(final SparseIntArray[] array) {
        int n = 0;
        int i = 0;
        if (array != null) {
            final SparseIntArray sparseIntArray = array[0];
            if (sparseIntArray != null) {
                n = 0;
                int n3;
                int n2 = n3 = n;
                while (i < sparseIntArray.size()) {
                    final int key = sparseIntArray.keyAt(i);
                    final int value = sparseIntArray.valueAt(i);
                    n += value;
                    int n4 = n3;
                    if (key > 700) {
                        n4 = n3 + value;
                    }
                    int n5 = n2;
                    if (key > 16) {
                        n5 = n2 + value;
                    }
                    ++i;
                    n2 = n5;
                    n3 = n4;
                }
                return new a(n, n2, n3);
            }
        }
        int n3;
        int n2 = n3 = 0;
        return new a(n, n2, n3);
    }
    
    public static class a
    {
        public int a;
        public int b;
        public int c;
        
        public a(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public a a(final a a) {
            return new a(this.a - a.d(), this.b - a.c(), this.c - a.b());
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

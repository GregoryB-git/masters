// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h5;

public abstract class d
{
    public static int a(final b b) {
        return b(b, true) + b(b, false);
    }
    
    public static int b(final b b, final boolean b2) {
        int n;
        if (b2) {
            n = b.d();
        }
        else {
            n = b.e();
        }
        int n2;
        if (b2) {
            n2 = b.e();
        }
        else {
            n2 = b.d();
        }
        final byte[][] c = b.c();
        int n3;
        int n8;
        for (int i = n3 = 0; i < n; ++i, n3 = n8) {
            byte b3 = -1;
            int n4;
            int n5;
            byte b5;
            for (int j = n4 = 0; j < n2; ++j, b3 = b5, n4 = n5) {
                byte b4;
                if (b2) {
                    b4 = c[i][j];
                }
                else {
                    b4 = c[j][i];
                }
                if (b4 == b3) {
                    n5 = n4 + 1;
                    b5 = b3;
                }
                else {
                    int n6 = n3;
                    if (n4 >= 5) {
                        n6 = n3 + (n4 - 2);
                    }
                    final int n7 = 1;
                    b5 = b4;
                    n5 = n7;
                    n3 = n6;
                }
            }
            n8 = n3;
            if (n4 >= 5) {
                n8 = n3 + (n4 - 2);
            }
        }
        return n3;
    }
    
    public static int c(final b b) {
        final byte[][] c = b.c();
        final int e = b.e();
        int n;
        for (int d = b.d(), i = n = 0; i < d - 1; ++i) {
            final byte[] array = c[i];
            int n2;
            int n3;
            for (int j = 0; j < e - 1; j = n2, n = n3) {
                final byte b2 = array[j];
                n2 = j + 1;
                n3 = n;
                if (b2 == array[n2]) {
                    final byte[] array2 = c[i + 1];
                    n3 = n;
                    if (b2 == array2[j]) {
                        n3 = n;
                        if (b2 == array2[n2]) {
                            n3 = n + 1;
                        }
                    }
                }
            }
        }
        return n * 3;
    }
    
    public static int d(final b b) {
        final byte[][] c = b.c();
        final int e = b.e();
        int n;
        for (int d = b.d(), i = n = 0; i < d; ++i) {
            for (int j = 0; j < e; ++j) {
                final byte[] array = c[i];
                final int n2 = j + 6;
                int n3 = n;
                Label_0173: {
                    if (n2 < e) {
                        n3 = n;
                        if (array[j] == 1) {
                            n3 = n;
                            if (array[j + 1] == 0) {
                                n3 = n;
                                if (array[j + 2] == 1) {
                                    n3 = n;
                                    if (array[j + 3] == 1) {
                                        n3 = n;
                                        if (array[j + 4] == 1) {
                                            n3 = n;
                                            if (array[j + 5] == 0) {
                                                n3 = n;
                                                if (array[n2] == 1) {
                                                    if (!g(array, j - 4, j)) {
                                                        n3 = n;
                                                        if (!g(array, j + 7, j + 11)) {
                                                            break Label_0173;
                                                        }
                                                    }
                                                    n3 = n + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final int n4 = i + 6;
                n = n3;
                if (n4 < d) {
                    n = n3;
                    if (c[i][j] == 1) {
                        n = n3;
                        if (c[i + 1][j] == 0) {
                            n = n3;
                            if (c[i + 2][j] == 1) {
                                n = n3;
                                if (c[i + 3][j] == 1) {
                                    n = n3;
                                    if (c[i + 4][j] == 1) {
                                        n = n3;
                                        if (c[i + 5][j] == 0) {
                                            n = n3;
                                            if (c[n4][j] == 1) {
                                                if (!h(c, j, i - 4, i)) {
                                                    n = n3;
                                                    if (!h(c, j, i + 7, i + 11)) {
                                                        continue;
                                                    }
                                                }
                                                n = n3 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n * 40;
    }
    
    public static int e(final b b) {
        final byte[][] c = b.c();
        final int e = b.e();
        int n;
        for (int d = b.d(), i = n = 0; i < d; ++i) {
            final byte[] array = c[i];
            int n2;
            for (int j = 0; j < e; ++j, n = n2) {
                n2 = n;
                if (array[j] == 1) {
                    n2 = n + 1;
                }
            }
        }
        final int n3 = b.d() * b.e();
        return Math.abs((n << 1) - n3) * 10 / n3 * 10;
    }
    
    public static boolean f(int i, final int n, final int n2) {
        int n3 = n;
        int n4 = n2;
        int n5 = n2;
        switch (i) {
            default: {
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
            }
            case 7: {
                i = n2 * n % 3 + (n2 + n & 0x1);
                break;
            }
            case 6: {
                i = n2 * n;
                i = (i & 0x1) + i % 3;
                break;
            }
            case 5: {
                i = n2 * n;
                i = (i & 0x1) + i % 3;
                return i == 0;
            }
            case 4: {
                n4 = n2 / 2;
                n3 = n / 3;
            }
            case 0: {
                n5 = n4 + n3;
            }
            case 1: {
                i = (n5 & 0x1);
                return i == 0;
            }
            case 3: {
                i = (n2 + n) % 3;
                return i == 0;
            }
            case 2: {
                i = n % 3;
                return i == 0;
            }
        }
        i &= 0x1;
        return i == 0;
    }
    
    public static boolean g(final byte[] array, int i, int min) {
        for (i = Math.max(i, 0), min = Math.min(min, array.length); i < min; ++i) {
            if (array[i] == 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean h(final byte[][] array, final int n, int i, int min) {
        for (i = Math.max(i, 0), min = Math.min(min, array.length); i < min; ++i) {
            if (array[i][n] == 1) {
                return false;
            }
        }
        return true;
    }
}

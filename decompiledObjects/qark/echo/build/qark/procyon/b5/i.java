// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public abstract class i
{
    public static final int[] a;
    public static final int[][] b;
    public static final int[] c;
    public static final int[] d;
    
    static {
        a = new int[] { 5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68 };
        b = new int[][] { { 228, 48, 15, 111, 62 }, { 23, 68, 144, 134, 240, 92, 254 }, { 28, 24, 185, 166, 223, 248, 116, 255, 110, 61 }, { 175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120 }, { 41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242 }, { 156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185 }, { 83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188 }, { 15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172 }, { 52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193 }, { 211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255 }, { 245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112 }, { 77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5 }, { 245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19 }, { 175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46 }, { 242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204 }, { 220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186 } };
        c = new int[256];
        d = new int[255];
        int i = 0;
        int n = 1;
        while (i < 255) {
            b5.i.d[i] = n;
            b5.i.c[n] = i;
            final int n2 = n << 1;
            if ((n = n2) >= 256) {
                n = (n2 ^ 0x12D);
            }
            ++i;
        }
    }
    
    public static String a(final CharSequence charSequence, final int n) {
        return b(charSequence, 0, charSequence.length(), n);
    }
    
    public static String b(final CharSequence charSequence, int i, final int n, final int j) {
        final int n2 = 0;
        int n3 = 0;
        while (true) {
            final int[] a = i.a;
            if (n3 >= a.length) {
                n3 = -1;
                break;
            }
            if (a[n3] == j) {
                break;
            }
            ++n3;
        }
        if (n3 >= 0) {
            final int[] array = i.b[n3];
            final char[] array2 = new char[j];
            for (int k = 0; k < j; ++k) {
                array2[k] = '\0';
            }
            for (int l = i; l < i + n; ++l) {
                int n4 = j - 1;
                final int n5 = array2[n4] ^ charSequence.charAt(l);
                while (n4 > 0) {
                    Label_0200: {
                        if (n5 != 0) {
                            final int n6 = array[n4];
                            if (n6 != 0) {
                                final char c = array2[n4 - 1];
                                final int[] d = i.d;
                                final int[] c2 = i.c;
                                array2[n4] = (char)(d[(c2[n5] + c2[n6]) % 255] ^ c);
                                break Label_0200;
                            }
                        }
                        array2[n4] = array2[n4 - 1];
                    }
                    --n4;
                }
                if (n5 != 0) {
                    final int n7 = array[0];
                    if (n7 != 0) {
                        final int[] d2 = i.d;
                        final int[] c3 = i.c;
                        array2[0] = (char)d2[(c3[n5] + c3[n7]) % 255];
                        continue;
                    }
                }
                array2[0] = '\0';
            }
            final char[] data = new char[j];
            for (i = n2; i < j; ++i) {
                data[i] = array2[j - i - 1];
            }
            return String.valueOf(data);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(j)));
    }
    
    public static String c(final String str, final k k) {
        if (str.length() == k.a()) {
            final StringBuilder sb = new StringBuilder(k.a() + k.c());
            sb.append(str);
            final int f = k.f();
            if (f == 1) {
                sb.append(a(str, k.c()));
            }
            else {
                sb.setLength(sb.capacity());
                final int[] array = new int[f];
                final int[] array2 = new int[f];
                final int[] array3 = new int[f];
                int n;
                for (int i = 0; i < f; i = n) {
                    n = i + 1;
                    array[i] = k.b(n);
                    array2[i] = k.d(n);
                    array3[i] = 0;
                    if (i > 0) {
                        array3[i] = array3[i - 1] + array[i];
                    }
                }
                for (int j = 0; j < f; ++j) {
                    final StringBuilder sb2 = new StringBuilder(array[j]);
                    for (int l = j; l < k.a(); l += f) {
                        sb2.append(str.charAt(l));
                    }
                    final String a = a(sb2.toString(), array2[j]);
                    for (int n2 = j, index = 0; n2 < array2[j] * f; n2 += f, ++index) {
                        sb.setCharAt(k.a() + n2, a.charAt(index));
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.F5;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.k4;

public final class I5
extends F5 {
    @Override
    public final int a(int n8, byte[] arrby, int n9, int n10) {
        while (n9 < n10 && arrby[n9] >= 0) {
            ++n9;
        }
        n8 = n9;
        if (n9 >= n10) {
            return 0;
        }
        while ((n9 = n8) < n10) {
            int n11 = n9 + 1;
            n8 = arrby[n9];
            if (n8 < 0) {
                if (n8 < -32) {
                    if (n11 >= n10) {
                        return n8;
                    }
                    if (n8 >= -62) {
                        n8 = n9 + 2;
                        if (arrby[n11] <= -65) continue;
                    }
                    return -1;
                }
                if (n8 < -16) {
                    if (n11 >= n10 - 1) {
                        return E5.c(arrby, n11, n10);
                    }
                    if (!((n11 = arrby[n11]) > -65 || n8 == -32 && n11 < -96 || n8 == -19 && n11 >= -96)) {
                        n8 = n9 + 3;
                        if (arrby[n9 + 2] <= -65) continue;
                    }
                    return -1;
                }
                if (n11 >= n10 - 2) {
                    return E5.c(arrby, n11, n10);
                }
                if ((n11 = arrby[n11]) <= -65 && (n8 << 28) + (n11 + 112) >> 30 == 0 && arrby[n9 + 2] <= -65) {
                    n8 = n9 + 4;
                    if (arrby[n9 + 3] <= -65) continue;
                }
                return -1;
            }
            n8 = n11;
        }
        return 0;
    }

    @Override
    public final int b(CharSequence charSequence, byte[] arrby, int n8, int n9) {
        int n10;
        int n11;
        int n12 = charSequence.length();
        int n13 = n9 + n8;
        for (n9 = 0; n9 < n12 && (n10 = n9 + n8) < n13 && (n11 = charSequence.charAt(n9)) < 128; ++n9) {
            arrby[n10] = (byte)n11;
        }
        if (n9 == n12) {
            return n8 + n12;
        }
        n8 += n9;
        while (n9 < n12) {
            char c8;
            block11 : {
                block12 : {
                    block13 : {
                        block8 : {
                            block10 : {
                                block9 : {
                                    block7 : {
                                        c8 = charSequence.charAt(n9);
                                        if (c8 >= '' || n8 >= n13) break block7;
                                        arrby[n8] = (byte)c8;
                                        ++n8;
                                        break block8;
                                    }
                                    if (c8 >= '\u0800' || n8 > n13 - 2) break block9;
                                    arrby[n8] = (byte)(c8 >>> 6 | 960);
                                    n10 = n8 + 2;
                                    arrby[n8 + 1] = (byte)(c8 & 63 | 128);
                                    n8 = n10;
                                    break block8;
                                }
                                if (c8 >= '\ud800' && '\udfff' >= c8 || n8 > n13 - 3) break block10;
                                arrby[n8] = (byte)(c8 >>> 12 | 480);
                                arrby[n8 + 1] = (byte)(c8 >>> 6 & 63 | 128);
                                n10 = n8 + 3;
                                arrby[n8 + 2] = (byte)(c8 & 63 | 128);
                                n8 = n10;
                                break block8;
                            }
                            if (n8 > n13 - 4) break block11;
                            n10 = n9 + 1;
                            if (n10 == charSequence.length()) break block12;
                            char c9 = charSequence.charAt(n10);
                            if (!Character.isSurrogatePair((char)c8, (char)c9)) break block13;
                            n9 = Character.toCodePoint((char)c8, (char)c9);
                            arrby[n8] = (byte)(n9 >>> 18 | 240);
                            arrby[n8 + 1] = (byte)(n9 >>> 12 & 63 | 128);
                            arrby[n8 + 2] = (byte)(n9 >>> 6 & 63 | 128);
                            n11 = n8 + 4;
                            arrby[n8 + 3] = (byte)(n9 & 63 | 128);
                            n9 = n10;
                            n8 = n11;
                        }
                        ++n9;
                        continue;
                    }
                    n9 = n10;
                }
                throw new H5(n9 - 1, n12);
            }
            if (!('\ud800' > c8 || c8 > '\udfff' || (n10 = n9 + 1) != charSequence.length() && Character.isSurrogatePair((char)c8, (char)charSequence.charAt(n10)))) {
                throw new H5(n9, n12);
            }
            charSequence = new StringBuilder("Failed writing ");
            charSequence.append(c8);
            charSequence.append(" at index ");
            charSequence.append(n8);
            throw new ArrayIndexOutOfBoundsException(charSequence.toString());
        }
        return n8;
    }

    @Override
    public final String c(byte[] arrby, int n8, int n9) {
        if ((n8 | n9 | arrby.length - n8 - n9) >= 0) {
            byte by;
            int n10;
            int n11 = n8 + n9;
            char[] arrc = new char[n9];
            n9 = 0;
            while (n8 < n11 && (by = arrby[n8]) >= 0) {
                ++n8;
                G5.d(by, arrc, n9);
                ++n9;
            }
            while ((n10 = n8) < n11) {
                byte by2;
                n8 = n10 + 1;
                by = arrby[n10];
                if (by >= 0) {
                    n10 = n9 + 1;
                    G5.d(by, arrc, n9);
                    n9 = n10;
                    while (n8 < n11 && (by = arrby[n8]) >= 0) {
                        ++n8;
                        G5.d(by, arrc, n9);
                        ++n9;
                    }
                    continue;
                }
                if (by < -32) {
                    if (n8 < n11) {
                        G5.c(by, arrby[n8], arrc, n9);
                        ++n9;
                        n8 = n10 += 2;
                        continue;
                    }
                    throw k4.c();
                }
                if (by < -16) {
                    if (n8 < n11 - 1) {
                        by2 = arrby[n8];
                        n8 = n10 + 3;
                        G5.b(by, by2, arrby[n10 + 2], arrc, n9);
                        ++n9;
                        continue;
                    }
                    throw k4.c();
                }
                if (n8 < n11 - 2) {
                    by2 = arrby[n8];
                    byte by3 = arrby[n10 + 2];
                    n8 = n10 + 4;
                    G5.a(by, by2, by3, arrby[n10 + 3], arrc, n9);
                    n9 += 2;
                    continue;
                }
                throw k4.c();
            }
            return new String(arrc, 0, n9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format((String)"buffer length=%d, index=%d, size=%d", (Object[])new Object[]{arrby.length, n8, n9}));
    }
}


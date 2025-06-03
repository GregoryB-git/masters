// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class I5 extends F5
{
    @Override
    public final int a(int n, final byte[] array, int n2, final int n3) {
        while (n2 < n3 && array[n2] >= 0) {
            ++n2;
        }
        if ((n = n2) >= n3) {
            return 0;
        }
        while (true) {
            n2 = n;
            if (n2 >= n3) {
                return 0;
            }
            final int n4 = n2 + 1;
            n = array[n2];
            if (n < 0) {
                if (n < -32) {
                    if (n4 >= n3) {
                        return n;
                    }
                    if (n < -62) {
                        break;
                    }
                    n = n2 + 2;
                    if (array[n4] > -65) {
                        break;
                    }
                    continue;
                }
                else if (n < -16) {
                    if (n4 >= n3 - 1) {
                        return E5.c(array, n4, n3);
                    }
                    final byte b = array[n4];
                    if (b > -65 || (n == -32 && b < -96) || (n == -19 && b >= -96)) {
                        return -1;
                    }
                    n = n2 + 3;
                    if (array[n2 + 2] > -65) {
                        return -1;
                    }
                    continue;
                }
                else {
                    if (n4 >= n3 - 2) {
                        return E5.c(array, n4, n3);
                    }
                    final byte b2 = array[n4];
                    if (b2 > -65 || (n << 28) + (b2 + 112) >> 30 != 0 || array[n2 + 2] > -65) {
                        return -1;
                    }
                    n = n2 + 4;
                    if (array[n2 + 3] > -65) {
                        return -1;
                    }
                    continue;
                }
            }
            else {
                n = n4;
            }
        }
        return -1;
    }
    
    @Override
    public final int b(final CharSequence charSequence, final byte[] array, int i, int j) {
        final int length = charSequence.length();
        final int n = j + i;
        int n2;
        char char1;
        for (j = 0; j < length; ++j) {
            n2 = j + i;
            if (n2 >= n) {
                break;
            }
            char1 = charSequence.charAt(j);
            if (char1 >= '\u0080') {
                break;
            }
            array[n2] = (byte)char1;
        }
        if (j == length) {
            return i + length;
        }
        i += j;
        while (j < length) {
            final char char2 = charSequence.charAt(j);
            Label_0396: {
                if (char2 < '\u0080' && i < n) {
                    array[i] = (byte)char2;
                    ++i;
                }
                else if (char2 < '\u0800' && i <= n - 2) {
                    array[i] = (byte)(char2 >>> 6 | 0x3C0);
                    final int n3 = i + 2;
                    array[i + 1] = (byte)((char2 & '?') | 0x80);
                    i = n3;
                }
                else if ((char2 < '\ud800' || '\udfff' < char2) && i <= n - 3) {
                    array[i] = (byte)(char2 >>> 12 | 0x1E0);
                    array[i + 1] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                    final int n4 = i + 3;
                    array[i + 2] = (byte)((char2 & '?') | 0x80);
                    i = n4;
                }
                else {
                    if (i <= n - 4) {
                        final int n5 = j + 1;
                        if (n5 != charSequence.length()) {
                            final char char3 = charSequence.charAt(n5);
                            if (Character.isSurrogatePair(char2, char3)) {
                                j = Character.toCodePoint(char2, char3);
                                array[i] = (byte)(j >>> 18 | 0xF0);
                                array[i + 1] = (byte)((j >>> 12 & 0x3F) | 0x80);
                                array[i + 2] = (byte)((j >>> 6 & 0x3F) | 0x80);
                                final int n6 = i + 4;
                                array[i + 3] = (byte)((j & 0x3F) | 0x80);
                                j = n5;
                                i = n6;
                                break Label_0396;
                            }
                            j = n5;
                        }
                        throw new H5(j - 1, length);
                    }
                    if ('\ud800' <= char2 && char2 <= '\udfff') {
                        final int n7 = j + 1;
                        if (n7 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n7))) {
                            throw new H5(j, length);
                        }
                    }
                    final StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(char2);
                    sb.append(" at index ");
                    sb.append(i);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
            ++j;
        }
        return i;
    }
    
    @Override
    public final String c(final byte[] array, int i, int n) {
        if ((i | n | array.length - i - n) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", array.length, i, n));
        }
        final int n2 = i + n;
        final char[] value = new char[n];
        n = 0;
        while (i < n2) {
            final byte b = array[i];
            if (b < 0) {
                break;
            }
            ++i;
            G5.d(b, value, n);
            ++n;
        }
        while (true) {
            final int n3 = i;
            if (n3 >= n2) {
                return new String(value, 0, n);
            }
            i = n3 + 1;
            final byte b2 = array[n3];
            if (b2 >= 0) {
                final int n4 = n + 1;
                G5.d(b2, value, n);
                n = n4;
                while (i < n2) {
                    final byte b3 = array[i];
                    if (b3 < 0) {
                        break;
                    }
                    ++i;
                    G5.d(b3, value, n);
                    ++n;
                }
            }
            else if (b2 < -32) {
                if (i >= n2) {
                    throw k4.c();
                }
                final int n5 = n3 + 2;
                G5.c(b2, array[i], value, n);
                ++n;
                i = n5;
            }
            else if (b2 < -16) {
                if (i >= n2 - 1) {
                    throw k4.c();
                }
                final byte b4 = array[i];
                i = n3 + 3;
                G5.b(b2, b4, array[n3 + 2], value, n);
                ++n;
            }
            else {
                if (i >= n2 - 2) {
                    throw k4.c();
                }
                final byte b5 = array[i];
                final byte b6 = array[n3 + 2];
                i = n3 + 4;
                G5.a(b2, b5, b6, array[n3 + 3], value, n);
                n += 2;
            }
        }
    }
}

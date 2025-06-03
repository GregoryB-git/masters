package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class f extends n {
    public static void f(int i7, int[] iArr) {
        for (int i8 = 0; i8 < 9; i8++) {
            int i9 = 1;
            if (((1 << (8 - i8)) & i7) != 0) {
                i9 = 2;
            }
            iArr[i8] = i9;
        }
    }

    public static String g(String str) {
        String str2;
        int i7;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (charAt != 0) {
                char c7 = charAt;
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt != '`') {
                        c7 = charAt;
                        if (charAt != '-') {
                            c7 = charAt;
                            if (charAt != '.') {
                                if (charAt <= 26) {
                                    sb.append('$');
                                    i7 = charAt + 64;
                                } else if (charAt < ' ') {
                                    sb.append('%');
                                    i7 = charAt + 38;
                                } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                    sb.append('/');
                                    i7 = charAt + 32;
                                } else {
                                    i7 = charAt;
                                    if (charAt > '9') {
                                        if (charAt <= '?') {
                                            sb.append('%');
                                            i7 = charAt + 11;
                                        } else {
                                            i7 = charAt;
                                            if (charAt > 'Z') {
                                                if (charAt <= '_') {
                                                    sb.append('%');
                                                    i7 = charAt - 16;
                                                } else if (charAt <= 'z') {
                                                    sb.append('+');
                                                    i7 = charAt - 32;
                                                } else {
                                                    if (charAt > 127) {
                                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i8) + "'");
                                                    }
                                                    sb.append('%');
                                                    i7 = charAt - 43;
                                                }
                                            }
                                        }
                                    }
                                }
                                c7 = (char) i7;
                            }
                        }
                    } else {
                        str2 = "%W";
                    }
                }
                sb.append(c7);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.CODE_39) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i7)) < 0) {
                str = g(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i7++;
            }
        }
        int[] iArr = new int[9];
        int i8 = length + 25;
        for (int i9 = 0; i9 < length; i9++) {
            f(e.f10159a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i9))], iArr);
            for (int i10 = 0; i10 < 9; i10++) {
                i8 += iArr[i10];
            }
        }
        boolean[] zArr = new boolean[i8];
        f(148, iArr);
        int b7 = n.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int b8 = b7 + n.b(zArr, b7, iArr2, false);
        for (int i11 = 0; i11 < length; i11++) {
            f(e.f10159a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
            int b9 = b8 + n.b(zArr, b8, iArr, true);
            b8 = b9 + n.b(zArr, b9, iArr2, false);
        }
        f(148, iArr);
        n.b(zArr, b8, iArr, true);
        return zArr;
    }
}

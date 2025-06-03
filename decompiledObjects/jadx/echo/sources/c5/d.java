package c5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends n {

    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int f(CharSequence charSequence, int i7, int i8) {
        a g7;
        a g8;
        char charAt;
        a g9 = g(charSequence, i7);
        a aVar = a.ONE_DIGIT;
        if (g9 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (g9 == aVar2) {
            return (i7 >= charSequence.length() || ((charAt = charSequence.charAt(i7)) >= ' ' && (i8 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i8 == 99) {
            return 99;
        }
        if (i8 != 100) {
            if (g9 == a.FNC_1) {
                g9 = g(charSequence, i7 + 1);
            }
            return g9 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (g9 == aVar3 || (g7 = g(charSequence, i7 + 2)) == aVar2 || g7 == aVar) {
            return 100;
        }
        if (g7 == aVar3) {
            return g(charSequence, i7 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i9 = i7 + 4;
        while (true) {
            g8 = g(charSequence, i9);
            if (g8 != a.TWO_DIGITS) {
                break;
            }
            i9 += 2;
        }
        return g8 == a.ONE_DIGIT ? 100 : 99;
    }

    public static a g(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        if (i7 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i7);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i8 = i7 + 1;
        if (i8 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i8);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.CODE_128) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int i13 = 103;
            if (i9 >= length) {
                int[][] iArr = c.f10153a;
                arrayList.add(iArr[i10 % 103]);
                arrayList.add(iArr[106]);
                int i14 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i15 : iArr2) {
                        i14 += i15;
                    }
                }
                boolean[] zArr = new boolean[i14];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i7 += n.b(zArr, i7, (int[]) it.next(), true);
                }
                return zArr;
            }
            int f7 = f(str, i9, i11);
            int i16 = 100;
            if (f7 == i11) {
                switch (str.charAt(i9)) {
                    case 241:
                        i16 = 102;
                        break;
                    case 242:
                        i16 = 97;
                        break;
                    case 243:
                        i16 = 96;
                        break;
                    case 244:
                        if (i11 == 101) {
                            i16 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i11 != 100) {
                            if (i11 != 101) {
                                i16 = Integer.parseInt(str.substring(i9, i9 + 2));
                                i9++;
                                break;
                            } else {
                                char charAt2 = str.charAt(i9);
                                i16 = charAt2 - ' ';
                                if (i16 < 0) {
                                    i16 = charAt2 + '@';
                                    break;
                                }
                            }
                        } else {
                            i16 = str.charAt(i9) - ' ';
                            break;
                        }
                        break;
                }
                i9++;
            } else {
                if (i11 != 0) {
                    i13 = f7;
                } else if (f7 == 100) {
                    i13 = 104;
                } else if (f7 != 101) {
                    i13 = 105;
                }
                i16 = i13;
                i11 = f7;
            }
            arrayList.add(c.f10153a[i16]);
            i10 += i16 * i12;
            if (i9 != 0) {
                i12++;
            }
        }
    }
}

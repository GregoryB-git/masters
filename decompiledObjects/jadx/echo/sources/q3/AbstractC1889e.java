package q3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1889e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f18843a = Charset.forName("UTF-8");

    /* renamed from: q3.e$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f18844a;

        /* renamed from: b, reason: collision with root package name */
        public int f18845b;
    }

    /* renamed from: q3.e$b */
    public static class b extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int[] f18846f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        public static final int[] f18847g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        public int f18848c;

        /* renamed from: d, reason: collision with root package name */
        public int f18849d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f18850e;

        public b(int i7, byte[] bArr) {
            this.f18844a = bArr;
            this.f18850e = (i7 & 8) == 0 ? f18846f : f18847g;
            this.f18848c = 0;
            this.f18849d = 0;
        }

        public boolean a(byte[] bArr, int i7, int i8, boolean z7) {
            int i9 = this.f18848c;
            if (i9 == 6) {
                return false;
            }
            int i10 = i8 + i7;
            int i11 = this.f18849d;
            byte[] bArr2 = this.f18844a;
            int[] iArr = this.f18850e;
            int i12 = 0;
            int i13 = i11;
            int i14 = i9;
            int i15 = i7;
            while (i15 < i10) {
                if (i14 == 0) {
                    while (true) {
                        int i16 = i15 + 4;
                        if (i16 > i10 || (i13 = (iArr[bArr[i15] & 255] << 18) | (iArr[bArr[i15 + 1] & 255] << 12) | (iArr[bArr[i15 + 2] & 255] << 6) | iArr[bArr[i15 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i12 + 2] = (byte) i13;
                        bArr2[i12 + 1] = (byte) (i13 >> 8);
                        bArr2[i12] = (byte) (i13 >> 16);
                        i12 += 3;
                        i15 = i16;
                    }
                    if (i15 >= i10) {
                        break;
                    }
                }
                int i17 = i15 + 1;
                int i18 = iArr[bArr[i15] & 255];
                if (i14 != 0) {
                    if (i14 == 1) {
                        if (i18 < 0) {
                            if (i18 != -1) {
                                this.f18848c = 6;
                                return false;
                            }
                        }
                        i18 |= i13 << 6;
                    } else if (i14 == 2) {
                        if (i18 < 0) {
                            if (i18 == -2) {
                                bArr2[i12] = (byte) (i13 >> 4);
                                i12++;
                                i14 = 4;
                            } else if (i18 != -1) {
                                this.f18848c = 6;
                                return false;
                            }
                        }
                        i18 |= i13 << 6;
                    } else if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 == 5 && i18 != -1) {
                                this.f18848c = 6;
                                return false;
                            }
                        } else if (i18 == -2) {
                            i14++;
                        } else if (i18 != -1) {
                            this.f18848c = 6;
                            return false;
                        }
                    } else if (i18 >= 0) {
                        int i19 = i18 | (i13 << 6);
                        bArr2[i12 + 2] = (byte) i19;
                        bArr2[i12 + 1] = (byte) (i19 >> 8);
                        bArr2[i12] = (byte) (i19 >> 16);
                        i12 += 3;
                        i13 = i19;
                        i14 = 0;
                    } else if (i18 == -2) {
                        bArr2[i12 + 1] = (byte) (i13 >> 2);
                        bArr2[i12] = (byte) (i13 >> 10);
                        i12 += 2;
                        i14 = 5;
                    } else if (i18 != -1) {
                        this.f18848c = 6;
                        return false;
                    }
                    i14++;
                    i13 = i18;
                } else {
                    if (i18 < 0) {
                        if (i18 != -1) {
                            this.f18848c = 6;
                            return false;
                        }
                    }
                    i14++;
                    i13 = i18;
                }
                i15 = i17;
            }
            if (!z7) {
                this.f18848c = i14;
                this.f18849d = i13;
            } else {
                if (i14 == 1) {
                    this.f18848c = 6;
                    return false;
                }
                if (i14 == 2) {
                    bArr2[i12] = (byte) (i13 >> 4);
                    i12++;
                } else if (i14 == 3) {
                    int i20 = i12 + 1;
                    bArr2[i12] = (byte) (i13 >> 10);
                    i12 += 2;
                    bArr2[i20] = (byte) (i13 >> 2);
                } else if (i14 == 4) {
                    this.f18848c = 6;
                    return false;
                }
                this.f18848c = i14;
            }
            this.f18845b = i12;
            return true;
        }
    }

    /* renamed from: q3.e$c */
    public static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public static final byte[] f18851j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        public static final byte[] f18852k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f18853c;

        /* renamed from: d, reason: collision with root package name */
        public int f18854d;

        /* renamed from: e, reason: collision with root package name */
        public int f18855e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18856f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f18857g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f18858h;

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f18859i;

        public c(int i7, byte[] bArr) {
            this.f18844a = bArr;
            this.f18856f = (i7 & 1) == 0;
            boolean z7 = (i7 & 2) == 0;
            this.f18857g = z7;
            this.f18858h = (i7 & 4) != 0;
            this.f18859i = (i7 & 8) == 0 ? f18851j : f18852k;
            this.f18853c = new byte[2];
            this.f18854d = 0;
            this.f18855e = z7 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q3.AbstractC1889e.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i7) {
        return b(str.getBytes(f18843a), i7);
    }

    public static byte[] b(byte[] bArr, int i7) {
        return c(bArr, 0, bArr.length, i7);
    }

    public static byte[] c(byte[] bArr, int i7, int i8, int i9) {
        b bVar = new b(i9, new byte[(i8 * 3) / 4]);
        if (!bVar.a(bArr, i7, i8, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i10 = bVar.f18845b;
        byte[] bArr2 = bVar.f18844a;
        if (i10 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i7) {
        return f(bArr, 0, bArr.length, i7);
    }

    public static byte[] f(byte[] bArr, int i7, int i8, int i9) {
        c cVar = new c(i9, null);
        int i10 = (i8 / 3) * 4;
        if (!cVar.f18856f) {
            int i11 = i8 % 3;
            if (i11 == 1) {
                i10 += 2;
            } else if (i11 == 2) {
                i10 += 3;
            }
        } else if (i8 % 3 > 0) {
            i10 += 4;
        }
        if (cVar.f18857g && i8 > 0) {
            i10 += (((i8 - 1) / 57) + 1) * (cVar.f18858h ? 2 : 1);
        }
        cVar.f18844a = new byte[i10];
        cVar.a(bArr, i7, i8, true);
        return cVar.f18844a;
    }

    public static String g(byte[] bArr, int i7) {
        try {
            return new String(e(bArr, i7), "US-ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }
}

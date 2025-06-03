package com.google.android.recaptcha.internal;

import defpackage.f;

/* loaded from: classes.dex */
final class zzpv {
    static {
        if (zzps.zzx() && zzps.zzy()) {
            int i10 = zzks.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0101, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zzb(java.lang.String, byte[], int, int):int");
    }

    public static int zzc(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzpu(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder l10 = f.l("UTF-8 length does not fit in int: ");
        l10.append(i12 + 4294967296L);
        throw new IllegalArgumentException(l10.toString());
    }

    public static String zzd(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzpt.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzpt.zzd(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (zzpt.zzd(b12)) {
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    }
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw new zznn("Protocol message had invalid UTF-8.");
                }
                zzpt.zzc(b11, bArr[i14], cArr, i13);
                i13++;
                i10 = i14 + 1;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw new zznn("Protocol message had invalid UTF-8.");
                }
                int i16 = i14 + 1;
                zzpt.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                i13++;
                i10 = i16 + 1;
            } else {
                if (i14 >= i12 - 2) {
                    throw new zznn("Protocol message had invalid UTF-8.");
                }
                int i17 = i14 + 1;
                byte b13 = bArr[i14];
                int i18 = i17 + 1;
                zzpt.zza(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zze(byte[] r5, int r6, int r7) {
        /*
        L0:
            if (r6 >= r7) goto L9
            r0 = r5[r6]
            if (r0 < 0) goto L9
            int r6 = r6 + 1
            goto L0
        L9:
            if (r6 < r7) goto Ld
            goto L76
        Ld:
            if (r6 >= r7) goto L76
            int r0 = r6 + 1
            r6 = r5[r6]
            if (r6 >= 0) goto L74
            r1 = -32
            r2 = -65
            if (r6 >= r1) goto L29
            if (r0 < r7) goto L1e
            goto L53
        L1e:
            r1 = -62
            if (r6 < r1) goto L72
            int r6 = r0 + 1
            r0 = r5[r0]
            if (r0 <= r2) goto Ld
            goto L72
        L29:
            r3 = -16
            if (r6 >= r3) goto L4b
            int r3 = r7 + (-1)
            if (r0 < r3) goto L32
            goto L4f
        L32:
            int r3 = r0 + 1
            r0 = r5[r0]
            if (r0 > r2) goto L72
            r4 = -96
            if (r6 != r1) goto L3e
            if (r0 < r4) goto L72
        L3e:
            r1 = -19
            if (r6 != r1) goto L44
            if (r0 >= r4) goto L72
        L44:
            int r6 = r3 + 1
            r0 = r5[r3]
            if (r0 <= r2) goto Ld
            goto L72
        L4b:
            int r1 = r7 + (-2)
            if (r0 < r1) goto L56
        L4f:
            int r6 = zza(r5, r0, r7)
        L53:
            if (r6 == 0) goto L76
            goto L72
        L56:
            int r1 = r0 + 1
            r0 = r5[r0]
            if (r0 > r2) goto L72
            int r6 = r6 << 28
            int r0 = r0 + 112
            int r0 = r0 + r6
            int r6 = r0 >> 30
            if (r6 != 0) goto L72
            int r6 = r1 + 1
            r0 = r5[r1]
            if (r0 > r2) goto L72
            int r0 = r6 + 1
            r6 = r5[r6]
            if (r6 > r2) goto L72
            goto L74
        L72:
            r5 = 0
            return r5
        L74:
            r6 = r0
            goto Ld
        L76:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpv.zze(byte[], int, int):boolean");
    }
}

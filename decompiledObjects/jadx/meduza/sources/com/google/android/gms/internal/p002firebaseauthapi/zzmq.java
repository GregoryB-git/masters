package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmq {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i10 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr3 = zza;
            if (i12 >= bArr3.length) {
                long[] zza2 = zzmw.zza(copyOf);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zza2, 0, jArr2, 0, 10);
                int i13 = 10;
                long[] jArr10 = jArr3;
                long[] jArr11 = jArr2;
                long[] jArr12 = jArr9;
                int i14 = 0;
                while (i11 < i10) {
                    int i15 = bArr[(32 - i11) - 1] & 255;
                    while (i14 < 8) {
                        int i16 = (i15 >> (7 - i14)) & 1;
                        zza(jArr4, jArr11, i16);
                        zza(jArr5, jArr10, i16);
                        long[] copyOf2 = Arrays.copyOf(jArr4, i13);
                        int i17 = i15;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        int i18 = i11;
                        long[] jArr15 = new long[19];
                        int i19 = i14;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        long[] jArr18 = jArr12;
                        long[] jArr19 = new long[19];
                        long[] jArr20 = new long[19];
                        zzmw.zzd(jArr4, jArr5);
                        zzmw.zzc(jArr5, copyOf2);
                        i13 = 10;
                        long[] copyOf3 = Arrays.copyOf(jArr11, 10);
                        zzmw.zzd(jArr11, jArr10);
                        zzmw.zzc(jArr10, copyOf3);
                        zzmw.zzb(jArr16, jArr11, jArr5);
                        zzmw.zzb(jArr17, jArr4, jArr10);
                        zzmw.zzb(jArr16);
                        zzmw.zza(jArr16);
                        zzmw.zzb(jArr17);
                        zzmw.zza(jArr17);
                        long[] jArr21 = jArr11;
                        System.arraycopy(jArr16, 0, copyOf3, 0, 10);
                        zzmw.zzd(jArr16, jArr17);
                        zzmw.zzc(jArr17, copyOf3);
                        zzmw.zzb(jArr20, jArr16);
                        zzmw.zzb(jArr19, jArr17);
                        zzmw.zzb(jArr17, jArr19, zza2);
                        zzmw.zzb(jArr17);
                        zzmw.zza(jArr17);
                        System.arraycopy(jArr20, 0, jArr6, 0, 10);
                        System.arraycopy(jArr17, 0, jArr7, 0, 10);
                        zzmw.zzb(jArr14, jArr4);
                        zzmw.zzb(jArr15, jArr5);
                        zzmw.zzb(jArr8, jArr14, jArr15);
                        zzmw.zzb(jArr8);
                        zzmw.zza(jArr8);
                        zzmw.zzc(jArr15, jArr14);
                        Arrays.fill(jArr13, 10, 18, 0L);
                        zzmw.zza(jArr13, jArr15, 121665L);
                        zzmw.zza(jArr13);
                        zzmw.zzd(jArr13, jArr14);
                        zzmw.zzb(jArr18, jArr15, jArr13);
                        zzmw.zzb(jArr18);
                        zzmw.zza(jArr18);
                        zza(jArr8, jArr6, i16);
                        zza(jArr18, jArr7, i16);
                        i14 = i19 + 1;
                        jArr11 = jArr6;
                        i15 = i17;
                        i11 = i18;
                        jArr6 = jArr21;
                        long[] jArr22 = jArr5;
                        jArr5 = jArr18;
                        jArr12 = jArr22;
                        long[] jArr23 = jArr7;
                        jArr7 = jArr10;
                        jArr10 = jArr23;
                        long[] jArr24 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr24;
                    }
                    i11++;
                    i10 = 32;
                    i14 = 0;
                    i13 = 10;
                }
                long[] jArr25 = new long[i13];
                zzmw.zza(jArr25, jArr5);
                zzmw.zza(jArr, jArr4, jArr25);
                long[] jArr26 = new long[i13];
                long[] jArr27 = new long[i13];
                long[] jArr28 = new long[11];
                long[] jArr29 = new long[11];
                long[] jArr30 = new long[11];
                zzmw.zza(jArr26, zza2, jArr);
                zzmw.zzd(jArr27, zza2, jArr);
                long[] jArr31 = new long[i13];
                jArr31[0] = 486662;
                zzmw.zzd(jArr29, jArr27, jArr31);
                zzmw.zza(jArr29, jArr29, jArr10);
                zzmw.zzd(jArr29, jArr11);
                zzmw.zza(jArr29, jArr29, jArr26);
                zzmw.zza(jArr29, jArr29, jArr11);
                zzmw.zza(jArr28, jArr29, 4L);
                zzmw.zza(jArr28);
                zzmw.zza(jArr29, jArr26, jArr10);
                zzmw.zzc(jArr29, jArr29, jArr10);
                zzmw.zza(jArr30, jArr27, jArr11);
                zzmw.zzd(jArr29, jArr29, jArr30);
                zzmw.zzb(jArr29, jArr29);
                if (!MessageDigest.isEqual(zzmw.zzc(jArr28), zzmw.zzc(jArr29))) {
                    throw new IllegalStateException(f.j("Arithmetic error in curve multiplication with the public key: ", zzza.zza(bArr2)));
                }
                return;
            }
            if (MessageDigest.isEqual(bArr3[i12], copyOf)) {
                throw new InvalidKeyException(f.j("Banned public key: ", zzza.zza(bArr3[i12])));
            }
            i12++;
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i10) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = (((int) jArr[i12]) ^ ((int) jArr2[i12])) & i11;
            jArr[i12] = ((int) r1) ^ i13;
            jArr2[i12] = ((int) jArr2[i12]) ^ i13;
        }
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzyg {
    private ECPrivateKey zza;

    public zzyg(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, zzyk zzykVar) {
        byte[] zza = zzyi.zza(this.zza, zzyi.zza(this.zza.getParams(), zzykVar, bArr));
        int i11 = 1;
        byte[] zza2 = zzyc.zza(bArr, zza);
        Mac zza3 = zzym.zzb.zza(str);
        if (i10 > zza3.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            zza3.init(new SecretKeySpec(new byte[zza3.getMacLength()], str));
        } else {
            zza3.init(new SecretKeySpec(bArr2, str));
        }
        byte[] doFinal = zza3.doFinal(zza2);
        byte[] bArr4 = new byte[i10];
        zza3.init(new SecretKeySpec(doFinal, str));
        byte[] bArr5 = new byte[0];
        int i12 = 0;
        while (true) {
            zza3.update(bArr5);
            zza3.update(bArr3);
            zza3.update((byte) i11);
            bArr5 = zza3.doFinal();
            if (bArr5.length + i12 >= i10) {
                System.arraycopy(bArr5, 0, bArr4, i12, i10 - i12);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i12, bArr5.length);
            i12 += bArr5.length;
            i11++;
        }
    }
}

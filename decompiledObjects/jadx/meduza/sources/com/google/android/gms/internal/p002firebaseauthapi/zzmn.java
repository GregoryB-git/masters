package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class zzmn implements zzcc {
    private static final Object zza = new Object();

    public static final class zza {
        public zza() {
            zzmn.zza();
        }
    }

    public zzmn() {
        this(new zza());
    }

    private zzmn(zza zzaVar) {
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        synchronized (zza) {
            String zza2 = zzzi.zza("android-keystore://", str);
            if (zzmj.zzb(zza2)) {
                return false;
            }
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(build);
            keyGenerator.generateKey();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final zzbe zza(String str) {
        zzml zzmlVar;
        try {
            synchronized (zza) {
                zzmlVar = new zzml(zzzi.zza("android-keystore://", str));
                byte[] zza2 = zzpp.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zzmlVar.zza(zzmlVar.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzmlVar;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}

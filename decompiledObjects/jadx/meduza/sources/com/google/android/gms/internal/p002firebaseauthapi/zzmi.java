package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes.dex */
public final class zzmi {
    private static final Object zza = new Object();
    private static final String zzb = "zzmi";
    private zzbx zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbe zze = null;
        private boolean zzf = true;
        private zzbp zzg = null;
        private zzwf zzh = null;
        private zzbx zzi;

        private static zzbx zza(byte[] bArr) {
            return zzbx.zza(zzce.zza(zzbd.zza(bArr), zzbl.zza()));
        }

        private final zzbe zzb() {
            zzmi.zzd();
            try {
                try {
                    return new zzmn().zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    e = e10;
                    if (!zzmn.zzc(this.zzd)) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.zzd), e);
                    }
                    Log.w(zzmi.zzb, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException e11) {
                e = e11;
            } catch (ProviderException e12) {
                e = e12;
            }
        }

        private final zzbx zzb(byte[] bArr) {
            try {
                this.zze = new zzmn().zza(this.zzd);
                try {
                    return zzbx.zza(zzbs.zza(zzbd.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzbx zza = zza(bArr);
                    Log.w(zzmi.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zza;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return zzza.zza(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.zza = context;
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public final zza zza(zzwf zzwfVar) {
            this.zzh = zzwfVar;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.zzd = str;
            return this;
        }

        public final synchronized zzmi zza() {
            zzbx zza;
            zzmi zzmiVar;
            if (this.zzb == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            zzwf zzwfVar = this.zzh;
            if (zzwfVar != null && this.zzg == null) {
                this.zzg = zzbp.zza(zzco.zza(zzwfVar.zzk()));
            }
            synchronized (zzmi.zza) {
                byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                if (zzb == null) {
                    if (this.zzd != null) {
                        this.zze = zzb();
                    }
                    zzbp zzbpVar = this.zzg;
                    if (zzbpVar == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    zzbs zza2 = zzbs.zza(zzbpVar);
                    zzmi.zza(zza2, new zzmp(this.zza, this.zzb, this.zzc), this.zze);
                    zza = zzbx.zza(zza2);
                } else if (this.zzd != null) {
                    zzmi.zzd();
                    zza = zzb(zzb);
                } else {
                    zza = zza(zzb);
                }
                this.zzi = zza;
                zzmiVar = new zzmi(this);
            }
            return zzmiVar;
        }
    }

    private zzmi(zza zzaVar) {
        new zzmp(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbs zzbsVar, zzbz zzbzVar, zzbe zzbeVar) {
        try {
            if (zzbeVar != null) {
                zzbsVar.zza(zzbzVar, zzbeVar, new byte[0]);
            } else {
                zzce.zza(zzbsVar, zzbzVar, zzbl.zza());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbs zza() {
        return this.zzc.zza();
    }
}

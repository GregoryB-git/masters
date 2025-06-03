package com.google.android.recaptcha.internal;

import ec.e;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i10, e eVar) {
        this.zza = new zzfm();
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e11.getMessage());
        }
    }
}

package com.google.android.recaptcha.internal;

import b.z;
import ec.i;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import rb.c;

/* loaded from: classes.dex */
public final class zzfm {
    private final c zza;

    public zzfm() {
        int i10 = zzav.zza;
        this.zza = z.n(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}

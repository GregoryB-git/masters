package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.h;

/* loaded from: classes.dex */
public final class zzci {
    private final h zza;

    public zzci(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        h hVar;
        if (uri != null) {
            hVar = (h) this.zza.getOrDefault(uri.toString(), null);
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return null;
        }
        return (String) hVar.getOrDefault("".concat(str3), null);
    }
}

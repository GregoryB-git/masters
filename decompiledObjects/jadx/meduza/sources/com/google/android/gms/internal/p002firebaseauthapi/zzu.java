package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzu implements zzs {
    private zzu() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzs
    public final zzl zza(String str) {
        return new zzn(Pattern.compile(str));
    }
}

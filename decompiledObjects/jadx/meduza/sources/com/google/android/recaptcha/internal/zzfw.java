package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import nc.d0;
import x6.b;

/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final d0 zzb;

    public zzfw(WebView webView, d0 d0Var) {
        this.zza = webView;
        this.zzb = d0Var;
    }

    public final void zzb(String str, String... strArr) {
        b.g0(this.zzb, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}

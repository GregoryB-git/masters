package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946k0 extends AbstractC0919h0 {
    public C0946k0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0919h0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }
}

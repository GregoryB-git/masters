package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0919h0 {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC0919h0 f10967a = new C0946k0();

    public static synchronized AbstractC0919h0 a() {
        AbstractC0919h0 abstractC0919h0;
        synchronized (AbstractC0919h0.class) {
            abstractC0919h0 = f10967a;
        }
        return abstractC0919h0;
    }

    public abstract URLConnection b(URL url, String str);
}

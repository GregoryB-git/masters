package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes.dex */
public abstract /* synthetic */ class H2 {
    public static Object a(G2 g22) {
        try {
            return g22.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return g22.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}

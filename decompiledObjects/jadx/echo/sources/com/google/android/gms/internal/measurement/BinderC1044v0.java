package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1044v0 extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11191b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public boolean f11192c;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(android.os.Bundle r4, java.lang.Class r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC1044v0.v(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Long Z0(long j7) {
        return (Long) v(o(j7), Long.class);
    }

    public final String a1(long j7) {
        return (String) v(o(j7), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1071y0
    public final void l(Bundle bundle) {
        synchronized (this.f11191b) {
            try {
                try {
                    this.f11191b.set(bundle);
                    this.f11192c = true;
                } finally {
                    this.f11191b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle o(long j7) {
        Bundle bundle;
        synchronized (this.f11191b) {
            if (!this.f11192c) {
                try {
                    this.f11191b.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f11191b.get();
        }
        return bundle;
    }
}

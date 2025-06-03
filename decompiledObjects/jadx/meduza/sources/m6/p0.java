package m6;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f10301e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f10302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10303b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f10304c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10305d;

    public p0(ComponentName componentName) {
        this.f10302a = null;
        this.f10303b = null;
        j.i(componentName);
        this.f10304c = componentName;
        this.f10305d = false;
    }

    public p0(String str, String str2, boolean z10) {
        j.e(str);
        this.f10302a = str;
        j.e(str2);
        this.f10303b = str2;
        this.f10304c = null;
        this.f10305d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f10302a
            if (r1 == 0) goto Lb0
            boolean r1 = r5.f10305d
            r2 = 0
            if (r1 == 0) goto La0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f10302a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            android.net.Uri r3 = m6.p0.f10301e     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            if (r6 == 0) goto L36
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L31
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            goto L4f
        L2d:
            r6 = move-exception
            goto L42
        L2f:
            r6 = move-exception
            goto L42
        L31:
            r1 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            throw r1     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
        L36:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            java.lang.String r1 = "Failed to acquire ContentProviderClient"
            r6.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            throw r6     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
        L3e:
            r6 = move-exception
            goto L41
        L40:
            r6 = move-exception
        L41:
            r1 = r2
        L42:
            java.lang.String r6 = r6.toString()
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r3.concat(r6)
            android.util.Log.w(r0, r6)
        L4f:
            if (r1 == 0) goto L8f
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L8e
            java.lang.String r2 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            if (r1 != 0) goto L66
            goto L8e
        L66:
            java.lang.String r6 = r5.f10302a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " but has possible resolution"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r0, r6)
            m6.g0 r6 = new m6.g0
            j6.b r0 = new j6.b
            r2 = 25
            r0.<init>(r2, r1)
            r6.<init>(r0)
            throw r6
        L8e:
            r2 = r6
        L8f:
            if (r2 != 0) goto La0
            java.lang.String r6 = r5.f10302a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        La0:
            if (r2 != 0) goto Lbb
            java.lang.String r6 = r5.f10302a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f10303b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        Lb0:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f10304c
            android.content.Intent r2 = r6.setComponent(r0)
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.p0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return h.a(this.f10302a, p0Var.f10302a) && h.a(this.f10303b, p0Var.f10303b) && h.a(this.f10304c, p0Var.f10304c) && this.f10305d == p0Var.f10305d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10302a, this.f10303b, this.f10304c, 4225, Boolean.valueOf(this.f10305d)});
    }

    public final String toString() {
        String str = this.f10302a;
        if (str != null) {
            return str;
        }
        j.i(this.f10304c);
        return this.f10304c.flattenToString();
    }
}

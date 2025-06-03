package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p2.m0;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    public final m7.e f2934a;

    /* renamed from: b, reason: collision with root package name */
    private final m7.v f2935b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2936c;

    /* renamed from: d, reason: collision with root package name */
    private final at f2937d;

    /* renamed from: e, reason: collision with root package name */
    private final k f2938e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aj(android.content.Context r7, m7.v r8, com.google.android.play.core.integrity.at r9, com.google.android.play.core.integrity.k r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.getPackageName()
            r6.f2936c = r0
            r6.f2935b = r8
            r6.f2937d = r9
            r6.f2938e = r10
            m7.v r9 = m7.g.f10360a
            java.lang.String r9 = "com.android.vending"
            r10 = 0
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            if (r0 == 0) goto L34
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            r1 = 64
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r9, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            android.content.pm.Signature[] r9 = r9.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            boolean r9 = m7.g.a(r9)
            if (r9 == 0) goto L34
            r9 = 1
            goto L35
        L34:
            r9 = r10
        L35:
            if (r9 != 0) goto L54
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r8.getClass()
            java.lang.String r9 = "PlayCore"
            r10 = 6
            boolean r10 = android.util.Log.isLoggable(r9, r10)
            if (r10 == 0) goto L50
            java.lang.String r8 = r8.f10368a
            java.lang.String r10 = "Phonesky is not installed."
            java.lang.String r7 = m7.v.c(r8, r10, r7)
            android.util.Log.e(r9, r7)
        L50:
            r7 = 0
            r6.f2934a = r7
            return
        L54:
            m7.e r9 = new m7.e
            android.content.Intent r4 = com.google.android.play.core.integrity.ak.f2939a
            com.google.android.play.core.integrity.ae r5 = new m7.b0() { // from class: com.google.android.play.core.integrity.ae
                static {
                    /*
                        com.google.android.play.core.integrity.ae r0 = new com.google.android.play.core.integrity.ae
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.play.core.integrity.ae) com.google.android.play.core.integrity.ae.a com.google.android.play.core.integrity.ae
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ae.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ae.<init>():void");
                }

                @Override // m7.b0
                public final java.lang.Object a(android.os.IBinder r1) {
                    /*
                        r0 = this;
                        m7.s r1 = com.google.android.play.integrity.internal.m.b(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ae.a(android.os.IBinder):java.lang.Object");
                }
            }
            java.lang.String r3 = "IntegrityService"
            r0 = r9
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f2934a = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.aj.<init>(android.content.Context, m7.v, com.google.android.play.core.integrity.at, com.google.android.play.core.integrity.k):void");
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f2936c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m7.m(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(m0.f(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f2934a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f2935b.b("requestAndShowDialog(%s, %s)", this.f2936c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2934a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f2934a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f2935b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f2934a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}

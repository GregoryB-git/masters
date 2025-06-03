package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import r4.InterfaceC1922b;
import s3.C1947e;
import w2.C2081c;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f11614a;

    /* renamed from: b, reason: collision with root package name */
    public final K f11615b;

    /* renamed from: c, reason: collision with root package name */
    public final C2081c f11616c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1922b f11617d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1922b f11618e;

    /* renamed from: f, reason: collision with root package name */
    public final s4.i f11619f;

    public F(C1947e c1947e, K k7, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar) {
        this(c1947e, k7, new C2081c(c1947e.m()), interfaceC1922b, interfaceC1922b2, iVar);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public AbstractC0659j c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(K.c(this.f11614a), "*", bundle));
    }

    public final AbstractC0659j d(AbstractC0659j abstractC0659j) {
        return abstractC0659j.g(new r1.m(), new InterfaceC0651b() { // from class: com.google.firebase.messaging.E
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j2) {
                String i7;
                i7 = F.this.i(abstractC0659j2);
                return i7;
            }
        });
    }

    public final String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f11614a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public AbstractC0659j f() {
        return d(k(K.c(this.f11614a), "*", new Bundle()));
    }

    public final String g(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String i(AbstractC0659j abstractC0659j) {
        return g((Bundle) abstractC0659j.k(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            s3.e r3 = r2.f11614a
            s3.m r3 = r3.r()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f11615b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f11615b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f11615b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.e()
            r5.putString(r3, r4)
            s4.i r3 = r2.f11619f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            V2.j r3 = r3.b(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = V2.m.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            s4.n r3 = (s4.n) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            s4.i r3 = r2.f11619f
            V2.j r3 = r3.a()
            java.lang.Object r3 = V2.m.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "23.3.1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            r4.b r3 = r2.f11618e
            java.lang.Object r3 = r3.get()
            o4.j r3 = (o4.j) r3
            r4.b r4 = r2.f11617d
            java.lang.Object r4 = r4.get()
            O4.i r4 = (O4.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            o4.j$a r3 = r3.b(r0)
            o4.j$a r0 = o4.j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.c()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.F.j(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final AbstractC0659j k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f11616c.a(bundle);
        } catch (InterruptedException | ExecutionException e7) {
            return V2.m.d(e7);
        }
    }

    public AbstractC0659j l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    public AbstractC0659j m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }

    public F(C1947e c1947e, K k7, C2081c c2081c, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar) {
        this.f11614a = c1947e;
        this.f11615b = k7;
        this.f11616c = c2081c;
        this.f11617d = interfaceC1922b;
        this.f11618e = interfaceC1922b2;
        this.f11619f = iVar;
    }
}

package p4;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import r4.InterfaceC1922b;
import s3.C1947e;
import w2.C2081c;

/* renamed from: p4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1819k {

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f18447a;

    /* renamed from: b, reason: collision with root package name */
    public final C1822n f18448b;

    /* renamed from: c, reason: collision with root package name */
    public final C2081c f18449c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1922b f18450d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1922b f18451e;

    /* renamed from: f, reason: collision with root package name */
    public final s4.i f18452f;

    public C1819k(C1947e c1947e, C1822n c1822n, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar) {
        this(c1947e, c1822n, new C2081c(c1947e.m()), interfaceC1922b, interfaceC1922b2, iVar);
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public AbstractC0659j b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, str2, str3, bundle));
    }

    public final AbstractC0659j c(AbstractC0659j abstractC0659j) {
        return abstractC0659j.g(AbstractC1810b.a(), new InterfaceC0651b(this) { // from class: p4.j

            /* renamed from: a, reason: collision with root package name */
            public final C1819k f18446a;

            {
                this.f18446a = this;
            }

            @Override // V2.InterfaceC0651b
            public Object a(AbstractC0659j abstractC0659j2) {
                return this.f18446a.h(abstractC0659j2);
            }
        });
    }

    public final String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f18447a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public AbstractC0659j e(String str, String str2, String str3) {
        return c(j(str, str2, str3, new Bundle()));
    }

    public final String f(Bundle bundle) {
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
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(valueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String h(AbstractC0659j abstractC0659j) {
        return f((Bundle) abstractC0659j.k(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle i(java.lang.String r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "scope"
            r6.putString(r1, r5)
            java.lang.String r5 = "sender"
            r6.putString(r5, r4)
            java.lang.String r5 = "subtype"
            r6.putString(r5, r4)
            java.lang.String r4 = "appid"
            r6.putString(r4, r3)
            s3.e r3 = r2.f18447a
            s3.m r3 = r3.r()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r6.putString(r4, r3)
            p4.n r3 = r2.f18448b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r6.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r6.putString(r4, r3)
            p4.n r3 = r2.f18448b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r6.putString(r4, r3)
            p4.n r3 = r2.f18448b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r6.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r6.putString(r3, r4)
            s4.i r3 = r2.f18452f     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            r4 = 0
            V2.j r3 = r3.b(r4)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            java.lang.Object r3 = V2.m.a(r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            s4.n r3 = (s4.n) r3     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            if (r4 != 0) goto L7f
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r6.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            goto L8a
        L7b:
            r3 = move-exception
            goto L85
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            goto L8a
        L85:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L8a:
            java.lang.String r3 = "cliv"
            java.lang.String r4 = "fiid-21.1.0"
            r6.putString(r3, r4)
            r4.b r3 = r2.f18451e
            java.lang.Object r3 = r3.get()
            o4.j r3 = (o4.j) r3
            r4.b r4 = r2.f18450d
            java.lang.Object r4 = r4.get()
            O4.i r4 = (O4.i) r4
            if (r3 == 0) goto Lc5
            if (r4 == 0) goto Lc5
            java.lang.String r5 = "fire-iid"
            o4.j$a r3 = r3.b(r5)
            o4.j$a r5 = o4.j.a.NONE
            if (r3 == r5) goto Lc5
            int r3 = r3.c()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r5 = "Firebase-Client-Log-Type"
            r6.putString(r5, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r6.putString(r3, r4)
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C1819k.i(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final AbstractC0659j j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f18449c.a(bundle);
    }

    public C1819k(C1947e c1947e, C1822n c1822n, C2081c c2081c, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar) {
        this.f18447a = c1947e;
        this.f18448b = c1822n;
        this.f18449c = c2081c;
        this.f18450d = interfaceC1922b;
        this.f18451e = interfaceC1922b2;
        this.f18452f = iVar;
    }
}

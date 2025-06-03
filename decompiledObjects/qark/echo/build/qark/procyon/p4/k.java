// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p4;

import android.os.BaseBundle;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import V2.m;
import android.os.Build$VERSION;
import android.util.Log;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.os.Bundle;
import V2.j;
import android.util.Base64;
import s4.i;
import r4.b;
import w2.c;
import s3.e;

public class k
{
    public final e a;
    public final n b;
    public final c c;
    public final b d;
    public final b e;
    public final i f;
    
    public k(final e e, final n n, final b b, final b b2, final i i) {
        this(e, n, new c(e.m()), b, b2, i);
    }
    
    public k(final e a, final n b, final c c, final b d, final b e, final i f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static String a(final byte[] array) {
        return Base64.encodeToString(array, 11);
    }
    
    public static boolean g(final String anObject) {
        return "SERVICE_NOT_AVAILABLE".equals(anObject) || "INTERNAL_SERVER_ERROR".equals(anObject) || "InternalServerError".equals(anObject);
    }
    
    public j b(final String s, final String s2, final String s3) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("delete", "1");
        return this.c(this.j(s, s2, s3, bundle));
    }
    
    public final j c(final j j) {
        return j.g(p4.b.a(), new p4.j(this));
    }
    
    public final String d() {
        final String q = this.a.q();
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(q.getBytes()));
        }
        catch (NoSuchAlgorithmException ex) {
            return "[HASH-ERROR]";
        }
    }
    
    public j e(final String s, final String s2, final String s3) {
        return this.c(this.j(s, s2, s3, new Bundle()));
    }
    
    public final String f(final Bundle obj) {
        if (obj == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        final String string = ((BaseBundle)obj).getString("registration_id");
        if (string != null) {
            return string;
        }
        final String string2 = ((BaseBundle)obj).getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        final String string3 = ((BaseBundle)obj).getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(value.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(value);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    public final Bundle i(String b, final String s, final String s2, final Bundle bundle) {
        ((BaseBundle)bundle).putString("scope", s2);
        ((BaseBundle)bundle).putString("sender", s);
        ((BaseBundle)bundle).putString("subtype", s);
        ((BaseBundle)bundle).putString("appid", b);
        ((BaseBundle)bundle).putString("gmp_app_id", this.a.r().c());
        ((BaseBundle)bundle).putString("gmsv", Integer.toString(this.b.d()));
        ((BaseBundle)bundle).putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        ((BaseBundle)bundle).putString("app_ver", this.b.a());
        ((BaseBundle)bundle).putString("app_ver_name", this.b.b());
        ((BaseBundle)bundle).putString("firebase-app-name-hash", this.d());
        while (true) {
            try {
                b = ((s4.n)m.a(this.f.b(false))).b();
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    ((BaseBundle)bundle).putString("Goog-Firebase-Installations-Auth", b);
                }
                else {
                    Log.w("FirebaseInstanceId", "FIS auth token is empty");
                }
                while (true) {
                    ((BaseBundle)bundle).putString("cliv", "fiid-21.1.0");
                    final o4.j j = (o4.j)this.e.get();
                    final O4.i i = (O4.i)this.d.get();
                    if (j != null && i != null) {
                        final o4.j.a b2 = j.b("fire-iid");
                        if (b2 != o4.j.a.p) {
                            ((BaseBundle)bundle).putString("Firebase-Client-Log-Type", Integer.toString(b2.c()));
                            ((BaseBundle)bundle).putString("Firebase-Client", i.a());
                        }
                    }
                    return bundle;
                    final InterruptedException ex;
                    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", (Throwable)ex);
                    continue;
                }
            }
            catch (InterruptedException ex) {
                continue;
            }
            catch (ExecutionException ex) {
                continue;
            }
            break;
        }
    }
    
    public final j j(final String s, final String s2, final String s3, final Bundle bundle) {
        this.i(s, s2, s3, bundle);
        return this.c.a(bundle);
    }
}

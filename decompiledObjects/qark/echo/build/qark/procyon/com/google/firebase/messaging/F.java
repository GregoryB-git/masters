// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import s4.n;
import android.os.Build$VERSION;
import android.util.Log;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.concurrent.Executor;
import r1.m;
import android.os.Bundle;
import android.util.Base64;
import V2.j;
import s4.i;
import r4.b;
import w2.c;
import s3.e;

public class F
{
    public final e a;
    public final K b;
    public final c c;
    public final b d;
    public final b e;
    public final i f;
    
    public F(final e e, final K k, final b b, final b b2, final i i) {
        this(e, k, new c(e.m()), b, b2, i);
    }
    
    public F(final e a, final K b, final c c, final b d, final b e, final i f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static String b(final byte[] array) {
        return Base64.encodeToString(array, 11);
    }
    
    public static boolean h(final String anObject) {
        return "SERVICE_NOT_AVAILABLE".equals(anObject) || "INTERNAL_SERVER_ERROR".equals(anObject) || "InternalServerError".equals(anObject);
    }
    
    public j c() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("delete", "1");
        return this.d(this.k(K.c(this.a), "*", bundle));
    }
    
    public final j d(final j j) {
        return j.g(new m(), new E(this));
    }
    
    public final String e() {
        final String q = this.a.q();
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(q.getBytes()));
        }
        catch (NoSuchAlgorithmException ex) {
            return "[HASH-ERROR]";
        }
    }
    
    public j f() {
        return this.d(this.k(K.c(this.a), "*", new Bundle()));
    }
    
    public final String g(final Bundle obj) {
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
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected response: ");
        sb.append(obj);
        Log.w("FirebaseMessaging", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    public final void j(String b, final String s, final Bundle bundle) {
        ((BaseBundle)bundle).putString("scope", s);
        ((BaseBundle)bundle).putString("sender", b);
        ((BaseBundle)bundle).putString("subtype", b);
        ((BaseBundle)bundle).putString("gmp_app_id", this.a.r().c());
        ((BaseBundle)bundle).putString("gmsv", Integer.toString(this.b.d()));
        ((BaseBundle)bundle).putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        ((BaseBundle)bundle).putString("app_ver", this.b.a());
        ((BaseBundle)bundle).putString("app_ver_name", this.b.b());
        ((BaseBundle)bundle).putString("firebase-app-name-hash", this.e());
        while (true) {
            try {
                b = ((n)V2.m.a(this.f.b(false))).b();
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    ((BaseBundle)bundle).putString("Goog-Firebase-Installations-Auth", b);
                }
                else {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                }
                while (true) {
                    ((BaseBundle)bundle).putString("appid", (String)V2.m.a(this.f.a()));
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fcm-");
                    sb.append("23.3.1");
                    ((BaseBundle)bundle).putString("cliv", sb.toString());
                    final o4.j j = (o4.j)this.e.get();
                    final O4.i i = (O4.i)this.d.get();
                    if (j != null && i != null) {
                        final o4.j.a b2 = j.b("fire-iid");
                        if (b2 != o4.j.a.p) {
                            ((BaseBundle)bundle).putString("Firebase-Client-Log-Type", Integer.toString(b2.c()));
                            ((BaseBundle)bundle).putString("Firebase-Client", i.a());
                        }
                    }
                    return;
                    final InterruptedException ex;
                    Log.e("FirebaseMessaging", "Failed to get FIS auth token", (Throwable)ex);
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
    
    public final j k(final String ex, final String s, final Bundle bundle) {
        try {
            this.j((String)ex, s, bundle);
            return this.c.a(bundle);
        }
        catch (ExecutionException ex) {}
        catch (InterruptedException ex2) {}
        return V2.m.d(ex);
    }
    
    public j l(final String s, final String s2) {
        final Bundle bundle = new Bundle();
        final StringBuilder sb = new StringBuilder();
        sb.append("/topics/");
        sb.append(s2);
        ((BaseBundle)bundle).putString("gcm.topic", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("/topics/");
        sb2.append(s2);
        return this.d(this.k(s, sb2.toString(), bundle));
    }
    
    public j m(final String s, final String s2) {
        final Bundle bundle = new Bundle();
        final StringBuilder sb = new StringBuilder();
        sb.append("/topics/");
        sb.append(s2);
        ((BaseBundle)bundle).putString("gcm.topic", sb.toString());
        ((BaseBundle)bundle).putString("delete", "1");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("/topics/");
        sb2.append(s2);
        return this.d(this.k(s, sb2.toString(), bundle));
    }
}

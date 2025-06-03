/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 */
package p4;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o4.j;
import p4.b;
import p4.j;
import p4.n;
import s3.e;
import s3.m;
import s4.i;
import w2.c;

public class k {
    public final e a;
    public final n b;
    public final c c;
    public final r4.b d;
    public final r4.b e;
    public final i f;

    public k(e e8, n n8, r4.b b8, r4.b b9, i i8) {
        this(e8, n8, new c(e8.m()), b8, b9, i8);
    }

    public k(e e8, n n8, c c8, r4.b b8, r4.b b9, i i8) {
        this.a = e8;
        this.b = n8;
        this.c = c8;
        this.d = b8;
        this.e = b9;
        this.f = i8;
    }

    public static String a(byte[] arrby) {
        return Base64.encodeToString((byte[])arrby, (int)11);
    }

    public static boolean g(String string2) {
        if (!("SERVICE_NOT_AVAILABLE".equals((Object)string2) || "INTERNAL_SERVER_ERROR".equals((Object)string2) || "InternalServerError".equals((Object)string2))) {
            return false;
        }
        return true;
    }

    public V2.j b(String string2, String string3, String string4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return this.c(this.j(string2, string3, string4, bundle));
    }

    public final V2.j c(V2.j j8) {
        return j8.g(b.a(), new j(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String d() {
        String string2 = this.a.q();
        try {
            return k.a(MessageDigest.getInstance((String)"SHA-1").digest(string2.getBytes()));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "[HASH-ERROR]";
        }
    }

    public V2.j e(String string2, String string3, String string4) {
        return this.c(this.j(string2, string3, string4, new Bundle()));
    }

    public final String f(Bundle object) {
        if (object != null) {
            String string2 = object.getString("registration_id");
            if (string2 != null) {
                return string2;
            }
            string2 = object.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            string2 = object.getString("error");
            if (!"RST".equals((Object)string2)) {
                if (string2 != null) {
                    throw new IOException(string2);
                }
                object = String.valueOf((Object)object);
                string2 = new StringBuilder(object.length() + 21);
                string2.append("Unexpected response: ");
                string2.append((String)object);
                Log.w((String)"FirebaseInstanceId", (String)string2.toString(), (Throwable)new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String h(V2.j j8) {
        return this.f((Bundle)j8.k(IOException.class));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle i(String object, String object2, String string2, Bundle bundle) {
        block6 : {
            bundle.putString("scope", string2);
            bundle.putString("sender", (String)object2);
            bundle.putString("subtype", (String)object2);
            bundle.putString("appid", (String)object);
            bundle.putString("gmp_app_id", this.a.r().c());
            bundle.putString("gmsv", Integer.toString((int)this.b.d()));
            bundle.putString("osv", Integer.toString((int)Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.a());
            bundle.putString("app_ver_name", this.b.b());
            bundle.putString("firebase-app-name-hash", this.d());
            try {
                object = ((s4.n)V2.m.a(this.f.b(false))).b();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", (String)object);
                } else {
                    Log.w((String)"FirebaseInstanceId", (String)"FIS auth token is empty");
                }
                break block6;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {}
            Log.e((String)"FirebaseInstanceId", (String)"Failed to get FIS auth token", (Throwable)object);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        object2 = (o4.j)this.e.get();
        object = (O4.i)this.d.get();
        if (object2 != null && object != null && (object2 = object2.b("fire-iid")) != j.a.p) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString((int)object2.c()));
            bundle.putString("Firebase-Client", object.a());
        }
        return bundle;
    }

    public final V2.j j(String string2, String string3, String string4, Bundle bundle) {
        this.i(string2, string3, string4, bundle);
        return this.c.a(bundle);
    }
}


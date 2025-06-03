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
 *  java.lang.Exception
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
package com.google.firebase.messaging;

import V2.b;
import V2.j;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.E;
import com.google.firebase.messaging.K;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o4.j;
import s3.e;
import s3.m;
import s4.i;
import s4.n;
import w2.c;

public class F {
    public final e a;
    public final K b;
    public final c c;
    public final r4.b d;
    public final r4.b e;
    public final i f;

    public F(e e8, K k8, r4.b b8, r4.b b9, i i8) {
        this(e8, k8, new c(e8.m()), b8, b9, i8);
    }

    public F(e e8, K k8, c c8, r4.b b8, r4.b b9, i i8) {
        this.a = e8;
        this.b = k8;
        this.c = c8;
        this.d = b8;
        this.e = b9;
        this.f = i8;
    }

    public static /* synthetic */ String a(F f8, j j8) {
        return f8.i(j8);
    }

    public static String b(byte[] arrby) {
        return Base64.encodeToString((byte[])arrby, (int)11);
    }

    public static boolean h(String string2) {
        if (!("SERVICE_NOT_AVAILABLE".equals((Object)string2) || "INTERNAL_SERVER_ERROR".equals((Object)string2) || "InternalServerError".equals((Object)string2))) {
            return false;
        }
        return true;
    }

    public j c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return this.d(this.k(K.c(this.a), "*", bundle));
    }

    public final j d(j j8) {
        return j8.g(new r1.m(), new E(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String e() {
        String string2 = this.a.q();
        try {
            return F.b(MessageDigest.getInstance((String)"SHA-1").digest(string2.getBytes()));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "[HASH-ERROR]";
        }
    }

    public j f() {
        return this.d(this.k(K.c(this.a), "*", new Bundle()));
    }

    public final String g(Bundle bundle) {
        if (bundle != null) {
            String string2 = bundle.getString("registration_id");
            if (string2 != null) {
                return string2;
            }
            string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            string2 = bundle.getString("error");
            if (!"RST".equals((Object)string2)) {
                if (string2 != null) {
                    throw new IOException(string2);
                }
                string2 = new StringBuilder();
                string2.append("Unexpected response: ");
                string2.append((Object)bundle);
                Log.w((String)"FirebaseMessaging", (String)string2.toString(), (Throwable)new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String i(j j8) {
        return this.g((Bundle)j8.k(IOException.class));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(String object, String object2, Bundle bundle) {
        block6 : {
            bundle.putString("scope", (String)object2);
            bundle.putString("sender", (String)object);
            bundle.putString("subtype", (String)object);
            bundle.putString("gmp_app_id", this.a.r().c());
            bundle.putString("gmsv", Integer.toString((int)this.b.d()));
            bundle.putString("osv", Integer.toString((int)Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.a());
            bundle.putString("app_ver_name", this.b.b());
            bundle.putString("firebase-app-name-hash", this.e());
            try {
                object = ((n)V2.m.a(this.f.b(false))).b();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", (String)object);
                } else {
                    Log.w((String)"FirebaseMessaging", (String)"FIS auth token is empty");
                }
                break block6;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {}
            Log.e((String)"FirebaseMessaging", (String)"Failed to get FIS auth token", (Throwable)object);
        }
        bundle.putString("appid", (String)V2.m.a(this.f.a()));
        object = new StringBuilder();
        object.append("fcm-");
        object.append("23.3.1");
        bundle.putString("cliv", object.toString());
        object2 = (o4.j)this.e.get();
        object = (O4.i)this.d.get();
        if (object2 != null && object != null && (object2 = object2.b("fire-iid")) != j.a.p) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString((int)object2.c()));
            bundle.putString("Firebase-Client", object.a());
        }
    }

    public final j k(String string2, String string3, Bundle bundle) {
        void var1_4;
        try {
            this.j(string2, string3, bundle);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return this.c.a(bundle);
        return V2.m.d((Exception)var1_4);
    }

    public j l(String string2, String string3) {
        Bundle bundle = new Bundle();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/topics/");
        stringBuilder.append(string3);
        bundle.putString("gcm.topic", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("/topics/");
        stringBuilder.append(string3);
        return this.d(this.k(string2, stringBuilder.toString(), bundle));
    }

    public j m(String string2, String string3) {
        Bundle bundle = new Bundle();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/topics/");
        stringBuilder.append(string3);
        bundle.putString("gcm.topic", stringBuilder.toString());
        bundle.putString("delete", "1");
        stringBuilder = new StringBuilder();
        stringBuilder.append("/topics/");
        stringBuilder.append(string3);
        return this.d(this.k(string2, stringBuilder.toString(), bundle));
    }
}


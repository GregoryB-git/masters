/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.Log
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.security.KeyFactory
 *  java.security.PublicKey
 *  java.security.Signature
 *  java.security.spec.KeySpec
 *  java.security.spec.X509EncodedKeySpec
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.ReentrantLock
 *  org.json.JSONObject
 */
package X1;

import V5.t;
import X1.b;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e6.m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.i;
import org.json.JSONObject;
import x1.B;

public final class c {
    public static final c a = new c();
    public static final String b = "/.well-known/oauth/openid/keys/";

    public static /* synthetic */ void a(URL uRL, u u8, String string2, ReentrantLock reentrantLock, Condition condition) {
        c.d(uRL, u8, string2, reentrantLock, condition);
    }

    public static final PublicKey b(String x509EncodedKeySpec) {
        Intrinsics.checkNotNullParameter((Object)x509EncodedKeySpec, "key");
        x509EncodedKeySpec = Base64.decode((String)i.q(i.q(i.q((String)x509EncodedKeySpec, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), (int)0);
        Intrinsics.checkNotNullExpressionValue((Object)x509EncodedKeySpec, "decode(pubKeyString, Base64.DEFAULT)");
        x509EncodedKeySpec = new X509EncodedKeySpec((byte[])x509EncodedKeySpec);
        x509EncodedKeySpec = KeyFactory.getInstance((String)"RSA").generatePublic((KeySpec)x509EncodedKeySpec);
        Intrinsics.checkNotNullExpressionValue((Object)x509EncodedKeySpec, "kf.generatePublic(x509publicKey)");
        return x509EncodedKeySpec;
    }

    public static final String c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "kid");
        URL uRL = new URL("https", Intrinsics.i("www.", B.u()), b);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        u u8 = new u();
        B.t().execute((Runnable)new b(uRL, u8, string2, reentrantLock, condition));
        reentrantLock.lock();
        try {
            condition.await(5000L, TimeUnit.MILLISECONDS);
            return (String)u8.o;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void d(URL var0, u var1_6, String var2_7, ReentrantLock var3_8, Condition var4_9) {
        Intrinsics.checkNotNullParameter(var0, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(var1_7, "$result");
        Intrinsics.checkNotNullParameter(var2_8, "$kid");
        Intrinsics.checkNotNullParameter(var3_9, "$lock");
        var0 = (URLConnection)FirebasePerfUrlConnection.instrument((Object)var0.openConnection());
        if (var0 == null) throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        var5_11 = (HttpURLConnection)var0;
        var0 = var5_11.getInputStream();
        Intrinsics.checkNotNullExpressionValue(var0, "connection.inputStream");
        var0 = new InputStreamReader((InputStream)var0, kotlin.text.b.b);
        var0 = var0 instanceof BufferedReader != false ? (BufferedReader)var0 : new BufferedReader((Reader)var0, 8192);
        var0 = m.f((Reader)var0);
        var5_11.getInputStream().close();
        var1_7.o = new JSONObject((String)var0).optString(var2_8);
        var5_11.disconnect();
        var3_9.lock();
        try {
            var4_10.signal();
            var0 = t.a;
            return;
        }
        finally {
            var3_9.unlock();
        }
lbl25: // 1 sources:
        do {
            try {
                var2_8 = c.a.getClass().getName();
                var0_3 = var1_7 = var0_2.getMessage();
                if (var1_7 == null) {
                    var0_3 = "Error getting public key";
                }
                Log.d((String)var2_8, (String)var0_3);
            }
            catch (Throwable var0_5) {}
            var5_11.disconnect();
            var3_9.lock();
            try {
                var4_10.signal();
                var0_3 = t.a;
                return;
            }
            catch (Throwable var0_4) {
                var3_9.unlock();
                throw var0_4;
            }
            var5_11.disconnect();
            var3_9.lock();
            try {
                var4_10.signal();
                var1_7 = t.a;
                throw var0_5;
            }
            finally {
                var3_9.unlock();
            }
            break;
        } while (true);
        catch (Exception var0_2) {
            ** continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean e(PublicKey arrby, String string2, String string3) {
        Intrinsics.checkNotNullParameter(arrby, "publicKey");
        Intrinsics.checkNotNullParameter(string2, "data");
        Intrinsics.checkNotNullParameter(string3, "signature");
        try {
            Signature signature = Signature.getInstance((String)"SHA256withRSA");
            signature.initVerify((PublicKey)arrby);
            arrby = string2.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            signature.update(arrby);
            arrby = Base64.decode((String)string3, (int)8);
            Intrinsics.checkNotNullExpressionValue(arrby, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(arrby);
        }
        catch (Exception exception) {
            return false;
        }
    }
}


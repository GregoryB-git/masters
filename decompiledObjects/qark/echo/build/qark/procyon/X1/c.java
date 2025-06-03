// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X1;

import java.security.Signature;
import java.io.InputStream;
import android.util.Log;
import V5.t;
import org.json.JSONObject;
import e6.m;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import x1.B;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import android.util.Base64;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import java.security.PublicKey;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.u;
import java.net.URL;

public final class c
{
    public static final c a;
    public static final String b;
    
    static {
        a = new c();
        b = "/.well-known/oauth/openid/keys/";
    }
    
    public static final PublicKey b(final String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        final byte[] decode = Base64.decode(i.q(i.q(i.q(s, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        final PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }
    
    public static final String c(final String s) {
        Intrinsics.checkNotNullParameter(s, "kid");
        final URL url = new URL("https", Intrinsics.i("www.", B.u()), c.b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition condition = reentrantLock.newCondition();
        final u u = new u();
        B.t().execute(new b(url, u, s, reentrantLock, condition));
        reentrantLock.lock();
        try {
            condition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String)u.o;
        }
        finally {
            reentrantLock.unlock();
        }
    }
    
    public static final void d(final URL url, final u u, String name, final ReentrantLock reentrantLock, final Condition condition) {
        Intrinsics.checkNotNullParameter(url, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(u, "$result");
        Intrinsics.checkNotNullParameter(name, "$kid");
        Intrinsics.checkNotNullParameter(reentrantLock, "$lock");
        final URLConnection urlConnection = (URLConnection)FirebasePerfUrlConnection.instrument(url.openConnection());
        while (true) {
            if (urlConnection != null) {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
                while (true) {
                    try {
                        while (true) {
                            try {
                                final InputStream inputStream = httpURLConnection.getInputStream();
                                Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                                final InputStreamReader in = new InputStreamReader(inputStream, kotlin.text.b.b);
                                BufferedReader bufferedReader;
                                if (in instanceof BufferedReader) {
                                    bufferedReader = (BufferedReader)in;
                                }
                                else {
                                    bufferedReader = new BufferedReader(in, 8192);
                                }
                                while (true) {
                                    final String f = m.f(bufferedReader);
                                    httpURLConnection.getInputStream().close();
                                    u.o = new JSONObject(f).optString(name);
                                    httpURLConnection.disconnect();
                                    reentrantLock.lock();
                                    try {
                                        condition.signal();
                                        final t a = t.a;
                                        return;
                                    }
                                    finally {
                                        reentrantLock.unlock();
                                    }
                                    name = c.a.getClass().getName();
                                    final Exception ex;
                                    String message;
                                    if ((message = ex.getMessage()) == null) {
                                        message = "Error getting public key";
                                    }
                                    Log.d(name, message);
                                    httpURLConnection.disconnect();
                                    reentrantLock.lock();
                                    try {
                                        condition.signal();
                                        final t a2 = t.a;
                                        return;
                                    }
                                    finally {
                                        reentrantLock.unlock();
                                    }
                                    break;
                                }
                                httpURLConnection.disconnect();
                                reentrantLock.lock();
                                try {
                                    condition.signal();
                                    final t a3 = t.a;
                                    reentrantLock.unlock();
                                    throw;
                                }
                                finally {
                                    reentrantLock.unlock();
                                }
                                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                            }
                            finally {}
                            final Throwable t2;
                            final Throwable t = t2;
                            continue;
                        }
                    }
                    catch (Exception ex2) {}
                    final Exception ex2;
                    final Exception ex = ex2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public static final boolean e(final PublicKey publicKey, final String s, final String s2) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(s, "data");
        Intrinsics.checkNotNullParameter(s2, "signature");
        try {
            final Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            final byte[] bytes = s.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            final byte[] decode = Base64.decode(s2, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        }
        catch (Exception ex) {
            return false;
        }
    }
}

package X1;

import V5.t;
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
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.r;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7034a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final String f7035b = "/.well-known/oauth/openid/keys/";

    public static final PublicKey b(String key) {
        String q7;
        String q8;
        String q9;
        Intrinsics.checkNotNullParameter(key, "key");
        q7 = r.q(key, "\n", "", false, 4, null);
        q8 = r.q(q7, "-----BEGIN PUBLIC KEY-----", "", false, 4, null);
        q9 = r.q(q8, "-----END PUBLIC KEY-----", "", false, 4, null);
        byte[] decode = Base64.decode(q9, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String c(final String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        final URL url = new URL("https", Intrinsics.i("www.", C2146B.u()), f7035b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final u uVar = new u();
        C2146B.t().execute(new Runnable() { // from class: X1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(url, uVar, kid, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) uVar.f16230o;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final void d(URL openIdKeyUrl, u result, String kid, ReentrantLock lock, Condition condition) {
        Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(kid, "$kid");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(openIdKeyUrl.openConnection());
        if (uRLConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, kotlin.text.b.f16240b);
                String f7 = m.f(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.f16230o = new JSONObject(f7).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    t tVar = t.f6803a;
                } finally {
                }
            } catch (Exception e7) {
                String name = f7034a.getClass().getName();
                String message = e7.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    t tVar2 = t.f6803a;
                } finally {
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                t tVar3 = t.f6803a;
                throw th;
            } finally {
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}

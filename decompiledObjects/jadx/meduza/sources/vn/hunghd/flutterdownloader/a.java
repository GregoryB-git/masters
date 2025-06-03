package vn.hunghd.flutterdownloader;

import android.util.Log;
import ec.i;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        i.e(x509CertificateArr, "chain");
        i.e(str, "authType");
        Log.i("trustAllHosts", "checkClientTrusted");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        i.e(x509CertificateArr, "chain");
        i.e(str, "authType");
        Log.i("trustAllHosts", "checkServerTrusted");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

package e7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.zzgf;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class g1 extends h6 {
    public g1(i6 i6Var) {
        super(i6Var);
    }

    public static byte[] t(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    public final void s(String str, j6 j6Var, zzgf.zzj zzjVar, f1 f1Var) {
        l();
        p();
        try {
            URL url = new URI(j6Var.f4378a).toURL();
            m();
            byte[] zzce = zzjVar.zzce();
            e2 zzl = zzl();
            Map<String, String> map = j6Var.f4379b;
            if (map == null) {
                map = Collections.emptyMap();
            }
            zzl.s(new h1(this, str, url, zzce, map, f1Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            zzj().f4060o.d("Failed to parse URL. Not uploading MeasurementBatch. appId", a1.p(str), j6Var.f4378a);
        }
    }

    public final boolean u() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}

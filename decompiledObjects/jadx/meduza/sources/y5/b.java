package y5;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f17439a;

    public b(HashMap hashMap) {
        this.f17439a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String sb2;
        HttpURLConnection httpURLConnection;
        Map map = this.f17439a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                zzi.zzb(263);
                httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            } catch (IOException e10) {
                e = e10;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(uri);
                sb3.append(". ");
                sb3.append(message);
                sb2 = sb3.toString();
                Log.w("HttpUrlPinger", sb2, e);
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                String message2 = e.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message2).length());
                sb4.append("Error while parsing ping URL: ");
                sb4.append(uri);
                sb4.append(". ");
                sb4.append(message2);
                sb2 = sb4.toString();
                Log.w("HttpUrlPinger", sb2, e);
            } catch (RuntimeException e12) {
                e = e12;
                String message3 = e.getMessage();
                StringBuilder sb32 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message3).length());
                sb32.append("Error while pinging URL: ");
                sb32.append(uri);
                sb32.append(". ");
                sb32.append(message3);
                sb2 = sb32.toString();
                Log.w("HttpUrlPinger", sb2, e);
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb5.append("Received non-success response code ");
                    sb5.append(responseCode);
                    sb5.append(" from pinging URL: ");
                    sb5.append(uri);
                    Log.w("HttpUrlPinger", sb5.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } finally {
            zzi.zza();
        }
    }
}

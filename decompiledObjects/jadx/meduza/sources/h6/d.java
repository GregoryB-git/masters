package h6;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final p6.a f7154c = new p6.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final l6.p f7156b;

    public d(String str) {
        m6.j.e(str);
        this.f7155a = str;
        this.f7156b = new l6.p(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f2813o;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f7155a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2812e;
            } else {
                f7154c.c("Unable to revoke access!", new Object[0]);
            }
            f7154c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f7154c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f7154c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f7156b.setResult(status);
    }
}

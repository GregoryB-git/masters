package aa;

import aa.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class p implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f354a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Future<?> f355b;

    /* renamed from: c, reason: collision with root package name */
    public Task<Bitmap> f356c;

    public p(URL url) {
        this.f354a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f355b.cancel(true);
    }

    public final Bitmap f() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder l10 = defpackage.f.l("Starting download of: ");
            l10.append(this.f354a);
            Log.i("FirebaseMessaging", l10.toString());
        }
        URLConnection openConnection = this.f354a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] b10 = d.b(new d.a(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                StringBuilder l11 = defpackage.f.l("Downloaded ");
                l11.append(b10.length);
                l11.append(" bytes from ");
                l11.append(this.f354a);
                Log.v("FirebaseMessaging", l11.toString());
            }
            if (b10.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
            if (decodeByteArray == null) {
                StringBuilder l12 = defpackage.f.l("Failed to decode image: ");
                l12.append(this.f354a);
                throw new IOException(l12.toString());
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder l13 = defpackage.f.l("Successfully downloaded image: ");
                l13.append(this.f354a);
                Log.d("FirebaseMessaging", l13.toString());
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}

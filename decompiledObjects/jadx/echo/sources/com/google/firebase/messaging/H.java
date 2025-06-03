package com.google.firebase.messaging;

import A2.AbstractC0328n;
import V2.AbstractC0659j;
import V2.C0660k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class H implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public final URL f11645o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Future f11646p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0659j f11647q;

    public H(URL url) {
        this.f11645o = url;
    }

    public static H e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new H(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f11645o);
        }
        byte[] c7 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c7, 0, c7.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f11645o);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f11645o);
        }
        return decodeByteArray;
    }

    public final byte[] c() {
        URLConnection openConnection = this.f11645o.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d7 = AbstractC1112b.d(AbstractC1112b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d7.length + " bytes from " + this.f11645o);
            }
            if (d7.length <= 1048576) {
                return d7;
            }
            throw new IOException("Image exceeds max size of 1048576");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11646p.cancel(true);
    }

    public AbstractC0659j h() {
        return (AbstractC0659j) AbstractC0328n.i(this.f11647q);
    }

    public final /* synthetic */ void i(C0660k c0660k) {
        try {
            c0660k.c(b());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public void k(ExecutorService executorService) {
        final C0660k c0660k = new C0660k();
        this.f11646p = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.G
            @Override // java.lang.Runnable
            public final void run() {
                H.this.i(c0660k);
            }
        });
        this.f11647q = c0660k.a();
    }
}

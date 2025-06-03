// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import A2.n;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.IOException;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import java.net.MalformedURLException;
import android.util.Log;
import android.text.TextUtils;
import V2.k;
import V2.j;
import java.util.concurrent.Future;
import java.net.URL;
import java.io.Closeable;

public class H implements Closeable
{
    public final URL o;
    public volatile Future p;
    public j q;
    
    public H(final URL o) {
        this.o = o;
    }
    
    public static H e(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        while (true) {
            try {
                return new H(new URL(s));
                final StringBuilder sb = new StringBuilder();
                sb.append("Not downloading image, bad URL: ");
                sb.append(s);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
            catch (MalformedURLException ex) {
                continue;
            }
            break;
        }
    }
    
    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Starting download of: ");
            sb.append(this.o);
            Log.i("FirebaseMessaging", sb.toString());
        }
        final byte[] c = this.c();
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully downloaded image: ");
                sb2.append(this.o);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Failed to decode image: ");
        sb3.append(this.o);
        throw new IOException(sb3.toString());
    }
    
    public final byte[] c() {
        final URLConnection openConnection = this.o.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            Object inputStream = openConnection.getInputStream();
            try {
                final byte[] d = b.d(b.b((InputStream)inputStream, 1048577L));
                if (inputStream != null) {
                    ((InputStream)inputStream).close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    inputStream = new StringBuilder();
                    ((StringBuilder)inputStream).append("Downloaded ");
                    ((StringBuilder)inputStream).append(d.length);
                    ((StringBuilder)inputStream).append(" bytes from ");
                    ((StringBuilder)inputStream).append(this.o);
                    Log.v("FirebaseMessaging", ((StringBuilder)inputStream).toString());
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            }
            finally {
                if (inputStream != null) {
                    try {
                        ((InputStream)inputStream).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable exception;
                        t.addSuppressed(exception);
                    }
                }
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }
    
    @Override
    public void close() {
        this.p.cancel(true);
    }
    
    public j h() {
        return (j)n.i(this.q);
    }
    
    public void k(final ExecutorService executorService) {
        final k k = new k();
        this.p = executorService.submit(new G(this, k));
        this.q = k.a();
    }
}

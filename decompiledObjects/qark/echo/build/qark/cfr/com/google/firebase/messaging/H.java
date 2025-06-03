/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 */
package com.google.firebase.messaging;

import A2.n;
import V2.j;
import V2.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.G;
import com.google.firebase.messaging.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class H
implements Closeable {
    public final URL o;
    public volatile Future p;
    public j q;

    public H(URL uRL) {
        this.o = uRL;
    }

    public static /* synthetic */ void a(H h8, k k8) {
        h8.i(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static H e(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        try {
            return new H(new URL(string2));
        }
        catch (MalformedURLException malformedURLException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not downloading image, bad URL: ");
        stringBuilder.append(string2);
        Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return null;
    }

    public Bitmap b() {
        StringBuilder stringBuilder;
        if (Log.isLoggable((String)"FirebaseMessaging", (int)4)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Starting download of: ");
            stringBuilder.append((Object)this.o);
            Log.i((String)"FirebaseMessaging", (String)stringBuilder.toString());
        }
        stringBuilder = this.c();
        if ((stringBuilder = BitmapFactory.decodeByteArray((byte[])stringBuilder, (int)0, (int)stringBuilder.length)) != null) {
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Successfully downloaded image: ");
                stringBuilder2.append((Object)this.o);
                Log.d((String)"FirebaseMessaging", (String)stringBuilder2.toString());
            }
            return stringBuilder;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to decode image: ");
        stringBuilder.append((Object)this.o);
        throw new IOException(stringBuilder.toString());
    }

    public final byte[] c() {
        URLConnection uRLConnection = this.o.openConnection();
        if (uRLConnection.getContentLength() <= 1048576) {
            byte[] arrby;
            block8 : {
                uRLConnection = uRLConnection.getInputStream();
                try {
                    arrby = b.d(b.b((InputStream)uRLConnection, 0x100001L));
                    if (uRLConnection == null) break block8;
                }
                catch (Throwable throwable) {
                    if (uRLConnection != null) {
                        try {
                            uRLConnection.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                uRLConnection.close();
            }
            if (Log.isLoggable((String)"FirebaseMessaging", (int)2)) {
                uRLConnection = new StringBuilder();
                uRLConnection.append("Downloaded ");
                uRLConnection.append(arrby.length);
                uRLConnection.append(" bytes from ");
                uRLConnection.append((Object)this.o);
                Log.v((String)"FirebaseMessaging", (String)uRLConnection.toString());
            }
            if (arrby.length <= 1048576) {
                return arrby;
            }
            throw new IOException("Image exceeds max size of 1048576");
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public void close() {
        this.p.cancel(true);
    }

    public j h() {
        return (j)n.i(this.q);
    }

    public final /* synthetic */ void i(k k8) {
        try {
            k8.c((Object)this.b());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public void k(ExecutorService executorService) {
        k k8 = new k();
        this.p = executorService.submit((Runnable)new G(this, k8));
        this.q = k8.a();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  javax.net.ssl.HttpsURLConnection
 */
package com.google.firebase.perf.network;

import B4.a;
import I4.c;
import I4.d;
import I4.j;
import L4.k;
import M4.l;
import M4.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object a(n n8, k b8, l l8) {
        void var2_3;
        var2_3.g();
        long l9 = var2_3.e();
        G4.j j8 = G4.j.h(b8);
        try {
            URLConnection uRLConnection = n8.a();
            if (uRLConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection)uRLConnection, (l)var2_3, j8).getContent();
            }
            if (!(uRLConnection instanceof HttpURLConnection)) return uRLConnection.getContent();
            return new c((HttpURLConnection)uRLConnection, (l)var2_3, j8).getContent();
        }
        catch (IOException iOException) {}
        j8.w(l9);
        j8.A(var2_3.c());
        j8.C(n8.toString());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object b(n n8, Class[] object, k b8, l l8) {
        void var3_5;
        var3_5.g();
        long l9 = var3_5.e();
        G4.j j8 = G4.j.h(b8);
        try {
            URLConnection uRLConnection = n8.a();
            if (uRLConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection)uRLConnection, (l)var3_5, j8).getContent((Class[])object);
            }
            if (!(uRLConnection instanceof HttpURLConnection)) return uRLConnection.getContent((Class[])object);
            return new c((HttpURLConnection)uRLConnection, (l)var3_5, j8).getContent((Class[])object);
        }
        catch (IOException iOException) {}
        j8.w(l9);
        j8.A(var3_5.c());
        j8.C(n8.toString());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream c(n n8, k b8, l l8) {
        void var2_3;
        var2_3.g();
        long l9 = var2_3.e();
        G4.j j8 = G4.j.h(b8);
        try {
            URLConnection uRLConnection = n8.a();
            if (uRLConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection)uRLConnection, (l)var2_3, j8).getInputStream();
            }
            if (!(uRLConnection instanceof HttpURLConnection)) return uRLConnection.getInputStream();
            return new c((HttpURLConnection)uRLConnection, (l)var2_3, j8).getInputStream();
        }
        catch (IOException iOException) {}
        j8.w(l9);
        j8.A(var2_3.c());
        j8.C(n8.toString());
        j.d(j8);
        throw iOException;
    }

    @Keep
    public static Object getContent(URL uRL) {
        return FirebasePerfUrlConnection.a(new n(uRL), k.l(), new l());
    }

    @Keep
    public static Object getContent(URL uRL, Class[] arrclass) {
        return FirebasePerfUrlConnection.b(new n(uRL), arrclass, k.l(), new l());
    }

    @Keep
    public static Object instrument(Object object) {
        if (object instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection)object, new l(), G4.j.h(k.l()));
        }
        if (object instanceof HttpURLConnection) {
            return new c((HttpURLConnection)object, new l(), G4.j.h(k.l()));
        }
        return object;
    }

    @Keep
    public static InputStream openStream(URL uRL) {
        return FirebasePerfUrlConnection.c(new n(uRL), k.l(), new l());
    }
}


package com.google.firebase.perf.network;

import G4.j;
import I4.c;
import I4.d;
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

/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    public static Object a(n nVar, k kVar, l lVar) {
        lVar.g();
        long e7 = lVar.e();
        j h7 = j.h(kVar);
        try {
            URLConnection a7 = nVar.a();
            return a7 instanceof HttpsURLConnection ? new d((HttpsURLConnection) a7, lVar, h7).getContent() : a7 instanceof HttpURLConnection ? new c((HttpURLConnection) a7, lVar, h7).getContent() : a7.getContent();
        } catch (IOException e8) {
            h7.w(e7);
            h7.A(lVar.c());
            h7.C(nVar.toString());
            I4.j.d(h7);
            throw e8;
        }
    }

    public static Object b(n nVar, Class[] clsArr, k kVar, l lVar) {
        lVar.g();
        long e7 = lVar.e();
        j h7 = j.h(kVar);
        try {
            URLConnection a7 = nVar.a();
            return a7 instanceof HttpsURLConnection ? new d((HttpsURLConnection) a7, lVar, h7).getContent(clsArr) : a7 instanceof HttpURLConnection ? new c((HttpURLConnection) a7, lVar, h7).getContent(clsArr) : a7.getContent(clsArr);
        } catch (IOException e8) {
            h7.w(e7);
            h7.A(lVar.c());
            h7.C(nVar.toString());
            I4.j.d(h7);
            throw e8;
        }
    }

    public static InputStream c(n nVar, k kVar, l lVar) {
        lVar.g();
        long e7 = lVar.e();
        j h7 = j.h(kVar);
        try {
            URLConnection a7 = nVar.a();
            return a7 instanceof HttpsURLConnection ? new d((HttpsURLConnection) a7, lVar, h7).getInputStream() : a7 instanceof HttpURLConnection ? new c((HttpURLConnection) a7, lVar, h7).getInputStream() : a7.getInputStream();
        } catch (IOException e8) {
            h7.w(e7);
            h7.A(lVar.c());
            h7.C(nVar.toString());
            I4.j.d(h7);
            throw e8;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.l(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new d((HttpsURLConnection) obj, new l(), j.h(k.l())) : obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new l(), j.h(k.l())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.l(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.l(), new l());
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;
import I4.c;
import java.net.HttpURLConnection;
import I4.d;
import javax.net.ssl.HttpsURLConnection;
import G4.j;
import M4.l;
import L4.k;
import M4.n;

public class FirebasePerfUrlConnection
{
    public static Object a(final n n, k h, final l l) {
        l.g();
        final long e = l.e();
        h = (k)j.h(h);
        while (true) {
            try {
                final URLConnection a = n.a();
                if (a instanceof HttpsURLConnection) {
                    return new d((HttpsURLConnection)a, l, (j)h).getContent();
                }
                if (a instanceof HttpURLConnection) {
                    return new c((HttpURLConnection)a, l, (j)h).getContent();
                }
                return a.getContent();
                ((j)h).w(e);
                ((j)h).A(l.c());
                ((j)h).C(n.toString());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Object b(final n n, final Class[] classes, k h, final l l) {
        l.g();
        final long e = l.e();
        h = (k)j.h(h);
        while (true) {
            try {
                final URLConnection a = n.a();
                if (a instanceof HttpsURLConnection) {
                    return new d((HttpsURLConnection)a, l, (j)h).getContent(classes);
                }
                if (a instanceof HttpURLConnection) {
                    return new c((HttpURLConnection)a, l, (j)h).getContent(classes);
                }
                return a.getContent(classes);
                ((j)h).w(e);
                ((j)h).A(l.c());
                ((j)h).C(n.toString());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static InputStream c(final n n, k h, final l l) {
        l.g();
        final long e = l.e();
        h = (k)j.h(h);
        while (true) {
            try {
                final URLConnection a = n.a();
                if (a instanceof HttpsURLConnection) {
                    return new d((HttpsURLConnection)a, l, (j)h).getInputStream();
                }
                if (a instanceof HttpURLConnection) {
                    return new c((HttpURLConnection)a, l, (j)h).getInputStream();
                }
                return a.getInputStream();
                ((j)h).w(e);
                ((j)h).A(l.c());
                ((j)h).C(n.toString());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Keep
    public static Object getContent(final URL url) {
        return a(new n(url), k.l(), new l());
    }
    
    @Keep
    public static Object getContent(final URL url, final Class[] array) {
        return b(new n(url), array, k.l(), new l());
    }
    
    @Keep
    public static Object instrument(final Object o) {
        if (o instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection)o, new l(), j.h(k.l()));
        }
        if (o instanceof HttpURLConnection) {
            return new c((HttpURLConnection)o, new l(), j.h(k.l()));
        }
        return o;
    }
    
    @Keep
    public static InputStream openStream(final URL url) {
        return c(new n(url), k.l(), new l());
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URI
 *  org.apache.http.HttpHost
 *  org.apache.http.HttpMessage
 *  org.apache.http.HttpRequest
 *  org.apache.http.HttpResponse
 *  org.apache.http.RequestLine
 *  org.apache.http.StatusLine
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.ResponseHandler
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.protocol.HttpContext
 */
package com.google.firebase.perf.network;

import B4.a;
import I4.h;
import I4.j;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object a(HttpClient object, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(httpHost.toURI());
            stringBuilder.append(httpRequest.getRequestLine().getUri());
            j8.C(stringBuilder.toString()).q(httpRequest.getRequestLine().getMethod());
            stringBuilder = j.a((HttpMessage)httpRequest);
            if (stringBuilder != null) {
                j8.v(stringBuilder.longValue());
            }
            l8.g();
            j8.w(l8.e());
            return object.execute(httpHost, httpRequest, (ResponseHandler)new h(responseHandler, l8, j8));
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object b(HttpClient object, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(httpHost.toURI());
            stringBuilder.append(httpRequest.getRequestLine().getUri());
            j8.C(stringBuilder.toString()).q(httpRequest.getRequestLine().getMethod());
            stringBuilder = j.a((HttpMessage)httpRequest);
            if (stringBuilder != null) {
                j8.v(stringBuilder.longValue());
            }
            l8.g();
            j8.w(l8.e());
            return object.execute(httpHost, httpRequest, (ResponseHandler)new h(responseHandler, l8, j8), httpContext);
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object c(HttpClient object, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            j8.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long l9 = j.a((HttpMessage)httpUriRequest);
            if (l9 != null) {
                j8.v(l9);
            }
            l8.g();
            j8.w(l8.e());
            return object.execute(httpUriRequest, (ResponseHandler)new h(responseHandler, l8, j8));
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object d(HttpClient object, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            j8.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long l9 = j.a((HttpMessage)httpUriRequest);
            if (l9 != null) {
                j8.v(l9);
            }
            l8.g();
            j8.w(l8.e());
            return object.execute(httpUriRequest, (ResponseHandler)new h(responseHandler, l8, j8), httpContext);
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse e(HttpClient httpClient, HttpHost object, HttpRequest httpRequest, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.toURI());
            stringBuilder.append(httpRequest.getRequestLine().getUri());
            j8.C(stringBuilder.toString()).q(httpRequest.getRequestLine().getMethod());
            stringBuilder = j.a((HttpMessage)httpRequest);
            if (stringBuilder != null) {
                j8.v(stringBuilder.longValue());
            }
            l8.g();
            j8.w(l8.e());
            httpClient = httpClient.execute((HttpHost)object, httpRequest);
            j8.A(l8.c());
            j8.r(httpClient.getStatusLine().getStatusCode());
            object = j.a((HttpMessage)httpClient);
            if (object != null) {
                j8.y(object.longValue());
            }
            if ((object = j.b((HttpResponse)httpClient)) != null) {
                j8.x((String)object);
            }
            j8.g();
            return httpClient;
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T)FirebasePerfHttpClient.a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T)FirebasePerfHttpClient.b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T)FirebasePerfHttpClient.c(httpClient, httpUriRequest, responseHandler, new l(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T)FirebasePerfHttpClient.d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return FirebasePerfHttpClient.e(httpClient, httpHost, httpRequest, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return FirebasePerfHttpClient.f(httpClient, httpHost, httpRequest, httpContext, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return FirebasePerfHttpClient.g(httpClient, httpUriRequest, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return FirebasePerfHttpClient.h(httpClient, httpUriRequest, httpContext, new l(), k.l());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse f(HttpClient httpClient, HttpHost object, HttpRequest httpRequest, HttpContext httpContext, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.toURI());
            stringBuilder.append(httpRequest.getRequestLine().getUri());
            j8.C(stringBuilder.toString()).q(httpRequest.getRequestLine().getMethod());
            stringBuilder = j.a((HttpMessage)httpRequest);
            if (stringBuilder != null) {
                j8.v(stringBuilder.longValue());
            }
            l8.g();
            j8.w(l8.e());
            httpClient = httpClient.execute((HttpHost)object, httpRequest, httpContext);
            j8.A(l8.c());
            j8.r(httpClient.getStatusLine().getStatusCode());
            object = j.a((HttpMessage)httpClient);
            if (object != null) {
                j8.y(object.longValue());
            }
            if ((object = j.b((HttpResponse)httpClient)) != null) {
                j8.x((String)object);
            }
            j8.g();
            return httpClient;
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse g(HttpClient httpClient, HttpUriRequest object, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            j8.C(object.getURI().toString()).q(object.getMethod());
            Long l9 = j.a((HttpMessage)object);
            if (l9 != null) {
                j8.v(l9);
            }
            l8.g();
            j8.w(l8.e());
            httpClient = httpClient.execute((HttpUriRequest)object);
            j8.A(l8.c());
            j8.r(httpClient.getStatusLine().getStatusCode());
            object = j.a((HttpMessage)httpClient);
            if (object != null) {
                j8.y(object.longValue());
            }
            if ((object = j.b((HttpResponse)httpClient)) != null) {
                j8.x((String)object);
            }
            j8.g();
            return httpClient;
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpResponse h(HttpClient httpClient, HttpUriRequest object, HttpContext httpContext, l l8, k b8) {
        G4.j j8 = G4.j.h(b8);
        try {
            j8.C(object.getURI().toString()).q(object.getMethod());
            Long l9 = j.a((HttpMessage)object);
            if (l9 != null) {
                j8.v(l9);
            }
            l8.g();
            j8.w(l8.e());
            httpClient = httpClient.execute((HttpUriRequest)object, httpContext);
            j8.A(l8.c());
            j8.r(httpClient.getStatusLine().getStatusCode());
            object = j.a((HttpMessage)httpClient);
            if (object != null) {
                j8.y(object.longValue());
            }
            if ((object = j.b((HttpResponse)httpClient)) != null) {
                j8.x((String)object);
            }
            j8.g();
            return httpClient;
        }
        catch (IOException iOException) {}
        j8.A(l8.c());
        j.d(j8);
        throw iOException;
    }
}


package com.google.firebase.perf.network;

import G4.j;
import I4.h;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public class FirebasePerfHttpClient {
    public static Object a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).q(httpRequest.getRequestLine().getMethod());
            Long a7 = I4.j.a(httpRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new h(responseHandler, lVar, h7));
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static Object b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).q(httpRequest.getRequestLine().getMethod());
            Long a7 = I4.j.a(httpRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new h(responseHandler, lVar, h7), httpContext);
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static Object c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long a7 = I4.j.a(httpUriRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            return httpClient.execute(httpUriRequest, new h(responseHandler, lVar, h7));
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static Object d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long a7 = I4.j.a(httpUriRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            return httpClient.execute(httpUriRequest, new h(responseHandler, lVar, h7), httpContext);
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).q(httpRequest.getRequestLine().getMethod());
            Long a7 = I4.j.a(httpRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            h7.A(lVar.c());
            h7.r(execute.getStatusLine().getStatusCode());
            Long a8 = I4.j.a(execute);
            if (a8 != null) {
                h7.y(a8.longValue());
            }
            String b7 = I4.j.b(execute);
            if (b7 != null) {
                h7.x(b7);
            }
            h7.g();
            return execute;
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.l());
    }

    public static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).q(httpRequest.getRequestLine().getMethod());
            Long a7 = I4.j.a(httpRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            h7.A(lVar.c());
            h7.r(execute.getStatusLine().getStatusCode());
            Long a8 = I4.j.a(execute);
            if (a8 != null) {
                h7.y(a8.longValue());
            }
            String b7 = I4.j.b(execute);
            if (b7 != null) {
                h7.x(b7);
            }
            h7.g();
            return execute;
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long a7 = I4.j.a(httpUriRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            h7.A(lVar.c());
            h7.r(execute.getStatusLine().getStatusCode());
            Long a8 = I4.j.a(execute);
            if (a8 != null) {
                h7.y(a8.longValue());
            }
            String b7 = I4.j.b(execute);
            if (b7 != null) {
                h7.x(b7);
            }
            h7.g();
            return execute;
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    public static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) {
        j h7 = j.h(kVar);
        try {
            h7.C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
            Long a7 = I4.j.a(httpUriRequest);
            if (a7 != null) {
                h7.v(a7.longValue());
            }
            lVar.g();
            h7.w(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            h7.A(lVar.c());
            h7.r(execute.getStatusLine().getStatusCode());
            Long a8 = I4.j.a(execute);
            if (a8 != null) {
                h7.y(a8.longValue());
            }
            String b7 = I4.j.b(execute);
            if (b7 != null) {
                h7.x(b7);
            }
            h7.g();
            return execute;
        } catch (IOException e7) {
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e7;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.l());
    }
}

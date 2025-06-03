// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import java.io.IOException;
import I4.h;
import org.apache.http.HttpMessage;
import G4.j;
import L4.k;
import M4.l;
import org.apache.http.client.ResponseHandler;
import org.apache.http.HttpRequest;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;

public class FirebasePerfHttpClient
{
    public static Object a(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final ResponseHandler responseHandler, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(httpHost.toURI());
                sb.append(httpRequest.getRequestLine().getUri());
                ((j)h).C(sb.toString()).q(httpRequest.getRequestLine().getMethod());
                final Long a = I4.j.a((HttpMessage)httpRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                return httpClient.execute(httpHost, httpRequest, (ResponseHandler)new h(responseHandler, l, (j)h));
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Object b(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final ResponseHandler responseHandler, final HttpContext httpContext, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(httpHost.toURI());
                sb.append(httpRequest.getRequestLine().getUri());
                ((j)h).C(sb.toString()).q(httpRequest.getRequestLine().getMethod());
                final Long a = I4.j.a((HttpMessage)httpRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                return httpClient.execute(httpHost, httpRequest, (ResponseHandler)new h(responseHandler, l, (j)h), httpContext);
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Object c(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final ResponseHandler responseHandler, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                ((j)h).C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
                final Long a = I4.j.a((HttpMessage)httpUriRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                return httpClient.execute(httpUriRequest, (ResponseHandler)new h(responseHandler, l, (j)h));
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Object d(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final ResponseHandler responseHandler, final HttpContext httpContext, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                ((j)h).C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
                final Long a = I4.j.a((HttpMessage)httpUriRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                return httpClient.execute(httpUriRequest, (ResponseHandler)new h(responseHandler, l, (j)h), httpContext);
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static HttpResponse e(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(httpHost.toURI());
                sb.append(httpRequest.getRequestLine().getUri());
                ((j)h).C(sb.toString()).q(httpRequest.getRequestLine().getMethod());
                final Long a = I4.j.a((HttpMessage)httpRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                final HttpResponse execute = httpClient.execute(httpHost, httpRequest);
                ((j)h).A(l.c());
                ((j)h).r(execute.getStatusLine().getStatusCode());
                final Long a2 = I4.j.a((HttpMessage)execute);
                if (a2 != null) {
                    ((j)h).y(a2);
                }
                final String b = I4.j.b(execute);
                if (b != null) {
                    ((j)h).x(b);
                }
                ((j)h).g();
                return execute;
                ((j)h).A(l.c());
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
    public static <T> T execute(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final ResponseHandler<? extends T> responseHandler) {
        return (T)a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.l());
    }
    
    @Keep
    public static <T> T execute(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final ResponseHandler<? extends T> responseHandler, final HttpContext httpContext) {
        return (T)b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.l());
    }
    
    @Keep
    public static <T> T execute(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final ResponseHandler<T> responseHandler) {
        return (T)c(httpClient, httpUriRequest, responseHandler, new l(), k.l());
    }
    
    @Keep
    public static <T> T execute(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final ResponseHandler<T> responseHandler, final HttpContext httpContext) {
        return (T)d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.l());
    }
    
    @Keep
    public static HttpResponse execute(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.l());
    }
    
    @Keep
    public static HttpResponse execute(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.l());
    }
    
    @Keep
    public static HttpResponse execute(final HttpClient httpClient, final HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.l());
    }
    
    @Keep
    public static HttpResponse execute(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.l());
    }
    
    public static HttpResponse f(final HttpClient httpClient, final HttpHost httpHost, final HttpRequest httpRequest, final HttpContext httpContext, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(httpHost.toURI());
                sb.append(httpRequest.getRequestLine().getUri());
                ((j)h).C(sb.toString()).q(httpRequest.getRequestLine().getMethod());
                final Long a = I4.j.a((HttpMessage)httpRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                final HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
                ((j)h).A(l.c());
                ((j)h).r(execute.getStatusLine().getStatusCode());
                final Long a2 = I4.j.a((HttpMessage)execute);
                if (a2 != null) {
                    ((j)h).y(a2);
                }
                final String b = I4.j.b(execute);
                if (b != null) {
                    ((j)h).x(b);
                }
                ((j)h).g();
                return execute;
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static HttpResponse g(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                ((j)h).C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
                final Long a = I4.j.a((HttpMessage)httpUriRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                final HttpResponse execute = httpClient.execute(httpUriRequest);
                ((j)h).A(l.c());
                ((j)h).r(execute.getStatusLine().getStatusCode());
                final Long a2 = I4.j.a((HttpMessage)execute);
                if (a2 != null) {
                    ((j)h).y(a2);
                }
                final String b = I4.j.b(execute);
                if (b != null) {
                    ((j)h).x(b);
                }
                ((j)h).g();
                return execute;
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static HttpResponse h(final HttpClient httpClient, final HttpUriRequest httpUriRequest, final HttpContext httpContext, final l l, k h) {
        h = (k)j.h(h);
        while (true) {
            try {
                ((j)h).C(httpUriRequest.getURI().toString()).q(httpUriRequest.getMethod());
                final Long a = I4.j.a((HttpMessage)httpUriRequest);
                if (a != null) {
                    ((j)h).v(a);
                }
                l.g();
                ((j)h).w(l.e());
                final HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
                ((j)h).A(l.c());
                ((j)h).r(execute.getStatusLine().getStatusCode());
                final Long a2 = I4.j.a((HttpMessage)execute);
                if (a2 != null) {
                    ((j)h).y(a2);
                }
                final String b = I4.j.b(execute);
                if (b != null) {
                    ((j)h).x(b);
                }
                ((j)h).g();
                return execute;
                ((j)h).A(l.c());
                I4.j.d((j)h);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
}

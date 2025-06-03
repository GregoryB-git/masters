/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URL
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSocketFactory
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.network.impl;

import com.yandex.metrica.network.Call;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import com.yandex.metrica.network.impl.a;
import com.yandex.metrica.network.impl.b;
import com.yandex.metrica.network.impl.d;
import com.yandex.metrica.network.impl.e;
import java.io.Closeable;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

public final class c
implements Call {
    private final NetworkClient a;
    private final Request b;
    private final d c;

    public c(NetworkClient networkClient, Request request, d d3) {
        Intrinsics.checkNotNullParameter((Object)networkClient, (String)"client");
        Intrinsics.checkNotNullParameter((Object)request, (String)"request");
        Intrinsics.checkNotNullParameter((Object)d3, (String)"urlProvider");
        this.a = networkClient;
        this.b = request;
        this.c = d3;
    }

    private final void a(HttpsURLConnection httpsURLConnection) {
        for (Map.Entry entry : this.b.getHeaders().entrySet()) {
            httpsURLConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        Iterator iterator = this.a.getReadTimeout();
        if (iterator != null) {
            Intrinsics.checkNotNullExpressionValue((Object)iterator, (String)"it");
            httpsURLConnection.setReadTimeout(iterator.intValue());
        }
        if ((iterator = this.a.getConnectTimeout()) != null) {
            Intrinsics.checkNotNullExpressionValue((Object)iterator, (String)"it");
            httpsURLConnection.setConnectTimeout(iterator.intValue());
        }
        if ((iterator = this.a.getUseCaches()) != null) {
            Intrinsics.checkNotNullExpressionValue((Object)iterator, (String)"it");
            httpsURLConnection.setUseCaches(iterator.booleanValue());
        }
        if ((iterator = this.a.getInstanceFollowRedirects()) != null) {
            Intrinsics.checkNotNullExpressionValue((Object)iterator, (String)"it");
            httpsURLConnection.setInstanceFollowRedirects(iterator.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.b.getMethod());
        iterator = this.a.getSslSocketFactory();
        if (iterator != null) {
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory)iterator);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Response execute() {
        block24: {
            block22: {
                block23: {
                    var5_1 = this.c;
                    var4_2 = this.b.getUrl();
                    var5_1.getClass();
                    var5_1 = new URL((String)var4_2);
                    var4_2 = var5_1 = var5_1.openConnection();
                    if (!(var5_1 instanceof HttpsURLConnection)) {
                        var4_2 = null;
                    }
                    if ((var8_8 /* !! */  = (HttpsURLConnection)var4_2) == null) {
                        var4_2 = z2.t("Connection created for ");
                        var4_2.append(this.b.getUrl());
                        var4_2.append(" does not represent https connection");
                        return new Response((Throwable)new IllegalArgumentException(var4_2.toString()));
                    }
                    var5_1 = new byte[0];
                    this.a(var8_8 /* !! */ );
                    if (!Intrinsics.areEqual((Object)this.b.getMethod(), (Object)"POST")) ** GOTO lbl37
                    var8_8 /* !! */ .setDoOutput(true);
                    var7_9 /* !! */  = var8_8 /* !! */ .getOutputStream();
                    if (var7_9 /* !! */  == null) ** GOTO lbl37
                    var7_9 /* !! */ .write(this.b.getBody());
                    var7_9 /* !! */ .flush();
                    CloseableKt.closeFinally((Closeable)var7_9 /* !! */ , null);
                    ** GOTO lbl37
                    catch (Throwable var4_3) {
                        try {
                            throw var4_3;
                        }
                        catch (Throwable var6_11) {
                            CloseableKt.closeFinally((Closeable)var7_9 /* !! */ , (Throwable)var4_3);
                            throw var6_11;
lbl37:
                            // 3 sources

                            var1_14 = var8_8 /* !! */ .getResponseCode();
                            var7_9 /* !! */  = var8_8 /* !! */ .getHeaderFields();
                            var4_2 = var5_1;
                            var6_12 = e.a;
                            var4_2 = var5_1;
                            var2_15 = this.a.getMaxResponseSize();
                            var4_2 = var5_1;
                            var4_2 = var5_1;
                            var9_16 /* !! */  = new a(var8_8 /* !! */ );
                            var4_2 = var5_1;
                            var4_2 = var5_1 = (Object)var6_12.a(var2_15, var9_16 /* !! */ );
                            var2_15 = this.a.getMaxResponseSize();
                            var4_2 = var5_1;
                            var4_2 = var5_1;
                            var9_16 /* !! */  = new b(var8_8 /* !! */ );
                            var4_2 = var5_1;
                            var6_12 = var6_12.a(var2_15, var9_16 /* !! */ );
                            var8_8 /* !! */ .disconnect();
lbl58:
                            // 2 sources

                            while (true) {
                                var8_8 /* !! */  = null;
                                var3_17 = true;
                                var4_2 = var7_9 /* !! */ ;
                                var7_9 /* !! */  = var8_8 /* !! */ ;
                                return new Response(var3_17, var1_14, (byte[])var5_1, (byte[])var6_12, (Map)var4_2, (Throwable)var7_9 /* !! */ );
                            }
                            catch (Throwable var6_13) {
                                var5_1 = var4_2;
                                var4_2 = var7_9 /* !! */ ;
                                break block22;
                            }
                            catch (Throwable var4_4) {
                                break block23;
                            }
                            catch (Throwable var4_5) {
                                var1_14 = 0;
                            }
                        }
                    }
                }
                var7_9 /* !! */  = null;
                var6_12 = var4_2;
                var4_2 = var7_9 /* !! */ ;
            }
            try {}
            catch (Throwable var7_10) {}
            break block24;
lbl80:
            // 2 sources

            while (true) {
                var3_17 = false;
                var8_8 /* !! */  = (HttpsURLConnection)new byte[0];
                var7_9 /* !! */  = var6_12;
                var6_12 = var8_8 /* !! */ ;
                return new Response(var3_17, var1_14, (byte[])var5_1, (byte[])var6_12, (Map)var4_2, (Throwable)var7_9 /* !! */ );
            }
            catch (Throwable var4_7) {
                ** continue;
            }
            catch (Throwable var4_6) {
                return new Response(var4_6);
            }
        }
        var8_8 /* !! */ .disconnect();
        ** while (true)
    }
}


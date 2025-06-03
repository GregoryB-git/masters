/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e6.m;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1tSDK {
    @NotNull
    private static String valueOf;
    @NotNull
    private byte[] AFInAppEventParameterName;
    private Map<String, String> AFKeystoreWrapper;
    private final int values;

    static {
        new AFa1wSDK(0);
        valueOf = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    }

    public AFc1tSDK(@NotNull byte[] arrby, Map<String, String> map, int n8) {
        Intrinsics.checkNotNullParameter(arrby, "");
        this.AFInAppEventParameterName = arrby;
        this.AFKeystoreWrapper = map;
        this.values = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean AFInAppEventParameterName() {
        Throwable throwable5;
        long l8;
        Object object3;
        Iterator iterator;
        Object object2;
        block18 : {
            block17 : {
                block19 : {
                    block20 : {
                        Throwable throwable22;
                        block16 : {
                            l8 = System.currentTimeMillis();
                            object2 = null;
                            iterator = String.format((String)valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()});
                            Intrinsics.checkNotNullExpressionValue((Object)iterator, "");
                            Intrinsics.checkNotNullParameter((Object)iterator, "");
                            iterator = (URLConnection)FirebasePerfUrlConnection.instrument((Object)new URL((String)iterator).openConnection());
                            if (iterator == null) break block16;
                            iterator = (HttpURLConnection)iterator;
                            iterator.setRequestMethod("POST");
                            object2 = new StringBuilder();
                            object2.append(iterator.getRequestMethod());
                            object2.append(':');
                            object2.append((Object)iterator.getURL());
                            object2 = new StringBuilder(object2.toString());
                            object2.append("\n length: ");
                            object2.append(new String(this.AFInAppEventParameterName, b.b).length());
                            object3 = this.AFKeystoreWrapper;
                            if (object3 != null) {
                                for (Map.Entry entry : object3.entrySet()) {
                                    object2.append("\n ");
                                    object2.append((String)entry.getKey());
                                    object2.append(": ");
                                    object2.append((String)entry.getValue());
                                }
                            }
                            object3 = new StringBuilder("HTTP: [");
                            object3.append(iterator.hashCode());
                            object3.append("] ");
                            object3.append(object2);
                            object2 = object3.toString();
                            Intrinsics.checkNotNullParameter(object2, "");
                            AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf((Object)object2)));
                            iterator.setInstanceFollowRedirects(false);
                            iterator.setUseCaches(false);
                            iterator.setReadTimeout(this.values);
                            iterator.setConnectTimeout(this.values);
                            iterator.addRequestProperty("Content-Type", "application/json");
                            object2 = this.AFKeystoreWrapper;
                            if (object2 != null) {
                                for (Object object3 : object2.entrySet()) {
                                    iterator.addRequestProperty((String)object3.getKey(), (String)object3.getValue());
                                }
                            }
                            iterator.setDoOutput(true);
                            iterator.setRequestProperty("Content-Length", String.valueOf((int)this.AFInAppEventParameterName.length));
                            try {
                                object2 = iterator.getOutputStream();
                                Intrinsics.checkNotNullExpressionValue(object2, "");
                                object2 = object2 instanceof BufferedOutputStream ? (BufferedOutputStream)object2 : new BufferedOutputStream((OutputStream)object2, 8192);
                                object2.write(this.AFInAppEventParameterName);
                            }
                            catch (Throwable throwable22) {}
                            object2.close();
                            object2 = AFc1uSDK.AFa1wSDK.values((HttpURLConnection)iterator) ? iterator.getInputStream() : iterator.getErrorStream();
                            if (object2 == null) break block17;
                            Intrinsics.checkNotNullExpressionValue(object2, "");
                            object2 = new BufferedReader((Reader)new InputStreamReader((InputStream)object2, b.b), 8192);
                            object3 = W5.m.x((Iterable)m.e((Reader)object2), null, null, null, 0, null, null, 63, null);
                            object2.close();
                            object2 = object3;
                            if (object3 != null) break block18;
                            break block17;
                        }
                        try {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                        }
                        catch (Throwable throwable3) {}
                        break block20;
                        try {
                            throw throwable22;
                        }
                        catch (Throwable throwable4) {
                            object2 = iterator;
                            iterator = throwable4;
                        }
                    }
                    try {
                        long l9 = System.currentTimeMillis();
                        StringBuilder stringBuilder = new StringBuilder("error: ");
                        stringBuilder.append((Object)iterator);
                        stringBuilder.append("\n\ttook ");
                        stringBuilder.append(l9 - l8);
                        stringBuilder.append("ms\n\t");
                        stringBuilder.append(iterator.getMessage());
                        iterator = stringBuilder.toString();
                        stringBuilder = new StringBuilder("HTTP: [");
                        int n8 = object2 != null ? object2.hashCode() : 0;
                        stringBuilder.append(n8);
                        stringBuilder.append("] ");
                        stringBuilder.append((String)iterator);
                        iterator = stringBuilder.toString();
                        Intrinsics.checkNotNullParameter((Object)iterator, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf((Object)iterator)));
                        if (object2 == null) break block19;
                    }
                    catch (Throwable throwable5) {}
                    object2.disconnect();
                }
                return false;
            }
            object2 = "";
        }
        long l10 = System.currentTimeMillis();
        object3 = new StringBuilder("response code:");
        object3.append(iterator.getResponseCode());
        object3.append(' ');
        object3.append(iterator.getResponseMessage());
        object3.append("\n\tbody:");
        object3.append((String)object2);
        object3.append("\n\ttook ");
        object3.append(l10 - l8);
        object3.append("ms");
        object2 = object3.toString();
        object3 = new StringBuilder("HTTP: [");
        object3.append(iterator.hashCode());
        object3.append("] ");
        object3.append((String)object2);
        object2 = object3.toString();
        Intrinsics.checkNotNullParameter(object2, "");
        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf((Object)object2)));
        boolean bl = AFc1uSDK.AFa1wSDK.values((HttpURLConnection)iterator);
        iterator.disconnect();
        return bl;
        if (object2 != null) {
            object2.disconnect();
        }
        throw throwable5;
    }

    @Metadata
    public static final class AFa1wSDK {
        private AFa1wSDK() {
        }

        public /* synthetic */ AFa1wSDK(byte by) {
            this();
        }
    }

}


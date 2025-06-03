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
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AFc1lSDK {
    private final int AFInAppEventType;

    public AFc1lSDK(int n8) {
        this.AFInAppEventType = n8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @NonNull
    private static String AFKeystoreWrapper(HttpURLConnection var0, boolean var1_1) {
        block10 : {
            var3_2 = null;
            if (!var1_1) ** GOTO lbl6
            try {
                var0 = var0.getInputStream();
                break block10;
lbl6: // 1 sources:
                var0 = var0.getErrorStream();
            }
            catch (Throwable var5_6) {
                var4_7 = null;
                var0 = var3_2;
                var3_2 = var5_6;
                ** GOTO lbl36
            }
        }
        if (var0 == null) {
            return "";
        }
        var5_5 = new StringBuilder();
        var0 = new InputStreamReader((InputStream)var0, Charset.defaultCharset());
        var4_7 = new BufferedReader((Reader)var0);
        var2_8 = true;
        while ((var3_2 = var4_7.readLine()) != null) {
            if (!var2_8) {
                var5_5.append('\n');
            }
            var5_5.append((String)var3_2);
            var2_8 = false;
        }
        var3_2 = var5_5.toString();
        {
            catch (Throwable var3_4) {}
        }
        var0.close();
        var4_7.close();
        return var3_2;
        catch (Throwable var3_3) {
            var4_7 = null;
lbl36: // 3 sources:
            if (var0 != null) {
                var0.close();
            }
            if (var4_7 == null) throw var3_2;
            var4_7.close();
            throw var3_2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final AFc1gSDK<String> AFInAppEventParameterName(AFa1aSDK var1_1) {
        block29 : {
            block28 : {
                block32 : {
                    block30 : {
                        block27 : {
                            block26 : {
                                var4_8 = System.currentTimeMillis();
                                var10_9 = var1_1.valueOf();
                                var7_10 = new Iterator();
                                var7_10.append(var1_1.AFInAppEventParameterName);
                                var7_10.append(":");
                                var7_10.append(var1_1.valueOf);
                                var8_11 = new StringBuilder(var7_10.toString());
                                var7_10 = var1_1.valueOf();
                                var6_20 = var1_1.values();
                                if (!var6_20 || var7_10 == null) break block26;
                                var7_10 = var1_1.AFKeystoreWrapper() != false ? "<encrypted>" : new String((byte[])var7_10, Charset.defaultCharset());
                                var8_11.append("\n payload: ");
                                var8_11.append((String)var7_10);
                            }
                            var7_10 = var1_1.AFKeystoreWrapper.entrySet().iterator();
                            ** while (var6_20 = var7_10.hasNext())
lbl-1000: // 1 sources:
                            {
                                var9_21 = (Map.Entry)var7_10.next();
                                var8_11.append("\n ");
                                var8_11.append((String)var9_21.getKey());
                                var8_11.append(": ");
                                var8_11.append((String)var9_21.getValue());
                                continue;
                            }
lbl28: // 2 sources:
                            var7_10 = new StringBuilder("HTTP: [");
                            var7_10.append(var1_1.hashCode());
                            var7_10.append("] ");
                            var7_10.append(var8_11);
                            AFLogger.afDebugLog(var7_10.toString());
                            var7_10 = (HttpURLConnection)((URLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(var1_1.valueOf).openConnection()));
                            var7_10.setRequestMethod(var1_1.AFInAppEventParameterName);
                            if (var1_1.AFInAppEventParameterName()) {
                                var7_10.setUseCaches(false);
                            }
                            if (var1_1.afDebugLog()) break block27;
                            var7_10.setInstanceFollowRedirects(false);
                        }
                        var2_22 = this.AFInAppEventType;
                        var3_23 = var1_1.afDebugLog;
                        if (var3_23 != -1) {
                            var2_22 = var3_23;
                        }
                        var7_10.setConnectTimeout(var2_22);
                        var7_10.setReadTimeout(var2_22);
                        var8_11 = var1_1.AFKeystoreWrapper() != false ? "application/octet-stream" : "application/json";
                        var7_10.addRequestProperty("Content-Type", (String)var8_11);
                        for (AFc1kSDK var9_21 : var1_1.AFKeystoreWrapper.entrySet()) {
                            var7_10.setRequestProperty((String)var9_21.getKey(), (String)var9_21.getValue());
                        }
                        var6_20 = true;
                        if (var10_9 == null) ** GOTO lbl67
                        var7_10.setDoOutput(true);
                        var8_11 = new StringBuilder();
                        var8_11.append(var10_9.length);
                        var7_10.setRequestProperty("Content-Length", var8_11.toString());
                        var9_21 = new BufferedOutputStream(var7_10.getOutputStream());
                        try {
                            var9_21.write((byte[])var10_9);
                        }
                        catch (Throwable var8_18) {
                            break block32;
                        }
                        var9_21.close();
lbl67: // 2 sources:
                        if (var7_10.getResponseCode() / 100 != 2) break block28;
                        break block29;
                        catch (Throwable var1_2) {
                            var7_10 = null;
                            break block30;
                        }
                        catch (Exception var8_13) {
                            block31 : {
                                var7_10 = null;
                                break block31;
                                catch (Throwable var1_5) {
                                    var7_10 = null;
                                    break block30;
                                }
                                catch (Exception var8_15) {
                                    var7_10 = null;
                                    break block31;
                                }
                                catch (Throwable var1_6) {
                                    break block30;
                                }
                                catch (Exception var8_16) {
                                    break block31;
                                }
                                catch (Throwable var1_7) {
                                    break block30;
                                }
                                catch (Exception var8_17) {}
                            }
                            try {
                                var9_21 = new AFc1kSDK(System.currentTimeMillis() - var4_8);
                                var10_9 = new StringBuilder("error: ");
                                var10_9.append((Object)var8_14);
                                var10_9.append("\n took ");
                                var10_9.append(var9_21.AFKeystoreWrapper);
                                var10_9.append("ms");
                                var10_9 = var10_9.toString();
                                var11_25 = new StringBuilder("HTTP: [");
                                var11_25.append(var1_1.hashCode());
                                var11_25.append("] ");
                                var11_25.append((String)var10_9);
                                AFLogger.afErrorLog(var11_25.toString(), (Throwable)var8_14, false, false);
                                throw new HttpException((Throwable)var8_14, var9_21);
                            }
                            catch (Throwable var1_3) {
                                // empty catch block
                            }
                        }
                    }
                    if (var7_10 == null) throw var1_4;
                    var7_10.disconnect();
                    throw var1_4;
                    catch (Throwable var8_19) {
                        var9_21 = null;
                    }
                }
                if (var9_21 == null) throw var8_12;
                var9_21.close();
                throw var8_12;
            }
            var6_20 = false;
        }
        var8_11 = var1_1.AFInAppEventType() != false ? AFc1lSDK.AFKeystoreWrapper((HttpURLConnection)var7_10, var6_20) : "";
        var9_21 = new AFc1kSDK(System.currentTimeMillis() - var4_8);
        var10_9 = new StringBuilder("response code:");
        var10_9.append(var7_10.getResponseCode());
        var10_9.append(" ");
        var10_9.append(var7_10.getResponseMessage());
        var10_9.append("\n body:");
        var10_9.append((String)var8_11);
        var10_9.append("\n took ");
        var10_9.append(var9_21.AFKeystoreWrapper);
        var10_9.append("ms");
        var10_9 = var10_9.toString();
        var11_24 = new StringBuilder("HTTP: [");
        var11_24.append(var1_1.hashCode());
        var11_24.append("] ");
        var11_24.append((String)var10_9);
        AFLogger.afDebugLog(var11_24.toString());
        var10_9 = new HashMap(var7_10.getHeaderFields());
        var10_9.remove((Object)null);
        var8_11 = new AFc1gSDK<Object>(var8_11, var7_10.getResponseCode(), var6_20, (Map<String, List<String>>)var10_9, var9_21);
        var7_10.disconnect();
        return var8_11;
    }
}


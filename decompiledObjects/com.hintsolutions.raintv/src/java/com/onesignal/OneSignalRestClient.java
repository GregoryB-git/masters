/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  android.os.Build$VERSION
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$State
 *  java.lang.Throwable
 *  java.net.ConnectException
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.UnknownHostException
 *  java.util.Scanner
 *  org.json.JSONObject
 */
package com.onesignal;

import android.net.TrafficStats;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.JSONUtils;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import org.json.JSONObject;

class OneSignalRestClient {
    private static final String BASE_URL = "https://api.onesignal.com/";
    public static final String CACHE_KEY_GET_TAGS = "CACHE_KEY_GET_TAGS";
    public static final String CACHE_KEY_REMOTE_PARAMS = "CACHE_KEY_REMOTE_PARAMS";
    private static final int GET_TIMEOUT = 60000;
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private static final int TIMEOUT = 120000;

    private static Thread callResponseHandlerOnFailure(ResponseHandler responseHandler, int n, String string2, Throwable throwable) {
        if (responseHandler == null) {
            return null;
        }
        responseHandler = new Thread(new Runnable(responseHandler, n, string2, throwable){
            public final ResponseHandler val$handler;
            public final String val$response;
            public final int val$statusCode;
            public final Throwable val$throwable;
            {
                this.val$handler = responseHandler;
                this.val$statusCode = n;
                this.val$response = string2;
                this.val$throwable = throwable;
            }

            public void run() {
                this.val$handler.onFailure(this.val$statusCode, this.val$response, this.val$throwable);
            }
        }, "OS_REST_FAILURE_CALLBACK");
        OSUtils.startThreadWithRetry((Thread)responseHandler);
        return responseHandler;
    }

    private static Thread callResponseHandlerOnSuccess(ResponseHandler responseHandler, String string2) {
        if (responseHandler == null) {
            return null;
        }
        responseHandler = new Thread(new Runnable(responseHandler, string2){
            public final ResponseHandler val$handler;
            public final String val$response;
            {
                this.val$handler = responseHandler;
                this.val$response = string2;
            }

            public void run() {
                this.val$handler.onSuccess(this.val$response);
            }
        }, "OS_REST_SUCCESS_CALLBACK");
        OSUtils.startThreadWithRetry((Thread)responseHandler);
        return responseHandler;
    }

    public static void get(String string2, ResponseHandler responseHandler, @NonNull String string3) {
        OSUtils.startThreadWithRetry(new Thread(new Runnable(string2, responseHandler, string3){
            public final String val$cacheKey;
            public final ResponseHandler val$responseHandler;
            public final String val$url;
            {
                this.val$url = string2;
                this.val$responseHandler = responseHandler;
                this.val$cacheKey = string3;
            }

            public void run() {
                OneSignalRestClient.makeRequest(this.val$url, null, null, this.val$responseHandler, 60000, this.val$cacheKey);
            }
        }, "OS_REST_ASYNC_GET"));
    }

    public static void getSync(String string2, ResponseHandler responseHandler, @NonNull String string3) {
        OneSignalRestClient.makeRequest(string2, null, null, responseHandler, 60000, string3);
    }

    private static int getThreadTimeout(int n) {
        return n + 5000;
    }

    private static void makeRequest(String string2, String string3, JSONObject jSONObject, ResponseHandler responseHandler, int n, String string4) {
        block5: {
            block6: {
                Thread[] threadArray;
                block4: {
                    if (OSUtils.isRunningOnMainThread()) break block5;
                    if (string3 != null && OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName(null)) {
                        return;
                    }
                    threadArray = new Thread[1];
                    string2 = new Thread(new Runnable(threadArray, string2, string3, jSONObject, responseHandler, n, string4){
                        public final String val$cacheKey;
                        public final Thread[] val$callbackThread;
                        public final JSONObject val$jsonBody;
                        public final String val$method;
                        public final ResponseHandler val$responseHandler;
                        public final int val$timeout;
                        public final String val$url;
                        {
                            this.val$callbackThread = threadArray;
                            this.val$url = string2;
                            this.val$method = string3;
                            this.val$jsonBody = jSONObject;
                            this.val$responseHandler = responseHandler;
                            this.val$timeout = n;
                            this.val$cacheKey = string4;
                        }

                        public void run() {
                            this.val$callbackThread[0] = OneSignalRestClient.startHTTPConnection(this.val$url, this.val$method, this.val$jsonBody, this.val$responseHandler, this.val$timeout, this.val$cacheKey);
                        }
                    }, "OS_HTTPConnection");
                    OSUtils.startThreadWithRetry((Thread)string2);
                    string2.join((long)OneSignalRestClient.getThreadTimeout(n));
                    if (string2.getState() == Thread.State.TERMINATED) break block4;
                    string2.interrupt();
                }
                if ((string2 = threadArray[0]) == null) break block6;
                try {
                    string2.join();
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            return;
        }
        throw new OSThrowable.OSMainThreadException(z2.p("Method: ", string3, " was called from the Main Thread!"));
    }

    private static HttpURLConnection newHttpURLConnection(String string2) throws IOException {
        return (HttpURLConnection)new URL(z2.o(BASE_URL, string2)).openConnection();
    }

    public static void post(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OSUtils.startThreadWithRetry(new Thread(new Runnable(string2, jSONObject, responseHandler){
            public final JSONObject val$jsonBody;
            public final ResponseHandler val$responseHandler;
            public final String val$url;
            {
                this.val$url = string2;
                this.val$jsonBody = jSONObject;
                this.val$responseHandler = responseHandler;
            }

            public void run() {
                OneSignalRestClient.makeRequest(this.val$url, "POST", this.val$jsonBody, this.val$responseHandler, 120000, null);
            }
        }, "OS_REST_ASYNC_POST"));
    }

    public static void postSync(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OneSignalRestClient.makeRequest(string2, "POST", jSONObject, responseHandler, 120000, null);
    }

    public static void put(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OSUtils.startThreadWithRetry(new Thread(new Runnable(string2, jSONObject, responseHandler){
            public final JSONObject val$jsonBody;
            public final ResponseHandler val$responseHandler;
            public final String val$url;
            {
                this.val$url = string2;
                this.val$jsonBody = jSONObject;
                this.val$responseHandler = responseHandler;
            }

            public void run() {
                OneSignalRestClient.makeRequest(this.val$url, "PUT", this.val$jsonBody, this.val$responseHandler, 120000, null);
            }
        }, "OS_REST_ASYNC_PUT"));
    }

    public static void putSync(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OneSignalRestClient.makeRequest(string2, "PUT", jSONObject, responseHandler, 120000, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Thread startHTTPConnection(String var0, String var1_6, JSONObject var2_7, ResponseHandler var3_8, int var4_9, @Nullable String var5_10) {
        block113: {
            block114: {
                block111: {
                    block112: {
                        block106: {
                            block107: {
                                block110: {
                                    block108: {
                                        block105: {
                                            block104: {
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    TrafficStats.setThreadStatsTag((int)10000);
                                                }
                                                var7_11 = -1;
                                                var10_12 = OneSignal.LOG_LEVEL.DEBUG;
                                                var8_13 = new StringBuilder();
                                                var8_13.append("OneSignalRestClient: Making request to: https://api.onesignal.com/");
                                                var8_13.append(var0 /* !! */ );
                                                OneSignal.Log(var10_12, var8_13.toString());
                                                var8_13 = OneSignalRestClient.newHttpURLConnection(var0 /* !! */ );
                                                var6_14 = var7_11;
                                                var8_13.setUseCaches(false);
                                                var6_14 = var7_11;
                                                var8_13.setConnectTimeout(var4_9);
                                                var6_14 = var7_11;
                                                var8_13.setReadTimeout(var4_9);
                                                var6_14 = var7_11;
                                                var6_14 = var7_11;
                                                var9_15 /* !! */  = new StringBuilder();
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append("onesignal/android/");
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append(OneSignal.getSdkVersionRaw());
                                                var6_14 = var7_11;
                                                var8_13.setRequestProperty("SDK-Version", var9_15 /* !! */ .toString());
                                                var6_14 = var7_11;
                                                var8_13.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                                                if (var2_7 /* !! */  == null) break block104;
                                                var6_14 = var7_11;
                                                var8_13.setDoInput(true);
                                            }
                                            if (var1_6 /* !! */  != null) {
                                                var6_14 = var7_11;
                                                var8_13.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                                                var6_14 = var7_11;
                                                var8_13.setRequestMethod(var1_6 /* !! */ );
                                                var6_14 = var7_11;
                                                var8_13.setDoOutput(true);
                                            }
                                            if (var2_7 /* !! */  != null) {
                                                var6_14 = var7_11;
                                                var2_7 /* !! */  = JSONUtils.toUnescapedEUIDString(var2_7 /* !! */ );
                                                var6_14 = var7_11;
                                                var6_14 = var7_11;
                                                var9_15 /* !! */  = new StringBuilder();
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append("OneSignalRestClient: ");
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append(var1_6 /* !! */ );
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append(" SEND JSON: ");
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append((String)var2_7 /* !! */ );
                                                var6_14 = var7_11;
                                                OneSignal.Log(var10_12, var9_15 /* !! */ .toString());
                                                var6_14 = var7_11;
                                                var2_7 /* !! */  = (JSONObject)var2_7 /* !! */ .getBytes("UTF-8");
                                                var6_14 = var7_11;
                                                var8_13.setFixedLengthStreamingMode(((JSONObject)var2_7 /* !! */ ).length);
                                                var6_14 = var7_11;
                                                var8_13.getOutputStream().write((byte[])var2_7 /* !! */ );
                                            }
                                            if (var5_10 /* !! */  != null) {
                                                var6_14 = var7_11;
                                                var2_7 /* !! */  = OneSignalPrefs.PREFS_ONESIGNAL;
                                                var6_14 = var7_11;
                                                var6_14 = var7_11;
                                                var9_15 /* !! */  = new StringBuilder();
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append("PREFS_OS_ETAG_PREFIX_");
                                                var6_14 = var7_11;
                                                var9_15 /* !! */ .append(var5_10 /* !! */ );
                                                var6_14 = var7_11;
                                                var9_15 /* !! */  = OneSignalPrefs.getString((String)var2_7 /* !! */ , var9_15 /* !! */ .toString(), null);
                                                if (var9_15 /* !! */  == null) break block105;
                                                var6_14 = var7_11;
                                                var8_13.setRequestProperty("if-none-match", (String)var9_15 /* !! */ );
                                                var6_14 = var7_11;
                                                var6_14 = var7_11;
                                                var2_7 /* !! */  = new StringBuilder();
                                                var6_14 = var7_11;
                                                var2_7 /* !! */ .append("OneSignalRestClient: Adding header if-none-match: ");
                                                var6_14 = var7_11;
                                                var2_7 /* !! */ .append((String)var9_15 /* !! */ );
                                                var6_14 = var7_11;
                                                OneSignal.Log(var10_12, var2_7 /* !! */ .toString());
                                            }
                                        }
                                        var6_14 = var7_11;
                                        var4_9 = var8_13.getResponseCode();
                                        var2_7 /* !! */  = OneSignal.LOG_LEVEL.VERBOSE;
                                        var9_15 /* !! */  = new StringBuilder();
                                        var9_15 /* !! */ .append("OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/");
                                        var9_15 /* !! */ .append(var0 /* !! */ );
                                        OneSignal.Log((OneSignal.LOG_LEVEL)var2_7 /* !! */ , var9_15 /* !! */ .toString());
                                        var9_15 /* !! */  = "";
                                        var2_7 /* !! */  = "GET";
                                        if (var4_9 == 200 || var4_9 == 202) break block106;
                                        if (var4_9 == 304) break block107;
                                        var6_14 = var4_9;
                                        var6_14 = var4_9;
                                        var2_7 /* !! */  = new StringBuilder();
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append("OneSignalRestClient: Failed request to: https://api.onesignal.com/");
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append(var0 /* !! */ );
                                        var6_14 = var4_9;
                                        OneSignal.Log(var10_12, var2_7 /* !! */ .toString());
                                        var6_14 = var4_9;
                                        var2_7 /* !! */  = var8_13.getErrorStream();
                                        var0 /* !! */  = var2_7 /* !! */ ;
                                        if (var2_7 /* !! */  != null) break block108;
                                        var6_14 = var4_9;
                                        var0 /* !! */  = var8_13.getInputStream();
                                    }
                                    if (var0 /* !! */  != null) {
                                        block109: {
                                            var6_14 = var4_9;
                                            var6_14 = var4_9;
                                            var2_7 /* !! */  = new Scanner((InputStream)var0 /* !! */ , "UTF-8");
                                            var0 /* !! */  = var9_15 /* !! */ ;
                                            var6_14 = var4_9;
                                            if (!var2_7 /* !! */ .useDelimiter("\\A").hasNext()) break block109;
                                            var6_14 = var4_9;
                                            var0 /* !! */  = var2_7 /* !! */ .next();
                                        }
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .close();
                                        var6_14 = var4_9;
                                        var5_10 /* !! */  = OneSignal.LOG_LEVEL.WARN;
                                        var6_14 = var4_9;
                                        var6_14 = var4_9;
                                        var2_7 /* !! */  = new StringBuilder();
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append("OneSignalRestClient: ");
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append(var1_6 /* !! */ );
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append(" RECEIVED JSON: ");
                                        var6_14 = var4_9;
                                        var2_7 /* !! */ .append(var0 /* !! */ );
                                        var6_14 = var4_9;
                                        OneSignal.Log((OneSignal.LOG_LEVEL)var5_10 /* !! */ , var2_7 /* !! */ .toString());
                                        break block110;
                                    }
                                    var6_14 = var4_9;
                                    var0 /* !! */  = OneSignal.LOG_LEVEL.WARN;
                                    var6_14 = var4_9;
                                    var6_14 = var4_9;
                                    var2_7 /* !! */  = new StringBuilder();
                                    var6_14 = var4_9;
                                    var2_7 /* !! */ .append("OneSignalRestClient: ");
                                    var6_14 = var4_9;
                                    var2_7 /* !! */ .append(var1_6 /* !! */ );
                                    var6_14 = var4_9;
                                    var2_7 /* !! */ .append(" HTTP Code: ");
                                    var6_14 = var4_9;
                                    var2_7 /* !! */ .append(var4_9);
                                    var6_14 = var4_9;
                                    var2_7 /* !! */ .append(" No response body!");
                                    var6_14 = var4_9;
                                    OneSignal.Log((OneSignal.LOG_LEVEL)var0 /* !! */ , var2_7 /* !! */ .toString());
                                    var0 /* !! */  = null;
                                }
                                var6_14 = var4_9;
                                var0 /* !! */  = OneSignalRestClient.callResponseHandlerOnFailure(var3_8, var4_9, var0 /* !! */ , null);
                                var2_7 /* !! */  = var8_13;
                                break block111;
                            }
                            var6_14 = var4_9;
                            var0 /* !! */  = OneSignalPrefs.PREFS_ONESIGNAL;
                            var6_14 = var4_9;
                            var6_14 = var4_9;
                            var9_15 /* !! */  = new StringBuilder();
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append("PREFS_OS_HTTP_CACHE_PREFIX_");
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append(var5_10 /* !! */ );
                            var6_14 = var4_9;
                            var5_10 /* !! */  = OneSignalPrefs.getString(var0 /* !! */ , var9_15 /* !! */ .toString(), null);
                            var6_14 = var4_9;
                            var6_14 = var4_9;
                            var9_15 /* !! */  = new StringBuilder();
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append("OneSignalRestClient: ");
                            var0 /* !! */  = var1_6 /* !! */  == null ? var2_7 /* !! */  : var1_6 /* !! */ ;
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append(var0 /* !! */ );
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append(" - Using Cached response due to 304: ");
                            var6_14 = var4_9;
                            var9_15 /* !! */ .append(var5_10 /* !! */ );
                            var6_14 = var4_9;
                            OneSignal.Log(var10_12, var9_15 /* !! */ .toString());
                            var6_14 = var4_9;
                            var0 /* !! */  = OneSignalRestClient.callResponseHandlerOnSuccess(var3_8, var5_10 /* !! */ );
                            var2_7 /* !! */  = var8_13;
                            break block111;
                        }
                        var11_16 = new StringBuilder();
                        var11_16.append("OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/");
                        var11_16.append(var0 /* !! */ );
                        OneSignal.Log(var10_12, var11_16.toString());
                        var11_16 = var8_13.getInputStream();
                        var0 /* !! */  = new Scanner((InputStream)var11_16, "UTF-8");
                        if (var0 /* !! */ .useDelimiter("\\A").hasNext()) {
                            var9_15 /* !! */  = var0 /* !! */ .next();
                        }
                        var0 /* !! */ .close();
                        var0 /* !! */  = new StringBuilder();
                        var0 /* !! */ .append("OneSignalRestClient: ");
                        if (var1_6 /* !! */  == null) break block112;
                        var2_7 /* !! */  = var1_6 /* !! */ ;
                    }
                    var0 /* !! */ .append((String)var2_7 /* !! */ );
                    var0 /* !! */ .append(" RECEIVED JSON: ");
                    var0 /* !! */ .append((String)var9_15 /* !! */ );
                    OneSignal.Log(var10_12, var0 /* !! */ .toString());
                    if (var5_10 /* !! */  == null) ** GOTO lbl351
                    var0 /* !! */  = var8_13.getHeaderField("etag");
                    if (var0 /* !! */  == null) ** GOTO lbl351
                    try {
                        var2_7 /* !! */  = new StringBuilder();
                        var2_7 /* !! */ .append("OneSignalRestClient: Response has etag of ");
                        var2_7 /* !! */ .append(var0 /* !! */ );
                        var2_7 /* !! */ .append(" so caching the response.");
                        OneSignal.Log(var10_12, var2_7 /* !! */ .toString());
                        var2_7 /* !! */  = OneSignalPrefs.PREFS_ONESIGNAL;
                        var10_12 = new StringBuilder();
                        var10_12.append("PREFS_OS_ETAG_PREFIX_");
                        var10_12.append(var5_10 /* !! */ );
                        OneSignalPrefs.saveString((String)var2_7 /* !! */ , var10_12.toString(), var0 /* !! */ );
                        var0 /* !! */  = new StringBuilder();
                        var0 /* !! */ .append("PREFS_OS_HTTP_CACHE_PREFIX_");
                        var0 /* !! */ .append(var5_10 /* !! */ );
                        OneSignalPrefs.saveString((String)var2_7 /* !! */ , var0 /* !! */ .toString(), (String)var9_15 /* !! */ );
lbl351:
                        // 3 sources

                        var0 /* !! */  = OneSignalRestClient.callResponseHandlerOnSuccess(var3_8, (String)var9_15 /* !! */ );
                        var2_7 /* !! */  = var8_13;
                    }
                    catch (Throwable var0_1) {
                        var2_7 /* !! */  = var8_13;
                    }
                }
                while (true) {
                    var2_7 /* !! */ .disconnect();
                    var1_6 /* !! */  = var0 /* !! */ ;
                    break block113;
                    break;
                }
                break block114;
                catch (Throwable var0_2) {
                    var2_7 /* !! */  = var8_13;
                }
                break block114;
                catch (Throwable var0_3) {
                    var4_9 = var6_14;
                    var2_7 /* !! */  = var8_13;
                }
                break block114;
                catch (Throwable var0_4) {
                    var2_7 /* !! */  = null;
                    var4_9 = var7_11;
                }
            }
            try {
                if (!(var0 /* !! */  instanceof ConnectException) && !(var0 /* !! */  instanceof UnknownHostException)) {
                    var5_10 /* !! */  = OneSignal.LOG_LEVEL.WARN;
                    var8_13 = new StringBuilder();
                    var8_13.append("OneSignalRestClient: ");
                    var8_13.append(var1_6 /* !! */ );
                    var8_13.append(" Error thrown from network stack. ");
                    OneSignal.Log((OneSignal.LOG_LEVEL)var5_10 /* !! */ , var8_13.toString(), (Throwable)var0 /* !! */ );
                } else {
                    var1_6 /* !! */  = OneSignal.LOG_LEVEL.INFO;
                    var5_10 /* !! */  = new StringBuilder();
                    var5_10 /* !! */ .append("OneSignalRestClient: Could not send last request, device is offline. Throwable: ");
                    var5_10 /* !! */ .append(var0 /* !! */ .getClass().getName());
                    OneSignal.Log((OneSignal.LOG_LEVEL)var1_6 /* !! */ , var5_10 /* !! */ .toString());
                }
                var1_6 /* !! */  = var0 /* !! */  = OneSignalRestClient.callResponseHandlerOnFailure(var3_8, var4_9, null, (Throwable)var0 /* !! */ );
                if (var2_7 /* !! */  != null) ** continue;
            }
            catch (Throwable var0_5) {
                if (var2_7 /* !! */  != null) {
                    var2_7 /* !! */ .disconnect();
                }
                throw var0_5;
            }
        }
        return var1_6 /* !! */ ;
    }

    public static abstract class ResponseHandler {
        public void onFailure(int n, String string2, Throwable throwable) {
        }

        public void onSuccess(String string2) {
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.vk.sdk.api.VKRequest
 *  com.vk.sdk.api.httpClient.VKHttpOperation
 *  com.vk.sdk.api.model.VKAttachments
 *  java.io.BufferedWriter
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.UnsupportedEncodingException
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.zip.GZIPInputStream
 */
package com.vk.sdk.api.httpClient;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpOperation;
import com.vk.sdk.api.httpClient.VKMultipartEntity;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.util.VKUtil;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;

public class VKHttpClient {
    private static final ExecutorService mBackgroundExecutor = Executors.newFixedThreadPool((int)3);
    private static final ExecutorService mResponseService = Executors.newSingleThreadExecutor();
    public static final String sDefaultStringEncoding = "UTF-8";

    public static void cancelHttpOperation(VKHttpOperation vKHttpOperation) {
        mBackgroundExecutor.execute(new Runnable(vKHttpOperation){
            public final VKHttpOperation val$operation;
            {
                this.val$operation = vKHttpOperation;
            }

            public void run() {
                this.val$operation.getUriRequest().abort();
            }
        });
    }

    public static VKHTTPRequest docUploadRequest(@NonNull String object, File file) {
        object = new VKHTTPRequest((String)object);
        ((VKHTTPRequest)object).entity = new VKMultipartEntity(new File[]{file}, "doc");
        return object;
    }

    public static void enqueueOperation(VKAbstractOperation vKAbstractOperation) {
        mBackgroundExecutor.execute(new Runnable(vKAbstractOperation){
            public final VKAbstractOperation val$operation;
            {
                this.val$operation = vKAbstractOperation;
            }

            public void run() {
                this.val$operation.start(mResponseService);
            }
        });
    }

    public static VKHttpResponse execute(VKHTTPRequest vKHTTPRequest) throws IOException {
        VKHttpResponse vKHttpResponse = new VKHttpResponse(vKHTTPRequest.createConnection(), null);
        if (vKHTTPRequest.isAborted) {
            return null;
        }
        return vKHttpResponse;
    }

    public static VKHTTPRequest fileUploadRequest(@NonNull String object, File ... fileArray) {
        object = new VKHTTPRequest((String)object);
        ((VKHTTPRequest)object).entity = new VKMultipartEntity(fileArray);
        return object;
    }

    private static Map<String, String> getDefaultHeaders() {
        return new HashMap<String, String>(){
            private static final long serialVersionUID = 200199014417610665L;
            {
                this.put("Accept-Encoding", "gzip");
            }
        };
    }

    public static VKHTTPRequest requestWithVkRequest(@NonNull VKRequest vKRequest) {
        Object object = VKAccessToken.currentToken();
        Locale locale = Locale.US;
        object = !(vKRequest.secure || object != null && ((VKAccessToken)object).httpsRequired) ? "" : "s";
        object = new VKHTTPRequest(String.format((Locale)locale, (String)"http%s://api.vk.com/method/%s", (Object[])new Object[]{object, vKRequest.methodName}));
        ((VKHTTPRequest)object).headers = VKHttpClient.getDefaultHeaders();
        ((VKHTTPRequest)object).setVkParameters(vKRequest.getPreparedParameters());
        return object;
    }

    public static class VKHTTPRequest {
        public HttpURLConnection connection;
        public VKMultipartEntity entity = null;
        public Map<String, String> headers = null;
        public boolean isAborted = false;
        public URL methodUrl = null;
        public List<Pair<String, String>> parameters = null;
        public int timeout = 20000;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public VKHTTPRequest(@Nullable String string2) {
            if (string2 == null) return;
            try {
                URL uRL;
                this.methodUrl = uRL = new URL(string2);
                return;
            }
            catch (MalformedURLException malformedURLException) {
                return;
            }
        }

        public void abort() {
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.isAborted = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public HttpURLConnection createConnection() throws IOException {
            PackageManager packageManager;
            Pair<String, String> pair2 = (Pair<String, String>)this.methodUrl.openConnection();
            this.connection = pair2;
            pair2.setReadTimeout(this.timeout);
            this.connection.setConnectTimeout(this.timeout + 5000);
            this.connection.setRequestMethod("POST");
            this.connection.setUseCaches(false);
            this.connection.setDoInput(true);
            this.connection.setDoOutput(true);
            try {
                pair2 = VKUIHelper.getApplicationContext();
                if (pair2 != null && (packageManager = pair2.getPackageManager()) != null) {
                    packageManager = packageManager.getPackageInfo(pair2.getPackageName(), 0);
                    this.connection.setRequestProperty("User-Agent", String.format((Locale)Locale.US, (String)"%s/%s (%s; Android %d; Scale/%.2f; VK SDK %s; %s)", (Object[])new Object[]{VKUtil.getApplicationName((Context)pair2), packageManager.versionName, Build.MODEL, Build.VERSION.SDK_INT, Float.valueOf((float)pair2.getResources().getDisplayMetrics().density), "1.6.8", packageManager.packageName}));
                }
            }
            catch (Exception exception) {}
            this.connection.setRequestProperty("Connection", "Keep-Alive");
            pair2 = this.headers;
            if (pair2 != null) {
                for (Pair<String, String> pair2 : pair2.entrySet()) {
                    this.connection.addRequestProperty((String)pair2.getKey(), (String)pair2.getValue());
                }
            }
            if (this.entity != null) {
                packageManager = this.connection;
                pair2 = new StringBuilder();
                pair2.append(this.entity.getContentLength());
                pair2.append("");
                packageManager.addRequestProperty("Content-length", pair2.toString());
                pair2 = this.entity.getContentType();
                this.connection.addRequestProperty((String)pair2.first, (String)pair2.second);
            }
            pair2 = this.connection.getOutputStream();
            this.writeParams((OutputStream)pair2);
            pair2.close();
            this.connection.connect();
            return this.connection;
        }

        public String getQuery() throws UnsupportedEncodingException {
            if (this.parameters == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.parameters.size());
            for (Pair pair : this.parameters) {
                Object object = pair.first;
                if (object == null || pair.second == null) continue;
                arrayList.add((Object)String.format((String)"%s=%s", (Object[])new Object[]{URLEncoder.encode((String)((String)object), (String)VKHttpClient.sDefaultStringEncoding), URLEncoder.encode((String)((String)pair.second), (String)VKHttpClient.sDefaultStringEncoding)}));
            }
            return TextUtils.join((CharSequence)"&", (Iterable)arrayList);
        }

        public void setVkParameters(VKParameters object2) {
            ArrayList arrayList = new ArrayList(object2.size());
            for (Object object2 : object2.entrySet()) {
                Object object3;
                Object object4 = object2.getValue();
                if (object4 instanceof VKAttachments) {
                    arrayList.add((Object)new Pair(object2.getKey(), (Object)((VKAttachments)object4).toAttachmentsString()));
                    continue;
                }
                if (object4 instanceof Collection) {
                    object3 = (Collection)object4;
                    arrayList.add((Object)new Pair(object2.getKey(), (Object)TextUtils.join((CharSequence)",", (Iterable)object3)));
                    continue;
                }
                object3 = object2.getKey();
                object2 = object4 == null ? null : String.valueOf((Object)object4);
                arrayList.add((Object)new Pair(object3, object2));
            }
            this.parameters = arrayList;
        }

        public void writeParams(@NonNull OutputStream outputStream) throws IOException {
            Object object = this.entity;
            if (object != null) {
                ((VKMultipartEntity)object).writeTo(outputStream);
            } else {
                object = this.getQuery();
                if (object != null && object.length() > 0) {
                    outputStream = new BufferedWriter((Writer)new OutputStreamWriter(outputStream, VKHttpClient.sDefaultStringEncoding));
                    outputStream.write((String)object);
                    outputStream.flush();
                    outputStream.close();
                }
            }
        }
    }

    public static interface VKHttpProgressCallback {
        public void onProgress(long var1, long var3);
    }

    public static class VKHttpResponse {
        public final long contentLength;
        public final byte[] responseBytes;
        public Map<String, String> responseHeaders = null;
        public final int statusCode;

        public VKHttpResponse(HttpURLConnection httpURLConnection, VKHttpProgressCallback vKHttpProgressCallback) throws IOException {
            int n;
            long l2;
            Object object2;
            this.statusCode = httpURLConnection.getResponseCode();
            this.contentLength = httpURLConnection.getContentLength();
            if (httpURLConnection.getHeaderFields() != null) {
                this.responseHeaders = new HashMap();
                for (Object object2 : httpURLConnection.getHeaderFields().entrySet()) {
                    this.responseHeaders.put(object2.getKey(), (Object)TextUtils.join((CharSequence)",", (Iterable)((Iterable)object2.getValue())));
                }
            }
            Object object3 = httpURLConnection.getInputStream();
            object2 = this.responseHeaders;
            httpURLConnection = object3;
            if (object2 != null) {
                object2 = (String)object2.get((Object)"Content-Encoding");
                httpURLConnection = object3;
                if (object2 != null) {
                    httpURLConnection = object3;
                    if (object2.equalsIgnoreCase("gzip")) {
                        httpURLConnection = new GZIPInputStream(object3);
                    }
                }
            }
            object2 = new ByteArrayOutputStream();
            object3 = new byte[1024];
            long l3 = this.contentLength;
            long l4 = l2 = 0L;
            if (l3 <= 0L) {
                vKHttpProgressCallback = null;
                l4 = l2;
            }
            while ((n = httpURLConnection.read((byte[])object3)) != -1) {
                object2.write((byte[])object3, 0, n);
                l4 = l2 = l4 + (long)n;
                if (vKHttpProgressCallback == null) continue;
                vKHttpProgressCallback.onProgress(l2, this.contentLength);
                l4 = l2;
            }
            httpURLConnection.close();
            object2.flush();
            this.responseBytes = object2.toByteArray();
            object2.close();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicReference
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 *  retrofit2.Response
 *  retrofit2.Retrofit$Builder
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.network.OAuth1aInterceptor;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import com.twitter.sdk.android.core.internal.scribe.FilesSender;
import com.twitter.sdk.android.core.internal.scribe.QueueFile;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

class ScribeFilesSender
implements FilesSender {
    private static final byte[] COMMA;
    private static final byte[] END_JSON_ARRAY;
    private static final String SEND_FILE_FAILURE_ERROR = "Failed sending files";
    private static final byte[] START_JSON_ARRAY;
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private final ExecutorService executorService;
    private final GuestSessionProvider guestSessionProvider;
    private final IdManager idManager;
    private final long ownerId;
    private final ScribeConfig scribeConfig;
    private final AtomicReference<ScribeService> scribeService;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;

    static {
        START_JSON_ARRAY = new byte[]{91};
        COMMA = new byte[]{44};
        END_JSON_ARRAY = new byte[]{93};
    }

    public ScribeFilesSender(Context context, ScribeConfig scribeConfig, long l, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, ExecutorService executorService, IdManager idManager) {
        this.context = context;
        this.scribeConfig = scribeConfig;
        this.ownerId = l;
        this.authConfig = twitterAuthConfig;
        this.sessionManager = sessionManager;
        this.guestSessionProvider = guestSessionProvider;
        this.executorService = executorService;
        this.idManager = idManager;
        this.scribeService = new AtomicReference();
    }

    private Session getSession(long l) {
        return this.sessionManager.getSession(l);
    }

    private boolean hasApiAdapter() {
        boolean bl = this.getScribeService() != null;
        return bl;
    }

    private boolean isValidSession(Session session) {
        boolean bl = session != null && session.getAuthToken() != null;
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getScribeEventsAsJsonArrayString(List<File> iterator) throws IOException {
        void var1_4;
        QueueFile.ElementReader elementReader;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        boolean[] blArray = new boolean[1];
        byteArrayOutputStream.write(START_JSON_ARRAY);
        iterator = iterator.iterator();
        while (true) {
            QueueFile queueFile;
            if (!iterator.hasNext()) {
                byteArrayOutputStream.write(END_JSON_ARRAY);
                return byteArrayOutputStream.toString("UTF-8");
            }
            File file = (File)iterator.next();
            elementReader = null;
            try {
                queueFile = new QueueFile(file);
            }
            catch (Throwable throwable) {
                // empty catch block
                break;
            }
            try {
                elementReader = new QueueFile.ElementReader(this, blArray, byteArrayOutputStream){
                    public final ScribeFilesSender this$0;
                    public final boolean[] val$appendComma;
                    public final ByteArrayOutputStream val$out;
                    {
                        this.this$0 = scribeFilesSender;
                        this.val$appendComma = blArray;
                        this.val$out = byteArrayOutputStream;
                    }

                    @Override
                    public void read(InputStream object, int n) throws IOException {
                        byte[] byArray = new byte[n];
                        object.read(byArray);
                        object = this.val$appendComma;
                        if (object[0] != false) {
                            this.val$out.write(COMMA);
                        } else {
                            object[0] = (InputStream)true;
                        }
                        this.val$out.write(byArray);
                    }
                };
                queueFile.forEach(elementReader);
            }
            catch (Throwable throwable) {
                elementReader = queueFile;
                break;
            }
            CommonUtils.closeQuietly(queueFile);
        }
        CommonUtils.closeQuietly(elementReader);
        throw var1_4;
    }

    public ScribeService getScribeService() {
        ScribeFilesSender scribeFilesSender = this;
        synchronized (scribeFilesSender) {
            Object object;
            if (this.scribeService.get() == null) {
                Object object2;
                object = this.getSession(this.ownerId);
                if (this.isValidSession((Session)object)) {
                    object2 = new OkHttpClient.Builder();
                    object2 = object2.certificatePinner(OkHttpClientHelper.getCertificatePinner());
                    ConfigRequestInterceptor configRequestInterceptor = new ConfigRequestInterceptor(this.scribeConfig, this.idManager);
                    configRequestInterceptor = object2.addInterceptor((Interceptor)configRequestInterceptor);
                    object2 = new OAuth1aInterceptor((Session<? extends TwitterAuthToken>)object, this.authConfig);
                    object = configRequestInterceptor.addInterceptor((Interceptor)object2).build();
                } else {
                    object = new Object();
                    object2 = object.certificatePinner(OkHttpClientHelper.getCertificatePinner());
                    object = new Object(this.scribeConfig, this.idManager);
                    object2 = object2.addInterceptor((Interceptor)object);
                    object = new Object(this.guestSessionProvider);
                    object = object2.addInterceptor((Interceptor)object).build();
                }
                object2 = new Retrofit.Builder();
                object2 = object2.baseUrl(this.scribeConfig.baseUrl).client((OkHttpClient)object).build();
                object = this.scribeService;
                object2 = object2.create(ScribeService.class);
                while (!object.compareAndSet(null, object2) && object.get() == null) {
                }
            }
            object = this.scribeService.get();
            return object;
        }
    }

    @Override
    public boolean send(List<File> object) {
        if (this.hasApiAdapter()) {
            block6: {
                object = this.getScribeEventsAsJsonArrayString((List<File>)object);
                CommonUtils.logControlled(this.context, object);
                object = this.upload((String)object);
                if (object.code() != 200) break block6;
                return true;
            }
            try {
                int n;
                CommonUtils.logControlledError(this.context, SEND_FILE_FAILURE_ERROR, null);
                if (object.code() == 500 || (n = object.code()) == 400) {
                    return true;
                }
            }
            catch (Exception exception) {
                CommonUtils.logControlledError(this.context, SEND_FILE_FAILURE_ERROR, exception);
            }
        } else {
            CommonUtils.logControlled(this.context, "Cannot attempt upload at this time");
        }
        return false;
    }

    public void setScribeService(ScribeService scribeService) {
        this.scribeService.set((Object)scribeService);
    }

    public retrofit2.Response<ResponseBody> upload(String string2) throws IOException {
        ScribeService scribeService = this.getScribeService();
        if (!TextUtils.isEmpty((CharSequence)this.scribeConfig.sequence)) {
            return scribeService.uploadSequence(this.scribeConfig.sequence, string2).execute();
        }
        ScribeConfig scribeConfig = this.scribeConfig;
        return scribeService.upload(scribeConfig.pathVersion, scribeConfig.pathType, string2).execute();
    }

    public static class ConfigRequestInterceptor
    implements Interceptor {
        private static final String CLIENT_UUID_HEADER = "X-Client-UUID";
        private static final String POLLING_HEADER = "X-Twitter-Polling";
        private static final String POLLING_HEADER_VALUE = "true";
        private static final String USER_AGENT_HEADER = "User-Agent";
        private final IdManager idManager;
        private final ScribeConfig scribeConfig;

        public ConfigRequestInterceptor(ScribeConfig scribeConfig, IdManager idManager) {
            this.scribeConfig = scribeConfig;
            this.idManager = idManager;
        }

        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request.Builder builder = chain.request().newBuilder();
            if (!TextUtils.isEmpty((CharSequence)this.scribeConfig.userAgent)) {
                builder.header(USER_AGENT_HEADER, this.scribeConfig.userAgent);
            }
            if (!TextUtils.isEmpty((CharSequence)this.idManager.getDeviceUUID())) {
                builder.header(CLIENT_UUID_HEADER, this.idManager.getDeviceUUID());
            }
            builder.header(POLLING_HEADER, POLLING_HEADER_VALUE);
            return chain.proceed(builder.build());
        }
    }
}


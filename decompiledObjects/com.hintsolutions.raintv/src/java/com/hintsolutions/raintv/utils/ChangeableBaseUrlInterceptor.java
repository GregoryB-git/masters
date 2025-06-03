/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.webkit.WebView
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$getAltDomain$1
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$getHost$1
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$intercept$host$1
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$retrieveDomainName$2$1
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$setupWebView$2$1
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor$updateHost$1
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  javax.inject.Singleton
 *  kotlin.Metadata
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.coroutines.SafeContinuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.DebugProbesKt
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.CoroutineScopeKt
 *  kotlinx.coroutines.Dispatchers
 *  kotlinx.coroutines.sync.Semaphore
 *  kotlinx.coroutines.sync.SemaphoreKt
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.OkHttpClient
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONObject
 *  tvrain.analytics.tagmanager.TagManager
 */
package com.hintsolutions.raintv.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tvrain.analytics.tagmanager.TagManager;

@Singleton
@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0011\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J#\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0011\u0010%\u001a\u00020\u001cH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010&\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006'"}, d2={"Lcom/hintsolutions/raintv/utils/ChangeableBaseUrlInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "userAgentHeader", "", "acceptHeader", "deviceUid", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "defaultDomain", "host", "hostSemaphore", "Lkotlinx/coroutines/sync/Semaphore;", "tagManager", "Ltvrain/analytics/tagmanager/TagManager;", "webView", "Landroid/webkit/WebView;", "getAltDomain", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHost", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isUrlReachable", "", "url", "logConnectionError", "", "errorCode", "errorMessage", "retrieveDomainName", "publicKey", "privateKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePublicKey", "srcUrl", "setupWebView", "updateHost", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ChangeableBaseUrlInterceptor
implements Interceptor {
    @NotNull
    private final String acceptHeader;
    @NotNull
    private final Context context;
    @NotNull
    private final String defaultDomain;
    @NotNull
    private final String deviceUid;
    @Nullable
    private String host;
    @NotNull
    private final Semaphore hostSemaphore;
    @NotNull
    private TagManager tagManager;
    @NotNull
    private final String userAgentHeader;
    private WebView webView;

    public ChangeableBaseUrlInterceptor(@NotNull Context object, @NotNull String string, @NotNull String string2, @NotNull String string3) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"context");
        Intrinsics.checkNotNullParameter((Object)string, (String)"userAgentHeader");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"acceptHeader");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"deviceUid");
        this.context = object;
        this.userAgentHeader = string;
        this.acceptHeader = string2;
        this.deviceUid = string3;
        this.tagManager = new TagManager(object, null, null);
        object = object.getString(2131755530);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"context.getString(R.stri\u2026rain_api_endpoint_domain)");
        this.defaultDomain = object;
        this.hostSemaphore = SemaphoreKt.Semaphore$default((int)1, (int)0, (int)2, null);
    }

    public static final /* synthetic */ Object access$getAltDomain(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, Continuation continuation) {
        return changeableBaseUrlInterceptor.getAltDomain((Continuation<? super String>)continuation);
    }

    public static final /* synthetic */ Context access$getContext$p(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor) {
        return changeableBaseUrlInterceptor.context;
    }

    public static final /* synthetic */ Object access$getHost(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, Continuation continuation) {
        return changeableBaseUrlInterceptor.getHost((Continuation<? super String>)continuation);
    }

    public static final /* synthetic */ WebView access$getWebView$p(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor) {
        return changeableBaseUrlInterceptor.webView;
    }

    public static final /* synthetic */ Object access$retrieveDomainName(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, String string, String string2, Continuation continuation) {
        return changeableBaseUrlInterceptor.retrieveDomainName(string, string2, (Continuation<? super String>)continuation);
    }

    public static final /* synthetic */ void access$setWebView$p(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, WebView webView) {
        changeableBaseUrlInterceptor.webView = webView;
    }

    public static final /* synthetic */ Object access$setupWebView(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, Continuation continuation) {
        return changeableBaseUrlInterceptor.setupWebView((Continuation<? super Unit>)continuation);
    }

    public static final /* synthetic */ Object access$updateHost(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, Continuation continuation) {
        return changeableBaseUrlInterceptor.updateHost((Continuation<? super Unit>)continuation);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Object getAltDomain(Continuation<? super String> var1_1) {
        block6: {
            block7: {
                if (!(var1_1 /* !! */  instanceof getAltDomain.1)) ** GOTO lbl-1000
                var3_2 /* !! */  = var1_1 /* !! */ ;
                var2_3 = var3_2 /* !! */ .label;
                if ((var2_3 & -2147483648) != 0) {
                    var3_2 /* !! */ .label = var2_3 + -2147483648;
                    var1_1 /* !! */  = var3_2 /* !! */ ;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = new getAltDomain.1(this, var1_1 /* !! */ );
                }
                var3_2 /* !! */  = var1_1 /* !! */ .result;
                var5_4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                var2_3 = var1_1 /* !! */ .label;
                var4_5 = null;
                if (var2_3 == 0) break block6;
                if (var2_3 != 1) break block7;
                var1_1 /* !! */  = (ChangeableBaseUrlInterceptor)var1_1 /* !! */ .L$0;
                ResultKt.throwOnFailure((Object)var3_2 /* !! */ );
                ** GOTO lbl29
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure((Object)var3_2 /* !! */ );
        var3_2 /* !! */  = this.retrievePublicKey("https://raw.githubusercontent.com/digital-lab307/digital-app/main/digital.json");
        if (var3_2 /* !! */  != null) {
            var1_1 /* !! */ .L$0 = this;
            var1_1 /* !! */ .label = 1;
            if ((var3_2 /* !! */  = this.retrieveDomainName((String)var3_2 /* !! */ , "RFX$", (Continuation<? super String>)var1_1 /* !! */ )) == var5_4) {
                return var5_4;
            }
            var1_1 /* !! */  = this;
lbl29:
            // 2 sources

            var5_4 = (String)var3_2 /* !! */ ;
            var3_2 /* !! */  = var1_1 /* !! */ ;
            if (var5_4 != null) {
                var4_5 = StringsKt.r((String)var5_4);
                var3_2 /* !! */  = var1_1 /* !! */ ;
            }
        } else {
            var3_2 /* !! */  = this;
        }
        var1_1 /* !! */  = var4_5 != null && Intrinsics.areEqual(var4_5, (Object)"") == false ? z2.o("https://", var4_5) : var3_2 /* !! */ .defaultDomain;
        return var1_1 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object getHost(Continuation<? super String> var1_1) {
        block13: {
            if (!(var1_1 /* !! */  instanceof getHost.1)) ** GOTO lbl-1000
            var4_2 /* !! */  = (getHost.1)var1_1 /* !! */ ;
            var2_3 = var4_2 /* !! */ .label;
            if ((var2_3 & -2147483648) != 0) {
                var4_2 /* !! */ .label = var2_3 + -2147483648;
            } else lbl-1000:
            // 2 sources

            {
                var4_2 /* !! */  = new getHost.1(this, var1_1 /* !! */ );
            }
            var6_4 = var4_2 /* !! */ .result;
            var5_5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            var2_3 = var4_2 /* !! */ .label;
            if (var2_3 != 0) {
                if (var2_3 != 1) {
                    if (var2_3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var3_6 = (Semaphore)var4_2 /* !! */ .L$1;
                    var4_2 /* !! */  = (ChangeableBaseUrlInterceptor)var4_2 /* !! */ .L$0;
                    var1_1 /* !! */  = var3_6;
                    try {
                        ResultKt.throwOnFailure((Object)var6_4);
                    }
                    catch (Throwable var3_7) {
                        break block13;
                    }
                }
                var1_1 /* !! */  = (Semaphore)var4_2 /* !! */ .L$1;
                var3_6 = (ChangeableBaseUrlInterceptor)var4_2 /* !! */ .L$0;
                ResultKt.throwOnFailure((Object)var6_4);
            } else {
                ResultKt.throwOnFailure((Object)var6_4);
                var1_1 /* !! */  = this.hostSemaphore;
                var4_2 /* !! */ .L$0 = this;
                var4_2 /* !! */ .L$1 = var1_1 /* !! */ ;
                var4_2 /* !! */ .label = 1;
                if (var1_1 /* !! */ .acquire((Continuation)var4_2 /* !! */ ) == var5_5) {
                    return var5_5;
                }
                var3_6 = this;
            }
            try {
                var4_2 /* !! */ .L$0 = var3_6;
                var4_2 /* !! */ .L$1 = var1_1 /* !! */ ;
                var4_2 /* !! */ .label = 2;
                var4_2 /* !! */  = super.updateHost((Continuation<? super Unit>)var4_2 /* !! */ );
                if (var4_2 /* !! */  == var5_5) {
                    return var5_5;
                }
                var4_2 /* !! */  = var3_6;
                var3_6 = var1_1 /* !! */ ;
            }
            catch (Throwable var3_8) {
                // empty catch block
                break block13;
            }
            var1_1 /* !! */  = var3_6;
            {
                var5_5 = Unit.INSTANCE;
            }
            var3_6.release();
            var3_6 = var4_2 /* !! */ .host;
            var1_1 /* !! */  = var3_6;
            if (var3_6 != null) return var1_1 /* !! */ ;
            return var4_2 /* !! */ .defaultDomain;
        }
        var1_1 /* !! */ .release();
        throw var3_9;
    }

    private final boolean isUrlReachable(String string) {
        boolean bl;
        block5: {
            int n;
            Object object;
            boolean bl2;
            block4: {
                bl2 = false;
                object = new URL(string);
                object = object.openConnection();
                Intrinsics.checkNotNull((Object)object, (String)"null cannot be cast to non-null type java.net.HttpURLConnection");
                object = (HttpURLConnection)object;
                object.setInstanceFollowRedirects(false);
                object.setConnectTimeout(2000);
                object.setReadTimeout(2000);
                object.setRequestMethod("GET");
                int n2 = object.getResponseCode();
                boolean bl3 = true;
                n = 100 <= n2 && n2 < 300 ? 1 : 0;
                bl = bl3;
                if (n != 0) break block4;
                n = 400 <= n2 && n2 < 500 ? 1 : 0;
                bl = n != 0 ? bl3 : false;
            }
            object.disconnect();
            if (bl) break block5;
            try {
                n = object.getResponseCode();
                object = object.getResponseMessage();
                Intrinsics.checkNotNullExpressionValue((Object)object, (String)"connection.responseMessage");
                this.logConnectionError(string, String.valueOf((int)n), (String)object);
            }
            catch (Exception exception) {
                this.logConnectionError(string, "", String.valueOf((Object)exception.getMessage()));
                bl = bl2;
            }
        }
        return bl;
    }

    public static /* synthetic */ boolean isUrlReachable$default(ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor, String string, int n, Object object) {
        if ((n & 1) != 0) {
            string = changeableBaseUrlInterceptor.defaultDomain;
        }
        return changeableBaseUrlInterceptor.isUrlReachable(string);
    }

    private final void logConnectionError(String string, String string2, String string3) {
        this.tagManager.logConnectionError(string, string2, string3);
    }

    private final Object retrieveDomainName(String object, String string, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        BuildersKt.launch$default((CoroutineScope)CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getMain()), null, null, (Function2)new retrieveDomainName.2.1(this, (String)object, string, (Continuation)safeContinuation, null), (int)3, null);
        object = safeContinuation.getOrThrow();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return object;
    }

    private final String retrievePublicKey(String string) {
        OkHttpClient okHttpClient;
        block5: {
            block7: {
                block6: {
                    okHttpClient = new OkHttpClient();
                    Object object = new Request.Builder();
                    string = okHttpClient.newCall(object.url(string).build()).execute();
                    if (!string.isSuccessful()) break block5;
                    if ((string = string.body()) == null) break block6;
                    object = string.string();
                    string = object;
                    if (object != null) break block7;
                }
                string = "";
            }
            JSONObject jSONObject = new JSONObject(string);
            string = jSONObject.getString("monday");
            return string;
        }
        okHttpClient.dispatcher().executorService().shutdown();
        return null;
        finally {
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private final Object setupWebView(Continuation<? super Unit> continuation) {
        Object object = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        BuildersKt.launch$default((CoroutineScope)CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getMain()), null, null, (Function2)new setupWebView.2.1(this, (Continuation)object, null), (int)3, null);
        object = object.getOrThrow();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return object;
        }
        return Unit.INSTANCE;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Object updateHost(Continuation<? super Unit> var1_1) {
        block7: {
            block5: {
                block6: {
                    if (!(var1_1 /* !! */  instanceof updateHost.1)) ** GOTO lbl-1000
                    var3_2 /* !! */  = var1_1 /* !! */ ;
                    var2_3 = var3_2 /* !! */ .label;
                    if ((var2_3 & -2147483648) != 0) {
                        var3_2 /* !! */ .label = var2_3 + -2147483648;
                        var1_1 /* !! */  = var3_2 /* !! */ ;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = new updateHost.1(this, var1_1 /* !! */ );
                    }
                    var3_2 /* !! */  = var1_1 /* !! */ .result;
                    var4_4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    var2_3 = var1_1 /* !! */ .label;
                    if (var2_3 == 0) break block5;
                    if (var2_3 != 1) break block6;
                    var1_1 /* !! */  = (ChangeableBaseUrlInterceptor)var1_1 /* !! */ .L$0;
                    ResultKt.throwOnFailure((Object)var3_2 /* !! */ );
                    ** GOTO lbl39
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure((Object)var3_2 /* !! */ );
            var3_2 /* !! */  = this.host;
            if (var3_2 /* !! */  == null) break block7;
            Intrinsics.checkNotNull((Object)var3_2 /* !! */ );
            if (!this.isUrlReachable((String)var3_2 /* !! */ )) break block7;
            var1_1 /* !! */  = this.host;
            ** GOTO lbl30
        }
        if (this.isUrlReachable(this.defaultDomain)) {
            var1_1 /* !! */  = this.defaultDomain;
lbl30:
            // 2 sources

            var4_4 = this;
            var3_2 /* !! */  = var1_1 /* !! */ ;
        } else {
            var1_1 /* !! */ .L$0 = this;
            var1_1 /* !! */ .label = 1;
            var3_2 /* !! */  = this.getAltDomain((Continuation<? super String>)var1_1 /* !! */ );
            if (var3_2 /* !! */  == var4_4) {
                return var4_4;
            }
            var1_1 /* !! */  = this;
lbl39:
            // 2 sources

            var3_2 /* !! */  = (String)var3_2 /* !! */ ;
            var4_4 = var1_1 /* !! */ ;
        }
        var4_4.host = var3_2 /* !! */ ;
        return Unit.INSTANCE;
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter((Object)chain, (String)"chain");
        String string = (String)BuildersKt.runBlocking$default(null, (Function2)new intercept.host.1(this, null), (int)1, null);
        Request.Builder builder = chain.request().newBuilder();
        string = z2.t(string);
        string.append(chain.request().url().encodedPath());
        return chain.proceed(builder.url(string.toString()).addHeader("X-User-Agent", this.userAgentHeader).addHeader("Accept", this.acceptHeader).addHeader("X-Device-Uid", this.deviceUid).build());
    }
}


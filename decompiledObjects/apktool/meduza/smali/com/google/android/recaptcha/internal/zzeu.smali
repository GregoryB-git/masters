.class public final Lcom/google/android/recaptcha/internal/zzeu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzet;


# instance fields
.field private final zza:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzeu;->zza:Ljava/lang/String;

    return-void
.end method

.method private static final zzb([B)V
    .locals 5

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzrf;->zzk([B)Lcom/google/android/recaptcha/internal/zzrf;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzrf;->zzl()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzrc;

    const-string v1, "INIT_TOTAL"

    const-string v2, "EXECUTE_TOTAL"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lva/a;->g([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzY()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    const-string v1, "UNRECOGNIZED"

    goto/16 :goto_1

    :pswitch_0
    const-string v1, "WEBVIEW_INITIALIZATION"

    goto/16 :goto_1

    :pswitch_1
    const-string v1, "INIT_ATTEMPT"

    goto/16 :goto_1

    :pswitch_2
    const-string v1, "GMSCORE_ENGINE_SIGNAL_COLLECTION"

    goto/16 :goto_1

    :pswitch_3
    const-string v1, "GMSCORE_ENGINE_INITIALIZATION"

    goto/16 :goto_1

    :pswitch_4
    const-string v1, "PIA_WARMUP"

    goto/16 :goto_1

    :pswitch_5
    const-string v1, "NATIVE_SIGNAL_COLLECTION"

    goto/16 :goto_1

    :pswitch_6
    const-string v1, "NATIVE_SIGNAL_INITIALIZATION"

    goto/16 :goto_1

    :pswitch_7
    const-string v1, "NATIVE_ENGINE_SIGNAL_COLLECTION"

    goto/16 :goto_1

    :pswitch_8
    const-string v1, "NATIVE_ENGINE_INITIALIZATION"

    goto/16 :goto_1

    :pswitch_9
    const-string v1, "WEBVIEW_ENGINE_SIGNAL_COLLECTION"

    goto/16 :goto_1

    :pswitch_a
    const-string v1, "WEBVIEW_ENGINE_INITIALIATION"

    goto/16 :goto_1

    :pswitch_b
    const-string v1, "SIGNAL_MANAGER_COLLECT_SIGNALS"

    goto/16 :goto_1

    :pswitch_c
    const-string v1, "SIGNAL_MANAGER_INITIALIZATION"

    goto/16 :goto_1

    :pswitch_d
    const-string v1, "POST_EXECUTE"

    goto/16 :goto_1

    :pswitch_e
    const-string v1, "FETCH_TOKEN"

    goto :goto_1

    :pswitch_f
    const-string v1, "COLLECT_SIGNALS"

    goto :goto_1

    :pswitch_10
    const-string v1, "LOAD_WEBVIEW"

    goto :goto_1

    :pswitch_11
    const-string v1, "LOAD_CACHE_JS"

    goto :goto_1

    :pswitch_12
    const-string v1, "SAVE_CACHE_JS"

    goto :goto_1

    :pswitch_13
    const-string v1, "DOWNLOAD_JS"

    goto :goto_1

    :pswitch_14
    const-string v1, "VALIDATE_INPUT"

    goto :goto_1

    :pswitch_15
    const-string v1, "INIT_DOWNLOAD_JS"

    goto :goto_1

    :pswitch_16
    const-string v1, "INIT_NETWORK_MRI_ACTION"

    goto :goto_1

    :pswitch_17
    const-string v1, "WEB_VIEW_RELOAD_JS"

    goto :goto_1

    :pswitch_18
    const-string v1, "JS_LOAD"

    goto :goto_1

    :pswitch_19
    const-string v1, "FETCH_ALLOWLIST"

    goto :goto_1

    :pswitch_1a
    const-string v1, "RUN_PROGRAM"

    goto :goto_1

    :pswitch_1b
    const-string v1, "VERIFY_PIN_TOTAL"

    goto :goto_1

    :pswitch_1c
    const-string v1, "VERIFY_PIN_JS"

    goto :goto_1

    :pswitch_1d
    const-string v1, "VERIFY_PIN_NATIVE"

    goto :goto_1

    :pswitch_1e
    const-string v1, "CHALLENGE_ACCOUNT_TOTAL"

    goto :goto_1

    :pswitch_1f
    const-string v1, "CHALLENGE_ACCOUNT_JS"

    goto :goto_1

    :pswitch_20
    const-string v1, "CHALLENGE_ACCOUNT_NATIVE"

    goto :goto_1

    :pswitch_21
    move-object v1, v2

    goto :goto_1

    :pswitch_22
    const-string v1, "EXECUTE_JS"

    goto :goto_1

    :pswitch_23
    const-string v1, "EXECUTE_NATIVE"

    goto :goto_1

    :pswitch_24
    const-string v1, "INIT_JS"

    goto :goto_1

    :pswitch_25
    const-string v1, "INIT_NETWORK"

    goto :goto_1

    :pswitch_26
    const-string v1, "INIT_NATIVE"

    goto :goto_1

    :pswitch_27
    const-string v1, "UNKNOWN"

    :goto_1
    :pswitch_28
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzX()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzM()Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzN()Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzY()I

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzg()Lcom/google/android/recaptcha/internal/zzqq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzqq;->zzk()Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzg()Lcom/google/android/recaptcha/internal/zzqq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzqq;->zzf()I

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzM()Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzN()Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzY()I

    :goto_2
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrc;->zzZ()I

    goto/16 :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_28
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final zza([B)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzeu;->zzb([B)V

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzeu;->zza:Ljava/lang/String;

    invoke-static {v1}, Landroid/webkit/URLUtil;->isHttpUrl(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzeu;->zza:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v1, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/net/HttpURLConnection;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzeu;->zza:Ljava/lang/String;

    invoke-static {v1}, Landroid/webkit/URLUtil;->isHttpsUrl(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzeu;->zza:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    invoke-static {v1, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    :goto_0
    const-string v2, "POST"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v3, "Content-Type"

    const-string v4, "application/x-protobuffer"

    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_1

    return v2

    :cond_1
    return v0

    :cond_2
    new-instance p1, Ljava/net/MalformedURLException;

    const-string v1, "Recaptcha server url only allows using Http or Https."

    invoke-direct {p1, v1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return v0
.end method

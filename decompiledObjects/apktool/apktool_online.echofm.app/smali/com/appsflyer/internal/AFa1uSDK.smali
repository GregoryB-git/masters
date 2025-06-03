.class public final Lcom/appsflyer/internal/AFa1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFa1uSDK$AFa1zSDK;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final valueOf:Lcom/appsflyer/internal/AFe1jSDK;

.field private final values:Lcom/appsflyer/internal/AFb1tSDK;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFe1jSDK;Lcom/appsflyer/internal/AFb1tSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFa1uSDK;->values:Lcom/appsflyer/internal/AFb1tSDK;

    return-void
.end method


# virtual methods
.method public final AFInAppEventParameterName(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v0, "AFInAppEventParameterName"

    iget-object v4, v1, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    iget-object v5, v4, Lcom/appsflyer/internal/AFa1qSDK;->afRDLog:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/appsflyer/internal/AFa1qSDK;->valueOf()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4}, Lcom/appsflyer/internal/AFa1rSDK;->AFInAppEventType(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v1, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    invoke-virtual {v6}, Lcom/appsflyer/internal/AFe1jSDK;->getLevel()Z

    move-result v6

    iget-object v7, v1, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    invoke-virtual {v7}, Lcom/appsflyer/internal/AFe1jSDK;->afErrorLogForExcManagerOnly()Z

    move-result v7

    iget-object v8, v1, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    invoke-virtual {v8}, Lcom/appsflyer/internal/AFe1jSDK;->AFVersionDeclaration()Z

    move-result v8

    iget-object v9, v1, Lcom/appsflyer/internal/AFa1uSDK;->valueOf:Lcom/appsflyer/internal/AFe1jSDK;

    invoke-virtual {v9}, Lcom/appsflyer/internal/AFa1qSDK;->values()Z

    move-result v9

    const-string v10, ""

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v6, :cond_0

    return-object v12

    :cond_0
    :try_start_0
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v8, :cond_2

    :try_start_1
    iget-object v13, v1, Lcom/appsflyer/internal/AFa1uSDK;->values:Lcom/appsflyer/internal/AFb1tSDK;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14, v4}, Lcom/appsflyer/internal/AFb1tSDK;->valueOf(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v13

    array-length v13, v13

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "call = "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, "; size = "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, " byte"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-le v13, v3, :cond_1

    const-string v13, "s"

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    move-object v13, v10

    :goto_0
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "; body = "

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/appsflyer/internal/AFa1aSDK;->values(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :try_start_2
    const-string v4, "AppsFlyer"

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/URLConnection;

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const/16 v13, 0x7530

    :try_start_3
    invoke-virtual {v4, v13}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v4, v13}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const-string v13, "POST"

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v4, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v13, "Content-Type"

    if-eqz v9, :cond_3

    const-string v14, "application/octet-stream"

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v12, v4

    goto/16 :goto_5

    :cond_3
    const-string v14, "application/json"

    :goto_1
    invoke-virtual {v4, v13, v14}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v9, :cond_6

    :try_start_4
    new-array v9, v3, [Ljava/lang/Object;

    aput-object p1, v9, v2

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v14

    const/4 v15, 0x0

    cmpl-float v14, v14, v15

    const v15, 0xcf57

    add-int/2addr v14, v15

    int-to-char v14, v14

    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v15

    add-int/lit8 v15, v15, 0x25

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v16

    shr-int/lit8 v16, v16, 0x10

    rsub-int/lit8 v12, v16, 0x25

    invoke-static {v14, v15, v12}, Lcom/appsflyer/internal/AFa1vSDK;->AFInAppEventParameterName(CII)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Class;

    new-array v14, v3, [Ljava/lang/Class;

    const-class v15, Ljava/lang/String;

    aput-object v15, v14, v2

    invoke-virtual {v12, v0, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    const/4 v14, 0x0

    invoke-virtual {v12, v14, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    new-array v12, v3, [Ljava/lang/Object;

    aput-object v11, v12, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v11

    shr-int/lit8 v11, v11, 0x18

    const v14, 0xcf58

    add-int/2addr v11, v14

    int-to-char v11, v11

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v14

    shr-int/lit8 v14, v14, 0x16

    rsub-int/lit8 v14, v14, 0x25

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v15

    int-to-byte v15, v15

    add-int/lit8 v15, v15, 0x26

    invoke-static {v11, v14, v15}, Lcom/appsflyer/internal/AFa1vSDK;->AFInAppEventParameterName(CII)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    new-array v14, v3, [Ljava/lang/Class;

    const-class v15, [B

    aput-object v15, v14, v2

    invoke-virtual {v11, v0, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v9, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [B
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v9

    if-eqz v9, :cond_4

    throw v9

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_4
    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v9

    if-eqz v9, :cond_5

    throw v9

    :cond_5
    throw v0

    :cond_6
    :goto_2
    invoke-virtual {v13, v11}, Ljava/io/OutputStream;->write([B)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    :goto_3
    :try_start_7
    const-string v9, "AFCrypto: reflection init failed"

    invoke-static {v9, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    if-eqz v7, :cond_7

    invoke-static {v4}, Lcom/appsflyer/internal/AFa1eSDK;->values(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v10

    :cond_7
    if-eqz v8, :cond_8

    iget-object v7, v1, Lcom/appsflyer/internal/AFa1uSDK;->values:Lcom/appsflyer/internal/AFb1tSDK;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6, v0, v10}, Lcom/appsflyer/internal/AFb1tSDK;->AFInAppEventParameterName(Ljava/lang/String;ILjava/lang/String;)V

    :cond_8
    const/16 v6, 0xc8

    if-ne v0, v6, :cond_9

    const-string v0, "Status 200 ok"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_6

    :cond_9
    move v2, v3

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object v14, v12

    :goto_5
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Error while calling "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v2, v3

    move-object v4, v12

    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Connection "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v2, :cond_a

    const-string v2, "error"

    goto :goto_7

    :cond_a
    const-string v2, "call succeeded"

    :goto_7
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    return-object v4
.end method

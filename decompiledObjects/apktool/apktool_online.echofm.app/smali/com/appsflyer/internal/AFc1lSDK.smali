.class public final Lcom/appsflyer/internal/AFc1lSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFInAppEventType:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/appsflyer/internal/AFc1lSDK;->AFInAppEventType:I

    return-void
.end method

.method private static AFKeystoreWrapper(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    move-object p1, v0

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance p0, Ljava/io/BufferedReader;

    invoke-direct {p0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v0, 0x1

    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-nez v0, :cond_2

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v1

    move-object v3, p1

    move-object p1, p0

    move-object p0, v3

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1}, Ljava/io/Reader;->close()V

    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    return-object p1

    :catchall_2
    move-exception p0

    move-object p1, v0

    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/Reader;->close()V

    :cond_5
    throw p0
.end method


# virtual methods
.method public final AFInAppEventParameterName(Lcom/appsflyer/internal/AFa1aSDK;)Lcom/appsflyer/internal/AFc1gSDK;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFa1aSDK;",
            ")",
            "Lcom/appsflyer/internal/AFc1gSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v2, "ms"

    const-string v3, "\n took "

    const-string v4, "] "

    const-string v5, "HTTP: ["

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->valueOf()[B

    move-result-object v0

    new-instance v10, Ljava/lang/StringBuilder;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v1, Lcom/appsflyer/internal/AFa1aSDK;->AFInAppEventParameterName:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ":"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, Lcom/appsflyer/internal/AFa1aSDK;->valueOf:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->valueOf()[B

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->values()Z

    move-result v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-eqz v12, :cond_1

    if-eqz v11, :cond_1

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFKeystoreWrapper()Z

    move-result v12

    if-eqz v12, :cond_0

    const-string v11, "<encrypted>"

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v9, 0x0

    move-object/from16 v11, p0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    const/4 v9, 0x0

    move-object/from16 v11, p0

    goto/16 :goto_b

    :cond_0
    new-instance v12, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-direct {v12, v11, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v11, v12

    :goto_0
    const-string v12, "\n payload: "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iget-object v11, v1, Lcom/appsflyer/internal/AFa1aSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    if-eqz v12, :cond_2

    :try_start_3
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    const-string v13, "\n "

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ": "

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_2
    :try_start_4
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    new-instance v10, Ljava/net/URL;

    iget-object v11, v1, Lcom/appsflyer/internal/AFa1aSDK;->valueOf:Ljava/lang/String;

    invoke-direct {v10, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v10

    invoke-static {v10}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/net/URLConnection;

    check-cast v10, Ljava/net/HttpURLConnection;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    iget-object v11, v1, Lcom/appsflyer/internal/AFa1aSDK;->AFInAppEventParameterName:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFInAppEventParameterName()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-virtual {v10, v8}, Ljava/net/URLConnection;->setUseCaches(Z)V

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object/from16 v11, p0

    :goto_2
    move-object v9, v10

    goto/16 :goto_c

    :catch_1
    move-exception v0

    move-object/from16 v11, p0

    :goto_3
    move-object v9, v10

    goto/16 :goto_b

    :cond_3
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->afDebugLog()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-virtual {v10, v8}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_4
    move-object/from16 v11, p0

    :try_start_6
    iget v12, v11, Lcom/appsflyer/internal/AFc1lSDK;->AFInAppEventType:I

    iget v13, v1, Lcom/appsflyer/internal/AFa1aSDK;->afDebugLog:I

    const/4 v14, -0x1

    if-eq v13, v14, :cond_5

    move v12, v13

    :cond_5
    invoke-virtual {v10, v12}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v10, v12}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFKeystoreWrapper()Z

    move-result v12

    if-eqz v12, :cond_6

    const-string v12, "application/octet-stream"

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :cond_6
    const-string v12, "application/json"

    :goto_5
    const-string v13, "Content-Type"

    invoke-virtual {v10, v13, v12}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v12, v1, Lcom/appsflyer/internal/AFa1aSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v10, v14, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    const/4 v12, 0x1

    if-eqz v0, :cond_9

    invoke-virtual {v10, v12}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v13, "Content-Length"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    array-length v15, v0

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v13, v14}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    new-instance v13, Ljava/io/BufferedOutputStream;

    invoke-virtual {v10}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v13, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v9, v13

    goto :goto_7

    :catchall_4
    move-exception v0

    const/4 v9, 0x0

    :goto_7
    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V

    :cond_8
    throw v0

    :cond_9
    :goto_8
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    const/4 v13, 0x2

    if-ne v0, v13, :cond_a

    goto :goto_9

    :cond_a
    move v12, v8

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFInAppEventType()Z

    move-result v0

    const-string v13, ""

    if-eqz v0, :cond_b

    invoke-static {v10, v12}, Lcom/appsflyer/internal/AFc1lSDK;->AFKeystoreWrapper(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    goto :goto_a

    :cond_b
    move-object v15, v13

    :goto_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sub-long/2addr v13, v6

    new-instance v0, Lcom/appsflyer/internal/AFc1kSDK;

    invoke-direct {v0, v13, v14}, Lcom/appsflyer/internal/AFc1kSDK;-><init>(J)V

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "response code:"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, " "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "\n body:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, v0, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper:J

    invoke-virtual {v13, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    new-instance v8, Ljava/util/HashMap;

    invoke-virtual {v10}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const/4 v9, 0x0

    invoke-interface {v8, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lcom/appsflyer/internal/AFc1gSDK;

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v16

    move-object v14, v9

    move/from16 v17, v12

    move-object/from16 v18, v8

    move-object/from16 v19, v0

    invoke-direct/range {v14 .. v19}, Lcom/appsflyer/internal/AFc1gSDK;-><init>(Ljava/lang/Object;IZLjava/util/Map;Lcom/appsflyer/internal/AFc1kSDK;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v9

    :catchall_5
    move-exception v0

    move-object/from16 v11, p0

    const/4 v9, 0x0

    goto :goto_c

    :catch_3
    move-exception v0

    move-object/from16 v11, p0

    const/4 v9, 0x0

    :goto_b
    :try_start_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v6

    new-instance v6, Lcom/appsflyer/internal/AFc1kSDK;

    invoke-direct {v6, v12, v13}, Lcom/appsflyer/internal/AFc1kSDK;-><init>(J)V

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "error: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v6, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper:J

    invoke-virtual {v7, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2, v2}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    new-instance v1, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    invoke-direct {v1, v0, v6}, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;-><init>(Ljava/lang/Throwable;Lcom/appsflyer/internal/AFc1kSDK;)V

    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception v0

    :goto_c
    if-eqz v9, :cond_c

    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_c
    throw v0
.end method

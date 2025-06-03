.class public Lcom/appsflyer/internal/AFa1vSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static AppsFlyer2dXConversionCallback:I = 0x0

.field public static getLevel:[B = null

.field private static init:Ljava/lang/Object; = null

.field public static onAppOpenAttributionNative:[B = null

.field private static onAttributionFailureNative:I = 0x1

.field public static final onConversionDataSuccess:[B

.field private static onDeepLinkingNative:I

.field public static onInstallConversionDataLoadedNative:I

.field private static onInstallConversionFailureNative:Ljava/lang/Object;

.field public static final onResponseErrorNative:I


# direct methods
.method private static $$c(BIS)Ljava/lang/String;
    .locals 5

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    or-int/lit8 v1, v0, 0x7d

    shl-int/lit8 v1, v1, 0x1

    xor-int/lit8 v2, v0, 0x7d

    sub-int/2addr v1, v2

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    neg-int p1, p1

    xor-int/lit8 v1, p1, 0x77

    and-int/lit8 p1, p1, 0x77

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr v1, p1

    rsub-int/lit8 p0, p0, 0x24

    add-int/lit8 p2, p2, 0x1c

    and-int/lit8 p1, p2, -0x18

    or-int/lit8 p2, p2, -0x18

    add-int/2addr p1, p2

    sget-object p2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    new-array v2, p0, [B

    not-int p0, p0

    rsub-int/lit8 p0, p0, -0x2

    const/4 v3, -0x1

    if-nez p2, :cond_0

    and-int/lit8 v4, v0, 0x7d

    or-int/lit8 v0, v0, 0x7d

    add-int/2addr v4, v0

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    move v0, v3

    move v3, v1

    move v1, p0

    goto :goto_1

    :cond_0
    :goto_0
    or-int/lit8 v0, v3, -0x43

    shl-int/lit8 v0, v0, 0x1

    xor-int/lit8 v3, v3, -0x43

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x44

    int-to-byte v3, v1

    aput-byte v3, v2, v0

    if-ne v0, p0, :cond_1

    new-instance p0, Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, v2, p1}, Ljava/lang/String;-><init>([BI)V

    sget p1, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    or-int/lit8 p2, p1, 0x67

    shl-int/lit8 p2, p2, 0x1

    xor-int/lit8 p1, p1, 0x67

    sub-int/2addr p2, p1

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    return-object p0

    :cond_1
    aget-byte v3, p2, p1

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v4, v4, 0x7d

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    :goto_1
    and-int v4, v1, v3

    or-int/2addr v1, v3

    add-int/2addr v4, v1

    add-int/lit8 v1, v4, -0x3

    add-int/lit8 p1, p1, 0x1

    sget v3, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    or-int/lit8 v4, v3, 0xf

    shl-int/lit8 v4, v4, 0x1

    xor-int/lit8 v3, v3, 0xf

    sub-int/2addr v4, v3

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    move v3, v0

    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 54

    const/16 v4, 0x32

    const/16 v5, 0xb

    const/16 v6, 0xe

    const-class v9, Lcom/appsflyer/internal/AFa1vSDK;

    const/16 v14, 0x114

    const/16 v16, 0x4e

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v10, 0x1

    const-class v18, [B

    invoke-static {}, Lcom/appsflyer/internal/AFa1vSDK;->init$0()V

    const v19, 0x51aef65a

    sput v19, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionDataLoadedNative:I

    const v19, -0x3c96e85c

    sput v19, Lcom/appsflyer/internal/AFa1vSDK;->AppsFlyer2dXConversionCallback:I

    :try_start_0
    sget-object v19, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v11, v19, v6

    int-to-byte v11, v11

    const/16 v6, 0x1c4

    aget-byte v12, v19, v6

    int-to-byte v12, v12

    or-int/lit16 v15, v12, 0x38a

    int-to-short v15, v15

    invoke-static {v11, v12, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v15, 0x0

    if-nez v12, :cond_0

    sget v12, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    xor-int/lit8 v20, v12, 0x45

    and-int/lit8 v12, v12, 0x45

    shl-int/2addr v12, v10

    add-int v12, v20, v12

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    :try_start_1
    aget-byte v12, v19, v5

    int-to-byte v12, v12

    aget-byte v5, v19, v6

    int-to-byte v5, v5

    xor-int/lit16 v13, v5, 0x3aa

    and-int/lit16 v1, v5, 0x3aa

    or-int/2addr v1, v13

    int-to-short v1, v1

    invoke-static {v12, v5, v1}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_68

    :cond_0
    move-object v1, v15

    :goto_0
    const/16 v5, 0x3b

    const/16 v12, 0x1d

    const/16 v13, 0x5a

    const/16 v2, 0x10

    :try_start_2
    aget-byte v5, v19, v5

    int-to-byte v5, v5

    aget-byte v10, v19, v13

    int-to-byte v10, v10

    const/16 v3, 0x2ce

    int-to-short v3, v3

    invoke-static {v5, v10, v3}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v5, 0x22

    aget-byte v5, v19, v5

    int-to-byte v5, v5

    aget-byte v10, v19, v6

    int-to-byte v10, v10

    const/16 v24, 0x167

    aget-byte v6, v19, v24

    int-to-short v6, v6

    invoke-static {v5, v10, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    new-array v6, v8, [Ljava/lang/Class;

    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v15, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v3, :cond_1

    goto :goto_1

    :catch_1
    move-object v3, v15

    :cond_1
    :try_start_3
    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v6, v5, v4

    int-to-byte v6, v6

    aget-byte v10, v5, v13

    int-to-byte v10, v10

    const/16 v4, 0x195

    int-to-short v4, v4

    invoke-static {v6, v10, v4}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v6, v5, v12

    int-to-byte v6, v6

    aget-byte v5, v5, v2

    int-to-byte v5, v5

    const/16 v10, 0x324

    int-to-short v10, v10

    invoke-static {v6, v5, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    new-array v6, v8, [Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v15, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :goto_1
    if-eqz v3, :cond_3

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v4, v4, 0x35

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    rem-int/2addr v4, v7

    if-nez v4, :cond_2

    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v6, 0xbd2

    aget-byte v6, v5, v6

    int-to-byte v6, v6

    const/16 v10, 0x2c

    aget-byte v5, v5, v10

    int-to-byte v5, v5

    const/16 v10, 0x735d

    int-to-short v10, v10

    invoke-static {v6, v5, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-virtual {v4, v5, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v3, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v6, v5, v14

    int-to-byte v6, v6

    aget-byte v5, v5, v2

    int-to-byte v5, v5

    const/16 v10, 0xe8

    int-to-short v10, v10

    invoke-static {v6, v5, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    :cond_3
    move-object v4, v15

    :goto_3
    if-eqz v3, :cond_4

    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v10, 0x34

    aget-byte v12, v6, v10

    int-to-byte v10, v12

    aget-byte v6, v6, v2

    int-to-byte v6, v6

    xor-int/lit16 v12, v6, 0x12f

    and-int/lit16 v13, v6, 0x12f

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v10, v6, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v3, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    :cond_4
    move-object v5, v15

    :goto_4
    if-eqz v3, :cond_5

    :try_start_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    sget-object v10, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v12, v10, v14

    int-to-byte v12, v12

    aget-byte v10, v10, v2

    int-to-byte v10, v10

    xor-int/lit16 v13, v10, 0xe6

    and-int/lit16 v2, v10, 0xe6

    or-int/2addr v2, v13

    int-to-short v2, v2

    invoke-static {v12, v10, v2}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v3, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_5

    :catch_5
    :cond_5
    move-object v2, v15

    :goto_5
    const-class v3, Ljava/lang/String;

    const/4 v6, 0x5

    const/16 v10, 0xc3

    if-eqz v4, :cond_6

    goto :goto_6

    :cond_6
    if-nez v1, :cond_7

    move-object v4, v15

    goto :goto_6

    :cond_7
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v13, v12, v14

    int-to-byte v13, v13

    const/16 v27, 0x38

    aget-byte v14, v12, v27

    int-to-byte v14, v14

    xor-int/lit16 v15, v14, 0x207

    and-int/lit16 v7, v14, 0x207

    or-int/2addr v7, v15

    int-to-short v7, v7

    invoke-static {v13, v14, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    const/4 v4, 0x1

    :try_start_8
    new-array v7, v4, [Ljava/lang/Object;

    aput-object v1, v7, v8

    aget-byte v1, v12, v6

    int-to-byte v1, v1

    aget-byte v4, v12, v10

    int-to-byte v4, v4

    const/16 v12, 0x338

    int-to-short v13, v12

    invoke-static {v1, v4, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v4, 0x1

    new-array v12, v4, [Ljava/lang/Class;

    aput-object v3, v12, v8

    invoke-virtual {v1, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6b

    :goto_6
    if-eqz v2, :cond_9

    sget v1, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    and-int/lit8 v7, v1, 0x57

    or-int/lit8 v1, v1, 0x57

    add-int/2addr v7, v1

    rem-int/lit16 v1, v7, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v1, 0x2

    rem-int/2addr v7, v1

    if-nez v7, :cond_8

    goto/16 :goto_7

    :cond_8
    const/4 v1, 0x0

    :try_start_9
    throw v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    throw v1

    :cond_9
    :try_start_a
    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v2, 0x5a

    aget-byte v7, v1, v2

    int-to-byte v2, v7

    aget-byte v7, v1, v10

    int-to-byte v7, v7

    const/16 v12, 0x2a9

    int-to-short v12, v12

    invoke-static {v2, v7, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    sget v7, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    and-int/lit8 v12, v7, 0x63

    or-int/lit8 v7, v7, 0x63

    add-int/2addr v12, v7

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v7, 0x1

    :try_start_b
    new-array v12, v7, [Ljava/lang/Object;

    aput-object v2, v12, v8

    const/16 v2, 0x1c4

    aget-byte v7, v1, v2

    int-to-byte v2, v7

    aget-byte v7, v1, v10

    int-to-byte v7, v7

    const/16 v13, 0x78

    aget-byte v13, v1, v13

    int-to-short v13, v13

    invoke-static {v2, v7, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v7, 0x114

    aget-byte v13, v1, v7

    int-to-byte v7, v13

    const/16 v13, 0x10

    aget-byte v14, v1, v13

    int-to-byte v13, v14

    xor-int/lit16 v14, v13, 0x2a6

    and-int/lit16 v15, v13, 0x2a6

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v7, v13, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v13, 0x1

    new-array v14, v13, [Ljava/lang/Class;

    aput-object v3, v14, v8

    invoke-virtual {v2, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v2, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6a

    :try_start_c
    new-array v7, v13, [Ljava/lang/Object;

    aput-object v2, v7, v8

    aget-byte v2, v1, v6

    int-to-byte v2, v2

    aget-byte v1, v1, v10

    int-to-byte v1, v1

    const/16 v12, 0x338

    int-to-short v13, v12

    invoke-static {v2, v1, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x1

    new-array v12, v2, [Ljava/lang/Class;

    aput-object v3, v12, v8

    invoke-virtual {v1, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_69

    :goto_7
    if-nez v5, :cond_c

    sget v1, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    or-int/lit8 v7, v1, 0x4f

    const/4 v12, 0x1

    shl-int/2addr v7, v12

    xor-int/lit8 v1, v1, 0x4f

    sub-int/2addr v7, v1

    rem-int/lit16 v1, v7, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v1, 0x2

    rem-int/2addr v7, v1

    if-eqz v7, :cond_a

    const/16 v1, 0x57

    :try_start_d
    div-int/2addr v1, v8
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    if-eqz v4, :cond_c

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v1, v0

    throw v1

    :cond_a
    if-eqz v4, :cond_c

    :goto_8
    :try_start_e
    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v5, 0x223

    aget-byte v5, v1, v5

    int-to-byte v5, v5

    const/16 v7, 0x1c4

    aget-byte v12, v1, v7

    int-to-byte v7, v12

    or-int/lit16 v12, v7, 0x103

    int-to-short v12, v12

    invoke-static {v5, v7, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    const/4 v7, 0x2

    :try_start_f
    new-array v12, v7, [Ljava/lang/Object;

    aput-object v4, v12, v8

    const/4 v7, 0x1

    aput-object v5, v12, v7

    aget-byte v5, v1, v6

    int-to-byte v5, v5

    aget-byte v7, v1, v10

    int-to-byte v7, v7

    const/16 v13, 0x338

    int-to-short v14, v13

    invoke-static {v5, v7, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v7, 0x2

    new-array v13, v7, [Ljava/lang/Class;

    aget-byte v7, v1, v6

    int-to-byte v7, v7

    aget-byte v1, v1, v10

    int-to-byte v1, v1

    invoke-static {v7, v1, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aput-object v1, v13, v8

    const/4 v1, 0x1

    aput-object v3, v13, v1

    invoke-virtual {v5, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_10
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_b

    throw v2

    :cond_b
    throw v1
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    :cond_c
    :goto_9
    :try_start_11
    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v7, 0x32

    aget-byte v12, v1, v7

    int-to-byte v7, v12

    const/16 v12, 0x5a

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    const/16 v13, 0x215

    int-to-short v13, v13

    invoke-static {v7, v12, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v12, 0x9

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    const/16 v13, 0x10

    aget-byte v14, v1, v13

    int-to-byte v13, v14

    const/16 v14, 0x1aa

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v7, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_68

    :try_start_12
    aget-byte v12, v1, v6

    int-to-byte v12, v12

    aget-byte v13, v1, v10

    int-to-byte v13, v13

    const/16 v14, 0x338

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v13, 0x9

    invoke-static {v12, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v13, v12, v8

    const/4 v13, 0x1

    aput-object v5, v12, v13

    const/4 v13, 0x2

    aput-object v4, v12, v13

    const/4 v13, 0x3

    aput-object v2, v12, v13

    const/4 v15, 0x4

    aput-object v7, v12, v15

    aput-object v5, v12, v6

    const/4 v5, 0x6

    aput-object v4, v12, v5

    const/4 v4, 0x7

    aput-object v2, v12, v4

    const/16 v2, 0x8

    aput-object v7, v12, v2

    const/16 v2, 0x9

    new-array v4, v2, [Z

    fill-array-data v4, :array_0

    new-array v5, v2, [Z

    fill-array-data v5, :array_1

    new-array v7, v2, [Z

    fill-array-data v7, :array_2
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    const/16 v2, 0x15

    const/16 v15, 0x51

    :try_start_13
    aget-byte v13, v1, v15

    int-to-byte v13, v13

    const/16 v26, 0x5a

    aget-byte v15, v1, v26

    int-to-byte v15, v15

    sget v10, Lcom/appsflyer/internal/AFa1vSDK;->onResponseErrorNative:I

    and-int/lit16 v10, v10, 0x3cf

    int-to-short v10, v10

    invoke-static {v13, v15, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v13, 0x15c

    aget-byte v13, v1, v13

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v15, 0x19

    aget-byte v1, v1, v15

    int-to-byte v1, v1

    const/16 v15, 0x262

    int-to-short v15, v15

    invoke-static {v13, v1, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1

    const/16 v10, 0x1d

    if-ne v1, v10, :cond_d

    goto :goto_a

    :cond_d
    const/16 v10, 0x1a

    if-lt v1, v10, :cond_e

    const/4 v10, 0x1

    goto :goto_b

    :cond_e
    :goto_a
    move v10, v8

    :goto_b
    aput-boolean v10, v7, v8
    :try_end_13
    .catch Ljava/lang/ClassNotFoundException; {:try_start_13 .. :try_end_13} :catch_6
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    if-lt v1, v2, :cond_f

    const/4 v10, 0x1

    const/16 v23, 0x1

    goto :goto_c

    :cond_f
    sget v10, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v10, v10, 0x65

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    move/from16 v23, v8

    const/4 v10, 0x1

    :goto_c
    :try_start_14
    aput-boolean v23, v7, v10

    if-lt v1, v2, :cond_10

    const/4 v10, 0x1

    goto :goto_d

    :cond_10
    move v10, v8

    :goto_d
    aput-boolean v10, v7, v6

    const/16 v10, 0x10

    if-ge v1, v10, :cond_11

    const/4 v13, 0x1

    :goto_e
    const/4 v15, 0x4

    goto :goto_f

    :cond_11
    move v13, v8

    goto :goto_e

    :goto_f
    aput-boolean v13, v7, v15

    if-ge v1, v10, :cond_12

    const/4 v1, 0x1

    goto :goto_10

    :cond_12
    move v1, v8

    :goto_10
    const/16 v10, 0x8

    aput-boolean v1, v7, v10
    :try_end_14
    .catch Ljava/lang/ClassNotFoundException; {:try_start_14 .. :try_end_14} :catch_6
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    :catch_6
    move v1, v8

    move v10, v1

    const/4 v13, 0x1

    :goto_11
    xor-int/lit8 v15, v1, 0x1

    if-eqz v15, :cond_63

    const/16 v13, 0x9

    if-ge v10, v13, :cond_63

    sget v13, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v13, v13, 0x4d

    rem-int/lit16 v15, v13, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v15, 0x2

    rem-int/2addr v13, v15

    if-nez v13, :cond_62

    :try_start_15
    aget-boolean v13, v7, v10
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    if-eqz v13, :cond_61

    :try_start_16
    aget-boolean v15, v4, v10
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_65

    :try_start_17
    aget-object v2, v12, v10

    aget-boolean v30, v5, v10
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_64

    const/16 v32, 0x356

    if-eqz v15, :cond_17

    if-eqz v2, :cond_14

    :try_start_18
    sget-object v33, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v8, v33, v6

    int-to-byte v8, v8

    const/16 v29, 0xc3

    aget-byte v6, v33, v29

    int-to-byte v6, v6

    invoke-static {v8, v6, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v8, 0xb5

    aget-byte v34, v33, v8

    const/4 v8, 0x1

    or-int/lit8 v23, v34, 0x1

    shl-int/lit8 v35, v23, 0x1

    xor-int/lit8 v34, v34, 0x1

    sub-int v8, v35, v34

    int-to-byte v8, v8

    const/16 v25, 0x1c4

    aget-byte v13, v33, v25
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    int-to-byte v13, v13

    move/from16 v33, v1

    const/16 v1, 0x304

    int-to-short v1, v1

    :try_start_19
    invoke-static {v8, v13, v1}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    invoke-virtual {v6, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    if-eqz v1, :cond_15

    goto/16 :goto_15

    :catchall_3
    move-exception v0

    :goto_12
    move-object v1, v0

    goto :goto_13

    :catchall_4
    move-exception v0

    move/from16 v33, v1

    goto :goto_12

    :goto_13
    :try_start_1a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_13

    throw v2

    :catchall_5
    move-exception v0

    move-object v1, v0

    move-object/from16 v37, v4

    move-object/from16 v36, v5

    move-object/from16 v42, v7

    move/from16 v45, v10

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    :goto_14
    move/from16 v30, v14

    const/4 v2, 0x1

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    goto/16 :goto_64

    :cond_13
    throw v1

    :cond_14
    move/from16 v33, v1

    :cond_15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v8, v6, v32

    int-to-byte v8, v8

    const/16 v13, 0x54

    aget-byte v15, v6, v13

    int-to-byte v13, v15

    const/16 v15, 0x175

    int-to-short v15, v15

    invoke-static {v8, v13, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x376

    aget-byte v2, v6, v2

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v8, 0x174

    aget-byte v8, v6, v8

    const/4 v13, 0x1

    sub-int/2addr v8, v13

    int-to-byte v8, v8

    const/16 v15, 0x103

    int-to-short v15, v15

    invoke-static {v2, v8, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    :try_start_1b
    new-array v2, v13, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v1, v2, v8

    const/16 v1, 0x60

    aget-byte v8, v6, v1

    int-to-byte v1, v8

    const/16 v8, 0xc3

    aget-byte v6, v6, v8

    int-to-byte v6, v6

    const/16 v8, 0x30b

    int-to-short v13, v8

    invoke-static {v1, v6, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v6, 0x1

    new-array v8, v6, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v3, v8, v6

    invoke-virtual {v1, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    :catchall_6
    move-exception v0

    move-object v1, v0

    :try_start_1c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_16

    throw v2

    :cond_16
    throw v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    :cond_17
    move/from16 v33, v1

    :goto_15
    if-eqz v15, :cond_2b

    :try_start_1d
    new-instance v8, Ljava/util/Random;

    invoke-direct {v8}, Ljava/util/Random;-><init>()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_14

    :try_start_1e
    sget-object v13, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v25, 0x1c4

    aget-byte v1, v13, v25

    int-to-byte v1, v1

    const/16 v29, 0xc3

    aget-byte v6, v13, v29
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_13

    int-to-byte v6, v6

    const/16 v36, 0x78

    move-object/from16 v37, v4

    :try_start_1f
    aget-byte v4, v13, v36

    int-to-short v4, v4

    invoke-static {v1, v6, v4}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v4, 0x280

    aget-byte v6, v13, v4

    int-to-byte v4, v6

    const/16 v6, 0x1c4

    aget-byte v13, v13, v6

    int-to-byte v6, v13

    const/16 v13, 0x347

    int-to-short v13, v13

    invoke-static {v4, v6, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v1, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v6, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v38
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_12

    const-wide/32 v40, -0x606386e4

    move-object v1, v5

    xor-long v4, v38, v40

    :try_start_20
    invoke-virtual {v8, v4, v5}, Ljava/util/Random;->setSeed(J)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_11

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    or-int/lit8 v5, v4, 0x21

    const/4 v6, 0x1

    shl-int/2addr v5, v6

    xor-int/lit8 v4, v4, 0x21

    sub-int/2addr v5, v4

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    :goto_16
    if-nez v4, :cond_29

    if-nez v5, :cond_18

    const/16 v36, 0x6

    move-object/from16 v38, v4

    move/from16 v53, v36

    move-object/from16 v36, v1

    move/from16 v1, v53

    goto :goto_17

    :cond_18
    move-object/from16 v36, v1

    move-object/from16 v38, v4

    if-nez v6, :cond_19

    const/4 v1, 0x5

    goto :goto_17

    :cond_19
    if-nez v13, :cond_1a

    const/4 v1, 0x4

    goto :goto_17

    :cond_1a
    const/4 v1, 0x3

    :goto_17
    :try_start_21
    new-instance v4, Ljava/lang/StringBuilder;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_10

    const/16 v23, 0x1

    and-int/lit8 v39, v1, 0x1

    or-int/lit8 v40, v1, 0x1

    move-object/from16 v41, v11

    add-int v11, v39, v40

    :try_start_22
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v11, 0x2e

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_f

    const/4 v11, 0x0

    :goto_18
    if-ge v11, v1, :cond_1e

    sget v39, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    move/from16 v40, v1

    add-int/lit8 v1, v39, 0x6d

    move-object/from16 v39, v12

    rem-int/lit16 v12, v1, 0x80

    sput v12, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v12, 0x2

    rem-int/2addr v1, v12

    if-eqz v1, :cond_1d

    if-eqz v30, :cond_1c

    const/16 v1, 0x1a

    :try_start_23
    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    invoke-virtual {v8}, Ljava/util/Random;->nextBoolean()Z

    move-result v12

    if-eqz v12, :cond_1b

    const/16 v12, 0x41

    and-int/lit8 v42, v1, 0x41

    or-int/2addr v1, v12

    add-int v42, v42, v1

    :goto_19
    move/from16 v1, v42

    goto :goto_1a

    :cond_1b
    neg-int v1, v1

    neg-int v1, v1

    xor-int/lit8 v12, v1, 0x60

    const/16 v31, 0x60

    and-int/lit8 v1, v1, 0x60

    const/16 v23, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int v42, v12, v1

    goto :goto_19

    :goto_1a
    int-to-char v1, v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v23, 0x1

    goto :goto_1d

    :catchall_7
    move-exception v0

    :goto_1b
    move-object v1, v0

    move-object/from16 v42, v7

    :goto_1c
    move/from16 v45, v10

    goto/16 :goto_14

    :cond_1c
    const/16 v1, 0xc

    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    neg-int v1, v1

    neg-int v1, v1

    xor-int/lit16 v12, v1, 0x2000

    and-int/lit16 v1, v1, 0x2000

    const/16 v23, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v12, v1

    int-to-char v1, v12

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1d
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v12, v39

    move/from16 v1, v40

    goto :goto_18

    :cond_1d
    const/4 v1, 0x0

    throw v1

    :cond_1e
    move-object/from16 v39, v12

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_7

    if-nez v5, :cond_20

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v4, v4, 0x4d

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v5, 0x2

    rem-int/2addr v4, v5

    if-eqz v4, :cond_1d

    :try_start_24
    new-array v4, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/4 v5, 0x5

    aget-byte v11, v1, v5

    int-to-byte v5, v11

    const/16 v11, 0xc3

    aget-byte v12, v1, v11

    int-to-byte v11, v12

    invoke-static {v5, v11, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Class;

    move-object/from16 v40, v8

    const/4 v11, 0x5

    aget-byte v8, v1, v11

    int-to-byte v8, v8

    const/16 v11, 0xc3

    aget-byte v1, v1, v11

    int-to-byte v1, v1

    invoke-static {v8, v1, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v8, 0x0

    aput-object v1, v12, v8

    const/4 v1, 0x1

    aput-object v3, v12, v1

    invoke-virtual {v5, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    move-object v5, v1

    :goto_1e
    move-object/from16 v42, v2

    move-object/from16 v4, v38

    goto/16 :goto_1f

    :catchall_8
    move-exception v0

    move-object v1, v0

    :try_start_25
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1f

    throw v2

    :cond_1f
    throw v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    :cond_20
    move-object/from16 v40, v8

    if-nez v6, :cond_22

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v4, v4, 0x25

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v4, 0x2

    :try_start_26
    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v6, v4

    const/4 v4, 0x1

    aput-object v1, v6, v4

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/4 v4, 0x5

    aget-byte v8, v1, v4

    int-to-byte v4, v8

    const/16 v8, 0xc3

    aget-byte v11, v1, v8

    int-to-byte v8, v11

    invoke-static {v4, v8, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v8, 0x2

    new-array v11, v8, [Ljava/lang/Class;

    const/4 v8, 0x5

    aget-byte v12, v1, v8

    int-to-byte v8, v12

    const/16 v12, 0xc3

    aget-byte v1, v1, v12

    int-to-byte v1, v1

    invoke-static {v8, v1, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v8, 0x0

    aput-object v1, v11, v8

    const/4 v1, 0x1

    aput-object v3, v11, v1

    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_9

    move-object v6, v1

    goto :goto_1e

    :catchall_9
    move-exception v0

    move-object v1, v0

    :try_start_27
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_21

    throw v2

    :cond_21
    throw v1
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    :cond_22
    if-nez v13, :cond_24

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    xor-int/lit8 v8, v4, 0x23

    and-int/lit8 v4, v4, 0x23

    const/4 v11, 0x1

    shl-int/2addr v4, v11

    add-int/2addr v8, v4

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v4, 0x2

    :try_start_28
    new-array v8, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v8, v4

    aput-object v1, v8, v11

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/4 v4, 0x5

    aget-byte v11, v1, v4

    int-to-byte v4, v11

    const/16 v11, 0xc3

    aget-byte v12, v1, v11

    int-to-byte v11, v12

    invoke-static {v4, v11, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v11, 0x5

    aget-byte v13, v1, v11

    int-to-byte v11, v13

    const/16 v13, 0xc3

    aget-byte v1, v1, v13

    int-to-byte v1, v1

    invoke-static {v11, v1, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v11, 0x0

    aput-object v1, v12, v11

    const/4 v1, 0x1

    aput-object v3, v12, v1

    invoke-virtual {v4, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_a

    move-object v13, v1

    goto/16 :goto_1e

    :catchall_a
    move-exception v0

    move-object v1, v0

    :try_start_29
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_23

    throw v2

    :cond_23
    throw v1
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_7

    :cond_24
    const/4 v4, 0x2

    :try_start_2a
    new-array v8, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v8, v4

    const/4 v4, 0x1

    aput-object v1, v8, v4

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/4 v4, 0x5

    aget-byte v11, v1, v4

    int-to-byte v4, v11

    const/16 v11, 0xc3

    aget-byte v12, v1, v11

    int-to-byte v11, v12

    invoke-static {v4, v11, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Class;

    move-object/from16 v42, v2

    const/4 v11, 0x5

    aget-byte v2, v1, v11

    int-to-byte v2, v2

    move-object/from16 v43, v5

    const/16 v11, 0xc3

    aget-byte v5, v1, v11

    int-to-byte v5, v5

    invoke-static {v2, v5, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v12, v5

    const/4 v2, 0x1

    aput-object v3, v12, v2

    invoke-virtual {v4, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_e

    sget v5, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    xor-int/lit8 v8, v5, 0x15

    const/16 v11, 0x15

    and-int/2addr v5, v11

    shl-int/2addr v5, v2

    add-int/2addr v8, v5

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    :try_start_2b
    new-array v5, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v5, v2

    const/16 v2, 0x51

    aget-byte v8, v1, v2

    int-to-byte v2, v8

    const/16 v8, 0xc3

    aget-byte v11, v1, v8

    int-to-byte v8, v11

    xor-int/lit16 v11, v8, 0x2e0

    and-int/lit16 v12, v8, 0x2e0

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v2, v8, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v8, 0x1

    new-array v11, v8, [Ljava/lang/Class;

    const/4 v8, 0x5

    aget-byte v12, v1, v8

    int-to-byte v8, v12

    move-object/from16 v44, v6

    const/16 v12, 0xc3

    aget-byte v6, v1, v12

    int-to-byte v6, v6

    invoke-static {v8, v6, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v8, 0x0

    aput-object v6, v11, v8

    invoke-virtual {v2, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_c

    const/16 v5, 0x51

    :try_start_2c
    aget-byte v6, v1, v5

    int-to-byte v5, v6

    const/16 v6, 0xc3

    aget-byte v8, v1, v6

    int-to-byte v6, v8

    or-int/lit16 v8, v6, 0x2e0

    int-to-short v8, v8

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v6, v1, v32

    int-to-byte v6, v6

    const/16 v8, 0x1c4

    aget-byte v1, v1, v8

    int-to-byte v1, v1

    const/16 v8, 0x28c

    int-to-short v11, v8

    invoke-static {v6, v1, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v5, v1, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_b

    move-object/from16 v5, v43

    move-object/from16 v6, v44

    :goto_1f
    move-object/from16 v1, v36

    move-object/from16 v12, v39

    move-object/from16 v8, v40

    move-object/from16 v11, v41

    move-object/from16 v2, v42

    goto/16 :goto_16

    :catchall_b
    move-exception v0

    move-object v1, v0

    :try_start_2d
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_25

    throw v2

    :catch_7
    move-exception v0

    move-object v1, v0

    goto :goto_20

    :cond_25
    throw v1

    :catchall_c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_26

    throw v2

    :cond_26
    throw v1
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_7
    .catchall {:try_start_2d .. :try_end_2d} :catchall_7

    :goto_20
    :try_start_2e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v6, v5, v32

    int-to-byte v6, v6

    const/16 v8, 0x54

    aget-byte v11, v5, v8

    int-to-byte v8, v11

    const/16 v11, 0x343

    int-to-short v11, v11

    invoke-static {v6, v8, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x376

    aget-byte v4, v5, v4

    neg-int v4, v4

    int-to-byte v4, v4

    const/16 v6, 0x174

    aget-byte v6, v5, v6

    xor-int/lit8 v6, v6, -0x1

    rsub-int/lit8 v6, v6, -0x2

    int-to-byte v6, v6

    const/16 v8, 0x103

    int-to-short v8, v8

    invoke-static {v4, v6, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_7

    const/4 v4, 0x2

    :try_start_2f
    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v6, v4

    const/4 v2, 0x1

    aput-object v1, v6, v2

    const/16 v1, 0x60

    aget-byte v2, v5, v1

    int-to-byte v1, v2

    const/16 v2, 0xc3

    aget-byte v4, v5, v2

    int-to-byte v2, v4

    const/16 v4, 0x30b

    int-to-short v5, v4

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v3, v4, v2

    const-class v2, Ljava/lang/Throwable;

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_d

    :catchall_d
    move-exception v0

    move-object v1, v0

    :try_start_30
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_27

    throw v2

    :cond_27
    throw v1

    :catchall_e
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_28

    throw v2

    :cond_28
    throw v1

    :catchall_f
    move-exception v0

    :goto_21
    move-object/from16 v39, v12

    goto/16 :goto_1b

    :catchall_10
    move-exception v0

    :goto_22
    move-object/from16 v41, v11

    goto :goto_21

    :cond_29
    move-object/from16 v36, v1

    move-object/from16 v38, v4

    move-object/from16 v43, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    goto :goto_25

    :catchall_11
    move-exception v0

    move-object/from16 v36, v1

    goto :goto_22

    :catchall_12
    move-exception v0

    :goto_23
    move-object/from16 v36, v5

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    move-object v1, v0

    goto :goto_24

    :catchall_13
    move-exception v0

    move-object/from16 v37, v4

    goto :goto_23

    :goto_24
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2a

    throw v2

    :cond_2a
    throw v1
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_7

    :catchall_14
    move-exception v0

    move-object/from16 v37, v4

    move-object/from16 v36, v5

    goto :goto_22

    :cond_2b
    move-object/from16 v37, v4

    move-object/from16 v36, v5

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    const/4 v13, 0x0

    const/16 v38, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    :goto_25
    const/16 v1, 0x1db1

    :try_start_31
    new-array v1, v1, [B

    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v4, 0x3b

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v5, 0x38

    aget-byte v5, v2, v5

    int-to-byte v5, v5

    const/16 v6, 0x290

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_5a

    const/4 v5, 0x1

    :try_start_32
    new-array v6, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v6, v5

    const/16 v4, 0xc3

    aget-byte v5, v2, v4

    int-to-byte v4, v5

    int-to-byte v5, v4

    or-int/lit16 v8, v5, 0x1d0

    int-to-short v8, v8

    invoke-static {v4, v5, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v5, 0x1

    new-array v8, v5, [Ljava/lang/Class;

    const/16 v5, 0x60

    aget-byte v11, v2, v5

    int-to-byte v5, v11

    const/16 v11, 0xc3

    aget-byte v12, v2, v11

    int-to-byte v11, v12

    const/16 v12, 0x3e4

    int-to-short v12, v12

    invoke-static {v5, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v11, 0x0

    aput-object v5, v8, v11

    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_63

    const/4 v5, 0x1

    :try_start_33
    new-array v6, v5, [Ljava/lang/Object;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_60

    :try_start_34
    aput-object v1, v6, v11
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_62

    const/16 v5, 0xc3

    :try_start_35
    aget-byte v8, v2, v5

    int-to-byte v5, v8

    int-to-byte v8, v5

    xor-int/lit16 v11, v8, 0x1d0

    and-int/lit16 v12, v8, 0x1d0

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v5, v8, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v8, 0xb5

    aget-byte v11, v2, v8
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_60

    int-to-byte v8, v11

    const/16 v11, 0x15

    :try_start_36
    aget-byte v12, v2, v11
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_61

    int-to-byte v11, v12

    const/16 v12, 0xe0

    int-to-short v12, v12

    :try_start_37
    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v18, v12, v11

    invoke-virtual {v5, v8, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_60

    const/16 v5, 0xc3

    :try_start_38
    aget-byte v6, v2, v5

    int-to-byte v5, v6

    int-to-byte v6, v5

    xor-int/lit16 v8, v6, 0x1d0

    and-int/lit16 v11, v6, 0x1d0

    or-int/2addr v8, v11

    int-to-short v8, v8

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v6, v2, v32
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_5e

    int-to-byte v6, v6

    const/16 v8, 0x1c4

    :try_start_39
    aget-byte v2, v2, v8
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_5f

    int-to-byte v2, v2

    const/16 v8, 0x28c

    int-to-short v11, v8

    :try_start_3a
    invoke-static {v6, v2, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-virtual {v5, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_5e

    const/16 v2, 0x11

    const/16 v4, 0x1d89

    move-object/from16 v6, v41

    const/4 v5, 0x0

    :goto_26
    add-int/lit16 v8, v2, 0x140

    xor-int/lit16 v11, v2, 0x1d9f

    and-int/lit16 v12, v2, 0x1d9f

    const/16 v23, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v11, v12

    :try_start_3b
    aget-byte v11, v1, v11

    or-int/lit8 v12, v11, -0x3a

    shl-int/lit8 v12, v12, 0x1

    xor-int/lit8 v11, v11, -0x3a

    sub-int/2addr v12, v11

    int-to-byte v11, v12

    aput-byte v11, v1, v8

    array-length v8, v1
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_5a

    sub-int/2addr v8, v2

    const/4 v11, 0x3

    :try_start_3c
    new-array v12, v11, [Ljava/lang/Object;
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_5d

    :try_start_3d
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v11, 0x2

    aput-object v8, v12, v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v11, 0x1

    aput-object v8, v12, v11

    const/4 v8, 0x0

    aput-object v1, v12, v8

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v8, 0x16

    aget-byte v8, v1, v8

    int-to-byte v8, v8

    move/from16 v30, v4

    const/16 v11, 0xc3

    aget-byte v4, v1, v11

    int-to-byte v4, v4

    sget v11, Lcom/appsflyer/internal/AFa1vSDK;->onResponseErrorNative:I

    and-int/lit16 v11, v11, 0x3e6

    int-to-short v11, v11

    invoke-static {v8, v4, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_5b

    const/4 v8, 0x3

    :try_start_3e
    new-array v11, v8, [Ljava/lang/Class;
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_5c

    const/4 v8, 0x0

    :try_start_3f
    aput-object v18, v11, v8

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x1

    aput-object v8, v11, v23

    const/16 v28, 0x2

    aput-object v8, v11, v28

    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v46, v4

    check-cast v46, Ljava/io/InputStream;
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_5b

    :try_start_40
    sget-object v4, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_5a

    if-nez v4, :cond_2e

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v4, v4, 0x69

    rem-int/lit16 v8, v4, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v8, 0x2

    rem-int/2addr v4, v8

    if-nez v4, :cond_2c

    :try_start_41
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v4
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_7

    add-int/lit8 v4, v4, -0x2e

    const v8, 0xa57a422

    sub-int/2addr v8, v4

    move/from16 v51, v8

    const/16 v4, 0x41

    const/4 v8, 0x1

    goto :goto_27

    :cond_2c
    :try_start_42
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v4
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_18

    const/16 v8, 0x10

    shr-int/2addr v4, v8

    neg-int v4, v4

    neg-int v4, v4

    const v8, 0xa57a422

    xor-int v11, v4, v8

    and-int/2addr v4, v8

    const/4 v8, 0x1

    shl-int/2addr v4, v8

    add-int/2addr v11, v4

    move/from16 v51, v11

    const/16 v4, 0x9

    :goto_27
    :try_start_43
    new-array v11, v8, [Ljava/lang/Object;

    const-string v8, ""

    const/4 v12, 0x0

    aput-object v8, v11, v12

    const/16 v8, 0x22

    aget-byte v8, v1, v8

    int-to-byte v8, v8

    move-object/from16 v40, v13

    const/16 v12, 0x5a

    aget-byte v13, v1, v12
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_17

    int-to-byte v13, v13

    move-object/from16 v42, v7

    int-to-short v7, v12

    :try_start_44
    invoke-static {v8, v13, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v8, 0xb

    aget-byte v12, v1, v8

    int-to-byte v8, v12

    const/16 v12, 0x10

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    const/16 v13, 0x268

    int-to-short v13, v13

    invoke-static {v8, v12, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v3, v13, v12

    invoke-virtual {v7, v8, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_16

    neg-int v7, v7

    neg-int v7, v7

    and-int v8, v4, v7

    or-int/2addr v4, v7

    add-int/2addr v8, v4

    int-to-short v4, v8

    :try_start_45
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v7

    const-wide/16 v11, 0x0

    cmp-long v7, v7, v11

    neg-int v7, v7

    const v8, -0x4e9a8982

    or-int v11, v7, v8

    const/4 v12, 0x1

    shl-int/2addr v11, v12

    xor-int/2addr v7, v8

    sub-int v48, v11, v7

    new-instance v7, Lcom/appsflyer/internal/AFf1aSDK;

    sget v47, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionDataLoadedNative:I

    sget v50, Lcom/appsflyer/internal/AFa1vSDK;->AppsFlyer2dXConversionCallback:I

    move-object/from16 v45, v7

    move/from16 v49, v4

    invoke-direct/range {v45 .. v51}, Lcom/appsflyer/internal/AFf1aSDK;-><init>(Ljava/io/InputStream;IISII)V

    move/from16 v21, v2

    move-object/from16 v47, v5

    move/from16 v45, v10

    goto/16 :goto_2b

    :catchall_15
    move-exception v0

    :goto_28
    move-object v1, v0

    goto/16 :goto_1c

    :catchall_16
    move-exception v0

    :goto_29
    move-object v1, v0

    goto :goto_2a

    :catchall_17
    move-exception v0

    move-object/from16 v42, v7

    goto :goto_29

    :goto_2a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2d

    throw v2

    :cond_2d
    throw v1
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_15

    :catchall_18
    move-exception v0

    move-object/from16 v42, v7

    goto :goto_28

    :cond_2e
    move-object/from16 v42, v7

    move-object/from16 v40, v13

    :try_start_46
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v11
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_59

    const-wide/16 v47, 0x0

    cmp-long v7, v11, v47

    and-int/lit8 v11, v7, 0x3

    const/4 v12, 0x3

    or-int/2addr v7, v12

    add-int/2addr v11, v7

    const/16 v7, 0x32

    :try_start_47
    aget-byte v12, v1, v7

    int-to-byte v7, v12

    const/16 v12, 0x5a

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    const/16 v13, 0x22a

    int-to-short v13, v13

    invoke-static {v7, v12, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v12, 0x34

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    const/16 v13, 0x22

    aget-byte v13, v1, v13
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_58

    int-to-byte v13, v13

    move/from16 v45, v10

    const/16 v10, 0x7d

    int-to-short v10, v10

    :try_start_48
    invoke-static {v12, v13, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v12, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v12
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_57

    const-wide/16 v47, 0x0

    cmp-long v7, v12, v47

    neg-int v7, v7

    neg-int v7, v7

    const v10, -0x3663d88f

    xor-int v12, v7, v10

    and-int/2addr v7, v10

    const/4 v10, 0x1

    shl-int/2addr v7, v10

    add-int/2addr v12, v7

    const/16 v7, 0x10

    :try_start_49
    new-array v7, v7, [B

    fill-array-data v7, :array_3
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_56

    const/4 v10, 0x4

    :try_start_4a
    new-array v13, v10, [Ljava/lang/Object;
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_52

    const/4 v10, 0x3

    :try_start_4b
    aput-object v7, v13, v10
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_55

    :try_start_4c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v10, 0x2

    aput-object v7, v13, v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v10, 0x1

    aput-object v7, v13, v10

    const/4 v7, 0x0

    aput-object v46, v13, v7

    const/16 v7, 0xe

    aget-byte v10, v1, v7
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_52

    int-to-byte v7, v10

    const/16 v10, 0x1c4

    :try_start_4d
    aget-byte v11, v1, v10
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_54

    int-to-byte v10, v11

    xor-int/lit16 v11, v10, 0x343

    and-int/lit16 v12, v10, 0x343

    or-int/2addr v11, v12

    int-to-short v11, v11

    :try_start_4e
    invoke-static {v7, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    sget-object v10, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;

    check-cast v10, Ljava/lang/ClassLoader;

    const/4 v11, 0x1

    invoke-static {v7, v11, v10}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_52

    const/16 v10, 0x1c4

    :try_start_4f
    aget-byte v11, v1, v10
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_54

    int-to-byte v10, v11

    const/16 v11, 0xc

    :try_start_50
    aget-byte v11, v1, v11

    int-to-byte v11, v11

    const/16 v12, 0x14d

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    new-array v12, v11, [Ljava/lang/Class;

    const/16 v21, 0x60

    aget-byte v11, v1, v21

    int-to-byte v11, v11

    move-object/from16 v47, v5

    const/16 v21, 0xc3

    aget-byte v5, v1, v21

    int-to-byte v5, v5

    move/from16 v21, v2

    const/16 v2, 0x3e4

    int-to-short v2, v2

    invoke-static {v11, v5, v2}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v12, v5

    const/4 v2, 0x1

    aput-object v8, v12, v2

    const/4 v2, 0x2

    aput-object v8, v12, v2
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_52

    const/4 v2, 0x3

    :try_start_51
    aput-object v18, v12, v2
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_53

    :try_start_52
    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/io/InputStream;
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_52

    :goto_2b
    const/16 v2, 0x11

    int-to-long v4, v2

    const/4 v2, 0x1

    :try_start_53
    new-array v8, v2, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v8, v4

    const/16 v2, 0x60

    aget-byte v4, v1, v2

    int-to-byte v2, v4

    const/16 v4, 0xc3

    aget-byte v5, v1, v4

    int-to-byte v4, v5

    const/16 v5, 0x3e4

    int-to-short v5, v5

    invoke-static {v2, v4, v5}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v4, 0x1e9

    aget-byte v10, v1, v4

    int-to-byte v4, v10

    const/16 v10, 0x4a

    aget-byte v10, v1, v10

    int-to-byte v10, v10

    xor-int/lit16 v11, v10, 0x23b

    and-int/lit16 v12, v10, 0x23b

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v4, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Class;

    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v10, v11, v12

    invoke-virtual {v2, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_51

    if-eqz v15, :cond_42

    :try_start_54
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_2f

    if-nez v2, :cond_2f

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v4, v4, 0x4b

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    move-object/from16 v4, v43

    goto :goto_2c

    :cond_2f
    move-object/from16 v4, v44

    :goto_2c
    if-nez v2, :cond_30

    move-object/from16 v2, v40

    goto :goto_2d

    :cond_30
    move-object/from16 v2, v38

    :goto_2d
    sget v8, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    or-int/lit8 v10, v8, 0x65

    const/4 v11, 0x1

    shl-int/2addr v10, v11

    xor-int/lit8 v8, v8, 0x65

    sub-int/2addr v10, v8

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    :try_start_55
    new-array v8, v11, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v8, v10

    const/16 v10, 0x51

    aget-byte v11, v1, v10

    int-to-byte v10, v11

    const/16 v11, 0xc3

    aget-byte v12, v1, v11

    int-to-byte v11, v12

    xor-int/lit16 v12, v11, 0x2e0

    and-int/lit16 v13, v11, 0x2e0

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v11, 0x5

    aget-byte v13, v1, v11

    int-to-byte v11, v13

    const/16 v13, 0xc3

    aget-byte v1, v1, v13

    int-to-byte v1, v1

    invoke-static {v11, v1, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v11, 0x0

    aput-object v1, v12, v11

    invoke-virtual {v10, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_2a

    const/16 v8, 0x400

    :try_start_56
    new-array v10, v8, [B
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_29

    move/from16 v11, v30

    :goto_2e
    if-lez v11, :cond_33

    :try_start_57
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v12
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_1a

    const/4 v13, 0x3

    :try_start_58
    new-array v8, v13, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x2

    aput-object v12, v8, v13

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v23, 0x1

    aput-object v13, v8, v23

    aput-object v10, v8, v12

    sget-object v12, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    move-object/from16 v48, v6

    const/16 v13, 0x60

    aget-byte v6, v12, v13

    int-to-byte v6, v6

    move/from16 v49, v15

    const/16 v13, 0xc3

    aget-byte v15, v12, v13

    int-to-byte v13, v15

    invoke-static {v6, v13, v5}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v13, 0x1e9

    aget-byte v15, v12, v13

    int-to-byte v13, v15

    move/from16 v50, v5

    const/16 v15, 0x15

    aget-byte v5, v12, v15

    int-to-byte v5, v5

    const/16 v15, 0x100

    int-to-short v15, v15

    invoke-static {v13, v5, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v13, 0x3

    new-array v15, v13, [Ljava/lang/Class;

    const/4 v13, 0x0

    aput-object v18, v15, v13

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x1

    aput-object v13, v15, v23

    const/16 v28, 0x2

    aput-object v13, v15, v28

    invoke-virtual {v6, v5, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_1b

    const/4 v8, -0x1

    if-eq v6, v8, :cond_34

    sget v8, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v8, v8, 0x45

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v8, 0x3

    :try_start_59
    new-array v15, v8, [Ljava/lang/Object;

    const/4 v8, 0x2

    aput-object v5, v15, v8

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v23, 0x1

    aput-object v8, v15, v23

    aput-object v10, v15, v5

    const/16 v5, 0x51

    aget-byte v8, v12, v5

    int-to-byte v5, v8

    move-object/from16 v51, v10

    const/16 v8, 0xc3

    aget-byte v10, v12, v8

    int-to-byte v8, v10

    xor-int/lit16 v10, v8, 0x2e0

    move-object/from16 v52, v7

    and-int/lit16 v7, v8, 0x2e0

    or-int/2addr v7, v10

    int-to-short v7, v7

    invoke-static {v5, v8, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v7, v12, v32

    int-to-byte v7, v7

    aget-byte v8, v12, v16

    int-to-byte v8, v8

    or-int/lit16 v10, v8, 0xf2

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    new-array v10, v8, [Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v18, v10, v8

    const/4 v8, 0x1

    aput-object v13, v10, v8

    const/4 v8, 0x2

    aput-object v13, v10, v8

    invoke-virtual {v5, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v1, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_19

    sub-int/2addr v11, v6

    move-object/from16 v6, v48

    move/from16 v15, v49

    move/from16 v5, v50

    move-object/from16 v10, v51

    move-object/from16 v7, v52

    const/16 v8, 0x400

    goto/16 :goto_2e

    :catchall_19
    move-exception v0

    move-object v1, v0

    :try_start_5a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_31

    throw v5

    :catchall_1a
    move-exception v0

    move-object v1, v0

    const/16 v7, 0x32

    const/16 v10, 0x34

    goto/16 :goto_38

    :cond_31
    throw v1

    :catchall_1b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_32

    throw v5

    :cond_32
    throw v1
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_1a

    :cond_33
    move/from16 v50, v5

    move-object/from16 v48, v6

    move/from16 v49, v15

    :cond_34
    :try_start_5b
    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v6, 0x51

    aget-byte v7, v5, v6

    int-to-byte v6, v7

    const/16 v7, 0xc3

    aget-byte v8, v5, v7

    int-to-byte v7, v8

    xor-int/lit16 v8, v7, 0x2e0

    and-int/lit16 v10, v7, 0x2e0

    or-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v5, v32

    int-to-byte v7, v7

    const/16 v8, 0x10

    aget-byte v10, v5, v8

    int-to-byte v8, v10

    xor-int/lit16 v10, v8, 0x24e

    and-int/lit16 v11, v8, 0x24e

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_28

    const/16 v7, 0x32

    :try_start_5c
    aget-byte v8, v5, v7

    int-to-byte v8, v8

    const/16 v10, 0xc3

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    const/16 v11, 0x377

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v10, 0x1e9

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    const/16 v11, 0x4a

    aget-byte v11, v5, v11

    int-to-byte v11, v11

    xor-int/lit16 v12, v11, 0x158

    and-int/lit16 v13, v11, 0x158

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v8, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_27

    const/16 v6, 0x51

    :try_start_5d
    aget-byte v8, v5, v6

    int-to-byte v6, v8

    const/16 v8, 0xc3

    aget-byte v10, v5, v8

    int-to-byte v8, v10

    xor-int/lit16 v10, v8, 0x2e0

    and-int/lit16 v11, v8, 0x2e0

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v6, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v5, v32

    int-to-byte v8, v8

    const/16 v10, 0x1c4

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    const/16 v11, 0x28c

    int-to-short v12, v11

    invoke-static {v8, v10, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v6, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v1, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_26

    const/16 v1, 0x1d

    :try_start_5e
    aget-byte v6, v5, v1

    int-to-byte v1, v6

    const/16 v6, 0x280

    aget-byte v8, v5, v6

    int-to-byte v6, v8

    const/16 v8, 0x103

    int-to-short v10, v8

    invoke-static {v1, v6, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v6, 0x15c

    aget-byte v6, v5, v6

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v8, 0x4c

    aget-byte v8, v5, v8

    int-to-byte v8, v8

    const/16 v10, 0x1f3

    int-to-short v10, v10

    invoke-static {v6, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x3

    new-array v10, v8, [Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v3, v10, v8

    const/4 v8, 0x1

    aput-object v3, v10, v8

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v11, 0x2

    aput-object v8, v10, v11

    invoke-virtual {v1, v6, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v6, 0x3

    new-array v8, v6, [Ljava/lang/Object;
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_23

    sget v6, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    and-int/lit8 v10, v6, 0xd

    or-int/lit8 v6, v6, 0xd

    add-int/2addr v10, v6

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v6, 0x5

    :try_start_5f
    aget-byte v10, v5, v6

    int-to-byte v6, v10

    const/16 v10, 0xc3

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    invoke-static {v6, v10, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_24

    const/16 v10, 0x34

    :try_start_60
    aget-byte v11, v5, v10
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_25

    int-to-byte v10, v11

    const/16 v11, 0x10

    :try_start_61
    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0x2c0

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v6, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_24

    const/4 v10, 0x0

    :try_start_62
    aput-object v6, v8, v10
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_23

    const/4 v6, 0x5

    :try_start_63
    aget-byte v10, v5, v6

    int-to-byte v6, v10

    const/16 v10, 0xc3

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    invoke-static {v6, v10, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_22

    const/16 v10, 0x34

    :try_start_64
    aget-byte v11, v5, v10

    int-to-byte v11, v11

    const/16 v13, 0x10

    aget-byte v15, v5, v13

    int-to-byte v13, v15

    invoke-static {v11, v13, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v6, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v2, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_21

    const/4 v11, 0x1

    :try_start_65
    aput-object v6, v8, v11

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v6, 0x2

    aput-object v11, v8, v6

    invoke-virtual {v1, v12, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_20

    const/4 v6, 0x5

    :try_start_66
    aget-byte v8, v5, v6

    int-to-byte v6, v8

    const/16 v8, 0xc3

    aget-byte v11, v5, v8

    int-to-byte v8, v11

    invoke-static {v6, v8, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v8, 0x36

    aget-byte v8, v5, v8

    int-to-byte v8, v8

    const/16 v11, 0x280

    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0x259

    int-to-short v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v6, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_1f

    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    add-int/lit8 v4, v4, 0x69

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v4, 0x5

    :try_start_67
    aget-byte v6, v5, v4

    int-to-byte v4, v6

    const/16 v6, 0xc3

    aget-byte v8, v5, v6

    int-to-byte v6, v8

    invoke-static {v4, v6, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v6, 0x36

    aget-byte v6, v5, v6

    int-to-byte v6, v6

    const/16 v8, 0x280

    aget-byte v11, v5, v8

    int-to-byte v8, v11

    invoke-static {v6, v8, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_1e

    :try_start_68
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_1c

    if-nez v2, :cond_36

    :try_start_69
    const-class v2, Ljava/lang/Class;

    const/16 v4, 0x5a

    aget-byte v6, v5, v4

    int-to-byte v4, v6

    const/16 v6, 0x10

    aget-byte v5, v5, v6

    int-to-byte v5, v5

    const/16 v6, 0x242

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v9, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_1d

    :try_start_6a
    sput-object v2, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_1c

    sget v2, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    and-int/lit8 v4, v2, 0xd

    or-int/lit8 v2, v2, 0xd

    add-int/2addr v4, v2

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    goto :goto_30

    :catchall_1c
    move-exception v0

    :goto_2f
    move-object v1, v0

    goto/16 :goto_14

    :catchall_1d
    move-exception v0

    move-object v1, v0

    :try_start_6b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_35

    throw v2

    :cond_35
    throw v1

    :cond_36
    :goto_30
    move/from16 v30, v14

    move/from16 v13, v50

    const/16 v14, 0x41

    const/4 v15, 0x3

    goto/16 :goto_45

    :catchall_1e
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_37

    throw v2

    :cond_37
    throw v1

    :catchall_1f
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_38

    throw v2

    :cond_38
    throw v1
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_1c

    :catchall_20
    move-exception v0

    :goto_31
    move-object v1, v0

    goto/16 :goto_38

    :catchall_21
    move-exception v0

    :goto_32
    move-object v1, v0

    goto :goto_33

    :catchall_22
    move-exception v0

    const/16 v10, 0x34

    goto :goto_32

    :goto_33
    :try_start_6c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_39

    throw v5

    :cond_39
    throw v1

    :catchall_23
    move-exception v0

    :goto_34
    const/16 v10, 0x34

    goto :goto_31

    :catchall_24
    move-exception v0

    const/16 v10, 0x34

    :goto_35
    move-object v1, v0

    goto :goto_36

    :catchall_25
    move-exception v0

    goto :goto_35

    :goto_36
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3a

    throw v5

    :cond_3a
    throw v1

    :catchall_26
    move-exception v0

    const/16 v10, 0x34

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3b

    throw v5

    :cond_3b
    throw v1

    :catchall_27
    move-exception v0

    const/16 v10, 0x34

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3c

    throw v5

    :cond_3c
    throw v1

    :catchall_28
    move-exception v0

    const/16 v7, 0x32

    const/16 v10, 0x34

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3d

    throw v5

    :cond_3d
    throw v1
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_20

    :catchall_29
    move-exception v0

    const/16 v7, 0x32

    goto :goto_34

    :catchall_2a
    move-exception v0

    const/16 v7, 0x32

    const/16 v10, 0x34

    move-object v1, v0

    :try_start_6d
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3e

    throw v5

    :catch_8
    move-exception v0

    move-object v1, v0

    goto :goto_37

    :cond_3e
    throw v1
    :try_end_6d
    .catch Ljava/lang/Exception; {:try_start_6d .. :try_end_6d} :catch_8
    .catchall {:try_start_6d .. :try_end_6d} :catchall_20

    :goto_37
    :try_start_6e
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v8, v6, v32

    int-to-byte v8, v8

    const/16 v11, 0x54

    aget-byte v12, v6, v11

    int-to-byte v11, v12

    const/16 v12, 0x179

    int-to-short v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x376

    aget-byte v8, v6, v8

    neg-int v8, v8

    int-to-byte v8, v8

    const/16 v11, 0x174

    aget-byte v11, v6, v11

    const/4 v12, 0x1

    sub-int/2addr v11, v12

    int-to-byte v11, v11

    const/16 v12, 0x103

    int-to-short v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_20

    const/4 v8, 0x2

    :try_start_6f
    new-array v11, v8, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v11, v8

    const/4 v5, 0x1

    aput-object v1, v11, v5

    const/16 v1, 0x60

    aget-byte v5, v6, v1

    int-to-byte v1, v5

    const/16 v5, 0xc3

    aget-byte v6, v6, v5

    int-to-byte v5, v6

    const/16 v6, 0x30b

    int-to-short v8, v6

    invoke-static {v1, v5, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v3, v6, v5

    const-class v5, Ljava/lang/Throwable;

    const/4 v8, 0x1

    aput-object v5, v6, v8

    invoke-virtual {v1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_2b

    :catchall_2b
    move-exception v0

    move-object v1, v0

    :try_start_70
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3f

    throw v5

    :cond_3f
    throw v1
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_20

    :goto_38
    :try_start_71
    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_2d

    const/4 v6, 0x5

    :try_start_72
    aget-byte v8, v5, v6
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_2e

    int-to-byte v6, v8

    const/16 v8, 0xc3

    :try_start_73
    aget-byte v11, v5, v8

    int-to-byte v8, v11

    invoke-static {v6, v8, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v8, 0x36

    aget-byte v8, v5, v8

    int-to-byte v8, v8

    const/16 v11, 0x280

    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0x259

    int-to-short v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v6, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_2d

    const/4 v4, 0x5

    :try_start_74
    aget-byte v6, v5, v4

    int-to-byte v6, v6

    const/16 v8, 0xc3

    aget-byte v11, v5, v8

    int-to-byte v8, v11

    invoke-static {v6, v8, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v8, 0x36

    aget-byte v8, v5, v8

    int-to-byte v8, v8

    const/16 v11, 0x280

    aget-byte v5, v5, v11

    int-to-byte v5, v5

    invoke-static {v8, v5, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-virtual {v6, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_2c

    :try_start_75
    throw v1

    :catchall_2c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_40

    throw v2

    :cond_40
    throw v1

    :catchall_2d
    move-exception v0

    const/4 v4, 0x5

    :goto_39
    move-object v1, v0

    goto :goto_3a

    :catchall_2e
    move-exception v0

    move v4, v6

    goto :goto_39

    :goto_3a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_41

    throw v2

    :cond_41
    throw v1
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_1c

    :catchall_2f
    move-exception v0

    const/4 v4, 0x5

    const/16 v7, 0x32

    const/16 v10, 0x34

    goto/16 :goto_2f

    :cond_42
    move/from16 v50, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v7

    move/from16 v49, v15

    const/4 v4, 0x5

    const/16 v7, 0x32

    const/16 v10, 0x34

    :try_start_76
    new-instance v2, Ljava/util/zip/ZipInputStream;

    move-object/from16 v5, v52

    invoke-direct {v2, v5}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v5
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_4e

    sget v6, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v6, v6, 0x61

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v6, 0x1

    :try_start_77
    new-array v8, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v8, v6

    const/16 v2, 0x9

    aget-byte v6, v1, v2

    int-to-byte v2, v6

    const/16 v6, 0xc3

    aget-byte v11, v1, v6

    int-to-byte v6, v11

    aget-byte v11, v1, v16

    int-to-short v11, v11

    invoke-static {v2, v6, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v6, 0x1

    new-array v11, v6, [Ljava/lang/Class;

    const/16 v6, 0x60

    aget-byte v12, v1, v6

    int-to-byte v6, v12

    const/16 v12, 0xc3

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    move/from16 v13, v50

    invoke-static {v6, v12, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v12, 0x0

    aput-object v6, v11, v12

    invoke-virtual {v2, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_50

    const/16 v6, 0x66

    :try_start_78
    aget-byte v8, v1, v6

    int-to-byte v6, v8

    const/16 v8, 0xc3

    aget-byte v1, v1, v8

    int-to-byte v1, v1

    const/16 v8, 0x1f9

    int-to-short v8, v8

    invoke-static {v6, v1, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_4f

    const/16 v6, 0x400

    :try_start_79
    new-array v6, v6, [B
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_4e

    const/4 v11, 0x0

    :goto_3b
    const/4 v12, 0x1

    :try_start_7a
    new-array v15, v12, [Ljava/lang/Object;
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_4c

    const/4 v12, 0x0

    :try_start_7b
    aput-object v6, v15, v12
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_4d

    :try_start_7c
    sget-object v12, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v19, 0x9

    aget-byte v4, v12, v19

    int-to-byte v4, v4

    const/16 v19, 0xc3

    aget-byte v7, v12, v19

    int-to-byte v7, v7

    aget-byte v10, v12, v16

    int-to-short v10, v10

    invoke-static {v4, v7, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v7, 0x1e9

    aget-byte v10, v12, v7
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_4c

    int-to-byte v7, v10

    move/from16 v30, v14

    const/16 v10, 0x15

    :try_start_7d
    aget-byte v14, v12, v10
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_4b

    int-to-byte v10, v14

    const/16 v14, 0x100

    int-to-short v14, v14

    :try_start_7e
    invoke-static {v7, v10, v14}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x1

    new-array v14, v10, [Ljava/lang/Class;

    const/4 v10, 0x0

    aput-object v18, v14, v10

    invoke-virtual {v4, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v2, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_4a

    if-lez v7, :cond_44

    int-to-long v14, v11

    :try_start_7f
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v50
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_34

    cmp-long v10, v14, v50

    if-gez v10, :cond_44

    const/4 v10, 0x3

    :try_start_80
    new-array v14, v10, [Ljava/lang/Object;
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_32

    const/4 v10, 0x2

    :try_start_81
    aput-object v4, v14, v10

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v15, 0x1

    aput-object v10, v14, v15

    aput-object v6, v14, v4

    const/16 v4, 0x66

    aget-byte v10, v12, v4

    int-to-byte v4, v10

    const/16 v10, 0xc3

    aget-byte v15, v12, v10

    int-to-byte v10, v15

    invoke-static {v4, v10, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v10, v12, v32

    int-to-byte v10, v10

    aget-byte v12, v12, v16

    int-to-byte v12, v12

    or-int/lit16 v15, v12, 0xf2

    int-to-short v15, v15

    invoke-static {v10, v12, v15}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_31

    const/4 v15, 0x3

    :try_start_82
    new-array v12, v15, [Ljava/lang/Class;

    const/16 v22, 0x0

    aput-object v18, v12, v22

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v23, 0x1

    aput-object v22, v12, v23

    const/16 v28, 0x2

    aput-object v22, v12, v28

    invoke-virtual {v4, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v1, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_30

    add-int/2addr v11, v7

    move/from16 v14, v30

    const/4 v4, 0x5

    const/16 v7, 0x32

    const/16 v10, 0x34

    goto/16 :goto_3b

    :catchall_30
    move-exception v0

    :goto_3c
    move-object v1, v0

    goto :goto_3d

    :catchall_31
    move-exception v0

    const/4 v15, 0x3

    goto :goto_3c

    :catchall_32
    move-exception v0

    move v15, v10

    goto :goto_3c

    :goto_3d
    :try_start_83
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_43

    throw v2

    :catchall_33
    move-exception v0

    :goto_3e
    move-object v1, v0

    const/4 v2, 0x1

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    goto/16 :goto_64

    :cond_43
    throw v1
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_33

    :cond_44
    const/4 v15, 0x3

    goto :goto_3f

    :catchall_34
    move-exception v0

    const/4 v15, 0x3

    goto :goto_3e

    :goto_3f
    sget v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v4, v4, 0x17

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/16 v4, 0x66

    :try_start_84
    aget-byte v5, v12, v4

    int-to-byte v4, v5

    const/16 v5, 0xc3

    aget-byte v6, v12, v5

    int-to-byte v5, v6

    invoke-static {v4, v5, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0x114

    aget-byte v6, v12, v5

    int-to-byte v6, v6

    const/16 v7, 0xe

    aget-byte v10, v12, v7

    int-to-byte v7, v10

    const/16 v10, 0x38c

    int-to-short v10, v10

    invoke-static {v6, v7, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_49

    const/16 v6, 0x9

    :try_start_85
    aget-byte v7, v12, v6

    int-to-byte v6, v7

    const/16 v7, 0xc3

    aget-byte v10, v12, v7

    int-to-byte v7, v10

    aget-byte v10, v12, v16

    int-to-short v10, v10

    invoke-static {v6, v7, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v12, v32

    int-to-byte v7, v7

    const/16 v10, 0x1c4

    aget-byte v11, v12, v10

    int-to-byte v10, v11

    const/16 v11, 0x28c

    int-to-short v12, v11

    invoke-static {v7, v10, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v6, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_85
    .catchall {:try_start_85 .. :try_end_85} :catchall_35

    goto :goto_40

    :catchall_35
    move-exception v0

    move-object v2, v0

    :try_start_86
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_45

    throw v6

    :cond_45
    throw v2
    :try_end_86
    .catch Ljava/io/IOException; {:try_start_86 .. :try_end_86} :catch_9
    .catchall {:try_start_86 .. :try_end_86} :catchall_33

    :catch_9
    :goto_40
    :try_start_87
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v6, 0x66

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0xc3

    aget-byte v10, v2, v7

    int-to-byte v7, v10

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v2, v32

    int-to-byte v7, v7

    const/16 v8, 0x1c4

    aget-byte v2, v2, v8

    int-to-byte v2, v2

    const/16 v8, 0x28c

    int-to-short v10, v8

    invoke-static {v7, v2, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v6, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_36

    goto :goto_41

    :catchall_36
    move-exception v0

    move-object v1, v0

    :try_start_88
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_46

    throw v2

    :cond_46
    throw v1
    :try_end_88
    .catch Ljava/io/IOException; {:try_start_88 .. :try_end_88} :catch_a
    .catchall {:try_start_88 .. :try_end_88} :catchall_33

    :catch_a
    :goto_41
    :try_start_89
    const-class v1, Ljava/lang/Class;

    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v6, 0x5a

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0x10

    aget-byte v8, v2, v7

    int-to-byte v7, v8

    const/16 v8, 0x242

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_89
    .catchall {:try_start_89 .. :try_end_89} :catchall_48

    :try_start_8a
    aget-byte v6, v2, v16

    int-to-byte v6, v6

    const/16 v7, 0x280

    aget-byte v8, v2, v7

    int-to-byte v7, v8

    sget v8, Lcom/appsflyer/internal/AFa1vSDK;->onResponseErrorNative:I

    const/4 v10, 0x2

    add-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    new-array v7, v10, [Ljava/lang/Class;

    const/16 v8, 0x60

    aget-byte v10, v2, v8

    int-to-byte v8, v10

    const/16 v10, 0xc3

    aget-byte v11, v2, v10

    int-to-byte v10, v11

    const/16 v11, 0x6b

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v10, 0x0

    aput-object v8, v7, v10

    const/16 v8, 0x1d

    aget-byte v10, v2, v8

    int-to-byte v8, v10

    const/16 v10, 0xc3

    aget-byte v12, v2, v10

    int-to-byte v10, v12

    const/16 v12, 0x181

    int-to-short v12, v12

    invoke-static {v8, v10, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v10, 0x1

    aput-object v8, v7, v10

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Object;
    :try_end_8a
    .catchall {:try_start_8a .. :try_end_8a} :catchall_45

    :try_start_8b
    new-array v7, v10, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v7, v10

    const/16 v4, 0x60

    aget-byte v10, v2, v4

    int-to-byte v4, v10

    const/16 v10, 0xc3

    aget-byte v12, v2, v10

    int-to-byte v10, v12

    invoke-static {v4, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v10, 0x1e9

    aget-byte v11, v2, v10

    int-to-byte v11, v11

    aget-byte v12, v2, v16

    int-to-byte v12, v12

    xor-int/lit16 v14, v12, 0x3ca

    and-int/lit16 v5, v12, 0x3ca

    or-int/2addr v5, v14

    int-to-short v5, v5

    invoke-static {v11, v12, v5}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v14, 0x0

    aput-object v18, v12, v14

    invoke-virtual {v4, v5, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_47

    :try_start_8c
    aput-object v4, v8, v14

    aput-object v1, v8, v11

    invoke-virtual {v6, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_45

    const/16 v5, 0x4a

    :try_start_8d
    aget-byte v5, v2, v5

    int-to-byte v5, v5

    const/16 v6, 0x280

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0x120

    int-to-short v7, v7

    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v6, 0xb5

    aget-byte v7, v2, v6

    add-int/lit8 v7, v7, 0x1

    int-to-byte v6, v7

    const/16 v7, 0x66

    aget-byte v8, v2, v7

    int-to-byte v8, v8

    const/16 v11, 0x31d

    int-to-short v11, v11

    invoke-static {v6, v8, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    const/16 v11, 0x51

    aget-byte v12, v2, v11

    int-to-byte v12, v12

    const/16 v14, 0x9

    aget-byte v7, v2, v14

    int-to-byte v7, v7

    xor-int/lit16 v14, v7, 0x3c4

    and-int/lit16 v10, v7, 0x3c4

    or-int/2addr v10, v14

    int-to-short v10, v10

    invoke-static {v12, v7, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v10, 0x1

    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v10, 0x4c

    aget-byte v10, v2, v10

    int-to-byte v10, v10

    const/16 v12, 0x9

    aget-byte v2, v2, v12

    int-to-byte v2, v2

    const/16 v12, 0x274

    int-to-short v12, v12

    invoke-static {v10, v2, v12}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    new-instance v10, Ljava/util/ArrayList;

    check-cast v8, Ljava/util/List;

    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v12

    invoke-static {v8, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8
    :try_end_8d
    .catch Ljava/lang/Exception; {:try_start_8d .. :try_end_8d} :catch_f
    .catchall {:try_start_8d .. :try_end_8d} :catchall_45

    const/4 v14, 0x0

    :goto_42
    if-ge v14, v12, :cond_47

    :try_start_8e
    invoke-static {v6, v14}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8, v14, v11}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_8e
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_8e} :catch_b
    .catchall {:try_start_8e .. :try_end_8e} :catchall_37

    xor-int/lit8 v11, v14, -0x40

    and-int/lit8 v14, v14, -0x40

    const/16 v22, 0x1

    shl-int/lit8 v14, v14, 0x1

    add-int/2addr v11, v14

    const/16 v14, 0x41

    and-int/lit8 v17, v11, 0x41

    or-int/2addr v11, v14

    add-int v11, v17, v11

    move v14, v11

    const/16 v11, 0x51

    goto :goto_42

    :catchall_37
    move-exception v0

    const/16 v14, 0x41

    :goto_43
    move-object v1, v0

    const/4 v2, 0x1

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    goto/16 :goto_64

    :catch_b
    move-exception v0

    const/16 v14, 0x41

    move-object v2, v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    goto/16 :goto_51

    :cond_47
    const/16 v14, 0x41

    :try_start_8f
    invoke-virtual {v7, v5, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v5, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8f
    .catch Ljava/lang/Exception; {:try_start_8f .. :try_end_8f} :catch_e
    .catchall {:try_start_8f .. :try_end_8f} :catchall_43

    :try_start_90
    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;
    :try_end_90
    .catchall {:try_start_90 .. :try_end_90} :catchall_43

    if-nez v1, :cond_48

    :try_start_91
    sput-object v4, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_38

    goto :goto_44

    :catchall_38
    move-exception v0

    goto :goto_43

    :cond_48
    :goto_44
    move-object v1, v4

    :goto_45
    if-eqz v49, :cond_4b

    :try_start_92
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v4, 0x1d

    aget-byte v5, v2, v4

    int-to-byte v4, v5

    const/16 v5, 0x280

    aget-byte v6, v2, v5

    int-to-byte v6, v6

    const/16 v7, 0x103

    int-to-short v8, v7

    invoke-static {v4, v6, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v6, 0xb5

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0x4c

    aget-byte v7, v2, v7

    int-to-byte v7, v7

    const/16 v8, 0x396

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Class;

    const/4 v7, 0x0

    aput-object v3, v8, v7

    const/16 v7, 0x1d

    aget-byte v10, v2, v7

    int-to-byte v7, v10

    const/16 v10, 0xc3

    aget-byte v11, v2, v10

    int-to-byte v10, v11

    const/16 v11, 0x181

    int-to-short v11, v11

    invoke-static {v7, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/4 v10, 0x1

    aput-object v7, v8, v10

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v48, v8, v7
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_3b

    :try_start_93
    const-class v7, Ljava/lang/Class;

    const/16 v10, 0x5a

    aget-byte v11, v2, v10
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_3a

    int-to-byte v11, v11

    const/16 v12, 0x10

    :try_start_94
    aget-byte v5, v2, v12

    int-to-byte v5, v5

    const/16 v10, 0x242

    int-to-short v10, v10

    invoke-static {v11, v5, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v7, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_39

    const/4 v7, 0x1

    :try_start_95
    aput-object v5, v8, v7

    invoke-virtual {v6, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_49

    aget-byte v6, v2, v32

    int-to-byte v6, v6

    const/16 v7, 0x1c4

    aget-byte v2, v2, v7

    int-to-byte v2, v2

    const/16 v7, 0x28c

    int-to-short v8, v7

    invoke-static {v6, v2, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v7, v6, [Ljava/lang/Class;

    invoke-virtual {v4, v2, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_49
    move-object v2, v5

    const/16 v4, 0x1d

    goto :goto_49

    :catchall_39
    move-exception v0

    :goto_46
    move-object v1, v0

    goto :goto_47

    :catchall_3a
    move-exception v0

    const/16 v12, 0x10

    goto :goto_46

    :goto_47
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4a

    throw v2

    :cond_4a
    throw v1
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_38

    :catchall_3b
    move-exception v0

    const/16 v12, 0x10

    goto/16 :goto_43

    :cond_4b
    const/16 v12, 0x10

    :try_start_96
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v4, 0x1d

    aget-byte v5, v2, v4

    int-to-byte v5, v5

    const/16 v6, 0xc3

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0x181

    int-to-short v7, v7

    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v6, 0xb5

    aget-byte v7, v2, v6

    int-to-byte v6, v7

    const/16 v7, 0x4c

    aget-byte v2, v2, v7

    int-to-byte v2, v2

    const/16 v7, 0x396

    int-to-short v7, v7

    invoke-static {v6, v2, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    invoke-virtual {v5, v2, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_43

    :try_start_97
    new-array v5, v6, [Ljava/lang/Object;

    aput-object v48, v5, v8
    :try_end_97
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_97 .. :try_end_97} :catch_c
    .catchall {:try_start_97 .. :try_end_97} :catchall_3c

    :try_start_98
    invoke-virtual {v2, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_98
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_98 .. :try_end_98} :catch_c
    .catchall {:try_start_98 .. :try_end_98} :catchall_38

    goto :goto_49

    :catch_c
    move-exception v0

    move-object v2, v0

    goto :goto_48

    :catchall_3c
    move-exception v0

    goto/16 :goto_43

    :goto_48
    :try_start_99
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    throw v2
    :try_end_99
    .catch Ljava/lang/ClassNotFoundException; {:try_start_99 .. :try_end_99} :catch_d
    .catchall {:try_start_99 .. :try_end_99} :catchall_38

    :catch_d
    const/4 v2, 0x0

    :goto_49
    if-eqz v2, :cond_4f

    :try_start_9a
    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v6, 0xe

    aget-byte v7, v2, v6
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_43

    int-to-byte v7, v7

    const/16 v8, 0x1c4

    :try_start_9b
    aget-byte v10, v2, v8
    :try_end_9b
    .catchall {:try_start_9b .. :try_end_9b} :catchall_44

    int-to-byte v8, v10

    const/16 v10, 0x223

    :try_start_9c
    aget-byte v10, v2, v10

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    new-array v10, v8, [Ljava/lang/Class;

    const-class v8, Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v8, v10, v11

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v11, 0x1

    aput-object v8, v10, v11

    invoke-virtual {v5, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v10, 0x2

    new-array v4, v10, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v1, v4, v10

    xor-int/lit8 v1, v49, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v4, v11

    invoke-virtual {v8, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    const/16 v1, 0x2f81

    new-array v1, v1, [B

    const/16 v4, 0x3b

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v8, 0x38

    aget-byte v8, v2, v8

    int-to-byte v8, v8

    const/16 v10, 0x1c4

    int-to-short v11, v10

    invoke-static {v4, v8, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_43

    const/4 v8, 0x1

    :try_start_9d
    new-array v10, v8, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v4, v10, v8

    const/16 v4, 0xc3

    aget-byte v8, v2, v4

    int-to-byte v4, v8

    int-to-byte v8, v4

    xor-int/lit16 v11, v8, 0x1d0

    and-int/lit16 v6, v8, 0x1d0

    or-int/2addr v6, v11

    int-to-short v6, v6

    invoke-static {v4, v8, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v6, 0x1

    new-array v8, v6, [Ljava/lang/Class;

    const/16 v6, 0x60

    aget-byte v11, v2, v6

    int-to-byte v6, v11

    const/16 v11, 0xc3

    aget-byte v12, v2, v11

    int-to-byte v11, v12

    invoke-static {v6, v11, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v11, 0x0

    aput-object v6, v8, v11

    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_42

    const/4 v6, 0x1

    :try_start_9e
    new-array v8, v6, [Ljava/lang/Object;

    aput-object v1, v8, v11

    const/16 v6, 0xc3

    aget-byte v10, v2, v6

    int-to-byte v6, v10

    int-to-byte v10, v6

    xor-int/lit16 v11, v10, 0x1d0

    and-int/lit16 v12, v10, 0x1d0

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v10, 0xb5

    aget-byte v11, v2, v10
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_41

    int-to-byte v11, v11

    const/16 v12, 0x15

    :try_start_9f
    aget-byte v13, v2, v12

    int-to-byte v13, v13

    const/16 v10, 0xe0

    int-to-short v10, v10

    invoke-static {v11, v13, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    new-array v13, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v18, v13, v11

    invoke-virtual {v6, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_40

    const/16 v6, 0xc3

    :try_start_a0
    aget-byte v8, v2, v6

    int-to-byte v6, v8

    int-to-byte v8, v6

    xor-int/lit16 v10, v8, 0x1d0

    and-int/lit16 v11, v8, 0x1d0

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v6, v8, v10}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v2, v32
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_3f

    int-to-byte v8, v8

    const/16 v10, 0x1c4

    :try_start_a1
    aget-byte v2, v2, v10

    int-to-byte v2, v2

    const/16 v11, 0x28c

    int-to-short v13, v11

    invoke-static {v8, v2, v13}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x0

    invoke-virtual {v6, v2, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_3e

    :try_start_a2
    invoke-static/range {v21 .. v21}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/16 v4, 0x2f5d

    move-object v6, v7

    move/from16 v14, v30

    move-object/from16 v13, v40

    move-object/from16 v7, v42

    move/from16 v10, v45

    move/from16 v15, v49

    goto/16 :goto_26

    :catchall_3d
    move-exception v0

    :goto_4a
    move-object v1, v0

    const/4 v2, 0x1

    goto/16 :goto_64

    :catchall_3e
    move-exception v0

    :goto_4b
    move-object v1, v0

    goto :goto_4c

    :catchall_3f
    move-exception v0

    const/16 v10, 0x1c4

    goto :goto_4b

    :goto_4c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4c

    throw v2

    :cond_4c
    throw v1

    :catchall_40
    move-exception v0

    const/16 v10, 0x1c4

    :goto_4d
    move-object v1, v0

    goto :goto_4e

    :catchall_41
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    goto :goto_4d

    :goto_4e
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :cond_4d
    throw v1

    :catchall_42
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v1

    :catchall_43
    move-exception v0

    const/16 v10, 0x1c4

    :goto_4f
    const/16 v12, 0x15

    goto :goto_4a

    :catchall_44
    move-exception v0

    move v10, v8

    goto :goto_4f

    :cond_4f
    const/4 v2, 0x2

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    new-array v4, v2, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object/from16 v2, v47

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v4, 0x2

    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v6, v4

    xor-int/lit8 v1, v49, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v6, v5

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    const/4 v1, 0x1

    const/16 v2, 0x9

    const/16 v4, 0xc3

    const/16 v5, 0x54

    const/16 v7, 0x30b

    const/4 v8, 0x2

    const/4 v11, 0x0

    goto/16 :goto_67

    :catch_e
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    :goto_50
    move-object v2, v0

    goto :goto_51

    :catchall_45
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    goto/16 :goto_4a

    :catch_f
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    goto :goto_50

    :goto_51
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    aget-byte v6, v5, v32

    int-to-byte v6, v6

    const/16 v7, 0x54

    aget-byte v8, v5, v7

    int-to-byte v7, v8

    const/16 v8, 0x17d

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x376

    aget-byte v1, v5, v1

    neg-int v1, v1

    int-to-byte v1, v1

    const/16 v6, 0x174

    aget-byte v6, v5, v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    int-to-byte v6, v6

    const/16 v7, 0x103

    int-to-short v7, v7

    invoke-static {v1, v6, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a2
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_3d

    const/4 v4, 0x2

    :try_start_a3
    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v6, v4

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/16 v1, 0x60

    aget-byte v2, v5, v1

    int-to-byte v1, v2

    const/16 v2, 0xc3

    aget-byte v4, v5, v2

    int-to-byte v2, v4

    const/16 v4, 0x30b

    int-to-short v5, v4

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v3, v4, v2

    const-class v2, Ljava/lang/Throwable;

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_a3
    .catchall {:try_start_a3 .. :try_end_a3} :catchall_46

    :catchall_46
    move-exception v0

    move-object v1, v0

    :try_start_a4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_50

    throw v2

    :cond_50
    throw v1

    :catchall_47
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_51

    throw v2

    :cond_51
    throw v1

    :catchall_48
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_52

    throw v2

    :cond_52
    throw v1

    :catchall_49
    move-exception v0

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_53

    throw v2

    :cond_53
    throw v1

    :catchall_4a
    move-exception v0

    :goto_52
    const/16 v10, 0x1c4

    const/16 v12, 0x15

    :goto_53
    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    goto :goto_54

    :catchall_4b
    move-exception v0

    move v12, v10

    const/16 v10, 0x1c4

    goto :goto_53

    :catchall_4c
    move-exception v0

    move/from16 v30, v14

    goto :goto_52

    :catchall_4d
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    goto :goto_53

    :goto_54
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_54

    throw v2

    :cond_54
    throw v1

    :catchall_4e
    move-exception v0

    :goto_55
    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    goto/16 :goto_4a

    :catchall_4f
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_55

    throw v2

    :cond_55
    throw v1

    :catchall_50
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_56

    throw v2

    :cond_56
    throw v1

    :catchall_51
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_57

    throw v2

    :cond_57
    throw v1

    :catchall_52
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    :goto_56
    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    :goto_57
    move-object v1, v0

    goto :goto_59

    :catchall_53
    move-exception v0

    move v15, v2

    :goto_58
    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    goto :goto_57

    :catchall_54
    move-exception v0

    move/from16 v30, v14

    goto :goto_56

    :catchall_55
    move-exception v0

    move v15, v10

    goto :goto_58

    :goto_59
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_58

    throw v2

    :cond_58
    throw v1

    :catchall_56
    move-exception v0

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    goto/16 :goto_4a

    :catchall_57
    move-exception v0

    :goto_5a
    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    goto :goto_5b

    :catchall_58
    move-exception v0

    move/from16 v45, v10

    goto :goto_5a

    :goto_5b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_59

    throw v2

    :cond_59
    throw v1

    :catchall_59
    move-exception v0

    :goto_5c
    move/from16 v45, v10

    goto/16 :goto_55

    :catchall_5a
    move-exception v0

    move-object/from16 v42, v7

    goto :goto_5c

    :catchall_5b
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    :goto_5d
    move-object v1, v0

    goto :goto_5f

    :catchall_5c
    move-exception v0

    move-object/from16 v42, v7

    move v15, v8

    move/from16 v45, v10

    :goto_5e
    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    goto :goto_5d

    :catchall_5d
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move v15, v11

    goto :goto_5e

    :goto_5f
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5a

    throw v2

    :cond_5a
    throw v1

    :catchall_5e
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    :goto_60
    move-object v1, v0

    goto :goto_61

    :catchall_5f
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move v10, v8

    goto :goto_60

    :goto_61
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5b

    throw v2

    :cond_5b
    throw v1

    :catchall_60
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    :goto_62
    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    goto :goto_63

    :catchall_61
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move v12, v11

    move/from16 v30, v14

    const/16 v10, 0x1c4

    goto :goto_62

    :catchall_62
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    goto :goto_62

    :goto_63
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5c

    throw v2

    :cond_5c
    throw v1

    :catchall_63
    move-exception v0

    move-object/from16 v42, v7

    move/from16 v45, v10

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v12, 0x15

    const/16 v14, 0x41

    const/4 v15, 0x3

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5d

    throw v2

    :cond_5d
    throw v1
    :try_end_a4
    .catchall {:try_start_a4 .. :try_end_a4} :catchall_3d

    :catchall_64
    move-exception v0

    move/from16 v33, v1

    move-object/from16 v37, v4

    move-object/from16 v36, v5

    move-object/from16 v42, v7

    move/from16 v45, v10

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    goto/16 :goto_55

    :catchall_65
    move-exception v0

    move/from16 v33, v1

    move-object/from16 v37, v4

    move-object/from16 v36, v5

    move-object/from16 v42, v7

    move/from16 v45, v10

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    move/from16 v30, v14

    const/16 v10, 0x1c4

    const/16 v14, 0x41

    const/4 v15, 0x3

    move v12, v2

    goto/16 :goto_4a

    :goto_64
    add-int/lit8 v4, v45, 0x1

    const/16 v2, 0x9

    :goto_65
    if-ge v4, v2, :cond_5f

    :try_start_a5
    aget-boolean v5, v42, v4

    if-eqz v5, :cond_5e

    const/4 v5, 0x0

    sput-object v5, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    sput-object v5, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;

    const/16 v4, 0xc3

    const/16 v5, 0x54

    const/16 v7, 0x30b

    const/4 v8, 0x2

    const/4 v11, 0x0

    goto/16 :goto_66

    :cond_5e
    or-int/lit8 v5, v4, -0x55

    const/4 v6, 0x1

    shl-int/2addr v5, v6

    xor-int/lit8 v4, v4, -0x55

    sub-int/2addr v5, v4

    add-int/lit8 v4, v5, 0x56

    goto :goto_65

    :cond_5f
    sget-object v2, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v4, 0xc3

    aget-byte v5, v2, v4

    int-to-byte v4, v5

    const/16 v5, 0x54

    aget-byte v5, v2, v5

    int-to-byte v5, v5

    const/16 v6, 0x15f

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4
    :try_end_a5
    .catch Ljava/lang/Exception; {:try_start_a5 .. :try_end_a5} :catch_0

    const/4 v5, 0x2

    :try_start_a6
    new-array v6, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v6, v5

    const/4 v4, 0x1

    aput-object v1, v6, v4

    const/16 v1, 0x60

    aget-byte v1, v2, v1

    int-to-byte v1, v1

    const/16 v4, 0xc3

    aget-byte v2, v2, v4

    int-to-byte v2, v2

    const/16 v7, 0x30b

    int-to-short v4, v7

    invoke-static {v1, v2, v4}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v8, 0x2

    new-array v2, v8, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v3, v2, v11

    const-class v3, Ljava/lang/Throwable;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_a6
    .catchall {:try_start_a6 .. :try_end_a6} :catchall_66

    :catchall_66
    move-exception v0

    move-object v1, v0

    :try_start_a7
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_60

    throw v2

    :cond_60
    throw v1

    :cond_61
    move/from16 v33, v1

    move-object/from16 v37, v4

    move-object/from16 v36, v5

    move-object/from16 v42, v7

    move/from16 v45, v10

    move-object/from16 v41, v11

    move-object/from16 v39, v12

    move/from16 v30, v14

    const/16 v4, 0xc3

    const/16 v5, 0x54

    const/16 v7, 0x30b

    const/16 v10, 0x1c4

    const/16 v14, 0x41

    const/4 v15, 0x3

    move v12, v2

    move v11, v8

    const/16 v2, 0x9

    const/4 v8, 0x2

    :goto_66
    move/from16 v1, v33

    :goto_67
    or-int/lit8 v6, v45, 0x67

    const/4 v13, 0x1

    shl-int/2addr v6, v13

    xor-int/lit8 v17, v45, 0x67

    sub-int v6, v6, v17

    and-int/lit8 v17, v6, -0x66

    or-int/lit8 v6, v6, -0x66

    add-int v6, v17, v6

    move v10, v6

    move v8, v11

    move v2, v12

    move/from16 v14, v30

    move-object/from16 v5, v36

    move-object/from16 v4, v37

    move-object/from16 v12, v39

    move-object/from16 v11, v41

    move-object/from16 v7, v42

    const/4 v6, 0x5

    goto/16 :goto_11

    :cond_62
    move-object/from16 v42, v7

    move/from16 v45, v10

    aget-boolean v1, v42, v45
    :try_end_a7
    .catch Ljava/lang/Exception; {:try_start_a7 .. :try_end_a7} :catch_0

    const/4 v1, 0x0

    :try_start_a8
    throw v1
    :try_end_a8
    .catch Ljava/lang/Exception; {:try_start_a8 .. :try_end_a8} :catch_0
    .catchall {:try_start_a8 .. :try_end_a8} :catchall_67

    :catchall_67
    move-exception v0

    move-object v1, v0

    throw v1

    :cond_63
    sget v1, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/16 v2, 0xb

    and-int/lit8 v3, v1, 0xb

    or-int/2addr v1, v2

    add-int/2addr v3, v1

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    return-void

    :catchall_68
    move-exception v0

    move-object v1, v0

    :try_start_a9
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_64

    throw v2

    :cond_64
    throw v1

    :catchall_69
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_65

    throw v2

    :cond_65
    throw v1

    :catchall_6a
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_66

    throw v2

    :cond_66
    throw v1

    :catchall_6b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_67

    throw v2

    :cond_67
    throw v1
    :try_end_a9
    .catch Ljava/lang/Exception; {:try_start_a9 .. :try_end_a9} :catch_0

    :goto_68
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    nop

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x1t
        0x0t
        0x0t
        0x1t
        0x1t
        0x0t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x42t
        -0x6ft
        0x13t
        -0x73t
        -0xct
        -0x50t
        0x3et
        -0x22t
        0xft
        -0x75t
        -0x58t
        -0x2t
        0x18t
        -0x22t
        -0x7at
        0x3ft
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFInAppEventParameterName(CII)Ljava/lang/Object;
    .locals 9

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    or-int/lit8 v1, v0, 0x75

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    xor-int/lit8 v0, v0, 0x75

    sub-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    const/4 v3, 0x2

    rem-int/2addr v1, v3

    if-eqz v1, :cond_1

    sget-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    xor-int/lit8 v4, v0, 0x3d

    and-int/lit8 v0, v0, 0x3d

    shl-int/2addr v0, v2

    add-int/2addr v4, v0

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    const/4 v0, 0x3

    :try_start_0
    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    const/4 p1, 0x0

    aput-object p0, v4, p1

    sget-object p0, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 p2, 0xe

    aget-byte p2, p0, p2

    int-to-byte p2, p2

    const/16 v5, 0x1c4

    aget-byte v6, p0, v5

    int-to-byte v6, v6

    xor-int/lit16 v7, v6, 0x343

    and-int/lit16 v8, v6, 0x343

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {p2, v6, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p2

    sget-object v6, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;

    check-cast v6, Ljava/lang/ClassLoader;

    invoke-static {p2, v2, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p2

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0xc

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    const/16 v6, 0x14d

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v5, v0, p1

    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object p1, v0, v2

    aput-object p1, v0, v3

    invoke-virtual {p2, p0, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    throw p1

    :cond_0
    throw p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public static AFInAppEventType(Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget v2, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v2, v2, 0x5b

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    sget-object v3, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    xor-int/lit8 v4, v2, 0x21

    and-int/lit8 v5, v2, 0x21

    shl-int/2addr v5, v1

    add-int/2addr v4, v5

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v2, v2, 0x53

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    :try_start_0
    new-array v2, v1, [Ljava/lang/Object;

    aput-object p0, v2, v0

    sget-object p0, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v4, 0xe

    aget-byte v4, p0, v4

    int-to-byte v4, v4

    const/16 v5, 0x1c4

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    xor-int/lit16 v6, v5, 0x343

    and-int/lit16 v7, v5, 0x343

    or-int/2addr v6, v7

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;

    check-cast v5, Ljava/lang/ClassLoader;

    invoke-static {v4, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0x15c

    aget-byte v5, p0, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v6, 0x1a

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    xor-int/lit16 v6, p0, 0x2e6

    and-int/lit16 v7, p0, 0x2e6

    or-int/2addr v6, v7

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Class;

    const-class v5, Ljava/lang/Object;

    aput-object v5, v1, v0

    invoke-virtual {v4, p0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p0
.end method

.method public static init$0()V
    .locals 5

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    xor-int/lit8 v1, v0, 0x43

    and-int/lit8 v0, v0, 0x43

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    rem-int/lit8 v1, v1, 0x2

    const-string v0, "ISO-8859-1"

    const-string v2, "_\u00d4\u0099\u00e1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008\u001e\u00d3H\u00e0\u00f4\n\u00dcM\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0015\u0000\u0003\u00f6\u000c\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be%%\u0000\u00f7\u0005\u0011\u0003\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\n\u00f8\u0012\u0006\u00f5\u0002\u00f1\u0016\u00ff\u000e\u000b\u00f8\u0007\u00fb\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\u000c\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d2!\u0005\u0008\u0000\u00e2(\u000c\u00f6\u00ff\u0006\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\u0008\u0000\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\u0008\u0000\u00e2(\u000c\u0008\u0006(\u00d62\u0003\u00d84\u00f2\u000c\t\u00e3(\u00fa\u00f8\t\u00f8\u00f8\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u00ee\t\u00ed\u000b\u00ee\u0007\u00ef\u000b\u00ee\u000b\u00eb\u000b\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d46\u00ff\u00f4\u0010\u00ff\u00f6\u000e\u00ea$\u00fe\u0006\u00f2\t\u0001\u00e2(\u000c\u00f6\u0001\u0014\u00fe\u0006\n7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c66\u00ce\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0006\u00f5\u0006\u00e3$\u0016\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u001a,\u000b\u00f6\u000c\u0000\u0002\u0002\u00fb\u000c\t\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be()\u00fd\u0004\u00f4\u000b\u00d9,\u0006\u00f7\u000b\u00fb\u0001\n\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u00108\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d5\u0001\u00f4\n\u0017\u00ed\u0008\t\u0001\u0012\u00d6%\u00fe\u00e5,\u0006\u00df\u0016\u000f\u00fb\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\u000c\t\u0002\u000c\u0006\u0007\u00f57\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c65\u00cf\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\u0008\u000c\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\u0008\u0001\u0012\u00d0$\u0014\u00ff\u0000\u000c\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\u0008\u00de\u0017\r\u00f6\u00ff\u0006\u00ee\u000e\u000c\u00f3\u00ed\u001a\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u00f4\u0016\u00f7\u00e7 \r\u0004\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ee\u0006\u00f0\u000b\u0015\u0000\u0003\u00f6\u000c\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008\u001e\u00d3K\u00dd\u00f4\n\u00dc\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00fe\u00f2\u0012\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\u000c\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f"

    const/4 v3, 0x0

    const/16 v4, 0x3fa

    if-eqz v1, :cond_0

    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v0, 0x2e7a

    :goto_0
    sput v0, Lcom/appsflyer/internal/AFa1vSDK;->onResponseErrorNative:I

    goto :goto_1

    :cond_0
    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v0, 0xbb

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static valueOf(I)I
    .locals 9

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    add-int/lit8 v0, v0, 0x5b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    const/4 v3, 0x1

    div-int/2addr v3, v2

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFa1vSDK;->onInstallConversionFailureNative:Ljava/lang/Object;

    :goto_0
    xor-int/lit8 v3, v1, 0x75

    and-int/lit8 v1, v1, 0x75

    const/4 v4, 0x1

    shl-int/2addr v1, v4

    add-int/2addr v3, v1

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    :try_start_0
    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v2

    sget-object p0, Lcom/appsflyer/internal/AFa1vSDK;->onConversionDataSuccess:[B

    const/16 v3, 0xe

    aget-byte v3, p0, v3

    int-to-byte v3, v3

    const/16 v5, 0x1c4

    aget-byte v6, p0, v5

    int-to-byte v6, v6

    xor-int/lit16 v7, v6, 0x343

    and-int/lit16 v8, v6, 0x343

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lcom/appsflyer/internal/AFa1vSDK;->init:Ljava/lang/Object;

    check-cast v6, Ljava/lang/ClassLoader;

    invoke-static {v3, v4, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0xc

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    const/16 v6, 0x14d

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFa1vSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p0

    new-array v5, v4, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v2

    invoke-virtual {v3, p0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1vSDK;->onAttributionFailureNative:I

    xor-int/lit8 v1, v0, 0xf

    and-int/lit8 v0, v0, 0xf

    shl-int/2addr v0, v4

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1vSDK;->onDeepLinkingNative:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    return p0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    throw v0

    :cond_2
    throw p0
.end method

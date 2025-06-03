.class public Lcom/appsflyer/internal/AFb1oSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static AppsFlyerLib:[B = null

.field public static onPause:[B = null

.field public static final setAndroidIdData:[B = null

.field private static setCustomerUserId:I = 0x1

.field public static setDebugLog:I

.field private static setImeiData:Ljava/lang/Object;

.field private static setOaidData:Ljava/lang/Object;

.field public static final setPhoneNumber:I

.field public static updateServerUninstallToken:I

.field private static waitForCustomerUserId:I


# direct methods
.method private static $$c(SIS)Ljava/lang/String;
    .locals 6

    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    or-int/lit8 v1, v0, 0x13

    shl-int/lit8 v1, v1, 0x1

    xor-int/lit8 v0, v0, 0x13

    sub-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    neg-int p0, p0

    or-int/lit8 v0, p0, 0x24

    shl-int/lit8 v0, v0, 0x1

    xor-int/lit8 p0, p0, 0x24

    sub-int/2addr v0, p0

    neg-int p0, p1

    xor-int/lit8 p1, p0, 0x77

    and-int/lit8 p0, p0, 0x77

    shl-int/lit8 p0, p0, 0x1

    add-int/2addr p1, p0

    add-int/lit8 p2, p2, 0x4

    sget-object p0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    new-array v2, v0, [B

    const/4 v3, -0x1

    add-int/2addr v0, v3

    const/4 v4, 0x0

    if-nez p0, :cond_1

    add-int/lit8 v1, v1, 0x6b

    rem-int/lit16 p1, v1, 0x80

    sput p1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const/16 p1, 0x29

    div-int/2addr p1, v4

    :cond_0
    move p1, p2

    move v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    or-int/lit8 v1, v3, 0x7d

    shl-int/lit8 v1, v1, 0x1

    xor-int/lit8 v3, v3, 0x7d

    sub-int/2addr v1, v3

    or-int/lit8 v3, v1, -0x7c

    shl-int/lit8 v3, v3, 0x1

    xor-int/lit8 v1, v1, -0x7c

    sub-int/2addr v3, v1

    int-to-byte v1, p1

    aput-byte v1, v2, v3

    if-ne v3, v0, :cond_3

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2, v4}, Ljava/lang/String;-><init>([BI)V

    sget p1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 p2, p1, 0x15

    or-int/lit8 p1, p1, 0x15

    add-int/2addr p2, p1

    rem-int/lit16 p1, p2, 0x80

    sput p1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    rem-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_2

    const/16 p1, 0x26

    div-int/2addr p1, v4

    :cond_2
    return-object p0

    :cond_3
    xor-int/lit8 v1, p2, -0x38

    and-int/lit8 p2, p2, -0x38

    shl-int/lit8 p2, p2, 0x1

    add-int/2addr v1, p2

    xor-int/lit8 p2, v1, 0x39

    and-int/lit8 v1, v1, 0x39

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr p2, v1

    aget-byte v1, p0, p2

    move v5, p2

    move p2, p1

    move p1, v5

    :goto_1
    neg-int v1, v1

    add-int/2addr p2, v1

    sget v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    move v5, p2

    move p2, p1

    move p1, v5

    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 51

    const/16 v1, 0x47

    const/16 v8, 0x1f

    const/16 v9, 0xc1

    const/16 v12, 0x1d4

    const/4 v15, 0x0

    const/4 v2, 0x1

    const-class v16, [B

    const-class v3, Lcom/appsflyer/internal/AFb1oSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFb1oSDK;->init$0()V

    const v17, -0x6a392683

    sput v17, Lcom/appsflyer/internal/AFb1oSDK;->setDebugLog:I

    const v17, -0x57ded8f7

    sput v17, Lcom/appsflyer/internal/AFb1oSDK;->updateServerUninstallToken:I

    :try_start_0
    sget-object v17, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v10, v17, v1

    int-to-byte v10, v10

    const/16 v19, 0xf

    aget-byte v1, v17, v19

    int-to-byte v1, v1

    const/16 v13, 0x240

    int-to-short v13, v13

    invoke-static {v10, v1, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    sget-object v10, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    const/4 v13, 0x0

    if-nez v10, :cond_0

    const/16 v10, 0x169

    aget-byte v10, v17, v10

    int-to-byte v10, v10

    aget-byte v4, v17, v19

    int-to-byte v4, v4

    const/16 v5, 0x3b3

    int-to-short v5, v5

    invoke-static {v10, v4, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_59

    :cond_0
    move-object v4, v13

    :goto_0
    const/16 v5, 0x6a

    const/16 v10, 0x15

    const/16 v20, 0x17f

    const/16 v21, 0x324

    :try_start_1
    aget-byte v5, v17, v5

    int-to-byte v5, v5

    aget-byte v6, v17, v20

    int-to-byte v6, v6

    const/16 v7, 0x303

    int-to-short v7, v7

    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v6, 0x46

    aget-byte v6, v17, v6

    neg-int v6, v6

    int-to-byte v6, v6

    aget-byte v7, v17, v19

    int-to-byte v7, v7

    const/16 v23, 0x23

    aget-byte v11, v17, v23

    int-to-short v11, v11

    invoke-static {v6, v7, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    new-array v7, v15, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v5, :cond_1

    goto :goto_1

    :catch_1
    move-object v5, v13

    :cond_1
    :try_start_2
    sget-object v6, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v7, 0xba

    aget-byte v7, v6, v7

    int-to-byte v7, v7

    aget-byte v11, v6, v20

    int-to-byte v11, v11

    const/16 v14, 0x1b0

    int-to-short v14, v14

    invoke-static {v7, v11, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v11, v6, v10

    int-to-byte v11, v11

    aget-byte v6, v6, v21

    int-to-byte v6, v6

    xor-int/lit16 v14, v6, 0x349

    and-int/lit16 v10, v6, 0x349

    or-int/2addr v10, v14

    int-to-short v10, v10

    invoke-static {v11, v6, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    new-array v10, v15, [Ljava/lang/Class;

    invoke-virtual {v7, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :goto_1
    if-eqz v5, :cond_2

    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v10, v7, v12

    int-to-byte v10, v10

    aget-byte v7, v7, v21

    int-to-byte v7, v7

    int-to-short v11, v9

    invoke-static {v10, v7, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v5, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    :cond_2
    move-object v6, v13

    :goto_2
    if-eqz v5, :cond_3

    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    sget-object v10, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v11, v10, v8

    int-to-byte v11, v11

    aget-byte v10, v10, v21

    int-to-byte v10, v10

    const/16 v14, 0x142

    int-to-short v14, v14

    invoke-static {v11, v10, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v5, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_3

    :catch_4
    :cond_3
    move-object v7, v13

    :goto_3
    if-eqz v5, :cond_4

    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    sget-object v11, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v14, v11, v12

    int-to-byte v14, v14

    aget-byte v11, v11, v21

    int-to-byte v11, v11

    or-int/lit16 v9, v11, 0xc9

    int-to-short v9, v9

    invoke-static {v14, v11, v9}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v5, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_4

    :catch_5
    :cond_4
    move-object v5, v13

    :goto_4
    const-class v9, Ljava/lang/String;

    const/16 v10, 0x187

    const/16 v11, 0xc

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    if-nez v4, :cond_6

    move-object v6, v13

    goto :goto_5

    :cond_6
    :try_start_6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v8, v14, v12

    int-to-byte v8, v8

    const/16 v24, 0x207

    aget-byte v13, v14, v24

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v12, 0x270

    int-to-short v12, v12

    invoke-static {v8, v13, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    new-array v6, v2, [Ljava/lang/Object;

    aput-object v4, v6, v15

    aget-byte v4, v14, v10

    int-to-byte v4, v4

    aget-byte v8, v14, v11

    int-to-byte v8, v8

    xor-int/lit16 v12, v8, 0x360

    and-int/lit16 v13, v8, 0x360

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v4, v8, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-array v8, v2, [Ljava/lang/Class;

    aput-object v9, v8, v15

    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_54

    :goto_5
    const/16 v4, 0x11b

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    :try_start_8
    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v8, v5, v20

    int-to-byte v8, v8

    aget-byte v12, v5, v11

    int-to-byte v12, v12

    const/16 v13, 0x2de

    int-to-short v13, v13

    invoke-static {v8, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    new-array v12, v2, [Ljava/lang/Object;

    aput-object v8, v12, v15

    aget-byte v8, v5, v19

    int-to-byte v8, v8

    aget-byte v13, v5, v11

    int-to-byte v13, v13

    aget-byte v14, v5, v4

    int-to-short v14, v14

    invoke-static {v8, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v13, 0x1d4

    aget-byte v14, v5, v13

    int-to-byte v13, v14

    aget-byte v14, v5, v21

    int-to-byte v14, v14

    sget v4, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    or-int/lit16 v4, v4, 0x283

    int-to-short v4, v4

    invoke-static {v13, v14, v4}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    new-array v13, v2, [Ljava/lang/Class;

    aput-object v9, v13, v15

    invoke-virtual {v8, v4, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v8, 0x0

    invoke-virtual {v4, v8, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_53

    sget v8, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v8, v8, 0x3d

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_a
    new-array v8, v2, [Ljava/lang/Object;

    aput-object v4, v8, v15

    aget-byte v4, v5, v10

    int-to-byte v4, v4

    aget-byte v5, v5, v11

    int-to-byte v5, v5

    xor-int/lit16 v12, v5, 0x360

    and-int/lit16 v13, v5, 0x360

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v4, v5, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Class;

    aput-object v9, v5, v15

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_52

    :goto_6
    if-nez v7, :cond_9

    if-eqz v6, :cond_9

    :try_start_b
    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v7, 0x20d

    aget-byte v7, v4, v7

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v8, v4, v19

    int-to-byte v8, v8

    const/16 v12, 0x11a

    int-to-short v12, v12

    invoke-static {v7, v8, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    const/4 v8, 0x2

    :try_start_c
    new-array v12, v8, [Ljava/lang/Object;

    aput-object v6, v12, v15

    aput-object v7, v12, v2

    aget-byte v7, v4, v10

    int-to-byte v7, v7

    aget-byte v8, v4, v11

    int-to-byte v8, v8

    xor-int/lit16 v13, v8, 0x360

    and-int/lit16 v14, v8, 0x360

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v7, v8, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/4 v8, 0x2

    new-array v13, v8, [Ljava/lang/Class;

    aget-byte v8, v4, v10

    int-to-byte v8, v8

    aget-byte v4, v4, v11

    int-to-byte v4, v4

    xor-int/lit16 v14, v4, 0x360

    and-int/lit16 v11, v4, 0x360

    or-int/2addr v11, v14

    int-to-short v11, v11

    invoke-static {v8, v4, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v13, v15

    aput-object v9, v13, v2

    invoke-virtual {v7, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_d
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8

    throw v2

    :cond_8
    throw v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    :cond_9
    :goto_7
    :try_start_e
    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v8, 0xba

    aget-byte v8, v4, v8

    int-to-byte v8, v8

    aget-byte v11, v4, v20

    int-to-byte v11, v11

    const/16 v12, 0x22b

    int-to-short v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v11, 0x1d

    aget-byte v12, v4, v11

    int-to-byte v12, v12

    aget-byte v13, v4, v21

    int-to-byte v13, v13

    const/16 v14, 0x1c5

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v8, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_51

    :try_start_f
    aget-byte v12, v4, v10

    int-to-byte v12, v12

    const/16 v13, 0xc

    aget-byte v14, v4, v13

    int-to-byte v13, v14

    xor-int/lit16 v14, v13, 0x360

    and-int/lit16 v10, v13, 0x360

    or-int/2addr v10, v14

    int-to-short v10, v10

    invoke-static {v12, v13, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v12, 0x9

    invoke-static {v10, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v12, v10, v15

    aput-object v7, v10, v2

    const/4 v12, 0x2

    aput-object v6, v10, v12

    const/4 v12, 0x3

    aput-object v5, v10, v12

    const/4 v13, 0x4

    aput-object v8, v10, v13

    const/4 v13, 0x5

    aput-object v7, v10, v13

    const/4 v7, 0x6

    aput-object v6, v10, v7

    const/4 v6, 0x7

    aput-object v5, v10, v6

    const/16 v5, 0x8

    aput-object v8, v10, v5

    const/16 v5, 0x9

    new-array v6, v5, [Z

    fill-array-data v6, :array_0

    new-array v7, v5, [Z

    fill-array-data v7, :array_1

    new-array v8, v5, [Z

    fill-array-data v8, :array_2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    const/16 v5, 0x75

    :try_start_10
    aget-byte v13, v4, v5

    int-to-byte v13, v13

    aget-byte v14, v4, v20

    int-to-byte v14, v14

    aget-byte v5, v4, v12

    neg-int v5, v5

    int-to-short v5, v5

    invoke-static {v13, v14, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v13, 0x260

    aget-byte v13, v4, v13

    int-to-byte v13, v13

    const/16 v14, 0x8b

    aget-byte v4, v4, v14

    int-to-byte v4, v4

    const/16 v14, 0x283

    int-to-short v14, v14

    invoke-static {v13, v4, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    if-ne v4, v11, :cond_a

    goto :goto_8

    :cond_a
    const/16 v5, 0x1a

    if-lt v4, v5, :cond_b

    move v5, v2

    goto :goto_9

    :cond_b
    :goto_8
    move v5, v15

    :goto_9
    aput-boolean v5, v8, v15

    const/16 v5, 0x15

    if-lt v4, v5, :cond_c

    move v13, v2

    goto :goto_a

    :cond_c
    move v13, v15

    :goto_a
    aput-boolean v13, v8, v2

    if-lt v4, v5, :cond_d

    move v5, v2

    :goto_b
    const/4 v13, 0x5

    goto :goto_c

    :cond_d
    move v5, v15

    goto :goto_b

    :goto_c
    aput-boolean v5, v8, v13

    const/16 v5, 0x10

    if-ge v4, v5, :cond_e

    move v5, v2

    :goto_d
    const/4 v13, 0x4

    goto :goto_e

    :cond_e
    move v5, v15

    goto :goto_d

    :goto_e
    aput-boolean v5, v8, v13
    :try_end_10
    .catch Ljava/lang/ClassNotFoundException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    const/16 v5, 0x10

    if-ge v4, v5, :cond_f

    sget v4, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    and-int/lit8 v5, v4, 0x33

    or-int/lit8 v4, v4, 0x33

    add-int/2addr v5, v4

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    move v4, v2

    :goto_f
    const/16 v5, 0x8

    goto :goto_10

    :cond_f
    move v4, v15

    goto :goto_f

    :goto_10
    :try_start_11
    aput-boolean v4, v8, v5
    :try_end_11
    .catch Ljava/lang/ClassNotFoundException; {:try_start_11 .. :try_end_11} :catch_6
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    :catch_6
    move v4, v15

    move v5, v4

    :goto_11
    if-eq v4, v2, :cond_62

    sget v13, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 v14, v13, 0x1

    or-int/2addr v13, v2

    add-int/2addr v14, v13

    rem-int/lit16 v13, v14, 0x80

    sput v13, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v13, 0x2

    rem-int/2addr v14, v13

    if-eqz v14, :cond_10

    const/16 v13, 0x61

    if-ge v5, v13, :cond_62

    goto :goto_12

    :cond_10
    const/16 v13, 0x9

    if-ge v5, v13, :cond_62

    :goto_12
    :try_start_12
    aget-boolean v13, v8, v5
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    xor-int/2addr v13, v2

    if-eqz v13, :cond_11

    move-object/from16 v33, v1

    move/from16 v34, v4

    move/from16 v44, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v37, v8

    move-object/from16 v36, v10

    const/16 v2, 0x9

    const/16 v4, 0x187

    const/4 v6, 0x5

    const/16 v7, 0xc1

    const/4 v8, 0x0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    goto/16 :goto_58

    :cond_11
    :try_start_13
    aget-boolean v14, v6, v5

    aget-object v11, v10, v5

    aget-boolean v28, v7, v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    const/16 v29, 0x136

    if-eqz v14, :cond_15

    if-eqz v11, :cond_13

    :try_start_14
    sget-object v30, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v27, 0x187

    aget-byte v13, v30, v27

    int-to-byte v13, v13

    const/16 v26, 0xc

    aget-byte v15, v30, v26

    int-to-byte v15, v15

    xor-int/lit16 v2, v15, 0x360

    and-int/lit16 v12, v15, 0x360

    or-int/2addr v2, v12

    int-to-short v2, v2

    invoke-static {v13, v15, v2}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v12, 0x106

    aget-byte v13, v30, v12

    int-to-byte v12, v13

    aget-byte v13, v30, v19

    int-to-byte v13, v13

    const/16 v15, 0x339

    int-to-short v15, v15

    invoke-static {v12, v13, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v2, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v11, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz v2, :cond_13

    goto/16 :goto_15

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_15
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v11

    if-eqz v11, :cond_12

    throw v11

    :catchall_2
    move-exception v0

    move-object/from16 v33, v1

    move/from16 v34, v4

    move/from16 v44, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v37, v8

    move-object/from16 v36, v10

    :goto_13
    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    :goto_14
    move-object v1, v0

    goto/16 :goto_56

    :cond_12
    throw v2

    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v13, v12, v29

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v14, 0x11b

    aget-byte v15, v12, v14

    int-to-byte v14, v15

    sget v15, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    or-int/lit16 v15, v15, 0x110

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v11, 0x63

    aget-byte v11, v12, v11

    int-to-byte v11, v11

    const/16 v13, 0x16d

    aget-byte v13, v12, v13

    add-int/lit8 v13, v13, -0x1

    int-to-byte v13, v13

    const/16 v14, 0x106

    int-to-short v14, v14

    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    const/4 v11, 0x1

    :try_start_16
    new-array v13, v11, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v2, v13, v11

    const/16 v2, 0x7a

    aget-byte v11, v12, v2

    int-to-byte v2, v11

    const/16 v11, 0xc

    aget-byte v12, v12, v11

    int-to-byte v11, v12

    const/16 v12, 0x340

    int-to-short v14, v12

    invoke-static {v2, v11, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v9, v12, v11

    invoke-virtual {v2, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_17
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v11

    if-eqz v11, :cond_14

    throw v11

    :cond_14
    throw v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    :cond_15
    :goto_15
    if-eqz v14, :cond_2a

    :try_start_18
    new-instance v12, Ljava/util/Random;

    invoke-direct {v12}, Ljava/util/Random;-><init>()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_11

    :try_start_19
    sget-object v13, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v15, v13, v19

    int-to-byte v15, v15

    const/16 v26, 0xc

    aget-byte v2, v13, v26
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    int-to-byte v2, v2

    move-object/from16 v33, v1

    const/16 v25, 0x11b

    :try_start_1a
    aget-byte v1, v13, v25

    int-to-short v1, v1

    invoke-static {v15, v2, v1}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v2, 0x1ee

    aget-byte v15, v13, v2

    int-to-byte v2, v15

    aget-byte v13, v13, v19
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    int-to-byte v13, v13

    xor-int/lit16 v15, v13, 0x368

    move/from16 v34, v4

    and-int/lit16 v4, v13, 0x368

    or-int/2addr v4, v15

    int-to-short v4, v4

    :try_start_1b
    invoke-static {v2, v13, v4}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_e

    const-wide/32 v35, -0x5eb1dcde

    xor-long v1, v1, v35

    :try_start_1c
    invoke-virtual {v12, v1, v2}, Ljava/util/Random;->setSeed(J)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_d

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    :goto_16
    if-nez v1, :cond_28

    if-nez v2, :cond_16

    sget v15, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    xor-int/lit8 v35, v15, 0x2b

    and-int/lit8 v15, v15, 0x2b

    const/16 v32, 0x1

    shl-int/lit8 v15, v15, 0x1

    add-int v15, v35, v15

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v15, 0x6

    move-object/from16 v35, v1

    :goto_17
    const/16 v32, 0x1

    goto :goto_18

    :cond_16
    if-nez v4, :cond_17

    move-object/from16 v35, v1

    const/4 v15, 0x5

    goto :goto_17

    :cond_17
    if-nez v13, :cond_18

    sget v15, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    or-int/lit8 v35, v15, 0x53

    const/16 v32, 0x1

    shl-int/lit8 v35, v35, 0x1

    xor-int/lit8 v15, v15, 0x53

    sub-int v15, v35, v15

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    move-object/from16 v35, v1

    const/4 v15, 0x4

    goto :goto_18

    :cond_18
    const/16 v32, 0x1

    move-object/from16 v35, v1

    const/4 v15, 0x3

    :goto_18
    :try_start_1d
    new-instance v1, Ljava/lang/StringBuilder;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_d

    or-int/lit8 v36, v15, 0x1

    shl-int/lit8 v36, v36, 0x1

    xor-int/lit8 v37, v15, 0x1

    move-object/from16 v38, v6

    sub-int v6, v36, v37

    :try_start_1e
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v6, 0x2e

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_c

    const/4 v6, 0x0

    :goto_19
    if-ge v6, v15, :cond_1d

    sget v36, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    and-int/lit8 v37, v36, 0x65

    or-int/lit8 v36, v36, 0x65

    move-object/from16 v39, v7

    add-int v7, v37, v36

    move-object/from16 v36, v10

    rem-int/lit16 v10, v7, 0x80

    sput v10, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v10, 0x2

    rem-int/2addr v7, v10

    if-nez v7, :cond_1a

    const/16 v7, 0x2d

    const/4 v10, 0x0

    :try_start_1f
    div-int/2addr v7, v10

    if-eqz v28, :cond_19

    goto :goto_21

    :cond_19
    :goto_1a
    const/16 v7, 0xc

    goto :goto_1f

    :catchall_4
    move-exception v0

    :goto_1b
    move-object v1, v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    :goto_1c
    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    :goto_1d
    const/16 v12, 0x15

    :goto_1e
    const/16 v13, 0x2c1

    goto/16 :goto_56

    :cond_1a
    const/4 v7, 0x1

    xor-int/lit8 v10, v28, 0x1

    if-eqz v10, :cond_1b

    goto :goto_1a

    :goto_1f
    invoke-virtual {v12, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    add-int/lit16 v10, v10, 0x2000

    int-to-char v7, v10

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_20
    const/4 v7, 0x1

    goto :goto_23

    :cond_1b
    :goto_21
    const/16 v7, 0x1a

    invoke-virtual {v12, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    invoke-virtual {v12}, Ljava/util/Random;->nextBoolean()Z

    move-result v10
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    if-eqz v10, :cond_1c

    neg-int v7, v7

    neg-int v7, v7

    or-int/lit8 v10, v7, 0x41

    const/16 v32, 0x1

    shl-int/lit8 v10, v10, 0x1

    xor-int/lit8 v7, v7, 0x41

    sub-int/2addr v10, v7

    goto :goto_22

    :cond_1c
    const/16 v32, 0x1

    add-int/lit8 v10, v7, 0x60

    sget v7, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    or-int/lit8 v37, v7, 0x6f

    shl-int/lit8 v37, v37, 0x1

    xor-int/lit8 v7, v7, 0x6f

    sub-int v7, v37, v7

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :goto_22
    int-to-char v7, v10

    :try_start_20
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_20

    :goto_23
    add-int/2addr v6, v7

    move-object/from16 v10, v36

    move-object/from16 v7, v39

    goto :goto_19

    :cond_1d
    move-object/from16 v39, v7

    move-object/from16 v36, v10

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_4

    if-nez v2, :cond_1f

    sget v2, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    or-int/lit8 v6, v2, 0x7

    const/4 v7, 0x1

    shl-int/2addr v6, v7

    xor-int/lit8 v2, v2, 0x7

    sub-int/2addr v6, v2

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v2, 0x2

    :try_start_21
    new-array v6, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v11, v6, v2

    aput-object v1, v6, v7

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v2, 0x187

    aget-byte v7, v1, v2

    int-to-byte v2, v7

    const/16 v7, 0xc

    aget-byte v10, v1, v7

    int-to-byte v7, v10

    xor-int/lit16 v10, v7, 0x360

    and-int/lit16 v15, v7, 0x360

    or-int/2addr v10, v15

    int-to-short v10, v10

    invoke-static {v2, v7, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v7, 0x2

    new-array v10, v7, [Ljava/lang/Class;

    const/16 v7, 0x187

    aget-byte v15, v1, v7

    int-to-byte v7, v15

    const/16 v15, 0xc

    aget-byte v1, v1, v15

    int-to-byte v1, v1

    xor-int/lit16 v15, v1, 0x360

    move-object/from16 v37, v12

    and-int/lit16 v12, v1, 0x360

    or-int/2addr v12, v15

    int-to-short v12, v12

    invoke-static {v7, v1, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v7, 0x0

    aput-object v1, v10, v7

    const/4 v1, 0x1

    aput-object v9, v10, v1

    invoke-virtual {v2, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_5

    move-object v2, v1

    :goto_24
    move-object/from16 v42, v11

    move-object/from16 v1, v35

    goto/16 :goto_25

    :catchall_5
    move-exception v0

    move-object v1, v0

    :try_start_22
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1e

    throw v2

    :cond_1e
    throw v1
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_4

    :cond_1f
    move-object/from16 v37, v12

    if-nez v4, :cond_21

    const/4 v6, 0x2

    :try_start_23
    new-array v4, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v11, v4, v6

    const/4 v6, 0x1

    aput-object v1, v4, v6

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v6, 0x187

    aget-byte v7, v1, v6

    int-to-byte v6, v7

    const/16 v7, 0xc

    aget-byte v10, v1, v7

    int-to-byte v7, v10

    xor-int/lit16 v10, v7, 0x360

    and-int/lit16 v12, v7, 0x360

    or-int/2addr v10, v12

    int-to-short v10, v10

    invoke-static {v6, v7, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x2

    new-array v10, v7, [Ljava/lang/Class;

    const/16 v7, 0x187

    aget-byte v12, v1, v7

    int-to-byte v7, v12

    const/16 v12, 0xc

    aget-byte v1, v1, v12

    int-to-byte v1, v1

    or-int/lit16 v12, v1, 0x360

    int-to-short v12, v12

    invoke-static {v7, v1, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v7, 0x0

    aput-object v1, v10, v7

    const/4 v1, 0x1

    aput-object v9, v10, v1

    invoke-virtual {v6, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_6

    move-object v4, v1

    goto :goto_24

    :catchall_6
    move-exception v0

    move-object v1, v0

    :try_start_24
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_20

    throw v2

    :cond_20
    throw v1
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_4

    :cond_21
    if-nez v13, :cond_23

    const/4 v6, 0x2

    :try_start_25
    new-array v7, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v11, v7, v6

    const/4 v6, 0x1

    aput-object v1, v7, v6

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v6, 0x187

    aget-byte v10, v1, v6

    int-to-byte v6, v10

    const/16 v10, 0xc

    aget-byte v12, v1, v10

    int-to-byte v10, v12

    xor-int/lit16 v12, v10, 0x360

    and-int/lit16 v13, v10, 0x360

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v6, v10, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v10, 0x2

    new-array v12, v10, [Ljava/lang/Class;

    const/16 v10, 0x187

    aget-byte v13, v1, v10

    int-to-byte v10, v13

    const/16 v13, 0xc

    aget-byte v1, v1, v13

    int-to-byte v1, v1

    or-int/lit16 v13, v1, 0x360

    int-to-short v13, v13

    invoke-static {v10, v1, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v10, 0x0

    aput-object v1, v12, v10

    const/4 v1, 0x1

    aput-object v9, v12, v1

    invoke-virtual {v6, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    move-object v13, v1

    goto/16 :goto_24

    :catchall_7
    move-exception v0

    move-object v1, v0

    :try_start_26
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_22

    throw v2

    :cond_22
    throw v1
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_4

    :cond_23
    const/4 v6, 0x2

    :try_start_27
    new-array v7, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v11, v7, v6

    const/4 v6, 0x1

    aput-object v1, v7, v6

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v6, 0x187

    aget-byte v10, v1, v6

    int-to-byte v6, v10

    const/16 v10, 0xc

    aget-byte v12, v1, v10

    int-to-byte v10, v12

    xor-int/lit16 v12, v10, 0x360

    and-int/lit16 v15, v10, 0x360

    or-int/2addr v12, v15

    int-to-short v12, v12

    invoke-static {v6, v10, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v10, 0x2

    new-array v12, v10, [Ljava/lang/Class;

    const/16 v10, 0x187

    aget-byte v15, v1, v10

    int-to-byte v10, v15

    move-object/from16 v40, v2

    const/16 v15, 0xc

    aget-byte v2, v1, v15

    int-to-byte v2, v2

    or-int/lit16 v15, v2, 0x360

    int-to-short v15, v15

    invoke-static {v10, v2, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v10, 0x0

    aput-object v2, v12, v10

    const/4 v2, 0x1

    aput-object v9, v12, v2

    invoke-virtual {v6, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_b

    sget v6, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 v7, v6, 0x75

    const/16 v10, 0x75

    or-int/2addr v6, v10

    add-int/2addr v7, v6

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v6, 0x1

    :try_start_28
    new-array v7, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v7, v6

    aget-byte v6, v1, v10

    int-to-byte v6, v6

    const/16 v10, 0xc

    aget-byte v12, v1, v10

    int-to-byte v10, v12

    const/16 v12, 0x322

    int-to-short v12, v12

    invoke-static {v6, v10, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v10, 0x1

    new-array v15, v10, [Ljava/lang/Class;

    move-object/from16 v41, v4

    const/16 v10, 0x187

    aget-byte v4, v1, v10

    int-to-byte v4, v4

    move-object/from16 v42, v11

    const/16 v10, 0xc

    aget-byte v11, v1, v10

    int-to-byte v10, v11

    xor-int/lit16 v11, v10, 0x360

    move-object/from16 v43, v13

    and-int/lit16 v13, v10, 0x360

    or-int/2addr v11, v13

    int-to-short v11, v11

    invoke-static {v4, v10, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v10, 0x0

    aput-object v4, v15, v10

    invoke-virtual {v6, v15}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_9

    const/16 v6, 0x75

    :try_start_29
    aget-byte v7, v1, v6

    int-to-byte v6, v7

    const/16 v7, 0xc

    aget-byte v10, v1, v7

    int-to-byte v7, v10

    invoke-static {v6, v7, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v1, v29

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v1, v1, v19

    int-to-byte v1, v1

    const/16 v10, 0x2c1

    int-to-short v11, v10

    invoke-static {v7, v1, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-virtual {v6, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_8

    move-object v1, v2

    move-object/from16 v2, v40

    move-object/from16 v4, v41

    move-object/from16 v13, v43

    :goto_25
    move-object/from16 v10, v36

    move-object/from16 v12, v37

    move-object/from16 v6, v38

    move-object/from16 v7, v39

    move-object/from16 v11, v42

    goto/16 :goto_16

    :catchall_8
    move-exception v0

    move-object v1, v0

    :try_start_2a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_24

    throw v4

    :catch_7
    move-exception v0

    move-object v1, v0

    goto :goto_26

    :cond_24
    throw v1

    :catchall_9
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_25

    throw v4

    :cond_25
    throw v1
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_7
    .catchall {:try_start_2a .. :try_end_2a} :catchall_4

    :goto_26
    :try_start_2b
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v7, v6, v29

    neg-int v7, v7

    int-to-byte v7, v7

    const/16 v10, 0x11b

    aget-byte v11, v6, v10

    int-to-byte v10, v11

    sget v11, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    or-int/lit16 v11, v11, 0x310

    int-to-short v11, v11

    invoke-static {v7, v10, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x63

    aget-byte v2, v6, v2

    int-to-byte v2, v2

    const/16 v7, 0x16d

    aget-byte v7, v6, v7

    const/4 v10, 0x1

    sub-int/2addr v7, v10

    int-to-byte v7, v7

    const/16 v10, 0x106

    int-to-short v10, v10

    invoke-static {v2, v7, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_4

    const/4 v4, 0x2

    :try_start_2c
    new-array v7, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v7, v4

    const/4 v2, 0x1

    aput-object v1, v7, v2

    const/16 v1, 0x7a

    aget-byte v2, v6, v1

    int-to-byte v1, v2

    const/16 v2, 0xc

    aget-byte v4, v6, v2

    int-to-byte v2, v4

    const/16 v4, 0x340

    int-to-short v6, v4

    invoke-static {v1, v2, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v9, v4, v2

    const-class v2, Ljava/lang/Throwable;

    const/4 v6, 0x1

    aput-object v2, v4, v6

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_a

    :catchall_a
    move-exception v0

    move-object v1, v0

    :try_start_2d
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_26

    throw v2

    :cond_26
    throw v1

    :catchall_b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_27

    throw v2

    :cond_27
    throw v1

    :catchall_c
    move-exception v0

    :goto_27
    move-object/from16 v39, v7

    move-object/from16 v36, v10

    goto/16 :goto_1b

    :catchall_d
    move-exception v0

    :goto_28
    move-object/from16 v38, v6

    goto :goto_27

    :cond_28
    move-object/from16 v35, v1

    move-object/from16 v40, v2

    move-object/from16 v41, v4

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v36, v10

    move-object/from16 v43, v13

    goto :goto_2c

    :catchall_e
    move-exception v0

    :goto_29
    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v36, v10

    move-object v1, v0

    goto :goto_2b

    :catchall_f
    move-exception v0

    :goto_2a
    move/from16 v34, v4

    goto :goto_29

    :catchall_10
    move-exception v0

    move-object/from16 v33, v1

    goto :goto_2a

    :goto_2b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_29

    throw v2

    :cond_29
    throw v1
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_4

    :catchall_11
    move-exception v0

    move-object/from16 v33, v1

    move/from16 v34, v4

    goto :goto_28

    :cond_2a
    move-object/from16 v33, v1

    move/from16 v34, v4

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v36, v10

    const/16 v35, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    :goto_2c
    const/16 v1, 0x1ad4

    :try_start_2e
    new-array v1, v1, [B

    sget-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v4, 0x6a

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v6, 0x207

    aget-byte v6, v2, v6

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v7, 0x2c5

    int-to-short v7, v7

    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_4b

    sget v6, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 v7, v6, 0x11

    or-int/lit8 v6, v6, 0x11

    add-int/2addr v7, v6

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v6, 0x1

    :try_start_2f
    new-array v7, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v7, v6

    const/16 v4, 0xc

    aget-byte v6, v2, v4

    int-to-byte v4, v6

    int-to-byte v6, v4

    xor-int/lit16 v10, v6, 0x1d2

    and-int/lit16 v11, v6, 0x1d2

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v4, v6, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v6, 0x1

    new-array v10, v6, [Ljava/lang/Class;

    const/16 v6, 0x7a

    aget-byte v11, v2, v6

    int-to-byte v6, v11

    const/16 v11, 0xc

    aget-byte v12, v2, v11

    int-to-byte v11, v12

    const/16 v12, 0x3d9

    int-to-short v12, v12

    invoke-static {v6, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v11, 0x0

    aput-object v6, v10, v11

    invoke-virtual {v4, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_4f

    sget v6, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 v7, v6, 0x67

    or-int/lit8 v6, v6, 0x67

    add-int/2addr v7, v6

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v6, 0x1

    :try_start_30
    new-array v7, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v7, v6

    const/16 v6, 0xc

    aget-byte v10, v2, v6

    int-to-byte v6, v10

    int-to-byte v10, v6

    xor-int/lit16 v11, v10, 0x1d2

    and-int/lit16 v12, v10, 0x1d2

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v10, 0x2c

    aget-byte v10, v2, v10

    int-to-byte v10, v10

    const/16 v11, 0x5c

    aget-byte v11, v2, v11

    int-to-byte v11, v11

    const/16 v12, 0xb9

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v16, v12, v11

    invoke-virtual {v6, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_4e

    const/16 v6, 0xc

    :try_start_31
    aget-byte v7, v2, v6

    int-to-byte v6, v7

    int-to-byte v7, v6

    or-int/lit16 v10, v7, 0x1d2

    int-to-short v10, v10

    invoke-static {v6, v7, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v2, v29

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v2, v2, v19

    int-to-byte v2, v2

    const/16 v10, 0x2c1

    int-to-short v11, v10

    invoke-static {v7, v2, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v6, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_4d

    const/16 v2, 0x14

    const/16 v4, 0x1aa9

    move-object/from16 v7, v33

    const/4 v6, 0x0

    :goto_2d
    and-int/lit16 v10, v2, 0x4bd

    or-int/lit16 v11, v2, 0x4bd

    add-int/2addr v10, v11

    add-int/lit16 v11, v2, 0x111f

    :try_start_32
    aget-byte v11, v1, v11

    add-int/lit8 v11, v11, 0x36

    int-to-byte v11, v11

    aput-byte v11, v1, v10

    array-length v10, v1
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_4b

    neg-int v11, v2

    not-int v11, v11

    sub-int/2addr v10, v11

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    const/4 v12, 0x3

    :try_start_33
    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v12, 0x2

    aput-object v10, v13, v12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v13, v11

    const/4 v10, 0x0

    aput-object v1, v13, v10

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v10, 0x77

    aget-byte v10, v1, v10

    int-to-byte v10, v10

    const/16 v11, 0xc

    aget-byte v12, v1, v11

    int-to-byte v11, v12

    sget v12, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    xor-int/lit8 v15, v12, 0x13

    and-int/lit8 v28, v12, 0x13

    or-int v15, v15, v28

    int-to-short v15, v15

    invoke-static {v10, v11, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v11, 0x3

    new-array v15, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v16, v15, v11

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v28, 0x1

    aput-object v11, v15, v28

    const/16 v17, 0x2

    aput-object v11, v15, v17

    invoke-virtual {v10, v15}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v45, v10

    check-cast v45, Ljava/io/InputStream;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_4c

    :try_start_34
    sget-object v10, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_4b

    if-nez v10, :cond_2c

    const/4 v13, 0x0

    :try_start_35
    invoke-static {v13, v13}, Landroid/graphics/PointF;->length(FF)F

    move-result v10
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_15

    cmpl-float v10, v10, v13

    neg-int v10, v10

    const/16 v13, 0x8

    xor-int/lit8 v15, v10, 0x8

    and-int/2addr v10, v13

    const/4 v13, 0x1

    shl-int/2addr v10, v13

    add-int/2addr v15, v10

    int-to-short v10, v15

    const/4 v15, 0x2

    :try_start_36
    new-array v13, v15, [Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v28

    const/16 v31, 0x1

    aput-object v28, v13, v31

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v28

    aput-object v28, v13, v15

    move/from16 v28, v4

    const/16 v15, 0x15

    aget-byte v4, v1, v15

    int-to-byte v4, v4

    aget-byte v15, v1, v20

    int-to-byte v15, v15

    or-int/lit16 v12, v12, 0x193

    int-to-short v12, v12

    invoke-static {v4, v15, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v12, 0x1d4

    aget-byte v15, v1, v12

    int-to-byte v12, v15

    aget-byte v15, v1, v21
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_14

    int-to-byte v15, v15

    move-object/from16 v37, v8

    const/16 v8, 0xcb

    int-to-short v8, v8

    :try_start_37
    invoke-static {v12, v15, v8}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x2

    new-array v15, v12, [Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v11, v15, v12

    const/4 v12, 0x1

    aput-object v11, v15, v12

    invoke-virtual {v4, v8, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v8, 0x0

    invoke-virtual {v4, v8, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_13

    const v8, -0xd327c74

    or-int v11, v4, v8

    const/4 v12, 0x1

    shl-int/2addr v11, v12

    xor-int/2addr v4, v8

    sub-int v50, v11, v4

    const/4 v4, 0x0

    :try_start_38
    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    move-result v8

    cmpl-float v8, v8, v4

    neg-int v8, v8

    not-int v8, v8

    const v11, -0x5eb9c7db

    sub-int v47, v11, v8

    new-instance v8, Lcom/appsflyer/internal/AFf1aSDK;

    sget v46, Lcom/appsflyer/internal/AFb1oSDK;->setDebugLog:I

    sget v49, Lcom/appsflyer/internal/AFb1oSDK;->updateServerUninstallToken:I

    move-object/from16 v44, v8

    move/from16 v48, v10

    invoke-direct/range {v44 .. v50}, Lcom/appsflyer/internal/AFf1aSDK;-><init>(Ljava/io/InputStream;IISII)V

    move/from16 v44, v5

    move-object/from16 v22, v6

    goto/16 :goto_31

    :catchall_12
    move-exception v0

    :goto_2e
    move-object v1, v0

    move/from16 v44, v5

    goto/16 :goto_1c

    :catchall_13
    move-exception v0

    :goto_2f
    const/4 v4, 0x0

    move-object v1, v0

    goto :goto_30

    :catchall_14
    move-exception v0

    move-object/from16 v37, v8

    goto :goto_2f

    :goto_30
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2b

    throw v2

    :cond_2b
    throw v1
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_12

    :catchall_15
    move-exception v0

    move-object/from16 v37, v8

    move v4, v13

    goto :goto_2e

    :cond_2c
    move/from16 v28, v4

    move-object/from16 v37, v8

    const/4 v4, 0x0

    :try_start_39
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    const/16 v12, 0x8

    add-int/2addr v8, v12

    int-to-short v8, v8

    const-wide/16 v46, 0x0

    invoke-static/range {v46 .. v47}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v13

    neg-int v13, v13

    neg-int v13, v13

    not-int v13, v13

    const v15, -0x9334371

    sub-int/2addr v15, v13

    const/4 v13, 0x0

    invoke-static {v13}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v18
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_4a

    const v13, -0x73998320

    add-int v18, v18, v13

    const/4 v13, 0x4

    :try_start_3a
    new-array v4, v13, [Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v18, 0x3

    aput-object v13, v4, v18

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v15, 0x2

    aput-object v13, v4, v15

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    const/4 v13, 0x1

    aput-object v8, v4, v13

    const/4 v8, 0x0

    aput-object v45, v4, v8

    const/16 v8, 0x47

    aget-byte v13, v1, v8

    int-to-byte v8, v13

    aget-byte v13, v1, v19

    int-to-byte v13, v13

    const/16 v15, 0x289

    int-to-short v15, v15

    invoke-static {v8, v13, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    sget-object v13, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    check-cast v13, Ljava/lang/ClassLoader;

    const/4 v15, 0x1

    invoke-static {v8, v15, v13}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v13, v1, v19

    int-to-byte v13, v13

    const/16 v15, 0x6f

    aget-byte v15, v1, v15

    int-to-byte v15, v15

    const/16 v12, 0x150

    int-to-short v12, v12

    invoke-static {v13, v15, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x4

    new-array v15, v13, [Ljava/lang/Class;

    const/16 v22, 0x7a

    aget-byte v13, v1, v22
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_49

    int-to-byte v13, v13

    move/from16 v44, v5

    const/16 v22, 0xc

    :try_start_3b
    aget-byte v5, v1, v22

    int-to-byte v5, v5

    move-object/from16 v22, v6

    const/16 v6, 0x3d9

    int-to-short v6, v6

    invoke-static {v13, v5, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v15, v6

    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x1

    aput-object v5, v15, v6

    const/4 v5, 0x2

    aput-object v11, v15, v5

    const/4 v5, 0x3

    aput-object v11, v15, v5

    invoke-virtual {v8, v12, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v10, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/io/InputStream;
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_48

    :goto_31
    const/16 v4, 0x10

    int-to-long v4, v4

    const/4 v6, 0x1

    :try_start_3c
    new-array v10, v6, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v10, v5

    const/16 v4, 0x7a

    aget-byte v5, v1, v4

    int-to-byte v4, v5

    const/16 v5, 0xc

    aget-byte v6, v1, v5

    int-to-byte v5, v6

    const/16 v6, 0x3d9

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0x160

    aget-byte v11, v1, v5

    int-to-byte v5, v11

    const/16 v11, 0x17

    aget-byte v11, v1, v11

    int-to-byte v11, v11

    const/16 v12, 0x260

    int-to-short v12, v12

    invoke-static {v5, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v13, 0x0

    aput-object v11, v12, v13

    invoke-virtual {v4, v5, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_47

    const/4 v4, 0x1

    if-eq v14, v4, :cond_3c

    :try_start_3d
    new-instance v5, Ljava/util/zip/ZipInputStream;

    invoke-direct {v5, v8}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v5}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v8
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_17

    :try_start_3e
    new-array v10, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v10, v4

    const/16 v4, 0x1d

    aget-byte v5, v1, v4

    int-to-byte v4, v5

    const/16 v5, 0xc

    aget-byte v11, v1, v5

    int-to-byte v5, v11

    const/16 v11, 0x187

    aget-byte v12, v1, v11

    int-to-short v11, v12

    invoke-static {v4, v5, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v5, 0x1

    new-array v11, v5, [Ljava/lang/Class;

    const/16 v5, 0x7a

    aget-byte v12, v1, v5

    int-to-byte v5, v12

    const/16 v12, 0xc

    aget-byte v13, v1, v12

    int-to-byte v12, v13

    invoke-static {v5, v12, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v12, 0x0

    aput-object v5, v11, v12

    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_20

    const/16 v5, 0x3e

    :try_start_3f
    aget-byte v10, v1, v5

    int-to-byte v5, v10

    const/16 v10, 0xc

    aget-byte v1, v1, v10

    int-to-byte v1, v1

    xor-int/lit16 v10, v1, 0x202

    and-int/lit16 v11, v1, 0x202

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v5, v1, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_1f

    const/16 v5, 0x400

    :try_start_40
    new-array v5, v5, [B
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_17

    const/4 v10, 0x0

    :goto_32
    sget v11, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    xor-int/lit8 v12, v11, 0x3b

    and-int/lit8 v11, v11, 0x3b

    const/4 v13, 0x1

    shl-int/2addr v11, v13

    add-int/2addr v12, v11

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_41
    new-array v11, v13, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v5, v11, v12

    sget-object v12, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v13, 0x1d

    aget-byte v15, v12, v13

    int-to-byte v13, v15

    move/from16 v45, v2

    const/16 v15, 0xc

    aget-byte v2, v12, v15

    int-to-byte v2, v2

    move-object/from16 v46, v7

    const/16 v15, 0x187

    aget-byte v7, v12, v15

    int-to-short v7, v7

    invoke-static {v13, v2, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v7, 0x160

    aget-byte v13, v12, v7

    int-to-byte v7, v13

    const/16 v13, 0x5c

    aget-byte v13, v12, v13

    int-to-byte v13, v13

    const/16 v15, 0xe3

    int-to-short v15, v15

    invoke-static {v7, v13, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v13, 0x1

    new-array v15, v13, [Ljava/lang/Class;

    const/4 v13, 0x0

    aput-object v16, v15, v13

    invoke-virtual {v2, v7, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_1e

    if-lez v7, :cond_2e

    move v11, v14

    int-to-long v13, v10

    :try_start_42
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v47
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_17

    cmp-long v13, v13, v47

    if-gez v13, :cond_2f

    const/4 v13, 0x3

    :try_start_43
    new-array v14, v13, [Ljava/lang/Object;

    const/4 v13, 0x2

    aput-object v2, v14, v13

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v15, 0x1

    aput-object v13, v14, v15

    aput-object v5, v14, v2

    const/16 v2, 0x3e

    aget-byte v13, v12, v2

    int-to-byte v2, v13

    const/16 v13, 0xc

    aget-byte v15, v12, v13

    int-to-byte v13, v15

    xor-int/lit16 v15, v13, 0x202

    move-object/from16 v28, v5

    and-int/lit16 v5, v13, 0x202

    or-int/2addr v5, v15

    int-to-short v5, v5

    invoke-static {v2, v13, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v12, v29

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v13, 0xa

    aget-byte v12, v12, v13

    int-to-byte v12, v12

    or-int/lit16 v13, v12, 0xd5

    int-to-short v13, v13

    invoke-static {v5, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    const/4 v12, 0x3

    new-array v13, v12, [Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v16, v13, v12

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v15, 0x1

    aput-object v12, v13, v15

    const/4 v15, 0x2

    aput-object v12, v13, v15

    invoke-virtual {v2, v5, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_16

    neg-int v2, v7

    neg-int v2, v2

    and-int v5, v10, v2

    or-int/2addr v2, v10

    add-int v10, v5, v2

    move v14, v11

    move-object/from16 v5, v28

    move/from16 v2, v45

    move-object/from16 v7, v46

    goto/16 :goto_32

    :catchall_16
    move-exception v0

    move-object v1, v0

    :try_start_44
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2d

    throw v2

    :catchall_17
    move-exception v0

    move-object v1, v0

    goto/16 :goto_1c

    :cond_2d
    throw v1
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_17

    :cond_2e
    move v11, v14

    :cond_2f
    sget v2, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    and-int/lit8 v5, v2, 0x75

    const/16 v7, 0x75

    or-int/2addr v2, v7

    add-int/2addr v5, v2

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/16 v2, 0x3e

    :try_start_45
    aget-byte v5, v12, v2

    int-to-byte v2, v5

    const/16 v5, 0xc

    aget-byte v7, v12, v5

    int-to-byte v5, v7

    xor-int/lit16 v7, v5, 0x202

    and-int/lit16 v8, v5, 0x202

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {v2, v5, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v5, 0x1d4

    aget-byte v7, v12, v5

    int-to-byte v7, v7

    const/16 v8, 0x47

    aget-byte v10, v12, v8

    int-to-byte v8, v10

    const/16 v10, 0x3a1

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_1d

    const/16 v7, 0x1d

    :try_start_46
    aget-byte v8, v12, v7

    int-to-byte v7, v8

    const/16 v8, 0xc

    aget-byte v10, v12, v8

    int-to-byte v8, v10

    const/16 v10, 0x187

    aget-byte v13, v12, v10

    int-to-short v10, v13

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v12, v29

    neg-int v8, v8

    int-to-byte v8, v8

    aget-byte v10, v12, v19

    int-to-byte v10, v10

    const/16 v12, 0x2c1

    int-to-short v13, v12

    invoke-static {v8, v10, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v7, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v4, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_18

    goto :goto_33

    :catchall_18
    move-exception v0

    move-object v4, v0

    :try_start_47
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v7

    if-eqz v7, :cond_30

    throw v7

    :cond_30
    throw v4
    :try_end_47
    .catch Ljava/io/IOException; {:try_start_47 .. :try_end_47} :catch_8
    .catchall {:try_start_47 .. :try_end_47} :catchall_17

    :catch_8
    :goto_33
    sget v4, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    and-int/lit8 v7, v4, 0x77

    or-int/lit8 v4, v4, 0x77

    add-int/2addr v7, v4

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_48
    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v7, 0x3e

    aget-byte v8, v4, v7

    int-to-byte v7, v8

    const/16 v8, 0xc

    aget-byte v10, v4, v8

    int-to-byte v8, v10

    xor-int/lit16 v10, v8, 0x202

    and-int/lit16 v12, v8, 0x202

    or-int/2addr v10, v12

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v4, v29

    neg-int v8, v8

    int-to-byte v8, v8

    aget-byte v4, v4, v19

    int-to-byte v4, v4

    const/16 v10, 0x2c1

    int-to-short v12, v10

    invoke-static {v8, v4, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    invoke-virtual {v7, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_19

    goto :goto_34

    :catchall_19
    move-exception v0

    move-object v1, v0

    :try_start_49
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_31

    throw v4

    :cond_31
    throw v1
    :try_end_49
    .catch Ljava/io/IOException; {:try_start_49 .. :try_end_49} :catch_9
    .catchall {:try_start_49 .. :try_end_49} :catchall_17

    :catch_9
    :goto_34
    sget v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    add-int/lit8 v1, v1, 0x29

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    :try_start_4a
    const-class v1, Ljava/lang/Class;

    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v7, v4, v20

    int-to-byte v7, v7

    aget-byte v8, v4, v21

    int-to-byte v8, v8

    const/16 v10, 0x263

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v1, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_1c

    const/16 v7, 0xa

    :try_start_4b
    aget-byte v7, v4, v7

    int-to-byte v7, v7

    const/16 v8, 0x1ee

    aget-byte v10, v4, v8

    int-to-byte v8, v10

    const/16 v10, 0x96

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/4 v8, 0x2

    new-array v10, v8, [Ljava/lang/Class;

    const/16 v8, 0x7a

    aget-byte v12, v4, v8

    int-to-byte v8, v12

    const/16 v12, 0xc

    aget-byte v13, v4, v12

    int-to-byte v12, v13

    const/16 v13, 0x177

    aget-byte v13, v4, v13

    const/4 v14, 0x1

    sub-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v8, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v12, 0x0

    aput-object v8, v10, v12

    const/16 v8, 0x15

    aget-byte v12, v4, v8

    int-to-byte v8, v12

    const/16 v12, 0xc

    aget-byte v13, v4, v12

    int-to-byte v12, v13

    const/16 v13, 0x19c

    int-to-short v13, v13

    invoke-static {v8, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v12, 0x1

    aput-object v8, v10, v12

    invoke-virtual {v7, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    const/4 v8, 0x2

    new-array v10, v8, [Ljava/lang/Object;
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_17

    :try_start_4c
    new-array v8, v12, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v2, v8, v12

    const/16 v2, 0x7a

    aget-byte v12, v4, v2

    int-to-byte v2, v12

    const/16 v12, 0xc

    aget-byte v13, v4, v12

    int-to-byte v12, v13

    const/16 v13, 0x177

    aget-byte v13, v4, v13

    const/4 v14, 0x1

    sub-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v2, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v12, 0x160

    aget-byte v13, v4, v12

    int-to-byte v12, v13

    const/16 v13, 0xa

    aget-byte v13, v4, v13

    int-to-byte v13, v13

    xor-int/lit16 v14, v13, 0x3bf

    and-int/lit16 v15, v13, 0x3bf

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    new-array v14, v13, [Ljava/lang/Class;

    const/4 v15, 0x0

    aput-object v16, v14, v15

    invoke-virtual {v2, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v12, 0x0

    invoke-virtual {v2, v12, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_1b

    :try_start_4d
    aput-object v2, v10, v15

    aput-object v1, v10, v13

    invoke-virtual {v7, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_17

    const/16 v7, 0x17

    :try_start_4e
    aget-byte v7, v4, v7

    int-to-byte v7, v7

    const/16 v8, 0x1ee

    aget-byte v10, v4, v8

    int-to-byte v8, v10

    const/16 v10, 0x123

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v8, 0x106

    aget-byte v10, v4, v8

    int-to-byte v8, v10

    const/16 v10, 0x3e

    aget-byte v12, v4, v10

    int-to-byte v12, v12

    const/16 v13, 0x352

    int-to-short v13, v13

    invoke-static {v8, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    const/16 v13, 0x75

    aget-byte v14, v4, v13

    int-to-byte v13, v14

    const/16 v14, 0x1d

    aget-byte v15, v4, v14

    int-to-byte v14, v15

    const/16 v15, 0x3c2

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x1

    invoke-virtual {v13, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v14, 0x3c

    aget-byte v14, v4, v14

    int-to-byte v14, v14

    const/16 v15, 0x1d

    aget-byte v4, v4, v15

    int-to-byte v4, v4

    or-int/lit16 v5, v4, 0x2a0

    int-to-short v5, v5

    invoke-static {v14, v4, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v13, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    new-instance v12, Ljava/util/ArrayList;

    check-cast v5, Ljava/util/List;

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v14

    invoke-static {v5, v14}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v5

    const/4 v10, 0x0

    :goto_35
    if-ge v10, v14, :cond_32

    invoke-static {v8, v10}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5, v10, v15}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v15, 0x1

    add-int/2addr v10, v15

    const/16 v15, 0x1d

    goto :goto_35

    :catch_a
    move-exception v0

    move-object v2, v0

    goto :goto_37

    :cond_32
    invoke-virtual {v13, v7, v12}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v7, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4e
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_4e} :catch_a
    .catchall {:try_start_4e .. :try_end_4e} :catchall_17

    :try_start_4f
    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_17

    if-nez v1, :cond_34

    sget v1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v4, v1, 0x80

    sput v4, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v4, 0x2

    rem-int/2addr v1, v4

    if-eqz v1, :cond_33

    :try_start_50
    sput-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    goto :goto_36

    :cond_33
    sput-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    const/4 v1, 0x0

    throw v1

    :cond_34
    :goto_36
    move/from16 v48, v6

    move v1, v11

    const/4 v4, 0x1

    const/16 v6, 0x75

    const/4 v7, 0x3

    const/16 v8, 0x160

    const/16 v10, 0x1f

    goto/16 :goto_3d

    :goto_37
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v6, v5, v29

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v7, 0x11b

    aget-byte v8, v5, v7

    int-to-byte v7, v8

    const/16 v8, 0x180

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x63

    aget-byte v1, v5, v1

    int-to-byte v1, v1

    const/16 v6, 0x16d

    aget-byte v6, v5, v6

    add-int/lit8 v6, v6, -0x1

    int-to-byte v6, v6

    const/16 v7, 0x106

    int-to-short v7, v7

    invoke-static {v1, v6, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_17

    const/4 v4, 0x2

    :try_start_51
    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v6, v4

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/16 v1, 0x7a

    aget-byte v2, v5, v1

    int-to-byte v1, v2

    const/16 v2, 0xc

    aget-byte v4, v5, v2

    int-to-byte v2, v4

    const/16 v4, 0x340

    int-to-short v5, v4

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v9, v4, v2

    const-class v2, Ljava/lang/Throwable;

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_1a

    :catchall_1a
    move-exception v0

    move-object v1, v0

    :try_start_52
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_35

    throw v2

    :cond_35
    throw v1

    :catchall_1b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_36

    throw v2

    :cond_36
    throw v1

    :catchall_1c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_37

    throw v2

    :cond_37
    throw v1

    :catchall_1d
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_38

    throw v2

    :cond_38
    throw v1

    :catchall_1e
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_39

    throw v2

    :cond_39
    throw v1

    :catchall_1f
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3a

    throw v2

    :cond_3a
    throw v1

    :catchall_20
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3b

    throw v2

    :cond_3b
    throw v1
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_17

    :cond_3c
    move/from16 v45, v2

    move-object/from16 v46, v7

    move v11, v14

    :try_start_53
    sget-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_46

    if-nez v2, :cond_3d

    move-object/from16 v4, v40

    goto :goto_38

    :cond_3d
    move-object/from16 v4, v41

    :goto_38
    if-nez v2, :cond_3e

    move-object/from16 v2, v43

    goto :goto_39

    :cond_3e
    move-object/from16 v2, v35

    :goto_39
    sget v5, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v5, v5, 0x6d

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v5, 0x1

    :try_start_54
    new-array v7, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v7, v5

    const/16 v5, 0x75

    aget-byte v10, v1, v5

    int-to-byte v5, v10

    const/16 v10, 0xc

    aget-byte v12, v1, v10

    int-to-byte v10, v12

    const/16 v12, 0x322

    int-to-short v12, v12

    invoke-static {v5, v10, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v10, 0x1

    new-array v13, v10, [Ljava/lang/Class;

    const/16 v10, 0x187

    aget-byte v14, v1, v10

    int-to-byte v10, v14

    const/16 v14, 0xc

    aget-byte v1, v1, v14

    int-to-byte v1, v1

    xor-int/lit16 v14, v1, 0x360

    and-int/lit16 v15, v1, 0x360

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v10, v1, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v10, 0x0

    aput-object v1, v13, v10

    invoke-virtual {v5, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_3e

    const/16 v5, 0x400

    :try_start_55
    new-array v7, v5, [B
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_34

    move/from16 v10, v28

    :goto_3a
    if-lez v10, :cond_41

    :try_start_56
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    move-result v13
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_22

    sget v14, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    and-int/lit8 v15, v14, 0x41

    or-int/lit8 v14, v14, 0x41

    add-int/2addr v15, v14

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v14, 0x3

    :try_start_57
    new-array v15, v14, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x2

    aput-object v13, v15, v14

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v28, 0x1

    aput-object v14, v15, v28

    aput-object v7, v15, v13

    sget-object v13, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v14, 0x7a

    aget-byte v5, v13, v14

    int-to-byte v5, v5

    move/from16 v47, v11

    const/16 v14, 0xc

    aget-byte v11, v13, v14

    int-to-byte v11, v11

    invoke-static {v5, v11, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v11, 0x160

    aget-byte v14, v13, v11

    int-to-byte v11, v14

    const/16 v14, 0x5c

    aget-byte v14, v13, v14

    int-to-byte v14, v14

    move/from16 v48, v6

    const/16 v6, 0xe3

    int-to-short v6, v6

    invoke-static {v11, v14, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x3

    new-array v14, v11, [Ljava/lang/Class;

    const/4 v11, 0x0

    aput-object v16, v14, v11

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v32, 0x1

    aput-object v11, v14, v32

    const/16 v17, 0x2

    aput-object v11, v14, v17

    invoke-virtual {v5, v6, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_23

    const/4 v14, -0x1

    if-eq v6, v14, :cond_42

    const/4 v14, 0x3

    :try_start_58
    new-array v15, v14, [Ljava/lang/Object;

    const/4 v14, 0x2

    aput-object v5, v15, v14

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v31, 0x1

    aput-object v14, v15, v31

    aput-object v7, v15, v5

    const/16 v5, 0x75

    aget-byte v14, v13, v5

    int-to-byte v5, v14

    move-object/from16 v49, v7

    const/16 v14, 0xc

    aget-byte v7, v13, v14

    int-to-byte v7, v7

    invoke-static {v5, v7, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v7, v13, v29

    neg-int v7, v7

    int-to-byte v7, v7

    const/16 v14, 0xa

    aget-byte v13, v13, v14

    int-to-byte v13, v13

    or-int/lit16 v14, v13, 0xd5

    int-to-short v14, v14

    invoke-static {v7, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v13, 0x3

    new-array v14, v13, [Ljava/lang/Class;

    const/4 v13, 0x0

    aput-object v16, v14, v13

    const/4 v13, 0x1

    aput-object v11, v14, v13

    const/16 v17, 0x2

    aput-object v11, v14, v17

    invoke-virtual {v5, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v1, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_21

    neg-int v5, v6

    or-int v6, v10, v5

    shl-int/2addr v6, v13

    xor-int/2addr v5, v10

    sub-int v10, v6, v5

    move/from16 v11, v47

    move/from16 v6, v48

    move-object/from16 v7, v49

    const/16 v5, 0x400

    goto/16 :goto_3a

    :catchall_21
    move-exception v0

    move-object v1, v0

    :try_start_59
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3f

    throw v5

    :catchall_22
    move-exception v0

    move-object v1, v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    goto/16 :goto_4e

    :cond_3f
    throw v1

    :catchall_23
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_40

    throw v5

    :cond_40
    throw v1
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_22

    :cond_41
    move/from16 v48, v6

    move/from16 v47, v11

    :cond_42
    :try_start_5a
    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v6, 0x75

    aget-byte v7, v5, v6

    int-to-byte v6, v7

    const/16 v7, 0xc

    aget-byte v8, v5, v7

    int-to-byte v7, v8

    invoke-static {v6, v7, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v5, v29

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v8, v5, v21

    int-to-byte v8, v8

    xor-int/lit16 v10, v8, 0x26f

    and-int/lit16 v11, v8, 0x26f

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_3d

    sget v7, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    add-int/lit8 v7, v7, 0x31

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/16 v7, 0xba

    :try_start_5b
    aget-byte v7, v5, v7

    int-to-byte v7, v7

    const/16 v8, 0xc

    aget-byte v10, v5, v8

    int-to-byte v8, v10

    const/16 v10, 0x38c

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v8, 0x160

    aget-byte v10, v5, v8

    int-to-byte v10, v10

    const/16 v11, 0x17

    aget-byte v11, v5, v11

    int-to-byte v11, v11

    xor-int/lit16 v13, v11, 0x15b

    and-int/lit16 v14, v11, 0x15b

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v10, v11, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v7, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_3c

    sget v6, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    xor-int/lit8 v7, v6, 0x23

    and-int/lit8 v6, v6, 0x23

    const/4 v10, 0x1

    shl-int/2addr v6, v10

    add-int/2addr v7, v6

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/16 v6, 0x75

    :try_start_5c
    aget-byte v7, v5, v6

    int-to-byte v7, v7

    const/16 v10, 0xc

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    invoke-static {v7, v10, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v29

    neg-int v10, v10

    int-to-byte v10, v10

    aget-byte v11, v5, v19

    int-to-byte v11, v11

    const/16 v12, 0x2c1

    int-to-short v13, v12

    invoke-static {v10, v11, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v7, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_3b

    const/16 v1, 0x15

    :try_start_5d
    aget-byte v7, v5, v1
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_3a

    int-to-byte v1, v7

    const/16 v7, 0x1ee

    :try_start_5e
    aget-byte v10, v5, v7

    int-to-byte v7, v10

    const/16 v10, 0x106

    int-to-short v11, v10

    invoke-static {v1, v7, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v7, 0x260

    aget-byte v7, v5, v7

    int-to-byte v7, v7

    const/16 v10, 0x3c

    aget-byte v10, v5, v10

    int-to-byte v10, v10

    const/16 v11, 0x1f5

    int-to-short v11, v11

    invoke-static {v7, v10, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x3

    new-array v11, v10, [Ljava/lang/Class;

    const/4 v10, 0x0

    aput-object v9, v11, v10

    const/4 v10, 0x1

    aput-object v9, v11, v10

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x2

    aput-object v10, v11, v12

    invoke-virtual {v1, v7, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v7, 0x3

    new-array v10, v7, [Ljava/lang/Object;
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_34

    const/16 v11, 0x187

    :try_start_5f
    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0xc

    aget-byte v13, v5, v12

    int-to-byte v12, v13

    xor-int/lit16 v13, v12, 0x360

    and-int/lit16 v14, v12, 0x360

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_38

    const/16 v12, 0x1f

    :try_start_60
    aget-byte v13, v5, v12
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_39

    int-to-byte v12, v13

    :try_start_61
    aget-byte v13, v5, v21

    int-to-byte v13, v13

    xor-int/lit16 v14, v13, 0x2e5

    and-int/lit16 v15, v13, 0x2e5

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v4, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_38

    const/4 v12, 0x0

    :try_start_62
    aput-object v11, v10, v12
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_34

    const/16 v11, 0x187

    :try_start_63
    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0xc

    aget-byte v13, v5, v12

    int-to-byte v12, v13

    xor-int/lit16 v13, v12, 0x360

    and-int/lit16 v14, v12, 0x360

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_35

    const/16 v12, 0x1f

    :try_start_64
    aget-byte v13, v5, v12
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_36

    int-to-byte v12, v13

    :try_start_65
    aget-byte v13, v5, v21

    int-to-byte v13, v13

    xor-int/lit16 v14, v13, 0x2e5

    and-int/lit16 v15, v13, 0x2e5

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v2, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_35

    const/4 v12, 0x1

    :try_start_66
    aput-object v11, v10, v12

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v11, 0x2

    aput-object v12, v10, v11

    invoke-virtual {v1, v13, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_34

    const/16 v10, 0x187

    :try_start_67
    aget-byte v11, v5, v10

    int-to-byte v10, v11

    const/16 v11, 0xc

    aget-byte v12, v5, v11

    int-to-byte v11, v12

    xor-int/lit16 v12, v11, 0x360

    and-int/lit16 v13, v11, 0x360

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v11, 0xc1

    aget-byte v12, v5, v11

    int-to-byte v11, v12

    const/16 v12, 0x1ee

    aget-byte v13, v5, v12

    int-to-byte v12, v13

    sget v13, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    xor-int/lit16 v14, v13, 0x212

    and-int/lit16 v15, v13, 0x212

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v4, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_33

    const/16 v4, 0x187

    :try_start_68
    aget-byte v10, v5, v4

    int-to-byte v4, v10

    const/16 v10, 0xc

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    xor-int/lit16 v11, v10, 0x360

    and-int/lit16 v12, v10, 0x360

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v4, v10, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v10, 0xc1

    aget-byte v11, v5, v10

    int-to-byte v10, v11

    const/16 v11, 0x1ee

    aget-byte v12, v5, v11

    int-to-byte v11, v12

    or-int/lit16 v12, v13, 0x212

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v4, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_32

    :try_start_69
    sget-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_31

    if-nez v2, :cond_45

    sget v2, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/16 v10, 0x1f

    or-int/lit8 v4, v2, 0x1f

    const/4 v11, 0x1

    shl-int/2addr v4, v11

    xor-int/2addr v2, v10

    sub-int/2addr v4, v2

    rem-int/lit16 v2, v4, 0x80

    sput v2, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v2, 0x2

    rem-int/2addr v4, v2

    if-eqz v4, :cond_44

    :try_start_6a
    const-class v2, Ljava/lang/Class;

    aget-byte v4, v5, v20

    int-to-byte v4, v4

    aget-byte v5, v5, v21

    int-to-byte v5, v5

    const/16 v11, 0x263

    int-to-short v11, v11

    invoke-static {v4, v5, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_25

    :try_start_6b
    sput-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    goto :goto_3c

    :catchall_24
    move-exception v0

    :goto_3b
    move-object v1, v0

    const/16 v4, 0x187

    const/16 v7, 0xc1

    goto/16 :goto_1d

    :catchall_25
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_43

    throw v2

    :cond_43
    throw v1

    :cond_44
    const/4 v1, 0x0

    throw v1

    :cond_45
    const/16 v10, 0x1f

    :goto_3c
    move-object v2, v1

    move/from16 v1, v47

    const/4 v4, 0x1

    :goto_3d
    if-eq v1, v4, :cond_46

    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v5, 0x15

    aget-byte v11, v4, v5

    int-to-byte v5, v11

    const/16 v11, 0xc

    aget-byte v12, v4, v11

    int-to-byte v11, v12

    const/16 v12, 0x19c

    int-to-short v12, v12

    invoke-static {v5, v11, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v11, 0x2c

    aget-byte v11, v4, v11

    int-to-byte v11, v11

    const/16 v12, 0x3c

    aget-byte v4, v4, v12

    int-to-byte v4, v4

    xor-int/lit16 v12, v4, 0x3a0

    and-int/lit16 v13, v4, 0x3a0

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v11, v4, v12}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const/4 v13, 0x0

    aput-object v9, v12, v13

    invoke-virtual {v5, v4, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_24

    :try_start_6c
    new-array v5, v11, [Ljava/lang/Object;

    aput-object v46, v5, v13
    :try_end_6c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6c .. :try_end_6c} :catch_b
    .catchall {:try_start_6c .. :try_end_6c} :catchall_26

    :try_start_6d
    invoke-virtual {v4, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6d .. :try_end_6d} :catch_b
    .catchall {:try_start_6d .. :try_end_6d} :catchall_24

    :goto_3e
    const/16 v12, 0x15

    goto/16 :goto_41

    :catch_b
    move-exception v0

    move-object v4, v0

    goto :goto_3f

    :catchall_26
    move-exception v0

    goto :goto_3b

    :goto_3f
    :try_start_6e
    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    check-cast v4, Ljava/lang/Exception;

    throw v4
    :try_end_6e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6e .. :try_end_6e} :catch_c
    .catchall {:try_start_6e .. :try_end_6e} :catchall_24

    :catch_c
    const/4 v4, 0x0

    goto :goto_3e

    :cond_46
    sget v4, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    xor-int/lit8 v5, v4, 0x4f

    and-int/lit8 v4, v4, 0x4f

    const/4 v11, 0x1

    shl-int/2addr v4, v11

    add-int/2addr v5, v4

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_6f
    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_2f

    const/16 v5, 0x15

    :try_start_70
    aget-byte v11, v4, v5
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_30

    int-to-byte v5, v11

    const/16 v11, 0x1ee

    :try_start_71
    aget-byte v12, v4, v11

    int-to-byte v11, v12

    const/16 v12, 0x106

    int-to-short v13, v12

    invoke-static {v5, v11, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v11, 0x2c

    aget-byte v11, v4, v11

    int-to-byte v11, v11

    const/16 v12, 0x3c

    aget-byte v12, v4, v12

    int-to-byte v12, v12

    xor-int/lit16 v13, v12, 0x3a0

    and-int/lit16 v14, v12, 0x3a0

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x2

    new-array v13, v12, [Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v9, v13, v12
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_2f

    const/16 v12, 0x15

    :try_start_72
    aget-byte v14, v4, v12

    int-to-byte v14, v14

    const/16 v15, 0xc

    aget-byte v6, v4, v15

    int-to-byte v6, v6

    const/16 v15, 0x19c

    int-to-short v15, v15

    invoke-static {v14, v6, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v14, 0x1

    aput-object v6, v13, v14

    invoke-virtual {v5, v11, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v11, 0x2

    new-array v13, v11, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v46, v13, v11
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_2d

    sget v11, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v11, v11, 0x79

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_73
    const-class v11, Ljava/lang/Class;

    aget-byte v14, v4, v20

    int-to-byte v14, v14

    aget-byte v15, v4, v21

    int-to-byte v15, v15

    const/16 v7, 0x263

    int-to-short v7, v7

    invoke-static {v14, v15, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x0

    invoke-virtual {v11, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v3, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_2e

    const/4 v11, 0x1

    :try_start_74
    aput-object v7, v13, v11

    invoke-virtual {v6, v2, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_2d

    if-eqz v6, :cond_48

    sget v7, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    add-int/lit8 v7, v7, 0x11

    rem-int/lit16 v11, v7, 0x80

    sput v11, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v11, 0x2

    rem-int/2addr v7, v11

    if-eqz v7, :cond_47

    const/16 v7, 0x7afb

    :try_start_75
    aget-byte v7, v4, v7

    neg-int v7, v7

    int-to-byte v7, v7

    const/16 v11, 0x7b

    aget-byte v4, v4, v11

    int-to-byte v4, v4

    const/16 v11, 0x5613

    int-to-short v11, v11

    invoke-static {v7, v4, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    new-array v11, v7, [Ljava/lang/Class;

    invoke-virtual {v5, v4, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v5, 0x1

    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v4, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_40

    :catchall_27
    move-exception v0

    move-object v1, v0

    const/16 v4, 0x187

    const/16 v7, 0xc1

    goto/16 :goto_1e

    :cond_47
    aget-byte v7, v4, v29

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v4, v4, v19

    int-to-byte v4, v4

    const/16 v11, 0x2c1

    int-to-short v13, v11

    invoke-static {v7, v4, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    new-array v11, v7, [Ljava/lang/Class;

    invoke-virtual {v5, v4, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {v4, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_27

    :cond_48
    :goto_40
    move-object v4, v6

    :goto_41
    if-eqz v4, :cond_4c

    :try_start_76
    move-object v6, v4

    check-cast v6, Ljava/lang/Class;

    sget-object v4, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v5, 0x47

    aget-byte v7, v4, v5

    int-to-byte v7, v7

    aget-byte v11, v4, v19

    int-to-byte v11, v11

    const/16 v13, 0xe6

    int-to-short v13, v13

    invoke-static {v7, v11, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x2

    new-array v13, v11, [Ljava/lang/Class;

    const-class v11, Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v11, v13, v14

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v14, 0x1

    aput-object v11, v13, v14

    invoke-virtual {v6, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v11

    invoke-virtual {v11, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v13, 0x2

    new-array v15, v13, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v2, v15, v13

    xor-int/lit8 v2, v1, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v15, v14

    invoke-virtual {v11, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sput-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    const/16 v2, 0x1134

    new-array v2, v2, [B

    const/16 v11, 0x6a

    aget-byte v11, v4, v11

    int-to-byte v11, v11

    const/16 v13, 0x207

    aget-byte v13, v4, v13

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v14, 0x43

    aget-byte v14, v4, v14

    int-to-short v14, v14

    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v11}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v11
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_2d

    const/4 v13, 0x1

    :try_start_77
    new-array v14, v13, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v11, v14, v13

    const/16 v11, 0xc

    aget-byte v13, v4, v11

    int-to-byte v11, v13

    int-to-byte v13, v11

    xor-int/lit16 v15, v13, 0x1d2

    and-int/lit16 v5, v13, 0x1d2

    or-int/2addr v5, v15

    int-to-short v5, v5

    invoke-static {v11, v13, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v11, 0x1

    new-array v13, v11, [Ljava/lang/Class;

    const/16 v11, 0x7a

    aget-byte v15, v4, v11

    int-to-byte v11, v15

    const/16 v15, 0xc

    aget-byte v8, v4, v15

    int-to-byte v8, v8

    move/from16 v15, v48

    invoke-static {v11, v8, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v11, 0x0

    aput-object v8, v13, v11

    invoke-virtual {v5, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_2c

    const/4 v8, 0x1

    :try_start_78
    new-array v13, v8, [Ljava/lang/Object;

    aput-object v2, v13, v11

    const/16 v8, 0xc

    aget-byte v11, v4, v8

    int-to-byte v8, v11

    int-to-byte v11, v8

    or-int/lit16 v14, v11, 0x1d2

    int-to-short v14, v14

    invoke-static {v8, v11, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v11, 0x2c

    aget-byte v11, v4, v11

    int-to-byte v11, v11

    const/16 v14, 0x5c

    aget-byte v14, v4, v14

    int-to-byte v14, v14

    const/16 v15, 0xb9

    int-to-short v15, v15

    invoke-static {v11, v14, v15}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x1

    new-array v15, v14, [Ljava/lang/Class;

    const/4 v14, 0x0

    aput-object v16, v15, v14

    invoke-virtual {v8, v11, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v5, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_2b

    const/16 v8, 0xc

    :try_start_79
    aget-byte v11, v4, v8

    int-to-byte v8, v11

    int-to-byte v11, v8

    xor-int/lit16 v13, v11, 0x1d2

    and-int/lit16 v14, v11, 0x1d2

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v8, v11, v13}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v11, v4, v29

    neg-int v11, v11

    int-to-byte v11, v11

    aget-byte v4, v4, v19
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_2a

    int-to-byte v4, v4

    const/16 v13, 0x2c1

    int-to-short v14, v13

    :try_start_7a
    invoke-static {v11, v4, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    invoke-virtual {v8, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_29

    :try_start_7b
    invoke-static/range {v45 .. v45}, Ljava/lang/Math;->abs(I)I

    move-result v4

    const/16 v5, 0x110d

    move v14, v1

    move-object v1, v2

    move v2, v4

    move v4, v5

    move-object/from16 v8, v37

    move/from16 v5, v44

    goto/16 :goto_2d

    :catchall_28
    move-exception v0

    :goto_42
    move-object v1, v0

    const/16 v4, 0x187

    const/16 v7, 0xc1

    goto/16 :goto_56

    :catchall_29
    move-exception v0

    :goto_43
    move-object v1, v0

    goto :goto_44

    :catchall_2a
    move-exception v0

    const/16 v13, 0x2c1

    goto :goto_43

    :goto_44
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_49

    throw v2

    :cond_49
    throw v1

    :catchall_2b
    move-exception v0

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4a

    throw v2

    :cond_4a
    throw v1

    :catchall_2c
    move-exception v0

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4b

    throw v2

    :cond_4b
    throw v1

    :catchall_2d
    move-exception v0

    :goto_45
    const/16 v13, 0x2c1

    goto :goto_42

    :cond_4c
    const/4 v4, 0x2

    const/16 v13, 0x2c1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v4, Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x1

    aput-object v4, v5, v6

    move-object/from16 v4, v22

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v7, v5

    xor-int/2addr v1, v6

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v7, v6

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    const/16 v2, 0x9

    const/16 v4, 0x187

    const/4 v6, 0x5

    const/16 v7, 0xc1

    const/4 v8, 0x0

    const/16 v34, 0x1

    goto/16 :goto_58

    :catchall_2e
    move-exception v0

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :cond_4d
    throw v1

    :catchall_2f
    move-exception v0

    :goto_46
    const/16 v12, 0x15

    goto :goto_45

    :catchall_30
    move-exception v0

    move v12, v5

    goto :goto_45

    :catchall_31
    move-exception v0

    const/16 v10, 0x1f

    goto :goto_46

    :catchall_32
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v1

    :catchall_33
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4f

    throw v2

    :cond_4f
    throw v1
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_28

    :catchall_34
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    :goto_47
    const/16 v13, 0x2c1

    :goto_48
    move-object v1, v0

    goto/16 :goto_4e

    :catchall_35
    move-exception v0

    const/16 v10, 0x1f

    :goto_49
    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    goto :goto_4a

    :catchall_36
    move-exception v0

    move v10, v12

    goto :goto_49

    :goto_4a
    :try_start_7c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_50

    throw v5

    :catchall_37
    move-exception v0

    goto :goto_48

    :cond_50
    throw v1

    :catchall_38
    move-exception v0

    const/16 v10, 0x1f

    :goto_4b
    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    goto :goto_4c

    :catchall_39
    move-exception v0

    move v10, v12

    goto :goto_4b

    :goto_4c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_51

    throw v5

    :cond_51
    throw v1

    :catchall_3a
    move-exception v0

    move v12, v1

    const/16 v10, 0x1f

    goto :goto_47

    :catchall_3b
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_52

    throw v5

    :cond_52
    throw v1

    :catchall_3c
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_53

    throw v5

    :cond_53
    throw v1

    :catchall_3d
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_54

    throw v5

    :cond_54
    throw v1
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_37

    :catchall_3e
    move-exception v0

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    :try_start_7d
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_55

    throw v5

    :catch_d
    move-exception v0

    move-object v1, v0

    goto :goto_4d

    :cond_55
    throw v1
    :try_end_7d
    .catch Ljava/lang/Exception; {:try_start_7d .. :try_end_7d} :catch_d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_37

    :goto_4d
    :try_start_7e
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    aget-byte v7, v6, v29

    neg-int v7, v7

    int-to-byte v7, v7

    const/16 v8, 0x11b

    aget-byte v11, v6, v8

    int-to-byte v8, v11

    sget v11, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    xor-int/lit16 v14, v11, 0x114

    and-int/lit16 v11, v11, 0x114

    or-int/2addr v11, v14

    int-to-short v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v7, 0x63

    aget-byte v7, v6, v7

    int-to-byte v7, v7

    const/16 v8, 0x16d

    aget-byte v8, v6, v8

    const/4 v11, 0x1

    sub-int/2addr v8, v11

    int-to-byte v8, v8

    const/16 v11, 0x106

    int-to-short v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_37

    const/4 v7, 0x2

    :try_start_7f
    new-array v8, v7, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v5, v8, v7

    const/4 v5, 0x1

    aput-object v1, v8, v5

    const/16 v1, 0x7a

    aget-byte v5, v6, v1

    int-to-byte v1, v5

    const/16 v5, 0xc

    aget-byte v6, v6, v5

    int-to-byte v5, v6

    const/16 v6, 0x340

    int-to-short v7, v6

    invoke-static {v1, v5, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v9, v6, v5

    const-class v5, Ljava/lang/Throwable;

    const/4 v7, 0x1

    aput-object v5, v6, v7

    invoke-virtual {v1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_3f

    :catchall_3f
    move-exception v0

    move-object v1, v0

    :try_start_80
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_56

    throw v5

    :cond_56
    throw v1
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_37

    :goto_4e
    :try_start_81
    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_43

    const/16 v6, 0x187

    :try_start_82
    aget-byte v7, v5, v6
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_45

    int-to-byte v6, v7

    const/16 v7, 0xc

    :try_start_83
    aget-byte v8, v5, v7

    int-to-byte v7, v8

    xor-int/lit16 v8, v7, 0x360

    and-int/lit16 v11, v7, 0x360

    or-int/2addr v8, v11

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_43

    const/16 v7, 0xc1

    :try_start_84
    aget-byte v8, v5, v7
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_44

    int-to-byte v7, v8

    const/16 v8, 0x1ee

    :try_start_85
    aget-byte v11, v5, v8

    int-to-byte v8, v11

    sget v11, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    xor-int/lit16 v14, v11, 0x212

    and-int/lit16 v15, v11, 0x212

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v7, v8, v14}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_85
    .catchall {:try_start_85 .. :try_end_85} :catchall_43

    const/16 v4, 0x187

    :try_start_86
    aget-byte v6, v5, v4

    int-to-byte v6, v6

    const/16 v7, 0xc

    aget-byte v8, v5, v7

    int-to-byte v7, v8

    xor-int/lit16 v8, v7, 0x360

    and-int/lit16 v14, v7, 0x360

    or-int/2addr v8, v14

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_86
    .catchall {:try_start_86 .. :try_end_86} :catchall_42

    const/16 v7, 0xc1

    :try_start_87
    aget-byte v8, v5, v7

    int-to-byte v8, v8

    const/16 v14, 0x1ee

    aget-byte v5, v5, v14

    int-to-byte v5, v5

    xor-int/lit16 v14, v11, 0x212

    and-int/lit16 v11, v11, 0x212

    or-int/2addr v11, v14

    int-to-short v11, v11

    invoke-static {v8, v5, v11}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-virtual {v6, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_41

    :try_start_88
    throw v1

    :catchall_40
    move-exception v0

    goto/16 :goto_14

    :catchall_41
    move-exception v0

    :goto_4f
    move-object v1, v0

    goto :goto_50

    :catchall_42
    move-exception v0

    const/16 v7, 0xc1

    goto :goto_4f

    :goto_50
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_57

    throw v2

    :cond_57
    throw v1

    :catchall_43
    move-exception v0

    const/16 v4, 0x187

    :goto_51
    const/16 v7, 0xc1

    :goto_52
    move-object v1, v0

    goto :goto_53

    :catchall_44
    move-exception v0

    const/16 v4, 0x187

    goto :goto_52

    :catchall_45
    move-exception v0

    move v4, v6

    goto :goto_51

    :goto_53
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_58

    throw v2

    :cond_58
    throw v1

    :catchall_46
    move-exception v0

    goto/16 :goto_13

    :catchall_47
    move-exception v0

    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_59

    throw v2

    :cond_59
    throw v1

    :catchall_48
    move-exception v0

    :goto_54
    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    goto :goto_55

    :catchall_49
    move-exception v0

    move/from16 v44, v5

    goto :goto_54

    :goto_55
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5a

    throw v2

    :cond_5a
    throw v1

    :catchall_4a
    move-exception v0

    move/from16 v44, v5

    goto/16 :goto_13

    :catchall_4b
    move-exception v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    goto/16 :goto_13

    :catchall_4c
    move-exception v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5b

    throw v2

    :cond_5b
    throw v1

    :catchall_4d
    move-exception v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5c

    throw v2

    :cond_5c
    throw v1

    :catchall_4e
    move-exception v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5d

    throw v2

    :cond_5d
    throw v1

    :catchall_4f
    move-exception v0

    move/from16 v44, v5

    move-object/from16 v37, v8

    const/16 v4, 0x187

    const/16 v7, 0xc1

    const/16 v10, 0x1f

    const/16 v12, 0x15

    const/16 v13, 0x2c1

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5e

    throw v2

    :cond_5e
    throw v1
    :try_end_88
    .catchall {:try_start_88 .. :try_end_88} :catchall_40

    :goto_56
    add-int/lit8 v5, v44, 0x1

    const/16 v2, 0x9

    :goto_57
    if-ge v5, v2, :cond_60

    :try_start_89
    aget-boolean v6, v37, v5
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_89} :catch_0

    if-eqz v6, :cond_5f

    sget v5, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v6, 0x5

    or-int/lit8 v8, v5, 0x5

    const/4 v11, 0x1

    shl-int/2addr v8, v11

    xor-int/2addr v5, v6

    sub-int/2addr v8, v5

    rem-int/lit16 v5, v8, 0x80

    sput v5, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    const/4 v5, 0x2

    rem-int/2addr v8, v5

    if-nez v8, :cond_60

    const/4 v8, 0x0

    :try_start_8a
    sput-object v8, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    sput-object v8, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    :goto_58
    or-int/lit8 v1, v44, 0x46

    const/4 v5, 0x1

    shl-int/2addr v1, v5

    xor-int/lit8 v11, v44, 0x46

    sub-int/2addr v1, v11

    or-int/lit8 v11, v1, -0x45

    shl-int/2addr v11, v5

    xor-int/lit8 v1, v1, -0x45

    sub-int v5, v11, v1

    move-object/from16 v1, v33

    move/from16 v4, v34

    move-object/from16 v10, v36

    move-object/from16 v8, v37

    move-object/from16 v6, v38

    move-object/from16 v7, v39

    const/4 v2, 0x1

    const/16 v11, 0x1d

    const/4 v12, 0x3

    const/4 v15, 0x0

    goto/16 :goto_11

    :cond_5f
    const/4 v6, 0x5

    const/4 v8, 0x0

    add-int/lit8 v5, v5, 0x35

    or-int/lit8 v11, v5, -0x34

    const/4 v14, 0x1

    shl-int/2addr v11, v14

    xor-int/lit8 v5, v5, -0x34

    sub-int v5, v11, v5

    goto :goto_57

    :cond_60
    sget-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v3, 0xc

    aget-byte v4, v2, v3

    int-to-byte v3, v4

    const/16 v4, 0x11b

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v5, 0x162

    int-to-short v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v3
    :try_end_8a
    .catch Ljava/lang/Exception; {:try_start_8a .. :try_end_8a} :catch_0

    const/4 v4, 0x2

    :try_start_8b
    new-array v5, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v5, v4

    const/4 v3, 0x1

    aput-object v1, v5, v3

    const/16 v1, 0x7a

    aget-byte v1, v2, v1

    int-to-byte v1, v1

    const/16 v3, 0xc

    aget-byte v2, v2, v3

    int-to-byte v2, v2

    const/16 v3, 0x340

    int-to-short v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const-class v3, Ljava/lang/Throwable;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    throw v1
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_50

    :catchall_50
    move-exception v0

    move-object v1, v0

    :try_start_8c
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_61

    throw v2

    :cond_61
    throw v1

    :cond_62
    return-void

    :catchall_51
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_63

    throw v2

    :cond_63
    throw v1

    :catchall_52
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_64

    throw v2

    :cond_64
    throw v1

    :catchall_53
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_65

    throw v2

    :cond_65
    throw v1

    :catchall_54
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_66

    throw v2

    :cond_66
    throw v1
    :try_end_8c
    .catch Ljava/lang/Exception; {:try_start_8c .. :try_end_8c} :catch_0

    :goto_59
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFKeystoreWrapper(I)I
    .locals 7

    .line 1
    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    or-int/lit8 v1, v0, 0x19

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    xor-int/lit8 v0, v0, 0x19

    sub-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    sget-object v0, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    :try_start_0
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v1, v3

    sget-object p0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v4, 0x47

    aget-byte v4, p0, v4

    int-to-byte v4, v4

    const/16 v5, 0xf

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0x289

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    check-cast v5, Ljava/lang/ClassLoader;

    invoke-static {v4, v2, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0x260

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0x28

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    const/16 v6, 0x31c

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v2, v3

    invoke-virtual {v4, p0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

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

.method public static AFKeystoreWrapper(Ljava/lang/Object;)I
    .locals 8

    .line 2
    const/4 v0, 0x0

    const/4 v1, 0x1

    sget v2, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    xor-int/lit8 v3, v2, 0x2b

    and-int/lit8 v2, v2, 0x2b

    shl-int/2addr v2, v1

    add-int/2addr v3, v2

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    sget-object v2, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x6d

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    :try_start_0
    new-array v3, v1, [Ljava/lang/Object;

    aput-object p0, v3, v0

    sget-object p0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v4, 0x47

    aget-byte v4, p0, v4

    int-to-byte v4, v4

    const/16 v5, 0xf

    aget-byte v6, p0, v5

    int-to-byte v6, v6

    const/16 v7, 0x289

    int-to-short v7, v7

    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    check-cast v6, Ljava/lang/ClassLoader;

    invoke-static {v4, v1, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0x6f

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    const/16 v6, 0x150

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Class;

    const-class v5, Ljava/lang/Object;

    aput-object v5, v1, v0

    invoke-virtual {v4, p0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    and-int/lit8 v1, v0, 0x4b

    or-int/lit8 v0, v0, 0x4b

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

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

    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    add-int/lit8 v0, v0, 0x13

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "ISO-8859-1"

    const-string v2, "_\u00ad\u009d\u009c\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cb7\t\u00eb\u00153\u00c5\u00faA\u00ec\u00cd\u000f\u0000\u0001\u00f3\r\u0001\u001b\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00db\u00da\u0006\u00ff\u000f\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa3\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c0\u0005\u00faA\u00ec\u00c9\u0005\u000f#\u00cd\u000f\u0000\u0001\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00ec\u00cd\u000c\u00fd\u0008@\u00ce\u0011\u00f3\u00ff\n\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e80\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00e5\u00db!\u00e8\u00f8\u00fe\u00fd\u00f95\u00df\u00ed5\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\r\u0004\u00fd\u001e\u00d1\t\u0000\u00f3\u0002\u00f1.\u00dd\u00fd\u0007\u00f2/\u00db\u00f7\u0002\u00f10\u00df\u0004\u00fd!\u00db\u0007\u00ef\u0005\t\u00f5\u000f\u0002\u00f11\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\r\u0004\u00fd\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c2\u001c\u000f\u00f9\'\u00ad\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ea\u00df\u00ed2\u00dd\u00fd\u0007\u00f4\u000b\u00ff\u0006\u00fc\u0002\u00fe\u00fb\u0003\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ec\u00e1\u00ee\u000e!\u00df\u00ed5\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\u0002\u00f11\u00d4\u000b\u00ff\"\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa \u00db\t\u000b\u00fa\u000b\u000b\u0015\u00f9\u0017\u00f8\u00ba\u00ffO\u00ba\u0005\u00f5\u0000\n\u0001\u00fe\u00f8\u00f8S\u00b4\u0007\u00ff\u00f2K\u0015\u00fa\u0016\u00f8\u0015\u00fc\u0014\u00f8\u0015\u00f8\u0018\u00f8\u00fb\u00fd\u00db-\u00d1\u0000+\u00cf\u0011\u00f7\u00fa$\u00ef\u00ef\u0011\u00f4\u0008\u00f1\u000f\u00f3$\u00ed\u00f4\u0008\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00eb\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00d1\u0000)\u00db\u00fd\r\u0001\u00f5\u00f9\u0002\u00f1/\u00cd\u0004\u000f\u00f3\u0004\r\u00f5\u0019\u00df\u0005\u00fd\u0011\u00fa\u0002!\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\u00f9\t\u00eb\u00153\u00c5\u00faA\u00ea\u00e3\u00ed\u0013\u0018\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00fd\u000e\u00fd \u00df\u00ed\u00f3\n\u00f2\u0003\u0006\u00056\u00b8\r\u0004\u00eeI\u00e3\u00e6\u00ec4\u00cf\u0011\u00f7\u00fa\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8*\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00e9\u00d7\u00f8\r\u00f7\u0003\u0001\u0001\u0008\u00f7\u00fa\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00e41\u00c1\u001d\u000f\u00f9\'\u0000\u0008\u0002\u00f9\u0002\u00f11\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\u00cb\u0003\u00ed\u00132\u00cb\u0003\u00ed\u00132\u00ff\u00f9\u0007\u00f1\u000f\u0002\u00f1.\u0002\u000f\u00f9\u00ec\u0016\u00fb\u00fa\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3D\u00c5\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5>\u00ed\u00fb\u00e41\u00c1\u001d\u000f\u00f9\'\u0000\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f9)\u00ef\u00ed\u000c#\u00d9\u0007\u00f8\u0008\u00f7\u00fa\u0001\u00f7\u00fd\u00fc\u000e\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cc6\t\u00eb\u00153\u00c5\u00faA\u00ba\u0007\u00fd\u000c\u00fb\u00f7\u0002\u00f1$\u00de\u0003\u00ff\u000b\u00f3\u00fe\u00fb\u0002\u00f13\u00df\u00ef\u0004\u0003\u00f7\u0001\u000f\u0015\u00ef\u00ed\u000c\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00de\u00ef\u000b\u00f3\r\u00f5\u00fb%\u00ec\u00f6\r\u0004\u00fd\u0015\u00f5\u00f7\u0010\u0016\u00e9\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0016\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0002\u00f3\u0017\u00e5\t\u00f5\u000f\t\u00eb\u00153\u00c5\u00faA\u00e5\u00fa\n\u00cd\u0015\u00fe\u00f5\u00fc\u000b\u00fa\u0001\u000f\u00ed\u000c\u001c\u00e3\u00f6\u00ff\u0002\u00f1+\u00db\u0005\u00f5\u000b\u0008\u00f5+\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0015\u00fd\u0013\u00f8\u00ee\u0003\u0000\r\u00f7\u00fa \u00eb\u00fc\u0008\u0018\u00e4\u00fd\u0000\u0003\u00f6\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007!\u00df\u00f2\u0010\u00f1\t\u00f9\u00fc\u0005\u00fd\u0005-\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8\u00fd\u000e\u00fd!\u00d7\u000b\u00ee\u0000\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3\u0005\u0011\u00f1\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f95\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\t\u0004\u00f2\t\u00eb\u00153\u00c5\u00faA\u00e5\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4"

    const/4 v3, 0x0

    const/16 v4, 0x3f0

    if-nez v0, :cond_0

    new-array v0, v4, [B

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v0, 0x69

    :goto_0
    sput v0, Lcom/appsflyer/internal/AFb1oSDK;->setPhoneNumber:I

    goto :goto_1

    :cond_0
    new-array v0, v4, [B

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 v0, 0x68

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static values(IIC)Ljava/lang/Object;
    .locals 7

    sget v0, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    sget-object v1, Lcom/appsflyer/internal/AFb1oSDK;->setImeiData:Ljava/lang/Object;

    or-int/lit8 v2, v0, 0x59

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    xor-int/lit8 v0, v0, 0x59

    sub-int/2addr v2, v0

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    xor-int/lit8 v0, v2, 0x1f

    and-int/lit8 v2, v2, 0x1f

    shl-int/2addr v2, v3

    add-int/2addr v0, v2

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    const/4 v0, 0x3

    :try_start_0
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v4, 0x2

    aput-object p2, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x0

    aput-object p0, v2, p1

    sget-object p0, Lcom/appsflyer/internal/AFb1oSDK;->setAndroidIdData:[B

    const/16 p2, 0x47

    aget-byte p2, p0, p2

    int-to-byte p2, p2

    const/16 v5, 0xf

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0x289

    int-to-short v6, v6

    invoke-static {p2, v5, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object p2

    sget-object v5, Lcom/appsflyer/internal/AFb1oSDK;->setOaidData:Ljava/lang/Object;

    check-cast v5, Ljava/lang/ClassLoader;

    invoke-static {p2, v3, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p2

    const/16 v5, 0x3c

    aget-byte v5, p0, v5

    int-to-byte v5, v5

    const/16 v6, 0x6f

    aget-byte p0, p0, v6

    int-to-byte p0, p0

    const/16 v6, 0x184

    int-to-short v6, v6

    invoke-static {v5, p0, v6}, Lcom/appsflyer/internal/AFb1oSDK;->$$c(SIS)Ljava/lang/String;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v0, p1

    aput-object v5, v0, v3

    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object p1, v0, v4

    invoke-virtual {p2, p0, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget p1, Lcom/appsflyer/internal/AFb1oSDK;->setCustomerUserId:I

    or-int/lit8 p2, p1, 0x69

    shl-int/2addr p2, v3

    xor-int/lit8 p1, p1, 0x69

    sub-int/2addr p2, p1

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFb1oSDK;->waitForCustomerUserId:I

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    throw p1

    :cond_0
    throw p0
.end method

.class public final Lcom/appsflyer/internal/AFc1sSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1wSDK;


# annotations
.annotation runtime Lkotlin/Metadata;
.end annotation


# static fields
.field private static AFVersionDeclaration:I = 0x0

.field private static afRDLog:J = 0x462d7e5bcaf910fL

.field private static afWarnLog:I = 0x1


# instance fields
.field private final AFInAppEventParameterName:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFInAppEventType:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFKeystoreWrapper:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afDebugLog:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afErrorLog:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afInfoLog:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final valueOf:LV5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private values:Lcom/appsflyer/internal/AFc1xSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1xSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1xSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->values:Lcom/appsflyer/internal/AFc1xSDK;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1vSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1vSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventType:LV5/h;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1xSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1xSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName:LV5/h;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1wSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1wSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper:LV5/h;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1qSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1qSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->valueOf:LV5/h;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1ySDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1ySDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->afDebugLog:LV5/h;

    const-string p1, "6.12.2"

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog:Ljava/lang/String;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1zSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1zSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog:LV5/h;

    new-instance p1, Lcom/appsflyer/internal/AFc1sSDK$AFa1tSDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFc1sSDK$AFa1tSDK;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:LV5/h;

    return-void
.end method

.method private final AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1wSDK;
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventType:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFb1wSDK;

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-object v0
.end method

.method private final AFInAppEventParameterName(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v2

    shr-int/lit8 v2, v2, 0x18

    rsub-int/lit8 v2, v2, 0x1

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "\u13e5\u2096\udf26\uef34\u1387\ub1eb\ufd59\u5c77\u57bd"

    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventType(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v2, v3, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v2, v3}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v2

    const-string v3, "model"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v3, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v3

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afRDLog()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v4

    iget-object v4, v4, Lcom/appsflyer/internal/AFb1gSDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v4, v4, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "app_id"

    invoke-static {v5, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v4

    new-instance v5, Lcom/appsflyer/internal/AFb1xSDK;

    invoke-direct {v5}, Lcom/appsflyer/internal/AFb1xSDK;-><init>()V

    invoke-virtual {v5}, Lcom/appsflyer/internal/AFb1xSDK;->AFInAppEventParameterName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "p_ex"

    invoke-static {v6, v5}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v5

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "api"

    invoke-static {v7, v6}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v6

    const-string v7, "sdk"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v7

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afRDLog()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v8

    iget-object v9, v8, Lcom/appsflyer/internal/AFb1gSDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v8, v8, Lcom/appsflyer/internal/AFb1gSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFb1dSDK;

    invoke-static {v9, v8}, Lcom/appsflyer/internal/AFb1zSDK;->valueOf(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "uid"

    invoke-static {v9, v8}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v8

    const-string v9, "exc_config"

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventType()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    const/16 v9, 0x8

    new-array v9, v9, [LV5/m;

    aput-object v2, v9, v0

    aput-object v3, v9, v1

    const/4 v0, 0x2

    aput-object v4, v9, v0

    const/4 v0, 0x3

    aput-object v5, v9, v0

    const/4 v0, 0x4

    aput-object v6, v9, v0

    const/4 v0, 0x5

    aput-object v7, v9, v0

    const/4 v0, 0x6

    aput-object v8, v9, v0

    const/4 v0, 0x7

    aput-object p1, v9, v0

    invoke-static {v9}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object p1

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/2addr v0, v1

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-object p1
.end method

.method private static final AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 1

    .line 3
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x4d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger$LogLevel()V

    sget p0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-void
.end method

.method private static final AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .line 4
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x5d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, ""

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v0

    const/16 v1, 0x15

    div-int/lit8 v1, v1, 0x0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_0
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFc1sSDK;->valueOf(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lcom/appsflyer/internal/AFc1vSDK;->values(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_1
    sget p0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x35

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    :cond_2
    :goto_1
    return-void
.end method

.method public static final synthetic AFInAppEventType(Lcom/appsflyer/internal/AFc1sSDK;)Lcom/appsflyer/internal/AFc1xSDK;
    .locals 3

    .line 1
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x63

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    iget-object p0, p0, Lcom/appsflyer/internal/AFc1sSDK;->values:Lcom/appsflyer/internal/AFc1xSDK;

    if-eqz v0, :cond_1

    add-int/lit8 v1, v1, 0x15

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    throw v2

    :cond_1
    throw v2
.end method

.method private static AFInAppEventType(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 8

    .line 3
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    sget-object v0, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventParameterName:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-wide v1, Lcom/appsflyer/internal/AFc1sSDK;->afRDLog:J

    invoke-static {v1, v2, p0, p1}, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType(J[CI)[C

    move-result-object p0

    const/4 p1, 0x4

    sput p1, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType:I

    :goto_0
    sget v1, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType:I

    array-length v2, p0

    if-ge v1, v2, :cond_1

    add-int/lit8 v1, v1, -0x4

    sput v1, Lcom/appsflyer/internal/AFg1rSDK;->AFKeystoreWrapper:I

    sget v1, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType:I

    aget-char v2, p0, v1

    rem-int/lit8 v3, v1, 0x4

    aget-char v3, p0, v3

    xor-int/2addr v2, v3

    int-to-long v2, v2

    sget v4, Lcom/appsflyer/internal/AFg1rSDK;->AFKeystoreWrapper:I

    int-to-long v4, v4

    sget-wide v6, Lcom/appsflyer/internal/AFc1sSDK;->afRDLog:J

    mul-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-char v2, v2

    aput-char v2, p0, v1

    sget v1, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/appsflyer/internal/AFg1rSDK;->AFInAppEventType:I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/String;

    array-length v2, p0

    sub-int/2addr v2, p1

    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x0

    aput-object v1, p2, p0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private final AFInAppEventType(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Z
    .locals 10

    .line 4
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v2

    const-string v3, "af_send_exc_to_server_window"

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Lcom/appsflyer/internal/AFb1dSDK;->valueOf(Ljava/lang/String;J)J

    move-result-wide v2

    iget-wide v6, p1, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->valueOf:J

    const-wide/16 v8, 0x3e8

    div-long v8, v0, v8

    cmp-long v6, v6, v8

    const/4 v7, 0x0

    if-gez v6, :cond_0

    sget p1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 p1, p1, 0x5f

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    return v7

    :cond_0
    cmp-long v4, v2, v4

    if-eqz v4, :cond_7

    sget v4, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v4, v4, 0x65

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v4, v4, 0x2

    const/4 v5, 0x0

    if-nez v4, :cond_6

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    const-string v1, "af_send_exc_min"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFb1dSDK;->values(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v2, :cond_5

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v1, v1, 0x75

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1vSDK;->AFInAppEventType()I

    move-result v1

    if-ge v1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventType:Ljava/lang/String;

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_3

    sget p1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 p1, p1, 0x41

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    const/4 p1, 0x1

    return p1

    :cond_3
    return v7

    :cond_4
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1vSDK;->AFInAppEventType()I

    throw v5

    :cond_5
    :goto_0
    return v7

    :cond_6
    throw v5

    :cond_7
    :goto_1
    return v7
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 1

    .line 2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x25

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration()V

    sget p0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 p0, p0, 0x5b

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    return-void
.end method

.method private final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 3
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    sget-object v0, Lkotlin/text/b;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFc1nSDK;->valueOf(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Authorization"

    invoke-static {p2, p1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    invoke-static {p1}, LW5/C;->b(LV5/m;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLogForExcManagerOnly()Lcom/appsflyer/internal/AFc1uSDK;

    move-result-object p2

    const/16 v1, 0x7d0

    invoke-interface {p2, v0, p1, v1}, Lcom/appsflyer/internal/AFc1uSDK;->valueOf([BLjava/util/Map;I)V

    sget p1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x3

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private AFLogger()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x63

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x19

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-object v1
.end method

.method private final declared-synchronized AFLogger$LogLevel()V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v0

    if-eqz v0, :cond_0

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v1, v1, 0x5b

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    iget-wide v0, v0, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->valueOf:J

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    :try_start_1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v5, v5, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventType:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    if-nez v5, :cond_2

    :try_start_2
    sget v5, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v5, v5, 0x59

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v5, ""
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_4
    const-string v5, "NOT_DETECTED"

    :cond_2
    :goto_2
    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    const-string v0, "TTL is already passed"

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "[Exception Manager]: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    const-string v1, "af_send_exc_to_server_window"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventType(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1vSDK;->values()Z

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v0, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    throw v0

    :cond_4
    invoke-static {v5}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    invoke-static {v5}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v1

    if-gt v0, v1, :cond_5

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1vSDK;->AFInAppEventParameterName([Ljava/lang/String;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_7
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    const-string v1, "af_send_exc_to_server_window"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventType(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1vSDK;->values()Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized AFVersionDeclaration()V
    .locals 7

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x37

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, v0, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFKeystoreWrapper:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    const-string v1, "af_send_exc_to_server_window"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventType(Ljava/lang/String;)V

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v1

    const-string v2, "af_send_exc_to_server_window"

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Lcom/appsflyer/internal/AFb1dSDK;->valueOf(Ljava/lang/String;J)J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget v1, v0, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventParameterName:I

    iget v0, v0, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFKeystoreWrapper:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    int-to-long v5, v0

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    const-string v4, "af_send_exc_to_server_window"

    invoke-interface {v0, v4, v2, v3}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventParameterName(Ljava/lang/String;J)V

    const-string v2, "af_send_exc_min"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFb1dSDK;->AFInAppEventType(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x49

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    const/16 v0, 0x40

    :try_start_3
    div-int/lit8 v0, v0, 0x0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :try_start_5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v0, 0x0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1sSDK;)V

    return-void
.end method

.method private final afDebugLog()Lcom/appsflyer/internal/AFe1wSDK;
    .locals 4

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x47

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->valueOf:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFe1wSDK;

    sget v2, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v2, v2, 0x4d

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    throw v1

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->valueOf:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFe1wSDK;

    throw v1
.end method

.method private final afErrorLog()Ljava/util/concurrent/ExecutorService;
    .locals 3

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x5f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->afDebugLog:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    const/16 v1, 0x56

    div-int/lit8 v1, v1, 0x0

    :cond_0
    return-object v0
.end method

.method private afErrorLogForExcManagerOnly()Lcom/appsflyer/internal/AFc1uSDK;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFc1uSDK;

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    return-object v0
.end method

.method private final afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;
    .locals 2

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x3

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFb1dSDK;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFb1dSDK;

    const/4 v0, 0x0

    throw v0
.end method

.method private final afRDLog()Lcom/appsflyer/internal/AFb1gSDK;
    .locals 2

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x7d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFb1gSDK;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFb1gSDK;

    const/4 v0, 0x0

    throw v0
.end method

.method private final afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;
    .locals 2

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1wSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1wSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFb1ySDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1qSDK;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFe1qSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1aSDK;

    if-eqz v0, :cond_0

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1aSDK;->values:Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    return-object v0

    :cond_0
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    throw v1
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1sSDK;->values(Lcom/appsflyer/internal/AFc1sSDK;)V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFc1sSDK;)V

    return-void
.end method

.method private final getLevel()V
    .locals 4

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog()Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;

    move-result-object v0

    if-eqz v0, :cond_2

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-string v3, ""

    if-eq v1, v2, :cond_1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afDebugLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v1

    iget-object v1, v1, Lcom/appsflyer/internal/AFe1wSDK;->AFInAppEventParameterName:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventParameterName(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v2

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1vSDK;->AFKeystoreWrapper()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFc1sSDK;->values(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const-string v0, "skipping"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "[Exception Manager]: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    return-void

    :cond_2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x3

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_3

    const/16 v0, 0xb

    div-int/lit8 v0, v0, 0x0

    :cond_3
    return-void
.end method

.method private final valueOf(Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;)Z
    .locals 13

    .line 2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    const-wide/16 v1, 0x3e8

    const-string v3, "af_send_exc_to_server_window"

    const/4 v4, 0x0

    const-wide/16 v5, -0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    invoke-interface {v0, v3, v5, v6}, Lcom/appsflyer/internal/AFb1dSDK;->valueOf(Ljava/lang/String;J)J

    move-result-wide v9

    iget-wide v11, p1, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->valueOf:J

    or-long v0, v7, v1

    cmp-long v0, v11, v0

    if-ltz v0, :cond_3

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afInfoLog()Lcom/appsflyer/internal/AFb1dSDK;

    move-result-object v0

    invoke-interface {v0, v3, v5, v6}, Lcom/appsflyer/internal/AFb1dSDK;->valueOf(Ljava/lang/String;J)J

    move-result-wide v9

    iget-wide v11, p1, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->valueOf:J

    div-long v0, v7, v1

    cmp-long v0, v11, v0

    if-ltz v0, :cond_3

    :goto_0
    cmp-long v0, v9, v5

    if-eqz v0, :cond_3

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x77

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    cmp-long v0, v9, v7

    const/16 v1, 0x14

    div-int/2addr v1, v4

    if-gez v0, :cond_2

    goto :goto_1

    :cond_1
    cmp-long v0, v9, v7

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventType:Ljava/lang/String;

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v4
.end method

.method private static values(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFc1zSDK;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x2

    sget v2, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v2, v2, 0x1b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/2addr v2, v1

    const-string v3, "excs"

    const-string v4, "deviceInfo"

    if-eqz v2, :cond_0

    const/4 v1, 0x5

    new-array v1, v1, [LV5/m;

    invoke-static {v4, p0}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p0

    aput-object p0, v1, v0

    invoke-static {p1}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->values(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object p0

    invoke-static {v3, p0}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p0

    aput-object p0, v1, v0

    invoke-static {v1}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {v4, p0}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p0

    invoke-static {p1}, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->values(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {v3, p1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    new-array v1, v1, [LV5/m;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    aput-object p1, v1, v0

    invoke-static {v1}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object p0

    :goto_0
    sget p1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 p1, p1, 0x2f

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    return-object p0
.end method

.method private static final values(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 1

    .line 3
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x4f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->getLevel()V

    sget p0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x6d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-void
.end method


# virtual methods
.method public final AFInAppEventType()V
    .locals 2

    .line 2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x55

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/o;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/o;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/o;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/o;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1vSDK;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog:LV5/h;

    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFc1vSDK;

    sget v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v1, v1, 0x57

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public final AFKeystoreWrapper(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 4
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/q;

    invoke-direct {v1, p0, p1, p2}, Lcom/appsflyer/internal/q;-><init>(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget p1, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/q;

    invoke-direct {v1, p0, p1, p2}, Lcom/appsflyer/internal/q;-><init>(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final valueOf()V
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/p;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/p;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-void
.end method

.method public final values()V
    .locals 2

    .line 2
    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1sSDK;->afErrorLog()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/r;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/r;-><init>(Lcom/appsflyer/internal/AFc1sSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget v0, Lcom/appsflyer/internal/AFc1sSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x4f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1sSDK;->AFVersionDeclaration:I

    return-void
.end method

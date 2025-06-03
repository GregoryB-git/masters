.class public final Lcom/appsflyer/internal/AFd1eSDK;
.super Lcom/appsflyer/internal/AFd1hSDK;
.source "SourceFile"


# static fields
.field private static AppsFlyer2dXConversionCallback:[C = null

.field private static init:Z = false

.field private static onAppOpenAttributionNative:Z = true

.field private static onInstallConversionDataLoadedNative:I = 0x0

.field private static onInstallConversionFailureNative:I = 0x0

.field private static onResponseNative:I = 0x1


# instance fields
.field private final AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1bSDK;

.field private final AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

.field private final afWarnLog:Ljava/lang/String;

.field private final getLevel:Lcom/appsflyer/internal/AFb1gSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFd1eSDK;->AppsFlyer2dXConversionCallback:[C

    const/4 v0, 0x1

    sput-boolean v0, Lcom/appsflyer/internal/AFd1eSDK;->init:Z

    const/16 v0, 0x4a

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionDataLoadedNative:I

    return-void

    :array_0
    .array-data 2
        0xacs
        0xbcs
        0xabs
        0xb8s
        0xaes
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/appsflyer/internal/AFc1xSDK;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1xSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/appsflyer/internal/AFe1uSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1xSDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1uSDK;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2, p1}, Lcom/appsflyer/internal/AFd1hSDK;-><init>(Lcom/appsflyer/internal/AFa1qSDK;Lcom/appsflyer/internal/AFc1xSDK;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1xSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->getLevel:Lcom/appsflyer/internal/AFb1gSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1xSDK;->init()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1bSDK;

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->afWarnLog:Ljava/lang/String;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1xSDK;->AFLogger()Lcom/appsflyer/internal/AFe1vSDK;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

    return-void
.end method

.method private static AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V
    .locals 6

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    :cond_0
    check-cast p1, [C

    if-eqz p0, :cond_1

    const-string v0, "ISO-8859-1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    :cond_1
    check-cast p0, [B

    sget-object v0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appsflyer/internal/AFd1eSDK;->AppsFlyer2dXConversionCallback:[C

    sget v2, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionDataLoadedNative:I

    sget-boolean v3, Lcom/appsflyer/internal/AFd1eSDK;->init:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    array-length p1, p0

    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p1, p1, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_0
    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p2, v3, :cond_2

    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget-byte v3, p0, v3

    add-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p1, p2

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aput-object p0, p4, v4

    return-void

    :cond_3
    :try_start_1
    sget-boolean p0, Lcom/appsflyer/internal/AFd1eSDK;->onAppOpenAttributionNative:Z

    if-eqz p0, :cond_5

    array-length p0, p1

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p0, p0, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_1
    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p2, v3, :cond_4

    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget-char v3, p1, v3

    sub-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p2

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    aput-object p1, p4, v4

    return-void

    :cond_5
    :try_start_2
    array-length p0, p2

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p0, p0, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_2
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p1, v3, :cond_6

    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget v3, p2, v3

    sub-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p1

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    aput-object p1, p4, v4

    return-void

    :goto_3
    monitor-exit v0

    throw p0
.end method

.method private AFVersionDeclaration()V
    .locals 3

    sget v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1hSDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v1, "sentRegisterRequestToAF"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFb1dSDK;->values(Ljava/lang/String;Z)V

    const-string v0, "[register] Successfully registered for Uninstall Tracking"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    sget v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    return-void
.end method


# virtual methods
.method public final afInfoLog()Z
    .locals 3

    sget v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v2, 0x73

    rem-int/lit16 v0, v2, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method public final valueOf(Lcom/appsflyer/internal/AFa1qSDK;)V
    .locals 8

    invoke-super {p0, p1}, Lcom/appsflyer/internal/AFd1hSDK;->valueOf(Lcom/appsflyer/internal/AFa1qSDK;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    invoke-static {}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf()Lcom/appsflyer/internal/AFa1eSDK;

    move-result-object v1

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFa1eSDK;->AFKeystoreWrapper()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    const-string v5, "app_version_code"

    iget v6, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    const-string v5, "app_version_name"

    iget-object v6, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1, v5, v6}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v5}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "app_name"

    invoke-virtual {p1, v5, v1}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v5, v3, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-string v1, "yyyy-MM-dd_HHmmssZ"

    new-instance v3, Ljava/text/SimpleDateFormat;

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v3, v1, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "installDate"

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventType(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v1, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v3, "Exception while collecting application version info."

    invoke-static {v3, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFe1vSDK;

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFa1qSDK;->valueOf()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/appsflyer/internal/AFe1vSDK;->AFInAppEventType(Ljava/util/Map;)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventParameterName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget v3, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    add-int/lit8 v3, v3, 0x5

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    const-string v3, "appUserId"

    invoke-virtual {p1, v3, v1}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    :cond_0
    const/4 v1, 0x0

    :try_start_1
    const-string v3, "model"

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v3, v5}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    const-string v3, "\u0085\u0084\u0083\u0082\u0081"

    invoke-static {v4, v4}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x7f

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {v3, v1, v1, v5, v6}, Lcom/appsflyer/internal/AFd1eSDK;->AFInAppEventParameterName(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V

    aget-object v3, v6, v4

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p1, v3, v5}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v3

    const-string v5, "Exception while collecting device brand and model."

    invoke-static {v5, v3}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v3

    const-string v5, "deviceTrackingDisabled"

    invoke-virtual {v3, v5, v4}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "true"

    invoke-virtual {p1, v5, v2}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    :goto_2
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1cSDK;->AFInAppEventParameterName(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v2, v0, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->valueOf:Ljava/lang/String;

    const-string v3, "amazon_aid"

    invoke-virtual {p1, v3, v2}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;->AFInAppEventType:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "amazon_aid_limit"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    :cond_2
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v2, "advertiserId"

    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    sget v3, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v3, v3, 0x1b

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    rem-int/lit8 v3, v3, 0x2

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    throw v1

    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFe1wSDK;->AFInAppEventParameterName:Ljava/lang/String;

    const-string v2, "devkey"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1hSDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1dSDK;

    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFb1zSDK;->valueOf(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "uid"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    const-string v0, "af_gcm_token"

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1eSDK;->afWarnLog:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1hSDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFb1dSDK;

    const-string v2, "appsFlyerCount"

    invoke-interface {v0, v2, v4}, Lcom/appsflyer/internal/AFb1dSDK;->values(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "launch_counter"

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "sdk"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->getLevel:Lcom/appsflyer/internal/AFb1gSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFb1gSDK;->values()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v2, "channel"

    invoke-virtual {p1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;

    :cond_5
    sget p1, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    add-int/lit8 p1, p1, 0x65

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_6

    return-void

    :cond_6
    throw v1

    :cond_7
    const-string p1, "CustomerUserId not set, Tracking is disabled"

    invoke-static {p1, v2}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;Z)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "CustomerUserId not set, register is not sent"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Context is not provided, can\'t send register request"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final values()V
    .locals 2

    sget v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    invoke-super {p0}, Lcom/appsflyer/internal/AFd1oSDK;->values()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1gSDK;

    if-eqz v0, :cond_0

    sget v1, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v1, v1, 0x6f

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1gSDK;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFd1eSDK;->onInstallConversionFailureNative:I

    add-int/lit8 v0, v0, 0x5b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1eSDK;->onResponseNative:I

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1eSDK;->AFVersionDeclaration()V

    :cond_0
    return-void
.end method

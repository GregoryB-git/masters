.class public final Lcom/appsflyer/internal/AFe1oSDK;
.super Lcom/appsflyer/internal/AFa1qSDK;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "adrevenue_generic"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public final AFInAppEventType()Lcom/appsflyer/internal/AFd1vSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFd1vSDK;->onInstallConversionDataLoadedNative:Lcom/appsflyer/internal/AFd1vSDK;

    return-object v0
.end method

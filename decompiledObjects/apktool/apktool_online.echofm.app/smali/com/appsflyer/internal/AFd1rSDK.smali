.class public final Lcom/appsflyer/internal/AFd1rSDK;
.super Lcom/appsflyer/internal/AFd1oSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFd1oSDK<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLogger$LogLevel:Ljava/lang/String;

.field private final AFVersionDeclaration:Ljava/lang/String;

.field private final afErrorLogForExcManagerOnly:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final afInfoLog:Lcom/appsflyer/internal/AFb1gSDK;

.field private final afWarnLog:Ljava/util/UUID;

.field private final getLevel:Lcom/appsflyer/share/LinkGenerator$ResponseListener;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1xSDK;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/appsflyer/share/LinkGenerator$ResponseListener;)V
    .locals 4
    .param p1    # Lcom/appsflyer/internal/AFc1xSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1xSDK;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/appsflyer/share/LinkGenerator$ResponseListener;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/appsflyer/internal/AFd1vSDK;->valueOf:Lcom/appsflyer/internal/AFd1vSDK;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/appsflyer/internal/AFd1vSDK;

    sget-object v2, Lcom/appsflyer/internal/AFd1vSDK;->values:Lcom/appsflyer/internal/AFd1vSDK;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Lcom/appsflyer/internal/AFd1vSDK;[Lcom/appsflyer/internal/AFd1vSDK;Lcom/appsflyer/internal/AFc1xSDK;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1xSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1rSDK;->afInfoLog:Lcom/appsflyer/internal/AFb1gSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFd1rSDK;->afWarnLog:Ljava/util/UUID;

    iput-object p3, p0, Lcom/appsflyer/internal/AFd1rSDK;->AFVersionDeclaration:Ljava/lang/String;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1rSDK;->afErrorLogForExcManagerOnly:Ljava/util/Map;

    iput-object p6, p0, Lcom/appsflyer/internal/AFd1rSDK;->getLevel:Lcom/appsflyer/share/LinkGenerator$ResponseListener;

    iput-object p5, p0, Lcom/appsflyer/internal/AFd1rSDK;->AFLogger$LogLevel:Ljava/lang/String;

    return-void
.end method

.method private AFVersionDeclaration()Ljava/lang/String;
    .locals 4

    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v1, "onelinkDomain"

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1rSDK;->afInfoLog:Lcom/appsflyer/internal/AFb1gSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1gSDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/share/LinkGenerator;

    const-string v3, "af_app_invites"

    invoke-direct {v2, v3}, Lcom/appsflyer/share/LinkGenerator;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFd1rSDK;->AFVersionDeclaration:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lcom/appsflyer/share/LinkGenerator;->setBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v0

    const-string v2, "af_siteid"

    invoke-virtual {v0, v2, v1}, Lcom/appsflyer/share/LinkGenerator;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1rSDK;->afErrorLogForExcManagerOnly:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/appsflyer/share/LinkGenerator;->addParameters(Ljava/util/Map;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v0

    invoke-static {}, Lcom/appsflyer/internal/AFa1eSDK;->valueOf()Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFa1eSDK;->AFInAppEventParameterName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/appsflyer/share/LinkGenerator;->setReferrerCustomerId(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/share/LinkGenerator;->generateLink()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final AFInAppEventType()J
    .locals 2

    const-wide/16 v0, 0xbb8

    return-wide v0
.end method

.method public final afInfoLog()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final afRDLog()Lcom/appsflyer/attribution/AppsFlyerRequestListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLevel()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final values(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFc1qSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->AFLogger:Lcom/appsflyer/internal/AFc1oSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1rSDK;->AFVersionDeclaration:Ljava/lang/String;

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1rSDK;->afErrorLogForExcManagerOnly:Ljava/util/Map;

    iget-object v3, p0, Lcom/appsflyer/internal/AFd1rSDK;->AFLogger$LogLevel:Ljava/lang/String;

    iget-object v4, p0, Lcom/appsflyer/internal/AFd1rSDK;->afWarnLog:Ljava/util/UUID;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/internal/AFc1oSDK;->AFInAppEventType(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFc1qSDK;

    move-result-object p1

    return-object p1
.end method

.method public final values()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/appsflyer/internal/AFd1oSDK;->values()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1rSDK;->getLevel:Lcom/appsflyer/share/LinkGenerator$ResponseListener;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1zSDK;->valueOf:Lcom/appsflyer/internal/AFd1ySDK;

    sget-object v2, Lcom/appsflyer/internal/AFd1ySDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFd1ySDK;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1gSDK;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1gSDK;->getBody()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponse(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1zSDK;->afDebugLog()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v2, v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    if-eqz v2, :cond_2

    check-cast v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    invoke-virtual {v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFc1gSDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1gSDK;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Can\'t parse one link data"

    invoke-interface {v0, v1}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponseError(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1rSDK;->AFVersionDeclaration()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponse(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1rSDK;->AFVersionDeclaration()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponse(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

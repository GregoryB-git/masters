.class Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/AppsFlyerConversionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;


# direct methods
.method public constructor <init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppOpenAttribution(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$802(Ljava/util/Map;)Ljava/util/Map;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$900(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v1, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "onAppOpenAttribution"

    const-string v2, "success"

    invoke-static {p1, v0, v1, v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onAttributionFailure(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1002(Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$900(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "failure"

    invoke-static {v0, p1, v1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$700(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v2, "onAppOpenAttribution"

    invoke-static {v0, p1, v2, v1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onConversionDataFail(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$602(Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$300(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "failure"

    invoke-static {v0, p1, v1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$700(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v2, "onInstallConversionData"

    invoke-static {v0, p1, v2, v1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onConversionDataSuccess(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$202(Ljava/util/Map;)Ljava/util/Map;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$300(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v1, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "onInstallConversionData"

    const-string v2, "success"

    invoke-static {p1, v0, v1, v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

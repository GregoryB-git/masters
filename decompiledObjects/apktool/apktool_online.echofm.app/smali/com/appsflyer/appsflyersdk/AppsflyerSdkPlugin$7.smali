.class Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/AppsFlyerInAppPurchaseValidatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->registerValidatorListener()V
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

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValidateInApp()V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1600(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "validatePurchase"

    const-string v3, "success"

    invoke-static {v0, v1, v2, v3}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onValidateInAppFailure(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1600(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "validatePurchase"

    const-string v2, "failure"

    invoke-static {p1, v0, v1, v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

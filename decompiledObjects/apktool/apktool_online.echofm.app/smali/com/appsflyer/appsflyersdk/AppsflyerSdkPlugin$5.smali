.class Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/LinkGenerator$ResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->generateInviteLink(LE5/j;LE5/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final obj:Lorg/json/JSONObject;

.field final synthetic this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;


# direct methods
.method public constructor <init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->obj:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public onResponse(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "generateInviteLinkSuccess"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->obj:Lorg/json/JSONObject;

    const-string v2, "userInviteURL"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->obj:Lorg/json/JSONObject;

    const-string v2, "success"

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

.method public onResponseError(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "generateInviteLinkFailure"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->obj:Lorg/json/JSONObject;

    const-string v2, "error"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v2, "failure"

    invoke-static {v0, p1, v1, v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
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

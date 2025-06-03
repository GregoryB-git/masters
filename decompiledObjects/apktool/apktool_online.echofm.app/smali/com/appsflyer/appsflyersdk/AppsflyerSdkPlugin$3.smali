.class Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/deeplink/DeepLinkListener;


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

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeepLinking(Lcom/appsflyer/deeplink/DeepLinkResult;)V
    .locals 3

    invoke-static {}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1102(Lcom/appsflyer/deeplink/DeepLinkResult;)Lcom/appsflyer/deeplink/DeepLinkResult;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    invoke-static {v0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$1200(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;->this$0:Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;

    const-string v1, "onDeepLinking"

    const-string v2, "success"

    invoke-static {v0, p1, v1, v2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

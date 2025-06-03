.class final Lcom/appsflyer/internal/AFc1dSDK$AFa1wSDK;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lcom/appsflyer/internal/AFb1gSDK;Lcom/appsflyer/internal/AFb1dSDK;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lg6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
.end annotation


# instance fields
.field private synthetic AFInAppEventType:Lcom/appsflyer/internal/AFc1dSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1dSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1dSDK$AFa1wSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1dSDK;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1dSDK$AFa1wSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1dSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1dSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFc1dSDK;)Lcom/appsflyer/internal/AFb1gSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1gSDK;->valueOf:Lcom/appsflyer/internal/AFb1bSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1bSDK;->AFInAppEventType:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1dSDK$AFa1wSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1dSDK;

    invoke-static {v1}, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFc1dSDK;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFc1dSDK;->values(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

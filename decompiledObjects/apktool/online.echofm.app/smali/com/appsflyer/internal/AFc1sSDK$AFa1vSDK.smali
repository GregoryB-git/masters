.class final Lcom/appsflyer/internal/AFc1sSDK$AFa1vSDK;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFc1sSDK;-><init>(Lcom/appsflyer/internal/AFc1xSDK;)V
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
.field private synthetic AFInAppEventType:Lcom/appsflyer/internal/AFc1sSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1sSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1sSDK$AFa1vSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1sSDK;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1sSDK$AFa1vSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1sSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1sSDK;->AFInAppEventType(Lcom/appsflyer/internal/AFc1sSDK;)Lcom/appsflyer/internal/AFc1xSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1xSDK;->afRDLog()Lcom/appsflyer/internal/AFb1wSDK;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

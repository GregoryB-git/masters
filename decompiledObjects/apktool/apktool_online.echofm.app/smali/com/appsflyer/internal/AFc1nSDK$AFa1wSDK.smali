.class public final Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFc1nSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lg6/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
.end annotation


# static fields
.field public static final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/StackTraceElement;

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "at "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/appsflyer/internal/AFf1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1vSDK;


# annotations
.annotation runtime Lkotlin/Metadata;
.end annotation


# instance fields
.field private AFInAppEventType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AFKeystoreWrapper(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/appsflyer/internal/AFb1nSDK;->AFInAppEventType(Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1ySDK;->valueOf(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    return-object p0
.end method

.method private static valueOf(Ljava/lang/String;)Z
    .locals 4

    .line 2
    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "android-app://"

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lkotlin/text/i;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final AFInAppEventParameterName(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1ySDK;->AFInAppEventType:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p1}, Lcom/appsflyer/internal/AFf1ySDK;->AFKeystoreWrapper(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1ySDK;->AFInAppEventType:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final valueOf(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1ySDK;->AFInAppEventType:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/appsflyer/internal/AFf1ySDK;->AFInAppEventType:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/appsflyer/internal/AFf1ySDK;->AFKeystoreWrapper(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final values(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lcom/appsflyer/internal/AFb1nSDK;->AFInAppEventType(Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    return-object p1
.end method

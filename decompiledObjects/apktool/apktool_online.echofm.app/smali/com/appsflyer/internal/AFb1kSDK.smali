.class public final Lcom/appsflyer/internal/AFb1kSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1iSDK;


# annotations
.annotation runtime Lkotlin/Metadata;
.end annotation


# instance fields
.field private final AFInAppEventParameterName:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFInAppEventType:Lcom/appsflyer/internal/AFf1vSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

.field private final values:Lcom/appsflyer/internal/AFb1sSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFb1sSDK;Lcom/appsflyer/internal/AFf1vSDK;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFb1sSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFf1vSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFInAppEventParameterName:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/appsflyer/internal/AFb1kSDK;->values:Lcom/appsflyer/internal/AFb1sSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFf1vSDK;

    return-void
.end method


# virtual methods
.method public final AFInAppEventType(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1jSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;->AFInAppEventType(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final AFInAppEventType()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final AFKeystoreWrapper(Landroid/content/Context;Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/app/Application;

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    new-instance v0, Lcom/appsflyer/internal/AFb1jSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFInAppEventParameterName:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lcom/appsflyer/internal/AFb1kSDK;->values:Lcom/appsflyer/internal/AFb1sSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFf1vSDK;

    invoke-direct {v0, v2, v3, v4, p2}, Lcom/appsflyer/internal/AFb1jSDK;-><init>(Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFb1sSDK;Lcom/appsflyer/internal/AFf1vSDK;Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    instance-of p2, p1, Landroid/app/Activity;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {v0, p2}, Lcom/appsflyer/internal/AFb1jSDK;->onActivityResumed(Landroid/app/Activity;)V

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Landroid/app/Application;

    iget-object p2, p0, Lcom/appsflyer/internal/AFb1kSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1jSDK;

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

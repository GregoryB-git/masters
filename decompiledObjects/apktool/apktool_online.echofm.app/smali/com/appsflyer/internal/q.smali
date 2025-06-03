.class public final synthetic Lcom/appsflyer/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/appsflyer/internal/AFc1sSDK;

.field public final synthetic p:Ljava/lang/Throwable;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/q;->o:Lcom/appsflyer/internal/AFc1sSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/q;->p:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/appsflyer/internal/q;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/q;->o:Lcom/appsflyer/internal/AFc1sSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/q;->p:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/appsflyer/internal/q;->q:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFc1sSDK;->c(Lcom/appsflyer/internal/AFc1sSDK;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

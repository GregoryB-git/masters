.class public final synthetic Lcom/appsflyer/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/appsflyer/internal/AFa1eSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1eSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/f;->o:Lcom/appsflyer/internal/AFa1eSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/f;->o:Lcom/appsflyer/internal/AFa1eSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1eSDK;->e(Lcom/appsflyer/internal/AFa1eSDK;)V

    return-void
.end method

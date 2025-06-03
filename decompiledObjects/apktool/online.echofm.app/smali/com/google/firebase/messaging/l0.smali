.class public Lcom/google/firebase/messaging/l0;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/l0$a;
    }
.end annotation


# instance fields
.field public final b:Lcom/google/firebase/messaging/l0$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/messaging/l0$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/l0;->b:Lcom/google/firebase/messaging/l0$a;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/messaging/o0$a;LV2/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/l0;->b(Lcom/google/firebase/messaging/o0$a;LV2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/messaging/o0$a;LV2/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/o0$a;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lcom/google/firebase/messaging/o0$a;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "service received new intent via bind strategy"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/l0;->b:Lcom/google/firebase/messaging/l0$a;

    iget-object v1, p1, Lcom/google/firebase/messaging/o0$a;->a:Landroid/content/Intent;

    invoke-interface {v0, v1}, Lcom/google/firebase/messaging/l0$a;->a(Landroid/content/Intent;)LV2/j;

    move-result-object v0

    new-instance v1, Lr1/m;

    invoke-direct {v1}, Lr1/m;-><init>()V

    new-instance v2, Lcom/google/firebase/messaging/k0;

    invoke-direct {v2, p1}, Lcom/google/firebase/messaging/k0;-><init>(Lcom/google/firebase/messaging/o0$a;)V

    invoke-virtual {v0, v1, v2}, LV2/j;->c(Ljava/util/concurrent/Executor;LV2/e;)LV2/j;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Binding only allowed within app"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

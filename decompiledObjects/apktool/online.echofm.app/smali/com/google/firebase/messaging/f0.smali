.class public final synthetic Lcom/google/firebase/messaging/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic q:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic r:Lcom/google/firebase/messaging/K;

.field public final synthetic s:Lcom/google/firebase/messaging/F;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/messaging/K;Lcom/google/firebase/messaging/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/f0;->o:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/messaging/f0;->p:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/firebase/messaging/f0;->q:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p4, p0, Lcom/google/firebase/messaging/f0;->r:Lcom/google/firebase/messaging/K;

    iput-object p5, p0, Lcom/google/firebase/messaging/f0;->s:Lcom/google/firebase/messaging/F;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/f0;->o:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/firebase/messaging/f0;->p:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/google/firebase/messaging/f0;->q:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v3, p0, Lcom/google/firebase/messaging/f0;->r:Lcom/google/firebase/messaging/K;

    iget-object v4, p0, Lcom/google/firebase/messaging/f0;->s:Lcom/google/firebase/messaging/F;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/firebase/messaging/g0;->a(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/messaging/K;Lcom/google/firebase/messaging/F;)Lcom/google/firebase/messaging/g0;

    move-result-object v0

    return-object v0
.end method

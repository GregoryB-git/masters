.class public final synthetic Lcom/google/firebase/messaging/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Z

.field public final synthetic q:LV2/k;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/P;->o:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/firebase/messaging/P;->p:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/firebase/messaging/P;->q:LV2/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/P;->o:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/firebase/messaging/P;->p:Z

    iget-object v2, p0, Lcom/google/firebase/messaging/P;->q:LV2/k;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/Q;->a(Landroid/content/Context;ZLV2/k;)V

    return-void
.end method

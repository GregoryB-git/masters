.class public final LR2/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z

.field public final synthetic t:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/a4;->t:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/a4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LR2/a4;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LR2/a4;->q:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, LR2/a4;->r:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p6, p0, LR2/a4;->s:Z

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LR2/a4;->t:LR2/C3;

    .line 2
    .line 3
    iget-object v0, v0, LR2/m3;->a:LR2/N2;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/N2;->J()LR2/D4;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LR2/a4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    iget-object v4, p0, LR2/a4;->q:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, p0, LR2/a4;->r:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v6, p0, LR2/a4;->s:Z

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual/range {v1 .. v6}, LR2/D4;->T(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

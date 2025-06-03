.class public final LR2/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/b4;->s:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/b4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LR2/b4;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LR2/b4;->q:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, LR2/b4;->r:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/b4;->s:LR2/C3;

    .line 2
    .line 3
    iget-object v0, v0, LR2/m3;->a:LR2/N2;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/N2;->J()LR2/D4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LR2/b4;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    iget-object v2, p0, LR2/b4;->q:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, LR2/b4;->r:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-virtual {v0, v1, v4, v2, v3}, LR2/D4;->S(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

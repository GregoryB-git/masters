.class public final LR2/X3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/X3;->p:LR2/C3;

    .line 2
    .line 3
    iput-wide p2, p0, LR2/X3;->o:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/X3;->p:LR2/C3;

    .line 2
    .line 3
    iget-wide v1, p0, LR2/X3;->o:J

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-virtual {v0, v1, v2, v3}, LR2/C3;->E(JZ)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LR2/X3;->p:LR2/C3;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/G1;->t()LR2/D4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, LR2/D4;->Q(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

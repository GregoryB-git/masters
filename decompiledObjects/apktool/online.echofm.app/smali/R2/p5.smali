.class public final LR2/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public o:J

.field public p:J

.field public final synthetic q:LR2/q5;


# direct methods
.method public constructor <init>(LR2/q5;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/p5;->q:LR2/q5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, LR2/p5;->o:J

    .line 7
    .line 8
    iput-wide p4, p0, LR2/p5;->p:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/p5;->q:LR2/q5;

    .line 2
    .line 3
    iget-object v0, v0, LR2/q5;->b:LR2/l5;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/m3;->e()LR2/G2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LR2/s5;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LR2/s5;-><init>(LR2/p5;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

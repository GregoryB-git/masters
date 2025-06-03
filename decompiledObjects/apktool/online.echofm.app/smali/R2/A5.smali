.class public final LR2/A5;
.super LR2/x;
.source "SourceFile"


# instance fields
.field public final synthetic e:LR2/x5;


# direct methods
.method public constructor <init>(LR2/x5;LR2/o3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/A5;->e:LR2/x5;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LR2/x;-><init>(LR2/o3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/A5;->e:LR2/x5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/x5;->z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/A5;->e:LR2/x5;

    .line 7
    .line 8
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Starting upload from DelayedRunnable"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LR2/A5;->e:LR2/x5;

    .line 22
    .line 23
    iget-object v0, v0, LR2/z5;->b:LR2/D5;

    .line 24
    .line 25
    invoke-virtual {v0}, LR2/D5;->t0()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

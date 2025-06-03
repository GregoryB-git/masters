.class public final LR2/U2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/e;

.field public final synthetic p:LR2/W5;

.field public final synthetic q:LR2/R2;


# direct methods
.method public constructor <init>(LR2/R2;LR2/e;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/U2;->q:LR2/R2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/U2;->o:LR2/e;

    .line 4
    .line 5
    iput-object p3, p0, LR2/U2;->p:LR2/W5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/U2;->q:LR2/R2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/D5;->o0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/U2;->o:LR2/e;

    .line 11
    .line 12
    iget-object v0, v0, LR2/e;->q:LR2/R5;

    .line 13
    .line 14
    invoke-virtual {v0}, LR2/R5;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LR2/U2;->q:LR2/R2;

    .line 21
    .line 22
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LR2/U2;->o:LR2/e;

    .line 27
    .line 28
    iget-object v2, p0, LR2/U2;->p:LR2/W5;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, LR2/D5;->p(LR2/e;LR2/W5;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v0, p0, LR2/U2;->q:LR2/R2;

    .line 35
    .line 36
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, LR2/U2;->o:LR2/e;

    .line 41
    .line 42
    iget-object v2, p0, LR2/U2;->p:LR2/W5;

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, LR2/D5;->T(LR2/e;LR2/W5;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

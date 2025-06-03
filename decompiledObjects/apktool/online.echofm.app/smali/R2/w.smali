.class public final LR2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/o3;

.field public final synthetic p:LR2/x;


# direct methods
.method public constructor <init>(LR2/x;LR2/o3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/w;->p:LR2/x;

    .line 2
    .line 3
    iput-object p2, p0, LR2/w;->o:LR2/o3;

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
    iget-object v0, p0, LR2/w;->o:LR2/o3;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/o3;->d()LR2/f;

    .line 4
    .line 5
    .line 6
    invoke-static {}, LR2/f;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LR2/w;->o:LR2/o3;

    .line 13
    .line 14
    invoke-interface {v0}, LR2/o3;->e()LR2/G2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, LR2/w;->p:LR2/x;

    .line 23
    .line 24
    invoke-virtual {v0}, LR2/x;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, LR2/w;->p:LR2/x;

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    invoke-static {v1, v2, v3}, LR2/x;->c(LR2/x;J)V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, LR2/w;->p:LR2/x;

    .line 38
    .line 39
    invoke-virtual {v0}, LR2/x;->d()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.class public final LR2/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/R1;

.field public final synthetic p:LR2/a5;


# direct methods
.method public constructor <init>(LR2/a5;LR2/R1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/b5;->p:LR2/a5;

    .line 2
    .line 3
    iput-object p2, p0, LR2/b5;->o:LR2/R1;

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
    .locals 3

    .line 1
    iget-object v0, p0, LR2/b5;->p:LR2/a5;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LR2/b5;->p:LR2/a5;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2}, LR2/a5;->b(LR2/a5;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LR2/b5;->p:LR2/a5;

    .line 11
    .line 12
    iget-object v1, v1, LR2/a5;->c:LR2/D4;

    .line 13
    .line 14
    invoke-virtual {v1}, LR2/D4;->c0()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LR2/b5;->p:LR2/a5;

    .line 21
    .line 22
    iget-object v1, v1, LR2/a5;->c:LR2/D4;

    .line 23
    .line 24
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, LR2/Y1;->F()LR2/a2;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "Connected to remote service"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LR2/b5;->p:LR2/a5;

    .line 38
    .line 39
    iget-object v1, v1, LR2/a5;->c:LR2/D4;

    .line 40
    .line 41
    iget-object v2, p0, LR2/b5;->o:LR2/R1;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, LR2/D4;->E(LR2/R1;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw v1
.end method

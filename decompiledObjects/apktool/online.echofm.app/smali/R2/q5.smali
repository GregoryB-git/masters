.class public final LR2/q5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LR2/p5;

.field public final synthetic b:LR2/l5;


# direct methods
.method public constructor <init>(LR2/l5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/q5;->b:LR2/l5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/q5;->b:LR2/l5;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/q5;->a:LR2/p5;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LR2/q5;->b:LR2/l5;

    .line 11
    .line 12
    invoke-static {v0}, LR2/l5;->B(LR2/l5;)Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LR2/q5;->a:LR2/p5;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LR2/q5;->b:LR2/l5;

    .line 22
    .line 23
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, LR2/l2;->s:LR2/o2;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, LR2/o2;->a(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LR2/q5;->b:LR2/l5;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, LR2/l5;->D(Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final b(J)V
    .locals 7

    .line 1
    new-instance v6, LR2/p5;

    .line 2
    .line 3
    iget-object v0, p0, LR2/q5;->b:LR2/l5;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/m3;->b()LE2/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, LE2/e;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    move-object v0, v6

    .line 14
    move-object v1, p0

    .line 15
    move-wide v4, p1

    .line 16
    invoke-direct/range {v0 .. v5}, LR2/p5;-><init>(LR2/q5;JJ)V

    .line 17
    .line 18
    .line 19
    iput-object v6, p0, LR2/q5;->a:LR2/p5;

    .line 20
    .line 21
    iget-object p1, p0, LR2/q5;->b:LR2/l5;

    .line 22
    .line 23
    invoke-static {p1}, LR2/l5;->B(LR2/l5;)Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, LR2/q5;->a:LR2/p5;

    .line 28
    .line 29
    const-wide/16 v0, 0x7d0

    .line 30
    .line 31
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

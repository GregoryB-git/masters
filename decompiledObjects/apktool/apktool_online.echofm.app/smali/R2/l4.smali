.class public final LR2/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/q3;

.field public final synthetic p:J

.field public final synthetic q:Z

.field public final synthetic r:LR2/q3;

.field public final synthetic s:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;LR2/q3;JZLR2/q3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/l4;->s:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/l4;->o:LR2/q3;

    .line 4
    .line 5
    iput-wide p3, p0, LR2/l4;->p:J

    .line 6
    .line 7
    iput-boolean p5, p0, LR2/l4;->q:Z

    .line 8
    .line 9
    iput-object p6, p0, LR2/l4;->r:LR2/q3;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, LR2/l4;->s:LR2/C3;

    .line 2
    .line 3
    iget-object v1, p0, LR2/l4;->o:LR2/q3;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LR2/C3;->G(LR2/q3;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LR2/l4;->s:LR2/C3;

    .line 9
    .line 10
    iget-object v3, p0, LR2/l4;->o:LR2/q3;

    .line 11
    .line 12
    iget-wide v4, p0, LR2/l4;->p:J

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    iget-boolean v7, p0, LR2/l4;->q:Z

    .line 16
    .line 17
    invoke-static/range {v2 .. v7}, LR2/C3;->K(LR2/C3;LR2/q3;JZZ)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, LR2/l4;->s:LR2/C3;

    .line 27
    .line 28
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, LR2/K;->x0:LR2/P1;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, LR2/l4;->s:LR2/C3;

    .line 41
    .line 42
    iget-object v1, p0, LR2/l4;->o:LR2/q3;

    .line 43
    .line 44
    iget-object v2, p0, LR2/l4;->r:LR2/q3;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, LR2/C3;->L(LR2/C3;LR2/q3;LR2/q3;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

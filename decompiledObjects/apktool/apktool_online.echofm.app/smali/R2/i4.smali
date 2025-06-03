.class public final LR2/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/q3;

.field public final synthetic p:J

.field public final synthetic q:J

.field public final synthetic r:Z

.field public final synthetic s:LR2/q3;

.field public final synthetic t:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;LR2/q3;JJZLR2/q3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/i4;->t:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/i4;->o:LR2/q3;

    .line 4
    .line 5
    iput-wide p3, p0, LR2/i4;->p:J

    .line 6
    .line 7
    iput-wide p5, p0, LR2/i4;->q:J

    .line 8
    .line 9
    iput-boolean p7, p0, LR2/i4;->r:Z

    .line 10
    .line 11
    iput-object p8, p0, LR2/i4;->s:LR2/q3;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, LR2/i4;->t:LR2/C3;

    .line 2
    .line 3
    iget-object v1, p0, LR2/i4;->o:LR2/q3;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LR2/C3;->G(LR2/q3;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/i4;->t:LR2/C3;

    .line 9
    .line 10
    iget-wide v1, p0, LR2/i4;->p:J

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, LR2/C3;->E(JZ)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, LR2/i4;->t:LR2/C3;

    .line 17
    .line 18
    iget-object v5, p0, LR2/i4;->o:LR2/q3;

    .line 19
    .line 20
    iget-wide v6, p0, LR2/i4;->q:J

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    iget-boolean v9, p0, LR2/i4;->r:Z

    .line 24
    .line 25
    invoke-static/range {v4 .. v9}, LR2/C3;->K(LR2/C3;LR2/q3;JZZ)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, LR2/i4;->t:LR2/C3;

    .line 35
    .line 36
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, LR2/K;->x0:LR2/P1;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, LR2/i4;->t:LR2/C3;

    .line 49
    .line 50
    iget-object v1, p0, LR2/i4;->o:LR2/q3;

    .line 51
    .line 52
    iget-object v2, p0, LR2/i4;->s:LR2/q3;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, LR2/C3;->L(LR2/C3;LR2/q3;LR2/q3;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

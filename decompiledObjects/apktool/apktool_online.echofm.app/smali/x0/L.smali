.class public final Lx0/L;
.super Lx0/a;
.source "SourceFile"

# interfaces
.implements Lx0/K$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/L$b;
    }
.end annotation


# instance fields
.field public final h:Li0/g$a;

.field public final i:Lx0/F$a;

.field public final j:Lp0/x;

.field public final k:LB0/m;

.field public final l:I

.field public m:Z

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Li0/y;

.field public r:Ld0/u;


# direct methods
.method public constructor <init>(Ld0/u;Li0/g$a;Lx0/F$a;Lp0/x;LB0/m;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx0/a;-><init>()V

    iput-object p1, p0, Lx0/L;->r:Ld0/u;

    iput-object p2, p0, Lx0/L;->h:Li0/g$a;

    iput-object p3, p0, Lx0/L;->i:Lx0/F$a;

    iput-object p4, p0, Lx0/L;->j:Lp0/x;

    iput-object p5, p0, Lx0/L;->k:LB0/m;

    iput p6, p0, Lx0/L;->l:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx0/L;->m:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lx0/L;->n:J

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u;Li0/g$a;Lx0/F$a;Lp0/x;LB0/m;ILx0/L$a;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, Lx0/L;-><init>(Ld0/u;Li0/g$a;Lx0/F$a;Lp0/x;LB0/m;I)V

    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/L;->j:Lp0/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lp0/x;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final C()Ld0/u$h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/L;->a()Ld0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ld0/u;->b:Ld0/u$h;

    .line 6
    .line 7
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ld0/u$h;

    .line 12
    .line 13
    return-object v0
.end method

.method public final D()V
    .locals 9

    .line 1
    new-instance v8, Lx0/V;

    .line 2
    .line 3
    iget-wide v1, p0, Lx0/L;->n:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lx0/L;->o:Z

    .line 6
    .line 7
    iget-boolean v5, p0, Lx0/L;->p:Z

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    invoke-virtual {p0}, Lx0/L;->a()Ld0/u;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v0, v8

    .line 16
    invoke-direct/range {v0 .. v7}, Lx0/V;-><init>(JZZZLjava/lang/Object;Ld0/u;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lx0/L;->m:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lx0/L$a;

    .line 24
    .line 25
    invoke-direct {v0, p0, v8}, Lx0/L$a;-><init>(Lx0/L;Ld0/I;)V

    .line 26
    .line 27
    .line 28
    move-object v8, v0

    .line 29
    :cond_0
    invoke-virtual {p0, v8}, Lx0/a;->A(Ld0/I;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public declared-synchronized a()Ld0/u;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx0/L;->r:Ld0/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
.end method

.method public e(Lx0/v;)V
    .locals 0

    .line 1
    check-cast p1, Lx0/K;

    .line 2
    .line 3
    invoke-virtual {p1}, Lx0/K;->g0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(Lx0/x$b;LB0/b;J)Lx0/v;
    .locals 16

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    iget-object v0, v14, Lx0/L;->h:Li0/g$a;

    .line 4
    .line 5
    invoke-interface {v0}, Li0/g$a;->a()Li0/g;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, v14, Lx0/L;->q:Li0/y;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v2, v0}, Li0/g;->c(Li0/y;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lx0/L;->C()Ld0/u$h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v15, Lx0/K;

    .line 21
    .line 22
    iget-object v1, v0, Ld0/u$h;->a:Landroid/net/Uri;

    .line 23
    .line 24
    iget-object v3, v14, Lx0/L;->i:Lx0/F$a;

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lx0/a;->x()Ll0/y1;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v3, v4}, Lx0/F$a;->a(Ll0/y1;)Lx0/F;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, v14, Lx0/L;->j:Lp0/x;

    .line 35
    .line 36
    invoke-virtual/range {p0 .. p1}, Lx0/a;->s(Lx0/x$b;)Lp0/v$a;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v6, v14, Lx0/L;->k:LB0/m;

    .line 41
    .line 42
    invoke-virtual/range {p0 .. p1}, Lx0/a;->u(Lx0/x$b;)Lx0/E$a;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    iget-object v10, v0, Ld0/u$h;->e:Ljava/lang/String;

    .line 47
    .line 48
    iget v11, v14, Lx0/L;->l:I

    .line 49
    .line 50
    iget-wide v8, v0, Ld0/u$h;->i:J

    .line 51
    .line 52
    invoke-static {v8, v9}, Lg0/M;->J0(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v12

    .line 56
    move-object v0, v15

    .line 57
    move-object/from16 v8, p0

    .line 58
    .line 59
    move-object/from16 v9, p2

    .line 60
    .line 61
    invoke-direct/range {v0 .. v13}, Lx0/K;-><init>(Landroid/net/Uri;Li0/g;Lx0/F;Lp0/x;Lp0/v$a;LB0/m;Lx0/E$a;Lx0/K$c;LB0/b;Ljava/lang/String;IJ)V

    .line 62
    .line 63
    .line 64
    return-object v15
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized l(Ld0/u;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lx0/L;->r:Ld0/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

.method public q(JZZ)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide p1, p0, Lx0/L;->n:J

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lx0/L;->m:Z

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Lx0/L;->n:J

    .line 17
    .line 18
    cmp-long v0, v0, p1

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-boolean v0, p0, Lx0/L;->o:Z

    .line 23
    .line 24
    if-ne v0, p3, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lx0/L;->p:Z

    .line 27
    .line 28
    if-ne v0, p4, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iput-wide p1, p0, Lx0/L;->n:J

    .line 32
    .line 33
    iput-boolean p3, p0, Lx0/L;->o:Z

    .line 34
    .line 35
    iput-boolean p4, p0, Lx0/L;->p:Z

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lx0/L;->m:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Lx0/L;->D()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public z(Li0/y;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lx0/L;->q:Li0/y;

    .line 2
    .line 3
    iget-object p1, p0, Lx0/L;->j:Lp0/x;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/os/Looper;

    .line 14
    .line 15
    invoke-virtual {p0}, Lx0/a;->x()Ll0/y1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lp0/x;->a(Landroid/os/Looper;Ll0/y1;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lx0/L;->j:Lp0/x;

    .line 23
    .line 24
    invoke-interface {p1}, Lp0/x;->g()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lx0/L;->D()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

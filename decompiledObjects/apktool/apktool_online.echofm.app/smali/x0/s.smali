.class public final Lx0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/v;
.implements Lx0/v$a;


# instance fields
.field public final o:Lx0/x$b;

.field public final p:J

.field public final q:LB0/b;

.field public r:Lx0/x;

.field public s:Lx0/v;

.field public t:Lx0/v$a;

.field public u:J


# direct methods
.method public constructor <init>(Lx0/x$b;LB0/b;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/s;->o:Lx0/x$b;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/s;->q:LB0/b;

    .line 7
    .line 8
    iput-wide p3, p0, Lx0/s;->p:J

    .line 9
    .line 10
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lx0/s;->u:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(Lx0/x$b;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lx0/s;->p:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lx0/s;->t(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lx0/s;->r:Lx0/x;

    .line 8
    .line 9
    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lx0/x;

    .line 14
    .line 15
    iget-object v3, p0, Lx0/s;->q:LB0/b;

    .line 16
    .line 17
    invoke-interface {v2, p1, v3, v0, v1}, Lx0/x;->f(Lx0/x$b;LB0/b;J)Lx0/v;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lx0/s;->s:Lx0/v;

    .line 22
    .line 23
    iget-object v2, p0, Lx0/s;->t:Lx0/v$a;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v1}, Lx0/v;->u(Lx0/v$a;J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx0/v;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0}, Lx0/v;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public d(JLk0/d1;)J
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lx0/v;->d(JLk0/d1;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
.end method

.method public bridge synthetic e(Lx0/S;)V
    .locals 0

    .line 1
    check-cast p1, Lx0/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx0/s;->v(Lx0/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0}, Lx0/v;->f()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public g(Lk0/y0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lx0/v;->g(Lk0/y0;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return p1
.end method

.method public h(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lx0/v;->h(J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public i([LA0/y;[Z[Lx0/Q;[ZJ)J
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    iget-wide v1, v0, Lx0/s;->u:J

    .line 3
    .line 4
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmp-long v5, v1, v3

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    iget-wide v5, v0, Lx0/s;->p:J

    .line 14
    .line 15
    cmp-long v5, p5, v5

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    move-wide v11, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-wide/from16 v11, p5

    .line 22
    .line 23
    :goto_0
    iput-wide v3, v0, Lx0/s;->u:J

    .line 24
    .line 25
    iget-object v1, v0, Lx0/s;->s:Lx0/v;

    .line 26
    .line 27
    invoke-static {v1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v6, v1

    .line 32
    check-cast v6, Lx0/v;

    .line 33
    .line 34
    move-object v7, p1

    .line 35
    move-object v8, p2

    .line 36
    move-object/from16 v9, p3

    .line 37
    .line 38
    move-object/from16 v10, p4

    .line 39
    .line 40
    invoke-interface/range {v6 .. v12}, Lx0/v;->i([LA0/y;[Z[Lx0/Q;[ZJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    return-wide v1
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/s;->u:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public k(Lx0/v;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lx0/s;->t:Lx0/v$a;

    .line 2
    .line 3
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lx0/v$a;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lx0/v$a;->k(Lx0/v;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public l()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0}, Lx0/v;->l()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public n()Lx0/Z;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0}, Lx0/v;->n()Lx0/Z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx0/v;->p()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lx0/s;->r:Lx0/x;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lx0/x;->h()V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public q(JZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lx0/v;->q(JZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx0/s;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public s(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/v;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lx0/v;->s(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
.end method

.method public final t(J)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lx0/s;->u:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move-wide p1, v0

    .line 13
    :cond_0
    return-wide p1
.end method

.method public u(Lx0/v$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/s;->t:Lx0/v$a;

    .line 2
    .line 3
    iget-object p1, p0, Lx0/s;->s:Lx0/v;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-wide p2, p0, Lx0/s;->p:J

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3}, Lx0/s;->t(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-interface {p1, p0, p2, p3}, Lx0/v;->u(Lx0/v$a;J)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public v(Lx0/v;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lx0/s;->t:Lx0/v$a;

    .line 2
    .line 3
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lx0/v$a;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public w(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lx0/s;->u:J

    .line 2
    .line 3
    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/s;->s:Lx0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx0/s;->r:Lx0/x;

    .line 6
    .line 7
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx0/x;

    .line 12
    .line 13
    iget-object v1, p0, Lx0/s;->s:Lx0/v;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lx0/x;->e(Lx0/v;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public y(Lx0/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/s;->r:Lx0/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lx0/s;->r:Lx0/x;

    .line 12
    .line 13
    return-void
.end method

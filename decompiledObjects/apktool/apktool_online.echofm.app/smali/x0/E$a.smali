.class public Lx0/E$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/E$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lx0/x$b;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lx0/E$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lx0/E$a;->a:I

    iput-object p3, p0, Lx0/E$a;->b:Lx0/x$b;

    return-void
.end method

.method public static synthetic a(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/E$a;->k(Lx0/E;Lx0/r;Lx0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lx0/E$a;Lx0/E;Lx0/x$b;Lx0/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/E$a;->o(Lx0/E;Lx0/x$b;Lx0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/E$a;->n(Lx0/E;Lx0/r;Lx0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/E$a;->l(Lx0/E;Lx0/r;Lx0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lx0/E$a;Lx0/E;Lx0/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lx0/E$a;->j(Lx0/E;Lx0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lx0/E$a;->m(Lx0/E;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(Lx0/r;Lx0/u;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    iget-object v1, v1, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lx0/y;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1, p2}, Lx0/y;-><init>(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public B(Lx0/E;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public C(IJJ)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static {p2, p3}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p4 .. p5}, Lg0/M;->i1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, v10

    .line 16
    move v2, p1

    .line 17
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move-object v0, p0

    .line 21
    invoke-virtual {p0, v10}, Lx0/E$a;->D(Lx0/u;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public D(Lx0/u;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/x$b;

    .line 8
    .line 9
    iget-object v1, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lx0/E$a$a;

    .line 26
    .line 27
    iget-object v3, v2, Lx0/E$a$a;->b:Lx0/E;

    .line 28
    .line 29
    iget-object v2, v2, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v4, Lx0/A;

    .line 32
    .line 33
    invoke-direct {v4, p0, v3, v0, p1}, Lx0/A;-><init>(Lx0/E$a;Lx0/E;Lx0/x$b;Lx0/u;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v4}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public E(ILx0/x$b;)Lx0/E$a;
    .locals 2

    .line 1
    new-instance v0, Lx0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, Lx0/E$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public g(Landroid/os/Handler;Lx0/E;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    new-instance v1, Lx0/E$a$a;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Lx0/E$a$a;-><init>(Landroid/os/Handler;Lx0/E;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(ILd0/q;ILjava/lang/Object;J)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static/range {p5 .. p6}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    move-object v0, v10

    .line 14
    move v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move v4, p3

    .line 17
    move-object v5, p4

    .line 18
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    move-object v0, p0

    .line 22
    invoke-virtual {p0, v10}, Lx0/E$a;->i(Lx0/u;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public i(Lx0/u;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    iget-object v1, v1, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lx0/z;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1}, Lx0/z;-><init>(Lx0/E$a;Lx0/E;Lx0/u;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final synthetic j(Lx0/E;Lx0/u;)V
    .locals 2

    .line 1
    iget v0, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1, p2}, Lx0/E;->W(ILx0/x$b;Lx0/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic k(Lx0/E;Lx0/r;Lx0/u;)V
    .locals 2

    .line 1
    iget v0, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1, p2, p3}, Lx0/E;->p0(ILx0/x$b;Lx0/r;Lx0/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic l(Lx0/E;Lx0/r;Lx0/u;)V
    .locals 2

    .line 1
    iget v0, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1, p2, p3}, Lx0/E;->m0(ILx0/x$b;Lx0/r;Lx0/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic m(Lx0/E;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V
    .locals 7

    .line 1
    iget v1, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    iget-object v2, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move v6, p5

    .line 10
    invoke-interface/range {v0 .. v6}, Lx0/E;->a0(ILx0/x$b;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic n(Lx0/E;Lx0/r;Lx0/u;)V
    .locals 2

    .line 1
    iget v0, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx0/E$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1, p2, p3}, Lx0/E;->K(ILx0/x$b;Lx0/r;Lx0/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic o(Lx0/E;Lx0/x$b;Lx0/u;)V
    .locals 1

    .line 1
    iget v0, p0, Lx0/E$a;->a:I

    .line 2
    .line 3
    invoke-interface {p1, v0, p2, p3}, Lx0/E;->Z(ILx0/x$b;Lx0/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(Lx0/r;I)V
    .locals 11

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, Lx0/E$a;->q(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public q(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lg0/M;->i1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move-object v0, v10

    .line 12
    move v1, p2

    .line 13
    move v2, p3

    .line 14
    move-object v3, p4

    .line 15
    move/from16 v4, p5

    .line 16
    .line 17
    move-object/from16 v5, p6

    .line 18
    .line 19
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 20
    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    invoke-virtual {p0, p1, v10}, Lx0/E$a;->r(Lx0/r;Lx0/u;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public r(Lx0/r;Lx0/u;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    iget-object v1, v1, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lx0/D;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1, p2}, Lx0/D;-><init>(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public s(Lx0/r;I)V
    .locals 11

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, Lx0/E$a;->t(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public t(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lg0/M;->i1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move-object v0, v10

    .line 12
    move v1, p2

    .line 13
    move v2, p3

    .line 14
    move-object v3, p4

    .line 15
    move/from16 v4, p5

    .line 16
    .line 17
    move-object/from16 v5, p6

    .line 18
    .line 19
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 20
    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    invoke-virtual {p0, p1, v10}, Lx0/E$a;->u(Lx0/r;Lx0/u;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public u(Lx0/r;Lx0/u;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    iget-object v1, v1, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lx0/B;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1, p2}, Lx0/B;-><init>(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public v(Lx0/r;IILd0/q;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lg0/M;->i1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move-object v0, v10

    .line 12
    move v1, p2

    .line 13
    move v2, p3

    .line 14
    move-object v3, p4

    .line 15
    move/from16 v4, p5

    .line 16
    .line 17
    move-object/from16 v5, p6

    .line 18
    .line 19
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 20
    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    move-object/from16 v2, p11

    .line 25
    .line 26
    move/from16 v3, p12

    .line 27
    .line 28
    invoke-virtual {p0, p1, v10, v2, v3}, Lx0/E$a;->x(Lx0/r;Lx0/u;Ljava/io/IOException;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public w(Lx0/r;ILjava/io/IOException;Z)V
    .locals 13

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move-object/from16 v11, p3

    .line 19
    .line 20
    move/from16 v12, p4

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v12}, Lx0/E$a;->v(Lx0/r;IILd0/q;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public x(Lx0/r;Lx0/u;Ljava/io/IOException;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lx0/E$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lx0/E$a$a;

    .line 18
    .line 19
    iget-object v4, v1, Lx0/E$a$a;->b:Lx0/E;

    .line 20
    .line 21
    iget-object v1, v1, Lx0/E$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v9, Lx0/C;

    .line 24
    .line 25
    move-object v2, v9

    .line 26
    move-object v3, p0

    .line 27
    move-object v5, p1

    .line 28
    move-object v6, p2

    .line 29
    move-object v7, p3

    .line 30
    move v8, p4

    .line 31
    invoke-direct/range {v2 .. v8}, Lx0/C;-><init>(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v9}, Lg0/M;->S0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public y(Lx0/r;I)V
    .locals 11

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, Lx0/E$a;->z(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public z(Lx0/r;IILd0/q;ILjava/lang/Object;JJ)V
    .locals 11

    .line 1
    new-instance v10, Lx0/u;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, Lg0/M;->i1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move-object v0, v10

    .line 12
    move v1, p2

    .line 13
    move v2, p3

    .line 14
    move-object v3, p4

    .line 15
    move/from16 v4, p5

    .line 16
    .line 17
    move-object/from16 v5, p6

    .line 18
    .line 19
    invoke-direct/range {v0 .. v9}, Lx0/u;-><init>(IILd0/q;ILjava/lang/Object;JJ)V

    .line 20
    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    invoke-virtual {p0, p1, v10}, Lx0/E$a;->A(Lx0/r;Lx0/u;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

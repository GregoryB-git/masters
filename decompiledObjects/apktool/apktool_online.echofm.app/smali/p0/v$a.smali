.class public Lp0/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/v$a$a;
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

    invoke-direct {p0, v0, v1, v2}, Lp0/v$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lp0/v$a;->a:I

    iput-object p3, p0, Lp0/v$a;->b:Lx0/x$b;

    return-void
.end method

.method public static synthetic a(Lp0/v$a;Lp0/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp0/v$a;->p(Lp0/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lp0/v$a;Lp0/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp0/v$a;->s(Lp0/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lp0/v$a;Lp0/v;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lp0/v$a;->q(Lp0/v;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lp0/v$a;Lp0/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp0/v$a;->n(Lp0/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lp0/v$a;Lp0/v;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lp0/v$a;->r(Lp0/v;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lp0/v$a;Lp0/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp0/v$a;->o(Lp0/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public g(Landroid/os/Handler;Lp0/v;)V
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
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    new-instance v1, Lp0/v$a$a;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Lp0/v$a$a;-><init>(Landroid/os/Handler;Lp0/v;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/u;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, Lp0/u;-><init>(Lp0/v$a;Lp0/v;)V

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

.method public i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/s;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, Lp0/s;-><init>(Lp0/v$a;Lp0/v;)V

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

.method public j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/t;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, Lp0/t;-><init>(Lp0/v$a;Lp0/v;)V

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

.method public k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/q;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1}, Lp0/q;-><init>(Lp0/v$a;Lp0/v;I)V

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

.method public l(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/p;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1}, Lp0/p;-><init>(Lp0/v$a;Lp0/v;Ljava/lang/Exception;)V

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

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    iget-object v1, v1, Lp0/v$a$a;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v3, Lp0/r;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, Lp0/r;-><init>(Lp0/v$a;Lp0/v;)V

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

.method public final synthetic n(Lp0/v;)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lp0/v;->S(ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic o(Lp0/v;)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lp0/v;->g0(ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic p(Lp0/v;)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lp0/v;->l0(ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic q(Lp0/v;I)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lp0/v;->b0(ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lp0/v$a;->a:I

    .line 9
    .line 10
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 11
    .line 12
    invoke-interface {p1, v0, v1, p2}, Lp0/v;->M(ILx0/x$b;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final synthetic r(Lp0/v;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1, p2}, Lp0/v;->d0(ILx0/x$b;Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic s(Lp0/v;)V
    .locals 2

    .line 1
    iget v0, p0, Lp0/v$a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lp0/v;->T(ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(Lp0/v;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v1, Lp0/v$a$a;

    .line 18
    .line 19
    iget-object v2, v1, Lp0/v$a$a;->b:Lp0/v;

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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

.method public u(ILx0/x$b;)Lp0/v$a;
    .locals 2

    .line 1
    new-instance v0, Lp0/v$a;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/v$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, Lp0/v$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILx0/x$b;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

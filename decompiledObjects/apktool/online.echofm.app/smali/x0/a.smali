.class public abstract Lx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/x;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/HashSet;

.field public final c:Lx0/E$a;

.field public final d:Lp0/v$a;

.field public e:Landroid/os/Looper;

.field public f:Ld0/I;

.field public g:Ll0/y1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx0/a;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 18
    .line 19
    new-instance v0, Lx0/E$a;

    .line 20
    .line 21
    invoke-direct {v0}, Lx0/E$a;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lx0/a;->c:Lx0/E$a;

    .line 25
    .line 26
    new-instance v0, Lp0/v$a;

    .line 27
    .line 28
    invoke-direct {v0}, Lp0/v$a;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lx0/a;->d:Lp0/v$a;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final A(Ld0/I;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lx0/a;->f:Ld0/I;

    .line 2
    .line 3
    iget-object v0, p0, Lx0/a;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lx0/x$c;

    .line 20
    .line 21
    invoke-interface {v1, p0, p1}, Lx0/x$c;->a(Lx0/x;Ld0/I;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public abstract B()V
.end method

.method public final c(Lx0/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->c:Lx0/E$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/E$a;->B(Lx0/E;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lx0/x$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iget-object v1, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lx0/a;->v()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final g(Lx0/x$c;Li0/y;Ll0/y1;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lx0/a;->e:Landroid/os/Looper;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 15
    :goto_1
    invoke-static {v1}, Lg0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Lx0/a;->g:Ll0/y1;

    .line 19
    .line 20
    iget-object p3, p0, Lx0/a;->f:Ld0/I;

    .line 21
    .line 22
    iget-object v1, p0, Lx0/a;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lx0/a;->e:Landroid/os/Looper;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iput-object v0, p0, Lx0/a;->e:Landroid/os/Looper;

    .line 32
    .line 33
    iget-object p3, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lx0/a;->z(Li0/y;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    if-eqz p3, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lx0/a;->n(Lx0/x$c;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0, p3}, Lx0/x$c;->a(Lx0/x;Ld0/I;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_2
    return-void
.end method

.method public synthetic i()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lx0/w;->b(Lx0/x;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public synthetic j()Ld0/I;
    .locals 1

    .line 1
    invoke-static {p0}, Lx0/w;->a(Lx0/x;)Ld0/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final k(Landroid/os/Handler;Lp0/v;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lx0/a;->d:Lp0/v$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lp0/v$a;->g(Landroid/os/Handler;Lp0/v;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic l(Ld0/u;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx0/w;->c(Lx0/x;Ld0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m(Lx0/x$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx0/a;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lx0/a;->e:Landroid/os/Looper;

    .line 16
    .line 17
    iput-object p1, p0, Lx0/a;->f:Ld0/I;

    .line 18
    .line 19
    iput-object p1, p0, Lx0/a;->g:Ll0/y1;

    .line 20
    .line 21
    iget-object p1, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lx0/a;->B()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lx0/a;->d(Lx0/x$c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
.end method

.method public final n(Lx0/x$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lx0/a;->w()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final o(Lp0/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->d:Lp0/v$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp0/v$a;->t(Lp0/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p(Landroid/os/Handler;Lx0/E;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lx0/a;->c:Lx0/E$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/E$a;->g(Landroid/os/Handler;Lx0/E;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(ILx0/x$b;)Lp0/v$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->d:Lp0/v$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lp0/v$a;->u(ILx0/x$b;)Lp0/v$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final s(Lx0/x$b;)Lp0/v$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a;->d:Lp0/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Lp0/v$a;->u(ILx0/x$b;)Lp0/v$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final t(ILx0/x$b;)Lx0/E$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->c:Lx0/E$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx0/E$a;->E(ILx0/x$b;)Lx0/E$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final u(Lx0/x$b;)Lx0/E$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a;->c:Lx0/E$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Lx0/E$a;->E(ILx0/x$b;)Lx0/E$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w()V
    .locals 0

    .line 1
    return-void
.end method

.method public final x()Ll0/y1;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->g:Ll0/y1;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll0/y1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public abstract z(Li0/y;)V
.end method

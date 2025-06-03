.class public final Li9/w;
.super Le9/a;
.source "SourceFile"


# instance fields
.field public final b:Ld2/h0;

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Li9/s;

.field public final f:Li9/z;

.field public final g:Ld5/n;

.field public final h:Li9/y;

.field public i:Li9/f0;

.field public j:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Le9/a;-><init>()V

    new-instance v0, Ld2/h0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ld2/h0;-><init>(I)V

    iput-object v0, p0, Li9/w;->b:Ld2/h0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li9/w;->c:Ljava/util/HashMap;

    new-instance v0, Li9/s;

    invoke-direct {v0}, Li9/s;-><init>()V

    iput-object v0, p0, Li9/w;->e:Li9/s;

    new-instance v0, Li9/z;

    invoke-direct {v0, p0}, Li9/z;-><init>(Li9/w;)V

    iput-object v0, p0, Li9/w;->f:Li9/z;

    new-instance v0, Ld5/n;

    invoke-direct {v0}, Ld5/n;-><init>()V

    iput-object v0, p0, Li9/w;->g:Ld5/n;

    new-instance v0, Li9/y;

    invoke-direct {v0}, Li9/y;-><init>()V

    iput-object v0, p0, Li9/w;->h:Li9/y;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li9/w;->d:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    iget-boolean v0, p0, Li9/w;->j:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MemoryPersistence shutdown without start"

    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-boolean v1, p0, Li9/w;->j:Z

    return-void
.end method

.method public final B()V
    .locals 4

    iget-boolean v0, p0, Li9/w;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "MemoryPersistence double-started!"

    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-boolean v1, p0, Li9/w;->j:Z

    return-void
.end method

.method public final j()Li9/a;
    .locals 1

    iget-object v0, p0, Li9/w;->g:Ld5/n;

    return-object v0
.end method

.method public final k(Le9/e;)Li9/b;
    .locals 2

    iget-object v0, p0, Li9/w;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/r;

    if-nez v0, :cond_0

    new-instance v0, Li9/r;

    invoke-direct {v0}, Li9/r;-><init>()V

    iget-object v1, p0, Li9/w;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final l()Li9/d;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Ld2/h0;

    return-object v0
.end method

.method public final m(Le9/e;)Li9/f;
    .locals 0

    iget-object p1, p0, Li9/w;->e:Li9/s;

    return-object p1
.end method

.method public final n(Le9/e;Li9/f;)Li9/a0;
    .locals 1

    iget-object p2, p0, Li9/w;->c:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li9/v;

    if-nez p2, :cond_0

    new-instance p2, Li9/v;

    invoke-direct {p2, p0}, Li9/v;-><init>(Li9/w;)V

    iget-object v0, p0, Li9/w;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final o()Li9/b0;
    .locals 1

    new-instance v0, Leb/y;

    invoke-direct {v0}, Leb/y;-><init>()V

    return-object v0
.end method

.method public final p()Li9/f0;
    .locals 1

    iget-object v0, p0, Li9/w;->i:Li9/f0;

    return-object v0
.end method

.method public final q()Li9/g0;
    .locals 1

    iget-object v0, p0, Li9/w;->h:Li9/y;

    return-object v0
.end method

.method public final r()Li9/l1;
    .locals 1

    iget-object v0, p0, Li9/w;->f:Li9/z;

    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Li9/w;->j:Z

    return v0
.end method

.method public final x(Ljava/lang/String;Ln9/l;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ln9/l<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object p1, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p1}, Li9/f0;->f()V

    :try_start_0
    invoke-interface {p2}, Ln9/l;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p2}, Li9/f0;->d()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p2}, Li9/f0;->d()V

    throw p1
.end method

.method public final y(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p1}, Li9/f0;->f()V

    :try_start_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p1}, Li9/f0;->d()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Li9/w;->i:Li9/f0;

    invoke-interface {p2}, Li9/f0;->d()V

    throw p1
.end method

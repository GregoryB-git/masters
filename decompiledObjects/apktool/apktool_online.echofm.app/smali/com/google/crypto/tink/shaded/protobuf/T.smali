.class public final Lcom/google/crypto/tink/shaded/protobuf/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/e0;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/O;

.field public final b:Lcom/google/crypto/tink/shaded/protobuf/k0;

.field public final c:Z

.field public final d:Lcom/google/crypto/tink/shaded/protobuf/q;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/O;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->e(Lcom/google/crypto/tink/shaded/protobuf/O;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->c:Z

    iput-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    iput-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->a:Lcom/google/crypto/tink/shaded/protobuf/O;

    return-void
.end method

.method private k(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->i(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private l(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 9

    .line 1
    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v8

    :goto_0
    :try_start_0
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/d0;->p()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    move-object v0, p0

    move-object v1, p4

    move-object v2, p5

    move-object v3, p2

    move-object v4, v8

    move-object v5, p1

    move-object v6, v7

    :try_start_1
    invoke-virtual/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/T;->n(Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/k0;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
.end method

.method public static m(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/O;)Lcom/google/crypto/tink/shaded/protobuf/T;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/T;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/T;-><init>(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/O;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->F(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g0;->D(Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->e()Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public e(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-direct {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/T;->k(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->b()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->a:Lcom/google/crypto/tink/shaded/protobuf/O;

    instance-of v1, v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->J()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/O;->d()Lcom/google/crypto/tink/shaded/protobuf/O$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/O$a;->c()Lcom/google/crypto/tink/shaded/protobuf/O;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$a;)V
    .locals 0

    .line 1
    move-object p2, p1

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget-object p3, p2, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->c()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p4

    if-ne p3, p4, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->k()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p3

    iput-object p3, p2, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    :cond_0
    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->f()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/T;->o(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/T;->l(Lcom/google/crypto/tink/shaded/protobuf/k0;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/d0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->e()I

    move-result v0

    sget v1, Lcom/google/crypto/tink/shaded/protobuf/q0;->a:I

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->b(I)I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->a:Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->a(I)I

    move-result v0

    invoke-virtual {p3, p2, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/O;I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->h(Lcom/google/crypto/tink/shaded/protobuf/d0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return v2

    :cond_0
    invoke-virtual {p5, p6, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->y()Z

    move-result p1

    return p1

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    move v3, v1

    move-object v1, v0

    :cond_3
    :goto_0
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->p()I

    move-result v4

    const v5, 0x7fffffff

    if-ne v4, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->e()I

    move-result v4

    sget v5, Lcom/google/crypto/tink/shaded/protobuf/q0;->c:I

    if-ne v4, v5, :cond_5

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->w()I

    move-result v3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/T;->a:Lcom/google/crypto/tink/shaded/protobuf/O;

    invoke-virtual {p3, p2, v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/O;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_5
    sget v5, Lcom/google/crypto/tink/shaded/protobuf/q0;->d:I

    if-ne v4, v5, :cond_7

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->h(Lcom/google/crypto/tink/shaded/protobuf/d0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    goto :goto_0

    :cond_6
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->u()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    goto :goto_0

    :cond_7
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->y()Z

    move-result v4

    if-nez v4, :cond_3

    :goto_1
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->e()I

    move-result p1

    sget v4, Lcom/google/crypto/tink/shaded/protobuf/q0;->b:I

    if-ne p1, v4, :cond_a

    if-eqz v1, :cond_9

    if-eqz v0, :cond_8

    invoke-virtual {p3, v1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->i(Lcom/google/crypto/tink/shaded/protobuf/h;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p5, p6, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/h;)V

    :cond_9
    :goto_2
    return v2

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->b()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p1

    throw p1
.end method

.method public final o(Lcom/google/crypto/tink/shaded/protobuf/k0;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k0;->s(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.class public final Ls0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/b1;


# instance fields
.field public final a:Ls0/h;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Ls0/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ls0/i;->d:I

    sget-object v0, Ls0/x;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Ls0/i;->a:Ls0/h;

    iput-object p0, p1, Ls0/h;->d:Ls0/i;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A()I
    .locals 2

    iget v0, p0, Ls0/i;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Ls0/i;->b:I

    const/4 v0, 0x0

    iput v0, p0, Ls0/i;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iput v0, p0, Ls0/i;->b:I

    :goto_0
    iget v0, p0, Ls0/i;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, Ls0/i;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final B(Ls0/c1;Ls0/n;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    invoke-virtual {p0, p1, p2}, Ls0/i;->P(Ls0/c1;Ls0/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls0/i;->R(Ljava/util/List;Z)V

    return-void
.end method

.method public final D(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls0/i;->R(Ljava/util/List;Z)V

    return-void
.end method

.method public final E()Ls0/g;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->g()Ls0/g$e;

    move-result-object v0

    return-object v0
.end method

.method public final F(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/t;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ls0/t;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->l()F

    move-result p1

    invoke-virtual {v0, p1}, Ls0/t;->h(F)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->l()F

    move-result p1

    invoke-virtual {v0, p1}, Ls0/t;->h(F)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->l()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Ls0/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->l()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final G()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->m()I

    move-result v0

    return v0
.end method

.method public final H()Z
    .locals 2

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ls0/i;->b:I

    iget v1, p0, Ls0/i;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1, v0}, Ls0/h;->x(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I()I
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->o()I

    move-result v0

    return v0
.end method

.method public final J(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls0/g;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Ls0/i;->E()Ls0/g;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Ls0/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1
.end method

.method public final K(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/l;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/l;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->h()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/l;->h(D)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->h()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/l;->h(D)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->h()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->h()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final L()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final N(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/f0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/f0;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->k()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->k()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->k()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final O(Ls0/n1;Ljava/lang/Class;Ls0/n;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/n1;",
            "Ljava/lang/Class<",
            "*>;",
            "Ls0/n;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 9
    .line 10
    const-string p2, "unsupported field type."

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1

    .line 16
    :pswitch_1
    invoke-virtual {p0}, Ls0/i;->w()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :pswitch_2
    invoke-virtual {p0}, Ls0/i;->v()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :pswitch_3
    invoke-virtual {p0}, Ls0/i;->l()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_4
    invoke-virtual {p0}, Ls0/i;->I()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :pswitch_5
    invoke-virtual {p0}, Ls0/i;->t()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_6
    invoke-virtual {p0}, Ls0/i;->n()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_7
    invoke-virtual {p0}, Ls0/i;->E()Ls0/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_8
    const/4 p1, 0x2

    .line 76
    invoke-virtual {p0, p1}, Ls0/i;->T(I)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Ls0/y0;->c:Ls0/y0;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ls0/y0;->a(Ljava/lang/Class;)Ls0/c1;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1, p3}, Ls0/i;->Q(Ls0/c1;Ls0/n;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_9
    invoke-virtual {p0}, Ls0/i;->M()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_a
    invoke-virtual {p0}, Ls0/i;->k()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :pswitch_b
    invoke-virtual {p0}, Ls0/i;->j()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_c
    invoke-virtual {p0}, Ls0/i;->d()J

    .line 114
    .line 115
    .line 116
    move-result-wide p1

    .line 117
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_d
    invoke-virtual {p0}, Ls0/i;->G()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_e
    invoke-virtual {p0}, Ls0/i;->c()J

    .line 132
    .line 133
    .line 134
    move-result-wide p1

    .line 135
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    :pswitch_f
    invoke-virtual {p0}, Ls0/i;->L()J

    .line 141
    .line 142
    .line 143
    move-result-wide p1

    .line 144
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :pswitch_10
    invoke-virtual {p0}, Ls0/i;->readFloat()F

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1

    .line 158
    :pswitch_11
    invoke-virtual {p0}, Ls0/i;->readDouble()D

    .line 159
    .line 160
    .line 161
    move-result-wide p1

    .line 162
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final P(Ls0/c1;Ls0/n;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")TT;"
        }
    .end annotation

    iget v0, p0, Ls0/i;->c:I

    iget v1, p0, Ls0/i;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ls0/i;->c:I

    :try_start_0
    invoke-interface {p1}, Ls0/c1;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Ls0/c1;->i(Ljava/lang/Object;Ls0/b1;Ls0/n;)V

    invoke-interface {p1, v1}, Ls0/c1;->b(Ljava/lang/Object;)V

    iget p1, p0, Ls0/i;->b:I

    iget p2, p0, Ls0/i;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Ls0/i;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Ls0/y;->e()Ls0/y;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Ls0/i;->c:I

    throw p1
.end method

.method public final Q(Ls0/c1;Ls0/n;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls0/h;->v()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    .line 8
    .line 9
    iget v2, v1, Ls0/h;->a:I

    .line 10
    .line 11
    iget v3, v1, Ls0/h;->b:I

    .line 12
    .line 13
    if-ge v2, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ls0/h;->e(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p1}, Ls0/c1;->f()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Ls0/i;->a:Ls0/h;

    .line 24
    .line 25
    iget v3, v2, Ls0/h;->a:I

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    iput v3, v2, Ls0/h;->a:I

    .line 30
    .line 31
    invoke-interface {p1, v1, p0, p2}, Ls0/c1;->i(Ljava/lang/Object;Ls0/b1;Ls0/n;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v1}, Ls0/c1;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-virtual {p1, p2}, Ls0/h;->a(I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    .line 44
    .line 45
    iget p2, p1, Ls0/h;->a:I

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    iput p2, p1, Ls0/h;->a:I

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ls0/h;->d(I)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_0
    new-instance p1, Ls0/y;

    .line 56
    .line 57
    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ls0/y;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final R(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, Ls0/d0;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, Ls0/d0;

    :cond_0
    invoke-virtual {p0}, Ls0/i;->E()Ls0/g;

    move-result-object p1

    invoke-interface {v0, p1}, Ls0/d0;->w(Ls0/g;)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget p2, p0, Ls0/i;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Ls0/i;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ls0/i;->z()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Ls0/i;->d:I

    return-void

    :cond_5
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1
.end method

.method public final S(I)V
    .locals 1

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ls0/y;->f()Ls0/y;

    move-result-object p1

    throw p1
.end method

.method public final T(I)V
    .locals 1

    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1
.end method

.method public final U(I)V
    .locals 0

    and-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ls0/y;->e()Ls0/y;

    move-result-object p1

    throw p1
.end method

.method public final V(I)V
    .locals 0

    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ls0/y;->e()Ls0/y;

    move-result-object p1

    throw p1
.end method

.method public final a(Ljava/util/Map;Ls0/h0$a;Ls0/n;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Ls0/h0$a<",
            "TK;TV;>;",
            "Ls0/n;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->v()I

    move-result v1

    iget-object v2, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v2, v1}, Ls0/h;->e(I)I

    move-result v1

    iget-object v2, p2, Ls0/h0$a;->b:Ljava/lang/Object;

    iget-object v3, p2, Ls0/h0$a;->d:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ls0/i;->A()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_5

    iget-object v5, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v5}, Ls0/h;->c()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_3

    if-eq v4, v0, :cond_2

    :try_start_1
    invoke-virtual {p0}, Ls0/i;->H()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Ls0/y;

    invoke-direct {v4, v6}, Ls0/y;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object v4, p2, Ls0/h0$a;->c:Ls0/n1;

    iget-object v5, p2, Ls0/h0$a;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p0, v4, v5, p3}, Ls0/i;->O(Ls0/n1;Ljava/lang/Class;Ls0/n;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    iget-object v4, p2, Ls0/h0$a;->a:Ls0/n1;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v5}, Ls0/i;->O(Ls0/n1;Ljava/lang/Class;Ls0/n;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ls0/y$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, Ls0/i;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ls0/y;

    invoke-direct {p1, v6}, Ls0/y;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1, v1}, Ls0/h;->d(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p2, v1}, Ls0/h;->d(I)V

    throw p1
.end method

.method public final b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final c()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Ls0/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/f0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/f0;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->r()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final g(Ljava/util/List;Ls0/c1;Ls0/n;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")V"
        }
    .end annotation

    .line 1
    iget v0, p0, Ls0/i;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-ne v1, v2, :cond_3

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p2, p3}, Ls0/i;->P(Ls0/c1;Ls0/n;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    .line 16
    .line 17
    invoke-virtual {v1}, Ls0/h;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    iget v1, p0, Ls0/i;->d:I

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    .line 29
    .line 30
    invoke-virtual {v1}, Ls0/h;->u()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_0

    .line 35
    .line 36
    iput v1, p0, Ls0/i;->d:I

    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void

    .line 39
    :cond_3
    sget p1, Ls0/y;->a:I

    .line 40
    .line 41
    new-instance p1, Ls0/y$a;

    .line 42
    .line 43
    invoke-direct {p1}, Ls0/y$a;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final i(Ljava/util/List;Ls0/c1;Ls0/n;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")V"
        }
    .end annotation

    .line 1
    iget v0, p0, Ls0/i;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v1, v2, :cond_3

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p2, p3}, Ls0/i;->Q(Ls0/c1;Ls0/n;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    .line 16
    .line 17
    invoke-virtual {v1}, Ls0/h;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    iget v1, p0, Ls0/i;->d:I

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    .line 29
    .line 30
    invoke-virtual {v1}, Ls0/h;->u()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_0

    .line 35
    .line 36
    iput v1, p0, Ls0/i;->d:I

    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void

    .line 39
    :cond_3
    sget p1, Ls0/y;->a:I

    .line 40
    .line 41
    new-instance p1, Ls0/y$a;

    .line 42
    .line 43
    invoke-direct {p1}, Ls0/y$a;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->j()I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->f()Z

    move-result v0

    return v0
.end method

.method public final l()J
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public final m(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/f0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/f0;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final n()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    return v0
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/f0;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/f0;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->n()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->n()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Ls0/i;->b:I

    return v0
.end method

.method public final q(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/f0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/f0;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->p()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls0/f0;->h(J)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->V(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final readDouble()D
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->h()D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat()F
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->l()F

    move-result v0

    return v0
.end method

.method public final s(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->i()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->i()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final t()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->i()I

    move-result v0

    return v0
.end method

.method public final u(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/w;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ls0/w;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_2
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ls0/w;->h(I)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->j()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Ls0/i;->d:I

    return-void

    :cond_8
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Ls0/i;->U(I)V

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->j()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final v()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->q()I

    move-result v0

    return v0
.end method

.method public final w()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final x(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Ls0/e;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ls0/e;

    iget p1, p0, Ls0/i;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->v()I

    move-result p1

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->f()Z

    move-result p1

    invoke-virtual {v0, p1}, Ls0/e;->h(Z)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->b()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->f()Z

    move-result p1

    invoke-virtual {v0, p1}, Ls0/e;->h(Z)V

    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {p1}, Ls0/h;->u()I

    move-result p1

    iget v1, p0, Ls0/i;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Ls0/i;->d:I

    return-void

    :cond_4
    iget v0, p0, Ls0/i;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->v()I

    move-result v0

    iget-object v1, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v1}, Ls0/h;->b()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->b()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v1}, Ls0/i;->S(I)V

    return-void

    :cond_6
    invoke-static {}, Ls0/y;->b()Ls0/y$a;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->u()I

    move-result v0

    iget v1, p0, Ls0/i;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Ls0/i;->d:I

    return-void
.end method

.method public final y(Ls0/c1;Ls0/n;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/c1<",
            "TT;>;",
            "Ls0/n;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    invoke-virtual {p0, p1, p2}, Ls0/i;->Q(Ls0/c1;Ls0/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ls0/i;->T(I)V

    iget-object v0, p0, Ls0/i;->a:Ls0/h;

    invoke-virtual {v0}, Ls0/h;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

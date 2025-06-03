.class public abstract Lx0/h;
.super Lx0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/h$b;,
        Lx0/h$a;
    }
.end annotation


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Li0/y;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lx0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic C(Lx0/h;Ljava/lang/Object;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/h;->I(Ljava/lang/Object;Lx0/x;Ld0/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public B()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lx0/h$b;

    .line 22
    .line 23
    iget-object v2, v1, Lx0/h$b;->a:Lx0/x;

    .line 24
    .line 25
    iget-object v3, v1, Lx0/h$b;->b:Lx0/x$c;

    .line 26
    .line 27
    invoke-interface {v2, v3}, Lx0/x;->m(Lx0/x$c;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lx0/h$b;->a:Lx0/x;

    .line 31
    .line 32
    iget-object v3, v1, Lx0/h$b;->c:Lx0/h$a;

    .line 33
    .line 34
    invoke-interface {v2, v3}, Lx0/x;->c(Lx0/E;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, Lx0/h$b;->a:Lx0/x;

    .line 38
    .line 39
    iget-object v1, v1, Lx0/h$b;->c:Lx0/h$a;

    .line 40
    .line 41
    invoke-interface {v2, v1}, Lx0/x;->o(Lp0/v;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final D(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lx0/h$b;

    .line 8
    .line 9
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lx0/h$b;

    .line 14
    .line 15
    iget-object v0, p1, Lx0/h$b;->a:Lx0/x;

    .line 16
    .line 17
    iget-object p1, p1, Lx0/h$b;->b:Lx0/x$c;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lx0/x;->d(Lx0/x$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final E(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lx0/h$b;

    .line 8
    .line 9
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lx0/h$b;

    .line 14
    .line 15
    iget-object v0, p1, Lx0/h$b;->a:Lx0/x;

    .line 16
    .line 17
    iget-object p1, p1, Lx0/h$b;->b:Lx0/x$c;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lx0/x;->n(Lx0/x$c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public abstract F(Ljava/lang/Object;Lx0/x$b;)Lx0/x$b;
.end method

.method public G(Ljava/lang/Object;JLx0/x$b;)J
    .locals 0

    .line 1
    return-wide p2
.end method

.method public abstract H(Ljava/lang/Object;I)I
.end method

.method public final synthetic I(Ljava/lang/Object;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx0/h;->J(Ljava/lang/Object;Lx0/x;Ld0/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract J(Ljava/lang/Object;Lx0/x;Ld0/I;)V
.end method

.method public final K(Ljava/lang/Object;Lx0/x;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lx0/g;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lx0/g;-><init>(Lx0/h;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lx0/h$a;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lx0/h$a;-><init>(Lx0/h;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance v3, Lx0/h$b;

    .line 25
    .line 26
    invoke-direct {v3, p2, v0, v1}, Lx0/h$b;-><init>(Lx0/x;Lx0/x$c;Lx0/h$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lx0/h;->i:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-interface {p2, p1, v1}, Lx0/x;->p(Landroid/os/Handler;Lx0/E;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lx0/h;->i:Landroid/os/Handler;

    .line 44
    .line 45
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/os/Handler;

    .line 50
    .line 51
    invoke-interface {p2, p1, v1}, Lx0/x;->k(Landroid/os/Handler;Lp0/v;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lx0/h;->j:Li0/y;

    .line 55
    .line 56
    invoke-virtual {p0}, Lx0/a;->x()Ll0/y1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {p2, v0, p1, v1}, Lx0/x;->g(Lx0/x$c;Li0/y;Ll0/y1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lx0/a;->y()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_0

    .line 68
    .line 69
    invoke-interface {p2, v0}, Lx0/x;->d(Lx0/x$c;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method

.method public final L(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lx0/h$b;

    .line 8
    .line 9
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lx0/h$b;

    .line 14
    .line 15
    iget-object v0, p1, Lx0/h$b;->a:Lx0/x;

    .line 16
    .line 17
    iget-object v1, p1, Lx0/h$b;->b:Lx0/x$c;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lx0/x;->m(Lx0/x$c;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lx0/h$b;->a:Lx0/x;

    .line 23
    .line 24
    iget-object v1, p1, Lx0/h$b;->c:Lx0/h$a;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lx0/x;->c(Lx0/E;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lx0/h$b;->a:Lx0/x;

    .line 30
    .line 31
    iget-object p1, p1, Lx0/h$b;->c:Lx0/h$a;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lx0/x;->o(Lp0/v;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lx0/h$b;

    .line 22
    .line 23
    iget-object v1, v1, Lx0/h$b;->a:Lx0/x;

    .line 24
    .line 25
    invoke-interface {v1}, Lx0/x;->h()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lx0/h$b;

    .line 22
    .line 23
    iget-object v2, v1, Lx0/h$b;->a:Lx0/x;

    .line 24
    .line 25
    iget-object v1, v1, Lx0/h$b;->b:Lx0/x$c;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Lx0/x;->d(Lx0/x$c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lx0/h$b;

    .line 22
    .line 23
    iget-object v2, v1, Lx0/h$b;->a:Lx0/x;

    .line 24
    .line 25
    iget-object v1, v1, Lx0/h$b;->b:Lx0/x$c;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Lx0/x;->n(Lx0/x$c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public z(Li0/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/h;->j:Li0/y;

    .line 2
    .line 3
    invoke-static {}, Lg0/M;->A()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lx0/h;->i:Landroid/os/Handler;

    .line 8
    .line 9
    return-void
.end method

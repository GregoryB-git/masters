.class public abstract Lp6/a;
.super Lp6/x0;
.source "SourceFile"

# interfaces
.implements Lp6/q0;
.implements LX5/d;
.implements Lp6/I;


# instance fields
.field public final q:LX5/g;


# direct methods
.method public constructor <init>(LX5/g;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lp6/x0;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p2, Lp6/q0;->n:Lp6/q0$b;

    .line 7
    .line 8
    invoke-interface {p1, p2}, LX5/g;->b(LX5/g$c;)LX5/g$b;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lp6/q0;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lp6/x0;->e0(Lp6/q0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1, p0}, LX5/g;->k(LX5/g;)LX5/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lp6/a;->q:LX5/g;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public G0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp6/x0;->F(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public H0(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public I0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final J0(Lp6/K;Ljava/lang/Object;Lg6/p;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p3, p2, p0}, Lp6/K;->e(Lg6/p;Ljava/lang/Object;LX5/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public N()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lp6/M;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " was cancelled"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public a()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lp6/x0;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final d0(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/a;->q:LX5/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp6/H;->a(LX5/g;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()LX5/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/a;->q:LX5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContext()LX5/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/a;->q:LX5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public l0()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lp6/a;->q:LX5/g;

    .line 2
    .line 3
    invoke-static {v0}, Lp6/E;->b(LX5/g;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lp6/x0;->l0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x22

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "\":"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, Lp6/x0;->l0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public final q0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lp6/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lp6/z;

    .line 6
    .line 7
    iget-object v0, p1, Lp6/z;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {p1}, Lp6/z;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, v0, p1}, Lp6/a;->H0(Ljava/lang/Throwable;Z)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lp6/a;->I0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1, v0, v1, v0}, Lp6/D;->d(Ljava/lang/Object;Lg6/l;ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lp6/x0;->j0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lp6/y0;->b:Lu6/F;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lp6/a;->G0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

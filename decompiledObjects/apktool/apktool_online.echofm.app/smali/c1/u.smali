.class public Lc1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# instance fields
.field public final a:LF0/r;

.field public final b:Lc1/t$a;

.field public c:Lc1/v;


# direct methods
.method public constructor <init>(LF0/r;Lc1/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1/u;->a:LF0/r;

    .line 5
    .line 6
    iput-object p2, p0, Lc1/u;->b:Lc1/t$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/u;->c:Lc1/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lc1/v;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lc1/u;->a:LF0/r;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3, p4}, LF0/r;->a(JJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b(LF0/t;)V
    .locals 2

    .line 1
    new-instance v0, Lc1/v;

    .line 2
    .line 3
    iget-object v1, p0, Lc1/u;->b:Lc1/t$a;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lc1/u;->c:Lc1/v;

    .line 9
    .line 10
    iget-object p1, p0, Lc1/u;->a:LF0/r;

    .line 11
    .line 12
    invoke-interface {p1, v0}, LF0/r;->b(LF0/t;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public d()LF0/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/u;->a:LF0/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/u;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF0/r;->e(LF0/s;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/u;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF0/r;->i(LF0/s;LF0/L;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/u;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0}, LF0/r;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

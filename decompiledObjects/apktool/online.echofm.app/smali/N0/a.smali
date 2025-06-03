.class public final LN0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# instance fields
.field public final a:LF0/r;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, LF0/O;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    const-string v1, "image/jpeg"

    .line 12
    .line 13
    const v2, 0xffd8

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v2, v0, v1}, LF0/O;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iput-object p1, p0, LN0/a;->a:LF0/r;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p1, LN0/b;

    .line 23
    .line 24
    invoke-direct {p1}, LN0/b;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/a;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LF0/r;->a(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LF0/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/a;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF0/r;->b(LF0/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LN0/a;->a:LF0/r;

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
    iget-object v0, p0, LN0/a;->a:LF0/r;

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
    iget-object v0, p0, LN0/a;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0}, LF0/r;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.class public Lu6/B;
.super Lp6/a;
.source "SourceFile"

# interfaces
.implements LZ5/e;


# instance fields
.field public final r:LX5/d;


# direct methods
.method public constructor <init>(LX5/g;LX5/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lp6/a;-><init>(LX5/g;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lu6/B;->r:LX5/d;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public F(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu6/B;->r:LX5/d;

    .line 2
    .line 3
    invoke-static {v0}, LY5/b;->b(LX5/d;)LX5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu6/B;->r:LX5/d;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lp6/D;->a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v0, p1, v1, v2, v1}, Lu6/k;->c(LX5/d;Ljava/lang/Object;Lg6/l;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public G0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu6/B;->r:LX5/d;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp6/D;->a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getCallerFrame()LZ5/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/B;->r:LX5/d;

    .line 2
    .line 3
    instance-of v1, v0, LZ5/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LZ5/e;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.class public abstract synthetic Lc1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lc1/t;[BII)Lc1/k;
    .locals 7

    .line 1
    invoke-static {}, LX2/v;->M()LX2/v$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lc1/t$b;->a()Lc1/t$b;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v6, Lc1/r;

    .line 13
    .line 14
    invoke-direct {v6, v0}, Lc1/r;-><init>(LX2/v$a;)V

    .line 15
    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move v3, p2

    .line 20
    move v4, p3

    .line 21
    invoke-interface/range {v1 .. v6}, Lc1/t;->c([BIILc1/t$b;Lg0/g;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Lc1/g;

    .line 25
    .line 26
    invoke-virtual {v0}, LX2/v$a;->k()LX2/v;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Lc1/g;-><init>(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public static b(Lc1/t;)V
    .locals 0

    .line 1
    return-void
.end method

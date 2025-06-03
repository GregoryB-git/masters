.class public abstract LX2/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/util/Comparator;)LX2/P;
    .locals 1

    .line 1
    instance-of v0, p0, LX2/P;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LX2/P;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LX2/m;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LX2/m;-><init>(Ljava/util/Comparator;)V

    .line 11
    .line 12
    .line 13
    move-object p0, v0

    .line 14
    :goto_0
    return-object p0
.end method

.method public static d()LX2/P;
    .locals 1

    .line 1
    sget-object v0, LX2/M;->o:LX2/M;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Comparator;)LX2/P;
    .locals 1

    .line 1
    new-instance v0, LX2/o;

    .line 2
    .line 3
    invoke-static {p1}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Comparator;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, LX2/o;-><init>(Ljava/util/Comparator;Ljava/util/Comparator;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public c(Ljava/lang/Iterable;)LX2/v;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX2/v;->g0(Ljava/util/Comparator;Ljava/lang/Iterable;)LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method

.method public e()LX2/P;
    .locals 1

    .line 1
    invoke-static {}, LX2/G;->e()LW2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, LX2/P;->f(LW2/g;)LX2/P;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public f(LW2/g;)LX2/P;
    .locals 1

    .line 1
    new-instance v0, LX2/h;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LX2/h;-><init>(LW2/g;LX2/P;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public g()LX2/P;
    .locals 1

    .line 1
    new-instance v0, LX2/X;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX2/X;-><init>(LX2/P;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

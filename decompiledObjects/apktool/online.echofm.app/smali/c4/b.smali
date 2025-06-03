.class public abstract Lc4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/d;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lc4/d$a;


# direct methods
.method public constructor <init>(Lc4/d$a;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lc4/b;->a:Ljava/util/Set;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    iput-object p2, p0, Lc4/b;->a:Ljava/util/Set;

    .line 16
    .line 17
    :goto_0
    iput-object p1, p0, Lc4/b;->b:Lc4/d$a;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(Lc4/d$a;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lc4/b;->g(Lc4/d$a;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p5}, Lc4/b;->c(Lc4/d$a;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    sget-object p4, Lc4/b$a;->a:[I

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    aget p1, p4, p1

    .line 18
    .line 19
    const/4 p4, 0x1

    .line 20
    if-eq p1, p4, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x2

    .line 23
    if-eq p1, p4, :cond_2

    .line 24
    .line 25
    const/4 p4, 0x3

    .line 26
    if-eq p1, p4, :cond_1

    .line 27
    .line 28
    const/4 p4, 0x4

    .line 29
    if-ne p1, p4, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p2, p3}, Lc4/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    const-string p2, "Should not reach here!"

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    invoke-virtual {p0, p2, p3}, Lc4/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0, p2, p3}, Lc4/b;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p0, p2, p3}, Lc4/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    :goto_0
    return-void
.end method

.method public b()Lc4/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/b;->b:Lc4/d$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract c(Lc4/d$a;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public g(Lc4/d$a;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lc4/b;->b:Lc4/d$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lc4/b;->a:Ljava/util/Set;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sget-object v0, Lc4/d$a;->o:Lc4/d$a;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-gt p1, v0, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lc4/b;->a:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 p1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    :goto_0
    return p1
.end method

.method public abstract h(Ljava/lang/String;Ljava/lang/String;)V
.end method

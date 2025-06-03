.class public final Lg9/b;
.super Lg9/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj9/l;Lka/d0;)V
    .locals 1

    sget-object v0, Lg9/l$a;->q:Lg9/l$a;

    invoke-direct {p0, p1, v0, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    invoke-static {p2}, Lj9/s;->h(Lka/d0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "ArrayContainsAnyFilter expects an ArrayValue"

    invoke-static {v0, p1, p2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(Lj9/g;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/l;->c:Lj9/l;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lj9/s;->h(Lka/d0;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lka/d0;->R()Lka/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lka/b;->h()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lka/d0;

    .line 38
    .line 39
    iget-object v2, p0, Lg9/l;->b:Lka/d0;

    .line 40
    .line 41
    invoke-virtual {v2}, Lka/d0;->R()Lka/b;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2, v0}, Lj9/s;->f(Lka/c;Lka/d0;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_2
    return v1
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
.end method

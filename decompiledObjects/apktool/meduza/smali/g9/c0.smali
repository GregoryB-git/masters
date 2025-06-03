.class public final Lg9/c0;
.super Lg9/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj9/l;Lka/d0;)V
    .locals 1

    sget-object v0, Lg9/l$a;->s:Lg9/l$a;

    invoke-direct {p0, p1, v0, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    invoke-static {p2}, Lj9/s;->h(Lka/d0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "NotInFilter expects an ArrayValue"

    invoke-static {v0, p1, p2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(Lj9/g;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lka/d0;->R()Lka/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lj9/s;->b:Lka/d0;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lj9/s;->f(Lka/c;Lka/d0;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lg9/l;->c:Lj9/l;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lj9/g;->g(Lj9/l;)Lka/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    .line 26
    .line 27
    invoke-virtual {v0}, Lka/d0;->R()Lka/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p1}, Lj9/s;->f(Lka/c;Lka/d0;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    :cond_1
    return v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

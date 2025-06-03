.class public final Lg9/v;
.super Lg9/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj9/l;Lka/d0;)V
    .locals 1

    sget-object v0, Lg9/l$a;->r:Lg9/l$a;

    invoke-direct {p0, p1, v0, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    invoke-static {p2}, Lj9/s;->h(Lka/d0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "InFilter expects an ArrayValue"

    invoke-static {v0, p1, p2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(Lj9/g;)Z
    .locals 1

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
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lg9/l;->b:Lka/d0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lka/d0;->R()Lka/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Lj9/s;->f(Lka/c;Lka/d0;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    return p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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

.class public final Lnc/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLwb/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lrb/h;->a:Lrb/h;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lnc/l;

    .line 11
    .line 12
    invoke-static {p2}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1, p2}, Lnc/l;-><init>(ILub/e;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lnc/l;->t()V

    .line 21
    .line 22
    .line 23
    const-wide v1, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p2, p0, v1

    .line 29
    .line 30
    if-gez p2, :cond_1

    .line 31
    .line 32
    iget-object p2, v0, Lnc/l;->e:Lub/h;

    .line 33
    .line 34
    invoke-static {p2}, Lnc/m0;->b(Lub/h;)Lnc/l0;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p2, p0, p1, v0}, Lnc/l0;->f(JLnc/l;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Lnc/l;->s()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p1, Lvb/a;->a:Lvb/a;

    .line 46
    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    sget-object p0, Lrb/h;->a:Lrb/h;

    .line 51
    .line 52
    return-object p0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static final b(Lub/h;)Lnc/l0;
    .locals 1

    sget v0, Lub/f;->n:I

    sget-object v0, Lub/f$a;->a:Lub/f$a;

    invoke-interface {p0, v0}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object p0

    instance-of v0, p0, Lnc/l0;

    if-eqz v0, :cond_0

    check-cast p0, Lnc/l0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lnc/i0;->a:Lnc/l0;

    :cond_1
    return-object p0
.end method

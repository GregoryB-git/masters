.class public final LH0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH0/a;


# instance fields
.field public final a:LX2/v;

.field public final b:I


# direct methods
.method public constructor <init>(ILX2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LH0/f;->b:I

    .line 5
    .line 6
    iput-object p2, p0, LH0/f;->a:LX2/v;

    .line 7
    .line 8
    return-void
.end method

.method public static b(IILg0/z;)LH0/a;
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :sswitch_0
    invoke-static {p2}, LH0/h;->b(Lg0/z;)LH0/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_1
    invoke-static {p2}, LH0/d;->d(Lg0/z;)LH0/d;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :sswitch_2
    invoke-static {p2}, LH0/c;->c(Lg0/z;)LH0/c;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :sswitch_3
    invoke-static {p1, p2}, LH0/g;->e(ILg0/z;)LH0/a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch
.end method

.method public static d(ILg0/z;)LH0/f;
    .locals 7

    .line 1
    new-instance v0, LX2/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x2

    .line 11
    :goto_0
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    if-le v3, v4, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    add-int/2addr v5, v4

    .line 32
    invoke-virtual {p1, v5}, Lg0/z;->S(I)V

    .line 33
    .line 34
    .line 35
    const v4, 0x5453494c

    .line 36
    .line 37
    .line 38
    if-ne v3, v4, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Lg0/z;->t()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3, p1}, LH0/f;->d(ILg0/z;)LH0/f;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {v3, v2, p1}, LH0/f;->b(IILg0/z;)LH0/a;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_1
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-interface {v3}, LH0/a;->a()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const v6, 0x68727473

    .line 60
    .line 61
    .line 62
    if-ne v4, v6, :cond_1

    .line 63
    .line 64
    move-object v2, v3

    .line 65
    check-cast v2, LH0/d;

    .line 66
    .line 67
    invoke-virtual {v2}, LH0/d;->c()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    :cond_1
    invoke-virtual {v0, v3}, LX2/v$a;->h(Ljava/lang/Object;)LX2/v$a;

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p1, v5}, Lg0/z;->T(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Lg0/z;->S(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    new-instance p1, LH0/f;

    .line 82
    .line 83
    invoke-virtual {v0}, LX2/v$a;->k()LX2/v;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, p0, v0}, LH0/f;-><init>(ILX2/v;)V

    .line 88
    .line 89
    .line 90
    return-object p1
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LH0/f;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public c(Ljava/lang/Class;)LH0/a;
    .locals 3

    .line 1
    iget-object v0, p0, LH0/f;->a:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/v;->q()LX2/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LH0/a;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-ne v2, p1, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

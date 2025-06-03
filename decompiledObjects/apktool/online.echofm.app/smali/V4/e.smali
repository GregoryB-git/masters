.class public final LV4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV4/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;LV4/a;IILjava/util/Map;)LY4/b;
    .locals 7

    .line 1
    sget-object v0, LV4/e$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string p3, "No encoder available for format "

    .line 19
    .line 20
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_0
    new-instance v0, LW4/a;

    .line 29
    .line 30
    invoke-direct {v0}, LW4/a;-><init>()V

    .line 31
    .line 32
    .line 33
    :goto_0
    move-object v1, v0

    .line 34
    goto :goto_1

    .line 35
    :pswitch_1
    new-instance v0, La5/a;

    .line 36
    .line 37
    invoke-direct {v0}, La5/a;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_2
    new-instance v0, Lc5/b;

    .line 42
    .line 43
    invoke-direct {v0}, Lc5/b;-><init>()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_3
    new-instance v0, Ld5/a;

    .line 48
    .line 49
    invoke-direct {v0}, Ld5/a;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_4
    new-instance v0, Lc5/l;

    .line 54
    .line 55
    invoke-direct {v0}, Lc5/l;-><init>()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_5
    new-instance v0, Lc5/d;

    .line 60
    .line 61
    invoke-direct {v0}, Lc5/d;-><init>()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_6
    new-instance v0, Lc5/h;

    .line 66
    .line 67
    invoke-direct {v0}, Lc5/h;-><init>()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_7
    new-instance v0, Lc5/f;

    .line 72
    .line 73
    invoke-direct {v0}, Lc5/f;-><init>()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_8
    new-instance v0, Lf5/a;

    .line 78
    .line 79
    invoke-direct {v0}, Lf5/a;-><init>()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_9
    new-instance v0, Lc5/o;

    .line 84
    .line 85
    invoke-direct {v0}, Lc5/o;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_a
    new-instance v0, Lc5/j;

    .line 90
    .line 91
    invoke-direct {v0}, Lc5/j;-><init>()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_b
    new-instance v0, Lc5/s;

    .line 96
    .line 97
    invoke-direct {v0}, Lc5/s;-><init>()V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_c
    new-instance v0, Lc5/k;

    .line 102
    .line 103
    invoke-direct {v0}, Lc5/k;-><init>()V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :goto_1
    move-object v2, p1

    .line 108
    move-object v3, p2

    .line 109
    move v4, p3

    .line 110
    move v5, p4

    .line 111
    move-object v6, p5

    .line 112
    invoke-interface/range {v1 .. v6}, LV4/g;->a(Ljava/lang/String;LV4/a;IILjava/util/Map;)LY4/b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lc4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/o$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Lc4/o$a;

.field public final l:Lp4/a;


# direct methods
.method public constructor <init>(IIIIIIIJLc4/o$a;Lp4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc4/o;->a:I

    iput p2, p0, Lc4/o;->b:I

    iput p3, p0, Lc4/o;->c:I

    iput p4, p0, Lc4/o;->d:I

    iput p5, p0, Lc4/o;->e:I

    invoke-static {p5}, Lc4/o;->d(I)I

    move-result p1

    iput p1, p0, Lc4/o;->f:I

    iput p6, p0, Lc4/o;->g:I

    iput p7, p0, Lc4/o;->h:I

    invoke-static {p7}, Lc4/o;->a(I)I

    move-result p1

    iput p1, p0, Lc4/o;->i:I

    iput-wide p8, p0, Lc4/o;->j:J

    iput-object p10, p0, Lc4/o;->k:Lc4/o$a;

    iput-object p11, p0, Lc4/o;->l:Lp4/a;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/t;

    .line 1
    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lv5/t;-><init>([BI)V

    mul-int/lit8 p2, p2, 0x8

    .line 2
    invoke-virtual {v0, p2}, Lv5/t;->k(I)V

    const/16 p1, 0x10

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p2

    iput p2, p0, Lc4/o;->a:I

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    iput p1, p0, Lc4/o;->b:I

    const/16 p1, 0x18

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p2

    iput p2, p0, Lc4/o;->c:I

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    iput p1, p0, Lc4/o;->d:I

    const/16 p1, 0x14

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    iput p1, p0, Lc4/o;->e:I

    invoke-static {p1}, Lc4/o;->d(I)I

    move-result p1

    iput p1, p0, Lc4/o;->f:I

    const/4 p1, 0x3

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc4/o;->g:I

    const/4 p1, 0x5

    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lc4/o;->h:I

    invoke-static {p1}, Lc4/o;->a(I)I

    move-result p1

    iput p1, p0, Lc4/o;->i:I

    const/4 p1, 0x4

    .line 3
    invoke-virtual {v0, p1}, Lv5/t;->g(I)I

    move-result p1

    const/16 p2, 0x20

    invoke-virtual {v0, p2}, Lv5/t;->g(I)I

    move-result v0

    sget v1, Lv5/e0;->a:I

    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    shl-long p1, v1, p2

    int-to-long v0, v0

    and-long/2addr v0, v3

    or-long/2addr p1, v0

    .line 4
    iput-wide p1, p0, Lc4/o;->j:J

    const/4 p1, 0x0

    iput-object p1, p0, Lc4/o;->k:Lc4/o$a;

    iput-object p1, p0, Lc4/o;->l:Lp4/a;

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_4

    const/16 v0, 0xc

    if-eq p0, v0, :cond_3

    const/16 v0, 0x10

    if-eq p0, v0, :cond_2

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x6

    return p0

    :cond_1
    const/4 p0, 0x5

    return p0

    :cond_2
    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x2

    return p0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static d(I)I
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, -0x1

    return p0

    :sswitch_0
    const/4 p0, 0x3

    return p0

    :sswitch_1
    const/4 p0, 0x2

    return p0

    :sswitch_2
    const/16 p0, 0xb

    return p0

    :sswitch_3
    const/4 p0, 0x1

    return p0

    :sswitch_4
    const/16 p0, 0xa

    return p0

    :sswitch_5
    const/16 p0, 0x9

    return p0

    :sswitch_6
    const/16 p0, 0x8

    return p0

    :sswitch_7
    const/4 p0, 0x7

    return p0

    :sswitch_8
    const/4 p0, 0x6

    return p0

    :sswitch_9
    const/4 p0, 0x5

    return p0

    :sswitch_a
    const/4 p0, 0x4

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final b()J
    .locals 4

    iget-wide v0, p0, Lc4/o;->j:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iget v2, p0, Lc4/o;->e:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public final c([BLp4/a;)Lv3/i0;
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, Lc4/o;->d:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    iget-object v1, p0, Lc4/o;->l:Lp4/a;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    if-nez p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget-object p2, p2, Lp4/a;->a:[Lp4/a$b;

    .line 21
    .line 22
    array-length v2, p2

    .line 23
    if-nez v2, :cond_3

    .line 24
    .line 25
    :goto_1
    move-object p2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_3
    new-instance v2, Lp4/a;

    .line 28
    .line 29
    iget-wide v3, v1, Lp4/a;->b:J

    .line 30
    .line 31
    iget-object v1, v1, Lp4/a;->a:[Lp4/a$b;

    .line 32
    .line 33
    sget v5, Lv5/e0;->a:I

    .line 34
    .line 35
    array-length v5, v1

    .line 36
    array-length v6, p2

    .line 37
    add-int/2addr v5, v6

    .line 38
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    array-length v1, v1

    .line 43
    array-length v6, p2

    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-static {p2, v7, v5, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    check-cast v5, [Lp4/a$b;

    .line 49
    .line 50
    invoke-direct {v2, v3, v4, v5}, Lp4/a;-><init>(J[Lp4/a$b;)V

    .line 51
    .line 52
    .line 53
    move-object p2, v2

    .line 54
    :goto_2
    new-instance v1, Lv3/i0$a;

    .line 55
    .line 56
    invoke-direct {v1}, Lv3/i0$a;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "audio/flac"

    .line 60
    .line 61
    iput-object v2, v1, Lv3/i0$a;->k:Ljava/lang/String;

    .line 62
    .line 63
    iput v0, v1, Lv3/i0$a;->l:I

    .line 64
    .line 65
    iget v0, p0, Lc4/o;->g:I

    .line 66
    .line 67
    iput v0, v1, Lv3/i0$a;->x:I

    .line 68
    .line 69
    iget v0, p0, Lc4/o;->e:I

    .line 70
    .line 71
    iput v0, v1, Lv3/i0$a;->y:I

    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, v1, Lv3/i0$a;->m:Ljava/util/List;

    .line 78
    .line 79
    iput-object p2, v1, Lv3/i0$a;->i:Lp4/a;

    .line 80
    .line 81
    new-instance p1, Lv3/i0;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 84
    .line 85
    .line 86
    return-object p1
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

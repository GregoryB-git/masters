.class public final Lka/z;
.super Lma/w;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/z$h;,
        Lka/z$g;,
        Lka/z$b;,
        Lka/z$i;,
        Lka/z$a;,
        Lka/z$f;,
        Lka/z$j;,
        Lka/z$e;,
        Lka/z$c;,
        Lka/z$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w<",
        "Lka/z;",
        "Lka/z$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lka/z;

.field public static final END_AT_FIELD_NUMBER:I = 0x8

.field public static final FROM_FIELD_NUMBER:I = 0x2

.field public static final LIMIT_FIELD_NUMBER:I = 0x5

.field public static final OFFSET_FIELD_NUMBER:I = 0x6

.field public static final ORDER_BY_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lma/b1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "Lka/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final SELECT_FIELD_NUMBER:I = 0x1

.field public static final START_AT_FIELD_NUMBER:I = 0x7

.field public static final WHERE_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private endAt_:Lka/j;

.field private from_:Lma/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/a0$d<",
            "Lka/z$b;",
            ">;"
        }
    .end annotation
.end field

.field private limit_:Lma/x;

.field private offset_:I

.field private orderBy_:Lma/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/a0$d<",
            "Lka/z$h;",
            ">;"
        }
    .end annotation
.end field

.field private select_:Lka/z$i;

.field private startAt_:Lka/j;

.field private where_:Lka/z$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka/z;

    invoke-direct {v0}, Lka/z;-><init>()V

    sput-object v0, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    const-class v1, Lka/z;

    invoke-static {v1, v0}, Lma/w;->D(Ljava/lang/Class;Lma/w;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lma/w;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lma/e1;->d:Lma/e1;

    .line 5
    .line 6
    iput-object v0, p0, Lka/z;->from_:Lma/a0$d;

    .line 7
    .line 8
    iput-object v0, p0, Lka/z;->orderBy_:Lma/a0$d;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static synthetic F()Lka/z;
    .locals 1

    sget-object v0, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    return-object v0
.end method

.method public static G(Lka/z;Lka/z$b;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lka/z;->from_:Lma/a0$d;

    .line 5
    .line 6
    invoke-interface {v0}, Lma/a0$d;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lma/w;->A(Lma/a0$d;)Lma/a0$d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lka/z;->from_:Lma/a0$d;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lka/z;->from_:Lma/a0$d;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
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

.method public static H(Lka/z;Lka/z$g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/z;->where_:Lka/z$g;

    iget p1, p0, Lka/z;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lka/z;->bitField0_:I

    return-void
.end method

.method public static I(Lka/z;Lka/z$h;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lka/z;->orderBy_:Lma/a0$d;

    .line 5
    .line 6
    invoke-interface {v0}, Lma/a0$d;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lma/w;->A(Lma/a0$d;)Lma/a0$d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lka/z;->orderBy_:Lma/a0$d;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lka/z;->orderBy_:Lma/a0$d;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
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

.method public static J(Lka/z;Lka/j;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/z;->startAt_:Lka/j;

    iget p1, p0, Lka/z;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lka/z;->bitField0_:I

    return-void
.end method

.method public static K(Lka/z;Lka/j;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/z;->endAt_:Lka/j;

    iget p1, p0, Lka/z;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lka/z;->bitField0_:I

    return-void
.end method

.method public static L(Lka/z;Lma/x;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/z;->limit_:Lma/x;

    iget p1, p0, Lka/z;->bitField0_:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lka/z;->bitField0_:I

    return-void
.end method

.method public static M()Lka/z;
    .locals 1

    sget-object v0, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    return-object v0
.end method

.method public static Z()Lka/z$a;
    .locals 1

    sget-object v0, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    invoke-virtual {v0}, Lma/w;->s()Lma/w$a;

    move-result-object v0

    check-cast v0, Lka/z$a;

    return-object v0
.end method


# virtual methods
.method public final N()Lka/j;
    .locals 1

    iget-object v0, p0, Lka/z;->endAt_:Lka/j;

    if-nez v0, :cond_0

    invoke-static {}, Lka/j;->J()Lka/j;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final O()Lka/z$b;
    .locals 2

    iget-object v0, p0, Lka/z;->from_:Lma/a0$d;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lka/z$b;

    return-object v0
.end method

.method public final P()I
    .locals 1

    iget-object v0, p0, Lka/z;->from_:Lma/a0$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final Q()Lma/x;
    .locals 1

    iget-object v0, p0, Lka/z;->limit_:Lma/x;

    if-nez v0, :cond_0

    invoke-static {}, Lma/x;->H()Lma/x;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final R(I)Lka/z$h;
    .locals 1

    iget-object v0, p0, Lka/z;->orderBy_:Lma/a0$d;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lka/z$h;

    return-object p1
.end method

.method public final S()I
    .locals 1

    iget-object v0, p0, Lka/z;->orderBy_:Lma/a0$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final T()Lka/j;
    .locals 1

    iget-object v0, p0, Lka/z;->startAt_:Lka/j;

    if-nez v0, :cond_0

    invoke-static {}, Lka/j;->J()Lka/j;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final U()Lka/z$g;
    .locals 1

    iget-object v0, p0, Lka/z;->where_:Lka/z$g;

    if-nez v0, :cond_0

    invoke-static {}, Lka/z$g;->K()Lka/z$g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final V()Z
    .locals 1

    iget v0, p0, Lka/z;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final W()Z
    .locals 1

    iget v0, p0, Lka/z;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final X()Z
    .locals 1

    iget v0, p0, Lka/z;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Y()Z
    .locals 1

    iget v0, p0, Lka/z;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t(Lma/w$f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :pswitch_0
    sget-object p1, Lka/z;->PARSER:Lma/b1;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-class v0, Lka/z;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    sget-object p1, Lka/z;->PARSER:Lma/b1;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lma/w$b;

    .line 27
    .line 28
    sget-object v1, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Lma/w$b;-><init>(Lma/w;)V

    .line 31
    .line 32
    .line 33
    sput-object p1, Lka/z;->PARSER:Lma/b1;

    .line 34
    .line 35
    :cond_0
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_0
    return-object p1

    .line 41
    :pswitch_1
    sget-object p1, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_2
    new-instance p1, Lka/z$a;

    .line 45
    .line 46
    invoke-direct {p1}, Lka/z$a;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_3
    new-instance p1, Lka/z;

    .line 51
    .line 52
    invoke-direct {p1}, Lka/z;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_4
    const/16 p1, 0xb

    .line 57
    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "bitField0_"

    .line 62
    .line 63
    aput-object v2, p1, v1

    .line 64
    .line 65
    const-string v1, "select_"

    .line 66
    .line 67
    aput-object v1, p1, v0

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    const-string v1, "from_"

    .line 71
    .line 72
    aput-object v1, p1, v0

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    const-class v1, Lka/z$b;

    .line 76
    .line 77
    aput-object v1, p1, v0

    .line 78
    .line 79
    const/4 v0, 0x4

    .line 80
    const-string v1, "where_"

    .line 81
    .line 82
    aput-object v1, p1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    const-string v1, "orderBy_"

    .line 86
    .line 87
    aput-object v1, p1, v0

    .line 88
    .line 89
    const/4 v0, 0x6

    .line 90
    const-class v1, Lka/z$h;

    .line 91
    .line 92
    aput-object v1, p1, v0

    .line 93
    .line 94
    const/4 v0, 0x7

    .line 95
    const-string v1, "limit_"

    .line 96
    .line 97
    aput-object v1, p1, v0

    .line 98
    .line 99
    const/16 v0, 0x8

    .line 100
    .line 101
    const-string v1, "offset_"

    .line 102
    .line 103
    aput-object v1, p1, v0

    .line 104
    .line 105
    const/16 v0, 0x9

    .line 106
    .line 107
    const-string v1, "startAt_"

    .line 108
    .line 109
    aput-object v1, p1, v0

    .line 110
    .line 111
    const/16 v0, 0xa

    .line 112
    .line 113
    const-string v1, "endAt_"

    .line 114
    .line 115
    aput-object v1, p1, v0

    .line 116
    .line 117
    const-string v0, "\u0000\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b\u0005\u1009\u0004\u0006\u0004\u0007\u1009\u0002\u0008\u1009\u0003"

    .line 118
    .line 119
    sget-object v1, Lka/z;->DEFAULT_INSTANCE:Lka/z;

    .line 120
    .line 121
    new-instance v2, Lma/f1;

    .line 122
    .line 123
    invoke-direct {v2, v1, v0, p1}, Lma/f1;-><init>(Lma/w;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object v2

    .line 127
    :pswitch_5
    const/4 p1, 0x0

    .line 128
    return-object p1

    .line 129
    :pswitch_6
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

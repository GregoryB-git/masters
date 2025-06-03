.class public final LF0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/m$a;
    }
.end annotation


# static fields
.field public static final r:[I

.field public static final s:LF0/m$a;

.field public static final t:LF0/m$a;


# instance fields
.field public b:Z

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:LX2/v;

.field public n:I

.field public o:Z

.field public p:Lc1/t$a;

.field public q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LF0/m;->r:[I

    .line 9
    .line 10
    new-instance v0, LF0/m$a;

    .line 11
    .line 12
    new-instance v1, LF0/k;

    .line 13
    .line 14
    invoke-direct {v1}, LF0/k;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, LF0/m$a;-><init>(LF0/m$a$a;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LF0/m;->s:LF0/m$a;

    .line 21
    .line 22
    new-instance v0, LF0/m$a;

    .line 23
    .line 24
    new-instance v1, LF0/l;

    .line 25
    .line 26
    invoke-direct {v1}, LF0/l;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LF0/m$a;-><init>(LF0/m$a$a;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LF0/m;->t:LF0/m$a;

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LF0/m;->k:I

    .line 6
    .line 7
    const v1, 0x1b8a0

    .line 8
    .line 9
    .line 10
    iput v1, p0, LF0/m;->n:I

    .line 11
    .line 12
    new-instance v1, Lc1/h;

    .line 13
    .line 14
    invoke-direct {v1}, Lc1/h;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, LF0/m;->p:Lc1/t$a;

    .line 18
    .line 19
    iput-boolean v0, p0, LF0/m;->o:Z

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic c()Ljava/lang/reflect/Constructor;
    .locals 1

    .line 1
    invoke-static {}, LF0/m;->f()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d()Ljava/lang/reflect/Constructor;
    .locals 1

    .line 1
    invoke-static {}, LF0/m;->g()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static f()Ljava/lang/reflect/Constructor;
    .locals 5

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    const-string v1, "androidx.media3.decoder.flac.FlacLibrary"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    new-array v3, v2, [Ljava/lang/Class;

    .line 11
    .line 12
    const-string v4, "isAvailable"

    .line 13
    .line 14
    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-array v3, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "androidx.media3.decoder.flac.FlacExtractor"

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-class v1, LF0/r;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x1

    .line 44
    new-array v1, v1, [Ljava/lang/Class;

    .line 45
    .line 46
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    aput-object v3, v1, v2

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_0
    return-object v4
.end method

.method public static g()Ljava/lang/reflect/Constructor;
    .locals 2

    .line 1
    const-string v0, "androidx.media3.decoder.midi.MidiExtractor"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, LF0/r;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    new-array v1, v1, [Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()[LF0/r;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, LF0/m;->b(Landroid/net/Uri;Ljava/util/Map;)[LF0/r;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    monitor-exit p0

    .line 17
    throw v0
.end method

.method public declared-synchronized b(Landroid/net/Uri;Ljava/util/Map;)[LF0/r;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, LF0/m;->r:[I

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ld0/o;->b(Ljava/util/Map;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v2, -0x1

    .line 15
    if-eq p2, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p2, v0}, LF0/m;->e(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-static {p1}, Ld0/o;->c(Landroid/net/Uri;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eq p1, v2, :cond_1

    .line 29
    .line 30
    if-eq p1, p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, LF0/m;->e(ILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    array-length v2, v1

    .line 36
    const/4 v3, 0x0

    .line 37
    move v4, v3

    .line 38
    :goto_1
    if-ge v4, v2, :cond_3

    .line 39
    .line 40
    aget v5, v1, v4

    .line 41
    .line 42
    if-eq v5, p2, :cond_2

    .line 43
    .line 44
    if-eq v5, p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v5, v0}, LF0/m;->e(ILjava/util/List;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    new-array p1, p1, [LF0/r;

    .line 57
    .line 58
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-ge v3, p2, :cond_5

    .line 63
    .line 64
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, LF0/r;

    .line 69
    .line 70
    iget-boolean v1, p0, LF0/m;->o:Z

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-interface {p2}, LF0/r;->d()LF0/r;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    instance-of v1, v1, LZ0/h;

    .line 79
    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    invoke-interface {p2}, LF0/r;->d()LF0/r;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    instance-of v1, v1, LZ0/m;

    .line 87
    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, LF0/r;->d()LF0/r;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    instance-of v1, v1, Ll1/J;

    .line 95
    .line 96
    if-nez v1, :cond_4

    .line 97
    .line 98
    invoke-interface {p2}, LF0/r;->d()LF0/r;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    instance-of v1, v1, LH0/b;

    .line 103
    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    invoke-interface {p2}, LF0/r;->d()LF0/r;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    instance-of v1, v1, LX0/e;

    .line 111
    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    new-instance v1, Lc1/u;

    .line 115
    .line 116
    iget-object v2, p0, LF0/m;->p:Lc1/t$a;

    .line 117
    .line 118
    invoke-direct {v1, p2, v2}, Lc1/u;-><init>(LF0/r;Lc1/t$a;)V

    .line 119
    .line 120
    .line 121
    move-object p2, v1

    .line 122
    :cond_4
    aput-object p2, p1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    monitor-exit p0

    .line 128
    return-object p1

    .line 129
    :goto_3
    monitor-exit p0

    .line 130
    throw p1
.end method

.method public final e(ILjava/util/List;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    goto/16 :goto_7

    .line 8
    .line 9
    :pswitch_1
    new-instance p1, LI0/a;

    .line 10
    .line 11
    invoke-direct {p1}, LI0/a;-><init>()V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :pswitch_2
    iget p1, p0, LF0/m;->h:I

    .line 20
    .line 21
    and-int/lit8 v0, p1, 0x2

    .line 22
    .line 23
    if-nez v0, :cond_8

    .line 24
    .line 25
    and-int/lit8 p1, p1, 0x4

    .line 26
    .line 27
    if-nez p1, :cond_8

    .line 28
    .line 29
    new-instance p1, LM0/a;

    .line 30
    .line 31
    invoke-direct {p1}, LM0/a;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_3
    new-instance p1, LJ0/a;

    .line 36
    .line 37
    invoke-direct {p1}, LJ0/a;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_4
    new-instance p1, Ln1/a;

    .line 42
    .line 43
    invoke-direct {p1}, Ln1/a;-><init>()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_5
    new-instance p1, Lb1/a;

    .line 48
    .line 49
    invoke-direct {p1}, Lb1/a;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_6
    new-instance p1, LH0/b;

    .line 54
    .line 55
    iget-boolean v1, p0, LF0/m;->o:Z

    .line 56
    .line 57
    xor-int/2addr v0, v1

    .line 58
    iget-object v1, p0, LF0/m;->p:Lc1/t$a;

    .line 59
    .line 60
    invoke-direct {p1, v0, v1}, LH0/b;-><init>(ILc1/t$a;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_7
    sget-object p1, LF0/m;->t:LF0/m$a;

    .line 65
    .line 66
    new-array v0, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, LF0/m$a;->a([Ljava/lang/Object;)LF0/r;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_8

    .line 73
    .line 74
    :goto_1
    goto :goto_0

    .line 75
    :pswitch_8
    new-instance p1, LN0/a;

    .line 76
    .line 77
    iget v0, p0, LF0/m;->q:I

    .line 78
    .line 79
    invoke-direct {p1, v0}, LN0/a;-><init>(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_9
    new-instance p1, Lm1/b;

    .line 84
    .line 85
    invoke-direct {p1}, Lm1/b;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_a
    iget-object p1, p0, LF0/m;->m:LX2/v;

    .line 90
    .line 91
    if-nez p1, :cond_0

    .line 92
    .line 93
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, LF0/m;->m:LX2/v;

    .line 98
    .line 99
    :cond_0
    new-instance p1, Ll1/J;

    .line 100
    .line 101
    iget v2, p0, LF0/m;->k:I

    .line 102
    .line 103
    iget-boolean v1, p0, LF0/m;->o:Z

    .line 104
    .line 105
    xor-int/lit8 v3, v1, 0x1

    .line 106
    .line 107
    iget-object v4, p0, LF0/m;->p:Lc1/t$a;

    .line 108
    .line 109
    new-instance v5, Lg0/E;

    .line 110
    .line 111
    const-wide/16 v0, 0x0

    .line 112
    .line 113
    invoke-direct {v5, v0, v1}, Lg0/E;-><init>(J)V

    .line 114
    .line 115
    .line 116
    new-instance v6, Ll1/j;

    .line 117
    .line 118
    iget v0, p0, LF0/m;->l:I

    .line 119
    .line 120
    iget-object v1, p0, LF0/m;->m:LX2/v;

    .line 121
    .line 122
    invoke-direct {v6, v0, v1}, Ll1/j;-><init>(ILjava/util/List;)V

    .line 123
    .line 124
    .line 125
    iget v7, p0, LF0/m;->n:I

    .line 126
    .line 127
    move-object v1, p1

    .line 128
    invoke-direct/range {v1 .. v7}, Ll1/J;-><init>(IILc1/t$a;Lg0/E;Ll1/K$c;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_b
    new-instance p1, Ll1/C;

    .line 133
    .line 134
    invoke-direct {p1}, Ll1/C;-><init>()V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :pswitch_c
    new-instance p1, La1/d;

    .line 139
    .line 140
    invoke-direct {p1}, La1/d;-><init>()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :pswitch_d
    new-instance p1, LZ0/h;

    .line 146
    .line 147
    iget-object v0, p0, LF0/m;->p:Lc1/t$a;

    .line 148
    .line 149
    iget v1, p0, LF0/m;->i:I

    .line 150
    .line 151
    iget-boolean v3, p0, LF0/m;->o:Z

    .line 152
    .line 153
    if-eqz v3, :cond_1

    .line 154
    .line 155
    move v3, v2

    .line 156
    goto :goto_2

    .line 157
    :cond_1
    const/16 v3, 0x20

    .line 158
    .line 159
    :goto_2
    or-int/2addr v1, v3

    .line 160
    invoke-direct {p1, v0, v1}, LZ0/h;-><init>(Lc1/t$a;I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance p1, LZ0/m;

    .line 167
    .line 168
    iget-object v0, p0, LF0/m;->p:Lc1/t$a;

    .line 169
    .line 170
    iget v1, p0, LF0/m;->h:I

    .line 171
    .line 172
    iget-boolean v3, p0, LF0/m;->o:Z

    .line 173
    .line 174
    if-eqz v3, :cond_2

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_2
    const/16 v2, 0x10

    .line 178
    .line 179
    :goto_3
    or-int/2addr v1, v2

    .line 180
    invoke-direct {p1, v0, v1}, LZ0/m;-><init>(Lc1/t$a;I)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :pswitch_e
    new-instance p1, LY0/f;

    .line 186
    .line 187
    iget v0, p0, LF0/m;->j:I

    .line 188
    .line 189
    iget-boolean v3, p0, LF0/m;->b:Z

    .line 190
    .line 191
    or-int/2addr v0, v3

    .line 192
    iget-boolean v3, p0, LF0/m;->c:Z

    .line 193
    .line 194
    if-eqz v3, :cond_3

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_3
    move v1, v2

    .line 198
    :goto_4
    or-int/2addr v0, v1

    .line 199
    invoke-direct {p1, v0}, LY0/f;-><init>(I)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :pswitch_f
    new-instance p1, LX0/e;

    .line 205
    .line 206
    iget-object v0, p0, LF0/m;->p:Lc1/t$a;

    .line 207
    .line 208
    iget v3, p0, LF0/m;->g:I

    .line 209
    .line 210
    iget-boolean v4, p0, LF0/m;->o:Z

    .line 211
    .line 212
    if-eqz v4, :cond_4

    .line 213
    .line 214
    move v1, v2

    .line 215
    :cond_4
    or-int/2addr v1, v3

    .line 216
    invoke-direct {p1, v0, v1}, LX0/e;-><init>(Lc1/t$a;I)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :pswitch_10
    new-instance p1, LL0/c;

    .line 222
    .line 223
    invoke-direct {p1}, LL0/c;-><init>()V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :pswitch_11
    sget-object p1, LF0/m;->s:LF0/m$a;

    .line 229
    .line 230
    iget v1, p0, LF0/m;->f:I

    .line 231
    .line 232
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-array v0, v0, [Ljava/lang/Object;

    .line 237
    .line 238
    aput-object v1, v0, v2

    .line 239
    .line 240
    invoke-virtual {p1, v0}, LF0/m$a;->a([Ljava/lang/Object;)LF0/r;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-eqz p1, :cond_5

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_5
    new-instance p1, LK0/d;

    .line 249
    .line 250
    iget v0, p0, LF0/m;->f:I

    .line 251
    .line 252
    invoke-direct {p1, v0}, LK0/d;-><init>(I)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :pswitch_12
    new-instance p1, LG0/b;

    .line 258
    .line 259
    iget v0, p0, LF0/m;->e:I

    .line 260
    .line 261
    iget-boolean v3, p0, LF0/m;->b:Z

    .line 262
    .line 263
    or-int/2addr v0, v3

    .line 264
    iget-boolean v3, p0, LF0/m;->c:Z

    .line 265
    .line 266
    if-eqz v3, :cond_6

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_6
    move v1, v2

    .line 270
    :goto_5
    or-int/2addr v0, v1

    .line 271
    invoke-direct {p1, v0}, LG0/b;-><init>(I)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :pswitch_13
    new-instance p1, Ll1/h;

    .line 277
    .line 278
    iget v0, p0, LF0/m;->d:I

    .line 279
    .line 280
    iget-boolean v3, p0, LF0/m;->b:Z

    .line 281
    .line 282
    or-int/2addr v0, v3

    .line 283
    iget-boolean v3, p0, LF0/m;->c:Z

    .line 284
    .line 285
    if-eqz v3, :cond_7

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_7
    move v1, v2

    .line 289
    :goto_6
    or-int/2addr v0, v1

    .line 290
    invoke-direct {p1, v0}, Ll1/h;-><init>(I)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :pswitch_14
    new-instance p1, Ll1/e;

    .line 296
    .line 297
    invoke-direct {p1}, Ll1/e;-><init>()V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :pswitch_15
    new-instance p1, Ll1/b;

    .line 303
    .line 304
    invoke-direct {p1}, Ll1/b;-><init>()V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_8
    :goto_7
    return-void

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public declared-synchronized h(Z)LF0/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, LF0/m;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

.method public declared-synchronized i(Z)LF0/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, LF0/m;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

.method public declared-synchronized j(I)LF0/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, LF0/m;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
.end method

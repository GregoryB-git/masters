.class public final Lb5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;
.implements Lz4/d0;
.implements Lt5/d0$a;
.implements Lt5/d0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/h$a;,
        Lb5/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lb5/i;",
        ">",
        "Ljava/lang/Object;",
        "Lz4/c0;",
        "Lz4/d0;",
        "Lt5/d0$a<",
        "Lb5/e;",
        ">;",
        "Lt5/d0$e;"
    }
.end annotation


# instance fields
.field public A:J

.field public B:J

.field public C:I

.field public D:Lb5/a;

.field public E:Z

.field public final a:I

.field public final b:[I

.field public final c:[Lv3/i0;

.field public final d:[Z

.field public final e:Lb5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final f:Lz4/d0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz4/d0$a<",
            "Lb5/h<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final o:Lz4/w$a;

.field public final p:Lt5/c0;

.field public final q:Lt5/d0;

.field public final r:Lb5/g;

.field public final s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb5/a;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb5/a;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Lz4/b0;

.field public final v:[Lz4/b0;

.field public final w:Lb5/c;

.field public x:Lb5/e;

.field public y:Lv3/i0;

.field public z:Lb5/h$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/h$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I[I[Lv3/i0;Lb5/i;Lz4/d0$a;Lt5/b;JLa4/h;La4/g$a;Lt5/c0;Lz4/w$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I[",
            "Lv3/i0;",
            "TT;",
            "Lz4/d0$a<",
            "Lb5/h<",
            "TT;>;>;",
            "Lt5/b;",
            "J",
            "La4/h;",
            "La4/g$a;",
            "Lt5/c0;",
            "Lz4/w$a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lb5/h;->a:I

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    new-array p2, v0, [I

    .line 10
    .line 11
    :cond_0
    iput-object p2, p0, Lb5/h;->b:[I

    .line 12
    .line 13
    if-nez p3, :cond_1

    .line 14
    .line 15
    new-array p3, v0, [Lv3/i0;

    .line 16
    .line 17
    :cond_1
    iput-object p3, p0, Lb5/h;->c:[Lv3/i0;

    .line 18
    .line 19
    iput-object p4, p0, Lb5/h;->e:Lb5/i;

    .line 20
    .line 21
    iput-object p5, p0, Lb5/h;->f:Lz4/d0$a;

    .line 22
    .line 23
    iput-object p12, p0, Lb5/h;->o:Lz4/w$a;

    .line 24
    .line 25
    iput-object p11, p0, Lb5/h;->p:Lt5/c0;

    .line 26
    .line 27
    new-instance p3, Lt5/d0;

    .line 28
    .line 29
    const-string p4, "ChunkSampleStream"

    .line 30
    .line 31
    invoke-direct {p3, p4}, Lt5/d0;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Lb5/h;->q:Lt5/d0;

    .line 35
    .line 36
    new-instance p3, Lb5/g;

    .line 37
    .line 38
    invoke-direct {p3, v0}, Lb5/g;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lb5/h;->r:Lb5/g;

    .line 42
    .line 43
    new-instance p3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    iput-object p3, p0, Lb5/h;->t:Ljava/util/List;

    .line 55
    .line 56
    array-length p2, p2

    .line 57
    new-array p3, p2, [Lz4/b0;

    .line 58
    .line 59
    iput-object p3, p0, Lb5/h;->v:[Lz4/b0;

    .line 60
    .line 61
    new-array p3, p2, [Z

    .line 62
    .line 63
    iput-object p3, p0, Lb5/h;->d:[Z

    .line 64
    .line 65
    add-int/lit8 p3, p2, 0x1

    .line 66
    .line 67
    new-array p4, p3, [I

    .line 68
    .line 69
    new-array p3, p3, [Lz4/b0;

    .line 70
    .line 71
    new-instance p5, Lz4/b0;

    .line 72
    .line 73
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-direct {p5, p6, p9, p10}, Lz4/b0;-><init>(Lt5/b;La4/h;La4/g$a;)V

    .line 80
    .line 81
    .line 82
    iput-object p5, p0, Lb5/h;->u:Lz4/b0;

    .line 83
    .line 84
    aput p1, p4, v0

    .line 85
    .line 86
    aput-object p5, p3, v0

    .line 87
    .line 88
    :goto_0
    if-ge v0, p2, :cond_2

    .line 89
    .line 90
    new-instance p1, Lz4/b0;

    .line 91
    .line 92
    const/4 p5, 0x0

    .line 93
    invoke-direct {p1, p6, p5, p5}, Lz4/b0;-><init>(Lt5/b;La4/h;La4/g$a;)V

    .line 94
    .line 95
    .line 96
    iget-object p5, p0, Lb5/h;->v:[Lz4/b0;

    .line 97
    .line 98
    aput-object p1, p5, v0

    .line 99
    .line 100
    add-int/lit8 p5, v0, 0x1

    .line 101
    .line 102
    aput-object p1, p3, p5

    .line 103
    .line 104
    iget-object p1, p0, Lb5/h;->b:[I

    .line 105
    .line 106
    aget p1, p1, v0

    .line 107
    .line 108
    aput p1, p4, p5

    .line 109
    .line 110
    move v0, p5

    .line 111
    goto :goto_0

    .line 112
    :cond_2
    new-instance p1, Lb5/c;

    .line 113
    .line 114
    invoke-direct {p1, p4, p3}, Lb5/c;-><init>([I[Lz4/b0;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Lb5/h;->w:Lb5/c;

    .line 118
    .line 119
    iput-wide p7, p0, Lb5/h;->A:J

    .line 120
    .line 121
    iput-wide p7, p0, Lb5/h;->B:J

    .line 122
    .line 123
    return-void
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
.end method


# virtual methods
.method public final A(Lb5/h$b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/h$b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lb5/h;->z:Lb5/h$b;

    .line 2
    .line 3
    iget-object p1, p0, Lb5/h;->u:Lz4/b0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lz4/b0;->h()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lz4/b0;->h:La4/e;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p1, Lz4/b0;->e:La4/g$a;

    .line 14
    .line 15
    invoke-interface {v0, v2}, La4/e;->f(La4/g$a;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p1, Lz4/b0;->h:La4/e;

    .line 19
    .line 20
    iput-object v1, p1, Lz4/b0;->g:Lv3/i0;

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lb5/h;->v:[Lz4/b0;

    .line 23
    .line 24
    array-length v0, p1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v0, :cond_2

    .line 27
    .line 28
    aget-object v3, p1, v2

    .line 29
    .line 30
    invoke-virtual {v3}, Lz4/b0;->h()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v3, Lz4/b0;->h:La4/e;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    iget-object v5, v3, Lz4/b0;->e:La4/g$a;

    .line 38
    .line 39
    invoke-interface {v4, v5}, La4/e;->f(La4/g$a;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, v3, Lz4/b0;->h:La4/e;

    .line 43
    .line 44
    iput-object v1, v3, Lz4/b0;->g:Lv3/i0;

    .line 45
    .line 46
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-object p1, p0, Lb5/h;->q:Lt5/d0;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Lt5/d0;->e(Lt5/d0$e;)V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public final B(J)V
    .locals 9

    .line 1
    iput-wide p1, p0, Lb5/h;->B:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Lb5/h;->A:J

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget-object v2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-ge v1, v2, :cond_3

    .line 22
    .line 23
    iget-object v2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lb5/a;

    .line 30
    .line 31
    iget-wide v4, v2, Lb5/e;->g:J

    .line 32
    .line 33
    cmp-long v4, v4, p1

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-wide v5, v2, Lb5/a;->k:J

    .line 38
    .line 39
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v5, v5, v7

    .line 45
    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    if-lez v4, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_1
    move-object v2, v3

    .line 56
    :goto_2
    const/4 v1, 0x1

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    iget-object v4, p0, Lb5/h;->u:Lz4/b0;

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Lb5/a;->e(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    monitor-enter v4

    .line 66
    :try_start_0
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    :try_start_1
    iput v0, v4, Lz4/b0;->s:I

    .line 68
    .line 69
    iget-object v5, v4, Lz4/b0;->a:Lz4/a0;

    .line 70
    .line 71
    iget-object v6, v5, Lz4/a0;->d:Lz4/a0$a;

    .line 72
    .line 73
    iput-object v6, v5, Lz4/a0;->e:Lz4/a0$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    :try_start_2
    monitor-exit v4

    .line 76
    iget v5, v4, Lz4/b0;->q:I

    .line 77
    .line 78
    if-lt v2, v5, :cond_5

    .line 79
    .line 80
    iget v6, v4, Lz4/b0;->p:I

    .line 81
    .line 82
    add-int/2addr v6, v5

    .line 83
    if-le v2, v6, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const-wide/high16 v6, -0x8000000000000000L

    .line 87
    .line 88
    iput-wide v6, v4, Lz4/b0;->t:J

    .line 89
    .line 90
    sub-int/2addr v2, v5

    .line 91
    iput v2, v4, Lz4/b0;->s:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    move v2, v1

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    :goto_3
    move v2, v0

    .line 96
    :goto_4
    monitor-exit v4

    .line 97
    goto :goto_7

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_5

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    :try_start_3
    monitor-exit v4

    .line 102
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    :goto_5
    monitor-exit v4

    .line 104
    throw p1

    .line 105
    :cond_6
    iget-object v2, p0, Lb5/h;->u:Lz4/b0;

    .line 106
    .line 107
    invoke-virtual {p0}, Lb5/h;->c()J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    cmp-long v4, p1, v4

    .line 112
    .line 113
    if-gez v4, :cond_7

    .line 114
    .line 115
    move v4, v1

    .line 116
    goto :goto_6

    .line 117
    :cond_7
    move v4, v0

    .line 118
    :goto_6
    invoke-virtual {v2, p1, p2, v4}, Lz4/b0;->x(JZ)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    :goto_7
    if-eqz v2, :cond_8

    .line 123
    .line 124
    iget-object v2, p0, Lb5/h;->u:Lz4/b0;

    .line 125
    .line 126
    iget v3, v2, Lz4/b0;->q:I

    .line 127
    .line 128
    iget v2, v2, Lz4/b0;->s:I

    .line 129
    .line 130
    add-int/2addr v3, v2

    .line 131
    invoke-virtual {p0, v3, v0}, Lb5/h;->z(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    iput v2, p0, Lb5/h;->C:I

    .line 136
    .line 137
    iget-object v2, p0, Lb5/h;->v:[Lz4/b0;

    .line 138
    .line 139
    array-length v3, v2

    .line 140
    :goto_8
    if-ge v0, v3, :cond_b

    .line 141
    .line 142
    aget-object v4, v2, v0

    .line 143
    .line 144
    invoke-virtual {v4, p1, p2, v1}, Lz4/b0;->x(JZ)Z

    .line 145
    .line 146
    .line 147
    add-int/lit8 v0, v0, 0x1

    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_8
    iput-wide p1, p0, Lb5/h;->A:J

    .line 151
    .line 152
    iput-boolean v0, p0, Lb5/h;->E:Z

    .line 153
    .line 154
    iget-object p1, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 157
    .line 158
    .line 159
    iput v0, p0, Lb5/h;->C:I

    .line 160
    .line 161
    iget-object p1, p0, Lb5/h;->q:Lt5/d0;

    .line 162
    .line 163
    invoke-virtual {p1}, Lt5/d0;->d()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_a

    .line 168
    .line 169
    iget-object p1, p0, Lb5/h;->u:Lz4/b0;

    .line 170
    .line 171
    invoke-virtual {p1}, Lz4/b0;->h()V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lb5/h;->v:[Lz4/b0;

    .line 175
    .line 176
    array-length p2, p1

    .line 177
    :goto_9
    if-ge v0, p2, :cond_9

    .line 178
    .line 179
    aget-object v1, p1, v0

    .line 180
    .line 181
    invoke-virtual {v1}, Lz4/b0;->h()V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v0, v0, 0x1

    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_9
    iget-object p1, p0, Lb5/h;->q:Lt5/d0;

    .line 188
    .line 189
    invoke-virtual {p1}, Lt5/d0;->b()V

    .line 190
    .line 191
    .line 192
    goto :goto_b

    .line 193
    :cond_a
    iget-object p1, p0, Lb5/h;->q:Lt5/d0;

    .line 194
    .line 195
    iput-object v3, p1, Lt5/d0;->c:Ljava/io/IOException;

    .line 196
    .line 197
    iget-object p1, p0, Lb5/h;->u:Lz4/b0;

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lz4/b0;->v(Z)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, Lb5/h;->v:[Lz4/b0;

    .line 203
    .line 204
    array-length p2, p1

    .line 205
    move v1, v0

    .line 206
    :goto_a
    if-ge v1, p2, :cond_b

    .line 207
    .line 208
    aget-object v2, p1, v1

    .line 209
    .line 210
    invoke-virtual {v2, v0}, Lz4/b0;->v(Z)V

    .line 211
    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x1

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_b
    :goto_b
    return-void
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

.method public final a()V
    .locals 1

    iget-object v0, p0, Lb5/h;->q:Lt5/d0;

    invoke-virtual {v0}, Lt5/d0;->a()V

    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    invoke-virtual {v0}, Lz4/b0;->s()V

    iget-object v0, p0, Lb5/h;->q:Lt5/d0;

    invoke-virtual {v0}, Lt5/d0;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb5/h;->e:Lb5/i;

    invoke-interface {v0}, Lb5/i;->a()V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 2

    invoke-virtual {p0}, Lb5/h;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    iget-boolean v1, p0, Lb5/h;->E:Z

    invoke-virtual {v0, v1}, Lz4/b0;->q(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()J
    .locals 2

    invoke-virtual {p0}, Lb5/h;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lb5/h;->A:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lb5/h;->E:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lb5/h;->v()Lb5/a;

    move-result-object v0

    iget-wide v0, v0, Lb5/e;->h:J

    :goto_0
    return-wide v0
.end method

.method public final d(J)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lb5/h;->E:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_9

    .line 7
    .line 8
    iget-object v1, v0, Lb5/h;->q:Lt5/d0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lt5/d0;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_9

    .line 15
    .line 16
    iget-object v1, v0, Lb5/h;->q:Lt5/d0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lt5/d0;->c()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lb5/h;->x()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-wide v4, v0, Lb5/h;->A:J

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v3, v0, Lb5/h;->t:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lb5/h;->v()Lb5/a;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-wide v4, v4, Lb5/e;->h:J

    .line 46
    .line 47
    :goto_0
    move-object v11, v3

    .line 48
    move-wide v9, v4

    .line 49
    iget-object v6, v0, Lb5/h;->e:Lb5/i;

    .line 50
    .line 51
    iget-object v12, v0, Lb5/h;->r:Lb5/g;

    .line 52
    .line 53
    move-wide/from16 v7, p1

    .line 54
    .line 55
    invoke-interface/range {v6 .. v12}, Lb5/i;->i(JJLjava/util/List;Lb5/g;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v0, Lb5/h;->r:Lb5/g;

    .line 59
    .line 60
    iget-boolean v4, v3, Lb5/g;->a:Z

    .line 61
    .line 62
    iget-object v5, v3, Lb5/g;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Lb5/e;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    iput-object v6, v3, Lb5/g;->b:Ljava/lang/Object;

    .line 68
    .line 69
    iput-boolean v2, v3, Lb5/g;->a:Z

    .line 70
    .line 71
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    iput-wide v6, v0, Lb5/h;->A:J

    .line 80
    .line 81
    iput-boolean v3, v0, Lb5/h;->E:Z

    .line 82
    .line 83
    return v3

    .line 84
    :cond_2
    if-nez v5, :cond_3

    .line 85
    .line 86
    return v2

    .line 87
    :cond_3
    iput-object v5, v0, Lb5/h;->x:Lb5/e;

    .line 88
    .line 89
    instance-of v4, v5, Lb5/a;

    .line 90
    .line 91
    if-eqz v4, :cond_7

    .line 92
    .line 93
    move-object v4, v5

    .line 94
    check-cast v4, Lb5/a;

    .line 95
    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    iget-wide v8, v4, Lb5/e;->g:J

    .line 99
    .line 100
    iget-wide v10, v0, Lb5/h;->A:J

    .line 101
    .line 102
    cmp-long v1, v8, v10

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-object v1, v0, Lb5/h;->u:Lz4/b0;

    .line 107
    .line 108
    iput-wide v10, v1, Lz4/b0;->t:J

    .line 109
    .line 110
    iget-object v1, v0, Lb5/h;->v:[Lz4/b0;

    .line 111
    .line 112
    array-length v8, v1

    .line 113
    move v9, v2

    .line 114
    :goto_1
    if-ge v9, v8, :cond_4

    .line 115
    .line 116
    aget-object v10, v1, v9

    .line 117
    .line 118
    iget-wide v11, v0, Lb5/h;->A:J

    .line 119
    .line 120
    iput-wide v11, v10, Lz4/b0;->t:J

    .line 121
    .line 122
    add-int/lit8 v9, v9, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    iput-wide v6, v0, Lb5/h;->A:J

    .line 126
    .line 127
    :cond_5
    iget-object v1, v0, Lb5/h;->w:Lb5/c;

    .line 128
    .line 129
    iput-object v1, v4, Lb5/a;->m:Lb5/c;

    .line 130
    .line 131
    iget-object v6, v1, Lb5/c;->b:[Lz4/b0;

    .line 132
    .line 133
    array-length v6, v6

    .line 134
    new-array v6, v6, [I

    .line 135
    .line 136
    :goto_2
    iget-object v7, v1, Lb5/c;->b:[Lz4/b0;

    .line 137
    .line 138
    array-length v8, v7

    .line 139
    if-ge v2, v8, :cond_6

    .line 140
    .line 141
    aget-object v7, v7, v2

    .line 142
    .line 143
    iget v8, v7, Lz4/b0;->q:I

    .line 144
    .line 145
    iget v7, v7, Lz4/b0;->p:I

    .line 146
    .line 147
    add-int/2addr v8, v7

    .line 148
    aput v8, v6, v2

    .line 149
    .line 150
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    iput-object v6, v4, Lb5/a;->n:[I

    .line 154
    .line 155
    iget-object v1, v0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    instance-of v1, v5, Lb5/l;

    .line 162
    .line 163
    if-eqz v1, :cond_8

    .line 164
    .line 165
    move-object v1, v5

    .line 166
    check-cast v1, Lb5/l;

    .line 167
    .line 168
    iget-object v2, v0, Lb5/h;->w:Lb5/c;

    .line 169
    .line 170
    iput-object v2, v1, Lb5/l;->k:Lb5/f$a;

    .line 171
    .line 172
    :cond_8
    :goto_3
    iget-object v1, v0, Lb5/h;->q:Lt5/d0;

    .line 173
    .line 174
    iget-object v2, v0, Lb5/h;->p:Lt5/c0;

    .line 175
    .line 176
    iget v4, v5, Lb5/e;->c:I

    .line 177
    .line 178
    check-cast v2, Lt5/u;

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Lt5/u;->b(I)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-virtual {v1, v5, v0, v2}, Lt5/d0;->f(Lt5/d0$d;Lt5/d0$a;I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v10

    .line 188
    iget-object v12, v0, Lb5/h;->o:Lz4/w$a;

    .line 189
    .line 190
    new-instance v13, Lz4/n;

    .line 191
    .line 192
    iget-wide v7, v5, Lb5/e;->a:J

    .line 193
    .line 194
    iget-object v9, v5, Lb5/e;->b:Lt5/n;

    .line 195
    .line 196
    move-object v6, v13

    .line 197
    invoke-direct/range {v6 .. v11}, Lz4/n;-><init>(JLt5/n;J)V

    .line 198
    .line 199
    .line 200
    iget v14, v5, Lb5/e;->c:I

    .line 201
    .line 202
    iget v15, v0, Lb5/h;->a:I

    .line 203
    .line 204
    iget-object v1, v5, Lb5/e;->d:Lv3/i0;

    .line 205
    .line 206
    iget v2, v5, Lb5/e;->e:I

    .line 207
    .line 208
    iget-object v4, v5, Lb5/e;->f:Ljava/lang/Object;

    .line 209
    .line 210
    iget-wide v6, v5, Lb5/e;->g:J

    .line 211
    .line 212
    iget-wide v8, v5, Lb5/e;->h:J

    .line 213
    .line 214
    move-object/from16 v16, v1

    .line 215
    .line 216
    move/from16 v17, v2

    .line 217
    .line 218
    move-object/from16 v18, v4

    .line 219
    .line 220
    move-wide/from16 v19, v6

    .line 221
    .line 222
    move-wide/from16 v21, v8

    .line 223
    .line 224
    invoke-virtual/range {v12 .. v22}, Lz4/w$a;->n(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 225
    .line 226
    .line 227
    return v3

    .line 228
    :cond_9
    :goto_4
    return v2
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method

.method public final f()V
    .locals 8

    .line 1
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lz4/b0;->v(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v2, v0, Lz4/b0;->h:La4/e;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v4, v0, Lz4/b0;->e:La4/g$a;

    .line 13
    .line 14
    invoke-interface {v2, v4}, La4/e;->f(La4/g$a;)V

    .line 15
    .line 16
    .line 17
    iput-object v3, v0, Lz4/b0;->h:La4/e;

    .line 18
    .line 19
    iput-object v3, v0, Lz4/b0;->g:Lv3/i0;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lb5/h;->v:[Lz4/b0;

    .line 22
    .line 23
    array-length v2, v0

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_0
    if-ge v4, v2, :cond_2

    .line 26
    .line 27
    aget-object v5, v0, v4

    .line 28
    .line 29
    invoke-virtual {v5, v1}, Lz4/b0;->v(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v6, v5, Lz4/b0;->h:La4/e;

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    iget-object v7, v5, Lz4/b0;->e:La4/g$a;

    .line 37
    .line 38
    invoke-interface {v6, v7}, La4/e;->f(La4/g$a;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, v5, Lz4/b0;->h:La4/e;

    .line 42
    .line 43
    iput-object v3, v5, Lz4/b0;->g:Lv3/i0;

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v0, p0, Lb5/h;->e:Lb5/i;

    .line 49
    .line 50
    invoke-interface {v0}, Lb5/i;->release()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lb5/h;->z:Lb5/h$b;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    check-cast v0, Lcom/google/android/exoplayer2/source/dash/b;

    .line 58
    .line 59
    monitor-enter v0

    .line 60
    :try_start_0
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->v:Ljava/util/IdentityHashMap;

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lcom/google/android/exoplayer2/source/dash/d$c;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    iget-object v2, v2, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lz4/b0;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lz4/b0;->v(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v1, v2, Lz4/b0;->h:La4/e;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget-object v4, v2, Lz4/b0;->e:La4/g$a;

    .line 80
    .line 81
    invoke-interface {v1, v4}, La4/e;->f(La4/g$a;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, v2, Lz4/b0;->h:La4/e;

    .line 85
    .line 86
    iput-object v3, v2, Lz4/b0;->g:Lv3/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    :cond_3
    monitor-exit v0

    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v1

    .line 91
    monitor-exit v0

    .line 92
    throw v1

    .line 93
    :cond_4
    :goto_1
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final g()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lb5/h;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Lb5/h;->A:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    iget-wide v0, p0, Lb5/h;->B:J

    .line 18
    .line 19
    invoke-virtual {p0}, Lb5/h;->v()Lb5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lb5/m;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-le v2, v3, :cond_3

    .line 38
    .line 39
    iget-object v2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/lit8 v3, v3, -0x2

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lb5/a;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-eqz v2, :cond_4

    .line 56
    .line 57
    iget-wide v2, v2, Lb5/e;->h:J

    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    :cond_4
    iget-object v2, p0, Lb5/h;->u:Lz4/b0;

    .line 64
    .line 65
    monitor-enter v2

    .line 66
    :try_start_0
    iget-wide v3, v2, Lz4/b0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit v2

    .line 69
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    return-wide v0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    monitor-exit v2

    .line 76
    throw v0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final h(J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lb5/h;->q:Lt5/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt5/d0;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lb5/h;->q:Lt5/d0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt5/d0;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Lb5/h;->x:Lb5/e;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    instance-of v2, v0, Lb5/a;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/2addr v3, v1

    .line 42
    invoke-virtual {p0, v3}, Lb5/h;->w(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-object v1, p0, Lb5/h;->e:Lb5/i;

    .line 50
    .line 51
    iget-object v3, p0, Lb5/h;->t:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v1, p1, p2, v0, v3}, Lb5/i;->f(JLb5/e;Ljava/util/List;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lb5/h;->q:Lt5/d0;

    .line 60
    .line 61
    invoke-virtual {p1}, Lt5/d0;->b()V

    .line 62
    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    check-cast v0, Lb5/a;

    .line 67
    .line 68
    iput-object v0, p0, Lb5/h;->D:Lb5/a;

    .line 69
    .line 70
    :cond_2
    return-void

    .line 71
    :cond_3
    iget-object v0, p0, Lb5/h;->e:Lb5/i;

    .line 72
    .line 73
    iget-object v2, p0, Lb5/h;->t:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v0, p1, p2, v2}, Lb5/i;->h(JLjava/util/List;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object p2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-ge p1, p2, :cond_8

    .line 86
    .line 87
    iget-object p2, p0, Lb5/h;->q:Lt5/d0;

    .line 88
    .line 89
    invoke-virtual {p2}, Lt5/d0;->d()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    xor-int/lit8 p2, p2, 0x1

    .line 94
    .line 95
    invoke-static {p2}, Lx6/b;->H(Z)V

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    :goto_0
    if-ge p1, p2, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lb5/h;->w(I)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    move p1, v1

    .line 117
    :goto_1
    if-ne p1, v1, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-virtual {p0}, Lb5/h;->v()Lb5/a;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    iget-wide v0, p2, Lb5/e;->h:J

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lb5/h;->t(I)Lb5/a;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_7

    .line 137
    .line 138
    iget-wide v2, p0, Lb5/h;->B:J

    .line 139
    .line 140
    iput-wide v2, p0, Lb5/h;->A:J

    .line 141
    .line 142
    :cond_7
    const/4 p2, 0x0

    .line 143
    iput-boolean p2, p0, Lb5/h;->E:Z

    .line 144
    .line 145
    iget-object p2, p0, Lb5/h;->o:Lz4/w$a;

    .line 146
    .line 147
    iget v4, p0, Lb5/h;->a:I

    .line 148
    .line 149
    iget-wide v2, p1, Lb5/e;->g:J

    .line 150
    .line 151
    new-instance p1, Lz4/q;

    .line 152
    .line 153
    invoke-virtual {p2, v2, v3}, Lz4/w$a;->a(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    invoke-virtual {p2, v0, v1}, Lz4/w$a;->a(J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v10

    .line 161
    const/4 v3, 0x1

    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v6, 0x3

    .line 164
    const/4 v7, 0x0

    .line 165
    move-object v2, p1

    .line 166
    invoke-direct/range {v2 .. v11}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p1}, Lz4/w$a;->p(Lz4/q;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    :goto_2
    return-void
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

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lb5/h;->q:Lt5/d0;

    invoke-virtual {v0}, Lt5/d0;->d()Z

    move-result v0

    return v0
.end method

.method public final k(Lt5/d0$d;JJZ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    check-cast v1, Lb5/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, Lb5/h;->x:Lb5/e;

    .line 7
    .line 8
    iput-object v2, v0, Lb5/h;->D:Lb5/a;

    .line 9
    .line 10
    new-instance v4, Lz4/n;

    .line 11
    .line 12
    iget-wide v2, v1, Lb5/e;->a:J

    .line 13
    .line 14
    iget-object v2, v1, Lb5/e;->i:Lt5/j0;

    .line 15
    .line 16
    iget-object v3, v2, Lt5/j0;->c:Landroid/net/Uri;

    .line 17
    .line 18
    iget-object v2, v2, Lt5/j0;->d:Ljava/util/Map;

    .line 19
    .line 20
    invoke-direct {v4, v2}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v0, Lb5/h;->p:Lt5/c0;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Lb5/h;->o:Lz4/w$a;

    .line 29
    .line 30
    iget v5, v1, Lb5/e;->c:I

    .line 31
    .line 32
    iget v6, v0, Lb5/h;->a:I

    .line 33
    .line 34
    iget-object v7, v1, Lb5/e;->d:Lv3/i0;

    .line 35
    .line 36
    iget v8, v1, Lb5/e;->e:I

    .line 37
    .line 38
    iget-object v9, v1, Lb5/e;->f:Ljava/lang/Object;

    .line 39
    .line 40
    iget-wide v10, v1, Lb5/e;->g:J

    .line 41
    .line 42
    iget-wide v12, v1, Lb5/e;->h:J

    .line 43
    .line 44
    invoke-virtual/range {v3 .. v13}, Lz4/w$a;->e(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 45
    .line 46
    .line 47
    if-nez p6, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    iget-object v1, v0, Lb5/h;->u:Lz4/b0;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Lz4/b0;->v(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lb5/h;->v:[Lz4/b0;

    .line 62
    .line 63
    array-length v3, v1

    .line 64
    move v4, v2

    .line 65
    :goto_0
    if-ge v4, v3, :cond_1

    .line 66
    .line 67
    aget-object v5, v1, v4

    .line 68
    .line 69
    invoke-virtual {v5, v2}, Lz4/b0;->v(Z)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    instance-of v1, v1, Lb5/a;

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    iget-object v1, v0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/lit8 v1, v1, -0x1

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Lb5/h;->t(I)Lb5/a;

    .line 88
    .line 89
    .line 90
    iget-object v1, v0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    iget-wide v1, v0, Lb5/h;->B:J

    .line 99
    .line 100
    iput-wide v1, v0, Lb5/h;->A:J

    .line 101
    .line 102
    :cond_1
    iget-object v1, v0, Lb5/h;->f:Lz4/d0$a;

    .line 103
    .line 104
    invoke-interface {v1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final m(J)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 10
    .line 11
    iget-boolean v2, p0, Lb5/h;->E:Z

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, v2}, Lz4/b0;->o(JZ)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object p2, p0, Lb5/h;->D:Lb5/a;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Lb5/a;->e(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 26
    .line 27
    iget v1, v0, Lz4/b0;->q:I

    .line 28
    .line 29
    iget v0, v0, Lz4/b0;->s:I

    .line 30
    .line 31
    add-int/2addr v1, v0

    .line 32
    sub-int/2addr p2, v1

    .line 33
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :cond_1
    iget-object p2, p0, Lb5/h;->u:Lz4/b0;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lz4/b0;->y(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lb5/h;->y()V

    .line 43
    .line 44
    .line 45
    return p1
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

.method public final p(Lt5/d0$d;JJ)V
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    check-cast v1, Lb5/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, Lb5/h;->x:Lb5/e;

    .line 7
    .line 8
    iget-object v2, v0, Lb5/h;->e:Lb5/i;

    .line 9
    .line 10
    invoke-interface {v2, v1}, Lb5/i;->j(Lb5/e;)V

    .line 11
    .line 12
    .line 13
    new-instance v4, Lz4/n;

    .line 14
    .line 15
    iget-wide v2, v1, Lb5/e;->a:J

    .line 16
    .line 17
    iget-object v2, v1, Lb5/e;->i:Lt5/j0;

    .line 18
    .line 19
    iget-object v3, v2, Lt5/j0;->c:Landroid/net/Uri;

    .line 20
    .line 21
    iget-object v2, v2, Lt5/j0;->d:Ljava/util/Map;

    .line 22
    .line 23
    invoke-direct {v4, v2}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lb5/h;->p:Lt5/c0;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, Lb5/h;->o:Lz4/w$a;

    .line 32
    .line 33
    iget v5, v1, Lb5/e;->c:I

    .line 34
    .line 35
    iget v6, v0, Lb5/h;->a:I

    .line 36
    .line 37
    iget-object v7, v1, Lb5/e;->d:Lv3/i0;

    .line 38
    .line 39
    iget v8, v1, Lb5/e;->e:I

    .line 40
    .line 41
    iget-object v9, v1, Lb5/e;->f:Ljava/lang/Object;

    .line 42
    .line 43
    iget-wide v10, v1, Lb5/e;->g:J

    .line 44
    .line 45
    iget-wide v12, v1, Lb5/e;->h:J

    .line 46
    .line 47
    invoke-virtual/range {v3 .. v13}, Lz4/w$a;->h(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lb5/h;->f:Lz4/d0$a;

    .line 51
    .line 52
    invoke-interface {v1, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 53
    .line 54
    .line 55
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final r(Ll3/l;Lz3/g;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x3

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lb5/h;->D:Lb5/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Lb5/a;->e(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lb5/h;->u:Lz4/b0;

    .line 19
    .line 20
    iget v3, v2, Lz4/b0;->q:I

    .line 21
    .line 22
    iget v2, v2, Lz4/b0;->s:I

    .line 23
    .line 24
    add-int/2addr v3, v2

    .line 25
    if-gt v0, v3, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    invoke-virtual {p0}, Lb5/h;->y()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 32
    .line 33
    iget-boolean v1, p0, Lb5/h;->E:Z

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2, p3, v1}, Lz4/b0;->u(Ll3/l;Lz3/g;IZ)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final s(JZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lb5/h;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 9
    .line 10
    iget v1, v0, Lz4/b0;->q:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, p1, p2, p3, v2}, Lz4/b0;->g(JZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lb5/h;->u:Lz4/b0;

    .line 17
    .line 18
    iget p2, p1, Lz4/b0;->q:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-le p2, v1, :cond_2

    .line 22
    .line 23
    monitor-enter p1

    .line 24
    :try_start_0
    iget v1, p1, Lz4/b0;->p:I

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const-wide/high16 v1, -0x8000000000000000L

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p1, Lz4/b0;->n:[J

    .line 32
    .line 33
    iget v2, p1, Lz4/b0;->r:I

    .line 34
    .line 35
    aget-wide v2, v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    move-wide v1, v2

    .line 38
    :goto_0
    monitor-exit p1

    .line 39
    move p1, v0

    .line 40
    :goto_1
    iget-object v3, p0, Lb5/h;->v:[Lz4/b0;

    .line 41
    .line 42
    array-length v4, v3

    .line 43
    if-ge p1, v4, :cond_2

    .line 44
    .line 45
    aget-object v3, v3, p1

    .line 46
    .line 47
    iget-object v4, p0, Lb5/h;->d:[Z

    .line 48
    .line 49
    aget-boolean v4, v4, p1

    .line 50
    .line 51
    invoke-virtual {v3, v1, v2, p3, v4}, Lz4/b0;->g(JZZ)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p2

    .line 58
    monitor-exit p1

    .line 59
    throw p2

    .line 60
    :cond_2
    invoke-virtual {p0, p2, v0}, Lb5/h;->z(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget p2, p0, Lb5/h;->C:I

    .line 65
    .line 66
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-lez p1, :cond_3

    .line 71
    .line 72
    iget-object p2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v0, p1, p2}, Lv5/e0;->N(IILjava/util/ArrayList;)V

    .line 75
    .line 76
    .line 77
    iget p2, p0, Lb5/h;->C:I

    .line 78
    .line 79
    sub-int/2addr p2, p1

    .line 80
    iput p2, p0, Lb5/h;->C:I

    .line 81
    .line 82
    :cond_3
    return-void
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

.method public final t(I)Lb5/a;
    .locals 3

    iget-object v0, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb5/a;

    iget-object v1, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {p1, v2, v1}, Lv5/e0;->N(IILjava/util/ArrayList;)V

    iget p1, p0, Lb5/h;->C:I

    iget-object v1, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lb5/h;->C:I

    iget-object p1, p0, Lb5/h;->u:Lz4/b0;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lb5/a;->e(I)I

    move-result v2

    invoke-virtual {p1, v2}, Lz4/b0;->j(I)V

    iget-object p1, p0, Lb5/h;->v:[Lz4/b0;

    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object p1, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final u(Lt5/d0$d;JJLjava/io/IOException;I)Lt5/d0$b;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lb5/e;

    .line 6
    .line 7
    iget-object v2, v1, Lb5/e;->i:Lt5/j0;

    .line 8
    .line 9
    iget-wide v2, v2, Lt5/j0;->b:J

    .line 10
    .line 11
    instance-of v4, v1, Lb5/a;

    .line 12
    .line 13
    iget-object v5, v0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    add-int/lit8 v5, v5, -0x1

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    cmp-long v2, v2, v6

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lb5/h;->w(I)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v2, v3

    .line 41
    :goto_1
    new-instance v8, Lz4/n;

    .line 42
    .line 43
    iget-object v7, v1, Lb5/e;->i:Lt5/j0;

    .line 44
    .line 45
    iget-object v9, v7, Lt5/j0;->c:Landroid/net/Uri;

    .line 46
    .line 47
    iget-object v7, v7, Lt5/j0;->d:Ljava/util/Map;

    .line 48
    .line 49
    invoke-direct {v8, v7}, Lz4/n;-><init>(Ljava/util/Map;)V

    .line 50
    .line 51
    .line 52
    iget-wide v9, v1, Lb5/e;->g:J

    .line 53
    .line 54
    invoke-static {v9, v10}, Lv5/e0;->R(J)J

    .line 55
    .line 56
    .line 57
    iget-wide v9, v1, Lb5/e;->h:J

    .line 58
    .line 59
    invoke-static {v9, v10}, Lv5/e0;->R(J)J

    .line 60
    .line 61
    .line 62
    new-instance v7, Lt5/c0$c;

    .line 63
    .line 64
    move-object/from16 v14, p6

    .line 65
    .line 66
    move/from16 v9, p7

    .line 67
    .line 68
    invoke-direct {v7, v14, v9}, Lt5/c0$c;-><init>(Ljava/io/IOException;I)V

    .line 69
    .line 70
    .line 71
    iget-object v9, v0, Lb5/h;->e:Lb5/i;

    .line 72
    .line 73
    iget-object v10, v0, Lb5/h;->p:Lt5/c0;

    .line 74
    .line 75
    invoke-interface {v9, v1, v2, v7, v10}, Lb5/i;->g(Lb5/e;ZLt5/c0$c;Lt5/c0;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    const/4 v15, 0x0

    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    sget-object v2, Lt5/d0;->e:Lt5/d0$b;

    .line 85
    .line 86
    if-eqz v4, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0, v5}, Lb5/h;->t(I)Lb5/a;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-ne v4, v1, :cond_2

    .line 93
    .line 94
    move v4, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    move v4, v6

    .line 97
    :goto_2
    invoke-static {v4}, Lx6/b;->H(Z)V

    .line 98
    .line 99
    .line 100
    iget-object v4, v0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    iget-wide v4, v0, Lb5/h;->B:J

    .line 109
    .line 110
    iput-wide v4, v0, Lb5/h;->A:J

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    const-string v2, "ChunkSampleStream"

    .line 114
    .line 115
    const-string v4, "Ignoring attempt to cancel non-cancelable load."

    .line 116
    .line 117
    invoke-static {v2, v4}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    move-object v2, v15

    .line 121
    :cond_5
    :goto_3
    if-nez v2, :cond_7

    .line 122
    .line 123
    iget-object v2, v0, Lb5/h;->p:Lt5/c0;

    .line 124
    .line 125
    check-cast v2, Lt5/u;

    .line 126
    .line 127
    invoke-virtual {v2, v7}, Lt5/u;->c(Lt5/c0$c;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    cmp-long v2, v4, v9

    .line 137
    .line 138
    if-eqz v2, :cond_6

    .line 139
    .line 140
    new-instance v2, Lt5/d0$b;

    .line 141
    .line 142
    invoke-direct {v2, v6, v4, v5}, Lt5/d0$b;-><init>(IJ)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    sget-object v2, Lt5/d0;->f:Lt5/d0$b;

    .line 147
    .line 148
    :cond_7
    :goto_4
    invoke-virtual {v2}, Lt5/d0$b;->a()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    xor-int/2addr v3, v4

    .line 153
    iget-object v7, v0, Lb5/h;->o:Lz4/w$a;

    .line 154
    .line 155
    iget v9, v1, Lb5/e;->c:I

    .line 156
    .line 157
    iget v10, v0, Lb5/h;->a:I

    .line 158
    .line 159
    iget-object v11, v1, Lb5/e;->d:Lv3/i0;

    .line 160
    .line 161
    iget v12, v1, Lb5/e;->e:I

    .line 162
    .line 163
    iget-object v13, v1, Lb5/e;->f:Ljava/lang/Object;

    .line 164
    .line 165
    iget-wide v4, v1, Lb5/e;->g:J

    .line 166
    .line 167
    move-object/from16 p1, v2

    .line 168
    .line 169
    iget-wide v1, v1, Lb5/e;->h:J

    .line 170
    .line 171
    move-object v6, v15

    .line 172
    move-wide v14, v4

    .line 173
    move-wide/from16 v16, v1

    .line 174
    .line 175
    move-object/from16 v18, p6

    .line 176
    .line 177
    move/from16 v19, v3

    .line 178
    .line 179
    invoke-virtual/range {v7 .. v19}, Lz4/w$a;->j(Lz4/n;IILv3/i0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 180
    .line 181
    .line 182
    if-eqz v3, :cond_8

    .line 183
    .line 184
    iput-object v6, v0, Lb5/h;->x:Lb5/e;

    .line 185
    .line 186
    iget-object v1, v0, Lb5/h;->p:Lt5/c0;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget-object v1, v0, Lb5/h;->f:Lz4/d0$a;

    .line 192
    .line 193
    invoke-interface {v1, v0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 194
    .line 195
    .line 196
    :cond_8
    return-object p1
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
.end method

.method public final v()Lb5/a;
    .locals 2

    iget-object v0, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb5/a;

    return-object v0
.end method

.method public final w(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb5/a;

    .line 8
    .line 9
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 10
    .line 11
    iget v1, v0, Lz4/b0;->q:I

    .line 12
    .line 13
    iget v0, v0, Lz4/b0;->s:I

    .line 14
    .line 15
    add-int/2addr v1, v0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lb5/a;->e(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-le v1, v2, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    move v1, v0

    .line 26
    :cond_1
    iget-object v2, p0, Lb5/h;->v:[Lz4/b0;

    .line 27
    .line 28
    array-length v4, v2

    .line 29
    if-ge v1, v4, :cond_2

    .line 30
    .line 31
    aget-object v2, v2, v1

    .line 32
    .line 33
    iget v4, v2, Lz4/b0;->q:I

    .line 34
    .line 35
    iget v2, v2, Lz4/b0;->s:I

    .line 36
    .line 37
    add-int/2addr v4, v2

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Lb5/a;->e(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-le v4, v2, :cond_1

    .line 45
    .line 46
    return v3

    .line 47
    :cond_2
    return v0
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

.method public final x()Z
    .locals 4

    iget-wide v0, p0, Lb5/h;->A:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final y()V
    .locals 10

    .line 1
    iget-object v0, p0, Lb5/h;->u:Lz4/b0;

    .line 2
    .line 3
    iget v1, v0, Lz4/b0;->q:I

    .line 4
    .line 5
    iget v0, v0, Lz4/b0;->s:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iget v0, p0, Lb5/h;->C:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0}, Lb5/h;->z(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    iget v1, p0, Lb5/h;->C:I

    .line 17
    .line 18
    if-gt v1, v0, :cond_1

    .line 19
    .line 20
    add-int/lit8 v2, v1, 0x1

    .line 21
    .line 22
    iput v2, p0, Lb5/h;->C:I

    .line 23
    .line 24
    iget-object v2, p0, Lb5/h;->s:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lb5/a;

    .line 31
    .line 32
    iget-object v9, v1, Lb5/e;->d:Lv3/i0;

    .line 33
    .line 34
    iget-object v2, p0, Lb5/h;->y:Lv3/i0;

    .line 35
    .line 36
    invoke-virtual {v9, v2}, Lv3/i0;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    iget-object v2, p0, Lb5/h;->o:Lz4/w$a;

    .line 43
    .line 44
    iget v3, p0, Lb5/h;->a:I

    .line 45
    .line 46
    iget v5, v1, Lb5/e;->e:I

    .line 47
    .line 48
    iget-object v6, v1, Lb5/e;->f:Ljava/lang/Object;

    .line 49
    .line 50
    iget-wide v7, v1, Lb5/e;->g:J

    .line 51
    .line 52
    move-object v4, v9

    .line 53
    invoke-virtual/range {v2 .. v8}, Lz4/w$a;->b(ILv3/i0;ILjava/lang/Object;J)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iput-object v9, p0, Lb5/h;->y:Lv3/i0;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void
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

.method public final z(II)I
    .locals 2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    iget-object v0, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb5/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb5/a;->e(I)I

    move-result v0

    if-le v0, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    return p2

    :cond_1
    iget-object p1, p0, Lb5/h;->s:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.class public final Lx3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/s$b;,
        Lx3/s$a;,
        Lx3/s$c;,
        Lx3/s$i;,
        Lx3/s$f;,
        Lx3/s$j;,
        Lx3/s$h;,
        Lx3/s$k;,
        Lx3/s$e;,
        Lx3/s$d;,
        Lx3/s$g;
    }
.end annotation


# static fields
.field public static final d0:Ljava/lang/Object;

.field public static e0:Ljava/util/concurrent/ExecutorService;

.field public static f0:I


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public D:J

.field public E:J

.field public F:I

.field public G:Z

.field public H:Z

.field public I:J

.field public J:F

.field public K:[Lx3/f;

.field public L:[Ljava/nio/ByteBuffer;

.field public M:Ljava/nio/ByteBuffer;

.field public N:I

.field public O:Ljava/nio/ByteBuffer;

.field public P:[B

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Lx3/p;

.field public Y:Lx3/s$c;

.field public Z:Z

.field public final a:Lx3/e;

.field public a0:J

.field public final b:Lx3/g;

.field public b0:Z

.field public final c:Z

.field public c0:Z

.field public final d:Lx3/r;

.field public final e:Lx3/d0;

.field public final f:[Lx3/f;

.field public final g:[Lx3/f;

.field public final h:Lb5/g;

.field public final i:Lx3/o;

.field public final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lx3/s$h;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Z

.field public final l:I

.field public m:Lx3/s$k;

.field public final n:Lx3/s$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/s$i<",
            "Lx3/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lx3/s$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/s$i<",
            "Lx3/m$e;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lx3/u;

.field public q:Lw3/a0;

.field public r:Lx3/m$c;

.field public s:Lx3/s$f;

.field public t:Lx3/s$f;

.field public u:Landroid/media/AudioTrack;

.field public v:Lx3/d;

.field public w:Lx3/s$h;

.field public x:Lx3/s$h;

.field public y:Lv3/e1;

.field public z:Ljava/nio/ByteBuffer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx3/s;->d0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx3/s$e;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lx3/s$e;->a:Lx3/e;

    .line 5
    .line 6
    iput-object v0, p0, Lx3/s;->a:Lx3/e;

    .line 7
    .line 8
    iget-object v0, p1, Lx3/s$e;->b:Lx3/s$g;

    .line 9
    .line 10
    iput-object v0, p0, Lx3/s;->b:Lx3/g;

    .line 11
    .line 12
    sget v1, Lv5/e0;->a:I

    .line 13
    .line 14
    const/16 v2, 0x15

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-lt v1, v2, :cond_0

    .line 19
    .line 20
    iget-boolean v2, p1, Lx3/s$e;->c:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v4

    .line 27
    :goto_0
    iput-boolean v2, p0, Lx3/s;->c:Z

    .line 28
    .line 29
    const/16 v2, 0x17

    .line 30
    .line 31
    if-lt v1, v2, :cond_1

    .line 32
    .line 33
    iget-boolean v2, p1, Lx3/s$e;->d:Z

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v4

    .line 40
    :goto_1
    iput-boolean v2, p0, Lx3/s;->k:Z

    .line 41
    .line 42
    const/16 v2, 0x1d

    .line 43
    .line 44
    if-lt v1, v2, :cond_2

    .line 45
    .line 46
    iget v1, p1, Lx3/s$e;->e:I

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v1, v4

    .line 50
    :goto_2
    iput v1, p0, Lx3/s;->l:I

    .line 51
    .line 52
    iget-object p1, p1, Lx3/s$e;->f:Lx3/u;

    .line 53
    .line 54
    iput-object p1, p0, Lx3/s;->p:Lx3/u;

    .line 55
    .line 56
    new-instance p1, Lb5/g;

    .line 57
    .line 58
    invoke-direct {p1}, Lb5/g;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lx3/s;->h:Lb5/g;

    .line 62
    .line 63
    invoke-virtual {p1}, Lb5/g;->a()Z

    .line 64
    .line 65
    .line 66
    new-instance p1, Lx3/o;

    .line 67
    .line 68
    new-instance v1, Lx3/s$j;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lx3/s$j;-><init>(Lx3/s;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v1}, Lx3/o;-><init>(Lx3/s$j;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lx3/s;->i:Lx3/o;

    .line 77
    .line 78
    new-instance p1, Lx3/r;

    .line 79
    .line 80
    invoke-direct {p1}, Lx3/r;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lx3/s;->d:Lx3/r;

    .line 84
    .line 85
    new-instance v1, Lx3/d0;

    .line 86
    .line 87
    invoke-direct {v1}, Lx3/d0;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lx3/s;->e:Lx3/d0;

    .line 91
    .line 92
    new-instance v2, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    const/4 v5, 0x3

    .line 98
    new-array v5, v5, [Lx3/q;

    .line 99
    .line 100
    new-instance v6, Lx3/z;

    .line 101
    .line 102
    invoke-direct {v6}, Lx3/z;-><init>()V

    .line 103
    .line 104
    .line 105
    aput-object v6, v5, v4

    .line 106
    .line 107
    aput-object p1, v5, v3

    .line 108
    .line 109
    const/4 p1, 0x2

    .line 110
    aput-object v1, v5, p1

    .line 111
    .line 112
    invoke-static {v2, v5}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object p1, v0, Lx3/s$g;->a:[Lx3/f;

    .line 116
    .line 117
    invoke-static {v2, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    new-array p1, v4, [Lx3/f;

    .line 121
    .line 122
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, [Lx3/f;

    .line 127
    .line 128
    iput-object p1, p0, Lx3/s;->f:[Lx3/f;

    .line 129
    .line 130
    new-array p1, v3, [Lx3/f;

    .line 131
    .line 132
    new-instance v0, Lx3/w;

    .line 133
    .line 134
    invoke-direct {v0}, Lx3/w;-><init>()V

    .line 135
    .line 136
    .line 137
    aput-object v0, p1, v4

    .line 138
    .line 139
    iput-object p1, p0, Lx3/s;->g:[Lx3/f;

    .line 140
    .line 141
    const/high16 p1, 0x3f800000    # 1.0f

    .line 142
    .line 143
    iput p1, p0, Lx3/s;->J:F

    .line 144
    .line 145
    sget-object p1, Lx3/d;->o:Lx3/d;

    .line 146
    .line 147
    iput-object p1, p0, Lx3/s;->v:Lx3/d;

    .line 148
    .line 149
    iput v4, p0, Lx3/s;->W:I

    .line 150
    .line 151
    new-instance p1, Lx3/p;

    .line 152
    .line 153
    invoke-direct {p1}, Lx3/p;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Lx3/s;->X:Lx3/p;

    .line 157
    .line 158
    new-instance p1, Lx3/s$h;

    .line 159
    .line 160
    sget-object v0, Lv3/e1;->d:Lv3/e1;

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const-wide/16 v8, 0x0

    .line 164
    .line 165
    const-wide/16 v10, 0x0

    .line 166
    .line 167
    move-object v5, p1

    .line 168
    move-object v6, v0

    .line 169
    invoke-direct/range {v5 .. v11}, Lx3/s$h;-><init>(Lv3/e1;ZJJ)V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lx3/s;->x:Lx3/s$h;

    .line 173
    .line 174
    iput-object v0, p0, Lx3/s;->y:Lv3/e1;

    .line 175
    .line 176
    const/4 p1, -0x1

    .line 177
    iput p1, p0, Lx3/s;->R:I

    .line 178
    .line 179
    new-array p1, v4, [Lx3/f;

    .line 180
    .line 181
    iput-object p1, p0, Lx3/s;->K:[Lx3/f;

    .line 182
    .line 183
    new-array p1, v4, [Ljava/nio/ByteBuffer;

    .line 184
    .line 185
    iput-object p1, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    new-instance p1, Ljava/util/ArrayDeque;

    .line 188
    .line 189
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 193
    .line 194
    new-instance p1, Lx3/s$i;

    .line 195
    .line 196
    invoke-direct {p1}, Lx3/s$i;-><init>()V

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Lx3/s;->n:Lx3/s$i;

    .line 200
    .line 201
    new-instance p1, Lx3/s$i;

    .line 202
    .line 203
    invoke-direct {p1}, Lx3/s$i;-><init>()V

    .line 204
    .line 205
    .line 206
    iput-object p1, p0, Lx3/s;->o:Lx3/s$i;

    .line 207
    .line 208
    return-void
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

.method public static D(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Laa/v;->r(Landroid/media/AudioTrack;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static x(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()J
    .locals 5

    iget-object v0, p0, Lx3/s;->t:Lx3/s$f;

    iget v1, v0, Lx3/s$f;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lx3/s;->D:J

    iget v0, v0, Lx3/s$f;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lx3/s;->E:J

    :goto_0
    return-wide v1
.end method

.method public final B()Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lx3/s;->h:Lb5/g;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-boolean v0, v2, Lb5/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit v2

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    :try_start_1
    iget-object v0, v1, Lx3/s;->t:Lx3/s$f;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Lx3/m$b; {:try_start_1 .. :try_end_1} :catch_1

    .line 17
    .line 18
    .line 19
    :try_start_2
    iget-boolean v4, v1, Lx3/s;->Z:Z

    .line 20
    .line 21
    iget-object v5, v1, Lx3/s;->v:Lx3/d;

    .line 22
    .line 23
    iget v6, v1, Lx3/s;->W:I

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5, v6}, Lx3/s$f;->a(ZLx3/d;I)Landroid/media/AudioTrack;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_2
    .catch Lx3/m$b; {:try_start_2 .. :try_end_2} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    :try_start_3
    iget-object v4, v1, Lx3/s;->r:Lx3/m$c;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    check-cast v4, Lx3/x$b;

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Lx3/x$b;->a(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    throw v0
    :try_end_3
    .catch Lx3/m$b; {:try_start_3 .. :try_end_3} :catch_1

    .line 41
    :catch_1
    move-exception v0

    .line 42
    move-object v4, v0

    .line 43
    iget-object v0, v1, Lx3/s;->t:Lx3/s$f;

    .line 44
    .line 45
    iget v5, v0, Lx3/s$f;->h:I

    .line 46
    .line 47
    const v6, 0xf4240

    .line 48
    .line 49
    .line 50
    if-le v5, v6, :cond_9

    .line 51
    .line 52
    const v15, 0xf4240

    .line 53
    .line 54
    .line 55
    new-instance v5, Lx3/s$f;

    .line 56
    .line 57
    iget-object v8, v0, Lx3/s$f;->a:Lv3/i0;

    .line 58
    .line 59
    iget v9, v0, Lx3/s$f;->b:I

    .line 60
    .line 61
    iget v10, v0, Lx3/s$f;->c:I

    .line 62
    .line 63
    iget v11, v0, Lx3/s$f;->d:I

    .line 64
    .line 65
    iget v12, v0, Lx3/s$f;->e:I

    .line 66
    .line 67
    iget v13, v0, Lx3/s$f;->f:I

    .line 68
    .line 69
    iget v14, v0, Lx3/s$f;->g:I

    .line 70
    .line 71
    iget-object v0, v0, Lx3/s$f;->i:[Lx3/f;

    .line 72
    .line 73
    move-object v7, v5

    .line 74
    move-object/from16 v16, v0

    .line 75
    .line 76
    invoke-direct/range {v7 .. v16}, Lx3/s$f;-><init>(Lv3/i0;IIIIIII[Lx3/f;)V

    .line 77
    .line 78
    .line 79
    :try_start_4
    iget-boolean v0, v1, Lx3/s;->Z:Z

    .line 80
    .line 81
    iget-object v6, v1, Lx3/s;->v:Lx3/d;

    .line 82
    .line 83
    iget v7, v1, Lx3/s;->W:I

    .line 84
    .line 85
    invoke-virtual {v5, v0, v6, v7}, Lx3/s$f;->a(ZLx3/d;I)Landroid/media/AudioTrack;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_4
    .catch Lx3/m$b; {:try_start_4 .. :try_end_4} :catch_3

    .line 89
    :try_start_5
    iput-object v5, v1, Lx3/s;->t:Lx3/s$f;
    :try_end_5
    .catch Lx3/m$b; {:try_start_5 .. :try_end_5} :catch_2

    .line 90
    .line 91
    :goto_0
    iput-object v0, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 92
    .line 93
    invoke-static {v0}, Lx3/s;->D(Landroid/media/AudioTrack;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget-object v0, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 100
    .line 101
    iget-object v4, v1, Lx3/s;->m:Lx3/s$k;

    .line 102
    .line 103
    if-nez v4, :cond_2

    .line 104
    .line 105
    new-instance v4, Lx3/s$k;

    .line 106
    .line 107
    invoke-direct {v4, v1}, Lx3/s$k;-><init>(Lx3/s;)V

    .line 108
    .line 109
    .line 110
    iput-object v4, v1, Lx3/s;->m:Lx3/s$k;

    .line 111
    .line 112
    :cond_2
    iget-object v4, v1, Lx3/s;->m:Lx3/s$k;

    .line 113
    .line 114
    iget-object v5, v4, Lx3/s$k;->a:Landroid/os/Handler;

    .line 115
    .line 116
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    new-instance v6, Lx3/t;

    .line 120
    .line 121
    invoke-direct {v6, v5, v2}, Lx3/t;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    iget-object v4, v4, Lx3/s$k;->b:Lx3/s$k$a;

    .line 125
    .line 126
    invoke-static {v0, v6, v4}, Laa/u;->l(Landroid/media/AudioTrack;Lx3/t;Lx3/s$k$a;)V

    .line 127
    .line 128
    .line 129
    iget v0, v1, Lx3/s;->l:I

    .line 130
    .line 131
    const/4 v4, 0x3

    .line 132
    if-eq v0, v4, :cond_3

    .line 133
    .line 134
    iget-object v0, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 135
    .line 136
    iget-object v4, v1, Lx3/s;->t:Lx3/s$f;

    .line 137
    .line 138
    iget-object v4, v4, Lx3/s$f;->a:Lv3/i0;

    .line 139
    .line 140
    iget v5, v4, Lv3/i0;->J:I

    .line 141
    .line 142
    iget v4, v4, Lv3/i0;->K:I

    .line 143
    .line 144
    invoke-static {v0, v5, v4}, Laa/u;->k(Landroid/media/AudioTrack;II)V

    .line 145
    .line 146
    .line 147
    :cond_3
    sget v0, Lv5/e0;->a:I

    .line 148
    .line 149
    const/16 v4, 0x1f

    .line 150
    .line 151
    if-lt v0, v4, :cond_4

    .line 152
    .line 153
    iget-object v4, v1, Lx3/s;->q:Lw3/a0;

    .line 154
    .line 155
    if-eqz v4, :cond_4

    .line 156
    .line 157
    iget-object v5, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 158
    .line 159
    invoke-static {v5, v4}, Lx3/s$b;->a(Landroid/media/AudioTrack;Lw3/a0;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    iget-object v4, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 163
    .line 164
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    iput v4, v1, Lx3/s;->W:I

    .line 169
    .line 170
    iget-object v5, v1, Lx3/s;->i:Lx3/o;

    .line 171
    .line 172
    iget-object v6, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 173
    .line 174
    iget-object v4, v1, Lx3/s;->t:Lx3/s$f;

    .line 175
    .line 176
    iget v7, v4, Lx3/s$f;->c:I

    .line 177
    .line 178
    const/4 v8, 0x2

    .line 179
    if-ne v7, v8, :cond_5

    .line 180
    .line 181
    move v7, v3

    .line 182
    goto :goto_1

    .line 183
    :cond_5
    move v7, v2

    .line 184
    :goto_1
    iget v8, v4, Lx3/s$f;->g:I

    .line 185
    .line 186
    iget v9, v4, Lx3/s$f;->d:I

    .line 187
    .line 188
    iget v10, v4, Lx3/s$f;->h:I

    .line 189
    .line 190
    invoke-virtual/range {v5 .. v10}, Lx3/o;->d(Landroid/media/AudioTrack;ZIII)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, Lx3/s;->J()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v1, Lx3/s;->X:Lx3/p;

    .line 197
    .line 198
    iget v2, v2, Lx3/p;->a:I

    .line 199
    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    iget-object v4, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 203
    .line 204
    invoke-virtual {v4, v2}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 205
    .line 206
    .line 207
    iget-object v2, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 208
    .line 209
    iget-object v4, v1, Lx3/s;->X:Lx3/p;

    .line 210
    .line 211
    iget v4, v4, Lx3/p;->b:F

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 214
    .line 215
    .line 216
    :cond_6
    iget-object v2, v1, Lx3/s;->Y:Lx3/s$c;

    .line 217
    .line 218
    if-eqz v2, :cond_7

    .line 219
    .line 220
    const/16 v4, 0x17

    .line 221
    .line 222
    if-lt v0, v4, :cond_7

    .line 223
    .line 224
    iget-object v0, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 225
    .line 226
    invoke-static {v0, v2}, Lx3/s$a;->a(Landroid/media/AudioTrack;Lx3/s$c;)V

    .line 227
    .line 228
    .line 229
    :cond_7
    iput-boolean v3, v1, Lx3/s;->H:Z

    .line 230
    .line 231
    return v3

    .line 232
    :catch_2
    move-exception v0

    .line 233
    goto :goto_2

    .line 234
    :catch_3
    move-exception v0

    .line 235
    :try_start_6
    iget-object v5, v1, Lx3/s;->r:Lx3/m$c;

    .line 236
    .line 237
    if-eqz v5, :cond_8

    .line 238
    .line 239
    check-cast v5, Lx3/x$b;

    .line 240
    .line 241
    invoke-virtual {v5, v0}, Lx3/x$b;->a(Ljava/lang/Exception;)V

    .line 242
    .line 243
    .line 244
    :cond_8
    throw v0
    :try_end_6
    .catch Lx3/m$b; {:try_start_6 .. :try_end_6} :catch_2

    .line 245
    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    iget-object v0, v1, Lx3/s;->t:Lx3/s$f;

    .line 249
    .line 250
    iget v0, v0, Lx3/s$f;->c:I

    .line 251
    .line 252
    if-ne v0, v3, :cond_a

    .line 253
    .line 254
    move v2, v3

    .line 255
    :cond_a
    if-nez v2, :cond_b

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_b
    iput-boolean v3, v1, Lx3/s;->b0:Z

    .line 259
    .line 260
    :goto_3
    throw v4

    .line 261
    :catchall_0
    move-exception v0

    .line 262
    move-object v3, v0

    .line 263
    monitor-exit v2

    .line 264
    throw v3
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

.method public final C()Z
    .locals 1

    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final E()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lx3/s;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lx3/s;->T:Z

    .line 7
    .line 8
    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    .line 9
    .line 10
    invoke-virtual {p0}, Lx3/s;->A()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0}, Lx3/o;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v0, Lx3/o;->A:J

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    const-wide/16 v5, 0x3e8

    .line 25
    .line 26
    mul-long/2addr v3, v5

    .line 27
    iput-wide v3, v0, Lx3/o;->y:J

    .line 28
    .line 29
    iput-wide v1, v0, Lx3/o;->B:J

    .line 30
    .line 31
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lx3/s;->A:I

    .line 38
    .line 39
    :cond_0
    return-void
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

.method public final F(J)V
    .locals 5

    iget-object v0, p0, Lx3/s;->K:[Lx3/f;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lx3/s;->M:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lx3/f;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lx3/s;->M(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lx3/s;->K:[Lx3/f;

    aget-object v3, v3, v1

    iget v4, p0, Lx3/s;->R:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Lx3/f;->b(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Lx3/f;->a()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final G()V
    .locals 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lx3/s;->B:J

    .line 4
    .line 5
    iput-wide v0, p0, Lx3/s;->C:J

    .line 6
    .line 7
    iput-wide v0, p0, Lx3/s;->D:J

    .line 8
    .line 9
    iput-wide v0, p0, Lx3/s;->E:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, Lx3/s;->c0:Z

    .line 13
    .line 14
    iput v2, p0, Lx3/s;->F:I

    .line 15
    .line 16
    new-instance v10, Lx3/s$h;

    .line 17
    .line 18
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v4, v3, Lx3/s$h;->a:Lv3/e1;

    .line 23
    .line 24
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-boolean v5, v3, Lx3/s$h;->b:Z

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    move-object v3, v10

    .line 35
    invoke-direct/range {v3 .. v9}, Lx3/s$h;-><init>(Lv3/e1;ZJJ)V

    .line 36
    .line 37
    .line 38
    iput-object v10, p0, Lx3/s;->x:Lx3/s$h;

    .line 39
    .line 40
    iput-wide v0, p0, Lx3/s;->I:J

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    iput-object v3, p0, Lx3/s;->w:Lx3/s$h;

    .line 44
    .line 45
    iget-object v4, p0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    iput v2, p0, Lx3/s;->N:I

    .line 53
    .line 54
    iput-object v3, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    iput-boolean v2, p0, Lx3/s;->T:Z

    .line 57
    .line 58
    iput-boolean v2, p0, Lx3/s;->S:Z

    .line 59
    .line 60
    const/4 v4, -0x1

    .line 61
    iput v4, p0, Lx3/s;->R:I

    .line 62
    .line 63
    iput-object v3, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    iput v2, p0, Lx3/s;->A:I

    .line 66
    .line 67
    iget-object v3, p0, Lx3/s;->e:Lx3/d0;

    .line 68
    .line 69
    iput-wide v0, v3, Lx3/d0;->o:J

    .line 70
    .line 71
    :goto_0
    iget-object v0, p0, Lx3/s;->K:[Lx3/f;

    .line 72
    .line 73
    array-length v1, v0

    .line 74
    if-ge v2, v1, :cond_0

    .line 75
    .line 76
    aget-object v0, v0, v2

    .line 77
    .line 78
    invoke-interface {v0}, Lx3/f;->flush()V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    invoke-interface {v0}, Lx3/f;->a()Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    aput-object v0, v1, v2

    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    return-void
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

.method public final H(Lv3/e1;Z)V
    .locals 8

    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    move-result-object v0

    iget-object v1, v0, Lx3/s$h;->a:Lv3/e1;

    invoke-virtual {p1, v1}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lx3/s$h;->b:Z

    if-eq p2, v0, :cond_2

    :cond_0
    new-instance v0, Lx3/s$h;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v7}, Lx3/s$h;-><init>(Lv3/e1;ZJJ)V

    invoke-virtual {p0}, Lx3/s;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Lx3/s;->w:Lx3/s$h;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lx3/s;->x:Lx3/s$h;

    :cond_2
    :goto_0
    return-void
.end method

.method public final I(Lv3/e1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx3/s;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p1, Lv3/e1;->a:F

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget p1, p1, Lv3/e1;->b:F

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :try_start_0
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p1

    .line 40
    const-string v0, "DefaultAudioSink"

    .line 41
    .line 42
    const-string v1, "Failed to set playback params"

    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance p1, Lv3/e1;

    .line 48
    .line 49
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-direct {p1, v0, v1}, Lv3/e1;-><init>(FF)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    .line 73
    .line 74
    iget v1, p1, Lv3/e1;->a:F

    .line 75
    .line 76
    iput v1, v0, Lx3/o;->j:F

    .line 77
    .line 78
    iget-object v1, v0, Lx3/o;->f:Lx3/n;

    .line 79
    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    invoke-virtual {v1}, Lx3/n;->a()V

    .line 83
    .line 84
    .line 85
    :cond_0
    invoke-virtual {v0}, Lx3/o;->c()V

    .line 86
    .line 87
    .line 88
    :cond_1
    iput-object p1, p0, Lx3/s;->y:Lv3/e1;

    .line 89
    .line 90
    return-void
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
.end method

.method public final J()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx3/s;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget v0, Lv5/e0;->a:I

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    if-lt v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 15
    .line 16
    iget v1, p0, Lx3/s;->J:F

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 23
    .line 24
    iget v1, p0, Lx3/s;->J:F

    .line 25
    .line 26
    invoke-virtual {v0, v1, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public final K()Z
    .locals 4

    iget-boolean v0, p0, Lx3/s;->Z:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, Lx3/s;->t:Lx3/s$f;

    iget-object v0, v0, Lx3/s$f;->a:Lv3/i0;

    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lx3/s;->t:Lx3/s$f;

    iget-object v0, v0, Lx3/s$f;->a:Lv3/i0;

    iget v0, v0, Lv3/i0;->I:I

    iget-boolean v3, p0, Lx3/s;->c:Z

    if-eqz v3, :cond_2

    sget v3, Lv5/e0;->a:I

    const/high16 v3, 0x20000000

    if-eq v0, v3, :cond_1

    const/high16 v3, 0x30000000

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    return v1
.end method

.method public final L(Lv3/i0;Lx3/d;)Z
    .locals 6

    .line 1
    sget v0, Lv5/e0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1d

    .line 5
    .line 6
    if-lt v0, v2, :cond_c

    .line 7
    .line 8
    iget v2, p0, Lx3/s;->l:I

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    iget-object v2, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v3, p1, Lv3/i0;->q:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v2, v3}, Lv5/p;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    iget v3, p1, Lv3/i0;->G:I

    .line 29
    .line 30
    invoke-static {v3}, Lv5/e0;->o(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    iget v4, p1, Lv3/i0;->H:I

    .line 38
    .line 39
    invoke-static {v4, v3, v2}, Lx3/s;->x(III)Landroid/media/AudioFormat;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p2}, Lx3/d;->a()Lx3/d$c;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget-object p2, p2, Lx3/d$c;->a:Landroid/media/AudioAttributes;

    .line 48
    .line 49
    const/16 v3, 0x1f

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    const/4 v5, 0x1

    .line 53
    if-lt v0, v3, :cond_3

    .line 54
    .line 55
    invoke-static {v2, p2}, Le0/h0;->c(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {v2, p2}, Laa/u;->x(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    move p2, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/16 p2, 0x1e

    .line 69
    .line 70
    if-ne v0, p2, :cond_5

    .line 71
    .line 72
    sget-object p2, Lv5/e0;->d:Ljava/lang/String;

    .line 73
    .line 74
    const-string v0, "Pixel"

    .line 75
    .line 76
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_5

    .line 81
    .line 82
    move p2, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    move p2, v5

    .line 85
    :goto_0
    if-eqz p2, :cond_c

    .line 86
    .line 87
    if-eq p2, v5, :cond_7

    .line 88
    .line 89
    if-ne p2, v4, :cond_6

    .line 90
    .line 91
    return v5

    .line 92
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_7
    iget p2, p1, Lv3/i0;->J:I

    .line 99
    .line 100
    if-nez p2, :cond_9

    .line 101
    .line 102
    iget p1, p1, Lv3/i0;->K:I

    .line 103
    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_8
    move p1, v1

    .line 108
    goto :goto_2

    .line 109
    :cond_9
    :goto_1
    move p1, v5

    .line 110
    :goto_2
    iget p2, p0, Lx3/s;->l:I

    .line 111
    .line 112
    if-ne p2, v5, :cond_a

    .line 113
    .line 114
    move p2, v5

    .line 115
    goto :goto_3

    .line 116
    :cond_a
    move p2, v1

    .line 117
    :goto_3
    if-eqz p1, :cond_b

    .line 118
    .line 119
    if-nez p2, :cond_c

    .line 120
    .line 121
    :cond_b
    move v1, v5

    .line 122
    :cond_c
    :goto_4
    return v1
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
.end method

.method public final M(Ljava/nio/ByteBuffer;J)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-ne v0, p1, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v0, v3

    .line 21
    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iput-object p1, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    sget v0, Lv5/e0;->a:I

    .line 28
    .line 29
    if-ge v0, v1, :cond_5

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v4, p0, Lx3/s;->P:[B

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    array-length v4, v4

    .line 40
    if-ge v4, v0, :cond_4

    .line 41
    .line 42
    :cond_3
    new-array v4, v0, [B

    .line 43
    .line 44
    iput-object v4, p0, Lx3/s;->P:[B

    .line 45
    .line 46
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Lx3/s;->P:[B

    .line 51
    .line 52
    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    iput v3, p0, Lx3/s;->Q:I

    .line 59
    .line 60
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sget v4, Lv5/e0;->a:I

    .line 65
    .line 66
    if-ge v4, v1, :cond_7

    .line 67
    .line 68
    iget-object p2, p0, Lx3/s;->i:Lx3/o;

    .line 69
    .line 70
    iget-wide v5, p0, Lx3/s;->D:J

    .line 71
    .line 72
    invoke-virtual {p2}, Lx3/o;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    iget p3, p2, Lx3/o;->d:I

    .line 77
    .line 78
    int-to-long v9, p3

    .line 79
    mul-long/2addr v7, v9

    .line 80
    sub-long/2addr v5, v7

    .line 81
    long-to-int p3, v5

    .line 82
    iget p2, p2, Lx3/o;->e:I

    .line 83
    .line 84
    sub-int/2addr p2, p3

    .line 85
    if-lez p2, :cond_6

    .line 86
    .line 87
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    iget-object p3, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 92
    .line 93
    iget-object v1, p0, Lx3/s;->P:[B

    .line 94
    .line 95
    iget v5, p0, Lx3/s;->Q:I

    .line 96
    .line 97
    invoke-virtual {p3, v1, v5, p2}, Landroid/media/AudioTrack;->write([BII)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-lez p2, :cond_10

    .line 102
    .line 103
    iget p3, p0, Lx3/s;->Q:I

    .line 104
    .line 105
    add-int/2addr p3, p2

    .line 106
    iput p3, p0, Lx3/s;->Q:I

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    add-int/2addr p3, p2

    .line 113
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 114
    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_6
    :goto_2
    move p2, v3

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_7
    iget-boolean v1, p0, Lx3/s;->Z:Z

    .line 122
    .line 123
    if-eqz v1, :cond_f

    .line 124
    .line 125
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    cmp-long v1, p2, v5

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    move v1, v2

    .line 135
    goto :goto_3

    .line 136
    :cond_8
    move v1, v3

    .line 137
    :goto_3
    invoke-static {v1}, Lx6/b;->H(Z)V

    .line 138
    .line 139
    .line 140
    iget-object v6, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 141
    .line 142
    const-wide/16 v7, 0x3e8

    .line 143
    .line 144
    const/16 v1, 0x1a

    .line 145
    .line 146
    if-lt v4, v1, :cond_9

    .line 147
    .line 148
    const/4 v9, 0x1

    .line 149
    mul-long v10, p2, v7

    .line 150
    .line 151
    move-object v7, p1

    .line 152
    move v8, v0

    .line 153
    invoke-virtual/range {v6 .. v11}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    goto :goto_4

    .line 158
    :cond_9
    iget-object v1, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    if-nez v1, :cond_a

    .line 161
    .line 162
    const/16 v1, 0x10

    .line 163
    .line 164
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iput-object v1, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 171
    .line 172
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 176
    .line 177
    const v5, 0x55550001

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    .line 183
    :cond_a
    iget v1, p0, Lx3/s;->A:I

    .line 184
    .line 185
    if-nez v1, :cond_b

    .line 186
    .line 187
    iget-object v1, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    const/4 v5, 0x4

    .line 190
    invoke-virtual {v1, v5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 194
    .line 195
    const/16 v5, 0x8

    .line 196
    .line 197
    mul-long/2addr p2, v7

    .line 198
    invoke-virtual {v1, v5, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 199
    .line 200
    .line 201
    iget-object p2, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 204
    .line 205
    .line 206
    iput v0, p0, Lx3/s;->A:I

    .line 207
    .line 208
    :cond_b
    iget-object p2, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    if-lez p2, :cond_d

    .line 215
    .line 216
    iget-object p3, p0, Lx3/s;->z:Ljava/nio/ByteBuffer;

    .line 217
    .line 218
    invoke-virtual {v6, p3, p2, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 219
    .line 220
    .line 221
    move-result p3

    .line 222
    if-gez p3, :cond_c

    .line 223
    .line 224
    iput v3, p0, Lx3/s;->A:I

    .line 225
    .line 226
    move p2, p3

    .line 227
    goto :goto_4

    .line 228
    :cond_c
    if-ge p3, p2, :cond_d

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_d
    invoke-virtual {v6, p1, v0, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-gez p2, :cond_e

    .line 236
    .line 237
    iput v3, p0, Lx3/s;->A:I

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_e
    iget p3, p0, Lx3/s;->A:I

    .line 241
    .line 242
    sub-int/2addr p3, p2

    .line 243
    iput p3, p0, Lx3/s;->A:I

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_f
    iget-object p2, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 247
    .line 248
    invoke-virtual {p2, p1, v0, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    :cond_10
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 253
    .line 254
    .line 255
    move-result-wide v5

    .line 256
    iput-wide v5, p0, Lx3/s;->a0:J

    .line 257
    .line 258
    const-wide/16 v5, 0x0

    .line 259
    .line 260
    if-gez p2, :cond_17

    .line 261
    .line 262
    const/16 p1, 0x18

    .line 263
    .line 264
    if-lt v4, p1, :cond_11

    .line 265
    .line 266
    const/4 p1, -0x6

    .line 267
    if-eq p2, p1, :cond_12

    .line 268
    .line 269
    :cond_11
    const/16 p1, -0x20

    .line 270
    .line 271
    if-ne p2, p1, :cond_13

    .line 272
    .line 273
    :cond_12
    move p1, v2

    .line 274
    goto :goto_5

    .line 275
    :cond_13
    move p1, v3

    .line 276
    :goto_5
    if-eqz p1, :cond_14

    .line 277
    .line 278
    iget-wide v0, p0, Lx3/s;->E:J

    .line 279
    .line 280
    cmp-long p1, v0, v5

    .line 281
    .line 282
    if-lez p1, :cond_14

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_14
    move v2, v3

    .line 286
    :goto_6
    new-instance p1, Lx3/m$e;

    .line 287
    .line 288
    iget-object p3, p0, Lx3/s;->t:Lx3/s$f;

    .line 289
    .line 290
    iget-object p3, p3, Lx3/s$f;->a:Lv3/i0;

    .line 291
    .line 292
    invoke-direct {p1, p2, p3, v2}, Lx3/m$e;-><init>(ILv3/i0;Z)V

    .line 293
    .line 294
    .line 295
    iget-object p2, p0, Lx3/s;->r:Lx3/m$c;

    .line 296
    .line 297
    if-eqz p2, :cond_15

    .line 298
    .line 299
    check-cast p2, Lx3/x$b;

    .line 300
    .line 301
    invoke-virtual {p2, p1}, Lx3/x$b;->a(Ljava/lang/Exception;)V

    .line 302
    .line 303
    .line 304
    :cond_15
    iget-boolean p2, p1, Lx3/m$e;->b:Z

    .line 305
    .line 306
    if-nez p2, :cond_16

    .line 307
    .line 308
    iget-object p2, p0, Lx3/s;->o:Lx3/s$i;

    .line 309
    .line 310
    invoke-virtual {p2, p1}, Lx3/s$i;->a(Ljava/lang/Exception;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_16
    throw p1

    .line 315
    :cond_17
    iget-object p3, p0, Lx3/s;->o:Lx3/s$i;

    .line 316
    .line 317
    const/4 v1, 0x0

    .line 318
    iput-object v1, p3, Lx3/s$i;->a:Ljava/lang/Exception;

    .line 319
    .line 320
    iget-object p3, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 321
    .line 322
    invoke-static {p3}, Lx3/s;->D(Landroid/media/AudioTrack;)Z

    .line 323
    .line 324
    .line 325
    move-result p3

    .line 326
    if-eqz p3, :cond_19

    .line 327
    .line 328
    iget-wide v7, p0, Lx3/s;->E:J

    .line 329
    .line 330
    cmp-long p3, v7, v5

    .line 331
    .line 332
    if-lez p3, :cond_18

    .line 333
    .line 334
    iput-boolean v3, p0, Lx3/s;->c0:Z

    .line 335
    .line 336
    :cond_18
    iget-boolean p3, p0, Lx3/s;->U:Z

    .line 337
    .line 338
    if-eqz p3, :cond_19

    .line 339
    .line 340
    iget-object p3, p0, Lx3/s;->r:Lx3/m$c;

    .line 341
    .line 342
    if-eqz p3, :cond_19

    .line 343
    .line 344
    if-ge p2, v0, :cond_19

    .line 345
    .line 346
    iget-boolean v4, p0, Lx3/s;->c0:Z

    .line 347
    .line 348
    if-nez v4, :cond_19

    .line 349
    .line 350
    check-cast p3, Lx3/x$b;

    .line 351
    .line 352
    iget-object p3, p3, Lx3/x$b;->a:Lx3/x;

    .line 353
    .line 354
    iget-object p3, p3, Lx3/x;->V0:Lv3/j1$a;

    .line 355
    .line 356
    if-eqz p3, :cond_19

    .line 357
    .line 358
    invoke-interface {p3}, Lv3/j1$a;->a()V

    .line 359
    .line 360
    .line 361
    :cond_19
    iget-object p3, p0, Lx3/s;->t:Lx3/s$f;

    .line 362
    .line 363
    iget p3, p3, Lx3/s$f;->c:I

    .line 364
    .line 365
    if-nez p3, :cond_1a

    .line 366
    .line 367
    iget-wide v4, p0, Lx3/s;->D:J

    .line 368
    .line 369
    int-to-long v6, p2

    .line 370
    add-long/2addr v4, v6

    .line 371
    iput-wide v4, p0, Lx3/s;->D:J

    .line 372
    .line 373
    :cond_1a
    if-ne p2, v0, :cond_1d

    .line 374
    .line 375
    if-eqz p3, :cond_1c

    .line 376
    .line 377
    iget-object p2, p0, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    if-ne p1, p2, :cond_1b

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_1b
    move v2, v3

    .line 383
    :goto_7
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 384
    .line 385
    .line 386
    iget-wide p1, p0, Lx3/s;->E:J

    .line 387
    .line 388
    iget p3, p0, Lx3/s;->F:I

    .line 389
    .line 390
    int-to-long v2, p3

    .line 391
    iget p3, p0, Lx3/s;->N:I

    .line 392
    .line 393
    int-to-long v4, p3

    .line 394
    mul-long/2addr v2, v4

    .line 395
    add-long/2addr v2, p1

    .line 396
    iput-wide v2, p0, Lx3/s;->E:J

    .line 397
    .line 398
    :cond_1c
    iput-object v1, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    .line 399
    .line 400
    :cond_1d
    return-void
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
.end method

.method public final a(Lv3/i0;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lx3/s;->u(Lv3/i0;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx3/s;->U:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lx3/s;->C()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    .line 11
    .line 12
    iget-object v0, v0, Lx3/o;->f:Lx3/n;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lx3/n;->a()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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

.method public final c(Lv3/e1;)V
    .locals 4

    .line 1
    new-instance v0, Lv3/e1;

    .line 2
    .line 3
    iget v1, p1, Lv3/e1;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lv5/e0;->h(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget p1, p1, Lv3/e1;->b:F

    .line 15
    .line 16
    invoke-static {p1, v2, v3}, Lv5/e0;->h(FFF)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-direct {v0, v1, p1}, Lv3/e1;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, Lx3/s;->k:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    sget p1, Lv5/e0;->a:I

    .line 28
    .line 29
    const/16 v1, 0x17

    .line 30
    .line 31
    if-lt p1, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lx3/s;->I(Lv3/e1;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-boolean p1, p1, Lx3/s$h;->b:Z

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1}, Lx3/s;->H(Lv3/e1;Z)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void
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

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lx3/s;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lx3/s;->S:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx3/s;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final e(Lv3/i0;[I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v3, Lv3/i0;->t:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "audio/raw"

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, -0x1

    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x2

    .line 19
    if-eqz v0, :cond_8

    .line 20
    .line 21
    iget v0, v3, Lv3/i0;->I:I

    .line 22
    .line 23
    invoke-static {v0}, Lv5/e0;->F(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 28
    .line 29
    .line 30
    iget v0, v3, Lv3/i0;->I:I

    .line 31
    .line 32
    iget v8, v3, Lv3/i0;->G:I

    .line 33
    .line 34
    invoke-static {v0, v8}, Lv5/e0;->w(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v8, v3, Lv3/i0;->I:I

    .line 39
    .line 40
    iget-boolean v9, v1, Lx3/s;->c:Z

    .line 41
    .line 42
    if-eqz v9, :cond_2

    .line 43
    .line 44
    const/high16 v9, 0x20000000

    .line 45
    .line 46
    if-eq v8, v9, :cond_1

    .line 47
    .line 48
    const/high16 v9, 0x30000000

    .line 49
    .line 50
    if-eq v8, v9, :cond_1

    .line 51
    .line 52
    const/4 v9, 0x4

    .line 53
    if-ne v8, v9, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v8, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    :goto_0
    move v8, v6

    .line 59
    :goto_1
    if-eqz v8, :cond_2

    .line 60
    .line 61
    move v8, v6

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v8, v5

    .line 64
    :goto_2
    if-eqz v8, :cond_3

    .line 65
    .line 66
    iget-object v8, v1, Lx3/s;->g:[Lx3/f;

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget-object v8, v1, Lx3/s;->f:[Lx3/f;

    .line 70
    .line 71
    :goto_3
    iget-object v9, v1, Lx3/s;->e:Lx3/d0;

    .line 72
    .line 73
    iget v10, v3, Lv3/i0;->J:I

    .line 74
    .line 75
    iget v11, v3, Lv3/i0;->K:I

    .line 76
    .line 77
    iput v10, v9, Lx3/d0;->i:I

    .line 78
    .line 79
    iput v11, v9, Lx3/d0;->j:I

    .line 80
    .line 81
    sget v9, Lv5/e0;->a:I

    .line 82
    .line 83
    const/16 v10, 0x15

    .line 84
    .line 85
    if-ge v9, v10, :cond_4

    .line 86
    .line 87
    iget v9, v3, Lv3/i0;->G:I

    .line 88
    .line 89
    if-ne v9, v4, :cond_4

    .line 90
    .line 91
    if-nez p2, :cond_4

    .line 92
    .line 93
    const/4 v9, 0x6

    .line 94
    new-array v10, v9, [I

    .line 95
    .line 96
    move v11, v5

    .line 97
    :goto_4
    if-ge v11, v9, :cond_5

    .line 98
    .line 99
    aput v11, v10, v11

    .line 100
    .line 101
    add-int/lit8 v11, v11, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    move-object/from16 v10, p2

    .line 105
    .line 106
    :cond_5
    iget-object v9, v1, Lx3/s;->d:Lx3/r;

    .line 107
    .line 108
    iput-object v10, v9, Lx3/r;->i:[I

    .line 109
    .line 110
    new-instance v9, Lx3/f$a;

    .line 111
    .line 112
    iget v10, v3, Lv3/i0;->H:I

    .line 113
    .line 114
    iget v11, v3, Lv3/i0;->G:I

    .line 115
    .line 116
    iget v12, v3, Lv3/i0;->I:I

    .line 117
    .line 118
    invoke-direct {v9, v10, v11, v12}, Lx3/f$a;-><init>(III)V

    .line 119
    .line 120
    .line 121
    array-length v10, v8

    .line 122
    move v11, v5

    .line 123
    :goto_5
    if-ge v11, v10, :cond_7

    .line 124
    .line 125
    aget-object v12, v8, v11

    .line 126
    .line 127
    :try_start_0
    invoke-interface {v12, v9}, Lx3/f;->e(Lx3/f$a;)Lx3/f$a;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    invoke-interface {v12}, Lx3/f;->isActive()Z

    .line 132
    .line 133
    .line 134
    move-result v12
    :try_end_0
    .catch Lx3/f$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    if-eqz v12, :cond_6

    .line 136
    .line 137
    move-object v9, v13

    .line 138
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :catch_0
    move-exception v0

    .line 142
    new-instance v2, Lx3/m$a;

    .line 143
    .line 144
    invoke-direct {v2, v0, v3}, Lx3/m$a;-><init>(Lx3/f$b;Lv3/i0;)V

    .line 145
    .line 146
    .line 147
    throw v2

    .line 148
    :cond_7
    iget v10, v9, Lx3/f$a;->c:I

    .line 149
    .line 150
    iget v11, v9, Lx3/f$a;->a:I

    .line 151
    .line 152
    iget v12, v9, Lx3/f$a;->b:I

    .line 153
    .line 154
    invoke-static {v12}, Lv5/e0;->o(I)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    iget v9, v9, Lx3/f$a;->b:I

    .line 159
    .line 160
    invoke-static {v10, v9}, Lv5/e0;->w(II)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    move-object v13, v8

    .line 165
    move v8, v11

    .line 166
    move v11, v5

    .line 167
    move/from16 v22, v12

    .line 168
    .line 169
    move v12, v10

    .line 170
    move/from16 v10, v22

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_8
    new-array v0, v5, [Lx3/f;

    .line 174
    .line 175
    iget v8, v3, Lv3/i0;->H:I

    .line 176
    .line 177
    iget-object v9, v1, Lx3/s;->v:Lx3/d;

    .line 178
    .line 179
    invoke-virtual {v1, v3, v9}, Lx3/s;->L(Lv3/i0;Lx3/d;)Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_9

    .line 184
    .line 185
    iget-object v9, v3, Lv3/i0;->t:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v10, v3, Lv3/i0;->q:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v9, v10}, Lv5/p;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    iget v10, v3, Lv3/i0;->G:I

    .line 197
    .line 198
    invoke-static {v10}, Lv5/e0;->o(I)I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    move v11, v6

    .line 203
    goto :goto_6

    .line 204
    :cond_9
    iget-object v9, v1, Lx3/s;->a:Lx3/e;

    .line 205
    .line 206
    invoke-virtual {v9, v3}, Lx3/e;->a(Lv3/i0;)Landroid/util/Pair;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    if-eqz v9, :cond_15

    .line 211
    .line 212
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v10, Ljava/lang/Integer;

    .line 215
    .line 216
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v9, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    move v11, v7

    .line 229
    move/from16 v22, v10

    .line 230
    .line 231
    move v10, v9

    .line 232
    move/from16 v9, v22

    .line 233
    .line 234
    :goto_6
    move-object v13, v0

    .line 235
    move v0, v2

    .line 236
    move v12, v9

    .line 237
    move v9, v0

    .line 238
    :goto_7
    const-string v14, ") for: "

    .line 239
    .line 240
    if-eqz v12, :cond_14

    .line 241
    .line 242
    if-eqz v10, :cond_13

    .line 243
    .line 244
    iget-object v14, v1, Lx3/s;->p:Lx3/u;

    .line 245
    .line 246
    invoke-static {v8, v10, v12}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    const/4 v5, -0x2

    .line 251
    if-eq v15, v5, :cond_a

    .line 252
    .line 253
    move v5, v6

    .line 254
    goto :goto_8

    .line 255
    :cond_a
    const/4 v5, 0x0

    .line 256
    :goto_8
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 257
    .line 258
    .line 259
    if-eq v9, v2, :cond_b

    .line 260
    .line 261
    move v5, v9

    .line 262
    goto :goto_9

    .line 263
    :cond_b
    move v5, v6

    .line 264
    :goto_9
    iget v4, v3, Lv3/i0;->p:I

    .line 265
    .line 266
    iget-boolean v2, v1, Lx3/s;->k:Z

    .line 267
    .line 268
    if-eqz v2, :cond_c

    .line 269
    .line 270
    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_c
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 274
    .line 275
    :goto_a
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    const v2, 0x3d090

    .line 279
    .line 280
    .line 281
    const-wide/32 v19, 0xf4240

    .line 282
    .line 283
    .line 284
    if-eqz v11, :cond_11

    .line 285
    .line 286
    if-eq v11, v6, :cond_10

    .line 287
    .line 288
    if-ne v11, v7, :cond_f

    .line 289
    .line 290
    const/4 v7, 0x5

    .line 291
    if-ne v12, v7, :cond_d

    .line 292
    .line 293
    const v2, 0x7a120

    .line 294
    .line 295
    .line 296
    :cond_d
    const/4 v7, -0x1

    .line 297
    if-eq v4, v7, :cond_e

    .line 298
    .line 299
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 300
    .line 301
    const/16 v14, 0x8

    .line 302
    .line 303
    invoke-static {v4, v14, v7}, Lq7/b;->a(IILjava/math/RoundingMode;)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    goto :goto_b

    .line 308
    :cond_e
    invoke-static {v12}, Lx3/u;->a(I)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    :goto_b
    int-to-long v6, v2

    .line 313
    int-to-long v2, v4

    .line 314
    mul-long/2addr v6, v2

    .line 315
    div-long v6, v6, v19

    .line 316
    .line 317
    invoke-static {v6, v7}, Lr7/a;->C(J)I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    goto :goto_c

    .line 322
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 323
    .line 324
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :cond_10
    invoke-static {v12}, Lx3/u;->a(I)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    const v3, 0x2faf080

    .line 333
    .line 334
    .line 335
    int-to-long v3, v3

    .line 336
    int-to-long v6, v2

    .line 337
    mul-long/2addr v3, v6

    .line 338
    div-long v3, v3, v19

    .line 339
    .line 340
    invoke-static {v3, v4}, Lr7/a;->C(J)I

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    :goto_c
    move/from16 v21, v8

    .line 345
    .line 346
    move/from16 v16, v9

    .line 347
    .line 348
    move-object/from16 p2, v13

    .line 349
    .line 350
    goto :goto_d

    .line 351
    :cond_11
    mul-int/lit8 v3, v15, 0x4

    .line 352
    .line 353
    int-to-long v6, v2

    .line 354
    move-object/from16 p2, v13

    .line 355
    .line 356
    int-to-long v13, v8

    .line 357
    mul-long/2addr v6, v13

    .line 358
    move/from16 v21, v8

    .line 359
    .line 360
    move/from16 v16, v9

    .line 361
    .line 362
    int-to-long v8, v5

    .line 363
    mul-long/2addr v6, v8

    .line 364
    div-long v6, v6, v19

    .line 365
    .line 366
    invoke-static {v6, v7}, Lr7/a;->C(J)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    const v4, 0xb71b0

    .line 371
    .line 372
    .line 373
    int-to-long v6, v4

    .line 374
    mul-long/2addr v6, v13

    .line 375
    mul-long/2addr v6, v8

    .line 376
    div-long v6, v6, v19

    .line 377
    .line 378
    invoke-static {v6, v7}, Lr7/a;->C(J)I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    invoke-static {v3, v2, v4}, Lv5/e0;->i(III)I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    :goto_d
    int-to-double v2, v2

    .line 387
    mul-double v2, v2, v17

    .line 388
    .line 389
    double-to-int v2, v2

    .line 390
    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    add-int/2addr v2, v5

    .line 395
    const/4 v3, 0x1

    .line 396
    sub-int/2addr v2, v3

    .line 397
    div-int/2addr v2, v5

    .line 398
    mul-int v13, v2, v5

    .line 399
    .line 400
    const/4 v2, 0x0

    .line 401
    iput-boolean v2, v1, Lx3/s;->b0:Z

    .line 402
    .line 403
    new-instance v14, Lx3/s$f;

    .line 404
    .line 405
    move-object v2, v14

    .line 406
    move-object/from16 v3, p1

    .line 407
    .line 408
    move v4, v0

    .line 409
    move v5, v11

    .line 410
    move/from16 v6, v16

    .line 411
    .line 412
    move/from16 v7, v21

    .line 413
    .line 414
    move v8, v10

    .line 415
    move v9, v12

    .line 416
    move v10, v13

    .line 417
    move-object/from16 v11, p2

    .line 418
    .line 419
    invoke-direct/range {v2 .. v11}, Lx3/s$f;-><init>(Lv3/i0;IIIIIII[Lx3/f;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {p0 .. p0}, Lx3/s;->C()Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_12

    .line 427
    .line 428
    iput-object v14, v1, Lx3/s;->s:Lx3/s$f;

    .line 429
    .line 430
    goto :goto_e

    .line 431
    :cond_12
    iput-object v14, v1, Lx3/s;->t:Lx3/s$f;

    .line 432
    .line 433
    :goto_e
    return-void

    .line 434
    :cond_13
    new-instance v0, Lx3/m$a;

    .line 435
    .line 436
    new-instance v2, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    const-string v3, "Invalid output channel config (mode="

    .line 442
    .line 443
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    move-object/from16 v3, p1

    .line 453
    .line 454
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-direct {v0, v2, v3}, Lx3/m$a;-><init>(Ljava/lang/String;Lv3/i0;)V

    .line 462
    .line 463
    .line 464
    throw v0

    .line 465
    :cond_14
    new-instance v0, Lx3/m$a;

    .line 466
    .line 467
    new-instance v2, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const-string v4, "Invalid output encoding (mode="

    .line 473
    .line 474
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-direct {v0, v2, v3}, Lx3/m$a;-><init>(Ljava/lang/String;Lv3/i0;)V

    .line 491
    .line 492
    .line 493
    throw v0

    .line 494
    :cond_15
    new-instance v0, Lx3/m$a;

    .line 495
    .line 496
    new-instance v2, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    const-string v4, "Unable to configure passthrough for: "

    .line 502
    .line 503
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-direct {v0, v2, v3}, Lx3/m$a;-><init>(Ljava/lang/String;Lv3/i0;)V

    .line 514
    .line 515
    .line 516
    throw v0
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
.end method

.method public final f()Lv3/e1;
    .locals 1

    iget-boolean v0, p0, Lx3/s;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx3/s;->y:Lv3/e1;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    move-result-object v0

    iget-object v0, v0, Lx3/s$h;->a:Lv3/e1;

    :goto_0
    return-object v0
.end method

.method public final flush()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lx3/s;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0}, Lx3/s;->G()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    .line 12
    .line 13
    iget-object v0, v0, Lx3/o;->c:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x3

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-static {v0}, Lx3/s;->D(Landroid/media/AudioTrack;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lx3/s;->m:Lx3/s$k;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 51
    .line 52
    iget-object v5, v0, Lx3/s$k;->b:Lx3/s$k$a;

    .line 53
    .line 54
    invoke-static {v2, v5}, Laa/w;->m(Landroid/media/AudioTrack;Lx3/s$k$a;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lx3/s$k;->a:Landroid/os/Handler;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    sget v0, Lv5/e0;->a:I

    .line 63
    .line 64
    const/16 v2, 0x15

    .line 65
    .line 66
    if-ge v0, v2, :cond_3

    .line 67
    .line 68
    iget-boolean v0, p0, Lx3/s;->V:Z

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    iput v4, p0, Lx3/s;->W:I

    .line 73
    .line 74
    :cond_3
    iget-object v0, p0, Lx3/s;->s:Lx3/s$f;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iput-object v0, p0, Lx3/s;->t:Lx3/s$f;

    .line 79
    .line 80
    iput-object v1, p0, Lx3/s;->s:Lx3/s$f;

    .line 81
    .line 82
    :cond_4
    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    .line 83
    .line 84
    invoke-virtual {v0}, Lx3/o;->c()V

    .line 85
    .line 86
    .line 87
    iput-object v1, v0, Lx3/o;->c:Landroid/media/AudioTrack;

    .line 88
    .line 89
    iput-object v1, v0, Lx3/o;->f:Lx3/n;

    .line 90
    .line 91
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 92
    .line 93
    iget-object v2, p0, Lx3/s;->h:Lb5/g;

    .line 94
    .line 95
    monitor-enter v2

    .line 96
    :try_start_0
    iput-boolean v4, v2, Lb5/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 97
    .line 98
    monitor-exit v2

    .line 99
    sget-object v4, Lx3/s;->d0:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v4

    .line 102
    :try_start_1
    sget-object v5, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 103
    .line 104
    if-nez v5, :cond_5

    .line 105
    .line 106
    const-string v5, "ExoPlayer:AudioTrackReleaseThread"

    .line 107
    .line 108
    new-instance v6, Lt0/a;

    .line 109
    .line 110
    invoke-direct {v6, v5, v3}, Lt0/a;-><init>(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v6}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    sput-object v5, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_2

    .line 122
    :cond_5
    :goto_1
    sget v5, Lx3/s;->f0:I

    .line 123
    .line 124
    add-int/2addr v5, v3

    .line 125
    sput v5, Lx3/s;->f0:I

    .line 126
    .line 127
    sget-object v3, Lx3/s;->e0:Ljava/util/concurrent/ExecutorService;

    .line 128
    .line 129
    new-instance v5, Lx0/f;

    .line 130
    .line 131
    const/16 v6, 0x9

    .line 132
    .line 133
    invoke-direct {v5, v6, v0, v2}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v3, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    iput-object v1, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :goto_2
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    throw v0

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    monitor-exit v2

    .line 147
    throw v0

    .line 148
    :cond_6
    :goto_3
    iget-object v0, p0, Lx3/s;->o:Lx3/s$i;

    .line 149
    .line 150
    iput-object v1, v0, Lx3/s$i;->a:Ljava/lang/Exception;

    .line 151
    .line 152
    iget-object v0, p0, Lx3/s;->n:Lx3/s$i;

    .line 153
    .line 154
    iput-object v1, v0, Lx3/s$i;->a:Ljava/lang/Exception;

    .line 155
    .line 156
    return-void
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

.method public final g()V
    .locals 1

    iget-boolean v0, p0, Lx3/s;->S:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx3/s;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx3/s;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx3/s;->E()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/s;->S:Z

    :cond_0
    return-void
.end method

.method public final h()Z
    .locals 3

    invoke-virtual {p0}, Lx3/s;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx3/s;->i:Lx3/o;

    invoke-virtual {p0}, Lx3/s;->A()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lx3/o;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i(I)V
    .locals 1

    iget v0, p0, Lx3/s;->W:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lx3/s;->W:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lx3/s;->V:Z

    invoke-virtual {p0}, Lx3/s;->flush()V

    :cond_1
    return-void
.end method

.method public final j(Lx3/p;)V
    .locals 4

    iget-object v0, p0, Lx3/s;->X:Lx3/p;

    invoke-virtual {v0, p1}, Lx3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lx3/p;->a:I

    iget v1, p1, Lx3/p;->b:F

    iget-object v2, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lx3/s;->X:Lx3/p;

    iget v3, v3, Lx3/p;->a:I

    if-eq v3, v0, :cond_1

    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_2
    iput-object p1, p0, Lx3/s;->X:Lx3/p;

    return-void
.end method

.method public final k(JLjava/nio/ByteBuffer;I)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Lx6/b;->q(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lx3/s;->s:Lx3/s$f;

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    const/4 v9, 0x0

    .line 28
    if-eqz v5, :cond_8

    .line 29
    .line 30
    invoke-virtual/range {p0 .. p0}, Lx3/s;->w()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    return v7

    .line 37
    :cond_2
    iget-object v5, v1, Lx3/s;->s:Lx3/s$f;

    .line 38
    .line 39
    iget-object v10, v1, Lx3/s;->t:Lx3/s$f;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget v11, v10, Lx3/s$f;->c:I

    .line 45
    .line 46
    iget v12, v5, Lx3/s$f;->c:I

    .line 47
    .line 48
    if-ne v11, v12, :cond_3

    .line 49
    .line 50
    iget v11, v10, Lx3/s$f;->g:I

    .line 51
    .line 52
    iget v12, v5, Lx3/s$f;->g:I

    .line 53
    .line 54
    if-ne v11, v12, :cond_3

    .line 55
    .line 56
    iget v11, v10, Lx3/s$f;->e:I

    .line 57
    .line 58
    iget v12, v5, Lx3/s$f;->e:I

    .line 59
    .line 60
    if-ne v11, v12, :cond_3

    .line 61
    .line 62
    iget v11, v10, Lx3/s$f;->f:I

    .line 63
    .line 64
    iget v12, v5, Lx3/s$f;->f:I

    .line 65
    .line 66
    if-ne v11, v12, :cond_3

    .line 67
    .line 68
    iget v10, v10, Lx3/s$f;->d:I

    .line 69
    .line 70
    iget v5, v5, Lx3/s$f;->d:I

    .line 71
    .line 72
    if-ne v10, v5, :cond_3

    .line 73
    .line 74
    move v5, v6

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move v5, v7

    .line 77
    :goto_2
    if-nez v5, :cond_5

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p0}, Lx3/s;->E()V

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {p0 .. p0}, Lx3/s;->h()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_4

    .line 87
    .line 88
    return v7

    .line 89
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lx3/s;->flush()V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    iget-object v5, v1, Lx3/s;->s:Lx3/s$f;

    .line 94
    .line 95
    iput-object v5, v1, Lx3/s;->t:Lx3/s$f;

    .line 96
    .line 97
    iput-object v9, v1, Lx3/s;->s:Lx3/s$f;

    .line 98
    .line 99
    iget-object v5, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 100
    .line 101
    invoke-static {v5}, Lx3/s;->D(Landroid/media/AudioTrack;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    iget v5, v1, Lx3/s;->l:I

    .line 108
    .line 109
    if-eq v5, v8, :cond_7

    .line 110
    .line 111
    iget-object v5, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 112
    .line 113
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ne v5, v8, :cond_6

    .line 118
    .line 119
    iget-object v5, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 120
    .line 121
    invoke-static {v5}, Laa/w;->l(Landroid/media/AudioTrack;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    iget-object v5, v1, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 125
    .line 126
    iget-object v10, v1, Lx3/s;->t:Lx3/s$f;

    .line 127
    .line 128
    iget-object v10, v10, Lx3/s$f;->a:Lv3/i0;

    .line 129
    .line 130
    iget v11, v10, Lv3/i0;->J:I

    .line 131
    .line 132
    iget v10, v10, Lv3/i0;->K:I

    .line 133
    .line 134
    invoke-static {v5, v11, v10}, Laa/u;->k(Landroid/media/AudioTrack;II)V

    .line 135
    .line 136
    .line 137
    iput-boolean v6, v1, Lx3/s;->c0:Z

    .line 138
    .line 139
    :cond_7
    :goto_3
    invoke-virtual/range {p0 .. p2}, Lx3/s;->v(J)V

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lx3/s;->C()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-nez v5, :cond_a

    .line 147
    .line 148
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lx3/s;->B()Z

    .line 149
    .line 150
    .line 151
    move-result v5
    :try_end_0
    .catch Lx3/m$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    if-nez v5, :cond_a

    .line 153
    .line 154
    return v7

    .line 155
    :catch_0
    move-exception v0

    .line 156
    move-object v2, v0

    .line 157
    iget-boolean v0, v2, Lx3/m$b;->b:Z

    .line 158
    .line 159
    if-nez v0, :cond_9

    .line 160
    .line 161
    iget-object v0, v1, Lx3/s;->n:Lx3/s$i;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Lx3/s$i;->a(Ljava/lang/Exception;)V

    .line 164
    .line 165
    .line 166
    return v7

    .line 167
    :cond_9
    throw v2

    .line 168
    :cond_a
    iget-object v5, v1, Lx3/s;->n:Lx3/s$i;

    .line 169
    .line 170
    iput-object v9, v5, Lx3/s$i;->a:Ljava/lang/Exception;

    .line 171
    .line 172
    iget-boolean v5, v1, Lx3/s;->H:Z

    .line 173
    .line 174
    const-wide/16 v9, 0x0

    .line 175
    .line 176
    if-eqz v5, :cond_c

    .line 177
    .line 178
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 179
    .line 180
    .line 181
    move-result-wide v11

    .line 182
    iput-wide v11, v1, Lx3/s;->I:J

    .line 183
    .line 184
    iput-boolean v7, v1, Lx3/s;->G:Z

    .line 185
    .line 186
    iput-boolean v7, v1, Lx3/s;->H:Z

    .line 187
    .line 188
    iget-boolean v5, v1, Lx3/s;->k:Z

    .line 189
    .line 190
    if-eqz v5, :cond_b

    .line 191
    .line 192
    sget v5, Lv5/e0;->a:I

    .line 193
    .line 194
    const/16 v11, 0x17

    .line 195
    .line 196
    if-lt v5, v11, :cond_b

    .line 197
    .line 198
    iget-object v5, v1, Lx3/s;->y:Lv3/e1;

    .line 199
    .line 200
    invoke-virtual {v1, v5}, Lx3/s;->I(Lv3/e1;)V

    .line 201
    .line 202
    .line 203
    :cond_b
    invoke-virtual/range {p0 .. p2}, Lx3/s;->v(J)V

    .line 204
    .line 205
    .line 206
    iget-boolean v5, v1, Lx3/s;->U:Z

    .line 207
    .line 208
    if-eqz v5, :cond_c

    .line 209
    .line 210
    invoke-virtual/range {p0 .. p0}, Lx3/s;->b()V

    .line 211
    .line 212
    .line 213
    :cond_c
    iget-object v5, v1, Lx3/s;->i:Lx3/o;

    .line 214
    .line 215
    invoke-virtual/range {p0 .. p0}, Lx3/s;->A()J

    .line 216
    .line 217
    .line 218
    move-result-wide v11

    .line 219
    iget-object v13, v5, Lx3/o;->c:Landroid/media/AudioTrack;

    .line 220
    .line 221
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13}, Landroid/media/AudioTrack;->getPlayState()I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    iget-boolean v14, v5, Lx3/o;->h:Z

    .line 229
    .line 230
    const/4 v15, 0x2

    .line 231
    if-eqz v14, :cond_e

    .line 232
    .line 233
    if-ne v13, v15, :cond_d

    .line 234
    .line 235
    iput-boolean v7, v5, Lx3/o;->p:Z

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_d
    if-ne v13, v6, :cond_e

    .line 239
    .line 240
    invoke-virtual {v5}, Lx3/o;->a()J

    .line 241
    .line 242
    .line 243
    move-result-wide v16

    .line 244
    cmp-long v9, v16, v9

    .line 245
    .line 246
    if-nez v9, :cond_e

    .line 247
    .line 248
    :goto_4
    move v5, v7

    .line 249
    goto :goto_5

    .line 250
    :cond_e
    iget-boolean v9, v5, Lx3/o;->p:Z

    .line 251
    .line 252
    invoke-virtual {v5, v11, v12}, Lx3/o;->b(J)Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    iput-boolean v10, v5, Lx3/o;->p:Z

    .line 257
    .line 258
    if-eqz v9, :cond_f

    .line 259
    .line 260
    if-nez v10, :cond_f

    .line 261
    .line 262
    if-eq v13, v6, :cond_f

    .line 263
    .line 264
    iget-object v9, v5, Lx3/o;->a:Lx3/o$a;

    .line 265
    .line 266
    iget v10, v5, Lx3/o;->e:I

    .line 267
    .line 268
    iget-wide v11, v5, Lx3/o;->i:J

    .line 269
    .line 270
    invoke-static {v11, v12}, Lv5/e0;->R(J)J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    invoke-interface {v9, v10, v11, v12}, Lx3/o$a;->b(IJ)V

    .line 275
    .line 276
    .line 277
    :cond_f
    move v5, v6

    .line 278
    :goto_5
    if-nez v5, :cond_10

    .line 279
    .line 280
    return v7

    .line 281
    :cond_10
    iget-object v5, v1, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 282
    .line 283
    if-nez v5, :cond_2a

    .line 284
    .line 285
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 290
    .line 291
    if-ne v5, v9, :cond_11

    .line 292
    .line 293
    move v5, v6

    .line 294
    goto :goto_6

    .line 295
    :cond_11
    move v5, v7

    .line 296
    :goto_6
    invoke-static {v5}, Lx6/b;->q(Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-nez v5, :cond_12

    .line 304
    .line 305
    return v6

    .line 306
    :cond_12
    iget-object v5, v1, Lx3/s;->t:Lx3/s$f;

    .line 307
    .line 308
    iget v9, v5, Lx3/s$f;->c:I

    .line 309
    .line 310
    const-wide/32 v10, 0xf4240

    .line 311
    .line 312
    .line 313
    if-eqz v9, :cond_22

    .line 314
    .line 315
    iget v9, v1, Lx3/s;->F:I

    .line 316
    .line 317
    if-nez v9, :cond_22

    .line 318
    .line 319
    iget v5, v5, Lx3/s$f;->g:I

    .line 320
    .line 321
    const/4 v9, -0x2

    .line 322
    const/4 v12, -0x1

    .line 323
    const/16 v13, 0x10

    .line 324
    .line 325
    packed-switch v5, :pswitch_data_0

    .line 326
    .line 327
    .line 328
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 329
    .line 330
    const-string v2, "Unexpected audio encoding: "

    .line 331
    .line 332
    invoke-static {v2, v5}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v0

    .line 340
    :pswitch_1
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->limit()I

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-le v8, v6, :cond_13

    .line 349
    .line 350
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    goto :goto_7

    .line 355
    :cond_13
    move v8, v7

    .line 356
    :goto_7
    invoke-static {v5, v8}, Lb/a0;->v(BB)J

    .line 357
    .line 358
    .line 359
    move-result-wide v8

    .line 360
    const-wide/32 v12, 0xbb80

    .line 361
    .line 362
    .line 363
    mul-long/2addr v8, v12

    .line 364
    div-long/2addr v8, v10

    .line 365
    long-to-int v5, v8

    .line 366
    goto/16 :goto_13

    .line 367
    .line 368
    :pswitch_2
    new-array v5, v13, [B

    .line 369
    .line 370
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 378
    .line 379
    .line 380
    new-instance v8, Lv5/t;

    .line 381
    .line 382
    invoke-direct {v8, v5, v13}, Lv5/t;-><init>([BI)V

    .line 383
    .line 384
    .line 385
    invoke-static {v8}, Lx3/c;->b(Lv5/t;)Lx3/c$a;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    iget v5, v5, Lx3/c$a;->c:I

    .line 390
    .line 391
    goto/16 :goto_13

    .line 392
    .line 393
    :pswitch_3
    const/16 v5, 0x200

    .line 394
    .line 395
    goto/16 :goto_13

    .line 396
    .line 397
    :pswitch_4
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->limit()I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    add-int/lit8 v8, v8, -0xa

    .line 406
    .line 407
    move v10, v5

    .line 408
    :goto_8
    if-gt v10, v8, :cond_16

    .line 409
    .line 410
    add-int/lit8 v11, v10, 0x4

    .line 411
    .line 412
    sget v14, Lv5/e0;->a:I

    .line 413
    .line 414
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 419
    .line 420
    .line 421
    move-result-object v14

    .line 422
    sget-object v15, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 423
    .line 424
    if-ne v14, v15, :cond_14

    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_14
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    :goto_9
    and-int/2addr v11, v9

    .line 432
    const v14, -0x78d9046

    .line 433
    .line 434
    .line 435
    if-ne v11, v14, :cond_15

    .line 436
    .line 437
    sub-int/2addr v10, v5

    .line 438
    goto :goto_a

    .line 439
    :cond_15
    add-int/lit8 v10, v10, 0x1

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_16
    move v10, v12

    .line 443
    :goto_a
    if-ne v10, v12, :cond_17

    .line 444
    .line 445
    move v5, v7

    .line 446
    goto/16 :goto_13

    .line 447
    .line 448
    :cond_17
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    add-int/2addr v5, v10

    .line 453
    add-int/lit8 v5, v5, 0x7

    .line 454
    .line 455
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    and-int/lit16 v5, v5, 0xff

    .line 460
    .line 461
    const/16 v8, 0xbb

    .line 462
    .line 463
    if-ne v5, v8, :cond_18

    .line 464
    .line 465
    move v5, v6

    .line 466
    goto :goto_b

    .line 467
    :cond_18
    move v5, v7

    .line 468
    :goto_b
    const/16 v8, 0x28

    .line 469
    .line 470
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    add-int/2addr v9, v10

    .line 475
    if-eqz v5, :cond_19

    .line 476
    .line 477
    const/16 v5, 0x9

    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_19
    const/16 v5, 0x8

    .line 481
    .line 482
    :goto_c
    add-int/2addr v9, v5

    .line 483
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    shr-int/lit8 v5, v5, 0x4

    .line 488
    .line 489
    and-int/lit8 v5, v5, 0x7

    .line 490
    .line 491
    shl-int v5, v8, v5

    .line 492
    .line 493
    mul-int/2addr v5, v13

    .line 494
    goto/16 :goto_13

    .line 495
    .line 496
    :pswitch_5
    const/16 v5, 0x800

    .line 497
    .line 498
    goto/16 :goto_13

    .line 499
    .line 500
    :pswitch_6
    const/16 v5, 0x400

    .line 501
    .line 502
    goto/16 :goto_13

    .line 503
    .line 504
    :pswitch_7
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    sget v8, Lv5/e0;->a:I

    .line 509
    .line 510
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 511
    .line 512
    .line 513
    move-result v5

    .line 514
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 519
    .line 520
    if-ne v8, v9, :cond_1a

    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_1a
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    :goto_d
    invoke-static {v5}, Lx3/y;->b(I)I

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-eq v5, v12, :cond_1b

    .line 532
    .line 533
    goto/16 :goto_13

    .line 534
    .line 535
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 536
    .line 537
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 538
    .line 539
    .line 540
    throw v0

    .line 541
    :pswitch_8
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 542
    .line 543
    .line 544
    move-result v5

    .line 545
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    if-eq v8, v9, :cond_1e

    .line 550
    .line 551
    if-eq v8, v12, :cond_1d

    .line 552
    .line 553
    const/16 v9, 0x1f

    .line 554
    .line 555
    if-eq v8, v9, :cond_1c

    .line 556
    .line 557
    add-int/lit8 v8, v5, 0x4

    .line 558
    .line 559
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 560
    .line 561
    .line 562
    move-result v8

    .line 563
    and-int/2addr v8, v6

    .line 564
    shl-int/lit8 v8, v8, 0x6

    .line 565
    .line 566
    add-int/lit8 v5, v5, 0x5

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :cond_1c
    add-int/lit8 v8, v5, 0x5

    .line 570
    .line 571
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    and-int/lit8 v8, v8, 0x7

    .line 576
    .line 577
    shl-int/lit8 v8, v8, 0x4

    .line 578
    .line 579
    add-int/lit8 v5, v5, 0x6

    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_1d
    add-int/lit8 v8, v5, 0x4

    .line 583
    .line 584
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 585
    .line 586
    .line 587
    move-result v8

    .line 588
    and-int/lit8 v8, v8, 0x7

    .line 589
    .line 590
    shl-int/lit8 v8, v8, 0x4

    .line 591
    .line 592
    add-int/lit8 v5, v5, 0x7

    .line 593
    .line 594
    :goto_e
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    and-int/lit8 v5, v5, 0x3c

    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_1e
    add-int/lit8 v8, v5, 0x5

    .line 602
    .line 603
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 604
    .line 605
    .line 606
    move-result v8

    .line 607
    and-int/2addr v8, v6

    .line 608
    shl-int/lit8 v8, v8, 0x6

    .line 609
    .line 610
    add-int/lit8 v5, v5, 0x4

    .line 611
    .line 612
    :goto_f
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 613
    .line 614
    .line 615
    move-result v5

    .line 616
    and-int/lit16 v5, v5, 0xfc

    .line 617
    .line 618
    :goto_10
    shr-int/2addr v5, v15

    .line 619
    or-int/2addr v5, v8

    .line 620
    add-int/2addr v5, v6

    .line 621
    mul-int/lit8 v5, v5, 0x20

    .line 622
    .line 623
    goto :goto_13

    .line 624
    :pswitch_9
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 625
    .line 626
    .line 627
    move-result v5

    .line 628
    add-int/lit8 v5, v5, 0x5

    .line 629
    .line 630
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    and-int/lit16 v5, v5, 0xf8

    .line 635
    .line 636
    shr-int/2addr v5, v8

    .line 637
    const/16 v9, 0xa

    .line 638
    .line 639
    if-le v5, v9, :cond_1f

    .line 640
    .line 641
    move v5, v6

    .line 642
    goto :goto_11

    .line 643
    :cond_1f
    move v5, v7

    .line 644
    :goto_11
    if-eqz v5, :cond_21

    .line 645
    .line 646
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 647
    .line 648
    .line 649
    move-result v5

    .line 650
    add-int/lit8 v5, v5, 0x4

    .line 651
    .line 652
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    and-int/lit16 v5, v5, 0xc0

    .line 657
    .line 658
    shr-int/lit8 v5, v5, 0x6

    .line 659
    .line 660
    if-ne v5, v8, :cond_20

    .line 661
    .line 662
    goto :goto_12

    .line 663
    :cond_20
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->position()I

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    add-int/lit8 v5, v5, 0x4

    .line 668
    .line 669
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 670
    .line 671
    .line 672
    move-result v5

    .line 673
    and-int/lit8 v5, v5, 0x30

    .line 674
    .line 675
    shr-int/lit8 v8, v5, 0x4

    .line 676
    .line 677
    :goto_12
    sget-object v5, Lx3/b;->a:[I

    .line 678
    .line 679
    aget v5, v5, v8

    .line 680
    .line 681
    mul-int/lit16 v5, v5, 0x100

    .line 682
    .line 683
    goto :goto_13

    .line 684
    :cond_21
    const/16 v5, 0x600

    .line 685
    .line 686
    :goto_13
    iput v5, v1, Lx3/s;->F:I

    .line 687
    .line 688
    if-nez v5, :cond_22

    .line 689
    .line 690
    return v6

    .line 691
    :cond_22
    iget-object v5, v1, Lx3/s;->w:Lx3/s$h;

    .line 692
    .line 693
    if-eqz v5, :cond_24

    .line 694
    .line 695
    invoke-virtual/range {p0 .. p0}, Lx3/s;->w()Z

    .line 696
    .line 697
    .line 698
    move-result v5

    .line 699
    if-nez v5, :cond_23

    .line 700
    .line 701
    return v7

    .line 702
    :cond_23
    invoke-virtual/range {p0 .. p2}, Lx3/s;->v(J)V

    .line 703
    .line 704
    .line 705
    const/4 v5, 0x0

    .line 706
    iput-object v5, v1, Lx3/s;->w:Lx3/s$h;

    .line 707
    .line 708
    :cond_24
    iget-wide v8, v1, Lx3/s;->I:J

    .line 709
    .line 710
    iget-object v5, v1, Lx3/s;->t:Lx3/s$f;

    .line 711
    .line 712
    invoke-virtual/range {p0 .. p0}, Lx3/s;->z()J

    .line 713
    .line 714
    .line 715
    move-result-wide v10

    .line 716
    iget-object v12, v1, Lx3/s;->e:Lx3/d0;

    .line 717
    .line 718
    iget-wide v12, v12, Lx3/d0;->o:J

    .line 719
    .line 720
    sub-long/2addr v10, v12

    .line 721
    const-wide/32 v12, 0xf4240

    .line 722
    .line 723
    .line 724
    mul-long/2addr v10, v12

    .line 725
    iget-object v5, v5, Lx3/s$f;->a:Lv3/i0;

    .line 726
    .line 727
    iget v5, v5, Lv3/i0;->H:I

    .line 728
    .line 729
    int-to-long v12, v5

    .line 730
    div-long/2addr v10, v12

    .line 731
    add-long/2addr v10, v8

    .line 732
    iget-boolean v5, v1, Lx3/s;->G:Z

    .line 733
    .line 734
    if-nez v5, :cond_26

    .line 735
    .line 736
    sub-long v8, v10, v2

    .line 737
    .line 738
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 739
    .line 740
    .line 741
    move-result-wide v8

    .line 742
    const-wide/32 v12, 0x30d40

    .line 743
    .line 744
    .line 745
    cmp-long v5, v8, v12

    .line 746
    .line 747
    if-lez v5, :cond_26

    .line 748
    .line 749
    iget-object v5, v1, Lx3/s;->r:Lx3/m$c;

    .line 750
    .line 751
    if-eqz v5, :cond_25

    .line 752
    .line 753
    new-instance v8, Lx3/m$d;

    .line 754
    .line 755
    invoke-direct {v8, v2, v3, v10, v11}, Lx3/m$d;-><init>(JJ)V

    .line 756
    .line 757
    .line 758
    check-cast v5, Lx3/x$b;

    .line 759
    .line 760
    invoke-virtual {v5, v8}, Lx3/x$b;->a(Ljava/lang/Exception;)V

    .line 761
    .line 762
    .line 763
    :cond_25
    iput-boolean v6, v1, Lx3/s;->G:Z

    .line 764
    .line 765
    :cond_26
    iget-boolean v5, v1, Lx3/s;->G:Z

    .line 766
    .line 767
    if-eqz v5, :cond_28

    .line 768
    .line 769
    invoke-virtual/range {p0 .. p0}, Lx3/s;->w()Z

    .line 770
    .line 771
    .line 772
    move-result v5

    .line 773
    if-nez v5, :cond_27

    .line 774
    .line 775
    return v7

    .line 776
    :cond_27
    sub-long v8, v2, v10

    .line 777
    .line 778
    iget-wide v10, v1, Lx3/s;->I:J

    .line 779
    .line 780
    add-long/2addr v10, v8

    .line 781
    iput-wide v10, v1, Lx3/s;->I:J

    .line 782
    .line 783
    iput-boolean v7, v1, Lx3/s;->G:Z

    .line 784
    .line 785
    invoke-virtual/range {p0 .. p2}, Lx3/s;->v(J)V

    .line 786
    .line 787
    .line 788
    iget-object v5, v1, Lx3/s;->r:Lx3/m$c;

    .line 789
    .line 790
    if-eqz v5, :cond_28

    .line 791
    .line 792
    const-wide/16 v10, 0x0

    .line 793
    .line 794
    cmp-long v8, v8, v10

    .line 795
    .line 796
    if-eqz v8, :cond_28

    .line 797
    .line 798
    check-cast v5, Lx3/x$b;

    .line 799
    .line 800
    iget-object v5, v5, Lx3/x$b;->a:Lx3/x;

    .line 801
    .line 802
    iput-boolean v6, v5, Lx3/x;->T0:Z

    .line 803
    .line 804
    :cond_28
    iget-object v5, v1, Lx3/s;->t:Lx3/s$f;

    .line 805
    .line 806
    iget v5, v5, Lx3/s$f;->c:I

    .line 807
    .line 808
    if-nez v5, :cond_29

    .line 809
    .line 810
    iget-wide v8, v1, Lx3/s;->B:J

    .line 811
    .line 812
    invoke-virtual/range {p3 .. p3}, Ljava/nio/Buffer;->remaining()I

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    int-to-long v10, v5

    .line 817
    add-long/2addr v8, v10

    .line 818
    iput-wide v8, v1, Lx3/s;->B:J

    .line 819
    .line 820
    goto :goto_14

    .line 821
    :cond_29
    iget-wide v8, v1, Lx3/s;->C:J

    .line 822
    .line 823
    iget v5, v1, Lx3/s;->F:I

    .line 824
    .line 825
    int-to-long v10, v5

    .line 826
    int-to-long v12, v4

    .line 827
    mul-long/2addr v10, v12

    .line 828
    add-long/2addr v10, v8

    .line 829
    iput-wide v10, v1, Lx3/s;->C:J

    .line 830
    .line 831
    :goto_14
    iput-object v0, v1, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 832
    .line 833
    iput v4, v1, Lx3/s;->N:I

    .line 834
    .line 835
    :cond_2a
    invoke-virtual/range {p0 .. p2}, Lx3/s;->F(J)V

    .line 836
    .line 837
    .line 838
    iget-object v0, v1, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    if-nez v0, :cond_2b

    .line 845
    .line 846
    const/4 v0, 0x0

    .line 847
    iput-object v0, v1, Lx3/s;->M:Ljava/nio/ByteBuffer;

    .line 848
    .line 849
    iput v7, v1, Lx3/s;->N:I

    .line 850
    .line 851
    return v6

    .line 852
    :cond_2b
    iget-object v0, v1, Lx3/s;->i:Lx3/o;

    .line 853
    .line 854
    invoke-virtual/range {p0 .. p0}, Lx3/s;->A()J

    .line 855
    .line 856
    .line 857
    move-result-wide v2

    .line 858
    iget-wide v4, v0, Lx3/o;->z:J

    .line 859
    .line 860
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    cmp-long v4, v4, v8

    .line 866
    .line 867
    if-eqz v4, :cond_2c

    .line 868
    .line 869
    const-wide/16 v4, 0x0

    .line 870
    .line 871
    cmp-long v2, v2, v4

    .line 872
    .line 873
    if-lez v2, :cond_2c

    .line 874
    .line 875
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 876
    .line 877
    .line 878
    move-result-wide v2

    .line 879
    iget-wide v4, v0, Lx3/o;->z:J

    .line 880
    .line 881
    sub-long/2addr v2, v4

    .line 882
    const-wide/16 v4, 0xc8

    .line 883
    .line 884
    cmp-long v0, v2, v4

    .line 885
    .line 886
    if-ltz v0, :cond_2c

    .line 887
    .line 888
    move v0, v6

    .line 889
    goto :goto_15

    .line 890
    :cond_2c
    move v0, v7

    .line 891
    :goto_15
    if-eqz v0, :cond_2d

    .line 892
    .line 893
    const-string v0, "DefaultAudioSink"

    .line 894
    .line 895
    const-string v2, "Resetting stalled audio track"

    .line 896
    .line 897
    invoke-static {v0, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {p0 .. p0}, Lx3/s;->flush()V

    .line 901
    .line 902
    .line 903
    return v6

    .line 904
    :cond_2d
    return v7

    .line 905
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_9
        :pswitch_0
        :pswitch_1
    .end packed-switch
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
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
.end method

.method public final l(Z)J
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lx3/s;->C()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_27

    .line 8
    .line 9
    iget-boolean v1, v0, Lx3/s;->H:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_13

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Lx3/s;->i:Lx3/o;

    .line 16
    .line 17
    iget-object v2, v1, Lx3/o;->c:Landroid/media/AudioTrack;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v4, 0x3

    .line 27
    const/4 v9, 0x2

    .line 28
    const/4 v10, 0x1

    .line 29
    const-wide/16 v11, 0x0

    .line 30
    .line 31
    const-wide/16 v13, 0x3e8

    .line 32
    .line 33
    const-wide/32 v15, 0xf4240

    .line 34
    .line 35
    .line 36
    if-ne v2, v4, :cond_18

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v17

    .line 42
    div-long v5, v17, v13

    .line 43
    .line 44
    iget-wide v7, v1, Lx3/o;->m:J

    .line 45
    .line 46
    sub-long v7, v5, v7

    .line 47
    .line 48
    const-wide/16 v19, 0x7530

    .line 49
    .line 50
    cmp-long v2, v7, v19

    .line 51
    .line 52
    if-ltz v2, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Lx3/o;->a()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    mul-long/2addr v7, v15

    .line 59
    iget v2, v1, Lx3/o;->g:I

    .line 60
    .line 61
    int-to-long v13, v2

    .line 62
    div-long/2addr v7, v13

    .line 63
    cmp-long v2, v7, v11

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_1
    iget-object v2, v1, Lx3/o;->b:[J

    .line 70
    .line 71
    iget v13, v1, Lx3/o;->w:I

    .line 72
    .line 73
    iget v14, v1, Lx3/o;->j:F

    .line 74
    .line 75
    invoke-static {v7, v8, v14}, Lv5/e0;->x(JF)J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    sub-long/2addr v7, v5

    .line 80
    aput-wide v7, v2, v13

    .line 81
    .line 82
    iget v2, v1, Lx3/o;->w:I

    .line 83
    .line 84
    add-int/2addr v2, v10

    .line 85
    const/16 v7, 0xa

    .line 86
    .line 87
    rem-int/2addr v2, v7

    .line 88
    iput v2, v1, Lx3/o;->w:I

    .line 89
    .line 90
    iget v2, v1, Lx3/o;->x:I

    .line 91
    .line 92
    if-ge v2, v7, :cond_2

    .line 93
    .line 94
    add-int/2addr v2, v10

    .line 95
    iput v2, v1, Lx3/o;->x:I

    .line 96
    .line 97
    :cond_2
    iput-wide v5, v1, Lx3/o;->m:J

    .line 98
    .line 99
    iput-wide v11, v1, Lx3/o;->l:J

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    :goto_0
    iget v7, v1, Lx3/o;->x:I

    .line 103
    .line 104
    if-ge v2, v7, :cond_3

    .line 105
    .line 106
    iget-wide v13, v1, Lx3/o;->l:J

    .line 107
    .line 108
    iget-object v8, v1, Lx3/o;->b:[J

    .line 109
    .line 110
    aget-wide v19, v8, v2

    .line 111
    .line 112
    int-to-long v7, v7

    .line 113
    div-long v19, v19, v7

    .line 114
    .line 115
    add-long v7, v19, v13

    .line 116
    .line 117
    iput-wide v7, v1, Lx3/o;->l:J

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    iget-boolean v2, v1, Lx3/o;->h:Z

    .line 123
    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    goto/16 :goto_9

    .line 127
    .line 128
    :cond_4
    iget-object v2, v1, Lx3/o;->f:Lx3/n;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v7, v2, Lx3/n;->a:Lx3/n$a;

    .line 134
    .line 135
    const/4 v8, 0x4

    .line 136
    if-eqz v7, :cond_f

    .line 137
    .line 138
    iget-wide v11, v2, Lx3/n;->e:J

    .line 139
    .line 140
    sub-long v11, v5, v11

    .line 141
    .line 142
    iget-wide v13, v2, Lx3/n;->d:J

    .line 143
    .line 144
    cmp-long v11, v11, v13

    .line 145
    .line 146
    if-gez v11, :cond_5

    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :cond_5
    iput-wide v5, v2, Lx3/n;->e:J

    .line 151
    .line 152
    iget-object v11, v7, Lx3/n$a;->a:Landroid/media/AudioTrack;

    .line 153
    .line 154
    iget-object v12, v7, Lx3/n$a;->b:Landroid/media/AudioTimestamp;

    .line 155
    .line 156
    invoke-virtual {v11, v12}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_7

    .line 161
    .line 162
    iget-object v12, v7, Lx3/n$a;->b:Landroid/media/AudioTimestamp;

    .line 163
    .line 164
    iget-wide v12, v12, Landroid/media/AudioTimestamp;->framePosition:J

    .line 165
    .line 166
    iget-wide v3, v7, Lx3/n$a;->d:J

    .line 167
    .line 168
    cmp-long v3, v3, v12

    .line 169
    .line 170
    if-lez v3, :cond_6

    .line 171
    .line 172
    iget-wide v3, v7, Lx3/n$a;->c:J

    .line 173
    .line 174
    const-wide/16 v20, 0x1

    .line 175
    .line 176
    add-long v3, v3, v20

    .line 177
    .line 178
    iput-wide v3, v7, Lx3/n$a;->c:J

    .line 179
    .line 180
    :cond_6
    iput-wide v12, v7, Lx3/n$a;->d:J

    .line 181
    .line 182
    iget-wide v3, v7, Lx3/n$a;->c:J

    .line 183
    .line 184
    const/16 v20, 0x20

    .line 185
    .line 186
    shl-long v3, v3, v20

    .line 187
    .line 188
    add-long/2addr v12, v3

    .line 189
    iput-wide v12, v7, Lx3/n$a;->e:J

    .line 190
    .line 191
    :cond_7
    iget v3, v2, Lx3/n;->b:I

    .line 192
    .line 193
    if-eqz v3, :cond_d

    .line 194
    .line 195
    if-eq v3, v10, :cond_b

    .line 196
    .line 197
    if-eq v3, v9, :cond_a

    .line 198
    .line 199
    const/4 v4, 0x3

    .line 200
    if-eq v3, v4, :cond_9

    .line 201
    .line 202
    if-ne v3, v8, :cond_8

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_9
    if-eqz v11, :cond_10

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_a
    if-nez v11, :cond_10

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_b
    if-eqz v11, :cond_c

    .line 218
    .line 219
    iget-object v3, v2, Lx3/n;->a:Lx3/n$a;

    .line 220
    .line 221
    iget-wide v3, v3, Lx3/n$a;->e:J

    .line 222
    .line 223
    iget-wide v12, v2, Lx3/n;->f:J

    .line 224
    .line 225
    cmp-long v3, v3, v12

    .line 226
    .line 227
    if-lez v3, :cond_10

    .line 228
    .line 229
    invoke-virtual {v2, v9}, Lx3/n;->b(I)V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_c
    :goto_1
    invoke-virtual {v2}, Lx3/n;->a()V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_d
    if-eqz v11, :cond_e

    .line 238
    .line 239
    iget-object v3, v2, Lx3/n;->a:Lx3/n$a;

    .line 240
    .line 241
    iget-object v4, v3, Lx3/n$a;->b:Landroid/media/AudioTimestamp;

    .line 242
    .line 243
    iget-wide v12, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 244
    .line 245
    const-wide/16 v19, 0x3e8

    .line 246
    .line 247
    div-long v12, v12, v19

    .line 248
    .line 249
    iget-wide v8, v2, Lx3/n;->c:J

    .line 250
    .line 251
    cmp-long v8, v12, v8

    .line 252
    .line 253
    if-ltz v8, :cond_f

    .line 254
    .line 255
    iget-wide v8, v3, Lx3/n$a;->e:J

    .line 256
    .line 257
    iput-wide v8, v2, Lx3/n;->f:J

    .line 258
    .line 259
    invoke-virtual {v2, v10}, Lx3/n;->b(I)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_e
    iget-wide v8, v2, Lx3/n;->c:J

    .line 264
    .line 265
    sub-long v8, v5, v8

    .line 266
    .line 267
    const-wide/32 v12, 0x7a120

    .line 268
    .line 269
    .line 270
    cmp-long v3, v8, v12

    .line 271
    .line 272
    if-lez v3, :cond_10

    .line 273
    .line 274
    const/4 v3, 0x3

    .line 275
    invoke-virtual {v2, v3}, Lx3/n;->b(I)V

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_f
    :goto_2
    const/4 v11, 0x0

    .line 280
    :cond_10
    :goto_3
    const-wide/32 v8, 0x4c4b40

    .line 281
    .line 282
    .line 283
    if-nez v11, :cond_11

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_11
    iget-object v3, v2, Lx3/n;->a:Lx3/n$a;

    .line 287
    .line 288
    if-eqz v3, :cond_12

    .line 289
    .line 290
    iget-object v11, v3, Lx3/n$a;->b:Landroid/media/AudioTimestamp;

    .line 291
    .line 292
    iget-wide v11, v11, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 293
    .line 294
    const-wide/16 v19, 0x3e8

    .line 295
    .line 296
    div-long v11, v11, v19

    .line 297
    .line 298
    move-wide/from16 v22, v11

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_12
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    :goto_4
    if-eqz v3, :cond_13

    .line 307
    .line 308
    iget-wide v11, v3, Lx3/n$a;->e:J

    .line 309
    .line 310
    move-wide/from16 v20, v11

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_13
    const-wide/16 v20, -0x1

    .line 314
    .line 315
    :goto_5
    invoke-virtual {v1}, Lx3/o;->a()J

    .line 316
    .line 317
    .line 318
    move-result-wide v11

    .line 319
    mul-long/2addr v11, v15

    .line 320
    iget v3, v1, Lx3/o;->g:I

    .line 321
    .line 322
    int-to-long v14, v3

    .line 323
    div-long v26, v11, v14

    .line 324
    .line 325
    sub-long v11, v22, v5

    .line 326
    .line 327
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 328
    .line 329
    .line 330
    move-result-wide v11

    .line 331
    cmp-long v3, v11, v8

    .line 332
    .line 333
    if-lez v3, :cond_14

    .line 334
    .line 335
    iget-object v3, v1, Lx3/o;->a:Lx3/o$a;

    .line 336
    .line 337
    move-object/from16 v19, v3

    .line 338
    .line 339
    move-wide/from16 v24, v5

    .line 340
    .line 341
    invoke-interface/range {v19 .. v27}, Lx3/o$a;->e(JJJJ)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_14
    const-wide/32 v11, 0xf4240

    .line 346
    .line 347
    .line 348
    mul-long v15, v20, v11

    .line 349
    .line 350
    iget v3, v1, Lx3/o;->g:I

    .line 351
    .line 352
    int-to-long v11, v3

    .line 353
    div-long/2addr v15, v11

    .line 354
    sub-long v15, v15, v26

    .line 355
    .line 356
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    .line 357
    .line 358
    .line 359
    move-result-wide v11

    .line 360
    cmp-long v3, v11, v8

    .line 361
    .line 362
    if-lez v3, :cond_15

    .line 363
    .line 364
    iget-object v3, v1, Lx3/o;->a:Lx3/o$a;

    .line 365
    .line 366
    move-object/from16 v19, v3

    .line 367
    .line 368
    move-wide/from16 v24, v5

    .line 369
    .line 370
    invoke-interface/range {v19 .. v27}, Lx3/o$a;->d(JJJJ)V

    .line 371
    .line 372
    .line 373
    :goto_6
    const/4 v3, 0x4

    .line 374
    invoke-virtual {v2, v3}, Lx3/n;->b(I)V

    .line 375
    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_15
    const/4 v3, 0x4

    .line 379
    iget v7, v2, Lx3/n;->b:I

    .line 380
    .line 381
    if-ne v7, v3, :cond_16

    .line 382
    .line 383
    invoke-virtual {v2}, Lx3/n;->a()V

    .line 384
    .line 385
    .line 386
    :cond_16
    :goto_7
    iget-boolean v2, v1, Lx3/o;->q:Z

    .line 387
    .line 388
    if-eqz v2, :cond_18

    .line 389
    .line 390
    iget-object v2, v1, Lx3/o;->n:Ljava/lang/reflect/Method;

    .line 391
    .line 392
    if-eqz v2, :cond_18

    .line 393
    .line 394
    iget-wide v11, v1, Lx3/o;->r:J

    .line 395
    .line 396
    sub-long v11, v5, v11

    .line 397
    .line 398
    const-wide/32 v14, 0x7a120

    .line 399
    .line 400
    .line 401
    cmp-long v3, v11, v14

    .line 402
    .line 403
    if-ltz v3, :cond_18

    .line 404
    .line 405
    :try_start_0
    iget-object v3, v1, Lx3/o;->c:Landroid/media/AudioTrack;

    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 408
    .line 409
    .line 410
    const/4 v7, 0x0

    .line 411
    :try_start_1
    new-array v11, v7, [Ljava/lang/Object;

    .line 412
    .line 413
    invoke-virtual {v2, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Ljava/lang/Integer;

    .line 418
    .line 419
    sget v3, Lv5/e0;->a:I

    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    int-to-long v2, v2

    .line 426
    const-wide/16 v11, 0x3e8

    .line 427
    .line 428
    mul-long/2addr v2, v11

    .line 429
    iget-wide v11, v1, Lx3/o;->i:J

    .line 430
    .line 431
    sub-long/2addr v2, v11

    .line 432
    iput-wide v2, v1, Lx3/o;->o:J

    .line 433
    .line 434
    const-wide/16 v11, 0x0

    .line 435
    .line 436
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 437
    .line 438
    .line 439
    move-result-wide v2

    .line 440
    iput-wide v2, v1, Lx3/o;->o:J

    .line 441
    .line 442
    cmp-long v8, v2, v8

    .line 443
    .line 444
    if-lez v8, :cond_17

    .line 445
    .line 446
    iget-object v8, v1, Lx3/o;->a:Lx3/o$a;

    .line 447
    .line 448
    invoke-interface {v8, v2, v3}, Lx3/o$a;->c(J)V

    .line 449
    .line 450
    .line 451
    const-wide/16 v2, 0x0

    .line 452
    .line 453
    iput-wide v2, v1, Lx3/o;->o:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 454
    .line 455
    goto :goto_8

    .line 456
    :catch_0
    const/4 v7, 0x0

    .line 457
    :catch_1
    const/4 v2, 0x0

    .line 458
    iput-object v2, v1, Lx3/o;->n:Ljava/lang/reflect/Method;

    .line 459
    .line 460
    :cond_17
    :goto_8
    iput-wide v5, v1, Lx3/o;->r:J

    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_18
    :goto_9
    const/4 v7, 0x0

    .line 464
    :goto_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 465
    .line 466
    .line 467
    move-result-wide v2

    .line 468
    const-wide/16 v5, 0x3e8

    .line 469
    .line 470
    div-long/2addr v2, v5

    .line 471
    iget-object v5, v1, Lx3/o;->f:Lx3/n;

    .line 472
    .line 473
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    iget v6, v5, Lx3/n;->b:I

    .line 477
    .line 478
    const/4 v4, 0x2

    .line 479
    if-ne v6, v4, :cond_19

    .line 480
    .line 481
    move v7, v10

    .line 482
    :cond_19
    if-eqz v7, :cond_1c

    .line 483
    .line 484
    iget-object v5, v5, Lx3/n;->a:Lx3/n$a;

    .line 485
    .line 486
    if-eqz v5, :cond_1a

    .line 487
    .line 488
    iget-wide v8, v5, Lx3/n$a;->e:J

    .line 489
    .line 490
    move-wide/from16 v17, v8

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_1a
    const-wide/16 v17, -0x1

    .line 494
    .line 495
    :goto_b
    const-wide/32 v8, 0xf4240

    .line 496
    .line 497
    .line 498
    mul-long v17, v17, v8

    .line 499
    .line 500
    iget v6, v1, Lx3/o;->g:I

    .line 501
    .line 502
    int-to-long v8, v6

    .line 503
    div-long v17, v17, v8

    .line 504
    .line 505
    if-eqz v5, :cond_1b

    .line 506
    .line 507
    iget-object v5, v5, Lx3/n$a;->b:Landroid/media/AudioTimestamp;

    .line 508
    .line 509
    iget-wide v5, v5, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 510
    .line 511
    const-wide/16 v8, 0x3e8

    .line 512
    .line 513
    div-long/2addr v5, v8

    .line 514
    goto :goto_c

    .line 515
    :cond_1b
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    :goto_c
    sub-long v5, v2, v5

    .line 521
    .line 522
    iget v8, v1, Lx3/o;->j:F

    .line 523
    .line 524
    invoke-static {v5, v6, v8}, Lv5/e0;->t(JF)J

    .line 525
    .line 526
    .line 527
    move-result-wide v5

    .line 528
    add-long v5, v5, v17

    .line 529
    .line 530
    goto :goto_e

    .line 531
    :cond_1c
    iget v5, v1, Lx3/o;->x:I

    .line 532
    .line 533
    if-nez v5, :cond_1d

    .line 534
    .line 535
    invoke-virtual {v1}, Lx3/o;->a()J

    .line 536
    .line 537
    .line 538
    move-result-wide v5

    .line 539
    const-wide/32 v8, 0xf4240

    .line 540
    .line 541
    .line 542
    mul-long/2addr v5, v8

    .line 543
    iget v8, v1, Lx3/o;->g:I

    .line 544
    .line 545
    int-to-long v8, v8

    .line 546
    div-long/2addr v5, v8

    .line 547
    goto :goto_d

    .line 548
    :cond_1d
    iget-wide v5, v1, Lx3/o;->l:J

    .line 549
    .line 550
    add-long/2addr v5, v2

    .line 551
    iget v8, v1, Lx3/o;->j:F

    .line 552
    .line 553
    invoke-static {v5, v6, v8}, Lv5/e0;->t(JF)J

    .line 554
    .line 555
    .line 556
    move-result-wide v5

    .line 557
    :goto_d
    if-nez p1, :cond_1e

    .line 558
    .line 559
    iget-wide v8, v1, Lx3/o;->o:J

    .line 560
    .line 561
    sub-long/2addr v5, v8

    .line 562
    const-wide/16 v8, 0x0

    .line 563
    .line 564
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 565
    .line 566
    .line 567
    move-result-wide v5

    .line 568
    :cond_1e
    :goto_e
    iget-boolean v8, v1, Lx3/o;->E:Z

    .line 569
    .line 570
    if-eq v8, v7, :cond_1f

    .line 571
    .line 572
    iget-wide v8, v1, Lx3/o;->D:J

    .line 573
    .line 574
    iput-wide v8, v1, Lx3/o;->G:J

    .line 575
    .line 576
    iget-wide v8, v1, Lx3/o;->C:J

    .line 577
    .line 578
    iput-wide v8, v1, Lx3/o;->F:J

    .line 579
    .line 580
    :cond_1f
    iget-wide v8, v1, Lx3/o;->G:J

    .line 581
    .line 582
    sub-long v8, v2, v8

    .line 583
    .line 584
    const-wide/32 v11, 0xf4240

    .line 585
    .line 586
    .line 587
    cmp-long v13, v8, v11

    .line 588
    .line 589
    if-gez v13, :cond_20

    .line 590
    .line 591
    iget-wide v13, v1, Lx3/o;->F:J

    .line 592
    .line 593
    iget v15, v1, Lx3/o;->j:F

    .line 594
    .line 595
    invoke-static {v8, v9, v15}, Lv5/e0;->t(JF)J

    .line 596
    .line 597
    .line 598
    move-result-wide v15

    .line 599
    add-long/2addr v15, v13

    .line 600
    const-wide/16 v13, 0x3e8

    .line 601
    .line 602
    mul-long/2addr v8, v13

    .line 603
    div-long/2addr v8, v11

    .line 604
    mul-long/2addr v5, v8

    .line 605
    sub-long v8, v13, v8

    .line 606
    .line 607
    mul-long/2addr v8, v15

    .line 608
    add-long/2addr v8, v5

    .line 609
    div-long v5, v8, v13

    .line 610
    .line 611
    :cond_20
    iget-boolean v8, v1, Lx3/o;->k:Z

    .line 612
    .line 613
    if-nez v8, :cond_21

    .line 614
    .line 615
    iget-wide v8, v1, Lx3/o;->C:J

    .line 616
    .line 617
    cmp-long v11, v5, v8

    .line 618
    .line 619
    if-lez v11, :cond_21

    .line 620
    .line 621
    iput-boolean v10, v1, Lx3/o;->k:Z

    .line 622
    .line 623
    sub-long v8, v5, v8

    .line 624
    .line 625
    invoke-static {v8, v9}, Lv5/e0;->R(J)J

    .line 626
    .line 627
    .line 628
    move-result-wide v8

    .line 629
    iget v10, v1, Lx3/o;->j:F

    .line 630
    .line 631
    invoke-static {v8, v9, v10}, Lv5/e0;->x(JF)J

    .line 632
    .line 633
    .line 634
    move-result-wide v8

    .line 635
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 636
    .line 637
    .line 638
    move-result-wide v10

    .line 639
    invoke-static {v8, v9}, Lv5/e0;->R(J)J

    .line 640
    .line 641
    .line 642
    move-result-wide v8

    .line 643
    sub-long/2addr v10, v8

    .line 644
    iget-object v8, v1, Lx3/o;->a:Lx3/o$a;

    .line 645
    .line 646
    invoke-interface {v8, v10, v11}, Lx3/o$a;->a(J)V

    .line 647
    .line 648
    .line 649
    :cond_21
    iput-wide v2, v1, Lx3/o;->D:J

    .line 650
    .line 651
    iput-wide v5, v1, Lx3/o;->C:J

    .line 652
    .line 653
    iput-boolean v7, v1, Lx3/o;->E:Z

    .line 654
    .line 655
    iget-object v1, v0, Lx3/s;->t:Lx3/s$f;

    .line 656
    .line 657
    invoke-virtual/range {p0 .. p0}, Lx3/s;->A()J

    .line 658
    .line 659
    .line 660
    move-result-wide v2

    .line 661
    const-wide/32 v7, 0xf4240

    .line 662
    .line 663
    .line 664
    mul-long/2addr v2, v7

    .line 665
    iget v1, v1, Lx3/s$f;->e:I

    .line 666
    .line 667
    int-to-long v7, v1

    .line 668
    div-long/2addr v2, v7

    .line 669
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 670
    .line 671
    .line 672
    move-result-wide v1

    .line 673
    :goto_f
    iget-object v3, v0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 674
    .line 675
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_22

    .line 680
    .line 681
    iget-object v3, v0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 682
    .line 683
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    check-cast v3, Lx3/s$h;

    .line 688
    .line 689
    iget-wide v5, v3, Lx3/s$h;->d:J

    .line 690
    .line 691
    cmp-long v3, v1, v5

    .line 692
    .line 693
    if-ltz v3, :cond_22

    .line 694
    .line 695
    iget-object v3, v0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 696
    .line 697
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    check-cast v3, Lx3/s$h;

    .line 702
    .line 703
    iput-object v3, v0, Lx3/s;->x:Lx3/s$h;

    .line 704
    .line 705
    goto :goto_f

    .line 706
    :cond_22
    iget-object v3, v0, Lx3/s;->x:Lx3/s$h;

    .line 707
    .line 708
    iget-wide v5, v3, Lx3/s$h;->d:J

    .line 709
    .line 710
    sub-long v7, v1, v5

    .line 711
    .line 712
    iget-object v3, v3, Lx3/s$h;->a:Lv3/e1;

    .line 713
    .line 714
    sget-object v5, Lv3/e1;->d:Lv3/e1;

    .line 715
    .line 716
    invoke-virtual {v3, v5}, Lv3/e1;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    if-eqz v3, :cond_23

    .line 721
    .line 722
    iget-object v1, v0, Lx3/s;->x:Lx3/s$h;

    .line 723
    .line 724
    iget-wide v1, v1, Lx3/s$h;->c:J

    .line 725
    .line 726
    add-long/2addr v1, v7

    .line 727
    goto :goto_12

    .line 728
    :cond_23
    iget-object v3, v0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 729
    .line 730
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    if-eqz v3, :cond_26

    .line 735
    .line 736
    iget-object v1, v0, Lx3/s;->b:Lx3/g;

    .line 737
    .line 738
    check-cast v1, Lx3/s$g;

    .line 739
    .line 740
    iget-object v1, v1, Lx3/s$g;->c:Lx3/c0;

    .line 741
    .line 742
    iget-wide v2, v1, Lx3/c0;->o:J

    .line 743
    .line 744
    const-wide/16 v5, 0x400

    .line 745
    .line 746
    cmp-long v2, v2, v5

    .line 747
    .line 748
    if-ltz v2, :cond_25

    .line 749
    .line 750
    iget-wide v2, v1, Lx3/c0;->n:J

    .line 751
    .line 752
    iget-object v5, v1, Lx3/c0;->j:Lx3/b0;

    .line 753
    .line 754
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    iget v6, v5, Lx3/b0;->k:I

    .line 758
    .line 759
    iget v5, v5, Lx3/b0;->b:I

    .line 760
    .line 761
    mul-int/2addr v6, v5

    .line 762
    const/4 v4, 0x2

    .line 763
    mul-int/2addr v6, v4

    .line 764
    int-to-long v4, v6

    .line 765
    sub-long/2addr v2, v4

    .line 766
    iget-object v4, v1, Lx3/c0;->h:Lx3/f$a;

    .line 767
    .line 768
    iget v4, v4, Lx3/f$a;->a:I

    .line 769
    .line 770
    iget-object v5, v1, Lx3/c0;->g:Lx3/f$a;

    .line 771
    .line 772
    iget v5, v5, Lx3/f$a;->a:I

    .line 773
    .line 774
    if-ne v4, v5, :cond_24

    .line 775
    .line 776
    iget-wide v4, v1, Lx3/c0;->o:J

    .line 777
    .line 778
    move-wide v9, v2

    .line 779
    move-wide v11, v4

    .line 780
    goto :goto_10

    .line 781
    :cond_24
    int-to-long v9, v4

    .line 782
    mul-long/2addr v2, v9

    .line 783
    iget-wide v9, v1, Lx3/c0;->o:J

    .line 784
    .line 785
    int-to-long v4, v5

    .line 786
    mul-long/2addr v9, v4

    .line 787
    move-wide v11, v9

    .line 788
    move-wide v9, v2

    .line 789
    :goto_10
    invoke-static/range {v7 .. v12}, Lv5/e0;->O(JJJ)J

    .line 790
    .line 791
    .line 792
    move-result-wide v1

    .line 793
    goto :goto_11

    .line 794
    :cond_25
    iget v1, v1, Lx3/c0;->c:F

    .line 795
    .line 796
    float-to-double v1, v1

    .line 797
    long-to-double v3, v7

    .line 798
    mul-double/2addr v1, v3

    .line 799
    double-to-long v1, v1

    .line 800
    :goto_11
    iget-object v3, v0, Lx3/s;->x:Lx3/s$h;

    .line 801
    .line 802
    iget-wide v3, v3, Lx3/s$h;->c:J

    .line 803
    .line 804
    add-long/2addr v1, v3

    .line 805
    goto :goto_12

    .line 806
    :cond_26
    iget-object v3, v0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 807
    .line 808
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    check-cast v3, Lx3/s$h;

    .line 813
    .line 814
    iget-wide v4, v3, Lx3/s$h;->d:J

    .line 815
    .line 816
    sub-long/2addr v4, v1

    .line 817
    iget-object v1, v0, Lx3/s;->x:Lx3/s$h;

    .line 818
    .line 819
    iget-object v1, v1, Lx3/s$h;->a:Lv3/e1;

    .line 820
    .line 821
    iget v1, v1, Lv3/e1;->a:F

    .line 822
    .line 823
    invoke-static {v4, v5, v1}, Lv5/e0;->t(JF)J

    .line 824
    .line 825
    .line 826
    move-result-wide v1

    .line 827
    iget-wide v3, v3, Lx3/s$h;->c:J

    .line 828
    .line 829
    sub-long v1, v3, v1

    .line 830
    .line 831
    :goto_12
    iget-object v3, v0, Lx3/s;->t:Lx3/s$f;

    .line 832
    .line 833
    iget-object v4, v0, Lx3/s;->b:Lx3/g;

    .line 834
    .line 835
    check-cast v4, Lx3/s$g;

    .line 836
    .line 837
    iget-object v4, v4, Lx3/s$g;->b:Lx3/a0;

    .line 838
    .line 839
    iget-wide v4, v4, Lx3/a0;->t:J

    .line 840
    .line 841
    const-wide/32 v6, 0xf4240

    .line 842
    .line 843
    .line 844
    mul-long/2addr v4, v6

    .line 845
    iget v3, v3, Lx3/s$f;->e:I

    .line 846
    .line 847
    int-to-long v6, v3

    .line 848
    div-long/2addr v4, v6

    .line 849
    add-long/2addr v4, v1

    .line 850
    return-wide v4

    .line 851
    :cond_27
    :goto_13
    const-wide/high16 v1, -0x8000000000000000L

    .line 852
    .line 853
    return-wide v1
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
.end method

.method public final m()V
    .locals 1

    iget-boolean v0, p0, Lx3/s;->Z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx3/s;->Z:Z

    invoke-virtual {p0}, Lx3/s;->flush()V

    :cond_0
    return-void
.end method

.method public final n()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/s;->G:Z

    return-void
.end method

.method public final o(F)V
    .locals 1

    iget v0, p0, Lx3/s;->J:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lx3/s;->J:F

    invoke-virtual {p0}, Lx3/s;->J()V

    :cond_0
    return-void
.end method

.method public final p(Lw3/a0;)V
    .locals 0

    iput-object p1, p0, Lx3/s;->q:Lw3/a0;

    return-void
.end method

.method public final pause()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx3/s;->U:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lx3/s;->C()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lx3/s;->i:Lx3/o;

    .line 11
    .line 12
    invoke-virtual {v1}, Lx3/o;->c()V

    .line 13
    .line 14
    .line 15
    iget-wide v2, v1, Lx3/o;->y:J

    .line 16
    .line 17
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v0, v1, Lx3/o;->f:Lx3/n;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lx3/n;->a()V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    :cond_0
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
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

.method public final q()V
    .locals 3

    sget v0, Lv5/e0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-boolean v0, p0, Lx3/s;->V:Z

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-boolean v0, p0, Lx3/s;->Z:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lx3/s;->Z:Z

    invoke-virtual {p0}, Lx3/s;->flush()V

    :cond_1
    return-void
.end method

.method public final synthetic r()V
    .locals 0

    return-void
.end method

.method public final reset()V
    .locals 5

    invoke-virtual {p0}, Lx3/s;->flush()V

    iget-object v0, p0, Lx3/s;->f:[Lx3/f;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lx3/f;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx3/s;->g:[Lx3/f;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lx3/f;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Lx3/s;->U:Z

    iput-boolean v2, p0, Lx3/s;->b0:Z

    return-void
.end method

.method public final s(Lx3/d;)V
    .locals 1

    iget-object v0, p0, Lx3/s;->v:Lx3/d;

    invoke-virtual {v0, p1}, Lx3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lx3/s;->v:Lx3/d;

    iget-boolean p1, p0, Lx3/s;->Z:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lx3/s;->flush()V

    return-void
.end method

.method public final setPreferredDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lx3/s$c;

    invoke-direct {v0, p1}, Lx3/s$c;-><init>(Landroid/media/AudioDeviceInfo;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lx3/s;->Y:Lx3/s$c;

    iget-object v0, p0, Lx3/s;->u:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lx3/s$a;->a(Landroid/media/AudioTrack;Lx3/s$c;)V

    :cond_1
    return-void
.end method

.method public final t(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx3/s$h;->a:Lv3/e1;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lx3/s;->H(Lv3/e1;Z)V

    .line 8
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
.end method

.method public final u(Lv3/i0;)I
    .locals 4

    .line 1
    iget-object v0, p1, Lv3/i0;->t:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/raw"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x2

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget v0, p1, Lv3/i0;->I:I

    .line 15
    .line 16
    invoke-static {v0}, Lv5/e0;->F(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "Invalid PCM encoding: "

    .line 23
    .line 24
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget p1, p1, Lv3/i0;->I:I

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "DefaultAudioSink"

    .line 38
    .line 39
    invoke-static {v0, p1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    iget p1, p1, Lv3/i0;->I:I

    .line 44
    .line 45
    if-eq p1, v3, :cond_2

    .line 46
    .line 47
    iget-boolean v0, p0, Lx3/s;->c:Z

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    if-ne p1, v0, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return v1

    .line 56
    :cond_2
    :goto_0
    return v3

    .line 57
    :cond_3
    iget-boolean v0, p0, Lx3/s;->b0:Z

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    iget-object v0, p0, Lx3/s;->v:Lx3/d;

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Lx3/s;->L(Lv3/i0;Lx3/d;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    return v3

    .line 70
    :cond_4
    iget-object v0, p0, Lx3/s;->a:Lx3/e;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lx3/e;->a(Lv3/i0;)Landroid/util/Pair;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    move v1, v2

    .line 80
    :goto_1
    if-eqz v1, :cond_6

    .line 81
    .line 82
    return v3

    .line 83
    :cond_6
    return v2
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
.end method

.method public final v(J)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lx3/s;->K()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lx3/s;->b:Lx3/g;

    .line 8
    .line 9
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lx3/s$h;->a:Lv3/e1;

    .line 14
    .line 15
    check-cast v0, Lx3/s$g;

    .line 16
    .line 17
    iget-object v0, v0, Lx3/s$g;->c:Lx3/c0;

    .line 18
    .line 19
    iget v2, v1, Lv3/e1;->a:F

    .line 20
    .line 21
    iget v3, v0, Lx3/c0;->c:F

    .line 22
    .line 23
    cmpl-float v3, v3, v2

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iput v2, v0, Lx3/c0;->c:F

    .line 29
    .line 30
    iput-boolean v4, v0, Lx3/c0;->i:Z

    .line 31
    .line 32
    :cond_0
    iget v2, v1, Lv3/e1;->b:F

    .line 33
    .line 34
    iget v3, v0, Lx3/c0;->d:F

    .line 35
    .line 36
    cmpl-float v3, v3, v2

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iput v2, v0, Lx3/c0;->d:F

    .line 41
    .line 42
    iput-boolean v4, v0, Lx3/c0;->i:Z

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object v1, Lv3/e1;->d:Lv3/e1;

    .line 46
    .line 47
    :cond_2
    :goto_0
    move-object v3, v1

    .line 48
    invoke-virtual {p0}, Lx3/s;->K()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lx3/s;->b:Lx3/g;

    .line 56
    .line 57
    invoke-virtual {p0}, Lx3/s;->y()Lx3/s$h;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-boolean v2, v2, Lx3/s$h;->b:Z

    .line 62
    .line 63
    check-cast v0, Lx3/s$g;

    .line 64
    .line 65
    iget-object v0, v0, Lx3/s$g;->b:Lx3/a0;

    .line 66
    .line 67
    iput-boolean v2, v0, Lx3/a0;->m:Z

    .line 68
    .line 69
    move v0, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move v0, v1

    .line 72
    :goto_1
    iget-object v9, p0, Lx3/s;->j:Ljava/util/ArrayDeque;

    .line 73
    .line 74
    new-instance v10, Lx3/s$h;

    .line 75
    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v5

    .line 82
    iget-object p1, p0, Lx3/s;->t:Lx3/s$f;

    .line 83
    .line 84
    invoke-virtual {p0}, Lx3/s;->A()J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    const-wide/32 v11, 0xf4240

    .line 89
    .line 90
    .line 91
    mul-long/2addr v7, v11

    .line 92
    iget p1, p1, Lx3/s$f;->e:I

    .line 93
    .line 94
    int-to-long p1, p1

    .line 95
    div-long/2addr v7, p1

    .line 96
    move-object v2, v10

    .line 97
    move v4, v0

    .line 98
    invoke-direct/range {v2 .. v8}, Lx3/s$h;-><init>(Lv3/e1;ZJJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lx3/s;->t:Lx3/s$f;

    .line 105
    .line 106
    iget-object p1, p1, Lx3/s$f;->i:[Lx3/f;

    .line 107
    .line 108
    new-instance p2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    array-length v2, p1

    .line 114
    move v3, v1

    .line 115
    :goto_2
    if-ge v3, v2, :cond_5

    .line 116
    .line 117
    aget-object v4, p1, v3

    .line 118
    .line 119
    invoke-interface {v4}, Lx3/f;->isActive()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    invoke-interface {v4}, Lx3/f;->flush()V

    .line 130
    .line 131
    .line 132
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    new-array v2, p1, [Lx3/f;

    .line 140
    .line 141
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, [Lx3/f;

    .line 146
    .line 147
    iput-object p2, p0, Lx3/s;->K:[Lx3/f;

    .line 148
    .line 149
    new-array p1, p1, [Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    iput-object p1, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    move p1, v1

    .line 154
    :goto_4
    iget-object p2, p0, Lx3/s;->K:[Lx3/f;

    .line 155
    .line 156
    array-length v2, p2

    .line 157
    if-ge p1, v2, :cond_6

    .line 158
    .line 159
    aget-object p2, p2, p1

    .line 160
    .line 161
    invoke-interface {p2}, Lx3/f;->flush()V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, Lx3/s;->L:[Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    invoke-interface {p2}, Lx3/f;->a()Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    aput-object p2, v2, p1

    .line 171
    .line 172
    add-int/lit8 p1, p1, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    iget-object p1, p0, Lx3/s;->r:Lx3/m$c;

    .line 176
    .line 177
    if-eqz p1, :cond_7

    .line 178
    .line 179
    check-cast p1, Lx3/x$b;

    .line 180
    .line 181
    iget-object p1, p1, Lx3/x$b;->a:Lx3/x;

    .line 182
    .line 183
    iget-object p1, p1, Lx3/x;->L0:Lx3/l$a;

    .line 184
    .line 185
    iget-object p2, p1, Lx3/l$a;->a:Landroid/os/Handler;

    .line 186
    .line 187
    if-eqz p2, :cond_7

    .line 188
    .line 189
    new-instance v2, Lx3/j;

    .line 190
    .line 191
    invoke-direct {v2, v1, p1, v0}, Lx3/j;-><init>(ILjava/lang/Object;Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 195
    .line 196
    .line 197
    :cond_7
    return-void
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

.method public final w()Z
    .locals 9

    iget v0, p0, Lx3/s;->R:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput v3, p0, Lx3/s;->R:I

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_1
    iget v4, p0, Lx3/s;->R:I

    iget-object v5, p0, Lx3/s;->K:[Lx3/f;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Lx3/f;->c()V

    :cond_1
    invoke-virtual {p0, v7, v8}, Lx3/s;->F(J)V

    invoke-interface {v4}, Lx3/f;->d()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    iget v0, p0, Lx3/s;->R:I

    add-int/2addr v0, v2

    iput v0, p0, Lx3/s;->R:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0, v7, v8}, Lx3/s;->M(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lx3/s;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    return v3

    :cond_4
    iput v1, p0, Lx3/s;->R:I

    return v2
.end method

.method public final y()Lx3/s$h;
    .locals 1

    iget-object v0, p0, Lx3/s;->w:Lx3/s$h;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx3/s;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx3/s;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/s$h;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx3/s;->x:Lx3/s$h;

    :goto_0
    return-object v0
.end method

.method public final z()J
    .locals 5

    iget-object v0, p0, Lx3/s;->t:Lx3/s$f;

    iget v1, v0, Lx3/s$f;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lx3/s;->B:J

    iget v0, v0, Lx3/s$f;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lx3/s;->C:J

    :goto_0
    return-wide v1
.end method

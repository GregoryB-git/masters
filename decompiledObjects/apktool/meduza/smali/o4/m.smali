.class public abstract Lo4/m;
.super Lv3/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/m$a;,
        Lo4/m$c;,
        Lo4/m$b;
    }
.end annotation


# static fields
.field public static final J0:[B


# instance fields
.field public final A:Lz3/g;

.field public A0:Z

.field public final B:Lo4/f;

.field public B0:Z

.field public final C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public C0:Z

.field public final D:Landroid/media/MediaCodec$BufferInfo;

.field public D0:Z

.field public final E:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lo4/m$c;",
            ">;"
        }
    .end annotation
.end field

.field public E0:Lv3/n;

.field public F:Lv3/i0;

.field public F0:Lz3/e;

.field public G:Lv3/i0;

.field public G0:Lo4/m$c;

.field public H:La4/e;

.field public H0:J

.field public I:La4/e;

.field public I0:Z

.field public J:Landroid/media/MediaCrypto;

.field public K:Z

.field public L:J

.field public M:F

.field public N:F

.field public O:Lo4/j;

.field public P:Lv3/i0;

.field public Q:Landroid/media/MediaFormat;

.field public R:Z

.field public S:F

.field public T:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lo4/l;",
            ">;"
        }
    .end annotation
.end field

.field public U:Lo4/m$b;

.field public V:Lo4/l;

.field public W:I

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Lo4/g;

.field public i0:J

.field public j0:I

.field public k0:I

.field public l0:Ljava/nio/ByteBuffer;

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public q0:Z

.field public r0:Z

.field public s0:I

.field public t0:I

.field public final u:Lo4/j$b;

.field public u0:I

.field public final v:Lo4/n;

.field public v0:Z

.field public final w:Z

.field public w0:Z

.field public final x:F

.field public x0:Z

.field public final y:Lz3/g;

.field public y0:J

.field public final z:Lz3/g;

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo4/m;->J0:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILo4/h;F)V
    .locals 2

    .line 1
    sget-object v0, Lo4/n;->l:Lf;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lv3/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lo4/m;->u:Lo4/j$b;

    .line 7
    .line 8
    iput-object v0, p0, Lo4/m;->v:Lo4/n;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lo4/m;->w:Z

    .line 12
    .line 13
    iput p3, p0, Lo4/m;->x:F

    .line 14
    .line 15
    new-instance p2, Lz3/g;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lz3/g;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lo4/m;->y:Lz3/g;

    .line 21
    .line 22
    new-instance p2, Lz3/g;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Lz3/g;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lo4/m;->z:Lz3/g;

    .line 28
    .line 29
    new-instance p2, Lz3/g;

    .line 30
    .line 31
    const/4 p3, 0x2

    .line 32
    invoke-direct {p2, p3}, Lz3/g;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lo4/m;->A:Lz3/g;

    .line 36
    .line 37
    new-instance p2, Lo4/f;

    .line 38
    .line 39
    invoke-direct {p2}, Lo4/f;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lo4/m;->B:Lo4/f;

    .line 43
    .line 44
    new-instance p3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p3, p0, Lo4/m;->C:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    .line 52
    .line 53
    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p3, p0, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 57
    .line 58
    const/high16 p3, 0x3f800000    # 1.0f

    .line 59
    .line 60
    iput p3, p0, Lo4/m;->M:F

    .line 61
    .line 62
    iput p3, p0, Lo4/m;->N:F

    .line 63
    .line 64
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    iput-wide v0, p0, Lo4/m;->L:J

    .line 70
    .line 71
    new-instance p3, Ljava/util/ArrayDeque;

    .line 72
    .line 73
    invoke-direct {p3}, Ljava/util/ArrayDeque;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p3, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    .line 77
    .line 78
    sget-object p3, Lo4/m$c;->d:Lo4/m$c;

    .line 79
    .line 80
    invoke-virtual {p0, p3}, Lo4/m;->t0(Lo4/m$c;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, Lz3/g;->q(I)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p2, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    .line 95
    const/high16 p2, -0x40800000    # -1.0f

    .line 96
    .line 97
    iput p2, p0, Lo4/m;->S:F

    .line 98
    .line 99
    iput p1, p0, Lo4/m;->W:I

    .line 100
    .line 101
    iput p1, p0, Lo4/m;->s0:I

    .line 102
    .line 103
    const/4 p2, -0x1

    .line 104
    iput p2, p0, Lo4/m;->j0:I

    .line 105
    .line 106
    iput p2, p0, Lo4/m;->k0:I

    .line 107
    .line 108
    iput-wide v0, p0, Lo4/m;->i0:J

    .line 109
    .line 110
    iput-wide v0, p0, Lo4/m;->y0:J

    .line 111
    .line 112
    iput-wide v0, p0, Lo4/m;->z0:J

    .line 113
    .line 114
    iput-wide v0, p0, Lo4/m;->H0:J

    .line 115
    .line 116
    iput p1, p0, Lo4/m;->t0:I

    .line 117
    .line 118
    iput p1, p0, Lo4/m;->u0:I

    .line 119
    .line 120
    return-void
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


# virtual methods
.method public B()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lo4/m;->F:Lv3/i0;

    sget-object v0, Lo4/m$c;->d:Lo4/m$c;

    invoke-virtual {p0, v0}, Lo4/m;->t0(Lo4/m$c;)V

    iget-object v0, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lo4/m;->R()Z

    return-void
.end method

.method public D(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lo4/m;->A0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lo4/m;->B0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Lo4/m;->D0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, Lo4/m;->o0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lo4/m;->B:Lo4/f;

    .line 13
    .line 14
    invoke-virtual {p2}, Lo4/f;->o()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lo4/m;->A:Lz3/g;

    .line 18
    .line 19
    invoke-virtual {p2}, Lz3/g;->o()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, Lo4/m;->p0:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lo4/m;->R()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    .line 35
    .line 36
    iget-object p1, p1, Lo4/m$c;->c:Lv5/b0;

    .line 37
    .line 38
    monitor-enter p1

    .line 39
    :try_start_0
    iget p2, p1, Lv5/b0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    monitor-exit p1

    .line 42
    if-lez p2, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lo4/m;->C0:Z

    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    .line 48
    .line 49
    iget-object p1, p1, Lo4/m$c;->c:Lv5/b0;

    .line 50
    .line 51
    invoke-virtual {p1}, Lv5/b0;->b()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p2

    .line 61
    monitor-exit p1

    .line 62
    throw p2
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

.method public final H([Lv3/i0;JJ)V
    .locals 4

    iget-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    iget-wide p1, p1, Lo4/m$c;->b:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    new-instance p1, Lo4/m$c;

    invoke-direct {p1, v0, v1, p4, p5}, Lo4/m$c;-><init>(JJ)V

    invoke-virtual {p0, p1}, Lo4/m;->t0(Lo4/m$c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lo4/m;->y0:J

    cmp-long p3, p1, v0

    if-eqz p3, :cond_1

    iget-wide v2, p0, Lo4/m;->H0:J

    cmp-long p3, v2, v0

    if-eqz p3, :cond_2

    cmp-long p1, v2, p1

    if-ltz p1, :cond_2

    :cond_1
    new-instance p1, Lo4/m$c;

    invoke-direct {p1, v0, v1, p4, p5}, Lo4/m$c;-><init>(JJ)V

    invoke-virtual {p0, p1}, Lo4/m;->t0(Lo4/m$c;)V

    iget-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    iget-wide p1, p1, Lo4/m$c;->b:J

    cmp-long p1, p1, v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lo4/m;->j0()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    new-instance p2, Lo4/m$c;

    iget-wide v0, p0, Lo4/m;->y0:J

    invoke-direct {p2, v0, v1, p4, p5}, Lo4/m$c;-><init>(JJ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final J(JJ)Z
    .locals 19

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    iget-boolean v0, v15, Lo4/m;->B0:Z

    .line 4
    .line 5
    const/4 v14, 0x1

    .line 6
    xor-int/2addr v0, v14

    .line 7
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v15, Lo4/m;->B:Lo4/f;

    .line 11
    .line 12
    iget v9, v0, Lo4/f;->r:I

    .line 13
    .line 14
    const/4 v13, 0x0

    .line 15
    if-lez v9, :cond_0

    .line 16
    .line 17
    move v1, v14

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v13

    .line 20
    :goto_0
    const/4 v12, 0x4

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    iget-object v6, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    iget v7, v15, Lo4/m;->k0:I

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    iget-wide v10, v0, Lz3/g;->e:J

    .line 30
    .line 31
    invoke-virtual {v0}, Lz3/a;->n()Z

    .line 32
    .line 33
    .line 34
    move-result v16

    .line 35
    iget-object v0, v15, Lo4/m;->B:Lo4/f;

    .line 36
    .line 37
    invoke-virtual {v0, v12}, Lz3/a;->m(I)Z

    .line 38
    .line 39
    .line 40
    move-result v17

    .line 41
    iget-object v3, v15, Lo4/m;->G:Lv3/i0;

    .line 42
    .line 43
    move-object/from16 v0, p0

    .line 44
    .line 45
    move-wide/from16 v1, p1

    .line 46
    .line 47
    move-object/from16 v18, v3

    .line 48
    .line 49
    move-wide/from16 v3, p3

    .line 50
    .line 51
    move/from16 v12, v16

    .line 52
    .line 53
    move/from16 v13, v17

    .line 54
    .line 55
    move-object/from16 v14, v18

    .line 56
    .line 57
    invoke-virtual/range {v0 .. v14}, Lo4/m;->m0(JJLo4/j;Ljava/nio/ByteBuffer;IIIJZZLv3/i0;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-object v0, v15, Lo4/m;->B:Lo4/f;

    .line 64
    .line 65
    iget-wide v0, v0, Lo4/f;->q:J

    .line 66
    .line 67
    invoke-virtual {v15, v0, v1}, Lo4/m;->i0(J)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v15, Lo4/m;->B:Lo4/f;

    .line 71
    .line 72
    invoke-virtual {v0}, Lo4/f;->o()V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v0, 0x0

    .line 78
    return v0

    .line 79
    :cond_2
    move v0, v13

    .line 80
    :goto_1
    iget-boolean v1, v15, Lo4/m;->A0:Z

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    iput-boolean v1, v15, Lo4/m;->B0:Z

    .line 86
    .line 87
    return v0

    .line 88
    :cond_3
    const/4 v1, 0x1

    .line 89
    iget-boolean v2, v15, Lo4/m;->p0:Z

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    iget-object v2, v15, Lo4/m;->B:Lo4/f;

    .line 94
    .line 95
    iget-object v3, v15, Lo4/m;->A:Lz3/g;

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Lo4/f;->s(Lz3/g;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 102
    .line 103
    .line 104
    iput-boolean v0, v15, Lo4/m;->p0:Z

    .line 105
    .line 106
    :cond_4
    iget-boolean v2, v15, Lo4/m;->q0:Z

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    iget-object v2, v15, Lo4/m;->B:Lo4/f;

    .line 111
    .line 112
    iget v2, v2, Lo4/f;->r:I

    .line 113
    .line 114
    if-lez v2, :cond_5

    .line 115
    .line 116
    move v14, v1

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move v14, v0

    .line 119
    :goto_2
    if-eqz v14, :cond_6

    .line 120
    .line 121
    return v1

    .line 122
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lo4/m;->M()V

    .line 123
    .line 124
    .line 125
    iput-boolean v0, v15, Lo4/m;->q0:Z

    .line 126
    .line 127
    invoke-virtual/range {p0 .. p0}, Lo4/m;->a0()V

    .line 128
    .line 129
    .line 130
    iget-boolean v2, v15, Lo4/m;->o0:Z

    .line 131
    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    return v0

    .line 135
    :cond_7
    iget-boolean v2, v15, Lo4/m;->A0:Z

    .line 136
    .line 137
    xor-int/2addr v2, v1

    .line 138
    invoke-static {v2}, Lx6/b;->H(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v2, v15, Lv3/f;->b:Ll3/l;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    iput-object v3, v2, Ll3/l;->a:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v3, v2, Ll3/l;->b:Ljava/lang/Object;

    .line 147
    .line 148
    iget-object v4, v15, Lo4/m;->A:Lz3/g;

    .line 149
    .line 150
    invoke-virtual {v4}, Lz3/g;->o()V

    .line 151
    .line 152
    .line 153
    :cond_8
    iget-object v4, v15, Lo4/m;->A:Lz3/g;

    .line 154
    .line 155
    invoke-virtual {v4}, Lz3/g;->o()V

    .line 156
    .line 157
    .line 158
    iget-object v4, v15, Lo4/m;->A:Lz3/g;

    .line 159
    .line 160
    invoke-virtual {v15, v2, v4, v0}, Lv3/f;->I(Ll3/l;Lz3/g;I)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    const/4 v5, -0x5

    .line 165
    if-eq v4, v5, :cond_d

    .line 166
    .line 167
    const/4 v5, -0x4

    .line 168
    if-eq v4, v5, :cond_a

    .line 169
    .line 170
    const/4 v2, -0x3

    .line 171
    if-ne v4, v2, :cond_9

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_a
    iget-object v4, v15, Lo4/m;->A:Lz3/g;

    .line 181
    .line 182
    const/4 v5, 0x4

    .line 183
    invoke-virtual {v4, v5}, Lz3/a;->m(I)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-eqz v4, :cond_b

    .line 188
    .line 189
    iput-boolean v1, v15, Lo4/m;->A0:Z

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_b
    iget-boolean v4, v15, Lo4/m;->C0:Z

    .line 193
    .line 194
    if-eqz v4, :cond_c

    .line 195
    .line 196
    iget-object v4, v15, Lo4/m;->F:Lv3/i0;

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iput-object v4, v15, Lo4/m;->G:Lv3/i0;

    .line 202
    .line 203
    invoke-virtual {v15, v4, v3}, Lo4/m;->g0(Lv3/i0;Landroid/media/MediaFormat;)V

    .line 204
    .line 205
    .line 206
    iput-boolean v0, v15, Lo4/m;->C0:Z

    .line 207
    .line 208
    :cond_c
    iget-object v4, v15, Lo4/m;->A:Lz3/g;

    .line 209
    .line 210
    invoke-virtual {v4}, Lz3/g;->r()V

    .line 211
    .line 212
    .line 213
    iget-object v4, v15, Lo4/m;->B:Lo4/f;

    .line 214
    .line 215
    iget-object v6, v15, Lo4/m;->A:Lz3/g;

    .line 216
    .line 217
    invoke-virtual {v4, v6}, Lo4/f;->s(Lz3/g;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_8

    .line 222
    .line 223
    iput-boolean v1, v15, Lo4/m;->p0:Z

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_d
    invoke-virtual {v15, v2}, Lo4/m;->f0(Ll3/l;)Lz3/i;

    .line 227
    .line 228
    .line 229
    :goto_3
    iget-object v2, v15, Lo4/m;->B:Lo4/f;

    .line 230
    .line 231
    iget v3, v2, Lo4/f;->r:I

    .line 232
    .line 233
    if-lez v3, :cond_e

    .line 234
    .line 235
    move v14, v1

    .line 236
    goto :goto_4

    .line 237
    :cond_e
    move v14, v0

    .line 238
    :goto_4
    if-eqz v14, :cond_f

    .line 239
    .line 240
    invoke-virtual {v2}, Lz3/g;->r()V

    .line 241
    .line 242
    .line 243
    :cond_f
    iget-object v2, v15, Lo4/m;->B:Lo4/f;

    .line 244
    .line 245
    iget v2, v2, Lo4/f;->r:I

    .line 246
    .line 247
    if-lez v2, :cond_10

    .line 248
    .line 249
    move v14, v1

    .line 250
    goto :goto_5

    .line 251
    :cond_10
    move v14, v0

    .line 252
    :goto_5
    if-nez v14, :cond_12

    .line 253
    .line 254
    iget-boolean v2, v15, Lo4/m;->A0:Z

    .line 255
    .line 256
    if-nez v2, :cond_12

    .line 257
    .line 258
    iget-boolean v2, v15, Lo4/m;->q0:Z

    .line 259
    .line 260
    if-eqz v2, :cond_11

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_11
    move v14, v0

    .line 264
    goto :goto_7

    .line 265
    :cond_12
    :goto_6
    move v14, v1

    .line 266
    :goto_7
    return v14
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

.method public abstract K(Lo4/l;Lv3/i0;Lv3/i0;)Lz3/i;
.end method

.method public L(Ljava/lang/IllegalStateException;Lo4/l;)Lo4/k;
    .locals 1

    new-instance v0, Lo4/k;

    invoke-direct {v0, p1, p2}, Lo4/k;-><init>(Ljava/lang/IllegalStateException;Lo4/l;)V

    return-object v0
.end method

.method public final M()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo4/m;->q0:Z

    iget-object v1, p0, Lo4/m;->B:Lo4/f;

    invoke-virtual {v1}, Lo4/f;->o()V

    iget-object v1, p0, Lo4/m;->A:Lz3/g;

    invoke-virtual {v1}, Lz3/g;->o()V

    iput-boolean v0, p0, Lo4/m;->p0:Z

    iput-boolean v0, p0, Lo4/m;->o0:Z

    return-void
.end method

.method public final N()Z
    .locals 2

    iget-boolean v0, p0, Lo4/m;->v0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lo4/m;->t0:I

    iget-boolean v0, p0, Lo4/m;->Y:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo4/m;->a0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lo4/m;->u0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lo4/m;->u0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p0}, Lo4/m;->y0()V

    :goto_1
    return v1
.end method

.method public final O(JJ)Z
    .locals 19

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    iget v0, v15, Lo4/m;->k0:I

    .line 4
    .line 5
    const/4 v14, 0x0

    .line 6
    const/4 v13, 0x1

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    move v0, v13

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v14

    .line 12
    :goto_0
    if-nez v0, :cond_10

    .line 13
    .line 14
    iget-boolean v0, v15, Lo4/m;->b0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, v15, Lo4/m;->w0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :try_start_0
    iget-object v0, v15, Lo4/m;->O:Lo4/j;

    .line 23
    .line 24
    iget-object v1, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lo4/j;->h(Landroid/media/MediaCodec$BufferInfo;)I

    .line 27
    .line 28
    .line 29
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 32
    .line 33
    .line 34
    iget-boolean v0, v15, Lo4/m;->B0:Z

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Lo4/m;->o0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return v14

    .line 42
    :cond_2
    iget-object v0, v15, Lo4/m;->O:Lo4/j;

    .line 43
    .line 44
    iget-object v1, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 45
    .line 46
    invoke-interface {v0, v1}, Lo4/j;->h(Landroid/media/MediaCodec$BufferInfo;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    :goto_1
    if-gez v0, :cond_8

    .line 51
    .line 52
    const/4 v1, -0x2

    .line 53
    if-ne v0, v1, :cond_5

    .line 54
    .line 55
    iput-boolean v13, v15, Lo4/m;->x0:Z

    .line 56
    .line 57
    iget-object v0, v15, Lo4/m;->O:Lo4/j;

    .line 58
    .line 59
    invoke-interface {v0}, Lo4/j;->b()Landroid/media/MediaFormat;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v1, v15, Lo4/m;->W:I

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    const-string v1, "width"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/16 v2, 0x20

    .line 74
    .line 75
    if-ne v1, v2, :cond_3

    .line 76
    .line 77
    const-string v1, "height"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ne v1, v2, :cond_3

    .line 84
    .line 85
    iput-boolean v13, v15, Lo4/m;->f0:Z

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iget-boolean v1, v15, Lo4/m;->d0:Z

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    const-string v1, "channel-count"

    .line 93
    .line 94
    invoke-virtual {v0, v1, v13}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iput-object v0, v15, Lo4/m;->Q:Landroid/media/MediaFormat;

    .line 98
    .line 99
    iput-boolean v13, v15, Lo4/m;->R:Z

    .line 100
    .line 101
    :goto_2
    return v13

    .line 102
    :cond_5
    iget-boolean v0, v15, Lo4/m;->g0:Z

    .line 103
    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    iget-boolean v0, v15, Lo4/m;->A0:Z

    .line 107
    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    iget v0, v15, Lo4/m;->t0:I

    .line 111
    .line 112
    const/4 v1, 0x2

    .line 113
    if-ne v0, v1, :cond_7

    .line 114
    .line 115
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 116
    .line 117
    .line 118
    :cond_7
    return v14

    .line 119
    :cond_8
    iget-boolean v1, v15, Lo4/m;->f0:Z

    .line 120
    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    iput-boolean v14, v15, Lo4/m;->f0:Z

    .line 124
    .line 125
    iget-object v1, v15, Lo4/m;->O:Lo4/j;

    .line 126
    .line 127
    invoke-interface {v1, v0, v14}, Lo4/j;->j(IZ)V

    .line 128
    .line 129
    .line 130
    return v13

    .line 131
    :cond_9
    iget-object v1, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 132
    .line 133
    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 134
    .line 135
    if-nez v2, :cond_a

    .line 136
    .line 137
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 138
    .line 139
    and-int/lit8 v1, v1, 0x4

    .line 140
    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 144
    .line 145
    .line 146
    return v14

    .line 147
    :cond_a
    iput v0, v15, Lo4/m;->k0:I

    .line 148
    .line 149
    iget-object v1, v15, Lo4/m;->O:Lo4/j;

    .line 150
    .line 151
    invoke-interface {v1, v0}, Lo4/j;->n(I)Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, v15, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 156
    .line 157
    if-eqz v0, :cond_b

    .line 158
    .line 159
    iget-object v1, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 160
    .line 161
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 164
    .line 165
    .line 166
    iget-object v0, v15, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    iget-object v1, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 169
    .line 170
    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 171
    .line 172
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 173
    .line 174
    add-int/2addr v2, v1

    .line 175
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 176
    .line 177
    .line 178
    :cond_b
    iget-boolean v0, v15, Lo4/m;->c0:Z

    .line 179
    .line 180
    if-eqz v0, :cond_c

    .line 181
    .line 182
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 183
    .line 184
    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 185
    .line 186
    const-wide/16 v3, 0x0

    .line 187
    .line 188
    cmp-long v1, v1, v3

    .line 189
    .line 190
    if-nez v1, :cond_c

    .line 191
    .line 192
    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 193
    .line 194
    and-int/lit8 v1, v1, 0x4

    .line 195
    .line 196
    if-eqz v1, :cond_c

    .line 197
    .line 198
    iget-wide v1, v15, Lo4/m;->y0:J

    .line 199
    .line 200
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    cmp-long v3, v1, v3

    .line 206
    .line 207
    if-eqz v3, :cond_c

    .line 208
    .line 209
    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 210
    .line 211
    :cond_c
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 212
    .line 213
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 214
    .line 215
    iget-object v2, v15, Lo4/m;->C:Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    move v3, v14

    .line 222
    :goto_3
    if-ge v3, v2, :cond_e

    .line 223
    .line 224
    iget-object v4, v15, Lo4/m;->C:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/lang/Long;

    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide v4

    .line 236
    cmp-long v4, v4, v0

    .line 237
    .line 238
    if-nez v4, :cond_d

    .line 239
    .line 240
    iget-object v0, v15, Lo4/m;->C:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move v0, v13

    .line 246
    goto :goto_4

    .line 247
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_e
    move v0, v14

    .line 251
    :goto_4
    iput-boolean v0, v15, Lo4/m;->m0:Z

    .line 252
    .line 253
    iget-wide v0, v15, Lo4/m;->z0:J

    .line 254
    .line 255
    iget-object v2, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 256
    .line 257
    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 258
    .line 259
    cmp-long v0, v0, v2

    .line 260
    .line 261
    if-nez v0, :cond_f

    .line 262
    .line 263
    move v0, v13

    .line 264
    goto :goto_5

    .line 265
    :cond_f
    move v0, v14

    .line 266
    :goto_5
    iput-boolean v0, v15, Lo4/m;->n0:Z

    .line 267
    .line 268
    invoke-virtual {v15, v2, v3}, Lo4/m;->z0(J)V

    .line 269
    .line 270
    .line 271
    :cond_10
    iget-boolean v0, v15, Lo4/m;->b0:Z

    .line 272
    .line 273
    if-eqz v0, :cond_12

    .line 274
    .line 275
    iget-boolean v0, v15, Lo4/m;->w0:Z

    .line 276
    .line 277
    if-eqz v0, :cond_12

    .line 278
    .line 279
    :try_start_1
    iget-object v5, v15, Lo4/m;->O:Lo4/j;

    .line 280
    .line 281
    iget-object v6, v15, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 282
    .line 283
    iget v7, v15, Lo4/m;->k0:I

    .line 284
    .line 285
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 286
    .line 287
    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 288
    .line 289
    const/4 v9, 0x1

    .line 290
    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 291
    .line 292
    iget-boolean v12, v15, Lo4/m;->m0:Z

    .line 293
    .line 294
    iget-boolean v3, v15, Lo4/m;->n0:Z

    .line 295
    .line 296
    iget-object v4, v15, Lo4/m;->G:Lv3/i0;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 297
    .line 298
    move-object/from16 v0, p0

    .line 299
    .line 300
    move-wide/from16 v1, p1

    .line 301
    .line 302
    move/from16 v16, v3

    .line 303
    .line 304
    move-object/from16 v17, v4

    .line 305
    .line 306
    move-wide/from16 v3, p3

    .line 307
    .line 308
    move/from16 v18, v13

    .line 309
    .line 310
    move/from16 v13, v16

    .line 311
    .line 312
    move/from16 v16, v14

    .line 313
    .line 314
    move-object/from16 v14, v17

    .line 315
    .line 316
    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lo4/m;->m0(JJLo4/j;Ljava/nio/ByteBuffer;IIIJZZLv3/i0;)Z

    .line 317
    .line 318
    .line 319
    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 320
    goto :goto_6

    .line 321
    :catch_1
    move/from16 v16, v14

    .line 322
    .line 323
    :catch_2
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 324
    .line 325
    .line 326
    iget-boolean v0, v15, Lo4/m;->B0:Z

    .line 327
    .line 328
    if-eqz v0, :cond_11

    .line 329
    .line 330
    invoke-virtual/range {p0 .. p0}, Lo4/m;->o0()V

    .line 331
    .line 332
    .line 333
    :cond_11
    return v16

    .line 334
    :cond_12
    move/from16 v18, v13

    .line 335
    .line 336
    move/from16 v16, v14

    .line 337
    .line 338
    iget-object v5, v15, Lo4/m;->O:Lo4/j;

    .line 339
    .line 340
    iget-object v6, v15, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 341
    .line 342
    iget v7, v15, Lo4/m;->k0:I

    .line 343
    .line 344
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 345
    .line 346
    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 347
    .line 348
    const/4 v9, 0x1

    .line 349
    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 350
    .line 351
    iget-boolean v12, v15, Lo4/m;->m0:Z

    .line 352
    .line 353
    iget-boolean v13, v15, Lo4/m;->n0:Z

    .line 354
    .line 355
    iget-object v14, v15, Lo4/m;->G:Lv3/i0;

    .line 356
    .line 357
    move-object/from16 v0, p0

    .line 358
    .line 359
    move-wide/from16 v1, p1

    .line 360
    .line 361
    move-wide/from16 v3, p3

    .line 362
    .line 363
    invoke-virtual/range {v0 .. v14}, Lo4/m;->m0(JJLo4/j;Ljava/nio/ByteBuffer;IIIJZZLv3/i0;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    :goto_6
    if-eqz v0, :cond_15

    .line 368
    .line 369
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 370
    .line 371
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 372
    .line 373
    invoke-virtual {v15, v0, v1}, Lo4/m;->i0(J)V

    .line 374
    .line 375
    .line 376
    iget-object v0, v15, Lo4/m;->D:Landroid/media/MediaCodec$BufferInfo;

    .line 377
    .line 378
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 379
    .line 380
    and-int/lit8 v0, v0, 0x4

    .line 381
    .line 382
    if-eqz v0, :cond_13

    .line 383
    .line 384
    move/from16 v14, v18

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_13
    move/from16 v14, v16

    .line 388
    .line 389
    :goto_7
    const/4 v0, -0x1

    .line 390
    iput v0, v15, Lo4/m;->k0:I

    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    iput-object v0, v15, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    if-nez v14, :cond_14

    .line 396
    .line 397
    return v18

    .line 398
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 399
    .line 400
    .line 401
    :cond_15
    return v16
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

.method public final P()Z
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lo4/m;->O:Lo4/j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_26

    .line 7
    .line 8
    iget v3, v1, Lo4/m;->t0:I

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    if-eq v3, v4, :cond_26

    .line 12
    .line 13
    iget-boolean v3, v1, Lo4/m;->A0:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_b

    .line 18
    .line 19
    :cond_0
    iget v3, v1, Lo4/m;->j0:I

    .line 20
    .line 21
    if-gez v3, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Lo4/j;->f()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, v1, Lo4/m;->j0:I

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 33
    .line 34
    iget-object v5, v1, Lo4/m;->O:Lo4/j;

    .line 35
    .line 36
    invoke-interface {v5, v0}, Lo4/j;->l(I)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, v3, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 43
    .line 44
    invoke-virtual {v0}, Lz3/g;->o()V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v0, v1, Lo4/m;->t0:I

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v5, -0x1

    .line 51
    const/4 v6, 0x1

    .line 52
    if-ne v0, v6, :cond_4

    .line 53
    .line 54
    iget-boolean v0, v1, Lo4/m;->g0:Z

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    iput-boolean v6, v1, Lo4/m;->w0:Z

    .line 60
    .line 61
    iget-object v7, v1, Lo4/m;->O:Lo4/j;

    .line 62
    .line 63
    iget v8, v1, Lo4/m;->j0:I

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const-wide/16 v11, 0x0

    .line 67
    .line 68
    const/4 v10, 0x4

    .line 69
    invoke-interface/range {v7 .. v12}, Lo4/j;->i(IIIJ)V

    .line 70
    .line 71
    .line 72
    iput v5, v1, Lo4/m;->j0:I

    .line 73
    .line 74
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 75
    .line 76
    iput-object v3, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    :goto_0
    iput v4, v1, Lo4/m;->t0:I

    .line 79
    .line 80
    return v2

    .line 81
    :cond_4
    iget-boolean v0, v1, Lo4/m;->e0:Z

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iput-boolean v2, v1, Lo4/m;->e0:Z

    .line 86
    .line 87
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 88
    .line 89
    iget-object v0, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    sget-object v2, Lo4/m;->J0:[B

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    .line 96
    iget-object v7, v1, Lo4/m;->O:Lo4/j;

    .line 97
    .line 98
    iget v8, v1, Lo4/m;->j0:I

    .line 99
    .line 100
    const/16 v9, 0x26

    .line 101
    .line 102
    const-wide/16 v11, 0x0

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    invoke-interface/range {v7 .. v12}, Lo4/j;->i(IIIJ)V

    .line 106
    .line 107
    .line 108
    iput v5, v1, Lo4/m;->j0:I

    .line 109
    .line 110
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 111
    .line 112
    iput-object v3, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    iput-boolean v6, v1, Lo4/m;->v0:Z

    .line 115
    .line 116
    return v6

    .line 117
    :cond_5
    iget v0, v1, Lo4/m;->s0:I

    .line 118
    .line 119
    if-ne v0, v6, :cond_7

    .line 120
    .line 121
    move v0, v2

    .line 122
    :goto_1
    iget-object v7, v1, Lo4/m;->P:Lv3/i0;

    .line 123
    .line 124
    iget-object v7, v7, Lv3/i0;->v:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-ge v0, v7, :cond_6

    .line 131
    .line 132
    iget-object v7, v1, Lo4/m;->P:Lv3/i0;

    .line 133
    .line 134
    iget-object v7, v7, Lv3/i0;->v:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    check-cast v7, [B

    .line 141
    .line 142
    iget-object v8, v1, Lo4/m;->z:Lz3/g;

    .line 143
    .line 144
    iget-object v8, v8, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v0, v0, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    iput v4, v1, Lo4/m;->s0:I

    .line 153
    .line 154
    :cond_7
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 155
    .line 156
    iget-object v0, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget-object v7, v1, Lv3/f;->b:Ll3/l;

    .line 163
    .line 164
    iput-object v3, v7, Ll3/l;->a:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v3, v7, Ll3/l;->b:Ljava/lang/Object;

    .line 167
    .line 168
    :try_start_0
    iget-object v8, v1, Lo4/m;->z:Lz3/g;

    .line 169
    .line 170
    invoke-virtual {v1, v7, v8, v2}, Lv3/f;->I(Ll3/l;Lz3/g;I)I

    .line 171
    .line 172
    .line 173
    move-result v8
    :try_end_0
    .catch Lz3/g$a; {:try_start_0 .. :try_end_0} :catch_2

    .line 174
    invoke-virtual/range {p0 .. p0}, Lv3/f;->h()Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-nez v9, :cond_8

    .line 179
    .line 180
    iget-object v9, v1, Lo4/m;->z:Lz3/g;

    .line 181
    .line 182
    const/high16 v10, 0x20000000

    .line 183
    .line 184
    invoke-virtual {v9, v10}, Lz3/a;->m(I)Z

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    if-eqz v9, :cond_9

    .line 189
    .line 190
    :cond_8
    iget-wide v9, v1, Lo4/m;->y0:J

    .line 191
    .line 192
    iput-wide v9, v1, Lo4/m;->z0:J

    .line 193
    .line 194
    :cond_9
    const/4 v9, -0x3

    .line 195
    if-ne v8, v9, :cond_a

    .line 196
    .line 197
    return v2

    .line 198
    :cond_a
    const/4 v9, -0x5

    .line 199
    if-ne v8, v9, :cond_c

    .line 200
    .line 201
    iget v0, v1, Lo4/m;->s0:I

    .line 202
    .line 203
    if-ne v0, v4, :cond_b

    .line 204
    .line 205
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 206
    .line 207
    invoke-virtual {v0}, Lz3/g;->o()V

    .line 208
    .line 209
    .line 210
    iput v6, v1, Lo4/m;->s0:I

    .line 211
    .line 212
    :cond_b
    invoke-virtual {v1, v7}, Lo4/m;->f0(Ll3/l;)Lz3/i;

    .line 213
    .line 214
    .line 215
    return v6

    .line 216
    :cond_c
    iget-object v7, v1, Lo4/m;->z:Lz3/g;

    .line 217
    .line 218
    const/4 v8, 0x4

    .line 219
    invoke-virtual {v7, v8}, Lz3/a;->m(I)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_10

    .line 224
    .line 225
    iget v0, v1, Lo4/m;->s0:I

    .line 226
    .line 227
    if-ne v0, v4, :cond_d

    .line 228
    .line 229
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 230
    .line 231
    invoke-virtual {v0}, Lz3/g;->o()V

    .line 232
    .line 233
    .line 234
    iput v6, v1, Lo4/m;->s0:I

    .line 235
    .line 236
    :cond_d
    iput-boolean v6, v1, Lo4/m;->A0:Z

    .line 237
    .line 238
    iget-boolean v0, v1, Lo4/m;->v0:Z

    .line 239
    .line 240
    if-nez v0, :cond_e

    .line 241
    .line 242
    invoke-virtual/range {p0 .. p0}, Lo4/m;->l0()V

    .line 243
    .line 244
    .line 245
    return v2

    .line 246
    :cond_e
    :try_start_1
    iget-boolean v0, v1, Lo4/m;->g0:Z

    .line 247
    .line 248
    if-eqz v0, :cond_f

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_f
    iput-boolean v6, v1, Lo4/m;->w0:Z

    .line 252
    .line 253
    iget-object v7, v1, Lo4/m;->O:Lo4/j;

    .line 254
    .line 255
    iget v8, v1, Lo4/m;->j0:I

    .line 256
    .line 257
    const/4 v9, 0x0

    .line 258
    const-wide/16 v11, 0x0

    .line 259
    .line 260
    const/4 v10, 0x4

    .line 261
    invoke-interface/range {v7 .. v12}, Lo4/j;->i(IIIJ)V

    .line 262
    .line 263
    .line 264
    iput v5, v1, Lo4/m;->j0:I

    .line 265
    .line 266
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 267
    .line 268
    iput-object v3, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 269
    .line 270
    :goto_2
    return v2

    .line 271
    :catch_0
    move-exception v0

    .line 272
    iget-object v3, v1, Lo4/m;->F:Lv3/i0;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-static {v4}, Lv5/e0;->r(I)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-virtual {v1, v4, v3, v0, v2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    throw v0

    .line 287
    :cond_10
    iget-boolean v7, v1, Lo4/m;->v0:Z

    .line 288
    .line 289
    if-nez v7, :cond_12

    .line 290
    .line 291
    iget-object v7, v1, Lo4/m;->z:Lz3/g;

    .line 292
    .line 293
    invoke-virtual {v7, v6}, Lz3/a;->m(I)Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-nez v7, :cond_12

    .line 298
    .line 299
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 300
    .line 301
    invoke-virtual {v0}, Lz3/g;->o()V

    .line 302
    .line 303
    .line 304
    iget v0, v1, Lo4/m;->s0:I

    .line 305
    .line 306
    if-ne v0, v4, :cond_11

    .line 307
    .line 308
    iput v6, v1, Lo4/m;->s0:I

    .line 309
    .line 310
    :cond_11
    return v6

    .line 311
    :cond_12
    iget-object v4, v1, Lo4/m;->z:Lz3/g;

    .line 312
    .line 313
    const/high16 v7, 0x40000000    # 2.0f

    .line 314
    .line 315
    invoke-virtual {v4, v7}, Lz3/a;->m(I)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_15

    .line 320
    .line 321
    iget-object v7, v1, Lo4/m;->z:Lz3/g;

    .line 322
    .line 323
    iget-object v7, v7, Lz3/g;->b:Lz3/c;

    .line 324
    .line 325
    if-nez v0, :cond_13

    .line 326
    .line 327
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_13
    iget-object v9, v7, Lz3/c;->d:[I

    .line 332
    .line 333
    if-nez v9, :cond_14

    .line 334
    .line 335
    new-array v9, v6, [I

    .line 336
    .line 337
    iput-object v9, v7, Lz3/c;->d:[I

    .line 338
    .line 339
    iget-object v10, v7, Lz3/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 340
    .line 341
    iput-object v9, v10, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 342
    .line 343
    :cond_14
    iget-object v7, v7, Lz3/c;->d:[I

    .line 344
    .line 345
    aget v9, v7, v2

    .line 346
    .line 347
    add-int/2addr v9, v0

    .line 348
    aput v9, v7, v2

    .line 349
    .line 350
    :cond_15
    :goto_3
    iget-boolean v0, v1, Lo4/m;->X:Z

    .line 351
    .line 352
    if-eqz v0, :cond_1b

    .line 353
    .line 354
    if-nez v4, :cond_1b

    .line 355
    .line 356
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 357
    .line 358
    iget-object v0, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 359
    .line 360
    sget-object v7, Lv5/q;->a:[B

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    move v9, v2

    .line 367
    move v10, v9

    .line 368
    :goto_4
    add-int/lit8 v11, v9, 0x1

    .line 369
    .line 370
    if-ge v11, v7, :cond_19

    .line 371
    .line 372
    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    and-int/lit16 v12, v12, 0xff

    .line 377
    .line 378
    const/4 v13, 0x3

    .line 379
    if-ne v10, v13, :cond_16

    .line 380
    .line 381
    if-ne v12, v6, :cond_17

    .line 382
    .line 383
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 384
    .line 385
    .line 386
    move-result v14

    .line 387
    and-int/lit8 v14, v14, 0x1f

    .line 388
    .line 389
    const/4 v15, 0x7

    .line 390
    if-ne v14, v15, :cond_17

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    sub-int/2addr v9, v13

    .line 397
    invoke-virtual {v10, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v10, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 407
    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_16
    if-nez v12, :cond_17

    .line 411
    .line 412
    add-int/lit8 v10, v10, 0x1

    .line 413
    .line 414
    :cond_17
    if-eqz v12, :cond_18

    .line 415
    .line 416
    move v10, v2

    .line 417
    :cond_18
    move v9, v11

    .line 418
    goto :goto_4

    .line 419
    :cond_19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 420
    .line 421
    .line 422
    :goto_5
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 423
    .line 424
    iget-object v0, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_1a

    .line 431
    .line 432
    return v6

    .line 433
    :cond_1a
    iput-boolean v2, v1, Lo4/m;->X:Z

    .line 434
    .line 435
    :cond_1b
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 436
    .line 437
    iget-wide v9, v0, Lz3/g;->e:J

    .line 438
    .line 439
    iget-object v7, v1, Lo4/m;->h0:Lo4/g;

    .line 440
    .line 441
    if-eqz v7, :cond_20

    .line 442
    .line 443
    iget-object v11, v1, Lo4/m;->F:Lv3/i0;

    .line 444
    .line 445
    iget-wide v12, v7, Lo4/g;->b:J

    .line 446
    .line 447
    const-wide/16 v14, 0x0

    .line 448
    .line 449
    cmp-long v12, v12, v14

    .line 450
    .line 451
    if-nez v12, :cond_1c

    .line 452
    .line 453
    iput-wide v9, v7, Lo4/g;->a:J

    .line 454
    .line 455
    :cond_1c
    iget-boolean v12, v7, Lo4/g;->c:Z

    .line 456
    .line 457
    const-wide/32 v16, 0xf4240

    .line 458
    .line 459
    .line 460
    const-wide/16 v18, 0x211

    .line 461
    .line 462
    if-eqz v12, :cond_1d

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_1d
    iget-object v9, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 466
    .line 467
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    move v10, v2

    .line 471
    move v12, v10

    .line 472
    :goto_6
    if-ge v10, v8, :cond_1e

    .line 473
    .line 474
    shl-int/lit8 v12, v12, 0x8

    .line 475
    .line 476
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 477
    .line 478
    .line 479
    move-result v13

    .line 480
    and-int/lit16 v13, v13, 0xff

    .line 481
    .line 482
    or-int/2addr v12, v13

    .line 483
    add-int/lit8 v10, v10, 0x1

    .line 484
    .line 485
    goto :goto_6

    .line 486
    :cond_1e
    invoke-static {v12}, Lx3/y;->b(I)I

    .line 487
    .line 488
    .line 489
    move-result v8

    .line 490
    if-ne v8, v5, :cond_1f

    .line 491
    .line 492
    iput-boolean v6, v7, Lo4/g;->c:Z

    .line 493
    .line 494
    iput-wide v14, v7, Lo4/g;->b:J

    .line 495
    .line 496
    iget-wide v8, v0, Lz3/g;->e:J

    .line 497
    .line 498
    iput-wide v8, v7, Lo4/g;->a:J

    .line 499
    .line 500
    const-string v7, "C2Mp3TimestampTracker"

    .line 501
    .line 502
    const-string v8, "MPEG audio header is invalid."

    .line 503
    .line 504
    invoke-static {v7, v8}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    iget-wide v7, v0, Lz3/g;->e:J

    .line 508
    .line 509
    move-wide v9, v7

    .line 510
    goto :goto_7

    .line 511
    :cond_1f
    iget v0, v11, Lv3/i0;->H:I

    .line 512
    .line 513
    int-to-long v9, v0

    .line 514
    iget-wide v11, v7, Lo4/g;->a:J

    .line 515
    .line 516
    iget-wide v5, v7, Lo4/g;->b:J

    .line 517
    .line 518
    sub-long v5, v5, v18

    .line 519
    .line 520
    mul-long v5, v5, v16

    .line 521
    .line 522
    div-long/2addr v5, v9

    .line 523
    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 524
    .line 525
    .line 526
    move-result-wide v5

    .line 527
    add-long/2addr v5, v11

    .line 528
    iget-wide v9, v7, Lo4/g;->b:J

    .line 529
    .line 530
    int-to-long v11, v8

    .line 531
    add-long/2addr v9, v11

    .line 532
    iput-wide v9, v7, Lo4/g;->b:J

    .line 533
    .line 534
    move-wide v9, v5

    .line 535
    :goto_7
    iget-wide v5, v1, Lo4/m;->y0:J

    .line 536
    .line 537
    iget-object v7, v1, Lo4/m;->h0:Lo4/g;

    .line 538
    .line 539
    iget-object v8, v1, Lo4/m;->F:Lv3/i0;

    .line 540
    .line 541
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    iget v8, v8, Lv3/i0;->H:I

    .line 545
    .line 546
    int-to-long v11, v8

    .line 547
    move/from16 v20, v4

    .line 548
    .line 549
    iget-wide v3, v7, Lo4/g;->a:J

    .line 550
    .line 551
    move-wide/from16 v21, v9

    .line 552
    .line 553
    iget-wide v8, v7, Lo4/g;->b:J

    .line 554
    .line 555
    sub-long v8, v8, v18

    .line 556
    .line 557
    mul-long v8, v8, v16

    .line 558
    .line 559
    div-long/2addr v8, v11

    .line 560
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 561
    .line 562
    .line 563
    move-result-wide v7

    .line 564
    add-long/2addr v7, v3

    .line 565
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    iput-wide v3, v1, Lo4/m;->y0:J

    .line 570
    .line 571
    move-wide/from16 v9, v21

    .line 572
    .line 573
    goto :goto_8

    .line 574
    :cond_20
    move/from16 v20, v4

    .line 575
    .line 576
    :goto_8
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 577
    .line 578
    invoke-virtual {v3}, Lz3/a;->n()Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-eqz v3, :cond_21

    .line 583
    .line 584
    iget-object v3, v1, Lo4/m;->C:Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    :cond_21
    iget-boolean v3, v1, Lo4/m;->C0:Z

    .line 594
    .line 595
    if-eqz v3, :cond_23

    .line 596
    .line 597
    iget-object v3, v1, Lo4/m;->E:Ljava/util/ArrayDeque;

    .line 598
    .line 599
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-nez v3, :cond_22

    .line 604
    .line 605
    iget-object v3, v1, Lo4/m;->E:Ljava/util/ArrayDeque;

    .line 606
    .line 607
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    check-cast v3, Lo4/m$c;

    .line 612
    .line 613
    goto :goto_9

    .line 614
    :cond_22
    iget-object v3, v1, Lo4/m;->G0:Lo4/m$c;

    .line 615
    .line 616
    :goto_9
    iget-object v3, v3, Lo4/m$c;->c:Lv5/b0;

    .line 617
    .line 618
    iget-object v4, v1, Lo4/m;->F:Lv3/i0;

    .line 619
    .line 620
    invoke-virtual {v3, v4, v9, v10}, Lv5/b0;->a(Ljava/lang/Object;J)V

    .line 621
    .line 622
    .line 623
    iput-boolean v2, v1, Lo4/m;->C0:Z

    .line 624
    .line 625
    :cond_23
    iget-wide v3, v1, Lo4/m;->y0:J

    .line 626
    .line 627
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 628
    .line 629
    .line 630
    move-result-wide v3

    .line 631
    iput-wide v3, v1, Lo4/m;->y0:J

    .line 632
    .line 633
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 634
    .line 635
    invoke-virtual {v3}, Lz3/g;->r()V

    .line 636
    .line 637
    .line 638
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 639
    .line 640
    const/high16 v4, 0x10000000

    .line 641
    .line 642
    invoke-virtual {v3, v4}, Lz3/a;->m(I)Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-eqz v3, :cond_24

    .line 647
    .line 648
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 649
    .line 650
    invoke-virtual {v1, v3}, Lo4/m;->Y(Lz3/g;)V

    .line 651
    .line 652
    .line 653
    :cond_24
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 654
    .line 655
    invoke-virtual {v1, v3}, Lo4/m;->k0(Lz3/g;)V

    .line 656
    .line 657
    .line 658
    if-eqz v20, :cond_25

    .line 659
    .line 660
    :try_start_2
    iget-object v3, v1, Lo4/m;->O:Lo4/j;

    .line 661
    .line 662
    iget v4, v1, Lo4/m;->j0:I

    .line 663
    .line 664
    iget-object v5, v1, Lo4/m;->z:Lz3/g;

    .line 665
    .line 666
    iget-object v5, v5, Lz3/g;->b:Lz3/c;

    .line 667
    .line 668
    invoke-interface {v3, v4, v5, v9, v10}, Lo4/j;->c(ILz3/c;J)V

    .line 669
    .line 670
    .line 671
    goto :goto_a

    .line 672
    :cond_25
    iget-object v5, v1, Lo4/m;->O:Lo4/j;

    .line 673
    .line 674
    iget v6, v1, Lo4/m;->j0:I

    .line 675
    .line 676
    iget-object v3, v1, Lo4/m;->z:Lz3/g;

    .line 677
    .line 678
    iget-object v3, v3, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 681
    .line 682
    .line 683
    move-result v7

    .line 684
    const/4 v8, 0x0

    .line 685
    invoke-interface/range {v5 .. v10}, Lo4/j;->i(IIIJ)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    .line 686
    .line 687
    .line 688
    :goto_a
    const/4 v0, -0x1

    .line 689
    iput v0, v1, Lo4/m;->j0:I

    .line 690
    .line 691
    iget-object v0, v1, Lo4/m;->z:Lz3/g;

    .line 692
    .line 693
    const/4 v3, 0x0

    .line 694
    iput-object v3, v0, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 695
    .line 696
    const/4 v3, 0x1

    .line 697
    iput-boolean v3, v1, Lo4/m;->v0:Z

    .line 698
    .line 699
    iput v2, v1, Lo4/m;->s0:I

    .line 700
    .line 701
    iget-object v0, v1, Lo4/m;->F0:Lz3/e;

    .line 702
    .line 703
    iget v2, v0, Lz3/e;->c:I

    .line 704
    .line 705
    add-int/2addr v2, v3

    .line 706
    iput v2, v0, Lz3/e;->c:I

    .line 707
    .line 708
    return v3

    .line 709
    :catch_1
    move-exception v0

    .line 710
    iget-object v3, v1, Lo4/m;->F:Lv3/i0;

    .line 711
    .line 712
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    invoke-static {v4}, Lv5/e0;->r(I)I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    invoke-virtual {v1, v4, v3, v0, v2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    throw v0

    .line 725
    :catch_2
    move-exception v0

    .line 726
    invoke-virtual {v1, v0}, Lo4/m;->c0(Ljava/lang/Exception;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v2}, Lo4/m;->n0(I)Z

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {p0 .. p0}, Lo4/m;->Q()V

    .line 733
    .line 734
    .line 735
    const/4 v2, 0x1

    .line 736
    :cond_26
    :goto_b
    return v2
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final Q()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lo4/m;->O:Lo4/j;

    invoke-interface {v0}, Lo4/j;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lo4/m;->q0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lo4/m;->q0()V

    throw v0
.end method

.method public final R()Z
    .locals 5

    iget-object v0, p0, Lo4/m;->O:Lo4/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lo4/m;->u0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lo4/m;->Y:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lo4/m;->Z:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lo4/m;->x0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lo4/m;->a0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lo4/m;->w0:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lv5/e0;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lx6/b;->H(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-virtual {p0}, Lo4/m;->y0()V
    :try_end_0
    .catch Lv3/n; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lo4/m;->o0()V

    return v3

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lo4/m;->Q()V

    return v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lo4/m;->o0()V

    return v3
.end method

.method public final S(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lo4/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lo4/m;->v:Lo4/n;

    .line 2
    .line 3
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p1}, Lo4/m;->V(Lo4/n;Lv3/i0;Z)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lo4/m;->v:Lo4/n;

    .line 18
    .line 19
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p0, p1, v0, v1}, Lo4/m;->V(Lo4/n;Lv3/i0;Z)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const-string p1, "Drm session requires secure decoder for "

    .line 33
    .line 34
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 39
    .line 40
    iget-object v1, v1, Lv3/i0;->t:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", but no secure decoder available. Trying to proceed with "

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "."

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v1, "MediaCodecRenderer"

    .line 63
    .line 64
    invoke-static {v1, p1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-object v0
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

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract U(F[Lv3/i0;)F
.end method

.method public abstract V(Lo4/n;Lv3/i0;Z)Ljava/util/ArrayList;
.end method

.method public final W(La4/e;)La4/p;
    .locals 3

    .line 1
    invoke-interface {p1}, La4/e;->l()Lz3/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, La4/p;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Expecting FrameworkCryptoConfig but found: "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lo4/m;->F:Lv3/i0;

    .line 35
    .line 36
    const/16 v1, 0x1771

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {p0, v1, p1, v0, v2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    check-cast p1, La4/p;

    .line 45
    .line 46
    return-object p1
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

.method public abstract X(Lo4/l;Lv3/i0;Landroid/media/MediaCrypto;F)Lo4/j$a;
.end method

.method public Y(Lz3/g;)V
    .locals 0

    return-void
.end method

.method public final Z(Lo4/l;Landroid/media/MediaCrypto;)V
    .locals 16

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lo4/l;->a:Ljava/lang/String;

    .line 6
    .line 7
    sget v1, Lv5/e0;->a:I

    .line 8
    .line 9
    const/16 v3, 0x17

    .line 10
    .line 11
    if-ge v1, v3, :cond_0

    .line 12
    .line 13
    const/high16 v3, -0x40800000    # -1.0f

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v3, v7, Lo4/m;->N:F

    .line 17
    .line 18
    iget-object v4, v7, Lv3/f;->p:[Lv3/i0;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v7, v3, v4}, Lo4/m;->U(F[Lv3/i0;)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    iget v4, v7, Lo4/m;->x:F

    .line 28
    .line 29
    cmpg-float v4, v3, v4

    .line 30
    .line 31
    if-gtz v4, :cond_1

    .line 32
    .line 33
    const/high16 v3, -0x40800000    # -1.0f

    .line 34
    .line 35
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    iget-object v6, v7, Lo4/m;->F:Lv3/i0;

    .line 40
    .line 41
    move-object/from16 v8, p2

    .line 42
    .line 43
    invoke-virtual {v7, v0, v6, v8, v3}, Lo4/m;->X(Lo4/l;Lv3/i0;Landroid/media/MediaCrypto;F)Lo4/j$a;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/16 v8, 0x1f

    .line 48
    .line 49
    if-lt v1, v8, :cond_2

    .line 50
    .line 51
    iget-object v1, v7, Lv3/f;->e:Lw3/a0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v1}, Lo4/m$a;->a(Lo4/j$a;Lw3/a0;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v8, "createCodec:"

    .line 65
    .line 66
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v7, Lo4/m;->u:Lo4/j$b;

    .line 80
    .line 81
    invoke-interface {v1, v6}, Lo4/j$b;->a(Lo4/j$a;)Lo4/j;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, v7, Lo4/m;->O:Lo4/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    invoke-static {}, Lp2/m0;->B()V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 91
    .line 92
    .line 93
    move-result-wide v8

    .line 94
    iget-object v1, v7, Lo4/m;->F:Lv3/i0;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lo4/l;->d(Lv3/i0;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/4 v6, 0x2

    .line 101
    if-nez v1, :cond_2d

    .line 102
    .line 103
    new-array v1, v6, [Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v6, v7, Lo4/m;->F:Lv3/i0;

    .line 106
    .line 107
    if-nez v6, :cond_3

    .line 108
    .line 109
    const-string v6, "null"

    .line 110
    .line 111
    goto/16 :goto_c

    .line 112
    .line 113
    :cond_3
    const-string v10, "id="

    .line 114
    .line 115
    invoke-static {v10}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    iget-object v11, v6, Lv3/i0;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v11, ", mimeType="

    .line 125
    .line 126
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v11, v6, Lv3/i0;->t:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget v11, v6, Lv3/i0;->p:I

    .line 135
    .line 136
    const/4 v12, -0x1

    .line 137
    if-eq v11, v12, :cond_4

    .line 138
    .line 139
    const-string v11, ", bitrate="

    .line 140
    .line 141
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    iget v11, v6, Lv3/i0;->p:I

    .line 145
    .line 146
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    :cond_4
    iget-object v11, v6, Lv3/i0;->q:Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v11, :cond_5

    .line 152
    .line 153
    const-string v11, ", codecs="

    .line 154
    .line 155
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v11, v6, Lv3/i0;->q:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    :cond_5
    iget-object v11, v6, Lv3/i0;->w:La4/d;

    .line 164
    .line 165
    if-eqz v11, :cond_e

    .line 166
    .line 167
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 168
    .line 169
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 170
    .line 171
    .line 172
    const/4 v13, 0x0

    .line 173
    :goto_1
    iget-object v14, v6, Lv3/i0;->w:La4/d;

    .line 174
    .line 175
    iget v15, v14, La4/d;->d:I

    .line 176
    .line 177
    if-ge v13, v15, :cond_b

    .line 178
    .line 179
    iget-object v14, v14, La4/d;->a:[La4/d$b;

    .line 180
    .line 181
    aget-object v14, v14, v13

    .line 182
    .line 183
    iget-object v14, v14, La4/d$b;->b:Ljava/util/UUID;

    .line 184
    .line 185
    sget-object v15, Lv3/h;->b:Ljava/util/UUID;

    .line 186
    .line 187
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_6

    .line 192
    .line 193
    const-string v14, "cenc"

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_6
    sget-object v15, Lv3/h;->c:Ljava/util/UUID;

    .line 197
    .line 198
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-eqz v15, :cond_7

    .line 203
    .line 204
    const-string v14, "clearkey"

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    sget-object v15, Lv3/h;->e:Ljava/util/UUID;

    .line 208
    .line 209
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-eqz v15, :cond_8

    .line 214
    .line 215
    const-string v14, "playready"

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    sget-object v15, Lv3/h;->d:Ljava/util/UUID;

    .line 219
    .line 220
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    if-eqz v15, :cond_9

    .line 225
    .line 226
    const-string v14, "widevine"

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_9
    sget-object v15, Lv3/h;->a:Ljava/util/UUID;

    .line 230
    .line 231
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_a

    .line 236
    .line 237
    const-string v14, "universal"

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_a
    new-instance v15, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v12, "unknown ("

    .line 246
    .line 247
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v12, ")"

    .line 254
    .line 255
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    :goto_2
    invoke-interface {v11, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    add-int/lit8 v13, v13, 0x1

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_b
    const-string v12, ", drm=["

    .line 269
    .line 270
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const/16 v12, 0x2c

    .line 274
    .line 275
    invoke-static {v12}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    :try_start_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-eqz v12, :cond_d

    .line 291
    .line 292
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    instance-of v14, v12, Ljava/lang/CharSequence;

    .line 300
    .line 301
    if-eqz v14, :cond_c

    .line 302
    .line 303
    check-cast v12, Ljava/lang/CharSequence;

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_c
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    :goto_4
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 311
    .line 312
    .line 313
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    if-eqz v12, :cond_d

    .line 318
    .line 319
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_d
    const/16 v11, 0x5d

    .line 324
    .line 325
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :catch_0
    move-exception v0

    .line 330
    new-instance v1, Ljava/lang/AssertionError;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :cond_e
    :goto_5
    iget v11, v6, Lv3/i0;->y:I

    .line 337
    .line 338
    const/4 v12, -0x1

    .line 339
    if-eq v11, v12, :cond_f

    .line 340
    .line 341
    iget v11, v6, Lv3/i0;->z:I

    .line 342
    .line 343
    if-eq v11, v12, :cond_f

    .line 344
    .line 345
    const-string v11, ", res="

    .line 346
    .line 347
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    iget v11, v6, Lv3/i0;->y:I

    .line 351
    .line 352
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v11, "x"

    .line 356
    .line 357
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    iget v11, v6, Lv3/i0;->z:I

    .line 361
    .line 362
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    :cond_f
    iget v11, v6, Lv3/i0;->A:F

    .line 366
    .line 367
    const/high16 v12, -0x40800000    # -1.0f

    .line 368
    .line 369
    cmpl-float v11, v11, v12

    .line 370
    .line 371
    if-eqz v11, :cond_10

    .line 372
    .line 373
    const-string v11, ", fps="

    .line 374
    .line 375
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    iget v11, v6, Lv3/i0;->A:F

    .line 379
    .line 380
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    :cond_10
    iget v11, v6, Lv3/i0;->G:I

    .line 384
    .line 385
    const/4 v12, -0x1

    .line 386
    if-eq v11, v12, :cond_11

    .line 387
    .line 388
    const-string v11, ", channels="

    .line 389
    .line 390
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    iget v11, v6, Lv3/i0;->G:I

    .line 394
    .line 395
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    :cond_11
    iget v11, v6, Lv3/i0;->H:I

    .line 399
    .line 400
    if-eq v11, v12, :cond_12

    .line 401
    .line 402
    const-string v11, ", sample_rate="

    .line 403
    .line 404
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    iget v11, v6, Lv3/i0;->H:I

    .line 408
    .line 409
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    :cond_12
    iget-object v11, v6, Lv3/i0;->c:Ljava/lang/String;

    .line 413
    .line 414
    if-eqz v11, :cond_13

    .line 415
    .line 416
    const-string v11, ", language="

    .line 417
    .line 418
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    iget-object v11, v6, Lv3/i0;->c:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    :cond_13
    iget-object v11, v6, Lv3/i0;->b:Ljava/lang/String;

    .line 427
    .line 428
    if-eqz v11, :cond_14

    .line 429
    .line 430
    const-string v11, ", label="

    .line 431
    .line 432
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    iget-object v11, v6, Lv3/i0;->b:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    :cond_14
    iget v11, v6, Lv3/i0;->d:I

    .line 441
    .line 442
    const-string v12, "]"

    .line 443
    .line 444
    if-eqz v11, :cond_1a

    .line 445
    .line 446
    new-instance v11, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 449
    .line 450
    .line 451
    iget v13, v6, Lv3/i0;->d:I

    .line 452
    .line 453
    and-int/lit8 v13, v13, 0x4

    .line 454
    .line 455
    if-eqz v13, :cond_15

    .line 456
    .line 457
    const-string v13, "auto"

    .line 458
    .line 459
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    :cond_15
    iget v13, v6, Lv3/i0;->d:I

    .line 463
    .line 464
    and-int/lit8 v13, v13, 0x1

    .line 465
    .line 466
    if-eqz v13, :cond_16

    .line 467
    .line 468
    const-string v13, "default"

    .line 469
    .line 470
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    :cond_16
    iget v13, v6, Lv3/i0;->d:I

    .line 474
    .line 475
    and-int/lit8 v13, v13, 0x2

    .line 476
    .line 477
    if-eqz v13, :cond_17

    .line 478
    .line 479
    const-string v13, "forced"

    .line 480
    .line 481
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    :cond_17
    const-string v13, ", selectionFlags=["

    .line 485
    .line 486
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    const/16 v13, 0x2c

    .line 490
    .line 491
    invoke-static {v13}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v14

    .line 495
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v11

    .line 502
    :try_start_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    if-eqz v13, :cond_19

    .line 507
    .line 508
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    instance-of v15, v13, Ljava/lang/CharSequence;

    .line 516
    .line 517
    if-eqz v15, :cond_18

    .line 518
    .line 519
    check-cast v13, Ljava/lang/CharSequence;

    .line 520
    .line 521
    goto :goto_7

    .line 522
    :cond_18
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v13

    .line 526
    :goto_7
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 527
    .line 528
    .line 529
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v13

    .line 533
    if-eqz v13, :cond_19

    .line 534
    .line 535
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 536
    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_19
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    goto :goto_8

    .line 543
    :catch_1
    move-exception v0

    .line 544
    new-instance v1, Ljava/lang/AssertionError;

    .line 545
    .line 546
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :cond_1a
    :goto_8
    iget v11, v6, Lv3/i0;->e:I

    .line 551
    .line 552
    if-eqz v11, :cond_2c

    .line 553
    .line 554
    new-instance v11, Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 557
    .line 558
    .line 559
    iget v13, v6, Lv3/i0;->e:I

    .line 560
    .line 561
    and-int/lit8 v13, v13, 0x1

    .line 562
    .line 563
    if-eqz v13, :cond_1b

    .line 564
    .line 565
    const-string v13, "main"

    .line 566
    .line 567
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    :cond_1b
    iget v13, v6, Lv3/i0;->e:I

    .line 571
    .line 572
    and-int/lit8 v13, v13, 0x2

    .line 573
    .line 574
    if-eqz v13, :cond_1c

    .line 575
    .line 576
    const-string v13, "alt"

    .line 577
    .line 578
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    :cond_1c
    iget v13, v6, Lv3/i0;->e:I

    .line 582
    .line 583
    and-int/lit8 v13, v13, 0x4

    .line 584
    .line 585
    if-eqz v13, :cond_1d

    .line 586
    .line 587
    const-string v13, "supplementary"

    .line 588
    .line 589
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    :cond_1d
    iget v13, v6, Lv3/i0;->e:I

    .line 593
    .line 594
    and-int/lit8 v13, v13, 0x8

    .line 595
    .line 596
    if-eqz v13, :cond_1e

    .line 597
    .line 598
    const-string v13, "commentary"

    .line 599
    .line 600
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    :cond_1e
    iget v13, v6, Lv3/i0;->e:I

    .line 604
    .line 605
    and-int/lit8 v13, v13, 0x10

    .line 606
    .line 607
    if-eqz v13, :cond_1f

    .line 608
    .line 609
    const-string v13, "dub"

    .line 610
    .line 611
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    :cond_1f
    iget v13, v6, Lv3/i0;->e:I

    .line 615
    .line 616
    and-int/lit8 v13, v13, 0x20

    .line 617
    .line 618
    if-eqz v13, :cond_20

    .line 619
    .line 620
    const-string v13, "emergency"

    .line 621
    .line 622
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    :cond_20
    iget v13, v6, Lv3/i0;->e:I

    .line 626
    .line 627
    and-int/lit8 v13, v13, 0x40

    .line 628
    .line 629
    if-eqz v13, :cond_21

    .line 630
    .line 631
    const-string v13, "caption"

    .line 632
    .line 633
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    :cond_21
    iget v13, v6, Lv3/i0;->e:I

    .line 637
    .line 638
    and-int/lit16 v13, v13, 0x80

    .line 639
    .line 640
    if-eqz v13, :cond_22

    .line 641
    .line 642
    const-string v13, "subtitle"

    .line 643
    .line 644
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    :cond_22
    iget v13, v6, Lv3/i0;->e:I

    .line 648
    .line 649
    and-int/lit16 v13, v13, 0x100

    .line 650
    .line 651
    if-eqz v13, :cond_23

    .line 652
    .line 653
    const-string v13, "sign"

    .line 654
    .line 655
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    :cond_23
    iget v13, v6, Lv3/i0;->e:I

    .line 659
    .line 660
    and-int/lit16 v13, v13, 0x200

    .line 661
    .line 662
    if-eqz v13, :cond_24

    .line 663
    .line 664
    const-string v13, "describes-video"

    .line 665
    .line 666
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    :cond_24
    iget v13, v6, Lv3/i0;->e:I

    .line 670
    .line 671
    and-int/lit16 v13, v13, 0x400

    .line 672
    .line 673
    if-eqz v13, :cond_25

    .line 674
    .line 675
    const-string v13, "describes-music"

    .line 676
    .line 677
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    :cond_25
    iget v13, v6, Lv3/i0;->e:I

    .line 681
    .line 682
    and-int/lit16 v13, v13, 0x800

    .line 683
    .line 684
    if-eqz v13, :cond_26

    .line 685
    .line 686
    const-string v13, "enhanced-intelligibility"

    .line 687
    .line 688
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    :cond_26
    iget v13, v6, Lv3/i0;->e:I

    .line 692
    .line 693
    and-int/lit16 v13, v13, 0x1000

    .line 694
    .line 695
    if-eqz v13, :cond_27

    .line 696
    .line 697
    const-string v13, "transcribes-dialog"

    .line 698
    .line 699
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    :cond_27
    iget v13, v6, Lv3/i0;->e:I

    .line 703
    .line 704
    and-int/lit16 v13, v13, 0x2000

    .line 705
    .line 706
    if-eqz v13, :cond_28

    .line 707
    .line 708
    const-string v13, "easy-read"

    .line 709
    .line 710
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    :cond_28
    iget v6, v6, Lv3/i0;->e:I

    .line 714
    .line 715
    and-int/lit16 v6, v6, 0x4000

    .line 716
    .line 717
    if-eqz v6, :cond_29

    .line 718
    .line 719
    const-string v6, "trick-play"

    .line 720
    .line 721
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    :cond_29
    const-string v6, ", roleFlags=["

    .line 725
    .line 726
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    const/16 v6, 0x2c

    .line 730
    .line 731
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v11

    .line 742
    :try_start_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v13

    .line 746
    if-eqz v13, :cond_2b

    .line 747
    .line 748
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v13

    .line 752
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    instance-of v14, v13, Ljava/lang/CharSequence;

    .line 756
    .line 757
    if-eqz v14, :cond_2a

    .line 758
    .line 759
    check-cast v13, Ljava/lang/CharSequence;

    .line 760
    .line 761
    goto :goto_a

    .line 762
    :cond_2a
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v13

    .line 766
    :goto_a
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 767
    .line 768
    .line 769
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v13

    .line 773
    if-eqz v13, :cond_2b

    .line 774
    .line 775
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 776
    .line 777
    .line 778
    goto :goto_9

    .line 779
    :cond_2b
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    goto :goto_b

    .line 783
    :catch_2
    move-exception v0

    .line 784
    new-instance v1, Ljava/lang/AssertionError;

    .line 785
    .line 786
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    throw v1

    .line 790
    :cond_2c
    :goto_b
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    :goto_c
    const/4 v10, 0x0

    .line 795
    aput-object v6, v1, v10

    .line 796
    .line 797
    const/4 v6, 0x1

    .line 798
    aput-object v2, v1, v6

    .line 799
    .line 800
    const-string v6, "Format exceeds selected codec\'s capabilities [%s, %s]"

    .line 801
    .line 802
    invoke-static {v6, v1}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    const-string v6, "MediaCodecRenderer"

    .line 807
    .line 808
    invoke-static {v6, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    goto :goto_d

    .line 812
    :cond_2d
    const/4 v10, 0x0

    .line 813
    :goto_d
    iput-object v0, v7, Lo4/m;->V:Lo4/l;

    .line 814
    .line 815
    iput v3, v7, Lo4/m;->S:F

    .line 816
    .line 817
    iget-object v1, v7, Lo4/m;->F:Lv3/i0;

    .line 818
    .line 819
    iput-object v1, v7, Lo4/m;->P:Lv3/i0;

    .line 820
    .line 821
    sget v1, Lv5/e0;->a:I

    .line 822
    .line 823
    const-string v3, "OMX.Exynos.avc.dec.secure"

    .line 824
    .line 825
    const/16 v6, 0x19

    .line 826
    .line 827
    if-gt v1, v6, :cond_2f

    .line 828
    .line 829
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v11

    .line 833
    if-eqz v11, :cond_2f

    .line 834
    .line 835
    sget-object v11, Lv5/e0;->d:Ljava/lang/String;

    .line 836
    .line 837
    const-string v12, "SM-T585"

    .line 838
    .line 839
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 840
    .line 841
    .line 842
    move-result v12

    .line 843
    if-nez v12, :cond_2e

    .line 844
    .line 845
    const-string v12, "SM-A510"

    .line 846
    .line 847
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 848
    .line 849
    .line 850
    move-result v12

    .line 851
    if-nez v12, :cond_2e

    .line 852
    .line 853
    const-string v12, "SM-A520"

    .line 854
    .line 855
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 856
    .line 857
    .line 858
    move-result v12

    .line 859
    if-nez v12, :cond_2e

    .line 860
    .line 861
    const-string v12, "SM-J700"

    .line 862
    .line 863
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 864
    .line 865
    .line 866
    move-result v11

    .line 867
    if-eqz v11, :cond_2f

    .line 868
    .line 869
    :cond_2e
    const/4 v11, 0x2

    .line 870
    goto :goto_e

    .line 871
    :cond_2f
    const/16 v11, 0x18

    .line 872
    .line 873
    if-ge v1, v11, :cond_32

    .line 874
    .line 875
    const-string v11, "OMX.Nvidia.h264.decode"

    .line 876
    .line 877
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v11

    .line 881
    if-nez v11, :cond_30

    .line 882
    .line 883
    const-string v11, "OMX.Nvidia.h264.decode.secure"

    .line 884
    .line 885
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v11

    .line 889
    if-eqz v11, :cond_32

    .line 890
    .line 891
    :cond_30
    sget-object v11, Lv5/e0;->b:Ljava/lang/String;

    .line 892
    .line 893
    const-string v12, "flounder"

    .line 894
    .line 895
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v12

    .line 899
    if-nez v12, :cond_31

    .line 900
    .line 901
    const-string v12, "flounder_lte"

    .line 902
    .line 903
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v12

    .line 907
    if-nez v12, :cond_31

    .line 908
    .line 909
    const-string v12, "grouper"

    .line 910
    .line 911
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v12

    .line 915
    if-nez v12, :cond_31

    .line 916
    .line 917
    const-string v12, "tilapia"

    .line 918
    .line 919
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v11

    .line 923
    if-eqz v11, :cond_32

    .line 924
    .line 925
    :cond_31
    const/4 v11, 0x1

    .line 926
    goto :goto_e

    .line 927
    :cond_32
    move v11, v10

    .line 928
    :goto_e
    iput v11, v7, Lo4/m;->W:I

    .line 929
    .line 930
    iget-object v11, v7, Lo4/m;->P:Lv3/i0;

    .line 931
    .line 932
    const/16 v12, 0x15

    .line 933
    .line 934
    if-ge v1, v12, :cond_33

    .line 935
    .line 936
    iget-object v11, v11, Lv3/i0;->v:Ljava/util/List;

    .line 937
    .line 938
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 939
    .line 940
    .line 941
    move-result v11

    .line 942
    if-eqz v11, :cond_33

    .line 943
    .line 944
    const-string v11, "OMX.MTK.VIDEO.DECODER.AVC"

    .line 945
    .line 946
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v11

    .line 950
    if-eqz v11, :cond_33

    .line 951
    .line 952
    const/4 v11, 0x1

    .line 953
    goto :goto_f

    .line 954
    :cond_33
    move v11, v10

    .line 955
    :goto_f
    iput-boolean v11, v7, Lo4/m;->X:Z

    .line 956
    .line 957
    const/16 v11, 0x13

    .line 958
    .line 959
    const/16 v13, 0x12

    .line 960
    .line 961
    if-lt v1, v13, :cond_36

    .line 962
    .line 963
    if-ne v1, v13, :cond_34

    .line 964
    .line 965
    const-string v14, "OMX.SEC.avc.dec"

    .line 966
    .line 967
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-result v14

    .line 971
    if-nez v14, :cond_36

    .line 972
    .line 973
    const-string v14, "OMX.SEC.avc.dec.secure"

    .line 974
    .line 975
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    move-result v14

    .line 979
    if-nez v14, :cond_36

    .line 980
    .line 981
    :cond_34
    if-ne v1, v11, :cond_35

    .line 982
    .line 983
    sget-object v14, Lv5/e0;->d:Ljava/lang/String;

    .line 984
    .line 985
    const-string v15, "SM-G800"

    .line 986
    .line 987
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 988
    .line 989
    .line 990
    move-result v14

    .line 991
    if-eqz v14, :cond_35

    .line 992
    .line 993
    const-string v14, "OMX.Exynos.avc.dec"

    .line 994
    .line 995
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v14

    .line 999
    if-nez v14, :cond_36

    .line 1000
    .line 1001
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    if-eqz v3, :cond_35

    .line 1006
    .line 1007
    goto :goto_10

    .line 1008
    :cond_35
    move v3, v10

    .line 1009
    goto :goto_11

    .line 1010
    :cond_36
    :goto_10
    const/4 v3, 0x1

    .line 1011
    :goto_11
    iput-boolean v3, v7, Lo4/m;->Y:Z

    .line 1012
    .line 1013
    const/16 v3, 0x1d

    .line 1014
    .line 1015
    if-ne v1, v3, :cond_37

    .line 1016
    .line 1017
    const-string v14, "c2.android.aac.decoder"

    .line 1018
    .line 1019
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v14

    .line 1023
    if-eqz v14, :cond_37

    .line 1024
    .line 1025
    const/4 v14, 0x1

    .line 1026
    goto :goto_12

    .line 1027
    :cond_37
    move v14, v10

    .line 1028
    :goto_12
    iput-boolean v14, v7, Lo4/m;->Z:Z

    .line 1029
    .line 1030
    const/16 v14, 0x17

    .line 1031
    .line 1032
    if-gt v1, v14, :cond_38

    .line 1033
    .line 1034
    const-string v14, "OMX.google.vorbis.decoder"

    .line 1035
    .line 1036
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v14

    .line 1040
    if-nez v14, :cond_3a

    .line 1041
    .line 1042
    :cond_38
    if-gt v1, v11, :cond_3b

    .line 1043
    .line 1044
    sget-object v11, Lv5/e0;->b:Ljava/lang/String;

    .line 1045
    .line 1046
    const-string v14, "hb2000"

    .line 1047
    .line 1048
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v14

    .line 1052
    if-nez v14, :cond_39

    .line 1053
    .line 1054
    const-string v14, "stvm8"

    .line 1055
    .line 1056
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v11

    .line 1060
    if-eqz v11, :cond_3b

    .line 1061
    .line 1062
    :cond_39
    const-string v11, "OMX.amlogic.avc.decoder.awesome"

    .line 1063
    .line 1064
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v11

    .line 1068
    if-nez v11, :cond_3a

    .line 1069
    .line 1070
    const-string v11, "OMX.amlogic.avc.decoder.awesome.secure"

    .line 1071
    .line 1072
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v11

    .line 1076
    if-eqz v11, :cond_3b

    .line 1077
    .line 1078
    :cond_3a
    const/4 v11, 0x1

    .line 1079
    goto :goto_13

    .line 1080
    :cond_3b
    move v11, v10

    .line 1081
    :goto_13
    iput-boolean v11, v7, Lo4/m;->a0:Z

    .line 1082
    .line 1083
    if-ne v1, v12, :cond_3c

    .line 1084
    .line 1085
    const-string v11, "OMX.google.aac.decoder"

    .line 1086
    .line 1087
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v11

    .line 1091
    if-eqz v11, :cond_3c

    .line 1092
    .line 1093
    const/4 v11, 0x1

    .line 1094
    goto :goto_14

    .line 1095
    :cond_3c
    move v11, v10

    .line 1096
    :goto_14
    iput-boolean v11, v7, Lo4/m;->b0:Z

    .line 1097
    .line 1098
    if-ge v1, v12, :cond_3e

    .line 1099
    .line 1100
    const-string v11, "OMX.SEC.mp3.dec"

    .line 1101
    .line 1102
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v11

    .line 1106
    if-eqz v11, :cond_3e

    .line 1107
    .line 1108
    sget-object v11, Lv5/e0;->c:Ljava/lang/String;

    .line 1109
    .line 1110
    const-string v12, "samsung"

    .line 1111
    .line 1112
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v11

    .line 1116
    if-eqz v11, :cond_3e

    .line 1117
    .line 1118
    sget-object v11, Lv5/e0;->b:Ljava/lang/String;

    .line 1119
    .line 1120
    const-string v12, "baffin"

    .line 1121
    .line 1122
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v12

    .line 1126
    if-nez v12, :cond_3d

    .line 1127
    .line 1128
    const-string v12, "grand"

    .line 1129
    .line 1130
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v12

    .line 1134
    if-nez v12, :cond_3d

    .line 1135
    .line 1136
    const-string v12, "fortuna"

    .line 1137
    .line 1138
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v12

    .line 1142
    if-nez v12, :cond_3d

    .line 1143
    .line 1144
    const-string v12, "gprimelte"

    .line 1145
    .line 1146
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v12

    .line 1150
    if-nez v12, :cond_3d

    .line 1151
    .line 1152
    const-string v12, "j2y18lte"

    .line 1153
    .line 1154
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v12

    .line 1158
    if-nez v12, :cond_3d

    .line 1159
    .line 1160
    const-string v12, "ms01"

    .line 1161
    .line 1162
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v11

    .line 1166
    if-eqz v11, :cond_3e

    .line 1167
    .line 1168
    :cond_3d
    const/4 v11, 0x1

    .line 1169
    goto :goto_15

    .line 1170
    :cond_3e
    move v11, v10

    .line 1171
    :goto_15
    iput-boolean v11, v7, Lo4/m;->c0:Z

    .line 1172
    .line 1173
    iget-object v11, v7, Lo4/m;->P:Lv3/i0;

    .line 1174
    .line 1175
    if-gt v1, v13, :cond_3f

    .line 1176
    .line 1177
    iget v11, v11, Lv3/i0;->G:I

    .line 1178
    .line 1179
    const/4 v12, 0x1

    .line 1180
    if-ne v11, v12, :cond_3f

    .line 1181
    .line 1182
    const-string v11, "OMX.MTK.AUDIO.DECODER.MP3"

    .line 1183
    .line 1184
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v11

    .line 1188
    if-eqz v11, :cond_3f

    .line 1189
    .line 1190
    const/4 v11, 0x1

    .line 1191
    goto :goto_16

    .line 1192
    :cond_3f
    move v11, v10

    .line 1193
    :goto_16
    iput-boolean v11, v7, Lo4/m;->d0:Z

    .line 1194
    .line 1195
    iget-object v11, v0, Lo4/l;->a:Ljava/lang/String;

    .line 1196
    .line 1197
    if-gt v1, v6, :cond_40

    .line 1198
    .line 1199
    const-string v6, "OMX.rk.video_decoder.avc"

    .line 1200
    .line 1201
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v6

    .line 1205
    if-nez v6, :cond_43

    .line 1206
    .line 1207
    :cond_40
    const/16 v6, 0x11

    .line 1208
    .line 1209
    if-gt v1, v6, :cond_41

    .line 1210
    .line 1211
    const-string v6, "OMX.allwinner.video.decoder.avc"

    .line 1212
    .line 1213
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v6

    .line 1217
    if-nez v6, :cond_43

    .line 1218
    .line 1219
    :cond_41
    if-gt v1, v3, :cond_42

    .line 1220
    .line 1221
    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    .line 1222
    .line 1223
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    if-nez v1, :cond_43

    .line 1228
    .line 1229
    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 1230
    .line 1231
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v1

    .line 1235
    if-nez v1, :cond_43

    .line 1236
    .line 1237
    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    .line 1238
    .line 1239
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v1

    .line 1243
    if-nez v1, :cond_43

    .line 1244
    .line 1245
    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 1246
    .line 1247
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v1

    .line 1251
    if-nez v1, :cond_43

    .line 1252
    .line 1253
    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    .line 1254
    .line 1255
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v1

    .line 1259
    if-nez v1, :cond_43

    .line 1260
    .line 1261
    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 1262
    .line 1263
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v1

    .line 1267
    if-nez v1, :cond_43

    .line 1268
    .line 1269
    :cond_42
    sget-object v1, Lv5/e0;->c:Ljava/lang/String;

    .line 1270
    .line 1271
    const-string v3, "Amazon"

    .line 1272
    .line 1273
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v1

    .line 1277
    if-eqz v1, :cond_44

    .line 1278
    .line 1279
    sget-object v1, Lv5/e0;->d:Ljava/lang/String;

    .line 1280
    .line 1281
    const-string v3, "AFTS"

    .line 1282
    .line 1283
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v1

    .line 1287
    if-eqz v1, :cond_44

    .line 1288
    .line 1289
    iget-boolean v1, v0, Lo4/l;->f:Z

    .line 1290
    .line 1291
    if-eqz v1, :cond_44

    .line 1292
    .line 1293
    :cond_43
    const/4 v1, 0x1

    .line 1294
    goto :goto_17

    .line 1295
    :cond_44
    move v1, v10

    .line 1296
    :goto_17
    if-nez v1, :cond_45

    .line 1297
    .line 1298
    invoke-virtual/range {p0 .. p0}, Lo4/m;->T()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    if-eqz v1, :cond_46

    .line 1303
    .line 1304
    :cond_45
    const/4 v10, 0x1

    .line 1305
    :cond_46
    iput-boolean v10, v7, Lo4/m;->g0:Z

    .line 1306
    .line 1307
    iget-object v1, v7, Lo4/m;->O:Lo4/j;

    .line 1308
    .line 1309
    invoke-interface {v1}, Lo4/j;->a()V

    .line 1310
    .line 1311
    .line 1312
    iget-object v0, v0, Lo4/l;->a:Ljava/lang/String;

    .line 1313
    .line 1314
    const-string v1, "c2.android.mp3.decoder"

    .line 1315
    .line 1316
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v0

    .line 1320
    if-eqz v0, :cond_47

    .line 1321
    .line 1322
    new-instance v0, Lo4/g;

    .line 1323
    .line 1324
    invoke-direct {v0}, Lo4/g;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    iput-object v0, v7, Lo4/m;->h0:Lo4/g;

    .line 1328
    .line 1329
    :cond_47
    iget v0, v7, Lv3/f;->f:I

    .line 1330
    .line 1331
    const/4 v1, 0x2

    .line 1332
    if-ne v0, v1, :cond_48

    .line 1333
    .line 1334
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1335
    .line 1336
    .line 1337
    move-result-wide v0

    .line 1338
    const-wide/16 v10, 0x3e8

    .line 1339
    .line 1340
    add-long/2addr v0, v10

    .line 1341
    iput-wide v0, v7, Lo4/m;->i0:J

    .line 1342
    .line 1343
    :cond_48
    iget-object v0, v7, Lo4/m;->F0:Lz3/e;

    .line 1344
    .line 1345
    iget v1, v0, Lz3/e;->a:I

    .line 1346
    .line 1347
    add-int/lit8 v1, v1, 0x1

    .line 1348
    .line 1349
    iput v1, v0, Lz3/e;->a:I

    .line 1350
    .line 1351
    sub-long v5, v8, v4

    .line 1352
    .line 1353
    move-object/from16 v1, p0

    .line 1354
    .line 1355
    move-wide v3, v8

    .line 1356
    invoke-virtual/range {v1 .. v6}, Lo4/m;->d0(Ljava/lang/String;JJ)V

    .line 1357
    .line 1358
    .line 1359
    return-void

    .line 1360
    :catchall_0
    move-exception v0

    .line 1361
    invoke-static {}, Lp2/m0;->B()V

    .line 1362
    .line 1363
    .line 1364
    throw v0
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public final a(Lv3/i0;)I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lo4/m;->v:Lo4/n;

    invoke-virtual {p0, v0, p1}, Lo4/m;->w0(Lo4/n;Lv3/i0;)I

    move-result p1
    :try_end_0
    .catch Lo4/p$b; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0, p1}, Lv3/f;->A(Lo4/p$b;Lv3/i0;)Lv3/n;

    move-result-object p1

    throw p1
.end method

.method public final a0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lo4/m;->O:Lo4/j;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-boolean v0, p0, Lo4/m;->o0:Z

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lo4/m;->I:La4/e;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lo4/m;->v0(Lv3/i0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 27
    .line 28
    invoke-virtual {p0}, Lo4/m;->M()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "audio/mp4a-latm"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    const-string v1, "audio/mpeg"

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    const-string v1, "audio/opus"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lo4/m;->B:Lo4/f;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iput v2, v0, Lo4/f;->s:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v0, p0, Lo4/m;->B:Lo4/f;

    .line 66
    .line 67
    const/16 v1, 0x20

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iput v1, v0, Lo4/f;->s:I

    .line 73
    .line 74
    :goto_0
    iput-boolean v2, p0, Lo4/m;->o0:Z

    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    iget-object v0, p0, Lo4/m;->I:La4/e;

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Lo4/m;->s0(La4/e;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 83
    .line 84
    iget-object v0, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v1, p0, Lo4/m;->H:La4/e;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    if-eqz v1, :cond_8

    .line 90
    .line 91
    iget-object v4, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    .line 92
    .line 93
    if-nez v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Lo4/m;->W(La4/e;)La4/p;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lo4/m;->H:La4/e;

    .line 102
    .line 103
    invoke-interface {v0}, La4/e;->k()La4/e$a;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    return-void

    .line 111
    :cond_4
    :try_start_0
    new-instance v4, Landroid/media/MediaCrypto;

    .line 112
    .line 113
    iget-object v5, v1, La4/p;->a:Ljava/util/UUID;

    .line 114
    .line 115
    iget-object v6, v1, La4/p;->b:[B

    .line 116
    .line 117
    invoke-direct {v4, v5, v6}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 118
    .line 119
    .line 120
    iput-object v4, p0, Lo4/m;->J:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    iget-boolean v1, v1, La4/p;->c:Z

    .line 123
    .line 124
    if-nez v1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v4, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    move v0, v2

    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move v0, v3

    .line 135
    :goto_1
    iput-boolean v0, p0, Lo4/m;->K:Z

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catch_0
    move-exception v0

    .line 139
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 140
    .line 141
    const/16 v2, 0x1776

    .line 142
    .line 143
    invoke-virtual {p0, v2, v1, v0, v3}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    throw v0

    .line 148
    :cond_6
    :goto_2
    sget-boolean v0, La4/p;->d:Z

    .line 149
    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    iget-object v0, p0, Lo4/m;->H:La4/e;

    .line 153
    .line 154
    invoke-interface {v0}, La4/e;->e()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eq v0, v2, :cond_7

    .line 159
    .line 160
    const/4 v1, 0x4

    .line 161
    if-eq v0, v1, :cond_8

    .line 162
    .line 163
    return-void

    .line 164
    :cond_7
    iget-object v0, p0, Lo4/m;->H:La4/e;

    .line 165
    .line 166
    invoke-interface {v0}, La4/e;->k()La4/e$a;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 174
    .line 175
    iget v2, v0, La4/e$a;->a:I

    .line 176
    .line 177
    invoke-virtual {p0, v2, v1, v0, v3}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    throw v0

    .line 182
    :cond_8
    :try_start_1
    iget-object v0, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    .line 183
    .line 184
    iget-boolean v1, p0, Lo4/m;->K:Z

    .line 185
    .line 186
    invoke-virtual {p0, v0, v1}, Lo4/m;->b0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lo4/m$b; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :catch_1
    move-exception v0

    .line 191
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 192
    .line 193
    const/16 v2, 0xfa1

    .line 194
    .line 195
    invoke-virtual {p0, v2, v1, v0, v3}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    throw v0

    .line 200
    :cond_9
    :goto_3
    return-void
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

.method public b()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lv3/f;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lv3/f;->s:Z

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lv3/f;->o:Lz4/c0;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lz4/c0;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :goto_0
    if-nez v0, :cond_3

    .line 26
    .line 27
    iget v0, p0, Lo4/m;->k0:I

    .line 28
    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v2

    .line 34
    :goto_1
    if-nez v0, :cond_3

    .line 35
    .line 36
    iget-wide v3, p0, Lo4/m;->i0:J

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v3, v5

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iget-wide v5, p0, Lo4/m;->i0:J

    .line 52
    .line 53
    cmp-long v0, v3, v5

    .line 54
    .line 55
    if-gez v0, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v1, v2

    .line 59
    :cond_3
    :goto_2
    return v1
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

.method public final b0(Landroid/media/MediaCrypto;Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p2}, Lo4/m;->S(Z)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v2, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    iget-boolean v3, p0, Lo4/m;->w:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lo4/l;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    iput-object v1, p0, Lo4/m;->U:Lo4/m$b;
    :try_end_0
    .catch Lo4/p$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception p1

    .line 47
    new-instance v0, Lo4/m$b;

    .line 48
    .line 49
    iget-object v1, p0, Lo4/m;->F:Lv3/i0;

    .line 50
    .line 51
    const v2, -0xc34e

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v2, v1, p1, p2}, Lo4/m$b;-><init>(ILv3/i0;Lo4/p$b;Z)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    :goto_1
    iget-object v0, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_9

    .line 65
    .line 66
    iget-object v0, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lo4/l;

    .line 73
    .line 74
    :goto_2
    iget-object v2, p0, Lo4/m;->O:Lo4/j;

    .line 75
    .line 76
    if-nez v2, :cond_8

    .line 77
    .line 78
    iget-object v2, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v8, v2

    .line 85
    check-cast v8, Lo4/l;

    .line 86
    .line 87
    invoke-virtual {p0, v8}, Lo4/m;->u0(Lo4/l;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    :try_start_1
    invoke-virtual {p0, v8, p1}, Lo4/m;->Z(Lo4/l;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catch_1
    move-exception v2

    .line 99
    const-string v3, "MediaCodecRenderer"

    .line 100
    .line 101
    if-ne v8, v0, :cond_4

    .line 102
    .line 103
    :try_start_2
    const-string v2, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    .line 104
    .line 105
    invoke-static {v3, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v4, 0x32

    .line 109
    .line 110
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v8, p1}, Lo4/m;->Z(Lo4/l;Landroid/media/MediaCrypto;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 118
    :catch_2
    move-exception v2

    .line 119
    move-object v5, v2

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v4, "Failed to initialize decoder: "

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v3, v2, v5}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    new-instance v2, Lo4/m$b;

    .line 146
    .line 147
    iget-object v3, p0, Lo4/m;->F:Lv3/i0;

    .line 148
    .line 149
    const-string v4, "Decoder init failed: "

    .line 150
    .line 151
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget-object v6, v8, Lo4/l;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v6, ", "

    .line 161
    .line 162
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v6, v3, Lv3/i0;->t:Ljava/lang/String;

    .line 173
    .line 174
    sget v3, Lv5/e0;->a:I

    .line 175
    .line 176
    const/16 v7, 0x15

    .line 177
    .line 178
    if-lt v3, v7, :cond_5

    .line 179
    .line 180
    instance-of v3, v5, Landroid/media/MediaCodec$CodecException;

    .line 181
    .line 182
    if-eqz v3, :cond_5

    .line 183
    .line 184
    move-object v3, v5

    .line 185
    check-cast v3, Landroid/media/MediaCodec$CodecException;

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    move-object v9, v3

    .line 192
    goto :goto_3

    .line 193
    :cond_5
    move-object v9, v1

    .line 194
    :goto_3
    move-object v3, v2

    .line 195
    move v7, p2

    .line 196
    invoke-direct/range {v3 .. v9}, Lo4/m$b;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLo4/l;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v2}, Lo4/m;->c0(Ljava/lang/Exception;)V

    .line 200
    .line 201
    .line 202
    iget-object v3, p0, Lo4/m;->U:Lo4/m$b;

    .line 203
    .line 204
    if-nez v3, :cond_6

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_6
    new-instance v2, Lo4/m$b;

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    iget-object v7, v3, Lo4/m$b;->a:Ljava/lang/String;

    .line 218
    .line 219
    iget-boolean v8, v3, Lo4/m$b;->b:Z

    .line 220
    .line 221
    iget-object v9, v3, Lo4/m$b;->c:Lo4/l;

    .line 222
    .line 223
    iget-object v10, v3, Lo4/m$b;->d:Ljava/lang/String;

    .line 224
    .line 225
    move-object v4, v2

    .line 226
    invoke-direct/range {v4 .. v10}, Lo4/m$b;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLo4/l;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :goto_4
    iput-object v2, p0, Lo4/m;->U:Lo4/m$b;

    .line 230
    .line 231
    iget-object v2, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-nez v2, :cond_7

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_7
    iget-object p1, p0, Lo4/m;->U:Lo4/m$b;

    .line 242
    .line 243
    throw p1

    .line 244
    :cond_8
    iput-object v1, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 245
    .line 246
    return-void

    .line 247
    :cond_9
    new-instance p1, Lo4/m$b;

    .line 248
    .line 249
    iget-object v0, p0, Lo4/m;->F:Lv3/i0;

    .line 250
    .line 251
    const v2, -0xc34f

    .line 252
    .line 253
    .line 254
    invoke-direct {p1, v2, v0, v1, p2}, Lo4/m$b;-><init>(ILv3/i0;Lo4/p$b;Z)V

    .line 255
    .line 256
    .line 257
    throw p1
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

.method public abstract c0(Ljava/lang/Exception;)V
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lo4/m;->B0:Z

    return v0
.end method

.method public abstract d0(Ljava/lang/String;JJ)V
.end method

.method public abstract e0(Ljava/lang/String;)V
.end method

.method public f0(Ll3/l;)Lz3/i;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo4/m;->C0:Z

    .line 3
    .line 4
    iget-object v1, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v5, v1

    .line 7
    check-cast v5, Lv3/i0;

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v5, Lv3/i0;->t:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_24

    .line 16
    .line 17
    iget-object p1, p1, Ll3/l;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La4/e;

    .line 20
    .line 21
    iget-object v1, p0, Lo4/m;->I:La4/e;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-ne v1, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1, v3}, La4/e;->h(La4/g$a;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v1, v3}, La4/e;->f(La4/g$a;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    iput-object p1, p0, Lo4/m;->I:La4/e;

    .line 38
    .line 39
    iput-object v5, p0, Lo4/m;->F:Lv3/i0;

    .line 40
    .line 41
    iget-boolean v1, p0, Lo4/m;->o0:Z

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iput-boolean v0, p0, Lo4/m;->q0:Z

    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_3
    iget-object v1, p0, Lo4/m;->O:Lo4/j;

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    iput-object v3, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_4
    iget-object v3, p0, Lo4/m;->V:Lo4/l;

    .line 59
    .line 60
    iget-object v4, p0, Lo4/m;->P:Lv3/i0;

    .line 61
    .line 62
    iget-object v6, p0, Lo4/m;->H:La4/e;

    .line 63
    .line 64
    const/16 v7, 0x17

    .line 65
    .line 66
    if-ne v6, p1, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    if-eqz p1, :cond_d

    .line 70
    .line 71
    if-nez v6, :cond_6

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    invoke-interface {p1}, La4/e;->g()Ljava/util/UUID;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-interface {v6}, La4/e;->g()Ljava/util/UUID;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v8, v9}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-nez v8, :cond_7

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    sget v8, Lv5/e0;->a:I

    .line 90
    .line 91
    if-ge v8, v7, :cond_8

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_8
    sget-object v8, Lv3/h;->e:Ljava/util/UUID;

    .line 95
    .line 96
    invoke-interface {v6}, La4/e;->g()Ljava/util/UUID;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v8, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_d

    .line 105
    .line 106
    invoke-interface {p1}, La4/e;->g()Ljava/util/UUID;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v8, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_9

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_9
    invoke-virtual {p0, p1}, Lo4/m;->W(La4/e;)La4/p;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-nez v6, :cond_a

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_a
    iget-boolean v6, v6, La4/p;->c:Z

    .line 125
    .line 126
    if-eqz v6, :cond_b

    .line 127
    .line 128
    move p1, v2

    .line 129
    goto :goto_1

    .line 130
    :cond_b
    iget-object v6, v5, Lv3/i0;->t:Ljava/lang/String;

    .line 131
    .line 132
    invoke-interface {p1, v6}, La4/e;->j(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    :goto_1
    iget-boolean v6, v3, Lo4/l;->f:Z

    .line 137
    .line 138
    if-nez v6, :cond_c

    .line 139
    .line 140
    if-eqz p1, :cond_c

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_c
    :goto_2
    move p1, v2

    .line 144
    goto :goto_4

    .line 145
    :cond_d
    :goto_3
    move p1, v0

    .line 146
    :goto_4
    const/4 v6, 0x3

    .line 147
    if-eqz p1, :cond_f

    .line 148
    .line 149
    iget-boolean p1, p0, Lo4/m;->v0:Z

    .line 150
    .line 151
    if-eqz p1, :cond_e

    .line 152
    .line 153
    iput v0, p0, Lo4/m;->t0:I

    .line 154
    .line 155
    iput v6, p0, Lo4/m;->u0:I

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_e
    invoke-virtual {p0}, Lo4/m;->o0()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 162
    .line 163
    .line 164
    :goto_5
    new-instance p1, Lz3/i;

    .line 165
    .line 166
    iget-object v3, v3, Lo4/l;->a:Ljava/lang/String;

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    const/16 v7, 0x80

    .line 170
    .line 171
    move-object v2, p1

    .line 172
    invoke-direct/range {v2 .. v7}, Lz3/i;-><init>(Ljava/lang/String;Lv3/i0;Lv3/i0;II)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_f
    iget-object p1, p0, Lo4/m;->I:La4/e;

    .line 177
    .line 178
    iget-object v8, p0, Lo4/m;->H:La4/e;

    .line 179
    .line 180
    if-eq p1, v8, :cond_10

    .line 181
    .line 182
    move p1, v0

    .line 183
    goto :goto_6

    .line 184
    :cond_10
    move p1, v2

    .line 185
    :goto_6
    if-eqz p1, :cond_12

    .line 186
    .line 187
    sget v8, Lv5/e0;->a:I

    .line 188
    .line 189
    if-lt v8, v7, :cond_11

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_11
    move v7, v2

    .line 193
    goto :goto_8

    .line 194
    :cond_12
    :goto_7
    move v7, v0

    .line 195
    :goto_8
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v3, v4, v5}, Lo4/m;->K(Lo4/l;Lv3/i0;Lv3/i0;)Lz3/i;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    iget v8, v7, Lz3/i;->d:I

    .line 203
    .line 204
    const/16 v9, 0x10

    .line 205
    .line 206
    const/4 v10, 0x2

    .line 207
    if-eqz v8, :cond_1f

    .line 208
    .line 209
    if-eq v8, v0, :cond_19

    .line 210
    .line 211
    if-eq v8, v10, :cond_15

    .line 212
    .line 213
    if-ne v8, v6, :cond_14

    .line 214
    .line 215
    invoke-virtual {p0, v5}, Lo4/m;->x0(Lv3/i0;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_13

    .line 220
    .line 221
    goto/16 :goto_e

    .line 222
    .line 223
    :cond_13
    iput-object v5, p0, Lo4/m;->P:Lv3/i0;

    .line 224
    .line 225
    if-eqz p1, :cond_21

    .line 226
    .line 227
    invoke-virtual {p0}, Lo4/m;->N()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-nez p1, :cond_21

    .line 232
    .line 233
    goto :goto_c

    .line 234
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 237
    .line 238
    .line 239
    throw p1

    .line 240
    :cond_15
    invoke-virtual {p0, v5}, Lo4/m;->x0(Lv3/i0;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-nez v8, :cond_16

    .line 245
    .line 246
    goto/16 :goto_e

    .line 247
    .line 248
    :cond_16
    iput-boolean v0, p0, Lo4/m;->r0:Z

    .line 249
    .line 250
    iput v0, p0, Lo4/m;->s0:I

    .line 251
    .line 252
    iget v8, p0, Lo4/m;->W:I

    .line 253
    .line 254
    if-eq v8, v10, :cond_18

    .line 255
    .line 256
    if-ne v8, v0, :cond_17

    .line 257
    .line 258
    iget v8, v5, Lv3/i0;->y:I

    .line 259
    .line 260
    iget v9, v4, Lv3/i0;->y:I

    .line 261
    .line 262
    if-ne v8, v9, :cond_17

    .line 263
    .line 264
    iget v8, v5, Lv3/i0;->z:I

    .line 265
    .line 266
    iget v9, v4, Lv3/i0;->z:I

    .line 267
    .line 268
    if-ne v8, v9, :cond_17

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_17
    move v0, v2

    .line 272
    :cond_18
    :goto_9
    iput-boolean v0, p0, Lo4/m;->e0:Z

    .line 273
    .line 274
    iput-object v5, p0, Lo4/m;->P:Lv3/i0;

    .line 275
    .line 276
    if-eqz p1, :cond_21

    .line 277
    .line 278
    invoke-virtual {p0}, Lo4/m;->N()Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-nez p1, :cond_21

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_19
    invoke-virtual {p0, v5}, Lo4/m;->x0(Lv3/i0;)Z

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-nez v8, :cond_1a

    .line 290
    .line 291
    goto :goto_e

    .line 292
    :cond_1a
    iput-object v5, p0, Lo4/m;->P:Lv3/i0;

    .line 293
    .line 294
    if-eqz p1, :cond_1b

    .line 295
    .line 296
    invoke-virtual {p0}, Lo4/m;->N()Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-nez p1, :cond_21

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_1b
    iget-boolean p1, p0, Lo4/m;->v0:Z

    .line 304
    .line 305
    if-eqz p1, :cond_1e

    .line 306
    .line 307
    iput v0, p0, Lo4/m;->t0:I

    .line 308
    .line 309
    iget-boolean p1, p0, Lo4/m;->Y:Z

    .line 310
    .line 311
    if-nez p1, :cond_1d

    .line 312
    .line 313
    iget-boolean p1, p0, Lo4/m;->a0:Z

    .line 314
    .line 315
    if-eqz p1, :cond_1c

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_1c
    iput v0, p0, Lo4/m;->u0:I

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_1d
    :goto_a
    iput v6, p0, Lo4/m;->u0:I

    .line 322
    .line 323
    move v0, v2

    .line 324
    :cond_1e
    :goto_b
    if-nez v0, :cond_21

    .line 325
    .line 326
    :goto_c
    move v9, v10

    .line 327
    goto :goto_e

    .line 328
    :cond_1f
    iget-boolean p1, p0, Lo4/m;->v0:Z

    .line 329
    .line 330
    if-eqz p1, :cond_20

    .line 331
    .line 332
    iput v0, p0, Lo4/m;->t0:I

    .line 333
    .line 334
    iput v6, p0, Lo4/m;->u0:I

    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_20
    invoke-virtual {p0}, Lo4/m;->o0()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 341
    .line 342
    .line 343
    :cond_21
    :goto_d
    move v9, v2

    .line 344
    :goto_e
    iget p1, v7, Lz3/i;->d:I

    .line 345
    .line 346
    if-eqz p1, :cond_23

    .line 347
    .line 348
    iget-object p1, p0, Lo4/m;->O:Lo4/j;

    .line 349
    .line 350
    if-ne p1, v1, :cond_22

    .line 351
    .line 352
    iget p1, p0, Lo4/m;->u0:I

    .line 353
    .line 354
    if-ne p1, v6, :cond_23

    .line 355
    .line 356
    :cond_22
    new-instance p1, Lz3/i;

    .line 357
    .line 358
    iget-object v3, v3, Lo4/l;->a:Ljava/lang/String;

    .line 359
    .line 360
    const/4 v6, 0x0

    .line 361
    move-object v2, p1

    .line 362
    move v7, v9

    .line 363
    invoke-direct/range {v2 .. v7}, Lz3/i;-><init>(Ljava/lang/String;Lv3/i0;Lv3/i0;II)V

    .line 364
    .line 365
    .line 366
    return-object p1

    .line 367
    :cond_23
    return-object v7

    .line 368
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 369
    .line 370
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 371
    .line 372
    .line 373
    const/16 v0, 0xfa5

    .line 374
    .line 375
    invoke-virtual {p0, v0, v5, p1, v2}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    throw p1
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
.end method

.method public abstract g0(Lv3/i0;Landroid/media/MediaFormat;)V
.end method

.method public h0(J)V
    .locals 0

    return-void
.end method

.method public i0(J)V
    .locals 2

    iput-wide p1, p0, Lo4/m;->H0:J

    :goto_0
    iget-object v0, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo4/m$c;

    iget-wide v0, v0, Lo4/m$c;->a:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lo4/m;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo4/m$c;

    invoke-virtual {p0, v0}, Lo4/m;->t0(Lo4/m$c;)V

    invoke-virtual {p0}, Lo4/m;->j0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract j0()V
.end method

.method public abstract k0(Lz3/g;)V
.end method

.method public final l0()V
    .locals 3

    .line 1
    iget v0, p0, Lo4/m;->u0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lo4/m;->B0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lo4/m;->p0()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lo4/m;->o0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lo4/m;->Q()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lo4/m;->y0()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {p0}, Lo4/m;->Q()V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
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

.method public m(FF)V
    .locals 0

    iput p1, p0, Lo4/m;->M:F

    iput p2, p0, Lo4/m;->N:F

    iget-object p1, p0, Lo4/m;->P:Lv3/i0;

    invoke-virtual {p0, p1}, Lo4/m;->x0(Lv3/i0;)Z

    return-void
.end method

.method public abstract m0(JJLo4/j;Ljava/nio/ByteBuffer;IIIJZZLv3/i0;)Z
.end method

.method public final n0(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lv3/f;->b:Ll3/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Ll3/l;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, v0, Ll3/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lo4/m;->y:Lz3/g;

    .line 9
    .line 10
    invoke-virtual {v1}, Lz3/g;->o()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lo4/m;->y:Lz3/g;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    or-int/2addr p1, v2

    .line 17
    invoke-virtual {p0, v0, v1, p1}, Lv3/f;->I(Ll3/l;Lz3/g;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v3, -0x5

    .line 23
    if-ne p1, v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lo4/m;->f0(Ll3/l;)Lz3/i;

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v0, -0x4

    .line 30
    if-ne p1, v0, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lo4/m;->y:Lz3/g;

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Lz3/a;->m(I)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iput-boolean v1, p0, Lo4/m;->A0:Z

    .line 41
    .line 42
    invoke-virtual {p0}, Lo4/m;->l0()V

    .line 43
    .line 44
    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return p1
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

.method public final o()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final o0()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lo4/m;->O:Lo4/j;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lo4/j;->release()V

    iget-object v1, p0, Lo4/m;->F0:Lz3/e;

    iget v2, v1, Lz3/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lz3/e;->b:I

    iget-object v1, p0, Lo4/m;->V:Lo4/l;

    iget-object v1, v1, Lo4/l;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lo4/m;->e0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lo4/m;->O:Lo4/j;

    :try_start_1
    iget-object v1, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lo4/m;->s0(La4/e;)V

    invoke-virtual {p0}, Lo4/m;->r0()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lo4/m;->s0(La4/e;)V

    invoke-virtual {p0}, Lo4/m;->r0()V

    throw v1

    :catchall_1
    move-exception v1

    iput-object v0, p0, Lo4/m;->O:Lo4/j;

    :try_start_2
    iget-object v2, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    iput-object v0, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lo4/m;->s0(La4/e;)V

    invoke-virtual {p0}, Lo4/m;->r0()V

    throw v1

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lo4/m;->s0(La4/e;)V

    invoke-virtual {p0}, Lo4/m;->r0()V

    throw v1
.end method

.method public final p(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lo4/m;->D0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lo4/m;->D0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lo4/m;->l0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lo4/m;->E0:Lv3/n;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, Lo4/m;->B0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lo4/m;->p0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v2, p0, Lo4/m;->F:Lv3/i0;

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-virtual {p0, v2}, Lo4/m;->n0(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 37
    .line 38
    .line 39
    iget-boolean v2, p0, Lo4/m;->o0:Z

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const-string v2, "bypassRender"

    .line 44
    .line 45
    invoke-static {v2}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lo4/m;->J(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_9

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v2, p0, Lo4/m;->O:Lo4/j;

    .line 56
    .line 57
    if-eqz v2, :cond_a

    .line 58
    .line 59
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    const-string v4, "drainAndFeed"

    .line 64
    .line 65
    invoke-static {v4}, Lp2/m0;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lo4/m;->O(JJ)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    iget-wide v7, p0, Lo4/m;->L:J

    .line 80
    .line 81
    cmp-long v4, v7, v5

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    sub-long/2addr v7, v2

    .line 90
    iget-wide v9, p0, Lo4/m;->L:J

    .line 91
    .line 92
    cmp-long v4, v7, v9

    .line 93
    .line 94
    if-gez v4, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    move v4, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    :goto_2
    move v4, v0

    .line 100
    :goto_3
    if-eqz v4, :cond_6

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    :goto_4
    invoke-virtual {p0}, Lo4/m;->P()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_9

    .line 108
    .line 109
    iget-wide p1, p0, Lo4/m;->L:J

    .line 110
    .line 111
    cmp-long p1, p1, v5

    .line 112
    .line 113
    if-eqz p1, :cond_8

    .line 114
    .line 115
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 116
    .line 117
    .line 118
    move-result-wide p1

    .line 119
    sub-long/2addr p1, v2

    .line 120
    iget-wide p3, p0, Lo4/m;->L:J

    .line 121
    .line 122
    cmp-long p1, p1, p3

    .line 123
    .line 124
    if-gez p1, :cond_7

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    move p1, v1

    .line 128
    goto :goto_6

    .line 129
    :cond_8
    :goto_5
    move p1, v0

    .line 130
    :goto_6
    if-eqz p1, :cond_9

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_9
    invoke-static {}, Lp2/m0;->B()V

    .line 134
    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_a
    iget-object p3, p0, Lo4/m;->F0:Lz3/e;

    .line 138
    .line 139
    iget p4, p3, Lz3/e;->d:I

    .line 140
    .line 141
    iget-object v2, p0, Lv3/f;->o:Lz4/c0;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-wide v3, p0, Lv3/f;->q:J

    .line 147
    .line 148
    sub-long/2addr p1, v3

    .line 149
    invoke-interface {v2, p1, p2}, Lz4/c0;->m(J)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    add-int/2addr p4, p1

    .line 154
    iput p4, p3, Lz3/e;->d:I

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lo4/m;->n0(I)Z

    .line 157
    .line 158
    .line 159
    :goto_7
    iget-object p1, p0, Lo4/m;->F0:Lz3/e;

    .line 160
    .line 161
    monitor-enter p1

    .line 162
    monitor-exit p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    return-void

    .line 164
    :catch_0
    move-exception p1

    .line 165
    sget p2, Lv5/e0;->a:I

    .line 166
    .line 167
    const/16 p3, 0x15

    .line 168
    .line 169
    if-lt p2, p3, :cond_b

    .line 170
    .line 171
    instance-of p4, p1, Landroid/media/MediaCodec$CodecException;

    .line 172
    .line 173
    if-eqz p4, :cond_b

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 177
    .line 178
    .line 179
    move-result-object p4

    .line 180
    array-length v2, p4

    .line 181
    if-lez v2, :cond_c

    .line 182
    .line 183
    aget-object p4, p4, v1

    .line 184
    .line 185
    invoke-virtual {p4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p4

    .line 189
    const-string v2, "android.media.MediaCodec"

    .line 190
    .line 191
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p4

    .line 195
    if-eqz p4, :cond_c

    .line 196
    .line 197
    :goto_8
    move p4, v0

    .line 198
    goto :goto_9

    .line 199
    :cond_c
    move p4, v1

    .line 200
    :goto_9
    if-eqz p4, :cond_10

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Lo4/m;->c0(Ljava/lang/Exception;)V

    .line 203
    .line 204
    .line 205
    if-lt p2, p3, :cond_e

    .line 206
    .line 207
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 208
    .line 209
    if-eqz p2, :cond_d

    .line 210
    .line 211
    move-object p2, p1

    .line 212
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 213
    .line 214
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    goto :goto_a

    .line 219
    :cond_d
    move p2, v1

    .line 220
    :goto_a
    if-eqz p2, :cond_e

    .line 221
    .line 222
    move v1, v0

    .line 223
    :cond_e
    if-eqz v1, :cond_f

    .line 224
    .line 225
    invoke-virtual {p0}, Lo4/m;->o0()V

    .line 226
    .line 227
    .line 228
    :cond_f
    iget-object p2, p0, Lo4/m;->V:Lo4/l;

    .line 229
    .line 230
    invoke-virtual {p0, p1, p2}, Lo4/m;->L(Ljava/lang/IllegalStateException;Lo4/l;)Lo4/k;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iget-object p2, p0, Lo4/m;->F:Lv3/i0;

    .line 235
    .line 236
    const/16 p3, 0xfa3

    .line 237
    .line 238
    invoke-virtual {p0, p3, p2, p1, v1}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    throw p1

    .line 243
    :cond_10
    throw p1

    .line 244
    :cond_11
    const/4 p1, 0x0

    .line 245
    iput-object p1, p0, Lo4/m;->E0:Lv3/n;

    .line 246
    .line 247
    throw v0
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

.method public p0()V
    .locals 0

    return-void
.end method

.method public q0()V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lo4/m;->j0:I

    .line 3
    .line 4
    iget-object v1, p0, Lo4/m;->z:Lz3/g;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lz3/g;->c:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Lo4/m;->k0:I

    .line 10
    .line 11
    iput-object v2, p0, Lo4/m;->l0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lo4/m;->i0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, Lo4/m;->w0:Z

    .line 22
    .line 23
    iput-boolean v2, p0, Lo4/m;->v0:Z

    .line 24
    .line 25
    iput-boolean v2, p0, Lo4/m;->e0:Z

    .line 26
    .line 27
    iput-boolean v2, p0, Lo4/m;->f0:Z

    .line 28
    .line 29
    iput-boolean v2, p0, Lo4/m;->m0:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Lo4/m;->n0:Z

    .line 32
    .line 33
    iget-object v3, p0, Lo4/m;->C:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lo4/m;->y0:J

    .line 39
    .line 40
    iput-wide v0, p0, Lo4/m;->z0:J

    .line 41
    .line 42
    iput-wide v0, p0, Lo4/m;->H0:J

    .line 43
    .line 44
    iget-object v0, p0, Lo4/m;->h0:Lo4/g;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    iput-wide v3, v0, Lo4/g;->a:J

    .line 51
    .line 52
    iput-wide v3, v0, Lo4/g;->b:J

    .line 53
    .line 54
    iput-boolean v2, v0, Lo4/g;->c:Z

    .line 55
    .line 56
    :cond_0
    iput v2, p0, Lo4/m;->t0:I

    .line 57
    .line 58
    iput v2, p0, Lo4/m;->u0:I

    .line 59
    .line 60
    iget-boolean v0, p0, Lo4/m;->r0:Z

    .line 61
    .line 62
    iput v0, p0, Lo4/m;->s0:I

    .line 63
    .line 64
    return-void
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

.method public final r0()V
    .locals 2

    invoke-virtual {p0}, Lo4/m;->q0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lo4/m;->E0:Lv3/n;

    iput-object v0, p0, Lo4/m;->h0:Lo4/g;

    iput-object v0, p0, Lo4/m;->T:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lo4/m;->V:Lo4/l;

    iput-object v0, p0, Lo4/m;->P:Lv3/i0;

    iput-object v0, p0, Lo4/m;->Q:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo4/m;->R:Z

    iput-boolean v0, p0, Lo4/m;->x0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lo4/m;->S:F

    iput v0, p0, Lo4/m;->W:I

    iput-boolean v0, p0, Lo4/m;->X:Z

    iput-boolean v0, p0, Lo4/m;->Y:Z

    iput-boolean v0, p0, Lo4/m;->Z:Z

    iput-boolean v0, p0, Lo4/m;->a0:Z

    iput-boolean v0, p0, Lo4/m;->b0:Z

    iput-boolean v0, p0, Lo4/m;->c0:Z

    iput-boolean v0, p0, Lo4/m;->d0:Z

    iput-boolean v0, p0, Lo4/m;->g0:Z

    iput-boolean v0, p0, Lo4/m;->r0:Z

    iput v0, p0, Lo4/m;->s0:I

    iput-boolean v0, p0, Lo4/m;->K:Z

    return-void
.end method

.method public final s0(La4/e;)V
    .locals 2

    iget-object v0, p0, Lo4/m;->H:La4/e;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1, v1}, La4/e;->h(La4/g$a;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, La4/e;->f(La4/g$a;)V

    :cond_2
    :goto_0
    iput-object p1, p0, Lo4/m;->H:La4/e;

    return-void
.end method

.method public final t0(Lo4/m$c;)V
    .locals 4

    iput-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    iget-wide v0, p1, Lo4/m$c;->b:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo4/m;->I0:Z

    invoke-virtual {p0, v0, v1}, Lo4/m;->h0(J)V

    :cond_0
    return-void
.end method

.method public u0(Lo4/l;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public v0(Lv3/i0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract w0(Lo4/n;Lv3/i0;)I
.end method

.method public final x0(Lv3/i0;)Z
    .locals 5

    .line 1
    sget p1, Lv5/e0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/16 v1, 0x17

    .line 5
    .line 6
    if-ge p1, v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object p1, p0, Lo4/m;->O:Lo4/j;

    .line 10
    .line 11
    if-eqz p1, :cond_7

    .line 12
    .line 13
    iget p1, p0, Lo4/m;->u0:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq p1, v1, :cond_7

    .line 17
    .line 18
    iget p1, p0, Lv3/f;->f:I

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    iget p1, p0, Lo4/m;->N:F

    .line 24
    .line 25
    iget-object v2, p0, Lv3/f;->p:[Lv3/i0;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v2}, Lo4/m;->U(F[Lv3/i0;)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v2, p0, Lo4/m;->S:F

    .line 35
    .line 36
    cmpl-float v3, v2, p1

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    return v0

    .line 41
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 42
    .line 43
    cmpl-float v4, p1, v3

    .line 44
    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    iget-boolean p1, p0, Lo4/m;->v0:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput v0, p0, Lo4/m;->t0:I

    .line 52
    .line 53
    iput v1, p0, Lo4/m;->u0:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p0}, Lo4/m;->o0()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lo4/m;->a0()V

    .line 60
    .line 61
    .line 62
    :goto_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_4
    cmpl-float v1, v2, v3

    .line 65
    .line 66
    if-nez v1, :cond_6

    .line 67
    .line 68
    iget v1, p0, Lo4/m;->x:F

    .line 69
    .line 70
    cmpl-float v1, p1, v1

    .line 71
    .line 72
    if-lez v1, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    return v0

    .line 76
    :cond_6
    :goto_1
    new-instance v1, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v2, "operating-rate"

    .line 82
    .line 83
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lo4/m;->O:Lo4/j;

    .line 87
    .line 88
    invoke-interface {v2, v1}, Lo4/j;->d(Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    iput p1, p0, Lo4/m;->S:F

    .line 92
    .line 93
    :cond_7
    :goto_2
    return v0
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

.method public final y0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lo4/m;->J:Landroid/media/MediaCrypto;

    .line 3
    .line 4
    iget-object v2, p0, Lo4/m;->I:La4/e;

    .line 5
    .line 6
    invoke-virtual {p0, v2}, Lo4/m;->W(La4/e;)La4/p;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v2, v2, La4/p;->b:[B

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lo4/m;->I:La4/e;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lo4/m;->s0(La4/e;)V

    .line 18
    .line 19
    .line 20
    iput v0, p0, Lo4/m;->t0:I

    .line 21
    .line 22
    iput v0, p0, Lo4/m;->u0:I

    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v1

    .line 26
    iget-object v2, p0, Lo4/m;->F:Lv3/i0;

    .line 27
    .line 28
    const/16 v3, 0x1776

    .line 29
    .line 30
    invoke-virtual {p0, v3, v2, v1, v0}, Lv3/f;->z(ILv3/i0;Ljava/lang/Exception;Z)Lv3/n;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0
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

.method public final z0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo4/m;->G0:Lo4/m$c;

    .line 2
    .line 3
    iget-object v0, v0, Lo4/m$c;->c:Lv5/b0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    invoke-virtual {v0, p1, p2, v1}, Lv5/b0;->d(JZ)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    monitor-exit v0

    .line 12
    check-cast p1, Lv3/i0;

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    iget-boolean p2, p0, Lo4/m;->I0:Z

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-object p2, p0, Lo4/m;->Q:Landroid/media/MediaFormat;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lo4/m;->G0:Lo4/m$c;

    .line 25
    .line 26
    iget-object p1, p1, Lo4/m$c;->c:Lv5/b0;

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_1
    iget p2, p1, Lv5/b0;->d:I

    .line 30
    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, Lv5/b0;->e()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :goto_0
    monitor-exit p1

    .line 40
    move-object p1, p2

    .line 41
    check-cast p1, Lv3/i0;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    monitor-exit p1

    .line 46
    throw p2

    .line 47
    :cond_1
    :goto_1
    const/4 p2, 0x0

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iput-object p1, p0, Lo4/m;->G:Lv3/i0;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move v1, p2

    .line 54
    :goto_2
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget-boolean p1, p0, Lo4/m;->R:Z

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget-object p1, p0, Lo4/m;->G:Lv3/i0;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, Lo4/m;->G:Lv3/i0;

    .line 65
    .line 66
    iget-object v0, p0, Lo4/m;->Q:Landroid/media/MediaFormat;

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Lo4/m;->g0(Lv3/i0;Landroid/media/MediaFormat;)V

    .line 69
    .line 70
    .line 71
    iput-boolean p2, p0, Lo4/m;->R:Z

    .line 72
    .line 73
    iput-boolean p2, p0, Lo4/m;->I0:Z

    .line 74
    .line 75
    :cond_4
    return-void

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    monitor-exit v0

    .line 78
    throw p1
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
.end method

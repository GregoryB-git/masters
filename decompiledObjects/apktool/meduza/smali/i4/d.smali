.class public final Li4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/d$b;,
        Li4/d$a;
    }
.end annotation


# static fields
.field public static final c0:[B

.field public static final d0:[B

.field public static final e0:[B

.field public static final f0:[B

.field public static final g0:Ljava/util/UUID;

.field public static final h0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:J

.field public B:J

.field public C:Lv5/n;

.field public D:Lv5/n;

.field public E:Z

.field public F:Z

.field public G:I

.field public H:J

.field public I:J

.field public J:I

.field public K:I

.field public L:[I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:J

.field public S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:I

.field public Z:B

.field public final a:Li4/c;

.field public a0:Z

.field public final b:Li4/e;

.field public b0:Lc4/j;

.field public final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Li4/d$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:Lv5/u;

.field public final f:Lv5/u;

.field public final g:Lv5/u;

.field public final h:Lv5/u;

.field public final i:Lv5/u;

.field public final j:Lv5/u;

.field public final k:Lv5/u;

.field public final l:Lv5/u;

.field public final m:Lv5/u;

.field public final n:Lv5/u;

.field public o:Ljava/nio/ByteBuffer;

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:Li4/d$b;

.field public v:Z

.field public w:I

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Li4/d;->c0:[B

    .line 9
    .line 10
    const-string v1, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 11
    .line 12
    invoke-static {v1}, Lv5/e0;->B(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Li4/d;->d0:[B

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v0, Li4/d;->e0:[B

    .line 24
    .line 25
    const/16 v0, 0x26

    .line 26
    .line 27
    new-array v0, v0, [B

    .line 28
    .line 29
    fill-array-data v0, :array_2

    .line 30
    .line 31
    .line 32
    sput-object v0, Li4/d;->f0:[B

    .line 33
    .line 34
    new-instance v0, Ljava/util/UUID;

    .line 35
    .line 36
    const-wide v1, 0x100000000001000L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Li4/d;->g0:Ljava/util/UUID;

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const-string v7, "htc_video_rotA-000"

    .line 58
    .line 59
    const/16 v8, 0x5a

    .line 60
    .line 61
    const-string v9, "htc_video_rotA-090"

    .line 62
    .line 63
    const/16 v10, 0xb4

    .line 64
    .line 65
    const-string v11, "htc_video_rotA-180"

    .line 66
    .line 67
    const/16 v12, 0x10e

    .line 68
    .line 69
    const-string v13, "htc_video_rotA-270"

    .line 70
    .line 71
    move-object v6, v0

    .line 72
    invoke-static/range {v5 .. v13}, Lg;->k(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Li4/d;->h0:Ljava/util/Map;

    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 5

    .line 1
    new-instance v0, Li4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Li4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p0, Li4/d;->q:J

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v3, p0, Li4/d;->r:J

    .line 19
    .line 20
    iput-wide v3, p0, Li4/d;->s:J

    .line 21
    .line 22
    iput-wide v3, p0, Li4/d;->t:J

    .line 23
    .line 24
    iput-wide v1, p0, Li4/d;->z:J

    .line 25
    .line 26
    iput-wide v1, p0, Li4/d;->A:J

    .line 27
    .line 28
    iput-wide v3, p0, Li4/d;->B:J

    .line 29
    .line 30
    iput-object v0, p0, Li4/d;->a:Li4/c;

    .line 31
    .line 32
    new-instance v1, Li4/d$a;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Li4/d$a;-><init>(Li4/d;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Li4/a;->d:Li4/b;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    and-int/2addr p1, v0

    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    move p1, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    :goto_0
    iput-boolean p1, p0, Li4/d;->d:Z

    .line 47
    .line 48
    new-instance p1, Li4/e;

    .line 49
    .line 50
    invoke-direct {p1}, Li4/e;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Li4/d;->b:Li4/e;

    .line 54
    .line 55
    new-instance p1, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Li4/d;->c:Landroid/util/SparseArray;

    .line 61
    .line 62
    new-instance p1, Lv5/u;

    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {p1, v1}, Lv5/u;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Li4/d;->g:Lv5/u;

    .line 69
    .line 70
    new-instance p1, Lv5/u;

    .line 71
    .line 72
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v3, -0x1

    .line 77
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-direct {p1, v2}, Lv5/u;-><init>([B)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Li4/d;->h:Lv5/u;

    .line 89
    .line 90
    new-instance p1, Lv5/u;

    .line 91
    .line 92
    invoke-direct {p1, v1}, Lv5/u;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Li4/d;->i:Lv5/u;

    .line 96
    .line 97
    new-instance p1, Lv5/u;

    .line 98
    .line 99
    sget-object v2, Lv5/q;->a:[B

    .line 100
    .line 101
    invoke-direct {p1, v2}, Lv5/u;-><init>([B)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Li4/d;->e:Lv5/u;

    .line 105
    .line 106
    new-instance p1, Lv5/u;

    .line 107
    .line 108
    invoke-direct {p1, v1}, Lv5/u;-><init>(I)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Li4/d;->f:Lv5/u;

    .line 112
    .line 113
    new-instance p1, Lv5/u;

    .line 114
    .line 115
    invoke-direct {p1}, Lv5/u;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Li4/d;->j:Lv5/u;

    .line 119
    .line 120
    new-instance p1, Lv5/u;

    .line 121
    .line 122
    invoke-direct {p1}, Lv5/u;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Li4/d;->k:Lv5/u;

    .line 126
    .line 127
    new-instance p1, Lv5/u;

    .line 128
    .line 129
    const/16 v1, 0x8

    .line 130
    .line 131
    invoke-direct {p1, v1}, Lv5/u;-><init>(I)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Li4/d;->l:Lv5/u;

    .line 135
    .line 136
    new-instance p1, Lv5/u;

    .line 137
    .line 138
    invoke-direct {p1}, Lv5/u;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Li4/d;->m:Lv5/u;

    .line 142
    .line 143
    new-instance p1, Lv5/u;

    .line 144
    .line 145
    invoke-direct {p1}, Lv5/u;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Li4/d;->n:Lv5/u;

    .line 149
    .line 150
    new-array p1, v0, [I

    .line 151
    .line 152
    iput-object p1, p0, Li4/d;->L:[I

    .line 153
    .line 154
    return-void
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

.method public static g(JJLjava/lang/String;)[B
    .locals 11

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    const-wide v3, 0xd693a400L

    div-long v3, p0, v3

    long-to-int v0, v3

    int-to-long v3, v0

    const-wide/16 v5, 0xe10

    mul-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    mul-long/2addr v3, v5

    sub-long/2addr p0, v3

    const-wide/32 v3, 0x3938700

    div-long v3, p0, v3

    long-to-int v3, v3

    int-to-long v7, v3

    const-wide/16 v9, 0x3c

    mul-long/2addr v7, v9

    mul-long/2addr v7, v5

    sub-long/2addr p0, v7

    div-long v7, p0, v5

    long-to-int v4, v7

    int-to-long v7, v4

    mul-long/2addr v7, v5

    sub-long/2addr p0, v7

    div-long/2addr p0, p2

    long-to-int p0, p0

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 p2, 0x4

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    const/4 p3, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const/4 p3, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p2, p3

    invoke-static {p1, p4, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv5/e0;->B(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Li4/d;->C:Lv5/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li4/d;->D:Lv5/n;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a Cues"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p1

    throw p1
.end method

.method public final b(Lc4/j;)V
    .locals 0

    iput-object p1, p0, Li4/d;->b0:Lc4/j;

    return-void
.end method

.method public final c(I)V
    .locals 2

    iget-object v0, p0, Li4/d;->u:Li4/d$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a TrackEntry"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p1

    throw p1
.end method

.method public final d(Lc4/i;Lc4/s;)I
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iput-boolean v3, v0, Li4/d;->F:Z

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    move v5, v4

    .line 12
    :goto_0
    const/4 v6, -0x1

    .line 13
    if-eqz v4, :cond_6a

    .line 14
    .line 15
    iget-boolean v7, v0, Li4/d;->F:Z

    .line 16
    .line 17
    if-nez v7, :cond_6a

    .line 18
    .line 19
    iget-object v4, v0, Li4/d;->a:Li4/c;

    .line 20
    .line 21
    move-object v7, v4

    .line 22
    check-cast v7, Li4/a;

    .line 23
    .line 24
    iget-object v4, v7, Li4/a;->d:Li4/b;

    .line 25
    .line 26
    invoke-static {v4}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :goto_1
    iget-object v4, v7, Li4/a;->b:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Li4/a$a;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    iget-wide v10, v4, Li4/a$a;->b:J

    .line 44
    .line 45
    cmp-long v4, v8, v10

    .line 46
    .line 47
    if-ltz v4, :cond_0

    .line 48
    .line 49
    iget-object v4, v7, Li4/a;->d:Li4/b;

    .line 50
    .line 51
    iget-object v6, v7, Li4/a;->b:Ljava/util/ArrayDeque;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Li4/a$a;

    .line 58
    .line 59
    iget v6, v6, Li4/a$a;->a:I

    .line 60
    .line 61
    check-cast v4, Li4/d$a;

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Li4/d$a;->a(I)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_f

    .line 67
    .line 68
    :cond_0
    iget v4, v7, Li4/a;->e:I

    .line 69
    .line 70
    const/4 v8, 0x4

    .line 71
    const-wide/16 v9, 0x0

    .line 72
    .line 73
    const/16 v11, 0x8

    .line 74
    .line 75
    if-nez v4, :cond_8

    .line 76
    .line 77
    iget-object v4, v7, Li4/a;->c:Li4/e;

    .line 78
    .line 79
    invoke-virtual {v4, v1, v5, v3, v8}, Li4/e;->b(Lc4/i;ZZI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    const-wide/16 v14, -0x2

    .line 84
    .line 85
    cmp-long v4, v12, v14

    .line 86
    .line 87
    if-nez v4, :cond_6

    .line 88
    .line 89
    invoke-interface/range {p1 .. p1}, Lc4/i;->i()V

    .line 90
    .line 91
    .line 92
    :goto_2
    iget-object v4, v7, Li4/a;->a:[B

    .line 93
    .line 94
    invoke-interface {v1, v4, v3, v8}, Lc4/i;->m([BII)V

    .line 95
    .line 96
    .line 97
    iget-object v4, v7, Li4/a;->a:[B

    .line 98
    .line 99
    aget-byte v4, v4, v3

    .line 100
    .line 101
    move v12, v3

    .line 102
    :goto_3
    sget-object v13, Li4/e;->d:[J

    .line 103
    .line 104
    if-ge v12, v11, :cond_2

    .line 105
    .line 106
    aget-wide v14, v13, v12

    .line 107
    .line 108
    move v13, v12

    .line 109
    int-to-long v11, v4

    .line 110
    and-long/2addr v11, v14

    .line 111
    cmp-long v11, v11, v9

    .line 112
    .line 113
    add-int/lit8 v12, v13, 0x1

    .line 114
    .line 115
    if-eqz v11, :cond_1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_1
    const/16 v11, 0x8

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_2
    move v12, v6

    .line 122
    :goto_4
    if-eq v12, v6, :cond_5

    .line 123
    .line 124
    if-gt v12, v8, :cond_5

    .line 125
    .line 126
    iget-object v4, v7, Li4/a;->a:[B

    .line 127
    .line 128
    invoke-static {v4, v12, v3}, Li4/e;->a([BIZ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v13

    .line 132
    long-to-int v4, v13

    .line 133
    iget-object v11, v7, Li4/a;->d:Li4/b;

    .line 134
    .line 135
    check-cast v11, Li4/d$a;

    .line 136
    .line 137
    iget-object v11, v11, Li4/d$a;->a:Li4/d;

    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const v11, 0x1549a966

    .line 143
    .line 144
    .line 145
    if-eq v4, v11, :cond_4

    .line 146
    .line 147
    const v11, 0x1f43b675

    .line 148
    .line 149
    .line 150
    if-eq v4, v11, :cond_4

    .line 151
    .line 152
    const v11, 0x1c53bb6b

    .line 153
    .line 154
    .line 155
    if-eq v4, v11, :cond_4

    .line 156
    .line 157
    const v11, 0x1654ae6b

    .line 158
    .line 159
    .line 160
    if-ne v4, v11, :cond_3

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_3
    move v11, v3

    .line 164
    goto :goto_6

    .line 165
    :cond_4
    :goto_5
    move v11, v5

    .line 166
    :goto_6
    if-eqz v11, :cond_5

    .line 167
    .line 168
    invoke-interface {v1, v12}, Lc4/i;->j(I)V

    .line 169
    .line 170
    .line 171
    int-to-long v12, v4

    .line 172
    goto :goto_7

    .line 173
    :cond_5
    invoke-interface {v1, v5}, Lc4/i;->j(I)V

    .line 174
    .line 175
    .line 176
    const/16 v11, 0x8

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    :goto_7
    const-wide/16 v9, -0x1

    .line 180
    .line 181
    cmp-long v4, v12, v9

    .line 182
    .line 183
    if-nez v4, :cond_7

    .line 184
    .line 185
    move v4, v3

    .line 186
    goto/16 :goto_2b

    .line 187
    .line 188
    :cond_7
    long-to-int v4, v12

    .line 189
    iput v4, v7, Li4/a;->f:I

    .line 190
    .line 191
    iput v5, v7, Li4/a;->e:I

    .line 192
    .line 193
    :cond_8
    iget v4, v7, Li4/a;->e:I

    .line 194
    .line 195
    const/4 v9, 0x2

    .line 196
    if-ne v4, v5, :cond_9

    .line 197
    .line 198
    iget-object v4, v7, Li4/a;->c:Li4/e;

    .line 199
    .line 200
    const/16 v10, 0x8

    .line 201
    .line 202
    invoke-virtual {v4, v1, v3, v5, v10}, Li4/e;->b(Lc4/i;ZZI)J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    iput-wide v11, v7, Li4/a;->g:J

    .line 207
    .line 208
    iput v9, v7, Li4/a;->e:I

    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_9
    const/16 v10, 0x8

    .line 212
    .line 213
    :goto_8
    iget-object v4, v7, Li4/a;->d:Li4/b;

    .line 214
    .line 215
    iget v11, v7, Li4/a;->f:I

    .line 216
    .line 217
    check-cast v4, Li4/d$a;

    .line 218
    .line 219
    iget-object v4, v4, Li4/d$a;->a:Li4/d;

    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    const/4 v4, 0x5

    .line 225
    const/4 v12, 0x3

    .line 226
    sparse-switch v11, :sswitch_data_0

    .line 227
    .line 228
    .line 229
    move v11, v3

    .line 230
    goto :goto_9

    .line 231
    :sswitch_0
    move v11, v4

    .line 232
    goto :goto_9

    .line 233
    :sswitch_1
    move v11, v8

    .line 234
    goto :goto_9

    .line 235
    :sswitch_2
    move v11, v5

    .line 236
    goto :goto_9

    .line 237
    :sswitch_3
    move v11, v12

    .line 238
    goto :goto_9

    .line 239
    :sswitch_4
    move v11, v9

    .line 240
    :goto_9
    if-eqz v11, :cond_69

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    if-eq v11, v5, :cond_58

    .line 244
    .line 245
    const-string v14, " not supported"

    .line 246
    .line 247
    const-wide/16 v17, 0x8

    .line 248
    .line 249
    const/16 v19, 0xff

    .line 250
    .line 251
    if-eq v11, v9, :cond_40

    .line 252
    .line 253
    const-wide/32 v20, 0x7fffffff

    .line 254
    .line 255
    .line 256
    if-eq v11, v12, :cond_37

    .line 257
    .line 258
    if-eq v11, v8, :cond_11

    .line 259
    .line 260
    if-ne v11, v4, :cond_10

    .line 261
    .line 262
    iget-wide v11, v7, Li4/a;->g:J

    .line 263
    .line 264
    const-wide/16 v14, 0x4

    .line 265
    .line 266
    cmp-long v4, v11, v14

    .line 267
    .line 268
    if-eqz v4, :cond_b

    .line 269
    .line 270
    cmp-long v4, v11, v17

    .line 271
    .line 272
    if-nez v4, :cond_a

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_a
    const-string v1, "Invalid float size: "

    .line 276
    .line 277
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    iget-wide v2, v7, Li4/a;->g:J

    .line 282
    .line 283
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v1, v13}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    throw v1

    .line 295
    :cond_b
    :goto_a
    iget-object v4, v7, Li4/a;->d:Li4/b;

    .line 296
    .line 297
    iget v6, v7, Li4/a;->f:I

    .line 298
    .line 299
    long-to-int v9, v11

    .line 300
    iget-object v11, v7, Li4/a;->a:[B

    .line 301
    .line 302
    invoke-interface {v1, v11, v3, v9}, Lc4/i;->readFully([BII)V

    .line 303
    .line 304
    .line 305
    const-wide/16 v11, 0x0

    .line 306
    .line 307
    move v13, v3

    .line 308
    :goto_b
    if-ge v13, v9, :cond_c

    .line 309
    .line 310
    shl-long v10, v11, v10

    .line 311
    .line 312
    iget-object v12, v7, Li4/a;->a:[B

    .line 313
    .line 314
    aget-byte v12, v12, v13

    .line 315
    .line 316
    and-int v12, v12, v19

    .line 317
    .line 318
    int-to-long v14, v12

    .line 319
    or-long v11, v10, v14

    .line 320
    .line 321
    add-int/lit8 v13, v13, 0x1

    .line 322
    .line 323
    const/16 v19, 0xff

    .line 324
    .line 325
    const/16 v10, 0x8

    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_c
    if-ne v9, v8, :cond_d

    .line 329
    .line 330
    long-to-int v8, v11

    .line 331
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    float-to-double v8, v8

    .line 336
    goto :goto_c

    .line 337
    :cond_d
    invoke-static {v11, v12}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 338
    .line 339
    .line 340
    move-result-wide v8

    .line 341
    :goto_c
    check-cast v4, Li4/d$a;

    .line 342
    .line 343
    iget-object v4, v4, Li4/d$a;->a:Li4/d;

    .line 344
    .line 345
    const/16 v10, 0xb5

    .line 346
    .line 347
    if-eq v6, v10, :cond_f

    .line 348
    .line 349
    const/16 v10, 0x4489

    .line 350
    .line 351
    if-eq v6, v10, :cond_e

    .line 352
    .line 353
    packed-switch v6, :pswitch_data_0

    .line 354
    .line 355
    .line 356
    packed-switch v6, :pswitch_data_1

    .line 357
    .line 358
    .line 359
    goto/16 :goto_d

    .line 360
    .line 361
    :pswitch_0
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 362
    .line 363
    .line 364
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 365
    .line 366
    double-to-float v6, v8

    .line 367
    iput v6, v4, Li4/d$b;->M:F

    .line 368
    .line 369
    goto/16 :goto_e

    .line 370
    .line 371
    :pswitch_1
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 372
    .line 373
    .line 374
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 375
    .line 376
    double-to-float v6, v8

    .line 377
    iput v6, v4, Li4/d$b;->L:F

    .line 378
    .line 379
    goto/16 :goto_e

    .line 380
    .line 381
    :pswitch_2
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 382
    .line 383
    .line 384
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 385
    .line 386
    double-to-float v6, v8

    .line 387
    iput v6, v4, Li4/d$b;->K:F

    .line 388
    .line 389
    goto/16 :goto_e

    .line 390
    .line 391
    :pswitch_3
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 392
    .line 393
    .line 394
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 395
    .line 396
    double-to-float v6, v8

    .line 397
    iput v6, v4, Li4/d$b;->J:F

    .line 398
    .line 399
    goto :goto_e

    .line 400
    :pswitch_4
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 401
    .line 402
    .line 403
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 404
    .line 405
    double-to-float v6, v8

    .line 406
    iput v6, v4, Li4/d$b;->I:F

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :pswitch_5
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 410
    .line 411
    .line 412
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 413
    .line 414
    double-to-float v6, v8

    .line 415
    iput v6, v4, Li4/d$b;->H:F

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :pswitch_6
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 419
    .line 420
    .line 421
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 422
    .line 423
    double-to-float v6, v8

    .line 424
    iput v6, v4, Li4/d$b;->G:F

    .line 425
    .line 426
    goto :goto_e

    .line 427
    :pswitch_7
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 428
    .line 429
    .line 430
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 431
    .line 432
    double-to-float v6, v8

    .line 433
    iput v6, v4, Li4/d$b;->F:F

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :pswitch_8
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 437
    .line 438
    .line 439
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 440
    .line 441
    double-to-float v6, v8

    .line 442
    iput v6, v4, Li4/d$b;->E:F

    .line 443
    .line 444
    goto :goto_e

    .line 445
    :pswitch_9
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 446
    .line 447
    .line 448
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 449
    .line 450
    double-to-float v6, v8

    .line 451
    iput v6, v4, Li4/d$b;->D:F

    .line 452
    .line 453
    goto :goto_e

    .line 454
    :pswitch_a
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 455
    .line 456
    .line 457
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 458
    .line 459
    double-to-float v6, v8

    .line 460
    iput v6, v4, Li4/d$b;->u:F

    .line 461
    .line 462
    goto :goto_e

    .line 463
    :pswitch_b
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 464
    .line 465
    .line 466
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 467
    .line 468
    double-to-float v6, v8

    .line 469
    iput v6, v4, Li4/d$b;->t:F

    .line 470
    .line 471
    goto :goto_e

    .line 472
    :pswitch_c
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 473
    .line 474
    .line 475
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 476
    .line 477
    double-to-float v6, v8

    .line 478
    iput v6, v4, Li4/d$b;->s:F

    .line 479
    .line 480
    goto :goto_e

    .line 481
    :goto_d
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_e
    double-to-long v8, v8

    .line 486
    iput-wide v8, v4, Li4/d;->s:J

    .line 487
    .line 488
    goto :goto_e

    .line 489
    :cond_f
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 490
    .line 491
    .line 492
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 493
    .line 494
    double-to-int v6, v8

    .line 495
    iput v6, v4, Li4/d$b;->Q:I

    .line 496
    .line 497
    :goto_e
    iput v3, v7, Li4/a;->e:I

    .line 498
    .line 499
    :goto_f
    move v4, v5

    .line 500
    goto/16 :goto_2b

    .line 501
    .line 502
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    const-string v2, "Invalid element type "

    .line 508
    .line 509
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {v1, v13}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    throw v1

    .line 524
    :cond_11
    iget-object v4, v7, Li4/a;->d:Li4/b;

    .line 525
    .line 526
    iget v10, v7, Li4/a;->f:I

    .line 527
    .line 528
    iget-wide v8, v7, Li4/a;->g:J

    .line 529
    .line 530
    long-to-int v8, v8

    .line 531
    check-cast v4, Li4/d$a;

    .line 532
    .line 533
    iget-object v4, v4, Li4/d$a;->a:Li4/d;

    .line 534
    .line 535
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    const/16 v9, 0xa1

    .line 539
    .line 540
    const/16 v14, 0xa3

    .line 541
    .line 542
    if-eq v10, v9, :cond_1d

    .line 543
    .line 544
    if-eq v10, v14, :cond_1d

    .line 545
    .line 546
    const/16 v6, 0xa5

    .line 547
    .line 548
    if-eq v10, v6, :cond_1a

    .line 549
    .line 550
    const/16 v6, 0x41ed

    .line 551
    .line 552
    if-eq v10, v6, :cond_17

    .line 553
    .line 554
    const/16 v6, 0x4255

    .line 555
    .line 556
    if-eq v10, v6, :cond_16

    .line 557
    .line 558
    const/16 v6, 0x47e2

    .line 559
    .line 560
    if-eq v10, v6, :cond_15

    .line 561
    .line 562
    const/16 v5, 0x53ab

    .line 563
    .line 564
    if-eq v10, v5, :cond_14

    .line 565
    .line 566
    const/16 v5, 0x63a2

    .line 567
    .line 568
    if-eq v10, v5, :cond_13

    .line 569
    .line 570
    const/16 v5, 0x7672

    .line 571
    .line 572
    if-ne v10, v5, :cond_12

    .line 573
    .line 574
    invoke-virtual {v4, v10}, Li4/d;->c(I)V

    .line 575
    .line 576
    .line 577
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 578
    .line 579
    new-array v5, v8, [B

    .line 580
    .line 581
    iput-object v5, v4, Li4/d$b;->v:[B

    .line 582
    .line 583
    invoke-interface {v1, v5, v3, v8}, Lc4/i;->readFully([BII)V

    .line 584
    .line 585
    .line 586
    goto/16 :goto_2a

    .line 587
    .line 588
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 591
    .line 592
    .line 593
    const-string v2, "Unexpected id: "

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-static {v1, v13}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    throw v1

    .line 610
    :cond_13
    invoke-virtual {v4, v10}, Li4/d;->c(I)V

    .line 611
    .line 612
    .line 613
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 614
    .line 615
    new-array v5, v8, [B

    .line 616
    .line 617
    iput-object v5, v4, Li4/d$b;->k:[B

    .line 618
    .line 619
    invoke-interface {v1, v5, v3, v8}, Lc4/i;->readFully([BII)V

    .line 620
    .line 621
    .line 622
    goto/16 :goto_2a

    .line 623
    .line 624
    :cond_14
    iget-object v5, v4, Li4/d;->i:Lv5/u;

    .line 625
    .line 626
    iget-object v5, v5, Lv5/u;->a:[B

    .line 627
    .line 628
    invoke-static {v5, v3}, Ljava/util/Arrays;->fill([BB)V

    .line 629
    .line 630
    .line 631
    iget-object v5, v4, Li4/d;->i:Lv5/u;

    .line 632
    .line 633
    iget-object v5, v5, Lv5/u;->a:[B

    .line 634
    .line 635
    rsub-int/lit8 v6, v8, 0x4

    .line 636
    .line 637
    invoke-interface {v1, v5, v6, v8}, Lc4/i;->readFully([BII)V

    .line 638
    .line 639
    .line 640
    iget-object v5, v4, Li4/d;->i:Lv5/u;

    .line 641
    .line 642
    invoke-virtual {v5, v3}, Lv5/u;->G(I)V

    .line 643
    .line 644
    .line 645
    iget-object v5, v4, Li4/d;->i:Lv5/u;

    .line 646
    .line 647
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 648
    .line 649
    .line 650
    move-result-wide v5

    .line 651
    long-to-int v5, v5

    .line 652
    iput v5, v4, Li4/d;->w:I

    .line 653
    .line 654
    goto/16 :goto_2a

    .line 655
    .line 656
    :cond_15
    new-array v6, v8, [B

    .line 657
    .line 658
    invoke-interface {v1, v6, v3, v8}, Lc4/i;->readFully([BII)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v4, v10}, Li4/d;->c(I)V

    .line 662
    .line 663
    .line 664
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 665
    .line 666
    new-instance v8, Lc4/v$a;

    .line 667
    .line 668
    invoke-direct {v8, v5, v6, v3, v3}, Lc4/v$a;-><init>(I[BII)V

    .line 669
    .line 670
    .line 671
    iput-object v8, v4, Li4/d$b;->j:Lc4/v$a;

    .line 672
    .line 673
    goto/16 :goto_2a

    .line 674
    .line 675
    :cond_16
    invoke-virtual {v4, v10}, Li4/d;->c(I)V

    .line 676
    .line 677
    .line 678
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 679
    .line 680
    new-array v5, v8, [B

    .line 681
    .line 682
    iput-object v5, v4, Li4/d$b;->i:[B

    .line 683
    .line 684
    invoke-interface {v1, v5, v3, v8}, Lc4/i;->readFully([BII)V

    .line 685
    .line 686
    .line 687
    goto/16 :goto_2a

    .line 688
    .line 689
    :cond_17
    invoke-virtual {v4, v10}, Li4/d;->c(I)V

    .line 690
    .line 691
    .line 692
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 693
    .line 694
    iget v5, v4, Li4/d$b;->g:I

    .line 695
    .line 696
    const v6, 0x64767643

    .line 697
    .line 698
    .line 699
    if-eq v5, v6, :cond_19

    .line 700
    .line 701
    const v6, 0x64766343

    .line 702
    .line 703
    .line 704
    if-ne v5, v6, :cond_18

    .line 705
    .line 706
    goto :goto_10

    .line 707
    :cond_18
    invoke-interface {v1, v8}, Lc4/i;->j(I)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_2a

    .line 711
    .line 712
    :cond_19
    :goto_10
    new-array v5, v8, [B

    .line 713
    .line 714
    iput-object v5, v4, Li4/d$b;->N:[B

    .line 715
    .line 716
    invoke-interface {v1, v5, v3, v8}, Lc4/i;->readFully([BII)V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_2a

    .line 720
    .line 721
    :cond_1a
    iget v5, v4, Li4/d;->G:I

    .line 722
    .line 723
    const/4 v6, 0x2

    .line 724
    if-eq v5, v6, :cond_1b

    .line 725
    .line 726
    goto/16 :goto_2a

    .line 727
    .line 728
    :cond_1b
    iget-object v5, v4, Li4/d;->c:Landroid/util/SparseArray;

    .line 729
    .line 730
    iget v6, v4, Li4/d;->M:I

    .line 731
    .line 732
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v5

    .line 736
    check-cast v5, Li4/d$b;

    .line 737
    .line 738
    iget v6, v4, Li4/d;->P:I

    .line 739
    .line 740
    const/4 v9, 0x4

    .line 741
    if-ne v6, v9, :cond_1c

    .line 742
    .line 743
    iget-object v5, v5, Li4/d$b;->b:Ljava/lang/String;

    .line 744
    .line 745
    const-string v6, "V_VP9"

    .line 746
    .line 747
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-eqz v5, :cond_1c

    .line 752
    .line 753
    iget-object v5, v4, Li4/d;->n:Lv5/u;

    .line 754
    .line 755
    invoke-virtual {v5, v8}, Lv5/u;->D(I)V

    .line 756
    .line 757
    .line 758
    iget-object v4, v4, Li4/d;->n:Lv5/u;

    .line 759
    .line 760
    iget-object v4, v4, Lv5/u;->a:[B

    .line 761
    .line 762
    invoke-interface {v1, v4, v3, v8}, Lc4/i;->readFully([BII)V

    .line 763
    .line 764
    .line 765
    goto/16 :goto_2a

    .line 766
    .line 767
    :cond_1c
    invoke-interface {v1, v8}, Lc4/i;->j(I)V

    .line 768
    .line 769
    .line 770
    goto/16 :goto_2a

    .line 771
    .line 772
    :cond_1d
    iget v9, v4, Li4/d;->G:I

    .line 773
    .line 774
    if-nez v9, :cond_1e

    .line 775
    .line 776
    iget-object v9, v4, Li4/d;->b:Li4/e;

    .line 777
    .line 778
    const/16 v13, 0x8

    .line 779
    .line 780
    invoke-virtual {v9, v1, v3, v5, v13}, Li4/e;->b(Lc4/i;ZZI)J

    .line 781
    .line 782
    .line 783
    move-result-wide v13

    .line 784
    long-to-int v9, v13

    .line 785
    iput v9, v4, Li4/d;->M:I

    .line 786
    .line 787
    iget-object v9, v4, Li4/d;->b:Li4/e;

    .line 788
    .line 789
    iget v9, v9, Li4/e;->c:I

    .line 790
    .line 791
    iput v9, v4, Li4/d;->N:I

    .line 792
    .line 793
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    iput-wide v13, v4, Li4/d;->I:J

    .line 799
    .line 800
    iput v5, v4, Li4/d;->G:I

    .line 801
    .line 802
    iget-object v9, v4, Li4/d;->g:Lv5/u;

    .line 803
    .line 804
    invoke-virtual {v9, v3}, Lv5/u;->D(I)V

    .line 805
    .line 806
    .line 807
    :cond_1e
    iget-object v9, v4, Li4/d;->c:Landroid/util/SparseArray;

    .line 808
    .line 809
    iget v13, v4, Li4/d;->M:I

    .line 810
    .line 811
    invoke-virtual {v9, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v9

    .line 815
    check-cast v9, Li4/d$b;

    .line 816
    .line 817
    if-nez v9, :cond_1f

    .line 818
    .line 819
    iget v5, v4, Li4/d;->N:I

    .line 820
    .line 821
    sub-int/2addr v8, v5

    .line 822
    invoke-interface {v1, v8}, Lc4/i;->j(I)V

    .line 823
    .line 824
    .line 825
    goto/16 :goto_1f

    .line 826
    .line 827
    :cond_1f
    iget-object v13, v9, Li4/d$b;->X:Lc4/v;

    .line 828
    .line 829
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    iget v13, v4, Li4/d;->G:I

    .line 833
    .line 834
    if-ne v13, v5, :cond_34

    .line 835
    .line 836
    invoke-virtual {v4, v1, v12}, Li4/d;->h(Lc4/i;I)V

    .line 837
    .line 838
    .line 839
    iget-object v13, v4, Li4/d;->g:Lv5/u;

    .line 840
    .line 841
    iget-object v13, v13, Lv5/u;->a:[B

    .line 842
    .line 843
    const/4 v11, 0x2

    .line 844
    aget-byte v13, v13, v11

    .line 845
    .line 846
    and-int/lit8 v13, v13, 0x6

    .line 847
    .line 848
    shr-int/2addr v13, v5

    .line 849
    if-nez v13, :cond_22

    .line 850
    .line 851
    iput v5, v4, Li4/d;->K:I

    .line 852
    .line 853
    iget-object v6, v4, Li4/d;->L:[I

    .line 854
    .line 855
    if-nez v6, :cond_20

    .line 856
    .line 857
    new-array v6, v5, [I

    .line 858
    .line 859
    goto :goto_11

    .line 860
    :cond_20
    array-length v13, v6

    .line 861
    if-lt v13, v5, :cond_21

    .line 862
    .line 863
    goto :goto_11

    .line 864
    :cond_21
    array-length v6, v6

    .line 865
    const/4 v11, 0x2

    .line 866
    mul-int/2addr v6, v11

    .line 867
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 868
    .line 869
    .line 870
    move-result v5

    .line 871
    new-array v6, v5, [I

    .line 872
    .line 873
    :goto_11
    iput-object v6, v4, Li4/d;->L:[I

    .line 874
    .line 875
    iget v5, v4, Li4/d;->N:I

    .line 876
    .line 877
    sub-int/2addr v8, v5

    .line 878
    sub-int/2addr v8, v12

    .line 879
    aput v8, v6, v3

    .line 880
    .line 881
    goto/16 :goto_1a

    .line 882
    .line 883
    :cond_22
    const/4 v14, 0x4

    .line 884
    invoke-virtual {v4, v1, v14}, Li4/d;->h(Lc4/i;I)V

    .line 885
    .line 886
    .line 887
    iget-object v14, v4, Li4/d;->g:Lv5/u;

    .line 888
    .line 889
    iget-object v14, v14, Lv5/u;->a:[B

    .line 890
    .line 891
    aget-byte v12, v14, v12

    .line 892
    .line 893
    and-int/lit16 v12, v12, 0xff

    .line 894
    .line 895
    add-int/2addr v12, v5

    .line 896
    iput v12, v4, Li4/d;->K:I

    .line 897
    .line 898
    iget-object v14, v4, Li4/d;->L:[I

    .line 899
    .line 900
    if-nez v14, :cond_23

    .line 901
    .line 902
    new-array v14, v12, [I

    .line 903
    .line 904
    :goto_12
    move-object v11, v14

    .line 905
    const/4 v14, 0x2

    .line 906
    goto :goto_13

    .line 907
    :cond_23
    array-length v11, v14

    .line 908
    if-lt v11, v12, :cond_24

    .line 909
    .line 910
    goto :goto_12

    .line 911
    :cond_24
    array-length v11, v14

    .line 912
    const/4 v14, 0x2

    .line 913
    mul-int/2addr v11, v14

    .line 914
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 915
    .line 916
    .line 917
    move-result v11

    .line 918
    new-array v11, v11, [I

    .line 919
    .line 920
    :goto_13
    iput-object v11, v4, Li4/d;->L:[I

    .line 921
    .line 922
    if-ne v13, v14, :cond_25

    .line 923
    .line 924
    iget v5, v4, Li4/d;->N:I

    .line 925
    .line 926
    sub-int/2addr v8, v5

    .line 927
    const/4 v12, 0x4

    .line 928
    sub-int/2addr v8, v12

    .line 929
    iget v5, v4, Li4/d;->K:I

    .line 930
    .line 931
    div-int/2addr v8, v5

    .line 932
    invoke-static {v11, v3, v5, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 933
    .line 934
    .line 935
    goto/16 :goto_1a

    .line 936
    .line 937
    :cond_25
    const/4 v12, 0x4

    .line 938
    if-ne v13, v5, :cond_28

    .line 939
    .line 940
    move v11, v3

    .line 941
    move v13, v11

    .line 942
    :goto_14
    iget v14, v4, Li4/d;->K:I

    .line 943
    .line 944
    add-int/2addr v14, v6

    .line 945
    if-ge v11, v14, :cond_27

    .line 946
    .line 947
    iget-object v14, v4, Li4/d;->L:[I

    .line 948
    .line 949
    aput v3, v14, v11

    .line 950
    .line 951
    :cond_26
    add-int/2addr v12, v5

    .line 952
    invoke-virtual {v4, v1, v12}, Li4/d;->h(Lc4/i;I)V

    .line 953
    .line 954
    .line 955
    iget-object v14, v4, Li4/d;->g:Lv5/u;

    .line 956
    .line 957
    iget-object v14, v14, Lv5/u;->a:[B

    .line 958
    .line 959
    add-int/lit8 v15, v12, -0x1

    .line 960
    .line 961
    aget-byte v14, v14, v15

    .line 962
    .line 963
    const/16 v15, 0xff

    .line 964
    .line 965
    and-int/2addr v14, v15

    .line 966
    iget-object v15, v4, Li4/d;->L:[I

    .line 967
    .line 968
    aget v17, v15, v11

    .line 969
    .line 970
    add-int v17, v17, v14

    .line 971
    .line 972
    aput v17, v15, v11

    .line 973
    .line 974
    const/16 v15, 0xff

    .line 975
    .line 976
    if-eq v14, v15, :cond_26

    .line 977
    .line 978
    add-int v13, v13, v17

    .line 979
    .line 980
    add-int/lit8 v11, v11, 0x1

    .line 981
    .line 982
    goto :goto_14

    .line 983
    :cond_27
    iget-object v3, v4, Li4/d;->L:[I

    .line 984
    .line 985
    iget v5, v4, Li4/d;->N:I

    .line 986
    .line 987
    sub-int/2addr v8, v5

    .line 988
    sub-int/2addr v8, v12

    .line 989
    sub-int/2addr v8, v13

    .line 990
    aput v8, v3, v14

    .line 991
    .line 992
    goto/16 :goto_1a

    .line 993
    .line 994
    :cond_28
    const/4 v11, 0x3

    .line 995
    if-ne v13, v11, :cond_33

    .line 996
    .line 997
    move v11, v5

    .line 998
    move v13, v12

    .line 999
    move v5, v3

    .line 1000
    move v12, v6

    .line 1001
    move v6, v5

    .line 1002
    :goto_15
    iget v14, v4, Li4/d;->K:I

    .line 1003
    .line 1004
    add-int/2addr v14, v12

    .line 1005
    if-ge v3, v14, :cond_30

    .line 1006
    .line 1007
    iget-object v12, v4, Li4/d;->L:[I

    .line 1008
    .line 1009
    aput v6, v12, v3

    .line 1010
    .line 1011
    add-int/lit8 v13, v13, 0x1

    .line 1012
    .line 1013
    invoke-virtual {v4, v1, v13}, Li4/d;->h(Lc4/i;I)V

    .line 1014
    .line 1015
    .line 1016
    iget-object v12, v4, Li4/d;->g:Lv5/u;

    .line 1017
    .line 1018
    iget-object v12, v12, Lv5/u;->a:[B

    .line 1019
    .line 1020
    add-int/lit8 v14, v13, -0x1

    .line 1021
    .line 1022
    aget-byte v12, v12, v14

    .line 1023
    .line 1024
    if-eqz v12, :cond_2f

    .line 1025
    .line 1026
    :goto_16
    const/16 v12, 0x8

    .line 1027
    .line 1028
    if-ge v6, v12, :cond_2b

    .line 1029
    .line 1030
    rsub-int/lit8 v12, v6, 0x7

    .line 1031
    .line 1032
    shl-int/2addr v11, v12

    .line 1033
    iget-object v12, v4, Li4/d;->g:Lv5/u;

    .line 1034
    .line 1035
    iget-object v12, v12, Lv5/u;->a:[B

    .line 1036
    .line 1037
    aget-byte v12, v12, v14

    .line 1038
    .line 1039
    and-int/2addr v12, v11

    .line 1040
    if-eqz v12, :cond_2a

    .line 1041
    .line 1042
    add-int/2addr v13, v6

    .line 1043
    invoke-virtual {v4, v1, v13}, Li4/d;->h(Lc4/i;I)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v12, v4, Li4/d;->g:Lv5/u;

    .line 1047
    .line 1048
    iget-object v12, v12, Lv5/u;->a:[B

    .line 1049
    .line 1050
    add-int/lit8 v17, v14, 0x1

    .line 1051
    .line 1052
    aget-byte v12, v12, v14

    .line 1053
    .line 1054
    and-int/lit16 v12, v12, 0xff

    .line 1055
    .line 1056
    not-int v11, v11

    .line 1057
    and-int/2addr v11, v12

    .line 1058
    int-to-long v11, v11

    .line 1059
    :goto_17
    move/from16 v14, v17

    .line 1060
    .line 1061
    if-ge v14, v13, :cond_29

    .line 1062
    .line 1063
    const/16 v17, 0x8

    .line 1064
    .line 1065
    shl-long v11, v11, v17

    .line 1066
    .line 1067
    iget-object v15, v4, Li4/d;->g:Lv5/u;

    .line 1068
    .line 1069
    iget-object v15, v15, Lv5/u;->a:[B

    .line 1070
    .line 1071
    add-int/lit8 v17, v14, 0x1

    .line 1072
    .line 1073
    aget-byte v14, v15, v14

    .line 1074
    .line 1075
    and-int/lit16 v14, v14, 0xff

    .line 1076
    .line 1077
    int-to-long v14, v14

    .line 1078
    or-long/2addr v11, v14

    .line 1079
    goto :goto_17

    .line 1080
    :cond_29
    if-lez v3, :cond_2c

    .line 1081
    .line 1082
    mul-int/lit8 v6, v6, 0x7

    .line 1083
    .line 1084
    add-int/lit8 v6, v6, 0x6

    .line 1085
    .line 1086
    const-wide/16 v14, 0x1

    .line 1087
    .line 1088
    shl-long v16, v14, v6

    .line 1089
    .line 1090
    sub-long v16, v16, v14

    .line 1091
    .line 1092
    sub-long v11, v11, v16

    .line 1093
    .line 1094
    goto :goto_18

    .line 1095
    :cond_2a
    add-int/lit8 v6, v6, 0x1

    .line 1096
    .line 1097
    const/4 v11, 0x1

    .line 1098
    goto :goto_16

    .line 1099
    :cond_2b
    const-wide/16 v11, 0x0

    .line 1100
    .line 1101
    :cond_2c
    :goto_18
    const-wide/32 v14, -0x80000000

    .line 1102
    .line 1103
    .line 1104
    cmp-long v6, v11, v14

    .line 1105
    .line 1106
    if-ltz v6, :cond_2e

    .line 1107
    .line 1108
    cmp-long v6, v11, v20

    .line 1109
    .line 1110
    if-gtz v6, :cond_2e

    .line 1111
    .line 1112
    long-to-int v6, v11

    .line 1113
    iget-object v11, v4, Li4/d;->L:[I

    .line 1114
    .line 1115
    if-nez v3, :cond_2d

    .line 1116
    .line 1117
    goto :goto_19

    .line 1118
    :cond_2d
    add-int/lit8 v12, v3, -0x1

    .line 1119
    .line 1120
    aget v12, v11, v12

    .line 1121
    .line 1122
    add-int/2addr v6, v12

    .line 1123
    :goto_19
    aput v6, v11, v3

    .line 1124
    .line 1125
    add-int/2addr v5, v6

    .line 1126
    add-int/lit8 v3, v3, 0x1

    .line 1127
    .line 1128
    const/4 v6, 0x0

    .line 1129
    const/4 v11, 0x1

    .line 1130
    const/4 v12, -0x1

    .line 1131
    goto/16 :goto_15

    .line 1132
    .line 1133
    :cond_2e
    const-string v1, "EBML lacing sample size out of range."

    .line 1134
    .line 1135
    const/4 v2, 0x0

    .line 1136
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    throw v1

    .line 1141
    :cond_2f
    const/4 v1, 0x0

    .line 1142
    const-string v2, "No valid varint length mask found"

    .line 1143
    .line 1144
    invoke-static {v2, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v1

    .line 1148
    throw v1

    .line 1149
    :cond_30
    iget-object v3, v4, Li4/d;->L:[I

    .line 1150
    .line 1151
    iget v6, v4, Li4/d;->N:I

    .line 1152
    .line 1153
    sub-int/2addr v8, v6

    .line 1154
    sub-int/2addr v8, v13

    .line 1155
    sub-int/2addr v8, v5

    .line 1156
    aput v8, v3, v14

    .line 1157
    .line 1158
    :goto_1a
    iget-object v3, v4, Li4/d;->g:Lv5/u;

    .line 1159
    .line 1160
    iget-object v3, v3, Lv5/u;->a:[B

    .line 1161
    .line 1162
    const/4 v5, 0x0

    .line 1163
    aget-byte v5, v3, v5

    .line 1164
    .line 1165
    shl-int/lit8 v5, v5, 0x8

    .line 1166
    .line 1167
    const/4 v6, 0x1

    .line 1168
    aget-byte v3, v3, v6

    .line 1169
    .line 1170
    and-int/lit16 v3, v3, 0xff

    .line 1171
    .line 1172
    or-int/2addr v3, v5

    .line 1173
    iget-wide v5, v4, Li4/d;->B:J

    .line 1174
    .line 1175
    int-to-long v11, v3

    .line 1176
    invoke-virtual {v4, v11, v12}, Li4/d;->k(J)J

    .line 1177
    .line 1178
    .line 1179
    move-result-wide v11

    .line 1180
    add-long/2addr v11, v5

    .line 1181
    iput-wide v11, v4, Li4/d;->H:J

    .line 1182
    .line 1183
    iget v3, v9, Li4/d$b;->d:I

    .line 1184
    .line 1185
    const/4 v5, 0x2

    .line 1186
    if-eq v3, v5, :cond_32

    .line 1187
    .line 1188
    const/16 v3, 0xa3

    .line 1189
    .line 1190
    if-ne v10, v3, :cond_31

    .line 1191
    .line 1192
    iget-object v3, v4, Li4/d;->g:Lv5/u;

    .line 1193
    .line 1194
    iget-object v3, v3, Lv5/u;->a:[B

    .line 1195
    .line 1196
    aget-byte v3, v3, v5

    .line 1197
    .line 1198
    const/16 v6, 0x80

    .line 1199
    .line 1200
    and-int/2addr v3, v6

    .line 1201
    if-ne v3, v6, :cond_31

    .line 1202
    .line 1203
    goto :goto_1b

    .line 1204
    :cond_31
    const/4 v3, 0x0

    .line 1205
    goto :goto_1c

    .line 1206
    :cond_32
    :goto_1b
    const/4 v3, 0x1

    .line 1207
    :goto_1c
    iput v3, v4, Li4/d;->O:I

    .line 1208
    .line 1209
    iput v5, v4, Li4/d;->G:I

    .line 1210
    .line 1211
    const/4 v3, 0x0

    .line 1212
    iput v3, v4, Li4/d;->J:I

    .line 1213
    .line 1214
    goto :goto_1d

    .line 1215
    :cond_33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1216
    .line 1217
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1218
    .line 1219
    .line 1220
    const-string v2, "Unexpected lacing value: "

    .line 1221
    .line 1222
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    const/4 v2, 0x0

    .line 1233
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    throw v1

    .line 1238
    :cond_34
    :goto_1d
    const/16 v3, 0xa3

    .line 1239
    .line 1240
    if-ne v10, v3, :cond_36

    .line 1241
    .line 1242
    :goto_1e
    iget v3, v4, Li4/d;->J:I

    .line 1243
    .line 1244
    iget v5, v4, Li4/d;->K:I

    .line 1245
    .line 1246
    if-ge v3, v5, :cond_35

    .line 1247
    .line 1248
    iget-object v5, v4, Li4/d;->L:[I

    .line 1249
    .line 1250
    aget v3, v5, v3

    .line 1251
    .line 1252
    const/4 v5, 0x0

    .line 1253
    invoke-virtual {v4, v1, v9, v3, v5}, Li4/d;->l(Lc4/i;Li4/d$b;IZ)I

    .line 1254
    .line 1255
    .line 1256
    move-result v27

    .line 1257
    iget-wide v5, v4, Li4/d;->H:J

    .line 1258
    .line 1259
    iget v3, v4, Li4/d;->J:I

    .line 1260
    .line 1261
    iget v8, v9, Li4/d$b;->e:I

    .line 1262
    .line 1263
    mul-int/2addr v3, v8

    .line 1264
    div-int/lit16 v3, v3, 0x3e8

    .line 1265
    .line 1266
    int-to-long v10, v3

    .line 1267
    add-long v24, v10, v5

    .line 1268
    .line 1269
    iget v3, v4, Li4/d;->O:I

    .line 1270
    .line 1271
    const/16 v28, 0x0

    .line 1272
    .line 1273
    move-object/from16 v22, v4

    .line 1274
    .line 1275
    move-object/from16 v23, v9

    .line 1276
    .line 1277
    move/from16 v26, v3

    .line 1278
    .line 1279
    invoke-virtual/range {v22 .. v28}, Li4/d;->e(Li4/d$b;JIII)V

    .line 1280
    .line 1281
    .line 1282
    iget v3, v4, Li4/d;->J:I

    .line 1283
    .line 1284
    add-int/lit8 v3, v3, 0x1

    .line 1285
    .line 1286
    iput v3, v4, Li4/d;->J:I

    .line 1287
    .line 1288
    goto :goto_1e

    .line 1289
    :cond_35
    const/4 v3, 0x0

    .line 1290
    :goto_1f
    iput v3, v4, Li4/d;->G:I

    .line 1291
    .line 1292
    goto/16 :goto_2a

    .line 1293
    .line 1294
    :cond_36
    :goto_20
    iget v3, v4, Li4/d;->J:I

    .line 1295
    .line 1296
    iget v5, v4, Li4/d;->K:I

    .line 1297
    .line 1298
    if-ge v3, v5, :cond_62

    .line 1299
    .line 1300
    iget-object v5, v4, Li4/d;->L:[I

    .line 1301
    .line 1302
    aget v6, v5, v3

    .line 1303
    .line 1304
    const/4 v8, 0x1

    .line 1305
    invoke-virtual {v4, v1, v9, v6, v8}, Li4/d;->l(Lc4/i;Li4/d$b;IZ)I

    .line 1306
    .line 1307
    .line 1308
    move-result v6

    .line 1309
    aput v6, v5, v3

    .line 1310
    .line 1311
    iget v3, v4, Li4/d;->J:I

    .line 1312
    .line 1313
    add-int/2addr v3, v8

    .line 1314
    iput v3, v4, Li4/d;->J:I

    .line 1315
    .line 1316
    goto :goto_20

    .line 1317
    :cond_37
    iget-wide v3, v7, Li4/a;->g:J

    .line 1318
    .line 1319
    cmp-long v5, v3, v20

    .line 1320
    .line 1321
    if-gtz v5, :cond_3f

    .line 1322
    .line 1323
    iget-object v5, v7, Li4/a;->d:Li4/b;

    .line 1324
    .line 1325
    iget v6, v7, Li4/a;->f:I

    .line 1326
    .line 1327
    long-to-int v3, v3

    .line 1328
    if-nez v3, :cond_38

    .line 1329
    .line 1330
    const-string v3, ""

    .line 1331
    .line 1332
    goto :goto_22

    .line 1333
    :cond_38
    new-array v4, v3, [B

    .line 1334
    .line 1335
    const/4 v8, 0x0

    .line 1336
    invoke-interface {v1, v4, v8, v3}, Lc4/i;->readFully([BII)V

    .line 1337
    .line 1338
    .line 1339
    :goto_21
    if-lez v3, :cond_39

    .line 1340
    .line 1341
    add-int/lit8 v9, v3, -0x1

    .line 1342
    .line 1343
    aget-byte v10, v4, v9

    .line 1344
    .line 1345
    if-nez v10, :cond_39

    .line 1346
    .line 1347
    move v3, v9

    .line 1348
    goto :goto_21

    .line 1349
    :cond_39
    new-instance v9, Ljava/lang/String;

    .line 1350
    .line 1351
    invoke-direct {v9, v4, v8, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1352
    .line 1353
    .line 1354
    move-object v3, v9

    .line 1355
    :goto_22
    check-cast v5, Li4/d$a;

    .line 1356
    .line 1357
    iget-object v4, v5, Li4/d$a;->a:Li4/d;

    .line 1358
    .line 1359
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1360
    .line 1361
    .line 1362
    const/16 v5, 0x86

    .line 1363
    .line 1364
    if-eq v6, v5, :cond_3e

    .line 1365
    .line 1366
    const/16 v5, 0x4282

    .line 1367
    .line 1368
    if-eq v6, v5, :cond_3c

    .line 1369
    .line 1370
    const/16 v5, 0x536e

    .line 1371
    .line 1372
    if-eq v6, v5, :cond_3b

    .line 1373
    .line 1374
    const v5, 0x22b59c

    .line 1375
    .line 1376
    .line 1377
    if-eq v6, v5, :cond_3a

    .line 1378
    .line 1379
    goto/16 :goto_29

    .line 1380
    .line 1381
    :cond_3a
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 1382
    .line 1383
    .line 1384
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 1385
    .line 1386
    iput-object v3, v4, Li4/d$b;->W:Ljava/lang/String;

    .line 1387
    .line 1388
    goto/16 :goto_29

    .line 1389
    .line 1390
    :cond_3b
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 1391
    .line 1392
    .line 1393
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 1394
    .line 1395
    iput-object v3, v4, Li4/d$b;->a:Ljava/lang/String;

    .line 1396
    .line 1397
    goto/16 :goto_29

    .line 1398
    .line 1399
    :cond_3c
    const-string v4, "webm"

    .line 1400
    .line 1401
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v4

    .line 1405
    if-nez v4, :cond_62

    .line 1406
    .line 1407
    const-string v4, "matroska"

    .line 1408
    .line 1409
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v4

    .line 1413
    if-eqz v4, :cond_3d

    .line 1414
    .line 1415
    goto/16 :goto_29

    .line 1416
    .line 1417
    :cond_3d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1420
    .line 1421
    .line 1422
    const-string v2, "DocType "

    .line 1423
    .line 1424
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v1

    .line 1437
    const/4 v2, 0x0

    .line 1438
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    throw v1

    .line 1443
    :cond_3e
    invoke-virtual {v4, v6}, Li4/d;->c(I)V

    .line 1444
    .line 1445
    .line 1446
    iget-object v4, v4, Li4/d;->u:Li4/d$b;

    .line 1447
    .line 1448
    iput-object v3, v4, Li4/d$b;->b:Ljava/lang/String;

    .line 1449
    .line 1450
    goto/16 :goto_29

    .line 1451
    .line 1452
    :cond_3f
    const-string v1, "String element size: "

    .line 1453
    .line 1454
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    iget-wide v2, v7, Li4/a;->g:J

    .line 1459
    .line 1460
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    const/4 v2, 0x0

    .line 1468
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v1

    .line 1472
    throw v1

    .line 1473
    :cond_40
    iget-wide v3, v7, Li4/a;->g:J

    .line 1474
    .line 1475
    cmp-long v5, v3, v17

    .line 1476
    .line 1477
    if-gtz v5, :cond_57

    .line 1478
    .line 1479
    iget-object v5, v7, Li4/a;->d:Li4/b;

    .line 1480
    .line 1481
    iget v6, v7, Li4/a;->f:I

    .line 1482
    .line 1483
    long-to-int v3, v3

    .line 1484
    iget-object v4, v7, Li4/a;->a:[B

    .line 1485
    .line 1486
    const/4 v8, 0x0

    .line 1487
    invoke-interface {v1, v4, v8, v3}, Lc4/i;->readFully([BII)V

    .line 1488
    .line 1489
    .line 1490
    const/4 v4, 0x0

    .line 1491
    const-wide/16 v8, 0x0

    .line 1492
    .line 1493
    :goto_23
    if-ge v4, v3, :cond_41

    .line 1494
    .line 1495
    const/16 v10, 0x8

    .line 1496
    .line 1497
    shl-long/2addr v8, v10

    .line 1498
    iget-object v10, v7, Li4/a;->a:[B

    .line 1499
    .line 1500
    aget-byte v10, v10, v4

    .line 1501
    .line 1502
    and-int/lit16 v10, v10, 0xff

    .line 1503
    .line 1504
    int-to-long v10, v10

    .line 1505
    or-long/2addr v8, v10

    .line 1506
    add-int/lit8 v4, v4, 0x1

    .line 1507
    .line 1508
    goto :goto_23

    .line 1509
    :cond_41
    check-cast v5, Li4/d$a;

    .line 1510
    .line 1511
    iget-object v3, v5, Li4/d$a;->a:Li4/d;

    .line 1512
    .line 1513
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    const/16 v4, 0x5031

    .line 1517
    .line 1518
    if-eq v6, v4, :cond_55

    .line 1519
    .line 1520
    const/16 v4, 0x5032

    .line 1521
    .line 1522
    if-eq v6, v4, :cond_53

    .line 1523
    .line 1524
    sparse-switch v6, :sswitch_data_1

    .line 1525
    .line 1526
    .line 1527
    packed-switch v6, :pswitch_data_2

    .line 1528
    .line 1529
    .line 1530
    goto/16 :goto_29

    .line 1531
    .line 1532
    :sswitch_5
    iput-wide v8, v3, Li4/d;->r:J

    .line 1533
    .line 1534
    goto/16 :goto_29

    .line 1535
    .line 1536
    :sswitch_6
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1537
    .line 1538
    .line 1539
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1540
    .line 1541
    long-to-int v4, v8

    .line 1542
    iput v4, v3, Li4/d$b;->e:I

    .line 1543
    .line 1544
    goto/16 :goto_29

    .line 1545
    .line 1546
    :sswitch_7
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1547
    .line 1548
    .line 1549
    long-to-int v4, v8

    .line 1550
    if-eqz v4, :cond_45

    .line 1551
    .line 1552
    const/4 v5, 0x1

    .line 1553
    if-eq v4, v5, :cond_44

    .line 1554
    .line 1555
    const/4 v5, 0x2

    .line 1556
    if-eq v4, v5, :cond_43

    .line 1557
    .line 1558
    const/4 v5, 0x3

    .line 1559
    if-eq v4, v5, :cond_42

    .line 1560
    .line 1561
    goto/16 :goto_29

    .line 1562
    .line 1563
    :cond_42
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1564
    .line 1565
    iput v5, v3, Li4/d$b;->r:I

    .line 1566
    .line 1567
    goto/16 :goto_29

    .line 1568
    .line 1569
    :cond_43
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1570
    .line 1571
    const/4 v4, 0x2

    .line 1572
    goto :goto_24

    .line 1573
    :cond_44
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1574
    .line 1575
    const/4 v4, 0x1

    .line 1576
    goto :goto_24

    .line 1577
    :cond_45
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1578
    .line 1579
    const/4 v4, 0x0

    .line 1580
    :goto_24
    iput v4, v3, Li4/d$b;->r:I

    .line 1581
    .line 1582
    goto/16 :goto_29

    .line 1583
    .line 1584
    :sswitch_8
    iput-wide v8, v3, Li4/d;->R:J

    .line 1585
    .line 1586
    goto/16 :goto_29

    .line 1587
    .line 1588
    :sswitch_9
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1589
    .line 1590
    .line 1591
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1592
    .line 1593
    long-to-int v4, v8

    .line 1594
    iput v4, v3, Li4/d$b;->P:I

    .line 1595
    .line 1596
    goto/16 :goto_29

    .line 1597
    .line 1598
    :sswitch_a
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1599
    .line 1600
    .line 1601
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1602
    .line 1603
    iput-wide v8, v3, Li4/d$b;->S:J

    .line 1604
    .line 1605
    goto/16 :goto_29

    .line 1606
    .line 1607
    :sswitch_b
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1608
    .line 1609
    .line 1610
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1611
    .line 1612
    iput-wide v8, v3, Li4/d$b;->R:J

    .line 1613
    .line 1614
    goto/16 :goto_29

    .line 1615
    .line 1616
    :sswitch_c
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1617
    .line 1618
    .line 1619
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1620
    .line 1621
    long-to-int v4, v8

    .line 1622
    iput v4, v3, Li4/d$b;->f:I

    .line 1623
    .line 1624
    goto/16 :goto_29

    .line 1625
    .line 1626
    :sswitch_d
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1627
    .line 1628
    .line 1629
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1630
    .line 1631
    const-wide/16 v4, 0x1

    .line 1632
    .line 1633
    cmp-long v4, v8, v4

    .line 1634
    .line 1635
    if-nez v4, :cond_46

    .line 1636
    .line 1637
    const/4 v4, 0x1

    .line 1638
    goto :goto_25

    .line 1639
    :cond_46
    const/4 v4, 0x0

    .line 1640
    :goto_25
    iput-boolean v4, v3, Li4/d$b;->U:Z

    .line 1641
    .line 1642
    goto/16 :goto_29

    .line 1643
    .line 1644
    :sswitch_e
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1645
    .line 1646
    .line 1647
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1648
    .line 1649
    long-to-int v4, v8

    .line 1650
    iput v4, v3, Li4/d$b;->p:I

    .line 1651
    .line 1652
    goto/16 :goto_29

    .line 1653
    .line 1654
    :sswitch_f
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1655
    .line 1656
    .line 1657
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1658
    .line 1659
    long-to-int v4, v8

    .line 1660
    iput v4, v3, Li4/d$b;->q:I

    .line 1661
    .line 1662
    goto/16 :goto_29

    .line 1663
    .line 1664
    :sswitch_10
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1665
    .line 1666
    .line 1667
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1668
    .line 1669
    long-to-int v4, v8

    .line 1670
    iput v4, v3, Li4/d$b;->o:I

    .line 1671
    .line 1672
    goto/16 :goto_29

    .line 1673
    .line 1674
    :sswitch_11
    long-to-int v4, v8

    .line 1675
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1676
    .line 1677
    .line 1678
    if-eqz v4, :cond_4a

    .line 1679
    .line 1680
    const/4 v5, 0x1

    .line 1681
    if-eq v4, v5, :cond_49

    .line 1682
    .line 1683
    const/4 v5, 0x3

    .line 1684
    if-eq v4, v5, :cond_48

    .line 1685
    .line 1686
    const/16 v6, 0xf

    .line 1687
    .line 1688
    if-eq v4, v6, :cond_47

    .line 1689
    .line 1690
    goto/16 :goto_29

    .line 1691
    .line 1692
    :cond_47
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1693
    .line 1694
    iput v5, v3, Li4/d$b;->w:I

    .line 1695
    .line 1696
    goto/16 :goto_29

    .line 1697
    .line 1698
    :cond_48
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1699
    .line 1700
    const/4 v4, 0x1

    .line 1701
    goto :goto_26

    .line 1702
    :cond_49
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1703
    .line 1704
    const/4 v4, 0x2

    .line 1705
    goto :goto_26

    .line 1706
    :cond_4a
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1707
    .line 1708
    const/4 v4, 0x0

    .line 1709
    :goto_26
    iput v4, v3, Li4/d$b;->w:I

    .line 1710
    .line 1711
    goto/16 :goto_29

    .line 1712
    .line 1713
    :sswitch_12
    iget-wide v4, v3, Li4/d;->q:J

    .line 1714
    .line 1715
    add-long/2addr v8, v4

    .line 1716
    iput-wide v8, v3, Li4/d;->x:J

    .line 1717
    .line 1718
    goto/16 :goto_29

    .line 1719
    .line 1720
    :sswitch_13
    const-wide/16 v3, 0x1

    .line 1721
    .line 1722
    cmp-long v3, v8, v3

    .line 1723
    .line 1724
    if-nez v3, :cond_4b

    .line 1725
    .line 1726
    goto/16 :goto_29

    .line 1727
    .line 1728
    :cond_4b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1729
    .line 1730
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1731
    .line 1732
    .line 1733
    const-string v2, "AESSettingsCipherMode "

    .line 1734
    .line 1735
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v1

    .line 1748
    const/4 v2, 0x0

    .line 1749
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    throw v1

    .line 1754
    :sswitch_14
    const-wide/16 v3, 0x5

    .line 1755
    .line 1756
    cmp-long v3, v8, v3

    .line 1757
    .line 1758
    if-nez v3, :cond_4c

    .line 1759
    .line 1760
    goto/16 :goto_29

    .line 1761
    .line 1762
    :cond_4c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1763
    .line 1764
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1765
    .line 1766
    .line 1767
    const-string v2, "ContentEncAlgo "

    .line 1768
    .line 1769
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v1

    .line 1782
    const/4 v2, 0x0

    .line 1783
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v1

    .line 1787
    throw v1

    .line 1788
    :sswitch_15
    const-wide/16 v3, 0x1

    .line 1789
    .line 1790
    cmp-long v3, v8, v3

    .line 1791
    .line 1792
    if-nez v3, :cond_4d

    .line 1793
    .line 1794
    goto/16 :goto_29

    .line 1795
    .line 1796
    :cond_4d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1797
    .line 1798
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1799
    .line 1800
    .line 1801
    const-string v2, "EBMLReadVersion "

    .line 1802
    .line 1803
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v1

    .line 1816
    const/4 v2, 0x0

    .line 1817
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v1

    .line 1821
    throw v1

    .line 1822
    :sswitch_16
    const-wide/16 v3, 0x1

    .line 1823
    .line 1824
    cmp-long v3, v8, v3

    .line 1825
    .line 1826
    if-ltz v3, :cond_4e

    .line 1827
    .line 1828
    const-wide/16 v3, 0x2

    .line 1829
    .line 1830
    cmp-long v3, v8, v3

    .line 1831
    .line 1832
    if-gtz v3, :cond_4e

    .line 1833
    .line 1834
    goto/16 :goto_29

    .line 1835
    .line 1836
    :cond_4e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1837
    .line 1838
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1839
    .line 1840
    .line 1841
    const-string v2, "DocTypeReadVersion "

    .line 1842
    .line 1843
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v1

    .line 1856
    const/4 v2, 0x0

    .line 1857
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    throw v1

    .line 1862
    :sswitch_17
    const-wide/16 v3, 0x3

    .line 1863
    .line 1864
    cmp-long v3, v8, v3

    .line 1865
    .line 1866
    if-nez v3, :cond_4f

    .line 1867
    .line 1868
    goto/16 :goto_29

    .line 1869
    .line 1870
    :cond_4f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1871
    .line 1872
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1873
    .line 1874
    .line 1875
    const-string v2, "ContentCompAlgo "

    .line 1876
    .line 1877
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1878
    .line 1879
    .line 1880
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    const/4 v2, 0x0

    .line 1891
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v1

    .line 1895
    throw v1

    .line 1896
    :sswitch_18
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1897
    .line 1898
    .line 1899
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1900
    .line 1901
    long-to-int v4, v8

    .line 1902
    iput v4, v3, Li4/d$b;->g:I

    .line 1903
    .line 1904
    goto/16 :goto_29

    .line 1905
    .line 1906
    :sswitch_19
    const/4 v4, 0x1

    .line 1907
    iput-boolean v4, v3, Li4/d;->Q:Z

    .line 1908
    .line 1909
    goto/16 :goto_29

    .line 1910
    .line 1911
    :sswitch_1a
    const/4 v4, 0x1

    .line 1912
    iget-boolean v5, v3, Li4/d;->E:Z

    .line 1913
    .line 1914
    if-nez v5, :cond_62

    .line 1915
    .line 1916
    invoke-virtual {v3, v6}, Li4/d;->a(I)V

    .line 1917
    .line 1918
    .line 1919
    iget-object v5, v3, Li4/d;->D:Lv5/n;

    .line 1920
    .line 1921
    invoke-virtual {v5, v8, v9}, Lv5/n;->a(J)V

    .line 1922
    .line 1923
    .line 1924
    iput-boolean v4, v3, Li4/d;->E:Z

    .line 1925
    .line 1926
    goto/16 :goto_29

    .line 1927
    .line 1928
    :sswitch_1b
    long-to-int v4, v8

    .line 1929
    iput v4, v3, Li4/d;->P:I

    .line 1930
    .line 1931
    goto/16 :goto_29

    .line 1932
    .line 1933
    :sswitch_1c
    invoke-virtual {v3, v8, v9}, Li4/d;->k(J)J

    .line 1934
    .line 1935
    .line 1936
    move-result-wide v4

    .line 1937
    iput-wide v4, v3, Li4/d;->B:J

    .line 1938
    .line 1939
    goto/16 :goto_29

    .line 1940
    .line 1941
    :sswitch_1d
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1942
    .line 1943
    .line 1944
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1945
    .line 1946
    long-to-int v4, v8

    .line 1947
    iput v4, v3, Li4/d$b;->c:I

    .line 1948
    .line 1949
    goto/16 :goto_29

    .line 1950
    .line 1951
    :sswitch_1e
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1952
    .line 1953
    .line 1954
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1955
    .line 1956
    long-to-int v4, v8

    .line 1957
    iput v4, v3, Li4/d$b;->n:I

    .line 1958
    .line 1959
    goto/16 :goto_29

    .line 1960
    .line 1961
    :sswitch_1f
    invoke-virtual {v3, v6}, Li4/d;->a(I)V

    .line 1962
    .line 1963
    .line 1964
    iget-object v4, v3, Li4/d;->C:Lv5/n;

    .line 1965
    .line 1966
    invoke-virtual {v3, v8, v9}, Li4/d;->k(J)J

    .line 1967
    .line 1968
    .line 1969
    move-result-wide v5

    .line 1970
    invoke-virtual {v4, v5, v6}, Lv5/n;->a(J)V

    .line 1971
    .line 1972
    .line 1973
    goto/16 :goto_29

    .line 1974
    .line 1975
    :sswitch_20
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1976
    .line 1977
    .line 1978
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1979
    .line 1980
    long-to-int v4, v8

    .line 1981
    iput v4, v3, Li4/d$b;->m:I

    .line 1982
    .line 1983
    goto/16 :goto_29

    .line 1984
    .line 1985
    :sswitch_21
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 1986
    .line 1987
    .line 1988
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 1989
    .line 1990
    long-to-int v4, v8

    .line 1991
    iput v4, v3, Li4/d$b;->O:I

    .line 1992
    .line 1993
    goto/16 :goto_29

    .line 1994
    .line 1995
    :sswitch_22
    invoke-virtual {v3, v8, v9}, Li4/d;->k(J)J

    .line 1996
    .line 1997
    .line 1998
    move-result-wide v4

    .line 1999
    iput-wide v4, v3, Li4/d;->I:J

    .line 2000
    .line 2001
    goto/16 :goto_29

    .line 2002
    .line 2003
    :sswitch_23
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2004
    .line 2005
    .line 2006
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2007
    .line 2008
    const-wide/16 v4, 0x1

    .line 2009
    .line 2010
    cmp-long v4, v8, v4

    .line 2011
    .line 2012
    if-nez v4, :cond_50

    .line 2013
    .line 2014
    const/4 v4, 0x1

    .line 2015
    goto :goto_27

    .line 2016
    :cond_50
    const/4 v4, 0x0

    .line 2017
    :goto_27
    iput-boolean v4, v3, Li4/d$b;->V:Z

    .line 2018
    .line 2019
    goto/16 :goto_29

    .line 2020
    .line 2021
    :sswitch_24
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2022
    .line 2023
    .line 2024
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2025
    .line 2026
    long-to-int v4, v8

    .line 2027
    iput v4, v3, Li4/d$b;->d:I

    .line 2028
    .line 2029
    goto/16 :goto_29

    .line 2030
    .line 2031
    :pswitch_d
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2032
    .line 2033
    .line 2034
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2035
    .line 2036
    long-to-int v4, v8

    .line 2037
    iput v4, v3, Li4/d$b;->C:I

    .line 2038
    .line 2039
    goto/16 :goto_29

    .line 2040
    .line 2041
    :pswitch_e
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2042
    .line 2043
    .line 2044
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2045
    .line 2046
    long-to-int v4, v8

    .line 2047
    iput v4, v3, Li4/d$b;->B:I

    .line 2048
    .line 2049
    goto/16 :goto_29

    .line 2050
    .line 2051
    :pswitch_f
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2052
    .line 2053
    .line 2054
    iget-object v4, v3, Li4/d;->u:Li4/d$b;

    .line 2055
    .line 2056
    const/4 v5, 0x1

    .line 2057
    iput-boolean v5, v4, Li4/d$b;->x:Z

    .line 2058
    .line 2059
    long-to-int v4, v8

    .line 2060
    invoke-static {v4}, Lw5/b;->a(I)I

    .line 2061
    .line 2062
    .line 2063
    move-result v4

    .line 2064
    const/4 v5, -0x1

    .line 2065
    if-eq v4, v5, :cond_62

    .line 2066
    .line 2067
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2068
    .line 2069
    iput v4, v3, Li4/d$b;->y:I

    .line 2070
    .line 2071
    goto/16 :goto_29

    .line 2072
    .line 2073
    :pswitch_10
    const/4 v4, -0x1

    .line 2074
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2075
    .line 2076
    .line 2077
    long-to-int v5, v8

    .line 2078
    invoke-static {v5}, Lw5/b;->b(I)I

    .line 2079
    .line 2080
    .line 2081
    move-result v5

    .line 2082
    if-eq v5, v4, :cond_62

    .line 2083
    .line 2084
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2085
    .line 2086
    iput v5, v3, Li4/d$b;->z:I

    .line 2087
    .line 2088
    goto/16 :goto_29

    .line 2089
    .line 2090
    :pswitch_11
    invoke-virtual {v3, v6}, Li4/d;->c(I)V

    .line 2091
    .line 2092
    .line 2093
    long-to-int v4, v8

    .line 2094
    const/4 v5, 0x1

    .line 2095
    const/4 v6, 0x2

    .line 2096
    if-eq v4, v5, :cond_52

    .line 2097
    .line 2098
    if-eq v4, v6, :cond_51

    .line 2099
    .line 2100
    goto/16 :goto_29

    .line 2101
    .line 2102
    :cond_51
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2103
    .line 2104
    iput v5, v3, Li4/d$b;->A:I

    .line 2105
    .line 2106
    goto/16 :goto_29

    .line 2107
    .line 2108
    :cond_52
    iget-object v3, v3, Li4/d;->u:Li4/d$b;

    .line 2109
    .line 2110
    iput v6, v3, Li4/d$b;->A:I

    .line 2111
    .line 2112
    goto/16 :goto_29

    .line 2113
    .line 2114
    :cond_53
    const-wide/16 v3, 0x1

    .line 2115
    .line 2116
    cmp-long v3, v8, v3

    .line 2117
    .line 2118
    if-nez v3, :cond_54

    .line 2119
    .line 2120
    goto/16 :goto_29

    .line 2121
    .line 2122
    :cond_54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2123
    .line 2124
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2125
    .line 2126
    .line 2127
    const-string v2, "ContentEncodingScope "

    .line 2128
    .line 2129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2133
    .line 2134
    .line 2135
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2136
    .line 2137
    .line 2138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v1

    .line 2142
    const/4 v2, 0x0

    .line 2143
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v1

    .line 2147
    throw v1

    .line 2148
    :cond_55
    const-wide/16 v3, 0x0

    .line 2149
    .line 2150
    cmp-long v3, v8, v3

    .line 2151
    .line 2152
    if-nez v3, :cond_56

    .line 2153
    .line 2154
    goto/16 :goto_29

    .line 2155
    .line 2156
    :cond_56
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2157
    .line 2158
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2159
    .line 2160
    .line 2161
    const-string v2, "ContentEncodingOrder "

    .line 2162
    .line 2163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2164
    .line 2165
    .line 2166
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2167
    .line 2168
    .line 2169
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2170
    .line 2171
    .line 2172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v1

    .line 2176
    const/4 v2, 0x0

    .line 2177
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v1

    .line 2181
    throw v1

    .line 2182
    :cond_57
    const/4 v1, 0x0

    .line 2183
    const-string v2, "Invalid integer size: "

    .line 2184
    .line 2185
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v2

    .line 2189
    iget-wide v3, v7, Li4/a;->g:J

    .line 2190
    .line 2191
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v2

    .line 2198
    invoke-static {v2, v1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v1

    .line 2202
    throw v1

    .line 2203
    :cond_58
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 2204
    .line 2205
    .line 2206
    move-result-wide v3

    .line 2207
    iget-wide v5, v7, Li4/a;->g:J

    .line 2208
    .line 2209
    add-long/2addr v5, v3

    .line 2210
    iget-object v8, v7, Li4/a;->b:Ljava/util/ArrayDeque;

    .line 2211
    .line 2212
    new-instance v9, Li4/a$a;

    .line 2213
    .line 2214
    iget v10, v7, Li4/a;->f:I

    .line 2215
    .line 2216
    invoke-direct {v9, v10, v5, v6}, Li4/a$a;-><init>(IJ)V

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v8, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2220
    .line 2221
    .line 2222
    iget-object v5, v7, Li4/a;->d:Li4/b;

    .line 2223
    .line 2224
    iget v6, v7, Li4/a;->f:I

    .line 2225
    .line 2226
    iget-wide v8, v7, Li4/a;->g:J

    .line 2227
    .line 2228
    check-cast v5, Li4/d$a;

    .line 2229
    .line 2230
    iget-object v5, v5, Li4/d$a;->a:Li4/d;

    .line 2231
    .line 2232
    iget-object v10, v5, Li4/d;->b0:Lc4/j;

    .line 2233
    .line 2234
    invoke-static {v10}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 2235
    .line 2236
    .line 2237
    const/16 v10, 0xa0

    .line 2238
    .line 2239
    if-eq v6, v10, :cond_65

    .line 2240
    .line 2241
    const/16 v10, 0xae

    .line 2242
    .line 2243
    if-eq v6, v10, :cond_64

    .line 2244
    .line 2245
    const/16 v10, 0xbb

    .line 2246
    .line 2247
    if-eq v6, v10, :cond_63

    .line 2248
    .line 2249
    const/16 v10, 0x4dbb

    .line 2250
    .line 2251
    if-eq v6, v10, :cond_61

    .line 2252
    .line 2253
    const/16 v10, 0x5035

    .line 2254
    .line 2255
    if-eq v6, v10, :cond_60

    .line 2256
    .line 2257
    const/16 v10, 0x55d0

    .line 2258
    .line 2259
    if-eq v6, v10, :cond_5f

    .line 2260
    .line 2261
    const v10, 0x18538067

    .line 2262
    .line 2263
    .line 2264
    if-eq v6, v10, :cond_5c

    .line 2265
    .line 2266
    const v3, 0x1c53bb6b

    .line 2267
    .line 2268
    .line 2269
    if-eq v6, v3, :cond_5b

    .line 2270
    .line 2271
    const v3, 0x1f43b675

    .line 2272
    .line 2273
    .line 2274
    if-eq v6, v3, :cond_59

    .line 2275
    .line 2276
    goto :goto_29

    .line 2277
    :cond_59
    iget-boolean v3, v5, Li4/d;->v:Z

    .line 2278
    .line 2279
    if-nez v3, :cond_62

    .line 2280
    .line 2281
    iget-boolean v3, v5, Li4/d;->d:Z

    .line 2282
    .line 2283
    if-eqz v3, :cond_5a

    .line 2284
    .line 2285
    iget-wide v3, v5, Li4/d;->z:J

    .line 2286
    .line 2287
    const-wide/16 v8, -0x1

    .line 2288
    .line 2289
    cmp-long v3, v3, v8

    .line 2290
    .line 2291
    if-eqz v3, :cond_5a

    .line 2292
    .line 2293
    const/4 v3, 0x1

    .line 2294
    iput-boolean v3, v5, Li4/d;->y:Z

    .line 2295
    .line 2296
    goto :goto_29

    .line 2297
    :cond_5a
    const/4 v3, 0x1

    .line 2298
    iget-object v4, v5, Li4/d;->b0:Lc4/j;

    .line 2299
    .line 2300
    new-instance v6, Lc4/t$b;

    .line 2301
    .line 2302
    iget-wide v8, v5, Li4/d;->t:J

    .line 2303
    .line 2304
    invoke-direct {v6, v8, v9}, Lc4/t$b;-><init>(J)V

    .line 2305
    .line 2306
    .line 2307
    invoke-interface {v4, v6}, Lc4/j;->t(Lc4/t;)V

    .line 2308
    .line 2309
    .line 2310
    iput-boolean v3, v5, Li4/d;->v:Z

    .line 2311
    .line 2312
    goto :goto_29

    .line 2313
    :cond_5b
    new-instance v3, Lv5/n;

    .line 2314
    .line 2315
    invoke-direct {v3}, Lv5/n;-><init>()V

    .line 2316
    .line 2317
    .line 2318
    iput-object v3, v5, Li4/d;->C:Lv5/n;

    .line 2319
    .line 2320
    new-instance v3, Lv5/n;

    .line 2321
    .line 2322
    invoke-direct {v3}, Lv5/n;-><init>()V

    .line 2323
    .line 2324
    .line 2325
    iput-object v3, v5, Li4/d;->D:Lv5/n;

    .line 2326
    .line 2327
    goto :goto_29

    .line 2328
    :cond_5c
    iget-wide v10, v5, Li4/d;->q:J

    .line 2329
    .line 2330
    const-wide/16 v12, -0x1

    .line 2331
    .line 2332
    cmp-long v6, v10, v12

    .line 2333
    .line 2334
    if-eqz v6, :cond_5e

    .line 2335
    .line 2336
    cmp-long v6, v10, v3

    .line 2337
    .line 2338
    if-nez v6, :cond_5d

    .line 2339
    .line 2340
    goto :goto_28

    .line 2341
    :cond_5d
    const-string v1, "Multiple Segment elements not supported"

    .line 2342
    .line 2343
    const/4 v2, 0x0

    .line 2344
    invoke-static {v1, v2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v1

    .line 2348
    throw v1

    .line 2349
    :cond_5e
    :goto_28
    iput-wide v3, v5, Li4/d;->q:J

    .line 2350
    .line 2351
    iput-wide v8, v5, Li4/d;->p:J

    .line 2352
    .line 2353
    goto :goto_29

    .line 2354
    :cond_5f
    invoke-virtual {v5, v6}, Li4/d;->c(I)V

    .line 2355
    .line 2356
    .line 2357
    iget-object v3, v5, Li4/d;->u:Li4/d$b;

    .line 2358
    .line 2359
    const/4 v4, 0x1

    .line 2360
    iput-boolean v4, v3, Li4/d$b;->x:Z

    .line 2361
    .line 2362
    goto :goto_29

    .line 2363
    :cond_60
    const/4 v3, 0x1

    .line 2364
    invoke-virtual {v5, v6}, Li4/d;->c(I)V

    .line 2365
    .line 2366
    .line 2367
    iget-object v4, v5, Li4/d;->u:Li4/d$b;

    .line 2368
    .line 2369
    iput-boolean v3, v4, Li4/d$b;->h:Z

    .line 2370
    .line 2371
    goto :goto_29

    .line 2372
    :cond_61
    const/4 v3, -0x1

    .line 2373
    iput v3, v5, Li4/d;->w:I

    .line 2374
    .line 2375
    const-wide/16 v3, -0x1

    .line 2376
    .line 2377
    iput-wide v3, v5, Li4/d;->x:J

    .line 2378
    .line 2379
    :cond_62
    :goto_29
    const/4 v3, 0x0

    .line 2380
    goto :goto_2a

    .line 2381
    :cond_63
    const/4 v3, 0x0

    .line 2382
    iput-boolean v3, v5, Li4/d;->E:Z

    .line 2383
    .line 2384
    goto :goto_2a

    .line 2385
    :cond_64
    const/4 v3, 0x0

    .line 2386
    new-instance v4, Li4/d$b;

    .line 2387
    .line 2388
    invoke-direct {v4}, Li4/d$b;-><init>()V

    .line 2389
    .line 2390
    .line 2391
    iput-object v4, v5, Li4/d;->u:Li4/d$b;

    .line 2392
    .line 2393
    goto :goto_2a

    .line 2394
    :cond_65
    const/4 v3, 0x0

    .line 2395
    iput-boolean v3, v5, Li4/d;->Q:Z

    .line 2396
    .line 2397
    const-wide/16 v8, 0x0

    .line 2398
    .line 2399
    iput-wide v8, v5, Li4/d;->R:J

    .line 2400
    .line 2401
    :goto_2a
    iput v3, v7, Li4/a;->e:I

    .line 2402
    .line 2403
    const/4 v4, 0x1

    .line 2404
    :goto_2b
    if-eqz v4, :cond_68

    .line 2405
    .line 2406
    invoke-interface/range {p1 .. p1}, Lc4/i;->getPosition()J

    .line 2407
    .line 2408
    .line 2409
    move-result-wide v5

    .line 2410
    iget-boolean v7, v0, Li4/d;->y:Z

    .line 2411
    .line 2412
    if-eqz v7, :cond_66

    .line 2413
    .line 2414
    iput-wide v5, v0, Li4/d;->A:J

    .line 2415
    .line 2416
    iget-wide v5, v0, Li4/d;->z:J

    .line 2417
    .line 2418
    iput-wide v5, v2, Lc4/s;->a:J

    .line 2419
    .line 2420
    iput-boolean v3, v0, Li4/d;->y:Z

    .line 2421
    .line 2422
    goto :goto_2c

    .line 2423
    :cond_66
    iget-boolean v3, v0, Li4/d;->v:Z

    .line 2424
    .line 2425
    if-eqz v3, :cond_67

    .line 2426
    .line 2427
    iget-wide v5, v0, Li4/d;->A:J

    .line 2428
    .line 2429
    const-wide/16 v7, -0x1

    .line 2430
    .line 2431
    cmp-long v3, v5, v7

    .line 2432
    .line 2433
    if-eqz v3, :cond_67

    .line 2434
    .line 2435
    iput-wide v5, v2, Lc4/s;->a:J

    .line 2436
    .line 2437
    iput-wide v7, v0, Li4/d;->A:J

    .line 2438
    .line 2439
    :goto_2c
    const/4 v3, 0x1

    .line 2440
    goto :goto_2d

    .line 2441
    :cond_67
    const/4 v3, 0x0

    .line 2442
    :goto_2d
    if-eqz v3, :cond_68

    .line 2443
    .line 2444
    const/4 v1, 0x1

    .line 2445
    return v1

    .line 2446
    :cond_68
    const/4 v5, 0x1

    .line 2447
    const/4 v3, 0x0

    .line 2448
    goto/16 :goto_0

    .line 2449
    .line 2450
    :cond_69
    iget-wide v3, v7, Li4/a;->g:J

    .line 2451
    .line 2452
    long-to-int v3, v3

    .line 2453
    invoke-interface {v1, v3}, Lc4/i;->j(I)V

    .line 2454
    .line 2455
    .line 2456
    const/4 v3, 0x0

    .line 2457
    iput v3, v7, Li4/a;->e:I

    .line 2458
    .line 2459
    const/4 v6, -0x1

    .line 2460
    goto/16 :goto_1

    .line 2461
    .line 2462
    :cond_6a
    if-nez v4, :cond_6d

    .line 2463
    .line 2464
    const/4 v1, 0x0

    .line 2465
    :goto_2e
    iget-object v2, v0, Li4/d;->c:Landroid/util/SparseArray;

    .line 2466
    .line 2467
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 2468
    .line 2469
    .line 2470
    move-result v2

    .line 2471
    if-ge v1, v2, :cond_6c

    .line 2472
    .line 2473
    iget-object v2, v0, Li4/d;->c:Landroid/util/SparseArray;

    .line 2474
    .line 2475
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v2

    .line 2479
    check-cast v2, Li4/d$b;

    .line 2480
    .line 2481
    iget-object v3, v2, Li4/d$b;->X:Lc4/v;

    .line 2482
    .line 2483
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2484
    .line 2485
    .line 2486
    iget-object v3, v2, Li4/d$b;->T:Lc4/w;

    .line 2487
    .line 2488
    if-eqz v3, :cond_6b

    .line 2489
    .line 2490
    iget-object v4, v2, Li4/d$b;->X:Lc4/v;

    .line 2491
    .line 2492
    iget-object v2, v2, Li4/d$b;->j:Lc4/v$a;

    .line 2493
    .line 2494
    invoke-virtual {v3, v4, v2}, Lc4/w;->a(Lc4/v;Lc4/v$a;)V

    .line 2495
    .line 2496
    .line 2497
    :cond_6b
    add-int/lit8 v1, v1, 0x1

    .line 2498
    .line 2499
    goto :goto_2e

    .line 2500
    :cond_6c
    const/4 v1, -0x1

    .line 2501
    return v1

    .line 2502
    :cond_6d
    const/4 v1, 0x0

    .line 2503
    return v1

    .line 2504
    nop

    .line 2505
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x75a2 -> :sswitch_4
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x55d1
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

    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x83 -> :sswitch_24
        0x88 -> :sswitch_23
        0x9b -> :sswitch_22
        0x9f -> :sswitch_21
        0xb0 -> :sswitch_20
        0xb3 -> :sswitch_1f
        0xba -> :sswitch_1e
        0xd7 -> :sswitch_1d
        0xe7 -> :sswitch_1c
        0xee -> :sswitch_1b
        0xf1 -> :sswitch_1a
        0xfb -> :sswitch_19
        0x41e7 -> :sswitch_18
        0x4254 -> :sswitch_17
        0x4285 -> :sswitch_16
        0x42f7 -> :sswitch_15
        0x47e1 -> :sswitch_14
        0x47e8 -> :sswitch_13
        0x53ac -> :sswitch_12
        0x53b8 -> :sswitch_11
        0x54b0 -> :sswitch_10
        0x54b2 -> :sswitch_f
        0x54ba -> :sswitch_e
        0x55aa -> :sswitch_d
        0x55ee -> :sswitch_c
        0x56aa -> :sswitch_b
        0x56bb -> :sswitch_a
        0x6264 -> :sswitch_9
        0x75a2 -> :sswitch_8
        0x7671 -> :sswitch_7
        0x23e383 -> :sswitch_6
        0x2ad7b1 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55b9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public final e(Li4/d$b;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Li4/d$b;->T:Lc4/w;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v3, v1, Li4/d$b;->X:Lc4/v;

    .line 11
    .line 12
    iget-object v8, v1, Li4/d$b;->j:Lc4/v$a;

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    move-object v2, v3

    .line 16
    move-wide/from16 v3, p2

    .line 17
    .line 18
    move/from16 v5, p4

    .line 19
    .line 20
    move/from16 v6, p5

    .line 21
    .line 22
    move/from16 v7, p6

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lc4/w;->b(Lc4/v;JIIILc4/v$a;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Li4/d$b;->b:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x0

    .line 38
    const-string v5, "S_TEXT/WEBVTT"

    .line 39
    .line 40
    const-string v6, "S_TEXT/ASS"

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-object v2, v1, Li4/d$b;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    iget-object v2, v1, Li4/d$b;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    :cond_1
    iget v2, v0, Li4/d;->K:I

    .line 62
    .line 63
    if-le v2, v9, :cond_2

    .line 64
    .line 65
    const-string v2, "Skipping subtitle sample in laced block."

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-wide v10, v0, Li4/d;->I:J

    .line 69
    .line 70
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    cmp-long v2, v10, v12

    .line 76
    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    const-string v2, "Skipping subtitle sample with no duration."

    .line 80
    .line 81
    :goto_0
    const-string v3, "MatroskaExtractor"

    .line 82
    .line 83
    invoke-static {v3, v2}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    move/from16 v2, p5

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    iget-object v2, v1, Li4/d$b;->b:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v8, v0, Li4/d;->k:Lv5/u;

    .line 93
    .line 94
    iget-object v8, v8, Lv5/u;->a:[B

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    const/4 v13, -0x1

    .line 104
    const v14, 0x2c0618eb

    .line 105
    .line 106
    .line 107
    if-eq v12, v14, :cond_9

    .line 108
    .line 109
    const v6, 0x3e4ca2d8

    .line 110
    .line 111
    .line 112
    if-eq v12, v6, :cond_7

    .line 113
    .line 114
    const v5, 0x54c61e47

    .line 115
    .line 116
    .line 117
    if-eq v12, v5, :cond_5

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_6
    move v13, v7

    .line 128
    goto :goto_1

    .line 129
    :cond_7
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_8

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    move v13, v9

    .line 137
    goto :goto_1

    .line 138
    :cond_9
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_a
    move v13, v4

    .line 146
    :goto_1
    const-wide/16 v2, 0x3e8

    .line 147
    .line 148
    if-eqz v13, :cond_d

    .line 149
    .line 150
    if-eq v13, v9, :cond_c

    .line 151
    .line 152
    if-ne v13, v7, :cond_b

    .line 153
    .line 154
    const-string v5, "%02d:%02d:%02d,%03d"

    .line 155
    .line 156
    invoke-static {v10, v11, v2, v3, v5}, Li4/d;->g(JJLjava/lang/String;)[B

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v3, 0x13

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :cond_c
    const-string v5, "%02d:%02d:%02d.%03d"

    .line 170
    .line 171
    invoke-static {v10, v11, v2, v3, v5}, Li4/d;->g(JJLjava/lang/String;)[B

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    const/16 v3, 0x19

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_d
    const-wide/16 v2, 0x2710

    .line 179
    .line 180
    const-string v5, "%01d:%02d:%02d:%02d"

    .line 181
    .line 182
    invoke-static {v10, v11, v2, v3, v5}, Li4/d;->g(JJLjava/lang/String;)[B

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/16 v3, 0x15

    .line 187
    .line 188
    :goto_2
    array-length v5, v2

    .line 189
    invoke-static {v2, v4, v8, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    .line 191
    .line 192
    iget-object v2, v0, Li4/d;->k:Lv5/u;

    .line 193
    .line 194
    iget v2, v2, Lv5/u;->b:I

    .line 195
    .line 196
    :goto_3
    iget-object v3, v0, Li4/d;->k:Lv5/u;

    .line 197
    .line 198
    iget v5, v3, Lv5/u;->c:I

    .line 199
    .line 200
    if-ge v2, v5, :cond_f

    .line 201
    .line 202
    iget-object v5, v3, Lv5/u;->a:[B

    .line 203
    .line 204
    aget-byte v5, v5, v2

    .line 205
    .line 206
    if-nez v5, :cond_e

    .line 207
    .line 208
    invoke-virtual {v3, v2}, Lv5/u;->F(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_f
    :goto_4
    iget-object v2, v1, Li4/d$b;->X:Lc4/v;

    .line 216
    .line 217
    iget-object v3, v0, Li4/d;->k:Lv5/u;

    .line 218
    .line 219
    iget v5, v3, Lv5/u;->c:I

    .line 220
    .line 221
    invoke-interface {v2, v5, v3}, Lc4/v;->b(ILv5/u;)V

    .line 222
    .line 223
    .line 224
    iget-object v2, v0, Li4/d;->k:Lv5/u;

    .line 225
    .line 226
    iget v2, v2, Lv5/u;->c:I

    .line 227
    .line 228
    add-int v2, p5, v2

    .line 229
    .line 230
    :goto_5
    const/high16 v3, 0x10000000

    .line 231
    .line 232
    and-int v3, p4, v3

    .line 233
    .line 234
    if-eqz v3, :cond_11

    .line 235
    .line 236
    iget v3, v0, Li4/d;->K:I

    .line 237
    .line 238
    if-le v3, v9, :cond_10

    .line 239
    .line 240
    iget-object v3, v0, Li4/d;->n:Lv5/u;

    .line 241
    .line 242
    invoke-virtual {v3, v4}, Lv5/u;->D(I)V

    .line 243
    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_10
    iget-object v3, v0, Li4/d;->n:Lv5/u;

    .line 247
    .line 248
    iget v4, v3, Lv5/u;->c:I

    .line 249
    .line 250
    iget-object v5, v1, Li4/d$b;->X:Lc4/v;

    .line 251
    .line 252
    invoke-interface {v5, v4, v3}, Lc4/v;->a(ILv5/u;)V

    .line 253
    .line 254
    .line 255
    add-int/2addr v2, v4

    .line 256
    :cond_11
    :goto_6
    move v14, v2

    .line 257
    iget-object v10, v1, Li4/d$b;->X:Lc4/v;

    .line 258
    .line 259
    iget-object v1, v1, Li4/d$b;->j:Lc4/v$a;

    .line 260
    .line 261
    move-wide/from16 v11, p2

    .line 262
    .line 263
    move/from16 v13, p4

    .line 264
    .line 265
    move/from16 v15, p6

    .line 266
    .line 267
    move-object/from16 v16, v1

    .line 268
    .line 269
    invoke-interface/range {v10 .. v16}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 270
    .line 271
    .line 272
    :goto_7
    iput-boolean v9, v0, Li4/d;->F:Z

    .line 273
    .line 274
    return-void
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

.method public final f(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Li4/d;->B:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Li4/d;->G:I

    .line 10
    .line 11
    iget-object p2, p0, Li4/d;->a:Li4/c;

    .line 12
    .line 13
    check-cast p2, Li4/a;

    .line 14
    .line 15
    iput p1, p2, Li4/a;->e:I

    .line 16
    .line 17
    iget-object p3, p2, Li4/a;->b:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object p2, p2, Li4/a;->c:Li4/e;

    .line 23
    .line 24
    iput p1, p2, Li4/e;->b:I

    .line 25
    .line 26
    iput p1, p2, Li4/e;->c:I

    .line 27
    .line 28
    iget-object p2, p0, Li4/d;->b:Li4/e;

    .line 29
    .line 30
    iput p1, p2, Li4/e;->b:I

    .line 31
    .line 32
    iput p1, p2, Li4/e;->c:I

    .line 33
    .line 34
    invoke-virtual {p0}, Li4/d;->j()V

    .line 35
    .line 36
    .line 37
    move p2, p1

    .line 38
    :goto_0
    iget-object p3, p0, Li4/d;->c:Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-ge p2, p3, :cond_1

    .line 45
    .line 46
    iget-object p3, p0, Li4/d;->c:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    check-cast p3, Li4/d$b;

    .line 53
    .line 54
    iget-object p3, p3, Li4/d$b;->T:Lc4/w;

    .line 55
    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    iput-boolean p1, p3, Lc4/w;->b:Z

    .line 59
    .line 60
    iput p1, p3, Lc4/w;->c:I

    .line 61
    .line 62
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-void
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

.method public final h(Lc4/i;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Li4/d;->g:Lv5/u;

    .line 2
    .line 3
    iget v1, v0, Lv5/u;->c:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, Lv5/u;->a:[B

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lv5/u;->a(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Li4/d;->g:Lv5/u;

    .line 24
    .line 25
    iget-object v1, v0, Lv5/u;->a:[B

    .line 26
    .line 27
    iget v0, v0, Lv5/u;->c:I

    .line 28
    .line 29
    sub-int v2, p2, v0

    .line 30
    .line 31
    invoke-interface {p1, v1, v0, v2}, Lc4/i;->readFully([BII)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Li4/d;->g:Lv5/u;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lv5/u;->F(I)V

    .line 37
    .line 38
    .line 39
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

.method public final i(Lc4/i;)Z
    .locals 14

    .line 1
    new-instance v0, Ld0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/c;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc4/e;

    .line 7
    .line 8
    iget-wide v1, p1, Lc4/e;->c:J

    .line 9
    .line 10
    const-wide/16 v3, -0x1

    .line 11
    .line 12
    cmp-long v3, v1, v3

    .line 13
    .line 14
    const-wide/16 v4, 0x400

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    cmp-long v6, v1, v4

    .line 19
    .line 20
    if-lez v6, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide v4, v1

    .line 24
    :cond_1
    :goto_0
    long-to-int v4, v4

    .line 25
    iget-object v5, v0, Ld0/c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Lv5/u;

    .line 28
    .line 29
    iget-object v5, v5, Lv5/u;->a:[B

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-virtual {p1, v5, v7, v6, v7}, Lc4/e;->c([BIIZ)Z

    .line 34
    .line 35
    .line 36
    iget-object v5, v0, Ld0/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Lv5/u;

    .line 39
    .line 40
    invoke-virtual {v5}, Lv5/u;->w()J

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    iput v6, v0, Ld0/c;->a:I

    .line 45
    .line 46
    :goto_1
    const-wide/32 v5, 0x1a45dfa3

    .line 47
    .line 48
    .line 49
    cmp-long v5, v8, v5

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    iget v5, v0, Ld0/c;->a:I

    .line 55
    .line 56
    add-int/2addr v5, v6

    .line 57
    iput v5, v0, Ld0/c;->a:I

    .line 58
    .line 59
    if-ne v5, v4, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    iget-object v5, v0, Ld0/c;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Lv5/u;

    .line 65
    .line 66
    iget-object v5, v5, Lv5/u;->a:[B

    .line 67
    .line 68
    invoke-virtual {p1, v5, v7, v6, v7}, Lc4/e;->c([BIIZ)Z

    .line 69
    .line 70
    .line 71
    const/16 v5, 0x8

    .line 72
    .line 73
    shl-long v5, v8, v5

    .line 74
    .line 75
    const-wide/16 v8, -0x100

    .line 76
    .line 77
    and-long/2addr v5, v8

    .line 78
    iget-object v8, v0, Ld0/c;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, Lv5/u;

    .line 81
    .line 82
    iget-object v8, v8, Lv5/u;->a:[B

    .line 83
    .line 84
    aget-byte v8, v8, v7

    .line 85
    .line 86
    and-int/lit16 v8, v8, 0xff

    .line 87
    .line 88
    int-to-long v8, v8

    .line 89
    or-long/2addr v8, v5

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v0, p1}, Ld0/c;->b(Lc4/e;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    iget v8, v0, Ld0/c;->a:I

    .line 96
    .line 97
    int-to-long v8, v8

    .line 98
    const-wide/high16 v10, -0x8000000000000000L

    .line 99
    .line 100
    cmp-long v12, v4, v10

    .line 101
    .line 102
    if-eqz v12, :cond_8

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    add-long v12, v8, v4

    .line 107
    .line 108
    cmp-long v1, v12, v1

    .line 109
    .line 110
    if-ltz v1, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    :goto_2
    iget v1, v0, Ld0/c;->a:I

    .line 114
    .line 115
    int-to-long v1, v1

    .line 116
    add-long v12, v8, v4

    .line 117
    .line 118
    cmp-long v1, v1, v12

    .line 119
    .line 120
    if-gez v1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Ld0/c;->b(Lc4/e;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    cmp-long v1, v1, v10

    .line 127
    .line 128
    if-nez v1, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    invoke-virtual {v0, p1}, Ld0/c;->b(Lc4/e;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    const-wide/16 v12, 0x0

    .line 136
    .line 137
    cmp-long v3, v1, v12

    .line 138
    .line 139
    if-ltz v3, :cond_8

    .line 140
    .line 141
    const-wide/32 v12, 0x7fffffff

    .line 142
    .line 143
    .line 144
    cmp-long v12, v1, v12

    .line 145
    .line 146
    if-lez v12, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    if-eqz v3, :cond_4

    .line 150
    .line 151
    long-to-int v1, v1

    .line 152
    invoke-virtual {p1, v1, v7}, Lc4/e;->k(IZ)Z

    .line 153
    .line 154
    .line 155
    iget v2, v0, Ld0/c;->a:I

    .line 156
    .line 157
    add-int/2addr v2, v1

    .line 158
    iput v2, v0, Ld0/c;->a:I

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    if-nez v1, :cond_8

    .line 162
    .line 163
    move v7, v6

    .line 164
    :cond_8
    :goto_3
    return v7
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

.method public final j()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Li4/d;->S:I

    iput v0, p0, Li4/d;->T:I

    iput v0, p0, Li4/d;->U:I

    iput-boolean v0, p0, Li4/d;->V:Z

    iput-boolean v0, p0, Li4/d;->W:Z

    iput-boolean v0, p0, Li4/d;->X:Z

    iput v0, p0, Li4/d;->Y:I

    iput-byte v0, p0, Li4/d;->Z:B

    iput-boolean v0, p0, Li4/d;->a0:Z

    iget-object v1, p0, Li4/d;->j:Lv5/u;

    invoke-virtual {v1, v0}, Lv5/u;->D(I)V

    return-void
.end method

.method public final k(J)J
    .locals 6

    iget-wide v2, p0, Li4/d;->r:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    const-wide/16 v4, 0x3e8

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Lv5/e0;->O(JJJ)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Can\'t scale timecode prior to timecodeScale being set."

    invoke-static {p2, p1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p1

    throw p1
.end method

.method public final l(Lc4/i;Li4/d$b;IZ)I
    .locals 10

    .line 1
    iget-object v0, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "S_TEXT/UTF8"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object p2, Li4/d;->c0:[B

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Li4/d;->m(Lc4/i;[BI)V

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    iget p1, p0, Li4/d;->T:I

    .line 17
    .line 18
    invoke-virtual {p0}, Li4/d;->j()V

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    iget-object v0, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "S_TEXT/ASS"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object p2, Li4/d;->e0:[B

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2, p3}, Li4/d;->m(Lc4/i;[BI)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object v0, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "S_TEXT/WEBVTT"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    sget-object p2, Li4/d;->f0:[B

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3}, Li4/d;->m(Lc4/i;[BI)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object v0, p2, Li4/d$b;->X:Lc4/v;

    .line 55
    .line 56
    iget-boolean v1, p0, Li4/d;->V:Z

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    const/4 v3, 0x4

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x1

    .line 62
    if-nez v1, :cond_15

    .line 63
    .line 64
    iget-boolean v1, p2, Li4/d$b;->h:Z

    .line 65
    .line 66
    if-eqz v1, :cond_10

    .line 67
    .line 68
    iget v1, p0, Li4/d;->O:I

    .line 69
    .line 70
    const v6, -0x40000001    # -1.9999999f

    .line 71
    .line 72
    .line 73
    and-int/2addr v1, v6

    .line 74
    iput v1, p0, Li4/d;->O:I

    .line 75
    .line 76
    iget-boolean v1, p0, Li4/d;->W:Z

    .line 77
    .line 78
    const/16 v6, 0x80

    .line 79
    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 83
    .line 84
    iget-object v1, v1, Lv5/u;->a:[B

    .line 85
    .line 86
    invoke-interface {p1, v1, v4, v5}, Lc4/i;->readFully([BII)V

    .line 87
    .line 88
    .line 89
    iget v1, p0, Li4/d;->S:I

    .line 90
    .line 91
    add-int/2addr v1, v5

    .line 92
    iput v1, p0, Li4/d;->S:I

    .line 93
    .line 94
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 95
    .line 96
    iget-object v1, v1, Lv5/u;->a:[B

    .line 97
    .line 98
    aget-byte v1, v1, v4

    .line 99
    .line 100
    and-int/lit16 v7, v1, 0x80

    .line 101
    .line 102
    if-eq v7, v6, :cond_4

    .line 103
    .line 104
    iput-byte v1, p0, Li4/d;->Z:B

    .line 105
    .line 106
    iput-boolean v5, p0, Li4/d;->W:Z

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 p1, 0x0

    .line 110
    const-string p2, "Extension bit is set in signal byte"

    .line 111
    .line 112
    invoke-static {p2, p1}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    throw p1

    .line 117
    :cond_5
    :goto_1
    iget-byte v1, p0, Li4/d;->Z:B

    .line 118
    .line 119
    and-int/lit8 v7, v1, 0x1

    .line 120
    .line 121
    if-ne v7, v5, :cond_6

    .line 122
    .line 123
    move v7, v5

    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move v7, v4

    .line 126
    :goto_2
    if-eqz v7, :cond_11

    .line 127
    .line 128
    and-int/2addr v1, v2

    .line 129
    if-ne v1, v2, :cond_7

    .line 130
    .line 131
    move v1, v5

    .line 132
    goto :goto_3

    .line 133
    :cond_7
    move v1, v4

    .line 134
    :goto_3
    iget v7, p0, Li4/d;->O:I

    .line 135
    .line 136
    const/high16 v8, 0x40000000    # 2.0f

    .line 137
    .line 138
    or-int/2addr v7, v8

    .line 139
    iput v7, p0, Li4/d;->O:I

    .line 140
    .line 141
    iget-boolean v7, p0, Li4/d;->a0:Z

    .line 142
    .line 143
    if-nez v7, :cond_9

    .line 144
    .line 145
    iget-object v7, p0, Li4/d;->l:Lv5/u;

    .line 146
    .line 147
    iget-object v7, v7, Lv5/u;->a:[B

    .line 148
    .line 149
    const/16 v8, 0x8

    .line 150
    .line 151
    invoke-interface {p1, v7, v4, v8}, Lc4/i;->readFully([BII)V

    .line 152
    .line 153
    .line 154
    iget v7, p0, Li4/d;->S:I

    .line 155
    .line 156
    add-int/2addr v7, v8

    .line 157
    iput v7, p0, Li4/d;->S:I

    .line 158
    .line 159
    iput-boolean v5, p0, Li4/d;->a0:Z

    .line 160
    .line 161
    iget-object v7, p0, Li4/d;->g:Lv5/u;

    .line 162
    .line 163
    iget-object v9, v7, Lv5/u;->a:[B

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_8
    move v6, v4

    .line 169
    :goto_4
    or-int/2addr v6, v8

    .line 170
    int-to-byte v6, v6

    .line 171
    aput-byte v6, v9, v4

    .line 172
    .line 173
    invoke-virtual {v7, v4}, Lv5/u;->G(I)V

    .line 174
    .line 175
    .line 176
    iget-object v6, p0, Li4/d;->g:Lv5/u;

    .line 177
    .line 178
    invoke-interface {v0, v5, v6}, Lc4/v;->a(ILv5/u;)V

    .line 179
    .line 180
    .line 181
    iget v6, p0, Li4/d;->T:I

    .line 182
    .line 183
    add-int/2addr v6, v5

    .line 184
    iput v6, p0, Li4/d;->T:I

    .line 185
    .line 186
    iget-object v6, p0, Li4/d;->l:Lv5/u;

    .line 187
    .line 188
    invoke-virtual {v6, v4}, Lv5/u;->G(I)V

    .line 189
    .line 190
    .line 191
    iget-object v6, p0, Li4/d;->l:Lv5/u;

    .line 192
    .line 193
    invoke-interface {v0, v8, v6}, Lc4/v;->a(ILv5/u;)V

    .line 194
    .line 195
    .line 196
    iget v6, p0, Li4/d;->T:I

    .line 197
    .line 198
    add-int/2addr v6, v8

    .line 199
    iput v6, p0, Li4/d;->T:I

    .line 200
    .line 201
    :cond_9
    if-eqz v1, :cond_11

    .line 202
    .line 203
    iget-boolean v1, p0, Li4/d;->X:Z

    .line 204
    .line 205
    if-nez v1, :cond_a

    .line 206
    .line 207
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 208
    .line 209
    iget-object v1, v1, Lv5/u;->a:[B

    .line 210
    .line 211
    invoke-interface {p1, v1, v4, v5}, Lc4/i;->readFully([BII)V

    .line 212
    .line 213
    .line 214
    iget v1, p0, Li4/d;->S:I

    .line 215
    .line 216
    add-int/2addr v1, v5

    .line 217
    iput v1, p0, Li4/d;->S:I

    .line 218
    .line 219
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 220
    .line 221
    invoke-virtual {v1, v4}, Lv5/u;->G(I)V

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 225
    .line 226
    invoke-virtual {v1}, Lv5/u;->v()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iput v1, p0, Li4/d;->Y:I

    .line 231
    .line 232
    iput-boolean v5, p0, Li4/d;->X:Z

    .line 233
    .line 234
    :cond_a
    iget v1, p0, Li4/d;->Y:I

    .line 235
    .line 236
    mul-int/2addr v1, v3

    .line 237
    iget-object v6, p0, Li4/d;->g:Lv5/u;

    .line 238
    .line 239
    invoke-virtual {v6, v1}, Lv5/u;->D(I)V

    .line 240
    .line 241
    .line 242
    iget-object v6, p0, Li4/d;->g:Lv5/u;

    .line 243
    .line 244
    iget-object v6, v6, Lv5/u;->a:[B

    .line 245
    .line 246
    invoke-interface {p1, v6, v4, v1}, Lc4/i;->readFully([BII)V

    .line 247
    .line 248
    .line 249
    iget v6, p0, Li4/d;->S:I

    .line 250
    .line 251
    add-int/2addr v6, v1

    .line 252
    iput v6, p0, Li4/d;->S:I

    .line 253
    .line 254
    iget v1, p0, Li4/d;->Y:I

    .line 255
    .line 256
    div-int/2addr v1, v2

    .line 257
    add-int/2addr v1, v5

    .line 258
    int-to-short v1, v1

    .line 259
    mul-int/lit8 v6, v1, 0x6

    .line 260
    .line 261
    add-int/2addr v6, v2

    .line 262
    iget-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 263
    .line 264
    if-eqz v7, :cond_b

    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-ge v7, v6, :cond_c

    .line 271
    .line 272
    :cond_b
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    iput-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 277
    .line 278
    :cond_c
    iget-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 279
    .line 280
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 281
    .line 282
    .line 283
    iget-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 286
    .line 287
    .line 288
    move v1, v4

    .line 289
    move v7, v1

    .line 290
    :goto_5
    iget v8, p0, Li4/d;->Y:I

    .line 291
    .line 292
    if-ge v1, v8, :cond_e

    .line 293
    .line 294
    iget-object v8, p0, Li4/d;->g:Lv5/u;

    .line 295
    .line 296
    invoke-virtual {v8}, Lv5/u;->y()I

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    rem-int/lit8 v9, v1, 0x2

    .line 301
    .line 302
    if-nez v9, :cond_d

    .line 303
    .line 304
    iget-object v9, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 305
    .line 306
    sub-int v7, v8, v7

    .line 307
    .line 308
    int-to-short v7, v7

    .line 309
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_d
    iget-object v9, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 314
    .line 315
    sub-int v7, v8, v7

    .line 316
    .line 317
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 318
    .line 319
    .line 320
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 321
    .line 322
    move v7, v8

    .line 323
    goto :goto_5

    .line 324
    :cond_e
    iget v1, p0, Li4/d;->S:I

    .line 325
    .line 326
    sub-int v1, p3, v1

    .line 327
    .line 328
    sub-int/2addr v1, v7

    .line 329
    rem-int/2addr v8, v2

    .line 330
    iget-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 331
    .line 332
    if-ne v8, v5, :cond_f

    .line 333
    .line 334
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_f
    int-to-short v1, v1

    .line 339
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    .line 342
    iget-object v1, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 345
    .line 346
    .line 347
    :goto_7
    iget-object v1, p0, Li4/d;->m:Lv5/u;

    .line 348
    .line 349
    iget-object v7, p0, Li4/d;->o:Ljava/nio/ByteBuffer;

    .line 350
    .line 351
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-virtual {v1, v7, v6}, Lv5/u;->E([BI)V

    .line 356
    .line 357
    .line 358
    iget-object v1, p0, Li4/d;->m:Lv5/u;

    .line 359
    .line 360
    invoke-interface {v0, v6, v1}, Lc4/v;->a(ILv5/u;)V

    .line 361
    .line 362
    .line 363
    iget v1, p0, Li4/d;->T:I

    .line 364
    .line 365
    add-int/2addr v1, v6

    .line 366
    iput v1, p0, Li4/d;->T:I

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_10
    iget-object v1, p2, Li4/d$b;->i:[B

    .line 370
    .line 371
    if-eqz v1, :cond_11

    .line 372
    .line 373
    iget-object v6, p0, Li4/d;->j:Lv5/u;

    .line 374
    .line 375
    array-length v7, v1

    .line 376
    invoke-virtual {v6, v1, v7}, Lv5/u;->E([BI)V

    .line 377
    .line 378
    .line 379
    :cond_11
    :goto_8
    iget-object v1, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 380
    .line 381
    const-string v6, "A_OPUS"

    .line 382
    .line 383
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    if-eqz v1, :cond_12

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_12
    iget p4, p2, Li4/d$b;->f:I

    .line 391
    .line 392
    if-lez p4, :cond_13

    .line 393
    .line 394
    move p4, v5

    .line 395
    goto :goto_9

    .line 396
    :cond_13
    move p4, v4

    .line 397
    :goto_9
    if-eqz p4, :cond_14

    .line 398
    .line 399
    iget p4, p0, Li4/d;->O:I

    .line 400
    .line 401
    const/high16 v1, 0x10000000

    .line 402
    .line 403
    or-int/2addr p4, v1

    .line 404
    iput p4, p0, Li4/d;->O:I

    .line 405
    .line 406
    iget-object p4, p0, Li4/d;->n:Lv5/u;

    .line 407
    .line 408
    invoke-virtual {p4, v4}, Lv5/u;->D(I)V

    .line 409
    .line 410
    .line 411
    iget-object p4, p0, Li4/d;->j:Lv5/u;

    .line 412
    .line 413
    iget p4, p4, Lv5/u;->c:I

    .line 414
    .line 415
    add-int/2addr p4, p3

    .line 416
    iget v1, p0, Li4/d;->S:I

    .line 417
    .line 418
    sub-int/2addr p4, v1

    .line 419
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 420
    .line 421
    invoke-virtual {v1, v3}, Lv5/u;->D(I)V

    .line 422
    .line 423
    .line 424
    iget-object v1, p0, Li4/d;->g:Lv5/u;

    .line 425
    .line 426
    iget-object v6, v1, Lv5/u;->a:[B

    .line 427
    .line 428
    shr-int/lit8 v7, p4, 0x18

    .line 429
    .line 430
    and-int/lit16 v7, v7, 0xff

    .line 431
    .line 432
    int-to-byte v7, v7

    .line 433
    aput-byte v7, v6, v4

    .line 434
    .line 435
    shr-int/lit8 v7, p4, 0x10

    .line 436
    .line 437
    and-int/lit16 v7, v7, 0xff

    .line 438
    .line 439
    int-to-byte v7, v7

    .line 440
    aput-byte v7, v6, v5

    .line 441
    .line 442
    shr-int/lit8 v7, p4, 0x8

    .line 443
    .line 444
    and-int/lit16 v7, v7, 0xff

    .line 445
    .line 446
    int-to-byte v7, v7

    .line 447
    aput-byte v7, v6, v2

    .line 448
    .line 449
    const/4 v7, 0x3

    .line 450
    and-int/lit16 p4, p4, 0xff

    .line 451
    .line 452
    int-to-byte p4, p4

    .line 453
    aput-byte p4, v6, v7

    .line 454
    .line 455
    invoke-interface {v0, v3, v1}, Lc4/v;->a(ILv5/u;)V

    .line 456
    .line 457
    .line 458
    iget p4, p0, Li4/d;->T:I

    .line 459
    .line 460
    add-int/2addr p4, v3

    .line 461
    iput p4, p0, Li4/d;->T:I

    .line 462
    .line 463
    :cond_14
    iput-boolean v5, p0, Li4/d;->V:Z

    .line 464
    .line 465
    :cond_15
    iget-object p4, p0, Li4/d;->j:Lv5/u;

    .line 466
    .line 467
    iget p4, p4, Lv5/u;->c:I

    .line 468
    .line 469
    add-int/2addr p3, p4

    .line 470
    iget-object p4, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 471
    .line 472
    const-string v1, "V_MPEG4/ISO/AVC"

    .line 473
    .line 474
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result p4

    .line 478
    if-nez p4, :cond_1a

    .line 479
    .line 480
    iget-object p4, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 481
    .line 482
    const-string v1, "V_MPEGH/ISO/HEVC"

    .line 483
    .line 484
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result p4

    .line 488
    if-eqz p4, :cond_16

    .line 489
    .line 490
    goto :goto_d

    .line 491
    :cond_16
    iget-object p4, p2, Li4/d$b;->T:Lc4/w;

    .line 492
    .line 493
    if-eqz p4, :cond_18

    .line 494
    .line 495
    iget-object p4, p0, Li4/d;->j:Lv5/u;

    .line 496
    .line 497
    iget p4, p4, Lv5/u;->c:I

    .line 498
    .line 499
    if-nez p4, :cond_17

    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_17
    move v5, v4

    .line 503
    :goto_a
    invoke-static {v5}, Lx6/b;->H(Z)V

    .line 504
    .line 505
    .line 506
    iget-object p4, p2, Li4/d$b;->T:Lc4/w;

    .line 507
    .line 508
    invoke-virtual {p4, p1}, Lc4/w;->c(Lc4/i;)V

    .line 509
    .line 510
    .line 511
    :cond_18
    :goto_b
    iget p4, p0, Li4/d;->S:I

    .line 512
    .line 513
    if-ge p4, p3, :cond_1e

    .line 514
    .line 515
    sub-int p4, p3, p4

    .line 516
    .line 517
    iget-object v1, p0, Li4/d;->j:Lv5/u;

    .line 518
    .line 519
    iget v2, v1, Lv5/u;->c:I

    .line 520
    .line 521
    iget v1, v1, Lv5/u;->b:I

    .line 522
    .line 523
    sub-int/2addr v2, v1

    .line 524
    if-lez v2, :cond_19

    .line 525
    .line 526
    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    .line 527
    .line 528
    .line 529
    move-result p4

    .line 530
    iget-object v1, p0, Li4/d;->j:Lv5/u;

    .line 531
    .line 532
    invoke-interface {v0, p4, v1}, Lc4/v;->b(ILv5/u;)V

    .line 533
    .line 534
    .line 535
    goto :goto_c

    .line 536
    :cond_19
    invoke-interface {v0, p1, p4, v4}, Lc4/v;->e(Lt5/h;IZ)I

    .line 537
    .line 538
    .line 539
    move-result p4

    .line 540
    :goto_c
    iget v1, p0, Li4/d;->S:I

    .line 541
    .line 542
    add-int/2addr v1, p4

    .line 543
    iput v1, p0, Li4/d;->S:I

    .line 544
    .line 545
    iget v1, p0, Li4/d;->T:I

    .line 546
    .line 547
    add-int/2addr v1, p4

    .line 548
    iput v1, p0, Li4/d;->T:I

    .line 549
    .line 550
    goto :goto_b

    .line 551
    :cond_1a
    :goto_d
    iget-object p4, p0, Li4/d;->f:Lv5/u;

    .line 552
    .line 553
    iget-object p4, p4, Lv5/u;->a:[B

    .line 554
    .line 555
    aput-byte v4, p4, v4

    .line 556
    .line 557
    aput-byte v4, p4, v5

    .line 558
    .line 559
    aput-byte v4, p4, v2

    .line 560
    .line 561
    iget v1, p2, Li4/d$b;->Y:I

    .line 562
    .line 563
    rsub-int/lit8 v2, v1, 0x4

    .line 564
    .line 565
    :goto_e
    iget v5, p0, Li4/d;->S:I

    .line 566
    .line 567
    if-ge v5, p3, :cond_1e

    .line 568
    .line 569
    iget v5, p0, Li4/d;->U:I

    .line 570
    .line 571
    if-nez v5, :cond_1c

    .line 572
    .line 573
    iget-object v5, p0, Li4/d;->j:Lv5/u;

    .line 574
    .line 575
    iget v6, v5, Lv5/u;->c:I

    .line 576
    .line 577
    iget v5, v5, Lv5/u;->b:I

    .line 578
    .line 579
    sub-int/2addr v6, v5

    .line 580
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 581
    .line 582
    .line 583
    move-result v5

    .line 584
    add-int v6, v2, v5

    .line 585
    .line 586
    sub-int v7, v1, v5

    .line 587
    .line 588
    invoke-interface {p1, p4, v6, v7}, Lc4/i;->readFully([BII)V

    .line 589
    .line 590
    .line 591
    if-lez v5, :cond_1b

    .line 592
    .line 593
    iget-object v6, p0, Li4/d;->j:Lv5/u;

    .line 594
    .line 595
    invoke-virtual {v6, p4, v2, v5}, Lv5/u;->d([BII)V

    .line 596
    .line 597
    .line 598
    :cond_1b
    iget v5, p0, Li4/d;->S:I

    .line 599
    .line 600
    add-int/2addr v5, v1

    .line 601
    iput v5, p0, Li4/d;->S:I

    .line 602
    .line 603
    iget-object v5, p0, Li4/d;->f:Lv5/u;

    .line 604
    .line 605
    invoke-virtual {v5, v4}, Lv5/u;->G(I)V

    .line 606
    .line 607
    .line 608
    iget-object v5, p0, Li4/d;->f:Lv5/u;

    .line 609
    .line 610
    invoke-virtual {v5}, Lv5/u;->y()I

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    iput v5, p0, Li4/d;->U:I

    .line 615
    .line 616
    iget-object v5, p0, Li4/d;->e:Lv5/u;

    .line 617
    .line 618
    invoke-virtual {v5, v4}, Lv5/u;->G(I)V

    .line 619
    .line 620
    .line 621
    iget-object v5, p0, Li4/d;->e:Lv5/u;

    .line 622
    .line 623
    invoke-interface {v0, v3, v5}, Lc4/v;->b(ILv5/u;)V

    .line 624
    .line 625
    .line 626
    iget v5, p0, Li4/d;->T:I

    .line 627
    .line 628
    add-int/2addr v5, v3

    .line 629
    iput v5, p0, Li4/d;->T:I

    .line 630
    .line 631
    goto :goto_e

    .line 632
    :cond_1c
    iget-object v6, p0, Li4/d;->j:Lv5/u;

    .line 633
    .line 634
    iget v7, v6, Lv5/u;->c:I

    .line 635
    .line 636
    iget v6, v6, Lv5/u;->b:I

    .line 637
    .line 638
    sub-int/2addr v7, v6

    .line 639
    if-lez v7, :cond_1d

    .line 640
    .line 641
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 642
    .line 643
    .line 644
    move-result v5

    .line 645
    iget-object v6, p0, Li4/d;->j:Lv5/u;

    .line 646
    .line 647
    invoke-interface {v0, v5, v6}, Lc4/v;->b(ILv5/u;)V

    .line 648
    .line 649
    .line 650
    goto :goto_f

    .line 651
    :cond_1d
    invoke-interface {v0, p1, v5, v4}, Lc4/v;->e(Lt5/h;IZ)I

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    :goto_f
    iget v6, p0, Li4/d;->S:I

    .line 656
    .line 657
    add-int/2addr v6, v5

    .line 658
    iput v6, p0, Li4/d;->S:I

    .line 659
    .line 660
    iget v6, p0, Li4/d;->T:I

    .line 661
    .line 662
    add-int/2addr v6, v5

    .line 663
    iput v6, p0, Li4/d;->T:I

    .line 664
    .line 665
    iget v6, p0, Li4/d;->U:I

    .line 666
    .line 667
    sub-int/2addr v6, v5

    .line 668
    iput v6, p0, Li4/d;->U:I

    .line 669
    .line 670
    goto :goto_e

    .line 671
    :cond_1e
    iget-object p1, p2, Li4/d$b;->b:Ljava/lang/String;

    .line 672
    .line 673
    const-string p2, "A_VORBIS"

    .line 674
    .line 675
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result p1

    .line 679
    if-eqz p1, :cond_0

    .line 680
    .line 681
    iget-object p1, p0, Li4/d;->h:Lv5/u;

    .line 682
    .line 683
    invoke-virtual {p1, v4}, Lv5/u;->G(I)V

    .line 684
    .line 685
    .line 686
    iget-object p1, p0, Li4/d;->h:Lv5/u;

    .line 687
    .line 688
    invoke-interface {v0, v3, p1}, Lc4/v;->b(ILv5/u;)V

    .line 689
    .line 690
    .line 691
    iget p1, p0, Li4/d;->T:I

    .line 692
    .line 693
    add-int/2addr p1, v3

    .line 694
    iput p1, p0, Li4/d;->T:I

    .line 695
    .line 696
    goto/16 :goto_0
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
.end method

.method public final m(Lc4/i;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, Li4/d;->k:Lv5/u;

    .line 4
    .line 5
    iget-object v2, v1, Lv5/u;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    add-int v2, v0, p3

    .line 12
    .line 13
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    array-length v3, v2

    .line 18
    invoke-virtual {v1, v2, v3}, Lv5/u;->E([BI)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    array-length v1, p2

    .line 23
    invoke-static {p2, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v1, p0, Li4/d;->k:Lv5/u;

    .line 27
    .line 28
    iget-object v1, v1, Lv5/u;->a:[B

    .line 29
    .line 30
    array-length p2, p2

    .line 31
    invoke-interface {p1, v1, p2, p3}, Lc4/i;->readFully([BII)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Li4/d;->k:Lv5/u;

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Lv5/u;->G(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Li4/d;->k:Lv5/u;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lv5/u;->F(I)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final release()V
    .locals 0

    return-void
.end method

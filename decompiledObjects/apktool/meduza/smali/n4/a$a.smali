.class public final Ln4/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final m:[I

.field public static final n:[I


# instance fields
.field public final a:Lc4/j;

.field public final b:Lc4/v;

.field public final c:Ln4/b;

.field public final d:I

.field public final e:[B

.field public final f:Lv5/u;

.field public final g:I

.field public final h:Lv3/i0;

.field public i:I

.field public j:J

.field public k:I

.field public l:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ln4/a$a;->m:[I

    const/16 v0, 0x59

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Ln4/a$a;->n:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_1
    .array-data 4
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0x10
        0x11
        0x13
        0x15
        0x17
        0x19
        0x1c
        0x1f
        0x22
        0x25
        0x29
        0x2d
        0x32
        0x37
        0x3c
        0x42
        0x49
        0x50
        0x58
        0x61
        0x6b
        0x76
        0x82
        0x8f
        0x9d
        0xad
        0xbe
        0xd1
        0xe6
        0xfd
        0x117
        0x133
        0x151
        0x173
        0x198
        0x1c1
        0x1ee
        0x220
        0x256
        0x292
        0x2d4
        0x31c
        0x36c
        0x3c3
        0x424
        0x48e
        0x502
        0x583
        0x610
        0x6ab
        0x756
        0x812
        0x8e0
        0x9c3
        0xabd
        0xbd0
        0xcff
        0xe4c
        0xfba
        0x114c
        0x1307
        0x14ee
        0x1706
        0x1954
        0x1bdc
        0x1ea5
        0x21b6
        0x2515
        0x28ca
        0x2cdf
        0x315b
        0x364b
        0x3bb9
        0x41b2
        0x4844
        0x4f7e
        0x5771
        0x602f
        0x69ce
        0x7462
        0x7fff
    .end array-data
.end method

.method public constructor <init>(Lc4/j;Lc4/v;Ln4/b;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln4/a$a;->a:Lc4/j;

    .line 5
    .line 6
    iput-object p2, p0, Ln4/a$a;->b:Lc4/v;

    .line 7
    .line 8
    iput-object p3, p0, Ln4/a$a;->c:Ln4/b;

    .line 9
    .line 10
    iget p1, p3, Ln4/b;->b:I

    .line 11
    .line 12
    div-int/lit8 p1, p1, 0xa

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Ln4/a$a;->g:I

    .line 20
    .line 21
    new-instance v0, Lv5/u;

    .line 22
    .line 23
    iget-object v1, p3, Ln4/b;->e:[B

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lv5/u;-><init>([B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lv5/u;->n()I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lv5/u;->n()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Ln4/a$a;->d:I

    .line 36
    .line 37
    iget v1, p3, Ln4/b;->a:I

    .line 38
    .line 39
    iget v2, p3, Ln4/b;->c:I

    .line 40
    .line 41
    mul-int/lit8 v3, v1, 0x4

    .line 42
    .line 43
    sub-int v3, v2, v3

    .line 44
    .line 45
    mul-int/lit8 v3, v3, 0x8

    .line 46
    .line 47
    iget v4, p3, Ln4/b;->d:I

    .line 48
    .line 49
    mul-int/2addr v4, v1

    .line 50
    div-int/2addr v3, v4

    .line 51
    add-int/2addr v3, p2

    .line 52
    if-ne v0, v3, :cond_0

    .line 53
    .line 54
    sget p2, Lv5/e0;->a:I

    .line 55
    .line 56
    add-int p2, p1, v0

    .line 57
    .line 58
    add-int/lit8 p2, p2, -0x1

    .line 59
    .line 60
    div-int/2addr p2, v0

    .line 61
    mul-int/2addr v2, p2

    .line 62
    new-array v2, v2, [B

    .line 63
    .line 64
    iput-object v2, p0, Ln4/a$a;->e:[B

    .line 65
    .line 66
    new-instance v2, Lv5/u;

    .line 67
    .line 68
    mul-int/lit8 v3, v0, 0x2

    .line 69
    .line 70
    mul-int/2addr v3, v1

    .line 71
    mul-int/2addr v3, p2

    .line 72
    invoke-direct {v2, v3}, Lv5/u;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Ln4/a$a;->f:Lv5/u;

    .line 76
    .line 77
    iget p2, p3, Ln4/b;->b:I

    .line 78
    .line 79
    iget v2, p3, Ln4/b;->c:I

    .line 80
    .line 81
    mul-int/2addr v2, p2

    .line 82
    mul-int/lit8 v2, v2, 0x8

    .line 83
    .line 84
    div-int/2addr v2, v0

    .line 85
    new-instance v0, Lv3/i0$a;

    .line 86
    .line 87
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v3, "audio/raw"

    .line 91
    .line 92
    iput-object v3, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 93
    .line 94
    iput v2, v0, Lv3/i0$a;->f:I

    .line 95
    .line 96
    iput v2, v0, Lv3/i0$a;->g:I

    .line 97
    .line 98
    const/4 v2, 0x2

    .line 99
    mul-int/2addr p1, v2

    .line 100
    mul-int/2addr p1, v1

    .line 101
    iput p1, v0, Lv3/i0$a;->l:I

    .line 102
    .line 103
    iget p1, p3, Ln4/b;->a:I

    .line 104
    .line 105
    iput p1, v0, Lv3/i0$a;->x:I

    .line 106
    .line 107
    iput p2, v0, Lv3/i0$a;->y:I

    .line 108
    .line 109
    iput v2, v0, Lv3/i0$a;->z:I

    .line 110
    .line 111
    new-instance p1, Lv3/i0;

    .line 112
    .line 113
    invoke-direct {p1, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Ln4/a$a;->h:Lv3/i0;

    .line 117
    .line 118
    return-void

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string p2, "Expected frames per block: "

    .line 125
    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p2, "; got: "

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 p2, 0x0

    .line 145
    invoke-static {p1, p2}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    throw p1
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
.method public final a(J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln4/a$a;->i:I

    iput-wide p1, p0, Ln4/a$a;->j:J

    iput v0, p0, Ln4/a$a;->k:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Ln4/a$a;->l:J

    return-void
.end method

.method public final b(Lc4/i;J)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ln4/a$a;->g:I

    .line 4
    .line 5
    iget v2, v0, Ln4/a$a;->k:I

    .line 6
    .line 7
    iget-object v3, v0, Ln4/a$a;->c:Ln4/b;

    .line 8
    .line 9
    iget v4, v3, Ln4/b;->a:I

    .line 10
    .line 11
    mul-int/lit8 v4, v4, 0x2

    .line 12
    .line 13
    div-int/2addr v2, v4

    .line 14
    sub-int/2addr v1, v2

    .line 15
    iget v2, v0, Ln4/a$a;->d:I

    .line 16
    .line 17
    sget v4, Lv5/e0;->a:I

    .line 18
    .line 19
    add-int/2addr v1, v2

    .line 20
    const/4 v4, -0x1

    .line 21
    add-int/2addr v1, v4

    .line 22
    div-int/2addr v1, v2

    .line 23
    iget v2, v3, Ln4/b;->c:I

    .line 24
    .line 25
    mul-int/2addr v1, v2

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v2, p2, v2

    .line 29
    .line 30
    move-wide/from16 v6, p2

    .line 31
    .line 32
    move-object v9, v0

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    move v2, v1

    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v2, v1

    .line 40
    const/4 v8, 0x0

    .line 41
    move-object/from16 v1, p1

    .line 42
    .line 43
    :goto_0
    if-nez v8, :cond_2

    .line 44
    .line 45
    iget v10, v9, Ln4/a$a;->i:I

    .line 46
    .line 47
    if-ge v10, v2, :cond_2

    .line 48
    .line 49
    sub-int v10, v2, v10

    .line 50
    .line 51
    int-to-long v10, v10

    .line 52
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v10

    .line 56
    long-to-int v10, v10

    .line 57
    iget-object v11, v9, Ln4/a$a;->e:[B

    .line 58
    .line 59
    iget v12, v9, Ln4/a$a;->i:I

    .line 60
    .line 61
    invoke-interface {v1, v11, v12, v10}, Lc4/i;->read([BII)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-ne v10, v4, :cond_1

    .line 66
    .line 67
    :goto_1
    const/4 v8, 0x1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget v11, v9, Ln4/a$a;->i:I

    .line 70
    .line 71
    add-int/2addr v11, v10

    .line 72
    iput v11, v9, Ln4/a$a;->i:I

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget v1, v9, Ln4/a$a;->i:I

    .line 76
    .line 77
    iget-object v2, v9, Ln4/a$a;->c:Ln4/b;

    .line 78
    .line 79
    iget v2, v2, Ln4/b;->c:I

    .line 80
    .line 81
    div-int/2addr v1, v2

    .line 82
    if-lez v1, :cond_8

    .line 83
    .line 84
    iget-object v2, v9, Ln4/a$a;->e:[B

    .line 85
    .line 86
    iget-object v4, v9, Ln4/a$a;->f:Lv5/u;

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    :goto_2
    if-ge v6, v1, :cond_7

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    :goto_3
    iget-object v10, v9, Ln4/a$a;->c:Ln4/b;

    .line 93
    .line 94
    iget v11, v10, Ln4/b;->a:I

    .line 95
    .line 96
    if-ge v7, v11, :cond_6

    .line 97
    .line 98
    iget-object v12, v4, Lv5/u;->a:[B

    .line 99
    .line 100
    iget v10, v10, Ln4/b;->c:I

    .line 101
    .line 102
    mul-int v13, v6, v10

    .line 103
    .line 104
    mul-int/lit8 v14, v7, 0x4

    .line 105
    .line 106
    add-int/2addr v14, v13

    .line 107
    mul-int/lit8 v13, v11, 0x4

    .line 108
    .line 109
    add-int/2addr v13, v14

    .line 110
    div-int/2addr v10, v11

    .line 111
    add-int/lit8 v10, v10, -0x4

    .line 112
    .line 113
    add-int/lit8 v15, v14, 0x1

    .line 114
    .line 115
    aget-byte v15, v2, v15

    .line 116
    .line 117
    and-int/lit16 v15, v15, 0xff

    .line 118
    .line 119
    shl-int/lit8 v15, v15, 0x8

    .line 120
    .line 121
    aget-byte v3, v2, v14

    .line 122
    .line 123
    and-int/lit16 v3, v3, 0xff

    .line 124
    .line 125
    or-int/2addr v3, v15

    .line 126
    int-to-short v3, v3

    .line 127
    add-int/lit8 v14, v14, 0x2

    .line 128
    .line 129
    aget-byte v14, v2, v14

    .line 130
    .line 131
    and-int/lit16 v14, v14, 0xff

    .line 132
    .line 133
    const/16 v15, 0x58

    .line 134
    .line 135
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    sget-object v16, Ln4/a$a;->n:[I

    .line 140
    .line 141
    aget v16, v16, v14

    .line 142
    .line 143
    iget v15, v9, Ln4/a$a;->d:I

    .line 144
    .line 145
    mul-int/2addr v15, v6

    .line 146
    mul-int/2addr v15, v11

    .line 147
    add-int/2addr v15, v7

    .line 148
    mul-int/lit8 v15, v15, 0x2

    .line 149
    .line 150
    and-int/lit16 v5, v3, 0xff

    .line 151
    .line 152
    int-to-byte v5, v5

    .line 153
    aput-byte v5, v12, v15

    .line 154
    .line 155
    add-int/lit8 v5, v15, 0x1

    .line 156
    .line 157
    shr-int/lit8 v0, v3, 0x8

    .line 158
    .line 159
    int-to-byte v0, v0

    .line 160
    aput-byte v0, v12, v5

    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    :goto_4
    mul-int/lit8 v5, v10, 0x2

    .line 164
    .line 165
    if-ge v0, v5, :cond_5

    .line 166
    .line 167
    div-int/lit8 v5, v0, 0x8

    .line 168
    .line 169
    div-int/lit8 v18, v0, 0x2

    .line 170
    .line 171
    rem-int/lit8 v18, v18, 0x4

    .line 172
    .line 173
    mul-int/2addr v5, v11

    .line 174
    mul-int/lit8 v5, v5, 0x4

    .line 175
    .line 176
    add-int/2addr v5, v13

    .line 177
    add-int v5, v5, v18

    .line 178
    .line 179
    aget-byte v5, v2, v5

    .line 180
    .line 181
    and-int/lit16 v5, v5, 0xff

    .line 182
    .line 183
    rem-int/lit8 v18, v0, 0x2

    .line 184
    .line 185
    if-nez v18, :cond_3

    .line 186
    .line 187
    and-int/lit8 v5, v5, 0xf

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_3
    shr-int/lit8 v5, v5, 0x4

    .line 191
    .line 192
    :goto_5
    and-int/lit8 v18, v5, 0x7

    .line 193
    .line 194
    mul-int/lit8 v18, v18, 0x2

    .line 195
    .line 196
    const/16 v17, 0x1

    .line 197
    .line 198
    add-int/lit8 v18, v18, 0x1

    .line 199
    .line 200
    mul-int v18, v18, v16

    .line 201
    .line 202
    move-object/from16 v16, v2

    .line 203
    .line 204
    shr-int/lit8 v2, v18, 0x3

    .line 205
    .line 206
    and-int/lit8 v18, v5, 0x8

    .line 207
    .line 208
    if-eqz v18, :cond_4

    .line 209
    .line 210
    neg-int v2, v2

    .line 211
    :cond_4
    add-int/2addr v3, v2

    .line 212
    const/16 v2, -0x8000

    .line 213
    .line 214
    move/from16 p2, v10

    .line 215
    .line 216
    const/16 v10, 0x7fff

    .line 217
    .line 218
    invoke-static {v3, v2, v10}, Lv5/e0;->i(III)I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    mul-int/lit8 v2, v11, 0x2

    .line 223
    .line 224
    add-int/2addr v15, v2

    .line 225
    and-int/lit16 v2, v3, 0xff

    .line 226
    .line 227
    int-to-byte v2, v2

    .line 228
    aput-byte v2, v12, v15

    .line 229
    .line 230
    add-int/lit8 v2, v15, 0x1

    .line 231
    .line 232
    shr-int/lit8 v10, v3, 0x8

    .line 233
    .line 234
    int-to-byte v10, v10

    .line 235
    aput-byte v10, v12, v2

    .line 236
    .line 237
    sget-object v2, Ln4/a$a;->m:[I

    .line 238
    .line 239
    aget v2, v2, v5

    .line 240
    .line 241
    add-int/2addr v14, v2

    .line 242
    sget-object v2, Ln4/a$a;->n:[I

    .line 243
    .line 244
    const/16 v5, 0x58

    .line 245
    .line 246
    const/4 v10, 0x0

    .line 247
    invoke-static {v14, v10, v5}, Lv5/e0;->i(III)I

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    aget v2, v2, v14

    .line 252
    .line 253
    add-int/lit8 v0, v0, 0x1

    .line 254
    .line 255
    move/from16 v10, p2

    .line 256
    .line 257
    move-object/from16 v19, v16

    .line 258
    .line 259
    move/from16 v16, v2

    .line 260
    .line 261
    move-object/from16 v2, v19

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_5
    move-object/from16 v16, v2

    .line 265
    .line 266
    const/16 v17, 0x1

    .line 267
    .line 268
    add-int/lit8 v7, v7, 0x1

    .line 269
    .line 270
    move-object/from16 v0, p0

    .line 271
    .line 272
    goto/16 :goto_3

    .line 273
    .line 274
    :cond_6
    move-object/from16 v16, v2

    .line 275
    .line 276
    const/16 v17, 0x1

    .line 277
    .line 278
    add-int/lit8 v6, v6, 0x1

    .line 279
    .line 280
    move-object/from16 v0, p0

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :cond_7
    iget v0, v9, Ln4/a$a;->d:I

    .line 285
    .line 286
    mul-int/2addr v0, v1

    .line 287
    iget-object v2, v9, Ln4/a$a;->c:Ln4/b;

    .line 288
    .line 289
    iget v2, v2, Ln4/b;->a:I

    .line 290
    .line 291
    mul-int/lit8 v0, v0, 0x2

    .line 292
    .line 293
    mul-int/2addr v0, v2

    .line 294
    const/4 v2, 0x0

    .line 295
    invoke-virtual {v4, v2}, Lv5/u;->G(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v0}, Lv5/u;->F(I)V

    .line 299
    .line 300
    .line 301
    iget v0, v9, Ln4/a$a;->i:I

    .line 302
    .line 303
    iget-object v2, v9, Ln4/a$a;->c:Ln4/b;

    .line 304
    .line 305
    iget v2, v2, Ln4/b;->c:I

    .line 306
    .line 307
    mul-int/2addr v1, v2

    .line 308
    sub-int/2addr v0, v1

    .line 309
    iput v0, v9, Ln4/a$a;->i:I

    .line 310
    .line 311
    iget-object v0, v9, Ln4/a$a;->f:Lv5/u;

    .line 312
    .line 313
    iget v1, v0, Lv5/u;->c:I

    .line 314
    .line 315
    iget-object v2, v9, Ln4/a$a;->b:Lc4/v;

    .line 316
    .line 317
    invoke-interface {v2, v1, v0}, Lc4/v;->b(ILv5/u;)V

    .line 318
    .line 319
    .line 320
    iget v0, v9, Ln4/a$a;->k:I

    .line 321
    .line 322
    add-int/2addr v0, v1

    .line 323
    iput v0, v9, Ln4/a$a;->k:I

    .line 324
    .line 325
    iget-object v1, v9, Ln4/a$a;->c:Ln4/b;

    .line 326
    .line 327
    iget v1, v1, Ln4/b;->a:I

    .line 328
    .line 329
    mul-int/lit8 v1, v1, 0x2

    .line 330
    .line 331
    div-int/2addr v0, v1

    .line 332
    iget v1, v9, Ln4/a$a;->g:I

    .line 333
    .line 334
    if-lt v0, v1, :cond_8

    .line 335
    .line 336
    invoke-virtual {v9, v1}, Ln4/a$a;->d(I)V

    .line 337
    .line 338
    .line 339
    :cond_8
    if-eqz v8, :cond_9

    .line 340
    .line 341
    iget v0, v9, Ln4/a$a;->k:I

    .line 342
    .line 343
    iget-object v1, v9, Ln4/a$a;->c:Ln4/b;

    .line 344
    .line 345
    iget v1, v1, Ln4/b;->a:I

    .line 346
    .line 347
    mul-int/lit8 v1, v1, 0x2

    .line 348
    .line 349
    div-int/2addr v0, v1

    .line 350
    if-lez v0, :cond_9

    .line 351
    .line 352
    invoke-virtual {v9, v0}, Ln4/a$a;->d(I)V

    .line 353
    .line 354
    .line 355
    :cond_9
    return v8
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

.method public final c(IJ)V
    .locals 9

    iget-object v0, p0, Ln4/a$a;->a:Lc4/j;

    new-instance v8, Ln4/d;

    iget-object v2, p0, Ln4/a$a;->c:Ln4/b;

    iget v3, p0, Ln4/a$a;->d:I

    int-to-long v4, p1

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Ln4/d;-><init>(Ln4/b;IJJ)V

    invoke-interface {v0, v8}, Lc4/j;->t(Lc4/t;)V

    iget-object p1, p0, Ln4/a$a;->b:Lc4/v;

    iget-object p2, p0, Ln4/a$a;->h:Lv3/i0;

    invoke-interface {p1, p2}, Lc4/v;->d(Lv3/i0;)V

    return-void
.end method

.method public final d(I)V
    .locals 11

    .line 1
    iget-wide v0, p0, Ln4/a$a;->j:J

    .line 2
    .line 3
    iget-wide v2, p0, Ln4/a$a;->l:J

    .line 4
    .line 5
    iget-object v4, p0, Ln4/a$a;->c:Ln4/b;

    .line 6
    .line 7
    iget v4, v4, Ln4/b;->b:I

    .line 8
    .line 9
    int-to-long v6, v4

    .line 10
    const-wide/32 v4, 0xf4240

    .line 11
    .line 12
    .line 13
    invoke-static/range {v2 .. v7}, Lv5/e0;->O(JJJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    add-long v5, v0, v2

    .line 18
    .line 19
    iget-object v0, p0, Ln4/a$a;->c:Ln4/b;

    .line 20
    .line 21
    iget v0, v0, Ln4/b;->a:I

    .line 22
    .line 23
    mul-int/lit8 v1, p1, 0x2

    .line 24
    .line 25
    mul-int/2addr v1, v0

    .line 26
    iget v0, p0, Ln4/a$a;->k:I

    .line 27
    .line 28
    sub-int v9, v0, v1

    .line 29
    .line 30
    iget-object v4, p0, Ln4/a$a;->b:Lc4/v;

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    const/4 v10, 0x0

    .line 34
    move v8, v1

    .line 35
    invoke-interface/range {v4 .. v10}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 36
    .line 37
    .line 38
    iget-wide v2, p0, Ln4/a$a;->l:J

    .line 39
    .line 40
    int-to-long v4, p1

    .line 41
    add-long/2addr v2, v4

    .line 42
    iput-wide v2, p0, Ln4/a$a;->l:J

    .line 43
    .line 44
    iget p1, p0, Ln4/a$a;->k:I

    .line 45
    .line 46
    sub-int/2addr p1, v1

    .line 47
    iput p1, p0, Ln4/a$a;->k:I

    .line 48
    .line 49
    return-void
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

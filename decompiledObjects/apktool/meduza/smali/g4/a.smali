.class public final Lg4/a;
.super Lg4/d;
.source "SourceFile"


# static fields
.field public static final e:[I


# instance fields
.field public b:Z

.field public c:Z

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lg4/a;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1588
        0x2b11
        0x5622
        0xac44
    .end array-data
.end method

.method public constructor <init>(Lc4/v;)V
    .locals 0

    invoke-direct {p0, p1}, Lg4/d;-><init>(Lc4/v;)V

    return-void
.end method


# virtual methods
.method public final a(Lv5/u;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg4/a;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_5

    .line 5
    .line 6
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    shr-int/lit8 v0, p1, 0x4

    .line 11
    .line 12
    and-int/lit8 v0, v0, 0xf

    .line 13
    .line 14
    iput v0, p0, Lg4/a;->d:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    shr-int/2addr p1, v2

    .line 20
    and-int/lit8 p1, p1, 0x3

    .line 21
    .line 22
    sget-object v0, Lg4/a;->e:[I

    .line 23
    .line 24
    aget p1, v0, p1

    .line 25
    .line 26
    new-instance v0, Lv3/i0$a;

    .line 27
    .line 28
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "audio/mpeg"

    .line 32
    .line 33
    iput-object v2, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 34
    .line 35
    iput v1, v0, Lv3/i0$a;->x:I

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    const/4 p1, 0x7

    .line 39
    if-eq v0, p1, :cond_3

    .line 40
    .line 41
    const/16 v2, 0x8

    .line 42
    .line 43
    if-ne v0, v2, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 p1, 0xa

    .line 47
    .line 48
    if-ne v0, p1, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    new-instance p1, Lg4/d$a;

    .line 52
    .line 53
    const-string v0, "Audio format not supported: "

    .line 54
    .line 55
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v1, p0, Lg4/a;->d:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Lg4/d$a;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_3
    :goto_0
    if-ne v0, p1, :cond_4

    .line 73
    .line 74
    const-string p1, "audio/g711-alaw"

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const-string p1, "audio/g711-mlaw"

    .line 78
    .line 79
    :goto_1
    new-instance v0, Lv3/i0$a;

    .line 80
    .line 81
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 85
    .line 86
    iput v1, v0, Lv3/i0$a;->x:I

    .line 87
    .line 88
    const/16 p1, 0x1f40

    .line 89
    .line 90
    :goto_2
    iput p1, v0, Lv3/i0$a;->y:I

    .line 91
    .line 92
    invoke-virtual {v0}, Lv3/i0$a;->a()Lv3/i0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object v0, p0, Lg4/d;->a:Lc4/v;

    .line 97
    .line 98
    invoke-interface {v0, p1}, Lc4/v;->d(Lv3/i0;)V

    .line 99
    .line 100
    .line 101
    iput-boolean v1, p0, Lg4/a;->c:Z

    .line 102
    .line 103
    :goto_3
    iput-boolean v1, p0, Lg4/a;->b:Z

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    invoke-virtual {p1, v1}, Lv5/u;->H(I)V

    .line 107
    .line 108
    .line 109
    :goto_4
    return v1
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

.method public final b(JLv5/u;)Z
    .locals 10

    .line 1
    iget v0, p0, Lg4/a;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    iget v0, p3, Lv5/u;->c:I

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p3}, Lv5/u;->v()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-boolean v3, p0, Lg4/a;->c:Z

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    iget p1, p3, Lv5/u;->c:I

    .line 22
    .line 23
    iget p2, p3, Lv5/u;->b:I

    .line 24
    .line 25
    sub-int/2addr p1, p2

    .line 26
    new-array p2, p1, [B

    .line 27
    .line 28
    invoke-virtual {p3, p2, v2, p1}, Lv5/u;->d([BII)V

    .line 29
    .line 30
    .line 31
    new-instance p3, Lv5/t;

    .line 32
    .line 33
    invoke-direct {p3, p2, p1}, Lv5/t;-><init>([BI)V

    .line 34
    .line 35
    .line 36
    invoke-static {p3, v2}, Lx3/a;->c(Lv5/t;Z)Lx3/a$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p3, Lv3/i0$a;

    .line 41
    .line 42
    invoke-direct {p3}, Lv3/i0$a;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v0, "audio/mp4a-latm"

    .line 46
    .line 47
    iput-object v0, p3, Lv3/i0$a;->k:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, p1, Lx3/a$a;->c:Ljava/lang/String;

    .line 50
    .line 51
    iput-object v0, p3, Lv3/i0$a;->h:Ljava/lang/String;

    .line 52
    .line 53
    iget v0, p1, Lx3/a$a;->b:I

    .line 54
    .line 55
    iput v0, p3, Lv3/i0$a;->x:I

    .line 56
    .line 57
    iget p1, p1, Lx3/a$a;->a:I

    .line 58
    .line 59
    iput p1, p3, Lv3/i0$a;->y:I

    .line 60
    .line 61
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p3, Lv3/i0$a;->m:Ljava/util/List;

    .line 66
    .line 67
    new-instance p1, Lv3/i0;

    .line 68
    .line 69
    invoke-direct {p1, p3}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lg4/d;->a:Lc4/v;

    .line 73
    .line 74
    invoke-interface {p2, p1}, Lc4/v;->d(Lv3/i0;)V

    .line 75
    .line 76
    .line 77
    iput-boolean v1, p0, Lg4/a;->c:Z

    .line 78
    .line 79
    return v2

    .line 80
    :cond_1
    iget v3, p0, Lg4/a;->d:I

    .line 81
    .line 82
    const/16 v4, 0xa

    .line 83
    .line 84
    if-ne v3, v4, :cond_3

    .line 85
    .line 86
    if-ne v0, v1, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    return v2

    .line 90
    :cond_3
    :goto_0
    iget v0, p3, Lv5/u;->c:I

    .line 91
    .line 92
    :goto_1
    iget v2, p3, Lv5/u;->b:I

    .line 93
    .line 94
    sub-int v7, v0, v2

    .line 95
    .line 96
    iget-object v0, p0, Lg4/d;->a:Lc4/v;

    .line 97
    .line 98
    invoke-interface {v0, v7, p3}, Lc4/v;->b(ILv5/u;)V

    .line 99
    .line 100
    .line 101
    iget-object v3, p0, Lg4/d;->a:Lc4/v;

    .line 102
    .line 103
    const/4 v6, 0x1

    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x0

    .line 106
    move-wide v4, p1

    .line 107
    invoke-interface/range {v3 .. v9}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 108
    .line 109
    .line 110
    return v1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

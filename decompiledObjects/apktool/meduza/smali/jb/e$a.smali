.class public final Ljb/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lxc/s;

.field public c:I

.field public d:I

.field public e:[Ljb/d;

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Ljb/f$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    new-array v0, v0, [Ljb/d;

    .line 14
    .line 15
    iput-object v0, p0, Ljb/e$a;->e:[Ljb/d;

    .line 16
    .line 17
    const/4 v0, 0x7

    .line 18
    iput v0, p0, Ljb/e$a;->f:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Ljb/e$a;->g:I

    .line 22
    .line 23
    iput v0, p0, Ljb/e$a;->h:I

    .line 24
    .line 25
    const/16 v0, 0x1000

    .line 26
    .line 27
    iput v0, p0, Ljb/e$a;->c:I

    .line 28
    .line 29
    iput v0, p0, Ljb/e$a;->d:I

    .line 30
    .line 31
    new-instance v0, Lxc/s;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lxc/s;-><init>(Lxc/y;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Ljb/e$a;->b:Lxc/s;

    .line 37
    .line 38
    return-void
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


# virtual methods
.method public final a(I)I
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_1

    iget-object v1, p0, Ljb/e$a;->e:[Ljb/d;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget v2, p0, Ljb/e$a;->f:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Ljb/e$a;->e:[Ljb/d;

    aget-object v2, v2, v1

    iget v2, v2, Ljb/d;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, Ljb/e$a;->h:I

    sub-int/2addr v3, v2

    iput v3, p0, Ljb/e$a;->h:I

    iget v2, p0, Ljb/e$a;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ljb/e$a;->g:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ljb/e$a;->e:[Ljb/d;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, Ljb/e$a;->g:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Ljb/e$a;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Ljb/e$a;->f:I

    :cond_1
    return v0
.end method

.method public final b(I)Lxc/i;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    sget-object v1, Ljb/e;->b:[Ljb/d;

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    sub-int/2addr v1, v0

    .line 8
    if-gt p1, v1, :cond_0

    .line 9
    .line 10
    move v1, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget-object v0, Ljb/e;->b:[Ljb/d;

    .line 16
    .line 17
    aget-object p1, v0, p1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object v1, Ljb/e;->b:[Ljb/d;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    sub-int v1, p1, v1

    .line 24
    .line 25
    iget v2, p0, Ljb/e$a;->f:I

    .line 26
    .line 27
    add-int/2addr v2, v0

    .line 28
    add-int/2addr v2, v1

    .line 29
    if-ltz v2, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Ljb/e$a;->e:[Ljb/d;

    .line 32
    .line 33
    array-length v3, v1

    .line 34
    if-ge v2, v3, :cond_2

    .line 35
    .line 36
    aget-object p1, v1, v2

    .line 37
    .line 38
    :goto_1
    iget-object p1, p1, Ljb/d;->a:Lxc/i;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    new-instance v1, Ljava/io/IOException;

    .line 42
    .line 43
    const-string v2, "Header index too large "

    .line 44
    .line 45
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    add-int/2addr p1, v0

    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
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

.method public final c(Ljb/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljb/e$a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget v0, p1, Ljb/d;->c:I

    .line 7
    .line 8
    iget v1, p0, Ljb/e$a;->d:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Ljb/e$a;->e:[Ljb/d;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Ljb/e$a;->e:[Ljb/d;

    .line 20
    .line 21
    array-length p1, p1

    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    iput p1, p0, Ljb/e$a;->f:I

    .line 25
    .line 26
    iput v2, p0, Ljb/e$a;->g:I

    .line 27
    .line 28
    iput v2, p0, Ljb/e$a;->h:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget v3, p0, Ljb/e$a;->h:I

    .line 32
    .line 33
    add-int/2addr v3, v0

    .line 34
    sub-int/2addr v3, v1

    .line 35
    invoke-virtual {p0, v3}, Ljb/e$a;->a(I)I

    .line 36
    .line 37
    .line 38
    iget v1, p0, Ljb/e$a;->g:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iget-object v3, p0, Ljb/e$a;->e:[Ljb/d;

    .line 43
    .line 44
    array-length v4, v3

    .line 45
    if-le v1, v4, :cond_1

    .line 46
    .line 47
    array-length v1, v3

    .line 48
    mul-int/lit8 v1, v1, 0x2

    .line 49
    .line 50
    new-array v1, v1, [Ljb/d;

    .line 51
    .line 52
    array-length v4, v3

    .line 53
    array-length v5, v3

    .line 54
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Ljb/e$a;->e:[Ljb/d;

    .line 58
    .line 59
    array-length v2, v2

    .line 60
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    iput v2, p0, Ljb/e$a;->f:I

    .line 63
    .line 64
    iput-object v1, p0, Ljb/e$a;->e:[Ljb/d;

    .line 65
    .line 66
    :cond_1
    iget v1, p0, Ljb/e$a;->f:I

    .line 67
    .line 68
    add-int/lit8 v2, v1, -0x1

    .line 69
    .line 70
    iput v2, p0, Ljb/e$a;->f:I

    .line 71
    .line 72
    iget-object v2, p0, Ljb/e$a;->e:[Ljb/d;

    .line 73
    .line 74
    aput-object p1, v2, v1

    .line 75
    .line 76
    iget p1, p0, Ljb/e$a;->g:I

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    iput p1, p0, Ljb/e$a;->g:I

    .line 81
    .line 82
    iget p1, p0, Ljb/e$a;->h:I

    .line 83
    .line 84
    add-int/2addr p1, v0

    .line 85
    iput p1, p0, Ljb/e$a;->h:I

    .line 86
    .line 87
    return-void
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

.method public final d()Lxc/i;
    .locals 9

    .line 1
    iget-object v0, p0, Ljb/e$a;->b:Lxc/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxc/s;->readByte()B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    and-int/lit16 v1, v0, 0x80

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/16 v3, 0x80

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    const/16 v3, 0x7f

    .line 20
    .line 21
    invoke-virtual {p0, v0, v3}, Ljb/e$a;->e(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    sget-object v1, Ljb/g;->d:Ljb/g;

    .line 28
    .line 29
    iget-object v3, p0, Ljb/e$a;->b:Lxc/s;

    .line 30
    .line 31
    int-to-long v4, v0

    .line 32
    invoke-virtual {v3, v4, v5}, Lxc/s;->u0(J)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v3, Lxc/s;->b:Lxc/f;

    .line 36
    .line 37
    invoke-virtual {v0, v4, v5}, Lxc/f;->b0(J)[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, v1, Ljb/g;->a:Ljb/g$a;

    .line 50
    .line 51
    move v5, v2

    .line 52
    move-object v6, v4

    .line 53
    move v4, v5

    .line 54
    :goto_1
    array-length v7, v0

    .line 55
    if-ge v2, v7, :cond_3

    .line 56
    .line 57
    aget-byte v7, v0, v2

    .line 58
    .line 59
    and-int/lit16 v7, v7, 0xff

    .line 60
    .line 61
    shl-int/lit8 v4, v4, 0x8

    .line 62
    .line 63
    or-int/2addr v4, v7

    .line 64
    add-int/lit8 v5, v5, 0x8

    .line 65
    .line 66
    :goto_2
    const/16 v7, 0x8

    .line 67
    .line 68
    if-lt v5, v7, :cond_2

    .line 69
    .line 70
    add-int/lit8 v7, v5, -0x8

    .line 71
    .line 72
    ushr-int v8, v4, v7

    .line 73
    .line 74
    and-int/lit16 v8, v8, 0xff

    .line 75
    .line 76
    iget-object v6, v6, Ljb/g$a;->a:[Ljb/g$a;

    .line 77
    .line 78
    aget-object v6, v6, v8

    .line 79
    .line 80
    iget-object v8, v6, Ljb/g$a;->a:[Ljb/g$a;

    .line 81
    .line 82
    if-nez v8, :cond_1

    .line 83
    .line 84
    iget v7, v6, Ljb/g$a;->b:I

    .line 85
    .line 86
    invoke-virtual {v3, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 87
    .line 88
    .line 89
    iget v6, v6, Ljb/g$a;->c:I

    .line 90
    .line 91
    sub-int/2addr v5, v6

    .line 92
    iget-object v6, v1, Ljb/g;->a:Ljb/g$a;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    move v5, v7

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    :goto_3
    if-lez v5, :cond_5

    .line 101
    .line 102
    rsub-int/lit8 v0, v5, 0x8

    .line 103
    .line 104
    shl-int v0, v4, v0

    .line 105
    .line 106
    and-int/lit16 v0, v0, 0xff

    .line 107
    .line 108
    iget-object v2, v6, Ljb/g$a;->a:[Ljb/g$a;

    .line 109
    .line 110
    aget-object v0, v2, v0

    .line 111
    .line 112
    iget-object v2, v0, Ljb/g$a;->a:[Ljb/g$a;

    .line 113
    .line 114
    if-nez v2, :cond_5

    .line 115
    .line 116
    iget v2, v0, Ljb/g$a;->c:I

    .line 117
    .line 118
    if-le v2, v5, :cond_4

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    iget v2, v0, Ljb/g$a;->b:I

    .line 122
    .line 123
    invoke-virtual {v3, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 124
    .line 125
    .line 126
    iget v0, v0, Ljb/g$a;->c:I

    .line 127
    .line 128
    sub-int/2addr v5, v0

    .line 129
    iget-object v6, v1, Ljb/g;->a:Ljb/g$a;

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    :goto_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lxc/i;->o([B)Lxc/i;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0

    .line 141
    :cond_6
    iget-object v1, p0, Ljb/e$a;->b:Lxc/s;

    .line 142
    .line 143
    int-to-long v2, v0

    .line 144
    invoke-virtual {v1, v2, v3}, Lxc/s;->l(J)Lxc/i;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0
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

.method public final e(II)I
    .locals 2

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ljb/e$a;->b:Lxc/s;

    invoke-virtual {v0}, Lxc/s;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, p1

    add-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    shl-int p1, v0, p1

    add-int/2addr p2, p1

    return p2
.end method

.class public final Lz4/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public final synthetic b:Lz4/y;


# direct methods
.method public constructor <init>(Lz4/y;I)V
    .locals 0

    iput-object p1, p0, Lz4/y$c;->b:Lz4/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lz4/y$c;->a:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/y$c;->b:Lz4/y;

    .line 2
    .line 3
    iget v1, p0, Lz4/y$c;->a:I

    .line 4
    .line 5
    iget-object v2, v0, Lz4/y;->A:[Lz4/b0;

    .line 6
    .line 7
    aget-object v1, v2, v1

    .line 8
    .line 9
    invoke-virtual {v1}, Lz4/b0;->s()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lz4/y;->s:Lt5/d0;

    .line 13
    .line 14
    iget-object v2, v0, Lz4/y;->d:Lt5/c0;

    .line 15
    .line 16
    iget v0, v0, Lz4/y;->J:I

    .line 17
    .line 18
    check-cast v2, Lt5/u;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lt5/u;->b(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, v1, Lt5/d0;->c:Ljava/io/IOException;

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    iget-object v1, v1, Lt5/d0;->b:Lt5/d0$c;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const/high16 v2, -0x80000000

    .line 33
    .line 34
    if-ne v0, v2, :cond_0

    .line 35
    .line 36
    iget v0, v1, Lt5/d0$c;->a:I

    .line 37
    .line 38
    :cond_0
    iget-object v2, v1, Lt5/d0$c;->e:Ljava/io/IOException;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    iget v1, v1, Lt5/d0$c;->f:I

    .line 43
    .line 44
    if-gt v1, v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    throw v2

    .line 48
    :cond_2
    :goto_0
    return-void

    .line 49
    :cond_3
    throw v2
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

.method public final b()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz4/y$c;->b:Lz4/y;

    .line 2
    .line 3
    iget v1, p0, Lz4/y$c;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lz4/y;->D()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v0, Lz4/y;->A:[Lz4/b0;

    .line 12
    .line 13
    aget-object v1, v2, v1

    .line 14
    .line 15
    iget-boolean v0, v0, Lz4/y;->S:Z

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lz4/b0;->q(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    return v0
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

.method public final m(J)I
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/y$c;->b:Lz4/y;

    .line 2
    .line 3
    iget v1, p0, Lz4/y$c;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lz4/y;->D()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, v1}, Lz4/y;->z(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lz4/y;->A:[Lz4/b0;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    iget-boolean v3, v0, Lz4/y;->S:Z

    .line 21
    .line 22
    invoke-virtual {v2, p1, p2, v3}, Lz4/b0;->o(JZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v2, p1}, Lz4/b0;->y(I)V

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lz4/y;->A(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return p1
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

.method public final r(Ll3/l;Lz3/g;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lz4/y$c;->b:Lz4/y;

    .line 2
    .line 3
    iget v1, p0, Lz4/y$c;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lz4/y;->D()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, -0x3

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, v1}, Lz4/y;->z(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lz4/y;->A:[Lz4/b0;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    iget-boolean v4, v0, Lz4/y;->S:Z

    .line 21
    .line 22
    invoke-virtual {v2, p1, p2, p3, v4}, Lz4/b0;->u(Ll3/l;Lz3/g;IZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-ne p1, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lz4/y;->A(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    move v3, p1

    .line 32
    :goto_0
    return v3
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

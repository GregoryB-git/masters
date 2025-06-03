.class public final Lb5/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Lb5/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lz4/b0;

.field public final c:I

.field public d:Z

.field public final synthetic e:Lb5/h;


# direct methods
.method public constructor <init>(Lb5/h;Lb5/h;Lz4/b0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/h<",
            "TT;>;",
            "Lz4/b0;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lb5/h$a;->e:Lb5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb5/h$a;->a:Lb5/h;

    iput-object p3, p0, Lb5/h$a;->b:Lz4/b0;

    iput p4, p0, Lb5/h$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lb5/h$a;->e:Lb5/h;

    invoke-virtual {v0}, Lb5/h;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb5/h$a;->b:Lz4/b0;

    iget-object v1, p0, Lb5/h$a;->e:Lb5/h;

    iget-boolean v1, v1, Lb5/h;->E:Z

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

.method public final c()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lb5/h$a;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lb5/h$a;->e:Lb5/h;

    .line 6
    .line 7
    iget-object v1, v0, Lb5/h;->o:Lz4/w$a;

    .line 8
    .line 9
    iget-object v2, v0, Lb5/h;->b:[I

    .line 10
    .line 11
    iget v3, p0, Lb5/h$a;->c:I

    .line 12
    .line 13
    aget v2, v2, v3

    .line 14
    .line 15
    iget-object v4, v0, Lb5/h;->c:[Lv3/i0;

    .line 16
    .line 17
    aget-object v3, v4, v3

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    iget-wide v6, v0, Lb5/h;->B:J

    .line 22
    .line 23
    invoke-virtual/range {v1 .. v7}, Lz4/w$a;->b(ILv3/i0;ILjava/lang/Object;J)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lb5/h$a;->d:Z

    .line 28
    .line 29
    :cond_0
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

.method public final m(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/h$a;->e:Lb5/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/h;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, Lb5/h$a;->b:Lz4/b0;

    .line 12
    .line 13
    iget-object v1, p0, Lb5/h$a;->e:Lb5/h;

    .line 14
    .line 15
    iget-boolean v1, v1, Lb5/h;->E:Z

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, v1}, Lz4/b0;->o(JZ)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p2, p0, Lb5/h$a;->e:Lb5/h;

    .line 22
    .line 23
    iget-object p2, p2, Lb5/h;->D:Lb5/a;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget v0, p0, Lb5/h$a;->c:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lb5/a;->e(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, Lb5/h$a;->b:Lz4/b0;

    .line 36
    .line 37
    iget v1, v0, Lz4/b0;->q:I

    .line 38
    .line 39
    iget v0, v0, Lz4/b0;->s:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    sub-int/2addr p2, v1

    .line 43
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    :cond_1
    iget-object p2, p0, Lb5/h$a;->b:Lz4/b0;

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Lz4/b0;->y(I)V

    .line 50
    .line 51
    .line 52
    if-lez p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lb5/h$a;->c()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return p1
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
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/h$a;->e:Lb5/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/h;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x3

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lb5/h$a;->e:Lb5/h;

    .line 12
    .line 13
    iget-object v0, v0, Lb5/h;->D:Lb5/a;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v2, p0, Lb5/h$a;->c:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lb5/a;->e(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Lb5/h$a;->b:Lz4/b0;

    .line 26
    .line 27
    iget v3, v2, Lz4/b0;->q:I

    .line 28
    .line 29
    iget v2, v2, Lz4/b0;->s:I

    .line 30
    .line 31
    add-int/2addr v3, v2

    .line 32
    if-gt v0, v3, :cond_1

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    invoke-virtual {p0}, Lb5/h$a;->c()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lb5/h$a;->b:Lz4/b0;

    .line 39
    .line 40
    iget-object v1, p0, Lb5/h$a;->e:Lb5/h;

    .line 41
    .line 42
    iget-boolean v1, v1, Lb5/h;->E:Z

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2, p3, v1}, Lz4/b0;->u(Ll3/l;Lz3/g;IZ)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1
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

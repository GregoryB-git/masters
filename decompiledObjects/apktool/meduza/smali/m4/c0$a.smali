.class public final Lm4/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Lv5/t;

.field public final synthetic b:Lm4/c0;


# direct methods
.method public constructor <init>(Lm4/c0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lm4/c0$a;->b:Lm4/c0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lv5/t;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    invoke-direct {p1, v1, v0}, Lv5/t;-><init>([BI)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lm4/c0$a;->a:Lv5/t;

    .line 15
    .line 16
    return-void
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


# virtual methods
.method public final a(Lv5/u;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lv5/u;->v()I

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
    invoke-virtual {p1}, Lv5/u;->v()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    and-int/lit16 v0, v0, 0x80

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x6

    .line 18
    invoke-virtual {p1, v0}, Lv5/u;->H(I)V

    .line 19
    .line 20
    .line 21
    iget v0, p1, Lv5/u;->c:I

    .line 22
    .line 23
    iget v1, p1, Lv5/u;->b:I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    const/4 v1, 0x4

    .line 27
    div-int/2addr v0, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_0
    if-ge v3, v0, :cond_4

    .line 31
    .line 32
    iget-object v4, p0, Lm4/c0$a;->a:Lv5/t;

    .line 33
    .line 34
    iget-object v5, v4, Lv5/t;->a:[B

    .line 35
    .line 36
    invoke-virtual {p1, v5, v2, v1}, Lv5/u;->d([BII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Lv5/t;->k(I)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lm4/c0$a;->a:Lv5/t;

    .line 43
    .line 44
    const/16 v5, 0x10

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Lv5/t;->g(I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Lm4/c0$a;->a:Lv5/t;

    .line 51
    .line 52
    const/4 v6, 0x3

    .line 53
    invoke-virtual {v5, v6}, Lv5/t;->m(I)V

    .line 54
    .line 55
    .line 56
    const/16 v5, 0xd

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    iget-object v4, p0, Lm4/c0$a;->a:Lv5/t;

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Lv5/t;->m(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v4, p0, Lm4/c0$a;->a:Lv5/t;

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Lv5/t;->g(I)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iget-object v5, p0, Lm4/c0$a;->b:Lm4/c0;

    .line 73
    .line 74
    iget-object v5, v5, Lm4/c0;->f:Landroid/util/SparseArray;

    .line 75
    .line 76
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    iget-object v5, p0, Lm4/c0$a;->b:Lm4/c0;

    .line 83
    .line 84
    iget-object v6, v5, Lm4/c0;->f:Landroid/util/SparseArray;

    .line 85
    .line 86
    new-instance v7, Lm4/y;

    .line 87
    .line 88
    new-instance v8, Lm4/c0$b;

    .line 89
    .line 90
    invoke-direct {v8, v5, v4}, Lm4/c0$b;-><init>(Lm4/c0;I)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v7, v8}, Lm4/y;-><init>(Lm4/x;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v4, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v4, p0, Lm4/c0$a;->b:Lm4/c0;

    .line 100
    .line 101
    iget v5, v4, Lm4/c0;->l:I

    .line 102
    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    iput v5, v4, Lm4/c0;->l:I

    .line 106
    .line 107
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    iget-object p1, p0, Lm4/c0$a;->b:Lm4/c0;

    .line 111
    .line 112
    iget v0, p1, Lm4/c0;->a:I

    .line 113
    .line 114
    const/4 v1, 0x2

    .line 115
    if-eq v0, v1, :cond_5

    .line 116
    .line 117
    iget-object p1, p1, Lm4/c0;->f:Landroid/util/SparseArray;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-void
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

.method public final c(Lv5/c0;Lc4/j;Lm4/d0$d;)V
    .locals 0

    return-void
.end method

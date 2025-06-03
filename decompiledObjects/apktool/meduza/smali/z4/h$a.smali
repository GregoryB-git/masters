.class public final Lz4/h$a;
.super Lv3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final f:I

.field public final o:I

.field public final p:[I

.field public final q:[I

.field public final r:[Lv3/r1;

.field public final s:[Ljava/lang/Object;

.field public final t:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lz4/e0;Z)V
    .locals 4

    .line 1
    invoke-direct {p0, p3, p2}, Lv3/a;-><init>(ZLz4/e0;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    new-array p3, p2, [I

    .line 9
    .line 10
    iput-object p3, p0, Lz4/h$a;->p:[I

    .line 11
    .line 12
    new-array p3, p2, [I

    .line 13
    .line 14
    iput-object p3, p0, Lz4/h$a;->q:[I

    .line 15
    .line 16
    new-array p3, p2, [Lv3/r1;

    .line 17
    .line 18
    iput-object p3, p0, Lz4/h$a;->r:[Lv3/r1;

    .line 19
    .line 20
    new-array p2, p2, [Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p2, p0, Lz4/h$a;->s:[Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p2, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lz4/h$a;->t:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 p2, 0x0

    .line 36
    move p3, p2

    .line 37
    move v0, p3

    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lz4/h$d;

    .line 49
    .line 50
    iget-object v2, p0, Lz4/h$a;->r:[Lv3/r1;

    .line 51
    .line 52
    iget-object v3, v1, Lz4/h$d;->a:Lz4/p;

    .line 53
    .line 54
    iget-object v3, v3, Lz4/p;->w:Lz4/p$a;

    .line 55
    .line 56
    aput-object v3, v2, v0

    .line 57
    .line 58
    iget-object v2, p0, Lz4/h$a;->q:[I

    .line 59
    .line 60
    aput p2, v2, v0

    .line 61
    .line 62
    iget-object v2, p0, Lz4/h$a;->p:[I

    .line 63
    .line 64
    aput p3, v2, v0

    .line 65
    .line 66
    invoke-virtual {v3}, Lz4/l;->o()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr p2, v2

    .line 71
    iget-object v2, p0, Lz4/h$a;->r:[Lv3/r1;

    .line 72
    .line 73
    aget-object v2, v2, v0

    .line 74
    .line 75
    invoke-virtual {v2}, Lv3/r1;->h()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr p3, v2

    .line 80
    iget-object v2, p0, Lz4/h$a;->s:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, v1, Lz4/h$d;->b:Ljava/lang/Object;

    .line 83
    .line 84
    aput-object v1, v2, v0

    .line 85
    .line 86
    iget-object v2, p0, Lz4/h$a;->t:Ljava/util/HashMap;

    .line 87
    .line 88
    add-int/lit8 v3, v0, 0x1

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move v0, v3

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    iput p2, p0, Lz4/h$a;->f:I

    .line 100
    .line 101
    iput p3, p0, Lz4/h$a;->o:I

    .line 102
    .line 103
    return-void
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


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lz4/h$a;->o:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lz4/h$a;->f:I

    return v0
.end method

.method public final q(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lz4/h$a;->t:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final r(I)I
    .locals 2

    iget-object v0, p0, Lz4/h$a;->p:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lv5/e0;->e([IIZZ)I

    move-result p1

    return p1
.end method

.method public final s(I)I
    .locals 2

    iget-object v0, p0, Lz4/h$a;->q:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lv5/e0;->e([IIZZ)I

    move-result p1

    return p1
.end method

.method public final t(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz4/h$a;->s:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final u(I)I
    .locals 1

    iget-object v0, p0, Lz4/h$a;->p:[I

    aget p1, v0, p1

    return p1
.end method

.method public final v(I)I
    .locals 1

    iget-object v0, p0, Lz4/h$a;->q:[I

    aget p1, v0, p1

    return p1
.end method

.method public final x(I)Lv3/r1;
    .locals 1

    iget-object v0, p0, Lz4/h$a;->r:[Lv3/r1;

    aget-object p1, v0, p1

    return-object p1
.end method

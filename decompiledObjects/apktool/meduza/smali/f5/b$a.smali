.class public final Lf5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lf5/b;


# direct methods
.method public constructor <init>(Lf5/b;)V
    .locals 0

    iput-object p1, p0, Lf5/b$a;->a:Lf5/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Lt5/c0$c;Z)Z
    .locals 7

    .line 1
    iget-object p3, p0, Lf5/b$a;->a:Lf5/b;

    .line 2
    .line 3
    iget-object p3, p3, Lf5/b;->t:Lf5/e;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p3, :cond_2

    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object p3, p0, Lf5/b$a;->a:Lf5/b;

    .line 13
    .line 14
    iget-object p3, p3, Lf5/b;->r:Lf5/f;

    .line 15
    .line 16
    sget v3, Lv5/e0;->a:I

    .line 17
    .line 18
    iget-object p3, p3, Lf5/f;->e:Ljava/util/List;

    .line 19
    .line 20
    move v3, v0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-ge v3, v5, :cond_1

    .line 27
    .line 28
    iget-object v5, p0, Lf5/b$a;->a:Lf5/b;

    .line 29
    .line 30
    iget-object v5, v5, Lf5/b;->d:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Lf5/f$b;

    .line 37
    .line 38
    iget-object v6, v6, Lf5/f$b;->a:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lf5/b$b;

    .line 45
    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    iget-wide v5, v5, Lf5/b$b;->p:J

    .line 49
    .line 50
    cmp-long v5, v1, v5

    .line 51
    .line 52
    if-gez v5, :cond_0

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance p3, Lt5/c0$a;

    .line 60
    .line 61
    iget-object v1, p0, Lf5/b$a;->a:Lf5/b;

    .line 62
    .line 63
    iget-object v1, v1, Lf5/b;->r:Lf5/f;

    .line 64
    .line 65
    iget-object v1, v1, Lf5/f;->e:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-direct {p3, v2, v0, v1, v4}, Lt5/c0$a;-><init>(IIII)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lf5/b$a;->a:Lf5/b;

    .line 76
    .line 77
    iget-object v1, v1, Lf5/b;->c:Lt5/c0;

    .line 78
    .line 79
    check-cast v1, Lt5/u;

    .line 80
    .line 81
    invoke-virtual {v1, p3, p2}, Lt5/u;->a(Lt5/c0$a;Lt5/c0$c;)Lt5/c0$b;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    iget p3, p2, Lt5/c0$b;->a:I

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    if-ne p3, v1, :cond_2

    .line 91
    .line 92
    iget-object p3, p0, Lf5/b$a;->a:Lf5/b;

    .line 93
    .line 94
    iget-object p3, p3, Lf5/b;->d:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lf5/b$b;

    .line 101
    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    iget-wide p2, p2, Lt5/c0$b;->b:J

    .line 105
    .line 106
    invoke-static {p1, p2, p3}, Lf5/b$b;->a(Lf5/b$b;J)Z

    .line 107
    .line 108
    .line 109
    :cond_2
    return v0
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

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/b$a;->a:Lf5/b;

    .line 2
    .line 3
    iget-object v0, v0, Lf5/b;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

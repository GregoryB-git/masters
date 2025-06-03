.class public final La4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/i;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lv3/o0$d;

.field public c:La4/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La4/c;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Lv3/o0$d;)La4/b;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lt5/s$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lt5/s$a;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, v1, Lt5/s$a;->b:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v6, La4/t;

    .line 12
    .line 13
    iget-object v3, v0, Lv3/o0$d;->b:Landroid/net/Uri;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    move-object v3, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :goto_0
    iget-boolean v4, v0, Lv3/o0$d;->f:Z

    .line 24
    .line 25
    invoke-direct {v6, v3, v4, v1}, La4/t;-><init>(Ljava/lang/String;ZLt5/s$a;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lv3/o0$d;->c:Lo7/u;

    .line 29
    .line 30
    iget-object v3, v1, Lo7/u;->a:Lo7/x;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Lo7/u;->c()Lo7/m0$a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v1, Lo7/u;->a:Lo7/x;

    .line 39
    .line 40
    :cond_1
    invoke-virtual {v3}, Lo7/r;->n()Lo7/x0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v5, v6, La4/t;->d:Ljava/util/HashMap;

    .line 75
    .line 76
    monitor-enter v5

    .line 77
    :try_start_0
    iget-object v7, v6, La4/t;->d:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v7, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    monitor-exit v5

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    throw v0

    .line 87
    :cond_2
    new-instance v7, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    sget-object v1, Lv3/h;->a:Ljava/util/UUID;

    .line 93
    .line 94
    new-instance v11, Lt5/u;

    .line 95
    .line 96
    invoke-direct {v11}, Lt5/u;-><init>()V

    .line 97
    .line 98
    .line 99
    const-wide/32 v12, 0x493e0

    .line 100
    .line 101
    .line 102
    iget-object v4, v0, Lv3/o0$d;->a:Ljava/util/UUID;

    .line 103
    .line 104
    sget-object v5, La4/s;->d:Lg;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-boolean v8, v0, Lv3/o0$d;->d:Z

    .line 110
    .line 111
    iget-boolean v10, v0, Lv3/o0$d;->e:Z

    .line 112
    .line 113
    iget-object v1, v0, Lv3/o0$d;->g:Lo7/t;

    .line 114
    .line 115
    invoke-static {v1}, Lr7/a;->F(Ljava/util/Collection;)[I

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    array-length v3, v1

    .line 120
    const/4 v9, 0x0

    .line 121
    :goto_2
    if-ge v9, v3, :cond_5

    .line 122
    .line 123
    aget v15, v1, v9

    .line 124
    .line 125
    const/4 v2, 0x2

    .line 126
    const/4 v14, 0x1

    .line 127
    if-eq v15, v2, :cond_4

    .line 128
    .line 129
    if-ne v15, v14, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    const/4 v14, 0x0

    .line 133
    :cond_4
    :goto_3
    invoke-static {v14}, Lx6/b;->q(Z)V

    .line 134
    .line 135
    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    goto :goto_2

    .line 140
    :cond_5
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v9, v1

    .line 145
    check-cast v9, [I

    .line 146
    .line 147
    new-instance v1, La4/b;

    .line 148
    .line 149
    move-object v3, v1

    .line 150
    invoke-direct/range {v3 .. v13}, La4/b;-><init>(Ljava/util/UUID;La4/o$c;La4/w;Ljava/util/HashMap;Z[IZLt5/u;J)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, Lv3/o0$d;->h:[B

    .line 154
    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    array-length v2, v0

    .line 158
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    const/4 v2, 0x0

    .line 164
    :goto_4
    iget-object v0, v1, La4/b;->m:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 171
    .line 172
    .line 173
    const/4 v0, 0x0

    .line 174
    iput v0, v1, La4/b;->v:I

    .line 175
    .line 176
    iput-object v2, v1, La4/b;->w:[B

    .line 177
    .line 178
    return-object v1
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


# virtual methods
.method public final a(Lv3/o0;)La4/h;
    .locals 2

    .line 1
    iget-object v0, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 7
    .line 8
    iget-object p1, p1, Lv3/o0$f;->c:Lv3/o0$d;

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    sget v0, Lv5/e0;->a:I

    .line 13
    .line 14
    const/16 v1, 0x12

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, La4/c;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, La4/c;->b:Lv3/o0$d;

    .line 23
    .line 24
    invoke-static {p1, v1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    iput-object p1, p0, La4/c;->b:Lv3/o0$d;

    .line 31
    .line 32
    invoke-static {p1}, La4/c;->b(Lv3/o0$d;)La4/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La4/c;->c:La4/b;

    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, La4/c;->c:La4/b;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-object p1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_2
    :goto_0
    sget-object p1, La4/h;->a:La4/h$a;

    .line 49
    .line 50
    return-object p1
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

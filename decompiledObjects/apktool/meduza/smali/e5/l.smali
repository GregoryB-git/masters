.class public final Le5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/r;
.implements Lf5/j$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5/l$a;
    }
.end annotation


# instance fields
.field public A:I

.field public B:Lz4/j0;

.field public C:[Le5/n;

.field public D:[Le5/n;

.field public E:I

.field public F:Lb1/v;

.field public final a:Le5/i;

.field public final b:Lf5/j;

.field public final c:Le5/h;

.field public final d:Lt5/l0;

.field public final e:La4/h;

.field public final f:La4/g$a;

.field public final o:Lt5/c0;

.field public final p:Lz4/w$a;

.field public final q:Lt5/b;

.field public final r:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lz4/c0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ld2/h0;

.field public final t:Lz4/i;

.field public final u:Z

.field public final v:I

.field public final w:Z

.field public final x:Lw3/a0;

.field public final y:Le5/l$a;

.field public z:Lz4/r$a;


# direct methods
.method public constructor <init>(Le5/i;Lf5/j;Le5/h;Lt5/l0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;Lt5/b;Lz4/i;ZIZLw3/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/l;->a:Le5/i;

    iput-object p2, p0, Le5/l;->b:Lf5/j;

    iput-object p3, p0, Le5/l;->c:Le5/h;

    iput-object p4, p0, Le5/l;->d:Lt5/l0;

    iput-object p5, p0, Le5/l;->e:La4/h;

    iput-object p6, p0, Le5/l;->f:La4/g$a;

    iput-object p7, p0, Le5/l;->o:Lt5/c0;

    iput-object p8, p0, Le5/l;->p:Lz4/w$a;

    iput-object p9, p0, Le5/l;->q:Lt5/b;

    iput-object p10, p0, Le5/l;->t:Lz4/i;

    iput-boolean p11, p0, Le5/l;->u:Z

    iput p12, p0, Le5/l;->v:I

    iput-boolean p13, p0, Le5/l;->w:Z

    iput-object p14, p0, Le5/l;->x:Lw3/a0;

    new-instance p1, Le5/l$a;

    invoke-direct {p1, p0}, Le5/l$a;-><init>(Le5/l;)V

    iput-object p1, p0, Le5/l;->y:Le5/l$a;

    const/4 p1, 0x0

    new-array p2, p1, [Lz4/d0;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    new-instance p3, Lb1/v;

    invoke-direct {p3, p2}, Lb1/v;-><init>(Ljava/lang/Object;)V

    .line 2
    iput-object p3, p0, Le5/l;->F:Lb1/v;

    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, Le5/l;->r:Ljava/util/IdentityHashMap;

    new-instance p2, Ld2/h0;

    const/4 p3, 0x3

    invoke-direct {p2, p3}, Ld2/h0;-><init>(I)V

    iput-object p2, p0, Le5/l;->s:Ld2/h0;

    new-array p2, p1, [Le5/n;

    iput-object p2, p0, Le5/l;->C:[Le5/n;

    new-array p1, p1, [Le5/n;

    iput-object p1, p0, Le5/l;->D:[Le5/n;

    return-void
.end method

.method public static k(Lv3/i0;Lv3/i0;Z)Lv3/i0;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, -0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p1, Lv3/i0;->q:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p1, Lv3/i0;->r:Lp4/a;

    .line 9
    .line 10
    iget v3, p1, Lv3/i0;->G:I

    .line 11
    .line 12
    iget v4, p1, Lv3/i0;->d:I

    .line 13
    .line 14
    iget v5, p1, Lv3/i0;->e:I

    .line 15
    .line 16
    iget-object v6, p1, Lv3/i0;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p1, Lv3/i0;->b:Ljava/lang/String;

    .line 19
    .line 20
    move-object v10, v6

    .line 21
    move v6, v3

    .line 22
    move v3, v5

    .line 23
    move-object v5, v10

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lv3/i0;->q:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-static {v3, p1}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v3, p0, Lv3/i0;->r:Lp4/a;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget v0, p0, Lv3/i0;->G:I

    .line 37
    .line 38
    iget v1, p0, Lv3/i0;->d:I

    .line 39
    .line 40
    iget v4, p0, Lv3/i0;->e:I

    .line 41
    .line 42
    iget-object v5, p0, Lv3/i0;->c:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v6, p0, Lv3/i0;->b:Ljava/lang/String;

    .line 45
    .line 46
    move v10, v0

    .line 47
    move-object v0, p1

    .line 48
    move-object p1, v6

    .line 49
    move v6, v10

    .line 50
    move v11, v4

    .line 51
    move v4, v1

    .line 52
    move-object v1, v3

    .line 53
    move v3, v11

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v5, v0

    .line 56
    move v4, v1

    .line 57
    move v6, v2

    .line 58
    move-object v0, p1

    .line 59
    move-object p1, v5

    .line 60
    move-object v1, v3

    .line 61
    move v3, v4

    .line 62
    :goto_0
    invoke-static {v0}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    iget v8, p0, Lv3/i0;->f:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v8, v2

    .line 72
    :goto_1
    if-eqz p2, :cond_3

    .line 73
    .line 74
    iget v2, p0, Lv3/i0;->o:I

    .line 75
    .line 76
    :cond_3
    new-instance p2, Lv3/i0$a;

    .line 77
    .line 78
    invoke-direct {p2}, Lv3/i0$a;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v9, p0, Lv3/i0;->a:Ljava/lang/String;

    .line 82
    .line 83
    iput-object v9, p2, Lv3/i0$a;->a:Ljava/lang/String;

    .line 84
    .line 85
    iput-object p1, p2, Lv3/i0$a;->b:Ljava/lang/String;

    .line 86
    .line 87
    iget-object p0, p0, Lv3/i0;->s:Ljava/lang/String;

    .line 88
    .line 89
    iput-object p0, p2, Lv3/i0$a;->j:Ljava/lang/String;

    .line 90
    .line 91
    iput-object v7, p2, Lv3/i0$a;->k:Ljava/lang/String;

    .line 92
    .line 93
    iput-object v0, p2, Lv3/i0$a;->h:Ljava/lang/String;

    .line 94
    .line 95
    iput-object v1, p2, Lv3/i0$a;->i:Lp4/a;

    .line 96
    .line 97
    iput v8, p2, Lv3/i0$a;->f:I

    .line 98
    .line 99
    iput v2, p2, Lv3/i0$a;->g:I

    .line 100
    .line 101
    iput v6, p2, Lv3/i0$a;->x:I

    .line 102
    .line 103
    iput v4, p2, Lv3/i0$a;->d:I

    .line 104
    .line 105
    iput v3, p2, Lv3/i0$a;->e:I

    .line 106
    .line 107
    iput-object v5, p2, Lv3/i0$a;->c:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p2}, Lv3/i0$a;->a()Lv3/i0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
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
.method public final a(Landroid/net/Uri;Lt5/c0$c;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Le5/l;->C:[Le5/n;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    :goto_0
    if-ge v6, v3, :cond_a

    .line 11
    .line 12
    aget-object v8, v2, v6

    .line 13
    .line 14
    iget-object v9, v8, Le5/n;->d:Le5/g;

    .line 15
    .line 16
    iget-object v9, v9, Le5/g;->e:[Landroid/net/Uri;

    .line 17
    .line 18
    invoke-static {v1, v9}, Lv5/e0;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    if-nez v9, :cond_0

    .line 23
    .line 24
    move-object/from16 v13, p2

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_0
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    if-nez p3, :cond_1

    .line 34
    .line 35
    iget-object v11, v8, Le5/n;->q:Lt5/c0;

    .line 36
    .line 37
    iget-object v12, v8, Le5/n;->d:Le5/g;

    .line 38
    .line 39
    iget-object v12, v12, Le5/g;->q:Lr5/h;

    .line 40
    .line 41
    invoke-static {v12}, Lr5/n;->a(Lr5/h;)Lt5/c0$a;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    check-cast v11, Lt5/u;

    .line 46
    .line 47
    move-object/from16 v13, p2

    .line 48
    .line 49
    invoke-virtual {v11, v12, v13}, Lt5/u;->a(Lt5/c0$a;Lt5/c0$c;)Lt5/c0$b;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    if-eqz v11, :cond_2

    .line 54
    .line 55
    iget v12, v11, Lt5/c0$b;->a:I

    .line 56
    .line 57
    const/4 v14, 0x2

    .line 58
    if-ne v12, v14, :cond_2

    .line 59
    .line 60
    iget-wide v11, v11, Lt5/c0$b;->b:J

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object/from16 v13, p2

    .line 64
    .line 65
    :cond_2
    move-wide v11, v9

    .line 66
    :goto_1
    iget-object v8, v8, Le5/n;->d:Le5/g;

    .line 67
    .line 68
    const/4 v14, 0x0

    .line 69
    :goto_2
    iget-object v15, v8, Le5/g;->e:[Landroid/net/Uri;

    .line 70
    .line 71
    array-length v4, v15

    .line 72
    const/4 v5, -0x1

    .line 73
    if-ge v14, v4, :cond_4

    .line 74
    .line 75
    aget-object v4, v15, v14

    .line 76
    .line 77
    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v14, v5

    .line 88
    :goto_3
    if-ne v14, v5, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    iget-object v4, v8, Le5/g;->q:Lr5/h;

    .line 92
    .line 93
    invoke-interface {v4, v14}, Lr5/k;->f(I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-ne v4, v5, :cond_6

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    iget-boolean v5, v8, Le5/g;->s:Z

    .line 101
    .line 102
    iget-object v14, v8, Le5/g;->o:Landroid/net/Uri;

    .line 103
    .line 104
    invoke-virtual {v1, v14}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    or-int/2addr v5, v14

    .line 109
    iput-boolean v5, v8, Le5/g;->s:Z

    .line 110
    .line 111
    cmp-long v5, v11, v9

    .line 112
    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    iget-object v5, v8, Le5/g;->q:Lr5/h;

    .line 116
    .line 117
    invoke-interface {v5, v4, v11, v12}, Lr5/h;->k(IJ)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_7

    .line 122
    .line 123
    iget-object v4, v8, Le5/g;->g:Lf5/j;

    .line 124
    .line 125
    invoke-interface {v4, v1, v11, v12}, Lf5/j;->i(Landroid/net/Uri;J)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    const/4 v4, 0x0

    .line 133
    goto :goto_5

    .line 134
    :cond_8
    :goto_4
    const/4 v4, 0x1

    .line 135
    :goto_5
    if-eqz v4, :cond_9

    .line 136
    .line 137
    cmp-long v4, v11, v9

    .line 138
    .line 139
    if-eqz v4, :cond_9

    .line 140
    .line 141
    :goto_6
    const/4 v4, 0x1

    .line 142
    goto :goto_7

    .line 143
    :cond_9
    const/4 v4, 0x0

    .line 144
    :goto_7
    and-int/2addr v7, v4

    .line 145
    add-int/lit8 v6, v6, 0x1

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_a
    iget-object v1, v0, Le5/l;->z:Lz4/r$a;

    .line 150
    .line 151
    invoke-interface {v1, v0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 152
    .line 153
    .line 154
    return v7
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

.method public final b(Ljava/lang/String;I[Landroid/net/Uri;[Lv3/i0;Lv3/i0;Ljava/util/List;Ljava/util/Map;J)Le5/n;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[",
            "Landroid/net/Uri;",
            "[",
            "Lv3/i0;",
            "Lv3/i0;",
            "Ljava/util/List<",
            "Lv3/i0;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La4/d;",
            ">;J)",
            "Le5/n;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v11, Le5/g;

    iget-object v2, v0, Le5/l;->a:Le5/i;

    iget-object v3, v0, Le5/l;->b:Lf5/j;

    iget-object v6, v0, Le5/l;->c:Le5/h;

    iget-object v7, v0, Le5/l;->d:Lt5/l0;

    iget-object v8, v0, Le5/l;->s:Ld2/h0;

    iget-object v10, v0, Le5/l;->x:Lw3/a0;

    move-object v1, v11

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v10}, Le5/g;-><init>(Le5/i;Lf5/j;[Landroid/net/Uri;[Lv3/i0;Le5/h;Lt5/l0;Ld2/h0;Ljava/util/List;Lw3/a0;)V

    new-instance v16, Le5/n;

    iget-object v4, v0, Le5/l;->y:Le5/l$a;

    iget-object v7, v0, Le5/l;->q:Lt5/b;

    iget-object v12, v0, Le5/l;->e:La4/h;

    iget-object v13, v0, Le5/l;->f:La4/g$a;

    iget-object v14, v0, Le5/l;->o:Lt5/c0;

    iget-object v15, v0, Le5/l;->p:Lz4/w$a;

    iget v10, v0, Le5/l;->v:I

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object v5, v11

    move-object/from16 v6, p7

    move-wide/from16 v8, p8

    move/from16 v17, v10

    move-object/from16 v10, p5

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move/from16 v15, v17

    invoke-direct/range {v1 .. v15}, Le5/n;-><init>(Ljava/lang/String;ILe5/l$a;Le5/g;Ljava/util/Map;Lt5/b;JLv3/i0;La4/h;La4/g$a;Lt5/c0;Lz4/w$a;I)V

    return-object v16
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Le5/l;->F:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Le5/l;->B:Lz4/j0;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Le5/l;->C:[Le5/n;

    .line 6
    .line 7
    array-length p2, p1

    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    if-ge v1, p2, :cond_1

    .line 11
    .line 12
    aget-object v2, p1, v1

    .line 13
    .line 14
    iget-boolean v3, v2, Le5/n;->L:Z

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    iget-wide v3, v2, Le5/n;->X:J

    .line 19
    .line 20
    invoke-virtual {v2, v3, v4}, Le5/n;->d(J)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v0

    .line 27
    :cond_2
    iget-object v0, p0, Le5/l;->F:Lb1/v;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lb1/v;->d(J)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
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

.method public final e(JLv3/n1;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Le5/l;->D:[Le5/n;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    move v4, v3

    .line 8
    :goto_0
    if-ge v4, v2, :cond_5

    .line 9
    .line 10
    aget-object v5, v1, v4

    .line 11
    .line 12
    iget v6, v5, Le5/n;->I:I

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    if-ne v6, v7, :cond_0

    .line 17
    .line 18
    move v6, v8

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v6, v3

    .line 21
    :goto_1
    if-eqz v6, :cond_4

    .line 22
    .line 23
    iget-object v1, v5, Le5/n;->d:Le5/g;

    .line 24
    .line 25
    iget-object v2, v1, Le5/g;->q:Lr5/h;

    .line 26
    .line 27
    invoke-interface {v2}, Lr5/h;->i()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, v1, Le5/g;->e:[Landroid/net/Uri;

    .line 32
    .line 33
    array-length v4, v3

    .line 34
    if-ge v2, v4, :cond_1

    .line 35
    .line 36
    const/4 v4, -0x1

    .line 37
    if-eq v2, v4, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Le5/g;->g:Lf5/j;

    .line 40
    .line 41
    iget-object v4, v1, Le5/g;->q:Lr5/h;

    .line 42
    .line 43
    invoke-interface {v4}, Lr5/h;->o()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    aget-object v3, v3, v4

    .line 48
    .line 49
    invoke-interface {v2, v8, v3}, Lf5/j;->m(ZLandroid/net/Uri;)Lf5/e;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const/4 v2, 0x0

    .line 55
    :goto_2
    if-eqz v2, :cond_5

    .line 56
    .line 57
    iget-object v3, v2, Lf5/e;->r:Lo7/t;

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    iget-boolean v3, v2, Lf5/g;->c:Z

    .line 66
    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_2
    iget-wide v3, v2, Lf5/e;->h:J

    .line 71
    .line 72
    iget-object v1, v1, Le5/g;->g:Lf5/j;

    .line 73
    .line 74
    invoke-interface {v1}, Lf5/j;->e()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    sub-long/2addr v3, v5

    .line 79
    sub-long v10, p1, v3

    .line 80
    .line 81
    iget-object v1, v2, Lf5/e;->r:Lo7/t;

    .line 82
    .line 83
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v1, v5, v8}, Lv5/e0;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v5, v2, Lf5/e;->r:Lo7/t;

    .line 92
    .line 93
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lf5/e$c;

    .line 98
    .line 99
    iget-wide v12, v5, Lf5/e$d;->e:J

    .line 100
    .line 101
    iget-object v5, v2, Lf5/e;->r:Lo7/t;

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    sub-int/2addr v5, v8

    .line 108
    if-eq v1, v5, :cond_3

    .line 109
    .line 110
    iget-object v2, v2, Lf5/e;->r:Lo7/t;

    .line 111
    .line 112
    add-int/2addr v1, v8

    .line 113
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lf5/e$c;

    .line 118
    .line 119
    iget-wide v1, v1, Lf5/e$d;->e:J

    .line 120
    .line 121
    move-wide v14, v1

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    move-wide v14, v12

    .line 124
    :goto_3
    move-object/from16 v9, p3

    .line 125
    .line 126
    invoke-virtual/range {v9 .. v15}, Lv3/n1;->a(JJJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v1

    .line 130
    add-long/2addr v1, v3

    .line 131
    goto :goto_5

    .line 132
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    :goto_4
    move-wide/from16 v1, p1

    .line 136
    .line 137
    :goto_5
    return-wide v1
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

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Le5/l;->C:[Le5/n;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_3

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v4, v3, Le5/n;->v:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v4, v3, Le5/n;->v:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {v4}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Le5/j;

    .line 25
    .line 26
    iget-object v5, v3, Le5/n;->d:Le5/g;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Le5/g;->b(Le5/j;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x1

    .line 33
    if-ne v5, v6, :cond_1

    .line 34
    .line 35
    iput-boolean v6, v4, Le5/j;->K:Z

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    if-ne v5, v4, :cond_2

    .line 40
    .line 41
    iget-boolean v4, v3, Le5/n;->b0:Z

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    iget-object v4, v3, Le5/n;->r:Lt5/d0;

    .line 46
    .line 47
    invoke-virtual {v4}, Lt5/d0;->d()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    iget-object v3, v3, Le5/n;->r:Lt5/d0;

    .line 54
    .line 55
    invoke-virtual {v3}, Lt5/d0;->b()V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, p0, Le5/l;->z:Lz4/r$a;

    .line 62
    .line 63
    invoke-interface {v0, p0}, Lz4/d0$a;->a(Lz4/d0;)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public final g()J
    .locals 2

    iget-object v0, p0, Le5/l;->F:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(J)V
    .locals 1

    iget-object v0, p0, Le5/l;->F:Lb1/v;

    invoke-virtual {v0, p1, p2}, Lb1/v;->h(J)V

    return-void
.end method

.method public final i([Lr5/h;[Z[Lz4/c0;[ZJ)J
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v3, p5

    .line 8
    .line 9
    array-length v5, v1

    .line 10
    new-array v5, v5, [I

    .line 11
    .line 12
    array-length v6, v1

    .line 13
    new-array v6, v6, [I

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    :goto_0
    array-length v9, v1

    .line 17
    const/4 v10, -0x1

    .line 18
    if-ge v8, v9, :cond_3

    .line 19
    .line 20
    aget-object v9, v2, v8

    .line 21
    .line 22
    if-nez v9, :cond_0

    .line 23
    .line 24
    move v9, v10

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v11, v0, Le5/l;->r:Ljava/util/IdentityHashMap;

    .line 27
    .line 28
    invoke-virtual {v11, v9}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    check-cast v9, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    :goto_1
    aput v9, v5, v8

    .line 39
    .line 40
    aput v10, v6, v8

    .line 41
    .line 42
    aget-object v9, v1, v8

    .line 43
    .line 44
    if-eqz v9, :cond_2

    .line 45
    .line 46
    invoke-interface {v9}, Lr5/k;->a()Lz4/i0;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const/4 v11, 0x0

    .line 51
    :goto_2
    iget-object v12, v0, Le5/l;->C:[Le5/n;

    .line 52
    .line 53
    array-length v13, v12

    .line 54
    if-ge v11, v13, :cond_2

    .line 55
    .line 56
    aget-object v12, v12, v11

    .line 57
    .line 58
    invoke-virtual {v12}, Le5/n;->b()V

    .line 59
    .line 60
    .line 61
    iget-object v12, v12, Le5/n;->Q:Lz4/j0;

    .line 62
    .line 63
    invoke-virtual {v12, v9}, Lz4/j0;->b(Lz4/i0;)I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-eq v12, v10, :cond_1

    .line 68
    .line 69
    aput v11, v6, v8

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object v8, v0, Le5/l;->r:Ljava/util/IdentityHashMap;

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/util/IdentityHashMap;->clear()V

    .line 81
    .line 82
    .line 83
    array-length v8, v1

    .line 84
    new-array v9, v8, [Lz4/c0;

    .line 85
    .line 86
    array-length v11, v1

    .line 87
    new-array v12, v11, [Lz4/c0;

    .line 88
    .line 89
    array-length v13, v1

    .line 90
    new-array v14, v13, [Lr5/h;

    .line 91
    .line 92
    iget-object v15, v0, Le5/l;->C:[Le5/n;

    .line 93
    .line 94
    array-length v15, v15

    .line 95
    new-array v15, v15, [Le5/n;

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    :goto_4
    iget-object v10, v0, Le5/l;->C:[Le5/n;

    .line 103
    .line 104
    array-length v10, v10

    .line 105
    if-ge v7, v10, :cond_27

    .line 106
    .line 107
    move/from16 v18, v8

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    :goto_5
    array-length v8, v1

    .line 111
    move-object/from16 v19, v15

    .line 112
    .line 113
    if-ge v10, v8, :cond_6

    .line 114
    .line 115
    aget v8, v5, v10

    .line 116
    .line 117
    if-ne v8, v7, :cond_4

    .line 118
    .line 119
    aget-object v8, v2, v10

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_4
    const/4 v8, 0x0

    .line 123
    :goto_6
    aput-object v8, v12, v10

    .line 124
    .line 125
    aget v8, v6, v10

    .line 126
    .line 127
    if-ne v8, v7, :cond_5

    .line 128
    .line 129
    aget-object v15, v1, v10

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_5
    const/4 v15, 0x0

    .line 133
    :goto_7
    aput-object v15, v14, v10

    .line 134
    .line 135
    add-int/lit8 v10, v10, 0x1

    .line 136
    .line 137
    move-object/from16 v15, v19

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    iget-object v8, v0, Le5/l;->C:[Le5/n;

    .line 141
    .line 142
    aget-object v8, v8, v7

    .line 143
    .line 144
    invoke-virtual {v8}, Le5/n;->b()V

    .line 145
    .line 146
    .line 147
    iget v10, v8, Le5/n;->M:I

    .line 148
    .line 149
    const/4 v15, 0x0

    .line 150
    :goto_8
    if-ge v15, v13, :cond_a

    .line 151
    .line 152
    aget-object v20, v12, v15

    .line 153
    .line 154
    move-object/from16 v2, v20

    .line 155
    .line 156
    check-cast v2, Le5/m;

    .line 157
    .line 158
    if-eqz v2, :cond_9

    .line 159
    .line 160
    aget-object v20, v14, v15

    .line 161
    .line 162
    if-eqz v20, :cond_7

    .line 163
    .line 164
    aget-boolean v20, p2, v15

    .line 165
    .line 166
    if-nez v20, :cond_9

    .line 167
    .line 168
    :cond_7
    move-object/from16 v20, v5

    .line 169
    .line 170
    iget v5, v8, Le5/n;->M:I

    .line 171
    .line 172
    const/4 v0, -0x1

    .line 173
    add-int/2addr v5, v0

    .line 174
    iput v5, v8, Le5/n;->M:I

    .line 175
    .line 176
    iget v5, v2, Le5/m;->c:I

    .line 177
    .line 178
    if-eq v5, v0, :cond_8

    .line 179
    .line 180
    iget-object v0, v2, Le5/m;->b:Le5/n;

    .line 181
    .line 182
    iget v5, v2, Le5/m;->a:I

    .line 183
    .line 184
    invoke-virtual {v0}, Le5/n;->b()V

    .line 185
    .line 186
    .line 187
    move-object/from16 v21, v9

    .line 188
    .line 189
    iget-object v9, v0, Le5/n;->S:[I

    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-object v9, v0, Le5/n;->S:[I

    .line 195
    .line 196
    aget v5, v9, v5

    .line 197
    .line 198
    iget-object v9, v0, Le5/n;->V:[Z

    .line 199
    .line 200
    aget-boolean v9, v9, v5

    .line 201
    .line 202
    invoke-static {v9}, Lx6/b;->H(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, Le5/n;->V:[Z

    .line 206
    .line 207
    const/4 v9, 0x0

    .line 208
    aput-boolean v9, v0, v5

    .line 209
    .line 210
    const/4 v0, -0x1

    .line 211
    iput v0, v2, Le5/m;->c:I

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_8
    move-object/from16 v21, v9

    .line 215
    .line 216
    :goto_9
    const/4 v2, 0x0

    .line 217
    aput-object v2, v12, v15

    .line 218
    .line 219
    goto :goto_a

    .line 220
    :cond_9
    move-object/from16 v20, v5

    .line 221
    .line 222
    move-object/from16 v21, v9

    .line 223
    .line 224
    const/4 v0, -0x1

    .line 225
    :goto_a
    add-int/lit8 v15, v15, 0x1

    .line 226
    .line 227
    move-object/from16 v0, p0

    .line 228
    .line 229
    move-object/from16 v2, p3

    .line 230
    .line 231
    move-object/from16 v5, v20

    .line 232
    .line 233
    move-object/from16 v9, v21

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_a
    move-object/from16 v20, v5

    .line 237
    .line 238
    move-object/from16 v21, v9

    .line 239
    .line 240
    const/4 v0, -0x1

    .line 241
    if-nez v17, :cond_d

    .line 242
    .line 243
    iget-boolean v2, v8, Le5/n;->a0:Z

    .line 244
    .line 245
    if-eqz v2, :cond_b

    .line 246
    .line 247
    if-nez v10, :cond_c

    .line 248
    .line 249
    goto :goto_b

    .line 250
    :cond_b
    iget-wide v0, v8, Le5/n;->X:J

    .line 251
    .line 252
    cmp-long v0, v3, v0

    .line 253
    .line 254
    if-eqz v0, :cond_c

    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_c
    const/4 v0, 0x0

    .line 258
    goto :goto_c

    .line 259
    :cond_d
    :goto_b
    const/4 v0, 0x1

    .line 260
    :goto_c
    iget-object v1, v8, Le5/n;->d:Le5/g;

    .line 261
    .line 262
    iget-object v1, v1, Le5/g;->q:Lr5/h;

    .line 263
    .line 264
    move-object v5, v1

    .line 265
    const/4 v2, 0x0

    .line 266
    :goto_d
    if-ge v2, v13, :cond_12

    .line 267
    .line 268
    aget-object v10, v14, v2

    .line 269
    .line 270
    if-nez v10, :cond_e

    .line 271
    .line 272
    goto :goto_e

    .line 273
    :cond_e
    iget-object v15, v8, Le5/n;->Q:Lz4/j0;

    .line 274
    .line 275
    invoke-interface {v10}, Lr5/k;->a()Lz4/i0;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {v15, v9}, Lz4/j0;->b(Lz4/i0;)I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    iget v15, v8, Le5/n;->T:I

    .line 284
    .line 285
    if-ne v9, v15, :cond_f

    .line 286
    .line 287
    iget-object v5, v8, Le5/n;->d:Le5/g;

    .line 288
    .line 289
    iput-object v10, v5, Le5/g;->q:Lr5/h;

    .line 290
    .line 291
    move-object v5, v10

    .line 292
    :cond_f
    aget-object v10, v12, v2

    .line 293
    .line 294
    if-nez v10, :cond_11

    .line 295
    .line 296
    iget v10, v8, Le5/n;->M:I

    .line 297
    .line 298
    const/4 v15, 0x1

    .line 299
    add-int/2addr v10, v15

    .line 300
    iput v10, v8, Le5/n;->M:I

    .line 301
    .line 302
    new-instance v10, Le5/m;

    .line 303
    .line 304
    invoke-direct {v10, v8, v9}, Le5/m;-><init>(Le5/n;I)V

    .line 305
    .line 306
    .line 307
    aput-object v10, v12, v2

    .line 308
    .line 309
    aput-boolean v15, p4, v2

    .line 310
    .line 311
    iget-object v15, v8, Le5/n;->S:[I

    .line 312
    .line 313
    if-eqz v15, :cond_11

    .line 314
    .line 315
    invoke-virtual {v10}, Le5/m;->c()V

    .line 316
    .line 317
    .line 318
    if-nez v0, :cond_11

    .line 319
    .line 320
    iget-object v0, v8, Le5/n;->D:[Le5/n$c;

    .line 321
    .line 322
    iget-object v10, v8, Le5/n;->S:[I

    .line 323
    .line 324
    aget v9, v10, v9

    .line 325
    .line 326
    aget-object v0, v0, v9

    .line 327
    .line 328
    const/4 v9, 0x1

    .line 329
    invoke-virtual {v0, v3, v4, v9}, Lz4/b0;->x(JZ)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-nez v10, :cond_10

    .line 334
    .line 335
    iget v9, v0, Lz4/b0;->q:I

    .line 336
    .line 337
    iget v0, v0, Lz4/b0;->s:I

    .line 338
    .line 339
    add-int/2addr v9, v0

    .line 340
    if-eqz v9, :cond_10

    .line 341
    .line 342
    const/4 v0, 0x1

    .line 343
    goto :goto_e

    .line 344
    :cond_10
    const/4 v0, 0x0

    .line 345
    :cond_11
    :goto_e
    add-int/lit8 v2, v2, 0x1

    .line 346
    .line 347
    goto :goto_d

    .line 348
    :cond_12
    iget v2, v8, Le5/n;->M:I

    .line 349
    .line 350
    if-nez v2, :cond_15

    .line 351
    .line 352
    iget-object v1, v8, Le5/n;->d:Le5/g;

    .line 353
    .line 354
    const/4 v2, 0x0

    .line 355
    iput-object v2, v1, Le5/g;->n:Lz4/b;

    .line 356
    .line 357
    iput-object v2, v8, Le5/n;->O:Lv3/i0;

    .line 358
    .line 359
    const/4 v1, 0x1

    .line 360
    iput-boolean v1, v8, Le5/n;->Z:Z

    .line 361
    .line 362
    iget-object v1, v8, Le5/n;->v:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 365
    .line 366
    .line 367
    iget-object v1, v8, Le5/n;->r:Lt5/d0;

    .line 368
    .line 369
    invoke-virtual {v1}, Lt5/d0;->d()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_14

    .line 374
    .line 375
    iget-boolean v1, v8, Le5/n;->K:Z

    .line 376
    .line 377
    if-eqz v1, :cond_13

    .line 378
    .line 379
    iget-object v1, v8, Le5/n;->D:[Le5/n$c;

    .line 380
    .line 381
    array-length v2, v1

    .line 382
    const/4 v5, 0x0

    .line 383
    :goto_f
    if-ge v5, v2, :cond_13

    .line 384
    .line 385
    aget-object v9, v1, v5

    .line 386
    .line 387
    invoke-virtual {v9}, Lz4/b0;->h()V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v5, v5, 0x1

    .line 391
    .line 392
    goto :goto_f

    .line 393
    :cond_13
    iget-object v1, v8, Le5/n;->r:Lt5/d0;

    .line 394
    .line 395
    invoke-virtual {v1}, Lt5/d0;->b()V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_14

    .line 399
    .line 400
    :cond_14
    invoke-virtual {v8}, Le5/n;->F()V

    .line 401
    .line 402
    .line 403
    goto :goto_14

    .line 404
    :cond_15
    iget-object v2, v8, Le5/n;->v:Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-nez v2, :cond_19

    .line 411
    .line 412
    invoke-static {v5, v1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-nez v1, :cond_19

    .line 417
    .line 418
    iget-boolean v1, v8, Le5/n;->a0:Z

    .line 419
    .line 420
    if-nez v1, :cond_18

    .line 421
    .line 422
    const-wide/16 v1, 0x0

    .line 423
    .line 424
    cmp-long v9, v3, v1

    .line 425
    .line 426
    if-gez v9, :cond_16

    .line 427
    .line 428
    neg-long v1, v3

    .line 429
    :cond_16
    move-wide/from16 v23, v1

    .line 430
    .line 431
    invoke-virtual {v8}, Le5/n;->z()Le5/j;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    iget-object v2, v8, Le5/n;->d:Le5/g;

    .line 436
    .line 437
    invoke-virtual {v2, v1, v3, v4}, Le5/g;->a(Le5/j;J)[Lb5/n;

    .line 438
    .line 439
    .line 440
    move-result-object v28

    .line 441
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    iget-object v2, v8, Le5/n;->w:Ljava/util/List;

    .line 447
    .line 448
    move-object/from16 v22, v5

    .line 449
    .line 450
    move-object/from16 v27, v2

    .line 451
    .line 452
    invoke-interface/range {v22 .. v28}, Lr5/h;->j(JJLjava/util/List;[Lb5/n;)V

    .line 453
    .line 454
    .line 455
    iget-object v2, v8, Le5/n;->d:Le5/g;

    .line 456
    .line 457
    iget-object v2, v2, Le5/g;->h:Lz4/i0;

    .line 458
    .line 459
    iget-object v1, v1, Lb5/e;->d:Lv3/i0;

    .line 460
    .line 461
    invoke-virtual {v2, v1}, Lz4/i0;->a(Lv3/i0;)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-interface {v5}, Lr5/h;->o()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-eq v2, v1, :cond_17

    .line 470
    .line 471
    goto :goto_10

    .line 472
    :cond_17
    const/4 v1, 0x0

    .line 473
    goto :goto_11

    .line 474
    :cond_18
    :goto_10
    const/4 v1, 0x1

    .line 475
    :goto_11
    if-eqz v1, :cond_19

    .line 476
    .line 477
    const/4 v1, 0x1

    .line 478
    iput-boolean v1, v8, Le5/n;->Z:Z

    .line 479
    .line 480
    const/4 v0, 0x1

    .line 481
    const/4 v1, 0x1

    .line 482
    goto :goto_12

    .line 483
    :cond_19
    move/from16 v1, v17

    .line 484
    .line 485
    :goto_12
    if-eqz v0, :cond_1b

    .line 486
    .line 487
    invoke-virtual {v8, v3, v4, v1}, Le5/n;->G(JZ)Z

    .line 488
    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    :goto_13
    if-ge v1, v11, :cond_1b

    .line 492
    .line 493
    aget-object v2, v12, v1

    .line 494
    .line 495
    if-eqz v2, :cond_1a

    .line 496
    .line 497
    const/4 v2, 0x1

    .line 498
    aput-boolean v2, p4, v1

    .line 499
    .line 500
    :cond_1a
    add-int/lit8 v1, v1, 0x1

    .line 501
    .line 502
    goto :goto_13

    .line 503
    :cond_1b
    :goto_14
    iget-object v1, v8, Le5/n;->A:Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 506
    .line 507
    .line 508
    const/4 v1, 0x0

    .line 509
    :goto_15
    if-ge v1, v11, :cond_1d

    .line 510
    .line 511
    aget-object v2, v12, v1

    .line 512
    .line 513
    if-eqz v2, :cond_1c

    .line 514
    .line 515
    iget-object v5, v8, Le5/n;->A:Ljava/util/ArrayList;

    .line 516
    .line 517
    check-cast v2, Le5/m;

    .line 518
    .line 519
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    :cond_1c
    add-int/lit8 v1, v1, 0x1

    .line 523
    .line 524
    goto :goto_15

    .line 525
    :cond_1d
    const/4 v1, 0x1

    .line 526
    iput-boolean v1, v8, Le5/n;->a0:Z

    .line 527
    .line 528
    move-object/from16 v5, p1

    .line 529
    .line 530
    const/4 v1, 0x0

    .line 531
    const/4 v2, 0x0

    .line 532
    :goto_16
    array-length v9, v5

    .line 533
    if-ge v1, v9, :cond_21

    .line 534
    .line 535
    aget-object v9, v12, v1

    .line 536
    .line 537
    aget v10, v6, v1

    .line 538
    .line 539
    if-ne v10, v7, :cond_1e

    .line 540
    .line 541
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    aput-object v9, v21, v1

    .line 545
    .line 546
    move-object/from16 v10, p0

    .line 547
    .line 548
    iget-object v2, v10, Le5/l;->r:Ljava/util/IdentityHashMap;

    .line 549
    .line 550
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    invoke-virtual {v2, v9, v15}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    const/4 v2, 0x1

    .line 558
    goto :goto_18

    .line 559
    :cond_1e
    move-object/from16 v10, p0

    .line 560
    .line 561
    aget v15, v20, v1

    .line 562
    .line 563
    if-ne v15, v7, :cond_20

    .line 564
    .line 565
    if-nez v9, :cond_1f

    .line 566
    .line 567
    const/4 v9, 0x1

    .line 568
    goto :goto_17

    .line 569
    :cond_1f
    const/4 v9, 0x0

    .line 570
    :goto_17
    invoke-static {v9}, Lx6/b;->H(Z)V

    .line 571
    .line 572
    .line 573
    :cond_20
    :goto_18
    add-int/lit8 v1, v1, 0x1

    .line 574
    .line 575
    goto :goto_16

    .line 576
    :cond_21
    move-object/from16 v10, p0

    .line 577
    .line 578
    if-eqz v2, :cond_25

    .line 579
    .line 580
    move/from16 v1, v16

    .line 581
    .line 582
    aput-object v8, v19, v1

    .line 583
    .line 584
    add-int/lit8 v16, v1, 0x1

    .line 585
    .line 586
    if-nez v1, :cond_23

    .line 587
    .line 588
    iget-object v1, v8, Le5/n;->d:Le5/g;

    .line 589
    .line 590
    const/4 v2, 0x1

    .line 591
    iput-boolean v2, v1, Le5/g;->l:Z

    .line 592
    .line 593
    if-nez v0, :cond_22

    .line 594
    .line 595
    iget-object v0, v10, Le5/l;->D:[Le5/n;

    .line 596
    .line 597
    array-length v1, v0

    .line 598
    if-eqz v1, :cond_22

    .line 599
    .line 600
    const/4 v1, 0x0

    .line 601
    aget-object v0, v0, v1

    .line 602
    .line 603
    if-eq v8, v0, :cond_26

    .line 604
    .line 605
    :cond_22
    iget-object v0, v10, Le5/l;->s:Ld2/h0;

    .line 606
    .line 607
    iget-object v0, v0, Ld2/h0;->b:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v0, Landroid/util/SparseArray;

    .line 610
    .line 611
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 612
    .line 613
    .line 614
    move/from16 v17, v2

    .line 615
    .line 616
    goto :goto_1a

    .line 617
    :cond_23
    const/4 v2, 0x1

    .line 618
    iget v0, v10, Le5/l;->E:I

    .line 619
    .line 620
    if-ge v7, v0, :cond_24

    .line 621
    .line 622
    move v9, v2

    .line 623
    goto :goto_19

    .line 624
    :cond_24
    const/4 v9, 0x0

    .line 625
    :goto_19
    iget-object v0, v8, Le5/n;->d:Le5/g;

    .line 626
    .line 627
    iput-boolean v9, v0, Le5/g;->l:Z

    .line 628
    .line 629
    goto :goto_1a

    .line 630
    :cond_25
    move/from16 v1, v16

    .line 631
    .line 632
    :cond_26
    :goto_1a
    add-int/lit8 v7, v7, 0x1

    .line 633
    .line 634
    move-object/from16 v2, p3

    .line 635
    .line 636
    move-object v1, v5

    .line 637
    move-object v0, v10

    .line 638
    move/from16 v8, v18

    .line 639
    .line 640
    move-object/from16 v15, v19

    .line 641
    .line 642
    move-object/from16 v5, v20

    .line 643
    .line 644
    move-object/from16 v9, v21

    .line 645
    .line 646
    goto/16 :goto_4

    .line 647
    .line 648
    :cond_27
    move-object v10, v0

    .line 649
    move-object v0, v2

    .line 650
    move v2, v8

    .line 651
    move-object v7, v9

    .line 652
    move-object/from16 v19, v15

    .line 653
    .line 654
    move/from16 v1, v16

    .line 655
    .line 656
    const/4 v8, 0x0

    .line 657
    invoke-static {v7, v8, v0, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 658
    .line 659
    .line 660
    move-object/from16 v0, v19

    .line 661
    .line 662
    invoke-static {v1, v0}, Lv5/e0;->K(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    check-cast v0, [Le5/n;

    .line 667
    .line 668
    iput-object v0, v10, Le5/l;->D:[Le5/n;

    .line 669
    .line 670
    iget-object v1, v10, Le5/l;->t:Lz4/i;

    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    new-instance v1, Lb1/v;

    .line 676
    .line 677
    invoke-direct {v1, v0}, Lb1/v;-><init>(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    iput-object v1, v10, Le5/l;->F:Lb1/v;

    .line 681
    .line 682
    return-wide v3
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

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Le5/l;->F:Lb1/v;

    invoke-virtual {v0}, Lb1/v;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Le5/l;->C:[Le5/n;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Le5/n;->D()V

    .line 10
    .line 11
    .line 12
    iget-boolean v4, v3, Le5/n;->b0:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    iget-boolean v3, v3, Le5/n;->L:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    const-string v1, "Loading finished before preparation is complete."

    .line 23
    .line 24
    invoke-static {v1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    throw v0

    .line 29
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
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

.method public final l(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Le5/l;->D:[Le5/n;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, v1}, Le5/n;->G(JZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-object v2, p0, Le5/l;->D:[Le5/n;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2, v0}, Le5/n;->G(JZ)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Le5/l;->s:Ld2/h0;

    .line 30
    .line 31
    iget-object v0, v0, Ld2/h0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroid/util/SparseArray;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-wide p1
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

.method public final n(Lz4/r$a;J)V
    .locals 25

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iput-object v0, v10, Le5/l;->z:Lz4/r$a;

    .line 6
    .line 7
    iget-object v0, v10, Le5/l;->b:Lf5/j;

    .line 8
    .line 9
    invoke-interface {v0, v10}, Lf5/j;->d(Lf5/j$a;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v10, Le5/l;->b:Lf5/j;

    .line 13
    .line 14
    invoke-interface {v0}, Lf5/j;->h()Lf5/f;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-boolean v0, v10, Le5/l;->w:Z

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eqz v0, :cond_5

    .line 26
    .line 27
    iget-object v0, v11, Lf5/f;->m:Ljava/util/List;

    .line 28
    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    move v5, v1

    .line 40
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-ge v5, v6, :cond_6

    .line 45
    .line 46
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, La4/d;

    .line 51
    .line 52
    iget-object v7, v6, La4/d;->c:Ljava/lang/String;

    .line 53
    .line 54
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    move v8, v5

    .line 57
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-ge v8, v9, :cond_4

    .line 62
    .line 63
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, La4/d;

    .line 68
    .line 69
    iget-object v12, v9, La4/d;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v12, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    if-eqz v12, :cond_3

    .line 76
    .line 77
    iget-object v12, v6, La4/d;->c:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v12, :cond_1

    .line 80
    .line 81
    iget-object v13, v9, La4/d;->c:Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v13, :cond_1

    .line 84
    .line 85
    invoke-static {v12, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_0

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_0
    move v12, v1

    .line 93
    goto :goto_3

    .line 94
    :cond_1
    :goto_2
    move v12, v2

    .line 95
    :goto_3
    invoke-static {v12}, Lx6/b;->H(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v12, v6, La4/d;->c:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v12, :cond_2

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_2
    iget-object v12, v9, La4/d;->c:Ljava/lang/String;

    .line 104
    .line 105
    :goto_4
    iget-object v6, v6, La4/d;->a:[La4/d$b;

    .line 106
    .line 107
    iget-object v9, v9, La4/d;->a:[La4/d$b;

    .line 108
    .line 109
    sget v13, Lv5/e0;->a:I

    .line 110
    .line 111
    array-length v13, v6

    .line 112
    array-length v14, v9

    .line 113
    add-int/2addr v13, v14

    .line 114
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    array-length v6, v6

    .line 119
    array-length v14, v9

    .line 120
    invoke-static {v9, v1, v13, v6, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    check-cast v13, [La4/d$b;

    .line 124
    .line 125
    new-instance v6, La4/d;

    .line 126
    .line 127
    invoke-direct {v6, v12, v2, v13}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :cond_6
    move-object v12, v4

    .line 146
    iget-object v0, v11, Lf5/f;->e:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    xor-int/2addr v0, v2

    .line 153
    iget-object v13, v11, Lf5/f;->g:Ljava/util/List;

    .line 154
    .line 155
    iget-object v14, v11, Lf5/f;->h:Ljava/util/List;

    .line 156
    .line 157
    iput v1, v10, Le5/l;->A:I

    .line 158
    .line 159
    new-instance v15, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    new-instance v8, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    if-eqz v0, :cond_1a

    .line 170
    .line 171
    iget-object v0, v11, Lf5/f;->e:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    new-array v3, v0, [I

    .line 178
    .line 179
    move v4, v1

    .line 180
    move v5, v4

    .line 181
    :goto_5
    iget-object v6, v11, Lf5/f;->e:Ljava/util/List;

    .line 182
    .line 183
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    const/4 v7, 0x2

    .line 188
    if-ge v1, v6, :cond_a

    .line 189
    .line 190
    iget-object v6, v11, Lf5/f;->e:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    check-cast v6, Lf5/f$b;

    .line 197
    .line 198
    iget-object v6, v6, Lf5/f$b;->b:Lv3/i0;

    .line 199
    .line 200
    iget v9, v6, Lv3/i0;->z:I

    .line 201
    .line 202
    if-gtz v9, :cond_9

    .line 203
    .line 204
    iget-object v9, v6, Lv3/i0;->q:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v7, v9}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    if-eqz v9, :cond_7

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_7
    iget-object v6, v6, Lv3/i0;->q:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v2, v6}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    if-eqz v6, :cond_8

    .line 220
    .line 221
    aput v2, v3, v1

    .line 222
    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_8
    const/4 v6, -0x1

    .line 227
    aput v6, v3, v1

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_9
    :goto_6
    aput v7, v3, v1

    .line 231
    .line 232
    add-int/lit8 v4, v4, 0x1

    .line 233
    .line 234
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_a
    if-lez v4, :cond_b

    .line 238
    .line 239
    move v0, v4

    .line 240
    goto :goto_8

    .line 241
    :cond_b
    if-ge v5, v0, :cond_c

    .line 242
    .line 243
    sub-int/2addr v0, v5

    .line 244
    const/4 v1, 0x0

    .line 245
    move v9, v0

    .line 246
    goto :goto_9

    .line 247
    :cond_c
    const/4 v2, 0x0

    .line 248
    :goto_8
    const/4 v1, 0x0

    .line 249
    move v9, v0

    .line 250
    move/from16 v24, v2

    .line 251
    .line 252
    move v2, v1

    .line 253
    move/from16 v1, v24

    .line 254
    .line 255
    :goto_9
    new-array v4, v9, [Landroid/net/Uri;

    .line 256
    .line 257
    new-array v7, v9, [Lv3/i0;

    .line 258
    .line 259
    new-array v6, v9, [I

    .line 260
    .line 261
    const/4 v0, 0x0

    .line 262
    const/4 v5, 0x0

    .line 263
    move-object/from16 p1, v8

    .line 264
    .line 265
    :goto_a
    iget-object v8, v11, Lf5/f;->e:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-ge v0, v8, :cond_10

    .line 272
    .line 273
    if-eqz v1, :cond_d

    .line 274
    .line 275
    aget v8, v3, v0

    .line 276
    .line 277
    move/from16 v16, v9

    .line 278
    .line 279
    const/4 v9, 0x2

    .line 280
    if-ne v8, v9, :cond_f

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_d
    move/from16 v16, v9

    .line 284
    .line 285
    :goto_b
    if-eqz v2, :cond_e

    .line 286
    .line 287
    aget v8, v3, v0

    .line 288
    .line 289
    const/4 v9, 0x1

    .line 290
    if-eq v8, v9, :cond_f

    .line 291
    .line 292
    :cond_e
    iget-object v8, v11, Lf5/f;->e:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    check-cast v8, Lf5/f$b;

    .line 299
    .line 300
    iget-object v9, v8, Lf5/f$b;->a:Landroid/net/Uri;

    .line 301
    .line 302
    aput-object v9, v4, v5

    .line 303
    .line 304
    iget-object v8, v8, Lf5/f$b;->b:Lv3/i0;

    .line 305
    .line 306
    aput-object v8, v7, v5

    .line 307
    .line 308
    add-int/lit8 v8, v5, 0x1

    .line 309
    .line 310
    aput v0, v6, v5

    .line 311
    .line 312
    move v5, v8

    .line 313
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 314
    .line 315
    move/from16 v9, v16

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_10
    move/from16 v16, v9

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    aget-object v0, v7, v0

    .line 322
    .line 323
    iget-object v0, v0, Lv3/i0;->q:Ljava/lang/String;

    .line 324
    .line 325
    const/4 v2, 0x2

    .line 326
    invoke-static {v2, v0}, Lv5/e0;->p(ILjava/lang/String;)I

    .line 327
    .line 328
    .line 329
    move-result v8

    .line 330
    const/4 v2, 0x1

    .line 331
    invoke-static {v2, v0}, Lv5/e0;->p(ILjava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-eq v9, v2, :cond_11

    .line 336
    .line 337
    if-nez v9, :cond_12

    .line 338
    .line 339
    iget-object v0, v11, Lf5/f;->g:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_12

    .line 346
    .line 347
    :cond_11
    if-gt v8, v2, :cond_12

    .line 348
    .line 349
    add-int v0, v9, v8

    .line 350
    .line 351
    if-lez v0, :cond_12

    .line 352
    .line 353
    const/4 v0, 0x1

    .line 354
    goto :goto_c

    .line 355
    :cond_12
    const/4 v0, 0x0

    .line 356
    :goto_c
    move/from16 v17, v0

    .line 357
    .line 358
    if-nez v1, :cond_13

    .line 359
    .line 360
    if-lez v9, :cond_13

    .line 361
    .line 362
    const/4 v0, 0x1

    .line 363
    goto :goto_d

    .line 364
    :cond_13
    const/4 v0, 0x0

    .line 365
    :goto_d
    move v2, v0

    .line 366
    const-string v5, "main"

    .line 367
    .line 368
    iget-object v3, v11, Lf5/f;->j:Lv3/i0;

    .line 369
    .line 370
    iget-object v1, v11, Lf5/f;->k:Ljava/util/List;

    .line 371
    .line 372
    move-object/from16 v0, p0

    .line 373
    .line 374
    move-object/from16 v18, v1

    .line 375
    .line 376
    move-object v1, v5

    .line 377
    move-object/from16 v19, v3

    .line 378
    .line 379
    move-object v3, v4

    .line 380
    move-object v4, v7

    .line 381
    move-object/from16 v20, v14

    .line 382
    .line 383
    move-object v14, v5

    .line 384
    move-object/from16 v5, v19

    .line 385
    .line 386
    move-object/from16 v19, v13

    .line 387
    .line 388
    move-object v13, v6

    .line 389
    move-object/from16 v6, v18

    .line 390
    .line 391
    move-object/from16 v18, v7

    .line 392
    .line 393
    move-object v7, v12

    .line 394
    move/from16 v22, v9

    .line 395
    .line 396
    move-object/from16 v21, v12

    .line 397
    .line 398
    move-object/from16 v12, p1

    .line 399
    .line 400
    move-object/from16 p1, v11

    .line 401
    .line 402
    move/from16 v11, v16

    .line 403
    .line 404
    move/from16 v16, v8

    .line 405
    .line 406
    move-wide/from16 v8, p2

    .line 407
    .line 408
    invoke-virtual/range {v0 .. v9}, Le5/l;->b(Ljava/lang/String;I[Landroid/net/Uri;[Lv3/i0;Lv3/i0;Ljava/util/List;Ljava/util/Map;J)Le5/n;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    iget-boolean v1, v10, Le5/l;->u:Z

    .line 419
    .line 420
    if-eqz v1, :cond_1b

    .line 421
    .line 422
    if-eqz v17, :cond_1b

    .line 423
    .line 424
    new-instance v1, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    if-lez v16, :cond_18

    .line 430
    .line 431
    new-array v2, v11, [Lv3/i0;

    .line 432
    .line 433
    const/4 v3, 0x0

    .line 434
    :goto_e
    if-ge v3, v11, :cond_14

    .line 435
    .line 436
    aget-object v4, v18, v3

    .line 437
    .line 438
    iget-object v5, v4, Lv3/i0;->q:Ljava/lang/String;

    .line 439
    .line 440
    const/4 v6, 0x2

    .line 441
    invoke-static {v6, v5}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-static {v5}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    new-instance v7, Lv3/i0$a;

    .line 450
    .line 451
    invoke-direct {v7}, Lv3/i0$a;-><init>()V

    .line 452
    .line 453
    .line 454
    iget-object v8, v4, Lv3/i0;->a:Ljava/lang/String;

    .line 455
    .line 456
    iput-object v8, v7, Lv3/i0$a;->a:Ljava/lang/String;

    .line 457
    .line 458
    iget-object v8, v4, Lv3/i0;->b:Ljava/lang/String;

    .line 459
    .line 460
    iput-object v8, v7, Lv3/i0$a;->b:Ljava/lang/String;

    .line 461
    .line 462
    iget-object v8, v4, Lv3/i0;->s:Ljava/lang/String;

    .line 463
    .line 464
    iput-object v8, v7, Lv3/i0$a;->j:Ljava/lang/String;

    .line 465
    .line 466
    iput-object v6, v7, Lv3/i0$a;->k:Ljava/lang/String;

    .line 467
    .line 468
    iput-object v5, v7, Lv3/i0$a;->h:Ljava/lang/String;

    .line 469
    .line 470
    iget-object v5, v4, Lv3/i0;->r:Lp4/a;

    .line 471
    .line 472
    iput-object v5, v7, Lv3/i0$a;->i:Lp4/a;

    .line 473
    .line 474
    iget v5, v4, Lv3/i0;->f:I

    .line 475
    .line 476
    iput v5, v7, Lv3/i0$a;->f:I

    .line 477
    .line 478
    iget v5, v4, Lv3/i0;->o:I

    .line 479
    .line 480
    iput v5, v7, Lv3/i0$a;->g:I

    .line 481
    .line 482
    iget v5, v4, Lv3/i0;->y:I

    .line 483
    .line 484
    iput v5, v7, Lv3/i0$a;->p:I

    .line 485
    .line 486
    iget v5, v4, Lv3/i0;->z:I

    .line 487
    .line 488
    iput v5, v7, Lv3/i0$a;->q:I

    .line 489
    .line 490
    iget v5, v4, Lv3/i0;->A:F

    .line 491
    .line 492
    iput v5, v7, Lv3/i0$a;->r:F

    .line 493
    .line 494
    iget v5, v4, Lv3/i0;->d:I

    .line 495
    .line 496
    iput v5, v7, Lv3/i0$a;->d:I

    .line 497
    .line 498
    iget v4, v4, Lv3/i0;->e:I

    .line 499
    .line 500
    iput v4, v7, Lv3/i0$a;->e:I

    .line 501
    .line 502
    new-instance v4, Lv3/i0;

    .line 503
    .line 504
    invoke-direct {v4, v7}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 505
    .line 506
    .line 507
    aput-object v4, v2, v3

    .line 508
    .line 509
    add-int/lit8 v3, v3, 0x1

    .line 510
    .line 511
    goto :goto_e

    .line 512
    :cond_14
    new-instance v3, Lz4/i0;

    .line 513
    .line 514
    invoke-direct {v3, v14, v2}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-object/from16 v2, p1

    .line 521
    .line 522
    if-lez v22, :cond_16

    .line 523
    .line 524
    iget-object v3, v2, Lf5/f;->j:Lv3/i0;

    .line 525
    .line 526
    if-nez v3, :cond_15

    .line 527
    .line 528
    iget-object v3, v2, Lf5/f;->g:Ljava/util/List;

    .line 529
    .line 530
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-eqz v3, :cond_16

    .line 535
    .line 536
    :cond_15
    new-instance v3, Lz4/i0;

    .line 537
    .line 538
    const/4 v4, 0x1

    .line 539
    new-array v4, v4, [Lv3/i0;

    .line 540
    .line 541
    const/4 v5, 0x0

    .line 542
    aget-object v6, v18, v5

    .line 543
    .line 544
    iget-object v7, v2, Lf5/f;->j:Lv3/i0;

    .line 545
    .line 546
    invoke-static {v6, v7, v5}, Le5/l;->k(Lv3/i0;Lv3/i0;Z)Lv3/i0;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    aput-object v6, v4, v5

    .line 551
    .line 552
    const-string v5, "main:audio"

    .line 553
    .line 554
    invoke-direct {v3, v5, v4}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    :cond_16
    iget-object v2, v2, Lf5/f;->k:Ljava/util/List;

    .line 561
    .line 562
    if-eqz v2, :cond_17

    .line 563
    .line 564
    const/4 v3, 0x0

    .line 565
    :goto_f
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    if-ge v3, v4, :cond_17

    .line 570
    .line 571
    new-instance v4, Ljava/lang/StringBuilder;

    .line 572
    .line 573
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v5, ":cc:"

    .line 580
    .line 581
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    new-instance v5, Lz4/i0;

    .line 592
    .line 593
    const/4 v6, 0x1

    .line 594
    new-array v6, v6, [Lv3/i0;

    .line 595
    .line 596
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    check-cast v7, Lv3/i0;

    .line 601
    .line 602
    const/4 v8, 0x0

    .line 603
    aput-object v7, v6, v8

    .line 604
    .line 605
    invoke-direct {v5, v4, v6}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    add-int/lit8 v3, v3, 0x1

    .line 612
    .line 613
    goto :goto_f

    .line 614
    :cond_17
    const/4 v2, 0x1

    .line 615
    goto :goto_11

    .line 616
    :cond_18
    move-object/from16 v2, p1

    .line 617
    .line 618
    new-array v3, v11, [Lv3/i0;

    .line 619
    .line 620
    const/4 v4, 0x0

    .line 621
    :goto_10
    if-ge v4, v11, :cond_19

    .line 622
    .line 623
    aget-object v5, v18, v4

    .line 624
    .line 625
    iget-object v6, v2, Lf5/f;->j:Lv3/i0;

    .line 626
    .line 627
    const/4 v7, 0x1

    .line 628
    invoke-static {v5, v6, v7}, Le5/l;->k(Lv3/i0;Lv3/i0;Z)Lv3/i0;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    aput-object v5, v3, v4

    .line 633
    .line 634
    add-int/lit8 v4, v4, 0x1

    .line 635
    .line 636
    goto :goto_10

    .line 637
    :cond_19
    const/4 v2, 0x1

    .line 638
    new-instance v4, Lz4/i0;

    .line 639
    .line 640
    invoke-direct {v4, v14, v3}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    :goto_11
    new-instance v3, Lz4/i0;

    .line 647
    .line 648
    new-array v2, v2, [Lv3/i0;

    .line 649
    .line 650
    new-instance v4, Lv3/i0$a;

    .line 651
    .line 652
    invoke-direct {v4}, Lv3/i0$a;-><init>()V

    .line 653
    .line 654
    .line 655
    const-string v5, "ID3"

    .line 656
    .line 657
    iput-object v5, v4, Lv3/i0$a;->a:Ljava/lang/String;

    .line 658
    .line 659
    const-string v5, "application/id3"

    .line 660
    .line 661
    iput-object v5, v4, Lv3/i0$a;->k:Ljava/lang/String;

    .line 662
    .line 663
    new-instance v5, Lv3/i0;

    .line 664
    .line 665
    invoke-direct {v5, v4}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 666
    .line 667
    .line 668
    const/4 v4, 0x0

    .line 669
    aput-object v5, v2, v4

    .line 670
    .line 671
    const-string v5, "main:id3"

    .line 672
    .line 673
    invoke-direct {v3, v5, v2}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    new-array v2, v4, [Lz4/i0;

    .line 680
    .line 681
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    check-cast v2, [Lz4/i0;

    .line 686
    .line 687
    const/4 v5, 0x1

    .line 688
    new-array v5, v5, [I

    .line 689
    .line 690
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    aput v1, v5, v4

    .line 695
    .line 696
    invoke-virtual {v0, v2, v5}, Le5/n;->E([Lz4/i0;[I)V

    .line 697
    .line 698
    .line 699
    goto :goto_12

    .line 700
    :cond_1a
    move-object/from16 v21, v12

    .line 701
    .line 702
    move-object/from16 v19, v13

    .line 703
    .line 704
    move-object/from16 v20, v14

    .line 705
    .line 706
    move-object v12, v8

    .line 707
    :cond_1b
    :goto_12
    new-instance v11, Ljava/util/ArrayList;

    .line 708
    .line 709
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 714
    .line 715
    .line 716
    new-instance v13, Ljava/util/ArrayList;

    .line 717
    .line 718
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 723
    .line 724
    .line 725
    new-instance v14, Ljava/util/ArrayList;

    .line 726
    .line 727
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 732
    .line 733
    .line 734
    new-instance v8, Ljava/util/HashSet;

    .line 735
    .line 736
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 737
    .line 738
    .line 739
    const/4 v0, 0x0

    .line 740
    move v9, v0

    .line 741
    :goto_13
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-ge v9, v0, :cond_21

    .line 746
    .line 747
    move-object/from16 v7, v19

    .line 748
    .line 749
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    check-cast v0, Lf5/f$a;

    .line 754
    .line 755
    iget-object v0, v0, Lf5/f$a;->c:Ljava/lang/String;

    .line 756
    .line 757
    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-nez v1, :cond_1c

    .line 762
    .line 763
    move-object/from16 v17, v7

    .line 764
    .line 765
    move-object/from16 v18, v8

    .line 766
    .line 767
    move/from16 v19, v9

    .line 768
    .line 769
    goto/16 :goto_16

    .line 770
    .line 771
    :cond_1c
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 778
    .line 779
    .line 780
    const/4 v1, 0x0

    .line 781
    const/4 v2, 0x1

    .line 782
    move/from16 v16, v2

    .line 783
    .line 784
    :goto_14
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-ge v1, v2, :cond_1f

    .line 789
    .line 790
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    check-cast v2, Lf5/f$a;

    .line 795
    .line 796
    iget-object v2, v2, Lf5/f$a;->c:Ljava/lang/String;

    .line 797
    .line 798
    invoke-static {v0, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_1e

    .line 803
    .line 804
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    check-cast v2, Lf5/f$a;

    .line 809
    .line 810
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    iget-object v3, v2, Lf5/f$a;->a:Landroid/net/Uri;

    .line 818
    .line 819
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    iget-object v3, v2, Lf5/f$a;->b:Lv3/i0;

    .line 823
    .line 824
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    iget-object v2, v2, Lf5/f$a;->b:Lv3/i0;

    .line 828
    .line 829
    iget-object v2, v2, Lv3/i0;->q:Ljava/lang/String;

    .line 830
    .line 831
    const/4 v3, 0x1

    .line 832
    invoke-static {v3, v2}, Lv5/e0;->p(ILjava/lang/String;)I

    .line 833
    .line 834
    .line 835
    move-result v2

    .line 836
    if-ne v2, v3, :cond_1d

    .line 837
    .line 838
    const/4 v2, 0x1

    .line 839
    goto :goto_15

    .line 840
    :cond_1d
    const/4 v2, 0x0

    .line 841
    :goto_15
    and-int v2, v16, v2

    .line 842
    .line 843
    move/from16 v16, v2

    .line 844
    .line 845
    :cond_1e
    add-int/lit8 v1, v1, 0x1

    .line 846
    .line 847
    goto :goto_14

    .line 848
    :cond_1f
    const-string v1, "audio:"

    .line 849
    .line 850
    invoke-static {v1, v0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v6

    .line 854
    const/4 v2, 0x1

    .line 855
    const/4 v0, 0x0

    .line 856
    new-array v1, v0, [Landroid/net/Uri;

    .line 857
    .line 858
    sget v3, Lv5/e0;->a:I

    .line 859
    .line 860
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    move-object v3, v1

    .line 865
    check-cast v3, [Landroid/net/Uri;

    .line 866
    .line 867
    new-array v0, v0, [Lv3/i0;

    .line 868
    .line 869
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    move-object v4, v0

    .line 874
    check-cast v4, [Lv3/i0;

    .line 875
    .line 876
    const/4 v5, 0x0

    .line 877
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v17

    .line 881
    move-object/from16 v0, p0

    .line 882
    .line 883
    move-object v1, v6

    .line 884
    move-object/from16 v23, v6

    .line 885
    .line 886
    move-object/from16 v6, v17

    .line 887
    .line 888
    move-object/from16 v17, v7

    .line 889
    .line 890
    move-object/from16 v7, v21

    .line 891
    .line 892
    move-object/from16 v18, v8

    .line 893
    .line 894
    move/from16 v19, v9

    .line 895
    .line 896
    move-wide/from16 v8, p2

    .line 897
    .line 898
    invoke-virtual/range {v0 .. v9}, Le5/l;->b(Ljava/lang/String;I[Landroid/net/Uri;[Lv3/i0;Lv3/i0;Ljava/util/List;Ljava/util/Map;J)Le5/n;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-static {v14}, Lr7/a;->F(Ljava/util/Collection;)[I

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    iget-boolean v1, v10, Le5/l;->u:Z

    .line 913
    .line 914
    if-eqz v1, :cond_20

    .line 915
    .line 916
    if-eqz v16, :cond_20

    .line 917
    .line 918
    const/4 v1, 0x0

    .line 919
    new-array v2, v1, [Lv3/i0;

    .line 920
    .line 921
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    check-cast v2, [Lv3/i0;

    .line 926
    .line 927
    const/4 v3, 0x1

    .line 928
    new-array v3, v3, [Lz4/i0;

    .line 929
    .line 930
    new-instance v4, Lz4/i0;

    .line 931
    .line 932
    move-object/from16 v5, v23

    .line 933
    .line 934
    invoke-direct {v4, v5, v2}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 935
    .line 936
    .line 937
    aput-object v4, v3, v1

    .line 938
    .line 939
    new-array v1, v1, [I

    .line 940
    .line 941
    invoke-virtual {v0, v3, v1}, Le5/n;->E([Lz4/i0;[I)V

    .line 942
    .line 943
    .line 944
    :cond_20
    :goto_16
    add-int/lit8 v9, v19, 0x1

    .line 945
    .line 946
    move-object/from16 v19, v17

    .line 947
    .line 948
    move-object/from16 v8, v18

    .line 949
    .line 950
    goto/16 :goto_13

    .line 951
    .line 952
    :cond_21
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    iput v0, v10, Le5/l;->E:I

    .line 957
    .line 958
    const/4 v0, 0x0

    .line 959
    move v11, v0

    .line 960
    :goto_17
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-ge v11, v0, :cond_22

    .line 965
    .line 966
    move-object/from16 v13, v20

    .line 967
    .line 968
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    move-object v14, v0

    .line 973
    check-cast v14, Lf5/f$a;

    .line 974
    .line 975
    const-string v0, "subtitle:"

    .line 976
    .line 977
    const-string v1, ":"

    .line 978
    .line 979
    invoke-static {v0, v11, v1}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    iget-object v1, v14, Lf5/f$a;->c:Ljava/lang/String;

    .line 984
    .line 985
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v8

    .line 992
    const/4 v2, 0x3

    .line 993
    const/4 v0, 0x1

    .line 994
    new-array v3, v0, [Landroid/net/Uri;

    .line 995
    .line 996
    iget-object v1, v14, Lf5/f$a;->a:Landroid/net/Uri;

    .line 997
    .line 998
    const/4 v4, 0x0

    .line 999
    aput-object v1, v3, v4

    .line 1000
    .line 1001
    new-array v5, v0, [Lv3/i0;

    .line 1002
    .line 1003
    iget-object v0, v14, Lf5/f$a;->b:Lv3/i0;

    .line 1004
    .line 1005
    aput-object v0, v5, v4

    .line 1006
    .line 1007
    const/4 v6, 0x0

    .line 1008
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v7

    .line 1012
    move-object/from16 v0, p0

    .line 1013
    .line 1014
    move-object v1, v8

    .line 1015
    move-object v4, v5

    .line 1016
    move-object v5, v6

    .line 1017
    move-object v6, v7

    .line 1018
    move-object/from16 v7, v21

    .line 1019
    .line 1020
    move-object v13, v8

    .line 1021
    move-wide/from16 v8, p2

    .line 1022
    .line 1023
    invoke-virtual/range {v0 .. v9}, Le5/l;->b(Ljava/lang/String;I[Landroid/net/Uri;[Lv3/i0;Lv3/i0;Ljava/util/List;Ljava/util/Map;J)Le5/n;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    const/4 v1, 0x1

    .line 1028
    new-array v2, v1, [I

    .line 1029
    .line 1030
    const/4 v3, 0x0

    .line 1031
    aput v11, v2, v3

    .line 1032
    .line 1033
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    new-array v2, v1, [Lz4/i0;

    .line 1040
    .line 1041
    new-instance v4, Lz4/i0;

    .line 1042
    .line 1043
    new-array v1, v1, [Lv3/i0;

    .line 1044
    .line 1045
    iget-object v5, v14, Lf5/f$a;->b:Lv3/i0;

    .line 1046
    .line 1047
    aput-object v5, v1, v3

    .line 1048
    .line 1049
    invoke-direct {v4, v13, v1}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 1050
    .line 1051
    .line 1052
    aput-object v4, v2, v3

    .line 1053
    .line 1054
    new-array v1, v3, [I

    .line 1055
    .line 1056
    invoke-virtual {v0, v2, v1}, Le5/n;->E([Lz4/i0;[I)V

    .line 1057
    .line 1058
    .line 1059
    add-int/lit8 v11, v11, 0x1

    .line 1060
    .line 1061
    goto :goto_17

    .line 1062
    :cond_22
    const/4 v0, 0x0

    .line 1063
    new-array v1, v0, [Le5/n;

    .line 1064
    .line 1065
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    check-cast v1, [Le5/n;

    .line 1070
    .line 1071
    iput-object v1, v10, Le5/l;->C:[Le5/n;

    .line 1072
    .line 1073
    new-array v1, v0, [[I

    .line 1074
    .line 1075
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    check-cast v1, [[I

    .line 1080
    .line 1081
    iget-object v1, v10, Le5/l;->C:[Le5/n;

    .line 1082
    .line 1083
    array-length v1, v1

    .line 1084
    iput v1, v10, Le5/l;->A:I

    .line 1085
    .line 1086
    move v1, v0

    .line 1087
    :goto_18
    iget v2, v10, Le5/l;->E:I

    .line 1088
    .line 1089
    if-ge v1, v2, :cond_23

    .line 1090
    .line 1091
    iget-object v2, v10, Le5/l;->C:[Le5/n;

    .line 1092
    .line 1093
    aget-object v2, v2, v1

    .line 1094
    .line 1095
    iget-object v2, v2, Le5/n;->d:Le5/g;

    .line 1096
    .line 1097
    const/4 v3, 0x1

    .line 1098
    iput-boolean v3, v2, Le5/g;->l:Z

    .line 1099
    .line 1100
    add-int/lit8 v1, v1, 0x1

    .line 1101
    .line 1102
    goto :goto_18

    .line 1103
    :cond_23
    iget-object v1, v10, Le5/l;->C:[Le5/n;

    .line 1104
    .line 1105
    array-length v2, v1

    .line 1106
    :goto_19
    if-ge v0, v2, :cond_25

    .line 1107
    .line 1108
    aget-object v3, v1, v0

    .line 1109
    .line 1110
    iget-boolean v4, v3, Le5/n;->L:Z

    .line 1111
    .line 1112
    if-nez v4, :cond_24

    .line 1113
    .line 1114
    iget-wide v4, v3, Le5/n;->X:J

    .line 1115
    .line 1116
    invoke-virtual {v3, v4, v5}, Le5/n;->d(J)Z

    .line 1117
    .line 1118
    .line 1119
    :cond_24
    add-int/lit8 v0, v0, 0x1

    .line 1120
    .line 1121
    goto :goto_19

    .line 1122
    :cond_25
    iget-object v0, v10, Le5/l;->C:[Le5/n;

    .line 1123
    .line 1124
    iput-object v0, v10, Le5/l;->D:[Le5/n;

    .line 1125
    .line 1126
    return-void
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
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
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
.end method

.method public final o()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final q()Lz4/j0;
    .locals 1

    iget-object v0, p0, Le5/l;->B:Lz4/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final s(JZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Le5/l;->D:[Le5/n;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_2

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, v4, Le5/n;->K:Z

    .line 11
    .line 12
    if-eqz v5, :cond_1

    .line 13
    .line 14
    invoke-virtual {v4}, Le5/n;->B()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v5, v4, Le5/n;->D:[Le5/n$c;

    .line 22
    .line 23
    array-length v5, v5

    .line 24
    move v6, v2

    .line 25
    :goto_1
    if-ge v6, v5, :cond_1

    .line 26
    .line 27
    iget-object v7, v4, Le5/n;->D:[Le5/n$c;

    .line 28
    .line 29
    aget-object v7, v7, v6

    .line 30
    .line 31
    iget-object v8, v4, Le5/n;->V:[Z

    .line 32
    .line 33
    aget-boolean v8, v8, v6

    .line 34
    .line 35
    invoke-virtual {v7, p1, p2, p3, v8}, Lz4/b0;->g(JZZ)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
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
.end method

.class public final synthetic Lio/flutter/plugins/firebase/auth/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Ls3/b$a;
.implements Lr3/t$a;
.implements Lv3/g0$e;
.implements Lv5/l$a;
.implements Lz3/h$a;
.implements Lw5/j$b$a;
.implements Lt9/a$a;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Ln9/l;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lr3/d;

    invoke-interface {v0}, Lr3/d;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lq3/m;

    iget-object v1, v0, Lq3/m;->b:Lr3/d;

    invoke-interface {v1}, Lr3/d;->x()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk3/s;

    iget-object v3, v0, Lq3/m;->c:Lq3/n;

    const/4 v4, 0x1

    invoke-interface {v3, v2, v4}, Lq3/n;->b(Lk3/s;I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lr3/t;

    .line 11
    .line 12
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    sget-object v2, Lr3/t;->f:Lh3/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v2, "DELETE FROM log_event_dropped"

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 26
    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Lr3/t;->b:Lt3/a;

    .line 39
    .line 40
    invoke-interface {v0}, Lt3/a;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/Map;

    .line 62
    .line 63
    check-cast p1, Landroid/database/Cursor;

    .line 64
    .line 65
    sget-object v2, Lr3/t;->f:Lh3/c;

    .line 66
    .line 67
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Ljava/util/Set;

    .line 87
    .line 88
    if-nez v4, :cond_0

    .line 89
    .line 90
    new-instance v4, Ljava/util/HashSet;

    .line 91
    .line 92
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_0
    new-instance v2, Lr3/t$b;

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const/4 v5, 0x2

    .line 110
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-direct {v2, v3, v5}, Lr3/t$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    return-object v1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
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

.method public b(Landroid/view/Display;)V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lw5/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v1, p1

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v3, v1

    double-to-long v1, v3

    iput-wide v1, v0, Lw5/j;->k:J

    const-wide/16 v3, 0x50

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x64

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    const-string v1, "Unable to query display refresh rate"

    invoke-static {p1, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lw5/j;->k:J

    :goto_0
    iput-wide v1, v0, Lw5/j;->l:J

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li9/e;

    .line 6
    .line 7
    iget-object v2, v1, Li9/e;->c:Ln7/q;

    .line 8
    .line 9
    invoke-interface {v2}, Ln7/q;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Li9/f;

    .line 14
    .line 15
    new-instance v3, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v4, v1, Li9/e;->e:I

    .line 21
    .line 22
    :goto_0
    if-lez v4, :cond_7

    .line 23
    .line 24
    invoke-interface {v2}, Li9/f;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_7

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const/4 v6, 0x1

    .line 39
    new-array v7, v6, [Ljava/lang/Object;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    aput-object v5, v7, v8

    .line 43
    .line 44
    const-string v9, "IndexBackfiller"

    .line 45
    .line 46
    const-string v10, "Processing collection: %s"

    .line 47
    .line 48
    invoke-static {v6, v9, v10, v7}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v7, v1, Li9/e;->c:Ln7/q;

    .line 52
    .line 53
    invoke-interface {v7}, Ln7/q;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Li9/f;

    .line 58
    .line 59
    iget-object v10, v1, Li9/e;->d:Ln7/q;

    .line 60
    .line 61
    invoke-interface {v10}, Ln7/q;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    check-cast v10, Li9/h;

    .line 66
    .line 67
    invoke-interface {v7, v5}, Li9/f;->i(Ljava/lang/String;)Lj9/b;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    iget-object v12, v10, Li9/h;->a:Li9/g0;

    .line 72
    .line 73
    invoke-interface {v12, v5, v11, v4}, Li9/g0;->c(Ljava/lang/String;Lj9/k$a;I)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    invoke-interface {v12}, Ljava/util/Map;->size()I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    sub-int v13, v4, v13

    .line 82
    .line 83
    if-lez v13, :cond_1

    .line 84
    .line 85
    iget-object v13, v10, Li9/h;->c:Li9/b;

    .line 86
    .line 87
    iget v14, v11, Lj9/b;->e:I

    .line 88
    .line 89
    invoke-interface {v12}, Ljava/util/Map;->size()I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    sub-int v15, v4, v15

    .line 94
    .line 95
    invoke-interface {v13, v14, v15, v5}, Li9/b;->b(IILjava/lang/String;)Ljava/util/HashMap;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    new-instance v13, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    :goto_1
    const/4 v14, -0x1

    .line 106
    invoke-interface {v13}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    invoke-interface {v15}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    if-eqz v16, :cond_4

    .line 119
    .line 120
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v16

    .line 124
    check-cast v16, Lk9/k;

    .line 125
    .line 126
    invoke-virtual/range {v16 .. v16}, Lk9/k;->a()Lj9/i;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-interface {v12, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_3

    .line 135
    .line 136
    invoke-virtual/range {v16 .. v16}, Lk9/k;->a()Lj9/i;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual/range {v16 .. v16}, Lk9/k;->a()Lj9/i;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual/range {v16 .. v16}, Lk9/k;->c()Lk9/f;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    instance-of v0, v0, Lk9/l;

    .line 149
    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    iget-object v0, v10, Li9/h;->a:Li9/g0;

    .line 153
    .line 154
    invoke-interface {v0, v6}, Li9/g0;->g(Lj9/i;)Lj9/m;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    goto :goto_3

    .line 159
    :cond_2
    invoke-static {v6}, Lj9/m;->m(Lj9/i;)Lj9/m;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :goto_3
    invoke-interface {v12, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :cond_3
    invoke-virtual/range {v16 .. v16}, Lk9/k;->b()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    move-object/from16 v0, p0

    .line 175
    .line 176
    const/4 v6, 0x1

    .line 177
    const/4 v8, 0x0

    .line 178
    goto :goto_2

    .line 179
    :cond_4
    invoke-interface {v12}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v10, v13, v0}, Li9/h;->f(Ljava/util/Map;Ljava/util/Set;)V

    .line 184
    .line 185
    .line 186
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v10, v12, v13, v0}, Li9/h;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v14, v0}, Li9/g;->a(ILjava/util/HashMap;)Li9/g;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v6, v0, Li9/g;->b:Lt8/c;

    .line 199
    .line 200
    invoke-interface {v7, v6}, Li9/f;->h(Lt8/c;)V

    .line 201
    .line 202
    .line 203
    iget-object v6, v0, Li9/g;->b:Lt8/c;

    .line 204
    .line 205
    invoke-virtual {v6}, Lt8/c;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    move-object v8, v11

    .line 210
    :cond_5
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-eqz v10, :cond_6

    .line 215
    .line 216
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    check-cast v10, Ljava/util/Map$Entry;

    .line 221
    .line 222
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    check-cast v10, Lj9/g;

    .line 227
    .line 228
    invoke-static {v10}, Lj9/k$a;->g(Lj9/g;)Lj9/b;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v10, v8}, Lj9/k$a;->f(Lj9/k$a;)I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-lez v12, :cond_5

    .line 237
    .line 238
    move-object v8, v10

    .line 239
    goto :goto_4

    .line 240
    :cond_6
    iget-object v6, v8, Lj9/b;->c:Lj9/q;

    .line 241
    .line 242
    iget-object v8, v8, Lj9/b;->d:Lj9/i;

    .line 243
    .line 244
    iget v10, v0, Li9/g;->a:I

    .line 245
    .line 246
    iget v11, v11, Lj9/b;->e:I

    .line 247
    .line 248
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    new-instance v11, Lj9/b;

    .line 253
    .line 254
    invoke-direct {v11, v6, v8, v10}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    .line 255
    .line 256
    .line 257
    const/4 v6, 0x1

    .line 258
    new-array v8, v6, [Ljava/lang/Object;

    .line 259
    .line 260
    const/4 v10, 0x0

    .line 261
    aput-object v11, v8, v10

    .line 262
    .line 263
    const-string v10, "Updating offset: %s"

    .line 264
    .line 265
    invoke-static {v6, v9, v10, v8}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v7, v5, v11}, Li9/f;->n(Ljava/lang/String;Lj9/b;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, v0, Li9/g;->b:Lt8/c;

    .line 272
    .line 273
    invoke-virtual {v0}, Lt8/c;->size()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    sub-int/2addr v4, v0

    .line 278
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-object/from16 v0, p0

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_7
    :goto_5
    iget v0, v1, Li9/e;->e:I

    .line 286
    .line 287
    sub-int/2addr v0, v4

    .line 288
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0
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

.method public h(Lt9/b;)V
    .locals 7

    .line 1
    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lg8/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v3, "FirebaseCrashlytics"

    .line 18
    .line 19
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v1, "Crashlytics native component now available."

    .line 26
    .line 27
    invoke-static {v3, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, v0, Lg8/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lg8/a;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lf8/a;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v3, Lb/z;->e:Lb/z;

    .line 50
    .line 51
    const-string v4, "AnalyticsConnector now available."

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Lb/z;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lw7/a;

    .line 61
    .line 62
    new-instance v4, Ld2/q;

    .line 63
    .line 64
    const/16 v5, 0x8

    .line 65
    .line 66
    invoke-direct {v4, p1, v5}, Ld2/q;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    new-instance v5, Lf8/b;

    .line 70
    .line 71
    invoke-direct {v5}, Lf8/b;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v6, "clx"

    .line 75
    .line 76
    invoke-interface {p1, v6, v5}, Lw7/a;->a(Ljava/lang/String;Lf8/b;)Lw7/b;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-nez v6, :cond_3

    .line 81
    .line 82
    const-string v6, "FirebaseCrashlytics"

    .line 83
    .line 84
    invoke-static {v6, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    .line 91
    .line 92
    invoke-static {v6, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 93
    .line 94
    .line 95
    :cond_1
    const-string v1, "crash"

    .line 96
    .line 97
    invoke-interface {p1, v1, v5}, Lw7/a;->a(Ljava/lang/String;Lf8/b;)Lw7/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    const-string v1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 104
    .line 105
    invoke-static {v6, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 106
    .line 107
    .line 108
    :cond_2
    move-object v6, p1

    .line 109
    :cond_3
    if-eqz v6, :cond_5

    .line 110
    .line 111
    const-string p1, "Registered Firebase Analytics listener."

    .line 112
    .line 113
    invoke-virtual {v3, p1}, Lb/z;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Lg/s;

    .line 117
    .line 118
    const/16 v1, 0x9

    .line 119
    .line 120
    invoke-direct {p1, v1}, Lg/s;-><init>(I)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Lh8/c;

    .line 124
    .line 125
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 126
    .line 127
    invoke-direct {v1, v4, v2}, Lh8/c;-><init>(Ld2/q;Ljava/util/concurrent/TimeUnit;)V

    .line 128
    .line 129
    .line 130
    monitor-enter v0

    .line 131
    :try_start_0
    iget-object v2, v0, Lf8/a;->d:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_4

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Li8/a;

    .line 148
    .line 149
    invoke-virtual {p1, v3}, Lg/s;->c(Li8/a;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    iput-object p1, v5, Lf8/b;->b:Lh8/b;

    .line 154
    .line 155
    iput-object v1, v5, Lf8/b;->a:Lh8/b;

    .line 156
    .line 157
    iput-object p1, v0, Lf8/a;->c:Li8/b;

    .line 158
    .line 159
    iput-object v1, v0, Lf8/a;->b:Lh8/a;

    .line 160
    .line 161
    monitor-exit v0

    .line 162
    goto :goto_1

    .line 163
    :catchall_0
    move-exception p1

    .line 164
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    throw p1

    .line 166
    :cond_5
    const-string p1, "Could not register Firebase Analytics listener; a listener is already registered."

    .line 167
    .line 168
    invoke-virtual {v3, p1, v2}, Lb/z;->s(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 169
    .line 170
    .line 171
    :goto_1
    return-void

    .line 172
    :goto_2
    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Lda/a;

    .line 177
    .line 178
    invoke-interface {p1}, Lda/a;->a()V

    .line 179
    .line 180
    .line 181
    const-string p1, "FirebaseCrashlytics"

    .line 182
    .line 183
    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_6

    .line 188
    .line 189
    const-string v0, "Registering RemoteConfig Rollouts subscriber"

    .line 190
    .line 191
    invoke-static {p1, v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 192
    .line 193
    .line 194
    :cond_6
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lv3/d0$b;

    .line 10
    .line 11
    check-cast p1, Lv3/f1$c;

    .line 12
    .line 13
    iget-object v0, v0, Lv3/d0$b;->a:Lv3/d0;

    .line 14
    .line 15
    iget-object v0, v0, Lv3/d0;->O:Lv3/p0;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lv3/f1$c;->R(Lv3/p0;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lv3/p0;

    .line 24
    .line 25
    check-cast p1, Lv3/f1$c;

    .line 26
    .line 27
    sget v1, Lv3/d0;->h0:I

    .line 28
    .line 29
    invoke-interface {p1, v0}, Lv3/f1$c;->R(Lv3/p0;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lv3/d1;

    .line 36
    .line 37
    check-cast p1, Lv3/f1$c;

    .line 38
    .line 39
    invoke-static {v0}, Lv3/d0;->d0(Lv3/d1;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-interface {p1, v0}, Lv3/f1$c;->p0(Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :goto_0
    check-cast p1, Lw3/b;

    .line 48
    .line 49
    invoke-interface {p1}, Lw3/b;->U()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseMultiFactor;->e(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->s(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->e(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->r(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast p1, Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC;->b(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$-CC;->d(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi$-CC;->b(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi$-CC;->b(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$-CC;->c(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 10
    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    .line 20
    .line 21
    check-cast p1, Lv8/c;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;->a(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Lv8/c;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
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

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Laa/j0;

    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v1, Laa/g0;

    const-string v2, "U"

    invoke-direct {v1, v2, v0}, Laa/g0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, v1}, Laa/j0;->e(Laa/g0;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-virtual {p1}, Laa/j0;->f()V

    return-object v0
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lio/flutter/plugins/firebase/auth/g;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_4

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lg9/m0;

    sget-object v3, Lg9/m0;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj9/m;

    .line 5
    invoke-virtual {v4}, Lj9/m;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    iget-object v5, v4, Lj9/m;->d:Lj9/q;

    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {v4}, Lj9/m;->h()Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Lj9/q;->b:Lj9/q;

    :goto_1
    iget-object v6, v0, Lg9/m0;->b:Ljava/util/HashMap;

    .line 8
    iget-object v7, v4, Lj9/m;->b:Lj9/i;

    .line 9
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v5, v0, Lg9/m0;->b:Ljava/util/HashMap;

    .line 10
    iget-object v6, v4, Lj9/m;->b:Lj9/i;

    .line 11
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj9/q;

    .line 12
    iget-object v4, v4, Lj9/m;->d:Lj9/q;

    .line 13
    invoke-virtual {v5, v4}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/firebase/firestore/f;

    sget-object v0, Lcom/google/firebase/firestore/f$a;->q:Lcom/google/firebase/firestore/f$a;

    const-string v1, "Document version changed between two reads."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    throw p1

    :cond_2
    iget-object v6, v0, Lg9/m0;->b:Ljava/util/HashMap;

    .line 14
    iget-object v4, v4, Lj9/m;->b:Lj9/i;

    .line 15
    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected document type in transaction: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_4
    return-object p1

    .line 16
    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg9/f0;

    if-eqz p1, :cond_5

    new-instance v1, Lcom/google/firebase/firestore/i;

    invoke-direct {v1, p1, v0}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    :cond_5
    return-object v1

    .line 18
    :pswitch_3
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    .line 19
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 20
    :pswitch_4
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    sget-object v0, Lj8/e0;->a:Ljava/util/concurrent/ExecutorService;

    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v1

    .line 22
    :pswitch_5
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Lj8/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj8/u;

    sget-object v0, Lb/z;->e:Lb/z;

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    .line 24
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 25
    invoke-virtual {p1}, Lj8/u;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Lb/z;->h(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lj8/u;->b()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v1, "Deleted report file: "

    .line 28
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Lb/z;->h(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    const-string v2, "Crashlytics could not delete report file: "

    .line 31
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-virtual {v0, p1, v1}, Lb/z;->s(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    .line 34
    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    const-string v0, "FirebaseCrashlytics"

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    .line 35
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 37
    :goto_4
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    check-cast v0, Laa/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "SERVICE_NOT_AVAILABLE"

    if-eqz p1, :cond_c

    const-string v1, "registration_id"

    .line 39
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    const-string v1, "unregistered"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RST"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    if-eqz v1, :cond_a

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "FirebaseMessaging"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "INSTANCE_ID_RESET"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

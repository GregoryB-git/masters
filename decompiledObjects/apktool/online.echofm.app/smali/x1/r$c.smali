.class public final Lx1/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/r$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lx1/r;
    .locals 19

    .line 1
    move-object/from16 v9, p1

    .line 2
    .line 3
    const-string v0, "error_code"

    .line 4
    .line 5
    const-string v1, "error"

    .line 6
    .line 7
    const-string v2, "FACEBOOK_NON_JSON_RESULT"

    .line 8
    .line 9
    const-string v3, "body"

    .line 10
    .line 11
    const-string v4, "code"

    .line 12
    .line 13
    const-string v5, "singleResult"

    .line 14
    .line 15
    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v15, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_c

    .line 24
    .line 25
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-static {v9, v3, v2}, LO1/P;->O(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-eqz v6, :cond_a

    .line 34
    .line 35
    instance-of v7, v6, Lorg/json/JSONObject;

    .line 36
    .line 37
    if-eqz v7, :cond_a

    .line 38
    .line 39
    move-object v7, v6

    .line 40
    check-cast v7, Lorg/json/JSONObject;

    .line 41
    .line 42
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v7
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    const/4 v8, 0x1

    .line 47
    const-string v10, "error_subcode"

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, -0x1

    .line 51
    if-eqz v7, :cond_7

    .line 52
    .line 53
    :try_start_1
    move-object v0, v6

    .line 54
    check-cast v0, Lorg/json/JSONObject;

    .line 55
    .line 56
    invoke-static {v0, v1, v15}, LO1/P;->O(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lorg/json/JSONObject;

    .line 61
    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    move-object v1, v15

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const-string v1, "type"

    .line 67
    .line 68
    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    if-nez v0, :cond_1

    .line 73
    .line 74
    move-object v7, v15

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const-string v7, "message"

    .line 77
    .line 78
    invoke-virtual {v0, v7, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    :goto_1
    if-nez v0, :cond_2

    .line 83
    .line 84
    move v4, v12

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {v0, v4, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    :goto_2
    if-nez v0, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-virtual {v0, v10, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    :goto_3
    if-nez v0, :cond_4

    .line 98
    .line 99
    move-object v10, v15

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    const-string v10, "error_user_msg"

    .line 102
    .line 103
    invoke-virtual {v0, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    :goto_4
    if-nez v0, :cond_5

    .line 108
    .line 109
    move-object v13, v15

    .line 110
    goto :goto_5

    .line 111
    :cond_5
    const-string v13, "error_user_title"

    .line 112
    .line 113
    invoke-virtual {v0, v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    :goto_5
    if-nez v0, :cond_6

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_6
    const-string v14, "is_transient"

    .line 121
    .line 122
    invoke-virtual {v0, v14, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    :goto_6
    move v14, v11

    .line 127
    move v11, v8

    .line 128
    move-object v8, v7

    .line 129
    move v7, v12

    .line 130
    move v12, v4

    .line 131
    :goto_7
    move-object v4, v1

    .line 132
    goto :goto_9

    .line 133
    :cond_7
    move-object v1, v6

    .line 134
    check-cast v1, Lorg/json/JSONObject;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 140
    const-string v4, "error_reason"

    .line 141
    .line 142
    const-string v7, "error_msg"

    .line 143
    .line 144
    if-nez v1, :cond_9

    .line 145
    .line 146
    :try_start_2
    move-object v1, v6

    .line 147
    check-cast v1, Lorg/json/JSONObject;

    .line 148
    .line 149
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_9

    .line 154
    .line 155
    move-object v1, v6

    .line 156
    check-cast v1, Lorg/json/JSONObject;

    .line 157
    .line 158
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_8

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_8
    move v14, v11

    .line 166
    move v7, v12

    .line 167
    move-object v4, v15

    .line 168
    move-object v8, v4

    .line 169
    move-object v10, v8

    .line 170
    move-object v13, v10

    .line 171
    goto :goto_9

    .line 172
    :cond_9
    :goto_8
    move-object v1, v6

    .line 173
    check-cast v1, Lorg/json/JSONObject;

    .line 174
    .line 175
    invoke-virtual {v1, v4, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    move-object v4, v6

    .line 180
    check-cast v4, Lorg/json/JSONObject;

    .line 181
    .line 182
    invoke-virtual {v4, v7, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    move-object v7, v6

    .line 187
    check-cast v7, Lorg/json/JSONObject;

    .line 188
    .line 189
    invoke-virtual {v7, v0, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    move-object v7, v6

    .line 194
    check-cast v7, Lorg/json/JSONObject;

    .line 195
    .line 196
    invoke-virtual {v7, v10, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    move v12, v0

    .line 201
    move v14, v11

    .line 202
    move-object v10, v15

    .line 203
    move-object v13, v10

    .line 204
    move v11, v8

    .line 205
    move-object v8, v4

    .line 206
    goto :goto_7

    .line 207
    :goto_9
    if-eqz v11, :cond_a

    .line 208
    .line 209
    new-instance v16, Lx1/r;

    .line 210
    .line 211
    move-object v11, v6

    .line 212
    check-cast v11, Lorg/json/JSONObject;

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    move-object/from16 v0, v16

    .line 219
    .line 220
    move v1, v5

    .line 221
    move v2, v12

    .line 222
    move v3, v7

    .line 223
    move-object v5, v8

    .line 224
    move-object v6, v13

    .line 225
    move-object v7, v10

    .line 226
    move-object v8, v11

    .line 227
    move-object/from16 v9, p1

    .line 228
    .line 229
    move-object/from16 v10, p2

    .line 230
    .line 231
    move-object/from16 v11, p3

    .line 232
    .line 233
    move-object/from16 v12, v17

    .line 234
    .line 235
    move v13, v14

    .line 236
    move-object/from16 v14, v18

    .line 237
    .line 238
    invoke-direct/range {v0 .. v14}, Lx1/r;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lx1/o;ZLkotlin/jvm/internal/g;)V

    .line 239
    .line 240
    .line 241
    return-object v16

    .line 242
    :cond_a
    invoke-virtual/range {p0 .. p0}, Lx1/r$c;->c()Lx1/r$d;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0, v5}, Lx1/r$d;->a(I)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_c

    .line 251
    .line 252
    new-instance v16, Lx1/r;

    .line 253
    .line 254
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_b

    .line 259
    .line 260
    invoke-static {v9, v3, v2}, LO1/P;->O(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Lorg/json/JSONObject;

    .line 265
    .line 266
    move-object v8, v0

    .line 267
    goto :goto_a

    .line 268
    :cond_b
    move-object v8, v15

    .line 269
    :goto_a
    const/4 v13, 0x0

    .line 270
    const/4 v14, 0x0

    .line 271
    const/4 v2, -0x1

    .line 272
    const/4 v3, -0x1

    .line 273
    const/4 v4, 0x0

    .line 274
    const/4 v6, 0x0

    .line 275
    const/4 v7, 0x0

    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v12, 0x0

    .line 278
    move-object/from16 v0, v16

    .line 279
    .line 280
    move v1, v5

    .line 281
    move-object v5, v6

    .line 282
    move-object v6, v7

    .line 283
    move-object v7, v10

    .line 284
    move-object/from16 v9, p1

    .line 285
    .line 286
    move-object/from16 v10, p2

    .line 287
    .line 288
    move-object/from16 v11, p3

    .line 289
    .line 290
    invoke-direct/range {v0 .. v14}, Lx1/r;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lx1/o;ZLkotlin/jvm/internal/g;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 291
    .line 292
    .line 293
    return-object v16

    .line 294
    :catch_0
    :cond_c
    return-object v15
.end method

.method public final declared-synchronized b()LO1/j;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, LO1/v;->a:LO1/v;

    .line 3
    .line 4
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LO1/v;->f(Ljava/lang/String;)LO1/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, LO1/j;->g:LO1/j$a;

    .line 15
    .line 16
    invoke-virtual {v0}, LO1/j$a;->b()LO1/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {v0}, LO1/r;->c()LO1/j;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :goto_0
    monitor-exit p0

    .line 31
    throw v0
.end method

.method public final c()Lx1/r$d;
    .locals 1

    .line 1
    invoke-static {}, Lx1/r;->a()Lx1/r$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

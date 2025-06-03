.class public final Lp3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/b;
.implements Lp9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo9/e;Ljava/lang/String;Lo9/m;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lp3/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lp3/f;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lp3/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lp3/f;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo9/e;Ljava/net/URL;Lo9/m;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lp3/f;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/f;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lp3/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lp3/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lp3/f;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V
    .locals 0

    .line 3
    iput p5, p0, Lp3/f;->a:I

    iput-object p1, p0, Lp3/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lp3/f;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp3/f;->d:Ljava/lang/Object;

    iput-object p4, p0, Lp3/f;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 8

    .line 1
    iget-object v0, p0, Lp3/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ljava/lang/String;

    .line 5
    .line 6
    const-string v2, "providerInstalled.task\n \u2026context, options)\n      }"

    .line 7
    .line 8
    const-string v3, "options"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lp3/f;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lo9/e;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Lp3/f;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lo9/m;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v5, "name"

    .line 26
    .line 27
    invoke-static {v0, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v4, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v3, Lo9/e;->j:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v5, v1, Lo9/e;->a:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    new-instance v6, Lk1/a;

    .line 42
    .line 43
    const/16 v7, 0xb

    .line 44
    .line 45
    invoke-direct {v6, v7, v1, v4}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v5, v1, Lo9/e;->a:Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    new-instance v6, Lo9/c;

    .line 55
    .line 56
    invoke-direct {v6, v1, v0, p1, v4}, Lo9/c;-><init>(Lo9/e;Ljava/lang/String;Ljava/lang/Object;Lo9/m;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lp3/f;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lo9/e;

    .line 70
    .line 71
    iget-object v1, p0, Lp3/f;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/net/URL;

    .line 74
    .line 75
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, p0, Lp3/f;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lo9/m;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sget-object v3, Lo9/e;->j:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v5, v0, Lo9/e;->a:Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    new-instance v6, Lo9/l;

    .line 97
    .line 98
    const/4 v7, 0x7

    .line 99
    invoke-direct {v6, v7, v0, v4}, Lo9/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iget-object v5, v0, Lo9/e;->a:Ljava/util/concurrent/Executor;

    .line 107
    .line 108
    new-instance v6, Lg9/q;

    .line 109
    .line 110
    invoke-direct {v6, v0, v1, p1, v4}, Lg9/q;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    return-object p1
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

.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lp3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lp3/f;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lqb/a;

    .line 10
    .line 11
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/content/Context;

    .line 16
    .line 17
    iget-object v1, p0, Lp3/f;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lqb/a;

    .line 20
    .line 21
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lr3/d;

    .line 26
    .line 27
    iget-object v2, p0, Lp3/f;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lqb/a;

    .line 30
    .line 31
    invoke-interface {v2}, Lqb/a;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lq3/e;

    .line 36
    .line 37
    iget-object v3, p0, Lp3/f;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lqb/a;

    .line 40
    .line 41
    invoke-interface {v3}, Lqb/a;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lt3/a;

    .line 46
    .line 47
    new-instance v3, Lq3/d;

    .line 48
    .line 49
    invoke-direct {v3, v0, v1, v2}, Lq3/d;-><init>(Landroid/content/Context;Lr3/d;Lq3/e;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :goto_0
    iget-object v0, p0, Lp3/f;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lqb/a;

    .line 56
    .line 57
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lt9/b;

    .line 62
    .line 63
    iget-object v1, p0, Lp3/f;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lqb/a;

    .line 66
    .line 67
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lt9/b;

    .line 72
    .line 73
    iget-object v2, p0, Lp3/f;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lqb/a;

    .line 76
    .line 77
    invoke-interface {v2}, Lqb/a;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lt9/a;

    .line 82
    .line 83
    iget-object v3, p0, Lp3/f;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lqb/a;

    .line 86
    .line 87
    invoke-interface {v3}, Lqb/a;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    new-instance v4, Lo9/b;

    .line 94
    .line 95
    invoke-direct {v4, v0, v1, v2, v3}, Lo9/b;-><init>(Lt9/b;Lt9/b;Lt9/a;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    return-object v4

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

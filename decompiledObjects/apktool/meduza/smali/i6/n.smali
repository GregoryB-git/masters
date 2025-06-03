.class public final synthetic Li6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li6/a;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li6/n;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/n;->b:Ljava/lang/Object;

    iput-object p2, p0, Li6/n;->c:Ljava/lang/Object;

    iput-object p3, p0, Li6/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll6/i1;Ll6/f;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li6/n;->a:I

    .line 2
    iput-object p2, p0, Li6/n;->b:Ljava/lang/Object;

    iput-object p3, p0, Li6/n;->c:Ljava/lang/Object;

    iput-object p1, p0, Li6/n;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Li6/n;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :pswitch_0
    iget-object v0, p0, Li6/n;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Li6/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Li6/a;->D()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Li6/a;->D()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "google.message_id"

    .line 38
    .line 39
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, Li6/a;->a:Landroid/content/Intent;

    .line 43
    .line 44
    const-string v5, "google.product_id"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, Li6/a;->a:Landroid/content/Intent;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_1
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const-string v1, "google.product_id"

    .line 70
    .line 71
    invoke-virtual {v3, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iget-object v0, p0, Li6/n;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/content/Context;

    .line 77
    .line 78
    const-string v1, "supports_message_handled"

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    invoke-virtual {v3, v1, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Li6/z;->a(Landroid/content/Context;)Li6/z;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Li6/w;

    .line 89
    .line 90
    monitor-enter v0

    .line 91
    :try_start_0
    iget v4, v0, Li6/z;->d:I

    .line 92
    .line 93
    add-int/lit8 v5, v4, 0x1

    .line 94
    .line 95
    iput v5, v0, Li6/z;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    monitor-exit v0

    .line 98
    invoke-direct {v1, v4, v2, v3}, Li6/w;-><init>(IILandroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Li6/z;->b(Li6/x;)Lcom/google/android/gms/tasks/Task;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_0
    iget-object v1, p0, Li6/n;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 108
    .line 109
    sget-object v2, Li6/l;->a:Li6/l;

    .line 110
    .line 111
    new-instance v3, Li6/m;

    .line 112
    .line 113
    invoke-direct {v3, v1}, Li6/m;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_0
    move-exception v1

    .line 121
    monitor-exit v0

    .line 122
    throw v1

    .line 123
    :goto_1
    iget-object v0, p0, Li6/n;->d:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ll6/i1;

    .line 126
    .line 127
    iget v3, v0, Ll6/i1;->b:I

    .line 128
    .line 129
    if-lez v3, :cond_4

    .line 130
    .line 131
    iget-object v3, p0, Li6/n;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Ll6/f;

    .line 134
    .line 135
    iget-object v0, v0, Ll6/i1;->c:Landroid/os/Bundle;

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-object v1, p0, Li6/n;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :cond_3
    invoke-virtual {v3, v1}, Ll6/f;->onCreate(Landroid/os/Bundle;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object v0, p0, Li6/n;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Ll6/i1;

    .line 153
    .line 154
    iget v0, v0, Ll6/i1;->b:I

    .line 155
    .line 156
    if-lt v0, v2, :cond_5

    .line 157
    .line 158
    iget-object v0, p0, Li6/n;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ll6/f;

    .line 161
    .line 162
    invoke-virtual {v0}, Ll6/f;->onStart()V

    .line 163
    .line 164
    .line 165
    :cond_5
    iget-object v0, p0, Li6/n;->d:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ll6/i1;

    .line 168
    .line 169
    iget v0, v0, Ll6/i1;->b:I

    .line 170
    .line 171
    const/4 v1, 0x3

    .line 172
    if-lt v0, v1, :cond_6

    .line 173
    .line 174
    iget-object v0, p0, Li6/n;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Ll6/f;

    .line 177
    .line 178
    invoke-virtual {v0}, Ll6/f;->onResume()V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget-object v0, p0, Li6/n;->d:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Ll6/i1;

    .line 184
    .line 185
    iget v0, v0, Ll6/i1;->b:I

    .line 186
    .line 187
    const/4 v1, 0x4

    .line 188
    if-lt v0, v1, :cond_7

    .line 189
    .line 190
    iget-object v0, p0, Li6/n;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Ll6/f;

    .line 193
    .line 194
    invoke-virtual {v0}, Ll6/f;->onStop()V

    .line 195
    .line 196
    .line 197
    :cond_7
    iget-object v0, p0, Li6/n;->d:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ll6/i1;

    .line 200
    .line 201
    iget v0, v0, Ll6/i1;->b:I

    .line 202
    .line 203
    const/4 v1, 0x5

    .line 204
    if-lt v0, v1, :cond_8

    .line 205
    .line 206
    iget-object v0, p0, Li6/n;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Ll6/f;

    .line 209
    .line 210
    invoke-virtual {v0}, Ll6/f;->onDestroy()V

    .line 211
    .line 212
    .line 213
    :cond_8
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

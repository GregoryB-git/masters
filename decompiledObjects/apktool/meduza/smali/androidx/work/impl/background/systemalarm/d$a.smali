.class public final Landroidx/work/impl/background/systemalarm/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/background/systemalarm/d;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/work/impl/background/systemalarm/d;


# direct methods
.method public constructor <init>(Landroidx/work/impl/background/systemalarm/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/impl/background/systemalarm/d;->o:Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/work/impl/background/systemalarm/d;->o:Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Landroid/content/Intent;

    .line 16
    .line 17
    iput-object v2, v1, Landroidx/work/impl/background/systemalarm/d;->p:Landroid/content/Intent;

    .line 18
    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 20
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/work/impl/background/systemalarm/d;->p:Landroid/content/Intent;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 31
    .line 32
    iget-object v1, v1, Landroidx/work/impl/background/systemalarm/d;->p:Landroid/content/Intent;

    .line 33
    .line 34
    const-string v2, "KEY_START_ID"

    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v3, Landroidx/work/impl/background/systemalarm/d;->t:Ljava/lang/String;

    .line 45
    .line 46
    const-string v4, "Processing command "

    .line 47
    .line 48
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 53
    .line 54
    iget-object v5, v5, Landroidx/work/impl/background/systemalarm/d;->p:Landroid/content/Intent;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v5, ", "

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v2, v3, v4}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/work/impl/background/systemalarm/d;->a:Landroid/content/Context;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v5, " ("

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v5, ")"

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v2, v4}, Ly2/v;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    :try_start_1
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v6, "Acquiring operation wake lock ("

    .line 117
    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v6, ") "

    .line 125
    .line 126
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v4, v3, v5}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 140
    .line 141
    .line 142
    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 143
    .line 144
    iget-object v5, v4, Landroidx/work/impl/background/systemalarm/d;->f:Landroidx/work/impl/background/systemalarm/a;

    .line 145
    .line 146
    iget-object v6, v4, Landroidx/work/impl/background/systemalarm/d;->p:Landroid/content/Intent;

    .line 147
    .line 148
    invoke-virtual {v5, v1, v6, v4}, Landroidx/work/impl/background/systemalarm/a;->b(ILandroid/content/Intent;Landroidx/work/impl/background/systemalarm/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v5, "Releasing operation wake lock ("

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, ") "

    .line 169
    .line 170
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v1, v3, v0}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 187
    .line 188
    iget-object v0, v0, Landroidx/work/impl/background/systemalarm/d;->b:La3/b;

    .line 189
    .line 190
    invoke-interface {v0}, La3/b;->b()La3/c$a;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v1, Landroidx/work/impl/background/systemalarm/d$d;

    .line 195
    .line 196
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 197
    .line 198
    invoke-direct {v1, v2}, Landroidx/work/impl/background/systemalarm/d$d;-><init>(Landroidx/work/impl/background/systemalarm/d;)V

    .line 199
    .line 200
    .line 201
    goto :goto_0

    .line 202
    :catchall_0
    move-exception v1

    .line 203
    :try_start_2
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    sget-object v4, Landroidx/work/impl/background/systemalarm/d;->t:Ljava/lang/String;

    .line 208
    .line 209
    const-string v5, "Unexpected error in onHandleIntent"

    .line 210
    .line 211
    invoke-virtual {v3, v4, v5, v1}, Lo2/j;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v3, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string v5, "Releasing operation wake lock ("

    .line 224
    .line 225
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v0, ") "

    .line 232
    .line 233
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v1, v4, v0}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 250
    .line 251
    iget-object v0, v0, Landroidx/work/impl/background/systemalarm/d;->b:La3/b;

    .line 252
    .line 253
    invoke-interface {v0}, La3/b;->b()La3/c$a;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    new-instance v1, Landroidx/work/impl/background/systemalarm/d$d;

    .line 258
    .line 259
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 260
    .line 261
    invoke-direct {v1, v2}, Landroidx/work/impl/background/systemalarm/d$d;-><init>(Landroidx/work/impl/background/systemalarm/d;)V

    .line 262
    .line 263
    .line 264
    :goto_0
    invoke-virtual {v0, v1}, La3/c$a;->execute(Ljava/lang/Runnable;)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :catchall_1
    move-exception v1

    .line 269
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    sget-object v4, Landroidx/work/impl/background/systemalarm/d;->t:Ljava/lang/String;

    .line 274
    .line 275
    new-instance v5, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v6, "Releasing operation wake lock ("

    .line 281
    .line 282
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v0, ") "

    .line 289
    .line 290
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v3, v4, v0}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 304
    .line 305
    .line 306
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 307
    .line 308
    iget-object v0, v0, Landroidx/work/impl/background/systemalarm/d;->b:La3/b;

    .line 309
    .line 310
    invoke-interface {v0}, La3/b;->b()La3/c$a;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    new-instance v2, Landroidx/work/impl/background/systemalarm/d$d;

    .line 315
    .line 316
    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/d$a;->a:Landroidx/work/impl/background/systemalarm/d;

    .line 317
    .line 318
    invoke-direct {v2, v3}, Landroidx/work/impl/background/systemalarm/d$d;-><init>(Landroidx/work/impl/background/systemalarm/d;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v2}, La3/c$a;->execute(Ljava/lang/Runnable;)V

    .line 322
    .line 323
    .line 324
    throw v1

    .line 325
    :cond_0
    :goto_1
    return-void

    .line 326
    :catchall_2
    move-exception v1

    .line 327
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 328
    throw v1
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

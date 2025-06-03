.class public final synthetic Lp3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lp3/a;->a:I

    iput-object p1, p0, Lp3/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lp3/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp3/a;->d:Ljava/lang/Object;

    iput-object p4, p0, Lp3/a;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lp3/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :pswitch_0
    iget-object v0, p0, Lp3/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    .line 11
    .line 12
    iget-object v1, p0, Lp3/a;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lp3/a;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lv8/b;

    .line 19
    .line 20
    iget-object v3, p0, Lp3/a;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;->e(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Ljava/lang/String;Lv8/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, p0, Lp3/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lz4/w$a;

    .line 31
    .line 32
    iget-object v1, p0, Lp3/a;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lz4/w;

    .line 35
    .line 36
    iget-object v2, p0, Lp3/a;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lz4/t$b;

    .line 39
    .line 40
    iget-object v3, p0, Lp3/a;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lz4/q;

    .line 43
    .line 44
    iget v0, v0, Lz4/w$a;->a:I

    .line 45
    .line 46
    invoke-interface {v1, v0, v2, v3}, Lz4/w;->o0(ILz4/t$b;Lz4/q;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_2
    iget-object v0, p0, Lp3/a;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lp3/c;

    .line 53
    .line 54
    iget-object v1, p0, Lp3/a;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lk3/s;

    .line 57
    .line 58
    iget-object v2, p0, Lp3/a;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lh3/j;

    .line 61
    .line 62
    iget-object v3, p0, Lp3/a;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lk3/n;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    :try_start_0
    iget-object v4, v0, Lp3/c;->c:Ll3/e;

    .line 70
    .line 71
    invoke-virtual {v1}, Lk3/s;->b()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v4, v5}, Ll3/e;->a(Ljava/lang/String;)Ll3/m;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_0

    .line 80
    .line 81
    const-string v0, "Transport backend \'%s\' is not registered"

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    new-array v3, v3, [Ljava/lang/Object;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {v1}, Lk3/s;->b()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    aput-object v1, v3, v4

    .line 92
    .line 93
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, Lp3/c;->f:Ljava/util/logging/Logger;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v1}, Lh3/j;->a(Ljava/lang/Exception;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-interface {v4, v3}, Ll3/m;->a(Lk3/n;)Lk3/h;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iget-object v4, v0, Lp3/c;->e:Ls3/b;

    .line 116
    .line 117
    new-instance v5, Lp3/b;

    .line 118
    .line 119
    invoke-direct {v5, v0, v1, v3}, Lp3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v4, v5}, Ls3/b;->f(Ls3/b$a;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-interface {v2, v0}, Lh3/j;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    .line 131
    sget-object v1, Lp3/c;->f:Ljava/util/logging/Logger;

    .line 132
    .line 133
    const-string v3, "Error scheduling event "

    .line 134
    .line 135
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v1, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v2, v0}, Lh3/j;->a(Ljava/lang/Exception;)V

    .line 154
    .line 155
    .line 156
    :goto_0
    return-void

    .line 157
    :goto_1
    iget-object v0, p0, Lp3/a;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    .line 160
    .line 161
    iget-object v1, p0, Lp3/a;->c:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Ljava/lang/String;

    .line 164
    .line 165
    iget-object v2, p0, Lp3/a;->d:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    .line 168
    .line 169
    iget-object v3, p0, Lp3/a;->e:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonGetOptions;

    .line 172
    .line 173
    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->s(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Ljava/lang/String;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonGetOptions;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

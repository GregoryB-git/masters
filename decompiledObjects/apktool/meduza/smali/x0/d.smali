.class public final synthetic Lx0/d;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lx0/d;->a:I

    iput-object p1, p0, Lx0/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lx0/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lx0/d;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lx0/d;->a:I

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
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    .line 11
    .line 12
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

    .line 15
    .line 16
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->d(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    .line 27
    .line 28
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Map;

    .line 31
    .line 32
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;->b(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 43
    .line 44
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/util/Map;

    .line 47
    .line 48
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :try_start_0
    const-string v3, "mediaItem"

    .line 56
    .line 57
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/util/Map;

    .line 62
    .line 63
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->g(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v3, Lcom/ryanheise/audioservice/AudioService;->F:Lcom/ryanheise/audioservice/AudioService;

    .line 68
    .line 69
    invoke-virtual {v3, v1}, Lcom/ryanheise/audioservice/AudioService;->n(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lcom/ryanheise/audioservice/b$c;->d:Landroid/os/Handler;

    .line 73
    .line 74
    new-instance v3, Lta/d;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-direct {v3, v4, v2}, Lta/d;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    .line 85
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$c;->d:Landroid/os/Handler;

    .line 86
    .line 87
    new-instance v3, Lx0/q0;

    .line 88
    .line 89
    const/16 v4, 0x13

    .line 90
    .line 91
    invoke-direct {v3, v4, v2, v1}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    return-void

    .line 98
    :pswitch_3
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Le8/f;

    .line 101
    .line 102
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Ljava/lang/Runnable;

    .line 105
    .line 106
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Le8/g$b;

    .line 109
    .line 110
    iget-object v0, v0, Le8/f;->a:Ljava/util/concurrent/ExecutorService;

    .line 111
    .line 112
    new-instance v3, Lx0/f;

    .line 113
    .line 114
    const/16 v4, 0xd

    .line 115
    .line 116
    invoke-direct {v3, v4, v1, v2}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_4
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La4/g$a;

    .line 126
    .line 127
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, La4/g;

    .line 130
    .line 131
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, Ljava/lang/Exception;

    .line 134
    .line 135
    iget v3, v0, La4/g$a;->a:I

    .line 136
    .line 137
    iget-object v0, v0, La4/g$a;->b:Lz4/t$b;

    .line 138
    .line 139
    invoke-interface {v1, v3, v0, v2}, La4/g;->P(ILz4/t$b;Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_5
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lv3/z0$a;

    .line 146
    .line 147
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Landroid/util/Pair;

    .line 150
    .line 151
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Ljava/lang/Exception;

    .line 154
    .line 155
    iget-object v0, v0, Lv3/z0$a;->b:Lv3/z0;

    .line 156
    .line 157
    iget-object v0, v0, Lv3/z0;->h:Lw3/a;

    .line 158
    .line 159
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Lz4/t$b;

    .line 170
    .line 171
    invoke-interface {v0, v3, v1, v2}, La4/g;->P(ILz4/t$b;Ljava/lang/Exception;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_6
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lx0/n0;

    .line 178
    .line 179
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Landroid/view/View;

    .line 182
    .line 183
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Landroid/graphics/Rect;

    .line 186
    .line 187
    const-string v3, "$impl"

    .line 188
    .line 189
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v0, "$lastInEpicenterRect"

    .line 193
    .line 194
    invoke-static {v2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v2}, Lx0/n0;->f(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_7
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Landroid/view/ViewGroup;

    .line 204
    .line 205
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Landroid/view/View;

    .line 208
    .line 209
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Lx0/e$a;

    .line 212
    .line 213
    const-string v3, "$container"

    .line 214
    .line 215
    invoke-static {v0, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const-string v3, "this$0"

    .line 219
    .line 220
    invoke-static {v2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v2, Lx0/e$a;->c:Lx0/e$b;

    .line 227
    .line 228
    iget-object v0, v0, Lx0/e$f;->a:Lx0/r0$c;

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Lx0/r0$c;->c(Lx0/r0$a;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :goto_1
    iget-object v0, p0, Lx0/d;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;

    .line 237
    .line 238
    iget-object v1, p0, Lx0/d;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, Ljava/util/Map;

    .line 241
    .line 242
    iget-object v2, p0, Lx0/d;->d:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 245
    .line 246
    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->o(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

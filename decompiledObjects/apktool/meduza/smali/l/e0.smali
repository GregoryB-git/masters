.class public final Ll/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/e0$a;,
        Ll/e0$b;,
        Ll/e0$c;,
        Ll/e0$e;,
        Ll/e0$d;,
        Ll/e0$f;
    }
.end annotation


# static fields
.field public static final l:Landroid/graphics/RectF;

.field public static m:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Z

.field public c:F

.field public d:F

.field public e:F

.field public f:[I

.field public g:Z

.field public h:Landroid/text/TextPaint;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/content/Context;

.field public final k:Ll/e0$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Ll/e0;->l:Landroid/graphics/RectF;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Ll/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll/e0;->a:I

    iput-boolean v0, p0, Ll/e0;->b:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ll/e0;->c:F

    iput v1, p0, Ll/e0;->d:F

    iput v1, p0, Ll/e0;->e:F

    new-array v1, v0, [I

    iput-object v1, p0, Ll/e0;->f:[I

    iput-boolean v0, p0, Ll/e0;->g:Z

    iput-object p1, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/e0;->j:Landroid/content/Context;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_0

    new-instance p1, Ll/e0$e;

    invoke-direct {p1}, Ll/e0$e;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Ll/e0$d;

    invoke-direct {p1}, Ll/e0$d;-><init>()V

    :goto_0
    iput-object p1, p0, Ll/e0;->k:Ll/e0$d;

    return-void
.end method

.method public static b([I)[I
    .locals 6

    array-length v0, p0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->sort([I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget v4, p0, v3

    if-lez v4, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v0, v3, :cond_3

    return-object p0

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array v0, p0, [I

    :goto_1
    if-ge v2, p0, :cond_4

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3

    :try_start_0
    sget-object v0, Ll/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const-class v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, p0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v1, Ll/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to retrieve TextView#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "() method"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ACTVAutoSizeHelper"

    invoke-static {v1, p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    invoke-static {p0}, Ll/e0;->d(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v0, "ACTVAutoSizeHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to invoke TextView#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "() method"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-object p2

    :goto_1
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ll/e0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Ll/e0;->a:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-boolean v0, p0, Ll/e0;->b:Z

    .line 20
    .line 21
    if-eqz v0, :cond_7

    .line 22
    .line 23
    iget-object v0, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_6

    .line 30
    .line 31
    iget-object v0, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-gtz v0, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v0, p0, Ll/e0;->k:Ll/e0$d;

    .line 41
    .line 42
    iget-object v3, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ll/e0$f;->b(Landroid/widget/TextView;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const/high16 v0, 0x100000

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-object v0, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v3, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    sub-int/2addr v0, v3

    .line 66
    iget-object v3, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/widget/TextView;->getTotalPaddingRight()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    sub-int/2addr v0, v3

    .line 73
    :goto_1
    iget-object v3, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    iget-object v4, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    sub-int/2addr v3, v4

    .line 86
    iget-object v4, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    if-lez v0, :cond_6

    .line 94
    .line 95
    if-gtz v3, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    sget-object v4, Ll/e0;->l:Landroid/graphics/RectF;

    .line 99
    .line 100
    monitor-enter v4

    .line 101
    :try_start_0
    invoke-virtual {v4}, Landroid/graphics/RectF;->setEmpty()V

    .line 102
    .line 103
    .line 104
    int-to-float v0, v0

    .line 105
    iput v0, v4, Landroid/graphics/RectF;->right:F

    .line 106
    .line 107
    int-to-float v0, v3

    .line 108
    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 109
    .line 110
    invoke-virtual {p0, v4}, Ll/e0;->c(Landroid/graphics/RectF;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    int-to-float v0, v0

    .line 115
    iget-object v3, p0, Ll/e0;->i:Landroid/widget/TextView;

    .line 116
    .line 117
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    cmpl-float v3, v0, v3

    .line 122
    .line 123
    if-eqz v3, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0, v0, v2}, Ll/e0;->f(FI)V

    .line 126
    .line 127
    .line 128
    :cond_5
    monitor-exit v4

    .line 129
    goto :goto_3

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    throw v0

    .line 133
    :cond_6
    :goto_2
    return-void

    .line 134
    :cond_7
    :goto_3
    iput-boolean v1, p0, Ll/e0;->b:Z

    .line 135
    .line 136
    return-void
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

.method public final c(Landroid/graphics/RectF;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ll/e0;->f:[I

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-eqz v2, :cond_7

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    sub-int/2addr v2, v3

    .line 12
    const/4 v4, 0x0

    .line 13
    move v5, v3

    .line 14
    move v6, v4

    .line 15
    :goto_0
    if-gt v5, v2, :cond_6

    .line 16
    .line 17
    add-int v6, v5, v2

    .line 18
    .line 19
    div-int/lit8 v6, v6, 0x2

    .line 20
    .line 21
    iget-object v7, v0, Ll/e0;->f:[I

    .line 22
    .line 23
    aget v7, v7, v6

    .line 24
    .line 25
    iget-object v8, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    iget-object v9, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v9}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    if-eqz v9, :cond_0

    .line 38
    .line 39
    iget-object v10, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-interface {v9, v8, v10}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    move-object v8, v9

    .line 48
    :cond_0
    iget-object v9, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-static {v9}, Ll/e0$a;->b(Landroid/widget/TextView;)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    iget-object v10, v0, Ll/e0;->h:Landroid/text/TextPaint;

    .line 55
    .line 56
    if-nez v10, :cond_1

    .line 57
    .line 58
    new-instance v10, Landroid/text/TextPaint;

    .line 59
    .line 60
    invoke-direct {v10}, Landroid/text/TextPaint;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v10, v0, Ll/e0;->h:Landroid/text/TextPaint;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v10}, Landroid/graphics/Paint;->reset()V

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object v10, v0, Ll/e0;->h:Landroid/text/TextPaint;

    .line 70
    .line 71
    iget-object v11, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {v11}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v10, v11}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 78
    .line 79
    .line 80
    iget-object v10, v0, Ll/e0;->h:Landroid/text/TextPaint;

    .line 81
    .line 82
    int-to-float v7, v7

    .line 83
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 84
    .line 85
    .line 86
    iget-object v7, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 87
    .line 88
    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 89
    .line 90
    const-string v11, "getLayoutAlignment"

    .line 91
    .line 92
    invoke-static {v11, v7, v10}, Ll/e0;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    move-object v11, v7

    .line 97
    check-cast v11, Landroid/text/Layout$Alignment;

    .line 98
    .line 99
    iget v7, v1, Landroid/graphics/RectF;->right:F

    .line 100
    .line 101
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    iget-object v14, v0, Ll/e0;->i:Landroid/widget/TextView;

    .line 106
    .line 107
    iget-object v15, v0, Ll/e0;->h:Landroid/text/TextPaint;

    .line 108
    .line 109
    iget-object v7, v0, Ll/e0;->k:Ll/e0$d;

    .line 110
    .line 111
    move-object v10, v8

    .line 112
    move v13, v9

    .line 113
    move-object/from16 v16, v7

    .line 114
    .line 115
    invoke-static/range {v10 .. v16}, Ll/e0$c;->a(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;IILandroid/widget/TextView;Landroid/text/TextPaint;Ll/e0$f;)Landroid/text/StaticLayout;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const/4 v10, -0x1

    .line 120
    if-eq v9, v10, :cond_2

    .line 121
    .line 122
    invoke-virtual {v7}, Landroid/text/StaticLayout;->getLineCount()I

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-gt v10, v9, :cond_3

    .line 127
    .line 128
    invoke-virtual {v7}, Landroid/text/StaticLayout;->getLineCount()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    sub-int/2addr v9, v3

    .line 133
    invoke-virtual {v7, v9}, Landroid/text/Layout;->getLineEnd(I)I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eq v9, v8, :cond_2

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    invoke-virtual {v7}, Landroid/text/Layout;->getHeight()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    int-to-float v7, v7

    .line 149
    iget v8, v1, Landroid/graphics/RectF;->bottom:F

    .line 150
    .line 151
    cmpl-float v7, v7, v8

    .line 152
    .line 153
    if-lez v7, :cond_4

    .line 154
    .line 155
    :cond_3
    :goto_2
    move v7, v4

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move v7, v3

    .line 158
    :goto_3
    if-eqz v7, :cond_5

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x1

    .line 161
    .line 162
    move/from16 v17, v6

    .line 163
    .line 164
    move v6, v5

    .line 165
    move/from16 v5, v17

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 170
    .line 171
    move v2, v6

    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_6
    iget-object v1, v0, Ll/e0;->f:[I

    .line 175
    .line 176
    aget v1, v1, v6

    .line 177
    .line 178
    return v1

    .line 179
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    const-string v2, "No available text sizes to choose from."

    .line 182
    .line 183
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v1
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

.method public final f(FI)V
    .locals 2

    iget-object v0, p0, Ll/e0;->j:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iget-object p2, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Paint;->getTextSize()F

    move-result p2

    cmpl-float p2, p1, p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-static {p1}, Ll/e0$b;->a(Landroid/view/View;)Z

    move-result p1

    iget-object p2, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    iput-boolean p2, p0, Ll/e0;->b:Z

    :try_start_0
    const-string v0, "nullLayouts"

    invoke-static {v0}, Ll/e0;->d(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/e0;->i:Landroid/widget/TextView;

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    const-string v0, "ACTVAutoSizeHelper"

    const-string v1, "Failed to invoke TextView#nullLayouts() method"

    invoke-static {v0, v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    if-nez p1, :cond_2

    iget-object p1, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->forceLayout()V

    :goto_2
    iget-object p1, p0, Ll/e0;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_3
    return-void
.end method

.method public final g()Z
    .locals 7

    invoke-virtual {p0}, Ll/e0;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Ll/e0;->a:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    iget-boolean v0, p0, Ll/e0;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/e0;->f:[I

    array-length v0, v0

    if-nez v0, :cond_2

    :cond_0
    iget v0, p0, Ll/e0;->e:F

    iget v3, p0, Ll/e0;->d:F

    sub-float/2addr v0, v3

    iget v3, p0, Ll/e0;->c:F

    div-float/2addr v0, v3

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v0, v3

    add-int/2addr v0, v2

    new-array v3, v0, [I

    :goto_0
    if-ge v1, v0, :cond_1

    iget v4, p0, Ll/e0;->d:F

    int-to-float v5, v1

    iget v6, p0, Ll/e0;->c:F

    mul-float/2addr v5, v6

    add-float/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    aput v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Ll/e0;->b([I)[I

    move-result-object v0

    iput-object v0, p0, Ll/e0;->f:[I

    :cond_2
    iput-boolean v2, p0, Ll/e0;->b:Z

    goto :goto_1

    :cond_3
    iput-boolean v1, p0, Ll/e0;->b:Z

    :goto_1
    iget-boolean v0, p0, Ll/e0;->b:Z

    return v0
.end method

.method public final h()Z
    .locals 5

    iget-object v0, p0, Ll/e0;->f:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    iput-boolean v4, p0, Ll/e0;->g:Z

    if-eqz v4, :cond_1

    iput v3, p0, Ll/e0;->a:I

    aget v2, v0, v2

    int-to-float v2, v2

    iput v2, p0, Ll/e0;->d:F

    sub-int/2addr v1, v3

    aget v0, v0, v1

    int-to-float v0, v0

    iput v0, p0, Ll/e0;->e:F

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Ll/e0;->c:F

    :cond_1
    return v4
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Ll/e0;->i:Landroid/widget/TextView;

    instance-of v0, v0, Ll/k;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j(FFF)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const-string v2, "px) is less or equal to (0px)"

    if-lez v1, :cond_2

    cmpg-float v1, p2, p1

    if-lez v1, :cond_1

    cmpg-float v0, p3, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Ll/e0;->a:I

    iput p1, p0, Ll/e0;->d:F

    iput p2, p0, Ll/e0;->e:F

    iput p3, p0, Ll/e0;->c:F

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll/e0;->g:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The auto-size step granularity ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Maximum auto-size text size ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, "px) is less or equal to minimum auto-size text size ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "px)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Minimum auto-size text size ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.class public final Landroidx/work/impl/background/systemalarm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/d;


# static fields
.field public static final f:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/lang/Object;

.field public final d:Lo2/a;

.field public final e:Ll/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "CommandHandler"

    invoke-static {v0}, Lo2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lp2/m0;Ll/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/a;->d:Lo2/a;

    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/a;->e:Ll/l;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->b:Ljava/util/HashMap;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public static c(Landroid/content/Intent;)Lx2/l;
    .locals 4

    new-instance v0, Lx2/l;

    const-string v1, "KEY_WORKSPEC_ID"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_WORKSPEC_GENERATION"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    invoke-direct {v0, v1, p0}, Lx2/l;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static d(Landroid/content/Intent;Lx2/l;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lx2/l;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "KEY_WORKSPEC_ID"

    .line 4
    .line 5
    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    iget p1, p1, Lx2/l;->b:I

    .line 9
    .line 10
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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


# virtual methods
.method public final a(Lx2/l;Z)V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/work/impl/background/systemalarm/c;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/a;->e:Ll/l;

    invoke-virtual {v2, p1}, Ll/l;->f(Lx2/l;)Lp2/x;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p2}, Landroidx/work/impl/background/systemalarm/c;->g(Z)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(ILandroid/content/Intent;Landroidx/work/impl/background/systemalarm/d;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v5, "Handling constraints changed "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v0, v1, p2}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance p2, Landroidx/work/impl/background/systemalarm/b;

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->d:Lo2/a;

    .line 46
    .line 47
    invoke-direct {p2, v0, v1, p1, p3}, Landroidx/work/impl/background/systemalarm/b;-><init>(Landroid/content/Context;Lo2/a;ILandroidx/work/impl/background/systemalarm/d;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p3, Landroidx/work/impl/background/systemalarm/d;->e:Lp2/k0;

    .line 51
    .line 52
    iget-object p1, p1, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Lx2/t;->k()Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p3, Landroidx/work/impl/background/systemalarm/ConstraintProxy;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    move v1, v3

    .line 69
    move v4, v1

    .line 70
    move v5, v4

    .line 71
    move v6, v5

    .line 72
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Lx2/s;

    .line 83
    .line 84
    iget-object v7, v7, Lx2/s;->j:Lo2/c;

    .line 85
    .line 86
    iget-boolean v8, v7, Lo2/c;->d:Z

    .line 87
    .line 88
    or-int/2addr v1, v8

    .line 89
    iget-boolean v8, v7, Lo2/c;->b:Z

    .line 90
    .line 91
    or-int/2addr v4, v8

    .line 92
    iget-boolean v8, v7, Lo2/c;->e:Z

    .line 93
    .line 94
    or-int/2addr v5, v8

    .line 95
    iget v7, v7, Lo2/c;->a:I

    .line 96
    .line 97
    if-eq v7, v2, :cond_1

    .line 98
    .line 99
    move v7, v2

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    move v7, v3

    .line 102
    :goto_0
    or-int/2addr v6, v7

    .line 103
    if-eqz v1, :cond_0

    .line 104
    .line 105
    if-eqz v4, :cond_0

    .line 106
    .line 107
    if-eqz v5, :cond_0

    .line 108
    .line 109
    if-eqz v6, :cond_0

    .line 110
    .line 111
    :cond_2
    sget-object p3, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 112
    .line 113
    new-instance p3, Landroid/content/Intent;

    .line 114
    .line 115
    const-string v2, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 116
    .line 117
    invoke-direct {p3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Landroid/content/ComponentName;

    .line 121
    .line 122
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 123
    .line 124
    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    const-string v2, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 131
    .line 132
    invoke-virtual {p3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 137
    .line 138
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 143
    .line 144
    invoke-virtual {v1, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v2, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 149
    .line 150
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 154
    .line 155
    .line 156
    new-instance p3, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p2, Landroidx/work/impl/background/systemalarm/b;->b:Lo2/a;

    .line 166
    .line 167
    invoke-interface {v0}, Lo2/a;->a()J

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Lx2/s;

    .line 186
    .line 187
    invoke-virtual {v2}, Lx2/s;->a()J

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    cmp-long v3, v0, v3

    .line 192
    .line 193
    if-ltz v3, :cond_3

    .line 194
    .line 195
    invoke-virtual {v2}, Lx2/s;->b()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_4

    .line 200
    .line 201
    iget-object v3, p2, Landroidx/work/impl/background/systemalarm/b;->e:Lt2/e;

    .line 202
    .line 203
    invoke-virtual {v3, v2}, Lt2/e;->a(Lx2/s;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_3

    .line 208
    .line 209
    :cond_4
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result p3

    .line 221
    if-eqz p3, :cond_18

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    check-cast p3, Lx2/s;

    .line 228
    .line 229
    iget-object v0, p3, Lx2/s;->a:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v1, p2, Landroidx/work/impl/background/systemalarm/b;->a:Landroid/content/Context;

    .line 232
    .line 233
    invoke-static {p3}, Lb/a0;->s(Lx2/s;)Lx2/l;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    new-instance v2, Landroid/content/Intent;

    .line 238
    .line 239
    const-class v3, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 240
    .line 241
    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    const-string v1, "ACTION_DELAY_MET"

    .line 245
    .line 246
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 247
    .line 248
    .line 249
    invoke-static {v2, p3}, Landroidx/work/impl/background/systemalarm/a;->d(Landroid/content/Intent;Lx2/l;)V

    .line 250
    .line 251
    .line 252
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 253
    .line 254
    .line 255
    move-result-object p3

    .line 256
    sget-object v1, Landroidx/work/impl/background/systemalarm/b;->f:Ljava/lang/String;

    .line 257
    .line 258
    new-instance v3, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v4, "Creating a delay_met command for workSpec with id ("

    .line 264
    .line 265
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v0, ")"

    .line 272
    .line 273
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {p3, v1, v0}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    iget-object p3, p2, Landroidx/work/impl/background/systemalarm/b;->d:Landroidx/work/impl/background/systemalarm/d;

    .line 284
    .line 285
    iget-object p3, p3, Landroidx/work/impl/background/systemalarm/d;->b:La3/b;

    .line 286
    .line 287
    invoke-interface {p3}, La3/b;->b()La3/c$a;

    .line 288
    .line 289
    .line 290
    move-result-object p3

    .line 291
    new-instance v0, Landroidx/work/impl/background/systemalarm/d$b;

    .line 292
    .line 293
    iget-object v1, p2, Landroidx/work/impl/background/systemalarm/b;->d:Landroidx/work/impl/background/systemalarm/d;

    .line 294
    .line 295
    iget v3, p2, Landroidx/work/impl/background/systemalarm/b;->c:I

    .line 296
    .line 297
    invoke-direct {v0, v3, v2, v1}, Landroidx/work/impl/background/systemalarm/d$b;-><init>(ILandroid/content/Intent;Landroidx/work/impl/background/systemalarm/d;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p3, v0}, La3/c$a;->execute(Ljava/lang/Runnable;)V

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :cond_6
    const-string v1, "ACTION_RESCHEDULE"

    .line 305
    .line 306
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_7

    .line 311
    .line 312
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    sget-object v1, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 317
    .line 318
    new-instance v2, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string v3, "Handling reschedule "

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string p2, ", "

    .line 332
    .line 333
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-virtual {v0, v1, p1}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iget-object p1, p3, Landroidx/work/impl/background/systemalarm/d;->e:Lp2/k0;

    .line 347
    .line 348
    invoke-virtual {p1}, Lp2/k0;->h()V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_d

    .line 352
    .line 353
    :cond_7
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    const-string v4, "KEY_WORKSPEC_ID"

    .line 358
    .line 359
    filled-new-array {v4}, [Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    if-eqz v1, :cond_b

    .line 364
    .line 365
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-eqz v5, :cond_8

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_8
    move v5, v3

    .line 373
    :goto_3
    if-ge v5, v2, :cond_a

    .line 374
    .line 375
    aget-object v6, v4, v5

    .line 376
    .line 377
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    if-nez v6, :cond_9

    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_a
    move v1, v2

    .line 388
    goto :goto_5

    .line 389
    :cond_b
    :goto_4
    move v1, v3

    .line 390
    :goto_5
    if-nez v1, :cond_c

    .line 391
    .line 392
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    sget-object p2, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 397
    .line 398
    new-instance p3, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const-string v1, "Invalid request for "

    .line 404
    .line 405
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    const-string v0, " , requires "

    .line 412
    .line 413
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v0, "KEY_WORKSPEC_ID"

    .line 417
    .line 418
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v0, " ."

    .line 422
    .line 423
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p3

    .line 430
    invoke-virtual {p1, p2, p3}, Lo2/j;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    goto/16 :goto_d

    .line 434
    .line 435
    :cond_c
    const-string v1, "ACTION_SCHEDULE_WORK"

    .line 436
    .line 437
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-eqz v1, :cond_10

    .line 442
    .line 443
    invoke-static {p2}, Landroidx/work/impl/background/systemalarm/a;->c(Landroid/content/Intent;)Lx2/l;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sget-object v1, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 452
    .line 453
    new-instance v2, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    const-string v3, "Handling schedule work for "

    .line 459
    .line 460
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v0, v1, v2}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    iget-object v0, p3, Landroidx/work/impl/background/systemalarm/d;->e:Lp2/k0;

    .line 474
    .line 475
    iget-object v0, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 476
    .line 477
    invoke-virtual {v0}, Lp1/j;->c()V

    .line 478
    .line 479
    .line 480
    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    iget-object v3, p2, Lx2/l;->a:Ljava/lang/String;

    .line 485
    .line 486
    invoke-interface {v2, v3}, Lx2/t;->t(Ljava/lang/String;)Lx2/s;

    .line 487
    .line 488
    .line 489
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    const-string v3, "Skipping scheduling "

    .line 491
    .line 492
    if-nez v2, :cond_d

    .line 493
    .line 494
    :try_start_1
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    new-instance p3, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string p2, " because it\'s no longer in the DB"

    .line 510
    .line 511
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    :goto_6
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p2

    .line 518
    goto :goto_7

    .line 519
    :cond_d
    iget-object v4, v2, Lx2/s;->b:Lo2/o$b;

    .line 520
    .line 521
    invoke-virtual {v4}, Lo2/o$b;->f()Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-eqz v4, :cond_e

    .line 526
    .line 527
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    new-instance p3, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    const-string p2, "because it is finished."

    .line 543
    .line 544
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    goto :goto_6

    .line 548
    :goto_7
    invoke-virtual {p1, v1, p2}, Lo2/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_e
    invoke-virtual {v2}, Lx2/s;->a()J

    .line 553
    .line 554
    .line 555
    move-result-wide v3

    .line 556
    invoke-virtual {v2}, Lx2/s;->b()Z

    .line 557
    .line 558
    .line 559
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 560
    const-string v5, "at "

    .line 561
    .line 562
    if-nez v2, :cond_f

    .line 563
    .line 564
    :try_start_2
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    new-instance p3, Ljava/lang/StringBuilder;

    .line 569
    .line 570
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 571
    .line 572
    .line 573
    const-string v2, "Setting up Alarms for "

    .line 574
    .line 575
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {p3, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p3

    .line 591
    invoke-virtual {p1, v1, p3}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 595
    .line 596
    invoke-static {p1, v0, p2, v3, v4}, Lr2/a;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lx2/l;J)V

    .line 597
    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_f
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    new-instance v6, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 607
    .line 608
    .line 609
    const-string v7, "Opportunistically setting an alarm for "

    .line 610
    .line 611
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    invoke-virtual {v2, v1, v5}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 631
    .line 632
    invoke-static {v1, v0, p2, v3, v4}, Lr2/a;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lx2/l;J)V

    .line 633
    .line 634
    .line 635
    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 636
    .line 637
    new-instance v1, Landroid/content/Intent;

    .line 638
    .line 639
    const-class v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 640
    .line 641
    invoke-direct {v1, p2, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 642
    .line 643
    .line 644
    const-string p2, "ACTION_CONSTRAINTS_CHANGED"

    .line 645
    .line 646
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 647
    .line 648
    .line 649
    iget-object p2, p3, Landroidx/work/impl/background/systemalarm/d;->b:La3/b;

    .line 650
    .line 651
    invoke-interface {p2}, La3/b;->b()La3/c$a;

    .line 652
    .line 653
    .line 654
    move-result-object p2

    .line 655
    new-instance v2, Landroidx/work/impl/background/systemalarm/d$b;

    .line 656
    .line 657
    invoke-direct {v2, p1, v1, p3}, Landroidx/work/impl/background/systemalarm/d$b;-><init>(ILandroid/content/Intent;Landroidx/work/impl/background/systemalarm/d;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {p2, v2}, La3/c$a;->execute(Ljava/lang/Runnable;)V

    .line 661
    .line 662
    .line 663
    :goto_8
    invoke-virtual {v0}, Lp1/j;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 664
    .line 665
    .line 666
    :goto_9
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_d

    .line 670
    .line 671
    :catchall_0
    move-exception p1

    .line 672
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 673
    .line 674
    .line 675
    throw p1

    .line 676
    :cond_10
    const-string v1, "ACTION_DELAY_MET"

    .line 677
    .line 678
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    if-eqz v1, :cond_12

    .line 683
    .line 684
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->c:Ljava/lang/Object;

    .line 685
    .line 686
    monitor-enter v1

    .line 687
    :try_start_3
    invoke-static {p2}, Landroidx/work/impl/background/systemalarm/a;->c(Landroid/content/Intent;)Lx2/l;

    .line 688
    .line 689
    .line 690
    move-result-object p2

    .line 691
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    sget-object v2, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 696
    .line 697
    new-instance v3, Ljava/lang/StringBuilder;

    .line 698
    .line 699
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 700
    .line 701
    .line 702
    const-string v4, "Handing delay met for "

    .line 703
    .line 704
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    invoke-virtual {v0, v2, v3}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/a;->b:Ljava/util/HashMap;

    .line 718
    .line 719
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    if-nez v0, :cond_11

    .line 724
    .line 725
    new-instance v0, Landroidx/work/impl/background/systemalarm/c;

    .line 726
    .line 727
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 728
    .line 729
    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/a;->e:Ll/l;

    .line 730
    .line 731
    invoke-virtual {v3, p2}, Ll/l;->h(Lx2/l;)Lp2/x;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    invoke-direct {v0, v2, p1, p3, v3}, Landroidx/work/impl/background/systemalarm/c;-><init>(Landroid/content/Context;ILandroidx/work/impl/background/systemalarm/d;Lp2/x;)V

    .line 736
    .line 737
    .line 738
    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->b:Ljava/util/HashMap;

    .line 739
    .line 740
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0}, Landroidx/work/impl/background/systemalarm/c;->f()V

    .line 744
    .line 745
    .line 746
    goto :goto_a

    .line 747
    :cond_11
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    new-instance p3, Ljava/lang/StringBuilder;

    .line 752
    .line 753
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 754
    .line 755
    .line 756
    const-string v0, "WorkSpec "

    .line 757
    .line 758
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    const-string p2, " is is already being handled for ACTION_DELAY_MET"

    .line 765
    .line 766
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object p2

    .line 773
    invoke-virtual {p1, v2, p2}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    :goto_a
    monitor-exit v1

    .line 777
    goto/16 :goto_d

    .line 778
    .line 779
    :catchall_1
    move-exception p1

    .line 780
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 781
    throw p1

    .line 782
    :cond_12
    const-string v1, "ACTION_STOP_WORK"

    .line 783
    .line 784
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v1

    .line 788
    if-eqz v1, :cond_16

    .line 789
    .line 790
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 791
    .line 792
    .line 793
    move-result-object p1

    .line 794
    const-string p2, "KEY_WORKSPEC_ID"

    .line 795
    .line 796
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object p2

    .line 800
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 801
    .line 802
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    if-eqz v1, :cond_13

    .line 807
    .line 808
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    move-result p1

    .line 812
    new-instance v0, Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 815
    .line 816
    .line 817
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->e:Ll/l;

    .line 818
    .line 819
    new-instance v2, Lx2/l;

    .line 820
    .line 821
    invoke-direct {v2, p2, p1}, Lx2/l;-><init>(Ljava/lang/String;I)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, v2}, Ll/l;->f(Lx2/l;)Lp2/x;

    .line 825
    .line 826
    .line 827
    move-result-object p1

    .line 828
    if-eqz p1, :cond_14

    .line 829
    .line 830
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    goto :goto_b

    .line 834
    :cond_13
    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/a;->e:Ll/l;

    .line 835
    .line 836
    invoke-virtual {p1, p2}, Ll/l;->e(Ljava/lang/String;)Ljava/util/List;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    :cond_14
    :goto_b
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object p1

    .line 844
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_18

    .line 849
    .line 850
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    check-cast v0, Lp2/x;

    .line 855
    .line 856
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    sget-object v2, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 861
    .line 862
    new-instance v4, Ljava/lang/StringBuilder;

    .line 863
    .line 864
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 865
    .line 866
    .line 867
    const-string v5, "Handing stopWork work for "

    .line 868
    .line 869
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v1, v2, v4}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    iget-object v1, p3, Landroidx/work/impl/background/systemalarm/d;->s:Lp2/h0;

    .line 883
    .line 884
    invoke-interface {v1, v0}, Lp2/h0;->a(Lp2/x;)V

    .line 885
    .line 886
    .line 887
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/a;->a:Landroid/content/Context;

    .line 888
    .line 889
    iget-object v2, p3, Landroidx/work/impl/background/systemalarm/d;->e:Lp2/k0;

    .line 890
    .line 891
    iget-object v2, v2, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 892
    .line 893
    iget-object v4, v0, Lp2/x;->a:Lx2/l;

    .line 894
    .line 895
    sget-object v5, Lr2/a;->a:Ljava/lang/String;

    .line 896
    .line 897
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->r()Lx2/j;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    invoke-interface {v2, v4}, Lx2/j;->c(Lx2/l;)Lx2/i;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    if-eqz v5, :cond_15

    .line 906
    .line 907
    iget v5, v5, Lx2/i;->c:I

    .line 908
    .line 909
    invoke-static {v1, v4, v5}, Lr2/a;->a(Landroid/content/Context;Lx2/l;I)V

    .line 910
    .line 911
    .line 912
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    sget-object v5, Lr2/a;->a:Ljava/lang/String;

    .line 917
    .line 918
    new-instance v6, Ljava/lang/StringBuilder;

    .line 919
    .line 920
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 921
    .line 922
    .line 923
    const-string v7, "Removing SystemIdInfo for workSpecId ("

    .line 924
    .line 925
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    const-string v7, ")"

    .line 932
    .line 933
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v6

    .line 940
    invoke-virtual {v1, v5, v6}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    invoke-interface {v2, v4}, Lx2/j;->b(Lx2/l;)V

    .line 944
    .line 945
    .line 946
    :cond_15
    iget-object v0, v0, Lp2/x;->a:Lx2/l;

    .line 947
    .line 948
    invoke-virtual {p3, v0, v3}, Landroidx/work/impl/background/systemalarm/d;->a(Lx2/l;Z)V

    .line 949
    .line 950
    .line 951
    goto :goto_c

    .line 952
    :cond_16
    const-string p3, "ACTION_EXECUTION_COMPLETED"

    .line 953
    .line 954
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    move-result p3

    .line 958
    if-eqz p3, :cond_17

    .line 959
    .line 960
    invoke-static {p2}, Landroidx/work/impl/background/systemalarm/a;->c(Landroid/content/Intent;)Lx2/l;

    .line 961
    .line 962
    .line 963
    move-result-object p3

    .line 964
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    const-string v1, "KEY_NEEDS_RESCHEDULE"

    .line 969
    .line 970
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    sget-object v2, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 979
    .line 980
    new-instance v3, Ljava/lang/StringBuilder;

    .line 981
    .line 982
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 983
    .line 984
    .line 985
    const-string v4, "Handling onExecutionCompleted "

    .line 986
    .line 987
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    const-string p2, ", "

    .line 994
    .line 995
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object p1

    .line 1005
    invoke-virtual {v1, v2, p1}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {p0, p3, v0}, Landroidx/work/impl/background/systemalarm/a;->a(Lx2/l;Z)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_d

    .line 1012
    :cond_17
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 1013
    .line 1014
    .line 1015
    move-result-object p1

    .line 1016
    sget-object p3, Landroidx/work/impl/background/systemalarm/a;->f:Ljava/lang/String;

    .line 1017
    .line 1018
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    const-string v1, "Ignoring intent "

    .line 1024
    .line 1025
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object p2

    .line 1035
    invoke-virtual {p1, p3, p2}, Lo2/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_18
    :goto_d
    return-void
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
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
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
.end method

.class public final Lcom/google/firebase/sessions/SessionLifecycleService$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/sessions/SessionLifecycleService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:J

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Messenger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Messenger;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lea/e0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Firebase.app[SessionGenerator::class.java]"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, Lea/e0;

    .line 21
    .line 22
    iget-object v0, v0, Lea/e0;->e:Lea/x;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lea/x;->a:Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p1, "currentSession"

    .line 30
    .line 31
    invoke-static {p1}, Lec/i;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v1, Lea/v;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "Firebase.app[SessionDatastore::class.java]"

    .line 47
    .line 48
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Lea/v;

    .line 52
    .line 53
    invoke-interface {v0}, Lea/v;->a()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "SessionLifecycleService"

    .line 58
    .line 59
    const-string v2, "App has not yet foregrounded. Using previously stored session."

    .line 60
    .line 61
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b(Landroid/os/Messenger;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b(Landroid/os/Messenger;Ljava/lang/String;)V
    .locals 4

    const-string v0, "SessionLifecycleService"

    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "SessionUpdateExtra"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p2, v2, v3, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-virtual {p1, p2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to push new session to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Removing dead client from list: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b:J

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const-string v1, "SessionLifecycleService"

    .line 15
    .line 16
    const/16 v2, 0x2e

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    const-string v0, "Ignoring old message from "

    .line 21
    .line 22
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, " which is older than "

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v3, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b:J

    .line 39
    .line 40
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    if-eq v0, v3, :cond_3

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    if-eq v0, v2, :cond_2

    .line 61
    .line 62
    const/4 v2, 0x4

    .line 63
    if-eq v0, v2, :cond_1

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "Received unexpected event from the SessionLifecycleClient: "

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_b

    .line 89
    .line 90
    :cond_1
    iget-object v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->c:Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    iget-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 98
    .line 99
    const-string v2, "msg.replyTo"

    .line 100
    .line 101
    invoke-static {v0, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lcom/google/firebase/sessions/SessionLifecycleService$a;->a(Landroid/os/Messenger;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v2, "Client "

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-object v2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v2, " bound at "

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p1, ". Clients: "

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->c:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    goto/16 :goto_b

    .line 156
    .line 157
    :cond_2
    const-string v0, "Activity backgrounding at "

    .line 158
    .line 159
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 164
    .line 165
    .line 166
    move-result-wide v2

    .line 167
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 178
    .line 179
    .line 180
    move-result-wide v0

    .line 181
    iput-wide v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b:J

    .line 182
    .line 183
    goto/16 :goto_b

    .line 184
    .line 185
    :cond_3
    const-string v0, "Activity foregrounding at "

    .line 186
    .line 187
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 192
    .line 193
    .line 194
    move-result-wide v4

    .line 195
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    iget-boolean v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->a:Z

    .line 209
    .line 210
    if-nez v0, :cond_4

    .line 211
    .line 212
    const-string v0, "Cold start detected."

    .line 213
    .line 214
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    iput-boolean v3, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->a:Z

    .line 218
    .line 219
    goto/16 :goto_7

    .line 220
    .line 221
    :cond_4
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    iget-wide v6, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b:J

    .line 226
    .line 227
    sub-long/2addr v4, v6

    .line 228
    sget-object v0, Lga/h;->c:Lga/h$b;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-class v2, Lga/h;

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    const-string v2, "Firebase.app[SessionsSettings::class.java]"

    .line 244
    .line 245
    invoke-static {v0, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    check-cast v0, Lga/h;

    .line 249
    .line 250
    iget-object v2, v0, Lga/h;->a:Lga/j;

    .line 251
    .line 252
    invoke-interface {v2}, Lga/j;->b()Lmc/a;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const-wide/16 v6, 0x0

    .line 257
    .line 258
    const/4 v8, 0x0

    .line 259
    if-eqz v2, :cond_7

    .line 260
    .line 261
    iget-wide v9, v2, Lmc/a;->a:J

    .line 262
    .line 263
    sget v2, Lmc/a;->d:I

    .line 264
    .line 265
    cmp-long v2, v9, v6

    .line 266
    .line 267
    if-lez v2, :cond_5

    .line 268
    .line 269
    move v2, v3

    .line 270
    goto :goto_0

    .line 271
    :cond_5
    move v2, v8

    .line 272
    :goto_0
    if-eqz v2, :cond_6

    .line 273
    .line 274
    invoke-static {v9, v10}, Lmc/a;->f(J)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    xor-int/2addr v2, v3

    .line 279
    if-eqz v2, :cond_6

    .line 280
    .line 281
    move v2, v3

    .line 282
    goto :goto_1

    .line 283
    :cond_6
    move v2, v8

    .line 284
    :goto_1
    if-eqz v2, :cond_7

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_7
    iget-object v0, v0, Lga/h;->b:Lga/j;

    .line 288
    .line 289
    invoke-interface {v0}, Lga/j;->b()Lmc/a;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-eqz v0, :cond_a

    .line 294
    .line 295
    iget-wide v9, v0, Lmc/a;->a:J

    .line 296
    .line 297
    sget v0, Lmc/a;->d:I

    .line 298
    .line 299
    cmp-long v0, v9, v6

    .line 300
    .line 301
    if-lez v0, :cond_8

    .line 302
    .line 303
    move v0, v3

    .line 304
    goto :goto_2

    .line 305
    :cond_8
    move v0, v8

    .line 306
    :goto_2
    if-eqz v0, :cond_9

    .line 307
    .line 308
    invoke-static {v9, v10}, Lmc/a;->f(J)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    xor-int/2addr v0, v3

    .line 313
    if-eqz v0, :cond_9

    .line 314
    .line 315
    move v0, v3

    .line 316
    goto :goto_3

    .line 317
    :cond_9
    move v0, v8

    .line 318
    :goto_3
    if-eqz v0, :cond_a

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_a
    sget v0, Lmc/a;->d:I

    .line 322
    .line 323
    const/16 v0, 0x1e

    .line 324
    .line 325
    sget-object v2, Lmc/c;->e:Lmc/c;

    .line 326
    .line 327
    invoke-static {v0, v2}, Lp2/m0;->c0(ILmc/c;)J

    .line 328
    .line 329
    .line 330
    move-result-wide v9

    .line 331
    :goto_4
    long-to-int v0, v9

    .line 332
    and-int/2addr v0, v3

    .line 333
    if-ne v0, v3, :cond_b

    .line 334
    .line 335
    move v0, v3

    .line 336
    goto :goto_5

    .line 337
    :cond_b
    move v0, v8

    .line 338
    :goto_5
    if-eqz v0, :cond_c

    .line 339
    .line 340
    invoke-static {v9, v10}, Lmc/a;->f(J)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    xor-int/2addr v0, v3

    .line 345
    if-eqz v0, :cond_c

    .line 346
    .line 347
    shr-long v6, v9, v3

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_c
    sget-object v0, Lmc/c;->c:Lmc/c;

    .line 351
    .line 352
    invoke-static {v9, v10, v0}, Lmc/a;->g(JLmc/c;)J

    .line 353
    .line 354
    .line 355
    move-result-wide v6

    .line 356
    :goto_6
    cmp-long v0, v4, v6

    .line 357
    .line 358
    if-lez v0, :cond_d

    .line 359
    .line 360
    move v8, v3

    .line 361
    :cond_d
    if-eqz v8, :cond_12

    .line 362
    .line 363
    const-string v0, "Session too long in background. Creating new session."

    .line 364
    .line 365
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    :goto_7
    const-class v0, Lea/e0;

    .line 369
    .line 370
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v2, v0}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    const-string v4, "Firebase.app[SessionGenerator::class.java]"

    .line 379
    .line 380
    invoke-static {v2, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    check-cast v2, Lea/e0;

    .line 384
    .line 385
    iget v5, v2, Lea/e0;->d:I

    .line 386
    .line 387
    add-int/2addr v5, v3

    .line 388
    iput v5, v2, Lea/e0;->d:I

    .line 389
    .line 390
    new-instance v3, Lea/x;

    .line 391
    .line 392
    if-nez v5, :cond_e

    .line 393
    .line 394
    iget-object v5, v2, Lea/e0;->c:Ljava/lang/String;

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_e
    invoke-virtual {v2}, Lea/e0;->a()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    :goto_8
    move-object v7, v5

    .line 402
    iget-object v8, v2, Lea/e0;->c:Ljava/lang/String;

    .line 403
    .line 404
    iget v9, v2, Lea/e0;->d:I

    .line 405
    .line 406
    iget-object v5, v2, Lea/e0;->a:Lea/m0;

    .line 407
    .line 408
    invoke-interface {v5}, Lea/m0;->e()J

    .line 409
    .line 410
    .line 411
    move-result-wide v10

    .line 412
    move-object v6, v3

    .line 413
    invoke-direct/range {v6 .. v11}, Lea/x;-><init>(Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 414
    .line 415
    .line 416
    iput-object v3, v2, Lea/e0;->e:Lea/x;

    .line 417
    .line 418
    const-string v2, "Generated new session."

    .line 419
    .line 420
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    const-string v2, "Broadcasting new session"

    .line 424
    .line 425
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    const-class v2, Lea/a0;

    .line 433
    .line 434
    invoke-virtual {v1, v2}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    const-string v2, "Firebase.app[SessionFirelogPublisher::class.java]"

    .line 439
    .line 440
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    check-cast v1, Lea/a0;

    .line 444
    .line 445
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v2, v0}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v2, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    check-cast v2, Lea/e0;

    .line 457
    .line 458
    iget-object v2, v2, Lea/e0;->e:Lea/x;

    .line 459
    .line 460
    const-string v3, "currentSession"

    .line 461
    .line 462
    const/4 v5, 0x0

    .line 463
    if-eqz v2, :cond_11

    .line 464
    .line 465
    invoke-interface {v1, v2}, Lea/a0;->a(Lea/x;)V

    .line 466
    .line 467
    .line 468
    new-instance v1, Ljava/util/ArrayList;

    .line 469
    .line 470
    iget-object v2, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->c:Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-eqz v2, :cond_f

    .line 484
    .line 485
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    check-cast v2, Landroid/os/Messenger;

    .line 490
    .line 491
    const-string v6, "it"

    .line 492
    .line 493
    invoke-static {v2, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {p0, v2}, Lcom/google/firebase/sessions/SessionLifecycleService$a;->a(Landroid/os/Messenger;)V

    .line 497
    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_f
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    const-class v2, Lea/v;

    .line 505
    .line 506
    invoke-virtual {v1, v2}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    const-string v2, "Firebase.app[SessionDatastore::class.java]"

    .line 511
    .line 512
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    check-cast v1, Lea/v;

    .line 516
    .line 517
    invoke-static {}, Lu7/f;->e()Lu7/f;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v2, v0}, Lu7/f;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    check-cast v0, Lea/e0;

    .line 529
    .line 530
    iget-object v0, v0, Lea/e0;->e:Lea/x;

    .line 531
    .line 532
    if-eqz v0, :cond_10

    .line 533
    .line 534
    iget-object v0, v0, Lea/x;->a:Ljava/lang/String;

    .line 535
    .line 536
    invoke-interface {v1, v0}, Lea/v;->b(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    goto :goto_a

    .line 540
    :cond_10
    invoke-static {v3}, Lec/i;->i(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw v5

    .line 544
    :cond_11
    invoke-static {v3}, Lec/i;->i(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v5

    .line 548
    :cond_12
    :goto_a
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 549
    .line 550
    .line 551
    move-result-wide v0

    .line 552
    iput-wide v0, p0, Lcom/google/firebase/sessions/SessionLifecycleService$a;->b:J

    .line 553
    .line 554
    :goto_b
    return-void
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
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
.end method

.class public Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/firestore/streamhandler/OnTransactionResultListener;
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;
    }
.end annotation


# instance fields
.field private commands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;",
            ">;"
        }
    .end annotation
.end field

.field public final firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final mainLooper:Landroid/os/Handler;

.field public final maxAttempts:Ljava/lang/Long;

.field public final onTransactionStartedListener:Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;

.field private resultType:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;

.field public final semaphore:Ljava/util/concurrent/Semaphore;

.field public final timeout:Ljava/lang/Long;

.field public final transactionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->semaphore:Ljava/util/concurrent/Semaphore;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->mainLooper:Landroid/os/Handler;

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->onTransactionStartedListener:Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p3, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->transactionId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->timeout:Ljava/lang/Long;

    iput-object p5, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->maxAttempts:Ljava/lang/Long;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/l;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/l;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/HashMap;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/HashMap;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private static synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/l;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->onTransactionStartedListener:Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$OnTransactionStartedListener;->onStarted(Lcom/google/firebase/firestore/l;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Lu7/f;

    .line 14
    .line 15
    invoke-virtual {v1}, Lu7/f;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lu7/f;->b:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "appName"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->mainLooper:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v2, Lio/flutter/plugins/firebase/firestore/streamhandler/b;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v3, p1, v0}, Lio/flutter/plugins/firebase/firestore/streamhandler/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->semaphore:Ljava/util/concurrent/Semaphore;

    .line 37
    .line 38
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->timeout:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 53
    .line 54
    const-string p2, "timed out"

    .line 55
    .line 56
    sget-object v0, Lcom/google/firebase/firestore/f$a;->f:Lcom/google/firebase/firestore/f$a;

    .line 57
    .line 58
    invoke-direct {p1, p2, v0}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->failed(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 65
    return-object p1

    .line 66
    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->commands:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-static {}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->complete()Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->resultType:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;

    .line 80
    .line 81
    sget-object v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;->FAILURE:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;

    .line 82
    .line 83
    if-ne p1, v0, :cond_2

    .line 84
    .line 85
    invoke-static {}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->complete()Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_2
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->commands:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;

    .line 107
    .line 108
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 109
    .line 110
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lcom/google/firebase/firestore/c;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v2, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler$1;->$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType:[I

    .line 119
    .line 120
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;->getType()Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionType;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    aget v2, v2, v4

    .line 129
    .line 130
    const-string v4, "A transaction object cannot be used after its update callback has been invoked."

    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    if-eq v2, v5, :cond_8

    .line 134
    .line 135
    const/4 v6, 0x2

    .line 136
    if-eq v2, v6, :cond_7

    .line 137
    .line 138
    const/4 v4, 0x3

    .line 139
    if-eq v2, v4, :cond_3

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;->getOption()Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentOption;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-virtual {v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentOption;->getMerge()Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    if-eqz v5, :cond_4

    .line 155
    .line 156
    invoke-virtual {v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentOption;->getMerge()Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_4

    .line 165
    .line 166
    sget-object v4, Ld9/t0;->d:Ld9/t0;

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    invoke-virtual {v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentOption;->getMergeFields()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-eqz v5, :cond_5

    .line 174
    .line 175
    invoke-virtual {v2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentOption;->getMergeFields()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-static {v2}, Lio/flutter/plugins/firebase/firestore/utils/PigeonParser;->parseFieldPath(Ljava/util/List;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2}, Ld9/t0;->a(Ljava/util/List;)Ld9/t0;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;->getData()Ljava/util/Map;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    if-nez v4, :cond_6

    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    sget-object v2, Ld9/t0;->c:Ld9/t0;

    .line 203
    .line 204
    invoke-virtual {p2, v1, v0, v2}, Lcom/google/firebase/firestore/l;->c(Lcom/google/firebase/firestore/c;Ljava/util/Map;Ld9/t0;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_6
    invoke-virtual {p2, v1, v0, v4}, Lcom/google/firebase/firestore/l;->c(Lcom/google/firebase/firestore/c;Ljava/util/Map;Ld9/t0;)V

    .line 209
    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_7
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;->getData()Ljava/util/Map;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    iget-object v2, p2, Lcom/google/firebase/firestore/l;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 220
    .line 221
    iget-object v2, v2, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Ld9/y0;

    .line 222
    .line 223
    invoke-virtual {v2, v0}, Ld9/y0;->h(Ljava/util/Map;)Ll3/j;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-object v2, p2, Lcom/google/firebase/firestore/l;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 228
    .line 229
    invoke-virtual {v2, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->j(Lcom/google/firebase/firestore/c;)V

    .line 230
    .line 231
    .line 232
    iget-object v2, p2, Lcom/google/firebase/firestore/l;->a:Lg9/m0;

    .line 233
    .line 234
    iget-object v1, v1, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    :try_start_1
    invoke-virtual {v2, v1}, Lg9/m0;->b(Lj9/i;)Lk9/m;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-virtual {v0, v1, v6}, Ll3/j;->a(Lj9/i;Lk9/m;)Lk9/f;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-boolean v6, v2, Lg9/m0;->d:Z

    .line 252
    .line 253
    xor-int/2addr v5, v6

    .line 254
    new-array v6, v3, [Ljava/lang/Object;

    .line 255
    .line 256
    invoke-static {v4, v5, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object v4, v2, Lg9/m0;->c:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lcom/google/firebase/firestore/f; {:try_start_1 .. :try_end_1} :catch_0

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :catch_0
    move-exception v0

    .line 266
    iput-object v0, v2, Lg9/m0;->e:Lcom/google/firebase/firestore/f;

    .line 267
    .line 268
    :goto_2
    iget-object v0, v2, Lg9/m0;->f:Ljava/util/HashSet;

    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_8
    iget-object v0, p2, Lcom/google/firebase/firestore/l;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->j(Lcom/google/firebase/firestore/c;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p2, Lcom/google/firebase/firestore/l;->a:Lg9/m0;

    .line 281
    .line 282
    iget-object v1, v1, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    .line 283
    .line 284
    new-instance v2, Lk9/c;

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Lg9/m0;->a(Lj9/i;)Lk9/m;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-direct {v2, v1, v6}, Lk9/c;-><init>(Lj9/i;Lk9/m;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iget-boolean v6, v0, Lg9/m0;->d:Z

    .line 298
    .line 299
    xor-int/2addr v5, v6

    .line 300
    new-array v6, v3, [Ljava/lang/Object;

    .line 301
    .line 302
    invoke-static {v4, v5, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iget-object v4, v0, Lg9/m0;->c:Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 308
    .line 309
    .line 310
    iget-object v0, v0, Lg9/m0;->f:Ljava/util/HashSet;

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_9
    invoke-static {}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->complete()Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    return-object p1

    .line 322
    :catch_1
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 323
    .line 324
    sget-object p2, Lcom/google/firebase/firestore/f$a;->f:Lcom/google/firebase/firestore/f$a;

    .line 325
    .line 326
    const-string v0, "interrupted"

    .line 327
    .line 328
    invoke-direct {p1, v0, p2}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 329
    .line 330
    .line 331
    invoke-static {p1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->failed(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    return-object p1
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
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method private static synthetic lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/HashMap;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    invoke-interface {p0}, Lio/flutter/plugin/common/EventChannel$EventSink;->endOfStream()V

    return-void
.end method

.method private lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 17
    .line 18
    iget-object v1, v1, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->exception:Ljava/lang/Exception;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    const-string v1, "complete"

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    .line 50
    .line 51
    iget-object p2, p2, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;->exception:Ljava/lang/Exception;

    .line 52
    .line 53
    :goto_1
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 54
    .line 55
    iget-object v1, v1, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Lu7/f;

    .line 56
    .line 57
    invoke-virtual {v1}, Lu7/f;->a()V

    .line 58
    .line 59
    .line 60
    iget-object v1, v1, Lu7/f;->b:Ljava/lang/String;

    .line 61
    .line 62
    const-string v2, "appName"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {p2}, Lio/flutter/plugins/firebase/firestore/utils/ExceptionConverter;->createDetails(Ljava/lang/Exception;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-string v1, "error"

    .line 72
    .line 73
    :goto_2
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->mainLooper:Landroid/os/Handler;

    .line 77
    .line 78
    new-instance v1, Lg/q;

    .line 79
    .line 80
    const/16 v2, 0x1c

    .line 81
    .line 82
    invoke-direct {v1, v2, p1, v0}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    return-void
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
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->maxAttempts:Ljava/lang/Long;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v2, Ld9/x0;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ld9/x0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lq3/h;

    .line 18
    .line 19
    const/16 v3, 0xb

    .line 20
    .line 21
    invoke-direct {v0, v3, p0, p2}, Lq3/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v3, Lg9/m0;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 28
    .line 29
    iget-object v4, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 30
    .line 31
    invoke-virtual {v4}, Ld9/x;->b()V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ld9/t;

    .line 35
    .line 36
    invoke-direct {v4, p1, v3, v0}, Ld9/t;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/util/concurrent/ThreadPoolExecutor;Lq3/h;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_0
    invoke-virtual {p1}, Ld9/x;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, Ld9/x;->b:Lg9/u;

    .line 46
    .line 47
    invoke-virtual {v0}, Lg9/u;->d()V

    .line 48
    .line 49
    .line 50
    iget-object v3, v0, Lg9/u;->d:Ln9/a;

    .line 51
    .line 52
    iget-object v3, v3, Ln9/a;->a:Ln9/a$b;

    .line 53
    .line 54
    new-instance v5, Lg9/t;

    .line 55
    .line 56
    invoke-direct {v5, v2, v0, v4}, Lg9/t;-><init>(Ld9/x0;Lg9/u;Ln9/i;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 60
    .line 61
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lx0/g;

    .line 65
    .line 66
    const/16 v4, 0x9

    .line 67
    .line 68
    invoke-direct {v2, v5, v3, v0, v4}, Lx0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ln9/a$b;->execute(Ljava/lang/Runnable;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    monitor-exit p1

    .line 79
    new-instance p1, Lk1/a;

    .line 80
    .line 81
    invoke-direct {p1, v1, p0, p2}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception p2

    .line 89
    monitor-exit p1

    .line 90
    throw p2

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    const-string p2, "Max attempts must be at least 1"

    .line 94
    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
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

.method public receiveTransactionResponse(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->resultType:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonTransactionResult;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->commands:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

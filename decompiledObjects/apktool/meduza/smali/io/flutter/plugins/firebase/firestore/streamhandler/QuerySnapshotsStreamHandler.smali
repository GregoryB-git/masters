.class public Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public listenerRegistration:Ld9/b0;

.field public metadataChanges:Ld9/j0;

.field public query:Lcom/google/firebase/firestore/i;

.field public serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

.field public source:Ld9/a0;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/i;Ljava/lang/Boolean;Lcom/google/firebase/firestore/d$a;Ld9/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->query:Lcom/google/firebase/firestore/i;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ld9/j0;->b:Ld9/j0;

    goto :goto_0

    :cond_0
    sget-object p1, Ld9/j0;->a:Ld9/j0;

    :goto_0
    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->metadataChanges:Ld9/j0;

    iput-object p3, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

    iput-object p4, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->source:Ld9/a0;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/k;Lcom/google/firebase/firestore/f;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/k;Lcom/google/firebase/firestore/f;)V

    return-void
.end method

.method private lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/k;Lcom/google/firebase/firestore/f;)V
    .locals 5

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p3}, Lio/flutter/plugins/firebase/firestore/utils/ExceptionConverter;->createDetails(Ljava/lang/Exception;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    const-string v0, "firebase_firestore"

    .line 12
    .line 13
    invoke-interface {p1, v0, p3, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->endOfStream()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->onCancel(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->h()Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->a()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->h()Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lcom/google/firebase/firestore/d;

    .line 76
    .line 77
    iget-object v4, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

    .line 78
    .line 79
    invoke-static {v3, v4}, Lio/flutter/plugins/firebase/firestore/utils/PigeonParser;->toPigeonDocumentSnapshot(Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/d$a;)Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot;->toList()Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {p2}, Lcom/google/firebase/firestore/k;->a()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ld9/e;

    .line 110
    .line 111
    iget-object v4, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

    .line 112
    .line 113
    invoke-static {v3, v4}, Lio/flutter/plugins/firebase/firestore/utils/PigeonParser;->toPigeonDocumentChange(Ld9/e;Lcom/google/firebase/firestore/d$a;)Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentChange;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentChange;->toList()Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    iget-object p2, p2, Lcom/google/firebase/firestore/k;->f:Ld9/u0;

    .line 132
    .line 133
    invoke-static {p2}, Lio/flutter/plugins/firebase/firestore/utils/PigeonParser;->toPigeonSnapshotMetadata(Ld9/u0;)Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonSnapshotMetadata;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonSnapshotMetadata;->toList()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, p3}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    return-void
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
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ld9/b0;->remove()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 8

    .line 1
    sget-object p1, Ln9/f;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->metadataChanges:Ld9/j0;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->source:Ld9/a0;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->query:Lcom/google/firebase/firestore/i;

    .line 12
    .line 13
    new-instance v3, Ld9/o0;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v3, v4, p0, p2}, Ld9/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p2, Lg9/k$a;

    .line 23
    .line 24
    invoke-direct {p2}, Lg9/k$a;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v5, Ld9/j0;->b:Ld9/j0;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-ne v0, v5, :cond_0

    .line 31
    .line 32
    move v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v7, v6

    .line 35
    :goto_0
    iput-boolean v7, p2, Lg9/k$a;->a:Z

    .line 36
    .line 37
    if-ne v0, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v4, v6

    .line 41
    :goto_1
    iput-boolean v4, p2, Lg9/k$a;->b:Z

    .line 42
    .line 43
    iput-boolean v6, p2, Lg9/k$a;->c:Z

    .line 44
    .line 45
    iput-object v1, p2, Lg9/k$a;->d:Ld9/a0;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/google/firebase/firestore/i;->j()V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ld9/o0;

    .line 51
    .line 52
    invoke-direct {v0, v6, v2, v3}, Ld9/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lg9/d;

    .line 56
    .line 57
    invoke-direct {v1, p1, v0}, Lg9/d;-><init>(Ljava/util/concurrent/Executor;Ld9/l;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v2, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 61
    .line 62
    new-instance v0, Ld9/p0;

    .line 63
    .line 64
    invoke-direct {v0, v2, p2, v1}, Ld9/p0;-><init>(Lcom/google/firebase/firestore/i;Lg9/k$a;Lg9/d;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->a(Ln9/i;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ld9/b0;

    .line 72
    .line 73
    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 77
    .line 78
    const-string p2, "listen source must not be null."

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    const-string p2, "metadataChanges must not be null."

    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
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

.class public Lcom/ryanheise/audioservice/AudioService;
.super Lg1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/AudioService$c;,
        Lcom/ryanheise/audioservice/AudioService$b;
    }
.end annotation


# static fields
.field public static F:Lcom/ryanheise/audioservice/AudioService;

.field public static G:Landroid/app/PendingIntent;

.field public static H:Lcom/ryanheise/audioservice/AudioService$c;

.field public static I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Ljava/util/HashMap;


# instance fields
.field public A:Z

.field public B:I

.field public C:Z

.field public final D:Landroid/os/Handler;

.field public E:Lcom/ryanheise/audioservice/a;

.field public p:Lta/a;

.field public q:Landroid/os/PowerManager$WakeLock;

.field public r:Landroid/support/v4/media/session/MediaSessionCompat;

.field public s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lta/f;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljava/util/ArrayList;

.field public u:Ljava/util/ArrayList;

.field public v:[I

.field public w:Landroid/support/v4/media/MediaMetadataCompat;

.field public x:Landroid/graphics/Bitmap;

.field public y:Ljava/lang/String;

.field public z:Lcom/ryanheise/audioservice/AudioService$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lg1/c;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->s:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->t:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->u:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/ryanheise/audioservice/AudioService;->B:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->D:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)Lg1/c$b;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    move-object p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v1, "android.service.media.extra.RECENT"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    :cond_1
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 21
    .line 22
    iget-object v2, v1, Lta/a;->o:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 28
    .line 29
    iget-object v1, v1, Lta/a;->o:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 54
    .line 55
    :try_start_1
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_0
    :try_start_2
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_1
    :try_start_3
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-virtual {v1, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catch_2
    :try_start_4
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_3
    :try_start_5
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 88
    .line 89
    new-instance v6, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v7, "Unsupported extras value for key "

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-object v0, v1

    .line 111
    goto :goto_2

    .line 112
    :catch_4
    move-exception v1

    .line 113
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 114
    .line 115
    .line 116
    :goto_2
    new-instance v1, Lg1/c$b;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    const-string p1, "recent"

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    const-string p1, "root"

    .line 128
    .line 129
    :goto_3
    invoke-direct {v1, v0, p1}, Lg1/c$b;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v1
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

.method public final c(Landroid/os/Bundle;Lg1/c$i;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lg1/c$i;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v0, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "parentMediaId"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p3, "options"

    .line 33
    .line 34
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 38
    .line 39
    new-instance p3, Lcom/ryanheise/audioservice/c;

    .line 40
    .line 41
    invoke-direct {p3, p2}, Lcom/ryanheise/audioservice/c;-><init>(Lg1/c$i;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "getChildren"

    .line 45
    .line 46
    invoke-virtual {p1, v1, v0, p3}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p2}, Lg1/c$i;->a()V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method public final d(Ljava/lang/String;Lg1/c$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lg1/c$i<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2, p1}, Lcom/ryanheise/audioservice/AudioService;->c(Landroid/os/Bundle;Lg1/c$i;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Lg1/c$i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lg1/c$i<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p1}, Lg1/c$i;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v0, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "mediaId"

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 25
    .line 26
    new-instance v1, Lcom/ryanheise/audioservice/d;

    .line 27
    .line 28
    invoke-direct {v1, p2}, Lcom/ryanheise/audioservice/d;-><init>(Lg1/c$i;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "getMediaItem"

    .line 32
    .line 33
    invoke-virtual {p1, v2, v0, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p2}, Lg1/c$i;->a()V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public final f(Landroid/os/Bundle;Lg1/e;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lg1/c$i;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v0, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "query"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p3, "extras"

    .line 33
    .line 34
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 38
    .line 39
    new-instance p3, Lcom/ryanheise/audioservice/e;

    .line 40
    .line 41
    invoke-direct {p3, p2}, Lcom/ryanheise/audioservice/e;-><init>(Lg1/e;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "search"

    .line 45
    .line 46
    invoke-virtual {p1, v1, v0, p3}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p2}, Lg1/c$i;->a()V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method public final h(J)Landroid/app/PendingIntent;
    .locals 4

    const-wide/16 v0, 0x4

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/16 p1, 0x5b

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x2

    cmp-long v2, p1, v2

    if-nez v2, :cond_1

    const/16 p1, 0x82

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const/16 p1, 0x7e

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    const/16 p1, 0x7f

    goto :goto_0

    :cond_3
    const-wide/16 v2, 0x20

    cmp-long v0, p1, v2

    if-nez v0, :cond_4

    const/16 p1, 0x57

    goto :goto_0

    :cond_4
    const-wide/16 v2, 0x10

    cmp-long v0, p1, v2

    if-nez v0, :cond_5

    const/16 p1, 0x58

    goto :goto_0

    :cond_5
    const-wide/16 v2, 0x1

    cmp-long v0, p1, v2

    if-nez v0, :cond_6

    const/16 p1, 0x56

    goto :goto_0

    :cond_6
    const-wide/16 v2, 0x40

    cmp-long v0, p1, v2

    if-nez v0, :cond_7

    const/16 p1, 0x5a

    goto :goto_0

    :cond_7
    const-wide/16 v2, 0x8

    cmp-long v0, p1, v2

    if-nez v0, :cond_8

    const/16 p1, 0x59

    goto :goto_0

    :cond_8
    const-wide/16 v2, 0x200

    cmp-long p1, p1, v2

    if-nez p1, :cond_9

    const/16 p1, 0x55

    goto :goto_0

    :cond_9
    move p1, v1

    :goto_0
    if-nez p1, :cond_a

    const/4 p1, 0x0

    return-object p1

    :cond_a
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, Landroid/view/KeyEvent;

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    const-string v1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    invoke-static {p0, p1, p2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public final i()Landroid/app/Notification;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->v:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->t:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-array v2, v0, [I

    .line 18
    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-ge v3, v0, :cond_0

    .line 21
    .line 22
    aput v3, v2, v3

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x1a

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-lt v2, v3, :cond_3

    .line 34
    .line 35
    const-string v2, "notification"

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroid/app/NotificationManager;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    new-instance v3, Landroid/app/NotificationChannel;

    .line 52
    .line 53
    iget-object v5, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v6, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 56
    .line 57
    iget-object v6, v6, Lta/a;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v3, v5, v6, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 60
    .line 61
    .line 62
    iget-object v5, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 63
    .line 64
    iget-boolean v5, v5, Lta/a;->h:Z

    .line 65
    .line 66
    invoke-virtual {v3, v5}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 70
    .line 71
    iget-object v5, v5, Lta/a;->e:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v5}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v2, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    new-instance v2, Lu/q;

    .line 82
    .line 83
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v2, p0, v3}, Lu/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    iput v3, v2, Lu/q;->x:I

    .line 90
    .line 91
    iput-boolean v1, v2, Lu/q;->k:Z

    .line 92
    .line 93
    new-instance v5, Landroid/content/Intent;

    .line 94
    .line 95
    const-class v6, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    .line 96
    .line 97
    invoke-direct {v5, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    const-string v6, "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE"

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    const/high16 v6, 0x4000000

    .line 106
    .line 107
    invoke-static {p0, v1, v5, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v5, v2, Lu/q;->B:Landroid/app/Notification;

    .line 112
    .line 113
    iput-object v1, v5, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 114
    .line 115
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 116
    .line 117
    iget-object v1, v1, Lta/a;->g:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lcom/ryanheise/audioservice/AudioService;->k(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    iget-object v5, v2, Lu/q;->B:Landroid/app/Notification;

    .line 124
    .line 125
    iput v1, v5, Landroid/app/Notification;->icon:I

    .line 126
    .line 127
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->w:Landroid/support/v4/media/MediaMetadataCompat;

    .line 128
    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object v5, v1, Landroid/support/v4/media/MediaDescriptionCompat;->b:Ljava/lang/CharSequence;

    .line 136
    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    invoke-static {v5}, Lu/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    iput-object v5, v2, Lu/q;->e:Ljava/lang/CharSequence;

    .line 144
    .line 145
    :cond_4
    iget-object v5, v1, Landroid/support/v4/media/MediaDescriptionCompat;->c:Ljava/lang/CharSequence;

    .line 146
    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2, v5}, Lu/q;->c(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->d:Ljava/lang/CharSequence;

    .line 153
    .line 154
    if-eqz v1, :cond_6

    .line 155
    .line 156
    invoke-static {v1}, Lu/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iput-object v1, v2, Lu/q;->n:Ljava/lang/CharSequence;

    .line 161
    .line 162
    :cond_6
    monitor-enter p0

    .line 163
    :try_start_0
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    .line 164
    .line 165
    if-eqz v1, :cond_7

    .line 166
    .line 167
    invoke-virtual {v2, v1}, Lu/q;->e(Landroid/graphics/Bitmap;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    monitor-exit p0

    .line 171
    goto :goto_1

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    throw v0

    .line 175
    :cond_8
    :goto_1
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 176
    .line 177
    iget-boolean v1, v1, Lta/a;->i:Z

    .line 178
    .line 179
    if-eqz v1, :cond_9

    .line 180
    .line 181
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 182
    .line 183
    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat;->b:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 184
    .line 185
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat;->a:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    .line 186
    .line 187
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->a:Landroid/media/session/MediaController;

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getSessionActivity()Landroid/app/PendingIntent;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iput-object v1, v2, Lu/q;->g:Landroid/app/PendingIntent;

    .line 194
    .line 195
    :cond_9
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 196
    .line 197
    iget v1, v1, Lta/a;->f:I

    .line 198
    .line 199
    const/4 v5, -0x1

    .line 200
    if-eq v1, v5, :cond_a

    .line 201
    .line 202
    iput v1, v2, Lu/q;->w:I

    .line 203
    .line 204
    :cond_a
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->t:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    :cond_b
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_c

    .line 215
    .line 216
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    check-cast v5, Lu/n;

    .line 221
    .line 222
    if-eqz v5, :cond_b

    .line 223
    .line 224
    iget-object v6, v2, Lu/q;->b:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_c
    new-instance v1, Lh1/b;

    .line 231
    .line 232
    invoke-direct {v1}, Lh1/b;-><init>()V

    .line 233
    .line 234
    .line 235
    iget-object v5, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 236
    .line 237
    iget-object v5, v5, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 238
    .line 239
    iget-object v5, v5, Landroid/support/v4/media/session/MediaSessionCompat$c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 240
    .line 241
    iput-object v5, v1, Lh1/b;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 242
    .line 243
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 244
    .line 245
    const/16 v6, 0x21

    .line 246
    .line 247
    if-ge v5, v6, :cond_d

    .line 248
    .line 249
    iput-object v0, v1, Lh1/b;->b:[I

    .line 250
    .line 251
    :cond_d
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 252
    .line 253
    iget-boolean v0, v0, Lta/a;->j:Z

    .line 254
    .line 255
    if-eqz v0, :cond_e

    .line 256
    .line 257
    const-wide/16 v5, 0x1

    .line 258
    .line 259
    invoke-virtual {p0, v5, v6}, Lcom/ryanheise/audioservice/AudioService;->h(J)Landroid/app/PendingIntent;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v3}, Lu/q;->d(IZ)V

    .line 263
    .line 264
    .line 265
    :cond_e
    invoke-virtual {v2, v1}, Lu/q;->g(Lu/s;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lu/q;->a()Landroid/app/Notification;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    return-object v0
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

.method public final j(Lta/a;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 2
    .line 3
    iget-object v0, p1, Lta/a;->c:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ".channel"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p1, Lta/a;->n:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, Landroid/content/Intent;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/content/ComponentName;

    .line 50
    .line 51
    iget-object v4, p1, Lta/a;->n:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v3, v0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    const-string v3, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    const/high16 v3, 0xc000000

    .line 65
    .line 66
    const/16 v4, 0x3e8

    .line 67
    .line 68
    invoke-static {v0, v4, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/app/PendingIntent;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/app/PendingIntent;

    .line 76
    .line 77
    :goto_1
    iget-boolean p1, p1, Lta/a;->b:Z

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 82
    .line 83
    iget-object p1, p1, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 84
    .line 85
    iget-object p1, p1, Landroid/support/v4/media/session/MediaSessionCompat$c;->a:Landroid/media/session/MediaSession;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
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
.end method

.method public final k(Ljava/lang/String;)I
    .locals 3

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Lcom/ryanheise/audioservice/AudioService$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Bitmap;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "content"

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    const/4 v4, -0x1

    .line 28
    if-eqz v3, :cond_5

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    :try_start_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v5, 0x1d

    .line 35
    .line 36
    if-lt p2, v5, :cond_3

    .line 37
    .line 38
    new-instance p2, Landroid/util/Size;

    .line 39
    .line 40
    const/16 v0, 0xc0

    .line 41
    .line 42
    invoke-direct {p2, v0, v0}, Landroid/util/Size;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v5, Landroid/util/Size;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 52
    .line 53
    iget v6, v6, Lta/a;->l:I

    .line 54
    .line 55
    if-ne v6, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    :cond_1
    iget-object v7, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 62
    .line 63
    iget v7, v7, Lta/a;->m:I

    .line 64
    .line 65
    if-ne v7, v4, :cond_2

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    :cond_2
    invoke-direct {v5, v6, v7}, Landroid/util/Size;-><init>(II)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v2, v5}, Laa/w;->d(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/util/Size;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const-string v5, "r"

    .line 86
    .line 87
    invoke-virtual {p2, v2, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 94
    .line 95
    .line 96
    move-result-object p2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    goto :goto_0

    .line 98
    :catch_0
    :cond_4
    return-object v1

    .line 99
    :cond_5
    move-object p2, v1

    .line 100
    :goto_0
    if-eqz v3, :cond_6

    .line 101
    .line 102
    if-eqz p2, :cond_d

    .line 103
    .line 104
    :cond_6
    :try_start_2
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 105
    .line 106
    iget v0, v0, Lta/a;->l:I

    .line 107
    .line 108
    if-eq v0, v4, :cond_b

    .line 109
    .line 110
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 111
    .line 112
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 113
    .line 114
    .line 115
    const/4 v3, 0x1

    .line 116
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 117
    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v4, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 129
    .line 130
    .line 131
    :goto_1
    iget-object v4, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 132
    .line 133
    iget v5, v4, Lta/a;->l:I

    .line 134
    .line 135
    iget v4, v4, Lta/a;->m:I

    .line 136
    .line 137
    iget v6, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 138
    .line 139
    iget v7, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 140
    .line 141
    if-gt v6, v4, :cond_8

    .line 142
    .line 143
    if-le v7, v5, :cond_9

    .line 144
    .line 145
    :cond_8
    div-int/lit8 v6, v6, 0x2

    .line 146
    .line 147
    div-int/lit8 v7, v7, 0x2

    .line 148
    .line 149
    :goto_2
    div-int v8, v6, v3

    .line 150
    .line 151
    if-lt v8, v4, :cond_9

    .line 152
    .line 153
    div-int v8, v7, v3

    .line 154
    .line 155
    if-lt v8, v5, :cond_9

    .line 156
    .line 157
    mul-int/lit8 v3, v3, 0x2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 161
    .line 162
    const/4 v3, 0x0

    .line 163
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 164
    .line 165
    if-eqz p2, :cond_a

    .line 166
    .line 167
    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    :goto_3
    move-object v0, p2

    .line 172
    goto :goto_4

    .line 173
    :cond_a
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-static {p2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    goto :goto_3

    .line 182
    :cond_b
    if-eqz p2, :cond_c

    .line 183
    .line 184
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    goto :goto_4

    .line 189
    :cond_c
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :cond_d
    :goto_4
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->z:Lcom/ryanheise/audioservice/AudioService$a;

    .line 198
    .line 199
    invoke-virtual {p2, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 200
    .line 201
    .line 202
    return-object v0

    .line 203
    :catch_1
    move-exception p1

    .line 204
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 205
    .line 206
    .line 207
    return-object v1
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

.method public final m(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 2

    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$b;

    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    const-string v1, "android.media.metadata.ALBUM_ART"

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    const-string v1, "android.media.metadata.DISPLAY_ICON"

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    new-instance p1, Landroid/support/v4/media/MediaMetadataCompat;

    iget-object v0, v0, Landroid/support/v4/media/MediaMetadataCompat$b;->a:Landroid/os/Bundle;

    invoke-direct {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final declared-synchronized n(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "artCacheFile"

    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/ryanheise/audioservice/AudioService;->l(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    goto :goto_1

    :cond_0
    const-string v0, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "content:"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "loadThumbnailUri"

    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/ryanheise/audioservice/AudioService;->l(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->m(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    goto :goto_2

    :cond_1
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    :goto_2
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->w:Landroid/support/v4/media/MediaMetadataCompat;

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Landroid/support/v4/media/MediaMetadataCompat;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->D:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->D:Landroid/os/Handler;

    new-instance v0, Lb/m;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Lb/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final onCreate()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p0}, Lg1/c;->onCreate()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->F:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lcom/ryanheise/audioservice/AudioService;->C:Z

    .line 10
    .line 11
    iput-boolean v1, v0, Lcom/ryanheise/audioservice/AudioService;->A:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput v1, v0, Lcom/ryanheise/audioservice/AudioService;->B:I

    .line 15
    .line 16
    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat;

    .line 17
    .line 18
    const-string v3, "media-session"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v2, v0, v3, v4}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 25
    .line 26
    new-instance v2, Lta/a;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v3}, Lta/a;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lcom/ryanheise/audioservice/AudioService;->j(Lta/a;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 39
    .line 40
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 41
    .line 42
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$c;->a:Landroid/media/session/MediaSession;

    .line 43
    .line 44
    const/4 v3, 0x7

    .line 45
    invoke-virtual {v2, v3}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 46
    .line 47
    .line 48
    const/16 v21, 0x0

    .line 49
    .line 50
    const-wide/16 v16, 0x0

    .line 51
    .line 52
    const/4 v15, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const-wide/16 v9, 0x0

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    move-object/from16 v18, v2

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    const-wide/16 v19, -0x1

    .line 68
    .line 69
    const-wide/32 v12, 0x37fecf

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 73
    .line 74
    new-instance v3, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 75
    .line 76
    move-object v5, v3

    .line 77
    invoke-direct/range {v5 .. v21}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/support/v4/media/session/MediaSessionCompat;->h(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 84
    .line 85
    new-instance v3, Lcom/ryanheise/audioservice/AudioService$b;

    .line 86
    .line 87
    invoke-direct {v3, v0}, Lcom/ryanheise/audioservice/AudioService$b;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/media/session/MediaSessionCompat;->f(Landroid/support/v4/media/session/MediaSessionCompat$a;Landroid/os/Handler;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 94
    .line 95
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 96
    .line 97
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$c;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 98
    .line 99
    if-eqz v2, :cond_1

    .line 100
    .line 101
    iget-object v3, v0, Lg1/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 102
    .line 103
    if-nez v3, :cond_0

    .line 104
    .line 105
    iput-object v2, v0, Lg1/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 106
    .line 107
    iget-object v3, v0, Lg1/c;->a:Lg1/c$f;

    .line 108
    .line 109
    iget-object v4, v3, Lg1/c$e;->d:Lg1/c;

    .line 110
    .line 111
    iget-object v4, v4, Lg1/c;->e:Lg1/c$n;

    .line 112
    .line 113
    new-instance v5, Lg1/f;

    .line 114
    .line 115
    invoke-direct {v5, v3, v2}, Lg1/f;-><init>(Lg1/c$e;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v5}, Lg1/c$n;->a(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 122
    .line 123
    sget-object v3, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/util/List;

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Landroid/support/v4/media/session/MediaSessionCompat;->i(Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    const-string v2, "power"

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Landroid/os/PowerManager;

    .line 135
    .line 136
    const-class v3, Lcom/ryanheise/audioservice/AudioService;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v2, v1, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->q:Landroid/os/PowerManager$WakeLock;

    .line 147
    .line 148
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    const-wide/16 v3, 0x400

    .line 157
    .line 158
    div-long/2addr v1, v3

    .line 159
    long-to-int v1, v1

    .line 160
    div-int/lit8 v1, v1, 0x8

    .line 161
    .line 162
    new-instance v2, Lcom/ryanheise/audioservice/AudioService$a;

    .line 163
    .line 164
    invoke-direct {v2, v1}, Lcom/ryanheise/audioservice/AudioService$a;-><init>(I)V

    .line 165
    .line 166
    .line 167
    iput-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->z:Lcom/ryanheise/audioservice/AudioService$a;

    .line 168
    .line 169
    return-void

    .line 170
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    const-string v2, "The session token has already been set"

    .line 173
    .line 174
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v1

    .line 178
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 179
    .line 180
    const-string v2, "Session token may not be null"

    .line 181
    .line 182
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v1
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

.method public final onDestroy()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    sget-object v0, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    .line 10
    .line 11
    const-class v0, Lcom/ryanheise/audioservice/b;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    sget-object v2, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/ryanheise/audioservice/b$d;

    .line 31
    .line 32
    iget-object v3, v3, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {}, Lio/flutter/embedding/engine/FlutterEngineCache;->getInstance()Lio/flutter/embedding/engine/FlutterEngineCache;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "audio_service_engine"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lio/flutter/embedding/engine/FlutterEngineCache;->get(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngine;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Lio/flutter/embedding/engine/FlutterEngine;->destroy()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lio/flutter/embedding/engine/FlutterEngineCache;->getInstance()Lio/flutter/embedding/engine/FlutterEngineCache;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "audio_service_engine"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lio/flutter/embedding/engine/FlutterEngineCache;->remove(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    monitor-exit v0

    .line 62
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    monitor-exit v0

    .line 67
    throw v1

    .line 68
    :cond_3
    :goto_1
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->w:Landroid/support/v4/media/MediaMetadataCompat;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->x:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->s:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Lcom/ryanheise/audioservice/AudioService$a;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->v:[I

    .line 93
    .line 94
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 109
    .line 110
    .line 111
    :cond_5
    const-string v0, "notification"

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Landroid/app/NotificationManager;

    .line 118
    .line 119
    const/16 v3, 0x464

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->cancel(I)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->d()V

    .line 127
    .line 128
    .line 129
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 130
    .line 131
    :goto_2
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->p:Lta/a;

    .line 132
    .line 133
    iget-boolean v0, v0, Lta/a;->b:Z

    .line 134
    .line 135
    xor-int/lit8 v0, v0, 0x1

    .line 136
    .line 137
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 138
    .line 139
    const/16 v4, 0x18

    .line 140
    .line 141
    if-lt v3, v4, :cond_6

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 148
    .line 149
    .line 150
    :goto_3
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->q:Landroid/os/PowerManager$WakeLock;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->q:Landroid/os/PowerManager$WakeLock;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 161
    .line 162
    .line 163
    :cond_7
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->F:Lcom/ryanheise/audioservice/AudioService;

    .line 164
    .line 165
    iput-boolean v2, p0, Lcom/ryanheise/audioservice/AudioService;->C:Z

    .line 166
    .line 167
    return-void
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

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 2
    .line 3
    sget p3, Li1/a;->a:I

    .line 4
    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const-string v0, "android.intent.action.MEDIA_BUTTON"

    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    const-string p3, "android.intent.extra.KEY_EVENT"

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/view/KeyEvent;

    .line 35
    .line 36
    iget-object p2, p2, Landroid/support/v4/media/session/MediaSessionCompat;->b:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p2, p2, Landroid/support/v4/media/session/MediaControllerCompat;->a:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    .line 41
    .line 42
    iget-object p2, p2, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->a:Landroid/media/session/MediaController;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string p2, "KeyEvent may not be null"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    :goto_0
    const/4 p1, 0x2

    .line 60
    return p1
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
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, "onTaskRemoved"

    .line 16
    .line 17
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

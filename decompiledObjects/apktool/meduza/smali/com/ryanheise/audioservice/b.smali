.class public Lcom/ryanheise/audioservice/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/b$c;,
        Lcom/ryanheise/audioservice/b$d;,
        Lcom/ryanheise/audioservice/b$e;
    }
.end annotation


# static fields
.field public static final o:Ljava/util/HashSet;

.field public static p:Lcom/ryanheise/audioservice/b$d;

.field public static q:Lcom/ryanheise/audioservice/b$c;

.field public static final r:J

.field public static s:Lio/flutter/plugin/common/MethodChannel$Result;

.field public static t:Z

.field public static u:Landroid/support/v4/media/MediaBrowserCompat;

.field public static v:Landroid/support/v4/media/session/MediaControllerCompat;

.field public static final w:Lcom/ryanheise/audioservice/b$a;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field public c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field public d:Lta/b;

.field public e:Lcom/ryanheise/audioservice/b$d;

.field public final f:Lcom/ryanheise/audioservice/b$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sput-wide v0, Lcom/ryanheise/audioservice/b;->r:J

    new-instance v0, Lcom/ryanheise/audioservice/b$a;

    invoke-direct {v0}, Lcom/ryanheise/audioservice/b$a;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/b;->w:Lcom/ryanheise/audioservice/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ryanheise/audioservice/b$b;

    invoke-direct {v0, p0}, Lcom/ryanheise/audioservice/b$b;-><init>(Lcom/ryanheise/audioservice/b;)V

    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->f:Lcom/ryanheise/audioservice/b$b;

    return-void
.end method

.method public static a(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 2

    invoke-static {p0}, Lcom/ryanheise/audioservice/b;->g(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    const-string v1, "extras"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/b;->d(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    const-string v1, "playable"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    invoke-direct {v1, v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    return-object v1
.end method

.method public static b(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/HashMap;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "id"

    .line 18
    .line 19
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string v3, "android.media.metadata.TITLE"

    .line 23
    .line 24
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "title"

    .line 29
    .line 30
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v3, "android.media.metadata.ALBUM"

    .line 34
    .line 35
    invoke-static {p0, v3}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "album"

    .line 40
    .line 41
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->f:Landroid/net/Uri;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v3, "artUri"

    .line 53
    .line 54
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_1
    const-string v1, "android.media.metadata.ARTIST"

    .line 58
    .line 59
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v3, "artist"

    .line 64
    .line 65
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-string v1, "android.media.metadata.GENRE"

    .line 69
    .line 70
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v3, "genre"

    .line 75
    .line 76
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string v1, "android.media.metadata.DURATION"

    .line 80
    .line 81
    iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    const-wide/16 v4, 0x0

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 92
    .line 93
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v3, "duration"

    .line 102
    .line 103
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 107
    .line 108
    const-string v3, "playable_long"

    .line 109
    .line 110
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    cmp-long v1, v6, v4

    .line 115
    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    goto :goto_0

    .line 120
    :cond_3
    const/4 v1, 0x0

    .line 121
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v3, "playable"

    .line 126
    .line 127
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const-string v1, "android.media.metadata.DISPLAY_TITLE"

    .line 131
    .line 132
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v3, "displayTitle"

    .line 137
    .line 138
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const-string v1, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 142
    .line 143
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const-string v3, "displaySubtitle"

    .line 148
    .line 149
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    const-string v1, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 153
    .line 154
    invoke-static {p0, v1}, Lcom/ryanheise/audioservice/b;->m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const-string v3, "displayDescription"

    .line 159
    .line 160
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    const-string v1, "android.media.metadata.RATING"

    .line 164
    .line 165
    iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_4

    .line 172
    .line 173
    :try_start_0
    iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 174
    .line 175
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    goto :goto_1

    .line 184
    :catch_0
    move-exception v1

    .line 185
    const-string v3, "MediaMetadata"

    .line 186
    .line 187
    const-string v4, "Failed to retrieve a key as Rating."

    .line 188
    .line 189
    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    .line 191
    .line 192
    :goto_1
    invoke-static {v0}, Lcom/ryanheise/audioservice/b;->n(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, "rating"

    .line 197
    .line 198
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    .line 202
    .line 203
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 204
    .line 205
    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-lez v0, :cond_5

    .line 217
    .line 218
    const-string v0, "extras"

    .line 219
    .line 220
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    :cond_5
    move-object v0, v2

    .line 224
    :goto_2
    return-object v0
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

.method public static c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/ryanheise/audioservice/b;->g(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Landroid/support/v4/media/MediaMetadataCompat;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "extras"

    .line 32
    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {v3, v2}, Lcom/ryanheise/audioservice/b;->d(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 44
    .line 45
    int-to-long v4, v1

    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-direct {v3, v6, v2, v4, v5}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/media/session/MediaSession$QueueItem;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object v0
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

.method public static d(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaDescriptionCompat;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v8, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->o:Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v8, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->l(Ljava/util/Map;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v8, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->b:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iget-object v4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->c:Ljava/lang/CharSequence;

    .line 32
    .line 33
    iget-object v5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->d:Ljava/lang/CharSequence;

    .line 34
    .line 35
    iget-object v6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->e:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    iget-object v7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->f:Landroid/net/Uri;

    .line 38
    .line 39
    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v9, p0, Landroid/support/v4/media/MediaDescriptionCompat;->p:Landroid/net/Uri;

    .line 42
    .line 43
    new-instance p0, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 44
    .line 45
    move-object v1, p0

    .line 46
    invoke-direct/range {v1 .. v9}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-object p0
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

.method public static e(Landroid/os/Bundle;)Ljava/util/HashMap;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static g(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/support/v4/media/MediaMetadataCompat;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->F:Lcom/ryanheise/audioservice/AudioService;

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "title"

    .line 14
    .line 15
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "album"

    .line 22
    .line 23
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    const-string v5, "artist"

    .line 30
    .line 31
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    const-string v6, "genre"

    .line 38
    .line 39
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    const-string v7, "duration"

    .line 46
    .line 47
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v7}, Lcom/ryanheise/audioservice/b;->j(Ljava/lang/Object;)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-string v8, "artUri"

    .line 56
    .line 57
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Ljava/lang/String;

    .line 62
    .line 63
    const-string v9, "playable"

    .line 64
    .line 65
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Boolean;

    .line 70
    .line 71
    const-string v10, "displayTitle"

    .line 72
    .line 73
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    check-cast v10, Ljava/lang/String;

    .line 78
    .line 79
    const-string v11, "displaySubtitle"

    .line 80
    .line 81
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Ljava/lang/String;

    .line 86
    .line 87
    const-string v12, "displayDescription"

    .line 88
    .line 89
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    check-cast v12, Ljava/lang/String;

    .line 94
    .line 95
    const-string v13, "rating"

    .line 96
    .line 97
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    check-cast v13, Ljava/util/Map;

    .line 102
    .line 103
    if-nez v13, :cond_0

    .line 104
    .line 105
    :goto_0
    const/4 v14, 0x0

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_0
    const-string v15, "type"

    .line 109
    .line 110
    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    check-cast v15, Ljava/lang/Integer;

    .line 115
    .line 116
    const-string v14, "value"

    .line 117
    .line 118
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    if-eqz v13, :cond_5

    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    const/high16 v16, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    packed-switch v14, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :pswitch_0
    check-cast v13, Ljava/lang/Double;

    .line 137
    .line 138
    invoke-virtual {v13}, Ljava/lang/Double;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    cmpg-float v14, v13, v17

    .line 143
    .line 144
    if-ltz v14, :cond_2

    .line 145
    .line 146
    const/high16 v14, 0x42c80000    # 100.0f

    .line 147
    .line 148
    cmpl-float v14, v13, v14

    .line 149
    .line 150
    if-lez v14, :cond_1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    new-instance v14, Landroid/support/v4/media/RatingCompat;

    .line 154
    .line 155
    const/4 v15, 0x6

    .line 156
    invoke-direct {v14, v13, v15}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_2
    :goto_1
    const-string v13, "Rating"

    .line 161
    .line 162
    const-string v14, "Invalid percentage-based rating value"

    .line 163
    .line 164
    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :pswitch_1
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    check-cast v13, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    int-to-float v13, v13

    .line 179
    invoke-static {v13, v14}, Landroid/support/v4/media/RatingCompat;->b(FI)Landroid/support/v4/media/RatingCompat;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    goto :goto_5

    .line 184
    :pswitch_2
    check-cast v13, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    new-instance v14, Landroid/support/v4/media/RatingCompat;

    .line 191
    .line 192
    if-eqz v13, :cond_3

    .line 193
    .line 194
    move/from16 v13, v16

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_3
    move/from16 v13, v17

    .line 198
    .line 199
    :goto_2
    const/4 v15, 0x2

    .line 200
    invoke-direct {v14, v13, v15}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :pswitch_3
    check-cast v13, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    new-instance v14, Landroid/support/v4/media/RatingCompat;

    .line 211
    .line 212
    if-eqz v13, :cond_4

    .line 213
    .line 214
    move/from16 v13, v16

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_4
    move/from16 v13, v17

    .line 218
    .line 219
    :goto_3
    const/4 v15, 0x1

    .line 220
    invoke-direct {v14, v13, v15}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_5
    :goto_4
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    invoke-static {v13}, Landroid/support/v4/media/RatingCompat;->c(I)Landroid/support/v4/media/RatingCompat;

    .line 229
    .line 230
    .line 231
    move-result-object v14

    .line 232
    :goto_5
    const-string v13, "extras"

    .line 233
    .line 234
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Ljava/util/Map;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 244
    .line 245
    invoke-direct {v1}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>()V

    .line 246
    .line 247
    .line 248
    const-string v13, "android.media.metadata.MEDIA_ID"

    .line 249
    .line 250
    invoke-virtual {v1, v13, v2}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string v13, "android.media.metadata.TITLE"

    .line 254
    .line 255
    invoke-virtual {v1, v13, v3}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    if-eqz v4, :cond_6

    .line 259
    .line 260
    const-string v3, "android.media.metadata.ALBUM"

    .line 261
    .line 262
    invoke-virtual {v1, v3, v4}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_6
    if-eqz v5, :cond_7

    .line 266
    .line 267
    const-string v3, "android.media.metadata.ARTIST"

    .line 268
    .line 269
    invoke-virtual {v1, v3, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_7
    if-eqz v6, :cond_8

    .line 273
    .line 274
    const-string v3, "android.media.metadata.GENRE"

    .line 275
    .line 276
    invoke-virtual {v1, v3, v6}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_8
    if-eqz v7, :cond_9

    .line 280
    .line 281
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    const-string v5, "android.media.metadata.DURATION"

    .line 286
    .line 287
    invoke-virtual {v1, v5, v3, v4}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 288
    .line 289
    .line 290
    :cond_9
    if-eqz v8, :cond_a

    .line 291
    .line 292
    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    .line 293
    .line 294
    invoke-virtual {v1, v3, v8}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :cond_a
    const-wide/16 v3, 0x1

    .line 298
    .line 299
    const-wide/16 v5, 0x0

    .line 300
    .line 301
    if-eqz v9, :cond_c

    .line 302
    .line 303
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    if-eqz v7, :cond_b

    .line 308
    .line 309
    move-wide v7, v3

    .line 310
    goto :goto_6

    .line 311
    :cond_b
    move-wide v7, v5

    .line 312
    :goto_6
    const-string v9, "playable_long"

    .line 313
    .line 314
    invoke-virtual {v1, v9, v7, v8}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 315
    .line 316
    .line 317
    :cond_c
    if-eqz v10, :cond_d

    .line 318
    .line 319
    const-string v7, "android.media.metadata.DISPLAY_TITLE"

    .line 320
    .line 321
    invoke-virtual {v1, v7, v10}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_d
    if-eqz v11, :cond_e

    .line 325
    .line 326
    const-string v7, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 327
    .line 328
    invoke-virtual {v1, v7, v11}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :cond_e
    if-eqz v12, :cond_f

    .line 332
    .line 333
    const-string v7, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 334
    .line 335
    invoke-virtual {v1, v7, v12}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :cond_f
    if-eqz v14, :cond_10

    .line 339
    .line 340
    const-string v7, "android.media.metadata.RATING"

    .line 341
    .line 342
    invoke-virtual {v1, v7, v14}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)V

    .line 343
    .line 344
    .line 345
    :cond_10
    if-eqz v0, :cond_17

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    :cond_11
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    if-eqz v8, :cond_17

    .line 360
    .line 361
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    check-cast v8, Ljava/lang/String;

    .line 366
    .line 367
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    instance-of v10, v9, Ljava/lang/Long;

    .line 372
    .line 373
    if-eqz v10, :cond_12

    .line 374
    .line 375
    check-cast v9, Ljava/lang/Long;

    .line 376
    .line 377
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 378
    .line 379
    .line 380
    move-result-wide v9

    .line 381
    goto :goto_8

    .line 382
    :cond_12
    instance-of v10, v9, Ljava/lang/Integer;

    .line 383
    .line 384
    if-eqz v10, :cond_13

    .line 385
    .line 386
    check-cast v9, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    int-to-long v9, v9

    .line 393
    goto :goto_8

    .line 394
    :cond_13
    instance-of v10, v9, Ljava/lang/String;

    .line 395
    .line 396
    if-eqz v10, :cond_14

    .line 397
    .line 398
    check-cast v9, Ljava/lang/String;

    .line 399
    .line 400
    goto :goto_9

    .line 401
    :cond_14
    instance-of v10, v9, Ljava/lang/Boolean;

    .line 402
    .line 403
    if-eqz v10, :cond_16

    .line 404
    .line 405
    check-cast v9, Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    if-eqz v9, :cond_15

    .line 412
    .line 413
    move-wide v9, v3

    .line 414
    goto :goto_8

    .line 415
    :cond_15
    move-wide v9, v5

    .line 416
    :goto_8
    invoke-virtual {v1, v8, v9, v10}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 417
    .line 418
    .line 419
    goto :goto_7

    .line 420
    :cond_16
    instance-of v10, v9, Ljava/lang/Double;

    .line 421
    .line 422
    if-eqz v10, :cond_11

    .line 423
    .line 424
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    :goto_9
    invoke-virtual {v1, v8, v9}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_17
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 433
    .line 434
    iget-object v1, v1, Landroid/support/v4/media/MediaMetadataCompat$b;->a:Landroid/os/Bundle;

    .line 435
    .line 436
    invoke-direct {v0, v1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 437
    .line 438
    .line 439
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    .line 440
    .line 441
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
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

.method public static h()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v2, Landroid/content/Intent;

    .line 13
    .line 14
    const-string v3, "android.intent.action.MAIN"

    .line 15
    .line 16
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    sget-object v2, Lcom/ryanheise/audioservice/b;->w:Lcom/ryanheise/audioservice/b$a;

    .line 27
    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    iget-object v3, v0, Landroid/support/v4/media/session/MediaControllerCompat;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    const-string v0, "MediaControllerCompat"

    .line 39
    .line 40
    const-string v2, "the callback has never been registered"

    .line 41
    .line 42
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :try_start_0
    iget-object v0, v0, Landroid/support/v4/media/session/MediaControllerCompat;->a:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->b(Landroid/support/v4/media/session/MediaControllerCompat$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/MediaControllerCompat$a;->b(Landroid/os/Handler;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    sput-object v1, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/MediaControllerCompat$a;->b(Landroid/os/Handler;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v1, "callback must not be null"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_4
    :goto_2
    sget-object v0, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->a()V

    .line 75
    .line 76
    .line 77
    sput-object v1, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 78
    .line 79
    :cond_5
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static declared-synchronized i(Landroid/content/Context;)Lio/flutter/embedding/engine/FlutterEngine;
    .locals 4

    const-class v0, Lcom/ryanheise/audioservice/b;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lio/flutter/embedding/engine/FlutterEngineCache;->getInstance()Lio/flutter/embedding/engine/FlutterEngineCache;

    move-result-object v1

    const-string v2, "audio_service_engine"

    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/FlutterEngineCache;->get(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngine;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/flutter/embedding/engine/FlutterEngine;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    instance-of v3, p0, Lio/flutter/embedding/android/FlutterActivity;

    if-eqz v3, :cond_0

    check-cast p0, Lio/flutter/embedding/android/FlutterActivity;

    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterActivity;->getInitialRoute()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterActivity;->shouldHandleDeeplinking()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "?"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_1

    const-string v2, "/"

    :cond_1
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterEngine;->getNavigationChannel()Lio/flutter/embedding/engine/systemchannels/NavigationChannel;

    move-result-object p0

    invoke-virtual {p0, v2}, Lio/flutter/embedding/engine/systemchannels/NavigationChannel;->setInitialRoute(Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object p0

    invoke-static {}, Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;->createDefault()Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;

    move-result-object v2

    invoke-virtual {p0, v2}, Lio/flutter/embedding/engine/dart/DartExecutor;->executeDartEntrypoint(Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;)V

    invoke-static {}, Lio/flutter/embedding/engine/FlutterEngineCache;->getInstance()Lio/flutter/embedding/engine/FlutterEngineCache;

    move-result-object p0

    const-string v2, "audio_service_engine"

    invoke-virtual {p0, v2, v1}, Lio/flutter/embedding/engine/FlutterEngineCache;->put(Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngine;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static j(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    if-eqz p0, :cond_1

    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v0, p0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    :goto_1
    return-object p0
.end method

.method public static varargs k([Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static l(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_4
    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_5
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static m(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
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

.method public static n(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/media/RatingCompat;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Landroid/support/v4/media/RatingCompat;->a:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "type"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Landroid/support/v4/media/RatingCompat;->b:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v3, v1, v2

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    const/4 v5, 0x0

    .line 24
    if-ltz v3, :cond_0

    .line 25
    .line 26
    move v3, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v5

    .line 29
    :goto_0
    const/4 v6, 0x0

    .line 30
    const-string v7, "value"

    .line 31
    .line 32
    if-eqz v3, :cond_9

    .line 33
    .line 34
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->a:I

    .line 35
    .line 36
    const/high16 v3, -0x40800000    # -1.0f

    .line 37
    .line 38
    const/high16 v8, 0x3f800000    # 1.0f

    .line 39
    .line 40
    packed-switch p0, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto :goto_8

    .line 44
    :pswitch_0
    const/4 v6, 0x6

    .line 45
    if-ne p0, v6, :cond_2

    .line 46
    .line 47
    cmpl-float p0, v1, v2

    .line 48
    .line 49
    if-ltz p0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v4, v5

    .line 53
    :goto_1
    if-nez v4, :cond_5

    .line 54
    .line 55
    :cond_2
    :goto_2
    move v1, v3

    .line 56
    goto :goto_4

    .line 57
    :pswitch_1
    const/4 v6, 0x3

    .line 58
    if-eq p0, v6, :cond_3

    .line 59
    .line 60
    const/4 v6, 0x4

    .line 61
    if-eq p0, v6, :cond_3

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    if-eq p0, v6, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    cmpl-float p0, v1, v2

    .line 68
    .line 69
    if-ltz p0, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move v4, v5

    .line 73
    :goto_3
    if-eqz v4, :cond_2

    .line 74
    .line 75
    :cond_5
    :goto_4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    goto :goto_7

    .line 80
    :pswitch_2
    const/4 v2, 0x2

    .line 81
    if-eq p0, v2, :cond_6

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    cmpl-float p0, v1, v8

    .line 85
    .line 86
    if-nez p0, :cond_7

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_7
    move v4, v5

    .line 90
    :goto_5
    move v5, v4

    .line 91
    goto :goto_6

    .line 92
    :pswitch_3
    if-eq p0, v4, :cond_8

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_8
    cmpl-float p0, v1, v8

    .line 96
    .line 97
    if-nez p0, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :goto_6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :goto_7
    invoke-virtual {v0, v7, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_9
    :pswitch_4
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :goto_8
    return-object v0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final f()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 8
    .line 9
    new-instance v2, Landroid/content/ComponentName;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-class v4, Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lcom/ryanheise/audioservice/b;->f:Lcom/ryanheise/audioservice/b$b;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$c;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 24
    .line 25
    const-string v1, "MediaBrowserCompat"

    .line 26
    .line 27
    const-string v2, "Connecting to a MediaBrowserService."

    .line 28
    .line 29
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$e;

    .line 33
    .line 34
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$d;->b:Landroid/media/browse/MediaBrowser;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    .line 37
    .line 38
    .line 39
    :cond_0
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
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "clicked"

    .line 36
    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    aput-object v0, v2, v3

    .line 45
    .line 46
    invoke-static {v2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v2, 0x0

    .line 51
    const-string v3, "onNotificationClicked"

    .line 52
    .line 53
    invoke-virtual {v1, v3, v0, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
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
.end method

.method public final onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 4
    .line 5
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 12
    .line 13
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->i(Landroid/content/Context;)Lio/flutter/embedding/engine/FlutterEngine;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 30
    .line 31
    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v2, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eq v1, p1, :cond_0

    .line 42
    .line 43
    move p1, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move p1, v3

    .line 46
    :goto_0
    iput-boolean p1, v0, Lcom/ryanheise/audioservice/b$d;->d:Z

    .line 47
    .line 48
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 49
    .line 50
    sput-object p1, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 51
    .line 52
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 53
    .line 54
    new-instance v0, Lta/b;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lta/b;-><init>(Lcom/ryanheise/audioservice/b;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->d:Lta/b;

    .line 60
    .line 61
    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addOnNewIntentListener(Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lcom/ryanheise/audioservice/b;->v:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    sget-object v0, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 71
    .line 72
    invoke-static {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->b(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/b;->f()V

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p1, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 83
    .line 84
    iget-object p1, p1, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const/high16 v1, 0x100000

    .line 99
    .line 100
    and-int/2addr v0, v1

    .line 101
    if-ne v0, v1, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move v2, v3

    .line 105
    :goto_1
    if-eqz v2, :cond_4

    .line 106
    .line 107
    new-instance v0, Landroid/content/Intent;

    .line 108
    .line 109
    const-string v1, "android.intent.action.MAIN"

    .line 110
    .line 111
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/b;->o()V

    .line 118
    .line 119
    .line 120
    return-void
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

.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 2
    .line 3
    new-instance v0, Lcom/ryanheise/audioservice/b$d;

    .line 4
    .line 5
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, p1}, Lcom/ryanheise/audioservice/b$d;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, v0, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 21
    .line 22
    sget-object p1, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 34
    .line 35
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 40
    .line 41
    :cond_0
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    new-instance p1, Lcom/ryanheise/audioservice/b$c;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 48
    .line 49
    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/b$c;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 54
    .line 55
    .line 56
    sput-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 57
    .line 58
    sput-object p1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 59
    .line 60
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/b;->u:Landroid/support/v4/media/MediaBrowserCompat;

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/b;->f()V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
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

.method public final onDetachedFromActivity()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->d:Lta/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeOnNewIntentListener(Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->d:Lta/b;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 14
    .line 15
    iput-object v0, v1, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 18
    .line 19
    invoke-virtual {v2}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, v1, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 24
    .line 25
    sget-object v1, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    invoke-static {}, Lcom/ryanheise/audioservice/b;->h()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 38
    .line 39
    sget-object v2, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    sput-object v0, Lcom/ryanheise/audioservice/b;->p:Lcom/ryanheise/audioservice/b$d;

    .line 44
    .line 45
    :cond_1
    return-void
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
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->d:Lta/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeOnNewIntentListener(Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 12
    .line 13
    iput-object v0, v1, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, v1, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/ryanheise/audioservice/b;->o:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lcom/ryanheise/audioservice/b;->h()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p1, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->a:Landroid/content/Context;

    .line 26
    .line 27
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p1, Lcom/ryanheise/audioservice/b$c;->a:Lio/flutter/plugin/common/BinaryMessenger;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 34
    .line 35
    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-ne p1, v1, :cond_2

    .line 40
    .line 41
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 42
    .line 43
    const-string v1, "### destroying audio handler interface"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/ryanheise/audioservice/b$c;->c:Landroid/media/AudioTrack;

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V

    .line 55
    .line 56
    .line 57
    :cond_1
    sput-object v0, Lcom/ryanheise/audioservice/b;->q:Lcom/ryanheise/audioservice/b$c;

    .line 58
    .line 59
    :cond_2
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->b:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 60
    .line 61
    return-void
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

.method public final onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 4
    .line 5
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, v0, Lcom/ryanheise/audioservice/b$d;->b:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ryanheise/audioservice/b;->e:Lcom/ryanheise/audioservice/b$d;

    .line 12
    .line 13
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, v0, Lcom/ryanheise/audioservice/b$d;->a:Landroid/content/Context;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/ryanheise/audioservice/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 20
    .line 21
    new-instance v0, Lta/b;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lta/b;-><init>(Lcom/ryanheise/audioservice/b;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/ryanheise/audioservice/b;->d:Lta/b;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addOnNewIntentListener(Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;)V

    .line 29
    .line 30
    .line 31
    return-void
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

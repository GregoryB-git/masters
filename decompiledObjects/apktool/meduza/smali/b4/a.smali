.class public final Lb4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/a$b;,
        Lb4/a$d;,
        Lb4/a$c;,
        Lb4/a$a;
    }
.end annotation


# static fields
.field public static final l:Landroid/support/v4/media/MediaMetadataCompat;


# instance fields
.field public final a:Landroid/support/v4/media/session/MediaSessionCompat;

.field public final b:Landroid/os/Looper;

.field public final c:Lb4/a$b;

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb4/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb4/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:[Lb4/a$c;

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb4/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lb4/a$d;

.field public i:Lv3/f1;

.field public j:J

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "goog.exo.mediasession"

    .line 2
    .line 3
    invoke-static {v0}, Lv3/h0;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lb4/a;->l:Landroid/support/v4/media/MediaMetadataCompat;

    .line 17
    .line 18
    return-void
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
.end method

.method public constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 5
    .line 6
    sget v0, Lv5/e0;->a:I

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    iput-object v0, p0, Lb4/a;->b:Landroid/os/Looper;

    .line 20
    .line 21
    new-instance v1, Lb4/a$b;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lb4/a$b;-><init>(Lb4/a;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lb4/a;->c:Lb4/a$b;

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lb4/a;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lb4/a;->e:Ljava/util/ArrayList;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    new-array v2, v2, [Lb4/a$c;

    .line 44
    .line 45
    iput-object v2, p0, Lb4/a;->f:[Lb4/a$c;

    .line 46
    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lb4/a;->g:Ljava/util/Map;

    .line 52
    .line 53
    new-instance v2, Lb4/a$d;

    .line 54
    .line 55
    iget-object v3, p1, Landroid/support/v4/media/session/MediaSessionCompat;->b:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 56
    .line 57
    invoke-direct {v2, v3}, Lb4/a$d;-><init>(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 58
    .line 59
    .line 60
    iput-object v2, p0, Lb4/a;->h:Lb4/a$d;

    .line 61
    .line 62
    const-wide/32 v2, 0x24034f

    .line 63
    .line 64
    .line 65
    iput-wide v2, p0, Lb4/a;->j:J

    .line 66
    .line 67
    iget-object v2, p1, Landroid/support/v4/media/session/MediaSessionCompat;->a:Landroid/support/v4/media/session/MediaSessionCompat$d;

    .line 68
    .line 69
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$c;->a:Landroid/media/session/MediaSession;

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    invoke-virtual {v2, v3}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Landroid/os/Handler;

    .line 76
    .line 77
    invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->f(Landroid/support/v4/media/session/MediaSessionCompat$a;Landroid/os/Handler;)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    iput-boolean p1, p0, Lb4/a;->k:Z

    .line 85
    .line 86
    return-void
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
.end method

.method public static a(Lb4/a;J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb4/a;->i:Lv3/f1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lb4/a;->j:J

    .line 6
    .line 7
    and-long p0, p1, v0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long p0, p0, v0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 19
    :goto_1
    return p0
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
.method public final b()V
    .locals 11

    .line 1
    iget-object v0, p0, Lb4/a;->h:Lb4/a$d;

    .line 2
    .line 3
    if-eqz v0, :cond_1e

    .line 4
    .line 5
    iget-object v1, p0, Lb4/a;->i:Lv3/f1;

    .line 6
    .line 7
    if-eqz v1, :cond_1e

    .line 8
    .line 9
    invoke-interface {v1}, Lv3/f1;->J()Lv3/r1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lv3/r1;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    sget-object v0, Lb4/a;->l:Landroid/support/v4/media/MediaMetadataCompat;

    .line 20
    .line 21
    goto/16 :goto_f

    .line 22
    .line 23
    :cond_0
    new-instance v2, Landroid/support/v4/media/MediaMetadataCompat$b;

    .line 24
    .line 25
    invoke-direct {v2}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lv3/f1;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const-wide/16 v3, 0x1

    .line 35
    .line 36
    const-string v5, "android.media.metadata.ADVERTISEMENT"

    .line 37
    .line 38
    invoke-virtual {v2, v5, v3, v4}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {v1}, Lv3/f1;->H()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-wide/16 v4, -0x1

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    invoke-interface {v1}, Lv3/f1;->getDuration()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmp-long v3, v6, v8

    .line 59
    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-interface {v1}, Lv3/f1;->getDuration()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    move-wide v6, v4

    .line 69
    :goto_1
    const-string v1, "android.media.metadata.DURATION"

    .line 70
    .line 71
    invoke-virtual {v2, v1, v6, v7}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lb4/a$d;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 75
    .line 76
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat;->a:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    .line 77
    .line 78
    iget-object v3, v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/IMediaSession;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const/4 v6, 0x0

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    :try_start_0
    iget-object v3, v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a()Landroid/support/v4/media/session/IMediaSession;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-interface {v3}, Landroid/support/v4/media/session/IMediaSession;->d()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 94
    .line 95
    .line 96
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_2

    .line 98
    :catch_0
    move-exception v3

    .line 99
    const-string v7, "MediaControllerCompat"

    .line 100
    .line 101
    const-string v8, "Dead object in getPlaybackState."

    .line 102
    .line 103
    invoke-static {v7, v8, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 104
    .line 105
    .line 106
    :cond_4
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->a:Landroid/media/session/MediaController;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    move-object v1, v6

    .line 120
    :goto_2
    iget-wide v7, v1, Landroid/support/v4/media/session/PlaybackStateCompat;->r:J

    .line 121
    .line 122
    cmp-long v1, v7, v4

    .line 123
    .line 124
    if-eqz v1, :cond_1d

    .line 125
    .line 126
    iget-object v1, v0, Lb4/a$d;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 127
    .line 128
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat;->a:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    .line 129
    .line 130
    iget-object v1, v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->a:Landroid/media/session/MediaController;

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getQueue()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    invoke-static {v1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move-object v1, v6

    .line 144
    :goto_3
    const/4 v3, 0x0

    .line 145
    :goto_4
    if-eqz v1, :cond_1d

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-ge v3, v4, :cond_1d

    .line 152
    .line 153
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 158
    .line 159
    iget-wide v9, v4, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->b:J

    .line 160
    .line 161
    cmp-long v5, v9, v7

    .line 162
    .line 163
    if-nez v5, :cond_1c

    .line 164
    .line 165
    iget-object v1, v4, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->a:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 166
    .line 167
    iget-object v3, v1, Landroid/support/v4/media/MediaDescriptionCompat;->o:Landroid/os/Bundle;

    .line 168
    .line 169
    if-eqz v3, :cond_15

    .line 170
    .line 171
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_7
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_15

    .line 184
    .line 185
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    instance-of v8, v7, Ljava/lang/String;

    .line 196
    .line 197
    if-eqz v8, :cond_9

    .line 198
    .line 199
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_8

    .line 214
    .line 215
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    goto :goto_6

    .line 220
    :cond_8
    new-instance v5, Ljava/lang/String;

    .line 221
    .line 222
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :goto_6
    check-cast v7, Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v2, v5, v7}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_9
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 232
    .line 233
    if-eqz v8, :cond_d

    .line 234
    .line 235
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_a

    .line 250
    .line 251
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    goto :goto_7

    .line 256
    :cond_a
    new-instance v5, Ljava/lang/String;

    .line 257
    .line 258
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :goto_7
    check-cast v7, Ljava/lang/CharSequence;

    .line 262
    .line 263
    sget-object v8, Landroid/support/v4/media/MediaMetadataCompat;->d:Lr/b;

    .line 264
    .line 265
    invoke-virtual {v8, v5}, Lr/h;->containsKey(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-eqz v9, :cond_c

    .line 270
    .line 271
    invoke-virtual {v8, v5, v6}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    check-cast v8, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    const/4 v9, 0x1

    .line 282
    if-ne v8, v9, :cond_b

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    const-string v1, "The "

    .line 288
    .line 289
    const-string v2, " key cannot be used to put a CharSequence"

    .line 290
    .line 291
    invoke-static {v1, v5, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_c
    :goto_8
    iget-object v8, v2, Landroid/support/v4/media/MediaMetadataCompat$b;->a:Landroid/os/Bundle;

    .line 300
    .line 301
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_d
    instance-of v8, v7, Ljava/lang/Long;

    .line 306
    .line 307
    if-eqz v8, :cond_f

    .line 308
    .line 309
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eqz v9, :cond_e

    .line 324
    .line 325
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    goto :goto_9

    .line 330
    :cond_e
    new-instance v5, Ljava/lang/String;

    .line 331
    .line 332
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :goto_9
    check-cast v7, Ljava/lang/Long;

    .line 336
    .line 337
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 338
    .line 339
    .line 340
    move-result-wide v7

    .line 341
    goto :goto_b

    .line 342
    :cond_f
    instance-of v8, v7, Ljava/lang/Integer;

    .line 343
    .line 344
    if-eqz v8, :cond_11

    .line 345
    .line 346
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-eqz v9, :cond_10

    .line 361
    .line 362
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    goto :goto_a

    .line 367
    :cond_10
    new-instance v5, Ljava/lang/String;

    .line 368
    .line 369
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_a
    check-cast v7, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    int-to-long v7, v7

    .line 379
    :goto_b
    invoke-virtual {v2, v5, v7, v8}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_5

    .line 383
    .line 384
    :cond_11
    instance-of v8, v7, Landroid/graphics/Bitmap;

    .line 385
    .line 386
    if-eqz v8, :cond_13

    .line 387
    .line 388
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 389
    .line 390
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    if-eqz v9, :cond_12

    .line 403
    .line 404
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    goto :goto_c

    .line 409
    :cond_12
    new-instance v5, Ljava/lang/String;

    .line 410
    .line 411
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :goto_c
    check-cast v7, Landroid/graphics/Bitmap;

    .line 415
    .line 416
    invoke-virtual {v2, v7, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_5

    .line 420
    .line 421
    :cond_13
    instance-of v8, v7, Landroid/support/v4/media/RatingCompat;

    .line 422
    .line 423
    if-eqz v8, :cond_7

    .line 424
    .line 425
    iget-object v8, v0, Lb4/a$d;->b:Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v9

    .line 439
    if-eqz v9, :cond_14

    .line 440
    .line 441
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    goto :goto_d

    .line 446
    :cond_14
    new-instance v5, Ljava/lang/String;

    .line 447
    .line 448
    invoke-direct {v5, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    :goto_d
    check-cast v7, Landroid/support/v4/media/RatingCompat;

    .line 452
    .line 453
    invoke-virtual {v2, v5, v7}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_5

    .line 457
    .line 458
    :cond_15
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->b:Ljava/lang/CharSequence;

    .line 459
    .line 460
    if-eqz v0, :cond_16

    .line 461
    .line 462
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    const-string v3, "android.media.metadata.TITLE"

    .line 467
    .line 468
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    const-string v3, "android.media.metadata.DISPLAY_TITLE"

    .line 472
    .line 473
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    :cond_16
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->c:Ljava/lang/CharSequence;

    .line 477
    .line 478
    if-eqz v0, :cond_17

    .line 479
    .line 480
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const-string v3, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 485
    .line 486
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :cond_17
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->d:Ljava/lang/CharSequence;

    .line 490
    .line 491
    if-eqz v0, :cond_18

    .line 492
    .line 493
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    const-string v3, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 498
    .line 499
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :cond_18
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->e:Landroid/graphics/Bitmap;

    .line 503
    .line 504
    if-eqz v0, :cond_19

    .line 505
    .line 506
    const-string v3, "android.media.metadata.DISPLAY_ICON"

    .line 507
    .line 508
    invoke-virtual {v2, v0, v3}, Landroid/support/v4/media/MediaMetadataCompat$b;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_19
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->f:Landroid/net/Uri;

    .line 512
    .line 513
    if-eqz v0, :cond_1a

    .line 514
    .line 515
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    .line 520
    .line 521
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    :cond_1a
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 525
    .line 526
    if-eqz v0, :cond_1b

    .line 527
    .line 528
    const-string v3, "android.media.metadata.MEDIA_ID"

    .line 529
    .line 530
    invoke-virtual {v2, v3, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    :cond_1b
    iget-object v0, v1, Landroid/support/v4/media/MediaDescriptionCompat;->p:Landroid/net/Uri;

    .line 534
    .line 535
    if-eqz v0, :cond_1d

    .line 536
    .line 537
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    const-string v1, "android.media.metadata.MEDIA_URI"

    .line 542
    .line 543
    invoke-virtual {v2, v1, v0}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    goto :goto_e

    .line 547
    :cond_1c
    add-int/lit8 v3, v3, 0x1

    .line 548
    .line 549
    goto/16 :goto_4

    .line 550
    .line 551
    :cond_1d
    :goto_e
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 552
    .line 553
    iget-object v1, v2, Landroid/support/v4/media/MediaMetadataCompat$b;->a:Landroid/os/Bundle;

    .line 554
    .line 555
    invoke-direct {v0, v1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 556
    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_1e
    sget-object v0, Lb4/a;->l:Landroid/support/v4/media/MediaMetadataCompat;

    .line 560
    .line 561
    :goto_f
    iget-object v1, p0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 562
    .line 563
    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 564
    .line 565
    .line 566
    return-void
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final c()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v14, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lb4/a;->i:Lv3/f1;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-wide/16 v8, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v12

    .line 23
    iget-object v1, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 24
    .line 25
    invoke-virtual {v1, v5}, Landroid/support/v4/media/session/MediaSessionCompat;->j(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 29
    .line 30
    invoke-virtual {v1, v5}, Landroid/support/v4/media/session/MediaSessionCompat;->k(I)V

    .line 31
    .line 32
    .line 33
    iget-object v15, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 34
    .line 35
    new-instance v11, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 36
    .line 37
    move-object v1, v11

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    const/16 v17, 0x0

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    move-object/from16 v18, v11

    .line 46
    .line 47
    move-object/from16 v11, v16

    .line 48
    .line 49
    const-wide/16 v19, -0x1

    .line 50
    .line 51
    move-object/from16 v21, v15

    .line 52
    .line 53
    move-wide/from16 v15, v19

    .line 54
    .line 55
    invoke-direct/range {v1 .. v17}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v2, v18

    .line 59
    .line 60
    move-object/from16 v1, v21

    .line 61
    .line 62
    :goto_0
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->h(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v3, v0, Lb4/a;->f:[Lb4/a$c;

    .line 72
    .line 73
    array-length v4, v3

    .line 74
    move v6, v5

    .line 75
    :goto_1
    if-ge v6, v4, :cond_2

    .line 76
    .line 77
    aget-object v7, v3, v6

    .line 78
    .line 79
    invoke-interface {v7}, Lb4/a$c;->b()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    if-eqz v8, :cond_1

    .line 84
    .line 85
    iget-object v9, v8, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v0, Lb4/a;->g:Ljava/util/Map;

    .line 101
    .line 102
    new-instance v15, Landroid/os/Bundle;

    .line 103
    .line 104
    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1}, Lv3/f1;->v()Lv3/c1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/4 v3, 0x1

    .line 112
    if-nez v2, :cond_3

    .line 113
    .line 114
    move v2, v5

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move v2, v3

    .line 117
    :goto_2
    const/4 v4, 0x2

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    const/4 v2, 0x7

    .line 121
    goto :goto_4

    .line 122
    :cond_4
    invoke-interface {v1}, Lv3/f1;->d()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-interface {v1}, Lv3/f1;->k()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eq v2, v4, :cond_7

    .line 131
    .line 132
    const/4 v7, 0x3

    .line 133
    if-eq v2, v7, :cond_6

    .line 134
    .line 135
    const/4 v6, 0x4

    .line 136
    if-eq v2, v6, :cond_5

    .line 137
    .line 138
    move v7, v5

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    move v7, v3

    .line 141
    goto :goto_3

    .line 142
    :cond_6
    if-eqz v6, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_7
    if-eqz v6, :cond_8

    .line 146
    .line 147
    const/4 v7, 0x6

    .line 148
    goto :goto_3

    .line 149
    :cond_8
    move v7, v4

    .line 150
    :goto_3
    move v2, v7

    .line 151
    :goto_4
    const-wide/16 v16, -0x1

    .line 152
    .line 153
    invoke-interface {v1}, Lv3/f1;->f()Lv3/e1;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    iget v6, v6, Lv3/e1;->a:F

    .line 158
    .line 159
    const-string v7, "EXO_SPEED"

    .line 160
    .line 161
    invoke-virtual {v15, v7, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1}, Lv3/f1;->D()Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_9

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    const/4 v6, 0x0

    .line 172
    :goto_5
    move v7, v6

    .line 173
    invoke-interface {v1}, Lv3/f1;->m()Lv3/o0;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    iget-object v8, v6, Lv3/o0;->a:Ljava/lang/String;

    .line 180
    .line 181
    const-string v9, ""

    .line 182
    .line 183
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-nez v8, :cond_a

    .line 188
    .line 189
    iget-object v6, v6, Lv3/o0;->a:Ljava/lang/String;

    .line 190
    .line 191
    const-string v8, "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"

    .line 192
    .line 193
    invoke-virtual {v15, v8, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_a
    const-wide/16 v8, 0x0

    .line 197
    .line 198
    const/4 v6, 0x5

    .line 199
    invoke-interface {v1, v6}, Lv3/f1;->G(I)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    const/16 v10, 0xb

    .line 204
    .line 205
    invoke-interface {v1, v10}, Lv3/f1;->G(I)Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    const/16 v11, 0xc

    .line 210
    .line 211
    invoke-interface {v1, v11}, Lv3/f1;->G(I)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    invoke-interface {v1}, Lv3/f1;->J()Lv3/r1;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    invoke-virtual {v12}, Lv3/r1;->p()Z

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    if-nez v12, :cond_b

    .line 224
    .line 225
    invoke-interface {v1}, Lv3/f1;->g()Z

    .line 226
    .line 227
    .line 228
    :cond_b
    const-wide/32 v12, 0x640207

    .line 229
    .line 230
    .line 231
    if-eqz v6, :cond_c

    .line 232
    .line 233
    const-wide/32 v12, 0x640307

    .line 234
    .line 235
    .line 236
    :cond_c
    if-eqz v11, :cond_d

    .line 237
    .line 238
    const-wide/16 v18, 0x40

    .line 239
    .line 240
    or-long v12, v12, v18

    .line 241
    .line 242
    :cond_d
    if-eqz v10, :cond_e

    .line 243
    .line 244
    const-wide/16 v10, 0x8

    .line 245
    .line 246
    or-long/2addr v12, v10

    .line 247
    :cond_e
    iget-wide v10, v0, Lb4/a;->j:J

    .line 248
    .line 249
    and-long/2addr v10, v12

    .line 250
    or-long/2addr v8, v10

    .line 251
    invoke-interface {v1}, Lv3/f1;->z()J

    .line 252
    .line 253
    .line 254
    move-result-wide v12

    .line 255
    invoke-interface {v1}, Lv3/f1;->P()J

    .line 256
    .line 257
    .line 258
    move-result-wide v18

    .line 259
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 260
    .line 261
    .line 262
    move-result-wide v20

    .line 263
    invoke-interface {v1}, Lv3/f1;->x()I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    iget-object v10, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 268
    .line 269
    if-ne v6, v3, :cond_f

    .line 270
    .line 271
    move v5, v3

    .line 272
    goto :goto_6

    .line 273
    :cond_f
    if-ne v6, v4, :cond_10

    .line 274
    .line 275
    move v5, v4

    .line 276
    :cond_10
    :goto_6
    invoke-virtual {v10, v5}, Landroid/support/v4/media/session/MediaSessionCompat;->j(I)V

    .line 277
    .line 278
    .line 279
    iget-object v3, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 280
    .line 281
    invoke-interface {v1}, Lv3/f1;->L()Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-virtual {v3, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->k(I)V

    .line 286
    .line 287
    .line 288
    iget-object v5, v0, Lb4/a;->a:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 289
    .line 290
    new-instance v6, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 291
    .line 292
    move-object v1, v6

    .line 293
    const/4 v10, 0x0

    .line 294
    const/4 v11, 0x0

    .line 295
    move-wide/from16 v3, v18

    .line 296
    .line 297
    move-object/from16 v22, v5

    .line 298
    .line 299
    move-object/from16 v23, v6

    .line 300
    .line 301
    move-wide v5, v12

    .line 302
    move-wide/from16 v12, v20

    .line 303
    .line 304
    move-object/from16 v18, v15

    .line 305
    .line 306
    move-wide/from16 v15, v16

    .line 307
    .line 308
    move-object/from16 v17, v18

    .line 309
    .line 310
    invoke-direct/range {v1 .. v17}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v1, v22

    .line 314
    .line 315
    move-object/from16 v2, v23

    .line 316
    .line 317
    goto/16 :goto_0
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

.class public final Lv3/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/p1$b;,
        Lv3/p1$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Lv3/p1$a;

.field public final d:Landroid/media/AudioManager;

.field public e:Lv3/p1$b;

.field public f:I

.field public g:I

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lv3/d0$b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lv3/p1;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lv3/p1;->b:Landroid/os/Handler;

    .line 11
    .line 12
    iput-object p3, p0, Lv3/p1;->c:Lv3/p1$a;

    .line 13
    .line 14
    const-string p2, "audio"

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/media/AudioManager;

    .line 21
    .line 22
    invoke-static {p2}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lv3/p1;->d:Landroid/media/AudioManager;

    .line 26
    .line 27
    const/4 p3, 0x3

    .line 28
    iput p3, p0, Lv3/p1;->f:I

    .line 29
    .line 30
    invoke-static {p2, p3}, Lv3/p1;->a(Landroid/media/AudioManager;I)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    iput p3, p0, Lv3/p1;->g:I

    .line 35
    .line 36
    iget p3, p0, Lv3/p1;->f:I

    .line 37
    .line 38
    sget v0, Lv5/e0;->a:I

    .line 39
    .line 40
    const/16 v1, 0x17

    .line 41
    .line 42
    if-lt v0, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2, p3}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {p2, p3}, Lv3/p1;->a(Landroid/media/AudioManager;I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 p2, 0x0

    .line 58
    :goto_0
    iput-boolean p2, p0, Lv3/p1;->h:Z

    .line 59
    .line 60
    new-instance p2, Lv3/p1$b;

    .line 61
    .line 62
    invoke-direct {p2, p0}, Lv3/p1$b;-><init>(Lv3/p1;)V

    .line 63
    .line 64
    .line 65
    new-instance p3, Landroid/content/IntentFilter;

    .line 66
    .line 67
    const-string v0, "android.media.VOLUME_CHANGED_ACTION"

    .line 68
    .line 69
    invoke-direct {p3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lv3/p1;->e:Lv3/p1$b;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move-exception p1

    .line 79
    const-string p2, "StreamVolumeManager"

    .line 80
    .line 81
    const-string p3, "Error registering stream volume receiver"

    .line 82
    .line 83
    invoke-static {p2, p3, p1}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    :goto_1
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

.method public static a(Landroid/media/AudioManager;I)I
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not retrieve stream volume for stream type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StreamVolumeManager"

    invoke-static {v2, v1, v0}, Lv5/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(I)V
    .locals 4

    .line 1
    iget v0, p0, Lv3/p1;->f:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lv3/p1;->f:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lv3/p1;->c()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lv3/p1;->c:Lv3/p1$a;

    .line 12
    .line 13
    check-cast p1, Lv3/d0$b;

    .line 14
    .line 15
    iget-object v0, p1, Lv3/d0$b;->a:Lv3/d0;

    .line 16
    .line 17
    iget-object v0, v0, Lv3/d0;->B:Lv3/p1;

    .line 18
    .line 19
    invoke-static {v0}, Lv3/d0;->Y(Lv3/p1;)Lv3/m;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lv3/d0$b;->a:Lv3/d0;

    .line 24
    .line 25
    iget-object v1, v1, Lv3/d0;->c0:Lv3/m;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lv3/m;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    iget-object p1, p1, Lv3/d0$b;->a:Lv3/d0;

    .line 34
    .line 35
    iput-object v0, p1, Lv3/d0;->c0:Lv3/m;

    .line 36
    .line 37
    iget-object p1, p1, Lv3/d0;->l:Lv5/l;

    .line 38
    .line 39
    const/16 v1, 0x1d

    .line 40
    .line 41
    new-instance v2, Laa/m0;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-direct {v2, v0, v3}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1, v2}, Lv5/l;->e(ILv5/l$a;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
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

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv3/p1;->d:Landroid/media/AudioManager;

    .line 2
    .line 3
    iget v1, p0, Lv3/p1;->f:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lv3/p1;->a(Landroid/media/AudioManager;I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lv3/p1;->d:Landroid/media/AudioManager;

    .line 10
    .line 11
    iget v2, p0, Lv3/p1;->f:I

    .line 12
    .line 13
    sget v3, Lv5/e0;->a:I

    .line 14
    .line 15
    const/16 v4, 0x17

    .line 16
    .line 17
    if-lt v3, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1, v2}, Lv3/p1;->a(Landroid/media/AudioManager;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    iget v2, p0, Lv3/p1;->g:I

    .line 34
    .line 35
    if-ne v2, v0, :cond_2

    .line 36
    .line 37
    iget-boolean v2, p0, Lv3/p1;->h:Z

    .line 38
    .line 39
    if-eq v2, v1, :cond_3

    .line 40
    .line 41
    :cond_2
    iput v0, p0, Lv3/p1;->g:I

    .line 42
    .line 43
    iput-boolean v1, p0, Lv3/p1;->h:Z

    .line 44
    .line 45
    iget-object v2, p0, Lv3/p1;->c:Lv3/p1$a;

    .line 46
    .line 47
    check-cast v2, Lv3/d0$b;

    .line 48
    .line 49
    iget-object v2, v2, Lv3/d0$b;->a:Lv3/d0;

    .line 50
    .line 51
    iget-object v2, v2, Lv3/d0;->l:Lv5/l;

    .line 52
    .line 53
    const/16 v3, 0x1e

    .line 54
    .line 55
    new-instance v4, Lv3/e0;

    .line 56
    .line 57
    invoke-direct {v4, v0, v1}, Lv3/e0;-><init>(IZ)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Lv5/l;->e(ILv5/l$a;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
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

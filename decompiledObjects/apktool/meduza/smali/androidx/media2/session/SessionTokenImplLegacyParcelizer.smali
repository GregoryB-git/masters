.class public final Landroidx/media2/session/SessionTokenImplLegacyParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/SessionTokenImplLegacy;
    .locals 4

    .line 1
    new-instance v0, Landroidx/media2/session/SessionTokenImplLegacy;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/session/SessionTokenImplLegacy;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 14
    .line 15
    iget v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->c:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->c:I

    .line 23
    .line 24
    iget v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->d:I

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->d:I

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->e:Landroid/content/ComponentName;

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroid/content/ComponentName;

    .line 41
    .line 42
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->e:Landroid/content/ComponentName;

    .line 43
    .line 44
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->f:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v2, 0x5

    .line 47
    invoke-virtual {p0, v2, v1}, Lb2/c;->u(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->f:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplLegacy;->g:Landroid/os/Bundle;

    .line 54
    .line 55
    const/4 v2, 0x6

    .line 56
    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iput-object p0, v0, Landroidx/media2/session/SessionTokenImplLegacy;->g:Landroid/os/Bundle;

    .line 61
    .line 62
    iget-object p0, v0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 63
    .line 64
    if-nez p0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-class v1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "android.support.v4.media.session.EXTRA_BINDER"

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Landroid/support/v4/media/session/IMediaSession$Stub;->asInterface(Landroid/os/IBinder;)Landroid/support/v4/media/session/IMediaSession;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {p0}, Lb2/a;->b(Landroid/os/Bundle;)Lb2/e;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "android.support.v4.media.session.TOKEN"

    .line 91
    .line 92
    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 97
    .line 98
    if-nez p0, :cond_1

    .line 99
    .line 100
    :goto_0
    const/4 p0, 0x0

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 103
    .line 104
    iget-object p0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->b:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-direct {v3, p0, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/IMediaSession;Lb2/e;)V

    .line 107
    .line 108
    .line 109
    move-object p0, v3

    .line 110
    :goto_1
    iput-object p0, v0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 111
    .line 112
    return-object v0
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

.method public static write(Landroidx/media2/session/SessionTokenImplLegacy;Lb2/c;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 11
    .line 12
    iget-object v3, v2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 15
    :try_start_1
    iget-object v2, v2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->d:Lb2/e;

    .line 16
    .line 17
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 18
    :try_start_2
    iget-object v3, p0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 19
    .line 20
    iget-object v4, v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 23
    :try_start_3
    iput-object v1, v3, Landroid/support/v4/media/session/MediaSessionCompat$Token;->d:Lb2/e;

    .line 24
    .line 25
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 26
    :try_start_4
    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->b()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media2/session/SessionTokenImplLegacy;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 35
    .line 36
    iget-object v3, v1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->a:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 39
    :try_start_5
    iput-object v2, v1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->d:Lb2/e;

    .line 40
    .line 41
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 42
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 46
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 47
    :catchall_1
    move-exception p0

    .line 48
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 49
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 50
    :catchall_2
    move-exception p0

    .line 51
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 52
    :try_start_c
    throw p0

    .line 53
    :catchall_3
    move-exception p0

    .line 54
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 55
    throw p0

    .line 56
    :cond_0
    iput-object v1, p0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 57
    .line 58
    :goto_0
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->b:Landroid/os/Bundle;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-virtual {p1, v1, v0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    iget v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->c:I

    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 68
    .line 69
    .line 70
    iget v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->d:I

    .line 71
    .line 72
    const/4 v1, 0x3

    .line 73
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->e:Landroid/content/ComponentName;

    .line 77
    .line 78
    const/4 v1, 0x4

    .line 79
    invoke-virtual {p1, v0, v1}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->f:Ljava/lang/String;

    .line 83
    .line 84
    const/4 v1, 0x5

    .line 85
    invoke-virtual {p1, v1, v0}, Lb2/c;->O(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Landroidx/media2/session/SessionTokenImplLegacy;->g:Landroid/os/Bundle;

    .line 89
    .line 90
    const/4 v0, 0x6

    .line 91
    invoke-virtual {p1, v0, p0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    return-void
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

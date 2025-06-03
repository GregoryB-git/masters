.class public final Landroidx/media2/session/LibraryResultParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/LibraryResult;
    .locals 4

    .line 1
    new-instance v0, Landroidx/media2/session/LibraryResult;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/session/LibraryResult;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Landroidx/media2/session/LibraryResult;->a:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Landroidx/media2/session/LibraryResult;->a:I

    .line 14
    .line 15
    iget-wide v1, v0, Landroidx/media2/session/LibraryResult;->b:J

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iput-wide v1, v0, Landroidx/media2/session/LibraryResult;->b:J

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroidx/media2/common/MediaItem;

    .line 32
    .line 33
    iput-object v1, v0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 34
    .line 35
    iget-object v1, v0, Landroidx/media2/session/LibraryResult;->e:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 43
    .line 44
    iput-object v1, v0, Landroidx/media2/session/LibraryResult;->e:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 45
    .line 46
    iget-object v1, v0, Landroidx/media2/session/LibraryResult;->g:Landroidx/media2/common/ParcelImplListSlice;

    .line 47
    .line 48
    const/4 v2, 0x5

    .line 49
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroidx/media2/common/ParcelImplListSlice;

    .line 54
    .line 55
    iput-object p0, v0, Landroidx/media2/session/LibraryResult;->g:Landroidx/media2/common/ParcelImplListSlice;

    .line 56
    .line 57
    iget-object v1, v0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 58
    .line 59
    iput-object v1, v0, Landroidx/media2/session/LibraryResult;->c:Landroidx/media2/common/MediaItem;

    .line 60
    .line 61
    sget-object v1, Landroidx/media2/session/a;->a:Ljava/util/HashMap;

    .line 62
    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    iget-object p0, p0, Landroidx/media2/common/ParcelImplListSlice;->a:Ljava/util/List;

    .line 68
    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-ge v2, v3, :cond_2

    .line 80
    .line 81
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Landroidx/versionedparcelable/ParcelImpl;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    invoke-static {v3}, Lb2/a;->a(Landroid/os/Parcelable;)Lb2/e;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Landroidx/media2/common/MediaItem;

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object p0, v1

    .line 102
    :goto_1
    iput-object p0, v0, Landroidx/media2/session/LibraryResult;->f:Ljava/util/ArrayList;

    .line 103
    .line 104
    return-object v0
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

.method public static write(Landroidx/media2/session/LibraryResult;Lb2/c;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->c:Landroidx/media2/common/MediaItem;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media2/session/LibraryResult;->c:Landroidx/media2/common/MediaItem;

    .line 14
    .line 15
    invoke-static {v1}, Landroidx/media2/session/a;->a(Landroidx/media2/common/MediaItem;)Landroidx/media2/common/MediaItem;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 20
    .line 21
    :cond_0
    monitor-exit v0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_1
    iget-object v1, p0, Landroidx/media2/session/LibraryResult;->g:Landroidx/media2/common/ParcelImplListSlice;

    .line 32
    .line 33
    if-nez v1, :cond_5

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/media2/session/LibraryResult;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    sget-object v2, Landroidx/media2/session/a;->a:Ljava/util/HashMap;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-ge v3, v4, :cond_4

    .line 54
    .line 55
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Landroidx/media2/common/MediaItem;

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    invoke-static {v4}, Landroidx/media2/common/MediaParcelUtils;->a(Lb2/e;)Landroidx/versionedparcelable/ParcelImpl;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    new-instance v1, Landroidx/media2/common/ParcelImplListSlice;

    .line 74
    .line 75
    invoke-direct {v1, v2}, Landroidx/media2/common/ParcelImplListSlice;-><init>(Ljava/util/ArrayList;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    iput-object v1, p0, Landroidx/media2/session/LibraryResult;->g:Landroidx/media2/common/ParcelImplListSlice;

    .line 79
    .line 80
    :cond_5
    monitor-exit v0

    .line 81
    goto :goto_3

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    throw p0

    .line 85
    :cond_6
    :goto_3
    iget v0, p0, Landroidx/media2/session/LibraryResult;->a:I

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 89
    .line 90
    .line 91
    iget-wide v0, p0, Landroidx/media2/session/LibraryResult;->b:J

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->d:Landroidx/media2/common/MediaItem;

    .line 98
    .line 99
    const/4 v1, 0x3

    .line 100
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->e:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    .line 104
    .line 105
    const/4 v1, 0x4

    .line 106
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, Landroidx/media2/session/LibraryResult;->g:Landroidx/media2/common/ParcelImplListSlice;

    .line 110
    .line 111
    const/4 v0, 0x5

    .line 112
    invoke-virtual {p1, p0, v0}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

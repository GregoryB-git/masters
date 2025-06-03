.class public final Lj6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:Lj6/k;


# instance fields
.field public final a:Landroid/content/Context;

.field public volatile b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lj6/k;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lj6/k;
    .locals 4

    .line 1
    invoke-static {p0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Lj6/k;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lj6/k;->c:Lj6/k;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lj6/y;->a:Lj6/s;

    .line 12
    .line 13
    const-class v1, Lj6/y;

    .line 14
    .line 15
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    sget-object v2, Lj6/y;->e:Landroid/content/Context;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sput-object v2, Lj6/y;->e:Landroid/content/Context;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v2, "GoogleCertificates"

    .line 28
    .line 29
    const-string v3, "GoogleCertificates has been initialized already"

    .line 30
    .line 31
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 35
    new-instance v1, Lj6/k;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lj6/k;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lj6/k;->c:Lj6/k;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    monitor-exit v1

    .line 45
    throw p0

    .line 46
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    sget-object p0, Lj6/k;->c:Lj6/k;

    .line 48
    .line 49
    return-object p0

    .line 50
    :catchall_1
    move-exception p0

    .line 51
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    throw p0
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

.method public static final varargs c(Landroid/content/pm/PackageInfo;[Lj6/u;)Lj6/u;
    .locals 3

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const-string p0, "GoogleSignatureVerifier"

    const-string p1, "Package has more than one signature."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_1
    new-instance v0, Lj6/v;

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    invoke-direct {v0, p0}, Lj6/v;-><init>([B)V

    :goto_0
    array-length p0, p1

    if-ge v2, p0, :cond_3

    aget-object p0, p1, v2

    invoke-virtual {p0, v0}, Lj6/u;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    aget-object p0, p1, v2

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public static final d(Landroid/content/pm/PackageInfo;Z)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    if-eqz p0, :cond_3

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v3, "com.android.vending"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v3, "com.google.android.gms"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_0
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez p1, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 p1, p1, 0x81

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    move-object v2, p0

    :goto_1
    if-eqz p0, :cond_6

    iget-object p0, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz p0, :cond_6

    if-eqz p1, :cond_5

    sget-object p0, Lj6/x;->a:[Lj6/u;

    invoke-static {v2, p0}, Lj6/k;->c(Landroid/content/pm/PackageInfo;[Lj6/u;)Lj6/u;

    move-result-object p0

    goto :goto_2

    :cond_5
    new-array p0, v0, [Lj6/u;

    sget-object p1, Lj6/x;->a:[Lj6/u;

    aget-object p1, p1, v1

    aput-object p1, p0, v1

    invoke-static {v2, p0}, Lj6/k;->c(Landroid/content/pm/PackageInfo;[Lj6/u;)Lj6/u;

    move-result-object p0

    :goto_2
    if-eqz p0, :cond_6

    return v0

    :cond_6
    return v1
.end method


# virtual methods
.method public final b(I)Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lj6/k;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move/from16 v2, p1

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v2, :cond_e

    .line 18
    .line 19
    array-length v5, v2

    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    goto/16 :goto_b

    .line 23
    .line 24
    :cond_0
    move-object v0, v3

    .line 25
    move v6, v4

    .line 26
    :goto_0
    if-ge v6, v5, :cond_d

    .line 27
    .line 28
    aget-object v14, v2, v6

    .line 29
    .line 30
    const-string v15, "Failed to get Google certificates from remote"

    .line 31
    .line 32
    const-string v13, "GoogleCertificates"

    .line 33
    .line 34
    const-string v7, "null pkg"

    .line 35
    .line 36
    if-nez v14, :cond_1

    .line 37
    .line 38
    new-instance v0, Lj6/g0;

    .line 39
    .line 40
    invoke-direct {v0, v4, v7, v3}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_1
    iget-object v0, v1, Lj6/k;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_a

    .line 52
    .line 53
    sget-object v0, Lj6/y;->a:Lj6/s;

    .line 54
    .line 55
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    :try_start_0
    invoke-static {}, Lj6/y;->b()V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lj6/y;->c:Lm6/e0;

    .line 63
    .line 64
    invoke-interface {v0}, Lm6/e0;->zzi()Z

    .line 65
    .line 66
    .line 67
    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :catch_0
    move-exception v0

    .line 73
    goto :goto_1

    .line 74
    :catch_1
    move-exception v0

    .line 75
    :goto_1
    :try_start_1
    invoke-static {v13, v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    move v0, v4

    .line 79
    :goto_2
    invoke-static {v8}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 80
    .line 81
    .line 82
    const/4 v12, 0x1

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v0, v1, Lj6/k;->a:Landroid/content/Context;

    .line 86
    .line 87
    invoke-static {v0}, Lj6/j;->b(Landroid/content/Context;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    :try_start_2
    sget-object v0, Lj6/y;->e:Landroid/content/Context;

    .line 96
    .line 97
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    .line 99
    .line 100
    :try_start_3
    invoke-static {}, Lj6/y;->b()V
    :try_end_3
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 101
    .line 102
    .line 103
    :try_start_4
    new-instance v0, Lj6/z;

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    sget-object v7, Lj6/y;->e:Landroid/content/Context;

    .line 107
    .line 108
    invoke-static {v7}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/16 v18, 0x1

    .line 115
    .line 116
    move-object v7, v0

    .line 117
    move-object v8, v14

    .line 118
    move v4, v12

    .line 119
    move/from16 v12, v17

    .line 120
    .line 121
    move-object/from16 v19, v13

    .line 122
    .line 123
    move/from16 v13, v18

    .line 124
    .line 125
    invoke-direct/range {v7 .. v13}, Lj6/z;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    .line 127
    .line 128
    :try_start_5
    sget-object v7, Lj6/y;->c:Lm6/e0;

    .line 129
    .line 130
    invoke-interface {v7, v0}, Lm6/e0;->N0(Lj6/z;)Lj6/b0;

    .line 131
    .line 132
    .line 133
    move-result-object v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 134
    :try_start_6
    iget-boolean v7, v0, Lj6/b0;->a:Z

    .line 135
    .line 136
    if-eqz v7, :cond_2

    .line 137
    .line 138
    iget v0, v0, Lj6/b0;->d:I

    .line 139
    .line 140
    invoke-static {v0}, Lx6/b;->E0(I)I

    .line 141
    .line 142
    .line 143
    new-instance v0, Lj6/g0;

    .line 144
    .line 145
    invoke-direct {v0, v4, v3, v3}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_2
    iget-object v4, v0, Lj6/b0;->b:Ljava/lang/String;

    .line 150
    .line 151
    iget v7, v0, Lj6/b0;->c:I

    .line 152
    .line 153
    invoke-static {v7}, Lva/a;->h(I)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    const/4 v8, 0x4

    .line 158
    if-ne v7, v8, :cond_3

    .line 159
    .line 160
    new-instance v7, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 161
    .line 162
    invoke-direct {v7}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_3
    move-object v7, v3

    .line 167
    :goto_3
    const-string v8, "error checking package certificate"

    .line 168
    .line 169
    if-nez v4, :cond_4

    .line 170
    .line 171
    move-object v4, v8

    .line 172
    :cond_4
    iget v8, v0, Lj6/b0;->d:I

    .line 173
    .line 174
    invoke-static {v8}, Lx6/b;->E0(I)I

    .line 175
    .line 176
    .line 177
    iget v0, v0, Lj6/b0;->c:I

    .line 178
    .line 179
    invoke-static {v0}, Lva/a;->h(I)I

    .line 180
    .line 181
    .line 182
    new-instance v0, Lj6/g0;

    .line 183
    .line 184
    const/4 v8, 0x0

    .line 185
    invoke-direct {v0, v8, v4, v7}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catch_2
    move-exception v0

    .line 190
    move-object/from16 v4, v19

    .line 191
    .line 192
    invoke-static {v4, v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 193
    .line 194
    .line 195
    const-string v4, "module call"

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :catch_3
    move-exception v0

    .line 199
    move-object v4, v13

    .line 200
    move-object v7, v0

    .line 201
    invoke-static {v4, v15, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const-string v4, "module init: "

    .line 209
    .line 210
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    move-object v0, v7

    .line 219
    :goto_4
    new-instance v7, Lj6/g0;

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    invoke-direct {v7, v8, v4, v0}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 223
    .line 224
    .line 225
    move-object v0, v7

    .line 226
    :goto_5
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :catchall_1
    move-exception v0

    .line 232
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_5
    move v4, v12

    .line 237
    :try_start_7
    iget-object v0, v1, Lj6/k;->a:Landroid/content/Context;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    const/16 v8, 0x40

    .line 244
    .line 245
    invoke-virtual {v0, v14, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 246
    .line 247
    .line 248
    move-result-object v0
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_4

    .line 249
    iget-object v8, v1, Lj6/k;->a:Landroid/content/Context;

    .line 250
    .line 251
    invoke-static {v8}, Lj6/j;->b(Landroid/content/Context;)Z

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    if-nez v0, :cond_6

    .line 256
    .line 257
    new-instance v0, Lj6/g0;

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    invoke-direct {v0, v9, v7, v3}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_6
    const/4 v9, 0x0

    .line 265
    iget-object v7, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 266
    .line 267
    if-eqz v7, :cond_9

    .line 268
    .line 269
    array-length v7, v7

    .line 270
    if-eq v7, v4, :cond_7

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_7
    new-instance v7, Lj6/v;

    .line 274
    .line 275
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 276
    .line 277
    aget-object v10, v10, v9

    .line 278
    .line 279
    invoke-virtual {v10}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    invoke-direct {v7, v10}, Lj6/v;-><init>([B)V

    .line 284
    .line 285
    .line 286
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    :try_start_8
    invoke-static {v10, v7, v8, v9}, Lj6/y;->a(Ljava/lang/String;Lj6/u;ZZ)Lj6/g0;

    .line 293
    .line 294
    .line 295
    move-result-object v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 296
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 297
    .line 298
    .line 299
    iget-boolean v9, v8, Lj6/g0;->a:Z

    .line 300
    .line 301
    if-eqz v9, :cond_8

    .line 302
    .line 303
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 304
    .line 305
    if-eqz v0, :cond_8

    .line 306
    .line 307
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 308
    .line 309
    and-int/lit8 v0, v0, 0x2

    .line 310
    .line 311
    if-eqz v0, :cond_8

    .line 312
    .line 313
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    const/4 v11, 0x0

    .line 318
    :try_start_9
    invoke-static {v10, v7, v11, v4}, Lj6/y;->a(Ljava/lang/String;Lj6/u;ZZ)Lj6/g0;

    .line 319
    .line 320
    .line 321
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 322
    invoke-static {v9}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 323
    .line 324
    .line 325
    iget-boolean v0, v0, Lj6/g0;->a:Z

    .line 326
    .line 327
    if-eqz v0, :cond_8

    .line 328
    .line 329
    const-string v0, "debuggable release cert app rejected"

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :catchall_2
    move-exception v0

    .line 333
    move-object v2, v0

    .line 334
    invoke-static {v9}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 335
    .line 336
    .line 337
    throw v2

    .line 338
    :cond_8
    move-object v0, v8

    .line 339
    goto :goto_8

    .line 340
    :catchall_3
    move-exception v0

    .line 341
    move-object v2, v0

    .line 342
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 343
    .line 344
    .line 345
    throw v2

    .line 346
    :cond_9
    :goto_6
    const-string v0, "single cert required"

    .line 347
    .line 348
    :goto_7
    new-instance v4, Lj6/g0;

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    invoke-direct {v4, v7, v0, v3}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 352
    .line 353
    .line 354
    move-object v0, v4

    .line 355
    :goto_8
    iget-boolean v4, v0, Lj6/g0;->a:Z

    .line 356
    .line 357
    if-eqz v4, :cond_b

    .line 358
    .line 359
    iput-object v14, v1, Lj6/k;->b:Ljava/lang/String;

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :catch_4
    move-exception v0

    .line 363
    const-string v4, "no pkg "

    .line 364
    .line 365
    invoke-virtual {v4, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    new-instance v7, Lj6/g0;

    .line 370
    .line 371
    const/4 v8, 0x0

    .line 372
    invoke-direct {v7, v8, v4, v0}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 373
    .line 374
    .line 375
    move-object v0, v7

    .line 376
    goto :goto_a

    .line 377
    :goto_9
    invoke-static {v8}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 378
    .line 379
    .line 380
    throw v0

    .line 381
    :cond_a
    sget-object v0, Lj6/g0;->d:Lj6/g0;

    .line 382
    .line 383
    :cond_b
    :goto_a
    iget-boolean v4, v0, Lj6/g0;->a:Z

    .line 384
    .line 385
    if-eqz v4, :cond_c

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_d
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_e
    :goto_b
    new-instance v0, Lj6/g0;

    .line 398
    .line 399
    const-string v2, "no pkgs"

    .line 400
    .line 401
    const/4 v4, 0x0

    .line 402
    invoke-direct {v0, v4, v2, v3}, Lj6/g0;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 403
    .line 404
    .line 405
    :goto_c
    iget-boolean v2, v0, Lj6/g0;->a:Z

    .line 406
    .line 407
    if-nez v2, :cond_10

    .line 408
    .line 409
    const/4 v2, 0x3

    .line 410
    const-string v3, "GoogleCertificatesRslt"

    .line 411
    .line 412
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    if-eqz v2, :cond_10

    .line 417
    .line 418
    iget-object v2, v0, Lj6/g0;->c:Ljava/lang/Throwable;

    .line 419
    .line 420
    if-eqz v2, :cond_f

    .line 421
    .line 422
    invoke-virtual {v0}, Lj6/g0;->a()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    iget-object v4, v0, Lj6/g0;->c:Ljava/lang/Throwable;

    .line 427
    .line 428
    invoke-static {v3, v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 429
    .line 430
    .line 431
    goto :goto_d

    .line 432
    :cond_f
    invoke-virtual {v0}, Lj6/g0;->a()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    :cond_10
    :goto_d
    iget-boolean v0, v0, Lj6/g0;->a:Z

    .line 440
    .line 441
    return v0
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

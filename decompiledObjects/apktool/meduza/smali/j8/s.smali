.class public final Lj8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lj8/w;

.field public final c:Ll/l;

.field public final d:J

.field public e:Lr4/c;

.field public f:Lr4/c;

.field public g:Z

.field public h:Lj8/n;

.field public final i:Lj8/a0;

.field public final j:Lp8/e;

.field public final k:Li8/b;

.field public final l:Lh8/a;

.field public final m:Lj8/j;

.field public final n:Lg8/a;

.field public final o:Lg8/f;

.field public final p:Lk8/i;


# direct methods
.method public constructor <init>(Lu7/f;Lj8/a0;Lg8/b;Lj8/w;Le;Laa/m0;Lp8/e;Lj8/j;Lg8/f;Lk8/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lj8/s;->b:Lj8/w;

    .line 5
    .line 6
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lu7/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p1, p0, Lj8/s;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lj8/s;->i:Lj8/a0;

    .line 14
    .line 15
    iput-object p3, p0, Lj8/s;->n:Lg8/a;

    .line 16
    .line 17
    iput-object p5, p0, Lj8/s;->k:Li8/b;

    .line 18
    .line 19
    iput-object p6, p0, Lj8/s;->l:Lh8/a;

    .line 20
    .line 21
    iput-object p7, p0, Lj8/s;->j:Lp8/e;

    .line 22
    .line 23
    iput-object p8, p0, Lj8/s;->m:Lj8/j;

    .line 24
    .line 25
    iput-object p9, p0, Lj8/s;->o:Lg8/f;

    .line 26
    .line 27
    iput-object p10, p0, Lj8/s;->p:Lk8/i;

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    iput-wide p1, p0, Lj8/s;->d:J

    .line 34
    .line 35
    new-instance p1, Ll/l;

    .line 36
    .line 37
    const/4 p2, 0x6

    .line 38
    invoke-direct {p1, p2}, Ll/l;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lj8/s;->c:Ll/l;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lr8/h;)V
    .locals 4

    .line 1
    invoke-static {}, Lk8/i;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lk8/i;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lj8/s;->e:Lr4/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr4/c;->d()V

    .line 10
    .line 11
    .line 12
    const-string v0, "FirebaseCrashlytics"

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v1, "Initialization marker file was created."

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v1, p0, Lj8/s;->k:Li8/b;

    .line 28
    .line 29
    new-instance v3, Lj8/r;

    .line 30
    .line 31
    invoke-direct {v3, p0}, Lj8/r;-><init>(Lj8/s;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v3}, Li8/b;->c(Li8/a;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lj8/s;->h:Lj8/n;

    .line 38
    .line 39
    invoke-virtual {v1}, Lj8/n;->h()V

    .line 40
    .line 41
    .line 42
    check-cast p1, Lr8/f;

    .line 43
    .line 44
    invoke-virtual {p1}, Lr8/f;->b()Lr8/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v1, v1, Lr8/c;->b:Lr8/c$a;

    .line 49
    .line 50
    iget-boolean v1, v1, Lr8/c$a;->a:Z

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lj8/s;->h:Lj8/n;

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lj8/n;->d(Lr8/h;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    const-string v1, "Previous sessions could not be finalized."

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v1, p0, Lj8/s;->h:Lj8/n;

    .line 68
    .line 69
    iget-object p1, p1, Lr8/f;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1}, Lj8/n;->j(Lcom/google/android/gms/tasks/Task;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :catch_0
    move-exception p1

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 p1, 0x3

    .line 90
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 91
    .line 92
    .line 93
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    const-string v1, "Collection of crash reports disabled in Crashlytics settings."

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    :try_start_1
    invoke-static {v0, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    .line 100
    .line 101
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 102
    .line 103
    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :goto_0
    :try_start_2
    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    .line 108
    .line 109
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p0}, Lj8/s;->c()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :goto_2
    invoke-virtual {p0}, Lj8/s;->c()V

    .line 117
    .line 118
    .line 119
    throw p1
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

.method public final b(Lr8/f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj8/s;->p:Lk8/i;

    .line 2
    .line 3
    iget-object v0, v0, Lk8/i;->a:Lk8/b;

    .line 4
    .line 5
    iget-object v0, v0, Lk8/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance v1, Lx0/f;

    .line 8
    .line 9
    const/16 v2, 0xe

    .line 10
    .line 11
    invoke-direct {v1, v2, p0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "FirebaseCrashlytics"

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    const-wide/16 v1, 0x3

    .line 34
    .line 35
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 36
    .line 37
    invoke-interface {p1, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    const-string v1, "Crashlytics timed out during initialization."

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_1
    move-exception p1

    .line 46
    const-string v1, "Crashlytics encountered a problem during initialization."

    .line 47
    .line 48
    :goto_0
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_2
    move-exception p1

    .line 53
    const-string v1, "Crashlytics was interrupted during initialization."

    .line 54
    .line 55
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void
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
    .locals 4

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    invoke-static {}, Lk8/i;->a()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lj8/s;->e:Lr4/c;

    .line 7
    .line 8
    iget-object v2, v1, Lr4/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lp8/e;

    .line 11
    .line 12
    iget-object v1, v1, Lr4/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v3, Ljava/io/File;

    .line 20
    .line 21
    iget-object v2, v2, Lp8/e;->c:Ljava/io/File;

    .line 22
    .line 23
    invoke-direct {v3, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const-string v1, "Initialization marker file was not properly removed."

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v1

    .line 40
    const-string v2, "Problem encountered deleting Crashlytics initialization marker."

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
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

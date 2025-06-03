.class public final Lgb/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Leb/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/e$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field public b:Leb/e1;

.field public final synthetic c:Lgb/q;


# direct methods
.method public constructor <init>(Lgb/q;Leb/e$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/e$a<",
            "TRespT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lgb/q$b;->c:Lgb/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "observer"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lgb/q$b;->a:Leb/e$a;

    return-void
.end method


# virtual methods
.method public final a(Lgb/n3$a;)V
    .locals 2

    .line 1
    invoke-static {}, Lpb/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 5
    .line 6
    iget-object v0, v0, Lgb/q;->b:Lpb/c;

    .line 7
    .line 8
    invoke-static {}, Lpb/b;->a()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lpb/b;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 15
    .line 16
    iget-object v0, v0, Lgb/q;->c:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, Lgb/q$b$b;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lgb/q$b$b;-><init>(Lgb/q$b;Lgb/n3$a;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    sget-object p1, Lpb/b;->a:Lpb/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    throw p1
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

.method public final b(Leb/s0;)V
    .locals 2

    .line 1
    invoke-static {}, Lpb/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 5
    .line 6
    iget-object v0, v0, Lgb/q;->b:Lpb/c;

    .line 7
    .line 8
    invoke-static {}, Lpb/b;->a()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lpb/b;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 15
    .line 16
    iget-object v0, v0, Lgb/q;->c:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, Lgb/q$b$a;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lgb/q$b$a;-><init>(Lgb/q$b;Leb/s0;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    sget-object p1, Lpb/b;->a:Lpb/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    throw p1
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

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/q;->a:Leb/t0;

    .line 4
    .line 5
    iget-object v0, v0, Leb/t0;->a:Leb/t0$c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, Leb/t0$c;->a:Leb/t0$c;

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    sget-object v1, Leb/t0$c;->b:Leb/t0$c;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    :goto_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {}, Lpb/b;->c()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 29
    .line 30
    iget-object v0, v0, Lgb/q;->b:Lpb/c;

    .line 31
    .line 32
    invoke-static {}, Lpb/b;->a()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lpb/b;->b()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 39
    .line 40
    iget-object v0, v0, Lgb/q;->c:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    new-instance v1, Lgb/q$b$c;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lgb/q$b$c;-><init>(Lgb/q$b;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    sget-object v0, Lpb/b;->a:Lpb/a;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_1
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    throw v0
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

.method public final d(Leb/e1;Lgb/t$a;Leb/s0;)V
    .locals 0

    .line 1
    invoke-static {}, Lpb/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, Lgb/q$b;->c:Lgb/q;

    .line 5
    .line 6
    iget-object p2, p2, Lgb/q;->b:Lpb/c;

    .line 7
    .line 8
    invoke-static {}, Lpb/b;->a()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p3}, Lgb/q$b;->e(Leb/e1;Leb/s0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget-object p1, Lpb/b;->a:Lpb/a;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    sget-object p2, Lpb/b;->a:Lpb/a;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_1
    move-exception p2

    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    throw p1
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

.method public final e(Leb/e1;Leb/s0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/q;->i:Leb/c;

    .line 4
    .line 5
    iget-object v1, v1, Leb/c;->a:Leb/q;

    .line 6
    .line 7
    iget-object v0, v0, Lgb/q;->f:Leb/p;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    :cond_0
    iget-object v0, p1, Leb/e1;->a:Leb/e1$a;

    .line 17
    .line 18
    sget-object v2, Leb/e1$a;->d:Leb/e1$a;

    .line 19
    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Leb/q;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance p1, Ld2/q;

    .line 31
    .line 32
    invoke-direct {p1}, Ld2/q;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lgb/q$b;->c:Lgb/q;

    .line 36
    .line 37
    iget-object p2, p2, Lgb/q;->j:Lgb/s;

    .line 38
    .line 39
    invoke-interface {p2, p1}, Lgb/s;->i(Ld2/q;)V

    .line 40
    .line 41
    .line 42
    sget-object p2, Leb/e1;->h:Leb/e1;

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "ClientCall was cancelled at or after deadline. "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2, p1}, Leb/e1;->a(Ljava/lang/String;)Leb/e1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Leb/s0;

    .line 66
    .line 67
    invoke-direct {p2}, Leb/s0;-><init>()V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {}, Lpb/b;->b()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lgb/q$b;->c:Lgb/q;

    .line 74
    .line 75
    iget-object v0, v0, Lgb/q;->c:Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    new-instance v1, Lgb/r;

    .line 78
    .line 79
    invoke-direct {v1, p0, p1, p2}, Lgb/r;-><init>(Lgb/q$b;Leb/e1;Leb/s0;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    return-void
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

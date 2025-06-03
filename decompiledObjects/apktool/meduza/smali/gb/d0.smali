.class public Lgb/d0;
.super Leb/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/d0$i;,
        Lgb/d0$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Leb/e<",
        "TReqT;TRespT;>;"
    }
.end annotation


# static fields
.field public static final j:Lgb/d0$g;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Leb/p;

.field public volatile d:Z

.field public e:Leb/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/e$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field public f:Leb/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/e<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field public g:Leb/e1;

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lgb/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgb/d0$i<",
            "TRespT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lgb/d0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    new-instance v0, Lgb/d0$g;

    invoke-direct {v0}, Lgb/d0$g;-><init>()V

    sput-object v0, Lgb/d0;->j:Lgb/d0$g;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lgb/r1$n;Leb/q;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Leb/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgb/d0;->h:Ljava/util/List;

    .line 10
    .line 11
    const-string v0, "callExecutor"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lgb/d0;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    const-string p1, "scheduler"

    .line 19
    .line 20
    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Leb/p;->b()Leb/p;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lgb/d0;->c:Leb/p;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    if-nez p3, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Leb/q;->h(Ljava/util/concurrent/TimeUnit;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 47
    .line 48
    const-wide/16 v4, 0x1

    .line 49
    .line 50
    invoke-virtual {p3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    div-long/2addr v2, v6

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-virtual {p3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    rem-long/2addr v6, v4

    .line 64
    new-instance p3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x1

    .line 71
    const-string v8, "CallOptions"

    .line 72
    .line 73
    const-wide/16 v9, 0x0

    .line 74
    .line 75
    cmp-long v9, v0, v9

    .line 76
    .line 77
    if-gez v9, :cond_1

    .line 78
    .line 79
    const-string v9, "ClientCall started after "

    .line 80
    .line 81
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v8, " deadline was exceeded. Deadline has been exceeded for "

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string v9, "Deadline "

    .line 91
    .line 92
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v8, " will be exceeded in "

    .line 99
    .line 100
    :goto_0
    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 107
    .line 108
    new-array v3, v5, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    aput-object v5, v3, v4

    .line 115
    .line 116
    const-string v4, ".%09d"

    .line 117
    .line 118
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v2, "s. "

    .line 126
    .line 127
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    new-instance v2, Lgb/c0;

    .line 131
    .line 132
    invoke-direct {v2, p0, p3}, Lgb/c0;-><init>(Lgb/d0;Ljava/lang/StringBuilder;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v2, v0, v1, p1}, Lgb/r1$n;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :goto_1
    iput-object p1, p0, Lgb/d0;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 140
    .line 141
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Leb/e1;->f:Leb/e1;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Call cancelled without message"

    :goto_0
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    move-result-object p1

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lgb/d0;->g(Leb/e1;Z)V

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, Lgb/d0$f;

    invoke-direct {v0, p0}, Lgb/d0$f;-><init>(Lgb/d0;)V

    invoke-virtual {p0, v0}, Lgb/d0;->h(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-boolean v0, p0, Lgb/d0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/d0;->f:Leb/e;

    invoke-virtual {v0, p1}, Leb/e;->c(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/d0$e;

    invoke-direct {v0, p0, p1}, Lgb/d0$e;-><init>(Lgb/d0;I)V

    invoke-virtual {p0, v0}, Lgb/d0;->h(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lgb/d0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/d0;->f:Leb/e;

    invoke-virtual {v0, p1}, Leb/e;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/d0$d;

    invoke-direct {v0, p0, p1}, Lgb/d0$d;-><init>(Lgb/d0;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lgb/d0;->h(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final e(Leb/e$a;Leb/s0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/e$a<",
            "TRespT;>;",
            "Leb/s0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lgb/d0;->e:Leb/e$a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "already started"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    monitor-enter p0

    :try_start_0
    const-string v0, "listener"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/d0;->e:Leb/e$a;

    iget-object v0, p0, Lgb/d0;->g:Leb/e1;

    iget-boolean v1, p0, Lgb/d0;->d:Z

    if-nez v1, :cond_1

    new-instance v2, Lgb/d0$i;

    invoke-direct {v2, p1}, Lgb/d0$i;-><init>(Leb/e$a;)V

    iput-object v2, p0, Lgb/d0;->i:Lgb/d0$i;

    move-object p1, v2

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    iget-object p2, p0, Lgb/d0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lgb/d0$h;

    invoke-direct {v1, p0, p1, v0}, Lgb/d0$h;-><init>(Lgb/d0;Leb/e$a;Leb/e1;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, Lgb/d0;->f:Leb/e;

    invoke-virtual {v0, p1, p2}, Leb/e;->e(Leb/e$a;Leb/s0;)V

    goto :goto_1

    :cond_3
    new-instance v0, Lgb/d0$b;

    invoke-direct {v0, p0, p1, p2}, Lgb/d0$b;-><init>(Lgb/d0;Leb/e$a;Leb/s0;)V

    invoke-virtual {p0, v0}, Lgb/d0;->h(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public final g(Leb/e1;Z)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lgb/d0;->f:Leb/e;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    sget-object p2, Lgb/d0;->j:Lgb/d0$g;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    const-string v3, "realCall already set to %s"

    .line 15
    .line 16
    invoke-static {v0, v3, v2}, Lx6/b;->G(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lgb/d0;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_4

    .line 29
    :cond_1
    :goto_1
    iput-object p2, p0, Lgb/d0;->f:Leb/e;

    .line 30
    .line 31
    iget-object p2, p0, Lgb/d0;->e:Leb/e$a;

    .line 32
    .line 33
    iput-object p1, p0, Lgb/d0;->g:Leb/e1;

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :cond_3
    const/4 p2, 0x0

    .line 41
    move v1, v2

    .line 42
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    new-instance p2, Lgb/d0$c;

    .line 46
    .line 47
    invoke-direct {p2, p0, p1}, Lgb/d0$c;-><init>(Lgb/d0;Leb/e1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lgb/d0;->h(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    if-eqz p2, :cond_5

    .line 55
    .line 56
    iget-object v0, p0, Lgb/d0;->b:Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    new-instance v1, Lgb/d0$h;

    .line 59
    .line 60
    invoke-direct {v1, p0, p2, p1}, Lgb/d0$h;-><init>(Lgb/d0;Leb/e$a;Leb/e1;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    :cond_5
    invoke-virtual {p0}, Lgb/d0;->i()V

    .line 67
    .line 68
    .line 69
    :goto_3
    invoke-virtual {p0}, Lgb/d0;->f()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
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

.method public final h(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lgb/d0;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/d0;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final i()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lgb/d0;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lgb/d0;->h:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgb/d0;->d:Z

    iget-object v0, p0, Lgb/d0;->i:Lgb/d0$i;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgb/d0;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lgb/d0$a;

    invoke-direct {v2, p0, v0}, Lgb/d0$a;-><init>(Lgb/d0;Lgb/d0$i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lgb/d0;->h:Ljava/util/List;

    iput-object v0, p0, Lgb/d0;->h:Ljava/util/List;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Lgb/d0;->f:Leb/e;

    const-string v2, "realCall"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

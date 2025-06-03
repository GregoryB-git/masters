.class public final LB0/n$d;
.super Landroid/os/Handler;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final o:I

.field public final p:LB0/n$e;

.field public final q:J

.field public r:LB0/n$b;

.field public s:Ljava/io/IOException;

.field public t:I

.field public u:Ljava/lang/Thread;

.field public v:Z

.field public volatile w:Z

.field public final synthetic x:LB0/n;


# direct methods
.method public constructor <init>(LB0/n;Landroid/os/Looper;LB0/n$e;LB0/n$b;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, LB0/n$d;->x:LB0/n;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LB0/n$d;->p:LB0/n$e;

    .line 7
    .line 8
    iput-object p4, p0, LB0/n$d;->r:LB0/n$b;

    .line 9
    .line 10
    iput p5, p0, LB0/n$d;->o:I

    .line 11
    .line 12
    iput-wide p6, p0, LB0/n$d;->q:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 8

    .line 1
    iput-boolean p1, p0, LB0/n$d;->w:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, LB0/n$d;->s:Ljava/io/IOException;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iput-boolean v1, p0, LB0/n$d;->v:Z

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    monitor-enter p0

    .line 26
    :try_start_0
    iput-boolean v1, p0, LB0/n$d;->v:Z

    .line 27
    .line 28
    iget-object v1, p0, LB0/n$d;->p:LB0/n$e;

    .line 29
    .line 30
    invoke-interface {v1}, LB0/n$e;->c()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LB0/n$d;->u:Ljava/lang/Thread;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, LB0/n$d;->c()V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iget-object p1, p0, LB0/n$d;->r:LB0/n$b;

    .line 54
    .line 55
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    move-object v1, p1

    .line 60
    check-cast v1, LB0/n$b;

    .line 61
    .line 62
    iget-object v2, p0, LB0/n$d;->p:LB0/n$e;

    .line 63
    .line 64
    iget-wide v5, p0, LB0/n$d;->q:J

    .line 65
    .line 66
    sub-long v5, v3, v5

    .line 67
    .line 68
    const/4 v7, 0x1

    .line 69
    invoke-interface/range {v1 .. v7}, LB0/n$b;->t(LB0/n$e;JJZ)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, LB0/n$d;->r:LB0/n$b;

    .line 73
    .line 74
    :cond_3
    return-void

    .line 75
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LB0/n$d;->s:Ljava/io/IOException;

    .line 3
    .line 4
    iget-object v0, p0, LB0/n$d;->x:LB0/n;

    .line 5
    .line 6
    invoke-static {v0}, LB0/n;->e(LB0/n;)Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LB0/n$d;->x:LB0/n;

    .line 11
    .line 12
    invoke-static {v1}, LB0/n;->b(LB0/n;)LB0/n$d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/n$d;->x:LB0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LB0/n;->c(LB0/n;LB0/n$d;)LB0/n$d;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget v0, p0, LB0/n$d;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    mul-int/lit16 v0, v0, 0x3e8

    .line 6
    .line 7
    const/16 v1, 0x1388

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    return-wide v0
.end method

.method public e(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/n$d;->s:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, LB0/n$d;->t:I

    .line 6
    .line 7
    if-gt v1, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    throw v0

    .line 11
    :cond_1
    :goto_0
    return-void
.end method

.method public f(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/n$d;->x:LB0/n;

    .line 2
    .line 3
    invoke-static {v0}, LB0/n;->b(LB0/n;)LB0/n$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LB0/n$d;->x:LB0/n;

    .line 17
    .line 18
    invoke-static {v0, p0}, LB0/n;->c(LB0/n;LB0/n$d;)LB0/n$d;

    .line 19
    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, p1, v2

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, LB0/n$d;->b()V

    .line 32
    .line 33
    .line 34
    :goto_1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, LB0/n$d;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LB0/n$d;->b()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    const/4 v2, 0x4

    .line 16
    if-eq v0, v2, :cond_9

    .line 17
    .line 18
    invoke-virtual {p0}, LB0/n$d;->c()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    iget-wide v2, p0, LB0/n$d;->q:J

    .line 26
    .line 27
    sub-long v7, v5, v2

    .line 28
    .line 29
    iget-object v0, p0, LB0/n$d;->r:LB0/n$b;

    .line 30
    .line 31
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v3, v0

    .line 36
    check-cast v3, LB0/n$b;

    .line 37
    .line 38
    iget-boolean v0, p0, LB0/n$d;->v:Z

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v4, p0, LB0/n$d;->p:LB0/n$e;

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    invoke-interface/range {v3 .. v9}, LB0/n$b;->t(LB0/n$e;JJZ)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    if-eq v0, v2, :cond_7

    .line 53
    .line 54
    const/4 v11, 0x3

    .line 55
    if-eq v0, v11, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v9, p1

    .line 61
    check-cast v9, Ljava/io/IOException;

    .line 62
    .line 63
    iput-object v9, p0, LB0/n$d;->s:Ljava/io/IOException;

    .line 64
    .line 65
    iget p1, p0, LB0/n$d;->t:I

    .line 66
    .line 67
    add-int/lit8 v10, p1, 0x1

    .line 68
    .line 69
    iput v10, p0, LB0/n$d;->t:I

    .line 70
    .line 71
    iget-object v4, p0, LB0/n$d;->p:LB0/n$e;

    .line 72
    .line 73
    invoke-interface/range {v3 .. v10}, LB0/n$b;->r(LB0/n$e;JJLjava/io/IOException;I)LB0/n$c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, LB0/n$c;->a(LB0/n$c;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v11, :cond_4

    .line 82
    .line 83
    iget-object p1, p0, LB0/n$d;->x:LB0/n;

    .line 84
    .line 85
    iget-object v0, p0, LB0/n$d;->s:Ljava/io/IOException;

    .line 86
    .line 87
    invoke-static {p1, v0}, LB0/n;->d(LB0/n;Ljava/io/IOException;)Ljava/io/IOException;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-static {p1}, LB0/n$c;->a(LB0/n$c;)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eq v0, v2, :cond_8

    .line 96
    .line 97
    invoke-static {p1}, LB0/n$c;->a(LB0/n$c;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-ne v0, v1, :cond_5

    .line 102
    .line 103
    iput v1, p0, LB0/n$d;->t:I

    .line 104
    .line 105
    :cond_5
    invoke-static {p1}, LB0/n$c;->b(LB0/n$c;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    invoke-static {p1}, LB0/n$c;->b(LB0/n$c;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    goto :goto_0

    .line 123
    :cond_6
    invoke-virtual {p0}, LB0/n$d;->d()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    :goto_0
    invoke-virtual {p0, v0, v1}, LB0/n$d;->f(J)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    :try_start_0
    iget-object v4, p0, LB0/n$d;->p:LB0/n$e;

    .line 132
    .line 133
    invoke-interface/range {v3 .. v8}, LB0/n$b;->o(LB0/n$e;JJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :catch_0
    move-exception p1

    .line 138
    const-string v0, "LoadTask"

    .line 139
    .line 140
    const-string v1, "Unexpected exception handling load completed"

    .line 141
    .line 142
    invoke-static {v0, v1, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, LB0/n$d;->x:LB0/n;

    .line 146
    .line 147
    new-instance v1, LB0/n$h;

    .line 148
    .line 149
    invoke-direct {v1, p1}, LB0/n$h;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1}, LB0/n;->d(LB0/n;Ljava/io/IOException;)Ljava/io/IOException;

    .line 153
    .line 154
    .line 155
    :cond_8
    :goto_1
    return-void

    .line 156
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Ljava/lang/Error;

    .line 159
    .line 160
    throw p1
.end method

.method public run()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :try_start_1
    iget-boolean v1, p0, LB0/n$d;->v:Z

    .line 4
    .line 5
    xor-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iput-object v2, p0, LB0/n$d;->u:Ljava/lang/Thread;

    .line 12
    .line 13
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "load:"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LB0/n$d;->p:LB0/n$e;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lg0/F;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 44
    .line 45
    .line 46
    :try_start_3
    iget-object v1, p0, LB0/n$d;->p:LB0/n$e;

    .line 47
    .line 48
    invoke-interface {v1}, LB0/n$e;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_4
    invoke-static {}, Lg0/F;->b()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :catch_1
    move-exception v1

    .line 58
    goto :goto_2

    .line 59
    :catch_2
    move-exception v1

    .line 60
    goto :goto_5

    .line 61
    :catch_3
    move-exception v1

    .line 62
    goto :goto_6

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    invoke-static {}, Lg0/F;->b()V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_0
    :goto_0
    monitor-enter p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    const/4 v1, 0x0

    .line 70
    :try_start_5
    iput-object v1, p0, LB0/n$d;->u:Ljava/lang/Thread;

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 73
    .line 74
    .line 75
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 76
    :try_start_6
    iget-boolean v1, p0, LB0/n$d;->w:Z

    .line 77
    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_7

    .line 85
    :catchall_1
    move-exception v1

    .line 86
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 87
    :try_start_8
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    .line 88
    :catchall_2
    move-exception v1

    .line 89
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 90
    :try_start_a
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    .line 91
    :goto_1
    iget-boolean v1, p0, LB0/n$d;->w:Z

    .line 92
    .line 93
    if-nez v1, :cond_1

    .line 94
    .line 95
    const-string v1, "LoadTask"

    .line 96
    .line 97
    const-string v2, "Unexpected error loading stream"

    .line 98
    .line 99
    invoke-static {v1, v2, v0}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    const/4 v1, 0x4

    .line 103
    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 108
    .line 109
    .line 110
    :cond_1
    throw v0

    .line 111
    :goto_2
    iget-boolean v2, p0, LB0/n$d;->w:Z

    .line 112
    .line 113
    if-nez v2, :cond_2

    .line 114
    .line 115
    const-string v2, "LoadTask"

    .line 116
    .line 117
    const-string v3, "OutOfMemory error loading stream"

    .line 118
    .line 119
    invoke-static {v2, v3, v1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, LB0/n$h;

    .line 123
    .line 124
    invoke-direct {v2, v1}, LB0/n$h;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    invoke-virtual {p0, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_4
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 132
    .line 133
    .line 134
    goto :goto_7

    .line 135
    :goto_5
    iget-boolean v2, p0, LB0/n$d;->w:Z

    .line 136
    .line 137
    if-nez v2, :cond_2

    .line 138
    .line 139
    const-string v2, "LoadTask"

    .line 140
    .line 141
    const-string v3, "Unexpected exception loading stream"

    .line 142
    .line 143
    invoke-static {v2, v3, v1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    new-instance v2, LB0/n$h;

    .line 147
    .line 148
    invoke-direct {v2, v1}, LB0/n$h;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :goto_6
    iget-boolean v2, p0, LB0/n$d;->w:Z

    .line 153
    .line 154
    if-nez v2, :cond_2

    .line 155
    .line 156
    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_4

    .line 161
    :cond_2
    :goto_7
    return-void
.end method

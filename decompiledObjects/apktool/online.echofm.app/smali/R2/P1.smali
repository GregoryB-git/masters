.class public final LR2/P1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LR2/N1;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public volatile g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/P1;->h:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LR2/N1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LR2/P1;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LR2/P1;->f:Ljava/lang/Object;

    iput-object v0, p0, LR2/P1;->g:Ljava/lang/Object;

    iput-object p1, p0, LR2/P1;->a:Ljava/lang/String;

    iput-object p2, p0, LR2/P1;->c:Ljava/lang/Object;

    iput-object p3, p0, LR2/P1;->d:Ljava/lang/Object;

    iput-object p4, p0, LR2/P1;->b:LR2/N1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LR2/N1;LR2/O1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LR2/P1;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LR2/N1;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LR2/P1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object p1, LR2/M1;->a:LR2/f;

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, LR2/P1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    sget-object p1, LR2/P1;->h:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter p1

    .line 18
    :try_start_1
    invoke-static {}, LR2/f;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, LR2/P1;->g:Ljava/lang/Object;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, LR2/P1;->c:Ljava/lang/Object;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    iget-object v0, p0, LR2/P1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    :goto_0
    monitor-exit p1

    .line 36
    return-object v0

    .line 37
    :cond_3
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    invoke-static {}, LR2/K;->z0()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, LR2/P1;

    .line 57
    .line 58
    invoke-static {}, LR2/f;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v1
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    :try_start_3
    iget-object v2, v0, LR2/P1;->b:LR2/N1;

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-interface {v2}, LR2/N1;->a()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1

    .line 73
    :catch_0
    :cond_4
    :try_start_4
    sget-object v2, LR2/P1;->h:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v2
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1

    .line 76
    :try_start_5
    iput-object v1, v0, LR2/P1;->g:Ljava/lang/Object;

    .line 77
    .line 78
    monitor-exit v2

    .line 79
    goto :goto_1

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 82
    :try_start_6
    throw p1

    .line 83
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string v0, "Refreshing flag cache must be done on a worker thread."

    .line 86
    .line 87
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1

    .line 91
    :catch_1
    :cond_6
    iget-object p1, p0, LR2/P1;->b:LR2/N1;

    .line 92
    .line 93
    if-nez p1, :cond_7

    .line 94
    .line 95
    iget-object p1, p0, LR2/P1;->c:Ljava/lang/Object;

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_7
    :try_start_7
    invoke-interface {p1}, LR2/N1;->a()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_2

    .line 102
    return-object p1

    .line 103
    :catch_2
    iget-object p1, p0, LR2/P1;->c:Ljava/lang/Object;

    .line 104
    .line 105
    return-object p1

    .line 106
    :catch_3
    iget-object p1, p0, LR2/P1;->c:Ljava/lang/Object;

    .line 107
    .line 108
    return-object p1

    .line 109
    :goto_2
    :try_start_8
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 110
    throw v0

    .line 111
    :catchall_2
    move-exception p1

    .line 112
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 113
    throw p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/P1;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

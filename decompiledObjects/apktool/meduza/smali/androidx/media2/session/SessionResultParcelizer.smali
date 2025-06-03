.class public final Landroidx/media2/session/SessionResultParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/SessionResult;
    .locals 4

    new-instance v0, Landroidx/media2/session/SessionResult;

    invoke-direct {v0}, Landroidx/media2/session/SessionResult;-><init>()V

    iget v1, v0, Landroidx/media2/session/SessionResult;->a:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/SessionResult;->a:I

    iget-wide v1, v0, Landroidx/media2/session/SessionResult;->b:J

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/media2/session/SessionResult;->b:J

    iget-object v1, v0, Landroidx/media2/session/SessionResult;->c:Landroid/os/Bundle;

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Landroidx/media2/session/SessionResult;->c:Landroid/os/Bundle;

    iget-object v1, v0, Landroidx/media2/session/SessionResult;->e:Landroidx/media2/common/MediaItem;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    move-result-object p0

    check-cast p0, Landroidx/media2/common/MediaItem;

    iput-object p0, v0, Landroidx/media2/session/SessionResult;->e:Landroidx/media2/common/MediaItem;

    iput-object p0, v0, Landroidx/media2/session/SessionResult;->d:Landroidx/media2/common/MediaItem;

    return-object v0
.end method

.method public static write(Landroidx/media2/session/SessionResult;Lb2/c;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media2/session/SessionResult;->d:Landroidx/media2/common/MediaItem;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/SessionResult;->e:Landroidx/media2/common/MediaItem;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media2/session/SessionResult;->d:Landroidx/media2/common/MediaItem;

    .line 14
    .line 15
    invoke-static {v1}, Landroidx/media2/session/a;->a(Landroidx/media2/common/MediaItem;)Landroidx/media2/common/MediaItem;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Landroidx/media2/session/SessionResult;->e:Landroidx/media2/common/MediaItem;

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
    iget v0, p0, Landroidx/media2/session/SessionResult;->a:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 30
    .line 31
    .line 32
    iget-wide v0, p0, Landroidx/media2/session/SessionResult;->b:J

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media2/session/SessionResult;->c:Landroid/os/Bundle;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    invoke-virtual {p1, v1, v0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Landroidx/media2/session/SessionResult;->e:Landroidx/media2/common/MediaItem;

    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    invoke-virtual {p1, p0, v0}, Lb2/c;->R(Lb2/e;I)V

    .line 48
    .line 49
    .line 50
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

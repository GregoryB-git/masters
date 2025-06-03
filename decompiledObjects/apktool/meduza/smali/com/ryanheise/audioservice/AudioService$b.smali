.class public final Lcom/ryanheise/audioservice/AudioService$b;
.super Landroid/support/v4/media/session/MediaSessionCompat$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic f:Lcom/ryanheise/audioservice/AudioService;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A0(I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "shuffleMode"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v2, "setShuffleMode"

    .line 29
    .line 30
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method public final B0()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "skipToNext"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final C0()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "skipToPrevious"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final D0(J)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "index"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x1

    .line 21
    aput-object p1, v1, p2

    .line 22
    .line 23
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x0

    .line 28
    const-string v1, "skipToQueueItem"

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method public final E(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "mediaItem"

    .line 23
    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->b(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object p1, v1, v2

    .line 32
    .line 33
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v1, 0x0

    .line 38
    const-string v2, "addQueueItem"

    .line 39
    .line 40
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public final E0()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "stop"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final H(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "mediaItem"

    .line 23
    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->b(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object p1, v1, v2

    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    const-string v2, "index"

    .line 35
    .line 36
    aput-object v2, v1, p1

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x3

    .line 43
    aput-object p1, v1, p2

    .line 44
    .line 45
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 p2, 0x0

    .line 50
    const-string v1, "insertQueueItem"

    .line 51
    .line 52
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final O(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "com.ryanheise.audioservice.action.STOP"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 17
    .line 18
    check-cast p1, Lcom/ryanheise/audioservice/b$c;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-array p2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const-string v0, "stop"

    .line 30
    .line 31
    invoke-virtual {p1, v0, p2, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "com.ryanheise.audioservice.action.FAST_FORWARD"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 44
    .line 45
    check-cast p1, Lcom/ryanheise/audioservice/b$c;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-array p2, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string v0, "fastForward"

    .line 57
    .line 58
    invoke-virtual {p1, v0, p2, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const-string v0, "com.ryanheise.audioservice.action.REWIND"

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    sget-object p1, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 71
    .line 72
    check-cast p1, Lcom/ryanheise/audioservice/b$c;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-array p2, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v0, "rewind"

    .line 84
    .line 85
    invoke-virtual {p1, v0, p2, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 90
    .line 91
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x4

    .line 97
    new-array v3, v3, [Ljava/lang/Object;

    .line 98
    .line 99
    const-string v4, "name"

    .line 100
    .line 101
    aput-object v4, v3, v2

    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    aput-object p1, v3, v2

    .line 105
    .line 106
    const/4 p1, 0x2

    .line 107
    const-string v2, "extras"

    .line 108
    .line 109
    aput-object v2, v3, p1

    .line 110
    .line 111
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const/4 p2, 0x3

    .line 116
    aput-object p1, v3, p2

    .line 117
    .line 118
    invoke-static {v3}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p2, "customAction"

    .line 123
    .line 124
    invoke-virtual {v0, p2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
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
.end method

.method public final P()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "fastForward"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final Q(Landroid/content/Intent;)Z
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/view/KeyEvent;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v0, :cond_6

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v3, 0x4f

    .line 31
    .line 32
    if-eq v0, v3, :cond_2

    .line 33
    .line 34
    const/16 v4, 0x82

    .line 35
    .line 36
    if-eq v0, v4, :cond_1

    .line 37
    .line 38
    const/16 v4, 0x7e

    .line 39
    .line 40
    if-eq v0, v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x7f

    .line 43
    .line 44
    if-eq v0, v4, :cond_2

    .line 45
    .line 46
    packed-switch v0, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :pswitch_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$b;->V()V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$b;->P()V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :pswitch_2
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$b;->t0()V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :pswitch_3
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$b;->E0()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$b;->U()V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    :pswitch_4
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const/4 v4, 0x2

    .line 77
    if-eq p1, v3, :cond_5

    .line 78
    .line 79
    const/16 v3, 0x55

    .line 80
    .line 81
    if-eq p1, v3, :cond_5

    .line 82
    .line 83
    const/16 v3, 0x57

    .line 84
    .line 85
    if-eq p1, v3, :cond_4

    .line 86
    .line 87
    const/16 v3, 0x58

    .line 88
    .line 89
    if-eq p1, v3, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    const/4 p1, 0x3

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move p1, v4

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    :goto_0
    move p1, v2

    .line 97
    :goto_1
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-array v3, v4, [Ljava/lang/Object;

    .line 103
    .line 104
    const-string v4, "button"

    .line 105
    .line 106
    aput-object v4, v3, v1

    .line 107
    .line 108
    invoke-static {p1}, Lq0/g;->c(I)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    aput-object p1, v3, v2

    .line 117
    .line 118
    invoke-static {v3}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/4 v1, 0x0

    .line 123
    const-string v3, "click"

    .line 124
    .line 125
    invoke-virtual {v0, v3, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    :goto_2
    return v2

    .line 129
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final U()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "pause"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final V()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "play"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final f0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "mediaId"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    aput-object p1, v1, v2

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    const-string v2, "extras"

    .line 21
    .line 22
    aput-object v2, v1, p1

    .line 23
    .line 24
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x3

    .line 29
    aput-object p1, v1, p2

    .line 30
    .line 31
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 p2, 0x0

    .line 36
    const-string v1, "playFromMediaId"

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method public final h0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "query"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    aput-object p1, v1, v2

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    const-string v2, "extras"

    .line 21
    .line 22
    aput-object v2, v1, p1

    .line 23
    .line 24
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x3

    .line 29
    aput-object p1, v1, p2

    .line 30
    .line 31
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 p2, 0x0

    .line 36
    const-string v1, "playFromSearch"

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method public final j0(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "uri"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    const-string v2, "extras"

    .line 25
    .line 26
    aput-object v2, v1, p1

    .line 27
    .line 28
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x3

    .line 33
    aput-object p1, v1, p2

    .line 34
    .line 35
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x0

    .line 40
    const-string v1, "playFromUri"

    .line 41
    .line 42
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 43
    .line 44
    .line 45
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

.method public final n0()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 25
    .line 26
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x0

    .line 39
    const-string v3, "prepare"

    .line 40
    .line 41
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method public final o0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 25
    .line 26
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "mediaId"

    .line 36
    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    aput-object p1, v2, v1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    const-string v1, "extras"

    .line 43
    .line 44
    aput-object v1, v2, p1

    .line 45
    .line 46
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x3

    .line 51
    aput-object p1, v2, p2

    .line 52
    .line 53
    invoke-static {v2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p2, 0x0

    .line 58
    const-string v1, "prepareFromMediaId"

    .line 59
    .line 60
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 61
    .line 62
    .line 63
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

.method public final q0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 25
    .line 26
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "query"

    .line 36
    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    aput-object p1, v2, v1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    const-string v1, "extras"

    .line 43
    .line 44
    aput-object v1, v2, p1

    .line 45
    .line 46
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x3

    .line 51
    aput-object p1, v2, p2

    .line 52
    .line 53
    invoke-static {v2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p2, 0x0

    .line 58
    const-string v1, "prepareFromSearch"

    .line 59
    .line 60
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 61
    .line 62
    .line 63
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

.method public final r0(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$b;->f:Lcom/ryanheise/audioservice/AudioService;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/ryanheise/audioservice/AudioService;->r:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->e(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 25
    .line 26
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "uri"

    .line 36
    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    aput-object p1, v2, v1

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    const-string v1, "extras"

    .line 47
    .line 48
    aput-object v1, v2, p1

    .line 49
    .line 50
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 p2, 0x3

    .line 55
    aput-object p1, v2, p2

    .line 56
    .line 57
    invoke-static {v2}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 p2, 0x0

    .line 62
    const-string v1, "prepareFromUri"

    .line 63
    .line 64
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final s0(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p1, Landroid/support/v4/media/MediaDescriptionCompat;->a:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->J:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 15
    .line 16
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "mediaItem"

    .line 23
    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->b(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object p1, v1, v2

    .line 32
    .line 33
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v1, 0x0

    .line 38
    const-string v2, "removeQueueItem"

    .line 39
    .line 40
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public final t0()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "rewind"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public final u0(J)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "position"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const-wide/16 v2, 0x3e8

    .line 17
    .line 18
    mul-long/2addr p1, v2

    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x1

    .line 24
    aput-object p1, v1, p2

    .line 25
    .line 26
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 p2, 0x0

    .line 31
    const-string v1, "seek"

    .line 32
    .line 33
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 34
    .line 35
    .line 36
    return-void
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
.end method

.method public final v0(Z)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "enabled"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v2, "setCaptioningEnabled"

    .line 29
    .line 30
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method public final w0(F)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "speed"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v2, "setSpeed"

    .line 29
    .line 30
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method public final x0(Landroid/support/v4/media/RatingCompat;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "rating"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->n(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    const-string v2, "extras"

    .line 25
    .line 26
    aput-object v2, v1, p1

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    const/4 v2, 0x0

    .line 30
    aput-object v2, v1, p1

    .line 31
    .line 32
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v1, "setRating"

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1, v2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method public final y0(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "rating"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->n(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    const-string v2, "extras"

    .line 25
    .line 26
    aput-object v2, v1, p1

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    invoke-static {p2}, Lcom/ryanheise/audioservice/b;->e(Landroid/os/Bundle;)Ljava/util/HashMap;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    aput-object p2, v1, p1

    .line 34
    .line 35
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x0

    .line 40
    const-string v1, "setRating"

    .line 41
    .line 42
    invoke-virtual {v0, v1, p1, p2}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 43
    .line 44
    .line 45
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

.method public final z0(I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->H:Lcom/ryanheise/audioservice/AudioService$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, Lcom/ryanheise/audioservice/b$c;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "repeatMode"

    .line 13
    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object p1, v1, v2

    .line 22
    .line 23
    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->k([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v2, "setRepeatMode"

    .line 29
    .line 30
    invoke-virtual {v0, v2, p1, v1}, Lcom/ryanheise/audioservice/b$c;->a(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

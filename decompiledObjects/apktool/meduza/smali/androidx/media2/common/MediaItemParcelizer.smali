.class public final Landroidx/media2/common/MediaItemParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/common/MediaItem;
    .locals 4

    new-instance v0, Landroidx/media2/common/MediaItem;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem;-><init>()V

    iget-object v1, v0, Landroidx/media2/common/MediaItem;->b:Landroidx/media2/common/MediaMetadata;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    move-result-object v1

    check-cast v1, Landroidx/media2/common/MediaMetadata;

    iput-object v1, v0, Landroidx/media2/common/MediaItem;->b:Landroidx/media2/common/MediaMetadata;

    iget-wide v1, v0, Landroidx/media2/common/MediaItem;->c:J

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/media2/common/MediaItem;->c:J

    iget-wide v1, v0, Landroidx/media2/common/MediaItem;->d:J

    const/4 v3, 0x3

    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/media2/common/MediaItem;->d:J

    return-object v0
.end method

.method public static write(Landroidx/media2/common/MediaItem;Lb2/c;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-class v1, Landroidx/media2/common/MediaItem;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media2/common/MediaItem;->b:Landroidx/media2/common/MediaMetadata;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p1, v0, v1}, Lb2/c;->R(Lb2/e;I)V

    .line 16
    .line 17
    .line 18
    iget-wide v0, p0, Landroidx/media2/common/MediaItem;->c:J

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    .line 22
    .line 23
    .line 24
    iget-wide v0, p0, Landroidx/media2/common/MediaItem;->d:J

    .line 25
    .line 26
    const/4 p0, 0x3

    .line 27
    invoke-virtual {p1, p0, v0, v1}, Lb2/c;->J(IJ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    const-string p1, "MediaItem\'s subclasses shouldn\'t be parcelized."

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0
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
.end method

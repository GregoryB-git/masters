.class public final Lt0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/media/MediaCodecInfo$CodecCapabilities;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, p0, Lt0/p;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lt0/p;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lt0/p;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 17
    .line 18
    iput-boolean p5, p0, Lt0/p;->h:Z

    .line 19
    .line 20
    iput-boolean p6, p0, Lt0/p;->i:Z

    .line 21
    .line 22
    iput-boolean p7, p0, Lt0/p;->j:Z

    .line 23
    .line 24
    iput-boolean p8, p0, Lt0/p;->e:Z

    .line 25
    .line 26
    iput-boolean p9, p0, Lt0/p;->f:Z

    .line 27
    .line 28
    iput-boolean p10, p0, Lt0/p;->g:Z

    .line 29
    .line 30
    invoke-static {p2}, Ld0/z;->s(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, Lt0/p;->k:Z

    .line 35
    .line 36
    return-void
.end method

.method public static A(Ljava/lang/String;I)Z
    .locals 1

    .line 1
    const-string v0, "video/hevc"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    sget-object p0, Lg0/M;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string p1, "sailfish"

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const-string p1, "marlin"

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    :goto_0
    return p0
.end method

.method public static B(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "mcv5a"

    .line 10
    .line 11
    sget-object v0, Lg0/M;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lt0/p;
    .locals 12

    .line 1
    new-instance v11, Lt0/p;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez p7, :cond_0

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-static {p3}, Lt0/p;->h(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lt0/p;->z(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v8, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v8, v0

    .line 24
    :goto_0
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-static {p3}, Lt0/p;->s(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    move v9, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v9, v0

    .line 35
    :goto_1
    if-nez p8, :cond_3

    .line 36
    .line 37
    if-eqz p3, :cond_2

    .line 38
    .line 39
    invoke-static {p3}, Lt0/p;->q(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move v10, v0

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    :goto_2
    move v10, v1

    .line 49
    :goto_3
    move-object v0, v11

    .line 50
    move-object v1, p0

    .line 51
    move-object v2, p1

    .line 52
    move-object v3, p2

    .line 53
    move-object v4, p3

    .line 54
    move/from16 v5, p4

    .line 55
    .line 56
    move/from16 v6, p5

    .line 57
    .line 58
    move/from16 v7, p6

    .line 59
    .line 60
    invoke-direct/range {v0 .. v10}, Lt0/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZZ)V

    .line 61
    .line 62
    .line 63
    return-object v11
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt p2, v0, :cond_4

    .line 3
    .line 4
    sget v0, Lg0/M;->a:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    const-string v0, "audio/mpeg"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    const-string v0, "audio/3gpp"

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_4

    .line 29
    .line 30
    const-string v0, "audio/amr-wb"

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_4

    .line 37
    .line 38
    const-string v0, "audio/mp4a-latm"

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    const-string v0, "audio/vorbis"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    const-string v0, "audio/opus"

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    const-string v0, "audio/raw"

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    const-string v0, "audio/flac"

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    const-string v0, "audio/g711-alaw"

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    const-string v0, "audio/g711-mlaw"

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    const-string v0, "audio/gsm"

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const-string v0, "audio/ac3"

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    const/4 p1, 0x6

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    const-string v0, "audio/eac3"

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    const/16 p1, 0x10

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    const/16 p1, 0x1e

    .line 125
    .line 126
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "AssumedMaxChannelAdjustment: "

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p0, ", ["

    .line 140
    .line 141
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string p0, " to "

    .line 148
    .line 149
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p0, "]"

    .line 156
    .line 157
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string p2, "MediaCodecInfo"

    .line 165
    .line 166
    invoke-static {p2, p0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return p1

    .line 170
    :cond_4
    :goto_1
    return p2
.end method

.method public static c(Landroid/media/MediaCodecInfo$VideoCapabilities;II)Landroid/graphics/Point;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    new-instance v1, Landroid/graphics/Point;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lg0/M;->k(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    mul-int/2addr p1, v0

    .line 16
    invoke-static {p2, p0}, Lg0/M;->k(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    mul-int/2addr p2, p0

    .line 21
    invoke-direct {v1, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public static d(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Lt0/p;->c(Landroid/media/MediaCodecInfo$VideoCapabilities;II)Landroid/graphics/Point;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 8
    .line 9
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 10
    .line 11
    cmpl-double v0, p3, v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 16
    .line 17
    cmpg-double v0, p3, v0

    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p3

    .line 26
    invoke-virtual {p0, p2, p1, p3, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities;->areSizeAndRateSupported(IID)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p0, p2, p1}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public static f(Landroid/media/MediaCodecInfo$CodecCapabilities;)[Landroid/media/MediaCodecInfo$CodecProfileLevel;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p0, v1

    .line 27
    :goto_0
    const v2, 0xaba9500

    .line 28
    .line 29
    .line 30
    if-lt p0, v2, :cond_1

    .line 31
    .line 32
    const/16 p0, 0x400

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const v2, 0x7270e00

    .line 36
    .line 37
    .line 38
    if-lt p0, v2, :cond_2

    .line 39
    .line 40
    const/16 p0, 0x200

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const v2, 0x3938700

    .line 44
    .line 45
    .line 46
    if-lt p0, v2, :cond_3

    .line 47
    .line 48
    const/16 p0, 0x100

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    const v2, 0x1c9c380

    .line 52
    .line 53
    .line 54
    if-lt p0, v2, :cond_4

    .line 55
    .line 56
    const/16 p0, 0x80

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    const v2, 0x112a880

    .line 60
    .line 61
    .line 62
    if-lt p0, v2, :cond_5

    .line 63
    .line 64
    const/16 p0, 0x40

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    const v2, 0xb71b00

    .line 68
    .line 69
    .line 70
    if-lt p0, v2, :cond_6

    .line 71
    .line 72
    const/16 p0, 0x20

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_6
    const v2, 0x6ddd00

    .line 76
    .line 77
    .line 78
    if-lt p0, v2, :cond_7

    .line 79
    .line 80
    const/16 p0, 0x10

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_7
    const v2, 0x36ee80

    .line 84
    .line 85
    .line 86
    if-lt p0, v2, :cond_8

    .line 87
    .line 88
    const/16 p0, 0x8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    const v2, 0x1b7740

    .line 92
    .line 93
    .line 94
    if-lt p0, v2, :cond_9

    .line 95
    .line 96
    const/4 p0, 0x4

    .line 97
    goto :goto_1

    .line 98
    :cond_9
    const v2, 0xc3500

    .line 99
    .line 100
    .line 101
    if-lt p0, v2, :cond_a

    .line 102
    .line 103
    const/4 p0, 0x2

    .line 104
    goto :goto_1

    .line 105
    :cond_a
    move p0, v0

    .line 106
    :goto_1
    new-instance v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 107
    .line 108
    invoke-direct {v2}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 109
    .line 110
    .line 111
    iput v0, v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 112
    .line 113
    iput p0, v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 114
    .line 115
    new-array p0, v0, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 116
    .line 117
    aput-object v2, p0, v1

    .line 118
    .line 119
    return-object p0
.end method

.method public static h(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 1

    .line 1
    const-string v0, "adaptive-playback"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static q(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lt0/p;->r(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    return p0
.end method

.method public static r(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 1

    .line 1
    const-string v0, "secure-playback"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static s(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lt0/p;->t(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    return p0
.end method

.method public static t(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 1

    .line 1
    const-string v0, "tunneled-playback"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static x(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "audio/opus"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static y(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lg0/M;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "SM-T230"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    return p0
.end method

.method public static z(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    sget-object v0, Lg0/M;->d:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "ODROID-XU3"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "Nexus 10"

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    :cond_0
    const-string v0, "OMX.Exynos.AVC.Decoder"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "OMX.Exynos.AVC.Decoder.secure"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    :cond_1
    const/4 p0, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    :goto_0
    return p0
.end method


# virtual methods
.method public b(II)Landroid/graphics/Point;
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    invoke-static {v0, p1, p2}, Lt0/p;->c(Landroid/media/MediaCodecInfo$VideoCapabilities;II)Landroid/graphics/Point;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public e(Ld0/q;Ld0/q;)Lk0/p;
    .locals 13

    .line 1
    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, Ld0/q;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-boolean v1, p0, Lt0/p;->k:Z

    .line 16
    .line 17
    if-eqz v1, :cond_9

    .line 18
    .line 19
    iget v1, p1, Ld0/q;->w:I

    .line 20
    .line 21
    iget v2, p2, Ld0/q;->w:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    or-int/lit16 v0, v0, 0x400

    .line 26
    .line 27
    :cond_1
    iget-boolean v1, p0, Lt0/p;->e:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    iget v1, p1, Ld0/q;->t:I

    .line 32
    .line 33
    iget v2, p2, Ld0/q;->t:I

    .line 34
    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    iget v1, p1, Ld0/q;->u:I

    .line 38
    .line 39
    iget v2, p2, Ld0/q;->u:I

    .line 40
    .line 41
    if-eq v1, v2, :cond_3

    .line 42
    .line 43
    :cond_2
    or-int/lit16 v0, v0, 0x200

    .line 44
    .line 45
    :cond_3
    iget-object v1, p1, Ld0/q;->A:Ld0/h;

    .line 46
    .line 47
    invoke-static {v1}, Ld0/h;->h(Ld0/h;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    iget-object v1, p2, Ld0/q;->A:Ld0/h;

    .line 54
    .line 55
    invoke-static {v1}, Ld0/h;->h(Ld0/h;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_5

    .line 60
    .line 61
    :cond_4
    iget-object v1, p1, Ld0/q;->A:Ld0/h;

    .line 62
    .line 63
    iget-object v2, p2, Ld0/q;->A:Ld0/h;

    .line 64
    .line 65
    invoke-static {v1, v2}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    or-int/lit16 v0, v0, 0x800

    .line 72
    .line 73
    :cond_5
    iget-object v1, p0, Lt0/p;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1}, Lt0/p;->y(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ld0/q;->e(Ld0/q;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_6

    .line 86
    .line 87
    or-int/lit8 v0, v0, 0x2

    .line 88
    .line 89
    :cond_6
    if-nez v0, :cond_8

    .line 90
    .line 91
    new-instance v0, Lk0/p;

    .line 92
    .line 93
    iget-object v2, p0, Lt0/p;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Ld0/q;->e(Ld0/q;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    const/4 v1, 0x3

    .line 102
    :goto_1
    move v5, v1

    .line 103
    goto :goto_2

    .line 104
    :cond_7
    const/4 v1, 0x2

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    const/4 v6, 0x0

    .line 107
    move-object v1, v0

    .line 108
    move-object v3, p1

    .line 109
    move-object v4, p2

    .line 110
    invoke-direct/range {v1 .. v6}, Lk0/p;-><init>(Ljava/lang/String;Ld0/q;Ld0/q;II)V

    .line 111
    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_8
    move v12, v0

    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_9
    iget v1, p1, Ld0/q;->B:I

    .line 118
    .line 119
    iget v2, p2, Ld0/q;->B:I

    .line 120
    .line 121
    if-eq v1, v2, :cond_a

    .line 122
    .line 123
    or-int/lit16 v0, v0, 0x1000

    .line 124
    .line 125
    :cond_a
    iget v1, p1, Ld0/q;->C:I

    .line 126
    .line 127
    iget v2, p2, Ld0/q;->C:I

    .line 128
    .line 129
    if-eq v1, v2, :cond_b

    .line 130
    .line 131
    or-int/lit16 v0, v0, 0x2000

    .line 132
    .line 133
    :cond_b
    iget v1, p1, Ld0/q;->D:I

    .line 134
    .line 135
    iget v2, p2, Ld0/q;->D:I

    .line 136
    .line 137
    if-eq v1, v2, :cond_c

    .line 138
    .line 139
    or-int/lit16 v0, v0, 0x4000

    .line 140
    .line 141
    :cond_c
    if-nez v0, :cond_d

    .line 142
    .line 143
    const-string v1, "audio/mp4a-latm"

    .line 144
    .line 145
    iget-object v2, p0, Lt0/p;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_d

    .line 152
    .line 153
    invoke-static {p1}, Lt0/I;->r(Ld0/q;)Landroid/util/Pair;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {p2}, Lt0/I;->r(Ld0/q;)Landroid/util/Pair;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v1, :cond_d

    .line 162
    .line 163
    if-eqz v2, :cond_d

    .line 164
    .line 165
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    const/16 v3, 0x2a

    .line 182
    .line 183
    if-ne v1, v3, :cond_d

    .line 184
    .line 185
    if-ne v2, v3, :cond_d

    .line 186
    .line 187
    new-instance v0, Lk0/p;

    .line 188
    .line 189
    iget-object v5, p0, Lt0/p;->a:Ljava/lang/String;

    .line 190
    .line 191
    const/4 v8, 0x3

    .line 192
    const/4 v9, 0x0

    .line 193
    move-object v4, v0

    .line 194
    move-object v6, p1

    .line 195
    move-object v7, p2

    .line 196
    invoke-direct/range {v4 .. v9}, Lk0/p;-><init>(Ljava/lang/String;Ld0/q;Ld0/q;II)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_d
    invoke-virtual {p1, p2}, Ld0/q;->e(Ld0/q;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_e

    .line 205
    .line 206
    or-int/lit8 v0, v0, 0x20

    .line 207
    .line 208
    :cond_e
    iget-object v1, p0, Lt0/p;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v1}, Lt0/p;->x(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_f

    .line 215
    .line 216
    or-int/lit8 v0, v0, 0x2

    .line 217
    .line 218
    :cond_f
    if-nez v0, :cond_8

    .line 219
    .line 220
    new-instance v0, Lk0/p;

    .line 221
    .line 222
    iget-object v2, p0, Lt0/p;->a:Ljava/lang/String;

    .line 223
    .line 224
    const/4 v5, 0x1

    .line 225
    const/4 v6, 0x0

    .line 226
    move-object v1, v0

    .line 227
    move-object v3, p1

    .line 228
    move-object v4, p2

    .line 229
    invoke-direct/range {v1 .. v6}, Lk0/p;-><init>(Ljava/lang/String;Ld0/q;Ld0/q;II)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :goto_3
    new-instance v0, Lk0/p;

    .line 234
    .line 235
    iget-object v8, p0, Lt0/p;->a:Ljava/lang/String;

    .line 236
    .line 237
    const/4 v11, 0x0

    .line 238
    move-object v7, v0

    .line 239
    move-object v9, p1

    .line 240
    move-object v10, p2

    .line 241
    invoke-direct/range {v7 .. v12}, Lk0/p;-><init>(Ljava/lang/String;Ld0/q;Ld0/q;II)V

    .line 242
    .line 243
    .line 244
    return-object v0
.end method

.method public g()[Landroid/media/MediaCodecInfo$CodecProfileLevel;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 11
    .line 12
    :cond_1
    return-object v0
.end method

.method public i(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p1, "channelCount.caps"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lt0/p;->w(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string p1, "channelCount.aCaps"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v2, p0, Lt0/p;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, Lt0/p;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v2, v3, v0}, Lt0/p;->a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ge v0, p1, :cond_2

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "channelCount.support, "

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p1, 0x1

    .line 54
    return p1
.end method

.method public j(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p1, "sampleRate.caps"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lt0/p;->w(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string p1, "sampleRate.aCaps"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0, p1}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "sampleRate.support, "

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public final k(Ld0/q;Z)Z
    .locals 9

    .line 1
    invoke-static {p1}, Lt0/I;->r(Ld0/q;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v3, p1, Ld0/q;->n:Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "video/dolby-vision"

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    const-string v3, "video/avc"

    .line 37
    .line 38
    iget-object v5, p0, Lt0/p;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    :goto_0
    move v0, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v3, "video/hevc"

    .line 51
    .line 52
    iget-object v5, p0, Lt0/p;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :goto_1
    iget-boolean v3, p0, Lt0/p;->k:Z

    .line 63
    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    const/16 v3, 0x2a

    .line 67
    .line 68
    if-eq v2, v3, :cond_3

    .line 69
    .line 70
    return v1

    .line 71
    :cond_3
    invoke-virtual {p0}, Lt0/p;->g()[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget v5, Lg0/M;->a:I

    .line 76
    .line 77
    const/16 v6, 0x17

    .line 78
    .line 79
    if-gt v5, v6, :cond_4

    .line 80
    .line 81
    const-string v5, "video/x-vnd.on2.vp9"

    .line 82
    .line 83
    iget-object v6, p0, Lt0/p;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    array-length v5, v3

    .line 92
    if-nez v5, :cond_4

    .line 93
    .line 94
    iget-object v3, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 95
    .line 96
    invoke-static {v3}, Lt0/p;->f(Landroid/media/MediaCodecInfo$CodecCapabilities;)[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :cond_4
    array-length v5, v3

    .line 101
    move v6, v4

    .line 102
    :goto_2
    if-ge v6, v5, :cond_7

    .line 103
    .line 104
    aget-object v7, v3, v6

    .line 105
    .line 106
    iget v8, v7, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 107
    .line 108
    if-ne v8, v2, :cond_6

    .line 109
    .line 110
    iget v7, v7, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 111
    .line 112
    if-ge v7, v0, :cond_5

    .line 113
    .line 114
    if-nez p2, :cond_6

    .line 115
    .line 116
    :cond_5
    iget-object v7, p0, Lt0/p;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v7, v2}, Lt0/p;->A(Ljava/lang/String;I)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_6

    .line 123
    .line 124
    return v1

    .line 125
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v0, "codec.profileLevel, "

    .line 134
    .line 135
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object p1, p1, Ld0/q;->j:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string p1, ", "

    .line 144
    .line 145
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lt0/p;->c:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0, p1}, Lt0/p;->w(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return v4
.end method

.method public l(Ld0/q;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lt0/p;->o(Ld0/q;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, v1}, Lt0/p;->k(Ld0/q;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    :cond_0
    return v1
.end method

.method public m(Ld0/q;)Z
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lt0/p;->o(Ld0/q;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, p1, v0}, Lt0/p;->k(Ld0/q;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-boolean v2, p0, Lt0/p;->k:Z

    .line 18
    .line 19
    const/16 v3, 0x15

    .line 20
    .line 21
    if-eqz v2, :cond_7

    .line 22
    .line 23
    iget v2, p1, Ld0/q;->t:I

    .line 24
    .line 25
    if-lez v2, :cond_6

    .line 26
    .line 27
    iget v4, p1, Ld0/q;->u:I

    .line 28
    .line 29
    if-gtz v4, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget v5, Lg0/M;->a:I

    .line 33
    .line 34
    if-lt v5, v3, :cond_3

    .line 35
    .line 36
    iget p1, p1, Ld0/q;->v:F

    .line 37
    .line 38
    float-to-double v0, p1

    .line 39
    invoke-virtual {p0, v2, v4, v0, v1}, Lt0/p;->u(IID)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_3
    mul-int/2addr v2, v4

    .line 45
    invoke-static {}, Lt0/I;->P()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-gt v2, v3, :cond_4

    .line 50
    .line 51
    move v1, v0

    .line 52
    :cond_4
    if-nez v1, :cond_5

    .line 53
    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "legacyFrameSize, "

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v2, p1, Ld0/q;->t:I

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, "x"

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget p1, p1, Ld0/q;->u:I

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Lt0/p;->w(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    return v1

    .line 87
    :cond_6
    :goto_0
    return v0

    .line 88
    :cond_7
    sget v2, Lg0/M;->a:I

    .line 89
    .line 90
    if-lt v2, v3, :cond_9

    .line 91
    .line 92
    iget v2, p1, Ld0/q;->C:I

    .line 93
    .line 94
    const/4 v3, -0x1

    .line 95
    if-eq v2, v3, :cond_8

    .line 96
    .line 97
    invoke-virtual {p0, v2}, Lt0/p;->j(I)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_a

    .line 102
    .line 103
    :cond_8
    iget p1, p1, Ld0/q;->B:I

    .line 104
    .line 105
    if-eq p1, v3, :cond_9

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lt0/p;->i(I)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_a

    .line 112
    .line 113
    :cond_9
    move v1, v0

    .line 114
    :cond_a
    return v1
.end method

.method public n()Z
    .locals 6

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    const-string v0, "video/x-vnd.on2.vp9"

    .line 9
    .line 10
    iget-object v1, p0, Lt0/p;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lt0/p;->g()[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    array-length v1, v0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    iget v4, v4, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 29
    .line 30
    const/16 v5, 0x4000

    .line 31
    .line 32
    if-ne v4, v5, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return v2
.end method

.method public final o(Ld0/q;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/p;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Ld0/q;->n:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lt0/p;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, Lt0/I;->m(Ld0/q;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    return p1
.end method

.method public p(Ld0/q;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt0/p;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lt0/p;->e:Z

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-static {p1}, Lt0/I;->r(Ld0/q;)Landroid/util/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v0, 0x2a

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/p;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(IID)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/p;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p1, "sizeAndRate.caps"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lt0/p;->w(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string p1, "sizeAndRate.vCaps"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget v2, Lg0/M;->a:I

    .line 22
    .line 23
    const/16 v3, 0x1d

    .line 24
    .line 25
    const-string v4, "@"

    .line 26
    .line 27
    const-string v5, "x"

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-lt v2, v3, :cond_3

    .line 31
    .line 32
    invoke-static {v0, p1, p2, p3, p4}, Lt0/v;->c(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x2

    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    return v6

    .line 40
    :cond_2
    if-ne v2, v6, :cond_3

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v2, "sizeAndRate.cover, "

    .line 48
    .line 49
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {v0, p1, p2, p3, p4}, Lt0/p;->d(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    if-ge p1, p2, :cond_5

    .line 79
    .line 80
    iget-object v2, p0, Lt0/p;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2}, Lt0/p;->B(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-static {v0, p2, p1, p3, p4}, Lt0/p;->d(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v1, "sizeAndRate.rotated, "

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Lt0/p;->v(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "sizeAndRate.support, "

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    :goto_3
    return v6
.end method

.method public final v(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "AssumedSupport ["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "] ["

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lt0/p;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lt0/p;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object p1, Lg0/M;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, "]"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "MediaCodecInfo"

    .line 52
    .line 53
    invoke-static {v0, p1}, Lg0/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "NoSupport ["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "] ["

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lt0/p;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lt0/p;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object p1, Lg0/M;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, "]"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "MediaCodecInfo"

    .line 52
    .line 53
    invoke-static {v0, p1}, Lg0/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

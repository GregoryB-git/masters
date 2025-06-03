.class public Lk5/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk5/E$a;
    }
.end annotation


# static fields
.field public static c:Lk5/E$a;


# instance fields
.field public a:LE5/c;

.field public b:LE5/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;LE5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lk5/E;->c:Lk5/E$a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lk5/E$a;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lk5/E$a;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lk5/E;->c:Lk5/E$a;

    .line 14
    .line 15
    :cond_0
    iput-object p2, p0, Lk5/E;->a:LE5/c;

    .line 16
    .line 17
    new-instance p1, LE5/k;

    .line 18
    .line 19
    const-string v0, "com.ryanheise.android_audio_manager"

    .line 20
    .line 21
    invoke-direct {p1, p2, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lk5/E;->b:LE5/k;

    .line 25
    .line 26
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lk5/E$a;->c(Lk5/E;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lk5/E;->b:LE5/k;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, LE5/k;->e(LE5/k$c;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static a(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lk5/b;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    float-to-double v1, v1

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lk5/c;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    float-to-double v1, v1

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lk5/d;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    float-to-double v1, p0

    .line 35
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static c(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;
    .locals 13

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lk5/a;->a(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->isSource()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getSampleRates()[I

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelMasks()[I

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelIndexMasks()[I

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelCounts()[I

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getEncodings()[I

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const/16 v10, 0x16

    .line 70
    .line 71
    new-array v10, v10, [Ljava/lang/Object;

    .line 72
    .line 73
    const-string v11, "id"

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    aput-object v11, v10, v12

    .line 77
    .line 78
    const/4 v11, 0x1

    .line 79
    aput-object v1, v10, v11

    .line 80
    .line 81
    const-string v1, "productName"

    .line 82
    .line 83
    const/4 v11, 0x2

    .line 84
    aput-object v1, v10, v11

    .line 85
    .line 86
    const/4 v1, 0x3

    .line 87
    aput-object v2, v10, v1

    .line 88
    .line 89
    const-string v1, "address"

    .line 90
    .line 91
    const/4 v2, 0x4

    .line 92
    aput-object v1, v10, v2

    .line 93
    .line 94
    const/4 v1, 0x5

    .line 95
    aput-object v0, v10, v1

    .line 96
    .line 97
    const-string v0, "isSource"

    .line 98
    .line 99
    const/4 v1, 0x6

    .line 100
    aput-object v0, v10, v1

    .line 101
    .line 102
    const/4 v0, 0x7

    .line 103
    aput-object v3, v10, v0

    .line 104
    .line 105
    const-string v0, "isSink"

    .line 106
    .line 107
    const/16 v1, 0x8

    .line 108
    .line 109
    aput-object v0, v10, v1

    .line 110
    .line 111
    const/16 v0, 0x9

    .line 112
    .line 113
    aput-object v4, v10, v0

    .line 114
    .line 115
    const-string v0, "sampleRates"

    .line 116
    .line 117
    const/16 v1, 0xa

    .line 118
    .line 119
    aput-object v0, v10, v1

    .line 120
    .line 121
    const/16 v0, 0xb

    .line 122
    .line 123
    aput-object v5, v10, v0

    .line 124
    .line 125
    const-string v0, "channelMasks"

    .line 126
    .line 127
    const/16 v1, 0xc

    .line 128
    .line 129
    aput-object v0, v10, v1

    .line 130
    .line 131
    const/16 v0, 0xd

    .line 132
    .line 133
    aput-object v6, v10, v0

    .line 134
    .line 135
    const-string v0, "channelIndexMasks"

    .line 136
    .line 137
    const/16 v1, 0xe

    .line 138
    .line 139
    aput-object v0, v10, v1

    .line 140
    .line 141
    const/16 v0, 0xf

    .line 142
    .line 143
    aput-object v7, v10, v0

    .line 144
    .line 145
    const-string v0, "channelCounts"

    .line 146
    .line 147
    const/16 v1, 0x10

    .line 148
    .line 149
    aput-object v0, v10, v1

    .line 150
    .line 151
    const/16 v0, 0x11

    .line 152
    .line 153
    aput-object v8, v10, v0

    .line 154
    .line 155
    const-string v0, "encodings"

    .line 156
    .line 157
    const/16 v1, 0x12

    .line 158
    .line 159
    aput-object v0, v10, v1

    .line 160
    .line 161
    const/16 v0, 0x13

    .line 162
    .line 163
    aput-object v9, v10, v0

    .line 164
    .line 165
    const-string v0, "type"

    .line 166
    .line 167
    const/16 v1, 0x14

    .line 168
    .line 169
    aput-object v0, v10, v1

    .line 170
    .line 171
    const/16 v0, 0x15

    .line 172
    .line 173
    aput-object p0, v10, v0

    .line 174
    .line 175
    invoke-static {v10}, Lk5/E;->g([Ljava/lang/Object;)Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0
.end method

.method public static d([Landroid/media/AudioDeviceInfo;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    invoke-static {v3}, Lk5/E;->c(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v0, p0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 21
    .line 22
    :goto_1
    return-object p0
.end method

.method public static f([I)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget v2, p0, v1

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static varargs g([Ljava/lang/Object;)Ljava/util/Map;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    aget-object v3, p0, v3

    .line 17
    .line 18
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method

.method public static h(I)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    if-lt v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Requires API level "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/E;->b:LE5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lk5/E;->c:Lk5/E$a;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lk5/E$a;->P(Lk5/E;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lk5/E;->c:Lk5/E$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lk5/E$a;->D()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lk5/E;->c:Lk5/E$a;

    .line 21
    .line 22
    invoke-virtual {v0}, Lk5/E$a;->j()V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lk5/E;->c:Lk5/E$a;

    .line 26
    .line 27
    :cond_0
    iput-object v1, p0, Lk5/E;->b:LE5/k;

    .line 28
    .line 29
    iput-object v1, p0, Lk5/E;->a:LE5/c;

    .line 30
    .line 31
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p1, LE5/j;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object p1, p1, LE5/j;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "generateAudioSessionId"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x21

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :sswitch_1
    const-string v1, "isVolumeFixed"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "setMode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1e

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "getAvailableCommunicationDevices"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xf

    goto/16 :goto_1

    :sswitch_4
    const-string v1, "playSoundEffect"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x24

    goto/16 :goto_1

    :sswitch_5
    const-string v1, "setRingerMode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto/16 :goto_1

    :sswitch_6
    const-string v1, "unloadSoundEffects"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x26

    goto/16 :goto_1

    :sswitch_7
    const-string v1, "abandonAudioFocus"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v3

    goto/16 :goto_1

    :sswitch_8
    const-string v1, "adjustSuggestedStreamVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto/16 :goto_1

    :sswitch_9
    const-string v1, "clearCommunicationDevice"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x12

    goto/16 :goto_1

    :sswitch_a
    const-string v1, "setStreamVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xd

    goto/16 :goto_1

    :sswitch_b
    const-string v1, "getAllowedCapturePolicy"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x16

    goto/16 :goto_1

    :sswitch_c
    const-string v1, "getProperty"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x27

    goto/16 :goto_1

    :sswitch_d
    const-string v1, "isStreamMute"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xe

    goto/16 :goto_1

    :sswitch_e
    const-string v1, "adjustVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto/16 :goto_1

    :sswitch_f
    const-string v1, "setParameters"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x22

    goto/16 :goto_1

    :sswitch_10
    const-string v1, "getRingerMode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto/16 :goto_1

    :sswitch_11
    const-string v1, "isBluetoothScoAvailableOffCall"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x17

    goto/16 :goto_1

    :sswitch_12
    const-string v1, "getStreamVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto/16 :goto_1

    :sswitch_13
    const-string v1, "stopBluetoothSco"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x19

    goto/16 :goto_1

    :sswitch_14
    const-string v1, "getParameters"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x23

    goto/16 :goto_1

    :sswitch_15
    const-string v1, "dispatchMediaKeyEvent"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto/16 :goto_1

    :sswitch_16
    const-string v1, "getMode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1f

    goto/16 :goto_1

    :sswitch_17
    const-string v1, "getStreamVolumeDb"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto/16 :goto_1

    :sswitch_18
    const-string v1, "setCommunicationDevice"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    goto/16 :goto_1

    :sswitch_19
    const-string v1, "startBluetoothSco"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto/16 :goto_1

    :sswitch_1a
    const-string v1, "isMusicActive"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto/16 :goto_1

    :sswitch_1b
    const-string v1, "loadSoundEffects"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x25

    goto/16 :goto_1

    :sswitch_1c
    const-string v1, "getStreamMinVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_1d
    const-string v1, "setBluetoothScoOn"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1a

    goto/16 :goto_1

    :sswitch_1e
    const-string v1, "setAllowedCapturePolicy"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x15

    goto/16 :goto_1

    :sswitch_1f
    const-string v1, "getMicrophones"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x29

    goto/16 :goto_1

    :sswitch_20
    const-string v1, "adjustStreamVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto/16 :goto_1

    :sswitch_21
    const-string v1, "isBluetoothScoOn"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1b

    goto/16 :goto_1

    :sswitch_22
    const-string v1, "setSpeakerphoneOn"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x13

    goto :goto_1

    :sswitch_23
    const-string v1, "setMicrophoneMute"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1c

    goto :goto_1

    :sswitch_24
    const-string v1, "requestAudioFocus"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v4

    goto :goto_1

    :sswitch_25
    const-string v1, "isHapticPlaybackSupported"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x2a

    goto :goto_1

    :sswitch_26
    const-string v1, "isSpeakerphoneOn"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x14

    goto :goto_1

    :sswitch_27
    const-string v1, "getStreamMaxVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_28
    const-string v1, "isMicrophoneMute"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1d

    goto :goto_1

    :sswitch_29
    const-string v1, "getDevices"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x28

    goto :goto_1

    :sswitch_2a
    const-string v1, "getCommunicationDevice"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x11

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    invoke-interface {p2}, LE5/k$d;->c()V

    goto/16 :goto_4

    :pswitch_0
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->E()Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->q()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_2
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->p(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_3
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lk5/E$a;->t(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_4
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->c0()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_5
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->L()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_6
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {p1, v1, v0}, Lk5/E$a;->M(ILjava/lang/Double;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_7
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lk5/E$a;->s(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_8
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lk5/E$a;->W(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_9
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_a
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->G()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_b
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->r()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_c
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->V(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_d
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->F()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_e
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->U(Z)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_f
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->C()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_10
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->S(Z)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_11
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->b0()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_12
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->a0()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_13
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->B()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_14
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->m()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_15
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->R(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_16
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->H()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_17
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->Y(Z)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_18
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->g()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_19
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->o()Ljava/util/Map;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1a
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lk5/E$a;->T(Ljava/lang/Integer;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1b
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->n()Ljava/util/List;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1c
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->I(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1d
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v3, v0}, Lk5/E$a;->Z(III)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1e
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->X(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_1f
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v3, v0}, Lk5/E$a;->y(III)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_20
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->x(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_21
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->w(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_22
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lk5/E$a;->v(I)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_23
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->u()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_24
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v3, v0}, Lk5/E$a;->e(III)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_25
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lk5/E$a;->f(II)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_26
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v3, v0}, Lk5/E$a;->d(III)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_27
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->J()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_28
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lk5/E$a;->i(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_29
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1}, Lk5/E$a;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_2a
    sget-object p1, Lk5/E;->c:Lk5/E$a;

    invoke-virtual {p1, v0}, Lk5/E$a;->Q(Ljava/util/List;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x68d7016a -> :sswitch_2a
        -0x653a1759 -> :sswitch_29
        -0x641dbdd3 -> :sswitch_28
        -0x5e4f1038 -> :sswitch_27
        -0x5d286128 -> :sswitch_26
        -0x5adb498e -> :sswitch_25
        -0x59af196f -> :sswitch_24
        -0x543b109b -> :sswitch_23
        -0x4d45b3f0 -> :sswitch_22
        -0x4c9a73e6 -> :sswitch_21
        -0x4759d017 -> :sswitch_20
        -0x410d2cad -> :sswitch_1f
        -0x4054a92e -> :sswitch_1e
        -0x3cb7c6ae -> :sswitch_1d
        -0x3043f9ca -> :sswitch_1c
        -0x2d824707 -> :sswitch_1b
        -0x2963f9ff -> :sswitch_1a
        -0x22a10fed -> :sswitch_19
        -0x1a9241f6 -> :sswitch_18
        -0x16b26e32 -> :sswitch_17
        -0x47d5de7 -> :sswitch_16
        0x9153925 -> :sswitch_15
        0x99879e0 -> :sswitch_14
        0xb21c3b3 -> :sswitch_13
        0x107e1530 -> :sswitch_12
        0x1bf5d05f -> :sswitch_11
        0x252e5a16 -> :sswitch_10
        0x37bcc7ec -> :sswitch_f
        0x38dee389 -> :sswitch_e
        0x3a315283 -> :sswitch_d
        0x40a81b4b -> :sswitch_c
        0x455827c6 -> :sswitch_b
        0x46c7103c -> :sswitch_a
        0x49fcee3f -> :sswitch_9
        0x4afd9d2e -> :sswitch_8
        0x50e69af7 -> :sswitch_7
        0x52277592 -> :sswitch_6
        0x5352a822 -> :sswitch_5
        0x59acfbac -> :sswitch_4
        0x5da380da -> :sswitch_3
        0x764d6925 -> :sswitch_2
        0x766c0cf0 -> :sswitch_1
        0x7ccf63f0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

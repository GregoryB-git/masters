.class public abstract Lk0/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/content/Context;[Landroid/media/AudioDeviceInfo;)Z
    .locals 8

    .line 1
    invoke-static {p0}, Lg0/M;->F0(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    array-length p0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, p0, :cond_8

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v5, 0x8

    .line 21
    .line 22
    if-eq v4, v5, :cond_7

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x5

    .line 29
    if-eq v4, v5, :cond_7

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x6

    .line 36
    if-eq v4, v5, :cond_7

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/16 v5, 0xb

    .line 43
    .line 44
    if-eq v4, v5, :cond_7

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x4

    .line 51
    if-eq v4, v5, :cond_7

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/4 v5, 0x3

    .line 58
    if-ne v4, v5, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    sget v4, Lg0/M;->a:I

    .line 62
    .line 63
    const/16 v5, 0x1a

    .line 64
    .line 65
    if-lt v4, v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/16 v7, 0x16

    .line 72
    .line 73
    if-ne v6, v7, :cond_2

    .line 74
    .line 75
    return v0

    .line 76
    :cond_2
    const/16 v6, 0x1c

    .line 77
    .line 78
    if-lt v4, v6, :cond_3

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    const/16 v7, 0x17

    .line 85
    .line 86
    if-ne v6, v7, :cond_3

    .line 87
    .line 88
    return v0

    .line 89
    :cond_3
    const/16 v6, 0x1f

    .line 90
    .line 91
    if-lt v4, v6, :cond_5

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eq v6, v5, :cond_4

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    const/16 v6, 0x1b

    .line 104
    .line 105
    if-ne v5, v6, :cond_5

    .line 106
    .line 107
    :cond_4
    return v0

    .line 108
    :cond_5
    const/16 v5, 0x21

    .line 109
    .line 110
    if-lt v4, v5, :cond_6

    .line 111
    .line 112
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    const/16 v4, 0x1e

    .line 117
    .line 118
    if-ne v3, v4, :cond_6

    .line 119
    .line 120
    return v0

    .line 121
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    :goto_1
    return v0

    .line 125
    :cond_8
    return v1
.end method

.method public static b(Landroid/media/AudioManager;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

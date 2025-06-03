.class public final Lsa/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsa/e$a;
    }
.end annotation


# static fields
.field public static c:Lsa/e$a;


# instance fields
.field public a:Lio/flutter/plugin/common/BinaryMessenger;

.field public b:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsa/e;->c:Lsa/e$a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lsa/e$a;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lsa/e$a;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lsa/e;->c:Lsa/e$a;

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Lsa/e;->a:Lio/flutter/plugin/common/BinaryMessenger;

    .line 16
    .line 17
    new-instance p2, Lio/flutter/plugin/common/MethodChannel;

    .line 18
    .line 19
    const-string v0, "com.ryanheise.android_audio_manager"

    .line 20
    .line 21
    invoke-direct {p2, p1, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lsa/e;->b:Lio/flutter/plugin/common/MethodChannel;

    .line 25
    .line 26
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 27
    .line 28
    iget-object p1, p1, Lsa/e$a;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lsa/e;->b:Lio/flutter/plugin/common/MethodChannel;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public static a(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/MicrophoneInfo$Coordinate3F;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->x:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->y:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p0, p0, Landroid/media/MicrophoneInfo$Coordinate3F;->z:F

    float-to-double v1, p0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static b([I)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static varargs c([Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static d(I)V
    .locals 2

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
    const-string v1, "Requires API level "

    .line 9
    .line 10
    invoke-static {v1, p0}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
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
.end method


# virtual methods
.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/util/List;

    .line 5
    .line 6
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x17

    .line 14
    .line 15
    const/16 v5, 0x11

    .line 16
    .line 17
    const/16 v6, 0x1c

    .line 18
    .line 19
    const/16 v7, 0x15

    .line 20
    .line 21
    const/16 v8, 0x1d

    .line 22
    .line 23
    const/4 v9, 0x2

    .line 24
    const/16 v10, 0x1f

    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    const/4 v12, 0x0

    .line 28
    sparse-switch v3, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_0
    const-string v3, "generateAudioSessionId"

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const/16 v2, 0x21

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :sswitch_1
    const-string v3, "isVolumeFixed"

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_2
    const-string v3, "setMode"

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_0

    .line 63
    .line 64
    const/16 v2, 0x1e

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :sswitch_3
    const-string v3, "getAvailableCommunicationDevices"

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    const/16 v2, 0xf

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :sswitch_4
    const-string v3, "playSoundEffect"

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_0

    .line 87
    .line 88
    const/16 v2, 0x24

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :sswitch_5
    const-string v3, "setRingerMode"

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_0

    .line 99
    .line 100
    const/16 v2, 0xc

    .line 101
    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :sswitch_6
    const-string v3, "unloadSoundEffects"

    .line 105
    .line 106
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_0

    .line 111
    .line 112
    const/16 v2, 0x26

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :sswitch_7
    const-string v3, "abandonAudioFocus"

    .line 117
    .line 118
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_0

    .line 123
    .line 124
    move v2, v11

    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_8
    const-string v3, "adjustSuggestedStreamVolume"

    .line 128
    .line 129
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_0

    .line 134
    .line 135
    const/4 v2, 0x6

    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :sswitch_9
    const-string v3, "clearCommunicationDevice"

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_0

    .line 145
    .line 146
    const/16 v2, 0x12

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :sswitch_a
    const-string v3, "setStreamVolume"

    .line 151
    .line 152
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_0

    .line 157
    .line 158
    const/16 v2, 0xd

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :sswitch_b
    const-string v3, "getAllowedCapturePolicy"

    .line 163
    .line 164
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_0

    .line 169
    .line 170
    const/16 v2, 0x16

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :sswitch_c
    const-string v3, "getProperty"

    .line 175
    .line 176
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_0

    .line 181
    .line 182
    const/16 v2, 0x27

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :sswitch_d
    const-string v3, "isStreamMute"

    .line 187
    .line 188
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_0

    .line 193
    .line 194
    const/16 v2, 0xe

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_e
    const-string v3, "adjustVolume"

    .line 199
    .line 200
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_0

    .line 205
    .line 206
    const/4 v2, 0x5

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :sswitch_f
    const-string v3, "setParameters"

    .line 210
    .line 211
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_0

    .line 216
    .line 217
    const/16 v2, 0x22

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :sswitch_10
    const-string v3, "getRingerMode"

    .line 222
    .line 223
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_0

    .line 228
    .line 229
    const/4 v2, 0x7

    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :sswitch_11
    const-string v3, "isBluetoothScoAvailableOffCall"

    .line 233
    .line 234
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_0

    .line 239
    .line 240
    move v2, v4

    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :sswitch_12
    const-string v3, "getStreamVolume"

    .line 244
    .line 245
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_0

    .line 250
    .line 251
    const/16 v2, 0xa

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :sswitch_13
    const-string v3, "stopBluetoothSco"

    .line 256
    .line 257
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_0

    .line 262
    .line 263
    const/16 v2, 0x19

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :sswitch_14
    const-string v3, "getParameters"

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_0

    .line 274
    .line 275
    const/16 v2, 0x23

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :sswitch_15
    const-string v3, "dispatchMediaKeyEvent"

    .line 280
    .line 281
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-eqz p1, :cond_0

    .line 286
    .line 287
    move v2, v9

    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :sswitch_16
    const-string v3, "getMode"

    .line 291
    .line 292
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_0

    .line 297
    .line 298
    move v2, v10

    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :sswitch_17
    const-string v3, "getStreamVolumeDb"

    .line 302
    .line 303
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_0

    .line 308
    .line 309
    const/16 v2, 0xb

    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :sswitch_18
    const-string v3, "setCommunicationDevice"

    .line 314
    .line 315
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    if-eqz p1, :cond_0

    .line 320
    .line 321
    const/16 v2, 0x10

    .line 322
    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :sswitch_19
    const-string v3, "startBluetoothSco"

    .line 326
    .line 327
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-eqz p1, :cond_0

    .line 332
    .line 333
    const/16 v2, 0x18

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :sswitch_1a
    const-string v3, "isMusicActive"

    .line 338
    .line 339
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_0

    .line 344
    .line 345
    const/16 v2, 0x20

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :sswitch_1b
    const-string v3, "loadSoundEffects"

    .line 350
    .line 351
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-eqz p1, :cond_0

    .line 356
    .line 357
    const/16 v2, 0x25

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :sswitch_1c
    const-string v3, "getStreamMinVolume"

    .line 362
    .line 363
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-eqz p1, :cond_0

    .line 368
    .line 369
    const/16 v2, 0x9

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :sswitch_1d
    const-string v3, "setBluetoothScoOn"

    .line 374
    .line 375
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-eqz p1, :cond_0

    .line 380
    .line 381
    const/16 v2, 0x1a

    .line 382
    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :sswitch_1e
    const-string v3, "setAllowedCapturePolicy"

    .line 386
    .line 387
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-eqz p1, :cond_0

    .line 392
    .line 393
    move v2, v7

    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :sswitch_1f
    const-string v3, "getMicrophones"

    .line 397
    .line 398
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    if-eqz p1, :cond_0

    .line 403
    .line 404
    const/16 v2, 0x29

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_20
    const-string v3, "adjustStreamVolume"

    .line 409
    .line 410
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    if-eqz p1, :cond_0

    .line 415
    .line 416
    const/4 v2, 0x4

    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :sswitch_21
    const-string v3, "isBluetoothScoOn"

    .line 420
    .line 421
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    if-eqz p1, :cond_0

    .line 426
    .line 427
    const/16 v2, 0x1b

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :sswitch_22
    const-string v3, "setSpeakerphoneOn"

    .line 432
    .line 433
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_0

    .line 438
    .line 439
    const/16 v2, 0x13

    .line 440
    .line 441
    goto :goto_0

    .line 442
    :sswitch_23
    const-string v3, "setMicrophoneMute"

    .line 443
    .line 444
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    if-eqz p1, :cond_0

    .line 449
    .line 450
    move v2, v6

    .line 451
    goto :goto_0

    .line 452
    :sswitch_24
    const-string v3, "requestAudioFocus"

    .line 453
    .line 454
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    if-eqz p1, :cond_0

    .line 459
    .line 460
    move v2, v12

    .line 461
    goto :goto_0

    .line 462
    :sswitch_25
    const-string v3, "isHapticPlaybackSupported"

    .line 463
    .line 464
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    if-eqz p1, :cond_0

    .line 469
    .line 470
    const/16 v2, 0x2a

    .line 471
    .line 472
    goto :goto_0

    .line 473
    :sswitch_26
    const-string v3, "isSpeakerphoneOn"

    .line 474
    .line 475
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    if-eqz p1, :cond_0

    .line 480
    .line 481
    const/16 v2, 0x14

    .line 482
    .line 483
    goto :goto_0

    .line 484
    :sswitch_27
    const-string v3, "getStreamMaxVolume"

    .line 485
    .line 486
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-eqz p1, :cond_0

    .line 491
    .line 492
    const/16 v2, 0x8

    .line 493
    .line 494
    goto :goto_0

    .line 495
    :sswitch_28
    const-string v3, "isMicrophoneMute"

    .line 496
    .line 497
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    if-eqz p1, :cond_0

    .line 502
    .line 503
    move v2, v8

    .line 504
    goto :goto_0

    .line 505
    :sswitch_29
    const-string v3, "getDevices"

    .line 506
    .line 507
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result p1

    .line 511
    if-eqz p1, :cond_0

    .line 512
    .line 513
    const/16 v2, 0x28

    .line 514
    .line 515
    goto :goto_0

    .line 516
    :sswitch_2a
    const-string v3, "getCommunicationDevice"

    .line 517
    .line 518
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    if-eqz p1, :cond_0

    .line 523
    .line 524
    move v2, v5

    .line 525
    :cond_0
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 526
    .line 527
    .line 528
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 529
    .line 530
    .line 531
    goto/16 :goto_5

    .line 532
    .line 533
    :pswitch_0
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 534
    .line 535
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    invoke-static {v8}, Lsa/e;->d(I)V

    .line 539
    .line 540
    .line 541
    invoke-static {}, Laa/w;->q()Z

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    goto/16 :goto_4

    .line 550
    .line 551
    :pswitch_1
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 552
    .line 553
    invoke-static {p1}, Lsa/e$a;->e(Lsa/e$a;)Ljava/util/ArrayList;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    goto/16 :goto_4

    .line 558
    .line 559
    :pswitch_2
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 560
    .line 561
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    check-cast v1, Ljava/lang/Integer;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    invoke-static {p1, v1}, Lsa/e$a;->d(Lsa/e$a;I)Ljava/util/ArrayList;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    goto/16 :goto_4

    .line 576
    .line 577
    :pswitch_3
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 578
    .line 579
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    check-cast v1, Ljava/lang/String;

    .line 584
    .line 585
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-static {v5}, Lsa/e;->d(I)V

    .line 589
    .line 590
    .line 591
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 592
    .line 593
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    goto/16 :goto_4

    .line 598
    .line 599
    :pswitch_4
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 600
    .line 601
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 602
    .line 603
    invoke-virtual {p1}, Landroid/media/AudioManager;->unloadSoundEffects()V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_2

    .line 607
    .line 608
    :pswitch_5
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 609
    .line 610
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 611
    .line 612
    invoke-virtual {p1}, Landroid/media/AudioManager;->loadSoundEffects()V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_2

    .line 616
    .line 617
    :pswitch_6
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 618
    .line 619
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    check-cast v2, Ljava/lang/Integer;

    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    check-cast v1, Ljava/lang/Double;

    .line 634
    .line 635
    if-eqz v1, :cond_1

    .line 636
    .line 637
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 640
    .line 641
    .line 642
    move-result-wide v3

    .line 643
    double-to-float v1, v3

    .line 644
    invoke-virtual {p1, v2, v1}, Landroid/media/AudioManager;->playSoundEffect(IF)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_2

    .line 648
    .line 649
    :cond_1
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 650
    .line 651
    invoke-virtual {p1, v2}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_2

    .line 655
    .line 656
    :pswitch_7
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 657
    .line 658
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    check-cast v1, Ljava/lang/String;

    .line 663
    .line 664
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 665
    .line 666
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    goto/16 :goto_4

    .line 671
    .line 672
    :pswitch_8
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 673
    .line 674
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    check-cast v1, Ljava/lang/String;

    .line 679
    .line 680
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 681
    .line 682
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setParameters(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    goto/16 :goto_2

    .line 686
    .line 687
    :pswitch_9
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 688
    .line 689
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-static {v7}, Lsa/e;->d(I)V

    .line 693
    .line 694
    .line 695
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 696
    .line 697
    invoke-virtual {p1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 698
    .line 699
    .line 700
    move-result p1

    .line 701
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    goto/16 :goto_4

    .line 706
    .line 707
    :pswitch_a
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 708
    .line 709
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 710
    .line 711
    invoke-virtual {p1}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 712
    .line 713
    .line 714
    move-result p1

    .line 715
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 716
    .line 717
    .line 718
    move-result-object p1

    .line 719
    goto/16 :goto_4

    .line 720
    .line 721
    :pswitch_b
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 722
    .line 723
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 724
    .line 725
    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    .line 726
    .line 727
    .line 728
    move-result p1

    .line 729
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    goto/16 :goto_4

    .line 734
    .line 735
    :pswitch_c
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 736
    .line 737
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    check-cast v1, Ljava/lang/Integer;

    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 744
    .line 745
    .line 746
    move-result v1

    .line 747
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 748
    .line 749
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 750
    .line 751
    .line 752
    goto/16 :goto_2

    .line 753
    .line 754
    :pswitch_d
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 755
    .line 756
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 757
    .line 758
    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 759
    .line 760
    .line 761
    move-result p1

    .line 762
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    goto/16 :goto_4

    .line 767
    .line 768
    :pswitch_e
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 769
    .line 770
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    check-cast v1, Ljava/lang/Boolean;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 781
    .line 782
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_2

    .line 786
    .line 787
    :pswitch_f
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 788
    .line 789
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 790
    .line 791
    invoke-virtual {p1}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 792
    .line 793
    .line 794
    move-result p1

    .line 795
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 796
    .line 797
    .line 798
    move-result-object p1

    .line 799
    goto/16 :goto_4

    .line 800
    .line 801
    :pswitch_10
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 802
    .line 803
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    check-cast v1, Ljava/lang/Boolean;

    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 814
    .line 815
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    .line 816
    .line 817
    .line 818
    goto/16 :goto_2

    .line 819
    .line 820
    :pswitch_11
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 821
    .line 822
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 823
    .line 824
    invoke-virtual {p1}, Landroid/media/AudioManager;->stopBluetoothSco()V

    .line 825
    .line 826
    .line 827
    goto/16 :goto_2

    .line 828
    .line 829
    :pswitch_12
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 830
    .line 831
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 832
    .line 833
    invoke-virtual {p1}, Landroid/media/AudioManager;->startBluetoothSco()V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_2

    .line 837
    .line 838
    :pswitch_13
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 839
    .line 840
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 841
    .line 842
    invoke-virtual {p1}, Landroid/media/AudioManager;->isBluetoothScoAvailableOffCall()Z

    .line 843
    .line 844
    .line 845
    move-result p1

    .line 846
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    goto/16 :goto_4

    .line 851
    .line 852
    :pswitch_14
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 853
    .line 854
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-static {v8}, Lsa/e;->d(I)V

    .line 858
    .line 859
    .line 860
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 861
    .line 862
    invoke-static {p1}, Laa/w;->a(Landroid/media/AudioManager;)I

    .line 863
    .line 864
    .line 865
    move-result p1

    .line 866
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    goto/16 :goto_4

    .line 871
    .line 872
    :pswitch_15
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 873
    .line 874
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Ljava/lang/Integer;

    .line 879
    .line 880
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 881
    .line 882
    .line 883
    move-result v1

    .line 884
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    invoke-static {v8}, Lsa/e;->d(I)V

    .line 888
    .line 889
    .line 890
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 891
    .line 892
    invoke-static {p1, v1}, Laa/u;->j(Landroid/media/AudioManager;I)V

    .line 893
    .line 894
    .line 895
    goto/16 :goto_2

    .line 896
    .line 897
    :pswitch_16
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 898
    .line 899
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 900
    .line 901
    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 902
    .line 903
    .line 904
    move-result p1

    .line 905
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 906
    .line 907
    .line 908
    move-result-object p1

    .line 909
    goto/16 :goto_4

    .line 910
    .line 911
    :pswitch_17
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 912
    .line 913
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    check-cast v1, Ljava/lang/Boolean;

    .line 918
    .line 919
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 924
    .line 925
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 926
    .line 927
    .line 928
    goto/16 :goto_2

    .line 929
    .line 930
    :pswitch_18
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 931
    .line 932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-static {v10}, Lsa/e;->d(I)V

    .line 936
    .line 937
    .line 938
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 939
    .line 940
    invoke-static {p1}, Le0/i0;->d(Landroid/media/AudioManager;)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_2

    .line 944
    .line 945
    :pswitch_19
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 946
    .line 947
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-static {v10}, Lsa/e;->d(I)V

    .line 951
    .line 952
    .line 953
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 954
    .line 955
    invoke-static {p1}, Le0/i0;->a(Landroid/media/AudioManager;)Landroid/media/AudioDeviceInfo;

    .line 956
    .line 957
    .line 958
    move-result-object p1

    .line 959
    invoke-static {p1}, Lsa/e$a;->f(Landroid/media/AudioDeviceInfo;)Ljava/util/HashMap;

    .line 960
    .line 961
    .line 962
    move-result-object p1

    .line 963
    goto/16 :goto_4

    .line 964
    .line 965
    :pswitch_1a
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 966
    .line 967
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    check-cast v1, Ljava/lang/Integer;

    .line 972
    .line 973
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    invoke-static {v10}, Lsa/e;->d(I)V

    .line 977
    .line 978
    .line 979
    iget-object v2, p1, Lsa/e$a;->h:Ljava/util/List;

    .line 980
    .line 981
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 986
    .line 987
    .line 988
    move-result v3

    .line 989
    if-eqz v3, :cond_3

    .line 990
    .line 991
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v3

    .line 995
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 996
    .line 997
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1002
    .line 1003
    .line 1004
    move-result v5

    .line 1005
    if-ne v4, v5, :cond_2

    .line 1006
    .line 1007
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1008
    .line 1009
    invoke-static {p1, v3}, La4/r;->i(Landroid/media/AudioManager;Landroid/media/AudioDeviceInfo;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v12

    .line 1013
    :cond_3
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1014
    .line 1015
    .line 1016
    move-result-object p1

    .line 1017
    goto/16 :goto_4

    .line 1018
    .line 1019
    :pswitch_1b
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1020
    .line 1021
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v10}, Lsa/e;->d(I)V

    .line 1025
    .line 1026
    .line 1027
    iget-object v1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1028
    .line 1029
    invoke-static {v1}, Le0/h0;->f(Landroid/media/AudioManager;)Ljava/util/List;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    iput-object v1, p1, Lsa/e$a;->h:Ljava/util/List;

    .line 1034
    .line 1035
    new-instance v1, Ljava/util/ArrayList;

    .line 1036
    .line 1037
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1038
    .line 1039
    .line 1040
    iget-object p1, p1, Lsa/e$a;->h:Ljava/util/List;

    .line 1041
    .line 1042
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1043
    .line 1044
    .line 1045
    move-result-object p1

    .line 1046
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1047
    .line 1048
    .line 1049
    move-result v2

    .line 1050
    if-eqz v2, :cond_4

    .line 1051
    .line 1052
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 1057
    .line 1058
    invoke-static {v2}, Lsa/e$a;->f(Landroid/media/AudioDeviceInfo;)Ljava/util/HashMap;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    goto :goto_1

    .line 1066
    :cond_4
    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    goto/16 :goto_5

    .line 1070
    .line 1071
    :pswitch_1c
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1072
    .line 1073
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    check-cast v1, Ljava/lang/Integer;

    .line 1078
    .line 1079
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1080
    .line 1081
    .line 1082
    move-result v1

    .line 1083
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v4}, Lsa/e;->d(I)V

    .line 1087
    .line 1088
    .line 1089
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1090
    .line 1091
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 1092
    .line 1093
    .line 1094
    move-result p1

    .line 1095
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1096
    .line 1097
    .line 1098
    move-result-object p1

    .line 1099
    goto/16 :goto_4

    .line 1100
    .line 1101
    :pswitch_1d
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1102
    .line 1103
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    check-cast v2, Ljava/lang/Integer;

    .line 1108
    .line 1109
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1110
    .line 1111
    .line 1112
    move-result v2

    .line 1113
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v3

    .line 1117
    check-cast v3, Ljava/lang/Integer;

    .line 1118
    .line 1119
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    check-cast v1, Ljava/lang/Integer;

    .line 1128
    .line 1129
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1130
    .line 1131
    .line 1132
    move-result v1

    .line 1133
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1134
    .line 1135
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 1136
    .line 1137
    .line 1138
    goto/16 :goto_2

    .line 1139
    .line 1140
    :pswitch_1e
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1141
    .line 1142
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    check-cast v1, Ljava/lang/Integer;

    .line 1147
    .line 1148
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1149
    .line 1150
    .line 1151
    move-result v1

    .line 1152
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1153
    .line 1154
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setRingerMode(I)V

    .line 1155
    .line 1156
    .line 1157
    goto/16 :goto_2

    .line 1158
    .line 1159
    :pswitch_1f
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1160
    .line 1161
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    check-cast v2, Ljava/lang/Integer;

    .line 1166
    .line 1167
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1168
    .line 1169
    .line 1170
    move-result v2

    .line 1171
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v3

    .line 1175
    check-cast v3, Ljava/lang/Integer;

    .line 1176
    .line 1177
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1178
    .line 1179
    .line 1180
    move-result v3

    .line 1181
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v1

    .line 1185
    check-cast v1, Ljava/lang/Integer;

    .line 1186
    .line 1187
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1188
    .line 1189
    .line 1190
    move-result v1

    .line 1191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1192
    .line 1193
    .line 1194
    invoke-static {v6}, Lsa/e;->d(I)V

    .line 1195
    .line 1196
    .line 1197
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1198
    .line 1199
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/recaptcha/internal/a;->a(Landroid/media/AudioManager;III)F

    .line 1200
    .line 1201
    .line 1202
    move-result p1

    .line 1203
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1204
    .line 1205
    .line 1206
    move-result-object p1

    .line 1207
    goto/16 :goto_4

    .line 1208
    .line 1209
    :pswitch_20
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1210
    .line 1211
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    check-cast v1, Ljava/lang/Integer;

    .line 1216
    .line 1217
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1218
    .line 1219
    .line 1220
    move-result v1

    .line 1221
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1222
    .line 1223
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 1224
    .line 1225
    .line 1226
    move-result p1

    .line 1227
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1228
    .line 1229
    .line 1230
    move-result-object p1

    .line 1231
    goto/16 :goto_4

    .line 1232
    .line 1233
    :pswitch_21
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1234
    .line 1235
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    check-cast v1, Ljava/lang/Integer;

    .line 1240
    .line 1241
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1242
    .line 1243
    .line 1244
    move-result v1

    .line 1245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    invoke-static {v6}, Lsa/e;->d(I)V

    .line 1249
    .line 1250
    .line 1251
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1252
    .line 1253
    invoke-static {p1, v1}, Lcom/google/android/recaptcha/internal/a;->c(Landroid/media/AudioManager;I)I

    .line 1254
    .line 1255
    .line 1256
    move-result p1

    .line 1257
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1258
    .line 1259
    .line 1260
    move-result-object p1

    .line 1261
    goto/16 :goto_4

    .line 1262
    .line 1263
    :pswitch_22
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1264
    .line 1265
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    check-cast v1, Ljava/lang/Integer;

    .line 1270
    .line 1271
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1272
    .line 1273
    .line 1274
    move-result v1

    .line 1275
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1276
    .line 1277
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 1278
    .line 1279
    .line 1280
    move-result p1

    .line 1281
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object p1

    .line 1285
    goto/16 :goto_4

    .line 1286
    .line 1287
    :pswitch_23
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1288
    .line 1289
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1290
    .line 1291
    invoke-virtual {p1}, Landroid/media/AudioManager;->getRingerMode()I

    .line 1292
    .line 1293
    .line 1294
    move-result p1

    .line 1295
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1296
    .line 1297
    .line 1298
    move-result-object p1

    .line 1299
    goto/16 :goto_4

    .line 1300
    .line 1301
    :pswitch_24
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1302
    .line 1303
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    check-cast v2, Ljava/lang/Integer;

    .line 1308
    .line 1309
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1310
    .line 1311
    .line 1312
    move-result v2

    .line 1313
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v3

    .line 1317
    check-cast v3, Ljava/lang/Integer;

    .line 1318
    .line 1319
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1320
    .line 1321
    .line 1322
    move-result v3

    .line 1323
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    check-cast v1, Ljava/lang/Integer;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1330
    .line 1331
    .line 1332
    move-result v1

    .line 1333
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1334
    .line 1335
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_2

    .line 1339
    :pswitch_25
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1340
    .line 1341
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    check-cast v2, Ljava/lang/Integer;

    .line 1346
    .line 1347
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1348
    .line 1349
    .line 1350
    move-result v2

    .line 1351
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v1

    .line 1355
    check-cast v1, Ljava/lang/Integer;

    .line 1356
    .line 1357
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1358
    .line 1359
    .line 1360
    move-result v1

    .line 1361
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1362
    .line 1363
    invoke-virtual {p1, v2, v1}, Landroid/media/AudioManager;->adjustVolume(II)V

    .line 1364
    .line 1365
    .line 1366
    goto :goto_2

    .line 1367
    :pswitch_26
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1368
    .line 1369
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v2

    .line 1373
    check-cast v2, Ljava/lang/Integer;

    .line 1374
    .line 1375
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1376
    .line 1377
    .line 1378
    move-result v2

    .line 1379
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v3

    .line 1383
    check-cast v3, Ljava/lang/Integer;

    .line 1384
    .line 1385
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v1

    .line 1393
    check-cast v1, Ljava/lang/Integer;

    .line 1394
    .line 1395
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1396
    .line 1397
    .line 1398
    move-result v1

    .line 1399
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1400
    .line 1401
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 1402
    .line 1403
    .line 1404
    goto :goto_2

    .line 1405
    :pswitch_27
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1406
    .line 1407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v7}, Lsa/e;->d(I)V

    .line 1411
    .line 1412
    .line 1413
    iget-object p1, p1, Lsa/e$a;->f:Landroid/media/AudioManager;

    .line 1414
    .line 1415
    invoke-virtual {p1}, Landroid/media/AudioManager;->isVolumeFixed()Z

    .line 1416
    .line 1417
    .line 1418
    move-result p1

    .line 1419
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1420
    .line 1421
    .line 1422
    move-result-object p1

    .line 1423
    goto :goto_4

    .line 1424
    :pswitch_28
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1425
    .line 1426
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v1

    .line 1430
    check-cast v1, Ljava/util/Map;

    .line 1431
    .line 1432
    invoke-static {p1, v1}, Lsa/e$a;->c(Lsa/e$a;Ljava/util/Map;)V

    .line 1433
    .line 1434
    .line 1435
    :goto_2
    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1436
    .line 1437
    .line 1438
    goto :goto_5

    .line 1439
    :pswitch_29
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1440
    .line 1441
    invoke-virtual {p1}, Lsa/e$a;->a()Z

    .line 1442
    .line 1443
    .line 1444
    move-result p1

    .line 1445
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1446
    .line 1447
    .line 1448
    move-result-object p1

    .line 1449
    goto :goto_4

    .line 1450
    :pswitch_2a
    sget-object p1, Lsa/e;->c:Lsa/e$a;

    .line 1451
    .line 1452
    invoke-static {p1, v1}, Lsa/e$a;->b(Lsa/e$a;Ljava/util/List;)Z

    .line 1453
    .line 1454
    .line 1455
    move-result p1

    .line 1456
    goto :goto_3

    .line 1457
    :goto_4
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1458
    .line 1459
    .line 1460
    goto :goto_5

    .line 1461
    :catch_0
    move-exception p1

    .line 1462
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1463
    .line 1464
    .line 1465
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1466
    .line 1467
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1468
    .line 1469
    .line 1470
    const-string v2, "Error: "

    .line 1471
    .line 1472
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object p1

    .line 1482
    invoke-interface {p2, p1, v0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1483
    .line 1484
    .line 1485
    :goto_5
    return-void

    .line 1486
    nop

    .line 1487
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

    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
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
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

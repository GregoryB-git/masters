.class public final Lg5/b$d;
.super Lg5/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public e:Lv3/i0;


# direct methods
.method public constructor <init>(Lg5/b$a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "QualityLevel"

    invoke-direct {p0, p1, p2, v0}, Lg5/b$a;-><init>(Lg5/b$a;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static m(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_e

    .line 11
    .line 12
    sget v1, Lv5/e0;->a:I

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    new-array v2, v1, [B

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    const/4 v5, 0x4

    .line 25
    const/4 v6, 0x1

    .line 26
    if-ge v4, v1, :cond_0

    .line 27
    .line 28
    mul-int/lit8 v7, v4, 0x2

    .line 29
    .line 30
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/16 v9, 0x10

    .line 35
    .line 36
    invoke-static {v8, v9}, Ljava/lang/Character;->digit(CI)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    shl-int/lit8 v5, v8, 0x4

    .line 41
    .line 42
    add-int/2addr v7, v6

    .line 43
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-static {v6, v9}, Ljava/lang/Character;->digit(CI)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    add-int/2addr v6, v5

    .line 52
    int-to-byte v5, v6

    .line 53
    aput-byte v5, v2, v4

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    add-int/lit8 p0, v1, 0x0

    .line 59
    .line 60
    if-gt p0, v5, :cond_1

    .line 61
    .line 62
    :goto_1
    move p0, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_1
    move p0, v3

    .line 65
    :goto_2
    sget-object v4, Lb/a0;->f0:[B

    .line 66
    .line 67
    if-ge p0, v5, :cond_3

    .line 68
    .line 69
    add-int v7, v3, p0

    .line 70
    .line 71
    aget-byte v7, v2, v7

    .line 72
    .line 73
    aget-byte v4, v4, p0

    .line 74
    .line 75
    if-eq v7, v4, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move p0, v6

    .line 82
    :goto_3
    if-nez p0, :cond_4

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    goto/16 :goto_b

    .line 86
    .line 87
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    move v4, v3

    .line 93
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    add-int/2addr v4, v5

    .line 101
    add-int/lit8 v7, v1, -0x4

    .line 102
    .line 103
    :goto_4
    const/4 v8, -0x1

    .line 104
    if-gt v4, v7, :cond_a

    .line 105
    .line 106
    sub-int v9, v1, v4

    .line 107
    .line 108
    if-gt v9, v5, :cond_6

    .line 109
    .line 110
    :goto_5
    move v9, v3

    .line 111
    goto :goto_7

    .line 112
    :cond_6
    move v9, v3

    .line 113
    :goto_6
    sget-object v10, Lb/a0;->f0:[B

    .line 114
    .line 115
    if-ge v9, v5, :cond_8

    .line 116
    .line 117
    add-int v11, v4, v9

    .line 118
    .line 119
    aget-byte v11, v2, v11

    .line 120
    .line 121
    aget-byte v10, v10, v9

    .line 122
    .line 123
    if-eq v11, v10, :cond_7

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    move v9, v6

    .line 130
    :goto_7
    if-eqz v9, :cond_9

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_a
    move v4, v8

    .line 137
    :goto_8
    if-ne v4, v8, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    new-array v4, v4, [[B

    .line 144
    .line 145
    move v5, v3

    .line 146
    :goto_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-ge v5, v6, :cond_c

    .line 151
    .line 152
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    add-int/2addr v7, v8

    .line 167
    if-ge v5, v7, :cond_b

    .line 168
    .line 169
    add-int/lit8 v7, v5, 0x1

    .line 170
    .line 171
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    check-cast v7, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    goto :goto_a

    .line 182
    :cond_b
    move v7, v1

    .line 183
    :goto_a
    sub-int/2addr v7, v6

    .line 184
    new-array v9, v7, [B

    .line 185
    .line 186
    invoke-static {v2, v6, v9, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 187
    .line 188
    .line 189
    aput-object v9, v4, v5

    .line 190
    .line 191
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_c
    move-object p0, v4

    .line 195
    :goto_b
    if-nez p0, :cond_d

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_d
    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    :cond_e
    :goto_c
    return-object v0
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg5/b$d;->e:Lv3/i0;

    return-object v0
.end method

.method public final j(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 12

    .line 1
    new-instance v0, Lv3/i0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv3/i0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "FourCC"

    .line 8
    .line 9
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_1c

    .line 14
    .line 15
    const-string v2, "H264"

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v4, "audio/mp4a-latm"

    .line 22
    .line 23
    if-nez v2, :cond_e

    .line 24
    .line 25
    const-string v2, "X264"

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_e

    .line 32
    .line 33
    const-string v2, "AVC1"

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_e

    .line 40
    .line 41
    const-string v2, "DAVC"

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_0
    const-string v2, "AAC"

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_d

    .line 58
    .line 59
    const-string v2, "AACL"

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_d

    .line 66
    .line 67
    const-string v2, "AACH"

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_d

    .line 74
    .line 75
    const-string v2, "AACP"

    .line 76
    .line 77
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_1
    const-string v2, "TTML"

    .line 86
    .line 87
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_c

    .line 92
    .line 93
    const-string v2, "DFXP"

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_2
    const-string v2, "ac-3"

    .line 104
    .line 105
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_b

    .line 110
    .line 111
    const-string v2, "dac3"

    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const-string v2, "ec-3"

    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_a

    .line 127
    .line 128
    const-string v2, "dec3"

    .line 129
    .line 130
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    const-string v2, "dtsc"

    .line 138
    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    const-string v2, "audio/vnd.dts"

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    const-string v2, "dtsh"

    .line 149
    .line 150
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_9

    .line 155
    .line 156
    const-string v2, "dtsl"

    .line 157
    .line 158
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_6

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_6
    const-string v2, "dtse"

    .line 166
    .line 167
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_7

    .line 172
    .line 173
    const-string v2, "audio/vnd.dts.hd;profile=lbr"

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_7
    const-string v2, "opus"

    .line 177
    .line 178
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_8

    .line 183
    .line 184
    const-string v2, "audio/opus"

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object v2, v1

    .line 188
    goto :goto_6

    .line 189
    :cond_9
    :goto_0
    const-string v2, "audio/vnd.dts.hd"

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_a
    :goto_1
    const-string v2, "audio/eac3"

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_b
    :goto_2
    const-string v2, "audio/ac3"

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_c
    :goto_3
    const-string v2, "application/ttml+xml"

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_d
    :goto_4
    move-object v2, v4

    .line 202
    goto :goto_6

    .line 203
    :cond_e
    :goto_5
    const-string v2, "video/avc"

    .line 204
    .line 205
    :goto_6
    const-string v3, "Type"

    .line 206
    .line 207
    invoke-virtual {p0, v3}, Lg5/b$a;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, Ljava/lang/Integer;

    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    const-string v5, "CodecPrivateData"

    .line 218
    .line 219
    const/4 v6, 0x2

    .line 220
    if-ne v3, v6, :cond_f

    .line 221
    .line 222
    invoke-interface {p1, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static {v3}, Lg5/b$d;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    const-string v4, "video/mp4"

    .line 231
    .line 232
    iput-object v4, v0, Lv3/i0$a;->j:Ljava/lang/String;

    .line 233
    .line 234
    const-string v4, "MaxWidth"

    .line 235
    .line 236
    invoke-static {p1, v4}, Lg5/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    iput v4, v0, Lv3/i0$a;->p:I

    .line 241
    .line 242
    const-string v4, "MaxHeight"

    .line 243
    .line 244
    invoke-static {p1, v4}, Lg5/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    iput v4, v0, Lv3/i0$a;->q:I

    .line 249
    .line 250
    iput-object v3, v0, Lv3/i0$a;->m:Ljava/util/List;

    .line 251
    .line 252
    goto/16 :goto_b

    .line 253
    .line 254
    :cond_f
    const/4 v7, 0x0

    .line 255
    const/4 v8, 0x1

    .line 256
    if-ne v3, v8, :cond_17

    .line 257
    .line 258
    if-nez v2, :cond_10

    .line 259
    .line 260
    move-object v2, v4

    .line 261
    :cond_10
    const-string v3, "Channels"

    .line 262
    .line 263
    invoke-static {p1, v3}, Lg5/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    const-string v8, "SamplingRate"

    .line 268
    .line 269
    invoke-static {p1, v8}, Lg5/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    invoke-interface {p1, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-static {v5}, Lg5/b$d;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-eqz v9, :cond_16

    .line 286
    .line 287
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_16

    .line 292
    .line 293
    const/4 v4, -0x1

    .line 294
    move v9, v4

    .line 295
    move v5, v7

    .line 296
    :goto_7
    sget-object v10, Lx3/a;->a:[I

    .line 297
    .line 298
    const/16 v11, 0xd

    .line 299
    .line 300
    if-ge v5, v11, :cond_12

    .line 301
    .line 302
    aget v10, v10, v5

    .line 303
    .line 304
    if-ne v8, v10, :cond_11

    .line 305
    .line 306
    move v9, v5

    .line 307
    :cond_11
    add-int/lit8 v5, v5, 0x1

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_12
    move v5, v4

    .line 311
    :goto_8
    sget-object v10, Lx3/a;->b:[I

    .line 312
    .line 313
    const/16 v11, 0x10

    .line 314
    .line 315
    if-ge v7, v11, :cond_14

    .line 316
    .line 317
    aget v10, v10, v7

    .line 318
    .line 319
    if-ne v3, v10, :cond_13

    .line 320
    .line 321
    move v5, v7

    .line 322
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_14
    if-eq v8, v4, :cond_15

    .line 326
    .line 327
    if-eq v5, v4, :cond_15

    .line 328
    .line 329
    invoke-static {v6, v9, v5}, Lx3/a;->a(III)[B

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    goto :goto_9

    .line 338
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 339
    .line 340
    const-string v0, "Invalid sample rate or number of channels: "

    .line 341
    .line 342
    const-string v1, ", "

    .line 343
    .line 344
    invoke-static {v0, v8, v1, v3}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw p1

    .line 352
    :cond_16
    :goto_9
    const-string v4, "audio/mp4"

    .line 353
    .line 354
    iput-object v4, v0, Lv3/i0$a;->j:Ljava/lang/String;

    .line 355
    .line 356
    iput v3, v0, Lv3/i0$a;->x:I

    .line 357
    .line 358
    iput v8, v0, Lv3/i0$a;->y:I

    .line 359
    .line 360
    iput-object v5, v0, Lv3/i0$a;->m:Ljava/util/List;

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_17
    const/4 v4, 0x3

    .line 364
    const-string v5, "application/mp4"

    .line 365
    .line 366
    if-ne v3, v4, :cond_1b

    .line 367
    .line 368
    const-string v3, "Subtype"

    .line 369
    .line 370
    invoke-virtual {p0, v3}, Lg5/b$a;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    check-cast v3, Ljava/lang/String;

    .line 375
    .line 376
    if-eqz v3, :cond_1a

    .line 377
    .line 378
    const-string v4, "CAPT"

    .line 379
    .line 380
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-nez v4, :cond_19

    .line 385
    .line 386
    const-string v4, "DESC"

    .line 387
    .line 388
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-nez v3, :cond_18

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_18
    const/16 v7, 0x400

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_19
    const/16 v7, 0x40

    .line 399
    .line 400
    :cond_1a
    :goto_a
    iput-object v5, v0, Lv3/i0$a;->j:Ljava/lang/String;

    .line 401
    .line 402
    iput v7, v0, Lv3/i0$a;->e:I

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_1b
    iput-object v5, v0, Lv3/i0$a;->j:Ljava/lang/String;

    .line 406
    .line 407
    :goto_b
    const-string v3, "Index"

    .line 408
    .line 409
    invoke-interface {p1, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iput-object v1, v0, Lv3/i0$a;->a:Ljava/lang/String;

    .line 414
    .line 415
    const-string v1, "Name"

    .line 416
    .line 417
    invoke-virtual {p0, v1}, Lg5/b$a;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, Ljava/lang/String;

    .line 422
    .line 423
    iput-object v1, v0, Lv3/i0$a;->b:Ljava/lang/String;

    .line 424
    .line 425
    iput-object v2, v0, Lv3/i0$a;->k:Ljava/lang/String;

    .line 426
    .line 427
    const-string v1, "Bitrate"

    .line 428
    .line 429
    invoke-static {p1, v1}, Lg5/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    iput p1, v0, Lv3/i0$a;->f:I

    .line 434
    .line 435
    const-string p1, "Language"

    .line 436
    .line 437
    invoke-virtual {p0, p1}, Lg5/b$a;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    check-cast p1, Ljava/lang/String;

    .line 442
    .line 443
    iput-object p1, v0, Lv3/i0$a;->c:Ljava/lang/String;

    .line 444
    .line 445
    new-instance p1, Lv3/i0;

    .line 446
    .line 447
    invoke-direct {p1, v0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 448
    .line 449
    .line 450
    iput-object p1, p0, Lg5/b$d;->e:Lv3/i0;

    .line 451
    .line 452
    return-void

    .line 453
    :cond_1c
    new-instance p1, Lg5/b$b;

    .line 454
    .line 455
    invoke-direct {p1, v2}, Lg5/b$b;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw p1
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
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

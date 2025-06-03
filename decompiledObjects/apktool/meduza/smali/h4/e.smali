.class public final Lh4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "Camera:MotionPhoto"

    const-string v1, "GCamera:MotionPhoto"

    const-string v2, "Camera:MicroVideo"

    const-string v3, "GCamera:MicroVideo"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh4/e;->a:[Ljava/lang/String;

    const-string v0, "Camera:MotionPhotoPresentationTimestampUs"

    const-string v1, "GCamera:MotionPhotoPresentationTimestampUs"

    const-string v2, "Camera:MicroVideoPresentationTimestampUs"

    const-string v3, "GCamera:MicroVideoPresentationTimestampUs"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh4/e;->b:[Ljava/lang/String;

    const-string v0, "Camera:MicroVideoOffset"

    const-string v1, "GCamera:MicroVideoOffset"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh4/e;->c:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lh4/b;
    .locals 19

    .line 1
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/io/StringReader;

    .line 10
    .line 11
    move-object/from16 v2, p0

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 20
    .line 21
    .line 22
    const-string v1, "x:xmpmeta"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v2, :cond_d

    .line 30
    .line 31
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 32
    .line 33
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    .line 34
    .line 35
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move-wide v6, v4

    .line 41
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 42
    .line 43
    .line 44
    const-string v8, "rdf:Description"

    .line 45
    .line 46
    invoke-static {v0, v8}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_9

    .line 51
    .line 52
    sget-object v2, Lh4/e;->a:[Ljava/lang/String;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    move v7, v6

    .line 56
    :goto_0
    const/4 v8, 0x4

    .line 57
    const/4 v9, 0x1

    .line 58
    if-ge v7, v8, :cond_2

    .line 59
    .line 60
    aget-object v10, v2, v7

    .line 61
    .line 62
    invoke-static {v0, v10}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    if-eqz v10, :cond_1

    .line 67
    .line 68
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-ne v2, v9, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v9, v6

    .line 79
    :goto_1
    if-nez v9, :cond_3

    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_3
    sget-object v2, Lh4/e;->b:[Ljava/lang/String;

    .line 83
    .line 84
    move v7, v6

    .line 85
    :goto_2
    if-ge v7, v8, :cond_5

    .line 86
    .line 87
    aget-object v9, v2, v7

    .line 88
    .line 89
    invoke-static {v0, v9}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    if-eqz v9, :cond_4

    .line 94
    .line 95
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    const-wide/16 v9, -0x1

    .line 100
    .line 101
    cmp-long v2, v7, v9

    .line 102
    .line 103
    if-nez v2, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    :goto_3
    move-wide v7, v4

    .line 110
    :cond_6
    sget-object v2, Lh4/e;->c:[Ljava/lang/String;

    .line 111
    .line 112
    :goto_4
    const/4 v9, 0x2

    .line 113
    if-ge v6, v9, :cond_8

    .line 114
    .line 115
    aget-object v9, v2, v6

    .line 116
    .line 117
    invoke-static {v0, v9}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    if-eqz v9, :cond_7

    .line 122
    .line 123
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v11

    .line 127
    new-instance v2, Lh4/b$a;

    .line 128
    .line 129
    const-wide/16 v14, 0x0

    .line 130
    .line 131
    const-wide/16 v16, 0x0

    .line 132
    .line 133
    const-string v18, "image/jpeg"

    .line 134
    .line 135
    move-object v13, v2

    .line 136
    invoke-direct/range {v13 .. v18}, Lh4/b$a;-><init>(JJLjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v6, Lh4/b$a;

    .line 140
    .line 141
    const-wide/16 v13, 0x0

    .line 142
    .line 143
    const-string v15, "video/mp4"

    .line 144
    .line 145
    move-object v10, v6

    .line 146
    invoke-direct/range {v10 .. v15}, Lh4/b$a;-><init>(JJLjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v6}, Lo7/t;->u(Ljava/lang/Object;Ljava/lang/Object;)Lo7/l0;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    goto :goto_5

    .line 154
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 158
    .line 159
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    .line 160
    .line 161
    :goto_5
    move-wide v6, v7

    .line 162
    goto :goto_7

    .line 163
    :cond_9
    const-string v8, "Container:Directory"

    .line 164
    .line 165
    invoke-static {v0, v8}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_a

    .line 170
    .line 171
    const-string v2, "Container"

    .line 172
    .line 173
    const-string v8, "Item"

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_a
    const-string v8, "GContainer:Directory"

    .line 177
    .line 178
    invoke-static {v0, v8}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-eqz v8, :cond_b

    .line 183
    .line 184
    const-string v2, "GContainer"

    .line 185
    .line 186
    const-string v8, "GContainerItem"

    .line 187
    .line 188
    :goto_6
    invoke-static {v0, v2, v8}, Lh4/e;->b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lo7/l0;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    :cond_b
    :goto_7
    invoke-static {v0, v1}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-eqz v8, :cond_0

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    return-object v3

    .line 205
    :cond_c
    new-instance v0, Lh4/b;

    .line 206
    .line 207
    invoke-direct {v0, v6, v7, v2}, Lh4/b;-><init>(JLo7/l0;)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :cond_d
    const-string v0, "Couldn\'t find xmp metadata"

    .line 212
    .line 213
    invoke-static {v0, v3}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    throw v0
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

.method public static b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Lo7/l0;
    .locals 12

    .line 1
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 2
    .line 3
    new-instance v0, Lo7/t$a;

    .line 4
    .line 5
    invoke-direct {v0}, Lo7/t$a;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, ":Item"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, ":Directory"

    .line 15
    .line 16
    invoke-static {p1, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Lp2/m0;->V(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_5

    .line 28
    .line 29
    const-string v2, ":Mime"

    .line 30
    .line 31
    invoke-static {p2, v2}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, ":Semantic"

    .line 36
    .line 37
    invoke-static {p2, v3}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, ":Length"

    .line 42
    .line 43
    invoke-static {p2, v4}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, ":Padding"

    .line 48
    .line 49
    invoke-static {p2, v5}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {p0, v2}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-static {p0, v3}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {p0, v4}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {p0, v5}, Lp2/m0;->G(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v11, :cond_4

    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    new-instance v2, Lh4/b$a;

    .line 75
    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    move-wide v7, v5

    .line 86
    :goto_0
    if-eqz v4, :cond_3

    .line 87
    .line 88
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    move-wide v9, v3

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move-wide v9, v5

    .line 95
    :goto_1
    move-object v6, v2

    .line 96
    invoke-direct/range {v6 .. v11}, Lh4/b$a;-><init>(JJLjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    :goto_2
    sget-object p0, Lo7/l0;->e:Lo7/l0;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_5
    :goto_3
    invoke-static {p0, p1}, Lp2/m0;->T(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_0

    .line 111
    .line 112
    invoke-virtual {v0}, Lo7/t$a;->e()Lo7/l0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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
.end method

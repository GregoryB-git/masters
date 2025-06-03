.class public final Lq5/a;
.super Lh5/f;
.source "SourceFile"


# instance fields
.field public final m:Lv5/u;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lh5/f;-><init>()V

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lq5/a;->m:Lv5/u;

    return-void
.end method


# virtual methods
.method public final h([BIZ)Lh5/g;
    .locals 10

    .line 1
    iget-object p3, p0, Lq5/a;->m:Lv5/u;

    .line 2
    .line 3
    invoke-virtual {p3, p1, p2}, Lv5/u;->E([BI)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget-object p2, p0, Lq5/a;->m:Lv5/u;

    .line 12
    .line 13
    iget p3, p2, Lv5/u;->c:I

    .line 14
    .line 15
    iget v0, p2, Lv5/u;->b:I

    .line 16
    .line 17
    sub-int/2addr p3, v0

    .line 18
    if-lez p3, :cond_8

    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    if-lt p3, v0, :cond_7

    .line 23
    .line 24
    invoke-virtual {p2}, Lv5/u;->f()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget-object p3, p0, Lq5/a;->m:Lv5/u;

    .line 29
    .line 30
    invoke-virtual {p3}, Lv5/u;->f()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    const v1, 0x76747463

    .line 35
    .line 36
    .line 37
    if-ne p3, v1, :cond_6

    .line 38
    .line 39
    iget-object p3, p0, Lq5/a;->m:Lv5/u;

    .line 40
    .line 41
    add-int/lit8 p2, p2, -0x8

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    move-object v2, v1

    .line 45
    move-object v3, v2

    .line 46
    :cond_0
    :goto_1
    if-lez p2, :cond_3

    .line 47
    .line 48
    if-lt p2, v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p3}, Lv5/u;->f()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {p3}, Lv5/u;->f()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    add-int/lit8 p2, p2, -0x8

    .line 59
    .line 60
    sub-int/2addr v4, v0

    .line 61
    iget-object v6, p3, Lv5/u;->a:[B

    .line 62
    .line 63
    iget v7, p3, Lv5/u;->b:I

    .line 64
    .line 65
    sget v8, Lv5/e0;->a:I

    .line 66
    .line 67
    new-instance v8, Ljava/lang/String;

    .line 68
    .line 69
    sget-object v9, Ln7/d;->c:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-direct {v8, v6, v7, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, v4}, Lv5/u;->H(I)V

    .line 75
    .line 76
    .line 77
    sub-int/2addr p2, v4

    .line 78
    const v4, 0x73747467

    .line 79
    .line 80
    .line 81
    if-ne v5, v4, :cond_1

    .line 82
    .line 83
    new-instance v3, Lq5/f$d;

    .line 84
    .line 85
    invoke-direct {v3}, Lq5/f$d;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v8, v3}, Lq5/f;->e(Ljava/lang/String;Lq5/f$d;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lq5/f$d;->a()Lh5/a$a;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    const v4, 0x7061796c

    .line 97
    .line 98
    .line 99
    if-ne v5, v4, :cond_0

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v1, v2, v4}, Lq5/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    new-instance p1, Lh5/i;

    .line 115
    .line 116
    const-string p2, "Incomplete vtt cue box header found."

    .line 117
    .line 118
    invoke-direct {p1, p2}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_3
    if-nez v2, :cond_4

    .line 123
    .line 124
    const-string v2, ""

    .line 125
    .line 126
    :cond_4
    if-eqz v3, :cond_5

    .line 127
    .line 128
    iput-object v2, v3, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 129
    .line 130
    invoke-virtual {v3}, Lh5/a$a;->a()Lh5/a;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    sget-object p2, Lq5/f;->a:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    new-instance p2, Lq5/f$d;

    .line 138
    .line 139
    invoke-direct {p2}, Lq5/f$d;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object v2, p2, Lq5/f$d;->c:Ljava/lang/CharSequence;

    .line 143
    .line 144
    invoke-virtual {p2}, Lq5/f$d;->a()Lh5/a$a;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2}, Lh5/a$a;->a()Lh5/a;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    :goto_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_6
    iget-object p3, p0, Lq5/a;->m:Lv5/u;

    .line 158
    .line 159
    add-int/lit8 p2, p2, -0x8

    .line 160
    .line 161
    invoke-virtual {p3, p2}, Lv5/u;->H(I)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_7
    new-instance p1, Lh5/i;

    .line 167
    .line 168
    const-string p2, "Incomplete Mp4Webvtt Top Level box header found."

    .line 169
    .line 170
    invoke-direct {p1, p2}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_8
    new-instance p2, Lq5/b;

    .line 175
    .line 176
    invoke-direct {p2, p1}, Lq5/b;-><init>(Ljava/util/ArrayList;)V

    .line 177
    .line 178
    .line 179
    return-object p2
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

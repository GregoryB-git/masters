.class public final Lp5/a;
.super Lh5/f;
.source "SourceFile"


# instance fields
.field public final m:Lv5/u;

.field public final n:Z

.field public final o:I

.field public final p:I

.field public final q:Ljava/lang/String;

.field public final r:F

.field public final s:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lh5/f;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv5/u;

    .line 5
    .line 6
    invoke-direct {v0}, Lv5/u;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp5/a;->m:Lv5/u;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0x3f59999a    # 0.85f

    .line 16
    .line 17
    .line 18
    const-string v2, "sans-serif"

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    const/16 v5, 0x30

    .line 32
    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    const/16 v5, 0x35

    .line 43
    .line 44
    if-ne v0, v5, :cond_4

    .line 45
    .line 46
    :cond_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [B

    .line 51
    .line 52
    const/16 v0, 0x18

    .line 53
    .line 54
    aget-byte v5, p1, v0

    .line 55
    .line 56
    iput v5, p0, Lp5/a;->o:I

    .line 57
    .line 58
    const/16 v5, 0x1a

    .line 59
    .line 60
    aget-byte v5, p1, v5

    .line 61
    .line 62
    and-int/lit16 v5, v5, 0xff

    .line 63
    .line 64
    shl-int/lit8 v0, v5, 0x18

    .line 65
    .line 66
    const/16 v5, 0x1b

    .line 67
    .line 68
    aget-byte v5, p1, v5

    .line 69
    .line 70
    and-int/lit16 v5, v5, 0xff

    .line 71
    .line 72
    shl-int/lit8 v5, v5, 0x10

    .line 73
    .line 74
    or-int/2addr v0, v5

    .line 75
    const/16 v5, 0x1c

    .line 76
    .line 77
    aget-byte v5, p1, v5

    .line 78
    .line 79
    and-int/lit16 v5, v5, 0xff

    .line 80
    .line 81
    shl-int/lit8 v5, v5, 0x8

    .line 82
    .line 83
    or-int/2addr v0, v5

    .line 84
    const/16 v5, 0x1d

    .line 85
    .line 86
    aget-byte v5, p1, v5

    .line 87
    .line 88
    and-int/lit16 v5, v5, 0xff

    .line 89
    .line 90
    or-int/2addr v0, v5

    .line 91
    iput v0, p0, Lp5/a;->p:I

    .line 92
    .line 93
    array-length v0, p1

    .line 94
    const/16 v5, 0x2b

    .line 95
    .line 96
    sub-int/2addr v0, v5

    .line 97
    sget v6, Lv5/e0;->a:I

    .line 98
    .line 99
    new-instance v6, Ljava/lang/String;

    .line 100
    .line 101
    sget-object v7, Ln7/d;->c:Ljava/nio/charset/Charset;

    .line 102
    .line 103
    invoke-direct {v6, p1, v5, v0, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 104
    .line 105
    .line 106
    const-string v0, "Serif"

    .line 107
    .line 108
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    const-string v2, "serif"

    .line 115
    .line 116
    :cond_1
    iput-object v2, p0, Lp5/a;->q:Ljava/lang/String;

    .line 117
    .line 118
    const/16 v0, 0x19

    .line 119
    .line 120
    aget-byte v0, p1, v0

    .line 121
    .line 122
    mul-int/lit8 v0, v0, 0x14

    .line 123
    .line 124
    iput v0, p0, Lp5/a;->s:I

    .line 125
    .line 126
    aget-byte v2, p1, v4

    .line 127
    .line 128
    and-int/lit8 v2, v2, 0x20

    .line 129
    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    move v3, v4

    .line 134
    :goto_0
    iput-boolean v3, p0, Lp5/a;->n:Z

    .line 135
    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    const/16 v1, 0xa

    .line 139
    .line 140
    aget-byte v1, p1, v1

    .line 141
    .line 142
    and-int/lit16 v1, v1, 0xff

    .line 143
    .line 144
    shl-int/lit8 v1, v1, 0x8

    .line 145
    .line 146
    const/16 v2, 0xb

    .line 147
    .line 148
    aget-byte p1, p1, v2

    .line 149
    .line 150
    and-int/lit16 p1, p1, 0xff

    .line 151
    .line 152
    or-int/2addr p1, v1

    .line 153
    int-to-float p1, p1

    .line 154
    int-to-float v0, v0

    .line 155
    div-float/2addr p1, v0

    .line 156
    const/4 v0, 0x0

    .line 157
    const v1, 0x3f733333    # 0.95f

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v0, v1}, Lv5/e0;->h(FFF)F

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    iput p1, p0, Lp5/a;->r:F

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    iput v1, p0, Lp5/a;->r:F

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    iput v4, p0, Lp5/a;->o:I

    .line 171
    .line 172
    const/4 p1, -0x1

    .line 173
    iput p1, p0, Lp5/a;->p:I

    .line 174
    .line 175
    iput-object v2, p0, Lp5/a;->q:Ljava/lang/String;

    .line 176
    .line 177
    iput-boolean v4, p0, Lp5/a;->n:Z

    .line 178
    .line 179
    iput v1, p0, Lp5/a;->r:F

    .line 180
    .line 181
    iput p1, p0, Lp5/a;->s:I

    .line 182
    .line 183
    :goto_1
    return-void
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

.method public static i(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 5

    if-eq p1, p2, :cond_7

    or-int/lit8 p2, p5, 0x21

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p5, :cond_0

    move p5, v1

    goto :goto_0

    :cond_0
    move p5, v0

    :goto_0
    and-int/lit8 v2, p1, 0x2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    if-eqz p5, :cond_3

    new-instance v3, Landroid/text/style/StyleSpan;

    if-eqz v2, :cond_2

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    goto :goto_2

    :cond_2
    invoke-direct {v3, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    goto :goto_2

    :cond_3
    if-eqz v2, :cond_4

    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    :goto_2
    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_4
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    move v1, v0

    :goto_3
    if-eqz v1, :cond_6

    new-instance p1, Landroid/text/style/UnderlineSpan;

    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_6
    if-nez v1, :cond_7

    if-nez p5, :cond_7

    if-nez v2, :cond_7

    new-instance p1, Landroid/text/style/StyleSpan;

    invoke-direct {p1, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final h([BIZ)Lh5/g;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lp5/a;->m:Lv5/u;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Lv5/u;->E([BI)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lp5/a;->m:Lv5/u;

    .line 13
    .line 14
    iget v2, v1, Lv5/u;->c:I

    .line 15
    .line 16
    iget v3, v1, Lv5/u;->b:I

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x2

    .line 22
    if-lt v2, v5, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v3

    .line 27
    :goto_0
    const-string v6, "Unexpected subtitle format."

    .line 28
    .line 29
    if-eqz v2, :cond_13

    .line 30
    .line 31
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iget v7, v1, Lv5/u;->b:I

    .line 41
    .line 42
    invoke-virtual {v1}, Lv5/u;->C()Ljava/nio/charset/Charset;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    iget v9, v1, Lv5/u;->b:I

    .line 47
    .line 48
    sub-int/2addr v9, v7

    .line 49
    sub-int/2addr v2, v9

    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object v8, Ln7/d;->c:Ljava/nio/charset/Charset;

    .line 54
    .line 55
    :goto_1
    invoke-virtual {v1, v2, v8}, Lv5/u;->t(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    sget-object v1, Lp5/b;->b:Lp5/b;

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    iget v8, v0, Lp5/a;->o:I

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const/4 v10, 0x0

    .line 81
    const/high16 v12, 0xff0000

    .line 82
    .line 83
    move-object v7, v2

    .line 84
    invoke-static/range {v7 .. v12}, Lp5/a;->i(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 85
    .line 86
    .line 87
    iget v1, v0, Lp5/a;->p:I

    .line 88
    .line 89
    const/4 v7, -0x1

    .line 90
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    const v9, 0xff0021

    .line 95
    .line 96
    .line 97
    const/16 v10, 0x8

    .line 98
    .line 99
    if-eq v1, v7, :cond_4

    .line 100
    .line 101
    and-int/lit16 v7, v1, 0xff

    .line 102
    .line 103
    shl-int/lit8 v7, v7, 0x18

    .line 104
    .line 105
    ushr-int/2addr v1, v10

    .line 106
    or-int/2addr v1, v7

    .line 107
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 108
    .line 109
    invoke-direct {v7, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v7, v3, v8, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 113
    .line 114
    .line 115
    :cond_4
    iget-object v1, v0, Lp5/a;->q:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    const-string v8, "sans-serif"

    .line 122
    .line 123
    if-eq v1, v8, :cond_5

    .line 124
    .line 125
    new-instance v8, Landroid/text/style/TypefaceSpan;

    .line 126
    .line 127
    invoke-direct {v8, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v8, v3, v7, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 131
    .line 132
    .line 133
    :cond_5
    iget v1, v0, Lp5/a;->r:F

    .line 134
    .line 135
    :goto_3
    iget-object v7, v0, Lp5/a;->m:Lv5/u;

    .line 136
    .line 137
    iget v8, v7, Lv5/u;->c:I

    .line 138
    .line 139
    iget v13, v7, Lv5/u;->b:I

    .line 140
    .line 141
    sub-int/2addr v8, v13

    .line 142
    if-lt v8, v10, :cond_12

    .line 143
    .line 144
    invoke-virtual {v7}, Lv5/u;->f()I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    iget-object v7, v0, Lp5/a;->m:Lv5/u;

    .line 149
    .line 150
    invoke-virtual {v7}, Lv5/u;->f()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    const v8, 0x7374796c

    .line 155
    .line 156
    .line 157
    if-ne v7, v8, :cond_e

    .line 158
    .line 159
    iget-object v7, v0, Lp5/a;->m:Lv5/u;

    .line 160
    .line 161
    iget v8, v7, Lv5/u;->c:I

    .line 162
    .line 163
    iget v9, v7, Lv5/u;->b:I

    .line 164
    .line 165
    sub-int/2addr v8, v9

    .line 166
    if-lt v8, v5, :cond_6

    .line 167
    .line 168
    move v8, v4

    .line 169
    goto :goto_4

    .line 170
    :cond_6
    move v8, v3

    .line 171
    :goto_4
    if-eqz v8, :cond_d

    .line 172
    .line 173
    invoke-virtual {v7}, Lv5/u;->A()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    move v7, v5

    .line 178
    move v5, v4

    .line 179
    move v4, v3

    .line 180
    :goto_5
    if-ge v3, v15, :cond_c

    .line 181
    .line 182
    iget-object v8, v0, Lp5/a;->m:Lv5/u;

    .line 183
    .line 184
    iget v9, v8, Lv5/u;->c:I

    .line 185
    .line 186
    iget v10, v8, Lv5/u;->b:I

    .line 187
    .line 188
    sub-int/2addr v9, v10

    .line 189
    const/16 v10, 0xc

    .line 190
    .line 191
    if-lt v9, v10, :cond_7

    .line 192
    .line 193
    move v4, v5

    .line 194
    :cond_7
    if-eqz v4, :cond_b

    .line 195
    .line 196
    invoke-virtual {v8}, Lv5/u;->A()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-virtual {v8}, Lv5/u;->A()I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    invoke-virtual {v8, v7}, Lv5/u;->H(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v8}, Lv5/u;->v()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual {v8, v5}, Lv5/u;->H(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8}, Lv5/u;->f()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    const-string v8, ")."

    .line 223
    .line 224
    const-string v11, "Tx3gDecoder"

    .line 225
    .line 226
    if-le v9, v7, :cond_8

    .line 227
    .line 228
    const-string v7, "Truncating styl end ("

    .line 229
    .line 230
    const-string v12, ") to cueText.length() ("

    .line 231
    .line 232
    invoke-static {v7, v9, v12}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-static {v11, v7}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    :cond_8
    move v12, v9

    .line 258
    if-lt v4, v12, :cond_9

    .line 259
    .line 260
    new-instance v5, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const-string v7, "Ignoring styl with start ("

    .line 266
    .line 267
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v4, ") >= end ("

    .line 274
    .line 275
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-static {v11, v4}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    move/from16 p1, v15

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_9
    iget v9, v0, Lp5/a;->o:I

    .line 295
    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    move-object v7, v2

    .line 299
    move v8, v10

    .line 300
    move v10, v4

    .line 301
    move v11, v12

    .line 302
    move/from16 p1, v15

    .line 303
    .line 304
    move v15, v12

    .line 305
    move/from16 v12, v16

    .line 306
    .line 307
    invoke-static/range {v7 .. v12}, Lp5/a;->i(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 308
    .line 309
    .line 310
    iget v7, v0, Lp5/a;->p:I

    .line 311
    .line 312
    if-eq v5, v7, :cond_a

    .line 313
    .line 314
    and-int/lit16 v7, v5, 0xff

    .line 315
    .line 316
    shl-int/lit8 v7, v7, 0x18

    .line 317
    .line 318
    ushr-int/lit8 v5, v5, 0x8

    .line 319
    .line 320
    or-int/2addr v5, v7

    .line 321
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 322
    .line 323
    invoke-direct {v7, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 324
    .line 325
    .line 326
    const/16 v5, 0x21

    .line 327
    .line 328
    invoke-virtual {v2, v7, v4, v15, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 329
    .line 330
    .line 331
    :cond_a
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 332
    .line 333
    const/4 v4, 0x0

    .line 334
    const/4 v5, 0x1

    .line 335
    const/4 v7, 0x2

    .line 336
    move/from16 v15, p1

    .line 337
    .line 338
    goto/16 :goto_5

    .line 339
    .line 340
    :cond_b
    new-instance v1, Lh5/i;

    .line 341
    .line 342
    invoke-direct {v1, v6}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v1

    .line 346
    :cond_c
    move v5, v7

    .line 347
    goto :goto_8

    .line 348
    :cond_d
    new-instance v1, Lh5/i;

    .line 349
    .line 350
    invoke-direct {v1, v6}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v1

    .line 354
    :cond_e
    const v3, 0x74626f78

    .line 355
    .line 356
    .line 357
    if-ne v7, v3, :cond_11

    .line 358
    .line 359
    iget-boolean v3, v0, Lp5/a;->n:Z

    .line 360
    .line 361
    if-eqz v3, :cond_11

    .line 362
    .line 363
    iget-object v1, v0, Lp5/a;->m:Lv5/u;

    .line 364
    .line 365
    iget v3, v1, Lv5/u;->c:I

    .line 366
    .line 367
    iget v4, v1, Lv5/u;->b:I

    .line 368
    .line 369
    sub-int/2addr v3, v4

    .line 370
    const/4 v4, 0x2

    .line 371
    if-lt v3, v4, :cond_f

    .line 372
    .line 373
    const/4 v3, 0x1

    .line 374
    goto :goto_7

    .line 375
    :cond_f
    const/4 v3, 0x0

    .line 376
    :goto_7
    if-eqz v3, :cond_10

    .line 377
    .line 378
    invoke-virtual {v1}, Lv5/u;->A()I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    int-to-float v1, v1

    .line 383
    iget v3, v0, Lp5/a;->s:I

    .line 384
    .line 385
    int-to-float v3, v3

    .line 386
    div-float/2addr v1, v3

    .line 387
    const/4 v3, 0x0

    .line 388
    const v5, 0x3f733333    # 0.95f

    .line 389
    .line 390
    .line 391
    invoke-static {v1, v3, v5}, Lv5/e0;->h(FFF)F

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    move v5, v4

    .line 396
    goto :goto_8

    .line 397
    :cond_10
    new-instance v1, Lh5/i;

    .line 398
    .line 399
    invoke-direct {v1, v6}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v1

    .line 403
    :cond_11
    const/4 v3, 0x2

    .line 404
    move v5, v3

    .line 405
    :goto_8
    iget-object v3, v0, Lp5/a;->m:Lv5/u;

    .line 406
    .line 407
    add-int/2addr v13, v14

    .line 408
    invoke-virtual {v3, v13}, Lv5/u;->G(I)V

    .line 409
    .line 410
    .line 411
    const/4 v3, 0x0

    .line 412
    const/4 v4, 0x1

    .line 413
    const/16 v10, 0x8

    .line 414
    .line 415
    goto/16 :goto_3

    .line 416
    .line 417
    :cond_12
    new-instance v3, Lp5/b;

    .line 418
    .line 419
    new-instance v4, Lh5/a$a;

    .line 420
    .line 421
    invoke-direct {v4}, Lh5/a$a;-><init>()V

    .line 422
    .line 423
    .line 424
    iput-object v2, v4, Lh5/a$a;->a:Ljava/lang/CharSequence;

    .line 425
    .line 426
    iput v1, v4, Lh5/a$a;->e:F

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    iput v1, v4, Lh5/a$a;->f:I

    .line 430
    .line 431
    iput v1, v4, Lh5/a$a;->g:I

    .line 432
    .line 433
    invoke-virtual {v4}, Lh5/a$a;->a()Lh5/a;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-direct {v3, v1}, Lp5/b;-><init>(Lh5/a;)V

    .line 438
    .line 439
    .line 440
    return-object v3

    .line 441
    :cond_13
    new-instance v1, Lh5/i;

    .line 442
    .line 443
    invoke-direct {v1, v6}, Lh5/i;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw v1
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
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
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
.end method

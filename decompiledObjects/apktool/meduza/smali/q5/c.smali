.class public final Lq5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lv5/u;

.field public final b:Ljava/lang/StringBuilder;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\[voice=\"([^\"]*)\"\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lq5/c;->c:Ljava/util/regex/Pattern;

    const-string v0, "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lq5/c;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lq5/c;->a:Lv5/u;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lq5/c;->b:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static a(Lv5/u;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lv5/u;->b:I

    .line 6
    .line 7
    iget v2, p0, Lv5/u;->c:I

    .line 8
    .line 9
    :goto_0
    if-ge v1, v2, :cond_5

    .line 10
    .line 11
    if-nez v0, :cond_5

    .line 12
    .line 13
    iget-object v3, p0, Lv5/u;->a:[B

    .line 14
    .line 15
    aget-byte v3, v3, v1

    .line 16
    .line 17
    int-to-char v3, v3

    .line 18
    const/16 v4, 0x41

    .line 19
    .line 20
    if-lt v3, v4, :cond_0

    .line 21
    .line 22
    const/16 v4, 0x5a

    .line 23
    .line 24
    if-le v3, v4, :cond_4

    .line 25
    .line 26
    :cond_0
    const/16 v4, 0x61

    .line 27
    .line 28
    if-lt v3, v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x7a

    .line 31
    .line 32
    if-le v3, v4, :cond_4

    .line 33
    .line 34
    :cond_1
    const/16 v4, 0x30

    .line 35
    .line 36
    if-lt v3, v4, :cond_2

    .line 37
    .line 38
    const/16 v4, 0x39

    .line 39
    .line 40
    if-le v3, v4, :cond_4

    .line 41
    .line 42
    :cond_2
    const/16 v4, 0x23

    .line 43
    .line 44
    if-eq v3, v4, :cond_4

    .line 45
    .line 46
    const/16 v4, 0x2d

    .line 47
    .line 48
    if-eq v3, v4, :cond_4

    .line 49
    .line 50
    const/16 v4, 0x2e

    .line 51
    .line 52
    if-eq v3, v4, :cond_4

    .line 53
    .line 54
    const/16 v4, 0x5f

    .line 55
    .line 56
    if-ne v3, v4, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v0, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    iget v0, p0, Lv5/u;->b:I

    .line 68
    .line 69
    sub-int/2addr v1, v0

    .line 70
    invoke-virtual {p0, v1}, Lv5/u;->H(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
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

.method public static b(Lv5/u;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lq5/c;->c(Lv5/u;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lv5/u;->c:I

    .line 5
    .line 6
    iget v1, p0, Lv5/u;->b:I

    .line 7
    .line 8
    sub-int/2addr v0, v1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {p0, p1}, Lq5/c;->a(Lv5/u;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, ""

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0}, Lv5/u;->v()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-char p0, p0

    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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

.method public static c(Lv5/u;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    :cond_0
    :goto_0
    move v1, v0

    .line 3
    :goto_1
    iget v2, p0, Lv5/u;->c:I

    .line 4
    .line 5
    iget v3, p0, Lv5/u;->b:I

    .line 6
    .line 7
    sub-int/2addr v2, v3

    .line 8
    if-lez v2, :cond_6

    .line 9
    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    iget-object v1, p0, Lv5/u;->a:[B

    .line 13
    .line 14
    aget-byte v1, v1, v3

    .line 15
    .line 16
    int-to-char v1, v1

    .line 17
    const/16 v2, 0x9

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0xc

    .line 27
    .line 28
    if-eq v1, v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    invoke-virtual {p0, v0}, Lv5/u;->H(I)V

    .line 41
    .line 42
    .line 43
    move v1, v0

    .line 44
    :goto_2
    if-nez v1, :cond_0

    .line 45
    .line 46
    iget v1, p0, Lv5/u;->b:I

    .line 47
    .line 48
    iget v2, p0, Lv5/u;->c:I

    .line 49
    .line 50
    iget-object v4, p0, Lv5/u;->a:[B

    .line 51
    .line 52
    add-int/lit8 v5, v1, 0x2

    .line 53
    .line 54
    if-gt v5, v2, :cond_4

    .line 55
    .line 56
    add-int/lit8 v5, v1, 0x1

    .line 57
    .line 58
    aget-byte v1, v4, v1

    .line 59
    .line 60
    const/16 v6, 0x2f

    .line 61
    .line 62
    if-ne v1, v6, :cond_4

    .line 63
    .line 64
    add-int/lit8 v1, v5, 0x1

    .line 65
    .line 66
    aget-byte v5, v4, v5

    .line 67
    .line 68
    const/16 v7, 0x2a

    .line 69
    .line 70
    if-ne v5, v7, :cond_4

    .line 71
    .line 72
    :goto_3
    add-int/lit8 v5, v1, 0x1

    .line 73
    .line 74
    if-ge v5, v2, :cond_3

    .line 75
    .line 76
    aget-byte v1, v4, v1

    .line 77
    .line 78
    int-to-char v1, v1

    .line 79
    if-ne v1, v7, :cond_2

    .line 80
    .line 81
    aget-byte v1, v4, v5

    .line 82
    .line 83
    int-to-char v1, v1

    .line 84
    if-ne v1, v6, :cond_2

    .line 85
    .line 86
    add-int/lit8 v2, v5, 0x1

    .line 87
    .line 88
    move v1, v2

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    move v1, v5

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    iget v1, p0, Lv5/u;->b:I

    .line 93
    .line 94
    sub-int/2addr v2, v1

    .line 95
    invoke-virtual {p0, v2}, Lv5/u;->H(I)V

    .line 96
    .line 97
    .line 98
    move v1, v0

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    move v1, v3

    .line 101
    :goto_4
    if-eqz v1, :cond_5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    move v1, v3

    .line 105
    goto :goto_1

    .line 106
    :cond_6
    return-void
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

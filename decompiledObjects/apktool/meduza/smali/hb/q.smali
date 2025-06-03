.class public final Lhb/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lhb/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)[[B
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    new-array v1, v0, [[B

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljb/d;

    .line 26
    .line 27
    add-int/lit8 v5, v3, 0x1

    .line 28
    .line 29
    iget-object v6, v4, Ljb/d;->a:Lxc/i;

    .line 30
    .line 31
    invoke-virtual {v6}, Lxc/i;->s()[B

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    aput-object v6, v1, v3

    .line 36
    .line 37
    add-int/lit8 v3, v5, 0x1

    .line 38
    .line 39
    iget-object v4, v4, Ljb/d;->b:Lxc/i;

    .line 40
    .line 41
    invoke-virtual {v4}, Lxc/i;->s()[B

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    aput-object v4, v1, v5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object p0, Lgb/p3;->a:Ljava/util/logging/Logger;

    .line 49
    .line 50
    move p0, v2

    .line 51
    :goto_1
    if-ge p0, v0, :cond_9

    .line 52
    .line 53
    aget-object v3, v1, p0

    .line 54
    .line 55
    add-int/lit8 v4, p0, 0x1

    .line 56
    .line 57
    aget-object v5, v1, v4

    .line 58
    .line 59
    sget-object v6, Lgb/p3;->b:[B

    .line 60
    .line 61
    invoke-static {v3, v6}, Lgb/p3;->a([B[B)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_8

    .line 66
    .line 67
    move v3, v2

    .line 68
    :goto_2
    array-length v6, v5

    .line 69
    if-ge v3, v6, :cond_7

    .line 70
    .line 71
    aget-byte v6, v5, v3

    .line 72
    .line 73
    const/16 v7, 0x2c

    .line 74
    .line 75
    if-ne v6, v7, :cond_6

    .line 76
    .line 77
    new-instance v3, Ljava/util/ArrayList;

    .line 78
    .line 79
    add-int/lit8 v4, v0, 0xa

    .line 80
    .line 81
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    move v4, v2

    .line 85
    :goto_3
    if-ge v4, p0, :cond_1

    .line 86
    .line 87
    aget-object v5, v1, v4

    .line 88
    .line 89
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_1
    :goto_4
    if-ge p0, v0, :cond_5

    .line 96
    .line 97
    aget-object v4, v1, p0

    .line 98
    .line 99
    add-int/lit8 v5, p0, 0x1

    .line 100
    .line 101
    aget-object v5, v1, v5

    .line 102
    .line 103
    sget-object v6, Lgb/p3;->b:[B

    .line 104
    .line 105
    invoke-static {v4, v6}, Lgb/p3;->a([B[B)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-nez v6, :cond_2

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_2
    move v6, v2

    .line 119
    move v8, v6

    .line 120
    :goto_5
    array-length v9, v5

    .line 121
    if-gt v6, v9, :cond_4

    .line 122
    .line 123
    array-length v9, v5

    .line 124
    if-eq v6, v9, :cond_3

    .line 125
    .line 126
    aget-byte v9, v5, v6

    .line 127
    .line 128
    if-eq v9, v7, :cond_3

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_3
    sget-object v9, Lp7/a;->a:Lp7/a$c;

    .line 132
    .line 133
    new-instance v10, Ljava/lang/String;

    .line 134
    .line 135
    sub-int v11, v6, v8

    .line 136
    .line 137
    sget-object v12, Ln7/d;->a:Ljava/nio/charset/Charset;

    .line 138
    .line 139
    invoke-direct {v10, v5, v8, v11, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v10}, Lp7/a;->a(Ljava/lang/String;)[B

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    add-int/lit8 v9, v6, 0x1

    .line 147
    .line 148
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move v8, v9

    .line 155
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_4
    :goto_7
    add-int/lit8 p0, p0, 0x2

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    new-array p0, v2, [[B

    .line 162
    .line 163
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    move-object v1, p0

    .line 168
    check-cast v1, [[B

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    sget-object v3, Lp7/a;->a:Lp7/a$c;

    .line 175
    .line 176
    new-instance v6, Ljava/lang/String;

    .line 177
    .line 178
    sget-object v7, Ln7/d;->a:Ljava/nio/charset/Charset;

    .line 179
    .line 180
    invoke-direct {v6, v5, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v6}, Lp7/a;->a(Ljava/lang/String;)[B

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    aput-object v3, v1, v4

    .line 188
    .line 189
    :cond_8
    add-int/lit8 p0, p0, 0x2

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_9
    :goto_8
    return-object v1
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

.class public final Lpc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILpc/a;I)Lpc/b;
    .locals 4

    .line 1
    sget-object v0, Lpc/a;->a:Lpc/a;

    .line 2
    .line 3
    and-int/lit8 v1, p2, 0x1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move p0, v2

    .line 9
    :cond_0
    and-int/lit8 p2, p2, 0x2

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_1
    const/4 p2, 0x0

    .line 15
    const/4 v1, -0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq p0, v1, :cond_9

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-eq p0, v1, :cond_6

    .line 21
    .line 22
    if-eqz p0, :cond_4

    .line 23
    .line 24
    const v1, 0x7fffffff

    .line 25
    .line 26
    .line 27
    if-eq p0, v1, :cond_3

    .line 28
    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    new-instance p1, Lpc/b;

    .line 32
    .line 33
    invoke-direct {p1, p0, p2}, Lpc/b;-><init>(ILdc/l;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    new-instance v0, Lpc/n;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1, p2}, Lpc/n;-><init>(ILpc/a;Ldc/l;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    new-instance p1, Lpc/b;

    .line 45
    .line 46
    invoke-direct {p1, v1, p2}, Lpc/b;-><init>(ILdc/l;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    if-ne p1, v0, :cond_5

    .line 51
    .line 52
    new-instance p0, Lpc/b;

    .line 53
    .line 54
    invoke-direct {p0, v2, p2}, Lpc/b;-><init>(ILdc/l;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    new-instance p0, Lpc/n;

    .line 59
    .line 60
    invoke-direct {p0, v3, p1, p2}, Lpc/n;-><init>(ILpc/a;Ldc/l;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    if-ne p1, v0, :cond_7

    .line 65
    .line 66
    move v2, v3

    .line 67
    :cond_7
    if-eqz v2, :cond_8

    .line 68
    .line 69
    new-instance p1, Lpc/n;

    .line 70
    .line 71
    sget-object p0, Lpc/a;->b:Lpc/a;

    .line 72
    .line 73
    invoke-direct {p1, v3, p0, p2}, Lpc/n;-><init>(ILpc/a;Ldc/l;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_9
    if-ne p1, v0, :cond_a

    .line 90
    .line 91
    new-instance p0, Lpc/b;

    .line 92
    .line 93
    sget-object p1, Lpc/f;->m:Lpc/f$a;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget p1, Lpc/f$a;->b:I

    .line 99
    .line 100
    invoke-direct {p0, p1, p2}, Lpc/b;-><init>(ILdc/l;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_a
    new-instance p0, Lpc/n;

    .line 105
    .line 106
    invoke-direct {p0, v3, p1, p2}, Lpc/n;-><init>(ILpc/a;Ldc/l;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    move-object p1, p0

    .line 110
    :goto_1
    return-object p1
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

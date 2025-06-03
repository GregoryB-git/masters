.class public final Lc4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(JLv5/u;[Lc4/v;)V
    .locals 10

    .line 1
    :goto_0
    iget v0, p2, Lv5/u;->c:I

    .line 2
    .line 3
    iget v1, p2, Lv5/u;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x1

    .line 7
    if-le v0, v1, :cond_d

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v2, v0

    .line 11
    :cond_0
    iget v3, p2, Lv5/u;->c:I

    .line 12
    .line 13
    iget v4, p2, Lv5/u;->b:I

    .line 14
    .line 15
    sub-int/2addr v3, v4

    .line 16
    const/16 v4, 0xff

    .line 17
    .line 18
    const/4 v5, -0x1

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v2, v3

    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    move v3, v2

    .line 31
    :goto_1
    move v2, v0

    .line 32
    :cond_2
    iget v6, p2, Lv5/u;->c:I

    .line 33
    .line 34
    iget v7, p2, Lv5/u;->b:I

    .line 35
    .line 36
    sub-int/2addr v6, v7

    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    move v2, v5

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-int/2addr v2, v6

    .line 46
    if-eq v6, v4, :cond_2

    .line 47
    .line 48
    :goto_2
    iget v4, p2, Lv5/u;->b:I

    .line 49
    .line 50
    add-int v6, v4, v2

    .line 51
    .line 52
    if-eq v2, v5, :cond_b

    .line 53
    .line 54
    iget v5, p2, Lv5/u;->c:I

    .line 55
    .line 56
    sub-int/2addr v5, v4

    .line 57
    if-le v2, v5, :cond_4

    .line 58
    .line 59
    goto :goto_6

    .line 60
    :cond_4
    const/4 v4, 0x4

    .line 61
    if-ne v3, v4, :cond_c

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    if-lt v2, v3, :cond_c

    .line 66
    .line 67
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p2}, Lv5/u;->A()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/16 v4, 0x31

    .line 76
    .line 77
    if-ne v3, v4, :cond_5

    .line 78
    .line 79
    invoke-virtual {p2}, Lv5/u;->f()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v5, v0

    .line 85
    :goto_3
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    const/16 v8, 0x2f

    .line 90
    .line 91
    if-ne v3, v8, :cond_6

    .line 92
    .line 93
    invoke-virtual {p2, v1}, Lv5/u;->H(I)V

    .line 94
    .line 95
    .line 96
    :cond_6
    const/16 v9, 0xb5

    .line 97
    .line 98
    if-ne v2, v9, :cond_8

    .line 99
    .line 100
    if-eq v3, v4, :cond_7

    .line 101
    .line 102
    if-ne v3, v8, :cond_8

    .line 103
    .line 104
    :cond_7
    const/4 v2, 0x3

    .line 105
    if-ne v7, v2, :cond_8

    .line 106
    .line 107
    move v2, v1

    .line 108
    goto :goto_4

    .line 109
    :cond_8
    move v2, v0

    .line 110
    :goto_4
    if-ne v3, v4, :cond_a

    .line 111
    .line 112
    const v3, 0x47413934

    .line 113
    .line 114
    .line 115
    if-ne v5, v3, :cond_9

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    move v1, v0

    .line 119
    :goto_5
    and-int/2addr v2, v1

    .line 120
    :cond_a
    if-eqz v2, :cond_c

    .line 121
    .line 122
    invoke-static {p0, p1, p2, p3}, Lc4/b;->b(JLv5/u;[Lc4/v;)V

    .line 123
    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_b
    :goto_6
    const-string v0, "CeaUtil"

    .line 127
    .line 128
    const-string v1, "Skipping remainder of malformed SEI NAL unit."

    .line 129
    .line 130
    invoke-static {v0, v1}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget v6, p2, Lv5/u;->c:I

    .line 134
    .line 135
    :cond_c
    :goto_7
    invoke-virtual {p2, v6}, Lv5/u;->G(I)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_d
    return-void
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

.method public static b(JLv5/u;[Lc4/v;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Lv5/u;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x40

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    and-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    invoke-virtual {p2, v2}, Lv5/u;->H(I)V

    .line 20
    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x3

    .line 23
    .line 24
    iget v1, p2, Lv5/u;->b:I

    .line 25
    .line 26
    array-length v2, p3

    .line 27
    :goto_1
    if-ge v3, v2, :cond_3

    .line 28
    .line 29
    aget-object v4, p3, v3

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Lv5/u;->G(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v4, v0, p2}, Lc4/v;->b(ILv5/u;)V

    .line 35
    .line 36
    .line 37
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v5, p0, v5

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    move-wide v5, p0

    .line 50
    move v8, v0

    .line 51
    invoke-interface/range {v4 .. v10}, Lc4/v;->c(JIIILc4/v$a;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-void
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

.class public final LR2/Y5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LB2/b;->u(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const-wide/32 v7, -0x80000000

    .line 13
    .line 14
    .line 15
    const-string v9, ""

    .line 16
    .line 17
    const/16 v10, 0x64

    .line 18
    .line 19
    move-object v12, v2

    .line 20
    move-object v13, v12

    .line 21
    move-object v14, v13

    .line 22
    move-object v15, v14

    .line 23
    move-object/from16 v20, v15

    .line 24
    .line 25
    move-object/from16 v25, v20

    .line 26
    .line 27
    move-object/from16 v33, v25

    .line 28
    .line 29
    move-object/from16 v34, v33

    .line 30
    .line 31
    move-object/from16 v37, v34

    .line 32
    .line 33
    move-object/from16 v38, v37

    .line 34
    .line 35
    move-object/from16 v41, v38

    .line 36
    .line 37
    move-wide/from16 v16, v3

    .line 38
    .line 39
    move-wide/from16 v18, v16

    .line 40
    .line 41
    move-wide/from16 v26, v18

    .line 42
    .line 43
    move-wide/from16 v28, v26

    .line 44
    .line 45
    move-wide/from16 v35, v28

    .line 46
    .line 47
    move-wide/from16 v43, v35

    .line 48
    .line 49
    move-wide/from16 v48, v43

    .line 50
    .line 51
    move/from16 v21, v5

    .line 52
    .line 53
    move/from16 v31, v21

    .line 54
    .line 55
    move/from16 v22, v6

    .line 56
    .line 57
    move/from16 v30, v22

    .line 58
    .line 59
    move/from16 v32, v30

    .line 60
    .line 61
    move/from16 v42, v32

    .line 62
    .line 63
    move/from16 v47, v42

    .line 64
    .line 65
    move-wide/from16 v23, v7

    .line 66
    .line 67
    move-object/from16 v39, v9

    .line 68
    .line 69
    move-object/from16 v40, v39

    .line 70
    .line 71
    move-object/from16 v46, v40

    .line 72
    .line 73
    move/from16 v45, v10

    .line 74
    .line 75
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ge v2, v1, :cond_0

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, LB2/b;->n(Landroid/os/Parcel;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v2}, LB2/b;->i(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    packed-switch v3, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    :pswitch_0
    invoke-static {v0, v2}, LB2/b;->t(Landroid/os/Parcel;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_1
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v48

    .line 100
    goto :goto_0

    .line 101
    :pswitch_2
    invoke-static {v0, v2}, LB2/b;->p(Landroid/os/Parcel;I)I

    .line 102
    .line 103
    .line 104
    move-result v47

    .line 105
    goto :goto_0

    .line 106
    :pswitch_3
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v46

    .line 110
    goto :goto_0

    .line 111
    :pswitch_4
    invoke-static {v0, v2}, LB2/b;->p(Landroid/os/Parcel;I)I

    .line 112
    .line 113
    .line 114
    move-result v45

    .line 115
    goto :goto_0

    .line 116
    :pswitch_5
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v43

    .line 120
    goto :goto_0

    .line 121
    :pswitch_6
    invoke-static {v0, v2}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 122
    .line 123
    .line 124
    move-result v42

    .line 125
    goto :goto_0

    .line 126
    :pswitch_7
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v41

    .line 130
    goto :goto_0

    .line 131
    :pswitch_8
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v40

    .line 135
    goto :goto_0

    .line 136
    :pswitch_9
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v39

    .line 140
    goto :goto_0

    .line 141
    :pswitch_a
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v38

    .line 145
    goto :goto_0

    .line 146
    :pswitch_b
    invoke-static {v0, v2}, LB2/b;->e(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v37

    .line 150
    goto :goto_0

    .line 151
    :pswitch_c
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 152
    .line 153
    .line 154
    move-result-wide v35

    .line 155
    goto :goto_0

    .line 156
    :pswitch_d
    invoke-static {v0, v2}, LB2/b;->k(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v34

    .line 160
    goto :goto_0

    .line 161
    :pswitch_e
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v33

    .line 165
    goto :goto_0

    .line 166
    :pswitch_f
    invoke-static {v0, v2}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 167
    .line 168
    .line 169
    move-result v32

    .line 170
    goto :goto_0

    .line 171
    :pswitch_10
    invoke-static {v0, v2}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 172
    .line 173
    .line 174
    move-result v31

    .line 175
    goto :goto_0

    .line 176
    :pswitch_11
    invoke-static {v0, v2}, LB2/b;->p(Landroid/os/Parcel;I)I

    .line 177
    .line 178
    .line 179
    move-result v30

    .line 180
    goto :goto_0

    .line 181
    :pswitch_12
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v28

    .line 185
    goto :goto_0

    .line 186
    :pswitch_13
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v26

    .line 190
    goto :goto_0

    .line 191
    :pswitch_14
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v25

    .line 195
    goto :goto_0

    .line 196
    :pswitch_15
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 197
    .line 198
    .line 199
    move-result-wide v23

    .line 200
    goto :goto_0

    .line 201
    :pswitch_16
    invoke-static {v0, v2}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 202
    .line 203
    .line 204
    move-result v22

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :pswitch_17
    invoke-static {v0, v2}, LB2/b;->j(Landroid/os/Parcel;I)Z

    .line 208
    .line 209
    .line 210
    move-result v21

    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_18
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v20

    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :pswitch_19
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 220
    .line 221
    .line 222
    move-result-wide v18

    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :pswitch_1a
    invoke-static {v0, v2}, LB2/b;->q(Landroid/os/Parcel;I)J

    .line 226
    .line 227
    .line 228
    move-result-wide v16

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_1b
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :pswitch_1c
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :pswitch_1d
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :pswitch_1e
    invoke-static {v0, v2}, LB2/b;->d(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_0
    invoke-static {v0, v1}, LB2/b;->h(Landroid/os/Parcel;I)V

    .line 256
    .line 257
    .line 258
    new-instance v0, LR2/W5;

    .line 259
    .line 260
    move-object v11, v0

    .line 261
    invoke-direct/range {v11 .. v49}, LR2/W5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJ)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_data_0
    .packed-switch 0x2
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
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_0
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
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [LR2/W5;

    .line 2
    .line 3
    return-object p1
.end method

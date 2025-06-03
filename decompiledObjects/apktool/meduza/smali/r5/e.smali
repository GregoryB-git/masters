.class public final synthetic Lr5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/j;


# instance fields
.field public final synthetic a:Lr5/f;


# direct methods
.method public synthetic constructor <init>(Lr5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/e;->a:Lr5/f;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lr5/e;->a:Lr5/f;

    .line 2
    .line 3
    check-cast p1, Lv3/i0;

    .line 4
    .line 5
    iget-object v1, v0, Lr5/f;->d:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Lr5/f;->g:Lr5/f$c;

    .line 9
    .line 10
    iget-boolean v2, v2, Lr5/f$c;->s0:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    iget-boolean v2, v0, Lr5/f;->f:Z

    .line 17
    .line 18
    if-nez v2, :cond_6

    .line 19
    .line 20
    iget v2, p1, Lv3/i0;->G:I

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    if-le v2, v5, :cond_6

    .line 24
    .line 25
    iget-object v2, p1, Lv3/i0;->t:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const/4 v6, -0x1

    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    sparse-switch v7, :sswitch_data_0

    .line 36
    .line 37
    .line 38
    :goto_0
    move v5, v6

    .line 39
    goto :goto_1

    .line 40
    :sswitch_0
    const-string v5, "audio/eac3"

    .line 41
    .line 42
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v5, 0x3

    .line 50
    goto :goto_1

    .line 51
    :sswitch_1
    const-string v7, "audio/ac4"

    .line 52
    .line 53
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :sswitch_2
    const-string v5, "audio/ac3"

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v5, v4

    .line 70
    goto :goto_1

    .line 71
    :sswitch_3
    const-string v5, "audio/eac3-joc"

    .line 72
    .line 73
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move v5, v3

    .line 81
    :cond_4
    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 82
    .line 83
    .line 84
    :goto_2
    move v2, v3

    .line 85
    goto :goto_3

    .line 86
    :pswitch_0
    move v2, v4

    .line 87
    :goto_3
    const/16 v5, 0x20

    .line 88
    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    :try_start_1
    sget v2, Lv5/e0;->a:I

    .line 92
    .line 93
    if-lt v2, v5, :cond_6

    .line 94
    .line 95
    iget-object v2, v0, Lr5/f;->h:Lr5/f$f;

    .line 96
    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    iget-boolean v2, v2, Lr5/f$f;->b:Z

    .line 100
    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    :cond_5
    sget v2, Lv5/e0;->a:I

    .line 104
    .line 105
    if-lt v2, v5, :cond_7

    .line 106
    .line 107
    iget-object v2, v0, Lr5/f;->h:Lr5/f$f;

    .line 108
    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    iget-boolean v5, v2, Lr5/f$f;->b:Z

    .line 112
    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    invoke-virtual {v2}, Lr5/f$f;->c()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    iget-object v2, v0, Lr5/f;->h:Lr5/f$f;

    .line 122
    .line 123
    invoke-virtual {v2}, Lr5/f$f;->d()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_7

    .line 128
    .line 129
    iget-object v2, v0, Lr5/f;->h:Lr5/f$f;

    .line 130
    .line 131
    iget-object v0, v0, Lr5/f;->i:Lx3/d;

    .line 132
    .line 133
    invoke-virtual {v2, p1, v0}, Lr5/f$f;->a(Lv3/i0;Lx3/d;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    :cond_6
    move v3, v4

    .line 140
    :cond_7
    monitor-exit v1

    .line 141
    return v3

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    throw p1

    .line 145
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.class public final Landroidx/media2/session/SessionTokenImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/SessionTokenImplBase;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media2/session/SessionTokenImplBase;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/session/SessionTokenImplBase;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Landroidx/media2/session/SessionTokenImplBase;->a:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Landroidx/media2/session/SessionTokenImplBase;->a:I

    .line 14
    .line 15
    iget v1, v0, Landroidx/media2/session/SessionTokenImplBase;->b:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Landroidx/media2/session/SessionTokenImplBase;->b:I

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->c:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {p0, v2, v1}, Lb2/c;->u(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->d:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    invoke-virtual {p0, v2, v1}, Lb2/c;->u(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->e:Landroid/os/IBinder;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lb2/c;->v()Landroid/os/IBinder;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->e:Landroid/os/IBinder;

    .line 57
    .line 58
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->f:Landroid/content/ComponentName;

    .line 59
    .line 60
    const/4 v2, 0x6

    .line 61
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Landroid/content/ComponentName;

    .line 66
    .line 67
    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->f:Landroid/content/ComponentName;

    .line 68
    .line 69
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->g:Landroid/os/Bundle;

    .line 70
    .line 71
    const/4 v2, 0x7

    .line 72
    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v0, Landroidx/media2/session/SessionTokenImplBase;->g:Landroid/os/Bundle;

    .line 77
    .line 78
    return-object v0
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
.end method

.method public static write(Landroidx/media2/session/SessionTokenImplBase;Lb2/c;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->a:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->b:I

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-virtual {p1, v1, v0}, Lb2/c;->O(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->d:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    invoke-virtual {p1, v1, v0}, Lb2/c;->O(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->e:Landroid/os/IBinder;

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    invoke-virtual {p1, v1}, Lb2/c;->y(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lb2/c;->P(Landroid/os/IBinder;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->f:Landroid/content/ComponentName;

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-virtual {p1, v0, v1}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Landroidx/media2/session/SessionTokenImplBase;->g:Landroid/os/Bundle;

    .line 44
    .line 45
    const/4 v0, 0x7

    .line 46
    invoke-virtual {p1, v0, p0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    return-void
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

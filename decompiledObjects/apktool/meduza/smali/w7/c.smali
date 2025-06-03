.class public final Lw7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/a;


# static fields
.field public static volatile c:Lw7/c;


# instance fields
.field public final a:Ld7/a;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Ld7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Lw7/c;->a:Ld7/a;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lw7/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lf8/b;)Lw7/b;
    .locals 3

    .line 1
    sget-object v0, Lx7/b;->c:Lo7/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo7/t;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lw7/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lw7/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    if-eqz v1, :cond_2

    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_2
    iget-object v0, p0, Lw7/c;->a:Ld7/a;

    .line 41
    .line 42
    const-string v1, "fiam"

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    new-instance v1, Lx7/a;

    .line 51
    .line 52
    invoke-direct {v1, v0, p2}, Lx7/a;-><init>(Ld7/a;Lf8/b;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const-string v1, "clx"

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    new-instance v1, Lx7/c;

    .line 65
    .line 66
    invoke-direct {v1, v0, p2}, Lx7/c;-><init>(Ld7/a;Lf8/b;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move-object v1, v2

    .line 71
    :goto_1
    if-eqz v1, :cond_5

    .line 72
    .line 73
    iget-object p2, p0, Lw7/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-virtual {p2, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    new-instance p1, Lw7/b;

    .line 79
    .line 80
    invoke-direct {p1}, Lw7/b;-><init>()V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_5
    return-object v2
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

.method public final b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    new-instance p3, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Lx7/b;->c:Lo7/l0;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lo7/t;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    xor-int/2addr v0, v1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    sget-object v0, Lx7/b;->b:Lo7/l0;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lo7/t;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget-object v0, Lx7/b;->d:Lo7/l0;

    .line 30
    .line 31
    iget v3, v0, Lo7/l0;->d:I

    .line 32
    .line 33
    move v4, v2

    .line 34
    :cond_3
    if-ge v4, v3, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    :goto_0
    move v0, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_4
    move v0, v1

    .line 53
    :goto_1
    if-nez v0, :cond_5

    .line 54
    .line 55
    return-void

    .line 56
    :cond_5
    const-string v0, "_cmp"

    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_6
    sget-object v0, Lx7/b;->c:Lo7/l0;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lo7/t;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    xor-int/2addr v0, v1

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_7
    sget-object v0, Lx7/b;->d:Lo7/l0;

    .line 77
    .line 78
    iget v3, v0, Lo7/l0;->d:I

    .line 79
    .line 80
    move v4, v2

    .line 81
    :cond_8
    if-ge v4, v3, :cond_9

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    check-cast v5, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_8

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_9
    const/4 v0, -0x1

    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    sparse-switch v3, :sswitch_data_0

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :sswitch_0
    const-string v3, "fiam"

    .line 108
    .line 109
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_a

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_a
    const/4 v0, 0x2

    .line 117
    goto :goto_2

    .line 118
    :sswitch_1
    const-string v3, "fdl"

    .line 119
    .line 120
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_b

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_b
    move v0, v1

    .line 128
    goto :goto_2

    .line 129
    :sswitch_2
    const-string v3, "fcm"

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_c

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_c
    move v0, v2

    .line 139
    :goto_2
    packed-switch v0, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    :goto_3
    move v1, v2

    .line 143
    goto :goto_5

    .line 144
    :pswitch_0
    const-string v0, "fiam_integration"

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :pswitch_1
    const-string v0, "fdl_integration"

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :pswitch_2
    const-string v0, "fcm_integration"

    .line 151
    .line 152
    :goto_4
    const-string v2, "_cis"

    .line 153
    .line 154
    invoke-virtual {p3, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_5
    if-nez v1, :cond_d

    .line 158
    .line 159
    return-void

    .line 160
    :cond_d
    const-string v0, "clx"

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_e

    .line 167
    .line 168
    const-string v0, "_ae"

    .line 169
    .line 170
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_e

    .line 175
    .line 176
    const-wide/16 v0, 0x1

    .line 177
    .line 178
    const-string v2, "_r"

    .line 179
    .line 180
    invoke-virtual {p3, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 181
    .line 182
    .line 183
    :cond_e
    iget-object v0, p0, Lw7/c;->a:Ld7/a;

    .line 184
    .line 185
    iget-object v0, v0, Ld7/a;->a:Lcom/google/android/gms/internal/measurement/zzed;

    .line 186
    .line 187
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzed;->zzb(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :sswitch_data_0
    .sparse-switch
        0x18b50 -> :sswitch_2
        0x18b6e -> :sswitch_1
        0x2ff42f -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lx7/b;->c:Lo7/l0;

    .line 2
    .line 3
    const-string v1, "fcm"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lo7/t;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    xor-int/2addr v0, v2

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lw7/c;->a:Ld7/a;

    .line 15
    .line 16
    iget-object v0, v0, Ld7/a;->a:Lcom/google/android/gms/internal/measurement/zzed;

    .line 17
    .line 18
    const-string v3, "_ln"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v3, p1, v2}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method

.class public final Lga/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lga/j;


# instance fields
.field public final a:Lub/h;

.field public final b:Lu9/d;

.field public final c:Lea/b;

.field public final d:Lga/a;

.field public final e:Lrb/g;

.field public final f:Lvc/d;


# direct methods
.method public constructor <init>(Lub/h;Lu9/d;Lea/b;Lga/f;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga/d;->a:Lub/h;

    iput-object p2, p0, Lga/d;->b:Lu9/d;

    iput-object p3, p0, Lga/d;->c:Lea/b;

    iput-object p4, p0, Lga/d;->d:Lga/a;

    new-instance p1, Lga/c;

    invoke-direct {p1, p5}, Lga/c;-><init>(Lo0/i;)V

    invoke-static {p1}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object p1

    iput-object p1, p0, Lga/d;->e:Lrb/g;

    invoke-static {}, Lb/a0;->e()Lvc/d;

    move-result-object p1

    iput-object p1, p0, Lga/d;->f:Lvc/d;

    return-void
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "compile(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "replaceAll(...)"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0
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


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lga/d;->e()Lga/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lga/i;->b:Lga/g;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lga/g;->a:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "sessionConfigs"

    .line 13
    .line 14
    invoke-static {v0}, Lec/i;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final b()Lmc/a;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lga/d;->e()Lga/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lga/i;->b:Lga/g;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lga/g;->c:Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget v1, Lmc/a;->d:I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sget-object v1, Lmc/c;->d:Lmc/c;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lp2/m0;->c0(ILmc/c;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    new-instance v2, Lmc/a;

    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lmc/a;-><init>(J)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :cond_0
    return-object v1

    .line 33
    :cond_1
    const-string v0, "sessionConfigs"

    .line 34
    .line 35
    invoke-static {v0}, Lec/i;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final c()Ljava/lang/Double;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lga/d;->e()Lga/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lga/i;->b:Lga/g;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lga/g;->b:Ljava/lang/Double;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "sessionConfigs"

    .line 13
    .line 14
    invoke-static {v0}, Lec/i;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final d(Lub/e;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lga/d$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lga/d$a;

    .line 7
    .line 8
    iget v1, v0, Lga/d$a;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lga/d$a;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lga/d$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lga/d$a;-><init>(Lga/d;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lga/d$a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lga/d$a;->e:I

    .line 30
    .line 31
    const-string v3, "SessionConfigFetcher"

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lvc/a;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    iget-object v2, v0, Lga/d$a;->b:Lvc/a;

    .line 66
    .line 67
    iget-object v8, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v8, Lga/d;

    .line 70
    .line 71
    :try_start_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v2, v0, Lga/d$a;->b:Lvc/a;

    .line 76
    .line 77
    iget-object v8, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v8, Lga/d;

    .line 80
    .line 81
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lga/d;->f:Lvc/d;

    .line 89
    .line 90
    invoke-virtual {p1}, Lvc/d;->e()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0}, Lga/d;->e()Lga/i;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lga/i;->b()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_5

    .line 105
    .line 106
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_5
    iget-object p1, p0, Lga/d;->f:Lvc/d;

    .line 110
    .line 111
    iput-object p0, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p1, v0, Lga/d$a;->b:Lvc/a;

    .line 114
    .line 115
    iput v6, v0, Lga/d$a;->e:I

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Lvc/d;->b(Lwb/c;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-ne v2, v1, :cond_6

    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_6
    move-object v8, p0

    .line 125
    move-object v2, p1

    .line 126
    :goto_1
    :try_start_2
    invoke-virtual {v8}, Lga/d;->e()Lga/i;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lga/i;->b()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_7

    .line 135
    .line 136
    const-string p1, "Remote settings cache not expired. Using cached values."

    .line 137
    .line 138
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    .line 143
    invoke-interface {v2, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_7
    :try_start_3
    sget-object p1, Lea/q;->c:Lea/q$a;

    .line 148
    .line 149
    iget-object v9, v8, Lga/d;->b:Lu9/d;

    .line 150
    .line 151
    iput-object v8, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v2, v0, Lga/d$a;->b:Lvc/a;

    .line 154
    .line 155
    iput v5, v0, Lga/d$a;->e:I

    .line 156
    .line 157
    invoke-virtual {p1, v9, v0}, Lea/q$a;->a(Lu9/d;Lub/e;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, v1, :cond_8

    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_8
    :goto_2
    check-cast p1, Lea/q;

    .line 165
    .line 166
    iget-object p1, p1, Lea/q;->a:Ljava/lang/String;

    .line 167
    .line 168
    const-string v9, ""

    .line 169
    .line 170
    invoke-static {p1, v9}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_9

    .line 175
    .line 176
    const-string p1, "Error getting Firebase Installation ID. Skipping this Session Event."

    .line 177
    .line 178
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 182
    .line 183
    invoke-interface {v2, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :cond_9
    const/4 v9, 0x5

    .line 188
    :try_start_4
    new-array v9, v9, [Lrb/d;

    .line 189
    .line 190
    const-string v10, "X-Crashlytics-Installation-ID"

    .line 191
    .line 192
    new-instance v11, Lrb/d;

    .line 193
    .line 194
    invoke-direct {v11, v10, p1}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    const/4 p1, 0x0

    .line 198
    aput-object v11, v9, p1

    .line 199
    .line 200
    const-string v10, "X-Crashlytics-Device-Model"

    .line 201
    .line 202
    const-string v11, "%s/%s"

    .line 203
    .line 204
    new-array v12, v5, [Ljava/lang/Object;

    .line 205
    .line 206
    sget-object v13, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 207
    .line 208
    aput-object v13, v12, p1

    .line 209
    .line 210
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 211
    .line 212
    aput-object p1, v12, v6

    .line 213
    .line 214
    invoke-static {v12, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {v11, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string v11, "format(format, *args)"

    .line 223
    .line 224
    invoke-static {p1, v11}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {p1}, Lga/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    new-instance v11, Lrb/d;

    .line 235
    .line 236
    invoke-direct {v11, v10, p1}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    aput-object v11, v9, v6

    .line 240
    .line 241
    const-string p1, "X-Crashlytics-OS-Build-Version"

    .line 242
    .line 243
    sget-object v6, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 244
    .line 245
    const-string v10, "INCREMENTAL"

    .line 246
    .line 247
    invoke-static {v6, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v6}, Lga/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    new-instance v10, Lrb/d;

    .line 255
    .line 256
    invoke-direct {v10, p1, v6}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    aput-object v10, v9, v5

    .line 260
    .line 261
    const-string p1, "X-Crashlytics-OS-Display-Version"

    .line 262
    .line 263
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 264
    .line 265
    const-string v6, "RELEASE"

    .line 266
    .line 267
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v5}, Lga/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    new-instance v6, Lrb/d;

    .line 275
    .line 276
    invoke-direct {v6, p1, v5}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    aput-object v6, v9, v4

    .line 280
    .line 281
    const/4 p1, 0x4

    .line 282
    const-string v5, "X-Crashlytics-API-Client-Version"

    .line 283
    .line 284
    iget-object v6, v8, Lga/d;->c:Lea/b;

    .line 285
    .line 286
    iget-object v6, v6, Lea/b;->c:Ljava/lang/String;

    .line 287
    .line 288
    new-instance v10, Lrb/d;

    .line 289
    .line 290
    invoke-direct {v10, v5, v6}, Lrb/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    aput-object v10, v9, p1

    .line 294
    .line 295
    invoke-static {v9}, Lsb/z;->K0([Lrb/d;)Ljava/util/Map;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    const-string v5, "Fetching settings from server."

    .line 300
    .line 301
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    iget-object v3, v8, Lga/d;->d:Lga/a;

    .line 305
    .line 306
    new-instance v5, Lga/d$b;

    .line 307
    .line 308
    invoke-direct {v5, v8, v7}, Lga/d$b;-><init>(Lga/d;Lub/e;)V

    .line 309
    .line 310
    .line 311
    new-instance v6, Lga/d$c;

    .line 312
    .line 313
    invoke-direct {v6, v7}, Lga/d$c;-><init>(Lub/e;)V

    .line 314
    .line 315
    .line 316
    iput-object v2, v0, Lga/d$a;->a:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v7, v0, Lga/d$a;->b:Lvc/a;

    .line 319
    .line 320
    iput v4, v0, Lga/d$a;->e:I

    .line 321
    .line 322
    invoke-interface {v3, p1, v5, v6, v0}, Lga/a;->a(Ljava/util/Map;Lga/d$b;Lga/d$c;Lga/d$a;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 326
    if-ne p1, v1, :cond_a

    .line 327
    .line 328
    return-object v1

    .line 329
    :cond_a
    move-object v0, v2

    .line 330
    :goto_3
    :try_start_5
    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 331
    .line 332
    invoke-interface {v0, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 336
    .line 337
    return-object p1

    .line 338
    :catchall_1
    move-exception p1

    .line 339
    move-object v0, v2

    .line 340
    :goto_4
    invoke-interface {v0, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    throw p1
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
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
.end method

.method public final e()Lga/i;
    .locals 1

    iget-object v0, p0, Lga/d;->e:Lrb/g;

    invoke-virtual {v0}, Lrb/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lga/i;

    return-object v0
.end method

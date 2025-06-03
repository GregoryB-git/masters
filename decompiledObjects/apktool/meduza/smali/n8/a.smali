.class public final Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/a$a;
    }
.end annotation


# static fields
.field public static final a:La9/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La9/e;

    .line 2
    .line 3
    invoke-direct {v0}, La9/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lm8/a;->a:Lm8/a;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lm8/a;->a(Lz8/a;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, La9/e;->d:Z

    .line 13
    .line 14
    new-instance v1, La9/d;

    .line 15
    .line 16
    invoke-direct {v1, v0}, La9/d;-><init>(La9/e;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ln8/a;->a:La9/d;

    .line 20
    .line 21
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/util/JsonReader;)Lm8/s;
    .locals 7

    .line 1
    new-instance v0, Lm8/s$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm8/s$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x2

    .line 29
    const/4 v6, 0x1

    .line 30
    sparse-switch v3, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :sswitch_0
    const-string v3, "importance"

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    move v2, v4

    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    const-string v3, "file"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v2, 0x3

    .line 55
    goto :goto_1

    .line 56
    :sswitch_2
    const-string v3, "pc"

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move v2, v5

    .line 66
    goto :goto_1

    .line 67
    :sswitch_3
    const-string v3, "symbol"

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v2, v6

    .line 77
    goto :goto_1

    .line 78
    :sswitch_4
    const-string v3, "offset"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/4 v2, 0x0

    .line 88
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iput v1, v0, Lm8/s$a;->e:I

    .line 100
    .line 101
    iget-byte v1, v0, Lm8/s$a;->f:B

    .line 102
    .line 103
    or-int/2addr v1, v4

    .line 104
    int-to-byte v1, v1

    .line 105
    iput-byte v1, v0, Lm8/s$a;->f:B

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_1
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, v0, Lm8/s$a;->c:Ljava/lang/String;

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J

    .line 116
    .line 117
    .line 118
    move-result-wide v1

    .line 119
    iput-wide v1, v0, Lm8/s$a;->a:J

    .line 120
    .line 121
    iget-byte v1, v0, Lm8/s$a;->f:B

    .line 122
    .line 123
    or-int/2addr v1, v6

    .line 124
    int-to-byte v1, v1

    .line 125
    iput-byte v1, v0, Lm8/s$a;->f:B

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    iput-object v1, v0, Lm8/s$a;->b:Ljava/lang/String;

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 138
    .line 139
    const-string v0, "Null symbol"

    .line 140
    .line 141
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p0

    .line 145
    :pswitch_4
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    iput-wide v1, v0, Lm8/s$a;->d:J

    .line 150
    .line 151
    iget-byte v1, v0, Lm8/s$a;->f:B

    .line 152
    .line 153
    or-int/2addr v1, v5

    .line 154
    int-to-byte v1, v1

    .line 155
    iput-byte v1, v0, Lm8/s$a;->f:B

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_6
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lm8/s$a;->a()Lm8/s;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :sswitch_data_0
    .sparse-switch
        -0x3cc89b6d -> :sswitch_4
        -0x34e68a68 -> :sswitch_3
        0xdf3 -> :sswitch_2
        0x2ff57c -> :sswitch_1
        0x7eb2da74 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static b(Landroid/util/JsonReader;)Lm8/e;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move-object v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v3, "key"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    const-string v3, "value"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 47
    .line 48
    const-string v0, "Null value"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 62
    .line 63
    const-string v0, "Null key"

    .line 64
    .line 65
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_4
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 70
    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    new-instance p0, Lm8/e;

    .line 78
    .line 79
    invoke-direct {p0, v0, v1}, Lm8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_6
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    if-nez v0, :cond_7

    .line 89
    .line 90
    const-string v0, " key"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    :cond_7
    if-nez v1, :cond_8

    .line 96
    .line 97
    const-string v0, " value"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    const-string v1, "Missing required properties:"

    .line 105
    .line 106
    invoke-static {v1, p0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0
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

.method public static c(Landroid/util/JsonReader;)Lm8/c;
    .locals 8

    .line 1
    new-instance v0, Lm8/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm8/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_a

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x2

    .line 31
    const/4 v7, 0x1

    .line 32
    sparse-switch v3, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :sswitch_0
    const-string v3, "importance"

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_0
    move v2, v4

    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :sswitch_1
    const-string v3, "traceFile"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 v2, 0x7

    .line 60
    goto :goto_1

    .line 61
    :sswitch_2
    const-string v3, "reasonCode"

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v2, 0x6

    .line 71
    goto :goto_1

    .line 72
    :sswitch_3
    const-string v3, "processName"

    .line 73
    .line 74
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const/4 v2, 0x5

    .line 82
    goto :goto_1

    .line 83
    :sswitch_4
    const-string v3, "timestamp"

    .line 84
    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move v2, v5

    .line 93
    goto :goto_1

    .line 94
    :sswitch_5
    const-string v3, "rss"

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_5

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    const/4 v2, 0x3

    .line 104
    goto :goto_1

    .line 105
    :sswitch_6
    const-string v3, "pss"

    .line 106
    .line 107
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    move v2, v6

    .line 115
    goto :goto_1

    .line 116
    :sswitch_7
    const-string v3, "pid"

    .line 117
    .line 118
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    move v2, v7

    .line 126
    goto :goto_1

    .line 127
    :sswitch_8
    const-string v3, "buildIdMappingForArch"

    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    const/4 v2, 0x0

    .line 137
    :goto_1
    const/16 v1, 0x10

    .line 138
    .line 139
    packed-switch v2, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :pswitch_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput v1, v0, Lm8/c$a;->d:I

    .line 152
    .line 153
    iget-byte v1, v0, Lm8/c$a;->j:B

    .line 154
    .line 155
    or-int/2addr v1, v5

    .line 156
    int-to-byte v1, v1

    .line 157
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :pswitch_1
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iput-object v1, v0, Lm8/c$a;->h:Ljava/lang/String;

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :pswitch_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    iput v1, v0, Lm8/c$a;->c:I

    .line 174
    .line 175
    iget-byte v1, v0, Lm8/c$a;->j:B

    .line 176
    .line 177
    or-int/2addr v1, v6

    .line 178
    int-to-byte v1, v1

    .line 179
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    iput-object v1, v0, Lm8/c$a;->b:Ljava/lang/String;

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_9
    new-instance p0, Ljava/lang/NullPointerException;

    .line 194
    .line 195
    const-string v0, "Null processName"

    .line 196
    .line 197
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p0

    .line 201
    :pswitch_4
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J

    .line 202
    .line 203
    .line 204
    move-result-wide v1

    .line 205
    iput-wide v1, v0, Lm8/c$a;->g:J

    .line 206
    .line 207
    iget-byte v1, v0, Lm8/c$a;->j:B

    .line 208
    .line 209
    or-int/lit8 v1, v1, 0x20

    .line 210
    .line 211
    int-to-byte v1, v1

    .line 212
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :pswitch_5
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J

    .line 217
    .line 218
    .line 219
    move-result-wide v2

    .line 220
    iput-wide v2, v0, Lm8/c$a;->f:J

    .line 221
    .line 222
    iget-byte v2, v0, Lm8/c$a;->j:B

    .line 223
    .line 224
    or-int/2addr v1, v2

    .line 225
    int-to-byte v1, v1

    .line 226
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :pswitch_6
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    iput-wide v1, v0, Lm8/c$a;->e:J

    .line 235
    .line 236
    iget-byte v1, v0, Lm8/c$a;->j:B

    .line 237
    .line 238
    or-int/2addr v1, v4

    .line 239
    int-to-byte v1, v1

    .line 240
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :pswitch_7
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    iput v1, v0, Lm8/c$a;->a:I

    .line 249
    .line 250
    iget-byte v1, v0, Lm8/c$a;->j:B

    .line 251
    .line 252
    or-int/2addr v1, v7

    .line 253
    int-to-byte v1, v1

    .line 254
    iput-byte v1, v0, Lm8/c$a;->j:B

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :pswitch_8
    new-instance v2, Lw3/v;

    .line 259
    .line 260
    invoke-direct {v2, v1}, Lw3/v;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {p0, v2}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iput-object v1, v0, Lm8/c$a;->i:Ljava/util/List;

    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_a
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lm8/c$a;->a()Lm8/c;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :sswitch_data_0
    .sparse-switch
        -0x5a5f6366 -> :sswitch_8
        0x1b18b -> :sswitch_7
        0x1b2d0 -> :sswitch_6
        0x1ba52 -> :sswitch_5
        0x3492916 -> :sswitch_4
        0xc0f3d9a -> :sswitch_3
        0x2b0af251 -> :sswitch_2
        0x2b253061 -> :sswitch_1
        0x7eb2da74 -> :sswitch_0
    .end sparse-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
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

.method public static d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/JsonReader;",
            "Ln8/a$a<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V

    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, p0}, Ln8/a$a;->c(Landroid/util/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/util/JsonReader;)Lm8/l;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lm8/l$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lm8/l$a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_3e

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x5

    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x4

    .line 31
    const/4 v7, 0x2

    .line 32
    const/4 v8, 0x1

    .line 33
    sparse-switch v3, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :sswitch_0
    const-string v3, "timestamp"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move v2, v4

    .line 47
    goto :goto_2

    .line 48
    :sswitch_1
    const-string v3, "type"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v2, v6

    .line 58
    goto :goto_2

    .line 59
    :sswitch_2
    const-string v3, "log"

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v2, v5

    .line 69
    goto :goto_2

    .line 70
    :sswitch_3
    const-string v3, "app"

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move v2, v7

    .line 80
    goto :goto_2

    .line 81
    :sswitch_4
    const-string v3, "rollouts"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move v2, v8

    .line 91
    goto :goto_2

    .line 92
    :sswitch_5
    const-string v3, "device"

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_5

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    const/4 v2, 0x0

    .line 102
    goto :goto_2

    .line 103
    :goto_1
    const/4 v2, -0x1

    .line 104
    :goto_2
    const/16 v3, 0x10

    .line 105
    .line 106
    if-eqz v2, :cond_36

    .line 107
    .line 108
    if-eq v2, v8, :cond_31

    .line 109
    .line 110
    if-eq v2, v7, :cond_e

    .line 111
    .line 112
    if-eq v2, v5, :cond_9

    .line 113
    .line 114
    if-eq v2, v6, :cond_7

    .line 115
    .line 116
    if-eq v2, v4, :cond_6

    .line 117
    .line 118
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    iput-wide v2, v1, Lm8/l$a;->a:J

    .line 127
    .line 128
    iget-byte v2, v1, Lm8/l$a;->g:B

    .line 129
    .line 130
    or-int/2addr v2, v8

    .line 131
    int-to-byte v2, v2

    .line 132
    iput-byte v2, v1, Lm8/l$a;->g:B

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_8

    .line 140
    .line 141
    iput-object v2, v1, Lm8/l$a;->b:Ljava/lang/String;

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    .line 146
    .line 147
    const-string v1, "Null type"

    .line 148
    .line 149
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_9
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 154
    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_c

    .line 162
    .line 163
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const-string v4, "content"

    .line 168
    .line 169
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_b

    .line 174
    .line 175
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-eqz v2, :cond_a

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    .line 183
    .line 184
    const-string v1, "Null content"

    .line 185
    .line 186
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 195
    .line 196
    .line 197
    if-eqz v2, :cond_d

    .line 198
    .line 199
    new-instance v3, Lm8/v;

    .line 200
    .line 201
    invoke-direct {v3, v2}, Lm8/v;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iput-object v3, v1, Lm8/l$a;->e:Lm8/f0$e$d$d;

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 209
    .line 210
    const-string v1, "Missing required properties: content"

    .line 211
    .line 212
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0

    .line 216
    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 217
    .line 218
    .line 219
    const/4 v2, 0x0

    .line 220
    const/4 v4, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v10, 0x0

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    move-object v15, v13

    .line 228
    move/from16 v16, v14

    .line 229
    .line 230
    move-object v13, v11

    .line 231
    move-object v14, v12

    .line 232
    move-object v11, v9

    .line 233
    move-object v12, v10

    .line 234
    move-object v10, v4

    .line 235
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    const-string v9, "Missing required properties:"

    .line 240
    .line 241
    if-eqz v4, :cond_2c

    .line 242
    .line 243
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 251
    .line 252
    .line 253
    move-result v17

    .line 254
    sparse-switch v17, :sswitch_data_1

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :sswitch_6
    const-string v7, "currentProcessDetails"

    .line 259
    .line 260
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-nez v4, :cond_f

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_f
    const/4 v4, 0x6

    .line 268
    goto :goto_6

    .line 269
    :sswitch_7
    const-string v7, "uiOrientation"

    .line 270
    .line 271
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-nez v4, :cond_10

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_10
    const/4 v4, 0x5

    .line 279
    goto :goto_6

    .line 280
    :sswitch_8
    const-string v7, "customAttributes"

    .line 281
    .line 282
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-nez v4, :cond_11

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_11
    move v4, v6

    .line 290
    goto :goto_6

    .line 291
    :sswitch_9
    const-string v7, "internalKeys"

    .line 292
    .line 293
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-nez v4, :cond_12

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_12
    move v4, v5

    .line 301
    goto :goto_6

    .line 302
    :sswitch_a
    const-string v7, "execution"

    .line 303
    .line 304
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-nez v4, :cond_13

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_13
    const/4 v4, 0x2

    .line 312
    goto :goto_6

    .line 313
    :sswitch_b
    const-string v7, "background"

    .line 314
    .line 315
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_14

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_14
    move v4, v8

    .line 323
    goto :goto_6

    .line 324
    :sswitch_c
    const-string v7, "appProcessDetails"

    .line 325
    .line 326
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-nez v4, :cond_15

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_15
    const/4 v4, 0x0

    .line 334
    goto :goto_6

    .line 335
    :goto_5
    const/4 v4, -0x1

    .line 336
    :goto_6
    packed-switch v4, :pswitch_data_0

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_13

    .line 343
    .line 344
    :pswitch_0
    invoke-static/range {p0 .. p0}, Ln8/a;->g(Landroid/util/JsonReader;)Lm8/t;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    move-object v14, v4

    .line 349
    goto/16 :goto_13

    .line 350
    .line 351
    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    or-int/lit8 v2, v2, 0x1

    .line 356
    .line 357
    int-to-byte v2, v2

    .line 358
    move/from16 v16, v4

    .line 359
    .line 360
    goto/16 :goto_13

    .line 361
    .line 362
    :pswitch_2
    new-instance v4, Lr3/j;

    .line 363
    .line 364
    invoke-direct {v4, v3}, Lr3/j;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v4}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    move-object v11, v4

    .line 372
    goto/16 :goto_13

    .line 373
    .line 374
    :pswitch_3
    new-instance v4, Le0/d;

    .line 375
    .line 376
    const/16 v7, 0x17

    .line 377
    .line 378
    invoke-direct {v4, v7}, Le0/d;-><init>(I)V

    .line 379
    .line 380
    .line 381
    invoke-static {v0, v4}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    move-object v12, v4

    .line 386
    goto/16 :goto_13

    .line 387
    .line 388
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 389
    .line 390
    .line 391
    const/4 v4, 0x0

    .line 392
    const/4 v7, 0x0

    .line 393
    const/4 v10, 0x0

    .line 394
    const/16 v18, 0x0

    .line 395
    .line 396
    const/16 v19, 0x0

    .line 397
    .line 398
    move-object/from16 v21, v4

    .line 399
    .line 400
    move-object/from16 v22, v7

    .line 401
    .line 402
    move-object/from16 v23, v10

    .line 403
    .line 404
    move-object/from16 v24, v18

    .line 405
    .line 406
    move-object/from16 v25, v19

    .line 407
    .line 408
    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_27

    .line 413
    .line 414
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 422
    .line 423
    .line 424
    move-result v7

    .line 425
    sparse-switch v7, :sswitch_data_2

    .line 426
    .line 427
    .line 428
    goto :goto_8

    .line 429
    :sswitch_d
    const-string v7, "exception"

    .line 430
    .line 431
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-nez v4, :cond_16

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_16
    move v4, v6

    .line 439
    goto :goto_9

    .line 440
    :sswitch_e
    const-string v7, "binaries"

    .line 441
    .line 442
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-nez v4, :cond_17

    .line 447
    .line 448
    goto :goto_8

    .line 449
    :cond_17
    move v4, v5

    .line 450
    goto :goto_9

    .line 451
    :sswitch_f
    const-string v7, "signal"

    .line 452
    .line 453
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    if-nez v4, :cond_18

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_18
    const/4 v4, 0x2

    .line 461
    goto :goto_9

    .line 462
    :sswitch_10
    const-string v7, "threads"

    .line 463
    .line 464
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    if-nez v4, :cond_19

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_19
    move v4, v8

    .line 472
    goto :goto_9

    .line 473
    :sswitch_11
    const-string v7, "appExitInfo"

    .line 474
    .line 475
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-nez v4, :cond_1a

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_1a
    const/4 v4, 0x0

    .line 483
    goto :goto_9

    .line 484
    :goto_8
    const/4 v4, -0x1

    .line 485
    :goto_9
    packed-switch v4, :pswitch_data_1

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 489
    .line 490
    .line 491
    :goto_a
    const/16 v3, 0x10

    .line 492
    .line 493
    const/4 v8, 0x1

    .line 494
    goto :goto_7

    .line 495
    :pswitch_5
    invoke-static/range {p0 .. p0}, Ln8/a;->f(Landroid/util/JsonReader;)Lm8/p;

    .line 496
    .line 497
    .line 498
    move-result-object v22

    .line 499
    goto :goto_7

    .line 500
    :pswitch_6
    new-instance v4, Le0/d;

    .line 501
    .line 502
    const/16 v7, 0x18

    .line 503
    .line 504
    invoke-direct {v4, v7}, Le0/d;-><init>(I)V

    .line 505
    .line 506
    .line 507
    invoke-static {v0, v4}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v25

    .line 511
    if-eqz v25, :cond_1b

    .line 512
    .line 513
    goto :goto_7

    .line 514
    :cond_1b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 515
    .line 516
    const-string v1, "Null binaries"

    .line 517
    .line 518
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :pswitch_7
    const-wide/16 v4, 0x0

    .line 523
    .line 524
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 525
    .line 526
    .line 527
    const/4 v6, 0x0

    .line 528
    const/4 v7, 0x0

    .line 529
    const/4 v10, 0x0

    .line 530
    :goto_b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 531
    .line 532
    .line 533
    move-result v18

    .line 534
    if-eqz v18, :cond_21

    .line 535
    .line 536
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 544
    .line 545
    .line 546
    move-result v19

    .line 547
    sparse-switch v19, :sswitch_data_3

    .line 548
    .line 549
    .line 550
    goto :goto_c

    .line 551
    :sswitch_12
    const-string v8, "name"

    .line 552
    .line 553
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-nez v3, :cond_1c

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_1c
    const/4 v3, 0x2

    .line 561
    goto :goto_d

    .line 562
    :sswitch_13
    const-string v8, "code"

    .line 563
    .line 564
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-nez v3, :cond_1d

    .line 569
    .line 570
    goto :goto_c

    .line 571
    :cond_1d
    const/4 v3, 0x1

    .line 572
    goto :goto_d

    .line 573
    :sswitch_14
    const-string v8, "address"

    .line 574
    .line 575
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-nez v3, :cond_1e

    .line 580
    .line 581
    goto :goto_c

    .line 582
    :cond_1e
    const/4 v3, 0x0

    .line 583
    goto :goto_d

    .line 584
    :goto_c
    const/4 v3, -0x1

    .line 585
    :goto_d
    packed-switch v3, :pswitch_data_2

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 589
    .line 590
    .line 591
    goto :goto_e

    .line 592
    :pswitch_8
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    if-eqz v3, :cond_1f

    .line 597
    .line 598
    move-object v7, v3

    .line 599
    goto :goto_e

    .line 600
    :cond_1f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 601
    .line 602
    const-string v1, "Null name"

    .line 603
    .line 604
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    throw v0

    .line 608
    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    if-eqz v3, :cond_20

    .line 613
    .line 614
    move-object v10, v3

    .line 615
    goto :goto_e

    .line 616
    :cond_20
    new-instance v0, Ljava/lang/NullPointerException;

    .line 617
    .line 618
    const-string v1, "Null code"

    .line 619
    .line 620
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    throw v0

    .line 624
    :pswitch_a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 625
    .line 626
    .line 627
    move-result-wide v3

    .line 628
    or-int/lit8 v5, v6, 0x1

    .line 629
    .line 630
    int-to-byte v5, v5

    .line 631
    move v6, v5

    .line 632
    move-wide v4, v3

    .line 633
    :goto_e
    const/16 v3, 0x10

    .line 634
    .line 635
    const/4 v8, 0x1

    .line 636
    goto :goto_b

    .line 637
    :cond_21
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 638
    .line 639
    .line 640
    const/4 v3, 0x1

    .line 641
    if-ne v6, v3, :cond_23

    .line 642
    .line 643
    if-eqz v7, :cond_23

    .line 644
    .line 645
    if-nez v10, :cond_22

    .line 646
    .line 647
    goto :goto_f

    .line 648
    :cond_22
    new-instance v3, Lm8/q;

    .line 649
    .line 650
    invoke-direct {v3, v7, v10, v4, v5}, Lm8/q;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v24, v3

    .line 654
    .line 655
    goto :goto_10

    .line 656
    :cond_23
    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 659
    .line 660
    .line 661
    if-nez v7, :cond_24

    .line 662
    .line 663
    const-string v1, " name"

    .line 664
    .line 665
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    :cond_24
    if-nez v10, :cond_25

    .line 669
    .line 670
    const-string v1, " code"

    .line 671
    .line 672
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    :cond_25
    const/4 v1, 0x1

    .line 676
    and-int/2addr v1, v6

    .line 677
    if-nez v1, :cond_26

    .line 678
    .line 679
    const-string v1, " address"

    .line 680
    .line 681
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    :cond_26
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 685
    .line 686
    invoke-static {v9, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    throw v1

    .line 694
    :pswitch_b
    new-instance v3, Lr3/j;

    .line 695
    .line 696
    const/16 v4, 0x11

    .line 697
    .line 698
    invoke-direct {v3, v4}, Lr3/j;-><init>(I)V

    .line 699
    .line 700
    .line 701
    invoke-static {v0, v3}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    move-object/from16 v21, v3

    .line 706
    .line 707
    goto :goto_10

    .line 708
    :pswitch_c
    invoke-static/range {p0 .. p0}, Ln8/a;->c(Landroid/util/JsonReader;)Lm8/c;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    move-object/from16 v23, v3

    .line 713
    .line 714
    :goto_10
    const/4 v5, 0x3

    .line 715
    const/4 v6, 0x4

    .line 716
    goto/16 :goto_a

    .line 717
    .line 718
    :cond_27
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 719
    .line 720
    .line 721
    if-eqz v24, :cond_29

    .line 722
    .line 723
    if-nez v25, :cond_28

    .line 724
    .line 725
    goto :goto_11

    .line 726
    :cond_28
    new-instance v3, Lm8/n;

    .line 727
    .line 728
    move-object/from16 v20, v3

    .line 729
    .line 730
    invoke-direct/range {v20 .. v25}, Lm8/n;-><init>(Ljava/util/List;Lm8/f0$e$d$a$b$b;Lm8/f0$a;Lm8/f0$e$d$a$b$c;Ljava/util/List;)V

    .line 731
    .line 732
    .line 733
    move-object v10, v3

    .line 734
    goto :goto_12

    .line 735
    :cond_29
    :goto_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 738
    .line 739
    .line 740
    if-nez v24, :cond_2a

    .line 741
    .line 742
    const-string v1, " signal"

    .line 743
    .line 744
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    :cond_2a
    if-nez v25, :cond_2b

    .line 748
    .line 749
    const-string v1, " binaries"

    .line 750
    .line 751
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    :cond_2b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 755
    .line 756
    invoke-static {v9, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    throw v1

    .line 764
    :pswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    move-object v13, v3

    .line 773
    goto :goto_12

    .line 774
    :pswitch_e
    new-instance v3, Le0/e;

    .line 775
    .line 776
    const/16 v4, 0x16

    .line 777
    .line 778
    invoke-direct {v3, v4}, Le0/e;-><init>(I)V

    .line 779
    .line 780
    .line 781
    invoke-static {v0, v3}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    move-object v15, v3

    .line 786
    :goto_12
    const/4 v5, 0x3

    .line 787
    const/4 v6, 0x4

    .line 788
    :goto_13
    const/16 v3, 0x10

    .line 789
    .line 790
    const/4 v7, 0x2

    .line 791
    const/4 v8, 0x1

    .line 792
    goto/16 :goto_4

    .line 793
    .line 794
    :cond_2c
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 795
    .line 796
    .line 797
    const/4 v3, 0x1

    .line 798
    if-ne v2, v3, :cond_2e

    .line 799
    .line 800
    if-nez v10, :cond_2d

    .line 801
    .line 802
    goto :goto_14

    .line 803
    :cond_2d
    new-instance v2, Lm8/m;

    .line 804
    .line 805
    move-object v9, v2

    .line 806
    invoke-direct/range {v9 .. v16}, Lm8/m;-><init>(Lm8/f0$e$d$a$b;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lm8/f0$e$d$a$c;Ljava/util/List;I)V

    .line 807
    .line 808
    .line 809
    iput-object v2, v1, Lm8/l$a;->c:Lm8/f0$e$d$a;

    .line 810
    .line 811
    goto/16 :goto_0

    .line 812
    .line 813
    :cond_2e
    :goto_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 814
    .line 815
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 816
    .line 817
    .line 818
    if-nez v10, :cond_2f

    .line 819
    .line 820
    const-string v1, " execution"

    .line 821
    .line 822
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    :cond_2f
    const/4 v1, 0x1

    .line 826
    and-int/2addr v1, v2

    .line 827
    if-nez v1, :cond_30

    .line 828
    .line 829
    const-string v1, " uiOrientation"

    .line 830
    .line 831
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    :cond_30
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 835
    .line 836
    invoke-static {v9, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    throw v1

    .line 844
    :cond_31
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 845
    .line 846
    .line 847
    const/4 v2, 0x0

    .line 848
    :goto_15
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    if-eqz v3, :cond_34

    .line 853
    .line 854
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    const-string v4, "assignments"

    .line 862
    .line 863
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    if-nez v3, :cond_32

    .line 868
    .line 869
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 870
    .line 871
    .line 872
    goto :goto_15

    .line 873
    :cond_32
    new-instance v2, Lw3/v;

    .line 874
    .line 875
    const/16 v3, 0xf

    .line 876
    .line 877
    invoke-direct {v2, v3}, Lw3/v;-><init>(I)V

    .line 878
    .line 879
    .line 880
    invoke-static {v0, v2}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    if-eqz v2, :cond_33

    .line 885
    .line 886
    goto :goto_15

    .line 887
    :cond_33
    new-instance v0, Ljava/lang/NullPointerException;

    .line 888
    .line 889
    const-string v1, "Null rolloutAssignments"

    .line 890
    .line 891
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    throw v0

    .line 895
    :cond_34
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 896
    .line 897
    .line 898
    if-eqz v2, :cond_35

    .line 899
    .line 900
    new-instance v3, Lm8/y;

    .line 901
    .line 902
    invoke-direct {v3, v2}, Lm8/y;-><init>(Ljava/util/List;)V

    .line 903
    .line 904
    .line 905
    iput-object v3, v1, Lm8/l$a;->f:Lm8/f0$e$d$f;

    .line 906
    .line 907
    goto/16 :goto_0

    .line 908
    .line 909
    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 910
    .line 911
    const-string v1, "Missing required properties: rolloutAssignments"

    .line 912
    .line 913
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    throw v0

    .line 917
    :cond_36
    new-instance v2, Lm8/u$a;

    .line 918
    .line 919
    invoke-direct {v2}, Lm8/u$a;-><init>()V

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 923
    .line 924
    .line 925
    :goto_16
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    if-eqz v3, :cond_3d

    .line 930
    .line 931
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    sparse-switch v4, :sswitch_data_4

    .line 943
    .line 944
    .line 945
    goto :goto_17

    .line 946
    :sswitch_15
    const-string v4, "proximityOn"

    .line 947
    .line 948
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    if-nez v3, :cond_37

    .line 953
    .line 954
    goto :goto_17

    .line 955
    :cond_37
    const/4 v3, 0x5

    .line 956
    goto :goto_18

    .line 957
    :sswitch_16
    const-string v4, "ramUsed"

    .line 958
    .line 959
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v3

    .line 963
    if-nez v3, :cond_38

    .line 964
    .line 965
    goto :goto_17

    .line 966
    :cond_38
    const/4 v3, 0x4

    .line 967
    goto :goto_18

    .line 968
    :sswitch_17
    const-string v4, "diskUsed"

    .line 969
    .line 970
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v3

    .line 974
    if-nez v3, :cond_39

    .line 975
    .line 976
    goto :goto_17

    .line 977
    :cond_39
    const/4 v3, 0x3

    .line 978
    goto :goto_18

    .line 979
    :sswitch_18
    const-string v4, "orientation"

    .line 980
    .line 981
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v3

    .line 985
    if-nez v3, :cond_3a

    .line 986
    .line 987
    goto :goto_17

    .line 988
    :cond_3a
    const/4 v3, 0x2

    .line 989
    goto :goto_18

    .line 990
    :sswitch_19
    const-string v4, "batteryVelocity"

    .line 991
    .line 992
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    if-nez v3, :cond_3b

    .line 997
    .line 998
    goto :goto_17

    .line 999
    :cond_3b
    const/4 v3, 0x1

    .line 1000
    goto :goto_18

    .line 1001
    :sswitch_1a
    const-string v4, "batteryLevel"

    .line 1002
    .line 1003
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    if-nez v3, :cond_3c

    .line 1008
    .line 1009
    goto :goto_17

    .line 1010
    :cond_3c
    const/4 v3, 0x0

    .line 1011
    goto :goto_18

    .line 1012
    :goto_17
    const/4 v3, -0x1

    .line 1013
    :goto_18
    packed-switch v3, :pswitch_data_3

    .line 1014
    .line 1015
    .line 1016
    const/4 v4, 0x2

    .line 1017
    const/16 v5, 0x10

    .line 1018
    .line 1019
    const/4 v6, 0x1

    .line 1020
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_16

    .line 1024
    :pswitch_f
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    iput-boolean v3, v2, Lm8/u$a;->c:Z

    .line 1029
    .line 1030
    iget-byte v3, v2, Lm8/u$a;->g:B

    .line 1031
    .line 1032
    const/4 v4, 0x2

    .line 1033
    or-int/2addr v3, v4

    .line 1034
    int-to-byte v3, v3

    .line 1035
    iput-byte v3, v2, Lm8/u$a;->g:B

    .line 1036
    .line 1037
    goto :goto_16

    .line 1038
    :pswitch_10
    const/4 v4, 0x2

    .line 1039
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v5

    .line 1043
    iput-wide v5, v2, Lm8/u$a;->e:J

    .line 1044
    .line 1045
    iget-byte v3, v2, Lm8/u$a;->g:B

    .line 1046
    .line 1047
    or-int/lit8 v3, v3, 0x8

    .line 1048
    .line 1049
    int-to-byte v3, v3

    .line 1050
    iput-byte v3, v2, Lm8/u$a;->g:B

    .line 1051
    .line 1052
    goto :goto_16

    .line 1053
    :pswitch_11
    const/4 v4, 0x2

    .line 1054
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v5

    .line 1058
    iput-wide v5, v2, Lm8/u$a;->f:J

    .line 1059
    .line 1060
    iget-byte v3, v2, Lm8/u$a;->g:B

    .line 1061
    .line 1062
    const/16 v5, 0x10

    .line 1063
    .line 1064
    or-int/2addr v3, v5

    .line 1065
    int-to-byte v3, v3

    .line 1066
    iput-byte v3, v2, Lm8/u$a;->g:B

    .line 1067
    .line 1068
    goto/16 :goto_16

    .line 1069
    .line 1070
    :pswitch_12
    const/4 v4, 0x2

    .line 1071
    const/16 v5, 0x10

    .line 1072
    .line 1073
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1074
    .line 1075
    .line 1076
    move-result v3

    .line 1077
    iput v3, v2, Lm8/u$a;->d:I

    .line 1078
    .line 1079
    iget-byte v3, v2, Lm8/u$a;->g:B

    .line 1080
    .line 1081
    or-int/lit8 v3, v3, 0x4

    .line 1082
    .line 1083
    int-to-byte v3, v3

    .line 1084
    iput-byte v3, v2, Lm8/u$a;->g:B

    .line 1085
    .line 1086
    goto/16 :goto_16

    .line 1087
    .line 1088
    :pswitch_13
    const/4 v4, 0x2

    .line 1089
    const/16 v5, 0x10

    .line 1090
    .line 1091
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1092
    .line 1093
    .line 1094
    move-result v3

    .line 1095
    iput v3, v2, Lm8/u$a;->b:I

    .line 1096
    .line 1097
    iget-byte v3, v2, Lm8/u$a;->g:B

    .line 1098
    .line 1099
    const/4 v6, 0x1

    .line 1100
    or-int/2addr v3, v6

    .line 1101
    int-to-byte v3, v3

    .line 1102
    iput-byte v3, v2, Lm8/u$a;->g:B

    .line 1103
    .line 1104
    goto/16 :goto_16

    .line 1105
    .line 1106
    :pswitch_14
    const/4 v4, 0x2

    .line 1107
    const/16 v5, 0x10

    .line 1108
    .line 1109
    const/4 v6, 0x1

    .line 1110
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextDouble()D

    .line 1111
    .line 1112
    .line 1113
    move-result-wide v7

    .line 1114
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    iput-object v3, v2, Lm8/u$a;->a:Ljava/lang/Double;

    .line 1119
    .line 1120
    goto/16 :goto_16

    .line 1121
    .line 1122
    :cond_3d
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v2}, Lm8/u$a;->a()Lm8/u;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    iput-object v2, v1, Lm8/l$a;->d:Lm8/f0$e$d$c;

    .line 1130
    .line 1131
    goto/16 :goto_0

    .line 1132
    .line 1133
    :cond_3e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v1}, Lm8/l$a;->a()Lm8/l;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    return-object v0

    .line 1141
    :sswitch_data_0
    .sparse-switch
        -0x4f94e1aa -> :sswitch_5
        -0xf74cb1e -> :sswitch_4
        0x17a21 -> :sswitch_3
        0x1a344 -> :sswitch_2
        0x368f3a -> :sswitch_1
        0x3492916 -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x53c366ac -> :sswitch_c
        -0x4f67aad2 -> :sswitch_b
        -0x4106f4e8 -> :sswitch_a
        -0x4c83daf -> :sswitch_9
        0x211737a8 -> :sswitch_8
        0x375b6a9c -> :sswitch_7
        0x6e2222ac -> :sswitch_6
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :sswitch_data_2
    .sparse-switch
        -0x51f6ffd3 -> :sswitch_11
        -0x4fbf4c57 -> :sswitch_10
        -0x35ca9158 -> :sswitch_f
        0x37e2e05f -> :sswitch_e
        0x584fd04f -> :sswitch_d
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

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
    :sswitch_data_3
    .sparse-switch
        -0x4468640c -> :sswitch_14
        0x2eaded -> :sswitch_13
        0x337a8b -> :sswitch_12
    .end sparse-switch

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
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

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
    :sswitch_data_4
    .sparse-switch
        -0x65d74289 -> :sswitch_1a
        -0x56c20df6 -> :sswitch_19
        -0x55cd0a30 -> :sswitch_18
        0x10ad56fa -> :sswitch_17
        0x3a34d8fb -> :sswitch_16
        0x5a6876be -> :sswitch_15
    .end sparse-switch

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
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
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
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public static f(Landroid/util/JsonReader;)Lm8/p;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v6, v0

    .line 7
    move-object v2, v1

    .line 8
    move-object v3, v2

    .line 9
    move-object v4, v3

    .line 10
    move-object v5, v4

    .line 11
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v1, :cond_7

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    const/4 v7, -0x1

    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    sparse-switch v8, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :sswitch_0
    const-string v8, "overflowCount"

    .line 38
    .line 39
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 v7, 0x4

    .line 47
    goto :goto_1

    .line 48
    :sswitch_1
    const-string v8, "causedBy"

    .line 49
    .line 50
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v7, 0x3

    .line 58
    goto :goto_1

    .line 59
    :sswitch_2
    const-string v8, "type"

    .line 60
    .line 61
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v7, 0x2

    .line 69
    goto :goto_1

    .line 70
    :sswitch_3
    const-string v8, "reason"

    .line 71
    .line 72
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 v7, 0x1

    .line 80
    goto :goto_1

    .line 81
    :sswitch_4
    const-string v8, "frames"

    .line 82
    .line 83
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const/4 v7, 0x0

    .line 91
    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    or-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    int-to-byte v0, v0

    .line 105
    goto :goto_0

    .line 106
    :pswitch_1
    invoke-static {p0}, Ln8/a;->f(Landroid/util/JsonReader;)Lm8/p;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    goto :goto_0

    .line 111
    :pswitch_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 119
    .line 120
    const-string v0, "Null type"

    .line 121
    .line 122
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :pswitch_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    goto :goto_0

    .line 131
    :pswitch_4
    new-instance v1, Lw3/v;

    .line 132
    .line 133
    const/16 v4, 0x11

    .line 134
    .line 135
    invoke-direct {v1, v4}, Lw3/v;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v1}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    .line 147
    .line 148
    const-string v0, "Null frames"

    .line 149
    .line 150
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :cond_7
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 155
    .line 156
    .line 157
    if-ne v0, v7, :cond_9

    .line 158
    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    if-nez v4, :cond_8

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    new-instance p0, Lm8/p;

    .line 165
    .line 166
    move-object v1, p0

    .line 167
    invoke-direct/range {v1 .. v6}, Lm8/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm8/f0$e$d$a$b$b;I)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :cond_9
    :goto_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    if-nez v2, :cond_a

    .line 177
    .line 178
    const-string v1, " type"

    .line 179
    .line 180
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_a
    if-nez v4, :cond_b

    .line 184
    .line 185
    const-string v1, " frames"

    .line 186
    .line 187
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    :cond_b
    and-int/2addr v0, v7

    .line 191
    if-nez v0, :cond_c

    .line 192
    .line 193
    const-string v0, " overflowCount"

    .line 194
    .line 195
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 199
    .line 200
    const-string v1, "Missing required properties:"

    .line 201
    .line 202
    invoke-static {v1, p0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    nop

    .line 211
    :sswitch_data_0
    .sparse-switch
        -0x4b7d7b5a -> :sswitch_4
        -0x37ba6dbc -> :sswitch_3
        0x368f3a -> :sswitch_2
        0x57bc6d2 -> :sswitch_1
        0x22acde2d -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Landroid/util/JsonReader;)Lm8/t;
    .locals 6

    .line 1
    new-instance v0, Lm8/t$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm8/t$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x2

    .line 28
    const/4 v5, 0x1

    .line 29
    sparse-switch v3, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v3, "importance"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v2, 0x3

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v3, "defaultProcess"

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v2, v4

    .line 54
    goto :goto_1

    .line 55
    :sswitch_2
    const-string v3, "processName"

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v2, v5

    .line 65
    goto :goto_1

    .line 66
    :sswitch_3
    const-string v3, "pid"

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v2, 0x0

    .line 76
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iput v1, v0, Lm8/t$a;->c:I

    .line 88
    .line 89
    iget-byte v1, v0, Lm8/t$a;->e:B

    .line 90
    .line 91
    or-int/2addr v1, v4

    .line 92
    int-to-byte v1, v1

    .line 93
    iput-byte v1, v0, Lm8/t$a;->e:B

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_1
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput-boolean v1, v0, Lm8/t$a;->d:Z

    .line 101
    .line 102
    iget-byte v1, v0, Lm8/t$a;->e:B

    .line 103
    .line 104
    or-int/lit8 v1, v1, 0x4

    .line 105
    .line 106
    int-to-byte v1, v1

    .line 107
    iput-byte v1, v0, Lm8/t$a;->e:B

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    iput-object v1, v0, Lm8/t$a;->a:Ljava/lang/String;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    .line 120
    .line 121
    const-string v0, "Null processName"

    .line 122
    .line 123
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :pswitch_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    iput v1, v0, Lm8/t$a;->b:I

    .line 132
    .line 133
    iget-byte v1, v0, Lm8/t$a;->e:B

    .line 134
    .line 135
    or-int/2addr v1, v5

    .line 136
    int-to-byte v1, v1

    .line 137
    iput-byte v1, v0, Lm8/t$a;->e:B

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_5
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lm8/t$a;->a()Lm8/t;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :sswitch_data_0
    .sparse-switch
        0x1b18b -> :sswitch_3
        0xc0f3d9a -> :sswitch_2
        0x650184ee -> :sswitch_1
        0x7eb2da74 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static h(Landroid/util/JsonReader;)Lm8/b;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lm8/f0;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    new-instance v1, Lm8/b$a;

    .line 6
    .line 7
    invoke-direct {v1}, Lm8/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_49

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const-string v4, "appQualitySessionId"

    .line 31
    .line 32
    const-string v5, "buildVersion"

    .line 33
    .line 34
    const-string v6, "installationUuid"

    .line 35
    .line 36
    const-string v7, "platform"

    .line 37
    .line 38
    const-string v8, "displayVersion"

    .line 39
    .line 40
    const/16 v9, 0x8

    .line 41
    .line 42
    const/4 v10, -0x1

    .line 43
    const/4 v11, 0x3

    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v13, 0x4

    .line 46
    const/4 v14, 0x1

    .line 47
    const/4 v15, 0x2

    .line 48
    sparse-switch v3, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_0
    const-string v3, "session"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_0
    const/16 v2, 0xb

    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :sswitch_1
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :cond_1
    const/16 v2, 0xa

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :sswitch_2
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_2

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_2
    const/16 v2, 0x9

    .line 88
    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :sswitch_3
    const-string v3, "firebaseInstallationId"

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_3

    .line 98
    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :cond_3
    move v2, v9

    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :sswitch_4
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const/4 v2, 0x7

    .line 112
    goto :goto_2

    .line 113
    :sswitch_5
    const-string v3, "gmpAppId"

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    const/4 v2, 0x6

    .line 123
    goto :goto_2

    .line 124
    :sswitch_6
    const-string v3, "firebaseAuthenticationToken"

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_6

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    const/4 v2, 0x5

    .line 134
    goto :goto_2

    .line 135
    :sswitch_7
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_7
    move v2, v13

    .line 143
    goto :goto_2

    .line 144
    :sswitch_8
    const-string v3, "appExitInfo"

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_8

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_8
    move v2, v11

    .line 154
    goto :goto_2

    .line 155
    :sswitch_9
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_9

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_9
    move v2, v15

    .line 163
    goto :goto_2

    .line 164
    :sswitch_a
    const-string v3, "sdkVersion"

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_a

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_a
    move v2, v14

    .line 174
    goto :goto_2

    .line 175
    :sswitch_b
    const-string v3, "ndkPayload"

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_b

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_b
    move v2, v12

    .line 185
    goto :goto_2

    .line 186
    :goto_1
    move v2, v10

    .line 187
    :goto_2
    const-string v3, "Null buildVersion"

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    packed-switch v2, :pswitch_data_0

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :pswitch_0
    new-instance v2, Lm8/h$a;

    .line 199
    .line 200
    invoke-direct {v2}, Lm8/h$a;-><init>()V

    .line 201
    .line 202
    .line 203
    iput-boolean v12, v2, Lm8/h$a;->f:Z

    .line 204
    .line 205
    iget-byte v6, v2, Lm8/h$a;->m:B

    .line 206
    .line 207
    or-int/2addr v6, v15

    .line 208
    int-to-byte v6, v6

    .line 209
    iput-byte v6, v2, Lm8/h$a;->m:B

    .line 210
    .line 211
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 212
    .line 213
    .line 214
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_3e

    .line 219
    .line 220
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    const-string v8, "identifier"

    .line 232
    .line 233
    sparse-switch v7, :sswitch_data_1

    .line 234
    .line 235
    .line 236
    goto/16 :goto_4

    .line 237
    .line 238
    :sswitch_c
    const-string v7, "generatorType"

    .line 239
    .line 240
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-nez v6, :cond_c

    .line 245
    .line 246
    goto/16 :goto_4

    .line 247
    .line 248
    :cond_c
    const/16 v6, 0xb

    .line 249
    .line 250
    goto/16 :goto_5

    .line 251
    .line 252
    :sswitch_d
    const-string v7, "crashed"

    .line 253
    .line 254
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-nez v6, :cond_d

    .line 259
    .line 260
    goto/16 :goto_4

    .line 261
    .line 262
    :cond_d
    const/16 v6, 0xa

    .line 263
    .line 264
    goto/16 :goto_5

    .line 265
    .line 266
    :sswitch_e
    const-string v7, "generator"

    .line 267
    .line 268
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-nez v6, :cond_e

    .line 273
    .line 274
    goto/16 :goto_4

    .line 275
    .line 276
    :cond_e
    const/16 v6, 0x9

    .line 277
    .line 278
    goto/16 :goto_5

    .line 279
    .line 280
    :sswitch_f
    const-string v7, "user"

    .line 281
    .line 282
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_f

    .line 287
    .line 288
    goto/16 :goto_4

    .line 289
    .line 290
    :cond_f
    move v6, v9

    .line 291
    goto/16 :goto_5

    .line 292
    .line 293
    :sswitch_10
    const-string v7, "app"

    .line 294
    .line 295
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-nez v6, :cond_10

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_10
    const/4 v6, 0x7

    .line 303
    goto :goto_5

    .line 304
    :sswitch_11
    const-string v7, "os"

    .line 305
    .line 306
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-nez v6, :cond_11

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_11
    const/4 v6, 0x6

    .line 314
    goto :goto_5

    .line 315
    :sswitch_12
    const-string v7, "events"

    .line 316
    .line 317
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-nez v6, :cond_12

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_12
    const/4 v6, 0x5

    .line 325
    goto :goto_5

    .line 326
    :sswitch_13
    const-string v7, "device"

    .line 327
    .line 328
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-nez v6, :cond_13

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_13
    move v6, v13

    .line 336
    goto :goto_5

    .line 337
    :sswitch_14
    const-string v7, "endedAt"

    .line 338
    .line 339
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-nez v6, :cond_14

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_14
    move v6, v11

    .line 347
    goto :goto_5

    .line 348
    :sswitch_15
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-nez v6, :cond_15

    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_15
    move v6, v15

    .line 356
    goto :goto_5

    .line 357
    :sswitch_16
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-nez v6, :cond_16

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_16
    move v6, v14

    .line 365
    goto :goto_5

    .line 366
    :sswitch_17
    const-string v7, "startedAt"

    .line 367
    .line 368
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-nez v6, :cond_17

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_17
    const/4 v6, 0x0

    .line 376
    goto :goto_5

    .line 377
    :goto_4
    move v6, v10

    .line 378
    :goto_5
    const-string v7, "Null identifier"

    .line 379
    .line 380
    packed-switch v6, :pswitch_data_1

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_3

    .line 387
    .line 388
    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    iput v6, v2, Lm8/h$a;->l:I

    .line 393
    .line 394
    iget-byte v6, v2, Lm8/h$a;->m:B

    .line 395
    .line 396
    or-int/lit8 v6, v6, 0x4

    .line 397
    .line 398
    int-to-byte v6, v6

    .line 399
    iput-byte v6, v2, Lm8/h$a;->m:B

    .line 400
    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :pswitch_2
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    iput-boolean v6, v2, Lm8/h$a;->f:Z

    .line 408
    .line 409
    iget-byte v6, v2, Lm8/h$a;->m:B

    .line 410
    .line 411
    or-int/2addr v6, v15

    .line 412
    int-to-byte v6, v6

    .line 413
    iput-byte v6, v2, Lm8/h$a;->m:B

    .line 414
    .line 415
    goto/16 :goto_3

    .line 416
    .line 417
    :pswitch_3
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    if-eqz v6, :cond_18

    .line 422
    .line 423
    iput-object v6, v2, Lm8/h$a;->a:Ljava/lang/String;

    .line 424
    .line 425
    goto/16 :goto_3

    .line 426
    .line 427
    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    .line 428
    .line 429
    const-string v1, "Null generator"

    .line 430
    .line 431
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v0

    .line 435
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 436
    .line 437
    .line 438
    move-object v6, v5

    .line 439
    :goto_6
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v12

    .line 443
    if-eqz v12, :cond_1b

    .line 444
    .line 445
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v12

    .line 449
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v12

    .line 453
    if-eqz v12, :cond_1a

    .line 454
    .line 455
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    if-eqz v6, :cond_19

    .line 460
    .line 461
    goto :goto_6

    .line 462
    :cond_19
    new-instance v0, Ljava/lang/NullPointerException;

    .line 463
    .line 464
    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    throw v0

    .line 468
    :cond_1a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 469
    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_1b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 473
    .line 474
    .line 475
    if-eqz v6, :cond_1c

    .line 476
    .line 477
    new-instance v7, Lm8/a0;

    .line 478
    .line 479
    invoke-direct {v7, v6}, Lm8/a0;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    iput-object v7, v2, Lm8/h$a;->h:Lm8/f0$e$f;

    .line 483
    .line 484
    goto/16 :goto_3

    .line 485
    .line 486
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 487
    .line 488
    const-string v1, "Missing required properties: identifier"

    .line 489
    .line 490
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    throw v0

    .line 494
    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 495
    .line 496
    .line 497
    move-object/from16 v17, v5

    .line 498
    .line 499
    move-object/from16 v18, v17

    .line 500
    .line 501
    move-object/from16 v19, v18

    .line 502
    .line 503
    move-object/from16 v20, v19

    .line 504
    .line 505
    move-object/from16 v21, v20

    .line 506
    .line 507
    move-object/from16 v22, v21

    .line 508
    .line 509
    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v6

    .line 513
    if-eqz v6, :cond_25

    .line 514
    .line 515
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 523
    .line 524
    .line 525
    const/4 v8, -0x1

    .line 526
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 527
    .line 528
    .line 529
    move-result v12

    .line 530
    sparse-switch v12, :sswitch_data_2

    .line 531
    .line 532
    .line 533
    goto :goto_8

    .line 534
    :sswitch_18
    const-string v12, "displayVersion"

    .line 535
    .line 536
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v6

    .line 540
    if-nez v6, :cond_1d

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_1d
    const/4 v8, 0x5

    .line 544
    goto :goto_8

    .line 545
    :sswitch_19
    const-string v12, "installationUuid"

    .line 546
    .line 547
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v6

    .line 551
    if-nez v6, :cond_1e

    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_1e
    const/4 v8, 0x4

    .line 555
    goto :goto_8

    .line 556
    :sswitch_1a
    const-string v12, "version"

    .line 557
    .line 558
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    if-nez v6, :cond_1f

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_1f
    const/4 v8, 0x3

    .line 566
    goto :goto_8

    .line 567
    :sswitch_1b
    const-string v12, "developmentPlatformVersion"

    .line 568
    .line 569
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    if-nez v6, :cond_20

    .line 574
    .line 575
    goto :goto_8

    .line 576
    :cond_20
    const/4 v8, 0x2

    .line 577
    goto :goto_8

    .line 578
    :sswitch_1c
    const-string v12, "developmentPlatform"

    .line 579
    .line 580
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    if-nez v6, :cond_21

    .line 585
    .line 586
    goto :goto_8

    .line 587
    :cond_21
    const/4 v8, 0x1

    .line 588
    goto :goto_8

    .line 589
    :sswitch_1d
    const-string v12, "identifier"

    .line 590
    .line 591
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    if-nez v6, :cond_22

    .line 596
    .line 597
    goto :goto_8

    .line 598
    :cond_22
    const/4 v8, 0x0

    .line 599
    :goto_8
    packed-switch v8, :pswitch_data_2

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 603
    .line 604
    .line 605
    goto :goto_7

    .line 606
    :pswitch_6
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v19

    .line 610
    goto :goto_7

    .line 611
    :pswitch_7
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v20

    .line 615
    goto :goto_7

    .line 616
    :pswitch_8
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v18

    .line 620
    if-eqz v18, :cond_23

    .line 621
    .line 622
    goto :goto_7

    .line 623
    :cond_23
    new-instance v0, Ljava/lang/NullPointerException;

    .line 624
    .line 625
    const-string v1, "Null version"

    .line 626
    .line 627
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    throw v0

    .line 631
    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v22

    .line 635
    goto :goto_7

    .line 636
    :pswitch_a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v21

    .line 640
    goto/16 :goto_7

    .line 641
    .line 642
    :pswitch_b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v17

    .line 646
    if-eqz v17, :cond_24

    .line 647
    .line 648
    goto/16 :goto_7

    .line 649
    .line 650
    :cond_24
    new-instance v0, Ljava/lang/NullPointerException;

    .line 651
    .line 652
    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v0

    .line 656
    :cond_25
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 657
    .line 658
    .line 659
    if-eqz v17, :cond_27

    .line 660
    .line 661
    if-nez v18, :cond_26

    .line 662
    .line 663
    goto :goto_9

    .line 664
    :cond_26
    new-instance v6, Lm8/i;

    .line 665
    .line 666
    move-object/from16 v16, v6

    .line 667
    .line 668
    invoke-direct/range {v16 .. v22}, Lm8/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    iput-object v6, v2, Lm8/h$a;->g:Lm8/f0$e$a;

    .line 672
    .line 673
    goto/16 :goto_3

    .line 674
    .line 675
    :cond_27
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 678
    .line 679
    .line 680
    if-nez v17, :cond_28

    .line 681
    .line 682
    const-string v1, " identifier"

    .line 683
    .line 684
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    :cond_28
    if-nez v18, :cond_29

    .line 688
    .line 689
    const-string v1, " version"

    .line 690
    .line 691
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    :cond_29
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 695
    .line 696
    const-string v2, "Missing required properties:"

    .line 697
    .line 698
    invoke-static {v2, v0}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    throw v1

    .line 706
    :pswitch_c
    new-instance v6, Lm8/z$a;

    .line 707
    .line 708
    invoke-direct {v6}, Lm8/z$a;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 712
    .line 713
    .line 714
    :goto_a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    if-eqz v7, :cond_30

    .line 719
    .line 720
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v7

    .line 724
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 728
    .line 729
    .line 730
    const/4 v8, -0x1

    .line 731
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 732
    .line 733
    .line 734
    move-result v12

    .line 735
    sparse-switch v12, :sswitch_data_3

    .line 736
    .line 737
    .line 738
    goto :goto_b

    .line 739
    :sswitch_1e
    const-string v12, "platform"

    .line 740
    .line 741
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v7

    .line 745
    if-nez v7, :cond_2a

    .line 746
    .line 747
    goto :goto_b

    .line 748
    :cond_2a
    const/4 v8, 0x3

    .line 749
    goto :goto_b

    .line 750
    :sswitch_1f
    const-string v12, "version"

    .line 751
    .line 752
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-nez v7, :cond_2b

    .line 757
    .line 758
    goto :goto_b

    .line 759
    :cond_2b
    const/4 v8, 0x2

    .line 760
    goto :goto_b

    .line 761
    :sswitch_20
    const-string v12, "jailbroken"

    .line 762
    .line 763
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v7

    .line 767
    if-nez v7, :cond_2c

    .line 768
    .line 769
    goto :goto_b

    .line 770
    :cond_2c
    const/4 v8, 0x1

    .line 771
    goto :goto_b

    .line 772
    :sswitch_21
    const-string v12, "buildVersion"

    .line 773
    .line 774
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v7

    .line 778
    if-nez v7, :cond_2d

    .line 779
    .line 780
    goto :goto_b

    .line 781
    :cond_2d
    const/4 v8, 0x0

    .line 782
    :goto_b
    packed-switch v8, :pswitch_data_3

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 786
    .line 787
    .line 788
    goto :goto_a

    .line 789
    :pswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 790
    .line 791
    .line 792
    move-result v7

    .line 793
    iput v7, v6, Lm8/z$a;->a:I

    .line 794
    .line 795
    iget-byte v7, v6, Lm8/z$a;->e:B

    .line 796
    .line 797
    or-int/lit8 v7, v7, 0x1

    .line 798
    .line 799
    int-to-byte v7, v7

    .line 800
    iput-byte v7, v6, Lm8/z$a;->e:B

    .line 801
    .line 802
    goto :goto_a

    .line 803
    :pswitch_e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v7

    .line 807
    if-eqz v7, :cond_2e

    .line 808
    .line 809
    iput-object v7, v6, Lm8/z$a;->b:Ljava/lang/String;

    .line 810
    .line 811
    goto :goto_a

    .line 812
    :cond_2e
    new-instance v0, Ljava/lang/NullPointerException;

    .line 813
    .line 814
    const-string v1, "Null version"

    .line 815
    .line 816
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    throw v0

    .line 820
    :pswitch_f
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    iput-boolean v7, v6, Lm8/z$a;->d:Z

    .line 825
    .line 826
    iget-byte v7, v6, Lm8/z$a;->e:B

    .line 827
    .line 828
    or-int/2addr v7, v15

    .line 829
    int-to-byte v7, v7

    .line 830
    iput-byte v7, v6, Lm8/z$a;->e:B

    .line 831
    .line 832
    goto :goto_a

    .line 833
    :pswitch_10
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    if-eqz v7, :cond_2f

    .line 838
    .line 839
    iput-object v7, v6, Lm8/z$a;->c:Ljava/lang/String;

    .line 840
    .line 841
    goto :goto_a

    .line 842
    :cond_2f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 843
    .line 844
    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    :cond_30
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v6}, Lm8/z$a;->a()Lm8/z;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    iput-object v6, v2, Lm8/h$a;->i:Lm8/f0$e$e;

    .line 856
    .line 857
    goto/16 :goto_3

    .line 858
    .line 859
    :pswitch_11
    new-instance v6, Le0/d;

    .line 860
    .line 861
    const/16 v7, 0x16

    .line 862
    .line 863
    invoke-direct {v6, v7}, Le0/d;-><init>(I)V

    .line 864
    .line 865
    .line 866
    invoke-static {v0, v6}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v6

    .line 870
    iput-object v6, v2, Lm8/h$a;->k:Ljava/util/List;

    .line 871
    .line 872
    goto/16 :goto_3

    .line 873
    .line 874
    :pswitch_12
    new-instance v6, Lm8/k$a;

    .line 875
    .line 876
    invoke-direct {v6}, Lm8/k$a;-><init>()V

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 880
    .line 881
    .line 882
    :goto_c
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v7

    .line 886
    if-eqz v7, :cond_3d

    .line 887
    .line 888
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 896
    .line 897
    .line 898
    const/4 v8, -0x1

    .line 899
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 900
    .line 901
    .line 902
    move-result v12

    .line 903
    sparse-switch v12, :sswitch_data_4

    .line 904
    .line 905
    .line 906
    goto/16 :goto_d

    .line 907
    .line 908
    :sswitch_22
    const-string v12, "modelClass"

    .line 909
    .line 910
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v7

    .line 914
    if-nez v7, :cond_31

    .line 915
    .line 916
    goto/16 :goto_d

    .line 917
    .line 918
    :cond_31
    const/16 v8, 0x8

    .line 919
    .line 920
    goto/16 :goto_d

    .line 921
    .line 922
    :sswitch_23
    const-string v12, "state"

    .line 923
    .line 924
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v7

    .line 928
    if-nez v7, :cond_32

    .line 929
    .line 930
    goto :goto_d

    .line 931
    :cond_32
    const/4 v8, 0x7

    .line 932
    goto :goto_d

    .line 933
    :sswitch_24
    const-string v12, "model"

    .line 934
    .line 935
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v7

    .line 939
    if-nez v7, :cond_33

    .line 940
    .line 941
    goto :goto_d

    .line 942
    :cond_33
    const/4 v8, 0x6

    .line 943
    goto :goto_d

    .line 944
    :sswitch_25
    const-string v12, "cores"

    .line 945
    .line 946
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v7

    .line 950
    if-nez v7, :cond_34

    .line 951
    .line 952
    goto :goto_d

    .line 953
    :cond_34
    const/4 v8, 0x5

    .line 954
    goto :goto_d

    .line 955
    :sswitch_26
    const-string v12, "diskSpace"

    .line 956
    .line 957
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v7

    .line 961
    if-nez v7, :cond_35

    .line 962
    .line 963
    goto :goto_d

    .line 964
    :cond_35
    const/4 v8, 0x4

    .line 965
    goto :goto_d

    .line 966
    :sswitch_27
    const-string v12, "arch"

    .line 967
    .line 968
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v7

    .line 972
    if-nez v7, :cond_36

    .line 973
    .line 974
    goto :goto_d

    .line 975
    :cond_36
    const/4 v8, 0x3

    .line 976
    goto :goto_d

    .line 977
    :sswitch_28
    const-string v12, "ram"

    .line 978
    .line 979
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    move-result v7

    .line 983
    if-nez v7, :cond_37

    .line 984
    .line 985
    goto :goto_d

    .line 986
    :cond_37
    const/4 v8, 0x2

    .line 987
    goto :goto_d

    .line 988
    :sswitch_29
    const-string v12, "manufacturer"

    .line 989
    .line 990
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v7

    .line 994
    if-nez v7, :cond_38

    .line 995
    .line 996
    goto :goto_d

    .line 997
    :cond_38
    const/4 v8, 0x1

    .line 998
    goto :goto_d

    .line 999
    :sswitch_2a
    const-string v12, "simulator"

    .line 1000
    .line 1001
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v7

    .line 1005
    if-nez v7, :cond_39

    .line 1006
    .line 1007
    goto :goto_d

    .line 1008
    :cond_39
    const/4 v8, 0x0

    .line 1009
    :goto_d
    packed-switch v8, :pswitch_data_4

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 1013
    .line 1014
    .line 1015
    goto/16 :goto_c

    .line 1016
    .line 1017
    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    if-eqz v7, :cond_3a

    .line 1022
    .line 1023
    iput-object v7, v6, Lm8/k$a;->i:Ljava/lang/String;

    .line 1024
    .line 1025
    goto/16 :goto_c

    .line 1026
    .line 1027
    :cond_3a
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1028
    .line 1029
    const-string v1, "Null modelClass"

    .line 1030
    .line 1031
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    throw v0

    .line 1035
    :pswitch_14
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1036
    .line 1037
    .line 1038
    move-result v7

    .line 1039
    iput v7, v6, Lm8/k$a;->g:I

    .line 1040
    .line 1041
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1042
    .line 1043
    or-int/lit8 v7, v7, 0x20

    .line 1044
    .line 1045
    int-to-byte v7, v7

    .line 1046
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1047
    .line 1048
    goto/16 :goto_c

    .line 1049
    .line 1050
    :pswitch_15
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v7

    .line 1054
    if-eqz v7, :cond_3b

    .line 1055
    .line 1056
    iput-object v7, v6, Lm8/k$a;->b:Ljava/lang/String;

    .line 1057
    .line 1058
    goto/16 :goto_c

    .line 1059
    .line 1060
    :cond_3b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1061
    .line 1062
    const-string v1, "Null model"

    .line 1063
    .line 1064
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    throw v0

    .line 1068
    :pswitch_16
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1069
    .line 1070
    .line 1071
    move-result v7

    .line 1072
    iput v7, v6, Lm8/k$a;->c:I

    .line 1073
    .line 1074
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1075
    .line 1076
    or-int/2addr v7, v15

    .line 1077
    int-to-byte v7, v7

    .line 1078
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1079
    .line 1080
    goto/16 :goto_c

    .line 1081
    .line 1082
    :pswitch_17
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1083
    .line 1084
    .line 1085
    move-result-wide v7

    .line 1086
    iput-wide v7, v6, Lm8/k$a;->e:J

    .line 1087
    .line 1088
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1089
    .line 1090
    or-int/2addr v7, v9

    .line 1091
    int-to-byte v7, v7

    .line 1092
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1093
    .line 1094
    goto/16 :goto_c

    .line 1095
    .line 1096
    :pswitch_18
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1097
    .line 1098
    .line 1099
    move-result v7

    .line 1100
    iput v7, v6, Lm8/k$a;->a:I

    .line 1101
    .line 1102
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1103
    .line 1104
    or-int/lit8 v7, v7, 0x1

    .line 1105
    .line 1106
    int-to-byte v7, v7

    .line 1107
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1108
    .line 1109
    goto/16 :goto_c

    .line 1110
    .line 1111
    :pswitch_19
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1112
    .line 1113
    .line 1114
    move-result-wide v7

    .line 1115
    iput-wide v7, v6, Lm8/k$a;->d:J

    .line 1116
    .line 1117
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1118
    .line 1119
    or-int/lit8 v7, v7, 0x4

    .line 1120
    .line 1121
    int-to-byte v7, v7

    .line 1122
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1123
    .line 1124
    goto/16 :goto_c

    .line 1125
    .line 1126
    :pswitch_1a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v7

    .line 1130
    if-eqz v7, :cond_3c

    .line 1131
    .line 1132
    iput-object v7, v6, Lm8/k$a;->h:Ljava/lang/String;

    .line 1133
    .line 1134
    goto/16 :goto_c

    .line 1135
    .line 1136
    :cond_3c
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1137
    .line 1138
    const-string v1, "Null manufacturer"

    .line 1139
    .line 1140
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    throw v0

    .line 1144
    :pswitch_1b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v7

    .line 1148
    iput-boolean v7, v6, Lm8/k$a;->f:Z

    .line 1149
    .line 1150
    iget-byte v7, v6, Lm8/k$a;->j:B

    .line 1151
    .line 1152
    or-int/lit8 v7, v7, 0x10

    .line 1153
    .line 1154
    int-to-byte v7, v7

    .line 1155
    iput-byte v7, v6, Lm8/k$a;->j:B

    .line 1156
    .line 1157
    goto/16 :goto_c

    .line 1158
    .line 1159
    :cond_3d
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v6}, Lm8/k$a;->a()Lm8/k;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v6

    .line 1166
    iput-object v6, v2, Lm8/h$a;->j:Lm8/f0$e$c;

    .line 1167
    .line 1168
    goto/16 :goto_3

    .line 1169
    .line 1170
    :pswitch_1c
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1171
    .line 1172
    .line 1173
    move-result-wide v6

    .line 1174
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v6

    .line 1178
    iput-object v6, v2, Lm8/h$a;->e:Ljava/lang/Long;

    .line 1179
    .line 1180
    goto/16 :goto_3

    .line 1181
    .line 1182
    :pswitch_1d
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v6

    .line 1186
    invoke-static {v6, v15}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    new-instance v7, Ljava/lang/String;

    .line 1191
    .line 1192
    sget-object v8, Lm8/f0;->a:Ljava/nio/charset/Charset;

    .line 1193
    .line 1194
    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1195
    .line 1196
    .line 1197
    iput-object v7, v2, Lm8/h$a;->b:Ljava/lang/String;

    .line 1198
    .line 1199
    goto/16 :goto_3

    .line 1200
    .line 1201
    :pswitch_1e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v6

    .line 1205
    iput-object v6, v2, Lm8/h$a;->c:Ljava/lang/String;

    .line 1206
    .line 1207
    goto/16 :goto_3

    .line 1208
    .line 1209
    :pswitch_1f
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextLong()J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v6

    .line 1213
    iput-wide v6, v2, Lm8/h$a;->d:J

    .line 1214
    .line 1215
    iget-byte v6, v2, Lm8/h$a;->m:B

    .line 1216
    .line 1217
    or-int/lit8 v6, v6, 0x1

    .line 1218
    .line 1219
    int-to-byte v6, v6

    .line 1220
    iput-byte v6, v2, Lm8/h$a;->m:B

    .line 1221
    .line 1222
    goto/16 :goto_3

    .line 1223
    .line 1224
    :cond_3e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v2}, Lm8/h$a;->a()Lm8/h;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    iput-object v2, v1, Lm8/b$a;->j:Lm8/f0$e;

    .line 1232
    .line 1233
    goto/16 :goto_0

    .line 1234
    .line 1235
    :pswitch_20
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    if-eqz v2, :cond_3f

    .line 1240
    .line 1241
    iput-object v2, v1, Lm8/b$a;->i:Ljava/lang/String;

    .line 1242
    .line 1243
    goto/16 :goto_0

    .line 1244
    .line 1245
    :cond_3f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1246
    .line 1247
    const-string v1, "Null displayVersion"

    .line 1248
    .line 1249
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    throw v0

    .line 1253
    :pswitch_21
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 1254
    .line 1255
    .line 1256
    move-result v2

    .line 1257
    iput v2, v1, Lm8/b$a;->c:I

    .line 1258
    .line 1259
    iget-byte v2, v1, Lm8/b$a;->m:B

    .line 1260
    .line 1261
    or-int/lit8 v2, v2, 0x1

    .line 1262
    .line 1263
    int-to-byte v2, v2

    .line 1264
    iput-byte v2, v1, Lm8/b$a;->m:B

    .line 1265
    .line 1266
    goto/16 :goto_0

    .line 1267
    .line 1268
    :pswitch_22
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v2

    .line 1272
    iput-object v2, v1, Lm8/b$a;->e:Ljava/lang/String;

    .line 1273
    .line 1274
    goto/16 :goto_0

    .line 1275
    .line 1276
    :pswitch_23
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    if-eqz v2, :cond_40

    .line 1281
    .line 1282
    iput-object v2, v1, Lm8/b$a;->d:Ljava/lang/String;

    .line 1283
    .line 1284
    goto/16 :goto_0

    .line 1285
    .line 1286
    :cond_40
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1287
    .line 1288
    const-string v1, "Null installationUuid"

    .line 1289
    .line 1290
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1291
    .line 1292
    .line 1293
    throw v0

    .line 1294
    :pswitch_24
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    if-eqz v2, :cond_41

    .line 1299
    .line 1300
    iput-object v2, v1, Lm8/b$a;->b:Ljava/lang/String;

    .line 1301
    .line 1302
    goto/16 :goto_0

    .line 1303
    .line 1304
    :cond_41
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1305
    .line 1306
    const-string v1, "Null gmpAppId"

    .line 1307
    .line 1308
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    throw v0

    .line 1312
    :pswitch_25
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    iput-object v2, v1, Lm8/b$a;->f:Ljava/lang/String;

    .line 1317
    .line 1318
    goto/16 :goto_0

    .line 1319
    .line 1320
    :pswitch_26
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    if-eqz v2, :cond_42

    .line 1325
    .line 1326
    iput-object v2, v1, Lm8/b$a;->h:Ljava/lang/String;

    .line 1327
    .line 1328
    goto/16 :goto_0

    .line 1329
    .line 1330
    :cond_42
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1331
    .line 1332
    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1333
    .line 1334
    .line 1335
    throw v0

    .line 1336
    :pswitch_27
    invoke-static/range {p0 .. p0}, Ln8/a;->c(Landroid/util/JsonReader;)Lm8/c;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    iput-object v2, v1, Lm8/b$a;->l:Lm8/f0$a;

    .line 1341
    .line 1342
    goto/16 :goto_0

    .line 1343
    .line 1344
    :pswitch_28
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v2

    .line 1348
    iput-object v2, v1, Lm8/b$a;->g:Ljava/lang/String;

    .line 1349
    .line 1350
    goto/16 :goto_0

    .line 1351
    .line 1352
    :pswitch_29
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    if-eqz v2, :cond_43

    .line 1357
    .line 1358
    iput-object v2, v1, Lm8/b$a;->a:Ljava/lang/String;

    .line 1359
    .line 1360
    goto/16 :goto_0

    .line 1361
    .line 1362
    :cond_43
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1363
    .line 1364
    const-string v1, "Null sdkVersion"

    .line 1365
    .line 1366
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1367
    .line 1368
    .line 1369
    throw v0

    .line 1370
    :pswitch_2a
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 1371
    .line 1372
    .line 1373
    move-object v2, v5

    .line 1374
    :goto_e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-eqz v3, :cond_47

    .line 1379
    .line 1380
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    const-string v4, "files"

    .line 1388
    .line 1389
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v4

    .line 1393
    if-nez v4, :cond_45

    .line 1394
    .line 1395
    const-string v4, "orgId"

    .line 1396
    .line 1397
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v3

    .line 1401
    if-nez v3, :cond_44

    .line 1402
    .line 1403
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 1404
    .line 1405
    .line 1406
    goto :goto_e

    .line 1407
    :cond_44
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    goto :goto_e

    .line 1412
    :cond_45
    new-instance v3, Le0/e;

    .line 1413
    .line 1414
    const/16 v4, 0x15

    .line 1415
    .line 1416
    invoke-direct {v3, v4}, Le0/e;-><init>(I)V

    .line 1417
    .line 1418
    .line 1419
    invoke-static {v0, v3}, Ln8/a;->d(Landroid/util/JsonReader;Ln8/a$a;)Ljava/util/List;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v5

    .line 1423
    if-eqz v5, :cond_46

    .line 1424
    .line 1425
    goto :goto_e

    .line 1426
    :cond_46
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1427
    .line 1428
    const-string v1, "Null files"

    .line 1429
    .line 1430
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    throw v0

    .line 1434
    :cond_47
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1435
    .line 1436
    .line 1437
    if-eqz v5, :cond_48

    .line 1438
    .line 1439
    new-instance v3, Lm8/f;

    .line 1440
    .line 1441
    invoke-direct {v3, v5, v2}, Lm8/f;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1442
    .line 1443
    .line 1444
    iput-object v3, v1, Lm8/b$a;->k:Lm8/f0$d;

    .line 1445
    .line 1446
    goto/16 :goto_0

    .line 1447
    .line 1448
    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1449
    .line 1450
    const-string v1, "Missing required properties: files"

    .line 1451
    .line 1452
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    throw v0

    .line 1456
    :cond_49
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v1}, Lm8/b$a;->a()Lm8/b;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    return-object v0

    .line 1464
    nop

    .line 1465
    :sswitch_data_0
    .sparse-switch
        -0x7e43cda7 -> :sswitch_b
        -0x74fb5cc2 -> :sswitch_a
        -0x71ad57ad -> :sswitch_9
        -0x51f6ffd3 -> :sswitch_8
        -0x36578976 -> :sswitch_7
        -0x17f5db26 -> :sswitch_6
        0x14879cf2 -> :sswitch_5
        0x2ae81915 -> :sswitch_4
        0x3e71e6dc -> :sswitch_3
        0x6fbd6873 -> :sswitch_2
        0x75c19db6 -> :sswitch_1
        0x76508296 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_0
    .end packed-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x7ee2d36c -> :sswitch_17
        -0x71ad57ad -> :sswitch_16
        -0x60775357 -> :sswitch_15
        -0x5fc4f373 -> :sswitch_14
        -0x4f94e1aa -> :sswitch_13
        -0x4cf81ee7 -> :sswitch_12
        0xde4 -> :sswitch_11
        0x17a21 -> :sswitch_10
        0x36ebcb -> :sswitch_f
        0x111a9ad3 -> :sswitch_e
        0x3d1e2286 -> :sswitch_d
        0x7a02fcad -> :sswitch_c
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_12
        :pswitch_11
        :pswitch_c
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

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
    :sswitch_data_2
    .sparse-switch
        -0x60775357 -> :sswitch_1d
        -0x1ef60132 -> :sswitch_1c
        0xcbc122a -> :sswitch_1b
        0x14f51cd8 -> :sswitch_1a
        0x2ae81915 -> :sswitch_19
        0x75c19db6 -> :sswitch_18
    .end sparse-switch

    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    :sswitch_data_3
    .sparse-switch
        -0x36578976 -> :sswitch_21
        -0x11773b11 -> :sswitch_20
        0x14f51cd8 -> :sswitch_1f
        0x6fbd6873 -> :sswitch_1e
    .end sparse-switch

    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    :sswitch_data_4
    .sparse-switch
        -0x7618bbfc -> :sswitch_2a
        -0x7561dc2f -> :sswitch_29
        0x1b81e -> :sswitch_28
        0x2dd056 -> :sswitch_27
        0x4dfed69 -> :sswitch_26
        0x5a744b4 -> :sswitch_25
        0x633fb29 -> :sswitch_24
        0x68ac491 -> :sswitch_23
        0x7bea4fcf -> :sswitch_22
    .end sparse-switch

    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public static i(Ljava/lang/String;)Lm8/b;
    .locals 2

    :try_start_0
    new-instance v0, Landroid/util/JsonReader;

    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0}, Ln8/a;->h(Landroid/util/JsonReader;)Lm8/b;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

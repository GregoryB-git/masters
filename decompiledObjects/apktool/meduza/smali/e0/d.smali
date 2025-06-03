.class public final synthetic Le0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/f$b;
.implements Lr3/t$a;
.implements Lv3/g$a;
.implements Lv5/e;
.implements Lc4/f$a$a;
.implements Lu4/g$a;
.implements Lca/e$a;
.implements Lt9/a$a;
.implements Ln8/a$a;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Ln9/j;
.implements Ld8/e;
.implements Ln7/q;
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le0/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw3/b$a;Ljava/lang/Exception;I)V
    .locals 0

    .line 2
    iput p3, p0, Le0/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le9/e;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La4/g$a;

    invoke-virtual {p1}, La4/g$a;->c()V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Le0/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_3

    .line 8
    :pswitch_0
    check-cast p1, Landroid/database/Cursor;

    .line 9
    .line 10
    sget-object v0, Lr3/t;->f:Lh3/c;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lk3/s;->a()Lk3/j$a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, v3}, Lk3/j$a;->b(Ljava/lang/String;)Lk3/j$a;

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v3}, Lu3/a;->b(I)Lh3/e;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Lk3/j$a;->c(Lh3/e;)Lk3/j$a;

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_0

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_1
    iput-object v3, v2, Lk3/j$a;->b:[B

    .line 61
    .line 62
    invoke-virtual {v2}, Lk3/j$a;->a()Lk3/j;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-object v0

    .line 71
    :pswitch_1
    check-cast p1, Landroid/database/Cursor;

    .line 72
    .line 73
    sget-object v0, Lr3/t;->f:Lh3/c;

    .line 74
    .line 75
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :goto_3
    check-cast p1, Landroid/database/Cursor;

    .line 94
    .line 95
    sget-object v0, Lr3/t;->f:Lh3/c;

    .line 96
    .line 97
    new-instance v0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    move v2, v1

    .line 103
    :goto_4
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    array-length v3, v3

    .line 117
    add-int/2addr v2, v3

    .line 118
    goto :goto_4

    .line 119
    :cond_3
    new-array p1, v2, [B

    .line 120
    .line 121
    move v2, v1

    .line 122
    move v3, v2

    .line 123
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-ge v2, v4, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, [B

    .line 134
    .line 135
    array-length v5, v4

    .line 136
    invoke-static {v4, v1, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    .line 138
    .line 139
    array-length v4, v4

    .line 140
    add-int/2addr v3, v4

    .line 141
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_4
    return-object p1

    .line 145
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public b()Ljava/lang/reflect/Constructor;
    .locals 2

    sget-object v0, Lc4/f;->e:[I

    const-string v0, "com.google.android.exoplayer2.decoder.midi.MidiExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lc4/h;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Le0/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-static {p1}, Ln8/a;->b(Landroid/util/JsonReader;)Lm8/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :pswitch_1
    invoke-static {p1}, Ln8/a;->e(Landroid/util/JsonReader;)Lm8/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :goto_0
    sget-object v0, Ln8/a;->a:La9/d;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginObject()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    move-wide v4, v1

    .line 27
    move-object v6, v3

    .line 28
    move-object v7, v6

    .line 29
    move-wide v2, v4

    .line 30
    :goto_1
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v8, 0x3

    .line 35
    const/4 v9, 0x2

    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    const/4 v8, -0x1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    sparse-switch v10, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :sswitch_0
    const-string v10, "baseAddress"

    .line 58
    .line 59
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_0
    const/4 v8, 0x3

    .line 67
    goto :goto_2

    .line 68
    :sswitch_1
    const-string v10, "uuid"

    .line 69
    .line 70
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    const/4 v8, 0x2

    .line 78
    goto :goto_2

    .line 79
    :sswitch_2
    const-string v10, "size"

    .line 80
    .line 81
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 v8, 0x1

    .line 89
    goto :goto_2

    .line 90
    :sswitch_3
    const-string v10, "name"

    .line 91
    .line 92
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const/4 v8, 0x0

    .line 100
    :goto_2
    packed-switch v8, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/util/JsonReader;->skipValue()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_2
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextLong()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    or-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    move-wide v2, v1

    .line 114
    goto :goto_3

    .line 115
    :pswitch_3
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v7, Ljava/lang/String;

    .line 124
    .line 125
    sget-object v8, Lm8/f0;->a:Ljava/nio/charset/Charset;

    .line 126
    .line 127
    invoke-direct {v7, v1, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_4
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextLong()J

    .line 132
    .line 133
    .line 134
    move-result-wide v4

    .line 135
    or-int/lit8 v0, v0, 0x2

    .line 136
    .line 137
    :goto_3
    int-to-byte v0, v0

    .line 138
    goto :goto_1

    .line 139
    :pswitch_5
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    if-eqz v6, :cond_4

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 147
    .line 148
    const-string v0, "Null name"

    .line 149
    .line 150
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_5
    invoke-virtual {p1}, Landroid/util/JsonReader;->endObject()V

    .line 155
    .line 156
    .line 157
    if-ne v0, v8, :cond_7

    .line 158
    .line 159
    if-nez v6, :cond_6

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    new-instance p1, Lm8/o;

    .line 163
    .line 164
    move-object v1, p1

    .line 165
    invoke-direct/range {v1 .. v7}, Lm8/o;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_7
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    and-int/lit8 v1, v0, 0x1

    .line 175
    .line 176
    if-nez v1, :cond_8

    .line 177
    .line 178
    const-string v1, " baseAddress"

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_8
    and-int/lit8 v0, v0, 0x2

    .line 184
    .line 185
    if-nez v0, :cond_9

    .line 186
    .line 187
    const-string v0, " size"

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :cond_9
    if-nez v6, :cond_a

    .line 193
    .line 194
    const-string v0, " name"

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string v1, "Missing required properties:"

    .line 202
    .line 203
    invoke-static {v1, p1}, La0/j;->l(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    :sswitch_data_0
    .sparse-switch
        0x337a8b -> :sswitch_3
        0x35e001 -> :sswitch_2
        0x36f3bb -> :sswitch_1
        0x44c50fe3 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public d(IIIII)Z
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x4d

    const/16 v2, 0x43

    if-ne p2, v2, :cond_0

    const/16 v2, 0x4f

    if-ne p3, v2, :cond_0

    if-ne p4, v1, :cond_0

    if-eq p5, v1, :cond_1

    if-eq p1, v0, :cond_1

    :cond_0
    if-ne p2, v1, :cond_2

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_2

    if-ne p4, p2, :cond_2

    const/16 p2, 0x54

    if-eq p5, p2, :cond_1

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/os/Bundle;)Lv3/g;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Le0/d;->a:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    sparse-switch v2, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :sswitch_0
    sget-object v2, Lr5/l;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v3, Lz4/i0;->p:Le0/d;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Le0/d;->f(Landroid/os/Bundle;)Lv3/g;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lz4/i0;

    .line 31
    .line 32
    sget-object v3, Lr5/l;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v3, Lr5/l;

    .line 42
    .line 43
    array-length v4, v1

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v4, Lr7/a$a;

    .line 52
    .line 53
    array-length v6, v1

    .line 54
    invoke-direct {v4, v5, v6, v1}, Lr7/a$a;-><init>(II[I)V

    .line 55
    .line 56
    .line 57
    move-object v1, v4

    .line 58
    :goto_0
    invoke-direct {v3, v2, v1}, Lr5/l;-><init>(Lz4/i0;Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :sswitch_1
    sget-object v2, La5/a$a;->q:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    sget-object v2, La5/a$a;->r:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    sget-object v2, La5/a$a;->x:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    sget-object v2, La5/a$a;->s:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, La5/a$a;->t:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    sget-object v4, La5/a$a;->u:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    sget-object v6, La5/a$a;->v:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    sget-object v6, La5/a$a;->w:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v16

    .line 110
    new-instance v1, La5/a$a;

    .line 111
    .line 112
    if-nez v3, :cond_1

    .line 113
    .line 114
    new-array v3, v5, [I

    .line 115
    .line 116
    :cond_1
    move-object v11, v3

    .line 117
    if-nez v2, :cond_2

    .line 118
    .line 119
    new-array v2, v5, [Landroid/net/Uri;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    new-array v3, v5, [Landroid/net/Uri;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, [Landroid/net/Uri;

    .line 129
    .line 130
    :goto_1
    move-object v12, v2

    .line 131
    if-nez v4, :cond_3

    .line 132
    .line 133
    new-array v2, v5, [J

    .line 134
    .line 135
    move-object v13, v2

    .line 136
    goto :goto_2

    .line 137
    :cond_3
    move-object v13, v4

    .line 138
    :goto_2
    move-object v6, v1

    .line 139
    invoke-direct/range {v6 .. v16}, La5/a$a;-><init>(JII[I[Landroid/net/Uri;[JJZ)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :sswitch_2
    sget-object v2, Lz4/i0;->f:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-nez v2, :cond_4

    .line 150
    .line 151
    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 152
    .line 153
    sget-object v2, Lo7/l0;->e:Lo7/l0;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    sget-object v3, Lv3/i0;->x0:Le0/e;

    .line 157
    .line 158
    invoke-static {v3, v2}, Lv5/b;->a(Lv3/g$a;Ljava/util/ArrayList;)Lo7/l0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_3
    sget-object v3, Lz4/i0;->o:Ljava/lang/String;

    .line 163
    .line 164
    const-string v4, ""

    .line 165
    .line 166
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    new-instance v3, Lz4/i0;

    .line 171
    .line 172
    new-array v4, v5, [Lv3/i0;

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Lo7/r;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, [Lv3/i0;

    .line 179
    .line 180
    invoke-direct {v3, v1, v2}, Lz4/i0;-><init>(Ljava/lang/String;[Lv3/i0;)V

    .line 181
    .line 182
    .line 183
    return-object v3

    .line 184
    :sswitch_3
    sget-object v2, Lv3/q1;->e:Ljava/lang/String;

    .line 185
    .line 186
    sget-object v2, Lv3/i1;->a:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    const/4 v4, 0x3

    .line 193
    if-ne v2, v4, :cond_5

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_5
    move v3, v5

    .line 197
    :goto_4
    invoke-static {v3}, Lx6/b;->q(Z)V

    .line 198
    .line 199
    .line 200
    sget-object v2, Lv3/q1;->e:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v1, v2, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_6

    .line 207
    .line 208
    new-instance v2, Lv3/q1;

    .line 209
    .line 210
    sget-object v3, Lv3/q1;->f:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-direct {v2, v1}, Lv3/q1;-><init>(Z)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_6
    new-instance v2, Lv3/q1;

    .line 221
    .line 222
    invoke-direct {v2}, Lv3/q1;-><init>()V

    .line 223
    .line 224
    .line 225
    :goto_5
    return-object v2

    .line 226
    :sswitch_4
    sget-object v2, Lv3/b1;->d:Ljava/lang/String;

    .line 227
    .line 228
    sget-object v2, Lv3/i1;->a:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-ne v2, v3, :cond_7

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_7
    move v3, v5

    .line 238
    :goto_6
    invoke-static {v3}, Lx6/b;->q(Z)V

    .line 239
    .line 240
    .line 241
    sget-object v2, Lv3/b1;->d:Ljava/lang/String;

    .line 242
    .line 243
    const/high16 v3, -0x40800000    # -1.0f

    .line 244
    .line 245
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    cmpl-float v2, v1, v3

    .line 250
    .line 251
    if-nez v2, :cond_8

    .line 252
    .line 253
    new-instance v1, Lv3/b1;

    .line 254
    .line 255
    invoke-direct {v1}, Lv3/b1;-><init>()V

    .line 256
    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_8
    new-instance v2, Lv3/b1;

    .line 260
    .line 261
    invoke-direct {v2, v1}, Lv3/b1;-><init>(F)V

    .line 262
    .line 263
    .line 264
    move-object v1, v2

    .line 265
    :goto_7
    return-object v1

    .line 266
    :sswitch_5
    new-instance v2, Lv3/o0$h$a;

    .line 267
    .line 268
    invoke-direct {v2}, Lv3/o0$h$a;-><init>()V

    .line 269
    .line 270
    .line 271
    sget-object v3, Lv3/o0$h;->d:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    check-cast v3, Landroid/net/Uri;

    .line 278
    .line 279
    iput-object v3, v2, Lv3/o0$h$a;->a:Landroid/net/Uri;

    .line 280
    .line 281
    sget-object v3, Lv3/o0$h;->e:Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iput-object v3, v2, Lv3/o0$h$a;->b:Ljava/lang/String;

    .line 288
    .line 289
    sget-object v3, Lv3/o0$h;->f:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 292
    .line 293
    .line 294
    new-instance v1, Lv3/o0$h;

    .line 295
    .line 296
    invoke-direct {v1, v2}, Lv3/o0$h;-><init>(Lv3/o0$h$a;)V

    .line 297
    .line 298
    .line 299
    return-object v1

    .line 300
    :goto_8
    new-instance v2, Lw5/b;

    .line 301
    .line 302
    sget-object v3, Lw5/b;->f:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    sget-object v5, Lw5/b;->o:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v1, v5, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    sget-object v6, Lw5/b;->p:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v1, v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    sget-object v6, Lw5/b;->q:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-direct {v2, v3, v1, v5, v4}, Lw5/b;-><init>(I[BII)V

    .line 327
    .line 328
    .line 329
    return-object v2

    .line 330
    nop

    .line 331
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_5
        0x7 -> :sswitch_4
        0x8 -> :sswitch_3
        0xf -> :sswitch_2
        0x10 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
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

.method public g(Ld8/u;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le0/d;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->a(Ld8/u;)Lea/e0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/firestore/FirestoreRegistrar;->a(Ld8/u;)Lcom/google/firebase/firestore/h;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Ld8/o;

    sget-object p1, Le8/k;->a:Le8/k;

    return-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->f(Ld8/u;)Lea/j0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Le0/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    const/16 v0, 0xc

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    sget-object v1, Lw3/x;->h:Ljava/util/Random;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_1
    new-instance v0, Lv3/j;

    .line 24
    .line 25
    new-instance v2, Lt5/o;

    .line 26
    .line 27
    invoke-direct {v2}, Lt5/o;-><init>()V

    .line 28
    .line 29
    .line 30
    const v3, 0xc350

    .line 31
    .line 32
    .line 33
    const v4, 0xc350

    .line 34
    .line 35
    .line 36
    const/16 v5, 0x9c4

    .line 37
    .line 38
    const/16 v6, 0x1388

    .line 39
    .line 40
    const/4 v7, -0x1

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    move-object v1, v0

    .line 45
    invoke-direct/range {v1 .. v10}, Lv3/j;-><init>(Lt5/o;IIIIIZIZ)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public h(Lt9/b;)V
    .locals 0

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Le0/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    check-cast p1, Lw3/b;

    .line 8
    .line 9
    invoke-interface {p1}, Lw3/b;->Q()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :goto_0
    check-cast p1, Lw3/b;

    .line 14
    .line 15
    invoke-interface {p1}, Lw3/b;->t0()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le0/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    goto :goto_3

    .line 8
    :pswitch_1
    const-string v0, "task"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, Lz9/a;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lb8/s;

    .line 37
    .line 38
    iget-object v1, p1, Lb8/s;->a:Ljava/lang/String;

    .line 39
    .line 40
    :goto_0
    return-object v1

    .line 41
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lj9/g;

    .line 46
    .line 47
    invoke-interface {p1}, Lj9/g;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-interface {p1}, Lj9/g;->h()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    :goto_1
    return-object v1

    .line 62
    :cond_3
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 63
    .line 64
    sget-object v0, Lcom/google/firebase/firestore/f$a;->s:Lcom/google/firebase/firestore/f$a;

    .line 65
    .line 66
    const-string v1, "Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)"

    .line 67
    .line 68
    invoke-direct {p1, v1, v0}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lz7/a;

    .line 83
    .line 84
    invoke-virtual {p1}, Lz7/a;->b()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_2
    return-object p1

    .line 102
    :goto_3
    sget-object p1, Laa/j;->c:Ljava/lang/Object;

    .line 103
    .line 104
    const/16 p1, 0x193

    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

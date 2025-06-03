.class public final Lqc/t;
.super Lrc/b;
.source "SourceFile"

# interfaces
.implements Lqc/q;
.implements Lqc/e;
.implements Lrc/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lrc/b<",
        "Lqc/u;",
        ">;",
        "Lqc/q<",
        "TT;>;",
        "Lqc/e;",
        "Lrc/m<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _state:Ljava/lang/Object;

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lqc/t;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lqc/t;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lrc/b;-><init>()V

    iput-object p1, p0, Lqc/t;->_state:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lub/h;ILpc/a;)Lqc/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h;",
            "I",
            "Lpc/a;",
            ")",
            "Lqc/e<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p2, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ge p2, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :cond_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 v0, -0x2

    .line 11
    if-ne p2, v0, :cond_2

    .line 12
    .line 13
    :cond_1
    sget-object v0, Lpc/a;->b:Lpc/a;

    .line 14
    .line 15
    if-ne p3, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    if-eqz p2, :cond_3

    .line 19
    .line 20
    const/4 v0, -0x3

    .line 21
    if-ne p2, v0, :cond_4

    .line 22
    .line 23
    :cond_3
    sget-object v0, Lpc/a;->a:Lpc/a;

    .line 24
    .line 25
    if-ne p3, v0, :cond_4

    .line 26
    .line 27
    :goto_0
    move-object v0, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_4
    new-instance v0, Lrc/i;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1, p2, p3}, Lrc/i;-><init>(Lqc/e;Lub/h;ILpc/a;)V

    .line 32
    .line 33
    .line 34
    :goto_1
    return-object v0
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

.method public final b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Leb/y;->b:Ld2/h0;

    sget-object v1, Lqc/t;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    const/4 v1, 0x0

    :cond_0
    return-object v1
.end method

.method public final collect(Lqc/f;Lub/e;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/f<",
            "-TT;>;",
            "Lub/e<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lqc/t$a;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lqc/t$a;

    .line 13
    .line 14
    iget v4, v3, Lqc/t$a;->p:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lqc/t$a;->p:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lqc/t$a;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lqc/t$a;-><init>(Lqc/t;Lub/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lqc/t$a;->f:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lvb/a;->a:Lvb/a;

    .line 34
    .line 35
    iget v5, v3, Lqc/t$a;->p:I

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x3

    .line 39
    const/4 v9, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    if-eq v5, v9, :cond_3

    .line 44
    .line 45
    if-eq v5, v7, :cond_2

    .line 46
    .line 47
    if-ne v5, v8, :cond_1

    .line 48
    .line 49
    iget-object v0, v3, Lqc/t$a;->e:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v5, v3, Lqc/t$a;->d:Lnc/j1;

    .line 52
    .line 53
    iget-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 54
    .line 55
    iget-object v12, v3, Lqc/t$a;->b:Lqc/f;

    .line 56
    .line 57
    iget-object v13, v3, Lqc/t$a;->a:Lqc/t;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_2
    iget-object v0, v3, Lqc/t$a;->e:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v5, v3, Lqc/t$a;->d:Lnc/j1;

    .line 75
    .line 76
    iget-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 77
    .line 78
    iget-object v12, v3, Lqc/t$a;->b:Lqc/f;

    .line 79
    .line 80
    iget-object v13, v3, Lqc/t$a;->a:Lqc/t;

    .line 81
    .line 82
    :try_start_1
    invoke-static {v2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    iget-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 88
    .line 89
    iget-object v0, v3, Lqc/t$a;->b:Lqc/f;

    .line 90
    .line 91
    iget-object v13, v3, Lqc/t$a;->a:Lqc/t;

    .line 92
    .line 93
    :try_start_2
    invoke-static {v2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-static {v2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    monitor-enter p0

    .line 101
    :try_start_3
    iget-object v2, v1, Lrc/b;->a:[Lrc/c;

    .line 102
    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    new-array v2, v7, [Lqc/u;

    .line 106
    .line 107
    iput-object v2, v1, Lrc/b;->a:[Lrc/c;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget v5, v1, Lrc/b;->b:I

    .line 111
    .line 112
    array-length v11, v2

    .line 113
    if-lt v5, v11, :cond_6

    .line 114
    .line 115
    array-length v5, v2

    .line 116
    mul-int/2addr v5, v7

    .line 117
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    const-string v5, "copyOf(this, newSize)"

    .line 122
    .line 123
    invoke-static {v2, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v5, v2

    .line 127
    check-cast v5, [Lrc/c;

    .line 128
    .line 129
    iput-object v5, v1, Lrc/b;->a:[Lrc/c;

    .line 130
    .line 131
    check-cast v2, [Lrc/c;

    .line 132
    .line 133
    :cond_6
    :goto_1
    iget v5, v1, Lrc/b;->c:I

    .line 134
    .line 135
    :cond_7
    aget-object v11, v2, v5

    .line 136
    .line 137
    if-nez v11, :cond_8

    .line 138
    .line 139
    new-instance v11, Lqc/u;

    .line 140
    .line 141
    invoke-direct {v11}, Lqc/u;-><init>()V

    .line 142
    .line 143
    .line 144
    aput-object v11, v2, v5

    .line 145
    .line 146
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    array-length v12, v2

    .line 149
    if-lt v5, v12, :cond_9

    .line 150
    .line 151
    move v5, v10

    .line 152
    :cond_9
    invoke-virtual {v11, v1}, Lrc/c;->a(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-eqz v12, :cond_7

    .line 157
    .line 158
    iput v5, v1, Lrc/b;->c:I

    .line 159
    .line 160
    iget v2, v1, Lrc/b;->b:I

    .line 161
    .line 162
    add-int/2addr v2, v9

    .line 163
    iput v2, v1, Lrc/b;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 164
    .line 165
    monitor-exit p0

    .line 166
    check-cast v11, Lqc/u;

    .line 167
    .line 168
    :try_start_4
    instance-of v2, v0, Lqc/w;

    .line 169
    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    move-object v2, v0

    .line 173
    check-cast v2, Lqc/w;

    .line 174
    .line 175
    iput-object v1, v3, Lqc/t$a;->a:Lqc/t;

    .line 176
    .line 177
    iput-object v0, v3, Lqc/t$a;->b:Lqc/f;

    .line 178
    .line 179
    iput-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 180
    .line 181
    iput v9, v3, Lqc/t$a;->p:I

    .line 182
    .line 183
    invoke-virtual {v2, v3}, Lqc/w;->a(Lub/e;)Lrb/h;

    .line 184
    .line 185
    .line 186
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 187
    if-ne v2, v4, :cond_a

    .line 188
    .line 189
    return-object v4

    .line 190
    :cond_a
    move-object v13, v1

    .line 191
    :goto_2
    :try_start_5
    invoke-interface {v3}, Lub/e;->getContext()Lub/h;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    sget-object v5, Lnc/j1$b;->a:Lnc/j1$b;

    .line 196
    .line 197
    invoke-interface {v2, v5}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    move-object v5, v2

    .line 202
    check-cast v5, Lnc/j1;

    .line 203
    .line 204
    move-object v12, v0

    .line 205
    const/4 v0, 0x0

    .line 206
    :cond_b
    :goto_3
    sget-object v2, Lqc/t;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 207
    .line 208
    invoke-virtual {v2, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-eqz v5, :cond_d

    .line 213
    .line 214
    invoke-interface {v5}, Lnc/j1;->isActive()Z

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-eqz v14, :cond_c

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_c
    invoke-interface {v5}, Lnc/j1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    throw v0

    .line 226
    :catchall_0
    move-exception v0

    .line 227
    goto/16 :goto_a

    .line 228
    .line 229
    :cond_d
    :goto_4
    if-eqz v0, :cond_e

    .line 230
    .line 231
    invoke-static {v0, v2}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    if-nez v14, :cond_11

    .line 236
    .line 237
    :cond_e
    sget-object v0, Leb/y;->b:Ld2/h0;

    .line 238
    .line 239
    if-ne v2, v0, :cond_f

    .line 240
    .line 241
    const/4 v0, 0x0

    .line 242
    goto :goto_5

    .line 243
    :cond_f
    move-object v0, v2

    .line 244
    :goto_5
    iput-object v13, v3, Lqc/t$a;->a:Lqc/t;

    .line 245
    .line 246
    iput-object v12, v3, Lqc/t$a;->b:Lqc/f;

    .line 247
    .line 248
    iput-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 249
    .line 250
    iput-object v5, v3, Lqc/t$a;->d:Lnc/j1;

    .line 251
    .line 252
    iput-object v2, v3, Lqc/t$a;->e:Ljava/lang/Object;

    .line 253
    .line 254
    iput v7, v3, Lqc/t$a;->p:I

    .line 255
    .line 256
    invoke-interface {v12, v0, v3}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v0, v4, :cond_10

    .line 261
    .line 262
    return-object v4

    .line 263
    :cond_10
    move-object v0, v2

    .line 264
    :cond_11
    :goto_6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object v2, Lqc/u;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 268
    .line 269
    sget-object v14, Lb/a0;->R:Ld2/h0;

    .line 270
    .line 271
    invoke-virtual {v2, v11, v14}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    invoke-static {v15}, Lec/i;->b(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    sget-object v6, Lb/a0;->S:Ld2/h0;

    .line 279
    .line 280
    if-ne v15, v6, :cond_12

    .line 281
    .line 282
    move v6, v9

    .line 283
    goto :goto_7

    .line 284
    :cond_12
    move v6, v10

    .line 285
    :goto_7
    if-nez v6, :cond_b

    .line 286
    .line 287
    iput-object v13, v3, Lqc/t$a;->a:Lqc/t;

    .line 288
    .line 289
    iput-object v12, v3, Lqc/t$a;->b:Lqc/f;

    .line 290
    .line 291
    iput-object v11, v3, Lqc/t$a;->c:Lqc/u;

    .line 292
    .line 293
    iput-object v5, v3, Lqc/t$a;->d:Lnc/j1;

    .line 294
    .line 295
    iput-object v0, v3, Lqc/t$a;->e:Ljava/lang/Object;

    .line 296
    .line 297
    iput v8, v3, Lqc/t$a;->p:I

    .line 298
    .line 299
    new-instance v6, Lnc/l;

    .line 300
    .line 301
    invoke-static {v3}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 302
    .line 303
    .line 304
    move-result-object v15

    .line 305
    invoke-direct {v6, v9, v15}, Lnc/l;-><init>(ILub/e;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6}, Lnc/l;->t()V

    .line 309
    .line 310
    .line 311
    :cond_13
    invoke-virtual {v2, v11, v14, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    if-eqz v15, :cond_14

    .line 316
    .line 317
    move v2, v9

    .line 318
    goto :goto_8

    .line 319
    :cond_14
    invoke-virtual {v2, v11}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v15

    .line 323
    if-eq v15, v14, :cond_13

    .line 324
    .line 325
    move v2, v10

    .line 326
    :goto_8
    if-nez v2, :cond_15

    .line 327
    .line 328
    sget-object v2, Lrb/h;->a:Lrb/h;

    .line 329
    .line 330
    invoke-virtual {v6, v2}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_15
    invoke-virtual {v6}, Lnc/l;->s()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    sget-object v6, Lvb/a;->a:Lvb/a;

    .line 338
    .line 339
    if-ne v2, v6, :cond_16

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_16
    sget-object v2, Lrb/h;->a:Lrb/h;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 343
    .line 344
    :goto_9
    if-ne v2, v4, :cond_b

    .line 345
    .line 346
    return-object v4

    .line 347
    :catchall_1
    move-exception v0

    .line 348
    move-object v13, v1

    .line 349
    :goto_a
    monitor-enter v13

    .line 350
    :try_start_6
    iget v2, v13, Lrc/b;->b:I

    .line 351
    .line 352
    add-int/lit8 v2, v2, -0x1

    .line 353
    .line 354
    iput v2, v13, Lrc/b;->b:I

    .line 355
    .line 356
    if-nez v2, :cond_17

    .line 357
    .line 358
    iput v10, v13, Lrc/b;->c:I

    .line 359
    .line 360
    :cond_17
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    .line 361
    .line 362
    invoke-static {v11, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v11, v13}, Lqc/u;->b(Lqc/t;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 366
    .line 367
    .line 368
    monitor-exit v13

    .line 369
    throw v0

    .line 370
    :catchall_2
    move-exception v0

    .line 371
    monitor-exit v13

    .line 372
    throw v0

    .line 373
    :catchall_3
    move-exception v0

    .line 374
    monitor-exit p0

    .line 375
    throw v0
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
.end method

.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lqc/t;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Leb/y;->b:Ld2/h0;

    .line 4
    .line 5
    :cond_0
    monitor-enter p0

    .line 6
    :try_start_0
    sget-object v0, Lqc/t;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v1, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lqc/t;->d:I

    .line 26
    .line 27
    and-int/lit8 v0, p1, 0x1

    .line 28
    .line 29
    if-nez v0, :cond_d

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Lqc/t;->d:I

    .line 34
    .line 35
    iget-object v1, p0, Lrc/b;->a:[Lrc/c;

    .line 36
    .line 37
    sget-object v3, Lrb/h;->a:Lrb/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    :goto_1
    check-cast v1, [Lqc/u;

    .line 41
    .line 42
    if-eqz v1, :cond_b

    .line 43
    .line 44
    array-length v3, v1

    .line 45
    move v4, v2

    .line 46
    :goto_2
    if-ge v4, v3, :cond_b

    .line 47
    .line 48
    aget-object v5, v1, v4

    .line 49
    .line 50
    if-eqz v5, :cond_a

    .line 51
    .line 52
    sget-object v6, Lqc/u;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_3
    sget-object v8, Lb/a0;->S:Ld2/h0;

    .line 62
    .line 63
    if-ne v7, v8, :cond_4

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_4
    sget-object v9, Lb/a0;->R:Ld2/h0;

    .line 67
    .line 68
    if-ne v7, v9, :cond_7

    .line 69
    .line 70
    sget-object v10, Lqc/u;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 71
    .line 72
    :cond_5
    invoke-virtual {v10, v5, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_6

    .line 77
    .line 78
    move v7, v0

    .line 79
    goto :goto_3

    .line 80
    :cond_6
    invoke-virtual {v10, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    if-eq v9, v7, :cond_5

    .line 85
    .line 86
    move v7, v2

    .line 87
    :goto_3
    if-eqz v7, :cond_2

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_7
    sget-object v8, Lqc/u;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 91
    .line 92
    :cond_8
    invoke-virtual {v8, v5, v7, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_9

    .line 97
    .line 98
    move v8, v0

    .line 99
    goto :goto_4

    .line 100
    :cond_9
    invoke-virtual {v8, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    if-eq v10, v7, :cond_8

    .line 105
    .line 106
    move v8, v2

    .line 107
    :goto_4
    if-eqz v8, :cond_2

    .line 108
    .line 109
    check-cast v7, Lnc/l;

    .line 110
    .line 111
    sget-object v5, Lrb/h;->a:Lrb/h;

    .line 112
    .line 113
    invoke-virtual {v7, v5}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_a
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_b
    monitor-enter p0

    .line 120
    :try_start_2
    iget v1, p0, Lqc/t;->d:I

    .line 121
    .line 122
    if-ne v1, p1, :cond_c

    .line 123
    .line 124
    add-int/2addr p1, v0

    .line 125
    iput p1, p0, Lqc/t;->d:I

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_c
    iget-object p1, p0, Lrc/b;->a:[Lrc/c;

    .line 129
    .line 130
    sget-object v3, Lrb/h;->a:Lrb/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    .line 132
    monitor-exit p0

    .line 133
    move v11, v1

    .line 134
    move-object v1, p1

    .line 135
    move p1, v11

    .line 136
    goto :goto_1

    .line 137
    :catchall_0
    move-exception p1

    .line 138
    monitor-exit p0

    .line 139
    throw p1

    .line 140
    :cond_d
    add-int/lit8 p1, p1, 0x2

    .line 141
    .line 142
    :try_start_3
    iput p1, p0, Lqc/t;->d:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :goto_6
    return-void

    .line 146
    :catchall_1
    move-exception p1

    .line 147
    monitor-exit p0

    .line 148
    throw p1
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

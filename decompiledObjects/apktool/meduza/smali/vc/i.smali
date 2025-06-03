.class public Lvc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _availablePermits:I

.field public final a:I

.field public final b:Lvc/g;

.field private volatile deqIdx:J

.field private volatile enqIdx:J

.field private volatile head:Ljava/lang/Object;

.field private volatile tail:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lvc/i;

    const-string v2, "head"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lvc/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "deqIdx"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    sput-object v2, Lvc/i;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v2, "tail"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lvc/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lvc/i;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lvc/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lvc/i;->a:I

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v1, Lvc/k;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v1, v2, v3, v4, v5}, Lvc/k;-><init>(JLvc/k;I)V

    iput-object v1, p0, Lvc/i;->head:Ljava/lang/Object;

    iput-object v1, p0, Lvc/i;->tail:Ljava/lang/Object;

    sub-int/2addr v0, p1

    iput v0, p0, Lvc/i;->_availablePermits:I

    new-instance p1, Lvc/g;

    invoke-direct {p1, p0}, Lvc/g;-><init>(Lvc/i;)V

    iput-object p1, p0, Lvc/i;->b:Lvc/g;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The number of acquired permits should be in 0..1"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Lvc/d$a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :cond_0
    sget-object v2, Lvc/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v3, v0, Lvc/i;->a:I

    .line 12
    .line 13
    if-gt v2, v3, :cond_0

    .line 14
    .line 15
    if-lez v2, :cond_1

    .line 16
    .line 17
    sget-object v2, Lrb/h;->a:Lrb/h;

    .line 18
    .line 19
    iget-object v3, v0, Lvc/i;->b:Lvc/g;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lvc/d$a;->b(Ljava/lang/Object;Ldc/l;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_9

    .line 25
    .line 26
    :cond_1
    sget-object v2, Lvc/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lvc/k;

    .line 33
    .line 34
    sget-object v4, Lvc/i;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    sget-object v6, Lvc/f;->a:Lvc/f;

    .line 41
    .line 42
    sget v7, Lvc/j;->f:I

    .line 43
    .line 44
    int-to-long v7, v7

    .line 45
    div-long v7, v4, v7

    .line 46
    .line 47
    :cond_2
    invoke-static {v3, v7, v8, v6}, Lp2/m0;->F(Lsc/t;JLdc/p;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-static {v9}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-nez v10, :cond_9

    .line 56
    .line 57
    invoke-static {v9}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    :cond_3
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    check-cast v13, Lsc/t;

    .line 66
    .line 67
    iget-wide v14, v13, Lsc/t;->c:J

    .line 68
    .line 69
    iget-wide v11, v10, Lsc/t;->c:J

    .line 70
    .line 71
    cmp-long v11, v14, v11

    .line 72
    .line 73
    if-ltz v11, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {v10}, Lsc/t;->i()Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-nez v11, :cond_5

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-virtual {v2, v0, v13, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_6

    .line 89
    .line 90
    const/4 v11, 0x1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    if-eq v11, v13, :cond_5

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    :goto_1
    if-eqz v11, :cond_8

    .line 100
    .line 101
    invoke-virtual {v13}, Lsc/t;->e()Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_7

    .line 106
    .line 107
    invoke-virtual {v13}, Lsc/c;->d()V

    .line 108
    .line 109
    .line 110
    :cond_7
    :goto_2
    const/4 v10, 0x1

    .line 111
    :goto_3
    if-eqz v10, :cond_2

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    invoke-virtual {v10}, Lsc/t;->e()Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_3

    .line 119
    .line 120
    invoke-virtual {v10}, Lsc/c;->d()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_9
    :goto_4
    invoke-static {v9}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Lvc/k;

    .line 129
    .line 130
    sget v3, Lvc/j;->f:I

    .line 131
    .line 132
    int-to-long v6, v3

    .line 133
    rem-long/2addr v4, v6

    .line 134
    long-to-int v3, v4

    .line 135
    const/4 v4, 0x0

    .line 136
    iget-object v5, v2, Lvc/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 137
    .line 138
    :cond_a
    invoke-virtual {v5, v3, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_b

    .line 143
    .line 144
    const/4 v4, 0x1

    .line 145
    goto :goto_5

    .line 146
    :cond_b
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    if-eqz v6, :cond_a

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    :goto_5
    if-eqz v4, :cond_c

    .line 154
    .line 155
    invoke-interface {v1, v2, v3}, Lnc/i2;->c(Lsc/t;I)V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_c
    sget-object v6, Lvc/j;->b:Ld2/h0;

    .line 160
    .line 161
    sget-object v7, Lvc/j;->c:Ld2/h0;

    .line 162
    .line 163
    iget-object v8, v2, Lvc/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 164
    .line 165
    :cond_d
    invoke-virtual {v8, v3, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_e

    .line 170
    .line 171
    const/4 v2, 0x1

    .line 172
    goto :goto_6

    .line 173
    :cond_e
    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-eq v2, v6, :cond_d

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    :goto_6
    if-eqz v2, :cond_f

    .line 181
    .line 182
    sget-object v2, Lrb/h;->a:Lrb/h;

    .line 183
    .line 184
    iget-object v3, v0, Lvc/i;->b:Lvc/g;

    .line 185
    .line 186
    invoke-interface {v1, v2, v3}, Lnc/k;->b(Ljava/lang/Object;Ldc/l;)V

    .line 187
    .line 188
    .line 189
    :goto_7
    const/4 v11, 0x1

    .line 190
    goto :goto_8

    .line 191
    :cond_f
    const/4 v11, 0x0

    .line 192
    :goto_8
    if-eqz v11, :cond_0

    .line 193
    .line 194
    :goto_9
    return-void
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

.method public final d()V
    .locals 14

    .line 1
    :cond_0
    sget-object v0, Lvc/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lvc/i;->a:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_14

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    sget-object v0, Lvc/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lvc/k;

    .line 21
    .line 22
    sget-object v2, Lvc/i;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    sget v4, Lvc/j;->f:I

    .line 29
    .line 30
    int-to-long v4, v4

    .line 31
    div-long v4, v2, v4

    .line 32
    .line 33
    sget-object v6, Lvc/h;->a:Lvc/h;

    .line 34
    .line 35
    :cond_2
    invoke-static {v1, v4, v5, v6}, Lp2/m0;->F(Lsc/t;JLdc/p;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-static {v7}, Lp2/m0;->R(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_9

    .line 44
    .line 45
    invoke-static {v7}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    :cond_3
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Lsc/t;

    .line 54
    .line 55
    iget-wide v10, v9, Lsc/t;->c:J

    .line 56
    .line 57
    iget-wide v12, v8, Lsc/t;->c:J

    .line 58
    .line 59
    cmp-long v10, v10, v12

    .line 60
    .line 61
    if-ltz v10, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    invoke-virtual {v8}, Lsc/t;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-nez v10, :cond_5

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    invoke-virtual {v0, p0, v9, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_6

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    if-eq v10, v9, :cond_5

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    :goto_1
    if-eqz v10, :cond_8

    .line 88
    .line 89
    invoke-virtual {v9}, Lsc/t;->e()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_7

    .line 94
    .line 95
    invoke-virtual {v9}, Lsc/c;->d()V

    .line 96
    .line 97
    .line 98
    :cond_7
    :goto_2
    const/4 v8, 0x1

    .line 99
    :goto_3
    if-eqz v8, :cond_2

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_8
    invoke-virtual {v8}, Lsc/t;->e()Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_3

    .line 107
    .line 108
    invoke-virtual {v8}, Lsc/c;->d()V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_9
    :goto_4
    invoke-static {v7}, Lp2/m0;->L(Ljava/lang/Object;)Lsc/t;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lvc/k;

    .line 117
    .line 118
    invoke-virtual {v0}, Lsc/c;->a()V

    .line 119
    .line 120
    .line 121
    iget-wide v6, v0, Lsc/t;->c:J

    .line 122
    .line 123
    cmp-long v1, v6, v4

    .line 124
    .line 125
    if-lez v1, :cond_a

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    sget v1, Lvc/j;->f:I

    .line 129
    .line 130
    int-to-long v4, v1

    .line 131
    rem-long/2addr v2, v4

    .line 132
    long-to-int v1, v2

    .line 133
    sget-object v2, Lvc/j;->b:Ld2/h0;

    .line 134
    .line 135
    iget-object v3, v0, Lvc/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 136
    .line 137
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-nez v2, :cond_f

    .line 142
    .line 143
    sget v2, Lvc/j;->a:I

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    :goto_5
    if-ge v3, v2, :cond_c

    .line 147
    .line 148
    iget-object v4, v0, Lvc/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 149
    .line 150
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    sget-object v5, Lvc/j;->c:Ld2/h0;

    .line 155
    .line 156
    if-ne v4, v5, :cond_b

    .line 157
    .line 158
    const/4 v0, 0x1

    .line 159
    goto :goto_8

    .line 160
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_c
    sget-object v3, Lvc/j;->b:Ld2/h0;

    .line 164
    .line 165
    sget-object v4, Lvc/j;->d:Ld2/h0;

    .line 166
    .line 167
    iget-object v0, v0, Lvc/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 168
    .line 169
    :cond_d
    invoke-virtual {v0, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_e

    .line 174
    .line 175
    const/4 v0, 0x1

    .line 176
    const/4 v1, 0x1

    .line 177
    goto :goto_6

    .line 178
    :cond_e
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-eq v2, v3, :cond_d

    .line 183
    .line 184
    const/4 v0, 0x1

    .line 185
    const/4 v1, 0x0

    .line 186
    :goto_6
    xor-int/2addr v0, v1

    .line 187
    goto :goto_8

    .line 188
    :cond_f
    const/4 v0, 0x1

    .line 189
    sget-object v1, Lvc/j;->e:Ld2/h0;

    .line 190
    .line 191
    if-ne v2, v1, :cond_10

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_10
    instance-of v1, v2, Lnc/k;

    .line 195
    .line 196
    if-eqz v1, :cond_12

    .line 197
    .line 198
    check-cast v2, Lnc/k;

    .line 199
    .line 200
    sget-object v1, Lrb/h;->a:Lrb/h;

    .line 201
    .line 202
    iget-object v3, p0, Lvc/i;->b:Lvc/g;

    .line 203
    .line 204
    invoke-interface {v2, v1, v3}, Lnc/k;->j(Ljava/lang/Object;Ldc/l;)Ld2/h0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-eqz v1, :cond_11

    .line 209
    .line 210
    invoke-interface {v2, v1}, Lnc/k;->n(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_11
    :goto_7
    const/4 v0, 0x0

    .line 215
    goto :goto_8

    .line 216
    :cond_12
    instance-of v0, v2, Luc/f;

    .line 217
    .line 218
    if-eqz v0, :cond_13

    .line 219
    .line 220
    check-cast v2, Luc/f;

    .line 221
    .line 222
    sget-object v0, Lrb/h;->a:Lrb/h;

    .line 223
    .line 224
    invoke-interface {v2, p0, v0}, Luc/f;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    :goto_8
    if-eqz v0, :cond_0

    .line 229
    .line 230
    return-void

    .line 231
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v3, "unexpected: "

    .line 239
    .line 240
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_14
    :goto_9
    sget-object v0, Lvc/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 259
    .line 260
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    iget v2, p0, Lvc/i;->a:I

    .line 265
    .line 266
    if-le v1, v2, :cond_15

    .line 267
    .line 268
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-nez v0, :cond_15

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 276
    .line 277
    const-string v1, "The number of released permits cannot be greater than "

    .line 278
    .line 279
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget v2, p0, Lvc/i;->a:I

    .line 284
    .line 285
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0
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
.end method

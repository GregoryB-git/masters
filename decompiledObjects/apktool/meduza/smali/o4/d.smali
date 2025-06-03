.class public final Lo4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/d$a;
    }
.end annotation


# static fields
.field public static final g:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lo4/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/media/MediaCodec;

.field public final b:Landroid/os/HandlerThread;

.field public c:Lo4/c;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/RuntimeException;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lb5/g;

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Lo4/d;->g:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo4/d;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V
    .locals 2

    new-instance v0, Lb5/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb5/g;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/d;->a:Landroid/media/MediaCodec;

    iput-object p2, p0, Lo4/d;->b:Landroid/os/HandlerThread;

    iput-object v0, p0, Lo4/d;->e:Lb5/g;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lo4/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lo4/d;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lo4/d;->c:Lo4/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lo4/d;->e:Lb5/g;

    .line 15
    .line 16
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_1
    iput-boolean v1, v0, Lb5/g;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    :try_start_2
    monitor-exit v0

    .line 21
    iget-object v0, p0, Lo4/d;->c:Lo4/c;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lo4/d;->e:Lb5/g;

    .line 35
    .line 36
    monitor-enter v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 37
    :goto_0
    :try_start_3
    iget-boolean v1, v0, Lb5/g;->a:Z

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    :try_start_4
    monitor-exit v0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    monitor-exit v0

    .line 49
    throw v1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    monitor-exit v0

    .line 52
    throw v1
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 59
    .line 60
    .line 61
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_1
    :goto_1
    return-void
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

.method public final b()V
    .locals 2

    iget-object v0, p0, Lo4/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public final c(ILz3/c;J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lo4/d;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lo4/d;->g:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lo4/d$a;

    .line 14
    .line 15
    invoke-direct {v1}, Lo4/d$a;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    monitor-exit v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lo4/d$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iput p1, v1, Lo4/d$a;->a:I

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, v1, Lo4/d$a;->b:I

    .line 31
    .line 32
    iput p1, v1, Lo4/d$a;->c:I

    .line 33
    .line 34
    iput-wide p3, v1, Lo4/d$a;->e:J

    .line 35
    .line 36
    iput p1, v1, Lo4/d$a;->f:I

    .line 37
    .line 38
    iget-object p3, v1, Lo4/d$a;->d:Landroid/media/MediaCodec$CryptoInfo;

    .line 39
    .line 40
    iget p4, p2, Lz3/c;->f:I

    .line 41
    .line 42
    iput p4, p3, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 43
    .line 44
    iget-object p4, p2, Lz3/c;->d:[I

    .line 45
    .line 46
    iget-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 47
    .line 48
    if-nez p4, :cond_1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_1
    if-eqz v0, :cond_3

    .line 52
    .line 53
    array-length v2, v0

    .line 54
    array-length v3, p4

    .line 55
    if-ge v2, v3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    array-length v2, p4

    .line 59
    invoke-static {p4, p1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    :goto_2
    array-length v0, p4

    .line 64
    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_3
    iput-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 69
    .line 70
    iget-object p4, p2, Lz3/c;->e:[I

    .line 71
    .line 72
    iget-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 73
    .line 74
    if-nez p4, :cond_4

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_4
    if-eqz v0, :cond_6

    .line 78
    .line 79
    array-length v2, v0

    .line 80
    array-length v3, p4

    .line 81
    if-ge v2, v3, :cond_5

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    array-length v2, p4

    .line 85
    invoke-static {p4, p1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_6
    :goto_4
    array-length v0, p4

    .line 90
    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_5
    iput-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 95
    .line 96
    iget-object p4, p2, Lz3/c;->b:[B

    .line 97
    .line 98
    iget-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 99
    .line 100
    if-nez p4, :cond_7

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_7
    if-eqz v0, :cond_9

    .line 104
    .line 105
    array-length v2, v0

    .line 106
    array-length v3, p4

    .line 107
    if-ge v2, v3, :cond_8

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_8
    array-length v2, p4

    .line 111
    invoke-static {p4, p1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_9
    :goto_6
    array-length v0, p4

    .line 116
    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iput-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 124
    .line 125
    iget-object p4, p2, Lz3/c;->a:[B

    .line 126
    .line 127
    iget-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 128
    .line 129
    if-nez p4, :cond_a

    .line 130
    .line 131
    goto :goto_9

    .line 132
    :cond_a
    if-eqz v0, :cond_c

    .line 133
    .line 134
    array-length v2, v0

    .line 135
    array-length v3, p4

    .line 136
    if-ge v2, v3, :cond_b

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_b
    array-length v2, p4

    .line 140
    invoke-static {p4, p1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    .line 142
    .line 143
    goto :goto_9

    .line 144
    :cond_c
    :goto_8
    array-length p1, p4

    .line 145
    invoke-static {p4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iput-object v0, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 153
    .line 154
    iget p1, p2, Lz3/c;->c:I

    .line 155
    .line 156
    iput p1, p3, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 157
    .line 158
    sget p1, Lv5/e0;->a:I

    .line 159
    .line 160
    const/16 p4, 0x18

    .line 161
    .line 162
    if-lt p1, p4, :cond_d

    .line 163
    .line 164
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 165
    .line 166
    iget p4, p2, Lz3/c;->g:I

    .line 167
    .line 168
    iget p2, p2, Lz3/c;->h:I

    .line 169
    .line 170
    invoke-direct {p1, p4, p2}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3, p1}, Landroid/media/MediaCodec$CryptoInfo;->setPattern(Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    .line 174
    .line 175
    .line 176
    :cond_d
    iget-object p1, p0, Lo4/d;->c:Lo4/c;

    .line 177
    .line 178
    const/4 p2, 0x1

    .line 179
    invoke-virtual {p1, p2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :catchall_0
    move-exception p1

    .line 188
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    throw p1
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

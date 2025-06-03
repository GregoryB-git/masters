.class public final Lhb/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Lgb/m2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgb/m2<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lgb/m2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgb/m2<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lgb/r3$a;

.field public final f:Ljavax/net/SocketFactory;

.field public final o:Ljavax/net/ssl/SSLSocketFactory;

.field public final p:Ljavax/net/ssl/HostnameVerifier;

.field public final q:Lib/b;

.field public final r:I

.field public final s:Z

.field public final t:Lgb/h;

.field public final u:J

.field public final v:I

.field public final w:Z

.field public final x:I

.field public final y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lgb/j3;Lgb/j3;Ljavax/net/ssl/SSLSocketFactory;Lib/b;IZJJIILgb/r3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/e$d;->a:Lgb/m2;

    invoke-virtual {p1}, Lgb/j3;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lhb/e$d;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lhb/e$d;->c:Lgb/m2;

    invoke-virtual {p2}, Lgb/j3;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lhb/e$d;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p1, 0x0

    iput-object p1, p0, Lhb/e$d;->f:Ljavax/net/SocketFactory;

    iput-object p3, p0, Lhb/e$d;->o:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p1, p0, Lhb/e$d;->p:Ljavax/net/ssl/HostnameVerifier;

    iput-object p4, p0, Lhb/e$d;->q:Lib/b;

    iput p5, p0, Lhb/e$d;->r:I

    iput-boolean p6, p0, Lhb/e$d;->s:Z

    new-instance p1, Lgb/h;

    invoke-direct {p1, p7, p8}, Lgb/h;-><init>(J)V

    iput-object p1, p0, Lhb/e$d;->t:Lgb/h;

    iput-wide p9, p0, Lhb/e$d;->u:J

    iput p11, p0, Lhb/e$d;->v:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lhb/e$d;->w:Z

    iput p12, p0, Lhb/e$d;->x:I

    iput-boolean p1, p0, Lhb/e$d;->y:Z

    const-string p1, "transportTracerFactory"

    invoke-static {p13, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p13, p0, Lhb/e$d;->e:Lgb/r3$a;

    return-void
.end method


# virtual methods
.method public final W(Ljava/net/SocketAddress;Lgb/v$a;Lgb/d1$f;)Lgb/x;
    .locals 11

    .line 1
    iget-boolean p3, p0, Lhb/e$d;->z:Z

    .line 2
    .line 3
    if-nez p3, :cond_1

    .line 4
    .line 5
    iget-object p3, p0, Lhb/e$d;->t:Lgb/h;

    .line 6
    .line 7
    new-instance v0, Lgb/h$a;

    .line 8
    .line 9
    iget-object v1, p3, Lgb/h;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-direct {v0, p3, v1, v2}, Lgb/h$a;-><init>(Lgb/h;J)V

    .line 16
    .line 17
    .line 18
    new-instance v10, Lhb/f;

    .line 19
    .line 20
    invoke-direct {v10, v0}, Lhb/f;-><init>(Lgb/h$a;)V

    .line 21
    .line 22
    .line 23
    move-object v5, p1

    .line 24
    check-cast v5, Ljava/net/InetSocketAddress;

    .line 25
    .line 26
    new-instance p1, Lhb/i;

    .line 27
    .line 28
    iget-object v6, p2, Lgb/v$a;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v7, p2, Lgb/v$a;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v8, p2, Lgb/v$a;->b:Leb/a;

    .line 33
    .line 34
    iget-object v9, p2, Lgb/v$a;->d:Leb/a0;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    move-object v4, p0

    .line 38
    invoke-direct/range {v3 .. v10}, Lhb/i;-><init>(Lhb/e$d;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Leb/a;Leb/a0;Lhb/f;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p2, p0, Lhb/e$d;->s:Z

    .line 42
    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    iget-wide v3, p0, Lhb/e$d;->u:J

    .line 47
    .line 48
    iget-boolean p3, p0, Lhb/e$d;->w:Z

    .line 49
    .line 50
    iput-boolean p2, p1, Lhb/i;->H:Z

    .line 51
    .line 52
    iput-wide v1, p1, Lhb/i;->I:J

    .line 53
    .line 54
    iput-wide v3, p1, Lhb/i;->J:J

    .line 55
    .line 56
    iput-boolean p3, p1, Lhb/i;->K:Z

    .line 57
    .line 58
    :cond_0
    return-object p1

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "The transport factory is closed."

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
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

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lhb/e$d;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhb/e$d;->z:Z

    iget-object v0, p0, Lhb/e$d;->a:Lgb/m2;

    iget-object v1, p0, Lhb/e$d;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Lgb/m2;->a(Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lhb/e$d;->c:Lgb/m2;

    iget-object v1, p0, Lhb/e$d;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, v1}, Lgb/m2;->a(Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final p0()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lhb/e$d;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public final y0()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/net/SocketAddress;",
            ">;>;"
        }
    .end annotation

    const-class v0, Ljava/net/InetSocketAddress;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

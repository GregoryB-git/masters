.class public final Lm9/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Leb/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ln9/a;

.field public c:Leb/c;

.field public d:Ln9/a$a;

.field public final e:Landroid/content/Context;

.field public final f:Lg9/h;

.field public final g:Leb/b;


# direct methods
.method public constructor <init>(Ln9/a;Landroid/content/Context;Lg9/h;Lm9/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/y;->b:Ln9/a;

    iput-object p2, p0, Lm9/y;->e:Landroid/content/Context;

    iput-object p3, p0, Lm9/y;->f:Lg9/h;

    iput-object p4, p0, Lm9/y;->g:Leb/b;

    sget-object p1, Ln9/f;->c:Ln9/m;

    new-instance p2, Lm9/w;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lm9/w;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lm9/y;->a:Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public final a(Leb/t0;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TReqT;TRespT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Leb/e<",
            "TReqT;TRespT;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm9/y;->a:Lcom/google/android/gms/tasks/Task;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/y;->b:Ln9/a;

    .line 4
    .line 5
    iget-object v1, v1, Ln9/a;->a:Ln9/a$b;

    .line 6
    .line 7
    new-instance v2, Lr3/l;

    .line 8
    .line 9
    const/4 v3, 0x7

    .line 10
    invoke-direct {v2, v3, p0, p1}, Lr3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
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
.end method

.method public final b(Leb/n0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Leb/n0;->E()Leb/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "Current gRPC connectivity state: "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    new-array v3, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    const-string v5, "GrpcCallProvider"

    .line 27
    .line 28
    invoke-static {v4, v5, v1, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lm9/y;->d:Ln9/a$a;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    new-array v1, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v3, "Clearing the connectivityAttemptTimer"

    .line 38
    .line 39
    invoke-static {v5, v3, v1}, Lp2/m0;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lm9/y;->d:Ln9/a$a;

    .line 43
    .line 44
    invoke-virtual {v1}, Ln9/a$a;->a()V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    iput-object v1, p0, Lm9/y;->d:Ln9/a$a;

    .line 49
    .line 50
    :cond_0
    sget-object v1, Leb/n;->a:Leb/n;

    .line 51
    .line 52
    if-ne v0, v1, :cond_1

    .line 53
    .line 54
    new-array v1, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    const-string v2, "Setting the connectivityAttemptTimer"

    .line 57
    .line 58
    invoke-static {v4, v5, v2, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lm9/y;->b:Ln9/a;

    .line 62
    .line 63
    sget-object v2, Ln9/a$c;->q:Ln9/a$c;

    .line 64
    .line 65
    const-wide/16 v3, 0x3a98

    .line 66
    .line 67
    new-instance v5, Lg/q;

    .line 68
    .line 69
    const/16 v6, 0x13

    .line 70
    .line 71
    invoke-direct {v5, v6, p0, p1}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2, v3, v4, v5}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Lm9/y;->d:Ln9/a$a;

    .line 79
    .line 80
    :cond_1
    new-instance v1, Lx0/f;

    .line 81
    .line 82
    const/16 v2, 0x14

    .line 83
    .line 84
    invoke-direct {v1, v2, p0, p1}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0, v1}, Leb/n0;->F(Leb/n;Lx0/f;)V

    .line 88
    .line 89
    .line 90
    return-void
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

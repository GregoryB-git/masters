.class public final Lo9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/a;


# instance fields
.field public final a:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lc8/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Ls9/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "La8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt9/b;Lt9/b;Lt9/a;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation runtime Ly7/c;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/b<",
            "Lc8/b;",
            ">;",
            "Lt9/b<",
            "Ls9/a;",
            ">;",
            "Lt9/a<",
            "La8/a;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    const-string v0, "tokenProvider"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instanceId"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appCheckDeferred"

    invoke-static {p3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p4, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/b;->a:Lt9/b;

    iput-object p2, p0, Lo9/b;->b:Lt9/b;

    iput-object p4, p0, Lo9/b;->c:Ljava/util/concurrent/Executor;

    const-string p1, "FirebaseContextProvider"

    iput-object p1, p0, Lo9/b;->d:Ljava/lang/String;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lo9/b;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Laa/m0;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p3, p1}, Lt9/a;->a(Lt9/a$a;)V

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lo9/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lo9/b;->a:Lt9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lt9/b;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lc8/b;

    .line 8
    .line 9
    const-string v1, "forResult(null)"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v4, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v0, v3}, Lc8/b;->d(Z)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v4, p0, Lo9/b;->c:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    new-instance v5, Le0/d;

    .line 28
    .line 29
    const/16 v6, 0x1c

    .line 30
    .line 31
    invoke-direct {v5, v6}, Le0/d;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v4, "auth.getAccessToken(fals\u2026  }\n      authToken\n    }"

    .line 39
    .line 40
    :goto_0
    invoke-static {v0, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lo9/b;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La8/a;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-interface {v4}, La8/a;->b()Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-interface {v4}, La8/a;->a()Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    const-string v1, "if (getLimitedUseAppChec\u2026 appCheck.getToken(false)"

    .line 70
    .line 71
    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lo9/b;->c:Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    new-instance v2, Ld;

    .line 77
    .line 78
    const/16 v4, 0xc

    .line 79
    .line 80
    invoke-direct {v2, p0, v4}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v1, "tokenTask.onSuccessTask(\u2026esult(result.token)\n    }"

    .line 88
    .line 89
    :goto_2
    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 v1, 0x2

    .line 93
    new-array v2, v1, [Lcom/google/android/gms/tasks/Task;

    .line 94
    .line 95
    aput-object v0, v2, v3

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    aput-object p1, v2, v3

    .line 99
    .line 100
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, p0, Lo9/b;->c:Ljava/util/concurrent/Executor;

    .line 105
    .line 106
    new-instance v4, Lr3/r;

    .line 107
    .line 108
    invoke-direct {v4, v0, p0, p1, v1}, Lr3/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1
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

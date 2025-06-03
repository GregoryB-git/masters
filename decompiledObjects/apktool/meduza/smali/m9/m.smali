.class public final synthetic Lm9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/Task;

.field public final synthetic b:Leb/b$a;

.field public final synthetic c:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/Task;Leb/b$a;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/m;->a:Lcom/google/android/gms/tasks/Task;

    iput-object p2, p0, Lm9/m;->b:Leb/b$a;

    iput-object p3, p0, Lm9/m;->c:Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 10

    .line 1
    iget-object p1, p0, Lm9/m;->a:Lcom/google/android/gms/tasks/Task;

    .line 2
    .line 3
    iget-object v0, p0, Lm9/m;->b:Leb/b$a;

    .line 4
    .line 5
    iget-object v1, p0, Lm9/m;->c:Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    new-instance v2, Leb/s0;

    .line 8
    .line 9
    invoke-direct {v2}, Leb/s0;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    const-string v7, "FirestoreCallCredentials"

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    new-array v3, v6, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v8, "Successfully fetched auth token."

    .line 32
    .line 33
    invoke-static {v5, v7, v8, v3}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    sget-object v3, Lm9/n;->c:Leb/s0$b;

    .line 39
    .line 40
    new-instance v8, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v9, "Bearer "

    .line 46
    .line 47
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v2, v3, p1}, Leb/s0;->f(Leb/s0$d;Ljava/io/Serializable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    instance-of v3, p1, Lu7/c;

    .line 66
    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    new-array p1, v6, [Ljava/lang/Object;

    .line 70
    .line 71
    const-string v3, "Firebase Auth API not available, not using authentication."

    .line 72
    .line 73
    invoke-static {v5, v7, v3, p1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    instance-of v3, p1, Lz9/a;

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    new-array p1, v6, [Ljava/lang/Object;

    .line 82
    .line 83
    const-string v3, "No user signed in, not using authentication."

    .line 84
    .line 85
    invoke-static {v5, v7, v3, p1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    new-array v1, v6, [Ljava/lang/Object;

    .line 109
    .line 110
    const-string v3, "Successfully fetched AppCheck token."

    .line 111
    .line 112
    invoke-static {v5, v7, v3, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Lm9/n;->d:Leb/s0$b;

    .line 116
    .line 117
    invoke-virtual {v2, v1, p1}, Leb/s0;->f(Leb/s0$d;Ljava/io/Serializable;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    instance-of v1, p1, Lu7/c;

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    new-array p1, v6, [Ljava/lang/Object;

    .line 130
    .line 131
    const-string v1, "Firebase AppCheck API not available."

    .line 132
    .line 133
    invoke-static {v5, v7, v1, p1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    :goto_1
    invoke-virtual {v0, v2}, Leb/b$a;->a(Leb/s0;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    new-array v1, v5, [Ljava/lang/Object;

    .line 141
    .line 142
    aput-object p1, v1, v6

    .line 143
    .line 144
    const-string v2, "Failed to get AppCheck token: %s."

    .line 145
    .line 146
    invoke-static {v4, v7, v2, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    new-array v1, v5, [Ljava/lang/Object;

    .line 151
    .line 152
    aput-object p1, v1, v6

    .line 153
    .line 154
    const-string v2, "Failed to get auth token: %s."

    .line 155
    .line 156
    invoke-static {v4, v7, v2, v1}, Lp2/m0;->y(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    sget-object v1, Leb/e1;->j:Leb/e1;

    .line 160
    .line 161
    invoke-virtual {v1, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v0, p1}, Leb/b$a;->b(Leb/e1;)V

    .line 166
    .line 167
    .line 168
    :goto_3
    return-void
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

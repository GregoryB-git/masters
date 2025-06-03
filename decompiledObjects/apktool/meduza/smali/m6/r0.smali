.class public final Lm6/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Lm6/s0;


# direct methods
.method public synthetic constructor <init>(Lm6/s0;)V
    .locals 0

    iput-object p1, p0, Lm6/r0;->a:Lm6/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    iget-object v0, p0, Lm6/r0;->a:Lm6/s0;

    .line 11
    .line 12
    iget-object v0, v0, Lm6/s0;->d:Ljava/util/HashMap;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lm6/p0;

    .line 18
    .line 19
    iget-object v1, p0, Lm6/r0;->a:Lm6/s0;

    .line 20
    .line 21
    iget-object v1, v1, Lm6/s0;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lm6/q0;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget v3, v1, Lm6/q0;->b:I

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    if-ne v3, v4, :cond_3

    .line 35
    .line 36
    const-string v3, "GmsClientSupervisor"

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v6, "Timeout waiting for ServiceConnection callback "

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v5, Ljava/lang/Exception;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/Exception;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    iget-object v3, v1, Lm6/q0;->f:Landroid/content/ComponentName;

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    iget-object v3, p1, Lm6/p0;->c:Landroid/content/ComponentName;

    .line 72
    .line 73
    :cond_1
    if-nez v3, :cond_2

    .line 74
    .line 75
    new-instance v3, Landroid/content/ComponentName;

    .line 76
    .line 77
    iget-object p1, p1, Lm6/p0;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string v4, "unknown"

    .line 83
    .line 84
    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {v1, v3}, Lm6/q0;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    monitor-exit v0

    .line 91
    return v2

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    throw p1

    .line 95
    :cond_4
    iget-object v0, p0, Lm6/r0;->a:Lm6/s0;

    .line 96
    .line 97
    iget-object v0, v0, Lm6/s0;->d:Ljava/util/HashMap;

    .line 98
    .line 99
    monitor-enter v0

    .line 100
    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Lm6/p0;

    .line 103
    .line 104
    iget-object v3, p0, Lm6/r0;->a:Lm6/s0;

    .line 105
    .line 106
    iget-object v3, v3, Lm6/s0;->d:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lm6/q0;

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    iget-object v4, v3, Lm6/q0;->a:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_6

    .line 123
    .line 124
    iget-boolean v4, v3, Lm6/q0;->c:Z

    .line 125
    .line 126
    if-eqz v4, :cond_5

    .line 127
    .line 128
    iget-object v4, v3, Lm6/q0;->e:Lm6/p0;

    .line 129
    .line 130
    iget-object v5, v3, Lm6/q0;->o:Lm6/s0;

    .line 131
    .line 132
    iget-object v5, v5, Lm6/s0;->f:Lcom/google/android/gms/internal/common/zzh;

    .line 133
    .line 134
    invoke-virtual {v5, v2, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v4, v3, Lm6/q0;->o:Lm6/s0;

    .line 138
    .line 139
    iget-object v5, v4, Lm6/s0;->g:Lu6/a;

    .line 140
    .line 141
    iget-object v4, v4, Lm6/s0;->e:Landroid/content/Context;

    .line 142
    .line 143
    invoke-virtual {v5, v4, v3}, Lu6/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 144
    .line 145
    .line 146
    iput-boolean v1, v3, Lm6/q0;->c:Z

    .line 147
    .line 148
    const/4 v1, 0x2

    .line 149
    iput v1, v3, Lm6/q0;->b:I

    .line 150
    .line 151
    :cond_5
    iget-object v1, p0, Lm6/r0;->a:Lm6/s0;

    .line 152
    .line 153
    iget-object v1, v1, Lm6/s0;->d:Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    goto :goto_1

    .line 161
    :cond_6
    :goto_0
    monitor-exit v0

    .line 162
    return v2

    .line 163
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    throw p1
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

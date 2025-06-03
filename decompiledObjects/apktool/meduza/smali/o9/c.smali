.class public final synthetic Lo9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo9/c;->c:Ljava/lang/Object;

    iput-object p3, p0, Lo9/c;->d:Ljava/lang/Object;

    iput-object p4, p0, Lo9/c;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lo9/e;Ljava/lang/String;Ljava/lang/Object;Lo9/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo9/c;->a:Ljava/lang/String;

    iput-object p3, p0, Lo9/c;->c:Ljava/lang/Object;

    iput-object p4, p0, Lo9/c;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run(Ljava/util/concurrent/Future;)V
    .locals 4

    iget-object v0, p0, Lo9/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iget-object v1, p0, Lo9/c;->c:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/googlesignin/Messages$Result;

    iget-object v2, p0, Lo9/c;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    iget-object v3, p0, Lo9/c;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->g(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V

    return-void
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lo9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo9/e;

    .line 4
    .line 5
    iget-object v1, p0, Lo9/c;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lo9/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, p0, Lo9/c;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lo9/m;

    .line 12
    .line 13
    const-string v4, "this$0"

    .line 14
    .line 15
    invoke-static {v0, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "$name"

    .line 19
    .line 20
    invoke-static {v1, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v4, "$options"

    .line 24
    .line 25
    invoke-static {v3, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "task"

    .line 29
    .line 30
    invoke-static {p1, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lo9/n;

    .line 56
    .line 57
    iget-object v4, v0, Lo9/e;->i:Lv5/n;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    const-string v5, "http://"

    .line 62
    .line 63
    invoke-static {v5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget-object v6, v4, Lv5/n;->b:Ljava/io/Serializable;

    .line 68
    .line 69
    check-cast v6, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const/16 v6, 0x3a

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v6, v4, Lv5/n;->a:I

    .line 80
    .line 81
    const-string v7, "/%2$s/%1$s/%3$s"

    .line 82
    .line 83
    invoke-static {v5, v6, v7}, La0/j;->m(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    iput-object v5, v0, Lo9/e;->h:Ljava/lang/String;

    .line 88
    .line 89
    :cond_1
    iget-object v5, v0, Lo9/e;->h:Ljava/lang/String;

    .line 90
    .line 91
    const/4 v6, 0x3

    .line 92
    new-array v7, v6, [Ljava/lang/Object;

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    iget-object v9, v0, Lo9/e;->f:Ljava/lang/String;

    .line 96
    .line 97
    aput-object v9, v7, v8

    .line 98
    .line 99
    const/4 v8, 0x1

    .line 100
    iget-object v9, v0, Lo9/e;->e:Ljava/lang/String;

    .line 101
    .line 102
    aput-object v9, v7, v8

    .line 103
    .line 104
    const/4 v8, 0x2

    .line 105
    aput-object v1, v7, v8

    .line 106
    .line 107
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const-string v6, "format(format, *args)"

    .line 116
    .line 117
    invoke-static {v5, v6}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v6, v0, Lo9/e;->g:Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v6, :cond_2

    .line 123
    .line 124
    if-nez v4, :cond_2

    .line 125
    .line 126
    new-instance v4, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v5, v0, Lo9/e;->g:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v5, 0x2f

    .line 137
    .line 138
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    :cond_2
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 149
    .line 150
    invoke-direct {v1, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2, p1, v3}, Lo9/e;->a(Ljava/net/URL;Ljava/lang/Object;Lo9/n;Lo9/m;)Lcom/google/android/gms/tasks/Task;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_0
    return-object p1

    .line 158
    :catch_0
    move-exception p1

    .line 159
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw v0
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

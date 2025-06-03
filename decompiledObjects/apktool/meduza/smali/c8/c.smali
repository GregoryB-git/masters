.class public final synthetic Lc8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public synthetic a:Lc8/y;

.field public synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public synthetic c:Lcom/google/firebase/auth/FirebaseAuth;

.field public synthetic d:Lcom/google/android/recaptcha/RecaptchaAction;

.field public synthetic e:Ljava/lang/String;

.field public synthetic f:Landroid/app/Activity;

.field public synthetic o:Z

.field public synthetic p:Lc8/u0;


# direct methods
.method public synthetic constructor <init>(Lc8/y;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/recaptcha/RecaptchaAction;Ljava/lang/String;Landroid/app/Activity;ZLc8/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/c;->a:Lc8/y;

    iput-object p2, p0, Lc8/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lc8/c;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p4, p0, Lc8/c;->d:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-object p5, p0, Lc8/c;->e:Ljava/lang/String;

    iput-object p6, p0, Lc8/c;->f:Landroid/app/Activity;

    iput-boolean p7, p0, Lc8/c;->o:Z

    iput-object p8, p0, Lc8/c;->p:Lc8/u0;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 11

    .line 1
    iget-object v1, p0, Lc8/c;->a:Lc8/y;

    .line 2
    .line 3
    iget-object v7, p0, Lc8/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    iget-object v2, p0, Lc8/c;->c:Lcom/google/firebase/auth/FirebaseAuth;

    .line 6
    .line 7
    iget-object v0, p0, Lc8/c;->d:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 8
    .line 9
    iget-object v3, p0, Lc8/c;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v4, p0, Lc8/c;->f:Landroid/app/Activity;

    .line 12
    .line 13
    iget-boolean v5, p0, Lc8/c;->o:Z

    .line 14
    .line 15
    iget-object v6, p0, Lc8/c;->p:Lc8/u0;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    if-nez v8, :cond_0

    .line 22
    .line 23
    const-string v8, "y"

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v9, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v10, "Failed to initialize reCAPTCHA config: "

    .line 36
    .line 37
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v8, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v8, "PHONE_PROVIDER"

    .line 61
    .line 62
    iget-object v9, p1, Lc8/m0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v9

    .line 65
    :try_start_0
    iget-object p1, p1, Lc8/m0;->c:Lcom/google/android/gms/internal/firebase-auth-api/zzagt;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-virtual {p1, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzagt;->zzc(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p1, 0x0

    .line 78
    :goto_0
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v8, v2, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter v8

    .line 88
    :try_start_1
    iget-object v9, v2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 89
    .line 90
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p1, v9, v8, v0}, Lc8/m0;->b(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Ld2/h0;

    .line 98
    .line 99
    invoke-direct {v0, v7}, Ld2/h0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v8, Lc8/p0;

    .line 107
    .line 108
    move-object v0, v8

    .line 109
    invoke-direct/range {v0 .. v7}, Lc8/p0;-><init>(Lc8/y;Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZLc8/u0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v8}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    throw p1

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    throw p1

    .line 122
    :cond_2
    const/4 p1, 0x0

    .line 123
    move-object v0, v1

    .line 124
    move-object v1, v2

    .line 125
    move-object v2, v3

    .line 126
    move-object v3, v4

    .line 127
    move v4, v5

    .line 128
    move v5, p1

    .line 129
    invoke-virtual/range {v0 .. v7}, Lc8/y;->c(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLc8/u0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    return-void
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

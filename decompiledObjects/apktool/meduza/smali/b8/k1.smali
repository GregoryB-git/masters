.class public final Lb8/k1;
.super Lb8/f0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lb8/d0;

.field public final synthetic b:Lc8/y0;

.field public final synthetic c:Lb8/f0;

.field public final synthetic d:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lb8/d0;Lc8/y0;Lb8/f0;)V
    .locals 0

    iput-object p2, p0, Lb8/k1;->a:Lb8/d0;

    iput-object p3, p0, Lb8/k1;->b:Lc8/y0;

    iput-object p4, p0, Lb8/k1;->c:Lb8/f0;

    iput-object p1, p0, Lb8/k1;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lb8/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lb8/k1;->c:Lb8/f0;

    invoke-virtual {v0, p1}, Lb8/f0;->onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V

    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;Lb8/e0;)V
    .locals 1

    iget-object v0, p0, Lb8/k1;->c:Lb8/f0;

    invoke-virtual {v0, p1, p2}, Lb8/f0;->onCodeSent(Ljava/lang/String;Lb8/e0;)V

    return-void
.end method

.method public final onVerificationCompleted(Lb8/c0;)V
    .locals 1

    iget-object v0, p0, Lb8/k1;->c:Lb8/f0;

    invoke-virtual {v0, p1}, Lb8/f0;->onVerificationCompleted(Lb8/c0;)V

    return-void
.end method

.method public final onVerificationFailed(Lu7/h;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza(Ljava/lang/Exception;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "FirebaseAuth"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lb8/k1;->a:Lb8/d0;

    .line 11
    .line 12
    iput-boolean v1, p1, Lb8/d0;->j:Z

    .line 13
    .line 14
    iget-object p1, p1, Lb8/d0;->e:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "Re-triggering phone verification with Recaptcha flow forced for phone number "

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lb8/k1;->a:Lb8/d0;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lb8/d0;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lb8/k1;->b:Lc8/y0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lc8/y0;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const-string v3, ", error - "

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzb(Ljava/lang/Exception;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lb8/k1;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lc8/m0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lc8/m0;->c()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v0, p0, Lb8/k1;->b:Lc8/y0;

    .line 72
    .line 73
    invoke-virtual {v0}, Lc8/y0;->a()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Lb8/k1;->a:Lb8/d0;

    .line 84
    .line 85
    iput-boolean v1, p1, Lb8/d0;->k:Z

    .line 86
    .line 87
    iget-object p1, p1, Lb8/d0;->e:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number "

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lb8/k1;->a:Lb8/d0;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lb8/d0;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    iget-object v0, p0, Lb8/k1;->a:Lb8/d0;

    .line 113
    .line 114
    iget-object v0, v0, Lb8/d0;->e:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v4, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v5, "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for "

    .line 123
    .line 124
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lb8/k1;->c:Lb8/f0;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lb8/f0;->onVerificationFailed(Lu7/h;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    iget-object v0, p0, Lb8/k1;->a:Lb8/d0;

    .line 150
    .line 151
    iget-object v0, v0, Lb8/d0;->e:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    new-instance v4, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v5, "Invoking original failure callbacks after phone verification failure for "

    .line 160
    .line 161
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lb8/k1;->c:Lb8/f0;

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Lb8/f0;->onVerificationFailed(Lu7/h;)V

    .line 183
    .line 184
    .line 185
    return-void
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

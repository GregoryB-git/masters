.class public final Lcom/google/firebase/auth/b;
.super Lc8/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc8/i0<",
        "Lb8/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lb8/r;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLb8/r;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/b;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/firebase/auth/b;->b:Z

    iput-object p4, p0, Lcom/google/firebase/auth/b;->c:Lb8/r;

    iput-object p5, p0, Lcom/google/firebase/auth/b;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/b;->e:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/auth/b;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lc8/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lb8/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/firebase/auth/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "Logging in as "

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, " with empty reCAPTCHA token"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/b;->a:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Got reCAPTCHA token for login with email "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "FirebaseAuth"

    .line 39
    .line 40
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    iget-boolean v0, p0, Lcom/google/firebase/auth/b;->b:Z

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lcom/google/firebase/auth/b;->f:Lcom/google/firebase/auth/FirebaseAuth;

    .line 48
    .line 49
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 50
    .line 51
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/google/firebase/auth/b;->c:Lb8/r;

    .line 54
    .line 55
    invoke-static {v3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/google/firebase/auth/b;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/google/firebase/auth/b;->d:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/google/firebase/auth/b;->e:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v8, Lcom/google/firebase/auth/FirebaseAuth$c;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/firebase/auth/b;->f:Lcom/google/firebase/auth/FirebaseAuth;

    .line 67
    .line 68
    invoke-direct {v8, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 69
    .line 70
    .line 71
    move-object v7, p1

    .line 72
    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zzb(Lu7/f;Lb8/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc8/s0;)Lcom/google/android/gms/tasks/Task;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/b;->f:Lcom/google/firebase/auth/FirebaseAuth;

    .line 78
    .line 79
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    .line 80
    .line 81
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lu7/f;

    .line 82
    .line 83
    iget-object v3, p0, Lcom/google/firebase/auth/b;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, Lcom/google/firebase/auth/b;->d:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v5, p0, Lcom/google/firebase/auth/b;->e:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v7, Lcom/google/firebase/auth/FirebaseAuth$d;

    .line 90
    .line 91
    invoke-direct {v7, v0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 92
    .line 93
    .line 94
    move-object v6, p1

    .line 95
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;->zzb(Lu7/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc8/z0;)Lcom/google/android/gms/tasks/Task;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
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

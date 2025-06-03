.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzaew;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzahl;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final synthetic zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

.field private final synthetic zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

.field private final synthetic zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzaet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 4
    .line 5
    const-string v1, "EMAIL"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzi(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzc()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzc()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 40
    .line 41
    const-string v2, "DISPLAY_NAME"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzi(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzb()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzb()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 75
    .line 76
    const-string v2, "PHOTO_URL"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzi(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 85
    .line 86
    move-object v2, v1

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zze()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 97
    .line 98
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zze()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_2
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 105
    .line 106
    .line 107
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzd()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_7

    .line 118
    .line 119
    const-string v0, "redacted"

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-nez v0, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    const/4 v1, 0x0

    .line 129
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :goto_3
    invoke-static {v1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    .line 137
    .line 138
    const-string v1, "delete_passkey"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzi(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_8

    .line 145
    .line 146
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 147
    .line 148
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaj;->zzh()Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaj;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 153
    .line 154
    .line 155
    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;->zze()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 168
    .line 169
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zza(Ljava/util/List;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    .line 173
    .line 174
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 175
    .line 176
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;->zzc()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;->zzd()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-nez v4, :cond_a

    .line 192
    .line 193
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_a

    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;->zza()J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    .line 204
    .line 205
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zze()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-direct {p1, v3, v2, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    move-object v1, p1

    .line 217
    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 218
    .line 219
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;)V

    .line 220
    .line 221
    .line 222
    return-void
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

.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaa;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

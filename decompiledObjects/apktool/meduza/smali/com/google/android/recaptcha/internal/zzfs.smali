.class final Lcom/google/android/recaptcha/internal/zzfs;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:Ljava/lang/Object;

.field public zzc:I

.field public final synthetic zzd:Lcom/google/android/recaptcha/internal/zzgd;

.field public final synthetic zze:Lcom/google/android/recaptcha/internal/zzft;

.field public final synthetic zzf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/String;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3

    new-instance p1, Lcom/google/android/recaptcha/internal/zzfs;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/google/android/recaptcha/internal/zzfs;-><init>(Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/String;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzfs;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzfs;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzfs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/recaptcha/internal/zzjh;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lcom/google/android/recaptcha/internal/zzub;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    .line 31
    .line 32
    new-instance v1, Lcom/google/android/recaptcha/internal/zzbn;

    .line 33
    .line 34
    invoke-direct {v1}, Lcom/google/android/recaptcha/internal/zzbn;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p1, Lcom/google/android/recaptcha/internal/zzgd;->zza:Lcom/google/android/recaptcha/internal/zzbn;

    .line 38
    .line 39
    :try_start_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzf:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzkh;->zzj(Ljava/lang/CharSequence;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzub;->zzi([B)Lcom/google/android/recaptcha/internal/zzub;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzub;->zzf()Lcom/google/android/recaptcha/internal/zztl;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzft;->zzb(Lcom/google/android/recaptcha/internal/zzft;)Lcom/google/android/recaptcha/internal/zzhx;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1, p1}, Lcom/google/android/recaptcha/internal/zzhx;->zza(Lcom/google/android/recaptcha/internal/zzub;)Lcom/google/android/recaptcha/internal/zztz;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzjh;->zzb()Lcom/google/android/recaptcha/internal/zzjh;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zztz;->zzi()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    .line 77
    .line 78
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    .line 81
    .line 82
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    .line 83
    .line 84
    invoke-static {v4, v1, v5, p0}, Lcom/google/android/recaptcha/internal/zzft;->zzc(Lcom/google/android/recaptcha/internal/zzft;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzgd;Lub/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eq v1, v0, :cond_2

    .line 89
    .line 90
    move-object v2, p1

    .line 91
    move-object v1, v3

    .line 92
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzjh;->zzf()Lcom/google/android/recaptcha/internal/zzjh;

    .line 93
    .line 94
    .line 95
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzjh;->zza(Ljava/util/concurrent/TimeUnit;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    new-instance p1, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-direct {p1, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzub;->zzf()Lcom/google/android/recaptcha/internal/zztl;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catch_0
    move-exception p1

    .line 111
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfs;->zze:Lcom/google/android/recaptcha/internal/zzft;

    .line 112
    .line 113
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzd:Lcom/google/android/recaptcha/internal/zzgd;

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zza:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzb:Ljava/lang/Object;

    .line 119
    .line 120
    const/4 v3, 0x2

    .line 121
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzfs;->zzc:I

    .line 122
    .line 123
    invoke-static {v1, p1, v2, p0}, Lcom/google/android/recaptcha/internal/zzft;->zzd(Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzgd;Lub/e;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v0, :cond_3

    .line 128
    .line 129
    :cond_2
    return-object v0

    .line 130
    :cond_3
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 131
    .line 132
    return-object p1
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

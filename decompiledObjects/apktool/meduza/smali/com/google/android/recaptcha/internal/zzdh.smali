.class final Lcom/google/android/recaptcha/internal/zzdh;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzdt;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdt;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzdh;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    invoke-direct {p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzdh;-><init>(Lcom/google/android/recaptcha/internal/zzdt;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzdh;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzdh;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzdh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzdh;->zza:I

    .line 4
    .line 5
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Lcom/google/android/recaptcha/internal/zzbs;

    .line 12
    .line 13
    sget-object v1, Lj6/f;->b:Lj6/f;

    .line 14
    .line 15
    invoke-direct {p1, v1}, Lcom/google/android/recaptcha/internal/zzbs;-><init>(Lj6/f;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzdt;->zza(Lcom/google/android/recaptcha/internal/zzdt;)Landroid/app/Application;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1, v1}, Lcom/google/android/recaptcha/internal/zzbs;->zza(Landroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzdt;->zzp(Lcom/google/android/recaptcha/internal/zzdt;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzdt;->zza(Lcom/google/android/recaptcha/internal/zzdt;)Landroid/app/Application;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    .line 43
    .line 44
    invoke-static {v3}, Lcom/google/android/recaptcha/internal/zzdt;->zze(Lcom/google/android/recaptcha/internal/zzdt;)Lcom/google/android/recaptcha/internal/zzek;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzek;->zzd()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    .line 53
    .line 54
    invoke-static {v4}, Lcom/google/android/recaptcha/internal/zzdt;->zzc(Lcom/google/android/recaptcha/internal/zzdt;)Lcom/google/android/recaptcha/internal/zzbf;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/google/android/recaptcha/internal/zzbf;->zza()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzto;->zzf()Lcom/google/android/recaptcha/internal/zztn;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6, v2}, Lcom/google/android/recaptcha/internal/zztn;->zzt(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v1}, Lcom/google/android/recaptcha/internal/zztn;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, p1}, Lcom/google/android/recaptcha/internal/zztn;->zzu(I)Lcom/google/android/recaptcha/internal/zztn;

    .line 75
    .line 76
    .line 77
    const-string p1, "18.6.1"

    .line 78
    .line 79
    invoke-virtual {v6, p1}, Lcom/google/android/recaptcha/internal/zztn;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v3}, Lcom/google/android/recaptcha/internal/zztn;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 83
    .line 84
    .line 85
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v6, p1}, Lcom/google/android/recaptcha/internal/zztn;->zzf(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v4}, Lcom/google/android/recaptcha/internal/zztn;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zztn;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/google/android/recaptcha/internal/zzto;

    .line 100
    .line 101
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdh;->zzb:Lcom/google/android/recaptcha/internal/zzdt;

    .line 102
    .line 103
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzdt;->zzg(Lcom/google/android/recaptcha/internal/zzdt;)Lcom/google/android/recaptcha/internal/zzff;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzdt;->zzd(Lcom/google/android/recaptcha/internal/zzdt;)Lcom/google/android/recaptcha/internal/zzbr;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzbr;->zzb()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v3, 0x1

    .line 116
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzdh;->zza:I

    .line 117
    .line 118
    invoke-virtual {v2, v1, p1, p0}, Lcom/google/android/recaptcha/internal/zzff;->zzc(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzto;Lub/e;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v0, :cond_1

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_1
    :goto_0
    return-object p1
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

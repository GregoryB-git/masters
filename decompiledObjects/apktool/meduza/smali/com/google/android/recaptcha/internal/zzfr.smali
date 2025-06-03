.class final Lcom/google/android/recaptcha/internal/zzfr;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public final synthetic zza:Ljava/lang/Exception;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzgd;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzft;

.field private synthetic zzd:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zza:Ljava/lang/Exception;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzc:Lcom/google/android/recaptcha/internal/zzft;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 4

    new-instance v0, Lcom/google/android/recaptcha/internal/zzfr;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zza:Ljava/lang/Exception;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzc:Lcom/google/android/recaptcha/internal/zzft;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzfr;-><init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzgd;Lcom/google/android/recaptcha/internal/zzft;Lub/e;)V

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzfr;->zzd:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzfr;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzfr;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzfr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzd:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lnc/d0;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzfr;->zza:Ljava/lang/Exception;

    .line 11
    .line 12
    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzce;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Lcom/google/android/recaptcha/internal/zzce;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzce;->zza()Lcom/google/android/recaptcha/internal/zztd;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzgd;->zza()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zztd;->zze(I)Lcom/google/android/recaptcha/internal/zztd;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    .line 34
    .line 35
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzte;->zzf()Lcom/google/android/recaptcha/internal/zztd;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgd;->zza()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zztd;->zze(I)Lcom/google/android/recaptcha/internal/zztd;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zztd;->zzr(I)Lcom/google/android/recaptcha/internal/zztd;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zztd;->zzq(I)Lcom/google/android/recaptcha/internal/zztd;

    .line 50
    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lcom/google/android/recaptcha/internal/zzte;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzte;->zzl()I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzte;->zzk()I

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zza:Ljava/lang/Exception;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1}, Lec/t;->a(Ljava/lang/Class;)Lec/d;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Lec/d;->e()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zza:Ljava/lang/Exception;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzgd;->zzb()Lcom/google/android/recaptcha/internal/zzbn;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zzgd;->zza:Lcom/google/android/recaptcha/internal/zzbn;

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    :cond_1
    invoke-static {v3, v1}, Lcom/google/android/recaptcha/internal/zzev;->zza(Lcom/google/android/recaptcha/internal/zzbn;Lcom/google/android/recaptcha/internal/zzbn;)Lcom/google/android/recaptcha/internal/zzrl;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzb:Lcom/google/android/recaptcha/internal/zzgd;

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzgd;->zzd()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_2

    .line 109
    .line 110
    const-string v3, "recaptcha.m.Main.rge"

    .line 111
    .line 112
    :cond_2
    invoke-interface {p1}, Lnc/d0;->f()Lub/h;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object v4, Lnc/j1$b;->a:Lnc/j1$b;

    .line 117
    .line 118
    invoke-interface {p1, v4}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lnc/j1;

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    invoke-interface {p1}, Lnc/j1;->isActive()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    goto :goto_1

    .line 132
    :cond_3
    move p1, v4

    .line 133
    :goto_1
    if-eqz p1, :cond_4

    .line 134
    .line 135
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfr;->zzc:Lcom/google/android/recaptcha/internal/zzft;

    .line 136
    .line 137
    new-array v2, v2, [Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzko;->zzd()[B

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    array-length v6, v0

    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-virtual {v5, v0, v7, v6}, Lcom/google/android/recaptcha/internal/zzkh;->zzi([BII)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    aput-object v0, v2, v7

    .line 154
    .line 155
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzkh;->zzh()Lcom/google/android/recaptcha/internal/zzkh;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzko;->zzd()[B

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    array-length v5, v1

    .line 164
    invoke-virtual {v0, v1, v7, v5}, Lcom/google/android/recaptcha/internal/zzkh;->zzi([BII)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    aput-object v0, v2, v4

    .line 169
    .line 170
    invoke-static {p1, v3, v2}, Lcom/google/android/recaptcha/internal/zzft;->zze(Lcom/google/android/recaptcha/internal/zzft;Ljava/lang/String;[Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 174
    .line 175
    return-object p1
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

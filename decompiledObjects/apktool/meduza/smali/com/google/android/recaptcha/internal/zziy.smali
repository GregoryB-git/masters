.class final Lcom/google/android/recaptcha/internal/zziy;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:Ljava/lang/Object;

.field public zzc:Ljava/lang/Object;

.field public zzd:Ljava/lang/Object;

.field public zze:I

.field public final synthetic zzf:Lcom/google/android/recaptcha/internal/zzja;

.field public final synthetic zzg:Lcom/google/android/recaptcha/internal/zzen;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzja;Lcom/google/android/recaptcha/internal/zzen;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zziy;->zzg:Lcom/google/android/recaptcha/internal/zzen;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 2

    new-instance p1, Lcom/google/android/recaptcha/internal/zziy;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzg:Lcom/google/android/recaptcha/internal/zzen;

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/recaptcha/internal/zziy;-><init>(Lcom/google/android/recaptcha/internal/zzja;Lcom/google/android/recaptcha/internal/zzen;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zziy;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zziy;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zziy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zziy;->zze:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-eq v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eq v1, v3, :cond_5

    .line 17
    .line 18
    if-eq v1, v2, :cond_6

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzd:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/google/android/recaptcha/internal/zzcg;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zziy;->zzc:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lcom/google/android/recaptcha/internal/zzsc;

    .line 29
    .line 30
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zziy;->zzb:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Lcom/google/android/recaptcha/internal/zzja;

    .line 33
    .line 34
    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zziy;->zza:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Lcom/google/android/recaptcha/internal/zzja;

    .line 37
    .line 38
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 46
    .line 47
    invoke-static {v6}, Lcom/google/android/recaptcha/internal/zzja;->zzs(Lcom/google/android/recaptcha/internal/zzja;)Lcom/google/android/recaptcha/internal/zzsc;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    move-object p1, v5

    .line 54
    :cond_2
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 55
    .line 56
    new-instance v7, Lcom/google/android/recaptcha/internal/zzcg;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzja;->zzs(Lcom/google/android/recaptcha/internal/zzja;)Lcom/google/android/recaptcha/internal/zzsc;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    move-object v1, v5

    .line 65
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzsc;->zzf()Lcom/google/android/recaptcha/internal/zzle;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v7, v1}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzle;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 73
    .line 74
    iput-object v6, p0, Lcom/google/android/recaptcha/internal/zziy;->zza:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v6, p0, Lcom/google/android/recaptcha/internal/zziy;->zzb:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzc:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v7, p0, Lcom/google/android/recaptcha/internal/zziy;->zzd:Ljava/lang/Object;

    .line 81
    .line 82
    iput v4, p0, Lcom/google/android/recaptcha/internal/zziy;->zze:I

    .line 83
    .line 84
    invoke-virtual {v1, p0}, Lcom/google/android/recaptcha/internal/zzja;->zzw(Lub/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eq v1, v0, :cond_8

    .line 89
    .line 90
    move-object v4, p1

    .line 91
    move-object p1, v1

    .line 92
    move-object v1, v7

    .line 93
    move-object v7, v6

    .line 94
    :goto_0
    check-cast p1, Landroid/webkit/WebView;

    .line 95
    .line 96
    invoke-virtual {v6, v4, v1, p1}, Lcom/google/android/recaptcha/internal/zzja;->zzC(Lcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzcg;Landroid/webkit/WebView;)Lcom/google/android/recaptcha/internal/zzft;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, v7, Lcom/google/android/recaptcha/internal/zzja;->zzb:Lcom/google/android/recaptcha/internal/zzfo;

    .line 101
    .line 102
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzA()Lnc/r;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    new-instance v1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 118
    .line 119
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzr(Lcom/google/android/recaptcha/internal/zzja;)Lcom/google/android/recaptcha/internal/zzjh;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzjh;->zzd()Lcom/google/android/recaptcha/internal/zzjh;

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 127
    .line 128
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzr(Lcom/google/android/recaptcha/internal/zzja;)Lcom/google/android/recaptcha/internal/zzjh;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzjh;->zze()Lcom/google/android/recaptcha/internal/zzjh;

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzs(Lcom/google/android/recaptcha/internal/zzja;)Lcom/google/android/recaptcha/internal/zzsc;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-nez v1, :cond_4

    .line 142
    .line 143
    move-object v1, v5

    .line 144
    :cond_4
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zziy;->zza:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zziy;->zzb:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zziy;->zzc:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zziy;->zzd:Ljava/lang/Object;

    .line 151
    .line 152
    iput v3, p0, Lcom/google/android/recaptcha/internal/zziy;->zze:I

    .line 153
    .line 154
    invoke-static {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzja;->zzt(Lcom/google/android/recaptcha/internal/zzja;Lcom/google/android/recaptcha/internal/zzsc;Lub/e;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eq p1, v0, :cond_8

    .line 159
    .line 160
    :cond_5
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzA()Lnc/r;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    new-instance v1, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzA()Lnc/r;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput v2, p0, Lcom/google/android/recaptcha/internal/zziy;->zze:I

    .line 182
    .line 183
    invoke-interface {p1, p0}, Lnc/j0;->await(Lub/e;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eq p1, v0, :cond_8

    .line 188
    .line 189
    :cond_6
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzf:Lcom/google/android/recaptcha/internal/zzja;

    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzja;->zzm()Lcom/google/android/recaptcha/internal/zzcb;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    sget-object v1, Lcom/google/android/recaptcha/internal/zzje;->zzc:Lcom/google/android/recaptcha/internal/zzje;

    .line 196
    .line 197
    const/4 v2, 0x4

    .line 198
    iput v2, p0, Lcom/google/android/recaptcha/internal/zziy;->zze:I

    .line 199
    .line 200
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzcb;->zzc(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-ne p1, v0, :cond_7

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zziy;->zzg:Lcom/google/android/recaptcha/internal/zzen;

    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzen;->zza()V

    .line 210
    .line 211
    .line 212
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 213
    .line 214
    return-object p1

    .line 215
    :cond_8
    :goto_2
    return-object v0
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

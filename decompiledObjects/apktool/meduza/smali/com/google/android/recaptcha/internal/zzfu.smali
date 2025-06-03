.class public final Lcom/google/android/recaptcha/internal/zzfu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Ljava/util/Set;

.field private zzb:Ljava/util/Set;

.field private zzc:Ljava/lang/Long;

.field private zzd:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final zzc(Ljava/lang/String;Ljava/util/Set;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/16 v2, 0x2e

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v2, v1, v3

    .line 8
    .line 9
    const-string v2, "<this>"

    .line 10
    .line 11
    invoke-static {p0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    aget-char v1, v1, v3

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v3, p0, v1, v3}, Llc/k;->y0(ILjava/lang/CharSequence;Ljava/lang/String;Z)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v1, ""

    .line 29
    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    return v0

    .line 57
    :cond_0
    const-string v2, "."

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return v3
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
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
.end method


# virtual methods
.method public final zza(Lcom/google/android/recaptcha/internal/zzrv;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzrv;->zzf()Lcom/google/android/recaptcha/internal/zzrt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzrt;->zzi()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lsb/q;->x(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzfu;->zza:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzrv;->zzg()Lcom/google/android/recaptcha/internal/zzrt;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzrt;->zzi()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lsb/q;->x(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzb:Ljava/util/Set;

    return-void
.end method

.method public final zzb(Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzfu;->zza:Ljava/util/Set;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzb:Ljava/util/Set;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzb:Ljava/util/Set;

    const-string v2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    invoke-static {v1, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Lcom/google/android/recaptcha/internal/zzfu;->zzc(Ljava/lang/String;Ljava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-static {p1, v0}, Lcom/google/android/recaptcha/internal/zzfu;->zzc(Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzc:Ljava/lang/Long;

    if-nez p1, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzc:Ljava/lang/Long;

    :cond_4
    iget p1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzd:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzfu;->zzd:I

    return v1
.end method

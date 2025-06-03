.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzado;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lp6/a;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/a;

    const-string v1, "FirebaseAuthFallback:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FirebaseAuth"

    invoke-direct {v0, v2, v1}, Lp6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    return-void
.end method

.method public constructor <init>(Lu7/f;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lu7/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaed;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    .line 20
    .line 21
    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;

    .line 22
    .line 23
    invoke-direct {v3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;-><init>(Lu7/f;Lcom/google/android/gms/internal/firebase-auth-api/zzaed;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaeu;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    .line 30
    .line 31
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    .line 32
    .line 33
    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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

.method private static zza(JZ)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    const-string v0, "App hash will not be appended to the request."

    invoke-virtual {p0, v0, p2}, Lp6/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return p1
.end method


# virtual methods
.method public final zza(Lb8/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    const-string v0, "cachedTokenState should not be empty."

    invoke-static {v0, p2}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p5}, Lm6/j;->i(Ljava/lang/Object;)V

    instance-of v0, p1, Lb8/g0;

    if-eqz v0, :cond_0

    check-cast p1, Lb8/g0;

    .line 1
    iget-object p1, p1, Lb8/g0;->a:Lb8/c0;

    .line 2
    iget-object v0, p1, Lb8/c0;->a:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p1, Lb8/c0;->b:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2, v0, p1, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzage;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzage;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lb8/k0;

    if-eqz v0, :cond_1

    check-cast p1, Lb8/k0;

    .line 6
    iget-object v0, p1, Lb8/k0;->b:Lb8/m0;

    .line 7
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p3}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-interface {v0}, Lb8/m0;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    .line 8
    iget-object p1, p1, Lb8/k0;->a:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2, p3, v0, p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzagg;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagg;

    move-result-object p1

    :goto_0
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance p4, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {p4, p5, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {p3, p1, p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaga;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafy;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 4

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzb()Lb8/h;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzb()Lb8/h;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafy;->zzc()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lb8/h;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagn;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagp;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagp;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagu;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagu;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaha;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 4

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaha;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaha;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaih;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v1, v0, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaih;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahd;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahd;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahd;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahf;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahf;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahk;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 8

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zzd()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v7, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzc(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zze()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {p1, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zzb()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zzf()Z

    move-result v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza(JZ)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    move-object v1, v6

    move-object v2, v7

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;JZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v0, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahk;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaho;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaho;->zza()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzd(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahv;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahp;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaid;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaid;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzq;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzb()Lb8/h0;

    move-result-object v1

    .line 10
    iget-object v1, v1, Lb8/h0;->d:Ljava/lang/String;

    .line 11
    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    move-object/from16 v3, p2

    invoke-direct {v8, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzc(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzh()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v2, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zza()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzi()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zze()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzb()Lb8/h0;

    move-result-object v2

    .line 12
    iget-object v10, v2, Lb8/h0;->a:Ljava/lang/String;

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzb()Lb8/h0;

    move-result-object v2

    .line 14
    iget-object v11, v2, Lb8/h0;->d:Ljava/lang/String;

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzd()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzg()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzf()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzq;->zzc()Ljava/lang/String;

    move-result-object v15

    invoke-static/range {v9 .. v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzahr;

    move-result-object v9

    invoke-static {v5, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza(JZ)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;)V

    :cond_2
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    move-object v3, v1

    move-object v4, v8

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;JZ)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v3, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    move-result-object v1

    invoke-virtual {v2, v9, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahr;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzr;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzr;->zza()Lb8/c0;

    move-result-object p1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaex;->zza(Lb8/c0;)Lcom/google/android/gms/internal/firebase-auth-api/zzaih;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaih;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lb8/p0;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Lb8/p0;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lb8/w;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 2

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p4}, Lm6/j;->i(Ljava/lang/Object;)V

    instance-of v0, p2, Lb8/g0;

    if-eqz v0, :cond_0

    check-cast p2, Lb8/g0;

    .line 16
    iget-object p2, p2, Lb8/g0;->a:Lb8/c0;

    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    .line 18
    iget-object v1, p2, Lb8/c0;->a:Ljava/lang/String;

    .line 19
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 20
    iget-object p2, p2, Lb8/c0;->b:Ljava/lang/String;

    .line 21
    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p1, v1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzagd;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagd;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {p2, p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lb8/k0;

    if-eqz v0, :cond_1

    check-cast p2, Lb8/k0;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    .line 22
    iget-object v1, p2, Lb8/k0;->a:Ljava/lang/String;

    .line 23
    invoke-static {v1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 24
    iget-object p2, p2, Lb8/k0;->c:Ljava/lang/String;

    .line 25
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p1, v1, p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagf;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagf;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {p2, p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagc;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaic;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaic;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 10

    move-object v0, p0

    move-object v8, p2

    const-string v1, "idToken should not be empty."

    move-object v2, p1

    invoke-static {v1, p1}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p12 .. p12}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    move-object/from16 v3, p12

    invoke-direct {v9, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzc(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    if-eqz p6, :cond_0

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v9, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzaht;

    move-result-object v7

    move-wide v4, p4

    move/from16 v6, p11

    invoke-static {p4, p5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza(JZ)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;)V

    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    move-object v2, p2

    move-object v3, v9

    move-wide v4, p4

    move/from16 v6, p11

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;JZ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzafd;

    invoke-virtual {v2, v9, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahp;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    const-string v0, "cachedTokenState should not be empty."

    invoke-static {v0, p1}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "uid should not be empty."

    invoke-static {v0, p2}, Lm6/j;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p4}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 6

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p5}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v5, p5, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 7

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p6}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v6, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v6, p6, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagn;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzb(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 6

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p5}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v5, p5, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzc(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzc(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zze(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzd(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zze(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzf(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zze(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zze(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

.method public final zzf(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V
    .locals 3

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza:Lp6/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lp6/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zzf(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V

    return-void
.end method

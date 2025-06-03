.class final Lcom/google/android/recaptcha/internal/zzal;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:J

.field public zzb:Z

.field public zzc:I

.field public final synthetic zzd:Lcom/google/android/recaptcha/internal/zzan;

.field public final synthetic zze:Lcom/google/android/recaptcha/internal/zzen;

.field public final synthetic zzf:Lec/s;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzen;Lec/s;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzal;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzal;->zze:Lcom/google/android/recaptcha/internal/zzen;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzal;->zzf:Lec/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3

    new-instance p1, Lcom/google/android/recaptcha/internal/zzal;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzal;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzal;->zze:Lcom/google/android/recaptcha/internal/zzen;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzal;->zzf:Lec/s;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/google/android/recaptcha/internal/zzal;-><init>(Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzen;Lec/s;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzal;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzal;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzal;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzal;->zzc:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v3, :cond_0

    iget-boolean v1, p0, Lcom/google/android/recaptcha/internal/zzal;->zzb:Z

    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzal;->zza:J

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    move p1, v1

    move-object v1, p0

    goto/16 :goto_5

    :cond_0
    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzal;->zza:J

    :try_start_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v1, p0

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    move p1, v3

    :goto_0
    if-eqz p1, :cond_7

    :try_start_1
    iget-object p1, v1, Lcom/google/android/recaptcha/internal/zzal;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    iput-wide v4, v1, Lcom/google/android/recaptcha/internal/zzal;->zza:J

    iput v3, v1, Lcom/google/android/recaptcha/internal/zzal;->zzc:I

    invoke-static {p1, v1}, Lcom/google/android/recaptcha/internal/zzan;->zza(Lcom/google/android/recaptcha/internal/zzan;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_2

    :goto_1
    check-cast p1, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    iget-object v6, v1, Lcom/google/android/recaptcha/internal/zzal;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    invoke-virtual {v6}, Lcom/google/android/recaptcha/internal/zzan;->zzf()Lnc/r;

    move-result-object v6

    invoke-interface {v6, p1}, Lnc/r;->i0(Ljava/lang/Object;)Z

    iget-object p1, v1, Lcom/google/android/recaptcha/internal/zzal;->zzd:Lcom/google/android/recaptcha/internal/zzan;

    sget-object v6, Lcom/google/android/recaptcha/internal/zzao;->zzc:Lcom/google/android/recaptcha/internal/zzao;

    invoke-static {p1, v6}, Lcom/google/android/recaptcha/internal/zzan;->zzh(Lcom/google/android/recaptcha/internal/zzan;Lcom/google/android/recaptcha/internal/zzao;)V

    iget-object p1, v1, Lcom/google/android/recaptcha/internal/zzal;->zze:Lcom/google/android/recaptcha/internal/zzen;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzen;->zza()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move p1, v2

    goto :goto_0

    :cond_2
    return-object v0

    :catch_1
    move-exception p1

    :goto_2
    iget-object v6, v1, Lcom/google/android/recaptcha/internal/zzal;->zzf:Lec/s;

    iput-object p1, v6, Lec/s;->a:Ljava/lang/Object;

    instance-of v6, p1, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    if-eqz v6, :cond_4

    move-object v6, p1

    check-cast v6, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    invoke-virtual {v6}, Lcom/google/android/play/core/integrity/StandardIntegrityException;->getErrorCode()I

    move-result v6

    const/16 v7, -0x64

    if-eq v6, v7, :cond_3

    const/16 v7, -0x12

    if-eq v6, v7, :cond_3

    const/16 v7, -0xc

    if-eq v6, v7, :cond_3

    const/4 v7, -0x8

    if-eq v6, v7, :cond_3

    const/4 v7, -0x3

    if-eq v6, v7, :cond_3

    goto :goto_3

    :cond_3
    move v6, v3

    goto :goto_4

    :cond_4
    :goto_3
    move v6, v2

    :goto_4
    if-eqz v6, :cond_6

    iput-wide v4, v1, Lcom/google/android/recaptcha/internal/zzal;->zza:J

    iput-boolean v3, v1, Lcom/google/android/recaptcha/internal/zzal;->zzb:Z

    const/4 p1, 0x2

    iput p1, v1, Lcom/google/android/recaptcha/internal/zzal;->zzc:I

    invoke-static {v4, v5, v1}, Lnc/m0;->a(JLwb/c;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_5

    move p1, v6

    :goto_5
    add-long/2addr v4, v4

    goto :goto_0

    :cond_5
    return-object v0

    :cond_6
    throw p1

    :cond_7
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.class public final Lcom/google/android/recaptcha/internal/zzev;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final zza(Lcom/google/android/recaptcha/internal/zzbn;Lcom/google/android/recaptcha/internal/zzbn;)Lcom/google/android/recaptcha/internal/zzrl;
    .locals 4

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzrl;->zzf()Lcom/google/android/recaptcha/internal/zzrj;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzbn;->zzb()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/recaptcha/internal/zzqb;->zzb(J)Lcom/google/android/recaptcha/internal/zzpj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzrj;->zzq(Lcom/google/android/recaptcha/internal/zzpj;)Lcom/google/android/recaptcha/internal/zzrj;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v1}, Lcom/google/android/recaptcha/internal/zzbn;->zza(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/recaptcha/internal/zzpz;->zza(J)Lcom/google/android/recaptcha/internal/zzml;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzrj;->zzr(Lcom/google/android/recaptcha/internal/zzml;)Lcom/google/android/recaptcha/internal/zzrj;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbn;->zzb()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/recaptcha/internal/zzqb;->zzb(J)Lcom/google/android/recaptcha/internal/zzpj;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzrj;->zze(Lcom/google/android/recaptcha/internal/zzpj;)Lcom/google/android/recaptcha/internal/zzrj;

    invoke-virtual {p1, v1}, Lcom/google/android/recaptcha/internal/zzbn;->zza(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/recaptcha/internal/zzpz;->zza(J)Lcom/google/android/recaptcha/internal/zzml;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzrj;->zzf(Lcom/google/android/recaptcha/internal/zzml;)Lcom/google/android/recaptcha/internal/zzrj;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmx;->zzi()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zzrl;

    return-object p0
.end method

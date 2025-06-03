.class final Lcom/google/android/recaptcha/internal/zzcz;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzdc;

.field public final synthetic zzc:J

.field public final synthetic zzd:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final synthetic zze:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdc;JLcom/google/android/recaptcha/RecaptchaAction;Ljava/lang/String;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzc:J

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzcz;->zze:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 7

    new-instance p1, Lcom/google/android/recaptcha/internal/zzcz;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzc:J

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzcz;->zze:Ljava/lang/String;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcz;-><init>(Lcom/google/android/recaptcha/internal/zzdc;JLcom/google/android/recaptcha/RecaptchaAction;Ljava/lang/String;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzek;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzcz;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzcz;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzcz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zza:I

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    iget-wide v1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzc:J

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/recaptcha/internal/zzdc;->zze(Lcom/google/android/recaptcha/internal/zzdc;JLcom/google/android/recaptcha/RecaptchaAction;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzcz;->zze:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzcz;->zzc:J

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzdc;->zza(Lcom/google/android/recaptcha/internal/zzdc;)Lcom/google/android/recaptcha/internal/zzcn;

    move-result-object v1

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcz;->zza:I

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzcn;->zza(Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;JLub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    check-cast p1, Ljava/lang/String;

    new-instance v0, Lrb/e;

    invoke-direct {v0, p1}, Lrb/e;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

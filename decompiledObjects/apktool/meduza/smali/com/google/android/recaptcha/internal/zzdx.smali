.class final Lcom/google/android/recaptcha/internal/zzdx;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzec;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdx;->zzb:Lcom/google/android/recaptcha/internal/zzec;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzdx;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzdx;->zzb:Lcom/google/android/recaptcha/internal/zzec;

    invoke-direct {p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzdx;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzdx;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzdx;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzdx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzdx;->zza:I

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdx;->zzb:Lcom/google/android/recaptcha/internal/zzec;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzec;->zzg(Lcom/google/android/recaptcha/internal/zzec;)Lnc/r;

    move-result-object p1

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/recaptcha/internal/zzdx;->zza:I

    invoke-interface {p1, p0}, Lnc/j0;->await(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

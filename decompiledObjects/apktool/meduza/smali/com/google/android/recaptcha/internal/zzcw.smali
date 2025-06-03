.class final Lcom/google/android/recaptcha/internal/zzcw;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public synthetic zza:Ljava/lang/Object;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzdc;

.field public zzc:I


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdc;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcw;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcw;->zza:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzcw;->zzc:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcw;->zzc:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcw;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/google/android/recaptcha/internal/zzdc;->execute-0E7RQCE(Lcom/google/android/recaptcha/RecaptchaAction;JLub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvb/a;->a:Lvb/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lrb/e;

    invoke-direct {v0, p1}, Lrb/e;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

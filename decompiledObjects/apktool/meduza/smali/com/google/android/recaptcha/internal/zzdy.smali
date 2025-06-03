.class final Lcom/google/android/recaptcha/internal/zzdy;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# instance fields
.field public zza:I

.field public final synthetic zzb:J

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzec;


# direct methods
.method public constructor <init>(JLcom/google/android/recaptcha/internal/zzec;Lub/e;)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzb:J

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzc:Lcom/google/android/recaptcha/internal/zzec;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Lub/e;)Lub/e;
    .locals 4

    new-instance v0, Lcom/google/android/recaptcha/internal/zzdy;

    iget-wide v1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzb:J

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzc:Lcom/google/android/recaptcha/internal/zzec;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/recaptcha/internal/zzdy;-><init>(JLcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lub/e;

    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzdy;->create(Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzdy;

    sget-object v0, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, v0}, Lcom/google/android/recaptcha/internal/zzdy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zza:I

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzb:J

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zzc:Lcom/google/android/recaptcha/internal/zzec;

    new-instance v3, Lcom/google/android/recaptcha/internal/zzdx;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lcom/google/android/recaptcha/internal/zzdx;-><init>(Lcom/google/android/recaptcha/internal/zzec;Lub/e;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzdy;->zza:I

    invoke-static {v1, v2, v3, p0}, Lb/a0;->M(JLdc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

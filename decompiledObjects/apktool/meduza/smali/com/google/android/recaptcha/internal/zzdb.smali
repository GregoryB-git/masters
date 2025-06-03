.class final Lcom/google/android/recaptcha/internal/zzdb;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public synthetic zza:Ljava/lang/Object;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzdc;

.field public zzc:I

.field public zzd:Lcom/google/android/recaptcha/internal/zzen;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdc;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdb;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdb;->zza:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzdb;->zzc:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzdb;->zzc:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdb;->zzb:Lcom/google/android/recaptcha/internal/zzdc;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/google/android/recaptcha/internal/zzdc;->zzc(Lcom/google/android/recaptcha/internal/zzdc;Ljava/lang/String;Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

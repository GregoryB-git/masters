.class final Lcom/google/android/recaptcha/internal/zzca;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public zza:Ljava/lang/Object;

.field public synthetic zzb:Ljava/lang/Object;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzcb;

.field public zzd:I

.field public zze:Lcom/google/android/recaptcha/internal/zzcb;

.field public zzf:Lcom/google/android/recaptcha/internal/zzje;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcb;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzca;->zzc:Lcom/google/android/recaptcha/internal/zzcb;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzca;->zzb:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzca;->zzd:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzca;->zzd:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzca;->zzc:Lcom/google/android/recaptcha/internal/zzcb;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/google/android/recaptcha/internal/zzcb;->zzc(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

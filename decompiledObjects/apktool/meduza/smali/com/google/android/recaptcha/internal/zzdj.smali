.class final Lcom/google/android/recaptcha/internal/zzdj;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public zza:Ljava/lang/Object;

.field public synthetic zzb:Ljava/lang/Object;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzdt;

.field public zzd:I


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzdt;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdj;->zzc:Lcom/google/android/recaptcha/internal/zzdt;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdj;->zzb:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzdj;->zzd:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzdj;->zzd:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdj;->zzc:Lcom/google/android/recaptcha/internal/zzdt;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2, p0}, Lcom/google/android/recaptcha/internal/zzdt;->zzk(Lcom/google/android/recaptcha/internal/zzdt;Lcom/google/android/recaptcha/internal/zzsc;JLub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

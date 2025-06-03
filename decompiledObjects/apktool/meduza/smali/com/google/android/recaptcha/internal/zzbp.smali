.class final Lcom/google/android/recaptcha/internal/zzbp;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:Ljava/lang/Object;

.field public zzc:J

.field public zzd:J

.field public zze:D

.field public synthetic zzf:Ljava/lang/Object;

.field public final synthetic zzg:Lcom/google/android/recaptcha/internal/zzbq;

.field public zzh:I


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbq;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbp;->zzg:Lcom/google/android/recaptcha/internal/zzbq;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbp;->zzf:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbp;->zzg:Lcom/google/android/recaptcha/internal/zzbq;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object v9, p0

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzbq;->zza(Ldc/l;JJDLdc/l;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

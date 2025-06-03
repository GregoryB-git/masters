.class final Lcom/google/android/recaptcha/internal/zzcs;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:Ljava/lang/Object;

.field public zzc:Ljava/lang/Object;

.field public zzd:J

.field public synthetic zze:Ljava/lang/Object;

.field public final synthetic zzf:Lcom/google/android/recaptcha/internal/zzcv;

.field public zzg:I

.field public zzh:Ljava/lang/String;

.field public zzi:Lcom/google/android/recaptcha/internal/zzch;

.field public zzj:Lcom/google/android/recaptcha/internal/zzbi;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcv;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcs;->zzf:Lcom/google/android/recaptcha/internal/zzcv;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcs;->zze:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcs;->zzg:I

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcs;->zzf:Lcom/google/android/recaptcha/internal/zzcv;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/recaptcha/internal/zzcv;->zzg(Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

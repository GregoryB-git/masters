.class final Lcom/google/android/gms/internal/measurement/zzft;
.super Lcom/google/android/gms/internal/measurement/zzed$zzb;
.source "SourceFile"


# instance fields
.field private final synthetic zzc:Landroid/app/Activity;

.field private final synthetic zzd:Lcom/google/android/gms/internal/measurement/zzdm;

.field private final synthetic zze:Lcom/google/android/gms/internal/measurement/zzed$zzc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzed$zzc;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/zzdm;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzc:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzd:Lcom/google/android/gms/internal/measurement/zzdm;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzft;->zze:Lcom/google/android/gms/internal/measurement/zzed$zzc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzed$zzc;->zza:Lcom/google/android/gms/internal/measurement/zzed;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzed$zzb;-><init>(Lcom/google/android/gms/internal/measurement/zzed;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zze:Lcom/google/android/gms/internal/measurement/zzed$zzc;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzed$zzc;->zza:Lcom/google/android/gms/internal/measurement/zzed;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;)Lcom/google/android/gms/internal/measurement/zzdl;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzc:Landroid/app/Activity;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzd:Lcom/google/android/gms/internal/measurement/zzdm;

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzed$zzb;->zzb:J

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdl;->onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzeb;Lcom/google/android/gms/internal/measurement/zzdq;J)V

    return-void
.end method

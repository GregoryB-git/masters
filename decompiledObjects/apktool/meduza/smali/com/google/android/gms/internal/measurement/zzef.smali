.class final Lcom/google/android/gms/internal/measurement/zzef;
.super Lcom/google/android/gms/internal/measurement/zzed$zzb;
.source "SourceFile"


# instance fields
.field private final synthetic zzc:Ljava/lang/String;

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:Ljava/lang/Object;

.field private final synthetic zzf:Z

.field private final synthetic zzg:Lcom/google/android/gms/internal/measurement/zzed;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzed;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzef;->zze:Ljava/lang/Object;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzf:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzed$zzb;-><init>(Lcom/google/android/gms/internal/measurement/zzed;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzg:Lcom/google/android/gms/internal/measurement/zzed;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Lcom/google/android/gms/internal/measurement/zzed;)Lcom/google/android/gms/internal/measurement/zzdl;

    move-result-object v1

    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzc:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzd:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzef;->zze:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v4

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/zzef;->zzf:Z

    iget-wide v6, p0, Lcom/google/android/gms/internal/measurement/zzed$zzb;->zza:J

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzdl;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/dynamic/IObjectWrapper;ZJ)V

    return-void
.end method

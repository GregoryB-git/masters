.class public abstract Lcom/google/android/gms/internal/measurement/zzco;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/measurement/zzco;

.field public static final zzb:Lcom/google/android/gms/internal/measurement/zzco;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcd;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcd;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Z)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzcq;->zza:Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcq;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzcp;->zza:Lcom/google/android/gms/internal/measurement/zzcp;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcp;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcn;->zza()Lcom/google/android/gms/internal/measurement/zzco;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzco;->zza:Lcom/google/android/gms/internal/measurement/zzco;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcd;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcd;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Z)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/internal/measurement/zzcq;->zzc:Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcq;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcp;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcn;->zza()Lcom/google/android/gms/internal/measurement/zzco;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzco;->zzb:Lcom/google/android/gms/internal/measurement/zzco;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcd;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcd;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Z)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcq;->zzb:Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcq;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzcn;->zza(Lcom/google/android/gms/internal/measurement/zzcp;)Lcom/google/android/gms/internal/measurement/zzcn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcn;->zza()Lcom/google/android/gms/internal/measurement/zzco;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract zza()Lcom/google/android/gms/internal/measurement/zzcc;
.end method

.method public abstract zzb()Lcom/google/android/gms/internal/measurement/zzcb;
.end method

.method public abstract zzc()Lcom/google/android/gms/internal/measurement/zzcq;
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/measurement/zzcp;
.end method

.method public abstract zze()Ljava/lang/String;
.end method

.method public abstract zzf()Z
.end method

.class final Lcom/google/android/gms/internal/fido/zzbf;
.super Lcom/google/android/gms/internal/fido/zzbb;
.source "SourceFile"


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/fido/zzbg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fido/zzbg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fido/zzbf;->zza:Lcom/google/android/gms/internal/fido/zzbg;

    invoke-direct {p0}, Lcom/google/android/gms/internal/fido/zzbb;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fido/zzbc;->zzi()Lcom/google/android/gms/internal/fido/zzaz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fido/zzaz;->zzk(I)Lcom/google/android/gms/internal/fido/zzcc;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/fido/zzcb;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fido/zzbc;->zzi()Lcom/google/android/gms/internal/fido/zzaz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fido/zzaz;->zzk(I)Lcom/google/android/gms/internal/fido/zzcc;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/fido/zzba;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fido/zzbf;->zza:Lcom/google/android/gms/internal/fido/zzbg;

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/internal/fido/zzaz;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/fido/zzbe;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fido/zzbe;-><init>(Lcom/google/android/gms/internal/fido/zzbf;)V

    return-object v0
.end method

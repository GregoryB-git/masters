.class final Lcom/google/android/gms/internal/firebase-auth-api/zzao;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaj;
.source "SourceFile"


# instance fields
.field private final transient zza:I

.field private final transient zzb:I

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaj;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaj;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzb:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzb:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzw;->zza(II)I

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzb:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza(II)Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    move-result-object p1

    return-object p1
.end method

.method public final zza()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzai;->zzb()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzb:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zza(II)Lcom/google/android/gms/internal/firebase-auth-api/zzaj;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzb:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzw;->zza(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaj;->subList(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    return-object p1
.end method

.method public final zzb()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzai;->zzb()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zza:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zze()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzf()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzao;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzai;->zzf()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

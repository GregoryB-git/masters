.class final Lcom/google/android/gms/internal/firebase-auth-api/zzz;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzac;
.source "SourceFile"


# instance fields
.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaa;Lcom/google/android/gms/internal/firebase-auth-api/zzv;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/firebase-auth-api/zzm;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzm;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzac;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzv;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final zza(I)I
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzm;->zza()I

    move-result p1

    return p1
.end method

.method public final zzb(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzm;->zza(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzm;->zzb()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

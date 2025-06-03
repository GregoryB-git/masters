.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzcq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzxc;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzxc;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcq;->zza()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static zza()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqw;->zza()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcy;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdn;->zza(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzij;->zzb()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdx;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzec;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzei;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzem;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfu;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfp;->zza(Z)V

    return-void
.end method

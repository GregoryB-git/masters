.class final Lcom/google/android/gms/internal/firebase-auth-api/zzafb;
.super Lb8/f0;
.source "SourceFile"


# instance fields
.field private final synthetic zza:Lb8/f0;

.field private final synthetic zzb:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb8/f0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza:Lb8/f0;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzb:Ljava/lang/String;

    invoke-direct {p0}, Lb8/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza:Lb8/f0;

    invoke-virtual {v0, p1}, Lb8/f0;->onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V

    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;Lb8/e0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza:Lb8/f0;

    invoke-virtual {v0, p1, p2}, Lb8/f0;->onCodeSent(Ljava/lang/String;Lb8/e0;)V

    return-void
.end method

.method public final onVerificationCompleted(Lb8/c0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza:Lb8/f0;

    invoke-virtual {v0, p1}, Lb8/f0;->onVerificationCompleted(Lb8/c0;)V

    return-void
.end method

.method public final onVerificationFailed(Lu7/h;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza:Lb8/f0;

    invoke-virtual {v0, p1}, Lb8/f0;->onVerificationFailed(Lu7/h;)V

    return-void
.end method

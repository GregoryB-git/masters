.class final Lcom/google/android/gms/internal/firebase-auth-api/zzy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzab;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzf;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzv;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzf;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzx;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzy;Lcom/google/android/gms/internal/firebase-auth-api/zzv;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/firebase-auth-api/zzf;)V

    return-object v0
.end method

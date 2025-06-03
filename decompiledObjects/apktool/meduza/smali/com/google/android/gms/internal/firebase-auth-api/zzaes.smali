.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/zzaes;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaep;

.field private synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaer;

.field private synthetic zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaep;Lcom/google/android/gms/internal/firebase-auth-api/zzaer;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaep;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaer;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaep;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaer;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaes;->zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaep;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzado;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaer;->zza(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/firebase-auth-api/zzado;)V

    return-void
.end method

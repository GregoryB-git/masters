.class public final synthetic Lcom/google/android/gms/internal/measurement/zzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private synthetic zza:Lcom/google/android/gms/internal/measurement/zzb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzd;->zza:Lcom/google/android/gms/internal/measurement/zzb;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzd;->zza:Lcom/google/android/gms/internal/measurement/zzb;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzb;->zza(Lcom/google/android/gms/internal/measurement/zzb;)Lcom/google/android/gms/internal/measurement/zzal;

    move-result-object v0

    return-object v0
.end method

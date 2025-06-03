.class public final Lcom/google/android/gms/internal/measurement/zzde;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile zza:Lcom/google/android/gms/internal/measurement/zzdb;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdd;-><init>(Lcom/google/android/gms/internal/measurement/zzdg;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzde;->zza:Lcom/google/android/gms/internal/measurement/zzdb;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/measurement/zzdb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzde;->zza:Lcom/google/android/gms/internal/measurement/zzdb;

    return-object v0
.end method

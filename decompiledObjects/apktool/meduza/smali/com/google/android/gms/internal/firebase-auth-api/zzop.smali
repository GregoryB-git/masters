.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/zzop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzpz;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzom;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzoo;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoo;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zznh;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznj;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zznh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznh;)V

    return-object v0
.end method

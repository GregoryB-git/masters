.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzaew;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzagw;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Ljava/lang/String;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Ljava/lang/String;

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final synthetic zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zza:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzb:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzc:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzd:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 8

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zza:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzb:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzc:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzd:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    invoke-static {p1, v0, v7, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzahn;Lcom/google/android/gms/internal/firebase-auth-api/zzaet;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lc8/p;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;->zza(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

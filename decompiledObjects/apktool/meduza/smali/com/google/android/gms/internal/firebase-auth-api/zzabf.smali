.class final Lcom/google/android/gms/internal/firebase-auth-api/zzabf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzaew;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzagm;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzabc;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;->zza()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    const-string v0, "No users"

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

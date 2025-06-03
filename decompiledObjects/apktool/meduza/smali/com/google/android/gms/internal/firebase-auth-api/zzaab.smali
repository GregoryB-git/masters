.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaab;
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
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

.field private final synthetic zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

.field private final synthetic zze:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Lcom/google/android/gms/internal/firebase-auth-api/zzaet;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzahm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 7

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;->zza()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzaet;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    const-string v0, "No users"

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaab;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaet;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

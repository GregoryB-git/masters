.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaat;
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

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

.field private final synthetic zzc:Ljava/lang/String;

.field private final synthetic zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

.field private final synthetic zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzc:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;->zza()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    invoke-direct {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;-><init>()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzzv;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzzv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzv;Lcom/google/android/gms/internal/firebase-auth-api/zzadp;Lcom/google/android/gms/internal/firebase-auth-api/zzagw;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzaet;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaew;

    const-string v0, "No users."

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaet;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lc8/p;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzadp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadp;->zza(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

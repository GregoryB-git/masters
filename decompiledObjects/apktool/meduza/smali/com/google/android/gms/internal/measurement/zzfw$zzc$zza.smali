.class public final Lcom/google/android/gms/internal/measurement/zzfw$zzc$zza;
.super Lcom/google/android/gms/internal/measurement/zzkg$zza;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzlo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzfw$zzc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzkg$zza<",
        "Lcom/google/android/gms/internal/measurement/zzfw$zzc;",
        "Lcom/google/android/gms/internal/measurement/zzfw$zzc$zza;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzlo;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfw$zzc;->zza()Lcom/google/android/gms/internal/measurement/zzfw$zzc;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzkg$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzkg;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzfz;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzfw$zzc$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfw$zzc$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzkg$zza;->zzam()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkg$zza;->zza:Lcom/google/android/gms/internal/measurement/zzkg;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfw$zzc;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/zzfw$zzc;->zza(Lcom/google/android/gms/internal/measurement/zzfw$zzc;Ljava/lang/String;)V

    return-object p0
.end method

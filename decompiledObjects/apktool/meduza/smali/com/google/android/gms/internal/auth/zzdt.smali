.class final Lcom/google/android/gms/internal/auth/zzdt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public zza:I

.field public zzb:J

.field public zzc:Ljava/lang/Object;

.field public final zzd:Lcom/google/android/gms/internal/auth/zzel;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/auth/zzel;->zza:Lcom/google/android/gms/internal/auth/zzel;

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/auth/zzel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzdt;->zzd:Lcom/google/android/gms/internal/auth/zzel;

    return-void
.end method

.class final Lcom/google/android/gms/internal/firebase-auth-api/zzajf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

.field private final zzb:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzb:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb([B)Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/gms/internal/firebase-auth-api/zzajj;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajh;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzb:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajh;-><init>([B)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzajo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    return-object v0
.end method

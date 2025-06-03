.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzpi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zza:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

.field private final zze:I

.field private final zzf:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzzn;Lcom/google/android/gms/internal/firebase-auth-api/zzwc;Lcom/google/android/gms/internal/firebase-auth-api/zzxd;ILjava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzbo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzzn;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwc;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzxd;",
            "I",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbo;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zza:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    iput p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zze:I

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzf:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzzn;Lcom/google/android/gms/internal/firebase-auth-api/zzwc;Lcom/google/android/gms/internal/firebase-auth-api/zzxd;ILjava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzpl;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzzn;Lcom/google/android/gms/internal/firebase-auth-api/zzwc;Lcom/google/android/gms/internal/firebase-auth-api/zzxd;ILjava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzbo;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpi;)Lcom/google/android/gms/internal/firebase-auth-api/zzzn;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    return-object p0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zze:I

    return v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzxd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    return-object v0
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zza:Ljava/lang/Object;

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzf:Ljava/lang/String;

    return-object v0
.end method

.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzbs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

.field private final zzb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbv;",
            ">;"
        }
    .end annotation
.end field

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznr;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwl;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbv;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zznr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznr;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznr;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zznr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwl;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbv;",
            ">;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zznr;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznr;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zznr;Lcom/google/android/gms/internal/firebase-auth-api/zzby;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zznr;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzbo;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zza()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzxd;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzpn;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzom;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcm;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    move-result-object v1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzpq;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzpn;Lcom/google/android/gms/internal/firebase-auth-api/zzcm;)V

    return-object v0

    :cond_1
    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpq;Lcom/google/android/gms/internal/firebase-auth-api/zzcm;)Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object p0

    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwc;)Lcom/google/android/gms/internal/firebase-auth-api/zzbq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbr;->zza:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    return-object p0
.end method

.method public static final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbp;)Lcom/google/android/gms/internal/firebase-auth-api/zzbs;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbp;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbu;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbt;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;Lcom/google/android/gms/internal/firebase-auth-api/zzby;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzbt;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbt;)Lcom/google/android/gms/internal/firebase-auth-api/zzbu;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbu;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzbs;

    move-result-object p0

    return-object p0
.end method

.method public static final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzca;Lcom/google/android/gms/internal/firebase-auth-api/zzbe;[B)Lcom/google/android/gms/internal/firebase-auth-api/zzbs;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzca;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzuz;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzuz;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zzb()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzuz;Lcom/google/android/gms/internal/firebase-auth-api/zzbe;[B)Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Lcom/google/android/gms/internal/firebase-auth-api/zzbs;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "empty keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Lcom/google/android/gms/internal/firebase-auth-api/zzbs;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;)V

    return-object v1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    move-result-object p0

    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzuz;Lcom/google/android/gms/internal/firebase-auth-api/zzbe;[B)Lcom/google/android/gms/internal/firebase-auth-api/zzwl;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzuz;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zzd()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbe;->zza([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajv;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajv;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zza([BLcom/google/android/gms/internal/firebase-auth-api/zzajv;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakm; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmz;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzmz;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcn;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V

    invoke-static {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzpj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznr;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpj;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznr;)Lcom/google/android/gms/internal/firebase-auth-api/zzpj;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzwc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v3

    :try_start_0
    invoke-virtual {p1, v3, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmz;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zza()I

    move-result v5

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zzb()I

    move-result v6

    if-ne v5, v6, :cond_0

    invoke-virtual {v0, v4, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpj;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzpj;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v4, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpj;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzpj;

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzf()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to get primitive "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for key of type "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", see https://developers.google.com/tink/faq/registration_errors"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzf()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Key parsing of key with index "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and type_url "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " failed, unable to get primitive"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpj;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmz;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzom;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcm;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzom;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzcm;)Lcom/google/android/gms/internal/firebase-auth-api/zzpq;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zze()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Wrong ID set for key with ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbq;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zzf()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;)Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwc;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzxd;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unknown key status"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V

    return-void
.end method

.method private static zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwl;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbv;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zza()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zze()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zza()I

    move-result v6

    :try_start_0
    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v4

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwc;)Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zzb()I

    move-result v2

    if-ne v6, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    move v7, v2

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;IZLcom/google/android/gms/internal/firebase-auth-api/zzby;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zza()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcn;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzbs;
    .locals 14

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zzb;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v6

    instance-of v6, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    invoke-interface {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v6

    new-instance v13, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    move-result-object v9

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zza()I

    move-result v10

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzd()Z

    move-result v11

    const/4 v12, 0x0

    move-object v7, v13

    move-object v8, v6

    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;IZLcom/google/android/gms/internal/firebase-auth-api/zzby;)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    move-result-object v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;->zza()I

    move-result v5

    invoke-static {v6, v7, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    move-result-object v5

    goto :goto_2

    :cond_0
    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    if-ne v7, v8, :cond_2

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzf()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v6

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzcj;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;)Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzn()Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwb;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza$zza;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    :try_start_0
    invoke-static {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zza()I

    move-result v9

    new-instance v13, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzwc;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwc;)Lcom/google/android/gms/internal/firebase-auth-api/zzbq;

    move-result-object v8

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zzb()I

    move-result v6

    if-ne v9, v6, :cond_1

    const/4 v6, 0x1

    move v10, v6

    goto :goto_1

    :cond_1
    move v10, v3

    :goto_1
    const/4 v11, 0x0

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzbv;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzbo;Lcom/google/android/gms/internal/firebase-auth-api/zzbq;IZLcom/google/android/gms/internal/firebase-auth-api/zzby;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zzb;

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "The keyset contains a non-private key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zzb()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zzb;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznr;

    invoke-direct {v2, v0, v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zznr;)V

    return-object v2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cleartext keyset is not available"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbf;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbf;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzmz;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzmz;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmz;->zza(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmz;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v0, "No wrapper found for "

    .line 25
    .line 26
    invoke-static {v0, p2}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 35
    .line 36
    const-string p2, "Currently only subclasses of InternalConfiguration are accepted"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbz;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl;->zze()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwl$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwb;->zzf()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "keyset contains key material of type %s for type url %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbz;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbz;Lcom/google/android/gms/internal/firebase-auth-api/zzbe;[B)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzain;->zzk()[B

    move-result-object v1

    invoke-interface {p2, v1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzbe;->zzb([B[B)[B

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzuz;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzuz$zza;

    move-result-object p3

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza([B)Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzuz$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;)Lcom/google/android/gms/internal/firebase-auth-api/zzuz$zza;

    move-result-object p2

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcn;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwl;)Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzuz$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwo;)Lcom/google/android/gms/internal/firebase-auth-api/zzuz$zza;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzuz;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbz;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzuz;)V

    return-void
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzbs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwl;

    return-object v0
.end method

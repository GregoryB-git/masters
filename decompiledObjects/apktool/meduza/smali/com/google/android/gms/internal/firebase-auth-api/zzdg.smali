.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzdg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoy<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzdf;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbe;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbe;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzdk;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbe;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzdf;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpa;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzsy;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznl;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzalw;)Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzdf;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc()I

    move-result v0

    const/16 v1, 0x18

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdf;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;)Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzo;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzo;)Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdf$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdf;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static zza()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public static zza(Z)V
    .locals 5

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;->zza()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzgf;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzon;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object p0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzfg;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    const-string v2, "AES128_EAX"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zzb;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    move-result-object v1

    const-string v4, "AES128_EAX_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzfg;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    const-string v4, "AES256_EAX"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdk$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzoc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoc;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzna;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbn;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.class final Lcom/google/android/gms/internal/auth/zzfp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/zzgj;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/auth/zzfv;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/auth/zzfv;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzfn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzfn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/zzfp;->zza:Lcom/google/android/gms/internal/auth/zzfv;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/auth/zzfo;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/auth/zzfv;

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzes;->zza()Lcom/google/android/gms/internal/auth/zzes;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v4, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/auth/zzfv;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/google/android/gms/internal/auth/zzfp;->zza:Lcom/google/android/gms/internal/auth/zzfv;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/zzfo;-><init>([Lcom/google/android/gms/internal/auth/zzfv;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/auth/zzfa;->zza:Ljava/nio/charset/Charset;

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/zzfp;->zzb:Lcom/google/android/gms/internal/auth/zzfv;

    return-void
.end method

.method private static zzb(Lcom/google/android/gms/internal/auth/zzfu;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/auth/zzfu;->zzc()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/zzgi;
    .locals 9

    const-class v0, Lcom/google/android/gms/internal/auth/zzev;

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zzgk;->zze(Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfp;->zzb:Lcom/google/android/gms/internal/auth/zzfv;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/auth/zzfv;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/zzfu;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/auth/zzfu;->zzb()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgk;->zzb()Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzeo;->zzb()Lcom/google/android/gms/internal/auth/zzem;

    move-result-object v0

    :goto_0
    invoke-interface {v3}, Lcom/google/android/gms/internal/auth/zzfu;->zza()Lcom/google/android/gms/internal/auth/zzfx;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzgb;->zzb(Lcom/google/android/gms/internal/auth/zzgz;Lcom/google/android/gms/internal/auth/zzem;Lcom/google/android/gms/internal/auth/zzfx;)Lcom/google/android/gms/internal/auth/zzgb;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgk;->zza()Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzeo;->zza()Lcom/google/android/gms/internal/auth/zzem;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzfp;->zzb(Lcom/google/android/gms/internal/auth/zzfu;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgd;->zzb()Lcom/google/android/gms/internal/auth/zzgc;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfl;->zzd()Lcom/google/android/gms/internal/auth/zzfl;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgk;->zzb()Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object v6

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzeo;->zzb()Lcom/google/android/gms/internal/auth/zzem;

    move-result-object v7

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzft;->zzb()Lcom/google/android/gms/internal/auth/zzfs;

    move-result-object v8

    goto :goto_3

    :cond_3
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzfp;->zzb(Lcom/google/android/gms/internal/auth/zzfu;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgd;->zza()Lcom/google/android/gms/internal/auth/zzgc;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfl;->zzc()Lcom/google/android/gms/internal/auth/zzfl;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgk;->zza()Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object v6

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzeo;->zza()Lcom/google/android/gms/internal/auth/zzem;

    move-result-object v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzft;->zza()Lcom/google/android/gms/internal/auth/zzfs;

    move-result-object v8

    :goto_3
    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/auth/zzga;->zzj(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/zzfu;Lcom/google/android/gms/internal/auth/zzgc;Lcom/google/android/gms/internal/auth/zzfl;Lcom/google/android/gms/internal/auth/zzgz;Lcom/google/android/gms/internal/auth/zzem;Lcom/google/android/gms/internal/auth/zzfs;)Lcom/google/android/gms/internal/auth/zzga;

    move-result-object p1

    return-object p1
.end method

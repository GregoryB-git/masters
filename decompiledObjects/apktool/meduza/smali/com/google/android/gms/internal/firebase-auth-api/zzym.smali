.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzym;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzys<",
        "TJcePrimitiveT;>;JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzym;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzym<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyv;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzym;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzym<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyz;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzym;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzym<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyu;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzym;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzym<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyw;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzym;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzym<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyx;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzyq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzyq<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyv;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyv;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyz;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyz;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzzb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzb;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyy;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyy;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyu;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyw;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzyx;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyx;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzym;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzij;->zzb()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzyr;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;Lcom/google/android/gms/internal/firebase-auth-api/zzyt;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzyq;

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzyp;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyp;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;Lcom/google/android/gms/internal/firebase-auth-api/zzyt;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzyo;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyo;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzys;Lcom/google/android/gms/internal/firebase-auth-api/zzyt;)V

    goto :goto_0
.end method

.method public static varargs zza([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TJcePrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzyq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyq;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

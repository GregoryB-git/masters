.class public final enum Lcom/google/android/recaptcha/internal/zzlq;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zznf;


# static fields
.field public static final enum zza:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzb:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzc:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzd:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zze:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzf:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzg:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzh:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzi:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzj:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzk:Lcom/google/android/recaptcha/internal/zzlq;

.field public static final enum zzl:Lcom/google/android/recaptcha/internal/zzlq;

.field private static final synthetic zzm:[Lcom/google/android/recaptcha/internal/zzlq;


# instance fields
.field private final zzn:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v1, "EDITION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzlq;->zza:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v1, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v3, "EDITION_LEGACY"

    const/4 v4, 0x1

    const/16 v5, 0x384

    invoke-direct {v1, v3, v4, v5}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/recaptcha/internal/zzlq;->zzb:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v3, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v5, "EDITION_PROTO2"

    const/4 v6, 0x2

    const/16 v7, 0x3e6

    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/recaptcha/internal/zzlq;->zzc:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v5, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v7, "EDITION_PROTO3"

    const/4 v8, 0x3

    const/16 v9, 0x3e7

    invoke-direct {v5, v7, v8, v9}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/recaptcha/internal/zzlq;->zzd:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v7, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v9, "EDITION_2023"

    const/4 v10, 0x4

    const/16 v11, 0x3e8

    invoke-direct {v7, v9, v10, v11}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/recaptcha/internal/zzlq;->zze:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v9, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v11, "EDITION_2024"

    const/4 v12, 0x5

    const/16 v13, 0x3e9

    invoke-direct {v9, v11, v12, v13}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/recaptcha/internal/zzlq;->zzf:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v11, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v13, "EDITION_1_TEST_ONLY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v4}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/recaptcha/internal/zzlq;->zzg:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v13, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v15, "EDITION_2_TEST_ONLY"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v6}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/recaptcha/internal/zzlq;->zzh:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v15, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v14, "EDITION_99997_TEST_ONLY"

    const/16 v12, 0x8

    const v10, 0x1869d

    invoke-direct {v15, v14, v12, v10}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lcom/google/android/recaptcha/internal/zzlq;->zzi:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v10, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v14, "EDITION_99998_TEST_ONLY"

    const/16 v12, 0x9

    const v8, 0x1869e

    invoke-direct {v10, v14, v12, v8}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/recaptcha/internal/zzlq;->zzj:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v8, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v14, "EDITION_99999_TEST_ONLY"

    const/16 v12, 0xa

    const v6, 0x1869f

    invoke-direct {v8, v14, v12, v6}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/recaptcha/internal/zzlq;->zzk:Lcom/google/android/recaptcha/internal/zzlq;

    new-instance v6, Lcom/google/android/recaptcha/internal/zzlq;

    const-string v14, "EDITION_MAX"

    const/16 v12, 0xb

    const v4, 0x7fffffff

    invoke-direct {v6, v14, v12, v4}, Lcom/google/android/recaptcha/internal/zzlq;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/recaptcha/internal/zzlq;->zzl:Lcom/google/android/recaptcha/internal/zzlq;

    const/16 v4, 0xc

    new-array v4, v4, [Lcom/google/android/recaptcha/internal/zzlq;

    aput-object v0, v4, v2

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v10, v4, v0

    const/16 v0, 0xa

    aput-object v8, v4, v0

    aput-object v6, v4, v12

    sput-object v4, Lcom/google/android/recaptcha/internal/zzlq;->zzm:[Lcom/google/android/recaptcha/internal/zzlq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/recaptcha/internal/zzlq;->zzn:I

    return-void
.end method

.method public static values()[Lcom/google/android/recaptcha/internal/zzlq;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzlq;->zzm:[Lcom/google/android/recaptcha/internal/zzlq;

    invoke-virtual {v0}, [Lcom/google/android/recaptcha/internal/zzlq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/recaptcha/internal/zzlq;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzlq;->zzn:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzlq;->zzn:I

    return v0
.end method

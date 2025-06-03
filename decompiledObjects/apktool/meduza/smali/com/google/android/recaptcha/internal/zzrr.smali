.class public final Lcom/google/android/recaptcha/internal/zzrr;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzrr;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/recaptcha/internal/zzml;

.field private zzk:Lcom/google/android/recaptcha/internal/zzpj;

.field private zzl:I

.field private zzm:Lcom/google/android/recaptcha/internal/zzqz;

.field private zzn:Lcom/google/android/recaptcha/internal/zznk;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzrr;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzrr;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    const-class v1, Lcom/google/android/recaptcha/internal/zzrr;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzrr;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzrr;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zznd;->zzB()Lcom/google/android/recaptcha/internal/zznk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzrr;->zzn:Lcom/google/android/recaptcha/internal/zznk;

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzrr;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    return-object v0
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zzrr;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    return-object v0
.end method

.method public static zzi([B)Lcom/google/android/recaptcha/internal/zzrr;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zznd;->zzx(Lcom/google/android/recaptcha/internal/zznd;[B)Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zzrr;

    return-object p0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x6

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_5

    const/4 p2, 0x0

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrr;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zzrr;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrr;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzrr;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    :cond_1
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-object p1

    :cond_3
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzrp;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzrp;-><init>(Lcom/google/android/recaptcha/internal/zzrq;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzrr;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzrr;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zze"

    const/16 v4, 0xb

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const-string p1, "zzf"

    aput-object p1, v4, p2

    const-string p1, "zzj"

    aput-object p1, v4, v3

    const-string p1, "zzk"

    aput-object p1, v4, v2

    const-string p1, "zzl"

    aput-object p1, v4, v1

    const-string p1, "zzn"

    aput-object p1, v4, v0

    const-class p1, Lcom/google/android/recaptcha/internal/zzri;

    aput-object p1, v4, p3

    const/4 p1, 0x7

    const-string p2, "zzg"

    aput-object p2, v4, p1

    const/16 p1, 0x8

    const-string p2, "zzh"

    aput-object p2, v4, p1

    const/16 p1, 0x9

    const-string p2, "zzi"

    aput-object p2, v4, p1

    const/16 p1, 0xa

    const-string p2, "zzm"

    aput-object p2, v4, p1

    sget-object p1, Lcom/google/android/recaptcha/internal/zzrr;->zzb:Lcom/google/android/recaptcha/internal/zzrr;

    const-string p2, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003\u1009\u0000\u0004\u1009\u0001\u0005\u000c\u0007\u001b\u0008\u000c\t\u0208\n\u0208\u000b\u1009\u0002"

    invoke-static {p1, p2, v4}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

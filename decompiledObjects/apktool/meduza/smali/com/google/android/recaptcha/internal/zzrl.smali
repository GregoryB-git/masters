.class public final Lcom/google/android/recaptcha/internal/zzrl;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzrl;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/recaptcha/internal/zzml;

.field private zzg:Lcom/google/android/recaptcha/internal/zzpj;

.field private zzh:Lcom/google/android/recaptcha/internal/zzml;

.field private zzi:Lcom/google/android/recaptcha/internal/zzpj;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzrl;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzrl;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    const-class v1, Lcom/google/android/recaptcha/internal/zzrl;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    return-void
.end method

.method public static zzf()Lcom/google/android/recaptcha/internal/zzrj;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zznd;->zzq()Lcom/google/android/recaptcha/internal/zzmx;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzrj;

    return-object v0
.end method

.method public static bridge synthetic zzg()Lcom/google/android/recaptcha/internal/zzrl;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    return-object v0
.end method

.method public static synthetic zzi(Lcom/google/android/recaptcha/internal/zzrl;Lcom/google/android/recaptcha/internal/zzpj;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zzi:Lcom/google/android/recaptcha/internal/zzpj;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    return-void
.end method

.method public static synthetic zzj(Lcom/google/android/recaptcha/internal/zzrl;Lcom/google/android/recaptcha/internal/zzml;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zzh:Lcom/google/android/recaptcha/internal/zzml;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    return-void
.end method

.method public static synthetic zzk(Lcom/google/android/recaptcha/internal/zzrl;Lcom/google/android/recaptcha/internal/zzpj;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zzg:Lcom/google/android/recaptcha/internal/zzpj;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    return-void
.end method

.method public static synthetic zzl(Lcom/google/android/recaptcha/internal/zzrl;Lcom/google/android/recaptcha/internal/zzml;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zzf:Lcom/google/android/recaptcha/internal/zzml;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzrl;->zze:I

    return-void
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    const/4 p2, 0x0

    if-eq p1, v0, :cond_4

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zzrl;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzrl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzrj;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzrj;-><init>(Lcom/google/android/recaptcha/internal/zzrk;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzrl;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzrl;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zze"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, p3, v3

    const-string p1, "zzf"

    aput-object p1, p3, p2

    const-string p1, "zzg"

    aput-object p1, p3, v2

    const-string p1, "zzh"

    aput-object p1, p3, v1

    const-string p1, "zzi"

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/recaptcha/internal/zzrl;->zzb:Lcom/google/android/recaptcha/internal/zzrl;

    const-string p2, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

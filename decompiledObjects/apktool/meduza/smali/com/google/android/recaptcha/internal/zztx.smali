.class public final Lcom/google/android/recaptcha/internal/zztx;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zztx;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zztx;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zztx;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    const-class v1, Lcom/google/android/recaptcha/internal/zztx;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    return-void
.end method

.method public static synthetic zzM(Lcom/google/android/recaptcha/internal/zztx;Lcom/google/android/recaptcha/internal/zzrr;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zztx;->zzf:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    return-void
.end method

.method public static zzi()Lcom/google/android/recaptcha/internal/zztw;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zznd;->zzq()Lcom/google/android/recaptcha/internal/zzmx;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zztw;

    return-object v0
.end method

.method public static bridge synthetic zzj()Lcom/google/android/recaptcha/internal/zztx;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    return-object v0
.end method

.method public static zzk([B)Lcom/google/android/recaptcha/internal/zztx;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zznd;->zzx(Lcom/google/android/recaptcha/internal/zznd;[B)Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zztx;

    return-object p0
.end method

.method public static synthetic zzl(Lcom/google/android/recaptcha/internal/zztx;Lcom/google/android/recaptcha/internal/zzrc;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zztx;->zzf:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    return-void
.end method


# virtual methods
.method public final zzN()I
    .locals 2

    iget v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x3

    return v0
.end method

.method public final zzf()Lcom/google/android/recaptcha/internal/zzrc;
    .locals 2

    iget v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zzf:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/recaptcha/internal/zzrc;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzrc;->zzk()Lcom/google/android/recaptcha/internal/zzrc;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Lcom/google/android/recaptcha/internal/zzrr;
    .locals 2

    iget v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zze:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zztx;->zzf:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/recaptcha/internal/zzrr;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzrr;->zzg()Lcom/google/android/recaptcha/internal/zzrr;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_6

    if-eq p1, v0, :cond_5

    const/4 p2, 0x0

    if-eq p1, p3, :cond_4

    const/4 p3, 0x5

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztx;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zztx;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztx;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zztx;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zztw;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zztw;-><init>(Lcom/google/android/recaptcha/internal/zzug;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zztx;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zztx;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zzf"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, p3, v2

    const-string p1, "zze"

    aput-object p1, p3, p2

    const-class p1, Lcom/google/android/recaptcha/internal/zzrc;

    aput-object p1, p3, v1

    const-class p1, Lcom/google/android/recaptcha/internal/zzrr;

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/recaptcha/internal/zztx;->zzb:Lcom/google/android/recaptcha/internal/zztx;

    const-string p2, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

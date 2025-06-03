.class public final Lcom/google/android/recaptcha/internal/zzse;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzse;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:Lcom/google/android/recaptcha/internal/zzle;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:Lcom/google/android/recaptcha/internal/zzle;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzse;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzse;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    const-class v1, Lcom/google/android/recaptcha/internal/zzse;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    sget-object v0, Lcom/google/android/recaptcha/internal/zzle;->zzb:Lcom/google/android/recaptcha/internal/zzle;

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zze:Lcom/google/android/recaptcha/internal/zzle;

    const-string v1, ""

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzse;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zzh:Lcom/google/android/recaptcha/internal/zzle;

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzse;->zzi:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzse;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic zzj()Lcom/google/android/recaptcha/internal/zzse;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    return-object v0
.end method

.method public static zzk()Lcom/google/android/recaptcha/internal/zzse;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    return-object v0
.end method


# virtual methods
.method public final zzf()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zzg:J

    return-wide v0
.end method

.method public final zzg()Lcom/google/android/recaptcha/internal/zzle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zzh:Lcom/google/android/recaptcha/internal/zzle;

    return-object v0
.end method

.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzse;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zzse;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzse;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzse;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzsd;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzsd;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzse;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzse;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zze"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, p3, v4

    const-string p1, "zzf"

    aput-object p1, p3, p2

    const-string p1, "zzg"

    aput-object p1, p3, v3

    const-string p1, "zzh"

    aput-object p1, p3, v2

    const-string p1, "zzi"

    aput-object p1, p3, v1

    const-string p1, "zzj"

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/recaptcha/internal/zzse;->zzb:Lcom/google/android/recaptcha/internal/zzse;

    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\u0208\u0003\u0002\u0004\n\u0005\u0208\u0006\u0208"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzi()Lcom/google/android/recaptcha/internal/zzle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zze:Lcom/google/android/recaptcha/internal/zzle;

    return-object v0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzse;->zzf:Ljava/lang/String;

    return-object v0
.end method

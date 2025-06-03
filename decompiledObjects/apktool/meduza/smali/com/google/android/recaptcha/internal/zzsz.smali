.class public final Lcom/google/android/recaptcha/internal/zzsz;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzsz;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/recaptcha/internal/zznk;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzsz;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzsz;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    const-class v1, Lcom/google/android/recaptcha/internal/zzsz;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zznd;->zzB()Lcom/google/android/recaptcha/internal/zznk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzg:Lcom/google/android/recaptcha/internal/zznk;

    return-void
.end method

.method public static zzf()Lcom/google/android/recaptcha/internal/zzsy;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zznd;->zzq()Lcom/google/android/recaptcha/internal/zzmx;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzsy;

    return-object v0
.end method

.method public static bridge synthetic zzg()Lcom/google/android/recaptcha/internal/zzsz;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    return-object v0
.end method

.method public static synthetic zzi(Lcom/google/android/recaptcha/internal/zzsz;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsz;->zzl()V

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzg:Lcom/google/android/recaptcha/internal/zznk;

    invoke-static {p1, p0}, Lcom/google/android/recaptcha/internal/zzko;->zzc(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic zzj(Lcom/google/android/recaptcha/internal/zzsz;Lcom/google/android/recaptcha/internal/zzsx;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsz;->zzl()V

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzg:Lcom/google/android/recaptcha/internal/zznk;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic zzk(Lcom/google/android/recaptcha/internal/zzsz;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zze:I

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzf:Ljava/lang/String;

    return-void
.end method

.method private final zzl()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzg:Lcom/google/android/recaptcha/internal/zznk;

    invoke-interface {v0}, Lcom/google/android/recaptcha/internal/zznk;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zznd;->zzC(Lcom/google/android/recaptcha/internal/zznk;)Lcom/google/android/recaptcha/internal/zznk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzsz;->zzg:Lcom/google/android/recaptcha/internal/zznk;

    :cond_0
    return-void
.end method


# virtual methods
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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzsz;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zzsz;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzsz;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzsz;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzsy;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzsy;-><init>(Lcom/google/android/recaptcha/internal/zzta;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzsz;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzsz;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zze"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, p3, v2

    const-string p1, "zzg"

    aput-object p1, p3, p2

    const-class p1, Lcom/google/android/recaptcha/internal/zzsx;

    aput-object p1, p3, v1

    const-string p1, "zzf"

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/recaptcha/internal/zzsz;->zzb:Lcom/google/android/recaptcha/internal/zzsz;

    const-string p2, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/google/android/recaptcha/internal/zzls;
.super Lcom/google/android/recaptcha/internal/zzna;
.source "SourceFile"


# static fields
.field private static final zzd:Lcom/google/android/recaptcha/internal/zzls;

.field private static volatile zze:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zzf:I

.field private zzg:Z

.field private zzh:Lcom/google/android/recaptcha/internal/zzma;

.field private zzi:Z

.field private zzj:Lcom/google/android/recaptcha/internal/zzmc;

.field private zzk:Lcom/google/android/recaptcha/internal/zznk;

.field private zzl:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzls;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzls;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    const-class v1, Lcom/google/android/recaptcha/internal/zzls;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzna;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzls;->zzl:B

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzot;->zze()Lcom/google/android/recaptcha/internal/zzot;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzls;->zzk:Lcom/google/android/recaptcha/internal/zznk;

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzls;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    return-object v0
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zzls;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    return-object v0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_8

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eq p1, v5, :cond_7

    if-eq p1, v4, :cond_6

    const/4 v4, 0x0

    if-eq p1, v3, :cond_5

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lcom/google/android/recaptcha/internal/zzls;->zzl:B

    return-object v4

    :cond_1
    sget-object p1, Lcom/google/android/recaptcha/internal/zzls;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_3

    const-class p2, Lcom/google/android/recaptcha/internal/zzls;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzls;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzls;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    :cond_2
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-object p1

    :cond_4
    sget-object p1, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzlr;

    invoke-direct {p1, v4}, Lcom/google/android/recaptcha/internal/zzlr;-><init>(Lcom/google/android/recaptcha/internal/zzmh;)V

    return-object p1

    :cond_6
    new-instance p1, Lcom/google/android/recaptcha/internal/zzls;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzls;-><init>()V

    return-object p1

    :cond_7
    const-string p1, "zzf"

    const/4 p2, 0x7

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "zzg"

    aput-object p1, p2, p3

    const-string p1, "zzh"

    aput-object p1, p2, v5

    const-string p1, "zzi"

    aput-object p1, p2, v4

    const-string p1, "zzj"

    aput-object p1, p2, v3

    const-string p1, "zzk"

    aput-object p1, p2, v2

    const-class p1, Lcom/google/android/recaptcha/internal/zzmg;

    aput-object p1, p2, v1

    sget-object p1, Lcom/google/android/recaptcha/internal/zzls;->zzd:Lcom/google/android/recaptcha/internal/zzls;

    new-instance p3, Lcom/google/android/recaptcha/internal/zzou;

    const-string v0, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u03e7\u041b"

    invoke-direct {p3, p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzou;-><init>(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_8
    iget-byte p1, p0, Lcom/google/android/recaptcha/internal/zzls;->zzl:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

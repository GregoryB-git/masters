.class public final Lcom/google/android/recaptcha/internal/zzmf;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzmf;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Z

.field private zzh:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzmf;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzmf;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzmf;->zzb:Lcom/google/android/recaptcha/internal/zzmf;

    const-class v1, Lcom/google/android/recaptcha/internal/zzmf;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzmf;->zzh:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzmf;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzmf;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzmf;->zzb:Lcom/google/android/recaptcha/internal/zzmf;

    return-object v0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_8

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_7

    if-eq p1, v1, :cond_6

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_5

    const/4 v1, 0x5

    if-eq p1, v1, :cond_4

    const/4 v1, 0x6

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lcom/google/android/recaptcha/internal/zzmf;->zzh:B

    return-object v2

    :cond_1
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmf;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_3

    const-class p2, Lcom/google/android/recaptcha/internal/zzmf;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmf;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzmf;->zzb:Lcom/google/android/recaptcha/internal/zzmf;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzmf;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmf;->zzb:Lcom/google/android/recaptcha/internal/zzmf;

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzme;

    invoke-direct {p1, v2}, Lcom/google/android/recaptcha/internal/zzme;-><init>(Lcom/google/android/recaptcha/internal/zzmh;)V

    return-object p1

    :cond_6
    new-instance p1, Lcom/google/android/recaptcha/internal/zzmf;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzmf;-><init>()V

    return-object p1

    :cond_7
    const-string p1, "zze"

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "zzf"

    aput-object p1, p2, p3

    const-string p1, "zzg"

    aput-object p1, p2, v2

    sget-object p1, Lcom/google/android/recaptcha/internal/zzmf;->zzb:Lcom/google/android/recaptcha/internal/zzmf;

    new-instance p3, Lcom/google/android/recaptcha/internal/zzou;

    const-string v0, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1507\u0001"

    invoke-direct {p3, p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzou;-><init>(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_8
    iget-byte p1, p0, Lcom/google/android/recaptcha/internal/zzmf;->zzh:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

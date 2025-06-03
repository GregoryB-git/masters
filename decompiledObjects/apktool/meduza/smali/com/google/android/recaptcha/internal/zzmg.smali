.class public final Lcom/google/android/recaptcha/internal/zzmg;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzmg;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/recaptcha/internal/zznk;

.field private zzg:Ljava/lang/String;

.field private zzh:J

.field private zzi:J

.field private zzj:D

.field private zzk:Lcom/google/android/recaptcha/internal/zzle;

.field private zzl:Ljava/lang/String;

.field private zzm:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzmg;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzmg;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzmg;->zzb:Lcom/google/android/recaptcha/internal/zzmg;

    const-class v1, Lcom/google/android/recaptcha/internal/zzmg;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzm:B

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzot;->zze()Lcom/google/android/recaptcha/internal/zzot;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzf:Lcom/google/android/recaptcha/internal/zznk;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzg:Ljava/lang/String;

    sget-object v1, Lcom/google/android/recaptcha/internal/zzle;->zzb:Lcom/google/android/recaptcha/internal/zzle;

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzk:Lcom/google/android/recaptcha/internal/zzle;

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzl:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzmg;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzmg;->zzb:Lcom/google/android/recaptcha/internal/zzmg;

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
    iput-byte p3, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzm:B

    return-object v4

    :cond_1
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmg;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_3

    const-class p2, Lcom/google/android/recaptcha/internal/zzmg;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmg;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzmg;->zzb:Lcom/google/android/recaptcha/internal/zzmg;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzmg;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzmg;->zzb:Lcom/google/android/recaptcha/internal/zzmg;

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzmd;

    invoke-direct {p1, v4}, Lcom/google/android/recaptcha/internal/zzmd;-><init>(Lcom/google/android/recaptcha/internal/zzmh;)V

    return-object p1

    :cond_6
    new-instance p1, Lcom/google/android/recaptcha/internal/zzmg;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzmg;-><init>()V

    return-object p1

    :cond_7
    const-string p1, "zze"

    const/16 p2, 0x9

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "zzf"

    aput-object p1, p2, p3

    const-class p1, Lcom/google/android/recaptcha/internal/zzmf;

    aput-object p1, p2, v5

    const-string p1, "zzg"

    aput-object p1, p2, v4

    const-string p1, "zzh"

    aput-object p1, p2, v3

    const-string p1, "zzi"

    aput-object p1, p2, v2

    const-string p1, "zzj"

    aput-object p1, p2, v1

    const/4 p1, 0x7

    const-string p3, "zzk"

    aput-object p3, p2, p1

    const/16 p1, 0x8

    const-string p3, "zzl"

    aput-object p3, p2, p1

    sget-object p1, Lcom/google/android/recaptcha/internal/zzmg;->zzb:Lcom/google/android/recaptcha/internal/zzmg;

    new-instance p3, Lcom/google/android/recaptcha/internal/zzou;

    const-string v0, "\u0001\u0007\u0000\u0001\u0002\u0008\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\u0008\u1008\u0005"

    invoke-direct {p3, p1, v0, p2}, Lcom/google/android/recaptcha/internal/zzou;-><init>(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_8
    iget-byte p1, p0, Lcom/google/android/recaptcha/internal/zzmg;->zzm:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

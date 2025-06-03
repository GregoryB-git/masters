.class public final Lcom/google/android/recaptcha/internal/zztl;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zztl;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zztl;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zztl;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    const-class v1, Lcom/google/android/recaptcha/internal/zztl;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/recaptcha/internal/zztl;->zze:I

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zztl;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    return-object v0
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zztl;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    return-object v0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x2

    if-eq p1, p3, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_5

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zztl;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zztl;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zztk;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zztk;-><init>(Lcom/google/android/recaptcha/internal/zztm;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zztl;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zztl;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zzf"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    const-string p1, "zze"

    aput-object p1, p3, p2

    sget-object p1, Lcom/google/android/recaptcha/internal/zztl;->zzb:Lcom/google/android/recaptcha/internal/zztl;

    const-string p2, "\u0000(\u0001\u0000\u0001((\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\u0008?\u0000\t?\u0000\n?\u0000\u000b?\u0000\u000c?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019?\u0000\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000\'?\u0000(?\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

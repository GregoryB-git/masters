.class public final Lcom/google/android/recaptcha/internal/zzub;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzub;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/recaptcha/internal/zzni;

.field private zzh:Lcom/google/android/recaptcha/internal/zznj;

.field private zzi:Lcom/google/android/recaptcha/internal/zztl;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzub;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzub;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    const-class v1, Lcom/google/android/recaptcha/internal/zzub;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zznd;->zzy()Lcom/google/android/recaptcha/internal/zzni;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzg:Lcom/google/android/recaptcha/internal/zzni;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zznd;->zzA()Lcom/google/android/recaptcha/internal/zznj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzh:Lcom/google/android/recaptcha/internal/zznj;

    return-void
.end method

.method public static bridge synthetic zzg()Lcom/google/android/recaptcha/internal/zzub;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    return-object v0
.end method

.method public static zzi([B)Lcom/google/android/recaptcha/internal/zzub;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zznd;->zzx(Lcom/google/android/recaptcha/internal/zznd;[B)Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zzub;

    return-object p0
.end method


# virtual methods
.method public final zzf()Lcom/google/android/recaptcha/internal/zztl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzi:Lcom/google/android/recaptcha/internal/zztl;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zztl;->zzg()Lcom/google/android/recaptcha/internal/zztl;

    move-result-object v0

    :cond_0
    return-object v0
.end method

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzub;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zzub;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzub;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zzub;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzua;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzua;-><init>(Lcom/google/android/recaptcha/internal/zzug;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzub;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzub;-><init>()V

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

    sget-object p1, Lcom/google/android/recaptcha/internal/zzub;->zzb:Lcom/google/android/recaptcha/internal/zzub;

    const-string p2, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0208\u0002\'\u0003%\u0004\u1009\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final zzk()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzub;->zzh:Lcom/google/android/recaptcha/internal/zznj;

    return-object v0
.end method

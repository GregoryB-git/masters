.class public final Lcom/google/android/recaptcha/internal/zztu;
.super Lcom/google/android/recaptcha/internal/zznd;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zztu;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zztu;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zztu;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    const-class v1, Lcom/google/android/recaptcha/internal/zztu;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zznd;-><init>()V

    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zztu;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    return-object v0
.end method

.method public static zzg(Ljava/io/InputStream;)Lcom/google/android/recaptcha/internal/zztu;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zznd;->zzw(Lcom/google/android/recaptcha/internal/zznd;Ljava/io/InputStream;)Lcom/google/android/recaptcha/internal/zznd;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zztu;

    return-object p0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_6

    if-eq p1, p3, :cond_5

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztu;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/recaptcha/internal/zztu;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zztu;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object p3, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object p1, Lcom/google/android/recaptcha/internal/zztu;->zzd:Lcom/google/android/recaptcha/internal/zzoq;

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
    sget-object p1, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zztt;

    invoke-direct {p1, p3}, Lcom/google/android/recaptcha/internal/zztt;-><init>(Lcom/google/android/recaptcha/internal/zzug;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zztu;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zztu;-><init>()V

    return-object p1

    :cond_6
    const-string p1, "zze"

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, p3, v1

    const-string p1, "zzf"

    aput-object p1, p3, p2

    const-string p1, "zzg"

    aput-object p1, p3, v0

    sget-object p1, Lcom/google/android/recaptcha/internal/zztu;->zzb:Lcom/google/android/recaptcha/internal/zztu;

    const-string p2, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001"

    invoke-static {p1, p2, p3}, Lcom/google/android/recaptcha/internal/zznd;->zzF(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzi()Lcom/google/android/recaptcha/internal/zztv;
    .locals 1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zztu;->zzg:I

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zztv;->zzb(I)Lcom/google/android/recaptcha/internal/zztv;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/recaptcha/internal/zztv;->zzk:Lcom/google/android/recaptcha/internal/zztv;

    :cond_0
    return-object v0
.end method

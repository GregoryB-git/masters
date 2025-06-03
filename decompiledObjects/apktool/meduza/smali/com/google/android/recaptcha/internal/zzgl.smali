.class public final Lcom/google/android/recaptcha/internal/zzgl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzgx;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzgl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzgl;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzgl;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzgl;->zza:Lcom/google/android/recaptcha/internal/zzgl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs zza(ILcom/google/android/recaptcha/internal/zzgd;[Lcom/google/android/recaptcha/internal/zzue;)V
    .locals 5

    array-length p1, p3

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-ne p1, v2, :cond_5

    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzgd;->zzc()Lcom/google/android/recaptcha/internal/zzge;

    move-result-object p1

    const/4 v2, 0x0

    aget-object v3, p3, v2

    invoke-virtual {p1, v3}, Lcom/google/android/recaptcha/internal/zzge;->zza(Lcom/google/android/recaptcha/internal/zzue;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Ljava/lang/String;

    const/4 v4, 0x1

    if-eq v4, v3, :cond_0

    move-object p1, v0

    :cond_0
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzgd;->zzc()Lcom/google/android/recaptcha/internal/zzge;

    move-result-object v3

    aget-object p3, p3, v4

    invoke-virtual {v3, p3}, Lcom/google/android/recaptcha/internal/zzge;->zza(Lcom/google/android/recaptcha/internal/zzue;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    instance-of v3, p3, Ljava/lang/Integer;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Short;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Byte;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Long;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Double;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Float;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Boolean;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/Character;

    if-nez v3, :cond_2

    instance-of v3, p3, Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzce;

    const/4 p2, 0x7

    invoke-direct {p1, v1, p2, v0}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzgd;->zzi()Lcom/google/android/recaptcha/internal/zzfw;

    move-result-object p2

    new-array v0, v4, [Ljava/lang/String;

    aput-object p3, v0, v2

    invoke-virtual {p2, p1, v0}, Lcom/google/android/recaptcha/internal/zzfw;->zzb(Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p1, Lcom/google/android/recaptcha/internal/zzce;

    invoke-direct {p1, v1, v1, v0}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/google/android/recaptcha/internal/zzce;

    const/4 p2, 0x5

    invoke-direct {p1, v1, p2, v0}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzce;

    const/4 p2, 0x3

    invoke-direct {p1, v1, p2, v0}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw p1
.end method

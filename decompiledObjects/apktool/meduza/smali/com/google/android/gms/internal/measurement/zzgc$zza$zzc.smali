.class public final Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;
.super Lcom/google/android/gms/internal/measurement/zzkg;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzlo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzgc$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzc"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzkg<",
        "Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;",
        "Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc$zza;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzlo;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/zzlz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzlz<",
            "Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    const-class v1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzkg;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzkg;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzkg;-><init>()V

    return-void
.end method

.method public static bridge synthetic zza()Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/measurement/zzgb;->zza:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    throw p2

    :pswitch_0
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzkg$zzc;

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/zzkg$zzc;-><init>(Lcom/google/android/gms/internal/measurement/zzkg;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    return-object p1

    :pswitch_3
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zzb()Lcom/google/android/gms/internal/measurement/zzkl;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zzb()Lcom/google/android/gms/internal/measurement/zzkl;

    move-result-object p3

    aput-object p3, p1, p2

    const-string p2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001"

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzc:Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzkg;->zza(Lcom/google/android/gms/internal/measurement/zzlm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzgg;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb()Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzg:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zza(I)Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zza:Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;

    :cond_0
    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zzc;->zzf:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zza(I)Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;->zza:Lcom/google/android/gms/internal/measurement/zzgc$zza$zze;

    :cond_0
    return-object v0
.end method

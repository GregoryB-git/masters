.class public final Lcom/google/android/gms/internal/measurement/zzgf$zzd;
.super Lcom/google/android/gms/internal/measurement/zzkg;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzlo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzgf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzkg<",
        "Lcom/google/android/gms/internal/measurement/zzgf$zzd;",
        "Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzlo;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/zzlz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzlz<",
            "Lcom/google/android/gms/internal/measurement/zzgf$zzd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

.field private zzh:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

.field private zzi:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzgf$zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    const-class v1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzkg;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzkg;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzkg;-><init>()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzgf$zzd;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzf:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzgf$zzd;Lcom/google/android/gms/internal/measurement/zzgf$zzm;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzg:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzgf$zzd;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzi:Z

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkg;->zzcg()Lcom/google/android/gms/internal/measurement/zzkg$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;

    return-object v0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzgf$zzd;Lcom/google/android/gms/internal/measurement/zzgf$zzm;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzh:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    return-void
.end method

.method public static bridge synthetic zzc()Lcom/google/android/gms/internal/measurement/zzgf$zzd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzf:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/measurement/zzgi;->zza:[I

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzkg$zzc;

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/zzkg$zzc;-><init>(Lcom/google/android/gms/internal/measurement/zzkg;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzlz;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

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

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const-string p2, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003"

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzkg;->zza(Lcom/google/android/gms/internal/measurement/zzlm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/zzgf$zzd$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzgp;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzgf$zzd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzgf$zzd;-><init>()V

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

.method public final zzd()Lcom/google/android/gms/internal/measurement/zzgf$zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzg:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgf$zzm;->zzg()Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/measurement/zzgf$zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzh:Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgf$zzm;->zzg()Lcom/google/android/gms/internal/measurement/zzgf$zzm;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zzi:Z

    return v0
.end method

.method public final zzg()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzi()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgf$zzd;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

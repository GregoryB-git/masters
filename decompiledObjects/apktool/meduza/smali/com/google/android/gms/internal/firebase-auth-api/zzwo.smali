.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzwo;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzakg;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzalp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zza;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakg<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzwo;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;",
        ">;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzalp;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

.field private static volatile zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzalw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalw<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzakn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zza;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzakg;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzm()Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;

    return-object v0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwo;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zze:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwo;Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zza;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzakn;)Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzwo;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzwn;->zza:[I

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zza;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzakg;)V

    sput-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    return-object p1

    :pswitch_3
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-class p3, Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zza;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaln;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwo$zzb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzwp;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwo;-><init>()V

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

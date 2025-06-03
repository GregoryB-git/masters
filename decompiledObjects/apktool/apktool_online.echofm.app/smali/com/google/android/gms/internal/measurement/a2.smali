.class public final Lcom/google/android/gms/internal/measurement/a2;
.super Lcom/google/android/gms/internal/measurement/Y3;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/a2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/a2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/T4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/T4;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:J

.field private zzi:F

.field private zzj:D

.field private zzk:Lcom/google/android/gms/internal/measurement/h4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/h4;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/a2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    const-class v1, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/Y3;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/Y3;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->B()Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    return-void
.end method

.method private final I(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzh:J

    return-void
.end method

.method public static synthetic J(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->n0()V

    return-void
.end method

.method public static synthetic K(Lcom/google/android/gms/internal/measurement/a2;D)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/a2;->H(D)V

    return-void
.end method

.method public static synthetic L(Lcom/google/android/gms/internal/measurement/a2;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/a2;->I(J)V

    return-void
.end method

.method public static synthetic M(Lcom/google/android/gms/internal/measurement/a2;Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/a2;->a0(Lcom/google/android/gms/internal/measurement/a2;)V

    return-void
.end method

.method public static synthetic N(Lcom/google/android/gms/internal/measurement/a2;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/a2;->P(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static synthetic O(Lcom/google/android/gms/internal/measurement/a2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/a2;->Q(Ljava/lang/String;)V

    return-void
.end method

.method private final P(Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->o0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/j3;->e(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private final Q(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic S(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->l0()V

    return-void
.end method

.method public static synthetic T(Lcom/google/android/gms/internal/measurement/a2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/a2;->U(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic W(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->k0()V

    return-void
.end method

.method public static synthetic Y(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->m0()V

    return-void
.end method

.method public static Z()Lcom/google/android/gms/internal/measurement/a2$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->w()Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2$a;

    return-object v0
.end method

.method public static synthetic b0()Lcom/google/android/gms/internal/measurement/a2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    return-object v0
.end method


# virtual methods
.method public final G()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:D

    return-wide v0
.end method

.method public final H(D)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:D

    return-void
.end method

.method public final R()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzi:F

    return v0
.end method

.method public final U(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    return-void
.end method

.method public final V()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final X()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzh:J

    return-wide v0
.end method

.method public final a0(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/a2;->o0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final d0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final e0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g0()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h0()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i0()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j0()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k0()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:D

    return-void
.end method

.method public final l0()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzh:J

    return-void
.end method

.method public final m0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->B()Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    return-void
.end method

.method public final n0()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    return-void
.end method

.method public final o0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/h4;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/Y3;->n(Lcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/h4;

    :cond_0
    return-void
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/measurement/T1;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/a2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/Y3$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/Y3$a;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    return-object p1

    :pswitch_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzg"

    const/4 p3, 0x2

    aput-object p2, p1, p3

    const-string p2, "zzh"

    const/4 p3, 0x3

    aput-object p2, p1, p3

    const-string p2, "zzi"

    const/4 p3, 0x4

    aput-object p2, p1, p3

    const-string p2, "zzj"

    const/4 p3, 0x5

    aput-object p2, p1, p3

    const-string p2, "zzk"

    const/4 p3, 0x6

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/measurement/a2;

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const-string p2, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b"

    sget-object p3, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/Y3;->q(Lcom/google/android/gms/internal/measurement/I4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/a2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/a2$a;-><init>(Lcom/google/android/gms/internal/measurement/T1;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/a2;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

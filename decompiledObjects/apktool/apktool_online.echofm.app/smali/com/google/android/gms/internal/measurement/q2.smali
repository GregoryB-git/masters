.class public final Lcom/google/android/gms/internal/measurement/q2;
.super Lcom/google/android/gms/internal/measurement/Y3;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/K4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/q2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/q2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/T4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/T4;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/measurement/h4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/h4;"
        }
    .end annotation
.end field

.field private zzg:Lcom/google/android/gms/internal/measurement/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/q2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/q2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/q2;

    const-class v1, Lcom/google/android/gms/internal/measurement/q2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/Y3;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/Y3;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/Y3;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->B()Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/q2;->zzf:Lcom/google/android/gms/internal/measurement/h4;

    return-void
.end method

.method public static synthetic H()Lcom/google/android/gms/internal/measurement/q2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/q2;

    return-object v0
.end method


# virtual methods
.method public final G()Lcom/google/android/gms/internal/measurement/o2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q2;->zzg:Lcom/google/android/gms/internal/measurement/o2;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/o2;->H()Lcom/google/android/gms/internal/measurement/o2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q2;->zzf:Lcom/google/android/gms/internal/measurement/h4;

    return-object v0
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/measurement/n2;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/q2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/q2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/q2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/Y3$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/q2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/Y3$a;-><init>(Lcom/google/android/gms/internal/measurement/Y3;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/q2;->zzd:Lcom/google/android/gms/internal/measurement/T4;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/q2;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-class p2, Lcom/google/android/gms/internal/measurement/r2;

    const/4 p3, 0x2

    aput-object p2, p1, p3

    const-string p2, "zzg"

    const/4 p3, 0x3

    aput-object p2, p1, p3

    const-string p2, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000"

    sget-object p3, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/q2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/Y3;->q(Lcom/google/android/gms/internal/measurement/I4;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/q2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/q2$a;-><init>(Lcom/google/android/gms/internal/measurement/n2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/q2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/q2;-><init>()V

    return-object p1

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

.class public final LN4/g;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/g$b;
    }
.end annotation


# static fields
.field public static final ANDROID_MEMORY_READINGS_FIELD_NUMBER:I = 0x4

.field public static final CPU_METRIC_READINGS_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:LN4/g;

.field public static final GAUGE_METADATA_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/T; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/T;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private androidMemoryReadings_:Lcom/google/protobuf/t$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$e;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cpuMetricReadings_:Lcom/google/protobuf/t$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$e;"
        }
    .end annotation
.end field

.field private gaugeMetadata_:LN4/f;

.field private sessionId_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN4/g;

    .line 2
    .line 3
    invoke-direct {v0}, LN4/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 7
    .line 8
    const-class v1, LN4/g;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, LN4/g;->sessionId_:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LN4/g;->cpuMetricReadings_:Lcom/google/protobuf/t$e;

    .line 13
    .line 14
    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LN4/g;->androidMemoryReadings_:Lcom/google/protobuf/t$e;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic T()LN4/g;
    .locals 1

    .line 1
    sget-object v0, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic U(LN4/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/g;->k0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic V(LN4/g;LN4/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/g;->Y(LN4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W(LN4/g;LN4/f;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/g;->j0(LN4/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(LN4/g;LN4/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/g;->Z(LN4/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static e0()LN4/g;
    .locals 1

    .line 1
    sget-object v0, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static i0()LN4/g$b;
    .locals 1

    .line 1
    sget-object v0, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN4/g$b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final Y(LN4/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN4/g;->a0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN4/g;->androidMemoryReadings_:Lcom/google/protobuf/t$e;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final Z(LN4/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN4/g;->b0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN4/g;->cpuMetricReadings_:Lcom/google/protobuf/t$e;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final a0()V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/g;->androidMemoryReadings_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/protobuf/t$e;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/r;->M(Lcom/google/protobuf/t$e;)Lcom/google/protobuf/t$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LN4/g;->androidMemoryReadings_:Lcom/google/protobuf/t$e;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/g;->cpuMetricReadings_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/protobuf/t$e;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/r;->M(Lcom/google/protobuf/t$e;)Lcom/google/protobuf/t$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LN4/g;->cpuMetricReadings_:Lcom/google/protobuf/t$e;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public c0()I
    .locals 1

    .line 1
    iget-object v0, p0, LN4/g;->androidMemoryReadings_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d0()I
    .locals 1

    .line 1
    iget-object v0, p0, LN4/g;->cpuMetricReadings_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f0()LN4/f;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/g;->gaugeMetadata_:LN4/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LN4/f;->X()LN4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    iget v0, p0, LN4/g;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method

.method public h0()Z
    .locals 2

    .line 1
    iget v0, p0, LN4/g;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :goto_0
    return v1
.end method

.method public final j0(LN4/f;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN4/g;->gaugeMetadata_:LN4/f;

    .line 5
    .line 6
    iget p1, p0, LN4/g;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, LN4/g;->bitField0_:I

    .line 11
    .line 12
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LN4/g;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, LN4/g;->bitField0_:I

    .line 9
    .line 10
    iput-object p1, p0, LN4/g;->sessionId_:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, LN4/g$a;->a:[I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    aget p1, p3, p1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    return-object p3

    .line 21
    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    sget-object p1, LN4/g;->PARSER:Lcom/google/protobuf/T;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, LN4/g;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, LN4/g;->PARSER:Lcom/google/protobuf/T;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/r$b;

    .line 38
    .line 39
    sget-object p3, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, LN4/g;->PARSER:Lcom/google/protobuf/T;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p2

    .line 50
    goto :goto_2

    .line 51
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    :goto_2
    return-object p1

    .line 54
    :pswitch_3
    sget-object p1, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const/4 p1, 0x7

    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    const-string p3, "bitField0_"

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    aput-object p3, p1, v0

    .line 64
    .line 65
    const-string p3, "sessionId_"

    .line 66
    .line 67
    aput-object p3, p1, p2

    .line 68
    .line 69
    const-string p2, "cpuMetricReadings_"

    .line 70
    .line 71
    const/4 p3, 0x2

    .line 72
    aput-object p2, p1, p3

    .line 73
    .line 74
    const-class p2, LN4/e;

    .line 75
    .line 76
    const/4 p3, 0x3

    .line 77
    aput-object p2, p1, p3

    .line 78
    .line 79
    const-string p2, "gaugeMetadata_"

    .line 80
    .line 81
    const/4 p3, 0x4

    .line 82
    aput-object p2, p1, p3

    .line 83
    .line 84
    const-string p2, "androidMemoryReadings_"

    .line 85
    .line 86
    const/4 p3, 0x5

    .line 87
    aput-object p2, p1, p3

    .line 88
    .line 89
    const-class p2, LN4/b;

    .line 90
    .line 91
    const/4 p3, 0x6

    .line 92
    aput-object p2, p1, p3

    .line 93
    .line 94
    const-string p2, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b"

    .line 95
    .line 96
    sget-object p3, LN4/g;->DEFAULT_INSTANCE:LN4/g;

    .line 97
    .line 98
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->O(Lcom/google/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :pswitch_5
    new-instance p1, LN4/g$b;

    .line 104
    .line 105
    invoke-direct {p1, p3}, LN4/g$b;-><init>(LN4/g$a;)V

    .line 106
    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_6
    new-instance p1, LN4/g;

    .line 110
    .line 111
    invoke-direct {p1}, LN4/g;-><init>()V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
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

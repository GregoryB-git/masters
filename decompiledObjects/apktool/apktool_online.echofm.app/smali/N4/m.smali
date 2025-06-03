.class public final LN4/m;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/m$b;,
        LN4/m$d;,
        LN4/m$c;
    }
.end annotation


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x4

.field public static final COUNTERS_FIELD_NUMBER:I = 0x6

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:LN4/m;

.field public static final DURATION_US_FIELD_NUMBER:I = 0x5

.field public static final IS_AUTO_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/T; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/T;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0x9

.field public static final SUBTRACES_FIELD_NUMBER:I = 0x7


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

.field private counters_:Lcom/google/protobuf/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/E;"
        }
    .end annotation
.end field

.field private customAttributes_:Lcom/google/protobuf/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/E;"
        }
    .end annotation
.end field

.field private durationUs_:J

.field private isAuto_:Z

.field private name_:Ljava/lang/String;

.field private perfSessions_:Lcom/google/protobuf/t$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$e;"
        }
    .end annotation
.end field

.field private subtraces_:Lcom/google/protobuf/t$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$e;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN4/m;

    .line 2
    .line 3
    invoke-direct {v0}, LN4/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 7
    .line 8
    const-class v1, LN4/m;

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
    invoke-static {}, Lcom/google/protobuf/E;->f()Lcom/google/protobuf/E;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/E;->f()Lcom/google/protobuf/E;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    iput-object v0, p0, LN4/m;->name_:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

    .line 31
    .line 32
    return-void
.end method

.method private A0(J)V
    .locals 1

    .line 1
    iget v0, p0, LN4/m;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, LN4/m;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, LN4/m;->clientStartTimeUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic T()LN4/m;
    .locals 1

    .line 1
    sget-object v0, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic U(LN4/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/m;->C0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic V(LN4/m;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-virtual {p0}, LN4/m;->p0()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic W(LN4/m;LN4/m;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/m;->g0(LN4/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(LN4/m;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/m;->e0(Ljava/lang/Iterable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y(LN4/m;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0}, LN4/m;->q0()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Z(LN4/m;LN4/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/m;->f0(LN4/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a0(LN4/m;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN4/m;->d0(Ljava/lang/Iterable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b0(LN4/m;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN4/m;->A0(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c0(LN4/m;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN4/m;->B0(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private d0(Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LN4/m;->i0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/protobuf/a;->e(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private i0()V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

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
    iput-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static n0()LN4/m;
    .locals 1

    .line 1
    sget-object v0, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 2
    .line 3
    return-object v0
.end method

.method private q0()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-direct {p0}, LN4/m;->y0()Lcom/google/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private y0()Lcom/google/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/E;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/E;->s()Lcom/google/protobuf/E;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 18
    .line 19
    return-object v0
.end method

.method public static z0()LN4/m$b;
    .locals 1

    .line 1
    sget-object v0, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN4/m$b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final B0(J)V
    .locals 1

    .line 1
    iget v0, p0, LN4/m;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, LN4/m;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, LN4/m;->durationUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public final C0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LN4/m;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, LN4/m;->bitField0_:I

    .line 9
    .line 10
    iput-object p1, p0, LN4/m;->name_:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final e0(Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LN4/m;->j0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/protobuf/a;->e(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f0(LN4/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LN4/m;->i0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g0(LN4/m;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN4/m;->j0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN4/m;->w0()Lcom/google/protobuf/E;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final j0()V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

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
    iput-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public k0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LN4/m;->v0()Lcom/google/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public l0()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN4/m;->v0()Lcom/google/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public m0()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN4/m;->w0()Lcom/google/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public o0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LN4/m;->durationUs_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final p0()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN4/m;->x0()Lcom/google/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public r0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->name_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public s0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->perfSessions_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public t0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->subtraces_:Lcom/google/protobuf/t$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public u0()Z
    .locals 1

    .line 1
    iget v0, p0, LN4/m;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

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

.method public final v0()Lcom/google/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w0()Lcom/google/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->customAttributes_:Lcom/google/protobuf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, LN4/m$a;->a:[I

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
    sget-object p1, LN4/m;->PARSER:Lcom/google/protobuf/T;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, LN4/m;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, LN4/m;->PARSER:Lcom/google/protobuf/T;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/r$b;

    .line 38
    .line 39
    sget-object p3, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, LN4/m;->PARSER:Lcom/google/protobuf/T;

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
    sget-object p1, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const/16 p1, 0xd

    .line 58
    .line 59
    new-array p1, p1, [Ljava/lang/Object;

    .line 60
    .line 61
    const-string p3, "bitField0_"

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    aput-object p3, p1, v0

    .line 65
    .line 66
    const-string p3, "name_"

    .line 67
    .line 68
    aput-object p3, p1, p2

    .line 69
    .line 70
    const-string p2, "isAuto_"

    .line 71
    .line 72
    const/4 p3, 0x2

    .line 73
    aput-object p2, p1, p3

    .line 74
    .line 75
    const-string p2, "clientStartTimeUs_"

    .line 76
    .line 77
    const/4 p3, 0x3

    .line 78
    aput-object p2, p1, p3

    .line 79
    .line 80
    const-string p2, "durationUs_"

    .line 81
    .line 82
    const/4 p3, 0x4

    .line 83
    aput-object p2, p1, p3

    .line 84
    .line 85
    const-string p2, "counters_"

    .line 86
    .line 87
    const/4 p3, 0x5

    .line 88
    aput-object p2, p1, p3

    .line 89
    .line 90
    sget-object p2, LN4/m$c;->a:Lcom/google/protobuf/D;

    .line 91
    .line 92
    const/4 p3, 0x6

    .line 93
    aput-object p2, p1, p3

    .line 94
    .line 95
    const-string p2, "subtraces_"

    .line 96
    .line 97
    const/4 p3, 0x7

    .line 98
    aput-object p2, p1, p3

    .line 99
    .line 100
    const-class p2, LN4/m;

    .line 101
    .line 102
    const/16 p3, 0x8

    .line 103
    .line 104
    aput-object p2, p1, p3

    .line 105
    .line 106
    const-string p2, "customAttributes_"

    .line 107
    .line 108
    const/16 p3, 0x9

    .line 109
    .line 110
    aput-object p2, p1, p3

    .line 111
    .line 112
    sget-object p2, LN4/m$d;->a:Lcom/google/protobuf/D;

    .line 113
    .line 114
    const/16 p3, 0xa

    .line 115
    .line 116
    aput-object p2, p1, p3

    .line 117
    .line 118
    const-string p2, "perfSessions_"

    .line 119
    .line 120
    const/16 p3, 0xb

    .line 121
    .line 122
    aput-object p2, p1, p3

    .line 123
    .line 124
    const-class p2, LN4/k;

    .line 125
    .line 126
    const/16 p3, 0xc

    .line 127
    .line 128
    aput-object p2, p1, p3

    .line 129
    .line 130
    const-string p2, "\u0001\u0008\u0000\u0001\u0001\t\u0008\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\u00082\t\u001b"

    .line 131
    .line 132
    sget-object p3, LN4/m;->DEFAULT_INSTANCE:LN4/m;

    .line 133
    .line 134
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->O(Lcom/google/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_5
    new-instance p1, LN4/m$b;

    .line 140
    .line 141
    invoke-direct {p1, p3}, LN4/m$b;-><init>(LN4/m$a;)V

    .line 142
    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_6
    new-instance p1, LN4/m;

    .line 146
    .line 147
    invoke-direct {p1}, LN4/m;-><init>()V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
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

.method public final x0()Lcom/google/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/E;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/E;->s()Lcom/google/protobuf/E;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LN4/m;->counters_:Lcom/google/protobuf/E;

    .line 18
    .line 19
    return-object v0
.end method

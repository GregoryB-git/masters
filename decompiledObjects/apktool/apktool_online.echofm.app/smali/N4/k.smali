.class public final LN4/k;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/k$c;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LN4/k;

.field private static volatile PARSER:Lcom/google/protobuf/T; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/T;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1

.field public static final SESSION_VERBOSITY_FIELD_NUMBER:I = 0x2

.field private static final sessionVerbosity_converter_:Lcom/google/protobuf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/u;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private sessionId_:Ljava/lang/String;

.field private sessionVerbosity_:Lcom/google/protobuf/t$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN4/k$a;

    .line 2
    .line 3
    invoke-direct {v0}, LN4/k$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN4/k;->sessionVerbosity_converter_:Lcom/google/protobuf/u;

    .line 7
    .line 8
    new-instance v0, LN4/k;

    .line 9
    .line 10
    invoke-direct {v0}, LN4/k;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 14
    .line 15
    const-class v1, LN4/k;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    .line 18
    .line 19
    .line 20
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
    iput-object v0, p0, LN4/k;->sessionId_:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/protobuf/r;->y()Lcom/google/protobuf/t$d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic T()LN4/k;
    .locals 1

    .line 1
    sget-object v0, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic U(LN4/k;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN4/k;->b0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic V(LN4/k;LN4/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN4/k;->W(LN4/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a0()LN4/k$c;
    .locals 1

    .line 1
    sget-object v0, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN4/k$c;

    .line 8
    .line 9
    return-object v0
.end method

.method private b0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LN4/k;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, LN4/k;->bitField0_:I

    .line 9
    .line 10
    iput-object p1, p0, LN4/k;->sessionId_:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final W(LN4/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN4/k;->X()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

    .line 8
    .line 9
    invoke-virtual {p1}, LN4/l;->g()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {v0, p1}, Lcom/google/protobuf/t$d;->z(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final X()V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

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
    invoke-static {v0}, Lcom/google/protobuf/r;->L(Lcom/google/protobuf/t$d;)Lcom/google/protobuf/t$d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public Y(I)LN4/l;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/protobuf/t$d;->F(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, LN4/l;->c(I)LN4/l;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p1, LN4/l;->p:LN4/l;

    .line 14
    .line 15
    :cond_0
    return-object p1
.end method

.method public Z()I
    .locals 1

    .line 1
    iget-object v0, p0, LN4/k;->sessionVerbosity_:Lcom/google/protobuf/t$d;

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

.method public final x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, LN4/k$b;->a:[I

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
    sget-object p1, LN4/k;->PARSER:Lcom/google/protobuf/T;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, LN4/k;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, LN4/k;->PARSER:Lcom/google/protobuf/T;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/r$b;

    .line 38
    .line 39
    sget-object p3, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, LN4/k;->PARSER:Lcom/google/protobuf/T;

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
    sget-object p1, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    invoke-static {}, LN4/l;->e()Lcom/google/protobuf/t$c;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 p3, 0x4

    .line 62
    new-array p3, p3, [Ljava/lang/Object;

    .line 63
    .line 64
    const-string v0, "bitField0_"

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    aput-object v0, p3, v1

    .line 68
    .line 69
    const-string v0, "sessionId_"

    .line 70
    .line 71
    aput-object v0, p3, p2

    .line 72
    .line 73
    const-string p2, "sessionVerbosity_"

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object p2, p3, v0

    .line 77
    .line 78
    const/4 p2, 0x3

    .line 79
    aput-object p1, p3, p2

    .line 80
    .line 81
    const-string p1, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001e"

    .line 82
    .line 83
    sget-object p2, LN4/k;->DEFAULT_INSTANCE:LN4/k;

    .line 84
    .line 85
    invoke-static {p2, p1, p3}, Lcom/google/protobuf/r;->O(Lcom/google/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_5
    new-instance p1, LN4/k$c;

    .line 91
    .line 92
    invoke-direct {p1, p3}, LN4/k$c;-><init>(LN4/k$a;)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_6
    new-instance p1, LN4/k;

    .line 97
    .line 98
    invoke-direct {p1}, LN4/k;-><init>()V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    nop

    .line 103
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

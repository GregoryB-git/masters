.class public final Lp3/C$c;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp3/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp3/C$c$a;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lp3/C$c;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/X; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/X;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyData_:Lp3/y;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp3/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lp3/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 7
    .line 8
    const-class v1, Lp3/C$c;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->Q(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/x;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic U()Lp3/C$c;
    .locals 1

    .line 1
    sget-object v0, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic V(Lp3/C$c;Lp3/y;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/C$c;->f0(Lp3/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W(Lp3/C$c;Lp3/I;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp3/C$c;->h0(Lp3/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(Lp3/C$c;Lp3/z;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/C$c;->i0(Lp3/z;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y(Lp3/C$c;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/C$c;->g0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static e0()Lp3/C$c$a;
    .locals 1

    .line 1
    sget-object v0, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->q()Lcom/google/crypto/tink/shaded/protobuf/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp3/C$c$a;

    .line 8
    .line 9
    return-object v0
.end method

.method private h0(Lp3/I;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lp3/I;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lp3/C$c;->outputPrefixType_:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public Z()Lp3/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/C$c;->keyData_:Lp3/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lp3/y;->Y()Lp3/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public a0()I
    .locals 1

    .line 1
    iget v0, p0, Lp3/C$c;->keyId_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic b()Lcom/google/crypto/tink/shaded/protobuf/O;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->w()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b0()Lp3/I;
    .locals 1

    .line 1
    iget v0, p0, Lp3/C$c;->outputPrefixType_:I

    .line 2
    .line 3
    invoke-static {v0}, Lp3/I;->c(I)Lp3/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lp3/I;->u:Lp3/I;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public c0()Lp3/z;
    .locals 1

    .line 1
    iget v0, p0, Lp3/C$c;->status_:I

    .line 2
    .line 3
    invoke-static {v0}, Lp3/z;->c(I)Lp3/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lp3/z;->t:Lp3/z;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/O$a;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->H()Lcom/google/crypto/tink/shaded/protobuf/x$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/C$c;->keyData_:Lp3/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final f0(Lp3/y;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/C$c;->keyData_:Lp3/y;

    .line 5
    .line 6
    return-void
.end method

.method public final g0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp3/C$c;->keyId_:I

    .line 2
    .line 3
    return-void
.end method

.method public final i0(Lp3/z;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lp3/z;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lp3/C$c;->status_:I

    .line 6
    .line 7
    return-void
.end method

.method public final t(Lcom/google/crypto/tink/shaded/protobuf/x$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, Lp3/C$a;->a:[I

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
    sget-object p1, Lp3/C$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lp3/C$c;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lp3/C$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/x$b;

    .line 38
    .line 39
    sget-object p3, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/x$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lp3/C$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

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
    sget-object p1, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const/4 p1, 0x4

    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    const-string p3, "keyData_"

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    aput-object p3, p1, v0

    .line 64
    .line 65
    const-string p3, "status_"

    .line 66
    .line 67
    aput-object p3, p1, p2

    .line 68
    .line 69
    const-string p2, "keyId_"

    .line 70
    .line 71
    const/4 p3, 0x2

    .line 72
    aput-object p2, p1, p3

    .line 73
    .line 74
    const-string p2, "outputPrefixType_"

    .line 75
    .line 76
    const/4 p3, 0x3

    .line 77
    aput-object p2, p1, p3

    .line 78
    .line 79
    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    .line 80
    .line 81
    sget-object p3, Lp3/C$c;->DEFAULT_INSTANCE:Lp3/C$c;

    .line 82
    .line 83
    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->I(Lcom/google/crypto/tink/shaded/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_5
    new-instance p1, Lp3/C$c$a;

    .line 89
    .line 90
    invoke-direct {p1, p3}, Lp3/C$c$a;-><init>(Lp3/C$a;)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_6
    new-instance p1, Lp3/C$c;

    .line 95
    .line 96
    invoke-direct {p1}, Lp3/C$c;-><init>()V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
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

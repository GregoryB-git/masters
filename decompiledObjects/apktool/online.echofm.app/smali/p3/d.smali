.class public final Lp3/d;
.super Lcom/google/crypto/tink/shaded/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp3/d$b;
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lp3/d;

.field public static final HMAC_KEY_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/X; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/X;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private aesCtrKey_:Lp3/f;

.field private hmacKey_:Lp3/v;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp3/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lp3/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 7
    .line 8
    const-class v1, Lp3/d;

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

.method public static synthetic U()Lp3/d;
    .locals 1

    .line 1
    sget-object v0, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic V(Lp3/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp3/d;->f0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W(Lp3/d;Lp3/f;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/d;->d0(Lp3/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X(Lp3/d;Lp3/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/d;->e0(Lp3/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b0()Lp3/d$b;
    .locals 1

    .line 1
    sget-object v0, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->q()Lcom/google/crypto/tink/shaded/protobuf/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp3/d$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public static c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/d;
    .locals 1

    .line 1
    sget-object v0, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->K(Lcom/google/crypto/tink/shaded/protobuf/x;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp3/d;

    .line 8
    .line 9
    return-object p0
.end method

.method private f0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp3/d;->version_:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public Y()Lp3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/d;->aesCtrKey_:Lp3/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lp3/f;->Y()Lp3/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public Z()Lp3/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/d;->hmacKey_:Lp3/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lp3/v;->Y()Lp3/v;

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
    iget v0, p0, Lp3/d;->version_:I

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

.method public final d0(Lp3/f;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/d;->aesCtrKey_:Lp3/f;

    .line 5
    .line 6
    return-void
.end method

.method public final e0(Lp3/v;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/d;->hmacKey_:Lp3/v;

    .line 5
    .line 6
    return-void
.end method

.method public final t(Lcom/google/crypto/tink/shaded/protobuf/x$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, Lp3/d$a;->a:[I

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
    sget-object p1, Lp3/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lp3/d;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lp3/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/x$b;

    .line 38
    .line 39
    sget-object p3, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/x$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lp3/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/X;

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
    sget-object p1, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const/4 p1, 0x3

    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    const-string p3, "version_"

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    aput-object p3, p1, v0

    .line 64
    .line 65
    const-string p3, "aesCtrKey_"

    .line 66
    .line 67
    aput-object p3, p1, p2

    .line 68
    .line 69
    const-string p2, "hmacKey_"

    .line 70
    .line 71
    const/4 p3, 0x2

    .line 72
    aput-object p2, p1, p3

    .line 73
    .line 74
    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"

    .line 75
    .line 76
    sget-object p3, Lp3/d;->DEFAULT_INSTANCE:Lp3/d;

    .line 77
    .line 78
    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->I(Lcom/google/crypto/tink/shaded/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :pswitch_5
    new-instance p1, Lp3/d$b;

    .line 84
    .line 85
    invoke-direct {p1, p3}, Lp3/d$b;-><init>(Lp3/d$a;)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_6
    new-instance p1, Lp3/d;

    .line 90
    .line 91
    invoke-direct {p1}, Lp3/d;-><init>()V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
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

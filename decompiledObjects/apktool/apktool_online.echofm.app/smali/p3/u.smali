.class public final enum Lp3/u;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/z$a;


# static fields
.field public static final enum p:Lp3/u;

.field public static final enum q:Lp3/u;

.field public static final enum r:Lp3/u;

.field public static final enum s:Lp3/u;

.field public static final enum t:Lp3/u;

.field public static final enum u:Lp3/u;

.field public static final enum v:Lp3/u;

.field public static final w:Lcom/google/crypto/tink/shaded/protobuf/z$b;

.field public static final synthetic x:[Lp3/u;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lp3/u;

    .line 2
    .line 3
    const-string v1, "UNKNOWN_HASH"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lp3/u;->p:Lp3/u;

    .line 10
    .line 11
    new-instance v1, Lp3/u;

    .line 12
    .line 13
    const-string v3, "SHA1"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lp3/u;->q:Lp3/u;

    .line 20
    .line 21
    new-instance v3, Lp3/u;

    .line 22
    .line 23
    const-string v5, "SHA384"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6, v6}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lp3/u;->r:Lp3/u;

    .line 30
    .line 31
    new-instance v5, Lp3/u;

    .line 32
    .line 33
    const-string v7, "SHA256"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8, v8}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lp3/u;->s:Lp3/u;

    .line 40
    .line 41
    new-instance v7, Lp3/u;

    .line 42
    .line 43
    const-string v9, "SHA512"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10, v10}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lp3/u;->t:Lp3/u;

    .line 50
    .line 51
    new-instance v9, Lp3/u;

    .line 52
    .line 53
    const-string v11, "SHA224"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12, v12}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lp3/u;->u:Lp3/u;

    .line 60
    .line 61
    new-instance v11, Lp3/u;

    .line 62
    .line 63
    const/4 v13, 0x6

    .line 64
    const/4 v14, -0x1

    .line 65
    const-string v15, "UNRECOGNIZED"

    .line 66
    .line 67
    invoke-direct {v11, v15, v13, v14}, Lp3/u;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v11, Lp3/u;->v:Lp3/u;

    .line 71
    .line 72
    const/4 v14, 0x7

    .line 73
    new-array v14, v14, [Lp3/u;

    .line 74
    .line 75
    aput-object v0, v14, v2

    .line 76
    .line 77
    aput-object v1, v14, v4

    .line 78
    .line 79
    aput-object v3, v14, v6

    .line 80
    .line 81
    aput-object v5, v14, v8

    .line 82
    .line 83
    aput-object v7, v14, v10

    .line 84
    .line 85
    aput-object v9, v14, v12

    .line 86
    .line 87
    aput-object v11, v14, v13

    .line 88
    .line 89
    sput-object v14, Lp3/u;->x:[Lp3/u;

    .line 90
    .line 91
    new-instance v0, Lp3/u$a;

    .line 92
    .line 93
    invoke-direct {v0}, Lp3/u$a;-><init>()V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lp3/u;->w:Lcom/google/crypto/tink/shaded/protobuf/z$b;

    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lp3/u;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static c(I)Lp3/u;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lp3/u;->u:Lp3/u;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object p0, Lp3/u;->t:Lp3/u;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object p0, Lp3/u;->s:Lp3/u;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object p0, Lp3/u;->r:Lp3/u;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    sget-object p0, Lp3/u;->q:Lp3/u;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_5
    sget-object p0, Lp3/u;->p:Lp3/u;

    .line 36
    .line 37
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lp3/u;
    .locals 1

    .line 1
    const-class v0, Lp3/u;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp3/u;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lp3/u;
    .locals 1

    .line 1
    sget-object v0, Lp3/u;->x:[Lp3/u;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lp3/u;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lp3/u;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final g()I
    .locals 2

    .line 1
    sget-object v0, Lp3/u;->v:Lp3/u;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lp3/u;->o:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

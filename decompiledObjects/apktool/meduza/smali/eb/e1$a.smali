.class public final enum Leb/e1$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb/e1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:Leb/e1$a;

.field public static final synthetic B:[Leb/e1$a;

.field public static final enum c:Leb/e1$a;

.field public static final enum d:Leb/e1$a;

.field public static final enum e:Leb/e1$a;

.field public static final enum f:Leb/e1$a;

.field public static final enum o:Leb/e1$a;

.field public static final enum p:Leb/e1$a;

.field public static final enum q:Leb/e1$a;

.field public static final enum r:Leb/e1$a;

.field public static final enum s:Leb/e1$a;

.field public static final enum t:Leb/e1$a;

.field public static final enum u:Leb/e1$a;

.field public static final enum v:Leb/e1$a;

.field public static final enum w:Leb/e1$a;

.field public static final enum x:Leb/e1$a;

.field public static final enum y:Leb/e1$a;

.field public static final enum z:Leb/e1$a;


# instance fields
.field public final a:I

.field public final b:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    new-instance v0, Leb/e1$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Leb/e1$a;->c:Leb/e1$a;

    new-instance v1, Leb/e1$a;

    const-string v3, "CANCELLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Leb/e1$a;->d:Leb/e1$a;

    new-instance v3, Leb/e1$a;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Leb/e1$a;->e:Leb/e1$a;

    new-instance v5, Leb/e1$a;

    const-string v7, "INVALID_ARGUMENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Leb/e1$a;->f:Leb/e1$a;

    new-instance v7, Leb/e1$a;

    const-string v9, "DEADLINE_EXCEEDED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v7, Leb/e1$a;->o:Leb/e1$a;

    new-instance v9, Leb/e1$a;

    const-string v11, "NOT_FOUND"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Leb/e1$a;->p:Leb/e1$a;

    new-instance v11, Leb/e1$a;

    const-string v13, "ALREADY_EXISTS"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v11, Leb/e1$a;->q:Leb/e1$a;

    new-instance v13, Leb/e1$a;

    const-string v15, "PERMISSION_DENIED"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v13, Leb/e1$a;->r:Leb/e1$a;

    new-instance v15, Leb/e1$a;

    const-string v14, "RESOURCE_EXHAUSTED"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v15, Leb/e1$a;->s:Leb/e1$a;

    new-instance v14, Leb/e1$a;

    const-string v12, "FAILED_PRECONDITION"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v14, Leb/e1$a;->t:Leb/e1$a;

    new-instance v12, Leb/e1$a;

    const-string v10, "ABORTED"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v8}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v12, Leb/e1$a;->u:Leb/e1$a;

    new-instance v10, Leb/e1$a;

    const-string v8, "OUT_OF_RANGE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6, v6}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v10, Leb/e1$a;->v:Leb/e1$a;

    new-instance v8, Leb/e1$a;

    const-string v6, "UNIMPLEMENTED"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4, v4}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v8, Leb/e1$a;->w:Leb/e1$a;

    new-instance v6, Leb/e1$a;

    const-string v4, "INTERNAL"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2, v2}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Leb/e1$a;->x:Leb/e1$a;

    new-instance v4, Leb/e1$a;

    const-string v2, "UNAVAILABLE"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6, v6}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Leb/e1$a;->y:Leb/e1$a;

    new-instance v2, Leb/e1$a;

    const-string v6, "DATA_LOSS"

    move-object/from16 v18, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4, v4}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Leb/e1$a;->z:Leb/e1$a;

    new-instance v6, Leb/e1$a;

    const-string v4, "UNAUTHENTICATED"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2, v2}, Leb/e1$a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Leb/e1$a;->A:Leb/e1$a;

    const/16 v4, 0x11

    new-array v4, v4, [Leb/e1$a;

    const/16 v16, 0x0

    aput-object v0, v4, v16

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v14, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v10, v4, v0

    const/16 v0, 0xc

    aput-object v8, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    aput-object v6, v4, v2

    sput-object v4, Leb/e1$a;->B:[Leb/e1$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Leb/e1$a;->a:I

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ln7/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iput-object p1, p0, Leb/e1$a;->b:[B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Leb/e1$a;
    .locals 1

    const-class v0, Leb/e1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb/e1$a;

    return-object p0
.end method

.method public static values()[Leb/e1$a;
    .locals 1

    sget-object v0, Leb/e1$a;->B:[Leb/e1$a;

    invoke-virtual {v0}, [Leb/e1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/e1$a;

    return-object v0
.end method


# virtual methods
.method public final f()Leb/e1;
    .locals 2

    .line 1
    sget-object v0, Leb/e1;->d:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Leb/e1$a;->a:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Leb/e1;

    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

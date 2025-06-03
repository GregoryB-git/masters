.class public final enum Ljb/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljb/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ljb/a;

.field public static final enum c:Ljb/a;

.field public static final enum d:Ljb/a;

.field public static final enum e:Ljb/a;

.field public static final enum f:Ljb/a;

.field public static final enum o:Ljb/a;

.field public static final enum p:Ljb/a;

.field public static final enum q:Ljb/a;

.field public static final enum r:Ljb/a;

.field public static final enum s:Ljb/a;

.field public static final enum t:Ljb/a;

.field public static final enum u:Ljb/a;

.field public static final synthetic v:[Ljb/a;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    new-instance v0, Ljb/a;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljb/a;->b:Ljb/a;

    new-instance v1, Ljb/a;

    const-string v3, "PROTOCOL_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ljb/a;->c:Ljb/a;

    new-instance v3, Ljb/a;

    const-string v5, "INVALID_STREAM"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    new-instance v5, Ljb/a;

    const-string v7, "UNSUPPORTED_VERSION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    new-instance v7, Ljb/a;

    const-string v9, "STREAM_IN_USE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ljb/a;

    const-string v11, "STREAM_ALREADY_CLOSED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ljb/a;

    const-string v13, "INTERNAL_ERROR"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v6}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v11, Ljb/a;->d:Ljb/a;

    new-instance v13, Ljb/a;

    const-string v15, "FLOW_CONTROL_ERROR"

    const/4 v10, 0x7

    invoke-direct {v13, v15, v10, v8}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v13, Ljb/a;->e:Ljb/a;

    new-instance v15, Ljb/a;

    const-string v8, "STREAM_CLOSED"

    const/16 v6, 0x8

    invoke-direct {v15, v8, v6, v12}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v15, Ljb/a;->f:Ljb/a;

    new-instance v8, Ljb/a;

    const-string v12, "FRAME_TOO_LARGE"

    const/16 v4, 0x9

    invoke-direct {v8, v12, v4, v14}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v8, Ljb/a;->o:Ljb/a;

    new-instance v12, Ljb/a;

    const-string v14, "REFUSED_STREAM"

    const/16 v2, 0xa

    invoke-direct {v12, v14, v2, v10}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v12, Ljb/a;->p:Ljb/a;

    new-instance v14, Ljb/a;

    const-string v10, "CANCEL"

    const/16 v2, 0xb

    invoke-direct {v14, v10, v2, v6}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v14, Ljb/a;->q:Ljb/a;

    new-instance v10, Ljb/a;

    const-string v6, "COMPRESSION_ERROR"

    const/16 v2, 0xc

    invoke-direct {v10, v6, v2, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v10, Ljb/a;->r:Ljb/a;

    new-instance v6, Ljb/a;

    const-string v4, "CONNECT_ERROR"

    const/16 v2, 0xd

    move-object/from16 v16, v10

    const/16 v10, 0xa

    invoke-direct {v6, v4, v2, v10}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Ljb/a;->s:Ljb/a;

    new-instance v4, Ljb/a;

    const-string v10, "ENHANCE_YOUR_CALM"

    const/16 v2, 0xe

    move-object/from16 v17, v6

    const/16 v6, 0xb

    invoke-direct {v4, v10, v2, v6}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ljb/a;->t:Ljb/a;

    new-instance v6, Ljb/a;

    const-string v10, "INADEQUATE_SECURITY"

    const/16 v2, 0xf

    move-object/from16 v18, v4

    const/16 v4, 0xc

    invoke-direct {v6, v10, v2, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Ljb/a;->u:Ljb/a;

    new-instance v4, Ljb/a;

    const-string v10, "HTTP_1_1_REQUIRED"

    const/16 v2, 0x10

    move-object/from16 v19, v6

    const/16 v6, 0xd

    invoke-direct {v4, v10, v2, v6}, Ljb/a;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ljb/a;

    const-string v10, "INVALID_CREDENTIALS"

    const/16 v2, 0x11

    move-object/from16 v20, v4

    const/4 v4, -0x1

    invoke-direct {v6, v10, v2, v4}, Ljb/a;-><init>(Ljava/lang/String;II)V

    const/16 v4, 0x12

    new-array v4, v4, [Ljb/a;

    const/4 v10, 0x0

    aput-object v0, v4, v10

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

    aput-object v8, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v14, v4, v0

    const/16 v0, 0xc

    aput-object v16, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    const/16 v0, 0x10

    aput-object v20, v4, v0

    aput-object v6, v4, v2

    sput-object v4, Ljb/a;->v:[Ljb/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ljb/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljb/a;
    .locals 1

    const-class v0, Ljb/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljb/a;

    return-object p0
.end method

.method public static values()[Ljb/a;
    .locals 1

    sget-object v0, Ljb/a;->v:[Ljb/a;

    invoke-virtual {v0}, [Ljb/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljb/a;

    return-object v0
.end method

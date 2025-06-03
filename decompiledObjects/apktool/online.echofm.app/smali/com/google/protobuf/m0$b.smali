.class public enum Lcom/google/protobuf/m0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "b"
.end annotation


# static fields
.field public static final enum A:Lcom/google/protobuf/m0$b;

.field public static final enum B:Lcom/google/protobuf/m0$b;

.field public static final enum C:Lcom/google/protobuf/m0$b;

.field public static final enum D:Lcom/google/protobuf/m0$b;

.field public static final enum E:Lcom/google/protobuf/m0$b;

.field public static final enum F:Lcom/google/protobuf/m0$b;

.field public static final enum G:Lcom/google/protobuf/m0$b;

.field public static final enum H:Lcom/google/protobuf/m0$b;

.field public static final synthetic I:[Lcom/google/protobuf/m0$b;

.field public static final enum q:Lcom/google/protobuf/m0$b;

.field public static final enum r:Lcom/google/protobuf/m0$b;

.field public static final enum s:Lcom/google/protobuf/m0$b;

.field public static final enum t:Lcom/google/protobuf/m0$b;

.field public static final enum u:Lcom/google/protobuf/m0$b;

.field public static final enum v:Lcom/google/protobuf/m0$b;

.field public static final enum w:Lcom/google/protobuf/m0$b;

.field public static final enum x:Lcom/google/protobuf/m0$b;

.field public static final enum y:Lcom/google/protobuf/m0$b;

.field public static final enum z:Lcom/google/protobuf/m0$b;


# instance fields
.field public final o:Lcom/google/protobuf/m0$c;

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/protobuf/m0$b;

    sget-object v1, Lcom/google/protobuf/m0$c;->s:Lcom/google/protobuf/m0$c;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->q:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    sget-object v1, Lcom/google/protobuf/m0$c;->r:Lcom/google/protobuf/m0$c;

    const-string v2, "FLOAT"

    const/4 v5, 0x5

    invoke-direct {v0, v2, v4, v1, v5}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->r:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    sget-object v1, Lcom/google/protobuf/m0$c;->q:Lcom/google/protobuf/m0$c;

    const-string v2, "INT64"

    const/4 v6, 0x2

    invoke-direct {v0, v2, v6, v1, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->s:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v2, "UINT64"

    const/4 v7, 0x3

    invoke-direct {v0, v2, v7, v1, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->t:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    sget-object v2, Lcom/google/protobuf/m0$c;->p:Lcom/google/protobuf/m0$c;

    const-string v8, "INT32"

    const/4 v9, 0x4

    invoke-direct {v0, v8, v9, v2, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->u:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v8, "FIXED64"

    invoke-direct {v0, v8, v5, v1, v4}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->v:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    invoke-direct {v0, v8, v9, v2, v5}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->w:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const/4 v8, 0x7

    sget-object v9, Lcom/google/protobuf/m0$c;->t:Lcom/google/protobuf/m0$c;

    const-string v10, "BOOL"

    invoke-direct {v0, v10, v8, v9, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->x:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b$a;

    const/16 v8, 0x8

    sget-object v9, Lcom/google/protobuf/m0$c;->u:Lcom/google/protobuf/m0$c;

    const-string v10, "STRING"

    invoke-direct {v0, v10, v8, v9, v6}, Lcom/google/protobuf/m0$b$a;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->y:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b$b;

    sget-object v8, Lcom/google/protobuf/m0$c;->x:Lcom/google/protobuf/m0$c;

    const-string v9, "GROUP"

    const/16 v10, 0x9

    invoke-direct {v0, v9, v10, v8, v7}, Lcom/google/protobuf/m0$b$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->z:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b$c;

    const-string v7, "MESSAGE"

    const/16 v9, 0xa

    invoke-direct {v0, v7, v9, v8, v6}, Lcom/google/protobuf/m0$b$c;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->A:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b$d;

    const/16 v7, 0xb

    sget-object v8, Lcom/google/protobuf/m0$c;->v:Lcom/google/protobuf/m0$c;

    const-string v9, "BYTES"

    invoke-direct {v0, v9, v7, v8, v6}, Lcom/google/protobuf/m0$b$d;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->B:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v6, "UINT32"

    const/16 v7, 0xc

    invoke-direct {v0, v6, v7, v2, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->C:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const/16 v6, 0xd

    sget-object v7, Lcom/google/protobuf/m0$c;->w:Lcom/google/protobuf/m0$c;

    const-string v8, "ENUM"

    invoke-direct {v0, v8, v6, v7, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->D:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v6, "SFIXED32"

    const/16 v7, 0xe

    invoke-direct {v0, v6, v7, v2, v5}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->E:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v5, "SFIXED64"

    const/16 v6, 0xf

    invoke-direct {v0, v5, v6, v1, v4}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->F:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v4, "SINT32"

    const/16 v5, 0x10

    invoke-direct {v0, v4, v5, v2, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->G:Lcom/google/protobuf/m0$b;

    new-instance v0, Lcom/google/protobuf/m0$b;

    const-string v2, "SINT64"

    const/16 v4, 0x11

    invoke-direct {v0, v2, v4, v1, v3}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    sput-object v0, Lcom/google/protobuf/m0$b;->H:Lcom/google/protobuf/m0$b;

    invoke-static {}, Lcom/google/protobuf/m0$b;->c()[Lcom/google/protobuf/m0$b;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/m0$b;->I:[Lcom/google/protobuf/m0$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/protobuf/m0$b;->o:Lcom/google/protobuf/m0$c;

    iput p4, p0, Lcom/google/protobuf/m0$b;->p:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;ILcom/google/protobuf/m0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/protobuf/m0$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/m0$c;I)V

    return-void
.end method

.method public static synthetic c()[Lcom/google/protobuf/m0$b;
    .locals 3

    .line 1
    const/16 v0, 0x12

    new-array v0, v0, [Lcom/google/protobuf/m0$b;

    sget-object v1, Lcom/google/protobuf/m0$b;->q:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->r:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->s:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->t:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->u:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->v:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->w:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->x:Lcom/google/protobuf/m0$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->y:Lcom/google/protobuf/m0$b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->z:Lcom/google/protobuf/m0$b;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->A:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->B:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->C:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->D:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->E:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->F:Lcom/google/protobuf/m0$b;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->G:Lcom/google/protobuf/m0$b;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$b;->H:Lcom/google/protobuf/m0$b;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/m0$b;
    .locals 1

    const-class v0, Lcom/google/protobuf/m0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/m0$b;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/m0$b;
    .locals 1

    sget-object v0, Lcom/google/protobuf/m0$b;->I:[Lcom/google/protobuf/m0$b;

    invoke-virtual {v0}, [Lcom/google/protobuf/m0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/m0$b;

    return-object v0
.end method


# virtual methods
.method public e()Lcom/google/protobuf/m0$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/m0$b;->o:Lcom/google/protobuf/m0$c;

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/m0$b;->p:I

    return v0
.end method

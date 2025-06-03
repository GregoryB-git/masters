.class public final enum Lcom/google/protobuf/m0$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum p:Lcom/google/protobuf/m0$c;

.field public static final enum q:Lcom/google/protobuf/m0$c;

.field public static final enum r:Lcom/google/protobuf/m0$c;

.field public static final enum s:Lcom/google/protobuf/m0$c;

.field public static final enum t:Lcom/google/protobuf/m0$c;

.field public static final enum u:Lcom/google/protobuf/m0$c;

.field public static final enum v:Lcom/google/protobuf/m0$c;

.field public static final enum w:Lcom/google/protobuf/m0$c;

.field public static final enum x:Lcom/google/protobuf/m0$c;

.field public static final synthetic y:[Lcom/google/protobuf/m0$c;


# instance fields
.field public final o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/protobuf/m0$c;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "INT"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->p:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "LONG"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->q:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "FLOAT"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->r:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "DOUBLE"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->s:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "BOOLEAN"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->t:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const/4 v1, 0x5

    const-string v2, ""

    const-string v3, "STRING"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->u:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/f;->p:Lcom/google/protobuf/f;

    const-string v3, "BYTE_STRING"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->v:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const-string v1, "ENUM"

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->w:Lcom/google/protobuf/m0$c;

    new-instance v0, Lcom/google/protobuf/m0$c;

    const-string v1, "MESSAGE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/m0$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/m0$c;->x:Lcom/google/protobuf/m0$c;

    invoke-static {}, Lcom/google/protobuf/m0$c;->c()[Lcom/google/protobuf/m0$c;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/m0$c;->y:[Lcom/google/protobuf/m0$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/protobuf/m0$c;->o:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c()[Lcom/google/protobuf/m0$c;
    .locals 3

    .line 1
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/google/protobuf/m0$c;

    sget-object v1, Lcom/google/protobuf/m0$c;->p:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->q:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->r:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->s:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->t:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->u:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->v:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->w:Lcom/google/protobuf/m0$c;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/m0$c;->x:Lcom/google/protobuf/m0$c;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/m0$c;
    .locals 1

    const-class v0, Lcom/google/protobuf/m0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/m0$c;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/m0$c;
    .locals 1

    sget-object v0, Lcom/google/protobuf/m0$c;->y:[Lcom/google/protobuf/m0$c;

    invoke-virtual {v0}, [Lcom/google/protobuf/m0$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/m0$c;

    return-object v0
.end method

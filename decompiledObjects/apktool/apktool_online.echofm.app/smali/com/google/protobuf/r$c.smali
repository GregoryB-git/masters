.class public final enum Lcom/google/protobuf/r$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum o:Lcom/google/protobuf/r$c;

.field public static final enum p:Lcom/google/protobuf/r$c;

.field public static final enum q:Lcom/google/protobuf/r$c;

.field public static final enum r:Lcom/google/protobuf/r$c;

.field public static final enum s:Lcom/google/protobuf/r$c;

.field public static final enum t:Lcom/google/protobuf/r$c;

.field public static final enum u:Lcom/google/protobuf/r$c;

.field public static final synthetic v:[Lcom/google/protobuf/r$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->o:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->p:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "BUILD_MESSAGE_INFO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->q:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "NEW_MUTABLE_INSTANCE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->r:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "NEW_BUILDER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->s:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "GET_DEFAULT_INSTANCE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->t:Lcom/google/protobuf/r$c;

    new-instance v0, Lcom/google/protobuf/r$c;

    const-string v1, "GET_PARSER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$c;->u:Lcom/google/protobuf/r$c;

    invoke-static {}, Lcom/google/protobuf/r$c;->c()[Lcom/google/protobuf/r$c;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/r$c;->v:[Lcom/google/protobuf/r$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Lcom/google/protobuf/r$c;
    .locals 3

    .line 1
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/google/protobuf/r$c;

    sget-object v1, Lcom/google/protobuf/r$c;->o:Lcom/google/protobuf/r$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->p:Lcom/google/protobuf/r$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->q:Lcom/google/protobuf/r$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->r:Lcom/google/protobuf/r$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->s:Lcom/google/protobuf/r$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->t:Lcom/google/protobuf/r$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/r$c;->u:Lcom/google/protobuf/r$c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/r$c;
    .locals 1

    const-class v0, Lcom/google/protobuf/r$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/r$c;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/r$c;
    .locals 1

    sget-object v0, Lcom/google/protobuf/r$c;->v:[Lcom/google/protobuf/r$c;

    invoke-virtual {v0}, [Lcom/google/protobuf/r$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/r$c;

    return-object v0
.end method

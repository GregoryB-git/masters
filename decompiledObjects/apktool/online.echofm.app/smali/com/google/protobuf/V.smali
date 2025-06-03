.class public final enum Lcom/google/protobuf/V;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum o:Lcom/google/protobuf/V;

.field public static final enum p:Lcom/google/protobuf/V;

.field public static final synthetic q:[Lcom/google/protobuf/V;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/V;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/V;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/V;->o:Lcom/google/protobuf/V;

    new-instance v0, Lcom/google/protobuf/V;

    const-string v1, "PROTO3"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/V;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/V;->p:Lcom/google/protobuf/V;

    invoke-static {}, Lcom/google/protobuf/V;->c()[Lcom/google/protobuf/V;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/V;->q:[Lcom/google/protobuf/V;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Lcom/google/protobuf/V;
    .locals 3

    .line 1
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/protobuf/V;

    sget-object v1, Lcom/google/protobuf/V;->o:Lcom/google/protobuf/V;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/V;->p:Lcom/google/protobuf/V;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/V;
    .locals 1

    const-class v0, Lcom/google/protobuf/V;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/V;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/V;
    .locals 1

    sget-object v0, Lcom/google/protobuf/V;->q:[Lcom/google/protobuf/V;

    invoke-virtual {v0}, [Lcom/google/protobuf/V;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/V;

    return-object v0
.end method

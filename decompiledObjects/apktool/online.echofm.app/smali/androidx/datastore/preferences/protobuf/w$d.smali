.class public final enum Landroidx/datastore/preferences/protobuf/w$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum o:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum p:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum q:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum r:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum s:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum t:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final enum u:Landroidx/datastore/preferences/protobuf/w$d;

.field public static final synthetic v:[Landroidx/datastore/preferences/protobuf/w$d;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/w$d;->o:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v1, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v3, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/datastore/preferences/protobuf/w$d;->p:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v3, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v5, "BUILD_MESSAGE_INFO"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/datastore/preferences/protobuf/w$d;->q:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v5, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v7, "NEW_MUTABLE_INSTANCE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Landroidx/datastore/preferences/protobuf/w$d;->r:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v7, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v9, "NEW_BUILDER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Landroidx/datastore/preferences/protobuf/w$d;->s:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v9, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v11, "GET_DEFAULT_INSTANCE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v9, Landroidx/datastore/preferences/protobuf/w$d;->t:Landroidx/datastore/preferences/protobuf/w$d;

    new-instance v11, Landroidx/datastore/preferences/protobuf/w$d;

    const-string v13, "GET_PARSER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Landroidx/datastore/preferences/protobuf/w$d;-><init>(Ljava/lang/String;I)V

    sput-object v11, Landroidx/datastore/preferences/protobuf/w$d;->u:Landroidx/datastore/preferences/protobuf/w$d;

    const/4 v13, 0x7

    new-array v13, v13, [Landroidx/datastore/preferences/protobuf/w$d;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Landroidx/datastore/preferences/protobuf/w$d;->v:[Landroidx/datastore/preferences/protobuf/w$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/w$d;
    .locals 1

    const-class v0, Landroidx/datastore/preferences/protobuf/w$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/w$d;

    return-object p0
.end method

.method public static values()[Landroidx/datastore/preferences/protobuf/w$d;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->v:[Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {v0}, [Landroidx/datastore/preferences/protobuf/w$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/datastore/preferences/protobuf/w$d;

    return-object v0
.end method

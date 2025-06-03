.class public final enum Ls0/v$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls0/v$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ls0/v$f;

.field public static final enum b:Ls0/v$f;

.field public static final enum c:Ls0/v$f;

.field public static final enum d:Ls0/v$f;

.field public static final enum e:Ls0/v$f;

.field public static final enum f:Ls0/v$f;

.field public static final synthetic o:[Ls0/v$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Ls0/v$f;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls0/v$f;->a:Ls0/v$f;

    new-instance v1, Ls0/v$f;

    const-string v3, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls0/v$f;->b:Ls0/v$f;

    new-instance v3, Ls0/v$f;

    const-string v5, "BUILD_MESSAGE_INFO"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls0/v$f;->c:Ls0/v$f;

    new-instance v5, Ls0/v$f;

    const-string v7, "NEW_MUTABLE_INSTANCE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ls0/v$f;->d:Ls0/v$f;

    new-instance v7, Ls0/v$f;

    const-string v9, "NEW_BUILDER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ls0/v$f;->e:Ls0/v$f;

    new-instance v9, Ls0/v$f;

    const-string v11, "GET_DEFAULT_INSTANCE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ls0/v$f;->f:Ls0/v$f;

    new-instance v11, Ls0/v$f;

    const-string v13, "GET_PARSER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ls0/v$f;-><init>(Ljava/lang/String;I)V

    const/4 v13, 0x7

    new-array v13, v13, [Ls0/v$f;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Ls0/v$f;->o:[Ls0/v$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls0/v$f;
    .locals 1

    const-class v0, Ls0/v$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls0/v$f;

    return-object p0
.end method

.method public static values()[Ls0/v$f;
    .locals 1

    sget-object v0, Ls0/v$f;->o:[Ls0/v$f;

    invoke-virtual {v0}, [Ls0/v$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls0/v$f;

    return-object v0
.end method

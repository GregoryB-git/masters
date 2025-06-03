.class public final enum Lma/w$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lma/w$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lma/w$f;

.field public static final enum b:Lma/w$f;

.field public static final enum c:Lma/w$f;

.field public static final enum d:Lma/w$f;

.field public static final enum e:Lma/w$f;

.field public static final enum f:Lma/w$f;

.field public static final enum o:Lma/w$f;

.field public static final synthetic p:[Lma/w$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lma/w$f;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lma/w$f;->a:Lma/w$f;

    new-instance v1, Lma/w$f;

    const-string v3, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lma/w$f;->b:Lma/w$f;

    new-instance v3, Lma/w$f;

    const-string v5, "BUILD_MESSAGE_INFO"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lma/w$f;->c:Lma/w$f;

    new-instance v5, Lma/w$f;

    const-string v7, "NEW_MUTABLE_INSTANCE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lma/w$f;->d:Lma/w$f;

    new-instance v7, Lma/w$f;

    const-string v9, "NEW_BUILDER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lma/w$f;->e:Lma/w$f;

    new-instance v9, Lma/w$f;

    const-string v11, "GET_DEFAULT_INSTANCE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lma/w$f;->f:Lma/w$f;

    new-instance v11, Lma/w$f;

    const-string v13, "GET_PARSER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lma/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lma/w$f;->o:Lma/w$f;

    const/4 v13, 0x7

    new-array v13, v13, [Lma/w$f;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lma/w$f;->p:[Lma/w$f;

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

.method public static valueOf(Ljava/lang/String;)Lma/w$f;
    .locals 1

    const-class v0, Lma/w$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lma/w$f;

    return-object p0
.end method

.method public static values()[Lma/w$f;
    .locals 1

    sget-object v0, Lma/w$f;->p:[Lma/w$f;

    invoke-virtual {v0}, [Lma/w$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lma/w$f;

    return-object v0
.end method

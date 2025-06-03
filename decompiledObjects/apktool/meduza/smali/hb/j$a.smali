.class public final enum Lhb/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhb/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:[Lhb/j$a;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lhb/j$a;

    const-string v1, "HEADER_TABLE_SIZE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lhb/j$a;

    const-string v4, "ENABLE_PUSH"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lhb/j$a;

    const-string v6, "MAX_CONCURRENT_STREAMS"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lhb/j$a;

    const-string v8, "MAX_FRAME_SIZE"

    const/4 v9, 0x3

    const/4 v10, 0x5

    invoke-direct {v6, v8, v9, v10}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lhb/j$a;

    const-string v11, "MAX_HEADER_LIST_SIZE"

    const/4 v12, 0x6

    invoke-direct {v8, v11, v7, v12}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lhb/j$a;

    const-string v13, "INITIAL_WINDOW_SIZE"

    const/4 v14, 0x7

    invoke-direct {v11, v13, v10, v14}, Lhb/j$a;-><init>(Ljava/lang/String;II)V

    new-array v12, v12, [Lhb/j$a;

    aput-object v0, v12, v2

    aput-object v1, v12, v3

    aput-object v4, v12, v5

    aput-object v6, v12, v9

    aput-object v8, v12, v7

    aput-object v11, v12, v10

    sput-object v12, Lhb/j$a;->b:[Lhb/j$a;

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

    iput p3, p0, Lhb/j$a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhb/j$a;
    .locals 1

    const-class v0, Lhb/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhb/j$a;

    return-object p0
.end method

.method public static values()[Lhb/j$a;
    .locals 1

    sget-object v0, Lhb/j$a;->b:[Lhb/j$a;

    invoke-virtual {v0}, [Lhb/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhb/j$a;

    return-object v0
.end method

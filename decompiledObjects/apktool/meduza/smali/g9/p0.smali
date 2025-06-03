.class public final enum Lg9/p0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg9/p0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg9/p0;

.field public static final enum b:Lg9/p0;

.field public static final enum c:Lg9/p0;

.field public static final enum d:Lg9/p0;

.field public static final enum e:Lg9/p0;

.field public static final synthetic f:[Lg9/p0;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lg9/p0;

    const-string v1, "Set"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg9/p0;->a:Lg9/p0;

    new-instance v1, Lg9/p0;

    const-string v3, "MergeSet"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg9/p0;->b:Lg9/p0;

    new-instance v3, Lg9/p0;

    const-string v5, "Update"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lg9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg9/p0;->c:Lg9/p0;

    new-instance v5, Lg9/p0;

    const-string v7, "Argument"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lg9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lg9/p0;->d:Lg9/p0;

    new-instance v7, Lg9/p0;

    const-string v9, "ArrayArgument"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lg9/p0;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lg9/p0;->e:Lg9/p0;

    const/4 v9, 0x5

    new-array v9, v9, [Lg9/p0;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lg9/p0;->f:[Lg9/p0;

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

.method public static valueOf(Ljava/lang/String;)Lg9/p0;
    .locals 1

    const-class v0, Lg9/p0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg9/p0;

    return-object p0
.end method

.method public static values()[Lg9/p0;
    .locals 1

    sget-object v0, Lg9/p0;->f:[Lg9/p0;

    invoke-virtual {v0}, [Lg9/p0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg9/p0;

    return-object v0
.end method

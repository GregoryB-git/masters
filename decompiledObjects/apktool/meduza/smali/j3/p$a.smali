.class public final enum Lj3/p$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj3/p$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj3/p$a;

.field public static final synthetic b:[Lj3/p$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj3/p$a;

    const-string v1, "NOT_SET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj3/p$a;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lj3/p$a;

    const-string v3, "EVENT_OVERRIDE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj3/p$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj3/p$a;->a:Lj3/p$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lj3/p$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lj3/p$a;->b:[Lj3/p$a;

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj3/p$a;
    .locals 1

    const-class v0, Lj3/p$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj3/p$a;

    return-object p0
.end method

.method public static values()[Lj3/p$a;
    .locals 1

    sget-object v0, Lj3/p$a;->b:[Lj3/p$a;

    invoke-virtual {v0}, [Lj3/p$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj3/p$a;

    return-object v0
.end method

.class public final enum Lka/z$g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/z$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lka/z$g$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lka/z$g$b;

.field public static final enum b:Lka/z$g$b;

.field public static final enum c:Lka/z$g$b;

.field public static final enum d:Lka/z$g$b;

.field public static final synthetic e:[Lka/z$g$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lka/z$g$b;

    const-string v1, "COMPOSITE_FILTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lka/z$g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/z$g$b;->a:Lka/z$g$b;

    new-instance v1, Lka/z$g$b;

    const-string v3, "FIELD_FILTER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lka/z$g$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lka/z$g$b;->b:Lka/z$g$b;

    new-instance v3, Lka/z$g$b;

    const-string v5, "UNARY_FILTER"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lka/z$g$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lka/z$g$b;->c:Lka/z$g$b;

    new-instance v5, Lka/z$g$b;

    const-string v7, "FILTERTYPE_NOT_SET"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lka/z$g$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lka/z$g$b;->d:Lka/z$g$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lka/z$g$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lka/z$g$b;->e:[Lka/z$g$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lka/z$g$b;
    .locals 1

    const-class v0, Lka/z$g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/z$g$b;

    return-object p0
.end method

.method public static values()[Lka/z$g$b;
    .locals 1

    sget-object v0, Lka/z$g$b;->e:[Lka/z$g$b;

    invoke-virtual {v0}, [Lka/z$g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/z$g$b;

    return-object v0
.end method

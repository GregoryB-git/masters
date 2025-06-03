.class public final enum Leb/a1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb/a1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Leb/a1;

.field public static final enum b:Leb/a1;

.field public static final synthetic c:[Leb/a1;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Leb/a1;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/a1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/a1;->a:Leb/a1;

    new-instance v1, Leb/a1;

    const-string v3, "INTEGRITY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Leb/a1;-><init>(Ljava/lang/String;I)V

    new-instance v3, Leb/a1;

    const-string v5, "PRIVACY_AND_INTEGRITY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Leb/a1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Leb/a1;->b:Leb/a1;

    const/4 v5, 0x3

    new-array v5, v5, [Leb/a1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Leb/a1;->c:[Leb/a1;

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

.method public static valueOf(Ljava/lang/String;)Leb/a1;
    .locals 1

    const-class v0, Leb/a1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb/a1;

    return-object p0
.end method

.method public static values()[Leb/a1;
    .locals 1

    sget-object v0, Leb/a1;->c:[Leb/a1;

    invoke-virtual {v0}, [Leb/a1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/a1;

    return-object v0
.end method

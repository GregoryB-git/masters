.class public final enum Lvb/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvb/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lvb/a;

.field public static final synthetic b:[Lvb/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lvb/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvb/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvb/a;->a:Lvb/a;

    new-instance v1, Lvb/a;

    const-string v3, "UNDECIDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lvb/a;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lvb/a;

    const-string v5, "RESUMED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lvb/a;-><init>(Ljava/lang/String;I)V

    const/4 v5, 0x3

    new-array v5, v5, [Lvb/a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lvb/a;->b:[Lvb/a;

    invoke-static {v5}, Lp2/m0;->D([Ljava/lang/Enum;)Lxb/b;

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

.method public static valueOf(Ljava/lang/String;)Lvb/a;
    .locals 1

    const-class v0, Lvb/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvb/a;

    return-object p0
.end method

.method public static values()[Lvb/a;
    .locals 1

    sget-object v0, Lvb/a;->b:[Lvb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvb/a;

    return-object v0
.end method

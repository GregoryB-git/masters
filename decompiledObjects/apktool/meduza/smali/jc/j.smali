.class public final enum Ljc/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljc/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic a:[Ljc/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Ljc/j;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljc/j;-><init>(Ljava/lang/String;I)V

    new-instance v1, Ljc/j;

    const-string v3, "PROTECTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ljc/j;-><init>(Ljava/lang/String;I)V

    new-instance v3, Ljc/j;

    const-string v5, "INTERNAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ljc/j;-><init>(Ljava/lang/String;I)V

    new-instance v5, Ljc/j;

    const-string v7, "PRIVATE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ljc/j;-><init>(Ljava/lang/String;I)V

    const/4 v7, 0x4

    new-array v7, v7, [Ljc/j;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ljc/j;->a:[Ljc/j;

    invoke-static {v7}, Lp2/m0;->D([Ljava/lang/Enum;)Lxb/b;

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

.method public static valueOf(Ljava/lang/String;)Ljc/j;
    .locals 1

    const-class v0, Ljc/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljc/j;

    return-object p0
.end method

.method public static values()[Ljc/j;
    .locals 1

    sget-object v0, Ljc/j;->a:[Ljc/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljc/j;

    return-object v0
.end method

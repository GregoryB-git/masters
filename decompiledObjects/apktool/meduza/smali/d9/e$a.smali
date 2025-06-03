.class public final enum Ld9/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld9/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ld9/e$a;

.field public static final enum b:Ld9/e$a;

.field public static final enum c:Ld9/e$a;

.field public static final synthetic d:[Ld9/e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ld9/e$a;

    const-string v1, "ADDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/e$a;->a:Ld9/e$a;

    new-instance v1, Ld9/e$a;

    const-string v3, "MODIFIED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld9/e$a;->b:Ld9/e$a;

    new-instance v3, Ld9/e$a;

    const-string v5, "REMOVED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ld9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ld9/e$a;->c:Ld9/e$a;

    const/4 v5, 0x3

    new-array v5, v5, [Ld9/e$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ld9/e$a;->d:[Ld9/e$a;

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

.method public static valueOf(Ljava/lang/String;)Ld9/e$a;
    .locals 1

    const-class v0, Ld9/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld9/e$a;

    return-object p0
.end method

.method public static values()[Ld9/e$a;
    .locals 1

    sget-object v0, Ld9/e$a;->d:[Ld9/e$a;

    invoke-virtual {v0}, [Ld9/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld9/e$a;

    return-object v0
.end method

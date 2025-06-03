.class public final enum Lfa/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfa/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfa/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfa/b$a;

.field public static final enum b:Lfa/b$a;

.field public static final synthetic c:[Lfa/b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfa/b$a;

    const-string v1, "CRASHLYTICS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfa/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfa/b$a;->a:Lfa/b$a;

    new-instance v1, Lfa/b$a;

    const-string v3, "PERFORMANCE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfa/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfa/b$a;->b:Lfa/b$a;

    new-instance v3, Lfa/b$a;

    const-string v5, "MATT_SAYS_HI"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfa/b$a;-><init>(Ljava/lang/String;I)V

    const/4 v5, 0x3

    new-array v5, v5, [Lfa/b$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lfa/b$a;->c:[Lfa/b$a;

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

.method public static valueOf(Ljava/lang/String;)Lfa/b$a;
    .locals 1

    const-class v0, Lfa/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfa/b$a;

    return-object p0
.end method

.method public static values()[Lfa/b$a;
    .locals 1

    sget-object v0, Lfa/b$a;->c:[Lfa/b$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfa/b$a;

    return-object v0
.end method

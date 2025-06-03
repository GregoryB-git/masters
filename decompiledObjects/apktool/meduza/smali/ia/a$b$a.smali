.class public final enum Lia/a$b$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lia/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lia/a$b$a;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lia/a$b$a;

.field public static final enum c:Lia/a$b$a;

.field public static final synthetic d:[Lia/a$b$a;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lia/a$b$a;

    const-string v1, "ARRAY_CONFIG_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lia/a$b$a;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lia/a$b$a;

    const-string v3, "CONTAINS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lia/a$b$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lia/a$b$a;->b:Lia/a$b$a;

    new-instance v3, Lia/a$b$a;

    const-string v5, "UNRECOGNIZED"

    const/4 v6, 0x2

    const/4 v7, -0x1

    invoke-direct {v3, v5, v6, v7}, Lia/a$b$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lia/a$b$a;->c:Lia/a$b$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lia/a$b$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lia/a$b$a;->d:[Lia/a$b$a;

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

    iput p3, p0, Lia/a$b$a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lia/a$b$a;
    .locals 1

    const-class v0, Lia/a$b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lia/a$b$a;

    return-object p0
.end method

.method public static values()[Lia/a$b$a;
    .locals 1

    sget-object v0, Lia/a$b$a;->d:[Lia/a$b$a;

    invoke-virtual {v0}, [Lia/a$b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lia/a$b$a;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lia/a$b$a;->c:Lia/a$b$a;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lia/a$b$a;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final enum Lia/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lia/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lia/a$c;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lia/a$c;

.field public static final enum c:Lia/a$c;

.field public static final synthetic d:[Lia/a$c;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lia/a$c;

    const-string v1, "QUERY_SCOPE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lia/a$c;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lia/a$c;

    const-string v3, "COLLECTION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lia/a$c;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lia/a$c;

    const-string v5, "COLLECTION_GROUP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lia/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lia/a$c;->b:Lia/a$c;

    new-instance v5, Lia/a$c;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Lia/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lia/a$c;->c:Lia/a$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lia/a$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lia/a$c;->d:[Lia/a$c;

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

    iput p3, p0, Lia/a$c;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lia/a$c;
    .locals 1

    const-class v0, Lia/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lia/a$c;

    return-object p0
.end method

.method public static values()[Lia/a$c;
    .locals 1

    sget-object v0, Lia/a$c;->d:[Lia/a$c;

    invoke-virtual {v0}, [Lia/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lia/a$c;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lia/a$c;->c:Lia/a$c;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lia/a$c;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

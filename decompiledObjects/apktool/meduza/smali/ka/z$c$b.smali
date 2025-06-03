.class public final enum Lka/z$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/z$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lka/z$c$b;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lka/z$c$b;

.field public static final enum c:Lka/z$c$b;

.field public static final enum d:Lka/z$c$b;

.field public static final enum e:Lka/z$c$b;

.field public static final synthetic f:[Lka/z$c$b;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lka/z$c$b;

    const-string v1, "OPERATOR_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lka/z$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lka/z$c$b;->b:Lka/z$c$b;

    new-instance v1, Lka/z$c$b;

    const-string v3, "AND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lka/z$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lka/z$c$b;->c:Lka/z$c$b;

    new-instance v3, Lka/z$c$b;

    const-string v5, "OR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lka/z$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lka/z$c$b;->d:Lka/z$c$b;

    new-instance v5, Lka/z$c$b;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Lka/z$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lka/z$c$b;->e:Lka/z$c$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lka/z$c$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lka/z$c$b;->f:[Lka/z$c$b;

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

    iput p3, p0, Lka/z$c$b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lka/z$c$b;
    .locals 1

    const-class v0, Lka/z$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/z$c$b;

    return-object p0
.end method

.method public static values()[Lka/z$c$b;
    .locals 1

    sget-object v0, Lka/z$c$b;->f:[Lka/z$c$b;

    invoke-virtual {v0}, [Lka/z$c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/z$c$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lka/z$c$b;->e:Lka/z$c$b;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lka/z$c$b;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

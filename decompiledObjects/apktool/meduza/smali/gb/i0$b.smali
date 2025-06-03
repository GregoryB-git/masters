.class public final enum Lgb/i0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgb/i0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lgb/i0$b;

.field public static final synthetic b:[Lgb/i0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgb/i0$b;

    invoke-direct {v0}, Lgb/i0$b;-><init>()V

    sput-object v0, Lgb/i0$b;->a:Lgb/i0$b;

    const/4 v1, 0x1

    new-array v1, v1, [Lgb/i0$b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lgb/i0$b;->b:[Lgb/i0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "INSTANCE"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgb/i0$b;
    .locals 1

    const-class v0, Lgb/i0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgb/i0$b;

    return-object p0
.end method

.method public static values()[Lgb/i0$b;
    .locals 1

    sget-object v0, Lgb/i0$b;->b:[Lgb/i0$b;

    invoke-virtual {v0}, [Lgb/i0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/i0$b;

    return-object v0
.end method

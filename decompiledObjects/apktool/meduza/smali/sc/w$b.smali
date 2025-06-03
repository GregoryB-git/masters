.class public final Lsc/w$b;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsc/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/p<",
        "Lnc/b2<",
        "*>;",
        "Lub/h$b;",
        "Lnc/b2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final a:Lsc/w$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsc/w$b;

    invoke-direct {v0}, Lsc/w$b;-><init>()V

    sput-object v0, Lsc/w$b;->a:Lsc/w$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/b2;

    check-cast p2, Lub/h$b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lnc/b2;

    if-eqz p1, :cond_1

    check-cast p2, Lnc/b2;

    move-object p1, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

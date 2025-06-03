.class public final Lnc/y$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/y;->a(Lub/h;Lub/h;Z)Lub/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/p<",
        "Lub/h;",
        "Lub/h$b;",
        "Lub/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lnc/y$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/y$a;

    invoke-direct {v0}, Lnc/y$a;-><init>()V

    sput-object v0, Lnc/y$a;->a:Lnc/y$a;

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
    .locals 1

    check-cast p1, Lub/h;

    check-cast p2, Lub/h$b;

    instance-of v0, p2, Lnc/x;

    if-eqz v0, :cond_0

    check-cast p2, Lnc/x;

    invoke-interface {p2}, Lnc/x;->b0()Lnc/x;

    move-result-object p2

    :cond_0
    invoke-interface {p1, p2}, Lub/h;->plus(Lub/h;)Lub/h;

    move-result-object p1

    return-object p1
.end method

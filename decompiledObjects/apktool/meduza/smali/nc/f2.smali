.class public final Lnc/f2;
.super Lnc/a0;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/f2;

    invoke-direct {v0}, Lnc/f2;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnc/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method

.method public final z0(Lub/h;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lnc/j2;->c:Lnc/j2$a;

    invoke-interface {p1, p2}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object p1

    check-cast p1, Lnc/j2;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lnc/j2;->b:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

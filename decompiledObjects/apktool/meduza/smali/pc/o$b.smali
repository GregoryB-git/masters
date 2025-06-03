.class public final Lpc/o$b;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/o;->a(Lpc/q;Ldc/a;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/l<",
        "Ljava/lang/Throwable;",
        "Lrb/h;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lnc/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/k<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/l;)V
    .locals 0

    iput-object p1, p0, Lpc/o$b;->a:Lnc/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lpc/o$b;->a:Lnc/k;

    sget-object v0, Lrb/h;->a:Lrb/h;

    invoke-interface {p1, v0}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    return-object v0
.end method

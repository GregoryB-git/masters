.class public final Lvc/d$b;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/d;-><init>(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/q<",
        "Luc/f<",
        "*>;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ldc/l<",
        "-",
        "Ljava/lang/Throwable;",
        "+",
        "Lrb/h;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lvc/d;


# direct methods
.method public constructor <init>(Lvc/d;)V
    .locals 0

    iput-object p1, p0, Lvc/d$b;->a:Lvc/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luc/f;

    new-instance p1, Lvc/e;

    iget-object p3, p0, Lvc/d$b;->a:Lvc/d;

    invoke-direct {p1, p3, p2}, Lvc/e;-><init>(Lvc/d;Ljava/lang/Object;)V

    return-object p1
.end method

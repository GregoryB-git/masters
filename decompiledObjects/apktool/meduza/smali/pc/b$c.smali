.class public final Lpc/b$c;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/b;-><init>(ILdc/l;)V
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
.field public final synthetic a:Lpc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/b<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpc/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/b<",
            "TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lpc/b$c;->a:Lpc/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Luc/f;

    new-instance p2, Lpc/c;

    iget-object v0, p0, Lpc/b$c;->a:Lpc/b;

    invoke-direct {p2, p3, v0, p1}, Lpc/c;-><init>(Ljava/lang/Object;Lpc/b;Luc/f;)V

    return-object p2
.end method

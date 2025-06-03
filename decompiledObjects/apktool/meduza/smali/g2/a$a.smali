.class public final Lg2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ld0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld0/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lg2/a$a;->a:Ld0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lg2/a$a;->a:Ld0/a;

    invoke-interface {p2, p1}, Ld0/a;->accept(Ljava/lang/Object;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
